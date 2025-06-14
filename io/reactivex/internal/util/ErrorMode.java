package io.reactivex.internal.util;

/* loaded from: classes.dex */
public enum ErrorMode extends java.lang.Enum<io.reactivex.internal.util.ErrorMode> {
    private static final /* synthetic */ io.reactivex.internal.util.ErrorMode[] $VALUES = null;
    public static final io.reactivex.internal.util.ErrorMode BOUNDARY = null;
    public static final io.reactivex.internal.util.ErrorMode END = null;
    public static final io.reactivex.internal.util.ErrorMode IMMEDIATE = null;

    static {
            io.reactivex.internal.util.ErrorMode r0 = new io.reactivex.internal.util.ErrorMode
            java.lang.String r1 = "IMMEDIATE"
            r2 = 0
            r0.<init>(r1, r2)
            io.reactivex.internal.util.ErrorMode.IMMEDIATE = r0
            io.reactivex.internal.util.ErrorMode r1 = new io.reactivex.internal.util.ErrorMode
            java.lang.String r3 = "BOUNDARY"
            r4 = 1
            r1.<init>(r3, r4)
            io.reactivex.internal.util.ErrorMode.BOUNDARY = r1
            io.reactivex.internal.util.ErrorMode r3 = new io.reactivex.internal.util.ErrorMode
            java.lang.String r5 = "END"
            r6 = 2
            r3.<init>(r5, r6)
            io.reactivex.internal.util.ErrorMode.END = r3
            r5 = 3
            io.reactivex.internal.util.ErrorMode[] r5 = new io.reactivex.internal.util.ErrorMode[r5]
            r5[r2] = r0
            r5[r4] = r1
            r5[r6] = r3
            io.reactivex.internal.util.ErrorMode.$VALUES = r5
            return
    }

    ErrorMode(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static io.reactivex.internal.util.ErrorMode valueOf(java.lang.String r1) {
            java.lang.Class<io.reactivex.internal.util.ErrorMode> r0 = io.reactivex.internal.util.ErrorMode.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.reactivex.internal.util.ErrorMode r1 = (io.reactivex.internal.util.ErrorMode) r1
            return r1
    }

    public static io.reactivex.internal.util.ErrorMode[] values() {
            io.reactivex.internal.util.ErrorMode[] r0 = io.reactivex.internal.util.ErrorMode.$VALUES
            java.lang.Object r0 = r0.clone()
            io.reactivex.internal.util.ErrorMode[] r0 = (io.reactivex.internal.util.ErrorMode[]) r0
            return r0
    }
}
