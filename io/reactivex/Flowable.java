package io.reactivex;

/* loaded from: classes.dex */
public abstract class Flowable<T> implements org.reactivestreams.Publisher<T> {
    static final int BUFFER_SIZE = 0;

    static {
            java.lang.String r0 = "rx2.buffer-size"
            r1 = 128(0x80, float:1.794E-43)
            java.lang.Integer r0 = java.lang.Integer.getInteger(r0, r1)
            int r0 = r0.intValue()
            r1 = 1
            int r0 = java.lang.Math.max(r1, r0)
            io.reactivex.Flowable.BUFFER_SIZE = r0
            return
    }

    public Flowable() {
            r0 = this;
            r0.<init>()
            return
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> amb(java.lang.Iterable<? extends org.reactivestreams.Publisher<? extends T>> r2) {
            java.lang.String r0 = "sources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.flowable.FlowableAmb r0 = new io.reactivex.internal.operators.flowable.FlowableAmb
            r1 = 0
            r0.<init>(r1, r2)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> ambArray(org.reactivestreams.Publisher<? extends T>... r2) {
            java.lang.String r0 = "sources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            int r0 = r2.length
            if (r0 != 0) goto Ld
            io.reactivex.Flowable r2 = empty()
            return r2
        Ld:
            r1 = 1
            if (r0 != r1) goto L18
            r0 = 0
            r2 = r2[r0]
            io.reactivex.Flowable r2 = fromPublisher(r2)
            return r2
        L18:
            io.reactivex.internal.operators.flowable.FlowableAmb r0 = new io.reactivex.internal.operators.flowable.FlowableAmb
            r1 = 0
            r0.<init>(r2, r1)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    public static int bufferSize() {
            int r0 = io.reactivex.Flowable.BUFFER_SIZE
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T, R> io.reactivex.Flowable<R> combineLatest(io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r1, org.reactivestreams.Publisher<? extends T>... r2) {
            int r0 = bufferSize()
            io.reactivex.Flowable r1 = combineLatest(r2, r1, r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T, R> io.reactivex.Flowable<R> combineLatest(java.lang.Iterable<? extends org.reactivestreams.Publisher<? extends T>> r1, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r2) {
            int r0 = bufferSize()
            io.reactivex.Flowable r1 = combineLatest(r1, r2, r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T, R> io.reactivex.Flowable<R> combineLatest(java.lang.Iterable<? extends org.reactivestreams.Publisher<? extends T>> r2, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r3, int r4) {
            java.lang.String r0 = "sources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "combiner is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "bufferSize"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r4, r0)
            io.reactivex.internal.operators.flowable.FlowableCombineLatest r0 = new io.reactivex.internal.operators.flowable.FlowableCombineLatest
            r1 = 0
            r0.<init>(r2, r3, r4, r1)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T1, T2, R> io.reactivex.Flowable<R> combineLatest(org.reactivestreams.Publisher<? extends T1> r2, org.reactivestreams.Publisher<? extends T2> r3, io.reactivex.functions.BiFunction<? super T1, ? super T2, ? extends R> r4) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.functions.Function r4 = io.reactivex.internal.functions.Functions.toFunction(r4)
            r0 = 2
            org.reactivestreams.Publisher[] r0 = new org.reactivestreams.Publisher[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            io.reactivex.Flowable r2 = combineLatest(r4, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T1, T2, T3, R> io.reactivex.Flowable<R> combineLatest(org.reactivestreams.Publisher<? extends T1> r2, org.reactivestreams.Publisher<? extends T2> r3, org.reactivestreams.Publisher<? extends T3> r4, io.reactivex.functions.Function3<? super T1, ? super T2, ? super T3, ? extends R> r5) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source3 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            io.reactivex.functions.Function r5 = io.reactivex.internal.functions.Functions.toFunction(r5)
            r0 = 3
            org.reactivestreams.Publisher[] r0 = new org.reactivestreams.Publisher[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            io.reactivex.Flowable r2 = combineLatest(r5, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T1, T2, T3, T4, R> io.reactivex.Flowable<R> combineLatest(org.reactivestreams.Publisher<? extends T1> r2, org.reactivestreams.Publisher<? extends T2> r3, org.reactivestreams.Publisher<? extends T3> r4, org.reactivestreams.Publisher<? extends T4> r5, io.reactivex.functions.Function4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> r6) {
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
            org.reactivestreams.Publisher[] r0 = new org.reactivestreams.Publisher[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            r2 = 3
            r0[r2] = r5
            io.reactivex.Flowable r2 = combineLatest(r6, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T1, T2, T3, T4, T5, R> io.reactivex.Flowable<R> combineLatest(org.reactivestreams.Publisher<? extends T1> r2, org.reactivestreams.Publisher<? extends T2> r3, org.reactivestreams.Publisher<? extends T3> r4, org.reactivestreams.Publisher<? extends T4> r5, org.reactivestreams.Publisher<? extends T5> r6, io.reactivex.functions.Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> r7) {
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
            org.reactivestreams.Publisher[] r0 = new org.reactivestreams.Publisher[r0]
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
            io.reactivex.Flowable r2 = combineLatest(r7, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T1, T2, T3, T4, T5, T6, R> io.reactivex.Flowable<R> combineLatest(org.reactivestreams.Publisher<? extends T1> r2, org.reactivestreams.Publisher<? extends T2> r3, org.reactivestreams.Publisher<? extends T3> r4, org.reactivestreams.Publisher<? extends T4> r5, org.reactivestreams.Publisher<? extends T5> r6, org.reactivestreams.Publisher<? extends T6> r7, io.reactivex.functions.Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> r8) {
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
            org.reactivestreams.Publisher[] r0 = new org.reactivestreams.Publisher[r0]
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
            io.reactivex.Flowable r2 = combineLatest(r8, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T1, T2, T3, T4, T5, T6, T7, R> io.reactivex.Flowable<R> combineLatest(org.reactivestreams.Publisher<? extends T1> r2, org.reactivestreams.Publisher<? extends T2> r3, org.reactivestreams.Publisher<? extends T3> r4, org.reactivestreams.Publisher<? extends T4> r5, org.reactivestreams.Publisher<? extends T5> r6, org.reactivestreams.Publisher<? extends T6> r7, org.reactivestreams.Publisher<? extends T7> r8, io.reactivex.functions.Function7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> r9) {
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
            org.reactivestreams.Publisher[] r0 = new org.reactivestreams.Publisher[r0]
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
            io.reactivex.Flowable r2 = combineLatest(r9, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> io.reactivex.Flowable<R> combineLatest(org.reactivestreams.Publisher<? extends T1> r2, org.reactivestreams.Publisher<? extends T2> r3, org.reactivestreams.Publisher<? extends T3> r4, org.reactivestreams.Publisher<? extends T4> r5, org.reactivestreams.Publisher<? extends T5> r6, org.reactivestreams.Publisher<? extends T6> r7, org.reactivestreams.Publisher<? extends T7> r8, org.reactivestreams.Publisher<? extends T8> r9, io.reactivex.functions.Function8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> r10) {
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
            org.reactivestreams.Publisher[] r0 = new org.reactivestreams.Publisher[r0]
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
            io.reactivex.Flowable r2 = combineLatest(r10, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> io.reactivex.Flowable<R> combineLatest(org.reactivestreams.Publisher<? extends T1> r2, org.reactivestreams.Publisher<? extends T2> r3, org.reactivestreams.Publisher<? extends T3> r4, org.reactivestreams.Publisher<? extends T4> r5, org.reactivestreams.Publisher<? extends T5> r6, org.reactivestreams.Publisher<? extends T6> r7, org.reactivestreams.Publisher<? extends T7> r8, org.reactivestreams.Publisher<? extends T8> r9, org.reactivestreams.Publisher<? extends T9> r10, io.reactivex.functions.Function9<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> r11) {
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
            org.reactivestreams.Publisher[] r0 = new org.reactivestreams.Publisher[r0]
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
            io.reactivex.Flowable r2 = combineLatest(r11, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T, R> io.reactivex.Flowable<R> combineLatest(org.reactivestreams.Publisher<? extends T>[] r1, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r2) {
            int r0 = bufferSize()
            io.reactivex.Flowable r1 = combineLatest(r1, r2, r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T, R> io.reactivex.Flowable<R> combineLatest(org.reactivestreams.Publisher<? extends T>[] r2, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r3, int r4) {
            java.lang.String r0 = "sources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            int r0 = r2.length
            if (r0 != 0) goto Ld
            io.reactivex.Flowable r2 = empty()
            return r2
        Ld:
            java.lang.String r0 = "combiner is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "bufferSize"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r4, r0)
            io.reactivex.internal.operators.flowable.FlowableCombineLatest r0 = new io.reactivex.internal.operators.flowable.FlowableCombineLatest
            r1 = 0
            r0.<init>(r2, r3, r4, r1)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T, R> io.reactivex.Flowable<R> combineLatestDelayError(io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r0, int r1, org.reactivestreams.Publisher<? extends T>... r2) {
            io.reactivex.Flowable r0 = combineLatestDelayError(r2, r0, r1)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T, R> io.reactivex.Flowable<R> combineLatestDelayError(io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r1, org.reactivestreams.Publisher<? extends T>... r2) {
            int r0 = bufferSize()
            io.reactivex.Flowable r1 = combineLatestDelayError(r2, r1, r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T, R> io.reactivex.Flowable<R> combineLatestDelayError(java.lang.Iterable<? extends org.reactivestreams.Publisher<? extends T>> r1, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r2) {
            int r0 = bufferSize()
            io.reactivex.Flowable r1 = combineLatestDelayError(r1, r2, r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T, R> io.reactivex.Flowable<R> combineLatestDelayError(java.lang.Iterable<? extends org.reactivestreams.Publisher<? extends T>> r2, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r3, int r4) {
            java.lang.String r0 = "sources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "combiner is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "bufferSize"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r4, r0)
            io.reactivex.internal.operators.flowable.FlowableCombineLatest r0 = new io.reactivex.internal.operators.flowable.FlowableCombineLatest
            r1 = 1
            r0.<init>(r2, r3, r4, r1)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T, R> io.reactivex.Flowable<R> combineLatestDelayError(org.reactivestreams.Publisher<? extends T>[] r1, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r2) {
            int r0 = bufferSize()
            io.reactivex.Flowable r1 = combineLatestDelayError(r1, r2, r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T, R> io.reactivex.Flowable<R> combineLatestDelayError(org.reactivestreams.Publisher<? extends T>[] r2, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r3, int r4) {
            java.lang.String r0 = "sources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "combiner is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "bufferSize"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r4, r0)
            int r0 = r2.length
            if (r0 != 0) goto L17
            io.reactivex.Flowable r2 = empty()
            return r2
        L17:
            io.reactivex.internal.operators.flowable.FlowableCombineLatest r0 = new io.reactivex.internal.operators.flowable.FlowableCombineLatest
            r1 = 1
            r0.<init>(r2, r3, r4, r1)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> concat(java.lang.Iterable<? extends org.reactivestreams.Publisher<? extends T>> r3) {
            java.lang.String r0 = "sources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.Flowable r3 = fromIterable(r3)
            io.reactivex.functions.Function r0 = io.reactivex.internal.functions.Functions.identity()
            r1 = 2
            r2 = 0
            io.reactivex.Flowable r3 = r3.concatMapDelayError(r0, r1, r2)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> concat(org.reactivestreams.Publisher<? extends org.reactivestreams.Publisher<? extends T>> r1) {
            int r0 = bufferSize()
            io.reactivex.Flowable r1 = concat(r1, r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> concat(org.reactivestreams.Publisher<? extends org.reactivestreams.Publisher<? extends T>> r1, int r2) {
            io.reactivex.Flowable r1 = fromPublisher(r1)
            io.reactivex.functions.Function r0 = io.reactivex.internal.functions.Functions.identity()
            io.reactivex.Flowable r1 = r1.concatMap(r0, r2)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> concat(org.reactivestreams.Publisher<? extends T> r2, org.reactivestreams.Publisher<? extends T> r3) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            r0 = 2
            org.reactivestreams.Publisher[] r0 = new org.reactivestreams.Publisher[r0]
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
    public static <T> io.reactivex.Flowable<T> concat(org.reactivestreams.Publisher<? extends T> r2, org.reactivestreams.Publisher<? extends T> r3, org.reactivestreams.Publisher<? extends T> r4) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source3 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            r0 = 3
            org.reactivestreams.Publisher[] r0 = new org.reactivestreams.Publisher[r0]
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
    public static <T> io.reactivex.Flowable<T> concat(org.reactivestreams.Publisher<? extends T> r2, org.reactivestreams.Publisher<? extends T> r3, org.reactivestreams.Publisher<? extends T> r4, org.reactivestreams.Publisher<? extends T> r5) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source3 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            java.lang.String r0 = "source4 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            r0 = 4
            org.reactivestreams.Publisher[] r0 = new org.reactivestreams.Publisher[r0]
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
    public static <T> io.reactivex.Flowable<T> concatArray(org.reactivestreams.Publisher<? extends T>... r3) {
            int r0 = r3.length
            if (r0 != 0) goto L8
            io.reactivex.Flowable r3 = empty()
            return r3
        L8:
            int r0 = r3.length
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L14
            r3 = r3[r2]
            io.reactivex.Flowable r3 = fromPublisher(r3)
            return r3
        L14:
            io.reactivex.internal.operators.flowable.FlowableConcatArray r0 = new io.reactivex.internal.operators.flowable.FlowableConcatArray
            r0.<init>(r3, r2)
            io.reactivex.Flowable r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> concatArrayDelayError(org.reactivestreams.Publisher<? extends T>... r2) {
            int r0 = r2.length
            if (r0 != 0) goto L8
            io.reactivex.Flowable r2 = empty()
            return r2
        L8:
            int r0 = r2.length
            r1 = 1
            if (r0 != r1) goto L14
            r0 = 0
            r2 = r2[r0]
            io.reactivex.Flowable r2 = fromPublisher(r2)
            return r2
        L14:
            io.reactivex.internal.operators.flowable.FlowableConcatArray r0 = new io.reactivex.internal.operators.flowable.FlowableConcatArray
            r0.<init>(r2, r1)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> concatArrayEager(int r7, int r8, org.reactivestreams.Publisher<? extends T>... r9) {
            java.lang.String r0 = "sources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r9, r0)
            java.lang.String r0 = "maxConcurrency"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r7, r0)
            java.lang.String r0 = "prefetch"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r8, r0)
            io.reactivex.internal.operators.flowable.FlowableConcatMapEager r0 = new io.reactivex.internal.operators.flowable.FlowableConcatMapEager
            io.reactivex.internal.operators.flowable.FlowableFromArray r2 = new io.reactivex.internal.operators.flowable.FlowableFromArray
            r2.<init>(r9)
            io.reactivex.functions.Function r3 = io.reactivex.internal.functions.Functions.identity()
            io.reactivex.internal.util.ErrorMode r6 = io.reactivex.internal.util.ErrorMode.IMMEDIATE
            r1 = r0
            r4 = r7
            r5 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            io.reactivex.Flowable r7 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> concatArrayEager(org.reactivestreams.Publisher<? extends T>... r2) {
            int r0 = bufferSize()
            int r1 = bufferSize()
            io.reactivex.Flowable r2 = concatArrayEager(r0, r1, r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> concatDelayError(java.lang.Iterable<? extends org.reactivestreams.Publisher<? extends T>> r1) {
            java.lang.String r0 = "sources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.Flowable r1 = fromIterable(r1)
            io.reactivex.functions.Function r0 = io.reactivex.internal.functions.Functions.identity()
            io.reactivex.Flowable r1 = r1.concatMapDelayError(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> concatDelayError(org.reactivestreams.Publisher<? extends org.reactivestreams.Publisher<? extends T>> r2) {
            int r0 = bufferSize()
            r1 = 1
            io.reactivex.Flowable r2 = concatDelayError(r2, r0, r1)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> concatDelayError(org.reactivestreams.Publisher<? extends org.reactivestreams.Publisher<? extends T>> r1, int r2, boolean r3) {
            io.reactivex.Flowable r1 = fromPublisher(r1)
            io.reactivex.functions.Function r0 = io.reactivex.internal.functions.Functions.identity()
            io.reactivex.Flowable r1 = r1.concatMapDelayError(r0, r2, r3)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> concatEager(java.lang.Iterable<? extends org.reactivestreams.Publisher<? extends T>> r2) {
            int r0 = bufferSize()
            int r1 = bufferSize()
            io.reactivex.Flowable r2 = concatEager(r2, r0, r1)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> concatEager(java.lang.Iterable<? extends org.reactivestreams.Publisher<? extends T>> r7, int r8, int r9) {
            java.lang.String r0 = "sources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r0)
            java.lang.String r0 = "maxConcurrency"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r8, r0)
            java.lang.String r0 = "prefetch"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r9, r0)
            io.reactivex.internal.operators.flowable.FlowableConcatMapEager r0 = new io.reactivex.internal.operators.flowable.FlowableConcatMapEager
            io.reactivex.internal.operators.flowable.FlowableFromIterable r2 = new io.reactivex.internal.operators.flowable.FlowableFromIterable
            r2.<init>(r7)
            io.reactivex.functions.Function r3 = io.reactivex.internal.functions.Functions.identity()
            io.reactivex.internal.util.ErrorMode r6 = io.reactivex.internal.util.ErrorMode.IMMEDIATE
            r1 = r0
            r4 = r8
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            io.reactivex.Flowable r7 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> concatEager(org.reactivestreams.Publisher<? extends org.reactivestreams.Publisher<? extends T>> r2) {
            int r0 = bufferSize()
            int r1 = bufferSize()
            io.reactivex.Flowable r2 = concatEager(r2, r0, r1)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> concatEager(org.reactivestreams.Publisher<? extends org.reactivestreams.Publisher<? extends T>> r7, int r8, int r9) {
            java.lang.String r0 = "sources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r0)
            java.lang.String r0 = "maxConcurrency"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r8, r0)
            java.lang.String r0 = "prefetch"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r9, r0)
            io.reactivex.internal.operators.flowable.FlowableConcatMapEagerPublisher r0 = new io.reactivex.internal.operators.flowable.FlowableConcatMapEagerPublisher
            io.reactivex.functions.Function r3 = io.reactivex.internal.functions.Functions.identity()
            io.reactivex.internal.util.ErrorMode r6 = io.reactivex.internal.util.ErrorMode.IMMEDIATE
            r1 = r0
            r2 = r7
            r4 = r8
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            io.reactivex.Flowable r7 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.SPECIAL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> create(io.reactivex.FlowableOnSubscribe<T> r1, io.reactivex.BackpressureStrategy r2) {
            java.lang.String r0 = "source is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            java.lang.String r0 = "mode is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.flowable.FlowableCreate r0 = new io.reactivex.internal.operators.flowable.FlowableCreate
            r0.<init>(r1, r2)
            io.reactivex.Flowable r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> defer(java.util.concurrent.Callable<? extends org.reactivestreams.Publisher<? extends T>> r1) {
            java.lang.String r0 = "supplier is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.internal.operators.flowable.FlowableDefer r0 = new io.reactivex.internal.operators.flowable.FlowableDefer
            r0.<init>(r1)
            io.reactivex.Flowable r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    private io.reactivex.Flowable<T> doOnEach(io.reactivex.functions.Consumer<? super T> r8, io.reactivex.functions.Consumer<? super java.lang.Throwable> r9, io.reactivex.functions.Action r10, io.reactivex.functions.Action r11) {
            r7 = this;
            java.lang.String r0 = "onNext is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r8, r0)
            java.lang.String r0 = "onError is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r9, r0)
            java.lang.String r0 = "onComplete is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r10, r0)
            java.lang.String r0 = "onAfterTerminate is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r11, r0)
            io.reactivex.internal.operators.flowable.FlowableDoOnEach r0 = new io.reactivex.internal.operators.flowable.FlowableDoOnEach
            r1 = r0
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            io.reactivex.Flowable r8 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r8
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> empty() {
            io.reactivex.Flowable<java.lang.Object> r0 = io.reactivex.internal.operators.flowable.FlowableEmpty.INSTANCE
            io.reactivex.Flowable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> error(java.lang.Throwable r1) {
            java.lang.String r0 = "throwable is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            java.util.concurrent.Callable r1 = io.reactivex.internal.functions.Functions.justCallable(r1)
            io.reactivex.Flowable r1 = error(r1)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> error(java.util.concurrent.Callable<? extends java.lang.Throwable> r1) {
            java.lang.String r0 = "errorSupplier is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.internal.operators.flowable.FlowableError r0 = new io.reactivex.internal.operators.flowable.FlowableError
            r0.<init>(r1)
            io.reactivex.Flowable r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> fromArray(T... r2) {
            java.lang.String r0 = "items is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            int r0 = r2.length
            if (r0 != 0) goto Ld
            io.reactivex.Flowable r2 = empty()
            return r2
        Ld:
            int r0 = r2.length
            r1 = 1
            if (r0 != r1) goto L19
            r0 = 0
            r2 = r2[r0]
            io.reactivex.Flowable r2 = just(r2)
            return r2
        L19:
            io.reactivex.internal.operators.flowable.FlowableFromArray r0 = new io.reactivex.internal.operators.flowable.FlowableFromArray
            r0.<init>(r2)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> fromCallable(java.util.concurrent.Callable<? extends T> r1) {
            java.lang.String r0 = "supplier is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.internal.operators.flowable.FlowableFromCallable r0 = new io.reactivex.internal.operators.flowable.FlowableFromCallable
            r0.<init>(r1)
            io.reactivex.Flowable r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> fromFuture(java.util.concurrent.Future<? extends T> r4) {
            java.lang.String r0 = "future is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            io.reactivex.internal.operators.flowable.FlowableFromFuture r0 = new io.reactivex.internal.operators.flowable.FlowableFromFuture
            r1 = 0
            r3 = 0
            r0.<init>(r4, r1, r3)
            io.reactivex.Flowable r4 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r4
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> fromFuture(java.util.concurrent.Future<? extends T> r1, long r2, java.util.concurrent.TimeUnit r4) {
            java.lang.String r0 = "future is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            java.lang.String r0 = "unit is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            io.reactivex.internal.operators.flowable.FlowableFromFuture r0 = new io.reactivex.internal.operators.flowable.FlowableFromFuture
            r0.<init>(r1, r2, r4)
            io.reactivex.Flowable r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> fromFuture(java.util.concurrent.Future<? extends T> r1, long r2, java.util.concurrent.TimeUnit r4, io.reactivex.Scheduler r5) {
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            io.reactivex.Flowable r1 = fromFuture(r1, r2, r4)
            io.reactivex.Flowable r1 = r1.subscribeOn(r5)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> fromFuture(java.util.concurrent.Future<? extends T> r1, io.reactivex.Scheduler r2) {
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.Flowable r1 = fromFuture(r1)
            io.reactivex.Flowable r1 = r1.subscribeOn(r2)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> fromIterable(java.lang.Iterable<? extends T> r1) {
            java.lang.String r0 = "source is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.internal.operators.flowable.FlowableFromIterable r0 = new io.reactivex.internal.operators.flowable.FlowableFromIterable
            r0.<init>(r1)
            io.reactivex.Flowable r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> fromPublisher(org.reactivestreams.Publisher<? extends T> r1) {
            boolean r0 = r1 instanceof io.reactivex.Flowable
            if (r0 == 0) goto Lb
            io.reactivex.Flowable r1 = (io.reactivex.Flowable) r1
            io.reactivex.Flowable r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r1)
            return r1
        Lb:
            java.lang.String r0 = "publisher is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.internal.operators.flowable.FlowableFromPublisher r0 = new io.reactivex.internal.operators.flowable.FlowableFromPublisher
            r0.<init>(r1)
            io.reactivex.Flowable r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> generate(io.reactivex.functions.Consumer<io.reactivex.Emitter<T>> r2) {
            java.lang.String r0 = "generator is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.util.concurrent.Callable r0 = io.reactivex.internal.functions.Functions.nullSupplier()
            io.reactivex.functions.BiFunction r2 = io.reactivex.internal.operators.flowable.FlowableInternalHelper.simpleGenerator(r2)
            io.reactivex.functions.Consumer r1 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.Flowable r2 = generate(r0, r2, r1)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T, S> io.reactivex.Flowable<T> generate(java.util.concurrent.Callable<S> r1, io.reactivex.functions.BiConsumer<S, io.reactivex.Emitter<T>> r2) {
            java.lang.String r0 = "generator is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.functions.BiFunction r2 = io.reactivex.internal.operators.flowable.FlowableInternalHelper.simpleBiGenerator(r2)
            io.reactivex.functions.Consumer r0 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.Flowable r1 = generate(r1, r2, r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T, S> io.reactivex.Flowable<T> generate(java.util.concurrent.Callable<S> r1, io.reactivex.functions.BiConsumer<S, io.reactivex.Emitter<T>> r2, io.reactivex.functions.Consumer<? super S> r3) {
            java.lang.String r0 = "generator is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.functions.BiFunction r2 = io.reactivex.internal.operators.flowable.FlowableInternalHelper.simpleBiGenerator(r2)
            io.reactivex.Flowable r1 = generate(r1, r2, r3)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T, S> io.reactivex.Flowable<T> generate(java.util.concurrent.Callable<S> r1, io.reactivex.functions.BiFunction<S, io.reactivex.Emitter<T>, S> r2) {
            io.reactivex.functions.Consumer r0 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.Flowable r1 = generate(r1, r2, r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T, S> io.reactivex.Flowable<T> generate(java.util.concurrent.Callable<S> r1, io.reactivex.functions.BiFunction<S, io.reactivex.Emitter<T>, S> r2, io.reactivex.functions.Consumer<? super S> r3) {
            java.lang.String r0 = "initialState is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            java.lang.String r0 = "generator is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "disposeState is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.flowable.FlowableGenerate r0 = new io.reactivex.internal.operators.flowable.FlowableGenerate
            r0.<init>(r1, r2, r3)
            io.reactivex.Flowable r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public static io.reactivex.Flowable<java.lang.Long> interval(long r6, long r8, java.util.concurrent.TimeUnit r10) {
            io.reactivex.Scheduler r5 = io.reactivex.schedulers.Schedulers.computation()
            r0 = r6
            r2 = r8
            r4 = r10
            io.reactivex.Flowable r6 = interval(r0, r2, r4, r5)
            return r6
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public static io.reactivex.Flowable<java.lang.Long> interval(long r8, long r10, java.util.concurrent.TimeUnit r12, io.reactivex.Scheduler r13) {
            java.lang.String r0 = "unit is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r12, r0)
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r13, r0)
            io.reactivex.internal.operators.flowable.FlowableInterval r0 = new io.reactivex.internal.operators.flowable.FlowableInterval
            r1 = 0
            long r8 = java.lang.Math.max(r1, r8)
            long r4 = java.lang.Math.max(r1, r10)
            r1 = r0
            r2 = r8
            r6 = r12
            r7 = r13
            r1.<init>(r2, r4, r6, r7)
            io.reactivex.Flowable r8 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r8
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public static io.reactivex.Flowable<java.lang.Long> interval(long r6, java.util.concurrent.TimeUnit r8) {
            io.reactivex.Scheduler r5 = io.reactivex.schedulers.Schedulers.computation()
            r0 = r6
            r2 = r6
            r4 = r8
            io.reactivex.Flowable r6 = interval(r0, r2, r4, r5)
            return r6
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public static io.reactivex.Flowable<java.lang.Long> interval(long r6, java.util.concurrent.TimeUnit r8, io.reactivex.Scheduler r9) {
            r0 = r6
            r2 = r6
            r4 = r8
            r5 = r9
            io.reactivex.Flowable r6 = interval(r0, r2, r4, r5)
            return r6
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public static io.reactivex.Flowable<java.lang.Long> intervalRange(long r10, long r12, long r14, long r16, java.util.concurrent.TimeUnit r18) {
            io.reactivex.Scheduler r9 = io.reactivex.schedulers.Schedulers.computation()
            r0 = r10
            r2 = r12
            r4 = r14
            r6 = r16
            r8 = r18
            io.reactivex.Flowable r0 = intervalRange(r0, r2, r4, r6, r8, r9)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public static io.reactivex.Flowable<java.lang.Long> intervalRange(long r16, long r18, long r20, long r22, java.util.concurrent.TimeUnit r24, io.reactivex.Scheduler r25) {
            r0 = r18
            r2 = r20
            r9 = r24
            r10 = r25
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 < 0) goto L57
            if (r6 != 0) goto L19
            io.reactivex.Flowable r0 = empty()
            io.reactivex.Flowable r0 = r0.delay(r2, r9, r10)
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
            io.reactivex.internal.operators.flowable.FlowableIntervalRange r11 = new io.reactivex.internal.operators.flowable.FlowableIntervalRange
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
            io.reactivex.Flowable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r11)
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
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> just(T r1) {
            java.lang.String r0 = "item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            io.reactivex.internal.operators.flowable.FlowableJust r0 = new io.reactivex.internal.operators.flowable.FlowableJust
            r0.<init>(r1)
            io.reactivex.Flowable r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> just(T r2, T r3) {
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
            io.reactivex.Flowable r2 = fromArray(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> just(T r2, T r3, T r4) {
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
            io.reactivex.Flowable r2 = fromArray(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> just(T r2, T r3, T r4, T r5) {
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
            io.reactivex.Flowable r2 = fromArray(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> just(T r2, T r3, T r4, T r5, T r6) {
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
            io.reactivex.Flowable r2 = fromArray(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> just(T r2, T r3, T r4, T r5, T r6, T r7) {
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
            io.reactivex.Flowable r2 = fromArray(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> just(T r2, T r3, T r4, T r5, T r6, T r7, T r8) {
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
            io.reactivex.Flowable r2 = fromArray(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> just(T r2, T r3, T r4, T r5, T r6, T r7, T r8, T r9) {
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
            io.reactivex.Flowable r2 = fromArray(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> just(T r2, T r3, T r4, T r5, T r6, T r7, T r8, T r9, T r10) {
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
            java.lang.String r0 = "The ninth is null"
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
            io.reactivex.Flowable r2 = fromArray(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> just(T r2, T r3, T r4, T r5, T r6, T r7, T r8, T r9, T r10, T r11) {
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
            io.reactivex.Flowable r2 = fromArray(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> merge(java.lang.Iterable<? extends org.reactivestreams.Publisher<? extends T>> r1) {
            io.reactivex.Flowable r1 = fromIterable(r1)
            io.reactivex.functions.Function r0 = io.reactivex.internal.functions.Functions.identity()
            io.reactivex.Flowable r1 = r1.flatMap(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> merge(java.lang.Iterable<? extends org.reactivestreams.Publisher<? extends T>> r1, int r2) {
            io.reactivex.Flowable r1 = fromIterable(r1)
            io.reactivex.functions.Function r0 = io.reactivex.internal.functions.Functions.identity()
            io.reactivex.Flowable r1 = r1.flatMap(r0, r2)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> merge(java.lang.Iterable<? extends org.reactivestreams.Publisher<? extends T>> r2, int r3, int r4) {
            io.reactivex.Flowable r2 = fromIterable(r2)
            io.reactivex.functions.Function r0 = io.reactivex.internal.functions.Functions.identity()
            r1 = 0
            io.reactivex.Flowable r2 = r2.flatMap(r0, r1, r3, r4)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> merge(org.reactivestreams.Publisher<? extends org.reactivestreams.Publisher<? extends T>> r1) {
            int r0 = bufferSize()
            io.reactivex.Flowable r1 = merge(r1, r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> merge(org.reactivestreams.Publisher<? extends org.reactivestreams.Publisher<? extends T>> r1, int r2) {
            io.reactivex.Flowable r1 = fromPublisher(r1)
            io.reactivex.functions.Function r0 = io.reactivex.internal.functions.Functions.identity()
            io.reactivex.Flowable r1 = r1.flatMap(r0, r2)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> merge(org.reactivestreams.Publisher<? extends T> r3, org.reactivestreams.Publisher<? extends T> r4) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            r0 = 2
            org.reactivestreams.Publisher[] r1 = new org.reactivestreams.Publisher[r0]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            io.reactivex.Flowable r3 = fromArray(r1)
            io.reactivex.functions.Function r4 = io.reactivex.internal.functions.Functions.identity()
            io.reactivex.Flowable r3 = r3.flatMap(r4, r2, r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> merge(org.reactivestreams.Publisher<? extends T> r3, org.reactivestreams.Publisher<? extends T> r4, org.reactivestreams.Publisher<? extends T> r5) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            java.lang.String r0 = "source3 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            r0 = 3
            org.reactivestreams.Publisher[] r1 = new org.reactivestreams.Publisher[r0]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r3 = 2
            r1[r3] = r5
            io.reactivex.Flowable r3 = fromArray(r1)
            io.reactivex.functions.Function r4 = io.reactivex.internal.functions.Functions.identity()
            io.reactivex.Flowable r3 = r3.flatMap(r4, r2, r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> merge(org.reactivestreams.Publisher<? extends T> r3, org.reactivestreams.Publisher<? extends T> r4, org.reactivestreams.Publisher<? extends T> r5, org.reactivestreams.Publisher<? extends T> r6) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            java.lang.String r0 = "source3 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            java.lang.String r0 = "source4 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r0)
            r0 = 4
            org.reactivestreams.Publisher[] r1 = new org.reactivestreams.Publisher[r0]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r3 = 2
            r1[r3] = r5
            r3 = 3
            r1[r3] = r6
            io.reactivex.Flowable r3 = fromArray(r1)
            io.reactivex.functions.Function r4 = io.reactivex.internal.functions.Functions.identity()
            io.reactivex.Flowable r3 = r3.flatMap(r4, r2, r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> mergeArray(int r2, int r3, org.reactivestreams.Publisher<? extends T>... r4) {
            io.reactivex.Flowable r4 = fromArray(r4)
            io.reactivex.functions.Function r0 = io.reactivex.internal.functions.Functions.identity()
            r1 = 0
            io.reactivex.Flowable r2 = r4.flatMap(r0, r1, r2, r3)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> mergeArray(org.reactivestreams.Publisher<? extends T>... r2) {
            io.reactivex.Flowable r0 = fromArray(r2)
            io.reactivex.functions.Function r1 = io.reactivex.internal.functions.Functions.identity()
            int r2 = r2.length
            io.reactivex.Flowable r2 = r0.flatMap(r1, r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> mergeArrayDelayError(int r2, int r3, org.reactivestreams.Publisher<? extends T>... r4) {
            io.reactivex.Flowable r4 = fromArray(r4)
            io.reactivex.functions.Function r0 = io.reactivex.internal.functions.Functions.identity()
            r1 = 1
            io.reactivex.Flowable r2 = r4.flatMap(r0, r1, r2, r3)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> mergeArrayDelayError(org.reactivestreams.Publisher<? extends T>... r3) {
            io.reactivex.Flowable r0 = fromArray(r3)
            io.reactivex.functions.Function r1 = io.reactivex.internal.functions.Functions.identity()
            r2 = 1
            int r3 = r3.length
            io.reactivex.Flowable r3 = r0.flatMap(r1, r2, r3)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> mergeDelayError(java.lang.Iterable<? extends org.reactivestreams.Publisher<? extends T>> r2) {
            io.reactivex.Flowable r2 = fromIterable(r2)
            io.reactivex.functions.Function r0 = io.reactivex.internal.functions.Functions.identity()
            r1 = 1
            io.reactivex.Flowable r2 = r2.flatMap(r0, r1)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> mergeDelayError(java.lang.Iterable<? extends org.reactivestreams.Publisher<? extends T>> r2, int r3) {
            io.reactivex.Flowable r2 = fromIterable(r2)
            io.reactivex.functions.Function r0 = io.reactivex.internal.functions.Functions.identity()
            r1 = 1
            io.reactivex.Flowable r2 = r2.flatMap(r0, r1, r3)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> mergeDelayError(java.lang.Iterable<? extends org.reactivestreams.Publisher<? extends T>> r2, int r3, int r4) {
            io.reactivex.Flowable r2 = fromIterable(r2)
            io.reactivex.functions.Function r0 = io.reactivex.internal.functions.Functions.identity()
            r1 = 1
            io.reactivex.Flowable r2 = r2.flatMap(r0, r1, r3, r4)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> mergeDelayError(org.reactivestreams.Publisher<? extends org.reactivestreams.Publisher<? extends T>> r1) {
            int r0 = bufferSize()
            io.reactivex.Flowable r1 = mergeDelayError(r1, r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> mergeDelayError(org.reactivestreams.Publisher<? extends org.reactivestreams.Publisher<? extends T>> r2, int r3) {
            io.reactivex.Flowable r2 = fromPublisher(r2)
            io.reactivex.functions.Function r0 = io.reactivex.internal.functions.Functions.identity()
            r1 = 1
            io.reactivex.Flowable r2 = r2.flatMap(r0, r1, r3)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> mergeDelayError(org.reactivestreams.Publisher<? extends T> r3, org.reactivestreams.Publisher<? extends T> r4) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            r0 = 2
            org.reactivestreams.Publisher[] r1 = new org.reactivestreams.Publisher[r0]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            io.reactivex.Flowable r4 = fromArray(r1)
            io.reactivex.functions.Function r1 = io.reactivex.internal.functions.Functions.identity()
            io.reactivex.Flowable r3 = r4.flatMap(r1, r3, r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> mergeDelayError(org.reactivestreams.Publisher<? extends T> r3, org.reactivestreams.Publisher<? extends T> r4, org.reactivestreams.Publisher<? extends T> r5) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            java.lang.String r0 = "source3 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            r0 = 3
            org.reactivestreams.Publisher[] r1 = new org.reactivestreams.Publisher[r0]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r4 = 2
            r1[r4] = r5
            io.reactivex.Flowable r4 = fromArray(r1)
            io.reactivex.functions.Function r5 = io.reactivex.internal.functions.Functions.identity()
            io.reactivex.Flowable r3 = r4.flatMap(r5, r3, r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> mergeDelayError(org.reactivestreams.Publisher<? extends T> r3, org.reactivestreams.Publisher<? extends T> r4, org.reactivestreams.Publisher<? extends T> r5, org.reactivestreams.Publisher<? extends T> r6) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            java.lang.String r0 = "source3 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            java.lang.String r0 = "source4 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r0)
            r0 = 4
            org.reactivestreams.Publisher[] r1 = new org.reactivestreams.Publisher[r0]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r4 = 2
            r1[r4] = r5
            r4 = 3
            r1[r4] = r6
            io.reactivex.Flowable r4 = fromArray(r1)
            io.reactivex.functions.Function r5 = io.reactivex.internal.functions.Functions.identity()
            io.reactivex.Flowable r3 = r4.flatMap(r5, r3, r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> never() {
            io.reactivex.Flowable<java.lang.Object> r0 = io.reactivex.internal.operators.flowable.FlowableNever.INSTANCE
            io.reactivex.Flowable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static io.reactivex.Flowable<java.lang.Integer> range(int r4, int r5) {
            if (r5 < 0) goto L33
            if (r5 != 0) goto L9
            io.reactivex.Flowable r4 = empty()
            return r4
        L9:
            r0 = 1
            if (r5 != r0) goto L15
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            io.reactivex.Flowable r4 = just(r4)
            return r4
        L15:
            long r0 = (long) r4
            int r2 = r5 + (-1)
            long r2 = (long) r2
            long r0 = r0 + r2
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L2b
            io.reactivex.internal.operators.flowable.FlowableRange r0 = new io.reactivex.internal.operators.flowable.FlowableRange
            r0.<init>(r4, r5)
            io.reactivex.Flowable r4 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
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
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static io.reactivex.Flowable<java.lang.Long> rangeLong(long r5, long r7) {
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 < 0) goto L3a
            if (r2 != 0) goto Ld
            io.reactivex.Flowable r5 = empty()
            return r5
        Ld:
            r2 = 1
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 != 0) goto L1c
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            io.reactivex.Flowable r5 = just(r5)
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
            io.reactivex.internal.operators.flowable.FlowableRangeLong r0 = new io.reactivex.internal.operators.flowable.FlowableRangeLong
            r0.<init>(r5, r7)
            io.reactivex.Flowable r5 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
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
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Single<java.lang.Boolean> sequenceEqual(org.reactivestreams.Publisher<? extends T> r2, org.reactivestreams.Publisher<? extends T> r3) {
            io.reactivex.functions.BiPredicate r0 = io.reactivex.internal.functions.ObjectHelper.equalsPredicate()
            int r1 = bufferSize()
            io.reactivex.Single r2 = sequenceEqual(r2, r3, r0, r1)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Single<java.lang.Boolean> sequenceEqual(org.reactivestreams.Publisher<? extends T> r1, org.reactivestreams.Publisher<? extends T> r2, int r3) {
            io.reactivex.functions.BiPredicate r0 = io.reactivex.internal.functions.ObjectHelper.equalsPredicate()
            io.reactivex.Single r1 = sequenceEqual(r1, r2, r0, r3)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Single<java.lang.Boolean> sequenceEqual(org.reactivestreams.Publisher<? extends T> r1, org.reactivestreams.Publisher<? extends T> r2, io.reactivex.functions.BiPredicate<? super T, ? super T> r3) {
            int r0 = bufferSize()
            io.reactivex.Single r1 = sequenceEqual(r1, r2, r3, r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Single<java.lang.Boolean> sequenceEqual(org.reactivestreams.Publisher<? extends T> r1, org.reactivestreams.Publisher<? extends T> r2, io.reactivex.functions.BiPredicate<? super T, ? super T> r3, int r4) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "isEqual is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "bufferSize"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r4, r0)
            io.reactivex.internal.operators.flowable.FlowableSequenceEqualSingle r0 = new io.reactivex.internal.operators.flowable.FlowableSequenceEqualSingle
            r0.<init>(r1, r2, r3, r4)
            io.reactivex.Single r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> switchOnNext(org.reactivestreams.Publisher<? extends org.reactivestreams.Publisher<? extends T>> r1) {
            io.reactivex.Flowable r1 = fromPublisher(r1)
            io.reactivex.functions.Function r0 = io.reactivex.internal.functions.Functions.identity()
            io.reactivex.Flowable r1 = r1.switchMap(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> switchOnNext(org.reactivestreams.Publisher<? extends org.reactivestreams.Publisher<? extends T>> r1, int r2) {
            io.reactivex.Flowable r1 = fromPublisher(r1)
            io.reactivex.functions.Function r0 = io.reactivex.internal.functions.Functions.identity()
            io.reactivex.Flowable r1 = r1.switchMap(r0, r2)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> switchOnNextDelayError(org.reactivestreams.Publisher<? extends org.reactivestreams.Publisher<? extends T>> r1) {
            int r0 = bufferSize()
            io.reactivex.Flowable r1 = switchOnNextDelayError(r1, r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> switchOnNextDelayError(org.reactivestreams.Publisher<? extends org.reactivestreams.Publisher<? extends T>> r1, int r2) {
            io.reactivex.Flowable r1 = fromPublisher(r1)
            io.reactivex.functions.Function r0 = io.reactivex.internal.functions.Functions.identity()
            io.reactivex.Flowable r1 = r1.switchMapDelayError(r0, r2)
            return r1
    }

    private io.reactivex.Flowable<T> timeout0(long r9, java.util.concurrent.TimeUnit r11, org.reactivestreams.Publisher<? extends T> r12, io.reactivex.Scheduler r13) {
            r8 = this;
            java.lang.String r0 = "timeUnit is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r11, r0)
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r13, r0)
            io.reactivex.internal.operators.flowable.FlowableTimeoutTimed r0 = new io.reactivex.internal.operators.flowable.FlowableTimeoutTimed
            r1 = r0
            r2 = r8
            r3 = r9
            r5 = r11
            r6 = r13
            r7 = r12
            r1.<init>(r2, r3, r5, r6, r7)
            io.reactivex.Flowable r9 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r9
    }

    private <U, V> io.reactivex.Flowable<T> timeout0(org.reactivestreams.Publisher<U> r2, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<V>> r3, org.reactivestreams.Publisher<? extends T> r4) {
            r1 = this;
            java.lang.String r0 = "itemTimeoutIndicator is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.flowable.FlowableTimeout r0 = new io.reactivex.internal.operators.flowable.FlowableTimeout
            r0.<init>(r1, r2, r3, r4)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public static io.reactivex.Flowable<java.lang.Long> timer(long r1, java.util.concurrent.TimeUnit r3) {
            io.reactivex.Scheduler r0 = io.reactivex.schedulers.Schedulers.computation()
            io.reactivex.Flowable r1 = timer(r1, r3, r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public static io.reactivex.Flowable<java.lang.Long> timer(long r3, java.util.concurrent.TimeUnit r5, io.reactivex.Scheduler r6) {
            java.lang.String r0 = "unit is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r0)
            io.reactivex.internal.operators.flowable.FlowableTimer r0 = new io.reactivex.internal.operators.flowable.FlowableTimer
            r1 = 0
            long r3 = java.lang.Math.max(r1, r3)
            r0.<init>(r3, r5, r6)
            io.reactivex.Flowable r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.NONE)
    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.Flowable<T> unsafeCreate(org.reactivestreams.Publisher<T> r1) {
            java.lang.String r0 = "onSubscribe is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            boolean r0 = r1 instanceof io.reactivex.Flowable
            if (r0 != 0) goto L13
            io.reactivex.internal.operators.flowable.FlowableFromPublisher r0 = new io.reactivex.internal.operators.flowable.FlowableFromPublisher
            r0.<init>(r1)
            io.reactivex.Flowable r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
        L13:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "unsafeCreate(Flowable) should be upgraded"
            r1.<init>(r0)
            throw r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    public static <T, D> io.reactivex.Flowable<T> using(java.util.concurrent.Callable<? extends D> r1, io.reactivex.functions.Function<? super D, ? extends org.reactivestreams.Publisher<? extends T>> r2, io.reactivex.functions.Consumer<? super D> r3) {
            r0 = 1
            io.reactivex.Flowable r1 = using(r1, r2, r3, r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    public static <T, D> io.reactivex.Flowable<T> using(java.util.concurrent.Callable<? extends D> r1, io.reactivex.functions.Function<? super D, ? extends org.reactivestreams.Publisher<? extends T>> r2, io.reactivex.functions.Consumer<? super D> r3, boolean r4) {
            java.lang.String r0 = "resourceSupplier is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r0)
            java.lang.String r0 = "sourceSupplier is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "disposer is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.flowable.FlowableUsing r0 = new io.reactivex.internal.operators.flowable.FlowableUsing
            r0.<init>(r1, r2, r3, r4)
            io.reactivex.Flowable r1 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T, R> io.reactivex.Flowable<R> zip(java.lang.Iterable<? extends org.reactivestreams.Publisher<? extends T>> r7, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r8) {
            java.lang.String r0 = "zipper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r8, r0)
            java.lang.String r0 = "sources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r0)
            io.reactivex.internal.operators.flowable.FlowableZip r0 = new io.reactivex.internal.operators.flowable.FlowableZip
            r2 = 0
            int r5 = bufferSize()
            r6 = 0
            r1 = r0
            r3 = r7
            r4 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            io.reactivex.Flowable r7 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T, R> io.reactivex.Flowable<R> zip(org.reactivestreams.Publisher<? extends org.reactivestreams.Publisher<? extends T>> r1, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r2) {
            java.lang.String r0 = "zipper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.Flowable r1 = fromPublisher(r1)
            io.reactivex.Single r1 = r1.toList()
            io.reactivex.functions.Function r2 = io.reactivex.internal.operators.flowable.FlowableInternalHelper.zipIterable(r2)
            io.reactivex.Flowable r1 = r1.flatMapPublisher(r2)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T1, T2, R> io.reactivex.Flowable<R> zip(org.reactivestreams.Publisher<? extends T1> r3, org.reactivestreams.Publisher<? extends T2> r4, io.reactivex.functions.BiFunction<? super T1, ? super T2, ? extends R> r5) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            io.reactivex.functions.Function r5 = io.reactivex.internal.functions.Functions.toFunction(r5)
            int r0 = bufferSize()
            r1 = 2
            org.reactivestreams.Publisher[] r1 = new org.reactivestreams.Publisher[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            io.reactivex.Flowable r3 = zipArray(r5, r2, r0, r1)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T1, T2, R> io.reactivex.Flowable<R> zip(org.reactivestreams.Publisher<? extends T1> r3, org.reactivestreams.Publisher<? extends T2> r4, io.reactivex.functions.BiFunction<? super T1, ? super T2, ? extends R> r5, boolean r6) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            io.reactivex.functions.Function r5 = io.reactivex.internal.functions.Functions.toFunction(r5)
            int r0 = bufferSize()
            r1 = 2
            org.reactivestreams.Publisher[] r1 = new org.reactivestreams.Publisher[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            io.reactivex.Flowable r3 = zipArray(r5, r6, r0, r1)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T1, T2, R> io.reactivex.Flowable<R> zip(org.reactivestreams.Publisher<? extends T1> r2, org.reactivestreams.Publisher<? extends T2> r3, io.reactivex.functions.BiFunction<? super T1, ? super T2, ? extends R> r4, boolean r5, int r6) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.functions.Function r4 = io.reactivex.internal.functions.Functions.toFunction(r4)
            r0 = 2
            org.reactivestreams.Publisher[] r0 = new org.reactivestreams.Publisher[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            io.reactivex.Flowable r2 = zipArray(r4, r5, r6, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T1, T2, T3, R> io.reactivex.Flowable<R> zip(org.reactivestreams.Publisher<? extends T1> r3, org.reactivestreams.Publisher<? extends T2> r4, org.reactivestreams.Publisher<? extends T3> r5, io.reactivex.functions.Function3<? super T1, ? super T2, ? super T3, ? extends R> r6) {
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            java.lang.String r0 = "source3 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            io.reactivex.functions.Function r6 = io.reactivex.internal.functions.Functions.toFunction(r6)
            int r0 = bufferSize()
            r1 = 3
            org.reactivestreams.Publisher[] r1 = new org.reactivestreams.Publisher[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r3 = 2
            r1[r3] = r5
            io.reactivex.Flowable r3 = zipArray(r6, r2, r0, r1)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T1, T2, T3, T4, R> io.reactivex.Flowable<R> zip(org.reactivestreams.Publisher<? extends T1> r3, org.reactivestreams.Publisher<? extends T2> r4, org.reactivestreams.Publisher<? extends T3> r5, org.reactivestreams.Publisher<? extends T4> r6, io.reactivex.functions.Function4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> r7) {
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
            org.reactivestreams.Publisher[] r1 = new org.reactivestreams.Publisher[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r3 = 2
            r1[r3] = r5
            r3 = 3
            r1[r3] = r6
            io.reactivex.Flowable r3 = zipArray(r7, r2, r0, r1)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T1, T2, T3, T4, T5, R> io.reactivex.Flowable<R> zip(org.reactivestreams.Publisher<? extends T1> r3, org.reactivestreams.Publisher<? extends T2> r4, org.reactivestreams.Publisher<? extends T3> r5, org.reactivestreams.Publisher<? extends T4> r6, org.reactivestreams.Publisher<? extends T5> r7, io.reactivex.functions.Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> r8) {
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
            org.reactivestreams.Publisher[] r1 = new org.reactivestreams.Publisher[r1]
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
            io.reactivex.Flowable r3 = zipArray(r8, r2, r0, r1)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T1, T2, T3, T4, T5, T6, R> io.reactivex.Flowable<R> zip(org.reactivestreams.Publisher<? extends T1> r3, org.reactivestreams.Publisher<? extends T2> r4, org.reactivestreams.Publisher<? extends T3> r5, org.reactivestreams.Publisher<? extends T4> r6, org.reactivestreams.Publisher<? extends T5> r7, org.reactivestreams.Publisher<? extends T6> r8, io.reactivex.functions.Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> r9) {
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
            org.reactivestreams.Publisher[] r1 = new org.reactivestreams.Publisher[r1]
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
            io.reactivex.Flowable r3 = zipArray(r9, r2, r0, r1)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T1, T2, T3, T4, T5, T6, T7, R> io.reactivex.Flowable<R> zip(org.reactivestreams.Publisher<? extends T1> r3, org.reactivestreams.Publisher<? extends T2> r4, org.reactivestreams.Publisher<? extends T3> r5, org.reactivestreams.Publisher<? extends T4> r6, org.reactivestreams.Publisher<? extends T5> r7, org.reactivestreams.Publisher<? extends T6> r8, org.reactivestreams.Publisher<? extends T7> r9, io.reactivex.functions.Function7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> r10) {
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
            org.reactivestreams.Publisher[] r1 = new org.reactivestreams.Publisher[r1]
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
            io.reactivex.Flowable r3 = zipArray(r10, r2, r0, r1)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> io.reactivex.Flowable<R> zip(org.reactivestreams.Publisher<? extends T1> r3, org.reactivestreams.Publisher<? extends T2> r4, org.reactivestreams.Publisher<? extends T3> r5, org.reactivestreams.Publisher<? extends T4> r6, org.reactivestreams.Publisher<? extends T5> r7, org.reactivestreams.Publisher<? extends T6> r8, org.reactivestreams.Publisher<? extends T7> r9, org.reactivestreams.Publisher<? extends T8> r10, io.reactivex.functions.Function8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> r11) {
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
            org.reactivestreams.Publisher[] r1 = new org.reactivestreams.Publisher[r1]
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
            io.reactivex.Flowable r3 = zipArray(r11, r2, r0, r1)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> io.reactivex.Flowable<R> zip(org.reactivestreams.Publisher<? extends T1> r3, org.reactivestreams.Publisher<? extends T2> r4, org.reactivestreams.Publisher<? extends T3> r5, org.reactivestreams.Publisher<? extends T4> r6, org.reactivestreams.Publisher<? extends T5> r7, org.reactivestreams.Publisher<? extends T6> r8, org.reactivestreams.Publisher<? extends T7> r9, org.reactivestreams.Publisher<? extends T8> r10, org.reactivestreams.Publisher<? extends T9> r11, io.reactivex.functions.Function9<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> r12) {
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
            org.reactivestreams.Publisher[] r1 = new org.reactivestreams.Publisher[r1]
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
            io.reactivex.Flowable r3 = zipArray(r12, r2, r0, r1)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T, R> io.reactivex.Flowable<R> zipArray(io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r7, boolean r8, int r9, org.reactivestreams.Publisher<? extends T>... r10) {
            int r0 = r10.length
            if (r0 != 0) goto L8
            io.reactivex.Flowable r7 = empty()
            return r7
        L8:
            java.lang.String r0 = "zipper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r0)
            java.lang.String r0 = "bufferSize"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r9, r0)
            io.reactivex.internal.operators.flowable.FlowableZip r0 = new io.reactivex.internal.operators.flowable.FlowableZip
            r3 = 0
            r1 = r0
            r2 = r10
            r4 = r7
            r5 = r9
            r6 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            io.reactivex.Flowable r7 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static <T, R> io.reactivex.Flowable<R> zipIterable(java.lang.Iterable<? extends org.reactivestreams.Publisher<? extends T>> r7, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> r8, boolean r9, int r10) {
            java.lang.String r0 = "zipper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r8, r0)
            java.lang.String r0 = "sources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r0)
            java.lang.String r0 = "bufferSize"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r10, r0)
            io.reactivex.internal.operators.flowable.FlowableZip r0 = new io.reactivex.internal.operators.flowable.FlowableZip
            r2 = 0
            r1 = r0
            r3 = r7
            r4 = r8
            r5 = r10
            r6 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            io.reactivex.Flowable r7 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<java.lang.Boolean> all(io.reactivex.functions.Predicate<? super T> r2) {
            r1 = this;
            java.lang.String r0 = "predicate is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.flowable.FlowableAllSingle r0 = new io.reactivex.internal.operators.flowable.FlowableAllSingle
            r0.<init>(r1, r2)
            io.reactivex.Single r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> ambWith(org.reactivestreams.Publisher<? extends T> r3) {
            r2 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            r0 = 2
            org.reactivestreams.Publisher[] r0 = new org.reactivestreams.Publisher[r0]
            r1 = 0
            r0[r1] = r2
            r1 = 1
            r0[r1] = r3
            io.reactivex.Flowable r3 = ambArray(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<java.lang.Boolean> any(io.reactivex.functions.Predicate<? super T> r2) {
            r1 = this;
            java.lang.String r0 = "predicate is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.flowable.FlowableAnySingle r0 = new io.reactivex.internal.operators.flowable.FlowableAnySingle
            r0.<init>(r1, r2)
            io.reactivex.Single r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.SPECIAL)
    @io.reactivex.annotations.CheckReturnValue
    /* renamed from: as */
    public final <R> R m43as(io.reactivex.FlowableConverter<T, ? extends R> r2) {
            r1 = this;
            java.lang.String r0 = "converter is null"
            java.lang.Object r2 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.FlowableConverter r2 = (io.reactivex.FlowableConverter) r2
            java.lang.Object r2 = r2.apply(r1)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final T blockingFirst() {
            r1 = this;
            io.reactivex.internal.subscribers.BlockingFirstSubscriber r0 = new io.reactivex.internal.subscribers.BlockingFirstSubscriber
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
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final T blockingFirst(T r2) {
            r1 = this;
            io.reactivex.internal.subscribers.BlockingFirstSubscriber r0 = new io.reactivex.internal.subscribers.BlockingFirstSubscriber
            r0.<init>()
            r1.subscribe(r0)
            java.lang.Object r0 = r0.blockingGet()
            if (r0 == 0) goto Lf
            r2 = r0
        Lf:
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
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
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final java.lang.Iterable<T> blockingIterable() {
            r1 = this;
            int r0 = bufferSize()
            java.lang.Iterable r0 = r1.blockingIterable(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final java.lang.Iterable<T> blockingIterable(int r2) {
            r1 = this;
            java.lang.String r0 = "bufferSize"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r2, r0)
            io.reactivex.internal.operators.flowable.BlockingFlowableIterable r0 = new io.reactivex.internal.operators.flowable.BlockingFlowableIterable
            r0.<init>(r1, r2)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final T blockingLast() {
            r1 = this;
            io.reactivex.internal.subscribers.BlockingLastSubscriber r0 = new io.reactivex.internal.subscribers.BlockingLastSubscriber
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
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final T blockingLast(T r2) {
            r1 = this;
            io.reactivex.internal.subscribers.BlockingLastSubscriber r0 = new io.reactivex.internal.subscribers.BlockingLastSubscriber
            r0.<init>()
            r1.subscribe(r0)
            java.lang.Object r0 = r0.blockingGet()
            if (r0 == 0) goto Lf
            r2 = r0
        Lf:
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final java.lang.Iterable<T> blockingLatest() {
            r1 = this;
            io.reactivex.internal.operators.flowable.BlockingFlowableLatest r0 = new io.reactivex.internal.operators.flowable.BlockingFlowableLatest
            r0.<init>(r1)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final java.lang.Iterable<T> blockingMostRecent(T r2) {
            r1 = this;
            io.reactivex.internal.operators.flowable.BlockingFlowableMostRecent r0 = new io.reactivex.internal.operators.flowable.BlockingFlowableMostRecent
            r0.<init>(r1, r2)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final java.lang.Iterable<T> blockingNext() {
            r1 = this;
            io.reactivex.internal.operators.flowable.BlockingFlowableNext r0 = new io.reactivex.internal.operators.flowable.BlockingFlowableNext
            r0.<init>(r1)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final T blockingSingle() {
            r1 = this;
            io.reactivex.Single r0 = r1.singleOrError()
            java.lang.Object r0 = r0.blockingGet()
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final T blockingSingle(T r1) {
            r0 = this;
            io.reactivex.Single r1 = r0.single(r1)
            java.lang.Object r1 = r1.blockingGet()
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    public final void blockingSubscribe() {
            r0 = this;
            io.reactivex.internal.operators.flowable.FlowableBlockingSubscribe.subscribe(r0)
            return
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    public final void blockingSubscribe(io.reactivex.functions.Consumer<? super T> r3) {
            r2 = this;
            io.reactivex.functions.Consumer<java.lang.Throwable> r0 = io.reactivex.internal.functions.Functions.ON_ERROR_MISSING
            io.reactivex.functions.Action r1 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.internal.operators.flowable.FlowableBlockingSubscribe.subscribe(r2, r3, r0, r1)
            return
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    public final void blockingSubscribe(io.reactivex.functions.Consumer<? super T> r3, int r4) {
            r2 = this;
            io.reactivex.functions.Consumer<java.lang.Throwable> r0 = io.reactivex.internal.functions.Functions.ON_ERROR_MISSING
            io.reactivex.functions.Action r1 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.internal.operators.flowable.FlowableBlockingSubscribe.subscribe(r2, r3, r0, r1, r4)
            return
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    public final void blockingSubscribe(io.reactivex.functions.Consumer<? super T> r2, io.reactivex.functions.Consumer<? super java.lang.Throwable> r3) {
            r1 = this;
            io.reactivex.functions.Action r0 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.internal.operators.flowable.FlowableBlockingSubscribe.subscribe(r1, r2, r3, r0)
            return
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    public final void blockingSubscribe(io.reactivex.functions.Consumer<? super T> r2, io.reactivex.functions.Consumer<? super java.lang.Throwable> r3, int r4) {
            r1 = this;
            io.reactivex.functions.Action r0 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.internal.operators.flowable.FlowableBlockingSubscribe.subscribe(r1, r2, r3, r0, r4)
            return
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    public final void blockingSubscribe(io.reactivex.functions.Consumer<? super T> r1, io.reactivex.functions.Consumer<? super java.lang.Throwable> r2, io.reactivex.functions.Action r3) {
            r0 = this;
            io.reactivex.internal.operators.flowable.FlowableBlockingSubscribe.subscribe(r0, r1, r2, r3)
            return
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    public final void blockingSubscribe(io.reactivex.functions.Consumer<? super T> r1, io.reactivex.functions.Consumer<? super java.lang.Throwable> r2, io.reactivex.functions.Action r3, int r4) {
            r0 = this;
            io.reactivex.internal.operators.flowable.FlowableBlockingSubscribe.subscribe(r0, r1, r2, r3, r4)
            return
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.SPECIAL)
    public final void blockingSubscribe(org.reactivestreams.Subscriber<? super T> r1) {
            r0 = this;
            io.reactivex.internal.operators.flowable.FlowableBlockingSubscribe.subscribe(r0, r1)
            return
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<java.util.List<T>> buffer(int r1) {
            r0 = this;
            io.reactivex.Flowable r1 = r0.buffer(r1, r1)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<java.util.List<T>> buffer(int r2, int r3) {
            r1 = this;
            java.util.concurrent.Callable r0 = io.reactivex.internal.util.ArrayListSupplier.asCallable()
            io.reactivex.Flowable r2 = r1.buffer(r2, r3, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <U extends java.util.Collection<? super T>> io.reactivex.Flowable<U> buffer(int r2, int r3, java.util.concurrent.Callable<U> r4) {
            r1 = this;
            java.lang.String r0 = "count"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r2, r0)
            java.lang.String r0 = "skip"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r3, r0)
            java.lang.String r0 = "bufferSupplier is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            io.reactivex.internal.operators.flowable.FlowableBuffer r0 = new io.reactivex.internal.operators.flowable.FlowableBuffer
            r0.<init>(r1, r2, r3, r4)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <U extends java.util.Collection<? super T>> io.reactivex.Flowable<U> buffer(int r1, java.util.concurrent.Callable<U> r2) {
            r0 = this;
            io.reactivex.Flowable r1 = r0.buffer(r1, r1, r2)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<java.util.List<T>> buffer(long r9, long r11, java.util.concurrent.TimeUnit r13) {
            r8 = this;
            io.reactivex.Scheduler r6 = io.reactivex.schedulers.Schedulers.computation()
            java.util.concurrent.Callable r7 = io.reactivex.internal.util.ArrayListSupplier.asCallable()
            r0 = r8
            r1 = r9
            r3 = r11
            r5 = r13
            io.reactivex.Flowable r9 = r0.buffer(r1, r3, r5, r6, r7)
            return r9
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<java.util.List<T>> buffer(long r9, long r11, java.util.concurrent.TimeUnit r13, io.reactivex.Scheduler r14) {
            r8 = this;
            java.util.concurrent.Callable r7 = io.reactivex.internal.util.ArrayListSupplier.asCallable()
            r0 = r8
            r1 = r9
            r3 = r11
            r5 = r13
            r6 = r14
            io.reactivex.Flowable r9 = r0.buffer(r1, r3, r5, r6, r7)
            return r9
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public final <U extends java.util.Collection<? super T>> io.reactivex.Flowable<U> buffer(long r13, long r15, java.util.concurrent.TimeUnit r17, io.reactivex.Scheduler r18, java.util.concurrent.Callable<U> r19) {
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
            io.reactivex.internal.operators.flowable.FlowableBufferTimed r0 = new io.reactivex.internal.operators.flowable.FlowableBufferTimed
            r10 = 2147483647(0x7fffffff, float:NaN)
            r11 = 0
            r1 = r0
            r2 = r12
            r3 = r13
            r5 = r15
            r1.<init>(r2, r3, r5, r7, r8, r9, r10, r11)
            io.reactivex.Flowable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<java.util.List<T>> buffer(long r7, java.util.concurrent.TimeUnit r9) {
            r6 = this;
            io.reactivex.Scheduler r4 = io.reactivex.schedulers.Schedulers.computation()
            r5 = 2147483647(0x7fffffff, float:NaN)
            r0 = r6
            r1 = r7
            r3 = r9
            io.reactivex.Flowable r7 = r0.buffer(r1, r3, r4, r5)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<java.util.List<T>> buffer(long r7, java.util.concurrent.TimeUnit r9, int r10) {
            r6 = this;
            io.reactivex.Scheduler r4 = io.reactivex.schedulers.Schedulers.computation()
            r0 = r6
            r1 = r7
            r3 = r9
            r5 = r10
            io.reactivex.Flowable r7 = r0.buffer(r1, r3, r4, r5)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<java.util.List<T>> buffer(long r9, java.util.concurrent.TimeUnit r11, io.reactivex.Scheduler r12) {
            r8 = this;
            r5 = 2147483647(0x7fffffff, float:NaN)
            java.util.concurrent.Callable r6 = io.reactivex.internal.util.ArrayListSupplier.asCallable()
            r7 = 0
            r0 = r8
            r1 = r9
            r3 = r11
            r4 = r12
            io.reactivex.Flowable r9 = r0.buffer(r1, r3, r4, r5, r6, r7)
            return r9
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<java.util.List<T>> buffer(long r9, java.util.concurrent.TimeUnit r11, io.reactivex.Scheduler r12, int r13) {
            r8 = this;
            java.util.concurrent.Callable r6 = io.reactivex.internal.util.ArrayListSupplier.asCallable()
            r7 = 0
            r0 = r8
            r1 = r9
            r3 = r11
            r4 = r12
            r5 = r13
            io.reactivex.Flowable r9 = r0.buffer(r1, r3, r4, r5, r6, r7)
            return r9
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public final <U extends java.util.Collection<? super T>> io.reactivex.Flowable<U> buffer(long r13, java.util.concurrent.TimeUnit r15, io.reactivex.Scheduler r16, int r17, java.util.concurrent.Callable<U> r18, boolean r19) {
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
            io.reactivex.internal.operators.flowable.FlowableBufferTimed r0 = new io.reactivex.internal.operators.flowable.FlowableBufferTimed
            r1 = r0
            r2 = r12
            r3 = r13
            r5 = r13
            r11 = r19
            r1.<init>(r2, r3, r5, r7, r8, r9, r10, r11)
            io.reactivex.Flowable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public final <TOpening, TClosing> io.reactivex.Flowable<java.util.List<T>> buffer(io.reactivex.Flowable<? extends TOpening> r2, io.reactivex.functions.Function<? super TOpening, ? extends org.reactivestreams.Publisher<? extends TClosing>> r3) {
            r1 = this;
            java.util.concurrent.Callable r0 = io.reactivex.internal.util.ArrayListSupplier.asCallable()
            io.reactivex.Flowable r2 = r1.buffer(r2, r3, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public final <TOpening, TClosing, U extends java.util.Collection<? super T>> io.reactivex.Flowable<U> buffer(io.reactivex.Flowable<? extends TOpening> r2, io.reactivex.functions.Function<? super TOpening, ? extends org.reactivestreams.Publisher<? extends TClosing>> r3, java.util.concurrent.Callable<U> r4) {
            r1 = this;
            java.lang.String r0 = "openingIndicator is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "closingIndicator is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "bufferSupplier is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            io.reactivex.internal.operators.flowable.FlowableBufferBoundary r0 = new io.reactivex.internal.operators.flowable.FlowableBufferBoundary
            r0.<init>(r1, r2, r3, r4)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public final <B> io.reactivex.Flowable<java.util.List<T>> buffer(java.util.concurrent.Callable<? extends org.reactivestreams.Publisher<B>> r2) {
            r1 = this;
            java.util.concurrent.Callable r0 = io.reactivex.internal.util.ArrayListSupplier.asCallable()
            io.reactivex.Flowable r2 = r1.buffer(r2, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public final <B, U extends java.util.Collection<? super T>> io.reactivex.Flowable<U> buffer(java.util.concurrent.Callable<? extends org.reactivestreams.Publisher<B>> r2, java.util.concurrent.Callable<U> r3) {
            r1 = this;
            java.lang.String r0 = "boundaryIndicatorSupplier is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "bufferSupplier is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.flowable.FlowableBufferBoundarySupplier r0 = new io.reactivex.internal.operators.flowable.FlowableBufferBoundarySupplier
            r0.<init>(r1, r2, r3)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public final <B> io.reactivex.Flowable<java.util.List<T>> buffer(org.reactivestreams.Publisher<B> r2) {
            r1 = this;
            java.util.concurrent.Callable r0 = io.reactivex.internal.util.ArrayListSupplier.asCallable()
            io.reactivex.Flowable r2 = r1.buffer(r2, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public final <B> io.reactivex.Flowable<java.util.List<T>> buffer(org.reactivestreams.Publisher<B> r2, int r3) {
            r1 = this;
            java.lang.String r0 = "initialCapacity"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r3, r0)
            java.util.concurrent.Callable r3 = io.reactivex.internal.functions.Functions.createArrayList(r3)
            io.reactivex.Flowable r2 = r1.buffer(r2, r3)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public final <B, U extends java.util.Collection<? super T>> io.reactivex.Flowable<U> buffer(org.reactivestreams.Publisher<B> r2, java.util.concurrent.Callable<U> r3) {
            r1 = this;
            java.lang.String r0 = "boundaryIndicator is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "bufferSupplier is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.flowable.FlowableBufferExactBoundary r0 = new io.reactivex.internal.operators.flowable.FlowableBufferExactBoundary
            r0.<init>(r1, r2, r3)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> cache() {
            r1 = this;
            r0 = 16
            io.reactivex.Flowable r0 = r1.cacheWithInitialCapacity(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> cacheWithInitialCapacity(int r2) {
            r1 = this;
            java.lang.String r0 = "initialCapacity"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r2, r0)
            io.reactivex.internal.operators.flowable.FlowableCache r0 = new io.reactivex.internal.operators.flowable.FlowableCache
            r0.<init>(r1, r2)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    public final <U> io.reactivex.Flowable<U> cast(java.lang.Class<U> r2) {
            r1 = this;
            java.lang.String r0 = "clazz is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.functions.Function r2 = io.reactivex.internal.functions.Functions.castFunction(r2)
            io.reactivex.Flowable r2 = r1.map(r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final <U> io.reactivex.Single<U> collect(java.util.concurrent.Callable<? extends U> r2, io.reactivex.functions.BiConsumer<? super U, ? super T> r3) {
            r1 = this;
            java.lang.String r0 = "initialItemSupplier is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "collector is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.flowable.FlowableCollectSingle r0 = new io.reactivex.internal.operators.flowable.FlowableCollectSingle
            r0.<init>(r1, r2, r3)
            io.reactivex.Single r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final <U> io.reactivex.Single<U> collectInto(U r2, io.reactivex.functions.BiConsumer<? super U, ? super T> r3) {
            r1 = this;
            java.lang.String r0 = "initialItem is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.util.concurrent.Callable r2 = io.reactivex.internal.functions.Functions.justCallable(r2)
            io.reactivex.Single r2 = r1.collect(r2, r3)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Flowable<R> compose(io.reactivex.FlowableTransformer<? super T, ? extends R> r2) {
            r1 = this;
            java.lang.String r0 = "composer is null"
            java.lang.Object r2 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.FlowableTransformer r2 = (io.reactivex.FlowableTransformer) r2
            org.reactivestreams.Publisher r2 = r2.apply(r1)
            io.reactivex.Flowable r2 = fromPublisher(r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Flowable<R> concatMap(io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r2) {
            r1 = this;
            r0 = 2
            io.reactivex.Flowable r2 = r1.concatMap(r2, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Flowable<R> concatMap(io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r3, int r4) {
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
            io.reactivex.Flowable r3 = empty()
            return r3
        L1c:
            io.reactivex.Flowable r3 = io.reactivex.internal.operators.flowable.FlowableScalarXMap.scalarXMap(r4, r3)
            return r3
        L21:
            io.reactivex.internal.operators.flowable.FlowableConcatMap r0 = new io.reactivex.internal.operators.flowable.FlowableConcatMap
            io.reactivex.internal.util.ErrorMode r1 = io.reactivex.internal.util.ErrorMode.IMMEDIATE
            r0.<init>(r2, r3, r4, r1)
            io.reactivex.Flowable r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable concatMapCompletable(io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> r2) {
            r1 = this;
            r0 = 2
            io.reactivex.Completable r2 = r1.concatMapCompletable(r2, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable concatMapCompletable(io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> r3, int r4) {
            r2 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "prefetch"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r4, r0)
            io.reactivex.internal.operators.mixed.FlowableConcatMapCompletable r0 = new io.reactivex.internal.operators.mixed.FlowableConcatMapCompletable
            io.reactivex.internal.util.ErrorMode r1 = io.reactivex.internal.util.ErrorMode.IMMEDIATE
            r0.<init>(r2, r3, r1, r4)
            io.reactivex.Completable r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable concatMapCompletableDelayError(io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> r3) {
            r2 = this;
            r0 = 1
            r1 = 2
            io.reactivex.Completable r3 = r2.concatMapCompletableDelayError(r3, r0, r1)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable concatMapCompletableDelayError(io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> r2, boolean r3) {
            r1 = this;
            r0 = 2
            io.reactivex.Completable r2 = r1.concatMapCompletableDelayError(r2, r3, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable concatMapCompletableDelayError(io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> r2, boolean r3, int r4) {
            r1 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "prefetch"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r4, r0)
            io.reactivex.internal.operators.mixed.FlowableConcatMapCompletable r0 = new io.reactivex.internal.operators.mixed.FlowableConcatMapCompletable
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
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Flowable<R> concatMapDelayError(io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r3) {
            r2 = this;
            r0 = 2
            r1 = 1
            io.reactivex.Flowable r3 = r2.concatMapDelayError(r3, r0, r1)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Flowable<R> concatMapDelayError(io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r2, int r3, boolean r4) {
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
            io.reactivex.Flowable r2 = empty()
            return r2
        L1c:
            io.reactivex.Flowable r2 = io.reactivex.internal.operators.flowable.FlowableScalarXMap.scalarXMap(r3, r2)
            return r2
        L21:
            io.reactivex.internal.operators.flowable.FlowableConcatMap r0 = new io.reactivex.internal.operators.flowable.FlowableConcatMap
            if (r4 == 0) goto L28
            io.reactivex.internal.util.ErrorMode r4 = io.reactivex.internal.util.ErrorMode.END
            goto L2a
        L28:
            io.reactivex.internal.util.ErrorMode r4 = io.reactivex.internal.util.ErrorMode.BOUNDARY
        L2a:
            r0.<init>(r1, r2, r3, r4)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Flowable<R> concatMapEager(io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r3) {
            r2 = this;
            int r0 = bufferSize()
            int r1 = bufferSize()
            io.reactivex.Flowable r3 = r2.concatMapEager(r3, r0, r1)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Flowable<R> concatMapEager(io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r8, int r9, int r10) {
            r7 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r8, r0)
            java.lang.String r0 = "maxConcurrency"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r9, r0)
            java.lang.String r0 = "prefetch"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r10, r0)
            io.reactivex.internal.operators.flowable.FlowableConcatMapEager r0 = new io.reactivex.internal.operators.flowable.FlowableConcatMapEager
            io.reactivex.internal.util.ErrorMode r6 = io.reactivex.internal.util.ErrorMode.IMMEDIATE
            r1 = r0
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            io.reactivex.Flowable r8 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r8
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Flowable<R> concatMapEagerDelayError(io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r8, int r9, int r10, boolean r11) {
            r7 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r8, r0)
            java.lang.String r0 = "maxConcurrency"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r9, r0)
            java.lang.String r0 = "prefetch"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r10, r0)
            io.reactivex.internal.operators.flowable.FlowableConcatMapEager r0 = new io.reactivex.internal.operators.flowable.FlowableConcatMapEager
            if (r11 == 0) goto L16
            io.reactivex.internal.util.ErrorMode r11 = io.reactivex.internal.util.ErrorMode.END
            goto L18
        L16:
            io.reactivex.internal.util.ErrorMode r11 = io.reactivex.internal.util.ErrorMode.BOUNDARY
        L18:
            r6 = r11
            r1 = r0
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            io.reactivex.Flowable r8 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r8
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Flowable<R> concatMapEagerDelayError(io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r3, boolean r4) {
            r2 = this;
            int r0 = bufferSize()
            int r1 = bufferSize()
            io.reactivex.Flowable r3 = r2.concatMapEagerDelayError(r3, r0, r1, r4)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <U> io.reactivex.Flowable<U> concatMapIterable(io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends U>> r2) {
            r1 = this;
            r0 = 2
            io.reactivex.Flowable r2 = r1.concatMapIterable(r2, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <U> io.reactivex.Flowable<U> concatMapIterable(io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends U>> r2, int r3) {
            r1 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "prefetch"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r3, r0)
            io.reactivex.internal.operators.flowable.FlowableFlattenIterable r0 = new io.reactivex.internal.operators.flowable.FlowableFlattenIterable
            r0.<init>(r1, r2, r3)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Flowable<R> concatMapMaybe(io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> r2) {
            r1 = this;
            r0 = 2
            io.reactivex.Flowable r2 = r1.concatMapMaybe(r2, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Flowable<R> concatMapMaybe(io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> r3, int r4) {
            r2 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "prefetch"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r4, r0)
            io.reactivex.internal.operators.mixed.FlowableConcatMapMaybe r0 = new io.reactivex.internal.operators.mixed.FlowableConcatMapMaybe
            io.reactivex.internal.util.ErrorMode r1 = io.reactivex.internal.util.ErrorMode.IMMEDIATE
            r0.<init>(r2, r3, r1, r4)
            io.reactivex.Flowable r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Flowable<R> concatMapMaybeDelayError(io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> r3) {
            r2 = this;
            r0 = 1
            r1 = 2
            io.reactivex.Flowable r3 = r2.concatMapMaybeDelayError(r3, r0, r1)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Flowable<R> concatMapMaybeDelayError(io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> r2, boolean r3) {
            r1 = this;
            r0 = 2
            io.reactivex.Flowable r2 = r1.concatMapMaybeDelayError(r2, r3, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Flowable<R> concatMapMaybeDelayError(io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> r2, boolean r3, int r4) {
            r1 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "prefetch"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r4, r0)
            io.reactivex.internal.operators.mixed.FlowableConcatMapMaybe r0 = new io.reactivex.internal.operators.mixed.FlowableConcatMapMaybe
            if (r3 == 0) goto L11
            io.reactivex.internal.util.ErrorMode r3 = io.reactivex.internal.util.ErrorMode.END
            goto L13
        L11:
            io.reactivex.internal.util.ErrorMode r3 = io.reactivex.internal.util.ErrorMode.BOUNDARY
        L13:
            r0.<init>(r1, r2, r3, r4)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Flowable<R> concatMapSingle(io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> r2) {
            r1 = this;
            r0 = 2
            io.reactivex.Flowable r2 = r1.concatMapSingle(r2, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Flowable<R> concatMapSingle(io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> r3, int r4) {
            r2 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "prefetch"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r4, r0)
            io.reactivex.internal.operators.mixed.FlowableConcatMapSingle r0 = new io.reactivex.internal.operators.mixed.FlowableConcatMapSingle
            io.reactivex.internal.util.ErrorMode r1 = io.reactivex.internal.util.ErrorMode.IMMEDIATE
            r0.<init>(r2, r3, r1, r4)
            io.reactivex.Flowable r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Flowable<R> concatMapSingleDelayError(io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> r3) {
            r2 = this;
            r0 = 1
            r1 = 2
            io.reactivex.Flowable r3 = r2.concatMapSingleDelayError(r3, r0, r1)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Flowable<R> concatMapSingleDelayError(io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> r2, boolean r3) {
            r1 = this;
            r0 = 2
            io.reactivex.Flowable r2 = r1.concatMapSingleDelayError(r2, r3, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Flowable<R> concatMapSingleDelayError(io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> r2, boolean r3, int r4) {
            r1 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "prefetch"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r4, r0)
            io.reactivex.internal.operators.mixed.FlowableConcatMapSingle r0 = new io.reactivex.internal.operators.mixed.FlowableConcatMapSingle
            if (r3 == 0) goto L11
            io.reactivex.internal.util.ErrorMode r3 = io.reactivex.internal.util.ErrorMode.END
            goto L13
        L11:
            io.reactivex.internal.util.ErrorMode r3 = io.reactivex.internal.util.ErrorMode.BOUNDARY
        L13:
            r0.<init>(r1, r2, r3, r4)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> concatWith(io.reactivex.CompletableSource r2) {
            r1 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.flowable.FlowableConcatWithCompletable r0 = new io.reactivex.internal.operators.flowable.FlowableConcatWithCompletable
            r0.<init>(r1, r2)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> concatWith(io.reactivex.MaybeSource<? extends T> r2) {
            r1 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.flowable.FlowableConcatWithMaybe r0 = new io.reactivex.internal.operators.flowable.FlowableConcatWithMaybe
            r0.<init>(r1, r2)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> concatWith(io.reactivex.SingleSource<? extends T> r2) {
            r1 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.flowable.FlowableConcatWithSingle r0 = new io.reactivex.internal.operators.flowable.FlowableConcatWithSingle
            r0.<init>(r1, r2)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> concatWith(org.reactivestreams.Publisher<? extends T> r2) {
            r1 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.Flowable r2 = concat(r1, r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<java.lang.Boolean> contains(java.lang.Object r2) {
            r1 = this;
            java.lang.String r0 = "item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.functions.Predicate r2 = io.reactivex.internal.functions.Functions.equalsWith(r2)
            io.reactivex.Single r2 = r1.any(r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<java.lang.Long> count() {
            r1 = this;
            io.reactivex.internal.operators.flowable.FlowableCountSingle r0 = new io.reactivex.internal.operators.flowable.FlowableCountSingle
            r0.<init>(r1)
            io.reactivex.Single r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> debounce(long r2, java.util.concurrent.TimeUnit r4) {
            r1 = this;
            io.reactivex.Scheduler r0 = io.reactivex.schedulers.Schedulers.computation()
            io.reactivex.Flowable r2 = r1.debounce(r2, r4, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> debounce(long r8, java.util.concurrent.TimeUnit r10, io.reactivex.Scheduler r11) {
            r7 = this;
            java.lang.String r0 = "unit is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r10, r0)
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r11, r0)
            io.reactivex.internal.operators.flowable.FlowableDebounceTimed r0 = new io.reactivex.internal.operators.flowable.FlowableDebounceTimed
            r1 = r0
            r2 = r7
            r3 = r8
            r5 = r10
            r6 = r11
            r1.<init>(r2, r3, r5, r6)
            io.reactivex.Flowable r8 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r8
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public final <U> io.reactivex.Flowable<T> debounce(io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<U>> r2) {
            r1 = this;
            java.lang.String r0 = "debounceIndicator is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.flowable.FlowableDebounce r0 = new io.reactivex.internal.operators.flowable.FlowableDebounce
            r0.<init>(r1, r2)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> defaultIfEmpty(T r2) {
            r1 = this;
            java.lang.String r0 = "item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.Flowable r2 = just(r2)
            io.reactivex.Flowable r2 = r1.switchIfEmpty(r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> delay(long r7, java.util.concurrent.TimeUnit r9) {
            r6 = this;
            io.reactivex.Scheduler r4 = io.reactivex.schedulers.Schedulers.computation()
            r5 = 0
            r0 = r6
            r1 = r7
            r3 = r9
            io.reactivex.Flowable r7 = r0.delay(r1, r3, r4, r5)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> delay(long r7, java.util.concurrent.TimeUnit r9, io.reactivex.Scheduler r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r3 = r9
            r4 = r10
            io.reactivex.Flowable r7 = r0.delay(r1, r3, r4, r5)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> delay(long r9, java.util.concurrent.TimeUnit r11, io.reactivex.Scheduler r12, boolean r13) {
            r8 = this;
            java.lang.String r0 = "unit is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r11, r0)
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r12, r0)
            io.reactivex.internal.operators.flowable.FlowableDelay r0 = new io.reactivex.internal.operators.flowable.FlowableDelay
            r1 = 0
            long r3 = java.lang.Math.max(r1, r9)
            r1 = r0
            r2 = r8
            r5 = r11
            r6 = r12
            r7 = r13
            r1.<init>(r2, r3, r5, r6, r7)
            io.reactivex.Flowable r9 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r9
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> delay(long r7, java.util.concurrent.TimeUnit r9, boolean r10) {
            r6 = this;
            io.reactivex.Scheduler r4 = io.reactivex.schedulers.Schedulers.computation()
            r0 = r6
            r1 = r7
            r3 = r9
            r5 = r10
            io.reactivex.Flowable r7 = r0.delay(r1, r3, r4, r5)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <U> io.reactivex.Flowable<T> delay(io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<U>> r2) {
            r1 = this;
            java.lang.String r0 = "itemDelayIndicator is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.functions.Function r2 = io.reactivex.internal.operators.flowable.FlowableInternalHelper.itemDelay(r2)
            io.reactivex.Flowable r2 = r1.flatMap(r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <U, V> io.reactivex.Flowable<T> delay(org.reactivestreams.Publisher<U> r1, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<V>> r2) {
            r0 = this;
            io.reactivex.Flowable r1 = r0.delaySubscription(r1)
            io.reactivex.Flowable r1 = r1.delay(r2)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> delaySubscription(long r2, java.util.concurrent.TimeUnit r4) {
            r1 = this;
            io.reactivex.Scheduler r0 = io.reactivex.schedulers.Schedulers.computation()
            io.reactivex.Flowable r2 = r1.delaySubscription(r2, r4, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> delaySubscription(long r1, java.util.concurrent.TimeUnit r3, io.reactivex.Scheduler r4) {
            r0 = this;
            io.reactivex.Flowable r1 = timer(r1, r3, r4)
            io.reactivex.Flowable r1 = r0.delaySubscription(r1)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <U> io.reactivex.Flowable<T> delaySubscription(org.reactivestreams.Publisher<U> r2) {
            r1 = this;
            java.lang.String r0 = "subscriptionIndicator is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.flowable.FlowableDelaySubscriptionOther r0 = new io.reactivex.internal.operators.flowable.FlowableDelaySubscriptionOther
            r0.<init>(r1, r2)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <T2> io.reactivex.Flowable<T2> dematerialize() {
            r1 = this;
            io.reactivex.internal.operators.flowable.FlowableDematerialize r0 = new io.reactivex.internal.operators.flowable.FlowableDematerialize
            r0.<init>(r1)
            io.reactivex.Flowable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> distinct() {
            r2 = this;
            io.reactivex.functions.Function r0 = io.reactivex.internal.functions.Functions.identity()
            java.util.concurrent.Callable r1 = io.reactivex.internal.functions.Functions.createHashSet()
            io.reactivex.Flowable r0 = r2.distinct(r0, r1)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <K> io.reactivex.Flowable<T> distinct(io.reactivex.functions.Function<? super T, K> r2) {
            r1 = this;
            java.util.concurrent.Callable r0 = io.reactivex.internal.functions.Functions.createHashSet()
            io.reactivex.Flowable r2 = r1.distinct(r2, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <K> io.reactivex.Flowable<T> distinct(io.reactivex.functions.Function<? super T, K> r2, java.util.concurrent.Callable<? extends java.util.Collection<? super K>> r3) {
            r1 = this;
            java.lang.String r0 = "keySelector is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "collectionSupplier is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.flowable.FlowableDistinct r0 = new io.reactivex.internal.operators.flowable.FlowableDistinct
            r0.<init>(r1, r2, r3)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> distinctUntilChanged() {
            r1 = this;
            io.reactivex.functions.Function r0 = io.reactivex.internal.functions.Functions.identity()
            io.reactivex.Flowable r0 = r1.distinctUntilChanged(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> distinctUntilChanged(io.reactivex.functions.BiPredicate<? super T, ? super T> r3) {
            r2 = this;
            java.lang.String r0 = "comparer is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.flowable.FlowableDistinctUntilChanged r0 = new io.reactivex.internal.operators.flowable.FlowableDistinctUntilChanged
            io.reactivex.functions.Function r1 = io.reactivex.internal.functions.Functions.identity()
            r0.<init>(r2, r1, r3)
            io.reactivex.Flowable r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <K> io.reactivex.Flowable<T> distinctUntilChanged(io.reactivex.functions.Function<? super T, K> r3) {
            r2 = this;
            java.lang.String r0 = "keySelector is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.flowable.FlowableDistinctUntilChanged r0 = new io.reactivex.internal.operators.flowable.FlowableDistinctUntilChanged
            io.reactivex.functions.BiPredicate r1 = io.reactivex.internal.functions.ObjectHelper.equalsPredicate()
            r0.<init>(r2, r3, r1)
            io.reactivex.Flowable r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> doAfterNext(io.reactivex.functions.Consumer<? super T> r2) {
            r1 = this;
            java.lang.String r0 = "onAfterNext is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.flowable.FlowableDoAfterNext r0 = new io.reactivex.internal.operators.flowable.FlowableDoAfterNext
            r0.<init>(r1, r2)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> doAfterTerminate(io.reactivex.functions.Action r4) {
            r3 = this;
            io.reactivex.functions.Consumer r0 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Consumer r1 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Action r2 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.Flowable r4 = r3.doOnEach(r0, r1, r2, r4)
            return r4
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> doFinally(io.reactivex.functions.Action r2) {
            r1 = this;
            java.lang.String r0 = "onFinally is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.flowable.FlowableDoFinally r0 = new io.reactivex.internal.operators.flowable.FlowableDoFinally
            r0.<init>(r1, r2)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> doOnCancel(io.reactivex.functions.Action r3) {
            r2 = this;
            io.reactivex.functions.Consumer r0 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.LongConsumer r1 = io.reactivex.internal.functions.Functions.EMPTY_LONG_CONSUMER
            io.reactivex.Flowable r3 = r2.doOnLifecycle(r0, r1, r3)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> doOnComplete(io.reactivex.functions.Action r4) {
            r3 = this;
            io.reactivex.functions.Consumer r0 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Consumer r1 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Action r2 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.Flowable r4 = r3.doOnEach(r0, r1, r4, r2)
            return r4
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> doOnEach(io.reactivex.functions.Consumer<? super io.reactivex.Notification<T>> r4) {
            r3 = this;
            java.lang.String r0 = "consumer is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            io.reactivex.functions.Consumer r0 = io.reactivex.internal.functions.Functions.notificationOnNext(r4)
            io.reactivex.functions.Consumer r1 = io.reactivex.internal.functions.Functions.notificationOnError(r4)
            io.reactivex.functions.Action r4 = io.reactivex.internal.functions.Functions.notificationOnComplete(r4)
            io.reactivex.functions.Action r2 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.Flowable r4 = r3.doOnEach(r0, r1, r4, r2)
            return r4
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> doOnEach(org.reactivestreams.Subscriber<? super T> r4) {
            r3 = this;
            java.lang.String r0 = "subscriber is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            io.reactivex.functions.Consumer r0 = io.reactivex.internal.operators.flowable.FlowableInternalHelper.subscriberOnNext(r4)
            io.reactivex.functions.Consumer r1 = io.reactivex.internal.operators.flowable.FlowableInternalHelper.subscriberOnError(r4)
            io.reactivex.functions.Action r4 = io.reactivex.internal.operators.flowable.FlowableInternalHelper.subscriberOnComplete(r4)
            io.reactivex.functions.Action r2 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.Flowable r4 = r3.doOnEach(r0, r1, r4, r2)
            return r4
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> doOnError(io.reactivex.functions.Consumer<? super java.lang.Throwable> r4) {
            r3 = this;
            io.reactivex.functions.Consumer r0 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Action r1 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.functions.Action r2 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.Flowable r4 = r3.doOnEach(r0, r4, r1, r2)
            return r4
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> doOnLifecycle(io.reactivex.functions.Consumer<? super org.reactivestreams.Subscription> r2, io.reactivex.functions.LongConsumer r3, io.reactivex.functions.Action r4) {
            r1 = this;
            java.lang.String r0 = "onSubscribe is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "onRequest is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "onCancel is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            io.reactivex.internal.operators.flowable.FlowableDoOnLifecycle r0 = new io.reactivex.internal.operators.flowable.FlowableDoOnLifecycle
            r0.<init>(r1, r2, r3, r4)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> doOnNext(io.reactivex.functions.Consumer<? super T> r4) {
            r3 = this;
            io.reactivex.functions.Consumer r0 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Action r1 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.functions.Action r2 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.Flowable r4 = r3.doOnEach(r4, r0, r1, r2)
            return r4
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> doOnRequest(io.reactivex.functions.LongConsumer r3) {
            r2 = this;
            io.reactivex.functions.Consumer r0 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Action r1 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.Flowable r3 = r2.doOnLifecycle(r0, r3, r1)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> doOnSubscribe(io.reactivex.functions.Consumer<? super org.reactivestreams.Subscription> r3) {
            r2 = this;
            io.reactivex.functions.LongConsumer r0 = io.reactivex.internal.functions.Functions.EMPTY_LONG_CONSUMER
            io.reactivex.functions.Action r1 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.Flowable r3 = r2.doOnLifecycle(r3, r0, r1)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> doOnTerminate(io.reactivex.functions.Action r4) {
            r3 = this;
            io.reactivex.functions.Consumer r0 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Consumer r1 = io.reactivex.internal.functions.Functions.actionConsumer(r4)
            io.reactivex.functions.Action r2 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.Flowable r4 = r3.doOnEach(r0, r1, r4, r2)
            return r4
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Maybe<T> elementAt(long r4) {
            r3 = this;
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L10
            io.reactivex.internal.operators.flowable.FlowableElementAtMaybe r0 = new io.reactivex.internal.operators.flowable.FlowableElementAtMaybe
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
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<T> elementAt(long r3, T r5) {
            r2 = this;
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L15
            java.lang.String r0 = "defaultItem is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            io.reactivex.internal.operators.flowable.FlowableElementAtSingle r0 = new io.reactivex.internal.operators.flowable.FlowableElementAtSingle
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
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<T> elementAtOrError(long r4) {
            r3 = this;
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L11
            io.reactivex.internal.operators.flowable.FlowableElementAtSingle r0 = new io.reactivex.internal.operators.flowable.FlowableElementAtSingle
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
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> filter(io.reactivex.functions.Predicate<? super T> r2) {
            r1 = this;
            java.lang.String r0 = "predicate is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.flowable.FlowableFilter r0 = new io.reactivex.internal.operators.flowable.FlowableFilter
            r0.<init>(r1, r2)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.SPECIAL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<T> first(T r3) {
            r2 = this;
            r0 = 0
            io.reactivex.Single r3 = r2.elementAt(r0, r3)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.SPECIAL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Maybe<T> firstElement() {
            r2 = this;
            r0 = 0
            io.reactivex.Maybe r0 = r2.elementAt(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.SPECIAL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<T> firstOrError() {
            r2 = this;
            r0 = 0
            io.reactivex.Single r0 = r2.elementAtOrError(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Flowable<R> flatMap(io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r4) {
            r3 = this;
            int r0 = bufferSize()
            int r1 = bufferSize()
            r2 = 0
            io.reactivex.Flowable r4 = r3.flatMap(r4, r2, r0, r1)
            return r4
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Flowable<R> flatMap(io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r3, int r4) {
            r2 = this;
            r0 = 0
            int r1 = bufferSize()
            io.reactivex.Flowable r3 = r2.flatMap(r3, r0, r4, r1)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <U, R> io.reactivex.Flowable<R> flatMap(io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends U>> r7, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> r8) {
            r6 = this;
            r3 = 0
            int r4 = bufferSize()
            int r5 = bufferSize()
            r0 = r6
            r1 = r7
            r2 = r8
            io.reactivex.Flowable r7 = r0.flatMap(r1, r2, r3, r4, r5)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <U, R> io.reactivex.Flowable<R> flatMap(io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends U>> r7, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> r8, int r9) {
            r6 = this;
            r3 = 0
            int r5 = bufferSize()
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r9
            io.reactivex.Flowable r7 = r0.flatMap(r1, r2, r3, r4, r5)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <U, R> io.reactivex.Flowable<R> flatMap(io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends U>> r7, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> r8, boolean r9) {
            r6 = this;
            int r4 = bufferSize()
            int r5 = bufferSize()
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            io.reactivex.Flowable r7 = r0.flatMap(r1, r2, r3, r4, r5)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <U, R> io.reactivex.Flowable<R> flatMap(io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends U>> r7, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> r8, boolean r9, int r10) {
            r6 = this;
            int r5 = bufferSize()
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            io.reactivex.Flowable r7 = r0.flatMap(r1, r2, r3, r4, r5)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <U, R> io.reactivex.Flowable<R> flatMap(io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends U>> r2, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> r3, boolean r4, int r5, int r6) {
            r1 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "combiner is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "maxConcurrency"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r5, r0)
            java.lang.String r0 = "bufferSize"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r6, r0)
            io.reactivex.functions.Function r2 = io.reactivex.internal.operators.flowable.FlowableInternalHelper.flatMapWithCombiner(r2, r3)
            io.reactivex.Flowable r2 = r1.flatMap(r2, r4, r5, r6)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Flowable<R> flatMap(io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r2, io.reactivex.functions.Function<? super java.lang.Throwable, ? extends org.reactivestreams.Publisher<? extends R>> r3, java.util.concurrent.Callable<? extends org.reactivestreams.Publisher<? extends R>> r4) {
            r1 = this;
            java.lang.String r0 = "onNextMapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "onErrorMapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "onCompleteSupplier is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            io.reactivex.internal.operators.flowable.FlowableMapNotification r0 = new io.reactivex.internal.operators.flowable.FlowableMapNotification
            r0.<init>(r1, r2, r3, r4)
            io.reactivex.Flowable r2 = merge(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Flowable<R> flatMap(io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r2, io.reactivex.functions.Function<java.lang.Throwable, ? extends org.reactivestreams.Publisher<? extends R>> r3, java.util.concurrent.Callable<? extends org.reactivestreams.Publisher<? extends R>> r4, int r5) {
            r1 = this;
            java.lang.String r0 = "onNextMapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "onErrorMapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "onCompleteSupplier is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            io.reactivex.internal.operators.flowable.FlowableMapNotification r0 = new io.reactivex.internal.operators.flowable.FlowableMapNotification
            r0.<init>(r1, r2, r3, r4)
            io.reactivex.Flowable r2 = merge(r0, r5)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Flowable<R> flatMap(io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r3, boolean r4) {
            r2 = this;
            int r0 = bufferSize()
            int r1 = bufferSize()
            io.reactivex.Flowable r3 = r2.flatMap(r3, r4, r0, r1)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Flowable<R> flatMap(io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r2, boolean r3, int r4) {
            r1 = this;
            int r0 = bufferSize()
            io.reactivex.Flowable r2 = r1.flatMap(r2, r3, r4, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Flowable<R> flatMap(io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r8, boolean r9, int r10, int r11) {
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
            io.reactivex.Flowable r8 = empty()
            return r8
        L21:
            io.reactivex.Flowable r8 = io.reactivex.internal.operators.flowable.FlowableScalarXMap.scalarXMap(r9, r8)
            return r8
        L26:
            io.reactivex.internal.operators.flowable.FlowableFlatMap r6 = new io.reactivex.internal.operators.flowable.FlowableFlatMap
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            io.reactivex.Flowable r8 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r6)
            return r8
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable flatMapCompletable(io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> r3) {
            r2 = this;
            r0 = 0
            r1 = 2147483647(0x7fffffff, float:NaN)
            io.reactivex.Completable r3 = r2.flatMapCompletable(r3, r0, r1)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable flatMapCompletable(io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> r2, boolean r3, int r4) {
            r1 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "maxConcurrency"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r4, r0)
            io.reactivex.internal.operators.flowable.FlowableFlatMapCompletableCompletable r0 = new io.reactivex.internal.operators.flowable.FlowableFlatMapCompletableCompletable
            r0.<init>(r1, r2, r3, r4)
            io.reactivex.Completable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <U> io.reactivex.Flowable<U> flatMapIterable(io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends U>> r2) {
            r1 = this;
            int r0 = bufferSize()
            io.reactivex.Flowable r2 = r1.flatMapIterable(r2, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <U> io.reactivex.Flowable<U> flatMapIterable(io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends U>> r2, int r3) {
            r1 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "bufferSize"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r3, r0)
            io.reactivex.internal.operators.flowable.FlowableFlattenIterable r0 = new io.reactivex.internal.operators.flowable.FlowableFlattenIterable
            r0.<init>(r1, r2, r3)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <U, V> io.reactivex.Flowable<V> flatMapIterable(io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends U>> r8, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends V> r9) {
            r7 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r8, r0)
            java.lang.String r0 = "resultSelector is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r9, r0)
            io.reactivex.functions.Function r2 = io.reactivex.internal.operators.flowable.FlowableInternalHelper.flatMapIntoIterable(r8)
            r4 = 0
            int r5 = bufferSize()
            int r6 = bufferSize()
            r1 = r7
            r3 = r9
            io.reactivex.Flowable r8 = r1.flatMap(r2, r3, r4, r5, r6)
            return r8
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <U, V> io.reactivex.Flowable<V> flatMapIterable(io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends U>> r8, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends V> r9, int r10) {
            r7 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r8, r0)
            java.lang.String r0 = "resultSelector is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r9, r0)
            io.reactivex.functions.Function r2 = io.reactivex.internal.operators.flowable.FlowableInternalHelper.flatMapIntoIterable(r8)
            r4 = 0
            int r5 = bufferSize()
            r1 = r7
            r3 = r9
            r6 = r10
            io.reactivex.Flowable r8 = r1.flatMap(r2, r3, r4, r5, r6)
            return r8
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Flowable<R> flatMapMaybe(io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> r3) {
            r2 = this;
            r0 = 0
            r1 = 2147483647(0x7fffffff, float:NaN)
            io.reactivex.Flowable r3 = r2.flatMapMaybe(r3, r0, r1)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Flowable<R> flatMapMaybe(io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> r2, boolean r3, int r4) {
            r1 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "maxConcurrency"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r4, r0)
            io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe r0 = new io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe
            r0.<init>(r1, r2, r3, r4)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Flowable<R> flatMapSingle(io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> r3) {
            r2 = this;
            r0 = 0
            r1 = 2147483647(0x7fffffff, float:NaN)
            io.reactivex.Flowable r3 = r2.flatMapSingle(r3, r0, r1)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Flowable<R> flatMapSingle(io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> r2, boolean r3, int r4) {
            r1 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "maxConcurrency"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r4, r0)
            io.reactivex.internal.operators.flowable.FlowableFlatMapSingle r0 = new io.reactivex.internal.operators.flowable.FlowableFlatMapSingle
            r0.<init>(r1, r2, r3, r4)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.NONE)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.disposables.Disposable forEach(io.reactivex.functions.Consumer<? super T> r1) {
            r0 = this;
            io.reactivex.disposables.Disposable r1 = r0.subscribe(r1)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.NONE)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.disposables.Disposable forEachWhile(io.reactivex.functions.Predicate<? super T> r3) {
            r2 = this;
            io.reactivex.functions.Consumer<java.lang.Throwable> r0 = io.reactivex.internal.functions.Functions.ON_ERROR_MISSING
            io.reactivex.functions.Action r1 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.disposables.Disposable r3 = r2.forEachWhile(r3, r0, r1)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.NONE)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.disposables.Disposable forEachWhile(io.reactivex.functions.Predicate<? super T> r2, io.reactivex.functions.Consumer<? super java.lang.Throwable> r3) {
            r1 = this;
            io.reactivex.functions.Action r0 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.disposables.Disposable r2 = r1.forEachWhile(r2, r3, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.NONE)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.disposables.Disposable forEachWhile(io.reactivex.functions.Predicate<? super T> r2, io.reactivex.functions.Consumer<? super java.lang.Throwable> r3, io.reactivex.functions.Action r4) {
            r1 = this;
            java.lang.String r0 = "onNext is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "onError is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "onComplete is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            io.reactivex.internal.subscribers.ForEachWhileSubscriber r0 = new io.reactivex.internal.subscribers.ForEachWhileSubscriber
            r0.<init>(r2, r3, r4)
            r1.subscribe(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <K> io.reactivex.Flowable<io.reactivex.flowables.GroupedFlowable<K, T>> groupBy(io.reactivex.functions.Function<? super T, ? extends K> r4) {
            r3 = this;
            io.reactivex.functions.Function r0 = io.reactivex.internal.functions.Functions.identity()
            r1 = 0
            int r2 = bufferSize()
            io.reactivex.Flowable r4 = r3.groupBy(r4, r0, r1, r2)
            return r4
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <K, V> io.reactivex.Flowable<io.reactivex.flowables.GroupedFlowable<K, V>> groupBy(io.reactivex.functions.Function<? super T, ? extends K> r3, io.reactivex.functions.Function<? super T, ? extends V> r4) {
            r2 = this;
            r0 = 0
            int r1 = bufferSize()
            io.reactivex.Flowable r3 = r2.groupBy(r3, r4, r0, r1)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <K, V> io.reactivex.Flowable<io.reactivex.flowables.GroupedFlowable<K, V>> groupBy(io.reactivex.functions.Function<? super T, ? extends K> r2, io.reactivex.functions.Function<? super T, ? extends V> r3, boolean r4) {
            r1 = this;
            int r0 = bufferSize()
            io.reactivex.Flowable r2 = r1.groupBy(r2, r3, r4, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <K, V> io.reactivex.Flowable<io.reactivex.flowables.GroupedFlowable<K, V>> groupBy(io.reactivex.functions.Function<? super T, ? extends K> r9, io.reactivex.functions.Function<? super T, ? extends V> r10, boolean r11, int r12) {
            r8 = this;
            java.lang.String r0 = "keySelector is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r9, r0)
            java.lang.String r0 = "valueSelector is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r10, r0)
            java.lang.String r0 = "bufferSize"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r12, r0)
            io.reactivex.internal.operators.flowable.FlowableGroupBy r0 = new io.reactivex.internal.operators.flowable.FlowableGroupBy
            r7 = 0
            r1 = r0
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r12
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            io.reactivex.Flowable r9 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r9
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <K, V> io.reactivex.Flowable<io.reactivex.flowables.GroupedFlowable<K, V>> groupBy(io.reactivex.functions.Function<? super T, ? extends K> r9, io.reactivex.functions.Function<? super T, ? extends V> r10, boolean r11, int r12, io.reactivex.functions.Function<? super io.reactivex.functions.Consumer<java.lang.Object>, ? extends java.util.Map<K, java.lang.Object>> r13) {
            r8 = this;
            java.lang.String r0 = "keySelector is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r9, r0)
            java.lang.String r0 = "valueSelector is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r10, r0)
            java.lang.String r0 = "bufferSize"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r12, r0)
            java.lang.String r0 = "evictingMapFactory is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r13, r0)
            io.reactivex.internal.operators.flowable.FlowableGroupBy r0 = new io.reactivex.internal.operators.flowable.FlowableGroupBy
            r1 = r0
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r12
            r6 = r11
            r7 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7)
            io.reactivex.Flowable r9 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r9
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <K> io.reactivex.Flowable<io.reactivex.flowables.GroupedFlowable<K, T>> groupBy(io.reactivex.functions.Function<? super T, ? extends K> r3, boolean r4) {
            r2 = this;
            io.reactivex.functions.Function r0 = io.reactivex.internal.functions.Functions.identity()
            int r1 = bufferSize()
            io.reactivex.Flowable r3 = r2.groupBy(r3, r0, r4, r1)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public final <TRight, TLeftEnd, TRightEnd, R> io.reactivex.Flowable<R> groupJoin(org.reactivestreams.Publisher<? extends TRight> r8, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<TLeftEnd>> r9, io.reactivex.functions.Function<? super TRight, ? extends org.reactivestreams.Publisher<TRightEnd>> r10, io.reactivex.functions.BiFunction<? super T, ? super io.reactivex.Flowable<TRight>, ? extends R> r11) {
            r7 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r8, r0)
            java.lang.String r0 = "leftEnd is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r9, r0)
            java.lang.String r0 = "rightEnd is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r10, r0)
            java.lang.String r0 = "resultSelector is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r11, r0)
            io.reactivex.internal.operators.flowable.FlowableGroupJoin r0 = new io.reactivex.internal.operators.flowable.FlowableGroupJoin
            r1 = r0
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            io.reactivex.Flowable r8 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r8
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> hide() {
            r1 = this;
            io.reactivex.internal.operators.flowable.FlowableHide r0 = new io.reactivex.internal.operators.flowable.FlowableHide
            r0.<init>(r1)
            io.reactivex.Flowable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable ignoreElements() {
            r1 = this;
            io.reactivex.internal.operators.flowable.FlowableIgnoreElementsCompletable r0 = new io.reactivex.internal.operators.flowable.FlowableIgnoreElementsCompletable
            r0.<init>(r1)
            io.reactivex.Completable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<java.lang.Boolean> isEmpty() {
            r1 = this;
            io.reactivex.functions.Predicate r0 = io.reactivex.internal.functions.Functions.alwaysFalse()
            io.reactivex.Single r0 = r1.all(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public final <TRight, TLeftEnd, TRightEnd, R> io.reactivex.Flowable<R> join(org.reactivestreams.Publisher<? extends TRight> r8, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<TLeftEnd>> r9, io.reactivex.functions.Function<? super TRight, ? extends org.reactivestreams.Publisher<TRightEnd>> r10, io.reactivex.functions.BiFunction<? super T, ? super TRight, ? extends R> r11) {
            r7 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r8, r0)
            java.lang.String r0 = "leftEnd is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r9, r0)
            java.lang.String r0 = "rightEnd is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r10, r0)
            java.lang.String r0 = "resultSelector is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r11, r0)
            io.reactivex.internal.operators.flowable.FlowableJoin r0 = new io.reactivex.internal.operators.flowable.FlowableJoin
            r1 = r0
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            io.reactivex.Flowable r8 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r8
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<T> last(T r2) {
            r1 = this;
            java.lang.String r0 = "defaultItem"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.flowable.FlowableLastSingle r0 = new io.reactivex.internal.operators.flowable.FlowableLastSingle
            r0.<init>(r1, r2)
            io.reactivex.Single r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Maybe<T> lastElement() {
            r1 = this;
            io.reactivex.internal.operators.flowable.FlowableLastMaybe r0 = new io.reactivex.internal.operators.flowable.FlowableLastMaybe
            r0.<init>(r1)
            io.reactivex.Maybe r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<T> lastOrError() {
            r2 = this;
            io.reactivex.internal.operators.flowable.FlowableLastSingle r0 = new io.reactivex.internal.operators.flowable.FlowableLastSingle
            r1 = 0
            r0.<init>(r2, r1)
            io.reactivex.Single r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.SPECIAL)
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Flowable<R> lift(io.reactivex.FlowableOperator<? extends R, ? super T> r2) {
            r1 = this;
            java.lang.String r0 = "lifter is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.flowable.FlowableLift r0 = new io.reactivex.internal.operators.flowable.FlowableLift
            r0.<init>(r1, r2)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.SPECIAL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> limit(long r4) {
            r3 = this;
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L10
            io.reactivex.internal.operators.flowable.FlowableLimit r0 = new io.reactivex.internal.operators.flowable.FlowableLimit
            r0.<init>(r3, r4)
            io.reactivex.Flowable r4 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
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
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Flowable<R> map(io.reactivex.functions.Function<? super T, ? extends R> r2) {
            r1 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.flowable.FlowableMap r0 = new io.reactivex.internal.operators.flowable.FlowableMap
            r0.<init>(r1, r2)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<io.reactivex.Notification<T>> materialize() {
            r1 = this;
            io.reactivex.internal.operators.flowable.FlowableMaterialize r0 = new io.reactivex.internal.operators.flowable.FlowableMaterialize
            r0.<init>(r1)
            io.reactivex.Flowable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> mergeWith(io.reactivex.CompletableSource r2) {
            r1 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.flowable.FlowableMergeWithCompletable r0 = new io.reactivex.internal.operators.flowable.FlowableMergeWithCompletable
            r0.<init>(r1, r2)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> mergeWith(io.reactivex.MaybeSource<? extends T> r2) {
            r1 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.flowable.FlowableMergeWithMaybe r0 = new io.reactivex.internal.operators.flowable.FlowableMergeWithMaybe
            r0.<init>(r1, r2)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> mergeWith(io.reactivex.SingleSource<? extends T> r2) {
            r1 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.flowable.FlowableMergeWithSingle r0 = new io.reactivex.internal.operators.flowable.FlowableMergeWithSingle
            r0.<init>(r1, r2)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> mergeWith(org.reactivestreams.Publisher<? extends T> r2) {
            r1 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.Flowable r2 = merge(r1, r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> observeOn(io.reactivex.Scheduler r3) {
            r2 = this;
            r0 = 0
            int r1 = bufferSize()
            io.reactivex.Flowable r3 = r2.observeOn(r3, r0, r1)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> observeOn(io.reactivex.Scheduler r2, boolean r3) {
            r1 = this;
            int r0 = bufferSize()
            io.reactivex.Flowable r2 = r1.observeOn(r2, r3, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> observeOn(io.reactivex.Scheduler r2, boolean r3, int r4) {
            r1 = this;
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "bufferSize"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r4, r0)
            io.reactivex.internal.operators.flowable.FlowableObserveOn r0 = new io.reactivex.internal.operators.flowable.FlowableObserveOn
            r0.<init>(r1, r2, r3, r4)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    public final <U> io.reactivex.Flowable<U> ofType(java.lang.Class<U> r2) {
            r1 = this;
            java.lang.String r0 = "clazz is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.functions.Predicate r0 = io.reactivex.internal.functions.Functions.isInstanceOf(r2)
            io.reactivex.Flowable r0 = r1.filter(r0)
            io.reactivex.Flowable r2 = r0.cast(r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> onBackpressureBuffer() {
            r3 = this;
            int r0 = bufferSize()
            r1 = 0
            r2 = 1
            io.reactivex.Flowable r0 = r3.onBackpressureBuffer(r0, r1, r2)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> onBackpressureBuffer(int r2) {
            r1 = this;
            r0 = 0
            io.reactivex.Flowable r2 = r1.onBackpressureBuffer(r2, r0, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> onBackpressureBuffer(int r2, io.reactivex.functions.Action r3) {
            r1 = this;
            r0 = 0
            io.reactivex.Flowable r2 = r1.onBackpressureBuffer(r2, r0, r0, r3)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> onBackpressureBuffer(int r2, boolean r3) {
            r1 = this;
            r0 = 0
            io.reactivex.Flowable r2 = r1.onBackpressureBuffer(r2, r3, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.SPECIAL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> onBackpressureBuffer(int r8, boolean r9, boolean r10) {
            r7 = this;
            java.lang.String r0 = "bufferSize"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r8, r0)
            io.reactivex.internal.operators.flowable.FlowableOnBackpressureBuffer r0 = new io.reactivex.internal.operators.flowable.FlowableOnBackpressureBuffer
            io.reactivex.functions.Action r6 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            r1 = r0
            r2 = r7
            r3 = r8
            r4 = r10
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            io.reactivex.Flowable r8 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r8
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.SPECIAL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> onBackpressureBuffer(int r8, boolean r9, boolean r10, io.reactivex.functions.Action r11) {
            r7 = this;
            java.lang.String r0 = "onOverflow is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r11, r0)
            java.lang.String r0 = "capacity"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r8, r0)
            io.reactivex.internal.operators.flowable.FlowableOnBackpressureBuffer r0 = new io.reactivex.internal.operators.flowable.FlowableOnBackpressureBuffer
            r1 = r0
            r2 = r7
            r3 = r8
            r4 = r10
            r5 = r9
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            io.reactivex.Flowable r8 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r8
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.SPECIAL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> onBackpressureBuffer(long r8, io.reactivex.functions.Action r10, io.reactivex.BackpressureOverflowStrategy r11) {
            r7 = this;
            java.lang.String r0 = "strategy is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r11, r0)
            java.lang.String r0 = "capacity"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r8, r0)
            io.reactivex.internal.operators.flowable.FlowableOnBackpressureBufferStrategy r0 = new io.reactivex.internal.operators.flowable.FlowableOnBackpressureBufferStrategy
            r1 = r0
            r2 = r7
            r3 = r8
            r5 = r10
            r6 = r11
            r1.<init>(r2, r3, r5, r6)
            io.reactivex.Flowable r8 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r8
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> onBackpressureBuffer(boolean r3) {
            r2 = this;
            int r0 = bufferSize()
            r1 = 1
            io.reactivex.Flowable r3 = r2.onBackpressureBuffer(r0, r3, r1)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> onBackpressureDrop() {
            r1 = this;
            io.reactivex.internal.operators.flowable.FlowableOnBackpressureDrop r0 = new io.reactivex.internal.operators.flowable.FlowableOnBackpressureDrop
            r0.<init>(r1)
            io.reactivex.Flowable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> onBackpressureDrop(io.reactivex.functions.Consumer<? super T> r2) {
            r1 = this;
            java.lang.String r0 = "onDrop is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.flowable.FlowableOnBackpressureDrop r0 = new io.reactivex.internal.operators.flowable.FlowableOnBackpressureDrop
            r0.<init>(r1, r2)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> onBackpressureLatest() {
            r1 = this;
            io.reactivex.internal.operators.flowable.FlowableOnBackpressureLatest r0 = new io.reactivex.internal.operators.flowable.FlowableOnBackpressureLatest
            r0.<init>(r1)
            io.reactivex.Flowable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> onErrorResumeNext(io.reactivex.functions.Function<? super java.lang.Throwable, ? extends org.reactivestreams.Publisher<? extends T>> r3) {
            r2 = this;
            java.lang.String r0 = "resumeFunction is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.flowable.FlowableOnErrorNext r0 = new io.reactivex.internal.operators.flowable.FlowableOnErrorNext
            r1 = 0
            r0.<init>(r2, r3, r1)
            io.reactivex.Flowable r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> onErrorResumeNext(org.reactivestreams.Publisher<? extends T> r2) {
            r1 = this;
            java.lang.String r0 = "next is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.functions.Function r2 = io.reactivex.internal.functions.Functions.justFunction(r2)
            io.reactivex.Flowable r2 = r1.onErrorResumeNext(r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> onErrorReturn(io.reactivex.functions.Function<? super java.lang.Throwable, ? extends T> r2) {
            r1 = this;
            java.lang.String r0 = "valueSupplier is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.flowable.FlowableOnErrorReturn r0 = new io.reactivex.internal.operators.flowable.FlowableOnErrorReturn
            r0.<init>(r1, r2)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> onErrorReturnItem(T r2) {
            r1 = this;
            java.lang.String r0 = "item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.functions.Function r2 = io.reactivex.internal.functions.Functions.justFunction(r2)
            io.reactivex.Flowable r2 = r1.onErrorReturn(r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> onExceptionResumeNext(org.reactivestreams.Publisher<? extends T> r3) {
            r2 = this;
            java.lang.String r0 = "next is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.flowable.FlowableOnErrorNext r0 = new io.reactivex.internal.operators.flowable.FlowableOnErrorNext
            io.reactivex.functions.Function r3 = io.reactivex.internal.functions.Functions.justFunction(r3)
            r1 = 1
            r0.<init>(r2, r3, r1)
            io.reactivex.Flowable r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> onTerminateDetach() {
            r1 = this;
            io.reactivex.internal.operators.flowable.FlowableDetach r0 = new io.reactivex.internal.operators.flowable.FlowableDetach
            r0.<init>(r1)
            io.reactivex.Flowable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.parallel.ParallelFlowable<T> parallel() {
            r1 = this;
            io.reactivex.parallel.ParallelFlowable r0 = io.reactivex.parallel.ParallelFlowable.from(r1)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.parallel.ParallelFlowable<T> parallel(int r2) {
            r1 = this;
            java.lang.String r0 = "parallelism"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r2, r0)
            io.reactivex.parallel.ParallelFlowable r2 = io.reactivex.parallel.ParallelFlowable.from(r1, r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.parallel.ParallelFlowable<T> parallel(int r2, int r3) {
            r1 = this;
            java.lang.String r0 = "parallelism"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r2, r0)
            java.lang.String r0 = "prefetch"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r3, r0)
            io.reactivex.parallel.ParallelFlowable r2 = io.reactivex.parallel.ParallelFlowable.from(r1, r2, r3)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Flowable<R> publish(io.reactivex.functions.Function<? super io.reactivex.Flowable<T>, ? extends org.reactivestreams.Publisher<R>> r2) {
            r1 = this;
            int r0 = bufferSize()
            io.reactivex.Flowable r2 = r1.publish(r2, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Flowable<R> publish(io.reactivex.functions.Function<? super io.reactivex.Flowable<T>, ? extends org.reactivestreams.Publisher<? extends R>> r3, int r4) {
            r2 = this;
            java.lang.String r0 = "selector is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "prefetch"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r4, r0)
            io.reactivex.internal.operators.flowable.FlowablePublishMulticast r0 = new io.reactivex.internal.operators.flowable.FlowablePublishMulticast
            r1 = 0
            r0.<init>(r2, r3, r4, r1)
            io.reactivex.Flowable r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.flowables.ConnectableFlowable<T> publish() {
            r1 = this;
            int r0 = bufferSize()
            io.reactivex.flowables.ConnectableFlowable r0 = r1.publish(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.flowables.ConnectableFlowable<T> publish(int r2) {
            r1 = this;
            java.lang.String r0 = "bufferSize"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r2, r0)
            io.reactivex.flowables.ConnectableFlowable r2 = io.reactivex.internal.operators.flowable.FlowablePublish.create(r1, r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> rebatchRequests(int r3) {
            r2 = this;
            io.reactivex.Scheduler r0 = io.reactivex.internal.schedulers.ImmediateThinScheduler.INSTANCE
            r1 = 1
            io.reactivex.Flowable r3 = r2.observeOn(r0, r1, r3)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Maybe<T> reduce(io.reactivex.functions.BiFunction<T, T, T> r2) {
            r1 = this;
            java.lang.String r0 = "reducer is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.flowable.FlowableReduceMaybe r0 = new io.reactivex.internal.operators.flowable.FlowableReduceMaybe
            r0.<init>(r1, r2)
            io.reactivex.Maybe r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Single<R> reduce(R r2, io.reactivex.functions.BiFunction<R, ? super T, R> r3) {
            r1 = this;
            java.lang.String r0 = "seed is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "reducer is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.flowable.FlowableReduceSeedSingle r0 = new io.reactivex.internal.operators.flowable.FlowableReduceSeedSingle
            r0.<init>(r1, r2, r3)
            io.reactivex.Single r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Single<R> reduceWith(java.util.concurrent.Callable<R> r2, io.reactivex.functions.BiFunction<R, ? super T, R> r3) {
            r1 = this;
            java.lang.String r0 = "seedSupplier is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "reducer is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.flowable.FlowableReduceWithSingle r0 = new io.reactivex.internal.operators.flowable.FlowableReduceWithSingle
            r0.<init>(r1, r2, r3)
            io.reactivex.Single r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
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
    public final io.reactivex.Flowable<T> repeat(long r4) {
            r3 = this;
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L17
            if (r0 != 0) goto Ld
            io.reactivex.Flowable r4 = empty()
            return r4
        Ld:
            io.reactivex.internal.operators.flowable.FlowableRepeat r0 = new io.reactivex.internal.operators.flowable.FlowableRepeat
            r0.<init>(r3, r4)
            io.reactivex.Flowable r4 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
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
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> repeatUntil(io.reactivex.functions.BooleanSupplier r2) {
            r1 = this;
            java.lang.String r0 = "stop is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.flowable.FlowableRepeatUntil r0 = new io.reactivex.internal.operators.flowable.FlowableRepeatUntil
            r0.<init>(r1, r2)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> repeatWhen(io.reactivex.functions.Function<? super io.reactivex.Flowable<java.lang.Object>, ? extends org.reactivestreams.Publisher<?>> r2) {
            r1 = this;
            java.lang.String r0 = "handler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.flowable.FlowableRepeatWhen r0 = new io.reactivex.internal.operators.flowable.FlowableRepeatWhen
            r0.<init>(r1, r2)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Flowable<R> replay(io.reactivex.functions.Function<? super io.reactivex.Flowable<T>, ? extends org.reactivestreams.Publisher<R>> r2) {
            r1 = this;
            java.lang.String r0 = "selector is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.util.concurrent.Callable r0 = io.reactivex.internal.operators.flowable.FlowableInternalHelper.replayCallable(r1)
            io.reactivex.Flowable r2 = io.reactivex.internal.operators.flowable.FlowableReplay.multicastSelector(r0, r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Flowable<R> replay(io.reactivex.functions.Function<? super io.reactivex.Flowable<T>, ? extends org.reactivestreams.Publisher<R>> r2, int r3) {
            r1 = this;
            java.lang.String r0 = "selector is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "bufferSize"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r3, r0)
            java.util.concurrent.Callable r3 = io.reactivex.internal.operators.flowable.FlowableInternalHelper.replayCallable(r1, r3)
            io.reactivex.Flowable r2 = io.reactivex.internal.operators.flowable.FlowableReplay.multicastSelector(r3, r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Flowable<R> replay(io.reactivex.functions.Function<? super io.reactivex.Flowable<T>, ? extends org.reactivestreams.Publisher<R>> r8, int r9, long r10, java.util.concurrent.TimeUnit r12) {
            r7 = this;
            io.reactivex.Scheduler r6 = io.reactivex.schedulers.Schedulers.computation()
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r12
            io.reactivex.Flowable r8 = r0.replay(r1, r2, r3, r5, r6)
            return r8
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Flowable<R> replay(io.reactivex.functions.Function<? super io.reactivex.Flowable<T>, ? extends org.reactivestreams.Publisher<R>> r7, int r8, long r9, java.util.concurrent.TimeUnit r11, io.reactivex.Scheduler r12) {
            r6 = this;
            java.lang.String r0 = "selector is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r0)
            java.lang.String r0 = "unit is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r11, r0)
            java.lang.String r0 = "bufferSize"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r8, r0)
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r12, r0)
            r0 = r6
            r1 = r8
            r2 = r9
            r4 = r11
            r5 = r12
            java.util.concurrent.Callable r8 = io.reactivex.internal.operators.flowable.FlowableInternalHelper.replayCallable(r0, r1, r2, r4, r5)
            io.reactivex.Flowable r7 = io.reactivex.internal.operators.flowable.FlowableReplay.multicastSelector(r8, r7)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Flowable<R> replay(io.reactivex.functions.Function<? super io.reactivex.Flowable<T>, ? extends org.reactivestreams.Publisher<R>> r2, int r3, io.reactivex.Scheduler r4) {
            r1 = this;
            java.lang.String r0 = "selector is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            java.lang.String r0 = "bufferSize"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r3, r0)
            java.util.concurrent.Callable r3 = io.reactivex.internal.operators.flowable.FlowableInternalHelper.replayCallable(r1, r3)
            io.reactivex.functions.Function r2 = io.reactivex.internal.operators.flowable.FlowableInternalHelper.replayFunction(r2, r4)
            io.reactivex.Flowable r2 = io.reactivex.internal.operators.flowable.FlowableReplay.multicastSelector(r3, r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Flowable<R> replay(io.reactivex.functions.Function<? super io.reactivex.Flowable<T>, ? extends org.reactivestreams.Publisher<R>> r7, long r8, java.util.concurrent.TimeUnit r10) {
            r6 = this;
            io.reactivex.Scheduler r5 = io.reactivex.schedulers.Schedulers.computation()
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r10
            io.reactivex.Flowable r7 = r0.replay(r1, r2, r4, r5)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Flowable<R> replay(io.reactivex.functions.Function<? super io.reactivex.Flowable<T>, ? extends org.reactivestreams.Publisher<R>> r2, long r3, java.util.concurrent.TimeUnit r5, io.reactivex.Scheduler r6) {
            r1 = this;
            java.lang.String r0 = "selector is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "unit is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r0)
            java.util.concurrent.Callable r3 = io.reactivex.internal.operators.flowable.FlowableInternalHelper.replayCallable(r1, r3, r5, r6)
            io.reactivex.Flowable r2 = io.reactivex.internal.operators.flowable.FlowableReplay.multicastSelector(r3, r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Flowable<R> replay(io.reactivex.functions.Function<? super io.reactivex.Flowable<T>, ? extends org.reactivestreams.Publisher<R>> r2, io.reactivex.Scheduler r3) {
            r1 = this;
            java.lang.String r0 = "selector is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.util.concurrent.Callable r0 = io.reactivex.internal.operators.flowable.FlowableInternalHelper.replayCallable(r1)
            io.reactivex.functions.Function r2 = io.reactivex.internal.operators.flowable.FlowableInternalHelper.replayFunction(r2, r3)
            io.reactivex.Flowable r2 = io.reactivex.internal.operators.flowable.FlowableReplay.multicastSelector(r0, r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.flowables.ConnectableFlowable<T> replay() {
            r1 = this;
            io.reactivex.flowables.ConnectableFlowable r0 = io.reactivex.internal.operators.flowable.FlowableReplay.createFrom(r1)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.flowables.ConnectableFlowable<T> replay(int r2) {
            r1 = this;
            java.lang.String r0 = "bufferSize"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r2, r0)
            io.reactivex.flowables.ConnectableFlowable r2 = io.reactivex.internal.operators.flowable.FlowableReplay.create(r1, r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.flowables.ConnectableFlowable<T> replay(int r7, long r8, java.util.concurrent.TimeUnit r10) {
            r6 = this;
            io.reactivex.Scheduler r5 = io.reactivex.schedulers.Schedulers.computation()
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r10
            io.reactivex.flowables.ConnectableFlowable r7 = r0.replay(r1, r2, r4, r5)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.flowables.ConnectableFlowable<T> replay(int r7, long r8, java.util.concurrent.TimeUnit r10, io.reactivex.Scheduler r11) {
            r6 = this;
            java.lang.String r0 = "bufferSize"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r7, r0)
            java.lang.String r1 = "unit is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r10, r1)
            java.lang.String r1 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r11, r1)
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r7, r0)
            r0 = r6
            r1 = r8
            r3 = r10
            r4 = r11
            r5 = r7
            io.reactivex.flowables.ConnectableFlowable r7 = io.reactivex.internal.operators.flowable.FlowableReplay.create(r0, r1, r3, r4, r5)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.flowables.ConnectableFlowable<T> replay(int r2, io.reactivex.Scheduler r3) {
            r1 = this;
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.flowables.ConnectableFlowable r2 = r1.replay(r2)
            io.reactivex.flowables.ConnectableFlowable r2 = io.reactivex.internal.operators.flowable.FlowableReplay.observeOn(r2, r3)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.flowables.ConnectableFlowable<T> replay(long r2, java.util.concurrent.TimeUnit r4) {
            r1 = this;
            io.reactivex.Scheduler r0 = io.reactivex.schedulers.Schedulers.computation()
            io.reactivex.flowables.ConnectableFlowable r2 = r1.replay(r2, r4, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.flowables.ConnectableFlowable<T> replay(long r2, java.util.concurrent.TimeUnit r4, io.reactivex.Scheduler r5) {
            r1 = this;
            java.lang.String r0 = "unit is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            io.reactivex.flowables.ConnectableFlowable r2 = io.reactivex.internal.operators.flowable.FlowableReplay.create(r1, r2, r4, r5)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.flowables.ConnectableFlowable<T> replay(io.reactivex.Scheduler r2) {
            r1 = this;
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.flowables.ConnectableFlowable r0 = r1.replay()
            io.reactivex.flowables.ConnectableFlowable r2 = io.reactivex.internal.operators.flowable.FlowableReplay.observeOn(r0, r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> retry() {
            r3 = this;
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            io.reactivex.functions.Predicate r2 = io.reactivex.internal.functions.Functions.alwaysTrue()
            io.reactivex.Flowable r0 = r3.retry(r0, r2)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> retry(long r2) {
            r1 = this;
            io.reactivex.functions.Predicate r0 = io.reactivex.internal.functions.Functions.alwaysTrue()
            io.reactivex.Flowable r2 = r1.retry(r2, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> retry(long r3, io.reactivex.functions.Predicate<? super java.lang.Throwable> r5) {
            r2 = this;
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L15
            java.lang.String r0 = "predicate is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            io.reactivex.internal.operators.flowable.FlowableRetryPredicate r0 = new io.reactivex.internal.operators.flowable.FlowableRetryPredicate
            r0.<init>(r2, r3, r5)
            io.reactivex.Flowable r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
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
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> retry(io.reactivex.functions.BiPredicate<? super java.lang.Integer, ? super java.lang.Throwable> r2) {
            r1 = this;
            java.lang.String r0 = "predicate is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.flowable.FlowableRetryBiPredicate r0 = new io.reactivex.internal.operators.flowable.FlowableRetryBiPredicate
            r0.<init>(r1, r2)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> retry(io.reactivex.functions.Predicate<? super java.lang.Throwable> r3) {
            r2 = this;
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            io.reactivex.Flowable r3 = r2.retry(r0, r3)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> retryUntil(io.reactivex.functions.BooleanSupplier r3) {
            r2 = this;
            java.lang.String r0 = "stop is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            io.reactivex.functions.Predicate r3 = io.reactivex.internal.functions.Functions.predicateReverseFor(r3)
            io.reactivex.Flowable r3 = r2.retry(r0, r3)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> retryWhen(io.reactivex.functions.Function<? super io.reactivex.Flowable<java.lang.Throwable>, ? extends org.reactivestreams.Publisher<?>> r2) {
            r1 = this;
            java.lang.String r0 = "handler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.flowable.FlowableRetryWhen r0 = new io.reactivex.internal.operators.flowable.FlowableRetryWhen
            r0.<init>(r1, r2)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    public final void safeSubscribe(org.reactivestreams.Subscriber<? super T> r2) {
            r1 = this;
            java.lang.String r0 = "s is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            boolean r0 = r2 instanceof io.reactivex.subscribers.SafeSubscriber
            if (r0 == 0) goto Lf
            io.reactivex.subscribers.SafeSubscriber r2 = (io.reactivex.subscribers.SafeSubscriber) r2
            r1.subscribe(r2)
            goto L17
        Lf:
            io.reactivex.subscribers.SafeSubscriber r0 = new io.reactivex.subscribers.SafeSubscriber
            r0.<init>(r2)
            r1.subscribe(r0)
        L17:
            return
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> sample(long r2, java.util.concurrent.TimeUnit r4) {
            r1 = this;
            io.reactivex.Scheduler r0 = io.reactivex.schedulers.Schedulers.computation()
            io.reactivex.Flowable r2 = r1.sample(r2, r4, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> sample(long r9, java.util.concurrent.TimeUnit r11, io.reactivex.Scheduler r12) {
            r8 = this;
            java.lang.String r0 = "unit is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r11, r0)
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r12, r0)
            io.reactivex.internal.operators.flowable.FlowableSampleTimed r0 = new io.reactivex.internal.operators.flowable.FlowableSampleTimed
            r7 = 0
            r1 = r0
            r2 = r8
            r3 = r9
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r5, r6, r7)
            io.reactivex.Flowable r9 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r9
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> sample(long r9, java.util.concurrent.TimeUnit r11, io.reactivex.Scheduler r12, boolean r13) {
            r8 = this;
            java.lang.String r0 = "unit is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r11, r0)
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r12, r0)
            io.reactivex.internal.operators.flowable.FlowableSampleTimed r0 = new io.reactivex.internal.operators.flowable.FlowableSampleTimed
            r1 = r0
            r2 = r8
            r3 = r9
            r5 = r11
            r6 = r12
            r7 = r13
            r1.<init>(r2, r3, r5, r6, r7)
            io.reactivex.Flowable r9 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r9
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> sample(long r7, java.util.concurrent.TimeUnit r9, boolean r10) {
            r6 = this;
            io.reactivex.Scheduler r4 = io.reactivex.schedulers.Schedulers.computation()
            r0 = r6
            r1 = r7
            r3 = r9
            r5 = r10
            io.reactivex.Flowable r7 = r0.sample(r1, r3, r4, r5)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public final <U> io.reactivex.Flowable<T> sample(org.reactivestreams.Publisher<U> r3) {
            r2 = this;
            java.lang.String r0 = "sampler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.flowable.FlowableSamplePublisher r0 = new io.reactivex.internal.operators.flowable.FlowableSamplePublisher
            r1 = 0
            r0.<init>(r2, r3, r1)
            io.reactivex.Flowable r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public final <U> io.reactivex.Flowable<T> sample(org.reactivestreams.Publisher<U> r2, boolean r3) {
            r1 = this;
            java.lang.String r0 = "sampler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.flowable.FlowableSamplePublisher r0 = new io.reactivex.internal.operators.flowable.FlowableSamplePublisher
            r0.<init>(r1, r2, r3)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> scan(io.reactivex.functions.BiFunction<T, T, T> r2) {
            r1 = this;
            java.lang.String r0 = "accumulator is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.flowable.FlowableScan r0 = new io.reactivex.internal.operators.flowable.FlowableScan
            r0.<init>(r1, r2)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Flowable<R> scan(R r2, io.reactivex.functions.BiFunction<R, ? super T, R> r3) {
            r1 = this;
            java.lang.String r0 = "seed is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.util.concurrent.Callable r2 = io.reactivex.internal.functions.Functions.justCallable(r2)
            io.reactivex.Flowable r2 = r1.scanWith(r2, r3)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Flowable<R> scanWith(java.util.concurrent.Callable<R> r2, io.reactivex.functions.BiFunction<R, ? super T, R> r3) {
            r1 = this;
            java.lang.String r0 = "seedSupplier is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "accumulator is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.flowable.FlowableScanSeed r0 = new io.reactivex.internal.operators.flowable.FlowableScanSeed
            r0.<init>(r1, r2, r3)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> serialize() {
            r1 = this;
            io.reactivex.internal.operators.flowable.FlowableSerialized r0 = new io.reactivex.internal.operators.flowable.FlowableSerialized
            r0.<init>(r1)
            io.reactivex.Flowable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> share() {
            r1 = this;
            io.reactivex.flowables.ConnectableFlowable r0 = r1.publish()
            io.reactivex.Flowable r0 = r0.refCount()
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<T> single(T r2) {
            r1 = this;
            java.lang.String r0 = "defaultItem is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.flowable.FlowableSingleSingle r0 = new io.reactivex.internal.operators.flowable.FlowableSingleSingle
            r0.<init>(r1, r2)
            io.reactivex.Single r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Maybe<T> singleElement() {
            r1 = this;
            io.reactivex.internal.operators.flowable.FlowableSingleMaybe r0 = new io.reactivex.internal.operators.flowable.FlowableSingleMaybe
            r0.<init>(r1)
            io.reactivex.Maybe r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<T> singleOrError() {
            r2 = this;
            io.reactivex.internal.operators.flowable.FlowableSingleSingle r0 = new io.reactivex.internal.operators.flowable.FlowableSingleSingle
            r1 = 0
            r0.<init>(r2, r1)
            io.reactivex.Single r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> skip(long r3) {
            r2 = this;
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto Lb
            io.reactivex.Flowable r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r2)
            return r3
        Lb:
            io.reactivex.internal.operators.flowable.FlowableSkip r0 = new io.reactivex.internal.operators.flowable.FlowableSkip
            r0.<init>(r2, r3)
            io.reactivex.Flowable r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> skip(long r1, java.util.concurrent.TimeUnit r3) {
            r0 = this;
            io.reactivex.Flowable r1 = timer(r1, r3)
            io.reactivex.Flowable r1 = r0.skipUntil(r1)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> skip(long r1, java.util.concurrent.TimeUnit r3, io.reactivex.Scheduler r4) {
            r0 = this;
            io.reactivex.Flowable r1 = timer(r1, r3, r4)
            io.reactivex.Flowable r1 = r0.skipUntil(r1)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> skipLast(int r4) {
            r3 = this;
            if (r4 < 0) goto L13
            if (r4 != 0) goto L9
            io.reactivex.Flowable r4 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r3)
            return r4
        L9:
            io.reactivex.internal.operators.flowable.FlowableSkipLast r0 = new io.reactivex.internal.operators.flowable.FlowableSkipLast
            r0.<init>(r3, r4)
            io.reactivex.Flowable r4 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
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

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> skipLast(long r8, java.util.concurrent.TimeUnit r10) {
            r7 = this;
            io.reactivex.Scheduler r4 = io.reactivex.schedulers.Schedulers.computation()
            r5 = 0
            int r6 = bufferSize()
            r0 = r7
            r1 = r8
            r3 = r10
            io.reactivex.Flowable r8 = r0.skipLast(r1, r3, r4, r5, r6)
            return r8
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> skipLast(long r8, java.util.concurrent.TimeUnit r10, io.reactivex.Scheduler r11) {
            r7 = this;
            r5 = 0
            int r6 = bufferSize()
            r0 = r7
            r1 = r8
            r3 = r10
            r4 = r11
            io.reactivex.Flowable r8 = r0.skipLast(r1, r3, r4, r5, r6)
            return r8
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> skipLast(long r8, java.util.concurrent.TimeUnit r10, io.reactivex.Scheduler r11, boolean r12) {
            r7 = this;
            int r6 = bufferSize()
            r0 = r7
            r1 = r8
            r3 = r10
            r4 = r11
            r5 = r12
            io.reactivex.Flowable r8 = r0.skipLast(r1, r3, r4, r5, r6)
            return r8
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> skipLast(long r10, java.util.concurrent.TimeUnit r12, io.reactivex.Scheduler r13, boolean r14, int r15) {
            r9 = this;
            java.lang.String r0 = "unit is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r12, r0)
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r13, r0)
            java.lang.String r0 = "bufferSize"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r15, r0)
            int r7 = r15 << 1
            io.reactivex.internal.operators.flowable.FlowableSkipLastTimed r15 = new io.reactivex.internal.operators.flowable.FlowableSkipLastTimed
            r1 = r15
            r2 = r9
            r3 = r10
            r5 = r12
            r6 = r13
            r8 = r14
            r1.<init>(r2, r3, r5, r6, r7, r8)
            io.reactivex.Flowable r10 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r15)
            return r10
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> skipLast(long r8, java.util.concurrent.TimeUnit r10, boolean r11) {
            r7 = this;
            io.reactivex.Scheduler r4 = io.reactivex.schedulers.Schedulers.computation()
            int r6 = bufferSize()
            r0 = r7
            r1 = r8
            r3 = r10
            r5 = r11
            io.reactivex.Flowable r8 = r0.skipLast(r1, r3, r4, r5, r6)
            return r8
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <U> io.reactivex.Flowable<T> skipUntil(org.reactivestreams.Publisher<U> r2) {
            r1 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.flowable.FlowableSkipUntil r0 = new io.reactivex.internal.operators.flowable.FlowableSkipUntil
            r0.<init>(r1, r2)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> skipWhile(io.reactivex.functions.Predicate<? super T> r2) {
            r1 = this;
            java.lang.String r0 = "predicate is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.flowable.FlowableSkipWhile r0 = new io.reactivex.internal.operators.flowable.FlowableSkipWhile
            r0.<init>(r1, r2)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> sorted() {
            r2 = this;
            io.reactivex.Single r0 = r2.toList()
            io.reactivex.Flowable r0 = r0.toFlowable()
            java.util.Comparator r1 = io.reactivex.internal.functions.Functions.naturalComparator()
            io.reactivex.functions.Function r1 = io.reactivex.internal.functions.Functions.listSorter(r1)
            io.reactivex.Flowable r0 = r0.map(r1)
            io.reactivex.functions.Function r1 = io.reactivex.internal.functions.Functions.identity()
            io.reactivex.Flowable r0 = r0.flatMapIterable(r1)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> sorted(java.util.Comparator<? super T> r2) {
            r1 = this;
            java.lang.String r0 = "sortFunction"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.Single r0 = r1.toList()
            io.reactivex.Flowable r0 = r0.toFlowable()
            io.reactivex.functions.Function r2 = io.reactivex.internal.functions.Functions.listSorter(r2)
            io.reactivex.Flowable r2 = r0.map(r2)
            io.reactivex.functions.Function r0 = io.reactivex.internal.functions.Functions.identity()
            io.reactivex.Flowable r2 = r2.flatMapIterable(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> startWith(java.lang.Iterable<? extends T> r3) {
            r2 = this;
            r0 = 2
            org.reactivestreams.Publisher[] r0 = new org.reactivestreams.Publisher[r0]
            r1 = 0
            io.reactivex.Flowable r3 = fromIterable(r3)
            r0[r1] = r3
            r3 = 1
            r0[r3] = r2
            io.reactivex.Flowable r3 = concatArray(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> startWith(T r3) {
            r2 = this;
            java.lang.String r0 = "item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            r0 = 2
            org.reactivestreams.Publisher[] r0 = new org.reactivestreams.Publisher[r0]
            r1 = 0
            io.reactivex.Flowable r3 = just(r3)
            r0[r1] = r3
            r3 = 1
            r0[r3] = r2
            io.reactivex.Flowable r3 = concatArray(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> startWith(org.reactivestreams.Publisher<? extends T> r3) {
            r2 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            r0 = 2
            org.reactivestreams.Publisher[] r0 = new org.reactivestreams.Publisher[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r2
            io.reactivex.Flowable r3 = concatArray(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> startWithArray(T... r3) {
            r2 = this;
            io.reactivex.Flowable r3 = fromArray(r3)
            io.reactivex.Flowable r0 = empty()
            if (r3 != r0) goto Lf
            io.reactivex.Flowable r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r2)
            return r3
        Lf:
            r0 = 2
            org.reactivestreams.Publisher[] r0 = new org.reactivestreams.Publisher[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r2
            io.reactivex.Flowable r3 = concatArray(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    public final io.reactivex.disposables.Disposable subscribe() {
            r4 = this;
            io.reactivex.functions.Consumer r0 = io.reactivex.internal.functions.Functions.emptyConsumer()
            io.reactivex.functions.Consumer<java.lang.Throwable> r1 = io.reactivex.internal.functions.Functions.ON_ERROR_MISSING
            io.reactivex.functions.Action r2 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.internal.operators.flowable.FlowableInternalHelper$RequestMax r3 = io.reactivex.internal.operators.flowable.FlowableInternalHelper.RequestMax.INSTANCE
            io.reactivex.disposables.Disposable r0 = r4.subscribe(r0, r1, r2, r3)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.disposables.Disposable subscribe(io.reactivex.functions.Consumer<? super T> r4) {
            r3 = this;
            io.reactivex.functions.Consumer<java.lang.Throwable> r0 = io.reactivex.internal.functions.Functions.ON_ERROR_MISSING
            io.reactivex.functions.Action r1 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.internal.operators.flowable.FlowableInternalHelper$RequestMax r2 = io.reactivex.internal.operators.flowable.FlowableInternalHelper.RequestMax.INSTANCE
            io.reactivex.disposables.Disposable r4 = r3.subscribe(r4, r0, r1, r2)
            return r4
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.disposables.Disposable subscribe(io.reactivex.functions.Consumer<? super T> r3, io.reactivex.functions.Consumer<? super java.lang.Throwable> r4) {
            r2 = this;
            io.reactivex.functions.Action r0 = io.reactivex.internal.functions.Functions.EMPTY_ACTION
            io.reactivex.internal.operators.flowable.FlowableInternalHelper$RequestMax r1 = io.reactivex.internal.operators.flowable.FlowableInternalHelper.RequestMax.INSTANCE
            io.reactivex.disposables.Disposable r3 = r2.subscribe(r3, r4, r0, r1)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.disposables.Disposable subscribe(io.reactivex.functions.Consumer<? super T> r2, io.reactivex.functions.Consumer<? super java.lang.Throwable> r3, io.reactivex.functions.Action r4) {
            r1 = this;
            io.reactivex.internal.operators.flowable.FlowableInternalHelper$RequestMax r0 = io.reactivex.internal.operators.flowable.FlowableInternalHelper.RequestMax.INSTANCE
            io.reactivex.disposables.Disposable r2 = r1.subscribe(r2, r3, r4, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.SPECIAL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.disposables.Disposable subscribe(io.reactivex.functions.Consumer<? super T> r2, io.reactivex.functions.Consumer<? super java.lang.Throwable> r3, io.reactivex.functions.Action r4, io.reactivex.functions.Consumer<? super org.reactivestreams.Subscription> r5) {
            r1 = this;
            java.lang.String r0 = "onNext is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "onError is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "onComplete is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            java.lang.String r0 = "onSubscribe is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            io.reactivex.internal.subscribers.LambdaSubscriber r0 = new io.reactivex.internal.subscribers.LambdaSubscriber
            r0.<init>(r2, r3, r4, r5)
            r1.subscribe(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.SPECIAL)
    public final void subscribe(io.reactivex.FlowableSubscriber<? super T> r3) {
            r2 = this;
            java.lang.String r0 = "s is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            org.reactivestreams.Subscriber r3 = io.reactivex.plugins.RxJavaPlugins.onSubscribe(r2, r3)     // Catch: java.lang.Throwable -> L12 java.lang.NullPointerException -> L24
            java.lang.String r0 = "Plugin returned null Subscriber"
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

    @Override // org.reactivestreams.Publisher
    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.SPECIAL)
    public final void subscribe(org.reactivestreams.Subscriber<? super T> r2) {
            r1 = this;
            boolean r0 = r2 instanceof io.reactivex.FlowableSubscriber
            if (r0 == 0) goto La
            io.reactivex.FlowableSubscriber r2 = (io.reactivex.FlowableSubscriber) r2
            r1.subscribe(r2)
            goto L17
        La:
            java.lang.String r0 = "s is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.subscribers.StrictSubscriber r0 = new io.reactivex.internal.subscribers.StrictSubscriber
            r0.<init>(r2)
            r1.subscribe(r0)
        L17:
            return
    }

    protected abstract void subscribeActual(org.reactivestreams.Subscriber<? super T> r1);

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> subscribeOn(io.reactivex.Scheduler r2) {
            r1 = this;
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            boolean r0 = r1 instanceof io.reactivex.internal.operators.flowable.FlowableCreate
            r0 = r0 ^ 1
            io.reactivex.Flowable r2 = r1.subscribeOn(r2, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> subscribeOn(io.reactivex.Scheduler r2, boolean r3) {
            r1 = this;
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.flowable.FlowableSubscribeOn r0 = new io.reactivex.internal.operators.flowable.FlowableSubscribeOn
            r0.<init>(r1, r2, r3)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.SPECIAL)
    @io.reactivex.annotations.CheckReturnValue
    public final <E extends org.reactivestreams.Subscriber<? super T>> E subscribeWith(E r1) {
            r0 = this;
            r0.subscribe(r1)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> switchIfEmpty(org.reactivestreams.Publisher<? extends T> r2) {
            r1 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.flowable.FlowableSwitchIfEmpty r0 = new io.reactivex.internal.operators.flowable.FlowableSwitchIfEmpty
            r0.<init>(r1, r2)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Flowable<R> switchMap(io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r2) {
            r1 = this;
            int r0 = bufferSize()
            io.reactivex.Flowable r2 = r1.switchMap(r2, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Flowable<R> switchMap(io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r2, int r3) {
            r1 = this;
            r0 = 0
            io.reactivex.Flowable r2 = r1.switchMap0(r2, r3, r0)
            return r2
    }

    <R> io.reactivex.Flowable<R> switchMap0(io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r2, int r3, boolean r4) {
            r1 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "bufferSize"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r3, r0)
            boolean r0 = r1 instanceof io.reactivex.internal.fuseable.ScalarCallable
            if (r0 == 0) goto L21
            r3 = r1
            io.reactivex.internal.fuseable.ScalarCallable r3 = (io.reactivex.internal.fuseable.ScalarCallable) r3
            java.lang.Object r3 = r3.call()
            if (r3 != 0) goto L1c
            io.reactivex.Flowable r2 = empty()
            return r2
        L1c:
            io.reactivex.Flowable r2 = io.reactivex.internal.operators.flowable.FlowableScalarXMap.scalarXMap(r3, r2)
            return r2
        L21:
            io.reactivex.internal.operators.flowable.FlowableSwitchMap r0 = new io.reactivex.internal.operators.flowable.FlowableSwitchMap
            r0.<init>(r1, r2, r3, r4)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable switchMapCompletable(io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> r3) {
            r2 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable r0 = new io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable
            r1 = 0
            r0.<init>(r2, r3, r1)
            io.reactivex.Completable r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Completable switchMapCompletableDelayError(io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> r3) {
            r2 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable r0 = new io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable
            r1 = 1
            r0.<init>(r2, r3, r1)
            io.reactivex.Completable r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.SPECIAL)
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Flowable<R> switchMapDelayError(io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r2) {
            r1 = this;
            int r0 = bufferSize()
            io.reactivex.Flowable r2 = r1.switchMapDelayError(r2, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.SPECIAL)
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Flowable<R> switchMapDelayError(io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> r2, int r3) {
            r1 = this;
            r0 = 1
            io.reactivex.Flowable r2 = r1.switchMap0(r2, r3, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Flowable<R> switchMapMaybe(io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> r3) {
            r2 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.mixed.FlowableSwitchMapMaybe r0 = new io.reactivex.internal.operators.mixed.FlowableSwitchMapMaybe
            r1 = 0
            r0.<init>(r2, r3, r1)
            io.reactivex.Flowable r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Flowable<R> switchMapMaybeDelayError(io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> r3) {
            r2 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.mixed.FlowableSwitchMapMaybe r0 = new io.reactivex.internal.operators.mixed.FlowableSwitchMapMaybe
            r1 = 1
            r0.<init>(r2, r3, r1)
            io.reactivex.Flowable r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Flowable<R> switchMapSingle(io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> r3) {
            r2 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle r0 = new io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle
            r1 = 0
            r0.<init>(r2, r3, r1)
            io.reactivex.Flowable r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Flowable<R> switchMapSingleDelayError(io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> r3) {
            r2 = this;
            java.lang.String r0 = "mapper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle r0 = new io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle
            r1 = 1
            r0.<init>(r2, r3, r1)
            io.reactivex.Flowable r3 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.SPECIAL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> take(long r4) {
            r3 = this;
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L10
            io.reactivex.internal.operators.flowable.FlowableTake r0 = new io.reactivex.internal.operators.flowable.FlowableTake
            r0.<init>(r3, r4)
            io.reactivex.Flowable r4 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
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

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> take(long r1, java.util.concurrent.TimeUnit r3) {
            r0 = this;
            io.reactivex.Flowable r1 = timer(r1, r3)
            io.reactivex.Flowable r1 = r0.takeUntil(r1)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> take(long r1, java.util.concurrent.TimeUnit r3, io.reactivex.Scheduler r4) {
            r0 = this;
            io.reactivex.Flowable r1 = timer(r1, r3, r4)
            io.reactivex.Flowable r1 = r0.takeUntil(r1)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> takeLast(int r4) {
            r3 = this;
            if (r4 < 0) goto L25
            if (r4 != 0) goto Le
            io.reactivex.internal.operators.flowable.FlowableIgnoreElements r4 = new io.reactivex.internal.operators.flowable.FlowableIgnoreElements
            r4.<init>(r3)
            io.reactivex.Flowable r4 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r4)
            return r4
        Le:
            r0 = 1
            if (r4 != r0) goto L1b
            io.reactivex.internal.operators.flowable.FlowableTakeLastOne r4 = new io.reactivex.internal.operators.flowable.FlowableTakeLastOne
            r4.<init>(r3)
            io.reactivex.Flowable r4 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r4)
            return r4
        L1b:
            io.reactivex.internal.operators.flowable.FlowableTakeLast r0 = new io.reactivex.internal.operators.flowable.FlowableTakeLast
            r0.<init>(r3, r4)
            io.reactivex.Flowable r4 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
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

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> takeLast(long r10, long r12, java.util.concurrent.TimeUnit r14) {
            r9 = this;
            io.reactivex.Scheduler r6 = io.reactivex.schedulers.Schedulers.computation()
            r7 = 0
            int r8 = bufferSize()
            r0 = r9
            r1 = r10
            r3 = r12
            r5 = r14
            io.reactivex.Flowable r10 = r0.takeLast(r1, r3, r5, r6, r7, r8)
            return r10
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> takeLast(long r10, long r12, java.util.concurrent.TimeUnit r14, io.reactivex.Scheduler r15) {
            r9 = this;
            r7 = 0
            int r8 = bufferSize()
            r0 = r9
            r1 = r10
            r3 = r12
            r5 = r14
            r6 = r15
            io.reactivex.Flowable r10 = r0.takeLast(r1, r3, r5, r6, r7, r8)
            return r10
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> takeLast(long r12, long r14, java.util.concurrent.TimeUnit r16, io.reactivex.Scheduler r17, boolean r18, int r19) {
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
            io.reactivex.internal.operators.flowable.FlowableTakeLastTimed r10 = new io.reactivex.internal.operators.flowable.FlowableTakeLastTimed
            r0 = r10
            r1 = r11
            r2 = r12
            r4 = r14
            r6 = r16
            r7 = r17
            r8 = r19
            r9 = r18
            r0.<init>(r1, r2, r4, r6, r7, r8, r9)
            io.reactivex.Flowable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r10)
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

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> takeLast(long r8, java.util.concurrent.TimeUnit r10) {
            r7 = this;
            io.reactivex.Scheduler r4 = io.reactivex.schedulers.Schedulers.computation()
            r5 = 0
            int r6 = bufferSize()
            r0 = r7
            r1 = r8
            r3 = r10
            io.reactivex.Flowable r8 = r0.takeLast(r1, r3, r4, r5, r6)
            return r8
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> takeLast(long r8, java.util.concurrent.TimeUnit r10, io.reactivex.Scheduler r11) {
            r7 = this;
            r5 = 0
            int r6 = bufferSize()
            r0 = r7
            r1 = r8
            r3 = r10
            r4 = r11
            io.reactivex.Flowable r8 = r0.takeLast(r1, r3, r4, r5, r6)
            return r8
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> takeLast(long r8, java.util.concurrent.TimeUnit r10, io.reactivex.Scheduler r11, boolean r12) {
            r7 = this;
            int r6 = bufferSize()
            r0 = r7
            r1 = r8
            r3 = r10
            r4 = r11
            r5 = r12
            io.reactivex.Flowable r8 = r0.takeLast(r1, r3, r4, r5, r6)
            return r8
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> takeLast(long r10, java.util.concurrent.TimeUnit r12, io.reactivex.Scheduler r13, boolean r14, int r15) {
            r9 = this;
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r0 = r9
            r3 = r10
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            io.reactivex.Flowable r10 = r0.takeLast(r1, r3, r5, r6, r7, r8)
            return r10
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> takeLast(long r8, java.util.concurrent.TimeUnit r10, boolean r11) {
            r7 = this;
            io.reactivex.Scheduler r4 = io.reactivex.schedulers.Schedulers.computation()
            int r6 = bufferSize()
            r0 = r7
            r1 = r8
            r3 = r10
            r5 = r11
            io.reactivex.Flowable r8 = r0.takeLast(r1, r3, r4, r5, r6)
            return r8
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> takeUntil(io.reactivex.functions.Predicate<? super T> r2) {
            r1 = this;
            java.lang.String r0 = "stopPredicate is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.flowable.FlowableTakeUntilPredicate r0 = new io.reactivex.internal.operators.flowable.FlowableTakeUntilPredicate
            r0.<init>(r1, r2)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    public final <U> io.reactivex.Flowable<T> takeUntil(org.reactivestreams.Publisher<U> r2) {
            r1 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.flowable.FlowableTakeUntil r0 = new io.reactivex.internal.operators.flowable.FlowableTakeUntil
            r0.<init>(r1, r2)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> takeWhile(io.reactivex.functions.Predicate<? super T> r2) {
            r1 = this;
            java.lang.String r0 = "predicate is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.flowable.FlowableTakeWhile r0 = new io.reactivex.internal.operators.flowable.FlowableTakeWhile
            r0.<init>(r1, r2)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.subscribers.TestSubscriber<T> test() {
            r1 = this;
            io.reactivex.subscribers.TestSubscriber r0 = new io.reactivex.subscribers.TestSubscriber
            r0.<init>()
            r1.subscribe(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.subscribers.TestSubscriber<T> test(long r2) {
            r1 = this;
            io.reactivex.subscribers.TestSubscriber r0 = new io.reactivex.subscribers.TestSubscriber
            r0.<init>(r2)
            r1.subscribe(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.subscribers.TestSubscriber<T> test(long r2, boolean r4) {
            r1 = this;
            io.reactivex.subscribers.TestSubscriber r0 = new io.reactivex.subscribers.TestSubscriber
            r0.<init>(r2)
            if (r4 == 0) goto La
            r0.cancel()
        La:
            r1.subscribe(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> throttleFirst(long r2, java.util.concurrent.TimeUnit r4) {
            r1 = this;
            io.reactivex.Scheduler r0 = io.reactivex.schedulers.Schedulers.computation()
            io.reactivex.Flowable r2 = r1.throttleFirst(r2, r4, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> throttleFirst(long r8, java.util.concurrent.TimeUnit r10, io.reactivex.Scheduler r11) {
            r7 = this;
            java.lang.String r0 = "unit is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r10, r0)
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r11, r0)
            io.reactivex.internal.operators.flowable.FlowableThrottleFirstTimed r0 = new io.reactivex.internal.operators.flowable.FlowableThrottleFirstTimed
            r1 = r0
            r2 = r7
            r3 = r8
            r5 = r10
            r6 = r11
            r1.<init>(r2, r3, r5, r6)
            io.reactivex.Flowable r8 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r8
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> throttleLast(long r1, java.util.concurrent.TimeUnit r3) {
            r0 = this;
            io.reactivex.Flowable r1 = r0.sample(r1, r3)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> throttleLast(long r1, java.util.concurrent.TimeUnit r3, io.reactivex.Scheduler r4) {
            r0 = this;
            io.reactivex.Flowable r1 = r0.sample(r1, r3, r4)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> throttleLatest(long r7, java.util.concurrent.TimeUnit r9) {
            r6 = this;
            io.reactivex.Scheduler r4 = io.reactivex.schedulers.Schedulers.computation()
            r5 = 0
            r0 = r6
            r1 = r7
            r3 = r9
            io.reactivex.Flowable r7 = r0.throttleLatest(r1, r3, r4, r5)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> throttleLatest(long r7, java.util.concurrent.TimeUnit r9, io.reactivex.Scheduler r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r3 = r9
            r4 = r10
            io.reactivex.Flowable r7 = r0.throttleLatest(r1, r3, r4, r5)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> throttleLatest(long r9, java.util.concurrent.TimeUnit r11, io.reactivex.Scheduler r12, boolean r13) {
            r8 = this;
            java.lang.String r0 = "unit is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r11, r0)
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r12, r0)
            io.reactivex.internal.operators.flowable.FlowableThrottleLatest r0 = new io.reactivex.internal.operators.flowable.FlowableThrottleLatest
            r1 = r0
            r2 = r8
            r3 = r9
            r5 = r11
            r6 = r12
            r7 = r13
            r1.<init>(r2, r3, r5, r6, r7)
            io.reactivex.Flowable r9 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r9
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> throttleLatest(long r7, java.util.concurrent.TimeUnit r9, boolean r10) {
            r6 = this;
            io.reactivex.Scheduler r4 = io.reactivex.schedulers.Schedulers.computation()
            r0 = r6
            r1 = r7
            r3 = r9
            r5 = r10
            io.reactivex.Flowable r7 = r0.throttleLatest(r1, r3, r4, r5)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> throttleWithTimeout(long r1, java.util.concurrent.TimeUnit r3) {
            r0 = this;
            io.reactivex.Flowable r1 = r0.debounce(r1, r3)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> throttleWithTimeout(long r1, java.util.concurrent.TimeUnit r3, io.reactivex.Scheduler r4) {
            r0 = this;
            io.reactivex.Flowable r1 = r0.debounce(r1, r3, r4)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<io.reactivex.schedulers.Timed<T>> timeInterval() {
            r2 = this;
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            io.reactivex.Scheduler r1 = io.reactivex.schedulers.Schedulers.computation()
            io.reactivex.Flowable r0 = r2.timeInterval(r0, r1)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<io.reactivex.schedulers.Timed<T>> timeInterval(io.reactivex.Scheduler r2) {
            r1 = this;
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            io.reactivex.Flowable r2 = r1.timeInterval(r0, r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<io.reactivex.schedulers.Timed<T>> timeInterval(java.util.concurrent.TimeUnit r2) {
            r1 = this;
            io.reactivex.Scheduler r0 = io.reactivex.schedulers.Schedulers.computation()
            io.reactivex.Flowable r2 = r1.timeInterval(r2, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<io.reactivex.schedulers.Timed<T>> timeInterval(java.util.concurrent.TimeUnit r2, io.reactivex.Scheduler r3) {
            r1 = this;
            java.lang.String r0 = "unit is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.flowable.FlowableTimeInterval r0 = new io.reactivex.internal.operators.flowable.FlowableTimeInterval
            r0.<init>(r1, r2, r3)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> timeout(long r7, java.util.concurrent.TimeUnit r9) {
            r6 = this;
            r4 = 0
            io.reactivex.Scheduler r5 = io.reactivex.schedulers.Schedulers.computation()
            r0 = r6
            r1 = r7
            r3 = r9
            io.reactivex.Flowable r7 = r0.timeout0(r1, r3, r4, r5)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> timeout(long r7, java.util.concurrent.TimeUnit r9, io.reactivex.Scheduler r10) {
            r6 = this;
            r4 = 0
            r0 = r6
            r1 = r7
            r3 = r9
            r5 = r10
            io.reactivex.Flowable r7 = r0.timeout0(r1, r3, r4, r5)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> timeout(long r7, java.util.concurrent.TimeUnit r9, io.reactivex.Scheduler r10, org.reactivestreams.Publisher<? extends T> r11) {
            r6 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r11, r0)
            r0 = r6
            r1 = r7
            r3 = r9
            r4 = r11
            r5 = r10
            io.reactivex.Flowable r7 = r0.timeout0(r1, r3, r4, r5)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> timeout(long r8, java.util.concurrent.TimeUnit r10, org.reactivestreams.Publisher<? extends T> r11) {
            r7 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r11, r0)
            io.reactivex.Scheduler r6 = io.reactivex.schedulers.Schedulers.computation()
            r1 = r7
            r2 = r8
            r4 = r10
            r5 = r11
            io.reactivex.Flowable r8 = r1.timeout0(r2, r4, r5, r6)
            return r8
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    public final <V> io.reactivex.Flowable<T> timeout(io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<V>> r2) {
            r1 = this;
            r0 = 0
            io.reactivex.Flowable r2 = r1.timeout0(r0, r2, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <V> io.reactivex.Flowable<T> timeout(io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<V>> r2, io.reactivex.Flowable<? extends T> r3) {
            r1 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            r0 = 0
            io.reactivex.Flowable r2 = r1.timeout0(r0, r2, r3)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    public final <U, V> io.reactivex.Flowable<T> timeout(org.reactivestreams.Publisher<U> r2, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<V>> r3) {
            r1 = this;
            java.lang.String r0 = "firstTimeoutIndicator is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            r0 = 0
            io.reactivex.Flowable r2 = r1.timeout0(r2, r3, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <U, V> io.reactivex.Flowable<T> timeout(org.reactivestreams.Publisher<U> r2, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<V>> r3, org.reactivestreams.Publisher<? extends T> r4) {
            r1 = this;
            java.lang.String r0 = "firstTimeoutSelector is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            io.reactivex.Flowable r2 = r1.timeout0(r2, r3, r4)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<io.reactivex.schedulers.Timed<T>> timestamp() {
            r2 = this;
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            io.reactivex.Scheduler r1 = io.reactivex.schedulers.Schedulers.computation()
            io.reactivex.Flowable r0 = r2.timestamp(r0, r1)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<io.reactivex.schedulers.Timed<T>> timestamp(io.reactivex.Scheduler r2) {
            r1 = this;
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            io.reactivex.Flowable r2 = r1.timestamp(r0, r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<io.reactivex.schedulers.Timed<T>> timestamp(java.util.concurrent.TimeUnit r2) {
            r1 = this;
            io.reactivex.Scheduler r0 = io.reactivex.schedulers.Schedulers.computation()
            io.reactivex.Flowable r2 = r1.timestamp(r2, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<io.reactivex.schedulers.Timed<T>> timestamp(java.util.concurrent.TimeUnit r2, io.reactivex.Scheduler r3) {
            r1 = this;
            java.lang.String r0 = "unit is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.functions.Function r2 = io.reactivex.internal.functions.Functions.timestampWith(r2, r3)
            io.reactivex.Flowable r2 = r1.map(r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.SPECIAL)
    @io.reactivex.annotations.CheckReturnValue
    /* renamed from: to */
    public final <R> R m44to(io.reactivex.functions.Function<? super io.reactivex.Flowable<T>, R> r2) {
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
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final java.util.concurrent.Future<T> toFuture() {
            r1 = this;
            io.reactivex.internal.subscribers.FutureSubscriber r0 = new io.reactivex.internal.subscribers.FutureSubscriber
            r0.<init>()
            org.reactivestreams.Subscriber r0 = r1.subscribeWith(r0)
            java.util.concurrent.Future r0 = (java.util.concurrent.Future) r0
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<java.util.List<T>> toList() {
            r1 = this;
            io.reactivex.internal.operators.flowable.FlowableToListSingle r0 = new io.reactivex.internal.operators.flowable.FlowableToListSingle
            r0.<init>(r1)
            io.reactivex.Single r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<java.util.List<T>> toList(int r2) {
            r1 = this;
            java.lang.String r0 = "capacityHint"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r2, r0)
            io.reactivex.internal.operators.flowable.FlowableToListSingle r0 = new io.reactivex.internal.operators.flowable.FlowableToListSingle
            java.util.concurrent.Callable r2 = io.reactivex.internal.functions.Functions.createArrayList(r2)
            r0.<init>(r1, r2)
            io.reactivex.Single r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final <U extends java.util.Collection<? super T>> io.reactivex.Single<U> toList(java.util.concurrent.Callable<U> r2) {
            r1 = this;
            java.lang.String r0 = "collectionSupplier is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.flowable.FlowableToListSingle r0 = new io.reactivex.internal.operators.flowable.FlowableToListSingle
            r0.<init>(r1, r2)
            io.reactivex.Single r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
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
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
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
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final <K, V> io.reactivex.Single<java.util.Map<K, V>> toMap(io.reactivex.functions.Function<? super T, ? extends K> r2, io.reactivex.functions.Function<? super T, ? extends V> r3, java.util.concurrent.Callable<? extends java.util.Map<K, V>> r4) {
            r1 = this;
            java.lang.String r0 = "keySelector is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "valueSelector is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.functions.BiConsumer r2 = io.reactivex.internal.functions.Functions.toMapKeyValueSelector(r2, r3)
            io.reactivex.Single r2 = r1.collect(r4, r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
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
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final <K, V> io.reactivex.Single<java.util.Map<K, java.util.Collection<V>>> toMultimap(io.reactivex.functions.Function<? super T, ? extends K> r3, io.reactivex.functions.Function<? super T, ? extends V> r4) {
            r2 = this;
            java.util.concurrent.Callable r0 = io.reactivex.internal.util.HashMapSupplier.asCallable()
            io.reactivex.functions.Function r1 = io.reactivex.internal.util.ArrayListSupplier.asFunction()
            io.reactivex.Single r3 = r2.toMultimap(r3, r4, r0, r1)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final <K, V> io.reactivex.Single<java.util.Map<K, java.util.Collection<V>>> toMultimap(io.reactivex.functions.Function<? super T, ? extends K> r2, io.reactivex.functions.Function<? super T, ? extends V> r3, java.util.concurrent.Callable<java.util.Map<K, java.util.Collection<V>>> r4) {
            r1 = this;
            io.reactivex.functions.Function r0 = io.reactivex.internal.util.ArrayListSupplier.asFunction()
            io.reactivex.Single r2 = r1.toMultimap(r2, r3, r4, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
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
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.NONE)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Observable<T> toObservable() {
            r1 = this;
            io.reactivex.internal.operators.observable.ObservableFromPublisher r0 = new io.reactivex.internal.operators.observable.ObservableFromPublisher
            r0.<init>(r1)
            io.reactivex.Observable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<java.util.List<T>> toSortedList() {
            r1 = this;
            java.util.Comparator r0 = io.reactivex.internal.functions.Functions.naturalComparator()
            io.reactivex.Single r0 = r1.toSortedList(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Single<java.util.List<T>> toSortedList(int r2) {
            r1 = this;
            java.util.Comparator r0 = io.reactivex.internal.functions.Functions.naturalComparator()
            io.reactivex.Single r2 = r1.toSortedList(r0, r2)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
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
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
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
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> unsubscribeOn(io.reactivex.Scheduler r2) {
            r1 = this;
            java.lang.String r0 = "scheduler is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.internal.operators.flowable.FlowableUnsubscribeOn r0 = new io.reactivex.internal.operators.flowable.FlowableUnsubscribeOn
            r0.<init>(r1, r2)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<io.reactivex.Flowable<T>> window(long r7) {
            r6 = this;
            int r5 = bufferSize()
            r0 = r6
            r1 = r7
            r3 = r7
            io.reactivex.Flowable r7 = r0.window(r1, r3, r5)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<io.reactivex.Flowable<T>> window(long r7, long r9) {
            r6 = this;
            int r5 = bufferSize()
            r0 = r6
            r1 = r7
            r3 = r9
            io.reactivex.Flowable r7 = r0.window(r1, r3, r5)
            return r7
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<io.reactivex.Flowable<T>> window(long r9, long r11, int r13) {
            r8 = this;
            java.lang.String r0 = "skip"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r11, r0)
            java.lang.String r0 = "count"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r9, r0)
            java.lang.String r0 = "bufferSize"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r13, r0)
            io.reactivex.internal.operators.flowable.FlowableWindow r0 = new io.reactivex.internal.operators.flowable.FlowableWindow
            r1 = r0
            r2 = r8
            r3 = r9
            r5 = r11
            r7 = r13
            r1.<init>(r2, r3, r5, r7)
            io.reactivex.Flowable r9 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r9
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<io.reactivex.Flowable<T>> window(long r9, long r11, java.util.concurrent.TimeUnit r13) {
            r8 = this;
            io.reactivex.Scheduler r6 = io.reactivex.schedulers.Schedulers.computation()
            int r7 = bufferSize()
            r0 = r8
            r1 = r9
            r3 = r11
            r5 = r13
            io.reactivex.Flowable r9 = r0.window(r1, r3, r5, r6, r7)
            return r9
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<io.reactivex.Flowable<T>> window(long r9, long r11, java.util.concurrent.TimeUnit r13, io.reactivex.Scheduler r14) {
            r8 = this;
            int r7 = bufferSize()
            r0 = r8
            r1 = r9
            r3 = r11
            r5 = r13
            r6 = r14
            io.reactivex.Flowable r9 = r0.window(r1, r3, r5, r6, r7)
            return r9
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<io.reactivex.Flowable<T>> window(long r14, long r16, java.util.concurrent.TimeUnit r18, io.reactivex.Scheduler r19, int r20) {
            r13 = this;
            java.lang.String r0 = "bufferSize"
            r11 = r20
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r11, r0)
            java.lang.String r0 = "timespan"
            r3 = r14
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r14, r0)
            java.lang.String r0 = "timeskip"
            r5 = r16
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r5, r0)
            java.lang.String r0 = "scheduler is null"
            r8 = r19
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r8, r0)
            java.lang.String r0 = "unit is null"
            r7 = r18
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r0)
            io.reactivex.internal.operators.flowable.FlowableWindowTimed r0 = new io.reactivex.internal.operators.flowable.FlowableWindowTimed
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12 = 0
            r1 = r0
            r2 = r13
            r1.<init>(r2, r3, r5, r7, r8, r9, r11, r12)
            io.reactivex.Flowable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<io.reactivex.Flowable<T>> window(long r9, java.util.concurrent.TimeUnit r11) {
            r8 = this;
            io.reactivex.Scheduler r4 = io.reactivex.schedulers.Schedulers.computation()
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r7 = 0
            r0 = r8
            r1 = r9
            r3 = r11
            io.reactivex.Flowable r9 = r0.window(r1, r3, r4, r5, r7)
            return r9
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<io.reactivex.Flowable<T>> window(long r9, java.util.concurrent.TimeUnit r11, long r12) {
            r8 = this;
            io.reactivex.Scheduler r4 = io.reactivex.schedulers.Schedulers.computation()
            r7 = 0
            r0 = r8
            r1 = r9
            r3 = r11
            r5 = r12
            io.reactivex.Flowable r9 = r0.window(r1, r3, r4, r5, r7)
            return r9
    }

    @io.reactivex.annotations.SchedulerSupport("io.reactivex:computation")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<io.reactivex.Flowable<T>> window(long r9, java.util.concurrent.TimeUnit r11, long r12, boolean r14) {
            r8 = this;
            io.reactivex.Scheduler r4 = io.reactivex.schedulers.Schedulers.computation()
            r0 = r8
            r1 = r9
            r3 = r11
            r5 = r12
            r7 = r14
            io.reactivex.Flowable r9 = r0.window(r1, r3, r4, r5, r7)
            return r9
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<io.reactivex.Flowable<T>> window(long r9, java.util.concurrent.TimeUnit r11, io.reactivex.Scheduler r12) {
            r8 = this;
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r7 = 0
            r0 = r8
            r1 = r9
            r3 = r11
            r4 = r12
            io.reactivex.Flowable r9 = r0.window(r1, r3, r4, r5, r7)
            return r9
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<io.reactivex.Flowable<T>> window(long r9, java.util.concurrent.TimeUnit r11, io.reactivex.Scheduler r12, long r13) {
            r8 = this;
            r7 = 0
            r0 = r8
            r1 = r9
            r3 = r11
            r4 = r12
            r5 = r13
            io.reactivex.Flowable r9 = r0.window(r1, r3, r4, r5, r7)
            return r9
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<io.reactivex.Flowable<T>> window(long r10, java.util.concurrent.TimeUnit r12, io.reactivex.Scheduler r13, long r14, boolean r16) {
            r9 = this;
            int r8 = bufferSize()
            r0 = r9
            r1 = r10
            r3 = r12
            r4 = r13
            r5 = r14
            r7 = r16
            io.reactivex.Flowable r0 = r0.window(r1, r3, r4, r5, r7, r8)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("custom")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<io.reactivex.Flowable<T>> window(long r14, java.util.concurrent.TimeUnit r16, io.reactivex.Scheduler r17, long r18, boolean r20, int r21) {
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
            io.reactivex.internal.operators.flowable.FlowableWindowTimed r0 = new io.reactivex.internal.operators.flowable.FlowableWindowTimed
            r1 = r0
            r2 = r13
            r3 = r14
            r5 = r14
            r12 = r20
            r1.<init>(r2, r3, r5, r7, r8, r9, r11, r12)
            io.reactivex.Flowable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public final <B> io.reactivex.Flowable<io.reactivex.Flowable<T>> window(java.util.concurrent.Callable<? extends org.reactivestreams.Publisher<B>> r2) {
            r1 = this;
            int r0 = bufferSize()
            io.reactivex.Flowable r2 = r1.window(r2, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public final <B> io.reactivex.Flowable<io.reactivex.Flowable<T>> window(java.util.concurrent.Callable<? extends org.reactivestreams.Publisher<B>> r2, int r3) {
            r1 = this;
            java.lang.String r0 = "boundaryIndicatorSupplier is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "bufferSize"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r3, r0)
            io.reactivex.internal.operators.flowable.FlowableWindowBoundarySupplier r0 = new io.reactivex.internal.operators.flowable.FlowableWindowBoundarySupplier
            r0.<init>(r1, r2, r3)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public final <B> io.reactivex.Flowable<io.reactivex.Flowable<T>> window(org.reactivestreams.Publisher<B> r2) {
            r1 = this;
            int r0 = bufferSize()
            io.reactivex.Flowable r2 = r1.window(r2, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public final <B> io.reactivex.Flowable<io.reactivex.Flowable<T>> window(org.reactivestreams.Publisher<B> r2, int r3) {
            r1 = this;
            java.lang.String r0 = "boundaryIndicator is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "bufferSize"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r3, r0)
            io.reactivex.internal.operators.flowable.FlowableWindowBoundary r0 = new io.reactivex.internal.operators.flowable.FlowableWindowBoundary
            r0.<init>(r1, r2, r3)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public final <U, V> io.reactivex.Flowable<io.reactivex.Flowable<T>> window(org.reactivestreams.Publisher<U> r2, io.reactivex.functions.Function<? super U, ? extends org.reactivestreams.Publisher<V>> r3) {
            r1 = this;
            int r0 = bufferSize()
            io.reactivex.Flowable r2 = r1.window(r2, r3, r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.ERROR)
    @io.reactivex.annotations.CheckReturnValue
    public final <U, V> io.reactivex.Flowable<io.reactivex.Flowable<T>> window(org.reactivestreams.Publisher<U> r2, io.reactivex.functions.Function<? super U, ? extends org.reactivestreams.Publisher<V>> r3, int r4) {
            r1 = this;
            java.lang.String r0 = "openingIndicator is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "closingIndicator is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "bufferSize"
            io.reactivex.internal.functions.ObjectHelper.verifyPositive(r4, r0)
            io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector r0 = new io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector
            r0.<init>(r1, r2, r3, r4)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Flowable<R> withLatestFrom(java.lang.Iterable<? extends org.reactivestreams.Publisher<?>> r2, io.reactivex.functions.Function<? super java.lang.Object[], R> r3) {
            r1 = this;
            java.lang.String r0 = "others is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "combiner is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany r0 = new io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany
            r0.<init>(r1, r2, r3)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    public final <U, R> io.reactivex.Flowable<R> withLatestFrom(org.reactivestreams.Publisher<? extends U> r2, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> r3) {
            r1 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "combiner is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.flowable.FlowableWithLatestFrom r0 = new io.reactivex.internal.operators.flowable.FlowableWithLatestFrom
            r0.<init>(r1, r3, r2)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    public final <T1, T2, R> io.reactivex.Flowable<R> withLatestFrom(org.reactivestreams.Publisher<T1> r3, org.reactivestreams.Publisher<T2> r4, io.reactivex.functions.Function3<? super T, ? super T1, ? super T2, R> r5) {
            r2 = this;
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            io.reactivex.functions.Function r5 = io.reactivex.internal.functions.Functions.toFunction(r5)
            r0 = 2
            org.reactivestreams.Publisher[] r0 = new org.reactivestreams.Publisher[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            io.reactivex.Flowable r3 = r2.withLatestFrom(r0, r5)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    public final <T1, T2, T3, R> io.reactivex.Flowable<R> withLatestFrom(org.reactivestreams.Publisher<T1> r3, org.reactivestreams.Publisher<T2> r4, org.reactivestreams.Publisher<T3> r5, io.reactivex.functions.Function4<? super T, ? super T1, ? super T2, ? super T3, R> r6) {
            r2 = this;
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            java.lang.String r0 = "source3 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            io.reactivex.functions.Function r6 = io.reactivex.internal.functions.Functions.toFunction(r6)
            r0 = 3
            org.reactivestreams.Publisher[] r0 = new org.reactivestreams.Publisher[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            r3 = 2
            r0[r3] = r5
            io.reactivex.Flowable r3 = r2.withLatestFrom(r0, r6)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    public final <T1, T2, T3, T4, R> io.reactivex.Flowable<R> withLatestFrom(org.reactivestreams.Publisher<T1> r3, org.reactivestreams.Publisher<T2> r4, org.reactivestreams.Publisher<T3> r5, org.reactivestreams.Publisher<T4> r6, io.reactivex.functions.Function5<? super T, ? super T1, ? super T2, ? super T3, ? super T4, R> r7) {
            r2 = this;
            java.lang.String r0 = "source1 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.lang.String r0 = "source2 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            java.lang.String r0 = "source3 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            java.lang.String r0 = "source4 is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r0)
            io.reactivex.functions.Function r7 = io.reactivex.internal.functions.Functions.toFunction(r7)
            r0 = 4
            org.reactivestreams.Publisher[] r0 = new org.reactivestreams.Publisher[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            r3 = 2
            r0[r3] = r5
            r3 = 3
            r0[r3] = r6
            io.reactivex.Flowable r3 = r2.withLatestFrom(r0, r7)
            return r3
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.Flowable<R> withLatestFrom(org.reactivestreams.Publisher<?>[] r2, io.reactivex.functions.Function<? super java.lang.Object[], R> r3) {
            r1 = this;
            java.lang.String r0 = "others is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "combiner is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany r0 = new io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany
            r0.<init>(r1, r2, r3)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <U, R> io.reactivex.Flowable<R> zipWith(java.lang.Iterable<U> r2, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> r3) {
            r1 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            java.lang.String r0 = "zipper is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.operators.flowable.FlowableZipIterable r0 = new io.reactivex.internal.operators.flowable.FlowableZipIterable
            r0.<init>(r1, r2, r3)
            io.reactivex.Flowable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <U, R> io.reactivex.Flowable<R> zipWith(org.reactivestreams.Publisher<? extends U> r2, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> r3) {
            r1 = this;
            java.lang.String r0 = "other is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            io.reactivex.Flowable r2 = zip(r1, r2, r3)
            return r2
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <U, R> io.reactivex.Flowable<R> zipWith(org.reactivestreams.Publisher<? extends U> r1, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> r2, boolean r3) {
            r0 = this;
            io.reactivex.Flowable r1 = zip(r0, r1, r2, r3)
            return r1
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final <U, R> io.reactivex.Flowable<R> zipWith(org.reactivestreams.Publisher<? extends U> r1, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> r2, boolean r3, int r4) {
            r0 = this;
            io.reactivex.Flowable r1 = zip(r0, r1, r2, r3, r4)
            return r1
    }
}
