package io.reactivex.annotations;

/* loaded from: classes.dex */
public enum BackpressureKind extends java.lang.Enum<io.reactivex.annotations.BackpressureKind> {
    private static final /* synthetic */ io.reactivex.annotations.BackpressureKind[] $VALUES = null;
    public static final io.reactivex.annotations.BackpressureKind ERROR = null;
    public static final io.reactivex.annotations.BackpressureKind FULL = null;
    public static final io.reactivex.annotations.BackpressureKind NONE = null;
    public static final io.reactivex.annotations.BackpressureKind PASS_THROUGH = null;
    public static final io.reactivex.annotations.BackpressureKind SPECIAL = null;
    public static final io.reactivex.annotations.BackpressureKind UNBOUNDED_IN = null;

    static {
            io.reactivex.annotations.BackpressureKind r0 = new io.reactivex.annotations.BackpressureKind
            java.lang.String r1 = "PASS_THROUGH"
            r2 = 0
            r0.<init>(r1, r2)
            io.reactivex.annotations.BackpressureKind.PASS_THROUGH = r0
            io.reactivex.annotations.BackpressureKind r1 = new io.reactivex.annotations.BackpressureKind
            java.lang.String r3 = "FULL"
            r4 = 1
            r1.<init>(r3, r4)
            io.reactivex.annotations.BackpressureKind.FULL = r1
            io.reactivex.annotations.BackpressureKind r3 = new io.reactivex.annotations.BackpressureKind
            java.lang.String r5 = "SPECIAL"
            r6 = 2
            r3.<init>(r5, r6)
            io.reactivex.annotations.BackpressureKind.SPECIAL = r3
            io.reactivex.annotations.BackpressureKind r5 = new io.reactivex.annotations.BackpressureKind
            java.lang.String r7 = "UNBOUNDED_IN"
            r8 = 3
            r5.<init>(r7, r8)
            io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN = r5
            io.reactivex.annotations.BackpressureKind r7 = new io.reactivex.annotations.BackpressureKind
            java.lang.String r9 = "ERROR"
            r10 = 4
            r7.<init>(r9, r10)
            io.reactivex.annotations.BackpressureKind.ERROR = r7
            io.reactivex.annotations.BackpressureKind r9 = new io.reactivex.annotations.BackpressureKind
            java.lang.String r11 = "NONE"
            r12 = 5
            r9.<init>(r11, r12)
            io.reactivex.annotations.BackpressureKind.NONE = r9
            r11 = 6
            io.reactivex.annotations.BackpressureKind[] r11 = new io.reactivex.annotations.BackpressureKind[r11]
            r11[r2] = r0
            r11[r4] = r1
            r11[r6] = r3
            r11[r8] = r5
            r11[r10] = r7
            r11[r12] = r9
            io.reactivex.annotations.BackpressureKind.$VALUES = r11
            return
    }

    BackpressureKind(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static io.reactivex.annotations.BackpressureKind valueOf(java.lang.String r1) {
            java.lang.Class<io.reactivex.annotations.BackpressureKind> r0 = io.reactivex.annotations.BackpressureKind.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.reactivex.annotations.BackpressureKind r1 = (io.reactivex.annotations.BackpressureKind) r1
            return r1
    }

    public static io.reactivex.annotations.BackpressureKind[] values() {
            io.reactivex.annotations.BackpressureKind[] r0 = io.reactivex.annotations.BackpressureKind.$VALUES
            java.lang.Object r0 = r0.clone()
            io.reactivex.annotations.BackpressureKind[] r0 = (io.reactivex.annotations.BackpressureKind[]) r0
            return r0
    }
}
