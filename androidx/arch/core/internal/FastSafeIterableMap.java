package androidx.arch.core.internal;

/* loaded from: classes.dex */
public class FastSafeIterableMap<K, V> extends androidx.arch.core.internal.SafeIterableMap<K, V> {
    private java.util.HashMap<K, androidx.arch.core.internal.SafeIterableMap.Entry<K, V>> mHashMap;

    public FastSafeIterableMap() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mHashMap = r0
            return
    }

    public java.util.Map.Entry<K, V> ceil(K r2) {
            r1 = this;
            boolean r0 = r1.contains(r2)
            if (r0 == 0) goto L11
            java.util.HashMap<K, androidx.arch.core.internal.SafeIterableMap$Entry<K, V>> r0 = r1.mHashMap
            java.lang.Object r2 = r0.get(r2)
            androidx.arch.core.internal.SafeIterableMap$Entry r2 = (androidx.arch.core.internal.SafeIterableMap.Entry) r2
            androidx.arch.core.internal.SafeIterableMap$Entry<K, V> r2 = r2.mPrevious
            return r2
        L11:
            r2 = 0
            return r2
    }

    public boolean contains(K r2) {
            r1 = this;
            java.util.HashMap<K, androidx.arch.core.internal.SafeIterableMap$Entry<K, V>> r0 = r1.mHashMap
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    protected androidx.arch.core.internal.SafeIterableMap.Entry<K, V> get(K r2) {
            r1 = this;
            java.util.HashMap<K, androidx.arch.core.internal.SafeIterableMap$Entry<K, V>> r0 = r1.mHashMap
            java.lang.Object r2 = r0.get(r2)
            androidx.arch.core.internal.SafeIterableMap$Entry r2 = (androidx.arch.core.internal.SafeIterableMap.Entry) r2
            return r2
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    public V putIfAbsent(K r2, V r3) {
            r1 = this;
            androidx.arch.core.internal.SafeIterableMap$Entry r0 = r1.get(r2)
            if (r0 == 0) goto L9
            V r2 = r0.mValue
            return r2
        L9:
            java.util.HashMap<K, androidx.arch.core.internal.SafeIterableMap$Entry<K, V>> r0 = r1.mHashMap
            androidx.arch.core.internal.SafeIterableMap$Entry r3 = r1.put(r2, r3)
            r0.put(r2, r3)
            r2 = 0
            return r2
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    public V remove(K r3) {
            r2 = this;
            java.lang.Object r0 = super.remove(r3)
            java.util.HashMap<K, androidx.arch.core.internal.SafeIterableMap$Entry<K, V>> r1 = r2.mHashMap
            r1.remove(r3)
            return r0
    }
}
