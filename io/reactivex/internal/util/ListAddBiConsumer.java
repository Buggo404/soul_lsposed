package io.reactivex.internal.util;

/* loaded from: classes.dex */
public enum ListAddBiConsumer extends java.lang.Enum<io.reactivex.internal.util.ListAddBiConsumer> implements io.reactivex.functions.BiFunction<java.util.List, java.lang.Object, java.util.List> {
    private static final /* synthetic */ io.reactivex.internal.util.ListAddBiConsumer[] $VALUES = null;
    public static final io.reactivex.internal.util.ListAddBiConsumer INSTANCE = null;

    static {
            io.reactivex.internal.util.ListAddBiConsumer r0 = new io.reactivex.internal.util.ListAddBiConsumer
            java.lang.String r1 = "INSTANCE"
            r2 = 0
            r0.<init>(r1, r2)
            io.reactivex.internal.util.ListAddBiConsumer.INSTANCE = r0
            r1 = 1
            io.reactivex.internal.util.ListAddBiConsumer[] r1 = new io.reactivex.internal.util.ListAddBiConsumer[r1]
            r1[r2] = r0
            io.reactivex.internal.util.ListAddBiConsumer.$VALUES = r1
            return
    }

    ListAddBiConsumer(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static <T> io.reactivex.functions.BiFunction<java.util.List<T>, T, java.util.List<T>> instance() {
            io.reactivex.internal.util.ListAddBiConsumer r0 = io.reactivex.internal.util.ListAddBiConsumer.INSTANCE
            return r0
    }

    public static io.reactivex.internal.util.ListAddBiConsumer valueOf(java.lang.String r1) {
            java.lang.Class<io.reactivex.internal.util.ListAddBiConsumer> r0 = io.reactivex.internal.util.ListAddBiConsumer.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.reactivex.internal.util.ListAddBiConsumer r1 = (io.reactivex.internal.util.ListAddBiConsumer) r1
            return r1
    }

    public static io.reactivex.internal.util.ListAddBiConsumer[] values() {
            io.reactivex.internal.util.ListAddBiConsumer[] r0 = io.reactivex.internal.util.ListAddBiConsumer.$VALUES
            java.lang.Object r0 = r0.clone()
            io.reactivex.internal.util.ListAddBiConsumer[] r0 = (io.reactivex.internal.util.ListAddBiConsumer[]) r0
            return r0
    }

    @Override // io.reactivex.functions.BiFunction
    public /* bridge */ /* synthetic */ java.util.List apply(java.util.List r1, java.lang.Object r2) throws java.lang.Exception {
            r0 = this;
            java.util.List r1 = (java.util.List) r1
            java.util.List r1 = r0.apply2(r1, r2)
            return r1
    }

    /* renamed from: apply, reason: avoid collision after fix types in other method */
    public java.util.List apply2(java.util.List r1, java.lang.Object r2) throws java.lang.Exception {
            r0 = this;
            r1.add(r2)
            return r1
    }
}
