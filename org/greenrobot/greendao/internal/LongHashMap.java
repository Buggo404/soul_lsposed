package org.greenrobot.greendao.internal;

/* loaded from: classes.dex */
public final class LongHashMap<T> {
    private int capacity;
    private int size;
    private org.greenrobot.greendao.internal.LongHashMap.Entry<T>[] table;
    private int threshold;

    static final class Entry<T> {
        final long key;
        org.greenrobot.greendao.internal.LongHashMap.Entry<T> next;
        T value;

        Entry(long r1, T r3, org.greenrobot.greendao.internal.LongHashMap.Entry<T> r4) {
                r0 = this;
                r0.<init>()
                r0.key = r1
                r0.value = r3
                r0.next = r4
                return
        }
    }

    public LongHashMap() {
            r1 = this;
            r0 = 16
            r1.<init>(r0)
            return
    }

    public LongHashMap(int r2) {
            r1 = this;
            r1.<init>()
            r1.capacity = r2
            int r0 = r2 * 4
            int r0 = r0 / 3
            r1.threshold = r0
            org.greenrobot.greendao.internal.LongHashMap$Entry[] r2 = new org.greenrobot.greendao.internal.LongHashMap.Entry[r2]
            r1.table = r2
            return
    }

    public void clear() {
            r2 = this;
            r0 = 0
            r2.size = r0
            org.greenrobot.greendao.internal.LongHashMap$Entry<T>[] r0 = r2.table
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            return
    }

    public boolean containsKey(long r4) {
            r3 = this;
            r0 = 32
            long r0 = r4 >>> r0
            int r0 = (int) r0
            int r1 = (int) r4
            r0 = r0 ^ r1
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r1
            int r1 = r3.capacity
            int r0 = r0 % r1
            org.greenrobot.greendao.internal.LongHashMap$Entry<T>[] r1 = r3.table
            r0 = r1[r0]
        L12:
            if (r0 == 0) goto L1f
            long r1 = r0.key
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L1c
            r4 = 1
            return r4
        L1c:
            org.greenrobot.greendao.internal.LongHashMap$Entry<T> r0 = r0.next
            goto L12
        L1f:
            r4 = 0
            return r4
    }

    public T get(long r4) {
            r3 = this;
            r0 = 32
            long r0 = r4 >>> r0
            int r0 = (int) r0
            int r1 = (int) r4
            r0 = r0 ^ r1
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r1
            int r1 = r3.capacity
            int r0 = r0 % r1
            org.greenrobot.greendao.internal.LongHashMap$Entry<T>[] r1 = r3.table
            r0 = r1[r0]
        L12:
            if (r0 == 0) goto L20
            long r1 = r0.key
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L1d
            T r4 = r0.value
            return r4
        L1d:
            org.greenrobot.greendao.internal.LongHashMap$Entry<T> r0 = r0.next
            goto L12
        L20:
            r4 = 0
            return r4
    }

    public void logStats() {
            r6 = this;
            org.greenrobot.greendao.internal.LongHashMap$Entry<T>[] r0 = r6.table
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L5:
            if (r2 >= r1) goto L17
            r4 = r0[r2]
        L9:
            if (r4 == 0) goto L14
            org.greenrobot.greendao.internal.LongHashMap$Entry<T> r5 = r4.next
            if (r5 == 0) goto L14
            int r3 = r3 + 1
            org.greenrobot.greendao.internal.LongHashMap$Entry<T> r4 = r4.next
            goto L9
        L14:
            int r2 = r2 + 1
            goto L5
        L17:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "load: "
            r0.<init>(r1)
            int r1 = r6.size
            float r1 = (float) r1
            int r2 = r6.capacity
            float r2 = (float) r2
            float r1 = r1 / r2
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", size: "
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r6.size
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", capa: "
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r6.capacity
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", collisions: "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r1 = ", collision ratio: "
            java.lang.StringBuilder r0 = r0.append(r1)
            float r1 = (float) r3
            int r2 = r6.size
            float r2 = (float) r2
            float r1 = r1 / r2
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.greenrobot.greendao.DaoLog.m100d(r0)
            return
    }

    public T put(long r6, T r8) {
            r5 = this;
            r0 = 32
            long r0 = r6 >>> r0
            int r0 = (int) r0
            int r1 = (int) r6
            r0 = r0 ^ r1
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r1
            int r1 = r5.capacity
            int r0 = r0 % r1
            org.greenrobot.greendao.internal.LongHashMap$Entry<T>[] r1 = r5.table
            r1 = r1[r0]
            r2 = r1
        L13:
            if (r2 == 0) goto L23
            long r3 = r2.key
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 != 0) goto L20
            T r6 = r2.value
            r2.value = r8
            return r6
        L20:
            org.greenrobot.greendao.internal.LongHashMap$Entry<T> r2 = r2.next
            goto L13
        L23:
            org.greenrobot.greendao.internal.LongHashMap$Entry<T>[] r2 = r5.table
            org.greenrobot.greendao.internal.LongHashMap$Entry r3 = new org.greenrobot.greendao.internal.LongHashMap$Entry
            r3.<init>(r6, r8, r1)
            r2[r0] = r3
            int r6 = r5.size
            int r6 = r6 + 1
            r5.size = r6
            int r7 = r5.threshold
            if (r6 <= r7) goto L3d
            int r6 = r5.capacity
            int r6 = r6 * 2
            r5.setCapacity(r6)
        L3d:
            r6 = 0
            return r6
    }

    public T remove(long r8) {
            r7 = this;
            r0 = 32
            long r0 = r8 >>> r0
            int r0 = (int) r0
            int r1 = (int) r8
            r0 = r0 ^ r1
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r1
            int r1 = r7.capacity
            int r0 = r0 % r1
            org.greenrobot.greendao.internal.LongHashMap$Entry<T>[] r1 = r7.table
            r1 = r1[r0]
            r2 = 0
            r3 = r2
        L14:
            if (r1 == 0) goto L33
            org.greenrobot.greendao.internal.LongHashMap$Entry<T> r4 = r1.next
            long r5 = r1.key
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 != 0) goto L30
            if (r3 != 0) goto L25
            org.greenrobot.greendao.internal.LongHashMap$Entry<T>[] r8 = r7.table
            r8[r0] = r4
            goto L27
        L25:
            r3.next = r4
        L27:
            int r8 = r7.size
            int r8 = r8 + (-1)
            r7.size = r8
            T r8 = r1.value
            return r8
        L30:
            r3 = r1
            r1 = r4
            goto L14
        L33:
            return r2
    }

    public void reserveRoom(int r1) {
            r0 = this;
            int r1 = r1 * 5
            int r1 = r1 / 3
            r0.setCapacity(r1)
            return
    }

    public void setCapacity(int r9) {
            r8 = this;
            org.greenrobot.greendao.internal.LongHashMap$Entry[] r0 = new org.greenrobot.greendao.internal.LongHashMap.Entry[r9]
            org.greenrobot.greendao.internal.LongHashMap$Entry<T>[] r1 = r8.table
            int r1 = r1.length
            r2 = 0
        L6:
            if (r2 >= r1) goto L29
            org.greenrobot.greendao.internal.LongHashMap$Entry<T>[] r3 = r8.table
            r3 = r3[r2]
        Lc:
            if (r3 == 0) goto L26
            long r4 = r3.key
            r6 = 32
            long r6 = r4 >>> r6
            int r6 = (int) r6
            int r4 = (int) r4
            r4 = r4 ^ r6
            r5 = 2147483647(0x7fffffff, float:NaN)
            r4 = r4 & r5
            int r4 = r4 % r9
            org.greenrobot.greendao.internal.LongHashMap$Entry<T> r5 = r3.next
            r6 = r0[r4]
            r3.next = r6
            r0[r4] = r3
            r3 = r5
            goto Lc
        L26:
            int r2 = r2 + 1
            goto L6
        L29:
            r8.table = r0
            r8.capacity = r9
            int r9 = r9 * 4
            int r9 = r9 / 3
            r8.threshold = r9
            return
    }

    public int size() {
            r1 = this;
            int r0 = r1.size
            return r0
    }
}
