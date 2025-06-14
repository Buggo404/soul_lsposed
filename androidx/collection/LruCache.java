package androidx.collection;

/* loaded from: classes.dex */
public class LruCache<K, V> {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final java.util.LinkedHashMap<K, V> map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public LruCache(int r4) {
            r3 = this;
            r3.<init>()
            if (r4 <= 0) goto L13
            r3.maxSize = r4
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r0 = 1061158912(0x3f400000, float:0.75)
            r1 = 1
            r2 = 0
            r4.<init>(r2, r0, r1)
            r3.map = r4
            return
        L13:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "maxSize <= 0"
            r4.<init>(r0)
            throw r4
    }

    private int safeSizeOf(K r4, V r5) {
            r3 = this;
            int r0 = r3.sizeOf(r4, r5)
            if (r0 < 0) goto L7
            return r0
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Negative size: "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = "="
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    protected V create(K r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public final synchronized int createCount() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.createCount     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    protected void entryRemoved(boolean r1, K r2, V r3, V r4) {
            r0 = this;
            return
    }

    public final void evictAll() {
            r1 = this;
            r0 = -1
            r1.trimToSize(r0)
            return
    }

    public final synchronized int evictionCount() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.evictionCount     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final V get(K r5) {
            r4 = this;
            if (r5 == 0) goto L54
            monitor-enter(r4)
            java.util.LinkedHashMap<K, V> r0 = r4.map     // Catch: java.lang.Throwable -> L51
            java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Throwable -> L51
            if (r0 == 0) goto L13
            int r5 = r4.hitCount     // Catch: java.lang.Throwable -> L51
            int r5 = r5 + 1
            r4.hitCount = r5     // Catch: java.lang.Throwable -> L51
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L51
            return r0
        L13:
            int r0 = r4.missCount     // Catch: java.lang.Throwable -> L51
            int r0 = r0 + 1
            r4.missCount = r0     // Catch: java.lang.Throwable -> L51
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L51
            java.lang.Object r0 = r4.create(r5)
            if (r0 != 0) goto L22
            r5 = 0
            return r5
        L22:
            monitor-enter(r4)
            int r1 = r4.createCount     // Catch: java.lang.Throwable -> L4e
            int r1 = r1 + 1
            r4.createCount = r1     // Catch: java.lang.Throwable -> L4e
            java.util.LinkedHashMap<K, V> r1 = r4.map     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r1 = r1.put(r5, r0)     // Catch: java.lang.Throwable -> L4e
            if (r1 == 0) goto L37
            java.util.LinkedHashMap<K, V> r2 = r4.map     // Catch: java.lang.Throwable -> L4e
            r2.put(r5, r1)     // Catch: java.lang.Throwable -> L4e
            goto L40
        L37:
            int r2 = r4.size     // Catch: java.lang.Throwable -> L4e
            int r3 = r4.safeSizeOf(r5, r0)     // Catch: java.lang.Throwable -> L4e
            int r2 = r2 + r3
            r4.size = r2     // Catch: java.lang.Throwable -> L4e
        L40:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L4e
            if (r1 == 0) goto L48
            r2 = 0
            r4.entryRemoved(r2, r5, r0, r1)
            return r1
        L48:
            int r5 = r4.maxSize
            r4.trimToSize(r5)
            return r0
        L4e:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L4e
            throw r5
        L51:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L51
            throw r5
        L54:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "key == null"
            r5.<init>(r0)
            throw r5
    }

    public final synchronized int hitCount() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.hitCount     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized int maxSize() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.maxSize     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized int missCount() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.missCount     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final V put(K r4, V r5) {
            r3 = this;
            if (r4 == 0) goto L35
            if (r5 == 0) goto L35
            monitor-enter(r3)
            int r0 = r3.putCount     // Catch: java.lang.Throwable -> L32
            int r0 = r0 + 1
            r3.putCount = r0     // Catch: java.lang.Throwable -> L32
            int r0 = r3.size     // Catch: java.lang.Throwable -> L32
            int r1 = r3.safeSizeOf(r4, r5)     // Catch: java.lang.Throwable -> L32
            int r0 = r0 + r1
            r3.size = r0     // Catch: java.lang.Throwable -> L32
            java.util.LinkedHashMap<K, V> r0 = r3.map     // Catch: java.lang.Throwable -> L32
            java.lang.Object r0 = r0.put(r4, r5)     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto L25
            int r1 = r3.size     // Catch: java.lang.Throwable -> L32
            int r2 = r3.safeSizeOf(r4, r0)     // Catch: java.lang.Throwable -> L32
            int r1 = r1 - r2
            r3.size = r1     // Catch: java.lang.Throwable -> L32
        L25:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto L2c
            r1 = 0
            r3.entryRemoved(r1, r4, r0, r5)
        L2c:
            int r4 = r3.maxSize
            r3.trimToSize(r4)
            return r0
        L32:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L32
            throw r4
        L35:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "key == null || value == null"
            r4.<init>(r5)
            throw r4
    }

    public final synchronized int putCount() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.putCount     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final V remove(K r4) {
            r3 = this;
            if (r4 == 0) goto L20
            monitor-enter(r3)
            java.util.LinkedHashMap<K, V> r0 = r3.map     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r0 = r0.remove(r4)     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L14
            int r1 = r3.size     // Catch: java.lang.Throwable -> L1d
            int r2 = r3.safeSizeOf(r4, r0)     // Catch: java.lang.Throwable -> L1d
            int r1 = r1 - r2
            r3.size = r1     // Catch: java.lang.Throwable -> L1d
        L14:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L1c
            r1 = 0
            r2 = 0
            r3.entryRemoved(r1, r4, r0, r2)
        L1c:
            return r0
        L1d:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            throw r4
        L20:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r0 = "key == null"
            r4.<init>(r0)
            throw r4
    }

    public void resize(int r2) {
            r1 = this;
            if (r2 <= 0) goto Ld
            monitor-enter(r1)
            r1.maxSize = r2     // Catch: java.lang.Throwable -> La
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            r1.trimToSize(r2)
            return
        La:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            throw r2
        Ld:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "maxSize <= 0"
            r2.<init>(r0)
            throw r2
    }

    public final synchronized int size() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.size     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    protected int sizeOf(K r1, V r2) {
            r0 = this;
            r1 = 1
            return r1
    }

    public final synchronized java.util.Map<K, V> snapshot() {
            r2 = this;
            monitor-enter(r2)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> La
            java.util.LinkedHashMap<K, V> r1 = r2.map     // Catch: java.lang.Throwable -> La
            r0.<init>(r1)     // Catch: java.lang.Throwable -> La
            monitor-exit(r2)
            return r0
        La:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public final synchronized java.lang.String toString() {
            r6 = this;
            monitor-enter(r6)
            int r0 = r6.hitCount     // Catch: java.lang.Throwable -> L3c
            int r1 = r6.missCount     // Catch: java.lang.Throwable -> L3c
            int r1 = r1 + r0
            r2 = 0
            if (r1 == 0) goto Ld
            int r0 = r0 * 100
            int r0 = r0 / r1
            goto Le
        Ld:
            r0 = r2
        Le:
            java.util.Locale r1 = java.util.Locale.US     // Catch: java.lang.Throwable -> L3c
            java.lang.String r3 = "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]"
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L3c
            int r5 = r6.maxSize     // Catch: java.lang.Throwable -> L3c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L3c
            r4[r2] = r5     // Catch: java.lang.Throwable -> L3c
            int r2 = r6.hitCount     // Catch: java.lang.Throwable -> L3c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L3c
            r5 = 1
            r4[r5] = r2     // Catch: java.lang.Throwable -> L3c
            int r2 = r6.missCount     // Catch: java.lang.Throwable -> L3c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L3c
            r5 = 2
            r4[r5] = r2     // Catch: java.lang.Throwable -> L3c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L3c
            r2 = 3
            r4[r2] = r0     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = java.lang.String.format(r1, r3, r4)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r6)
            return r0
        L3c:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
    }

    public void trimToSize(int r5) {
            r4 = this;
        L0:
            monitor-enter(r4)
            int r0 = r4.size     // Catch: java.lang.Throwable -> L73
            if (r0 < 0) goto L52
            java.util.LinkedHashMap<K, V> r0 = r4.map     // Catch: java.lang.Throwable -> L73
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L11
            int r0 = r4.size     // Catch: java.lang.Throwable -> L73
            if (r0 != 0) goto L52
        L11:
            int r0 = r4.size     // Catch: java.lang.Throwable -> L73
            if (r0 <= r5) goto L50
            java.util.LinkedHashMap<K, V> r0 = r4.map     // Catch: java.lang.Throwable -> L73
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L1e
            goto L50
        L1e:
            java.util.LinkedHashMap<K, V> r0 = r4.map     // Catch: java.lang.Throwable -> L73
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L73
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L73
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L73
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L73
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L73
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L73
            java.util.LinkedHashMap<K, V> r2 = r4.map     // Catch: java.lang.Throwable -> L73
            r2.remove(r1)     // Catch: java.lang.Throwable -> L73
            int r2 = r4.size     // Catch: java.lang.Throwable -> L73
            int r3 = r4.safeSizeOf(r1, r0)     // Catch: java.lang.Throwable -> L73
            int r2 = r2 - r3
            r4.size = r2     // Catch: java.lang.Throwable -> L73
            int r2 = r4.evictionCount     // Catch: java.lang.Throwable -> L73
            r3 = 1
            int r2 = r2 + r3
            r4.evictionCount = r2     // Catch: java.lang.Throwable -> L73
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L73
            r2 = 0
            r4.entryRemoved(r3, r1, r0, r2)
            goto L0
        L50:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L73
            return
        L52:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L73
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L73
            r0.<init>()     // Catch: java.lang.Throwable -> L73
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Throwable -> L73
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L73
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L73
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L73
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L73
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L73
            throw r5     // Catch: java.lang.Throwable -> L73
        L73:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L73
            throw r5
    }
}
