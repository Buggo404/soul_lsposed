package io.reactivex;

/* loaded from: classes.dex */
public abstract class Observable<T> implements io.reactivex.ObservableSource<T> {

    /* renamed from: io.reactivex.Observable$1 */
    static /* synthetic */ class C09501 {
        static final /* synthetic */ int[] $SwitchMap$io$reactivex$BackpressureStrategy = null;

        static {
                io.reactivex.BackpressureStrategy[] r0 = io.reactivex.BackpressureStrategy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.reactivex.Observable.C09501.$SwitchMap$io$reactivex$BackpressureStrategy = r0
                io.reactivex.BackpressureStrategy r1 = io.reactivex.BackpressureStrategy.DROP     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.reactivex.Observable.C09501.$SwitchMap$io$reactivex$BackpressureStrategy     // Catch: java.lang.NoSuchFieldError -> L1d
                io.reactivex.BackpressureStrategy r1 = io.reactivex.BackpressureStrategy.LATEST     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = io.reactivex.Observable.C09501.$SwitchMap$io$reactivex$BackpressureStrategy     // Catch: java.lang.NoSuchFieldError -> L28
                io.reactivex.BackpressureStrategy r1 = io.reactivex.BackpressureStrategy.MISSING     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = io.reactivex.Observable.C09501.$SwitchMap$io$reactivex$BackpressureStrategy     // Catch: java.lang.NoSuchFieldError -> L33
                io.reactivex.BackpressureStrategy r1 = io.reactivex.BackpressureStrategy.ERROR     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }

    public Observable() {
            r0 = this;
            r0.<init>()
            return
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> amb(java.lang.Iterable<? extends io.reactivex.ObservableSource<? extends T>> r2) {
            java.lang.String r0 = "sources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.observable.ObservableAmb r0 = new io.reactivex.internal.operators.observable.ObservableAmb
            r1 = 0
            r0.<init>(r1, r2)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> ambArray(io.reactivex.ObservableSource<? extends T>... r2) {
            java.lang.String r0 = "sources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            int r0 = r2.length
            if (r0 != 0) goto Ld
            io.reactivex.Observable r2 = empty()
            return r2
        Ld:
            r1 = 1
            if (r0 != r1) goto L18
            r0 = 0
            r2 = r2[r0]
            io.reactivex.Observable r2 = wrap(r2)
            return r2
        L18:
            io.reactivex.internal.operators.observable.ObservableAmb r0 = new io.reactivex.internal.operators.observable.ObservableAmb
            r1 = 0
            r0.<init>(r2, r1)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    public static int bufferSize() {
            int r0 = io.reactivex.Flowable.bufferSize()
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> io.reactivex.Observable<R> combineLatest(io.reactivex.ObservableSource<? extends T1> r3, io.reactivex.ObservableSource<? extends T2> r4, io.reactivex.ObservableSource<? extends T3> r5, io.reactivex.ObservableSource<? extends T4> r6, io.reactivex.ObservableSource<? extends T5> r7, io.reactivex.ObservableSource<? extends T6> r8, io.reactivex.ObservableSource<? extends T7> r9, io.reactivex.ObservableSource<? extends T8> r10, io.reactivex.ObservableSource<? extends T9> r11, io.reactivex.functions.Function9<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> r12) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            java.lang.String r0 = "source3 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            java.lang.String r0 = "source4 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r0)
            java.lang.String r0 = "source5 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r0)
            java.lang.String r0 = "source6 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r8, r0)
            java.lang.String r0 = "source7 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r9, r0)
            java.lang.String r0 = "source8 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r10, r0)
            java.lang.String r0 = "source9 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r11, r0)
            io.reactivex.functions.Function r12 = io.reactivex.internal.functions.Functions.toFunction(r12)
            int r0 = bufferSize()
            r1 = 9
            io.reactivex.ObservableSource[] r1 = new io.reactivex.ObservableSource[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r3 = 2
            r1[r3] = r5
            r3 = 3
            r1[r3] = r6
            r3 = 4
            r1[r3] = r7
            r3 = 5
            r1[r3] = r8
            r3 = 6
            r1[r3] = r9
            r3 = 7
            r1[r3] = r10
            r3 = 8
            r1[r3] = r11
            io.reactivex.Observable r3 = combineLatest(r12, r0, r1)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> io.reactivex.Observable<R> combineLatest(io.reactivex.ObservableSource<? extends T1> r3, io.reactivex.ObservableSource<? extends T2> r4, io.reactivex.ObservableSource<? extends T3> r5, io.reactivex.ObservableSource<? extends T4> r6, io.reactivex.ObservableSource<? extends T5> r7, io.reactivex.ObservableSource<? extends T6> r8, io.reactivex.ObservableSource<? extends T7> r9, io.reactivex.ObservableSource<? extends T8> r10, io.reactivex.functions.Function8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> r11) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            java.lang.String r0 = "source3 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            java.lang.String r0 = "source4 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r0)
            java.lang.String r0 = "source5 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r0)
            java.lang.String r0 = "source6 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r8, r0)
            java.lang.String r0 = "source7 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r9, r0)
            java.lang.String r0 = "source8 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r10, r0)
            io.reactivex.functions.Function r11 = io.reactivex.internal.functions.Functions.toFunction(r11)
            int r0 = bufferSize()
            r1 = 8
            io.reactivex.ObservableSource[] r1 = new io.reactivex.ObservableSource[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r3 = 2
            r1[r3] = r5
            r3 = 3
            r1[r3] = r6
            r3 = 4
            r1[r3] = r7
            r3 = 5
            r1[r3] = r8
            r3 = 6
            r1[r3] = r9
            r3 = 7
            r1[r3] = r10
            io.reactivex.Observable r3 = combineLatest(r11, r0, r1)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T1, T2, T3, T4, T5, T6, T7, R> io.reactivex.Observable<R> combineLatest(io.reactivex.ObservableSource<? extends T1> r3, io.reactivex.ObservableSource<? extends T2> r4, io.reactivex.ObservableSource<? extends T3> r5, io.reactivex.ObservableSource<? extends T4> r6, io.reactivex.ObservableSource<? extends T5> r7, io.reactivex.ObservableSource<? extends T6> r8, io.reactivex.ObservableSource<? extends T7> r9, io.reactivex.functions.Function7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> r10) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            java.lang.String r0 = "source3 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            java.lang.String r0 = "source4 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r0)
            java.lang.String r0 = "source5 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r0)
            java.lang.String r0 = "source6 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r8, r0)
            java.lang.String r0 = "source7 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r9, r0)
            io.reactivex.functions.Function r10 = io.reactivex.internal.functions.Functions.toFunction(r10)
            int r0 = bufferSize()
            r1 = 7
            io.reactivex.ObservableSource[] r1 = new io.reactivex.ObservableSource[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r3 = 2
            r1[r3] = r5
            r3 = 3
            r1[r3] = r6
            r3 = 4
            r1[r3] = r7
            r3 = 5
            r1[r3] = r8
            r3 = 6
            r1[r3] = r9
            io.reactivex.Observable r3 = combineLatest(r10, r0, r1)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T1, T2, T3, T4, T5, T6, R> io.reactivex.Observable<R> combineLatest(io.reactivex.ObservableSource<? extends T1> r3, io.reactivex.ObservableSource<? extends T2> r4, io.reactivex.ObservableSource<? extends T3> r5, io.reactivex.ObservableSource<? extends T4> r6, io.reactivex.ObservableSource<? extends T5> r7, io.reactivex.ObservableSource<? extends T6> r8, io.reactivex.functions.Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> r9) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            java.lang.String r0 = "source3 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            java.lang.String r0 = "source4 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r0)
            java.lang.String r0 = "source5 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r0)
            java.lang.String r0 = "source6 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r8, r0)
            io.reactivex.functions.Function r9 = io.reactivex.internal.functions.Functions.toFunction(r9)
            int r0 = bufferSize()
            r1 = 6
            io.reactivex.ObservableSource[] r1 = new io.reactivex.ObservableSource[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r3 = 2
            r1[r3] = r5
            r3 = 3
            r1[r3] = r6
            r3 = 4
            r1[r3] = r7
            r3 = 5
            r1[r3] = r8
            io.reactivex.Observable r3 = combineLatest(r9, r0, r1)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T1, T2, T3, T4, T5, R> io.reactivex.Observable<R> combineLatest(io.reactivex.ObservableSource<? extends T1> r3, io.reactivex.ObservableSource<? extends T2> r4, io.reactivex.ObservableSource<? extends T3> r5, io.reactivex.ObservableSource<? extends T4> r6, io.reactivex.ObservableSource<? extends T5> r7, io.reactivex.functions.Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> r8) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            java.lang.String r0 = "source3 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            java.lang.String r0 = "source4 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r0)
            java.lang.String r0 = "source5 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r0)
            io.reactivex.functions.Function r8 = io.reactivex.internal.functions.Functions.toFunction(r8)
            int r0 = bufferSize()
            r1 = 5
            io.reactivex.ObservableSource[] r1 = new io.reactivex.ObservableSource[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r3 = 2
            r1[r3] = r5
            r3 = 3
            r1[r3] = r6
            r3 = 4
            r1[r3] = r7
            io.reactivex.Observable r3 = combineLatest(r8, r0, r1)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T1, T2, T3, T4, R> io.reactivex.Observable<R> combineLatest(io.reactivex.ObservableSource<? extends T1> r3, io.reactivex.ObservableSource<? extends T2> r4, io.reactivex.ObservableSource<? extends T3> r5, io.reactivex.ObservableSource<? extends T4> r6, io.reactivex.functions.Function4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> r7) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            java.lang.String r0 = "source3 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            java.lang.String r0 = "source4 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r0)
            io.reactivex.functions.Function r7 = io.reactivex.internal.functions.Functions.toFunction(r7)
            int r0 = bufferSize()
            r1 = 4
            io.reactivex.ObservableSource[] r1 = new io.reactivex.ObservableSource[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r3 = 2
            r1[r3] = r5
            r3 = 3
            r1[r3] = r6
            io.reactivex.Observable r3 = combineLatest(r7, r0, r1)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T1, T2, T3, R> io.reactivex.Observable<R> combineLatest(io.reactivex.ObservableSource<? extends T1> r3, io.reactivex.ObservableSource<? extends T2> r4, io.reactivex.ObservableSource<? extends T3> r5, io.reactivex.functions.Function3<? super T1, ? super T2, ? super T3, ? extends R> r6) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            java.lang.String r0 = "source3 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            io.reactivex.functions.Function r6 = io.reactivex.internal.functions.Functions.toFunction(r6)
            int r0 = bufferSize()
            r1 = 3
            io.reactivex.ObservableSource[] r1 = new io.reactivex.ObservableSource[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r3 = 2
            r1[r3] = r5
            io.reactivex.Observable r3 = combineLatest(r6, r0, r1)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T1, T2, R> io.reactivex.Observable<R> combineLatest(io.reactivex.ObservableSource<? extends T1> r3, io.reactivex.ObservableSource<? extends T2> r4, io.reactivex.functions.BiFunction<? super T1, ? super T2, ? extends R> r5) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            io.reactivex.functions.Function r5 = io.reactivex.internal.functions.Functions.toFunction(r5)
            int r0 = bufferSize()
            r1 = 2
            io.reactivex.ObservableSource[] r1 = new io.reactivex.ObservableSource[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            io.reactivex.Observable r3 = combineLatest(r5, r0, r1)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T, R> io.reactivex.Observable<R> combineLatest(io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r0, int r1, io.reactivex.ObservableSource<? extends T>... r2) {
            io.reactivex.Observable r0 = combineLatest(r2, r0, r1)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T, R> io.reactivex.Observable<R> combineLatest(java.lang.Iterable<? extends io.reactivex.ObservableSource<? extends T>> r1, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r2) {
            int r0 = bufferSize()
            io.reactivex.Observable r1 = combineLatest(r1, r2, r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T, R> io.reactivex.Observable<R> combineLatest(java.lang.Iterable<? extends io.reactivex.ObservableSource<? extends T>> r7, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r8, int r9) {
            java.lang.String r0 = "sources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r0)
            java.lang.String r0 = "combiner is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r8, r0)
            java.lang.String r0 = "bufferSize"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r9, r0)
            int r5 = r9 << 1
            io.reactivex.internal.operators.observable.ObservableCombineLatest r9 = new io.reactivex.internal.operators.observable.ObservableCombineLatest
            r2 = 0
            r6 = 0
            r1 = r9
            r3 = r7
            r4 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            io.reactivex.Observable r7 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r9)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T, R> io.reactivex.Observable<R> combineLatest(io.reactivex.ObservableSource<? extends T>[] r1, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r2) {
            int r0 = bufferSize()
            io.reactivex.Observable r1 = combineLatest(r1, r2, r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T, R> io.reactivex.Observable<R> combineLatest(io.reactivex.ObservableSource<? extends T>[] r7, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r8, int r9) {
            java.lang.String r0 = "sources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r0)
            int r0 = r7.length
            if (r0 != 0) goto Ld
            io.reactivex.Observable r7 = empty()
            return r7
        Ld:
            java.lang.String r0 = "combiner is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r8, r0)
            java.lang.String r0 = "bufferSize"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r9, r0)
            int r5 = r9 << 1
            io.reactivex.internal.operators.observable.ObservableCombineLatest r9 = new io.reactivex.internal.operators.observable.ObservableCombineLatest
            r3 = 0
            r6 = 0
            r1 = r9
            r2 = r7
            r4 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            io.reactivex.Observable r7 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r9)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T, R> io.reactivex.Observable<R> combineLatestDelayError(io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r0, int r1, io.reactivex.ObservableSource<? extends T>... r2) {
            io.reactivex.Observable r0 = combineLatestDelayError(r2, r0, r1)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T, R> io.reactivex.Observable<R> combineLatestDelayError(java.lang.Iterable<? extends io.reactivex.ObservableSource<? extends T>> r1, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r2) {
            int r0 = bufferSize()
            io.reactivex.Observable r1 = combineLatestDelayError(r1, r2, r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T, R> io.reactivex.Observable<R> combineLatestDelayError(java.lang.Iterable<? extends io.reactivex.ObservableSource<? extends T>> r7, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r8, int r9) {
            java.lang.String r0 = "sources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r0)
            java.lang.String r0 = "combiner is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r8, r0)
            java.lang.String r0 = "bufferSize"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r9, r0)
            int r5 = r9 << 1
            io.reactivex.internal.operators.observable.ObservableCombineLatest r9 = new io.reactivex.internal.operators.observable.ObservableCombineLatest
            r2 = 0
            r6 = 1
            r1 = r9
            r3 = r7
            r4 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            io.reactivex.Observable r7 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r9)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T, R> io.reactivex.Observable<R> combineLatestDelayError(io.reactivex.ObservableSource<? extends T>[] r1, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r2) {
            int r0 = bufferSize()
            io.reactivex.Observable r1 = combineLatestDelayError(r1, r2, r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T, R> io.reactivex.Observable<R> combineLatestDelayError(io.reactivex.ObservableSource<? extends T>[] r6, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r7, int r8) {
            java.lang.String r0 = "bufferSize"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r8, r0)
            java.lang.String r0 = "combiner is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r0)
            int r0 = r6.length
            if (r0 != 0) goto L12
            io.reactivex.Observable r6 = empty()
            return r6
        L12:
            int r4 = r8 << 1
            io.reactivex.internal.operators.observable.ObservableCombineLatest r8 = new io.reactivex.internal.operators.observable.ObservableCombineLatest
            r2 = 0
            r5 = 1
            r0 = r8
            r1 = r6
            r3 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            io.reactivex.Observable r6 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r8)
            return r6
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> concat(io.reactivex.ObservableSource<? extends io.reactivex.ObservableSource<? extends T>> r1) {
            int r0 = bufferSize()
            io.reactivex.Observable r1 = concat(r1, r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> concat(io.reactivex.ObservableSource<? extends io.reactivex.ObservableSource<? extends T>> r3, int r4) {
            java.lang.String r0 = "sources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "prefetch"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r4, r0)
            io.reactivex.internal.operators.observable.ObservableConcatMap r0 = new io.reactivex.internal.operators.observable.ObservableConcatMap
            io.reactivex.functions.Function r1 = io.reactivex.internal.functions.Functions.identity()
            io.reactivex.internal.util.ErrorMode r2 = io.reactivex.internal.util.ErrorMode.IMMEDIATE
            r0.<init>(r3, r1, r4, r2)
            io.reactivex.Observable r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> concat(io.reactivex.ObservableSource<? extends T> r2, io.reactivex.ObservableSource<? extends T> r3) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            r0 = 2
            io.reactivex.ObservableSource[] r0 = new io.reactivex.ObservableSource[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            io.reactivex.Observable r2 = concatArray(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> concat(io.reactivex.ObservableSource<? extends T> r2, io.reactivex.ObservableSource<? extends T> r3, io.reactivex.ObservableSource<? extends T> r4) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source3 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            r0 = 3
            io.reactivex.ObservableSource[] r0 = new io.reactivex.ObservableSource[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            io.reactivex.Observable r2 = concatArray(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> concat(io.reactivex.ObservableSource<? extends T> r2, io.reactivex.ObservableSource<? extends T> r3, io.reactivex.ObservableSource<? extends T> r4, io.reactivex.ObservableSource<? extends T> r5) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source3 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            java.lang.String r0 = "source4 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            r0 = 4
            io.reactivex.ObservableSource[] r0 = new io.reactivex.ObservableSource[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            r2 = 3
            r0[r2] = r5
            io.reactivex.Observable r2 = concatArray(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> concat(java.lang.Iterable<? extends io.reactivex.ObservableSource<? extends T>> r3) {
            java.lang.String r0 = "sources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.Observable r3 = fromIterable(r3)
            io.reactivex.functions.Function r0 = io.reactivex.internal.functions.Functions.identity()
            int r1 = bufferSize()
            r2 = 0
            io.reactivex.Observable r3 = r3.concatMapDelayError(r0, r1, r2)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> concatArray(io.reactivex.ObservableSource<? extends T>... r4) {
            int r0 = r4.length
            if (r0 != 0) goto L8
            io.reactivex.Observable r4 = empty()
            return r4
        L8:
            int r0 = r4.length
            r1 = 1
            if (r0 != r1) goto L14
            r0 = 0
            r4 = r4[r0]
            io.reactivex.Observable r4 = wrap(r4)
            return r4
        L14:
            io.reactivex.internal.operators.observable.ObservableConcatMap r0 = new io.reactivex.internal.operators.observable.ObservableConcatMap
            io.reactivex.Observable r4 = fromArray(r4)
            io.reactivex.functions.Function r1 = io.reactivex.internal.functions.Functions.identity()
            int r2 = bufferSize()
            io.reactivex.internal.util.ErrorMode r3 = io.reactivex.internal.util.ErrorMode.BOUNDARY
            r0.<init>(r4, r1, r2, r3)
            io.reactivex.Observable r4 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r4
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> concatArrayDelayError(io.reactivex.ObservableSource<? extends T>... r2) {
            int r0 = r2.length
            if (r0 != 0) goto L8
            io.reactivex.Observable r2 = empty()
            return r2
        L8:
            int r0 = r2.length
            r1 = 1
            if (r0 != r1) goto L14
            r0 = 0
            r2 = r2[r0]
            io.reactivex.Observable r2 = wrap(r2)
            return r2
        L14:
            io.reactivex.Observable r2 = fromArray(r2)
            io.reactivex.Observable r2 = concatDelayError(r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> concatArrayEager(int r2, int r3, io.reactivex.ObservableSource<? extends T>... r4) {
            io.reactivex.Observable r4 = fromArray(r4)
            io.reactivex.functions.Function r0 = io.reactivex.internal.functions.Functions.identity()
            r1 = 0
            io.reactivex.Observable r2 = r4.concatMapEagerDelayError(r0, r2, r3, r1)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> concatArrayEager(io.reactivex.ObservableSource<? extends T>... r2) {
            int r0 = bufferSize()
            int r1 = bufferSize()
            io.reactivex.Observable r2 = concatArrayEager(r0, r1, r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> concatDelayError(io.reactivex.ObservableSource<? extends io.reactivex.ObservableSource<? extends T>> r2) {
            int r0 = bufferSize()
            r1 = 1
            io.reactivex.Observable r2 = concatDelayError(r2, r0, r1)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> concatDelayError(io.reactivex.ObservableSource<? extends io.reactivex.ObservableSource<? extends T>> r2, int r3, boolean r4) {
            java.lang.String r0 = "sources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "prefetch is null"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r3, r0)
            io.reactivex.internal.operators.observable.ObservableConcatMap r0 = new io.reactivex.internal.operators.observable.ObservableConcatMap
            io.reactivex.functions.Function r1 = io.reactivex.internal.functions.Functions.identity()
            if (r4 == 0) goto L15
            io.reactivex.internal.util.ErrorMode r4 = io.reactivex.internal.util.ErrorMode.END
            goto L17
        L15:
            io.reactivex.internal.util.ErrorMode r4 = io.reactivex.internal.util.ErrorMode.BOUNDARY
        L17:
            r0.<init>(r2, r1, r3, r4)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> concatDelayError(java.lang.Iterable<? extends io.reactivex.ObservableSource<? extends T>> r1) {
            java.lang.String r0 = "sources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.Observable r1 = fromIterable(r1)
            io.reactivex.Observable r1 = concatDelayError(r1)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> concatEager(io.reactivex.ObservableSource<? extends io.reactivex.ObservableSource<? extends T>> r2) {
            int r0 = bufferSize()
            int r1 = bufferSize()
            io.reactivex.Observable r2 = concatEager(r2, r0, r1)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> concatEager(io.reactivex.ObservableSource<? extends io.reactivex.ObservableSource<? extends T>> r1, int r2, int r3) {
            io.reactivex.Observable r1 = wrap(r1)
            io.reactivex.functions.Function r0 = io.reactivex.internal.functions.Functions.identity()
            io.reactivex.Observable r1 = r1.concatMapEager(r0, r2, r3)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> concatEager(java.lang.Iterable<? extends io.reactivex.ObservableSource<? extends T>> r2) {
            int r0 = bufferSize()
            int r1 = bufferSize()
            io.reactivex.Observable r2 = concatEager(r2, r0, r1)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> concatEager(java.lang.Iterable<? extends io.reactivex.ObservableSource<? extends T>> r2, int r3, int r4) {
            io.reactivex.Observable r2 = fromIterable(r2)
            io.reactivex.functions.Function r0 = io.reactivex.internal.functions.Functions.identity()
            r1 = 0
            io.reactivex.Observable r2 = r2.concatMapEagerDelayError(r0, r3, r4, r1)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> create(io.reactivex.ObservableOnSubscribe<T> r1) {
            java.lang.String r0 = "source is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.internal.operators.observable.ObservableCreate r0 = new io.reactivex.internal.operators.observable.ObservableCreate
            r0.<init>(r1)
            io.reactivex.Observable r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> defer(java.util.concurrent.Callable<? extends io.reactivex.ObservableSource<? extends T>> r1) {
            java.lang.String r0 = "supplier is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.internal.operators.observable.ObservableDefer r0 = new io.reactivex.internal.operators.observable.ObservableDefer
            r0.<init>(r1)
            io.reactivex.Observable r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    private io.reactivex.Observable<T> doOnEach(io.reactivex.functions.Consumer<? super T> r8, io.reactivex.functions.Consumer<? super java.lang.Throwable> r9, io.reactivex.functions.Action r10, io.reactivex.functions.Action r11) {
            r7 = this;
            java.lang.String r0 = "onNext is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r8, r0)
            java.lang.String r0 = "onError is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r9, r0)
            java.lang.String r0 = "onComplete is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r10, r0)
            java.lang.String r0 = "onAfterTerminate is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r11, r0)
            io.reactivex.internal.operators.observable.ObservableDoOnEach r0 = new io.reactivex.internal.operators.observable.ObservableDoOnEach
            r1 = r0
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            io.reactivex.Observable r8 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r8
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> empty() {
            io.reactivex.Observable<java.lang.Object> r0 = io.reactivex.internal.operators.observable.ObservableEmpty.INSTANCE
            io.reactivex.Observable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> error(java.lang.Throwable r1) {
            java.lang.String r0 = "e is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            java.util.concurrent.Callable r1 = io.reactivex.internal.functions.Functions.justCallable(r1)
            io.reactivex.Observable r1 = error(r1)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> error(java.util.concurrent.Callable<? extends java.lang.Throwable> r1) {
            java.lang.String r0 = "errorSupplier is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.internal.operators.observable.ObservableError r0 = new io.reactivex.internal.operators.observable.ObservableError
            r0.<init>(r1)
            io.reactivex.Observable r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> fromArray(T... r2) {
            java.lang.String r0 = "items is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            int r0 = r2.length
            if (r0 != 0) goto Ld
            io.reactivex.Observable r2 = empty()
            return r2
        Ld:
            int r0 = r2.length
            r1 = 1
            if (r0 != r1) goto L19
            r0 = 0
            r2 = r2[r0]
            io.reactivex.Observable r2 = just(r2)
            return r2
        L19:
            io.reactivex.internal.operators.observable.ObservableFromArray r0 = new io.reactivex.internal.operators.observable.ObservableFromArray
            r0.<init>(r2)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> fromCallable(java.util.concurrent.Callable<? extends T> r1) {
            java.lang.String r0 = "supplier is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.internal.operators.observable.ObservableFromCallable r0 = new io.reactivex.internal.operators.observable.ObservableFromCallable
            r0.<init>(r1)
            io.reactivex.Observable r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> fromFuture(java.util.concurrent.Future<? extends T> r4) {
            java.lang.String r0 = "future is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            io.reactivex.internal.operators.observable.ObservableFromFuture r0 = new io.reactivex.internal.operators.observable.ObservableFromFuture
            r1 = 0
            r3 = 0
            r0.<init>(r4, r1, r3)
            io.reactivex.Observable r4 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r4
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> fromFuture(java.util.concurrent.Future<? extends T> r1, long r2, java.util.concurrent.TimeUnit r4) {
            java.lang.String r0 = "future is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            java.lang.String r0 = "unit is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            io.reactivex.internal.operators.observable.ObservableFromFuture r0 = new io.reactivex.internal.operators.observable.ObservableFromFuture
            r0.<init>(r1, r2, r4)
            io.reactivex.Observable r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> fromFuture(java.util.concurrent.Future<? extends T> r1, long r2, java.util.concurrent.TimeUnit r4, io.reactivex.Scheduler r5) {
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            io.reactivex.Observable r1 = fromFuture(r1, r2, r4)
            io.reactivex.Observable r1 = r1.subscribeOn(r5)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> fromFuture(java.util.concurrent.Future<? extends T> r1, io.reactivex.Scheduler r2) {
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.Observable r1 = fromFuture(r1)
            io.reactivex.Observable r1 = r1.subscribeOn(r2)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> fromIterable(java.lang.Iterable<? extends T> r1) {
            java.lang.String r0 = "source is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.internal.operators.observable.ObservableFromIterable r0 = new io.reactivex.internal.operators.observable.ObservableFromIterable
            r0.<init>(r1)
            io.reactivex.Observable r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> fromPublisher(org.reactivestreams.Publisher<? extends T> r1) {
            java.lang.String r0 = "publisher is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.internal.operators.observable.ObservableFromPublisher r0 = new io.reactivex.internal.operators.observable.ObservableFromPublisher
            r0.<init>(r1)
            io.reactivex.Observable r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> generate(io.reactivex.functions.Consumer<io.reactivex.Emitter<T>> r2) {
            java.lang.String r0 = "generator  is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.util.concurrent.Callable r0 = io.reactivex.internal.functions.Functions.nullSupplier()
            io.reactivex.functions.BiFunction r2 = io.reactivex.internal.operators.observable.ObservableInternalHelper.simpleGenerator(r2)
            io.reactivex.functions.Consumer r1 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.Observable r2 = generate(r0, r2, r1)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T, S> io.reactivex.Observable<T> generate(java.util.concurrent.Callable<S> r1, io.reactivex.functions.BiConsumer<S, io.reactivex.Emitter<T>> r2) {
            java.lang.String r0 = "generator  is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.functions.BiFunction r2 = io.reactivex.internal.operators.observable.ObservableInternalHelper.simpleBiGenerator(r2)
            io.reactivex.functions.Consumer r0 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.Observable r1 = generate(r1, r2, r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T, S> io.reactivex.Observable<T> generate(java.util.concurrent.Callable<S> r1, io.reactivex.functions.BiConsumer<S, io.reactivex.Emitter<T>> r2, io.reactivex.functions.Consumer<? super S> r3) {
            java.lang.String r0 = "generator  is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.functions.BiFunction r2 = io.reactivex.internal.operators.observable.ObservableInternalHelper.simpleBiGenerator(r2)
            io.reactivex.Observable r1 = generate(r1, r2, r3)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T, S> io.reactivex.Observable<T> generate(java.util.concurrent.Callable<S> r1, io.reactivex.functions.BiFunction<S, io.reactivex.Emitter<T>, S> r2) {
            io.reactivex.functions.Consumer r0 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.Observable r1 = generate(r1, r2, r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T, S> io.reactivex.Observable<T> generate(java.util.concurrent.Callable<S> r1, io.reactivex.functions.BiFunction<S, io.reactivex.Emitter<T>, S> r2, io.reactivex.functions.Consumer<? super S> r3) {
            java.lang.String r0 = "initialState is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            java.lang.String r0 = "generator  is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "disposeState is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.observable.ObservableGenerate r0 = new io.reactivex.internal.operators.observable.ObservableGenerate
            r0.<init>(r1, r2, r3)
            io.reactivex.Observable r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.CheckReturnValue
    public static io.reactivex.Observable<java.lang.Long> interval(long r6, long r8, java.util.concurrent.TimeUnit r10) {
            io.reactivex.Scheduler r5 = io.reactivex.schedulers.Schedulers.computation()
            r0 = r6
            r2 = r8
            r4 = r10
            io.reactivex.Observable r6 = interval(r0, r2, r4, r5)
            return r6
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public static io.reactivex.Observable<java.lang.Long> interval(long r8, long r10, java.util.concurrent.TimeUnit r12, io.reactivex.Scheduler r13) {
            java.lang.String r0 = "unit is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r12, r0)
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r13, r0)
            io.reactivex.internal.operators.observable.ObservableInterval r0 = new io.reactivex.internal.operators.observable.ObservableInterval
            r1 = 0
            long r8 = java.lang.Math.max(r1, r8)
            long r4 = java.lang.Math.max(r1, r10)
            r1 = r0
            r2 = r8
            r6 = r12
            r7 = r13
            r1.<init>(r2, r4, r6, r7)
            io.reactivex.Observable r8 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r8
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.CheckReturnValue
    public static io.reactivex.Observable<java.lang.Long> interval(long r6, java.util.concurrent.TimeUnit r8) {
            io.reactivex.Scheduler r5 = io.reactivex.schedulers.Schedulers.computation()
            r0 = r6
            r2 = r6
            r4 = r8
            io.reactivex.Observable r6 = interval(r0, r2, r4, r5)
            return r6
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public static io.reactivex.Observable<java.lang.Long> interval(long r6, java.util.concurrent.TimeUnit r8, io.reactivex.Scheduler r9) {
            r0 = r6
            r2 = r6
            r4 = r8
            r5 = r9
            io.reactivex.Observable r6 = interval(r0, r2, r4, r5)
            return r6
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.CheckReturnValue
    public static io.reactivex.Observable<java.lang.Long> intervalRange(long r10, long r12, long r14, long r16, java.util.concurrent.TimeUnit r18) {
            io.reactivex.Scheduler r9 = io.reactivex.schedulers.Schedulers.computation()
            r0 = r10
            r2 = r12
            r4 = r14
            r6 = r16
            r8 = r18
            io.reactivex.Observable r0 = intervalRange(r0, r2, r4, r6, r8, r9)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public static io.reactivex.Observable<java.lang.Long> intervalRange(long r16, long r18, long r20, long r22, java.util.concurrent.TimeUnit r24, io.reactivex.Scheduler r25) {
            r0 = r18
            r2 = r20
            r9 = r24
            r10 = r25
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 < 0) goto L57
            if (r6 != 0) goto L19
            io.reactivex.Observable r0 = empty()
            io.reactivex.Observable r0 = r0.delay(r2, r9, r10)
            return r0
        L19:
            r6 = 1
            long r0 = r0 - r6
            long r6 = r16 + r0
            int r0 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r0 <= 0) goto L2f
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 < 0) goto L27
            goto L2f
        L27:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Overflow! start + count is bigger than Long.MAX_VALUE"
            r0.<init>(r1)
            throw r0
        L2f:
            java.lang.String r0 = "unit is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r9, r0)
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r10, r0)
            io.reactivex.internal.operators.observable.ObservableIntervalRange r11 = new io.reactivex.internal.operators.observable.ObservableIntervalRange
            long r12 = java.lang.Math.max(r4, r2)
            r0 = r22
            long r14 = java.lang.Math.max(r4, r0)
            r0 = r11
            r1 = r16
            r3 = r6
            r5 = r12
            r7 = r14
            r9 = r24
            r10 = r25
            r0.<init>(r1, r3, r5, r7, r9, r10)
            io.reactivex.Observable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r11)
            return r0
        L57:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "count >= 0 required but it was "
            r3.<init>(r4)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> just(T r1) {
            java.lang.String r0 = "The item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.internal.operators.observable.ObservableJust r0 = new io.reactivex.internal.operators.observable.ObservableJust
            r0.<init>(r1)
            io.reactivex.Observable r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> just(T r2, T r3) {
            java.lang.String r0 = "The first item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "The second item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            io.reactivex.Observable r2 = fromArray(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> just(T r2, T r3, T r4) {
            java.lang.String r0 = "The first item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "The second item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "The third item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            io.reactivex.Observable r2 = fromArray(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> just(T r2, T r3, T r4, T r5) {
            java.lang.String r0 = "The first item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "The second item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "The third item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            java.lang.String r0 = "The fourth item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            r2 = 3
            r0[r2] = r5
            io.reactivex.Observable r2 = fromArray(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> just(T r2, T r3, T r4, T r5, T r6) {
            java.lang.String r0 = "The first item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "The second item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "The third item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            java.lang.String r0 = "The fourth item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            java.lang.String r0 = "The fifth item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r0)
            r0 = 5
            java.lang.Object[] r0 = new java.lang.Object[r0]
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
            io.reactivex.Observable r2 = fromArray(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> just(T r2, T r3, T r4, T r5, T r6, T r7) {
            java.lang.String r0 = "The first item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "The second item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "The third item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            java.lang.String r0 = "The fourth item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            java.lang.String r0 = "The fifth item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r0)
            java.lang.String r0 = "The sixth item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r0)
            r0 = 6
            java.lang.Object[] r0 = new java.lang.Object[r0]
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
            io.reactivex.Observable r2 = fromArray(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> just(T r2, T r3, T r4, T r5, T r6, T r7, T r8) {
            java.lang.String r0 = "The first item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "The second item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "The third item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            java.lang.String r0 = "The fourth item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            java.lang.String r0 = "The fifth item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r0)
            java.lang.String r0 = "The sixth item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r0)
            java.lang.String r0 = "The seventh item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r8, r0)
            r0 = 7
            java.lang.Object[] r0 = new java.lang.Object[r0]
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
            io.reactivex.Observable r2 = fromArray(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> just(T r2, T r3, T r4, T r5, T r6, T r7, T r8, T r9) {
            java.lang.String r0 = "The first item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "The second item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "The third item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            java.lang.String r0 = "The fourth item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            java.lang.String r0 = "The fifth item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r0)
            java.lang.String r0 = "The sixth item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r0)
            java.lang.String r0 = "The seventh item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r8, r0)
            java.lang.String r0 = "The eighth item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r9, r0)
            r0 = 8
            java.lang.Object[] r0 = new java.lang.Object[r0]
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
            io.reactivex.Observable r2 = fromArray(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> just(T r2, T r3, T r4, T r5, T r6, T r7, T r8, T r9, T r10) {
            java.lang.String r0 = "The first item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "The second item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "The third item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            java.lang.String r0 = "The fourth item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            java.lang.String r0 = "The fifth item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r0)
            java.lang.String r0 = "The sixth item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r0)
            java.lang.String r0 = "The seventh item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r8, r0)
            java.lang.String r0 = "The eighth item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r9, r0)
            java.lang.String r0 = "The ninth item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r10, r0)
            r0 = 9
            java.lang.Object[] r0 = new java.lang.Object[r0]
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
            io.reactivex.Observable r2 = fromArray(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> just(T r2, T r3, T r4, T r5, T r6, T r7, T r8, T r9, T r10, T r11) {
            java.lang.String r0 = "The first item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "The second item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "The third item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            java.lang.String r0 = "The fourth item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            java.lang.String r0 = "The fifth item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r0)
            java.lang.String r0 = "The sixth item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r0)
            java.lang.String r0 = "The seventh item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r8, r0)
            java.lang.String r0 = "The eighth item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r9, r0)
            java.lang.String r0 = "The ninth item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r10, r0)
            java.lang.String r0 = "The tenth item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r11, r0)
            r0 = 10
            java.lang.Object[] r0 = new java.lang.Object[r0]
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
            r2 = 9
            r0[r2] = r11
            io.reactivex.Observable r2 = fromArray(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> merge(io.reactivex.ObservableSource<? extends io.reactivex.ObservableSource<? extends T>> r7) {
            java.lang.String r0 = "sources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r0)
            io.reactivex.internal.operators.observable.ObservableFlatMap r0 = new io.reactivex.internal.operators.observable.ObservableFlatMap
            io.reactivex.functions.Function r3 = io.reactivex.internal.functions.Functions.identity()
            r4 = 0
            r5 = 2147483647(0x7fffffff, float:NaN)
            int r6 = bufferSize()
            r1 = r0
            r2 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            io.reactivex.Observable r7 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> merge(io.reactivex.ObservableSource<? extends io.reactivex.ObservableSource<? extends T>> r7, int r8) {
            java.lang.String r0 = "sources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r0)
            java.lang.String r0 = "maxConcurrency"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r8, r0)
            io.reactivex.internal.operators.observable.ObservableFlatMap r0 = new io.reactivex.internal.operators.observable.ObservableFlatMap
            io.reactivex.functions.Function r3 = io.reactivex.internal.functions.Functions.identity()
            r4 = 0
            int r6 = bufferSize()
            r1 = r0
            r2 = r7
            r5 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            io.reactivex.Observable r7 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> merge(io.reactivex.ObservableSource<? extends T> r3, io.reactivex.ObservableSource<? extends T> r4) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            r0 = 2
            io.reactivex.ObservableSource[] r1 = new io.reactivex.ObservableSource[r0]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            io.reactivex.Observable r3 = fromArray(r1)
            io.reactivex.functions.Function r4 = io.reactivex.internal.functions.Functions.identity()
            io.reactivex.Observable r3 = r3.flatMap(r4, r2, r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> merge(io.reactivex.ObservableSource<? extends T> r3, io.reactivex.ObservableSource<? extends T> r4, io.reactivex.ObservableSource<? extends T> r5) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            java.lang.String r0 = "source3 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            r0 = 3
            io.reactivex.ObservableSource[] r1 = new io.reactivex.ObservableSource[r0]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r3 = 2
            r1[r3] = r5
            io.reactivex.Observable r3 = fromArray(r1)
            io.reactivex.functions.Function r4 = io.reactivex.internal.functions.Functions.identity()
            io.reactivex.Observable r3 = r3.flatMap(r4, r2, r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> merge(io.reactivex.ObservableSource<? extends T> r3, io.reactivex.ObservableSource<? extends T> r4, io.reactivex.ObservableSource<? extends T> r5, io.reactivex.ObservableSource<? extends T> r6) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            java.lang.String r0 = "source3 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            java.lang.String r0 = "source4 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r0)
            r0 = 4
            io.reactivex.ObservableSource[] r1 = new io.reactivex.ObservableSource[r0]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r3 = 2
            r1[r3] = r5
            r3 = 3
            r1[r3] = r6
            io.reactivex.Observable r3 = fromArray(r1)
            io.reactivex.functions.Function r4 = io.reactivex.internal.functions.Functions.identity()
            io.reactivex.Observable r3 = r3.flatMap(r4, r2, r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> merge(java.lang.Iterable<? extends io.reactivex.ObservableSource<? extends T>> r1) {
            io.reactivex.Observable r1 = fromIterable(r1)
            io.reactivex.functions.Function r0 = io.reactivex.internal.functions.Functions.identity()
            io.reactivex.Observable r1 = r1.flatMap(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> merge(java.lang.Iterable<? extends io.reactivex.ObservableSource<? extends T>> r1, int r2) {
            io.reactivex.Observable r1 = fromIterable(r1)
            io.reactivex.functions.Function r0 = io.reactivex.internal.functions.Functions.identity()
            io.reactivex.Observable r1 = r1.flatMap(r0, r2)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> merge(java.lang.Iterable<? extends io.reactivex.ObservableSource<? extends T>> r2, int r3, int r4) {
            io.reactivex.Observable r2 = fromIterable(r2)
            io.reactivex.functions.Function r0 = io.reactivex.internal.functions.Functions.identity()
            r1 = 0
            io.reactivex.Observable r2 = r2.flatMap(r0, r1, r3, r4)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> mergeArray(int r2, int r3, io.reactivex.ObservableSource<? extends T>... r4) {
            io.reactivex.Observable r4 = fromArray(r4)
            io.reactivex.functions.Function r0 = io.reactivex.internal.functions.Functions.identity()
            r1 = 0
            io.reactivex.Observable r2 = r4.flatMap(r0, r1, r2, r3)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> mergeArray(io.reactivex.ObservableSource<? extends T>... r2) {
            io.reactivex.Observable r0 = fromArray(r2)
            io.reactivex.functions.Function r1 = io.reactivex.internal.functions.Functions.identity()
            int r2 = r2.length
            io.reactivex.Observable r2 = r0.flatMap(r1, r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> mergeArrayDelayError(int r2, int r3, io.reactivex.ObservableSource<? extends T>... r4) {
            io.reactivex.Observable r4 = fromArray(r4)
            io.reactivex.functions.Function r0 = io.reactivex.internal.functions.Functions.identity()
            r1 = 1
            io.reactivex.Observable r2 = r4.flatMap(r0, r1, r2, r3)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> mergeArrayDelayError(io.reactivex.ObservableSource<? extends T>... r3) {
            io.reactivex.Observable r0 = fromArray(r3)
            io.reactivex.functions.Function r1 = io.reactivex.internal.functions.Functions.identity()
            r2 = 1
            int r3 = r3.length
            io.reactivex.Observable r3 = r0.flatMap(r1, r2, r3)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> mergeDelayError(io.reactivex.ObservableSource<? extends io.reactivex.ObservableSource<? extends T>> r7) {
            java.lang.String r0 = "sources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r0)
            io.reactivex.internal.operators.observable.ObservableFlatMap r0 = new io.reactivex.internal.operators.observable.ObservableFlatMap
            io.reactivex.functions.Function r3 = io.reactivex.internal.functions.Functions.identity()
            r4 = 1
            r5 = 2147483647(0x7fffffff, float:NaN)
            int r6 = bufferSize()
            r1 = r0
            r2 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            io.reactivex.Observable r7 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> mergeDelayError(io.reactivex.ObservableSource<? extends io.reactivex.ObservableSource<? extends T>> r7, int r8) {
            java.lang.String r0 = "sources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r0)
            java.lang.String r0 = "maxConcurrency"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r8, r0)
            io.reactivex.internal.operators.observable.ObservableFlatMap r0 = new io.reactivex.internal.operators.observable.ObservableFlatMap
            io.reactivex.functions.Function r3 = io.reactivex.internal.functions.Functions.identity()
            r4 = 1
            int r6 = bufferSize()
            r1 = r0
            r2 = r7
            r5 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            io.reactivex.Observable r7 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> mergeDelayError(io.reactivex.ObservableSource<? extends T> r3, io.reactivex.ObservableSource<? extends T> r4) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            r0 = 2
            io.reactivex.ObservableSource[] r1 = new io.reactivex.ObservableSource[r0]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            io.reactivex.Observable r4 = fromArray(r1)
            io.reactivex.functions.Function r1 = io.reactivex.internal.functions.Functions.identity()
            io.reactivex.Observable r3 = r4.flatMap(r1, r3, r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> mergeDelayError(io.reactivex.ObservableSource<? extends T> r3, io.reactivex.ObservableSource<? extends T> r4, io.reactivex.ObservableSource<? extends T> r5) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            java.lang.String r0 = "source3 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            r0 = 3
            io.reactivex.ObservableSource[] r1 = new io.reactivex.ObservableSource[r0]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r4 = 2
            r1[r4] = r5
            io.reactivex.Observable r4 = fromArray(r1)
            io.reactivex.functions.Function r5 = io.reactivex.internal.functions.Functions.identity()
            io.reactivex.Observable r3 = r4.flatMap(r5, r3, r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> mergeDelayError(io.reactivex.ObservableSource<? extends T> r3, io.reactivex.ObservableSource<? extends T> r4, io.reactivex.ObservableSource<? extends T> r5, io.reactivex.ObservableSource<? extends T> r6) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            java.lang.String r0 = "source3 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            java.lang.String r0 = "source4 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r0)
            r0 = 4
            io.reactivex.ObservableSource[] r1 = new io.reactivex.ObservableSource[r0]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r4 = 2
            r1[r4] = r5
            r4 = 3
            r1[r4] = r6
            io.reactivex.Observable r4 = fromArray(r1)
            io.reactivex.functions.Function r5 = io.reactivex.internal.functions.Functions.identity()
            io.reactivex.Observable r3 = r4.flatMap(r5, r3, r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> mergeDelayError(java.lang.Iterable<? extends io.reactivex.ObservableSource<? extends T>> r2) {
            io.reactivex.Observable r2 = fromIterable(r2)
            io.reactivex.functions.Function r0 = io.reactivex.internal.functions.Functions.identity()
            r1 = 1
            io.reactivex.Observable r2 = r2.flatMap(r0, r1)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> mergeDelayError(java.lang.Iterable<? extends io.reactivex.ObservableSource<? extends T>> r2, int r3) {
            io.reactivex.Observable r2 = fromIterable(r2)
            io.reactivex.functions.Function r0 = io.reactivex.internal.functions.Functions.identity()
            r1 = 1
            io.reactivex.Observable r2 = r2.flatMap(r0, r1, r3)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> mergeDelayError(java.lang.Iterable<? extends io.reactivex.ObservableSource<? extends T>> r2, int r3, int r4) {
            io.reactivex.Observable r2 = fromIterable(r2)
            io.reactivex.functions.Function r0 = io.reactivex.internal.functions.Functions.identity()
            r1 = 1
            io.reactivex.Observable r2 = r2.flatMap(r0, r1, r3, r4)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> never() {
            io.reactivex.Observable<java.lang.Object> r0 = io.reactivex.internal.operators.observable.ObservableNever.INSTANCE
            io.reactivex.Observable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static io.reactivex.Observable<java.lang.Integer> range(int r4, int r5) {
            if (r5 < 0) goto L33
            if (r5 != 0) goto L9
            io.reactivex.Observable r4 = empty()
            return r4
        L9:
            r0 = 1
            if (r5 != r0) goto L15
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            io.reactivex.Observable r4 = just(r4)
            return r4
        L15:
            long r0 = (long) r4
            int r2 = r5 + (-1)
            long r2 = (long) r2
            long r0 = r0 + r2
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L2b
            io.reactivex.internal.operators.observable.ObservableRange r0 = new io.reactivex.internal.operators.observable.ObservableRange
            r0.<init>(r4, r5)
            io.reactivex.Observable r4 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r4
        L2b:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Integer overflow"
            r4.<init>(r5)
            throw r4
        L33:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "count >= 0 required but it was "
            r0.<init>(r1)
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static io.reactivex.Observable<java.lang.Long> rangeLong(long r5, long r7) {
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 < 0) goto L3a
            if (r2 != 0) goto Ld
            io.reactivex.Observable r5 = empty()
            return r5
        Ld:
            r2 = 1
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 != 0) goto L1c
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            io.reactivex.Observable r5 = just(r5)
            return r5
        L1c:
            long r2 = r7 - r2
            long r2 = r2 + r5
            int r4 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r4 <= 0) goto L30
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L28
            goto L30
        L28:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Overflow! start + count is bigger than Long.MAX_VALUE"
            r5.<init>(r6)
            throw r5
        L30:
            io.reactivex.internal.operators.observable.ObservableRangeLong r0 = new io.reactivex.internal.operators.observable.ObservableRangeLong
            r0.<init>(r5, r7)
            io.reactivex.Observable r5 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r5
        L3a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "count >= 0 required but it was "
            r6.<init>(r0)
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Single<java.lang.Boolean> sequenceEqual(io.reactivex.ObservableSource<? extends T> r2, io.reactivex.ObservableSource<? extends T> r3) {
            io.reactivex.functions.BiPredicate r0 = io.reactivex.internal.functions.ObjectHelper.equalsPredicate()
            int r1 = bufferSize()
            io.reactivex.Single r2 = sequenceEqual(r2, r3, r0, r1)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Single<java.lang.Boolean> sequenceEqual(io.reactivex.ObservableSource<? extends T> r1, io.reactivex.ObservableSource<? extends T> r2, int r3) {
            io.reactivex.functions.BiPredicate r0 = io.reactivex.internal.functions.ObjectHelper.equalsPredicate()
            io.reactivex.Single r1 = sequenceEqual(r1, r2, r0, r3)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Single<java.lang.Boolean> sequenceEqual(io.reactivex.ObservableSource<? extends T> r1, io.reactivex.ObservableSource<? extends T> r2, io.reactivex.functions.BiPredicate<? super T, ? super T> r3) {
            int r0 = bufferSize()
            io.reactivex.Single r1 = sequenceEqual(r1, r2, r3, r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Single<java.lang.Boolean> sequenceEqual(io.reactivex.ObservableSource<? extends T> r1, io.reactivex.ObservableSource<? extends T> r2, io.reactivex.functions.BiPredicate<? super T, ? super T> r3, int r4) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "isEqual is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "bufferSize"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r4, r0)
            io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle r0 = new io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle
            r0.<init>(r1, r2, r3, r4)
            io.reactivex.Single r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> switchOnNext(io.reactivex.ObservableSource<? extends io.reactivex.ObservableSource<? extends T>> r1) {
            int r0 = bufferSize()
            io.reactivex.Observable r1 = switchOnNext(r1, r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> switchOnNext(io.reactivex.ObservableSource<? extends io.reactivex.ObservableSource<? extends T>> r3, int r4) {
            java.lang.String r0 = "sources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "bufferSize"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r4, r0)
            io.reactivex.internal.operators.observable.ObservableSwitchMap r0 = new io.reactivex.internal.operators.observable.ObservableSwitchMap
            io.reactivex.functions.Function r1 = io.reactivex.internal.functions.Functions.identity()
            r2 = 0
            r0.<init>(r3, r1, r4, r2)
            io.reactivex.Observable r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> switchOnNextDelayError(io.reactivex.ObservableSource<? extends io.reactivex.ObservableSource<? extends T>> r1) {
            int r0 = bufferSize()
            io.reactivex.Observable r1 = switchOnNextDelayError(r1, r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> switchOnNextDelayError(io.reactivex.ObservableSource<? extends io.reactivex.ObservableSource<? extends T>> r3, int r4) {
            java.lang.String r0 = "sources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "prefetch"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r4, r0)
            io.reactivex.internal.operators.observable.ObservableSwitchMap r0 = new io.reactivex.internal.operators.observable.ObservableSwitchMap
            io.reactivex.functions.Function r1 = io.reactivex.internal.functions.Functions.identity()
            r2 = 1
            r0.<init>(r3, r1, r4, r2)
            io.reactivex.Observable r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r3
    }

    private io.reactivex.Observable<T> timeout0(long r9, java.util.concurrent.TimeUnit r11, io.reactivex.ObservableSource<? extends T> r12, io.reactivex.Scheduler r13) {
            r8 = this;
            java.lang.String r0 = "timeUnit is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r11, r0)
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r13, r0)
            io.reactivex.internal.operators.observable.ObservableTimeoutTimed r0 = new io.reactivex.internal.operators.observable.ObservableTimeoutTimed
            r1 = r0
            r2 = r8
            r3 = r9
            r5 = r11
            r6 = r13
            r7 = r12
            r1.<init>(r2, r3, r5, r6, r7)
            io.reactivex.Observable r9 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r9
    }

    private <U, V> io.reactivex.Observable<T> timeout0(io.reactivex.ObservableSource<U> r2, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<V>> r3, io.reactivex.ObservableSource<? extends T> r4) {
            r1 = this;
            java.lang.String r0 = "itemTimeoutIndicator is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.observable.ObservableTimeout r0 = new io.reactivex.internal.operators.observable.ObservableTimeout
            r0.<init>(r1, r2, r3, r4)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.CheckReturnValue
    public static io.reactivex.Observable<java.lang.Long> timer(long r1, java.util.concurrent.TimeUnit r3) {
            io.reactivex.Scheduler r0 = io.reactivex.schedulers.Schedulers.computation()
            io.reactivex.Observable r1 = timer(r1, r3, r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public static io.reactivex.Observable<java.lang.Long> timer(long r3, java.util.concurrent.TimeUnit r5, io.reactivex.Scheduler r6) {
            java.lang.String r0 = "unit is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r0)
            io.reactivex.internal.operators.observable.ObservableTimer r0 = new io.reactivex.internal.operators.observable.ObservableTimer
            r1 = 0
            long r3 = java.lang.Math.max(r3, r1)
            r0.<init>(r3, r5, r6)
            io.reactivex.Observable r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> unsafeCreate(io.reactivex.ObservableSource<T> r1) {
            java.lang.String r0 = "source is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            java.lang.String r0 = "onSubscribe is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            boolean r0 = r1 instanceof io.reactivex.Observable
            if (r0 != 0) goto L18
            io.reactivex.internal.operators.observable.ObservableFromUnsafeSource r0 = new io.reactivex.internal.operators.observable.ObservableFromUnsafeSource
            r0.<init>(r1)
            io.reactivex.Observable r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
        L18:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "unsafeCreate(Observable) should be upgraded"
            r1.<init>(r0)
            throw r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T, D> io.reactivex.Observable<T> using(java.util.concurrent.Callable<? extends D> r1, io.reactivex.functions.Function<? super D, ? extends io.reactivex.ObservableSource<? extends T>> r2, io.reactivex.functions.Consumer<? super D> r3) {
            r0 = 1
            io.reactivex.Observable r1 = using(r1, r2, r3, r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T, D> io.reactivex.Observable<T> using(java.util.concurrent.Callable<? extends D> r1, io.reactivex.functions.Function<? super D, ? extends io.reactivex.ObservableSource<? extends T>> r2, io.reactivex.functions.Consumer<? super D> r3, boolean r4) {
            java.lang.String r0 = "resourceSupplier is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            java.lang.String r0 = "sourceSupplier is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "disposer is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.observable.ObservableUsing r0 = new io.reactivex.internal.operators.observable.ObservableUsing
            r0.<init>(r1, r2, r3, r4)
            io.reactivex.Observable r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Observable<T> wrap(io.reactivex.ObservableSource<T> r1) {
            java.lang.String r0 = "source is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            boolean r0 = r1 instanceof io.reactivex.Observable
            if (r0 == 0) goto L10
            io.reactivex.Observable r1 = (io.reactivex.Observable) r1
            io.reactivex.Observable r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r1)
            return r1
        L10:
            io.reactivex.internal.operators.observable.ObservableFromUnsafeSource r0 = new io.reactivex.internal.operators.observable.ObservableFromUnsafeSource
            r0.<init>(r1)
            io.reactivex.Observable r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> io.reactivex.Observable<R> zip(io.reactivex.ObservableSource<? extends T1> r3, io.reactivex.ObservableSource<? extends T2> r4, io.reactivex.ObservableSource<? extends T3> r5, io.reactivex.ObservableSource<? extends T4> r6, io.reactivex.ObservableSource<? extends T5> r7, io.reactivex.ObservableSource<? extends T6> r8, io.reactivex.ObservableSource<? extends T7> r9, io.reactivex.ObservableSource<? extends T8> r10, io.reactivex.ObservableSource<? extends T9> r11, io.reactivex.functions.Function9<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> r12) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            java.lang.String r0 = "source3 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            java.lang.String r0 = "source4 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r0)
            java.lang.String r0 = "source5 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r0)
            java.lang.String r0 = "source6 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r8, r0)
            java.lang.String r0 = "source7 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r9, r0)
            java.lang.String r0 = "source8 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r10, r0)
            java.lang.String r0 = "source9 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r11, r0)
            io.reactivex.functions.Function r12 = io.reactivex.internal.functions.Functions.toFunction(r12)
            int r0 = bufferSize()
            r1 = 9
            io.reactivex.ObservableSource[] r1 = new io.reactivex.ObservableSource[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r3 = 2
            r1[r3] = r5
            r3 = 3
            r1[r3] = r6
            r3 = 4
            r1[r3] = r7
            r3 = 5
            r1[r3] = r8
            r3 = 6
            r1[r3] = r9
            r3 = 7
            r1[r3] = r10
            r3 = 8
            r1[r3] = r11
            io.reactivex.Observable r3 = zipArray(r12, r2, r0, r1)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> io.reactivex.Observable<R> zip(io.reactivex.ObservableSource<? extends T1> r3, io.reactivex.ObservableSource<? extends T2> r4, io.reactivex.ObservableSource<? extends T3> r5, io.reactivex.ObservableSource<? extends T4> r6, io.reactivex.ObservableSource<? extends T5> r7, io.reactivex.ObservableSource<? extends T6> r8, io.reactivex.ObservableSource<? extends T7> r9, io.reactivex.ObservableSource<? extends T8> r10, io.reactivex.functions.Function8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> r11) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            java.lang.String r0 = "source3 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            java.lang.String r0 = "source4 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r0)
            java.lang.String r0 = "source5 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r0)
            java.lang.String r0 = "source6 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r8, r0)
            java.lang.String r0 = "source7 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r9, r0)
            java.lang.String r0 = "source8 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r10, r0)
            io.reactivex.functions.Function r11 = io.reactivex.internal.functions.Functions.toFunction(r11)
            int r0 = bufferSize()
            r1 = 8
            io.reactivex.ObservableSource[] r1 = new io.reactivex.ObservableSource[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r3 = 2
            r1[r3] = r5
            r3 = 3
            r1[r3] = r6
            r3 = 4
            r1[r3] = r7
            r3 = 5
            r1[r3] = r8
            r3 = 6
            r1[r3] = r9
            r3 = 7
            r1[r3] = r10
            io.reactivex.Observable r3 = zipArray(r11, r2, r0, r1)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T1, T2, T3, T4, T5, T6, T7, R> io.reactivex.Observable<R> zip(io.reactivex.ObservableSource<? extends T1> r3, io.reactivex.ObservableSource<? extends T2> r4, io.reactivex.ObservableSource<? extends T3> r5, io.reactivex.ObservableSource<? extends T4> r6, io.reactivex.ObservableSource<? extends T5> r7, io.reactivex.ObservableSource<? extends T6> r8, io.reactivex.ObservableSource<? extends T7> r9, io.reactivex.functions.Function7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> r10) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            java.lang.String r0 = "source3 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            java.lang.String r0 = "source4 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r0)
            java.lang.String r0 = "source5 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r0)
            java.lang.String r0 = "source6 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r8, r0)
            java.lang.String r0 = "source7 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r9, r0)
            io.reactivex.functions.Function r10 = io.reactivex.internal.functions.Functions.toFunction(r10)
            int r0 = bufferSize()
            r1 = 7
            io.reactivex.ObservableSource[] r1 = new io.reactivex.ObservableSource[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r3 = 2
            r1[r3] = r5
            r3 = 3
            r1[r3] = r6
            r3 = 4
            r1[r3] = r7
            r3 = 5
            r1[r3] = r8
            r3 = 6
            r1[r3] = r9
            io.reactivex.Observable r3 = zipArray(r10, r2, r0, r1)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T1, T2, T3, T4, T5, T6, R> io.reactivex.Observable<R> zip(io.reactivex.ObservableSource<? extends T1> r3, io.reactivex.ObservableSource<? extends T2> r4, io.reactivex.ObservableSource<? extends T3> r5, io.reactivex.ObservableSource<? extends T4> r6, io.reactivex.ObservableSource<? extends T5> r7, io.reactivex.ObservableSource<? extends T6> r8, io.reactivex.functions.Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> r9) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            java.lang.String r0 = "source3 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            java.lang.String r0 = "source4 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r0)
            java.lang.String r0 = "source5 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r0)
            java.lang.String r0 = "source6 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r8, r0)
            io.reactivex.functions.Function r9 = io.reactivex.internal.functions.Functions.toFunction(r9)
            int r0 = bufferSize()
            r1 = 6
            io.reactivex.ObservableSource[] r1 = new io.reactivex.ObservableSource[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r3 = 2
            r1[r3] = r5
            r3 = 3
            r1[r3] = r6
            r3 = 4
            r1[r3] = r7
            r3 = 5
            r1[r3] = r8
            io.reactivex.Observable r3 = zipArray(r9, r2, r0, r1)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T1, T2, T3, T4, T5, R> io.reactivex.Observable<R> zip(io.reactivex.ObservableSource<? extends T1> r3, io.reactivex.ObservableSource<? extends T2> r4, io.reactivex.ObservableSource<? extends T3> r5, io.reactivex.ObservableSource<? extends T4> r6, io.reactivex.ObservableSource<? extends T5> r7, io.reactivex.functions.Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> r8) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            java.lang.String r0 = "source3 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            java.lang.String r0 = "source4 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r0)
            java.lang.String r0 = "source5 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r0)
            io.reactivex.functions.Function r8 = io.reactivex.internal.functions.Functions.toFunction(r8)
            int r0 = bufferSize()
            r1 = 5
            io.reactivex.ObservableSource[] r1 = new io.reactivex.ObservableSource[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r3 = 2
            r1[r3] = r5
            r3 = 3
            r1[r3] = r6
            r3 = 4
            r1[r3] = r7
            io.reactivex.Observable r3 = zipArray(r8, r2, r0, r1)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T1, T2, T3, T4, R> io.reactivex.Observable<R> zip(io.reactivex.ObservableSource<? extends T1> r3, io.reactivex.ObservableSource<? extends T2> r4, io.reactivex.ObservableSource<? extends T3> r5, io.reactivex.ObservableSource<? extends T4> r6, io.reactivex.functions.Function4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> r7) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            java.lang.String r0 = "source3 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            java.lang.String r0 = "source4 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r0)
            io.reactivex.functions.Function r7 = io.reactivex.internal.functions.Functions.toFunction(r7)
            int r0 = bufferSize()
            r1 = 4
            io.reactivex.ObservableSource[] r1 = new io.reactivex.ObservableSource[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r3 = 2
            r1[r3] = r5
            r3 = 3
            r1[r3] = r6
            io.reactivex.Observable r3 = zipArray(r7, r2, r0, r1)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T1, T2, T3, R> io.reactivex.Observable<R> zip(io.reactivex.ObservableSource<? extends T1> r3, io.reactivex.ObservableSource<? extends T2> r4, io.reactivex.ObservableSource<? extends T3> r5, io.reactivex.functions.Function3<? super T1, ? super T2, ? super T3, ? extends R> r6) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            java.lang.String r0 = "source3 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            io.reactivex.functions.Function r6 = io.reactivex.internal.functions.Functions.toFunction(r6)
            int r0 = bufferSize()
            r1 = 3
            io.reactivex.ObservableSource[] r1 = new io.reactivex.ObservableSource[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r3 = 2
            r1[r3] = r5
            io.reactivex.Observable r3 = zipArray(r6, r2, r0, r1)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T1, T2, R> io.reactivex.Observable<R> zip(io.reactivex.ObservableSource<? extends T1> r3, io.reactivex.ObservableSource<? extends T2> r4, io.reactivex.functions.BiFunction<? super T1, ? super T2, ? extends R> r5) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            io.reactivex.functions.Function r5 = io.reactivex.internal.functions.Functions.toFunction(r5)
            int r0 = bufferSize()
            r1 = 2
            io.reactivex.ObservableSource[] r1 = new io.reactivex.ObservableSource[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            io.reactivex.Observable r3 = zipArray(r5, r2, r0, r1)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T1, T2, R> io.reactivex.Observable<R> zip(io.reactivex.ObservableSource<? extends T1> r3, io.reactivex.ObservableSource<? extends T2> r4, io.reactivex.functions.BiFunction<? super T1, ? super T2, ? extends R> r5, boolean r6) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            io.reactivex.functions.Function r5 = io.reactivex.internal.functions.Functions.toFunction(r5)
            int r0 = bufferSize()
            r1 = 2
            io.reactivex.ObservableSource[] r1 = new io.reactivex.ObservableSource[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            io.reactivex.Observable r3 = zipArray(r5, r6, r0, r1)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T1, T2, R> io.reactivex.Observable<R> zip(io.reactivex.ObservableSource<? extends T1> r2, io.reactivex.ObservableSource<? extends T2> r3, io.reactivex.functions.BiFunction<? super T1, ? super T2, ? extends R> r4, boolean r5, int r6) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.functions.Function r4 = io.reactivex.internal.functions.Functions.toFunction(r4)
            r0 = 2
            io.reactivex.ObservableSource[] r0 = new io.reactivex.ObservableSource[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            io.reactivex.Observable r2 = zipArray(r4, r5, r6, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T, R> io.reactivex.Observable<R> zip(io.reactivex.ObservableSource<? extends io.reactivex.ObservableSource<? extends T>> r2, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r3) {
            java.lang.String r0 = "zipper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "sources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.observable.ObservableToList r0 = new io.reactivex.internal.operators.observable.ObservableToList
            r1 = 16
            r0.<init>(r2, r1)
            io.reactivex.functions.Function r2 = io.reactivex.internal.operators.observable.ObservableInternalHelper.zipIterable(r3)
            io.reactivex.Observable r2 = r0.flatMap(r2)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T, R> io.reactivex.Observable<R> zip(java.lang.Iterable<? extends io.reactivex.ObservableSource<? extends T>> r7, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r8) {
            java.lang.String r0 = "zipper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r8, r0)
            java.lang.String r0 = "sources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r0)
            io.reactivex.internal.operators.observable.ObservableZip r0 = new io.reactivex.internal.operators.observable.ObservableZip
            r2 = 0
            int r5 = bufferSize()
            r6 = 0
            r1 = r0
            r3 = r7
            r4 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            io.reactivex.Observable r7 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T, R> io.reactivex.Observable<R> zipArray(io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r7, boolean r8, int r9, io.reactivex.ObservableSource<? extends T>... r10) {
            int r0 = r10.length
            if (r0 != 0) goto L8
            io.reactivex.Observable r7 = empty()
            return r7
        L8:
            java.lang.String r0 = "zipper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r0)
            java.lang.String r0 = "bufferSize"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r9, r0)
            io.reactivex.internal.operators.observable.ObservableZip r0 = new io.reactivex.internal.operators.observable.ObservableZip
            r3 = 0
            r1 = r0
            r2 = r10
            r4 = r7
            r5 = r9
            r6 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            io.reactivex.Observable r7 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public static <T, R> io.reactivex.Observable<R> zipIterable(java.lang.Iterable<? extends io.reactivex.ObservableSource<? extends T>> r7, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r8, boolean r9, int r10) {
            java.lang.String r0 = "zipper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r8, r0)
            java.lang.String r0 = "sources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r0)
            java.lang.String r0 = "bufferSize"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r10, r0)
            io.reactivex.internal.operators.observable.ObservableZip r0 = new io.reactivex.internal.operators.observable.ObservableZip
            r2 = 0
            r1 = r0
            r3 = r7
            r4 = r8
            r5 = r10
            r6 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            io.reactivex.Observable r7 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<java.lang.Boolean> all(io.reactivex.functions.Predicate<? super T> r2) {
            r1 = this;
            java.lang.String r0 = "predicate is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.observable.ObservableAllSingle r0 = new io.reactivex.internal.operators.observable.ObservableAllSingle
            r0.<init>(r1, r2)
            io.reactivex.Single r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> ambWith(io.reactivex.ObservableSource<? extends T> r3) {
            r2 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            r0 = 2
            io.reactivex.ObservableSource[] r0 = new io.reactivex.ObservableSource[r0]
            r1 = 0
            r0[r1] = r2
            r1 = 1
            r0[r1] = r3
            io.reactivex.Observable r3 = ambArray(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<java.lang.Boolean> any(io.reactivex.functions.Predicate<? super T> r2) {
            r1 = this;
            java.lang.String r0 = "predicate is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.observable.ObservableAnySingle r0 = new io.reactivex.internal.operators.observable.ObservableAnySingle
            r0.<init>(r1, r2)
            io.reactivex.Single r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    /* renamed from: as */
    public final <R> R m47as(io.reactivex.ObservableConverter<T, ? extends R> r2) {
            r1 = this;
            java.lang.String r0 = "converter is null"
            java.lang.Object r2 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.ObservableConverter r2 = (io.reactivex.ObservableConverter) r2
            java.lang.Object r2 = r2.apply(r1)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final T blockingFirst() {
            r1 = this;
            io.reactivex.internal.observers.BlockingFirstObserver r0 = new io.reactivex.internal.observers.BlockingFirstObserver
            r0.<init>()
            r1.subscribe(r0)
            java.lang.Object r0 = r0.blockingGet()
            if (r0 == 0) goto Lf
            return r0
        Lf:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final T blockingFirst(T r2) {
            r1 = this;
            io.reactivex.internal.observers.BlockingFirstObserver r0 = new io.reactivex.internal.observers.BlockingFirstObserver
            r0.<init>()
            r1.subscribe(r0)
            java.lang.Object r0 = r0.blockingGet()
            if (r0 == 0) goto Lf
            r2 = r0
        Lf:
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    public final void blockingForEach(io.reactivex.functions.Consumer<? super T> r3) {
            r2 = this;
            java.lang.Iterable r0 = r2.blockingIterable()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L16
            r3.accept(r1)     // Catch: java.lang.Throwable -> L16
            goto L8
        L16:
            r3 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
            io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
            r0.dispose()
            java.lang.RuntimeException r3 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r3)
            throw r3
        L24:
            return
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final java.lang.Iterable<T> blockingIterable() {
            r1 = this;
            int r0 = bufferSize()
            java.lang.Iterable r0 = r1.blockingIterable(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final java.lang.Iterable<T> blockingIterable(int r2) {
            r1 = this;
            java.lang.String r0 = "bufferSize"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r2, r0)
            io.reactivex.internal.operators.observable.BlockingObservableIterable r0 = new io.reactivex.internal.operators.observable.BlockingObservableIterable
            r0.<init>(r1, r2)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final T blockingLast() {
            r1 = this;
            io.reactivex.internal.observers.BlockingLastObserver r0 = new io.reactivex.internal.observers.BlockingLastObserver
            r0.<init>()
            r1.subscribe(r0)
            java.lang.Object r0 = r0.blockingGet()
            if (r0 == 0) goto Lf
            return r0
        Lf:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final T blockingLast(T r2) {
            r1 = this;
            io.reactivex.internal.observers.BlockingLastObserver r0 = new io.reactivex.internal.observers.BlockingLastObserver
            r0.<init>()
            r1.subscribe(r0)
            java.lang.Object r0 = r0.blockingGet()
            if (r0 == 0) goto Lf
            r2 = r0
        Lf:
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final java.lang.Iterable<T> blockingLatest() {
            r1 = this;
            io.reactivex.internal.operators.observable.BlockingObservableLatest r0 = new io.reactivex.internal.operators.observable.BlockingObservableLatest
            r0.<init>(r1)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final java.lang.Iterable<T> blockingMostRecent(T r2) {
            r1 = this;
            io.reactivex.internal.operators.observable.BlockingObservableMostRecent r0 = new io.reactivex.internal.operators.observable.BlockingObservableMostRecent
            r0.<init>(r1, r2)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final java.lang.Iterable<T> blockingNext() {
            r1 = this;
            io.reactivex.internal.operators.observable.BlockingObservableNext r0 = new io.reactivex.internal.operators.observable.BlockingObservableNext
            r0.<init>(r1)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final T blockingSingle() {
            r1 = this;
            io.reactivex.Maybe r0 = r1.singleElement()
            java.lang.Object r0 = r0.blockingGet()
            if (r0 == 0) goto Lb
            return r0
        Lb:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final T blockingSingle(T r1) {
            r0 = this;
            io.reactivex.Single r1 = r0.single(r1)
            java.lang.Object r1 = r1.blockingGet()
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    public final void blockingSubscribe() {
            r0 = this;
            io.reactivex.internal.operators.observable.ObservableBlockingSubscribe.subscribe(r0)
            return
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    public final void blockingSubscribe(io.reactivex.Observer<? super T> r1) {
            r0 = this;
            io.reactivex.internal.operators.observable.ObservableBlockingSubscribe.subscribe(r0, r1)
            return
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    public final void blockingSubscribe(io.reactivex.functions.Consumer<? super T> r3) {
            r2 = this;
            io.reactivex.functions.Consumer<java.lang.Throwable> r0 = io.reactivex.internal.functions.Functions.ON_ERROR_MISSING
            io.reactivex.functions.Action r1 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.internal.operators.observable.ObservableBlockingSubscribe.subscribe(r2, r3, r0, r1)
            return
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    public final void blockingSubscribe(io.reactivex.functions.Consumer<? super T> r2, io.reactivex.functions.Consumer<? super java.lang.Throwable> r3) {
            r1 = this;
            io.reactivex.functions.Action r0 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.internal.operators.observable.ObservableBlockingSubscribe.subscribe(r1, r2, r3, r0)
            return
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    public final void blockingSubscribe(io.reactivex.functions.Consumer<? super T> r1, io.reactivex.functions.Consumer<? super java.lang.Throwable> r2, io.reactivex.functions.Action r3) {
            r0 = this;
            io.reactivex.internal.operators.observable.ObservableBlockingSubscribe.subscribe(r0, r1, r2, r3)
            return
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<java.util.List<T>> buffer(int r1) {
            r0 = this;
            io.reactivex.Observable r1 = r0.buffer(r1, r1)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<java.util.List<T>> buffer(int r2, int r3) {
            r1 = this;
            java.util.concurrent.Callable r0 = io.reactivex.internal.util.ArrayListSupplier.asCallable()
            io.reactivex.Observable r2 = r1.buffer(r2, r3, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <U extends java.util.Collection<? super T>> io.reactivex.Observable<U> buffer(int r2, int r3, java.util.concurrent.Callable<U> r4) {
            r1 = this;
            java.lang.String r0 = "count"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r2, r0)
            java.lang.String r0 = "skip"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r3, r0)
            java.lang.String r0 = "bufferSupplier is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            io.reactivex.internal.operators.observable.ObservableBuffer r0 = new io.reactivex.internal.operators.observable.ObservableBuffer
            r0.<init>(r1, r2, r3, r4)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <U extends java.util.Collection<? super T>> io.reactivex.Observable<U> buffer(int r1, java.util.concurrent.Callable<U> r2) {
            r0 = this;
            io.reactivex.Observable r1 = r0.buffer(r1, r1, r2)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<java.util.List<T>> buffer(long r9, long r11, java.util.concurrent.TimeUnit r13) {
            r8 = this;
            io.reactivex.Scheduler r6 = io.reactivex.schedulers.Schedulers.computation()
            java.util.concurrent.Callable r7 = io.reactivex.internal.util.ArrayListSupplier.asCallable()
            r0 = r8
            r1 = r9
            r3 = r11
            r5 = r13
            io.reactivex.Observable r9 = r0.buffer(r1, r3, r5, r6, r7)
            return r9
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<java.util.List<T>> buffer(long r9, long r11, java.util.concurrent.TimeUnit r13, io.reactivex.Scheduler r14) {
            r8 = this;
            java.util.concurrent.Callable r7 = io.reactivex.internal.util.ArrayListSupplier.asCallable()
            r0 = r8
            r1 = r9
            r3 = r11
            r5 = r13
            r6 = r14
            io.reactivex.Observable r9 = r0.buffer(r1, r3, r5, r6, r7)
            return r9
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final <U extends java.util.Collection<? super T>> io.reactivex.Observable<U> buffer(long r13, long r15, java.util.concurrent.TimeUnit r17, io.reactivex.Scheduler r18, java.util.concurrent.Callable<U> r19) {
            r12 = this;
            java.lang.String r0 = "unit is null"
            r7 = r17
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r0)
            java.lang.String r0 = "scheduler is null"
            r8 = r18
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r8, r0)
            java.lang.String r0 = "bufferSupplier is null"
            r9 = r19
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r9, r0)
            io.reactivex.internal.operators.observable.ObservableBufferTimed r0 = new io.reactivex.internal.operators.observable.ObservableBufferTimed
            r10 = 2147483647(0x7fffffff, float:NaN)
            r11 = 0
            r1 = r0
            r2 = r12
            r3 = r13
            r5 = r15
            r1.<init>(r2, r3, r5, r7, r8, r9, r10, r11)
            io.reactivex.Observable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<java.util.List<T>> buffer(long r7, java.util.concurrent.TimeUnit r9) {
            r6 = this;
            io.reactivex.Scheduler r4 = io.reactivex.schedulers.Schedulers.computation()
            r5 = 2147483647(0x7fffffff, float:NaN)
            r0 = r6
            r1 = r7
            r3 = r9
            io.reactivex.Observable r7 = r0.buffer(r1, r3, r4, r5)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<java.util.List<T>> buffer(long r7, java.util.concurrent.TimeUnit r9, int r10) {
            r6 = this;
            io.reactivex.Scheduler r4 = io.reactivex.schedulers.Schedulers.computation()
            r0 = r6
            r1 = r7
            r3 = r9
            r5 = r10
            io.reactivex.Observable r7 = r0.buffer(r1, r3, r4, r5)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<java.util.List<T>> buffer(long r9, java.util.concurrent.TimeUnit r11, io.reactivex.Scheduler r12) {
            r8 = this;
            r5 = 2147483647(0x7fffffff, float:NaN)
            java.util.concurrent.Callable r6 = io.reactivex.internal.util.ArrayListSupplier.asCallable()
            r7 = 0
            r0 = r8
            r1 = r9
            r3 = r11
            r4 = r12
            io.reactivex.Observable r9 = r0.buffer(r1, r3, r4, r5, r6, r7)
            return r9
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<java.util.List<T>> buffer(long r9, java.util.concurrent.TimeUnit r11, io.reactivex.Scheduler r12, int r13) {
            r8 = this;
            java.util.concurrent.Callable r6 = io.reactivex.internal.util.ArrayListSupplier.asCallable()
            r7 = 0
            r0 = r8
            r1 = r9
            r3 = r11
            r4 = r12
            r5 = r13
            io.reactivex.Observable r9 = r0.buffer(r1, r3, r4, r5, r6, r7)
            return r9
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final <U extends java.util.Collection<? super T>> io.reactivex.Observable<U> buffer(long r13, java.util.concurrent.TimeUnit r15, io.reactivex.Scheduler r16, int r17, java.util.concurrent.Callable<U> r18, boolean r19) {
            r12 = this;
            java.lang.String r0 = "unit is null"
            r7 = r15
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r15, r0)
            java.lang.String r0 = "scheduler is null"
            r8 = r16
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r8, r0)
            java.lang.String r0 = "bufferSupplier is null"
            r9 = r18
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r9, r0)
            java.lang.String r0 = "count"
            r10 = r17
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r10, r0)
            io.reactivex.internal.operators.observable.ObservableBufferTimed r0 = new io.reactivex.internal.operators.observable.ObservableBufferTimed
            r1 = r0
            r2 = r12
            r3 = r13
            r5 = r13
            r11 = r19
            r1.<init>(r2, r3, r5, r7, r8, r9, r10, r11)
            io.reactivex.Observable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <B> io.reactivex.Observable<java.util.List<T>> buffer(io.reactivex.ObservableSource<B> r2) {
            r1 = this;
            java.util.concurrent.Callable r0 = io.reactivex.internal.util.ArrayListSupplier.asCallable()
            io.reactivex.Observable r2 = r1.buffer(r2, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <B> io.reactivex.Observable<java.util.List<T>> buffer(io.reactivex.ObservableSource<B> r2, int r3) {
            r1 = this;
            java.lang.String r0 = "initialCapacity"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r3, r0)
            java.util.concurrent.Callable r3 = io.reactivex.internal.functions.Functions.createArrayList(r3)
            io.reactivex.Observable r2 = r1.buffer(r2, r3)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <TOpening, TClosing> io.reactivex.Observable<java.util.List<T>> buffer(io.reactivex.ObservableSource<? extends TOpening> r2, io.reactivex.functions.Function<? super TOpening, ? extends io.reactivex.ObservableSource<? extends TClosing>> r3) {
            r1 = this;
            java.util.concurrent.Callable r0 = io.reactivex.internal.util.ArrayListSupplier.asCallable()
            io.reactivex.Observable r2 = r1.buffer(r2, r3, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <TOpening, TClosing, U extends java.util.Collection<? super T>> io.reactivex.Observable<U> buffer(io.reactivex.ObservableSource<? extends TOpening> r2, io.reactivex.functions.Function<? super TOpening, ? extends io.reactivex.ObservableSource<? extends TClosing>> r3, java.util.concurrent.Callable<U> r4) {
            r1 = this;
            java.lang.String r0 = "openingIndicator is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "closingIndicator is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "bufferSupplier is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            io.reactivex.internal.operators.observable.ObservableBufferBoundary r0 = new io.reactivex.internal.operators.observable.ObservableBufferBoundary
            r0.<init>(r1, r2, r3, r4)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <B, U extends java.util.Collection<? super T>> io.reactivex.Observable<U> buffer(io.reactivex.ObservableSource<B> r2, java.util.concurrent.Callable<U> r3) {
            r1 = this;
            java.lang.String r0 = "boundary is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "bufferSupplier is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.observable.ObservableBufferExactBoundary r0 = new io.reactivex.internal.operators.observable.ObservableBufferExactBoundary
            r0.<init>(r1, r2, r3)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <B> io.reactivex.Observable<java.util.List<T>> buffer(java.util.concurrent.Callable<? extends io.reactivex.ObservableSource<B>> r2) {
            r1 = this;
            java.util.concurrent.Callable r0 = io.reactivex.internal.util.ArrayListSupplier.asCallable()
            io.reactivex.Observable r2 = r1.buffer(r2, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <B, U extends java.util.Collection<? super T>> io.reactivex.Observable<U> buffer(java.util.concurrent.Callable<? extends io.reactivex.ObservableSource<B>> r2, java.util.concurrent.Callable<U> r3) {
            r1 = this;
            java.lang.String r0 = "boundarySupplier is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "bufferSupplier is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.observable.ObservableBufferBoundarySupplier r0 = new io.reactivex.internal.operators.observable.ObservableBufferBoundarySupplier
            r0.<init>(r1, r2, r3)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> cache() {
            r1 = this;
            io.reactivex.Observable r0 = io.reactivex.internal.operators.observable.ObservableCache.from(r1)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> cacheWithInitialCapacity(int r1) {
            r0 = this;
            io.reactivex.Observable r1 = io.reactivex.internal.operators.observable.ObservableCache.from(r0, r1)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <U> io.reactivex.Observable<U> cast(java.lang.Class<U> r2) {
            r1 = this;
            java.lang.String r0 = "clazz is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.functions.Function r2 = io.reactivex.internal.functions.Functions.castFunction(r2)
            io.reactivex.Observable r2 = r1.map(r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <U> io.reactivex.Single<U> collect(java.util.concurrent.Callable<? extends U> r2, io.reactivex.functions.BiConsumer<? super U, ? super T> r3) {
            r1 = this;
            java.lang.String r0 = "initialValueSupplier is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "collector is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.observable.ObservableCollectSingle r0 = new io.reactivex.internal.operators.observable.ObservableCollectSingle
            r0.<init>(r1, r2, r3)
            io.reactivex.Single r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <U> io.reactivex.Single<U> collectInto(U r2, io.reactivex.functions.BiConsumer<? super U, ? super T> r3) {
            r1 = this;
            java.lang.String r0 = "initialValue is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.util.concurrent.Callable r2 = io.reactivex.internal.functions.Functions.justCallable(r2)
            io.reactivex.Single r2 = r1.collect(r2, r3)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Observable<R> compose(io.reactivex.ObservableTransformer<? super T, ? extends R> r2) {
            r1 = this;
            java.lang.String r0 = "composer is null"
            java.lang.Object r2 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.ObservableTransformer r2 = (io.reactivex.ObservableTransformer) r2
            io.reactivex.ObservableSource r2 = r2.apply(r1)
            io.reactivex.Observable r2 = wrap(r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Observable<R> concatMap(io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> r2) {
            r1 = this;
            r0 = 2
            io.reactivex.Observable r2 = r1.concatMap(r2, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Observable<R> concatMap(io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> r3, int r4) {
            r2 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "prefetch"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r4, r0)
            boolean r0 = r2 instanceof io.reactivex.internal.fuseable.ScalarCallable
            if (r0 == 0) goto L21
            r4 = r2
            io.reactivex.internal.fuseable.ScalarCallable r4 = (io.reactivex.internal.fuseable.ScalarCallable) r4
            java.lang.Object r4 = r4.call()
            if (r4 != 0) goto L1c
            io.reactivex.Observable r3 = empty()
            return r3
        L1c:
            io.reactivex.Observable r3 = io.reactivex.internal.operators.observable.ObservableScalarXMap.scalarXMap(r4, r3)
            return r3
        L21:
            io.reactivex.internal.operators.observable.ObservableConcatMap r0 = new io.reactivex.internal.operators.observable.ObservableConcatMap
            io.reactivex.internal.util.ErrorMode r1 = io.reactivex.internal.util.ErrorMode.IMMEDIATE
            r0.<init>(r2, r3, r4, r1)
            io.reactivex.Observable r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable concatMapCompletable(io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> r2) {
            r1 = this;
            r0 = 2
            io.reactivex.Completable r2 = r1.concatMapCompletable(r2, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable concatMapCompletable(io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> r3, int r4) {
            r2 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "capacityHint"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r4, r0)
            io.reactivex.internal.operators.mixed.ObservableConcatMapCompletable r0 = new io.reactivex.internal.operators.mixed.ObservableConcatMapCompletable
            io.reactivex.internal.util.ErrorMode r1 = io.reactivex.internal.util.ErrorMode.IMMEDIATE
            r0.<init>(r2, r3, r1, r4)
            io.reactivex.Completable r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable concatMapCompletableDelayError(io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> r3) {
            r2 = this;
            r0 = 1
            r1 = 2
            io.reactivex.Completable r3 = r2.concatMapCompletableDelayError(r3, r0, r1)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable concatMapCompletableDelayError(io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> r2, boolean r3) {
            r1 = this;
            r0 = 2
            io.reactivex.Completable r2 = r1.concatMapCompletableDelayError(r2, r3, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable concatMapCompletableDelayError(io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> r2, boolean r3, int r4) {
            r1 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "prefetch"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r4, r0)
            io.reactivex.internal.operators.mixed.ObservableConcatMapCompletable r0 = new io.reactivex.internal.operators.mixed.ObservableConcatMapCompletable
            if (r3 == 0) goto L11
            io.reactivex.internal.util.ErrorMode r3 = io.reactivex.internal.util.ErrorMode.END
            goto L13
        L11:
            io.reactivex.internal.util.ErrorMode r3 = io.reactivex.internal.util.ErrorMode.BOUNDARY
        L13:
            r0.<init>(r1, r2, r3, r4)
            io.reactivex.Completable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Observable<R> concatMapDelayError(io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> r3) {
            r2 = this;
            int r0 = bufferSize()
            r1 = 1
            io.reactivex.Observable r3 = r2.concatMapDelayError(r3, r0, r1)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Observable<R> concatMapDelayError(io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> r2, int r3, boolean r4) {
            r1 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "prefetch"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r3, r0)
            boolean r0 = r1 instanceof io.reactivex.internal.fuseable.ScalarCallable
            if (r0 == 0) goto L21
            r3 = r1
            io.reactivex.internal.fuseable.ScalarCallable r3 = (io.reactivex.internal.fuseable.ScalarCallable) r3
            java.lang.Object r3 = r3.call()
            if (r3 != 0) goto L1c
            io.reactivex.Observable r2 = empty()
            return r2
        L1c:
            io.reactivex.Observable r2 = io.reactivex.internal.operators.observable.ObservableScalarXMap.scalarXMap(r3, r2)
            return r2
        L21:
            io.reactivex.internal.operators.observable.ObservableConcatMap r0 = new io.reactivex.internal.operators.observable.ObservableConcatMap
            if (r4 == 0) goto L28
            io.reactivex.internal.util.ErrorMode r4 = io.reactivex.internal.util.ErrorMode.END
            goto L2a
        L28:
            io.reactivex.internal.util.ErrorMode r4 = io.reactivex.internal.util.ErrorMode.BOUNDARY
        L2a:
            r0.<init>(r1, r2, r3, r4)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Observable<R> concatMapEager(io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> r3) {
            r2 = this;
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r1 = bufferSize()
            io.reactivex.Observable r3 = r2.concatMapEager(r3, r0, r1)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Observable<R> concatMapEager(io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> r8, int r9, int r10) {
            r7 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r8, r0)
            java.lang.String r0 = "maxConcurrency"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r9, r0)
            java.lang.String r0 = "prefetch"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r10, r0)
            io.reactivex.internal.operators.observable.ObservableConcatMapEager r0 = new io.reactivex.internal.operators.observable.ObservableConcatMapEager
            io.reactivex.internal.util.ErrorMode r4 = io.reactivex.internal.util.ErrorMode.IMMEDIATE
            r1 = r0
            r2 = r7
            r3 = r8
            r5 = r9
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            io.reactivex.Observable r8 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r8
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Observable<R> concatMapEagerDelayError(io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> r8, int r9, int r10, boolean r11) {
            r7 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r8, r0)
            java.lang.String r0 = "maxConcurrency"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r9, r0)
            java.lang.String r0 = "prefetch"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r10, r0)
            io.reactivex.internal.operators.observable.ObservableConcatMapEager r0 = new io.reactivex.internal.operators.observable.ObservableConcatMapEager
            if (r11 == 0) goto L16
            io.reactivex.internal.util.ErrorMode r11 = io.reactivex.internal.util.ErrorMode.END
            goto L18
        L16:
            io.reactivex.internal.util.ErrorMode r11 = io.reactivex.internal.util.ErrorMode.BOUNDARY
        L18:
            r4 = r11
            r1 = r0
            r2 = r7
            r3 = r8
            r5 = r9
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            io.reactivex.Observable r8 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r8
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Observable<R> concatMapEagerDelayError(io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> r3, boolean r4) {
            r2 = this;
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r1 = bufferSize()
            io.reactivex.Observable r3 = r2.concatMapEagerDelayError(r3, r0, r1, r4)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <U> io.reactivex.Observable<U> concatMapIterable(io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends U>> r2) {
            r1 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.observable.ObservableFlattenIterable r0 = new io.reactivex.internal.operators.observable.ObservableFlattenIterable
            r0.<init>(r1, r2)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <U> io.reactivex.Observable<U> concatMapIterable(io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends U>> r2, int r3) {
            r1 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "prefetch"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r3, r0)
            io.reactivex.functions.Function r2 = io.reactivex.internal.operators.observable.ObservableInternalHelper.flatMapIntoIterable(r2)
            io.reactivex.Observable r2 = r1.concatMap(r2, r3)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Observable<R> concatMapMaybe(io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> r2) {
            r1 = this;
            r0 = 2
            io.reactivex.Observable r2 = r1.concatMapMaybe(r2, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Observable<R> concatMapMaybe(io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> r3, int r4) {
            r2 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "prefetch"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r4, r0)
            io.reactivex.internal.operators.mixed.ObservableConcatMapMaybe r0 = new io.reactivex.internal.operators.mixed.ObservableConcatMapMaybe
            io.reactivex.internal.util.ErrorMode r1 = io.reactivex.internal.util.ErrorMode.IMMEDIATE
            r0.<init>(r2, r3, r1, r4)
            io.reactivex.Observable r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Observable<R> concatMapMaybeDelayError(io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> r3) {
            r2 = this;
            r0 = 1
            r1 = 2
            io.reactivex.Observable r3 = r2.concatMapMaybeDelayError(r3, r0, r1)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Observable<R> concatMapMaybeDelayError(io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> r2, boolean r3) {
            r1 = this;
            r0 = 2
            io.reactivex.Observable r2 = r1.concatMapMaybeDelayError(r2, r3, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Observable<R> concatMapMaybeDelayError(io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> r2, boolean r3, int r4) {
            r1 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "prefetch"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r4, r0)
            io.reactivex.internal.operators.mixed.ObservableConcatMapMaybe r0 = new io.reactivex.internal.operators.mixed.ObservableConcatMapMaybe
            if (r3 == 0) goto L11
            io.reactivex.internal.util.ErrorMode r3 = io.reactivex.internal.util.ErrorMode.END
            goto L13
        L11:
            io.reactivex.internal.util.ErrorMode r3 = io.reactivex.internal.util.ErrorMode.BOUNDARY
        L13:
            r0.<init>(r1, r2, r3, r4)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Observable<R> concatMapSingle(io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> r2) {
            r1 = this;
            r0 = 2
            io.reactivex.Observable r2 = r1.concatMapSingle(r2, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Observable<R> concatMapSingle(io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> r3, int r4) {
            r2 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "prefetch"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r4, r0)
            io.reactivex.internal.operators.mixed.ObservableConcatMapSingle r0 = new io.reactivex.internal.operators.mixed.ObservableConcatMapSingle
            io.reactivex.internal.util.ErrorMode r1 = io.reactivex.internal.util.ErrorMode.IMMEDIATE
            r0.<init>(r2, r3, r1, r4)
            io.reactivex.Observable r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Observable<R> concatMapSingleDelayError(io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> r3) {
            r2 = this;
            r0 = 1
            r1 = 2
            io.reactivex.Observable r3 = r2.concatMapSingleDelayError(r3, r0, r1)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Observable<R> concatMapSingleDelayError(io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> r2, boolean r3) {
            r1 = this;
            r0 = 2
            io.reactivex.Observable r2 = r1.concatMapSingleDelayError(r2, r3, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Observable<R> concatMapSingleDelayError(io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> r2, boolean r3, int r4) {
            r1 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "prefetch"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r4, r0)
            io.reactivex.internal.operators.mixed.ObservableConcatMapSingle r0 = new io.reactivex.internal.operators.mixed.ObservableConcatMapSingle
            if (r3 == 0) goto L11
            io.reactivex.internal.util.ErrorMode r3 = io.reactivex.internal.util.ErrorMode.END
            goto L13
        L11:
            io.reactivex.internal.util.ErrorMode r3 = io.reactivex.internal.util.ErrorMode.BOUNDARY
        L13:
            r0.<init>(r1, r2, r3, r4)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> concatWith(io.reactivex.CompletableSource r2) {
            r1 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.observable.ObservableConcatWithCompletable r0 = new io.reactivex.internal.operators.observable.ObservableConcatWithCompletable
            r0.<init>(r1, r2)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> concatWith(io.reactivex.MaybeSource<? extends T> r2) {
            r1 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.observable.ObservableConcatWithMaybe r0 = new io.reactivex.internal.operators.observable.ObservableConcatWithMaybe
            r0.<init>(r1, r2)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> concatWith(io.reactivex.ObservableSource<? extends T> r2) {
            r1 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.Observable r2 = concat(r1, r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> concatWith(io.reactivex.SingleSource<? extends T> r2) {
            r1 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.observable.ObservableConcatWithSingle r0 = new io.reactivex.internal.operators.observable.ObservableConcatWithSingle
            r0.<init>(r1, r2)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<java.lang.Boolean> contains(java.lang.Object r2) {
            r1 = this;
            java.lang.String r0 = "element is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.functions.Predicate r2 = io.reactivex.internal.functions.Functions.equalsWith(r2)
            io.reactivex.Single r2 = r1.any(r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<java.lang.Long> count() {
            r1 = this;
            io.reactivex.internal.operators.observable.ObservableCountSingle r0 = new io.reactivex.internal.operators.observable.ObservableCountSingle
            r0.<init>(r1)
            io.reactivex.Single r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> debounce(long r2, java.util.concurrent.TimeUnit r4) {
            r1 = this;
            io.reactivex.Scheduler r0 = io.reactivex.schedulers.Schedulers.computation()
            io.reactivex.Observable r2 = r1.debounce(r2, r4, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> debounce(long r8, java.util.concurrent.TimeUnit r10, io.reactivex.Scheduler r11) {
            r7 = this;
            java.lang.String r0 = "unit is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r10, r0)
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r11, r0)
            io.reactivex.internal.operators.observable.ObservableDebounceTimed r0 = new io.reactivex.internal.operators.observable.ObservableDebounceTimed
            r1 = r0
            r2 = r7
            r3 = r8
            r5 = r10
            r6 = r11
            r1.<init>(r2, r3, r5, r6)
            io.reactivex.Observable r8 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r8
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <U> io.reactivex.Observable<T> debounce(io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<U>> r2) {
            r1 = this;
            java.lang.String r0 = "debounceSelector is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.observable.ObservableDebounce r0 = new io.reactivex.internal.operators.observable.ObservableDebounce
            r0.<init>(r1, r2)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> defaultIfEmpty(T r2) {
            r1 = this;
            java.lang.String r0 = "defaultItem is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.Observable r2 = just(r2)
            io.reactivex.Observable r2 = r1.switchIfEmpty(r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> delay(long r7, java.util.concurrent.TimeUnit r9) {
            r6 = this;
            io.reactivex.Scheduler r4 = io.reactivex.schedulers.Schedulers.computation()
            r5 = 0
            r0 = r6
            r1 = r7
            r3 = r9
            io.reactivex.Observable r7 = r0.delay(r1, r3, r4, r5)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> delay(long r7, java.util.concurrent.TimeUnit r9, io.reactivex.Scheduler r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r3 = r9
            r4 = r10
            io.reactivex.Observable r7 = r0.delay(r1, r3, r4, r5)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> delay(long r9, java.util.concurrent.TimeUnit r11, io.reactivex.Scheduler r12, boolean r13) {
            r8 = this;
            java.lang.String r0 = "unit is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r11, r0)
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r12, r0)
            io.reactivex.internal.operators.observable.ObservableDelay r0 = new io.reactivex.internal.operators.observable.ObservableDelay
            r1 = r0
            r2 = r8
            r3 = r9
            r5 = r11
            r6 = r12
            r7 = r13
            r1.<init>(r2, r3, r5, r6, r7)
            io.reactivex.Observable r9 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r9
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> delay(long r7, java.util.concurrent.TimeUnit r9, boolean r10) {
            r6 = this;
            io.reactivex.Scheduler r4 = io.reactivex.schedulers.Schedulers.computation()
            r0 = r6
            r1 = r7
            r3 = r9
            r5 = r10
            io.reactivex.Observable r7 = r0.delay(r1, r3, r4, r5)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <U, V> io.reactivex.Observable<T> delay(io.reactivex.ObservableSource<U> r1, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<V>> r2) {
            r0 = this;
            io.reactivex.Observable r1 = r0.delaySubscription(r1)
            io.reactivex.Observable r1 = r1.delay(r2)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <U> io.reactivex.Observable<T> delay(io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<U>> r2) {
            r1 = this;
            java.lang.String r0 = "itemDelay is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.functions.Function r2 = io.reactivex.internal.operators.observable.ObservableInternalHelper.itemDelay(r2)
            io.reactivex.Observable r2 = r1.flatMap(r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> delaySubscription(long r2, java.util.concurrent.TimeUnit r4) {
            r1 = this;
            io.reactivex.Scheduler r0 = io.reactivex.schedulers.Schedulers.computation()
            io.reactivex.Observable r2 = r1.delaySubscription(r2, r4, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> delaySubscription(long r1, java.util.concurrent.TimeUnit r3, io.reactivex.Scheduler r4) {
            r0 = this;
            io.reactivex.Observable r1 = timer(r1, r3, r4)
            io.reactivex.Observable r1 = r0.delaySubscription(r1)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <U> io.reactivex.Observable<T> delaySubscription(io.reactivex.ObservableSource<U> r2) {
            r1 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.observable.ObservableDelaySubscriptionOther r0 = new io.reactivex.internal.operators.observable.ObservableDelaySubscriptionOther
            r0.<init>(r1, r2)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <T2> io.reactivex.Observable<T2> dematerialize() {
            r1 = this;
            io.reactivex.internal.operators.observable.ObservableDematerialize r0 = new io.reactivex.internal.operators.observable.ObservableDematerialize
            r0.<init>(r1)
            io.reactivex.Observable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> distinct() {
            r2 = this;
            io.reactivex.functions.Function r0 = io.reactivex.internal.functions.Functions.identity()
            java.util.concurrent.Callable r1 = io.reactivex.internal.functions.Functions.createHashSet()
            io.reactivex.Observable r0 = r2.distinct(r0, r1)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <K> io.reactivex.Observable<T> distinct(io.reactivex.functions.Function<? super T, K> r2) {
            r1 = this;
            java.util.concurrent.Callable r0 = io.reactivex.internal.functions.Functions.createHashSet()
            io.reactivex.Observable r2 = r1.distinct(r2, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <K> io.reactivex.Observable<T> distinct(io.reactivex.functions.Function<? super T, K> r2, java.util.concurrent.Callable<? extends java.util.Collection<? super K>> r3) {
            r1 = this;
            java.lang.String r0 = "keySelector is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "collectionSupplier is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.observable.ObservableDistinct r0 = new io.reactivex.internal.operators.observable.ObservableDistinct
            r0.<init>(r1, r2, r3)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> distinctUntilChanged() {
            r1 = this;
            io.reactivex.functions.Function r0 = io.reactivex.internal.functions.Functions.identity()
            io.reactivex.Observable r0 = r1.distinctUntilChanged(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> distinctUntilChanged(io.reactivex.functions.BiPredicate<? super T, ? super T> r3) {
            r2 = this;
            java.lang.String r0 = "comparer is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.observable.ObservableDistinctUntilChanged r0 = new io.reactivex.internal.operators.observable.ObservableDistinctUntilChanged
            io.reactivex.functions.Function r1 = io.reactivex.internal.functions.Functions.identity()
            r0.<init>(r2, r1, r3)
            io.reactivex.Observable r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <K> io.reactivex.Observable<T> distinctUntilChanged(io.reactivex.functions.Function<? super T, K> r3) {
            r2 = this;
            java.lang.String r0 = "keySelector is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.observable.ObservableDistinctUntilChanged r0 = new io.reactivex.internal.operators.observable.ObservableDistinctUntilChanged
            io.reactivex.functions.BiPredicate r1 = io.reactivex.internal.functions.ObjectHelper.equalsPredicate()
            r0.<init>(r2, r3, r1)
            io.reactivex.Observable r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> doAfterNext(io.reactivex.functions.Consumer<? super T> r2) {
            r1 = this;
            java.lang.String r0 = "onAfterNext is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.observable.ObservableDoAfterNext r0 = new io.reactivex.internal.operators.observable.ObservableDoAfterNext
            r0.<init>(r1, r2)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> doAfterTerminate(io.reactivex.functions.Action r4) {
            r3 = this;
            java.lang.String r0 = "onFinally is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            io.reactivex.functions.Consumer r0 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Consumer r1 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Action r2 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.Observable r4 = r3.doOnEach(r0, r1, r2, r4)
            return r4
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> doFinally(io.reactivex.functions.Action r2) {
            r1 = this;
            java.lang.String r0 = "onFinally is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.observable.ObservableDoFinally r0 = new io.reactivex.internal.operators.observable.ObservableDoFinally
            r0.<init>(r1, r2)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> doOnComplete(io.reactivex.functions.Action r4) {
            r3 = this;
            io.reactivex.functions.Consumer r0 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Consumer r1 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Action r2 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.Observable r4 = r3.doOnEach(r0, r1, r4, r2)
            return r4
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> doOnDispose(io.reactivex.functions.Action r2) {
            r1 = this;
            io.reactivex.functions.Consumer r0 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.Observable r2 = r1.doOnLifecycle(r0, r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> doOnEach(io.reactivex.Observer<? super T> r4) {
            r3 = this;
            java.lang.String r0 = "observer is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            io.reactivex.functions.Consumer r0 = io.reactivex.internal.operators.observable.ObservableInternalHelper.observerOnNext(r4)
            io.reactivex.functions.Consumer r1 = io.reactivex.internal.operators.observable.ObservableInternalHelper.observerOnError(r4)
            io.reactivex.functions.Action r4 = io.reactivex.internal.operators.observable.ObservableInternalHelper.observerOnComplete(r4)
            io.reactivex.functions.Action r2 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.Observable r4 = r3.doOnEach(r0, r1, r4, r2)
            return r4
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> doOnEach(io.reactivex.functions.Consumer<? super io.reactivex.Notification<T>> r4) {
            r3 = this;
            java.lang.String r0 = "consumer is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            io.reactivex.functions.Consumer r0 = io.reactivex.internal.functions.Functions.notificationOnNext(r4)
            io.reactivex.functions.Consumer r1 = io.reactivex.internal.functions.Functions.notificationOnError(r4)
            io.reactivex.functions.Action r4 = io.reactivex.internal.functions.Functions.notificationOnComplete(r4)
            io.reactivex.functions.Action r2 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.Observable r4 = r3.doOnEach(r0, r1, r4, r2)
            return r4
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> doOnError(io.reactivex.functions.Consumer<? super java.lang.Throwable> r4) {
            r3 = this;
            io.reactivex.functions.Consumer r0 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Action r1 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.functions.Action r2 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.Observable r4 = r3.doOnEach(r0, r4, r1, r2)
            return r4
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> doOnLifecycle(io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> r2, io.reactivex.functions.Action r3) {
            r1 = this;
            java.lang.String r0 = "onSubscribe is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "onDispose is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.observable.ObservableDoOnLifecycle r0 = new io.reactivex.internal.operators.observable.ObservableDoOnLifecycle
            r0.<init>(r1, r2, r3)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> doOnNext(io.reactivex.functions.Consumer<? super T> r4) {
            r3 = this;
            io.reactivex.functions.Consumer r0 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Action r1 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.functions.Action r2 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.Observable r4 = r3.doOnEach(r4, r0, r1, r2)
            return r4
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> doOnSubscribe(io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> r2) {
            r1 = this;
            io.reactivex.functions.Action r0 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.Observable r2 = r1.doOnLifecycle(r2, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> doOnTerminate(io.reactivex.functions.Action r4) {
            r3 = this;
            java.lang.String r0 = "onTerminate is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            io.reactivex.functions.Consumer r0 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Consumer r1 = io.reactivex.internal.functions.Functions.actionConsumer(r4)
            io.reactivex.functions.Action r2 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.Observable r4 = r3.doOnEach(r0, r1, r4, r2)
            return r4
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Maybe<T> elementAt(long r4) {
            r3 = this;
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L10
            io.reactivex.internal.operators.observable.ObservableElementAtMaybe r0 = new io.reactivex.internal.operators.observable.ObservableElementAtMaybe
            r0.<init>(r3, r4)
            io.reactivex.Maybe r4 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r4
        L10:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "index >= 0 required but it was "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<T> elementAt(long r3, T r5) {
            r2 = this;
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L15
            java.lang.String r0 = "defaultItem is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            io.reactivex.internal.operators.observable.ObservableElementAtSingle r0 = new io.reactivex.internal.operators.observable.ObservableElementAtSingle
            r0.<init>(r2, r3, r5)
            io.reactivex.Single r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r3
        L15:
            java.lang.IndexOutOfBoundsException r5 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "index >= 0 required but it was "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            r5.<init>(r3)
            throw r5
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<T> elementAtOrError(long r4) {
            r3 = this;
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L11
            io.reactivex.internal.operators.observable.ObservableElementAtSingle r0 = new io.reactivex.internal.operators.observable.ObservableElementAtSingle
            r1 = 0
            r0.<init>(r3, r4, r1)
            io.reactivex.Single r4 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r4
        L11:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "index >= 0 required but it was "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> filter(io.reactivex.functions.Predicate<? super T> r2) {
            r1 = this;
            java.lang.String r0 = "predicate is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.observable.ObservableFilter r0 = new io.reactivex.internal.operators.observable.ObservableFilter
            r0.<init>(r1, r2)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<T> first(T r3) {
            r2 = this;
            r0 = 0
            io.reactivex.Single r3 = r2.elementAt(r0, r3)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Maybe<T> firstElement() {
            r2 = this;
            r0 = 0
            io.reactivex.Maybe r0 = r2.elementAt(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<T> firstOrError() {
            r2 = this;
            r0 = 0
            io.reactivex.Single r0 = r2.elementAtOrError(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Observable<R> flatMap(io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> r2) {
            r1 = this;
            r0 = 0
            io.reactivex.Observable r2 = r1.flatMap(r2, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Observable<R> flatMap(io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> r3, int r4) {
            r2 = this;
            r0 = 0
            int r1 = bufferSize()
            io.reactivex.Observable r3 = r2.flatMap(r3, r0, r4, r1)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <U, R> io.reactivex.Observable<R> flatMap(io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> r7, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> r8) {
            r6 = this;
            r3 = 0
            int r4 = bufferSize()
            int r5 = bufferSize()
            r0 = r6
            r1 = r7
            r2 = r8
            io.reactivex.Observable r7 = r0.flatMap(r1, r2, r3, r4, r5)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <U, R> io.reactivex.Observable<R> flatMap(io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> r7, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> r8, int r9) {
            r6 = this;
            r3 = 0
            int r5 = bufferSize()
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r9
            io.reactivex.Observable r7 = r0.flatMap(r1, r2, r3, r4, r5)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <U, R> io.reactivex.Observable<R> flatMap(io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> r7, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> r8, boolean r9) {
            r6 = this;
            int r4 = bufferSize()
            int r5 = bufferSize()
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            io.reactivex.Observable r7 = r0.flatMap(r1, r2, r3, r4, r5)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <U, R> io.reactivex.Observable<R> flatMap(io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> r7, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> r8, boolean r9, int r10) {
            r6 = this;
            int r5 = bufferSize()
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            io.reactivex.Observable r7 = r0.flatMap(r1, r2, r3, r4, r5)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <U, R> io.reactivex.Observable<R> flatMap(io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> r2, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> r3, boolean r4, int r5, int r6) {
            r1 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "combiner is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.functions.Function r2 = io.reactivex.internal.operators.observable.ObservableInternalHelper.flatMapWithCombiner(r2, r3)
            io.reactivex.Observable r2 = r1.flatMap(r2, r4, r5, r6)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Observable<R> flatMap(io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> r2, io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.ObservableSource<? extends R>> r3, java.util.concurrent.Callable<? extends io.reactivex.ObservableSource<? extends R>> r4) {
            r1 = this;
            java.lang.String r0 = "onNextMapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "onErrorMapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "onCompleteSupplier is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            io.reactivex.internal.operators.observable.ObservableMapNotification r0 = new io.reactivex.internal.operators.observable.ObservableMapNotification
            r0.<init>(r1, r2, r3, r4)
            io.reactivex.Observable r2 = merge(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Observable<R> flatMap(io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> r2, io.reactivex.functions.Function<java.lang.Throwable, ? extends io.reactivex.ObservableSource<? extends R>> r3, java.util.concurrent.Callable<? extends io.reactivex.ObservableSource<? extends R>> r4, int r5) {
            r1 = this;
            java.lang.String r0 = "onNextMapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "onErrorMapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "onCompleteSupplier is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            io.reactivex.internal.operators.observable.ObservableMapNotification r0 = new io.reactivex.internal.operators.observable.ObservableMapNotification
            r0.<init>(r1, r2, r3, r4)
            io.reactivex.Observable r2 = merge(r0, r5)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Observable<R> flatMap(io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> r2, boolean r3) {
            r1 = this;
            r0 = 2147483647(0x7fffffff, float:NaN)
            io.reactivex.Observable r2 = r1.flatMap(r2, r3, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Observable<R> flatMap(io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> r2, boolean r3, int r4) {
            r1 = this;
            int r0 = bufferSize()
            io.reactivex.Observable r2 = r1.flatMap(r2, r3, r4, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Observable<R> flatMap(io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> r8, boolean r9, int r10, int r11) {
            r7 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r8, r0)
            java.lang.String r0 = "maxConcurrency"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r10, r0)
            java.lang.String r0 = "bufferSize"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r11, r0)
            boolean r0 = r7 instanceof io.reactivex.internal.fuseable.ScalarCallable
            if (r0 == 0) goto L26
            r9 = r7
            io.reactivex.internal.fuseable.ScalarCallable r9 = (io.reactivex.internal.fuseable.ScalarCallable) r9
            java.lang.Object r9 = r9.call()
            if (r9 != 0) goto L21
            io.reactivex.Observable r8 = empty()
            return r8
        L21:
            io.reactivex.Observable r8 = io.reactivex.internal.operators.observable.ObservableScalarXMap.scalarXMap(r9, r8)
            return r8
        L26:
            io.reactivex.internal.operators.observable.ObservableFlatMap r6 = new io.reactivex.internal.operators.observable.ObservableFlatMap
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            io.reactivex.Observable r8 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r6)
            return r8
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable flatMapCompletable(io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> r2) {
            r1 = this;
            r0 = 0
            io.reactivex.Completable r2 = r1.flatMapCompletable(r2, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable flatMapCompletable(io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> r2, boolean r3) {
            r1 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.observable.ObservableFlatMapCompletableCompletable r0 = new io.reactivex.internal.operators.observable.ObservableFlatMapCompletableCompletable
            r0.<init>(r1, r2, r3)
            io.reactivex.Completable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <U> io.reactivex.Observable<U> flatMapIterable(io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends U>> r2) {
            r1 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.observable.ObservableFlattenIterable r0 = new io.reactivex.internal.operators.observable.ObservableFlattenIterable
            r0.<init>(r1, r2)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <U, V> io.reactivex.Observable<V> flatMapIterable(io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends U>> r8, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends V> r9) {
            r7 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r8, r0)
            java.lang.String r0 = "resultSelector is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r9, r0)
            io.reactivex.functions.Function r2 = io.reactivex.internal.operators.observable.ObservableInternalHelper.flatMapIntoIterable(r8)
            r4 = 0
            int r5 = bufferSize()
            int r6 = bufferSize()
            r1 = r7
            r3 = r9
            io.reactivex.Observable r8 = r1.flatMap(r2, r3, r4, r5, r6)
            return r8
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Observable<R> flatMapMaybe(io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> r2) {
            r1 = this;
            r0 = 0
            io.reactivex.Observable r2 = r1.flatMapMaybe(r2, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Observable<R> flatMapMaybe(io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> r2, boolean r3) {
            r1 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.observable.ObservableFlatMapMaybe r0 = new io.reactivex.internal.operators.observable.ObservableFlatMapMaybe
            r0.<init>(r1, r2, r3)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Observable<R> flatMapSingle(io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> r2) {
            r1 = this;
            r0 = 0
            io.reactivex.Observable r2 = r1.flatMapSingle(r2, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Observable<R> flatMapSingle(io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> r2, boolean r3) {
            r1 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.observable.ObservableFlatMapSingle r0 = new io.reactivex.internal.operators.observable.ObservableFlatMapSingle
            r0.<init>(r1, r2, r3)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.disposables.Disposable forEach(io.reactivex.functions.Consumer<? super T> r1) {
            r0 = this;
            io.reactivex.disposables.Disposable r1 = r0.subscribe(r1)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.disposables.Disposable forEachWhile(io.reactivex.functions.Predicate<? super T> r3) {
            r2 = this;
            io.reactivex.functions.Consumer<java.lang.Throwable> r0 = io.reactivex.internal.functions.Functions.ON_ERROR_MISSING
            io.reactivex.functions.Action r1 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.disposables.Disposable r3 = r2.forEachWhile(r3, r0, r1)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.disposables.Disposable forEachWhile(io.reactivex.functions.Predicate<? super T> r2, io.reactivex.functions.Consumer<? super java.lang.Throwable> r3) {
            r1 = this;
            io.reactivex.functions.Action r0 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.disposables.Disposable r2 = r1.forEachWhile(r2, r3, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.disposables.Disposable forEachWhile(io.reactivex.functions.Predicate<? super T> r2, io.reactivex.functions.Consumer<? super java.lang.Throwable> r3, io.reactivex.functions.Action r4) {
            r1 = this;
            java.lang.String r0 = "onNext is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "onError is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "onComplete is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            io.reactivex.internal.observers.ForEachWhileObserver r0 = new io.reactivex.internal.observers.ForEachWhileObserver
            r0.<init>(r2, r3, r4)
            r1.subscribe(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <K> io.reactivex.Observable<io.reactivex.observables.GroupedObservable<K, T>> groupBy(io.reactivex.functions.Function<? super T, ? extends K> r4) {
            r3 = this;
            io.reactivex.functions.Function r0 = io.reactivex.internal.functions.Functions.identity()
            r1 = 0
            int r2 = bufferSize()
            io.reactivex.Observable r4 = r3.groupBy(r4, r0, r1, r2)
            return r4
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <K, V> io.reactivex.Observable<io.reactivex.observables.GroupedObservable<K, V>> groupBy(io.reactivex.functions.Function<? super T, ? extends K> r3, io.reactivex.functions.Function<? super T, ? extends V> r4) {
            r2 = this;
            r0 = 0
            int r1 = bufferSize()
            io.reactivex.Observable r3 = r2.groupBy(r3, r4, r0, r1)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <K, V> io.reactivex.Observable<io.reactivex.observables.GroupedObservable<K, V>> groupBy(io.reactivex.functions.Function<? super T, ? extends K> r2, io.reactivex.functions.Function<? super T, ? extends V> r3, boolean r4) {
            r1 = this;
            int r0 = bufferSize()
            io.reactivex.Observable r2 = r1.groupBy(r2, r3, r4, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <K, V> io.reactivex.Observable<io.reactivex.observables.GroupedObservable<K, V>> groupBy(io.reactivex.functions.Function<? super T, ? extends K> r8, io.reactivex.functions.Function<? super T, ? extends V> r9, boolean r10, int r11) {
            r7 = this;
            java.lang.String r0 = "keySelector is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r8, r0)
            java.lang.String r0 = "valueSelector is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r9, r0)
            java.lang.String r0 = "bufferSize"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r11, r0)
            io.reactivex.internal.operators.observable.ObservableGroupBy r0 = new io.reactivex.internal.operators.observable.ObservableGroupBy
            r1 = r0
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r11
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            io.reactivex.Observable r8 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r8
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <K> io.reactivex.Observable<io.reactivex.observables.GroupedObservable<K, T>> groupBy(io.reactivex.functions.Function<? super T, ? extends K> r3, boolean r4) {
            r2 = this;
            io.reactivex.functions.Function r0 = io.reactivex.internal.functions.Functions.identity()
            int r1 = bufferSize()
            io.reactivex.Observable r3 = r2.groupBy(r3, r0, r4, r1)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <TRight, TLeftEnd, TRightEnd, R> io.reactivex.Observable<R> groupJoin(io.reactivex.ObservableSource<? extends TRight> r8, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<TLeftEnd>> r9, io.reactivex.functions.Function<? super TRight, ? extends io.reactivex.ObservableSource<TRightEnd>> r10, io.reactivex.functions.BiFunction<? super T, ? super io.reactivex.Observable<TRight>, ? extends R> r11) {
            r7 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r8, r0)
            java.lang.String r0 = "leftEnd is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r9, r0)
            java.lang.String r0 = "rightEnd is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r10, r0)
            java.lang.String r0 = "resultSelector is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r11, r0)
            io.reactivex.internal.operators.observable.ObservableGroupJoin r0 = new io.reactivex.internal.operators.observable.ObservableGroupJoin
            r1 = r0
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            io.reactivex.Observable r8 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r8
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> hide() {
            r1 = this;
            io.reactivex.internal.operators.observable.ObservableHide r0 = new io.reactivex.internal.operators.observable.ObservableHide
            r0.<init>(r1)
            io.reactivex.Observable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable ignoreElements() {
            r1 = this;
            io.reactivex.internal.operators.observable.ObservableIgnoreElementsCompletable r0 = new io.reactivex.internal.operators.observable.ObservableIgnoreElementsCompletable
            r0.<init>(r1)
            io.reactivex.Completable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<java.lang.Boolean> isEmpty() {
            r1 = this;
            io.reactivex.functions.Predicate r0 = io.reactivex.internal.functions.Functions.alwaysFalse()
            io.reactivex.Single r0 = r1.all(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <TRight, TLeftEnd, TRightEnd, R> io.reactivex.Observable<R> join(io.reactivex.ObservableSource<? extends TRight> r8, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<TLeftEnd>> r9, io.reactivex.functions.Function<? super TRight, ? extends io.reactivex.ObservableSource<TRightEnd>> r10, io.reactivex.functions.BiFunction<? super T, ? super TRight, ? extends R> r11) {
            r7 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r8, r0)
            java.lang.String r0 = "leftEnd is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r9, r0)
            java.lang.String r0 = "rightEnd is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r10, r0)
            java.lang.String r0 = "resultSelector is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r11, r0)
            io.reactivex.internal.operators.observable.ObservableJoin r0 = new io.reactivex.internal.operators.observable.ObservableJoin
            r1 = r0
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            io.reactivex.Observable r8 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r8
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<T> last(T r2) {
            r1 = this;
            java.lang.String r0 = "defaultItem is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.observable.ObservableLastSingle r0 = new io.reactivex.internal.operators.observable.ObservableLastSingle
            r0.<init>(r1, r2)
            io.reactivex.Single r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Maybe<T> lastElement() {
            r1 = this;
            io.reactivex.internal.operators.observable.ObservableLastMaybe r0 = new io.reactivex.internal.operators.observable.ObservableLastMaybe
            r0.<init>(r1)
            io.reactivex.Maybe r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<T> lastOrError() {
            r2 = this;
            io.reactivex.internal.operators.observable.ObservableLastSingle r0 = new io.reactivex.internal.operators.observable.ObservableLastSingle
            r1 = 0
            r0.<init>(r2, r1)
            io.reactivex.Single r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Observable<R> lift(io.reactivex.ObservableOperator<? extends R, ? super T> r2) {
            r1 = this;
            java.lang.String r0 = "onLift is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.observable.ObservableLift r0 = new io.reactivex.internal.operators.observable.ObservableLift
            r0.<init>(r1, r2)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Observable<R> map(io.reactivex.functions.Function<? super T, ? extends R> r2) {
            r1 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.observable.ObservableMap r0 = new io.reactivex.internal.operators.observable.ObservableMap
            r0.<init>(r1, r2)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<io.reactivex.Notification<T>> materialize() {
            r1 = this;
            io.reactivex.internal.operators.observable.ObservableMaterialize r0 = new io.reactivex.internal.operators.observable.ObservableMaterialize
            r0.<init>(r1)
            io.reactivex.Observable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> mergeWith(io.reactivex.CompletableSource r2) {
            r1 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.observable.ObservableMergeWithCompletable r0 = new io.reactivex.internal.operators.observable.ObservableMergeWithCompletable
            r0.<init>(r1, r2)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> mergeWith(io.reactivex.MaybeSource<? extends T> r2) {
            r1 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.observable.ObservableMergeWithMaybe r0 = new io.reactivex.internal.operators.observable.ObservableMergeWithMaybe
            r0.<init>(r1, r2)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> mergeWith(io.reactivex.ObservableSource<? extends T> r2) {
            r1 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.Observable r2 = merge(r1, r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> mergeWith(io.reactivex.SingleSource<? extends T> r2) {
            r1 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.observable.ObservableMergeWithSingle r0 = new io.reactivex.internal.operators.observable.ObservableMergeWithSingle
            r0.<init>(r1, r2)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> observeOn(io.reactivex.Scheduler r3) {
            r2 = this;
            r0 = 0
            int r1 = bufferSize()
            io.reactivex.Observable r3 = r2.observeOn(r3, r0, r1)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> observeOn(io.reactivex.Scheduler r2, boolean r3) {
            r1 = this;
            int r0 = bufferSize()
            io.reactivex.Observable r2 = r1.observeOn(r2, r3, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> observeOn(io.reactivex.Scheduler r2, boolean r3, int r4) {
            r1 = this;
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "bufferSize"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r4, r0)
            io.reactivex.internal.operators.observable.ObservableObserveOn r0 = new io.reactivex.internal.operators.observable.ObservableObserveOn
            r0.<init>(r1, r2, r3, r4)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <U> io.reactivex.Observable<U> ofType(java.lang.Class<U> r2) {
            r1 = this;
            java.lang.String r0 = "clazz is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.functions.Predicate r0 = io.reactivex.internal.functions.Functions.isInstanceOf(r2)
            io.reactivex.Observable r0 = r1.filter(r0)
            io.reactivex.Observable r2 = r0.cast(r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> onErrorResumeNext(io.reactivex.ObservableSource<? extends T> r2) {
            r1 = this;
            java.lang.String r0 = "next is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.functions.Function r2 = io.reactivex.internal.functions.Functions.justFunction(r2)
            io.reactivex.Observable r2 = r1.onErrorResumeNext(r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> onErrorResumeNext(io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.ObservableSource<? extends T>> r3) {
            r2 = this;
            java.lang.String r0 = "resumeFunction is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.observable.ObservableOnErrorNext r0 = new io.reactivex.internal.operators.observable.ObservableOnErrorNext
            r1 = 0
            r0.<init>(r2, r3, r1)
            io.reactivex.Observable r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> onErrorReturn(io.reactivex.functions.Function<? super java.lang.Throwable, ? extends T> r2) {
            r1 = this;
            java.lang.String r0 = "valueSupplier is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.observable.ObservableOnErrorReturn r0 = new io.reactivex.internal.operators.observable.ObservableOnErrorReturn
            r0.<init>(r1, r2)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> onErrorReturnItem(T r2) {
            r1 = this;
            java.lang.String r0 = "item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.functions.Function r2 = io.reactivex.internal.functions.Functions.justFunction(r2)
            io.reactivex.Observable r2 = r1.onErrorReturn(r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> onExceptionResumeNext(io.reactivex.ObservableSource<? extends T> r3) {
            r2 = this;
            java.lang.String r0 = "next is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.observable.ObservableOnErrorNext r0 = new io.reactivex.internal.operators.observable.ObservableOnErrorNext
            io.reactivex.functions.Function r3 = io.reactivex.internal.functions.Functions.justFunction(r3)
            r1 = 1
            r0.<init>(r2, r3, r1)
            io.reactivex.Observable r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> onTerminateDetach() {
            r1 = this;
            io.reactivex.internal.operators.observable.ObservableDetach r0 = new io.reactivex.internal.operators.observable.ObservableDetach
            r0.<init>(r1)
            io.reactivex.Observable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Observable<R> publish(io.reactivex.functions.Function<? super io.reactivex.Observable<T>, ? extends io.reactivex.ObservableSource<R>> r2) {
            r1 = this;
            java.lang.String r0 = "selector is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.observable.ObservablePublishSelector r0 = new io.reactivex.internal.operators.observable.ObservablePublishSelector
            r0.<init>(r1, r2)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.observables.ConnectableObservable<T> publish() {
            r1 = this;
            io.reactivex.observables.ConnectableObservable r0 = io.reactivex.internal.operators.observable.ObservablePublish.create(r1)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Maybe<T> reduce(io.reactivex.functions.BiFunction<T, T, T> r2) {
            r1 = this;
            java.lang.String r0 = "reducer is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.observable.ObservableReduceMaybe r0 = new io.reactivex.internal.operators.observable.ObservableReduceMaybe
            r0.<init>(r1, r2)
            io.reactivex.Maybe r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Single<R> reduce(R r2, io.reactivex.functions.BiFunction<R, ? super T, R> r3) {
            r1 = this;
            java.lang.String r0 = "seed is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "reducer is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.observable.ObservableReduceSeedSingle r0 = new io.reactivex.internal.operators.observable.ObservableReduceSeedSingle
            r0.<init>(r1, r2, r3)
            io.reactivex.Single r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Single<R> reduceWith(java.util.concurrent.Callable<R> r2, io.reactivex.functions.BiFunction<R, ? super T, R> r3) {
            r1 = this;
            java.lang.String r0 = "seedSupplier is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "reducer is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.observable.ObservableReduceWithSingle r0 = new io.reactivex.internal.operators.observable.ObservableReduceWithSingle
            r0.<init>(r1, r2, r3)
            io.reactivex.Single r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> repeat() {
            r2 = this;
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            io.reactivex.Observable r0 = r2.repeat(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> repeat(long r4) {
            r3 = this;
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L17
            if (r0 != 0) goto Ld
            io.reactivex.Observable r4 = empty()
            return r4
        Ld:
            io.reactivex.internal.operators.observable.ObservableRepeat r0 = new io.reactivex.internal.operators.observable.ObservableRepeat
            r0.<init>(r3, r4)
            io.reactivex.Observable r4 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r4
        L17:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "times >= 0 required but it was "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> repeatUntil(io.reactivex.functions.BooleanSupplier r2) {
            r1 = this;
            java.lang.String r0 = "stop is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.observable.ObservableRepeatUntil r0 = new io.reactivex.internal.operators.observable.ObservableRepeatUntil
            r0.<init>(r1, r2)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> repeatWhen(io.reactivex.functions.Function<? super io.reactivex.Observable<java.lang.Object>, ? extends io.reactivex.ObservableSource<?>> r2) {
            r1 = this;
            java.lang.String r0 = "handler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.observable.ObservableRepeatWhen r0 = new io.reactivex.internal.operators.observable.ObservableRepeatWhen
            r0.<init>(r1, r2)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Observable<R> replay(io.reactivex.functions.Function<? super io.reactivex.Observable<T>, ? extends io.reactivex.ObservableSource<R>> r2) {
            r1 = this;
            java.lang.String r0 = "selector is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.util.concurrent.Callable r0 = io.reactivex.internal.operators.observable.ObservableInternalHelper.replayCallable(r1)
            io.reactivex.Observable r2 = io.reactivex.internal.operators.observable.ObservableReplay.multicastSelector(r0, r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Observable<R> replay(io.reactivex.functions.Function<? super io.reactivex.Observable<T>, ? extends io.reactivex.ObservableSource<R>> r2, int r3) {
            r1 = this;
            java.lang.String r0 = "selector is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "bufferSize"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r3, r0)
            java.util.concurrent.Callable r3 = io.reactivex.internal.operators.observable.ObservableInternalHelper.replayCallable(r1, r3)
            io.reactivex.Observable r2 = io.reactivex.internal.operators.observable.ObservableReplay.multicastSelector(r3, r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Observable<R> replay(io.reactivex.functions.Function<? super io.reactivex.Observable<T>, ? extends io.reactivex.ObservableSource<R>> r8, int r9, long r10, java.util.concurrent.TimeUnit r12) {
            r7 = this;
            io.reactivex.Scheduler r6 = io.reactivex.schedulers.Schedulers.computation()
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r12
            io.reactivex.Observable r8 = r0.replay(r1, r2, r3, r5, r6)
            return r8
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Observable<R> replay(io.reactivex.functions.Function<? super io.reactivex.Observable<T>, ? extends io.reactivex.ObservableSource<R>> r7, int r8, long r9, java.util.concurrent.TimeUnit r11, io.reactivex.Scheduler r12) {
            r6 = this;
            java.lang.String r0 = "selector is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r0)
            java.lang.String r0 = "bufferSize"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r8, r0)
            java.lang.String r0 = "unit is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r11, r0)
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r12, r0)
            r0 = r6
            r1 = r8
            r2 = r9
            r4 = r11
            r5 = r12
            java.util.concurrent.Callable r8 = io.reactivex.internal.operators.observable.ObservableInternalHelper.replayCallable(r0, r1, r2, r4, r5)
            io.reactivex.Observable r7 = io.reactivex.internal.operators.observable.ObservableReplay.multicastSelector(r8, r7)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Observable<R> replay(io.reactivex.functions.Function<? super io.reactivex.Observable<T>, ? extends io.reactivex.ObservableSource<R>> r2, int r3, io.reactivex.Scheduler r4) {
            r1 = this;
            java.lang.String r0 = "selector is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            java.lang.String r0 = "bufferSize"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r3, r0)
            java.util.concurrent.Callable r3 = io.reactivex.internal.operators.observable.ObservableInternalHelper.replayCallable(r1, r3)
            io.reactivex.functions.Function r2 = io.reactivex.internal.operators.observable.ObservableInternalHelper.replayFunction(r2, r4)
            io.reactivex.Observable r2 = io.reactivex.internal.operators.observable.ObservableReplay.multicastSelector(r3, r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Observable<R> replay(io.reactivex.functions.Function<? super io.reactivex.Observable<T>, ? extends io.reactivex.ObservableSource<R>> r7, long r8, java.util.concurrent.TimeUnit r10) {
            r6 = this;
            io.reactivex.Scheduler r5 = io.reactivex.schedulers.Schedulers.computation()
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r10
            io.reactivex.Observable r7 = r0.replay(r1, r2, r4, r5)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Observable<R> replay(io.reactivex.functions.Function<? super io.reactivex.Observable<T>, ? extends io.reactivex.ObservableSource<R>> r2, long r3, java.util.concurrent.TimeUnit r5, io.reactivex.Scheduler r6) {
            r1 = this;
            java.lang.String r0 = "selector is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "unit is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r0)
            java.util.concurrent.Callable r3 = io.reactivex.internal.operators.observable.ObservableInternalHelper.replayCallable(r1, r3, r5, r6)
            io.reactivex.Observable r2 = io.reactivex.internal.operators.observable.ObservableReplay.multicastSelector(r3, r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Observable<R> replay(io.reactivex.functions.Function<? super io.reactivex.Observable<T>, ? extends io.reactivex.ObservableSource<R>> r2, io.reactivex.Scheduler r3) {
            r1 = this;
            java.lang.String r0 = "selector is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.util.concurrent.Callable r0 = io.reactivex.internal.operators.observable.ObservableInternalHelper.replayCallable(r1)
            io.reactivex.functions.Function r2 = io.reactivex.internal.operators.observable.ObservableInternalHelper.replayFunction(r2, r3)
            io.reactivex.Observable r2 = io.reactivex.internal.operators.observable.ObservableReplay.multicastSelector(r0, r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.observables.ConnectableObservable<T> replay() {
            r1 = this;
            io.reactivex.observables.ConnectableObservable r0 = io.reactivex.internal.operators.observable.ObservableReplay.createFrom(r1)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.observables.ConnectableObservable<T> replay(int r2) {
            r1 = this;
            java.lang.String r0 = "bufferSize"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r2, r0)
            io.reactivex.observables.ConnectableObservable r2 = io.reactivex.internal.operators.observable.ObservableReplay.create(r1, r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.observables.ConnectableObservable<T> replay(int r7, long r8, java.util.concurrent.TimeUnit r10) {
            r6 = this;
            io.reactivex.Scheduler r5 = io.reactivex.schedulers.Schedulers.computation()
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r10
            io.reactivex.observables.ConnectableObservable r7 = r0.replay(r1, r2, r4, r5)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.observables.ConnectableObservable<T> replay(int r7, long r8, java.util.concurrent.TimeUnit r10, io.reactivex.Scheduler r11) {
            r6 = this;
            java.lang.String r0 = "bufferSize"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r7, r0)
            java.lang.String r0 = "unit is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r10, r0)
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r11, r0)
            r0 = r6
            r1 = r8
            r3 = r10
            r4 = r11
            r5 = r7
            io.reactivex.observables.ConnectableObservable r7 = io.reactivex.internal.operators.observable.ObservableReplay.create(r0, r1, r3, r4, r5)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.observables.ConnectableObservable<T> replay(int r2, io.reactivex.Scheduler r3) {
            r1 = this;
            java.lang.String r0 = "bufferSize"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r2, r0)
            io.reactivex.observables.ConnectableObservable r2 = r1.replay(r2)
            io.reactivex.observables.ConnectableObservable r2 = io.reactivex.internal.operators.observable.ObservableReplay.observeOn(r2, r3)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.observables.ConnectableObservable<T> replay(long r2, java.util.concurrent.TimeUnit r4) {
            r1 = this;
            io.reactivex.Scheduler r0 = io.reactivex.schedulers.Schedulers.computation()
            io.reactivex.observables.ConnectableObservable r2 = r1.replay(r2, r4, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.observables.ConnectableObservable<T> replay(long r2, java.util.concurrent.TimeUnit r4, io.reactivex.Scheduler r5) {
            r1 = this;
            java.lang.String r0 = "unit is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            io.reactivex.observables.ConnectableObservable r2 = io.reactivex.internal.operators.observable.ObservableReplay.create(r1, r2, r4, r5)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.observables.ConnectableObservable<T> replay(io.reactivex.Scheduler r2) {
            r1 = this;
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.observables.ConnectableObservable r0 = r1.replay()
            io.reactivex.observables.ConnectableObservable r2 = io.reactivex.internal.operators.observable.ObservableReplay.observeOn(r0, r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> retry() {
            r3 = this;
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            io.reactivex.functions.Predicate r2 = io.reactivex.internal.functions.Functions.alwaysTrue()
            io.reactivex.Observable r0 = r3.retry(r0, r2)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> retry(long r2) {
            r1 = this;
            io.reactivex.functions.Predicate r0 = io.reactivex.internal.functions.Functions.alwaysTrue()
            io.reactivex.Observable r2 = r1.retry(r2, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> retry(long r3, io.reactivex.functions.Predicate<? super java.lang.Throwable> r5) {
            r2 = this;
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L15
            java.lang.String r0 = "predicate is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            io.reactivex.internal.operators.observable.ObservableRetryPredicate r0 = new io.reactivex.internal.operators.observable.ObservableRetryPredicate
            r0.<init>(r2, r3, r5)
            io.reactivex.Observable r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r3
        L15:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "times >= 0 required but it was "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            r5.<init>(r3)
            throw r5
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> retry(io.reactivex.functions.BiPredicate<? super java.lang.Integer, ? super java.lang.Throwable> r2) {
            r1 = this;
            java.lang.String r0 = "predicate is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.observable.ObservableRetryBiPredicate r0 = new io.reactivex.internal.operators.observable.ObservableRetryBiPredicate
            r0.<init>(r1, r2)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> retry(io.reactivex.functions.Predicate<? super java.lang.Throwable> r3) {
            r2 = this;
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            io.reactivex.Observable r3 = r2.retry(r0, r3)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> retryUntil(io.reactivex.functions.BooleanSupplier r3) {
            r2 = this;
            java.lang.String r0 = "stop is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            io.reactivex.functions.Predicate r3 = io.reactivex.internal.functions.Functions.predicateReverseFor(r3)
            io.reactivex.Observable r3 = r2.retry(r0, r3)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> retryWhen(io.reactivex.functions.Function<? super io.reactivex.Observable<java.lang.Throwable>, ? extends io.reactivex.ObservableSource<?>> r2) {
            r1 = this;
            java.lang.String r0 = "handler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.observable.ObservableRetryWhen r0 = new io.reactivex.internal.operators.observable.ObservableRetryWhen
            r0.<init>(r1, r2)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    public final void safeSubscribe(io.reactivex.Observer<? super T> r2) {
            r1 = this;
            java.lang.String r0 = "s is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            boolean r0 = r2 instanceof io.reactivex.observers.SafeObserver
            if (r0 == 0) goto Ld
            r1.subscribe(r2)
            goto L15
        Ld:
            io.reactivex.observers.SafeObserver r0 = new io.reactivex.observers.SafeObserver
            r0.<init>(r2)
            r1.subscribe(r0)
        L15:
            return
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> sample(long r2, java.util.concurrent.TimeUnit r4) {
            r1 = this;
            io.reactivex.Scheduler r0 = io.reactivex.schedulers.Schedulers.computation()
            io.reactivex.Observable r2 = r1.sample(r2, r4, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> sample(long r9, java.util.concurrent.TimeUnit r11, io.reactivex.Scheduler r12) {
            r8 = this;
            java.lang.String r0 = "unit is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r11, r0)
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r12, r0)
            io.reactivex.internal.operators.observable.ObservableSampleTimed r0 = new io.reactivex.internal.operators.observable.ObservableSampleTimed
            r7 = 0
            r1 = r0
            r2 = r8
            r3 = r9
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r5, r6, r7)
            io.reactivex.Observable r9 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r9
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> sample(long r9, java.util.concurrent.TimeUnit r11, io.reactivex.Scheduler r12, boolean r13) {
            r8 = this;
            java.lang.String r0 = "unit is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r11, r0)
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r12, r0)
            io.reactivex.internal.operators.observable.ObservableSampleTimed r0 = new io.reactivex.internal.operators.observable.ObservableSampleTimed
            r1 = r0
            r2 = r8
            r3 = r9
            r5 = r11
            r6 = r12
            r7 = r13
            r1.<init>(r2, r3, r5, r6, r7)
            io.reactivex.Observable r9 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r9
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> sample(long r7, java.util.concurrent.TimeUnit r9, boolean r10) {
            r6 = this;
            io.reactivex.Scheduler r4 = io.reactivex.schedulers.Schedulers.computation()
            r0 = r6
            r1 = r7
            r3 = r9
            r5 = r10
            io.reactivex.Observable r7 = r0.sample(r1, r3, r4, r5)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <U> io.reactivex.Observable<T> sample(io.reactivex.ObservableSource<U> r3) {
            r2 = this;
            java.lang.String r0 = "sampler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.observable.ObservableSampleWithObservable r0 = new io.reactivex.internal.operators.observable.ObservableSampleWithObservable
            r1 = 0
            r0.<init>(r2, r3, r1)
            io.reactivex.Observable r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <U> io.reactivex.Observable<T> sample(io.reactivex.ObservableSource<U> r2, boolean r3) {
            r1 = this;
            java.lang.String r0 = "sampler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.observable.ObservableSampleWithObservable r0 = new io.reactivex.internal.operators.observable.ObservableSampleWithObservable
            r0.<init>(r1, r2, r3)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> scan(io.reactivex.functions.BiFunction<T, T, T> r2) {
            r1 = this;
            java.lang.String r0 = "accumulator is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.observable.ObservableScan r0 = new io.reactivex.internal.operators.observable.ObservableScan
            r0.<init>(r1, r2)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Observable<R> scan(R r2, io.reactivex.functions.BiFunction<R, ? super T, R> r3) {
            r1 = this;
            java.lang.String r0 = "seed is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.util.concurrent.Callable r2 = io.reactivex.internal.functions.Functions.justCallable(r2)
            io.reactivex.Observable r2 = r1.scanWith(r2, r3)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Observable<R> scanWith(java.util.concurrent.Callable<R> r2, io.reactivex.functions.BiFunction<R, ? super T, R> r3) {
            r1 = this;
            java.lang.String r0 = "seedSupplier is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "accumulator is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.observable.ObservableScanSeed r0 = new io.reactivex.internal.operators.observable.ObservableScanSeed
            r0.<init>(r1, r2, r3)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> serialize() {
            r1 = this;
            io.reactivex.internal.operators.observable.ObservableSerialized r0 = new io.reactivex.internal.operators.observable.ObservableSerialized
            r0.<init>(r1)
            io.reactivex.Observable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> share() {
            r1 = this;
            io.reactivex.observables.ConnectableObservable r0 = r1.publish()
            io.reactivex.Observable r0 = r0.refCount()
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<T> single(T r2) {
            r1 = this;
            java.lang.String r0 = "defaultItem is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.observable.ObservableSingleSingle r0 = new io.reactivex.internal.operators.observable.ObservableSingleSingle
            r0.<init>(r1, r2)
            io.reactivex.Single r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Maybe<T> singleElement() {
            r1 = this;
            io.reactivex.internal.operators.observable.ObservableSingleMaybe r0 = new io.reactivex.internal.operators.observable.ObservableSingleMaybe
            r0.<init>(r1)
            io.reactivex.Maybe r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<T> singleOrError() {
            r2 = this;
            io.reactivex.internal.operators.observable.ObservableSingleSingle r0 = new io.reactivex.internal.operators.observable.ObservableSingleSingle
            r1 = 0
            r0.<init>(r2, r1)
            io.reactivex.Single r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> skip(long r3) {
            r2 = this;
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto Lb
            io.reactivex.Observable r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r2)
            return r3
        Lb:
            io.reactivex.internal.operators.observable.ObservableSkip r0 = new io.reactivex.internal.operators.observable.ObservableSkip
            r0.<init>(r2, r3)
            io.reactivex.Observable r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> skip(long r1, java.util.concurrent.TimeUnit r3) {
            r0 = this;
            io.reactivex.Observable r1 = timer(r1, r3)
            io.reactivex.Observable r1 = r0.skipUntil(r1)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> skip(long r1, java.util.concurrent.TimeUnit r3, io.reactivex.Scheduler r4) {
            r0 = this;
            io.reactivex.Observable r1 = timer(r1, r3, r4)
            io.reactivex.Observable r1 = r0.skipUntil(r1)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> skipLast(int r4) {
            r3 = this;
            if (r4 < 0) goto L13
            if (r4 != 0) goto L9
            io.reactivex.Observable r4 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r3)
            return r4
        L9:
            io.reactivex.internal.operators.observable.ObservableSkipLast r0 = new io.reactivex.internal.operators.observable.ObservableSkipLast
            r0.<init>(r3, r4)
            io.reactivex.Observable r4 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r4
        L13:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "count >= 0 required but it was "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:trampoline")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> skipLast(long r8, java.util.concurrent.TimeUnit r10) {
            r7 = this;
            io.reactivex.Scheduler r4 = io.reactivex.schedulers.Schedulers.trampoline()
            r5 = 0
            int r6 = bufferSize()
            r0 = r7
            r1 = r8
            r3 = r10
            io.reactivex.Observable r8 = r0.skipLast(r1, r3, r4, r5, r6)
            return r8
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> skipLast(long r8, java.util.concurrent.TimeUnit r10, io.reactivex.Scheduler r11) {
            r7 = this;
            r5 = 0
            int r6 = bufferSize()
            r0 = r7
            r1 = r8
            r3 = r10
            r4 = r11
            io.reactivex.Observable r8 = r0.skipLast(r1, r3, r4, r5, r6)
            return r8
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> skipLast(long r8, java.util.concurrent.TimeUnit r10, io.reactivex.Scheduler r11, boolean r12) {
            r7 = this;
            int r6 = bufferSize()
            r0 = r7
            r1 = r8
            r3 = r10
            r4 = r11
            r5 = r12
            io.reactivex.Observable r8 = r0.skipLast(r1, r3, r4, r5, r6)
            return r8
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> skipLast(long r10, java.util.concurrent.TimeUnit r12, io.reactivex.Scheduler r13, boolean r14, int r15) {
            r9 = this;
            java.lang.String r0 = "unit is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r12, r0)
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r13, r0)
            java.lang.String r0 = "bufferSize"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r15, r0)
            int r7 = r15 << 1
            io.reactivex.internal.operators.observable.ObservableSkipLastTimed r15 = new io.reactivex.internal.operators.observable.ObservableSkipLastTimed
            r1 = r15
            r2 = r9
            r3 = r10
            r5 = r12
            r6 = r13
            r8 = r14
            r1.<init>(r2, r3, r5, r6, r7, r8)
            io.reactivex.Observable r10 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r15)
            return r10
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:trampoline")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> skipLast(long r8, java.util.concurrent.TimeUnit r10, boolean r11) {
            r7 = this;
            io.reactivex.Scheduler r4 = io.reactivex.schedulers.Schedulers.trampoline()
            int r6 = bufferSize()
            r0 = r7
            r1 = r8
            r3 = r10
            r5 = r11
            io.reactivex.Observable r8 = r0.skipLast(r1, r3, r4, r5, r6)
            return r8
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <U> io.reactivex.Observable<T> skipUntil(io.reactivex.ObservableSource<U> r2) {
            r1 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.observable.ObservableSkipUntil r0 = new io.reactivex.internal.operators.observable.ObservableSkipUntil
            r0.<init>(r1, r2)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> skipWhile(io.reactivex.functions.Predicate<? super T> r2) {
            r1 = this;
            java.lang.String r0 = "predicate is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.observable.ObservableSkipWhile r0 = new io.reactivex.internal.operators.observable.ObservableSkipWhile
            r0.<init>(r1, r2)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> sorted() {
            r2 = this;
            io.reactivex.Single r0 = r2.toList()
            io.reactivex.Observable r0 = r0.toObservable()
            java.util.Comparator r1 = io.reactivex.internal.functions.Functions.naturalComparator()
            io.reactivex.functions.Function r1 = io.reactivex.internal.functions.Functions.listSorter(r1)
            io.reactivex.Observable r0 = r0.map(r1)
            io.reactivex.functions.Function r1 = io.reactivex.internal.functions.Functions.identity()
            io.reactivex.Observable r0 = r0.flatMapIterable(r1)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> sorted(java.util.Comparator<? super T> r2) {
            r1 = this;
            java.lang.String r0 = "sortFunction is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.Single r0 = r1.toList()
            io.reactivex.Observable r0 = r0.toObservable()
            io.reactivex.functions.Function r2 = io.reactivex.internal.functions.Functions.listSorter(r2)
            io.reactivex.Observable r2 = r0.map(r2)
            io.reactivex.functions.Function r0 = io.reactivex.internal.functions.Functions.identity()
            io.reactivex.Observable r2 = r2.flatMapIterable(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> startWith(io.reactivex.ObservableSource<? extends T> r3) {
            r2 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            r0 = 2
            io.reactivex.ObservableSource[] r0 = new io.reactivex.ObservableSource[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r2
            io.reactivex.Observable r3 = concatArray(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> startWith(java.lang.Iterable<? extends T> r3) {
            r2 = this;
            r0 = 2
            io.reactivex.ObservableSource[] r0 = new io.reactivex.ObservableSource[r0]
            r1 = 0
            io.reactivex.Observable r3 = fromIterable(r3)
            r0[r1] = r3
            r3 = 1
            r0[r3] = r2
            io.reactivex.Observable r3 = concatArray(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> startWith(T r3) {
            r2 = this;
            java.lang.String r0 = "item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            r0 = 2
            io.reactivex.ObservableSource[] r0 = new io.reactivex.ObservableSource[r0]
            r1 = 0
            io.reactivex.Observable r3 = just(r3)
            r0[r1] = r3
            r3 = 1
            r0[r3] = r2
            io.reactivex.Observable r3 = concatArray(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> startWithArray(T... r3) {
            r2 = this;
            io.reactivex.Observable r3 = fromArray(r3)
            io.reactivex.Observable r0 = empty()
            if (r3 != r0) goto Lf
            io.reactivex.Observable r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r2)
            return r3
        Lf:
            r0 = 2
            io.reactivex.ObservableSource[] r0 = new io.reactivex.ObservableSource[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r2
            io.reactivex.Observable r3 = concatArray(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    public final io.reactivex.disposables.Disposable subscribe() {
            r4 = this;
            io.reactivex.functions.Consumer r0 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Consumer<java.lang.Throwable> r1 = io.reactivex.internal.functions.Functions.ON_ERROR_MISSING
            io.reactivex.functions.Action r2 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.functions.Consumer r3 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.disposables.Disposable r0 = r4.subscribe(r0, r1, r2, r3)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.disposables.Disposable subscribe(io.reactivex.functions.Consumer<? super T> r4) {
            r3 = this;
            io.reactivex.functions.Consumer<java.lang.Throwable> r0 = io.reactivex.internal.functions.Functions.ON_ERROR_MISSING
            io.reactivex.functions.Action r1 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.functions.Consumer r2 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.disposables.Disposable r4 = r3.subscribe(r4, r0, r1, r2)
            return r4
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.disposables.Disposable subscribe(io.reactivex.functions.Consumer<? super T> r3, io.reactivex.functions.Consumer<? super java.lang.Throwable> r4) {
            r2 = this;
            io.reactivex.functions.Action r0 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.functions.Consumer r1 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.disposables.Disposable r3 = r2.subscribe(r3, r4, r0, r1)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.disposables.Disposable subscribe(io.reactivex.functions.Consumer<? super T> r2, io.reactivex.functions.Consumer<? super java.lang.Throwable> r3, io.reactivex.functions.Action r4) {
            r1 = this;
            io.reactivex.functions.Consumer r0 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.disposables.Disposable r2 = r1.subscribe(r2, r3, r4, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.disposables.Disposable subscribe(io.reactivex.functions.Consumer<? super T> r2, io.reactivex.functions.Consumer<? super java.lang.Throwable> r3, io.reactivex.functions.Action r4, io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> r5) {
            r1 = this;
            java.lang.String r0 = "onNext is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "onError is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "onComplete is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            java.lang.String r0 = "onSubscribe is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            io.reactivex.internal.observers.LambdaObserver r0 = new io.reactivex.internal.observers.LambdaObserver
            r0.<init>(r2, r3, r4, r5)
            r1.subscribe(r0)
            return r0
    }

    @Override // io.reactivex.ObservableSource
    @io.reactivex.annotations.SchedulerSupport("none")
    public final void subscribe(io.reactivex.Observer<? super T> r3) {
            r2 = this;
            java.lang.String r0 = "observer is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.Observer r3 = io.reactivex.plugins.RxJavaPlugins.onSubscribe(r2, r3)     // Catch: java.lang.Throwable -> L12 java.lang.NullPointerException -> L24
            java.lang.String r0 = "Plugin returned null Observer"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)     // Catch: java.lang.Throwable -> L12 java.lang.NullPointerException -> L24
            r2.subscribeActual(r3)     // Catch: java.lang.Throwable -> L12 java.lang.NullPointerException -> L24
            return
        L12:
            r3 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
            io.reactivex.plugins.RxJavaPlugins.onError(r3)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Actually not, but can't throw other exceptions due to RS"
            r0.<init>(r1)
            r0.initCause(r3)
            throw r0
        L24:
            r3 = move-exception
            throw r3
    }

    protected abstract void subscribeActual(io.reactivex.Observer<? super T> r1);

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> subscribeOn(io.reactivex.Scheduler r2) {
            r1 = this;
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.observable.ObservableSubscribeOn r0 = new io.reactivex.internal.operators.observable.ObservableSubscribeOn
            r0.<init>(r1, r2)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <E extends io.reactivex.Observer<? super T>> E subscribeWith(E r1) {
            r0 = this;
            r0.subscribe(r1)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> switchIfEmpty(io.reactivex.ObservableSource<? extends T> r2) {
            r1 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.observable.ObservableSwitchIfEmpty r0 = new io.reactivex.internal.operators.observable.ObservableSwitchIfEmpty
            r0.<init>(r1, r2)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Observable<R> switchMap(io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> r2) {
            r1 = this;
            int r0 = bufferSize()
            io.reactivex.Observable r2 = r1.switchMap(r2, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Observable<R> switchMap(io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> r3, int r4) {
            r2 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "bufferSize"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r4, r0)
            boolean r0 = r2 instanceof io.reactivex.internal.fuseable.ScalarCallable
            if (r0 == 0) goto L21
            r4 = r2
            io.reactivex.internal.fuseable.ScalarCallable r4 = (io.reactivex.internal.fuseable.ScalarCallable) r4
            java.lang.Object r4 = r4.call()
            if (r4 != 0) goto L1c
            io.reactivex.Observable r3 = empty()
            return r3
        L1c:
            io.reactivex.Observable r3 = io.reactivex.internal.operators.observable.ObservableScalarXMap.scalarXMap(r4, r3)
            return r3
        L21:
            io.reactivex.internal.operators.observable.ObservableSwitchMap r0 = new io.reactivex.internal.operators.observable.ObservableSwitchMap
            r1 = 0
            r0.<init>(r2, r3, r4, r1)
            io.reactivex.Observable r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable switchMapCompletable(io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> r3) {
            r2 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.mixed.ObservableSwitchMapCompletable r0 = new io.reactivex.internal.operators.mixed.ObservableSwitchMapCompletable
            r1 = 0
            r0.<init>(r2, r3, r1)
            io.reactivex.Completable r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable switchMapCompletableDelayError(io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> r3) {
            r2 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.mixed.ObservableSwitchMapCompletable r0 = new io.reactivex.internal.operators.mixed.ObservableSwitchMapCompletable
            r1 = 1
            r0.<init>(r2, r3, r1)
            io.reactivex.Completable r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Observable<R> switchMapDelayError(io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> r2) {
            r1 = this;
            int r0 = bufferSize()
            io.reactivex.Observable r2 = r1.switchMapDelayError(r2, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Observable<R> switchMapDelayError(io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> r3, int r4) {
            r2 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "bufferSize"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r4, r0)
            boolean r0 = r2 instanceof io.reactivex.internal.fuseable.ScalarCallable
            if (r0 == 0) goto L21
            r4 = r2
            io.reactivex.internal.fuseable.ScalarCallable r4 = (io.reactivex.internal.fuseable.ScalarCallable) r4
            java.lang.Object r4 = r4.call()
            if (r4 != 0) goto L1c
            io.reactivex.Observable r3 = empty()
            return r3
        L1c:
            io.reactivex.Observable r3 = io.reactivex.internal.operators.observable.ObservableScalarXMap.scalarXMap(r4, r3)
            return r3
        L21:
            io.reactivex.internal.operators.observable.ObservableSwitchMap r0 = new io.reactivex.internal.operators.observable.ObservableSwitchMap
            r1 = 1
            r0.<init>(r2, r3, r4, r1)
            io.reactivex.Observable r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Observable<R> switchMapMaybe(io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> r3) {
            r2 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe r0 = new io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe
            r1 = 0
            r0.<init>(r2, r3, r1)
            io.reactivex.Observable r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Observable<R> switchMapMaybeDelayError(io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> r3) {
            r2 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe r0 = new io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe
            r1 = 1
            r0.<init>(r2, r3, r1)
            io.reactivex.Observable r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Observable<R> switchMapSingle(io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> r3) {
            r2 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle r0 = new io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle
            r1 = 0
            r0.<init>(r2, r3, r1)
            io.reactivex.Observable r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Observable<R> switchMapSingleDelayError(io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> r3) {
            r2 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle r0 = new io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle
            r1 = 1
            r0.<init>(r2, r3, r1)
            io.reactivex.Observable r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> take(long r4) {
            r3 = this;
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L10
            io.reactivex.internal.operators.observable.ObservableTake r0 = new io.reactivex.internal.operators.observable.ObservableTake
            r0.<init>(r3, r4)
            io.reactivex.Observable r4 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r4
        L10:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "count >= 0 required but it was "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> take(long r1, java.util.concurrent.TimeUnit r3) {
            r0 = this;
            io.reactivex.Observable r1 = timer(r1, r3)
            io.reactivex.Observable r1 = r0.takeUntil(r1)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> take(long r1, java.util.concurrent.TimeUnit r3, io.reactivex.Scheduler r4) {
            r0 = this;
            io.reactivex.Observable r1 = timer(r1, r3, r4)
            io.reactivex.Observable r1 = r0.takeUntil(r1)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> takeLast(int r4) {
            r3 = this;
            if (r4 < 0) goto L25
            if (r4 != 0) goto Le
            io.reactivex.internal.operators.observable.ObservableIgnoreElements r4 = new io.reactivex.internal.operators.observable.ObservableIgnoreElements
            r4.<init>(r3)
            io.reactivex.Observable r4 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r4)
            return r4
        Le:
            r0 = 1
            if (r4 != r0) goto L1b
            io.reactivex.internal.operators.observable.ObservableTakeLastOne r4 = new io.reactivex.internal.operators.observable.ObservableTakeLastOne
            r4.<init>(r3)
            io.reactivex.Observable r4 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r4)
            return r4
        L1b:
            io.reactivex.internal.operators.observable.ObservableTakeLast r0 = new io.reactivex.internal.operators.observable.ObservableTakeLast
            r0.<init>(r3, r4)
            io.reactivex.Observable r4 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r4
        L25:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "count >= 0 required but it was "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:trampoline")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> takeLast(long r10, long r12, java.util.concurrent.TimeUnit r14) {
            r9 = this;
            io.reactivex.Scheduler r6 = io.reactivex.schedulers.Schedulers.trampoline()
            r7 = 0
            int r8 = bufferSize()
            r0 = r9
            r1 = r10
            r3 = r12
            r5 = r14
            io.reactivex.Observable r10 = r0.takeLast(r1, r3, r5, r6, r7, r8)
            return r10
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> takeLast(long r10, long r12, java.util.concurrent.TimeUnit r14, io.reactivex.Scheduler r15) {
            r9 = this;
            r7 = 0
            int r8 = bufferSize()
            r0 = r9
            r1 = r10
            r3 = r12
            r5 = r14
            r6 = r15
            io.reactivex.Observable r10 = r0.takeLast(r1, r3, r5, r6, r7, r8)
            return r10
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> takeLast(long r12, long r14, java.util.concurrent.TimeUnit r16, io.reactivex.Scheduler r17, boolean r18, int r19) {
            r11 = this;
            r2 = r12
            java.lang.String r0 = "unit is null"
            r6 = r16
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r0)
            java.lang.String r0 = "scheduler is null"
            r7 = r17
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r0)
            java.lang.String r0 = "bufferSize"
            r8 = r19
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r8, r0)
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L32
            io.reactivex.internal.operators.observable.ObservableTakeLastTimed r10 = new io.reactivex.internal.operators.observable.ObservableTakeLastTimed
            r0 = r10
            r1 = r11
            r2 = r12
            r4 = r14
            r6 = r16
            r7 = r17
            r8 = r19
            r9 = r18
            r0.<init>(r1, r2, r4, r6, r7, r8, r9)
            io.reactivex.Observable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r10)
            return r0
        L32:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "count >= 0 required but it was "
            r1.<init>(r4)
            java.lang.StringBuilder r1 = r1.append(r12)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:trampoline")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> takeLast(long r8, java.util.concurrent.TimeUnit r10) {
            r7 = this;
            io.reactivex.Scheduler r4 = io.reactivex.schedulers.Schedulers.trampoline()
            r5 = 0
            int r6 = bufferSize()
            r0 = r7
            r1 = r8
            r3 = r10
            io.reactivex.Observable r8 = r0.takeLast(r1, r3, r4, r5, r6)
            return r8
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> takeLast(long r8, java.util.concurrent.TimeUnit r10, io.reactivex.Scheduler r11) {
            r7 = this;
            r5 = 0
            int r6 = bufferSize()
            r0 = r7
            r1 = r8
            r3 = r10
            r4 = r11
            io.reactivex.Observable r8 = r0.takeLast(r1, r3, r4, r5, r6)
            return r8
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> takeLast(long r8, java.util.concurrent.TimeUnit r10, io.reactivex.Scheduler r11, boolean r12) {
            r7 = this;
            int r6 = bufferSize()
            r0 = r7
            r1 = r8
            r3 = r10
            r4 = r11
            r5 = r12
            io.reactivex.Observable r8 = r0.takeLast(r1, r3, r4, r5, r6)
            return r8
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> takeLast(long r10, java.util.concurrent.TimeUnit r12, io.reactivex.Scheduler r13, boolean r14, int r15) {
            r9 = this;
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r0 = r9
            r3 = r10
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            io.reactivex.Observable r10 = r0.takeLast(r1, r3, r5, r6, r7, r8)
            return r10
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:trampoline")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> takeLast(long r8, java.util.concurrent.TimeUnit r10, boolean r11) {
            r7 = this;
            io.reactivex.Scheduler r4 = io.reactivex.schedulers.Schedulers.trampoline()
            int r6 = bufferSize()
            r0 = r7
            r1 = r8
            r3 = r10
            r5 = r11
            io.reactivex.Observable r8 = r0.takeLast(r1, r3, r4, r5, r6)
            return r8
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <U> io.reactivex.Observable<T> takeUntil(io.reactivex.ObservableSource<U> r2) {
            r1 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.observable.ObservableTakeUntil r0 = new io.reactivex.internal.operators.observable.ObservableTakeUntil
            r0.<init>(r1, r2)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> takeUntil(io.reactivex.functions.Predicate<? super T> r2) {
            r1 = this;
            java.lang.String r0 = "predicate is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.observable.ObservableTakeUntilPredicate r0 = new io.reactivex.internal.operators.observable.ObservableTakeUntilPredicate
            r0.<init>(r1, r2)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> takeWhile(io.reactivex.functions.Predicate<? super T> r2) {
            r1 = this;
            java.lang.String r0 = "predicate is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.observable.ObservableTakeWhile r0 = new io.reactivex.internal.operators.observable.ObservableTakeWhile
            r0.<init>(r1, r2)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
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
            r0.dispose()
        La:
            r1.subscribe(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> throttleFirst(long r2, java.util.concurrent.TimeUnit r4) {
            r1 = this;
            io.reactivex.Scheduler r0 = io.reactivex.schedulers.Schedulers.computation()
            io.reactivex.Observable r2 = r1.throttleFirst(r2, r4, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> throttleFirst(long r8, java.util.concurrent.TimeUnit r10, io.reactivex.Scheduler r11) {
            r7 = this;
            java.lang.String r0 = "unit is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r10, r0)
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r11, r0)
            io.reactivex.internal.operators.observable.ObservableThrottleFirstTimed r0 = new io.reactivex.internal.operators.observable.ObservableThrottleFirstTimed
            r1 = r0
            r2 = r7
            r3 = r8
            r5 = r10
            r6 = r11
            r1.<init>(r2, r3, r5, r6)
            io.reactivex.Observable r8 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r8
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> throttleLast(long r1, java.util.concurrent.TimeUnit r3) {
            r0 = this;
            io.reactivex.Observable r1 = r0.sample(r1, r3)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> throttleLast(long r1, java.util.concurrent.TimeUnit r3, io.reactivex.Scheduler r4) {
            r0 = this;
            io.reactivex.Observable r1 = r0.sample(r1, r3, r4)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> throttleLatest(long r7, java.util.concurrent.TimeUnit r9) {
            r6 = this;
            io.reactivex.Scheduler r4 = io.reactivex.schedulers.Schedulers.computation()
            r5 = 0
            r0 = r6
            r1 = r7
            r3 = r9
            io.reactivex.Observable r7 = r0.throttleLatest(r1, r3, r4, r5)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> throttleLatest(long r7, java.util.concurrent.TimeUnit r9, io.reactivex.Scheduler r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r3 = r9
            r4 = r10
            io.reactivex.Observable r7 = r0.throttleLatest(r1, r3, r4, r5)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> throttleLatest(long r9, java.util.concurrent.TimeUnit r11, io.reactivex.Scheduler r12, boolean r13) {
            r8 = this;
            java.lang.String r0 = "unit is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r11, r0)
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r12, r0)
            io.reactivex.internal.operators.observable.ObservableThrottleLatest r0 = new io.reactivex.internal.operators.observable.ObservableThrottleLatest
            r1 = r0
            r2 = r8
            r3 = r9
            r5 = r11
            r6 = r12
            r7 = r13
            r1.<init>(r2, r3, r5, r6, r7)
            io.reactivex.Observable r9 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r9
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> throttleLatest(long r7, java.util.concurrent.TimeUnit r9, boolean r10) {
            r6 = this;
            io.reactivex.Scheduler r4 = io.reactivex.schedulers.Schedulers.computation()
            r0 = r6
            r1 = r7
            r3 = r9
            r5 = r10
            io.reactivex.Observable r7 = r0.throttleLatest(r1, r3, r4, r5)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> throttleWithTimeout(long r1, java.util.concurrent.TimeUnit r3) {
            r0 = this;
            io.reactivex.Observable r1 = r0.debounce(r1, r3)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> throttleWithTimeout(long r1, java.util.concurrent.TimeUnit r3, io.reactivex.Scheduler r4) {
            r0 = this;
            io.reactivex.Observable r1 = r0.debounce(r1, r3, r4)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<io.reactivex.schedulers.Timed<T>> timeInterval() {
            r2 = this;
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            io.reactivex.Scheduler r1 = io.reactivex.schedulers.Schedulers.computation()
            io.reactivex.Observable r0 = r2.timeInterval(r0, r1)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<io.reactivex.schedulers.Timed<T>> timeInterval(io.reactivex.Scheduler r2) {
            r1 = this;
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            io.reactivex.Observable r2 = r1.timeInterval(r0, r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<io.reactivex.schedulers.Timed<T>> timeInterval(java.util.concurrent.TimeUnit r2) {
            r1 = this;
            io.reactivex.Scheduler r0 = io.reactivex.schedulers.Schedulers.computation()
            io.reactivex.Observable r2 = r1.timeInterval(r2, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<io.reactivex.schedulers.Timed<T>> timeInterval(java.util.concurrent.TimeUnit r2, io.reactivex.Scheduler r3) {
            r1 = this;
            java.lang.String r0 = "unit is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.observable.ObservableTimeInterval r0 = new io.reactivex.internal.operators.observable.ObservableTimeInterval
            r0.<init>(r1, r2, r3)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> timeout(long r7, java.util.concurrent.TimeUnit r9) {
            r6 = this;
            r4 = 0
            io.reactivex.Scheduler r5 = io.reactivex.schedulers.Schedulers.computation()
            r0 = r6
            r1 = r7
            r3 = r9
            io.reactivex.Observable r7 = r0.timeout0(r1, r3, r4, r5)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> timeout(long r8, java.util.concurrent.TimeUnit r10, io.reactivex.ObservableSource<? extends T> r11) {
            r7 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r11, r0)
            io.reactivex.Scheduler r6 = io.reactivex.schedulers.Schedulers.computation()
            r1 = r7
            r2 = r8
            r4 = r10
            r5 = r11
            io.reactivex.Observable r8 = r1.timeout0(r2, r4, r5, r6)
            return r8
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> timeout(long r7, java.util.concurrent.TimeUnit r9, io.reactivex.Scheduler r10) {
            r6 = this;
            r4 = 0
            r0 = r6
            r1 = r7
            r3 = r9
            r5 = r10
            io.reactivex.Observable r7 = r0.timeout0(r1, r3, r4, r5)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> timeout(long r7, java.util.concurrent.TimeUnit r9, io.reactivex.Scheduler r10, io.reactivex.ObservableSource<? extends T> r11) {
            r6 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r11, r0)
            r0 = r6
            r1 = r7
            r3 = r9
            r4 = r11
            r5 = r10
            io.reactivex.Observable r7 = r0.timeout0(r1, r3, r4, r5)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <U, V> io.reactivex.Observable<T> timeout(io.reactivex.ObservableSource<U> r2, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<V>> r3) {
            r1 = this;
            java.lang.String r0 = "firstTimeoutIndicator is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            r0 = 0
            io.reactivex.Observable r2 = r1.timeout0(r2, r3, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <U, V> io.reactivex.Observable<T> timeout(io.reactivex.ObservableSource<U> r2, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<V>> r3, io.reactivex.ObservableSource<? extends T> r4) {
            r1 = this;
            java.lang.String r0 = "firstTimeoutIndicator is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            io.reactivex.Observable r2 = r1.timeout0(r2, r3, r4)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <V> io.reactivex.Observable<T> timeout(io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<V>> r2) {
            r1 = this;
            r0 = 0
            io.reactivex.Observable r2 = r1.timeout0(r0, r2, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <V> io.reactivex.Observable<T> timeout(io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<V>> r2, io.reactivex.ObservableSource<? extends T> r3) {
            r1 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            r0 = 0
            io.reactivex.Observable r2 = r1.timeout0(r0, r2, r3)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<io.reactivex.schedulers.Timed<T>> timestamp() {
            r2 = this;
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            io.reactivex.Scheduler r1 = io.reactivex.schedulers.Schedulers.computation()
            io.reactivex.Observable r0 = r2.timestamp(r0, r1)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<io.reactivex.schedulers.Timed<T>> timestamp(io.reactivex.Scheduler r2) {
            r1 = this;
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            io.reactivex.Observable r2 = r1.timestamp(r0, r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<io.reactivex.schedulers.Timed<T>> timestamp(java.util.concurrent.TimeUnit r2) {
            r1 = this;
            io.reactivex.Scheduler r0 = io.reactivex.schedulers.Schedulers.computation()
            io.reactivex.Observable r2 = r1.timestamp(r2, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<io.reactivex.schedulers.Timed<T>> timestamp(java.util.concurrent.TimeUnit r2, io.reactivex.Scheduler r3) {
            r1 = this;
            java.lang.String r0 = "unit is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.functions.Function r2 = io.reactivex.internal.functions.Functions.timestampWith(r2, r3)
            io.reactivex.Observable r2 = r1.map(r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    /* renamed from: to */
    public final <R> R m48to(io.reactivex.functions.Function<? super io.reactivex.Observable<T>, R> r2) {
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
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.SPECIAL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> toFlowable(io.reactivex.BackpressureStrategy r3) {
            r2 = this;
            io.reactivex.internal.operators.flowable.FlowableFromObservable r0 = new io.reactivex.internal.operators.flowable.FlowableFromObservable
            r0.<init>(r2)
            int[] r1 = io.reactivex.Observable.C09501.$SwitchMap$io$reactivex$BackpressureStrategy
            int r3 = r3.ordinal()
            r3 = r1[r3]
            r1 = 1
            if (r3 == r1) goto L2e
            r1 = 2
            if (r3 == r1) goto L29
            r1 = 3
            if (r3 == r1) goto L28
            r1 = 4
            if (r3 == r1) goto L1e
            io.reactivex.Flowable r3 = r0.onBackpressureBuffer()
            return r3
        L1e:
            io.reactivex.internal.operators.flowable.FlowableOnBackpressureError r3 = new io.reactivex.internal.operators.flowable.FlowableOnBackpressureError
            r3.<init>(r0)
            io.reactivex.Flowable r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r3)
            return r3
        L28:
            return r0
        L29:
            io.reactivex.Flowable r3 = r0.onBackpressureLatest()
            return r3
        L2e:
            io.reactivex.Flowable r3 = r0.onBackpressureDrop()
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final java.util.concurrent.Future<T> toFuture() {
            r1 = this;
            io.reactivex.internal.observers.FutureObserver r0 = new io.reactivex.internal.observers.FutureObserver
            r0.<init>()
            io.reactivex.Observer r0 = r1.subscribeWith(r0)
            java.util.concurrent.Future r0 = (java.util.concurrent.Future) r0
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<java.util.List<T>> toList() {
            r1 = this;
            r0 = 16
            io.reactivex.Single r0 = r1.toList(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<java.util.List<T>> toList(int r2) {
            r1 = this;
            java.lang.String r0 = "capacityHint"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r2, r0)
            io.reactivex.internal.operators.observable.ObservableToListSingle r0 = new io.reactivex.internal.operators.observable.ObservableToListSingle
            r0.<init>(r1, r2)
            io.reactivex.Single r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <U extends java.util.Collection<? super T>> io.reactivex.Single<U> toList(java.util.concurrent.Callable<U> r2) {
            r1 = this;
            java.lang.String r0 = "collectionSupplier is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.observable.ObservableToListSingle r0 = new io.reactivex.internal.operators.observable.ObservableToListSingle
            r0.<init>(r1, r2)
            io.reactivex.Single r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <K> io.reactivex.Single<java.util.Map<K, T>> toMap(io.reactivex.functions.Function<? super T, ? extends K> r2) {
            r1 = this;
            java.lang.String r0 = "keySelector is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.util.concurrent.Callable r0 = io.reactivex.internal.util.HashMapSupplier.asCallable()
            io.reactivex.functions.BiConsumer r2 = io.reactivex.internal.functions.Functions.toMapKeySelector(r2)
            io.reactivex.Single r2 = r1.collect(r0, r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <K, V> io.reactivex.Single<java.util.Map<K, V>> toMap(io.reactivex.functions.Function<? super T, ? extends K> r2, io.reactivex.functions.Function<? super T, ? extends V> r3) {
            r1 = this;
            java.lang.String r0 = "keySelector is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "valueSelector is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.util.concurrent.Callable r0 = io.reactivex.internal.util.HashMapSupplier.asCallable()
            io.reactivex.functions.BiConsumer r2 = io.reactivex.internal.functions.Functions.toMapKeyValueSelector(r2, r3)
            io.reactivex.Single r2 = r1.collect(r0, r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <K, V> io.reactivex.Single<java.util.Map<K, V>> toMap(io.reactivex.functions.Function<? super T, ? extends K> r2, io.reactivex.functions.Function<? super T, ? extends V> r3, java.util.concurrent.Callable<? extends java.util.Map<K, V>> r4) {
            r1 = this;
            java.lang.String r0 = "keySelector is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "valueSelector is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "mapSupplier is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            io.reactivex.functions.BiConsumer r2 = io.reactivex.internal.functions.Functions.toMapKeyValueSelector(r2, r3)
            io.reactivex.Single r2 = r1.collect(r4, r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <K> io.reactivex.Single<java.util.Map<K, java.util.Collection<T>>> toMultimap(io.reactivex.functions.Function<? super T, ? extends K> r4) {
            r3 = this;
            io.reactivex.functions.Function r0 = io.reactivex.internal.functions.Functions.identity()
            java.util.concurrent.Callable r1 = io.reactivex.internal.util.HashMapSupplier.asCallable()
            io.reactivex.functions.Function r2 = io.reactivex.internal.util.ArrayListSupplier.asFunction()
            io.reactivex.Single r4 = r3.toMultimap(r4, r0, r1, r2)
            return r4
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <K, V> io.reactivex.Single<java.util.Map<K, java.util.Collection<V>>> toMultimap(io.reactivex.functions.Function<? super T, ? extends K> r3, io.reactivex.functions.Function<? super T, ? extends V> r4) {
            r2 = this;
            java.util.concurrent.Callable r0 = io.reactivex.internal.util.HashMapSupplier.asCallable()
            io.reactivex.functions.Function r1 = io.reactivex.internal.util.ArrayListSupplier.asFunction()
            io.reactivex.Single r3 = r2.toMultimap(r3, r4, r0, r1)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <K, V> io.reactivex.Single<java.util.Map<K, java.util.Collection<V>>> toMultimap(io.reactivex.functions.Function<? super T, ? extends K> r2, io.reactivex.functions.Function<? super T, ? extends V> r3, java.util.concurrent.Callable<java.util.Map<K, java.util.Collection<V>>> r4) {
            r1 = this;
            io.reactivex.functions.Function r0 = io.reactivex.internal.util.ArrayListSupplier.asFunction()
            io.reactivex.Single r2 = r1.toMultimap(r2, r3, r4, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <K, V> io.reactivex.Single<java.util.Map<K, java.util.Collection<V>>> toMultimap(io.reactivex.functions.Function<? super T, ? extends K> r2, io.reactivex.functions.Function<? super T, ? extends V> r3, java.util.concurrent.Callable<? extends java.util.Map<K, java.util.Collection<V>>> r4, io.reactivex.functions.Function<? super K, ? extends java.util.Collection<? super V>> r5) {
            r1 = this;
            java.lang.String r0 = "keySelector is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "valueSelector is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "mapSupplier is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            java.lang.String r0 = "collectionFactory is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            io.reactivex.functions.BiConsumer r2 = io.reactivex.internal.functions.Functions.toMultimapKeyValueSelector(r2, r3, r5)
            io.reactivex.Single r2 = r1.collect(r4, r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<java.util.List<T>> toSortedList() {
            r1 = this;
            java.util.Comparator r0 = io.reactivex.internal.functions.Functions.naturalOrder()
            io.reactivex.Single r0 = r1.toSortedList(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<java.util.List<T>> toSortedList(int r2) {
            r1 = this;
            java.util.Comparator r0 = io.reactivex.internal.functions.Functions.naturalOrder()
            io.reactivex.Single r2 = r1.toSortedList(r0, r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<java.util.List<T>> toSortedList(java.util.Comparator<? super T> r2) {
            r1 = this;
            java.lang.String r0 = "comparator is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.Single r0 = r1.toList()
            io.reactivex.functions.Function r2 = io.reactivex.internal.functions.Functions.listSorter(r2)
            io.reactivex.Single r2 = r0.map(r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<java.util.List<T>> toSortedList(java.util.Comparator<? super T> r2, int r3) {
            r1 = this;
            java.lang.String r0 = "comparator is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.Single r3 = r1.toList(r3)
            io.reactivex.functions.Function r2 = io.reactivex.internal.functions.Functions.listSorter(r2)
            io.reactivex.Single r2 = r3.map(r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> unsubscribeOn(io.reactivex.Scheduler r2) {
            r1 = this;
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.observable.ObservableUnsubscribeOn r0 = new io.reactivex.internal.operators.observable.ObservableUnsubscribeOn
            r0.<init>(r1, r2)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<io.reactivex.Observable<T>> window(long r7) {
            r6 = this;
            int r5 = bufferSize()
            r0 = r6
            r1 = r7
            r3 = r7
            io.reactivex.Observable r7 = r0.window(r1, r3, r5)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<io.reactivex.Observable<T>> window(long r7, long r9) {
            r6 = this;
            int r5 = bufferSize()
            r0 = r6
            r1 = r7
            r3 = r9
            io.reactivex.Observable r7 = r0.window(r1, r3, r5)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<io.reactivex.Observable<T>> window(long r9, long r11, int r13) {
            r8 = this;
            java.lang.String r0 = "count"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r9, r0)
            java.lang.String r0 = "skip"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r11, r0)
            java.lang.String r0 = "bufferSize"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r13, r0)
            io.reactivex.internal.operators.observable.ObservableWindow r0 = new io.reactivex.internal.operators.observable.ObservableWindow
            r1 = r0
            r2 = r8
            r3 = r9
            r5 = r11
            r7 = r13
            r1.<init>(r2, r3, r5, r7)
            io.reactivex.Observable r9 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r9
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<io.reactivex.Observable<T>> window(long r9, long r11, java.util.concurrent.TimeUnit r13) {
            r8 = this;
            io.reactivex.Scheduler r6 = io.reactivex.schedulers.Schedulers.computation()
            int r7 = bufferSize()
            r0 = r8
            r1 = r9
            r3 = r11
            r5 = r13
            io.reactivex.Observable r9 = r0.window(r1, r3, r5, r6, r7)
            return r9
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<io.reactivex.Observable<T>> window(long r9, long r11, java.util.concurrent.TimeUnit r13, io.reactivex.Scheduler r14) {
            r8 = this;
            int r7 = bufferSize()
            r0 = r8
            r1 = r9
            r3 = r11
            r5 = r13
            r6 = r14
            io.reactivex.Observable r9 = r0.window(r1, r3, r5, r6, r7)
            return r9
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<io.reactivex.Observable<T>> window(long r14, long r16, java.util.concurrent.TimeUnit r18, io.reactivex.Scheduler r19, int r20) {
            r13 = this;
            java.lang.String r0 = "timespan"
            r3 = r14
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r14, r0)
            java.lang.String r0 = "timeskip"
            r5 = r16
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r5, r0)
            java.lang.String r0 = "bufferSize"
            r11 = r20
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r11, r0)
            java.lang.String r0 = "scheduler is null"
            r8 = r19
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r8, r0)
            java.lang.String r0 = "unit is null"
            r7 = r18
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r0)
            io.reactivex.internal.operators.observable.ObservableWindowTimed r0 = new io.reactivex.internal.operators.observable.ObservableWindowTimed
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12 = 0
            r1 = r0
            r2 = r13
            r1.<init>(r2, r3, r5, r7, r8, r9, r11, r12)
            io.reactivex.Observable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<io.reactivex.Observable<T>> window(long r9, java.util.concurrent.TimeUnit r11) {
            r8 = this;
            io.reactivex.Scheduler r4 = io.reactivex.schedulers.Schedulers.computation()
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r7 = 0
            r0 = r8
            r1 = r9
            r3 = r11
            io.reactivex.Observable r9 = r0.window(r1, r3, r4, r5, r7)
            return r9
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<io.reactivex.Observable<T>> window(long r9, java.util.concurrent.TimeUnit r11, long r12) {
            r8 = this;
            io.reactivex.Scheduler r4 = io.reactivex.schedulers.Schedulers.computation()
            r7 = 0
            r0 = r8
            r1 = r9
            r3 = r11
            r5 = r12
            io.reactivex.Observable r9 = r0.window(r1, r3, r4, r5, r7)
            return r9
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<io.reactivex.Observable<T>> window(long r9, java.util.concurrent.TimeUnit r11, long r12, boolean r14) {
            r8 = this;
            io.reactivex.Scheduler r4 = io.reactivex.schedulers.Schedulers.computation()
            r0 = r8
            r1 = r9
            r3 = r11
            r5 = r12
            r7 = r14
            io.reactivex.Observable r9 = r0.window(r1, r3, r4, r5, r7)
            return r9
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<io.reactivex.Observable<T>> window(long r9, java.util.concurrent.TimeUnit r11, io.reactivex.Scheduler r12) {
            r8 = this;
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r7 = 0
            r0 = r8
            r1 = r9
            r3 = r11
            r4 = r12
            io.reactivex.Observable r9 = r0.window(r1, r3, r4, r5, r7)
            return r9
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<io.reactivex.Observable<T>> window(long r9, java.util.concurrent.TimeUnit r11, io.reactivex.Scheduler r12, long r13) {
            r8 = this;
            r7 = 0
            r0 = r8
            r1 = r9
            r3 = r11
            r4 = r12
            r5 = r13
            io.reactivex.Observable r9 = r0.window(r1, r3, r4, r5, r7)
            return r9
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<io.reactivex.Observable<T>> window(long r10, java.util.concurrent.TimeUnit r12, io.reactivex.Scheduler r13, long r14, boolean r16) {
            r9 = this;
            int r8 = bufferSize()
            r0 = r9
            r1 = r10
            r3 = r12
            r4 = r13
            r5 = r14
            r7 = r16
            io.reactivex.Observable r0 = r0.window(r1, r3, r4, r5, r7, r8)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<io.reactivex.Observable<T>> window(long r14, java.util.concurrent.TimeUnit r16, io.reactivex.Scheduler r17, long r18, boolean r20, int r21) {
            r13 = this;
            java.lang.String r0 = "bufferSize"
            r11 = r21
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r11, r0)
            java.lang.String r0 = "scheduler is null"
            r8 = r17
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r8, r0)
            java.lang.String r0 = "unit is null"
            r7 = r16
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r0)
            java.lang.String r0 = "count"
            r9 = r18
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r9, r0)
            io.reactivex.internal.operators.observable.ObservableWindowTimed r0 = new io.reactivex.internal.operators.observable.ObservableWindowTimed
            r1 = r0
            r2 = r13
            r3 = r14
            r5 = r14
            r12 = r20
            r1.<init>(r2, r3, r5, r7, r8, r9, r11, r12)
            io.reactivex.Observable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <B> io.reactivex.Observable<io.reactivex.Observable<T>> window(io.reactivex.ObservableSource<B> r2) {
            r1 = this;
            int r0 = bufferSize()
            io.reactivex.Observable r2 = r1.window(r2, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <B> io.reactivex.Observable<io.reactivex.Observable<T>> window(io.reactivex.ObservableSource<B> r2, int r3) {
            r1 = this;
            java.lang.String r0 = "boundary is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "bufferSize"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r3, r0)
            io.reactivex.internal.operators.observable.ObservableWindowBoundary r0 = new io.reactivex.internal.operators.observable.ObservableWindowBoundary
            r0.<init>(r1, r2, r3)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <U, V> io.reactivex.Observable<io.reactivex.Observable<T>> window(io.reactivex.ObservableSource<U> r2, io.reactivex.functions.Function<? super U, ? extends io.reactivex.ObservableSource<V>> r3) {
            r1 = this;
            int r0 = bufferSize()
            io.reactivex.Observable r2 = r1.window(r2, r3, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <U, V> io.reactivex.Observable<io.reactivex.Observable<T>> window(io.reactivex.ObservableSource<U> r2, io.reactivex.functions.Function<? super U, ? extends io.reactivex.ObservableSource<V>> r3, int r4) {
            r1 = this;
            java.lang.String r0 = "openingIndicator is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "closingIndicator is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "bufferSize"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r4, r0)
            io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector r0 = new io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector
            r0.<init>(r1, r2, r3, r4)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <B> io.reactivex.Observable<io.reactivex.Observable<T>> window(java.util.concurrent.Callable<? extends io.reactivex.ObservableSource<B>> r2) {
            r1 = this;
            int r0 = bufferSize()
            io.reactivex.Observable r2 = r1.window(r2, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <B> io.reactivex.Observable<io.reactivex.Observable<T>> window(java.util.concurrent.Callable<? extends io.reactivex.ObservableSource<B>> r2, int r3) {
            r1 = this;
            java.lang.String r0 = "boundary is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "bufferSize"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r3, r0)
            io.reactivex.internal.operators.observable.ObservableWindowBoundarySupplier r0 = new io.reactivex.internal.operators.observable.ObservableWindowBoundarySupplier
            r0.<init>(r1, r2, r3)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <T1, T2, T3, T4, R> io.reactivex.Observable<R> withLatestFrom(io.reactivex.ObservableSource<T1> r3, io.reactivex.ObservableSource<T2> r4, io.reactivex.ObservableSource<T3> r5, io.reactivex.ObservableSource<T4> r6, io.reactivex.functions.Function5<? super T, ? super T1, ? super T2, ? super T3, ? super T4, R> r7) {
            r2 = this;
            java.lang.String r0 = "o1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "o2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            java.lang.String r0 = "o3 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            java.lang.String r0 = "o4 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r0)
            java.lang.String r0 = "combiner is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r0)
            io.reactivex.functions.Function r7 = io.reactivex.internal.functions.Functions.toFunction(r7)
            r0 = 4
            io.reactivex.ObservableSource[] r0 = new io.reactivex.ObservableSource[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            r3 = 2
            r0[r3] = r5
            r3 = 3
            r0[r3] = r6
            io.reactivex.Observable r3 = r2.withLatestFrom(r0, r7)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <T1, T2, T3, R> io.reactivex.Observable<R> withLatestFrom(io.reactivex.ObservableSource<T1> r3, io.reactivex.ObservableSource<T2> r4, io.reactivex.ObservableSource<T3> r5, io.reactivex.functions.Function4<? super T, ? super T1, ? super T2, ? super T3, R> r6) {
            r2 = this;
            java.lang.String r0 = "o1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "o2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            java.lang.String r0 = "o3 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            java.lang.String r0 = "combiner is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r0)
            io.reactivex.functions.Function r6 = io.reactivex.internal.functions.Functions.toFunction(r6)
            r0 = 3
            io.reactivex.ObservableSource[] r0 = new io.reactivex.ObservableSource[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            r3 = 2
            r0[r3] = r5
            io.reactivex.Observable r3 = r2.withLatestFrom(r0, r6)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <T1, T2, R> io.reactivex.Observable<R> withLatestFrom(io.reactivex.ObservableSource<T1> r3, io.reactivex.ObservableSource<T2> r4, io.reactivex.functions.Function3<? super T, ? super T1, ? super T2, R> r5) {
            r2 = this;
            java.lang.String r0 = "o1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "o2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            java.lang.String r0 = "combiner is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            io.reactivex.functions.Function r5 = io.reactivex.internal.functions.Functions.toFunction(r5)
            r0 = 2
            io.reactivex.ObservableSource[] r0 = new io.reactivex.ObservableSource[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            io.reactivex.Observable r3 = r2.withLatestFrom(r0, r5)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <U, R> io.reactivex.Observable<R> withLatestFrom(io.reactivex.ObservableSource<? extends U> r2, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> r3) {
            r1 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "combiner is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.observable.ObservableWithLatestFrom r0 = new io.reactivex.internal.operators.observable.ObservableWithLatestFrom
            r0.<init>(r1, r3, r2)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Observable<R> withLatestFrom(java.lang.Iterable<? extends io.reactivex.ObservableSource<?>> r2, io.reactivex.functions.Function<? super java.lang.Object[], R> r3) {
            r1 = this;
            java.lang.String r0 = "others is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "combiner is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.observable.ObservableWithLatestFromMany r0 = new io.reactivex.internal.operators.observable.ObservableWithLatestFromMany
            r0.<init>(r1, r2, r3)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Observable<R> withLatestFrom(io.reactivex.ObservableSource<?>[] r2, io.reactivex.functions.Function<? super java.lang.Object[], R> r3) {
            r1 = this;
            java.lang.String r0 = "others is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "combiner is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.observable.ObservableWithLatestFromMany r0 = new io.reactivex.internal.operators.observable.ObservableWithLatestFromMany
            r0.<init>(r1, r2, r3)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <U, R> io.reactivex.Observable<R> zipWith(io.reactivex.ObservableSource<? extends U> r2, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> r3) {
            r1 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.Observable r2 = zip(r1, r2, r3)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <U, R> io.reactivex.Observable<R> zipWith(io.reactivex.ObservableSource<? extends U> r1, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> r2, boolean r3) {
            r0 = this;
            io.reactivex.Observable r1 = zip(r0, r1, r2, r3)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <U, R> io.reactivex.Observable<R> zipWith(io.reactivex.ObservableSource<? extends U> r1, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> r2, boolean r3, int r4) {
            r0 = this;
            io.reactivex.Observable r1 = zip(r0, r1, r2, r3, r4)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.CheckReturnValue
    public final <U, R> io.reactivex.Observable<R> zipWith(java.lang.Iterable<U> r2, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> r3) {
            r1 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "zipper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.observable.ObservableZipIterable r0 = new io.reactivex.internal.operators.observable.ObservableZipIterable
            r0.<init>(r1, r2, r3)
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }
}
