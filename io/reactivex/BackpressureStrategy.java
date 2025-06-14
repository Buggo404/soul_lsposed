package io.reactivex;

/* loaded from: classes.dex */
public enum BackpressureStrategy extends java.lang.Enum<io.reactivex.BackpressureStrategy> {
    private static final /* synthetic */ io.reactivex.BackpressureStrategy[] $VALUES = null;
    public static final io.reactivex.BackpressureStrategy BUFFER = null;
    public static final io.reactivex.BackpressureStrategy DROP = null;
    public static final io.reactivex.BackpressureStrategy ERROR = null;
    public static final io.reactivex.BackpressureStrategy LATEST = null;
    public static final io.reactivex.BackpressureStrategy MISSING = null;

    static {
            io.reactivex.BackpressureStrategy r0 = new io.reactivex.BackpressureStrategy
            java.lang.String r1 = "MISSING"
            r2 = 0
            r0.<init>(r1, r2)
            io.reactivex.BackpressureStrategy.MISSING = r0
            io.reactivex.BackpressureStrategy r1 = new io.reactivex.BackpressureStrategy
            java.lang.String r3 = "ERROR"
            r4 = 1
            r1.<init>(r3, r4)
            io.reactivex.BackpressureStrategy.ERROR = r1
            io.reactivex.BackpressureStrategy r3 = new io.reactivex.BackpressureStrategy
            java.lang.String r5 = "BUFFER"
            r6 = 2
            r3.<init>(r5, r6)
            io.reactivex.BackpressureStrategy.BUFFER = r3
            io.reactivex.BackpressureStrategy r5 = new io.reactivex.BackpressureStrategy
            java.lang.String r7 = "DROP"
            r8 = 3
            r5.<init>(r7, r8)
            io.reactivex.BackpressureStrategy.DROP = r5
            io.reactivex.BackpressureStrategy r7 = new io.reactivex.BackpressureStrategy
            java.lang.String r9 = "LATEST"
            r10 = 4
            r7.<init>(r9, r10)
            io.reactivex.BackpressureStrategy.LATEST = r7
            r9 = 5
            io.reactivex.BackpressureStrategy[] r9 = new io.reactivex.BackpressureStrategy[r9]
            r9[r2] = r0
            r9[r4] = r1
            r9[r6] = r3
            r9[r8] = r5
            r9[r10] = r7
            io.reactivex.BackpressureStrategy.$VALUES = r9
            return
    }

    BackpressureStrategy(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static io.reactivex.BackpressureStrategy valueOf(java.lang.String r1) {
            java.lang.Class<io.reactivex.BackpressureStrategy> r0 = io.reactivex.BackpressureStrategy.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.reactivex.BackpressureStrategy r1 = (io.reactivex.BackpressureStrategy) r1
            return r1
    }

    public static io.reactivex.BackpressureStrategy[] values() {
            io.reactivex.BackpressureStrategy[] r0 = io.reactivex.BackpressureStrategy.$VALUES
            java.lang.Object r0 = r0.clone()
            io.reactivex.BackpressureStrategy[] r0 = (io.reactivex.BackpressureStrategy[]) r0
            return r0
    }
}
