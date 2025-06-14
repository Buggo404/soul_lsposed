package io.reactivex.internal.util;

/* loaded from: classes.dex */
public enum HashMapSupplier extends java.lang.Enum<io.reactivex.internal.util.HashMapSupplier> implements java.util.concurrent.Callable<java.util.Map<java.lang.Object, java.lang.Object>> {
    private static final /* synthetic */ io.reactivex.internal.util.HashMapSupplier[] $VALUES = null;
    public static final io.reactivex.internal.util.HashMapSupplier INSTANCE = null;

    static {
            io.reactivex.internal.util.HashMapSupplier r0 = new io.reactivex.internal.util.HashMapSupplier
            java.lang.String r1 = "INSTANCE"
            r2 = 0
            r0.<init>(r1, r2)
            io.reactivex.internal.util.HashMapSupplier.INSTANCE = r0
            r1 = 1
            io.reactivex.internal.util.HashMapSupplier[] r1 = new io.reactivex.internal.util.HashMapSupplier[r1]
            r1[r2] = r0
            io.reactivex.internal.util.HashMapSupplier.$VALUES = r1
            return
    }

    HashMapSupplier(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static <K, V> java.util.concurrent.Callable<java.util.Map<K, V>> asCallable() {
            io.reactivex.internal.util.HashMapSupplier r0 = io.reactivex.internal.util.HashMapSupplier.INSTANCE
            return r0
    }

    public static io.reactivex.internal.util.HashMapSupplier valueOf(java.lang.String r1) {
            java.lang.Class<io.reactivex.internal.util.HashMapSupplier> r0 = io.reactivex.internal.util.HashMapSupplier.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.reactivex.internal.util.HashMapSupplier r1 = (io.reactivex.internal.util.HashMapSupplier) r1
            return r1
    }

    public static io.reactivex.internal.util.HashMapSupplier[] values() {
            io.reactivex.internal.util.HashMapSupplier[] r0 = io.reactivex.internal.util.HashMapSupplier.$VALUES
            java.lang.Object r0 = r0.clone()
            io.reactivex.internal.util.HashMapSupplier[] r0 = (io.reactivex.internal.util.HashMapSupplier[]) r0
            return r0
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ java.util.Map<java.lang.Object, java.lang.Object> call() throws java.lang.Exception {
            r1 = this;
            java.util.Map r0 = r1.call2()
            return r0
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: call, reason: avoid collision after fix types in other method */
    public java.util.Map<java.lang.Object, java.lang.Object> call2() throws java.lang.Exception {
            r1 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            return r0
    }
}
