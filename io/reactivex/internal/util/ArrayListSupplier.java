package io.reactivex.internal.util;

/* loaded from: classes.dex */
public enum ArrayListSupplier extends java.lang.Enum<io.reactivex.internal.util.ArrayListSupplier> implements java.util.concurrent.Callable<java.util.List<java.lang.Object>>, io.reactivex.functions.Function<java.lang.Object, java.util.List<java.lang.Object>> {
    private static final /* synthetic */ io.reactivex.internal.util.ArrayListSupplier[] $VALUES = null;
    public static final io.reactivex.internal.util.ArrayListSupplier INSTANCE = null;

    static {
            io.reactivex.internal.util.ArrayListSupplier r0 = new io.reactivex.internal.util.ArrayListSupplier
            java.lang.String r1 = "INSTANCE"
            r2 = 0
            r0.<init>(r1, r2)
            io.reactivex.internal.util.ArrayListSupplier.INSTANCE = r0
            r1 = 1
            io.reactivex.internal.util.ArrayListSupplier[] r1 = new io.reactivex.internal.util.ArrayListSupplier[r1]
            r1[r2] = r0
            io.reactivex.internal.util.ArrayListSupplier.$VALUES = r1
            return
    }

    ArrayListSupplier(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static <T> java.util.concurrent.Callable<java.util.List<T>> asCallable() {
            io.reactivex.internal.util.ArrayListSupplier r0 = io.reactivex.internal.util.ArrayListSupplier.INSTANCE
            return r0
    }

    public static <T, O> io.reactivex.functions.Function<O, java.util.List<T>> asFunction() {
            io.reactivex.internal.util.ArrayListSupplier r0 = io.reactivex.internal.util.ArrayListSupplier.INSTANCE
            return r0
    }

    public static io.reactivex.internal.util.ArrayListSupplier valueOf(java.lang.String r1) {
            java.lang.Class<io.reactivex.internal.util.ArrayListSupplier> r0 = io.reactivex.internal.util.ArrayListSupplier.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.reactivex.internal.util.ArrayListSupplier r1 = (io.reactivex.internal.util.ArrayListSupplier) r1
            return r1
    }

    public static io.reactivex.internal.util.ArrayListSupplier[] values() {
            io.reactivex.internal.util.ArrayListSupplier[] r0 = io.reactivex.internal.util.ArrayListSupplier.$VALUES
            java.lang.Object r0 = r0.clone()
            io.reactivex.internal.util.ArrayListSupplier[] r0 = (io.reactivex.internal.util.ArrayListSupplier[]) r0
            return r0
    }

    @Override // io.reactivex.functions.Function
    public /* bridge */ /* synthetic */ java.util.List<java.lang.Object> apply(java.lang.Object r1) throws java.lang.Exception {
            r0 = this;
            java.util.List r1 = r0.apply2(r1)
            return r1
    }

    @Override // io.reactivex.functions.Function
    /* renamed from: apply, reason: avoid collision after fix types in other method */
    public java.util.List<java.lang.Object> apply2(java.lang.Object r1) throws java.lang.Exception {
            r0 = this;
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            return r1
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ java.util.List<java.lang.Object> call() throws java.lang.Exception {
            r1 = this;
            java.util.List r0 = r1.call2()
            return r0
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: call, reason: avoid collision after fix types in other method */
    public java.util.List<java.lang.Object> call2() throws java.lang.Exception {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }
}
