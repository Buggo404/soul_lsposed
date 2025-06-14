package io.reactivex.internal.util;

/* loaded from: classes.dex */
public final class OpenHashSet<T> {
    private static final int INT_PHI = -1640531527;
    T[] keys;
    final float loadFactor;
    int mask;
    int maxSize;
    int size;

    public OpenHashSet() {
            r2 = this;
            r0 = 16
            r1 = 1061158912(0x3f400000, float:0.75)
            r2.<init>(r0, r1)
            return
    }

    public OpenHashSet(int r2) {
            r1 = this;
            r0 = 1061158912(0x3f400000, float:0.75)
            r1.<init>(r2, r0)
            return
    }

    public OpenHashSet(int r2, float r3) {
            r1 = this;
            r1.<init>()
            r1.loadFactor = r3
            int r2 = io.reactivex.internal.util.Pow2.roundToPowerOfTwo(r2)
            int r0 = r2 + (-1)
            r1.mask = r0
            float r0 = (float) r2
            float r3 = r3 * r0
            int r3 = (int) r3
            r1.maxSize = r3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r1.keys = r2
            return
    }

    static int mix(int r1) {
            r0 = -1640531527(0xffffffff9e3779b9, float:-9.713111E-21)
            int r1 = r1 * r0
            int r0 = r1 >>> 16
            r1 = r1 ^ r0
            return r1
    }

    public boolean add(T r7) {
            r6 = this;
            T[] r0 = r6.keys
            int r1 = r6.mask
            int r2 = r7.hashCode()
            int r2 = mix(r2)
            r2 = r2 & r1
            r3 = r0[r2]
            r4 = 1
            if (r3 == 0) goto L28
            boolean r3 = r3.equals(r7)
            r5 = 0
            if (r3 == 0) goto L1a
            return r5
        L1a:
            int r2 = r2 + r4
            r2 = r2 & r1
            r3 = r0[r2]
            if (r3 != 0) goto L21
            goto L28
        L21:
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L1a
            return r5
        L28:
            r0[r2] = r7
            int r7 = r6.size
            int r7 = r7 + r4
            r6.size = r7
            int r0 = r6.maxSize
            if (r7 < r0) goto L36
            r6.rehash()
        L36:
            return r4
    }

    public java.lang.Object[] keys() {
            r1 = this;
            T[] r0 = r1.keys
            return r0
    }

    void rehash() {
            r8 = this;
            T[] r0 = r8.keys
            int r1 = r0.length
            int r2 = r1 << 1
            int r3 = r2 + (-1)
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            int r5 = r8.size
        Ld:
            int r6 = r5 + (-1)
            if (r5 == 0) goto L32
        L11:
            int r1 = r1 + (-1)
            r5 = r0[r1]
            if (r5 != 0) goto L18
            goto L11
        L18:
            int r5 = r5.hashCode()
            int r5 = mix(r5)
            r5 = r5 & r3
            r7 = r4[r5]
            if (r7 == 0) goto L2c
        L25:
            int r5 = r5 + 1
            r5 = r5 & r3
            r7 = r4[r5]
            if (r7 != 0) goto L25
        L2c:
            r7 = r0[r1]
            r4[r5] = r7
            r5 = r6
            goto Ld
        L32:
            r8.mask = r3
            float r0 = (float) r2
            float r1 = r8.loadFactor
            float r0 = r0 * r1
            int r0 = (int) r0
            r8.maxSize = r0
            r8.keys = r4
            return
    }

    public boolean remove(T r6) {
            r5 = this;
            T[] r0 = r5.keys
            int r1 = r5.mask
            int r2 = r6.hashCode()
            int r2 = mix(r2)
            r2 = r2 & r1
            r3 = r0[r2]
            r4 = 0
            if (r3 != 0) goto L13
            return r4
        L13:
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L1e
            boolean r6 = r5.removeEntry(r2, r0, r1)
            return r6
        L1e:
            int r2 = r2 + 1
            r2 = r2 & r1
            r3 = r0[r2]
            if (r3 != 0) goto L26
            return r4
        L26:
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L1e
            boolean r6 = r5.removeEntry(r2, r0, r1)
            return r6
    }

    boolean removeEntry(int r5, T[] r6, int r7) {
            r4 = this;
            int r0 = r4.size
            r1 = 1
            int r0 = r0 - r1
            r4.size = r0
        L6:
            int r0 = r5 + 1
        L8:
            r0 = r0 & r7
            r2 = r6[r0]
            if (r2 != 0) goto L11
            r7 = 0
            r6[r5] = r7
            return r1
        L11:
            int r3 = r2.hashCode()
            int r3 = mix(r3)
            r3 = r3 & r7
            if (r5 > r0) goto L21
            if (r5 >= r3) goto L25
            if (r3 <= r0) goto L29
            goto L25
        L21:
            if (r5 < r3) goto L29
            if (r3 <= r0) goto L29
        L25:
            r6[r5] = r2
            r5 = r0
            goto L6
        L29:
            int r0 = r0 + 1
            goto L8
    }

    public int size() {
            r1 = this;
            int r0 = r1.size
            return r0
    }
}
