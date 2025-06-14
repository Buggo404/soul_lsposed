package io.reactivex.internal.util;

/* loaded from: classes.dex */
public final class SorterFunction<T> implements io.reactivex.functions.Function<java.util.List<T>, java.util.List<T>> {
    final java.util.Comparator<? super T> comparator;

    public SorterFunction(java.util.Comparator<? super T> r1) {
            r0 = this;
            r0.<init>()
            r0.comparator = r1
            return
    }

    @Override // io.reactivex.functions.Function
    public /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object r1) throws java.lang.Exception {
            r0 = this;
            java.util.List r1 = (java.util.List) r1
            java.util.List r1 = r0.apply(r1)
            return r1
    }

    public java.util.List<T> apply(java.util.List<T> r2) throws java.lang.Exception {
            r1 = this;
            java.util.Comparator<? super T> r0 = r1.comparator
            java.util.Collections.sort(r2, r0)
            return r2
    }
}
