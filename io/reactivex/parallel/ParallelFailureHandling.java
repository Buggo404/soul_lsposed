package io.reactivex.parallel;

/* loaded from: classes.dex */
public enum ParallelFailureHandling extends java.lang.Enum<io.reactivex.parallel.ParallelFailureHandling> implements io.reactivex.functions.BiFunction<java.lang.Long, java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> {
    private static final /* synthetic */ io.reactivex.parallel.ParallelFailureHandling[] $VALUES = null;
    public static final io.reactivex.parallel.ParallelFailureHandling ERROR = null;
    public static final io.reactivex.parallel.ParallelFailureHandling RETRY = null;
    public static final io.reactivex.parallel.ParallelFailureHandling SKIP = null;
    public static final io.reactivex.parallel.ParallelFailureHandling STOP = null;

    static {
            io.reactivex.parallel.ParallelFailureHandling r0 = new io.reactivex.parallel.ParallelFailureHandling
            java.lang.String r1 = "STOP"
            r2 = 0
            r0.<init>(r1, r2)
            io.reactivex.parallel.ParallelFailureHandling.STOP = r0
            io.reactivex.parallel.ParallelFailureHandling r1 = new io.reactivex.parallel.ParallelFailureHandling
            java.lang.String r3 = "ERROR"
            r4 = 1
            r1.<init>(r3, r4)
            io.reactivex.parallel.ParallelFailureHandling.ERROR = r1
            io.reactivex.parallel.ParallelFailureHandling r3 = new io.reactivex.parallel.ParallelFailureHandling
            java.lang.String r5 = "SKIP"
            r6 = 2
            r3.<init>(r5, r6)
            io.reactivex.parallel.ParallelFailureHandling.SKIP = r3
            io.reactivex.parallel.ParallelFailureHandling r5 = new io.reactivex.parallel.ParallelFailureHandling
            java.lang.String r7 = "RETRY"
            r8 = 3
            r5.<init>(r7, r8)
            io.reactivex.parallel.ParallelFailureHandling.RETRY = r5
            r7 = 4
            io.reactivex.parallel.ParallelFailureHandling[] r7 = new io.reactivex.parallel.ParallelFailureHandling[r7]
            r7[r2] = r0
            r7[r4] = r1
            r7[r6] = r3
            r7[r8] = r5
            io.reactivex.parallel.ParallelFailureHandling.$VALUES = r7
            return
    }

    ParallelFailureHandling(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static io.reactivex.parallel.ParallelFailureHandling valueOf(java.lang.String r1) {
            java.lang.Class<io.reactivex.parallel.ParallelFailureHandling> r0 = io.reactivex.parallel.ParallelFailureHandling.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.reactivex.parallel.ParallelFailureHandling r1 = (io.reactivex.parallel.ParallelFailureHandling) r1
            return r1
    }

    public static io.reactivex.parallel.ParallelFailureHandling[] values() {
            io.reactivex.parallel.ParallelFailureHandling[] r0 = io.reactivex.parallel.ParallelFailureHandling.$VALUES
            java.lang.Object r0 = r0.clone()
            io.reactivex.parallel.ParallelFailureHandling[] r0 = (io.reactivex.parallel.ParallelFailureHandling[]) r0
            return r0
    }

    /* renamed from: apply, reason: avoid collision after fix types in other method */
    public io.reactivex.parallel.ParallelFailureHandling apply2(java.lang.Long r1, java.lang.Throwable r2) {
            r0 = this;
            return r0
    }

    @Override // io.reactivex.functions.BiFunction
    public /* bridge */ /* synthetic */ io.reactivex.parallel.ParallelFailureHandling apply(java.lang.Long r1, java.lang.Throwable r2) throws java.lang.Exception {
            r0 = this;
            java.lang.Long r1 = (java.lang.Long) r1
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            io.reactivex.parallel.ParallelFailureHandling r1 = r0.apply2(r1, r2)
            return r1
    }
}
