package io.reactivex.internal.util;

/* loaded from: classes.dex */
public final class MergerBiFunction<T> implements io.reactivex.functions.BiFunction<java.util.List<T>, java.util.List<T>, java.util.List<T>> {
    final java.util.Comparator<? super T> comparator;

    public MergerBiFunction(java.util.Comparator<? super T> r1) {
            r0 = this;
            r0.<init>()
            r0.comparator = r1
            return
    }

    @Override // io.reactivex.functions.BiFunction
    public /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object r1, java.lang.Object r2) throws java.lang.Exception {
            r0 = this;
            java.util.List r1 = (java.util.List) r1
            java.util.List r2 = (java.util.List) r2
            java.util.List r1 = r0.apply(r1, r2)
            return r1
    }

    public java.util.List<T> apply(java.util.List<T> r6, java.util.List<T> r7) throws java.lang.Exception {
            r5 = this;
            int r0 = r6.size()
            int r1 = r7.size()
            int r0 = r0 + r1
            if (r0 != 0) goto L11
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            return r6
        L11:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            java.util.Iterator r6 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
            boolean r0 = r6.hasNext()
            r2 = 0
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r6.next()
            goto L2b
        L2a:
            r0 = r2
        L2b:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L36
            java.lang.Object r3 = r7.next()
            goto L37
        L36:
            r3 = r2
        L37:
            if (r0 == 0) goto L61
            if (r3 == 0) goto L61
            java.util.Comparator<? super T> r4 = r5.comparator
            int r4 = r4.compare(r0, r3)
            if (r4 >= 0) goto L53
            r1.add(r0)
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L51
            java.lang.Object r0 = r6.next()
            goto L37
        L51:
            r0 = r2
            goto L37
        L53:
            r1.add(r3)
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L36
            java.lang.Object r3 = r7.next()
            goto L37
        L61:
            if (r0 == 0) goto L74
            r1.add(r0)
        L66:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L85
            java.lang.Object r7 = r6.next()
            r1.add(r7)
            goto L66
        L74:
            r1.add(r3)
        L77:
            boolean r6 = r7.hasNext()
            if (r6 == 0) goto L85
            java.lang.Object r6 = r7.next()
            r1.add(r6)
            goto L77
        L85:
            return r1
    }
}
