package lombok.core;

/* loaded from: com.usidqw.qwerklj.apk:lombok/core/LombokImmutableList.SCL.lombok */
public final class LombokImmutableList<T> implements java.lang.Iterable<T> {
    private java.lang.Object[] content;
    private static final lombok.core.LombokImmutableList<?> EMPTY = null;


    static {
            lombok.core.LombokImmutableList r0 = new lombok.core.LombokImmutableList
            r1 = r0
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r1.<init>(r2)
            lombok.core.LombokImmutableList.EMPTY = r0
            return
    }

    /* renamed from: of */
    public static <T> lombok.core.LombokImmutableList<T> m59of() {
            lombok.core.LombokImmutableList<?> r0 = lombok.core.LombokImmutableList.EMPTY
            return r0
    }

    /* renamed from: of */
    public static <T> lombok.core.LombokImmutableList<T> m60of(T r7) {
            lombok.core.LombokImmutableList r0 = new lombok.core.LombokImmutableList
            r1 = r0
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r7
            r3[r4] = r5
            r1.<init>(r2)
            return r0
    }

    /* renamed from: of */
    public static <T> lombok.core.LombokImmutableList<T> m61of(T r7, T r8) {
            lombok.core.LombokImmutableList r0 = new lombok.core.LombokImmutableList
            r1 = r0
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r7
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r8
            r3[r4] = r5
            r1.<init>(r2)
            return r0
    }

    /* renamed from: of */
    public static <T> lombok.core.LombokImmutableList<T> m62of(T r7, T r8, T r9) {
            lombok.core.LombokImmutableList r0 = new lombok.core.LombokImmutableList
            r1 = r0
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r7
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r8
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = r9
            r3[r4] = r5
            r1.<init>(r2)
            return r0
    }

    /* renamed from: of */
    public static <T> lombok.core.LombokImmutableList<T> m63of(T r7, T r8, T r9, T r10) {
            lombok.core.LombokImmutableList r0 = new lombok.core.LombokImmutableList
            r1 = r0
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r7
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r8
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = r9
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = r10
            r3[r4] = r5
            r1.<init>(r2)
            return r0
    }

    /* renamed from: of */
    public static <T> lombok.core.LombokImmutableList<T> m64of(T r7, T r8, T r9, T r10, T r11) {
            lombok.core.LombokImmutableList r0 = new lombok.core.LombokImmutableList
            r1 = r0
            r2 = 5
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r7
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r8
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = r9
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = r10
            r3[r4] = r5
            r3 = r2
            r4 = 4
            r5 = r11
            r3[r4] = r5
            r1.<init>(r2)
            return r0
    }

    /* renamed from: of */
    public static <T> lombok.core.LombokImmutableList<T> m65of(T r6, T r7, T r8, T r9, T r10, T r11, T... r12) {
            r0 = r12
            if (r0 != 0) goto Lc
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            goto Le
        Lc:
            r0 = r12
        Le:
            r13 = r0
            r0 = r13
            int r0 = r0.length
            r1 = 6
            int r0 = r0 + r1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r14 = r0
            r0 = r13
            r1 = 0
            r2 = r14
            r3 = 6
            r4 = r13
            int r4 = r4.length
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r14
            r1 = 0
            r2 = r6
            r0[r1] = r2
            r0 = r14
            r1 = 1
            r2 = r7
            r0[r1] = r2
            r0 = r14
            r1 = 2
            r2 = r8
            r0[r1] = r2
            r0 = r14
            r1 = 3
            r2 = r9
            r0[r1] = r2
            r0 = r14
            r1 = 4
            r2 = r10
            r0[r1] = r2
            r0 = r14
            r1 = 5
            r2 = r11
            r0[r1] = r2
            lombok.core.LombokImmutableList r0 = new lombok.core.LombokImmutableList
            r1 = r0
            r2 = r14
            r1.<init>(r2)
            return r0
    }

    public static <T> lombok.core.LombokImmutableList<T> copyOf(java.util.Collection<? extends T> r4) {
            lombok.core.LombokImmutableList r0 = new lombok.core.LombokImmutableList
            r1 = r0
            r2 = r4
            java.lang.Object[] r2 = r2.toArray()
            r1.<init>(r2)
            return r0
    }

    public static <T> lombok.core.LombokImmutableList<T> copyOf(java.lang.Iterable<? extends T> r3) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r3
            java.util.Iterator r0 = r0.iterator()
            r6 = r0
            goto L24
        L12:
            r0 = r6
            java.lang.Object r0 = r0.next()
            java.lang.Object r0 = (java.lang.Object) r0
            r5 = r0
            r0 = r4
            r1 = r5
            boolean r0 = r0.add(r1)
        L24:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L12
            r0 = r4
            lombok.core.LombokImmutableList r0 = copyOf(r0)
            return r0
    }

    public static <T> lombok.core.LombokImmutableList<T> copyOf(T[] r6) {
            r0 = r6
            int r0 = r0.length
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r7 = r0
            r0 = r6
            r1 = 0
            r2 = r7
            r3 = 0
            r4 = r6
            int r4 = r4.length
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            lombok.core.LombokImmutableList r0 = new lombok.core.LombokImmutableList
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            return r0
    }

    private LombokImmutableList(java.lang.Object[] r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.content = r1
            return
    }

    public lombok.core.LombokImmutableList<T> replaceElementAt(int r5, T r6) {
            r4 = this;
            r0 = r4
            java.lang.Object[] r0 = r0.content
            java.lang.Object r0 = r0.clone()
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r7 = r0
            r0 = r7
            r1 = r5
            r2 = r6
            r0[r1] = r2
            lombok.core.LombokImmutableList r0 = new lombok.core.LombokImmutableList
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            return r0
    }

    public lombok.core.LombokImmutableList<T> append(T r7) {
            r6 = this;
            r0 = r6
            java.lang.Object[] r0 = r0.content
            int r0 = r0.length
            r8 = r0
            r0 = r8
            r1 = 1
            int r0 = r0 + r1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r9 = r0
            r0 = r6
            java.lang.Object[] r0 = r0.content
            r1 = 0
            r2 = r9
            r3 = 0
            r4 = r8
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r9
            r1 = r8
            r2 = r7
            r0[r1] = r2
            lombok.core.LombokImmutableList r0 = new lombok.core.LombokImmutableList
            r1 = r0
            r2 = r9
            r1.<init>(r2)
            return r0
    }

    public lombok.core.LombokImmutableList<T> prepend(T r7) {
            r6 = this;
            r0 = r6
            java.lang.Object[] r0 = r0.content
            int r0 = r0.length
            r8 = r0
            r0 = r8
            r1 = 1
            int r0 = r0 + r1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r9 = r0
            r0 = r6
            java.lang.Object[] r0 = r0.content
            r1 = 0
            r2 = r9
            r3 = 1
            r4 = r8
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r9
            r1 = 0
            r2 = r7
            r0[r1] = r2
            lombok.core.LombokImmutableList r0 = new lombok.core.LombokImmutableList
            r1 = r0
            r2 = r9
            r1.<init>(r2)
            return r0
    }

    public int indexOf(T r5) {
            r4 = this;
            r0 = r4
            java.lang.Object[] r0 = r0.content
            int r0 = r0.length
            r6 = r0
            r0 = r5
            if (r0 != 0) goto L24
            r0 = 0
            r7 = r0
            goto L1d
        Lf:
            r0 = r4
            java.lang.Object[] r0 = r0.content
            r1 = r7
            r0 = r0[r1]
            if (r0 != 0) goto L1a
            r0 = r7
            return r0
        L1a:
            int r7 = r7 + 1
        L1d:
            r0 = r7
            r1 = r6
            if (r0 < r1) goto Lf
            r0 = -1
            return r0
        L24:
            r0 = 0
            r7 = r0
            goto L3b
        L29:
            r0 = r5
            r1 = r4
            java.lang.Object[] r1 = r1.content
            r2 = r7
            r1 = r1[r2]
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L38
            r0 = r7
            return r0
        L38:
            int r7 = r7 + 1
        L3b:
            r0 = r7
            r1 = r6
            if (r0 < r1) goto L29
            r0 = -1
            return r0
    }

    public lombok.core.LombokImmutableList<T> removeElement(T r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            int r0 = r0.indexOf(r1)
            r5 = r0
            r0 = r5
            r1 = -1
            if (r0 != r1) goto Lf
            r0 = r3
            goto L14
        Lf:
            r0 = r3
            r1 = r5
            lombok.core.LombokImmutableList r0 = r0.removeElementAt(r1)
        L14:
            return r0
    }

    public lombok.core.LombokImmutableList<T> removeElementAt(int r8) {
            r7 = this;
            r0 = r7
            java.lang.Object[] r0 = r0.content
            int r0 = r0.length
            r9 = r0
            r0 = r9
            r1 = 1
            int r0 = r0 - r1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r10 = r0
            r0 = r8
            if (r0 <= 0) goto L1c
            r0 = r7
            java.lang.Object[] r0 = r0.content
            r1 = 0
            r2 = r10
            r3 = 0
            r4 = r8
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
        L1c:
            r0 = r8
            r1 = r9
            r2 = 1
            int r1 = r1 - r2
            if (r0 >= r1) goto L34
            r0 = r7
            java.lang.Object[] r0 = r0.content
            r1 = r8
            r2 = 1
            int r1 = r1 + r2
            r2 = r10
            r3 = r8
            r4 = r9
            r5 = r8
            int r4 = r4 - r5
            r5 = 1
            int r4 = r4 - r5
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
        L34:
            lombok.core.LombokImmutableList r0 = new lombok.core.LombokImmutableList
            r1 = r0
            r2 = r10
            r1.<init>(r2)
            return r0
    }

    public boolean isEmpty() {
            r2 = this;
            r0 = r2
            java.lang.Object[] r0 = r0.content
            int r0 = r0.length
            if (r0 != 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public int size() {
            r2 = this;
            r0 = r2
            java.lang.Object[] r0 = r0.content
            int r0 = r0.length
            return r0
    }

    public T get(int r4) {
            r3 = this;
            r0 = r3
            java.lang.Object[] r0 = r0.content
            r1 = r4
            r0 = r0[r1]
            return r0
    }

    public boolean contains(T r4) {
            r3 = this;
            r0 = r4
            if (r0 != 0) goto L29
            r0 = r3
            java.lang.Object[] r0 = r0.content
            r1 = r0
            r8 = r1
            int r0 = r0.length
            r7 = r0
            r0 = 0
            r6 = r0
            goto L21
        L13:
            r0 = r8
            r1 = r6
            r0 = r0[r1]
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L1e
            r0 = 1
            return r0
        L1e:
            int r6 = r6 + 1
        L21:
            r0 = r6
            r1 = r7
            if (r0 < r1) goto L13
            r0 = 0
            return r0
        L29:
            r0 = r3
            java.lang.Object[] r0 = r0.content
            r1 = r0
            r8 = r1
            int r0 = r0.length
            r7 = r0
            r0 = 0
            r6 = r0
            goto L4a
        L38:
            r0 = r8
            r1 = r6
            r0 = r0[r1]
            r5 = r0
            r0 = r4
            r1 = r5
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L47
            r0 = 1
            return r0
        L47:
            int r6 = r6 + 1
        L4a:
            r0 = r6
            r1 = r7
            if (r0 < r1) goto L38
            r0 = 0
            return r0
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<T> iterator() {
            r4 = this;
            lombok.core.LombokImmutableList$1 r0 = new lombok.core.LombokImmutableList$1
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            r0 = r2
            java.lang.Object[] r0 = r0.content
            java.lang.String r0 = java.util.Arrays.toString(r0)
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof lombok.core.LombokImmutableList
            if (r0 != 0) goto L9
            r0 = 0
            return r0
        L9:
            r0 = r4
            r1 = r3
            if (r0 != r1) goto L10
            r0 = 1
            return r0
        L10:
            r0 = r3
            java.lang.Object[] r0 = r0.content
            r1 = r4
            lombok.core.LombokImmutableList r1 = (lombok.core.LombokImmutableList) r1
            java.lang.Object[] r1 = r1.content
            boolean r0 = java.util.Arrays.equals(r0, r1)
            return r0
    }

    public int hashCode() {
            r2 = this;
            r0 = r2
            java.lang.Object[] r0 = r0.content
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    static /* synthetic */ java.lang.Object[] access$0(lombok.core.LombokImmutableList r2) {
            r0 = r2
            java.lang.Object[] r0 = r0.content
            return r0
    }
}
