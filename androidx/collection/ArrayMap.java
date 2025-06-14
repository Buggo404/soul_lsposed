package androidx.collection;

/* loaded from: classes.dex */
public class ArrayMap<K, V> extends androidx.collection.SimpleArrayMap<K, V> implements java.util.Map<K, V> {
    androidx.collection.MapCollections<K, V> mCollections;


    public ArrayMap() {
            r0 = this;
            r0.<init>()
            return
    }

    public ArrayMap(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public ArrayMap(androidx.collection.SimpleArrayMap r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private androidx.collection.MapCollections<K, V> getCollection() {
            r1 = this;
            androidx.collection.MapCollections<K, V> r0 = r1.mCollections
            if (r0 != 0) goto Lb
            androidx.collection.ArrayMap$1 r0 = new androidx.collection.ArrayMap$1
            r0.<init>(r1)
            r1.mCollections = r0
        Lb:
            androidx.collection.MapCollections<K, V> r0 = r1.mCollections
            return r0
    }

    public boolean containsAll(java.util.Collection<?> r1) {
            r0 = this;
            boolean r1 = androidx.collection.MapCollections.containsAllHelper(r0, r1)
            return r1
    }

    @Override // java.util.Map
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            r1 = this;
            androidx.collection.MapCollections r0 = r1.getCollection()
            java.util.Set r0 = r0.getEntrySet()
            return r0
    }

    @Override // java.util.Map
    public java.util.Set<K> keySet() {
            r1 = this;
            androidx.collection.MapCollections r0 = r1.getCollection()
            java.util.Set r0 = r0.getKeySet()
            return r0
    }

    @Override // java.util.Map
    public void putAll(java.util.Map<? extends K, ? extends V> r3) {
            r2 = this;
            int r0 = r2.mSize
            int r1 = r3.size()
            int r0 = r0 + r1
            r2.ensureCapacity(r0)
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L12:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            r2.put(r1, r0)
            goto L12
        L2a:
            return
    }

    public boolean removeAll(java.util.Collection<?> r1) {
            r0 = this;
            boolean r1 = androidx.collection.MapCollections.removeAllHelper(r0, r1)
            return r1
    }

    public boolean retainAll(java.util.Collection<?> r1) {
            r0 = this;
            boolean r1 = androidx.collection.MapCollections.retainAllHelper(r0, r1)
            return r1
    }

    @Override // java.util.Map
    public java.util.Collection<V> values() {
            r1 = this;
            androidx.collection.MapCollections r0 = r1.getCollection()
            java.util.Collection r0 = r0.getValues()
            return r0
    }
}
