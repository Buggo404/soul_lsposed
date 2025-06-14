package io.reactivex;

/* loaded from: classes.dex */
public enum BackpressureOverflowStrategy extends java.lang.Enum<io.reactivex.BackpressureOverflowStrategy> {
    private static final /* synthetic */ io.reactivex.BackpressureOverflowStrategy[] $VALUES = null;
    public static final io.reactivex.BackpressureOverflowStrategy DROP_LATEST = null;
    public static final io.reactivex.BackpressureOverflowStrategy DROP_OLDEST = null;
    public static final io.reactivex.BackpressureOverflowStrategy ERROR = null;

    static {
            io.reactivex.BackpressureOverflowStrategy r0 = new io.reactivex.BackpressureOverflowStrategy
            java.lang.String r1 = "ERROR"
            r2 = 0
            r0.<init>(r1, r2)
            io.reactivex.BackpressureOverflowStrategy.ERROR = r0
            io.reactivex.BackpressureOverflowStrategy r1 = new io.reactivex.BackpressureOverflowStrategy
            java.lang.String r3 = "DROP_OLDEST"
            r4 = 1
            r1.<init>(r3, r4)
            io.reactivex.BackpressureOverflowStrategy.DROP_OLDEST = r1
            io.reactivex.BackpressureOverflowStrategy r3 = new io.reactivex.BackpressureOverflowStrategy
            java.lang.String r5 = "DROP_LATEST"
            r6 = 2
            r3.<init>(r5, r6)
            io.reactivex.BackpressureOverflowStrategy.DROP_LATEST = r3
            r5 = 3
            io.reactivex.BackpressureOverflowStrategy[] r5 = new io.reactivex.BackpressureOverflowStrategy[r5]
            r5[r2] = r0
            r5[r4] = r1
            r5[r6] = r3
            io.reactivex.BackpressureOverflowStrategy.$VALUES = r5
            return
    }

    BackpressureOverflowStrategy(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static io.reactivex.BackpressureOverflowStrategy valueOf(java.lang.String r1) {
            java.lang.Class<io.reactivex.BackpressureOverflowStrategy> r0 = io.reactivex.BackpressureOverflowStrategy.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.reactivex.BackpressureOverflowStrategy r1 = (io.reactivex.BackpressureOverflowStrategy) r1
            return r1
    }

    public static io.reactivex.BackpressureOverflowStrategy[] values() {
            io.reactivex.BackpressureOverflowStrategy[] r0 = io.reactivex.BackpressureOverflowStrategy.$VALUES
            java.lang.Object r0 = r0.clone()
            io.reactivex.BackpressureOverflowStrategy[] r0 = (io.reactivex.BackpressureOverflowStrategy[]) r0
            return r0
    }
}
