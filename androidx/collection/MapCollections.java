package androidx.collection;

/* loaded from: classes.dex */
abstract class MapCollections<K, V> {
    androidx.collection.MapCollections<K, V>.EntrySet mEntrySet;
    androidx.collection.MapCollections<K, V>.KeySet mKeySet;
    androidx.collection.MapCollections<K, V>.ValuesCollection mValues;

    final class ArrayIterator<T> implements java.util.Iterator<T> {
        boolean mCanRemove;
        int mIndex;
        final int mOffset;
        int mSize;
        final /* synthetic */ androidx.collection.MapCollections this$0;

        ArrayIterator(androidx.collection.MapCollections r2, int r3) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                r0 = 0
                r1.mCanRemove = r0
                r1.mOffset = r3
                int r2 = r2.colGetSize()
                r1.mSize = r2
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.mIndex
                int r1 = r2.mSize
                if (r0 >= r1) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        @Override // java.util.Iterator
        public T next() {
                r3 = this;
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L19
                androidx.collection.MapCollections r0 = r3.this$0
                int r1 = r3.mIndex
                int r2 = r3.mOffset
                java.lang.Object r0 = r0.colGetEntry(r1, r2)
                int r1 = r3.mIndex
                r2 = 1
                int r1 = r1 + r2
                r3.mIndex = r1
                r3.mCanRemove = r2
                return r0
            L19:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                boolean r0 = r2.mCanRemove
                if (r0 == 0) goto L19
                int r0 = r2.mIndex
                int r0 = r0 + (-1)
                r2.mIndex = r0
                int r1 = r2.mSize
                int r1 = r1 + (-1)
                r2.mSize = r1
                r1 = 0
                r2.mCanRemove = r1
                androidx.collection.MapCollections r1 = r2.this$0
                r1.colRemoveAt(r0)
                return
            L19:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>()
                throw r0
        }
    }

    final class EntrySet implements java.util.Set<java.util.Map.Entry<K, V>> {
        final /* synthetic */ androidx.collection.MapCollections this$0;

        EntrySet(androidx.collection.MapCollections r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.util.Set, java.util.Collection
        public /* bridge */ /* synthetic */ boolean add(java.lang.Object r1) {
                r0 = this;
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                boolean r1 = r0.add(r1)
                return r1
        }

        public boolean add(java.util.Map.Entry<K, V> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(java.util.Collection<? extends java.util.Map.Entry<K, V>> r5) {
                r4 = this;
                androidx.collection.MapCollections r0 = r4.this$0
                int r0 = r0.colGetSize()
                java.util.Iterator r5 = r5.iterator()
            La:
                boolean r1 = r5.hasNext()
                if (r1 == 0) goto L24
                java.lang.Object r1 = r5.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                androidx.collection.MapCollections r2 = r4.this$0
                java.lang.Object r3 = r1.getKey()
                java.lang.Object r1 = r1.getValue()
                r2.colPut(r3, r1)
                goto La
            L24:
                androidx.collection.MapCollections r5 = r4.this$0
                int r5 = r5.colGetSize()
                if (r0 == r5) goto L2e
                r5 = 1
                goto L2f
            L2e:
                r5 = 0
            L2f:
                return r5
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
                r1 = this;
                androidx.collection.MapCollections r0 = r1.this$0
                r0.colClear()
                return
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                androidx.collection.MapCollections r0 = r3.this$0
                java.lang.Object r2 = r4.getKey()
                int r0 = r0.colIndexOfKey(r2)
                if (r0 >= 0) goto L15
                return r1
            L15:
                androidx.collection.MapCollections r1 = r3.this$0
                r2 = 1
                java.lang.Object r0 = r1.colGetEntry(r0, r2)
                java.lang.Object r4 = r4.getValue()
                boolean r4 = androidx.collection.ContainerHelpers.equal(r0, r4)
                return r4
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(java.util.Collection<?> r2) {
                r1 = this;
                java.util.Iterator r2 = r2.iterator()
            L4:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L16
                java.lang.Object r0 = r2.next()
                boolean r0 = r1.contains(r0)
                if (r0 != 0) goto L4
                r2 = 0
                return r2
            L16:
                r2 = 1
                return r2
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(java.lang.Object r1) {
                r0 = this;
                boolean r1 = androidx.collection.MapCollections.equalsSetHelper(r0, r1)
                return r1
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
                r6 = this;
                androidx.collection.MapCollections r0 = r6.this$0
                int r0 = r0.colGetSize()
                r1 = 1
                int r0 = r0 - r1
                r2 = 0
                r3 = r2
            La:
                if (r0 < 0) goto L2d
                androidx.collection.MapCollections r4 = r6.this$0
                java.lang.Object r4 = r4.colGetEntry(r0, r2)
                androidx.collection.MapCollections r5 = r6.this$0
                java.lang.Object r5 = r5.colGetEntry(r0, r1)
                if (r4 != 0) goto L1c
                r4 = r2
                goto L20
            L1c:
                int r4 = r4.hashCode()
            L20:
                if (r5 != 0) goto L24
                r5 = r2
                goto L28
            L24:
                int r5 = r5.hashCode()
            L28:
                r4 = r4 ^ r5
                int r3 = r3 + r4
                int r0 = r0 + (-1)
                goto La
            L2d:
                return r3
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
                r1 = this;
                androidx.collection.MapCollections r0 = r1.this$0
                int r0 = r0.colGetSize()
                if (r0 != 0) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                return r0
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
                r2 = this;
                androidx.collection.MapCollections$MapIterator r0 = new androidx.collection.MapCollections$MapIterator
                androidx.collection.MapCollections r1 = r2.this$0
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(java.lang.Object r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(java.util.Collection<?> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(java.util.Collection<?> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
                r1 = this;
                androidx.collection.MapCollections r0 = r1.this$0
                int r0 = r0.colGetSize()
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public java.lang.Object[] toArray() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }
    }

    final class KeySet implements java.util.Set<K> {
        final /* synthetic */ androidx.collection.MapCollections this$0;

        KeySet(androidx.collection.MapCollections r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(java.util.Collection<? extends K> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
                r1 = this;
                androidx.collection.MapCollections r0 = r1.this$0
                r0.colClear()
                return
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(java.lang.Object r2) {
                r1 = this;
                androidx.collection.MapCollections r0 = r1.this$0
                int r2 = r0.colIndexOfKey(r2)
                if (r2 < 0) goto La
                r2 = 1
                goto Lb
            La:
                r2 = 0
            Lb:
                return r2
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(java.util.Collection<?> r2) {
                r1 = this;
                androidx.collection.MapCollections r0 = r1.this$0
                java.util.Map r0 = r0.colGetMap()
                boolean r2 = androidx.collection.MapCollections.containsAllHelper(r0, r2)
                return r2
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(java.lang.Object r1) {
                r0 = this;
                boolean r1 = androidx.collection.MapCollections.equalsSetHelper(r0, r1)
                return r1
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
                r4 = this;
                androidx.collection.MapCollections r0 = r4.this$0
                int r0 = r0.colGetSize()
                int r0 = r0 + (-1)
                r1 = 0
                r2 = r1
            La:
                if (r0 < 0) goto L1e
                androidx.collection.MapCollections r3 = r4.this$0
                java.lang.Object r3 = r3.colGetEntry(r0, r1)
                if (r3 != 0) goto L16
                r3 = r1
                goto L1a
            L16:
                int r3 = r3.hashCode()
            L1a:
                int r2 = r2 + r3
                int r0 = r0 + (-1)
                goto La
            L1e:
                return r2
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
                r1 = this;
                androidx.collection.MapCollections r0 = r1.this$0
                int r0 = r0.colGetSize()
                if (r0 != 0) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                return r0
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<K> iterator() {
                r3 = this;
                androidx.collection.MapCollections$ArrayIterator r0 = new androidx.collection.MapCollections$ArrayIterator
                androidx.collection.MapCollections r1 = r3.this$0
                r2 = 0
                r0.<init>(r1, r2)
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(java.lang.Object r2) {
                r1 = this;
                androidx.collection.MapCollections r0 = r1.this$0
                int r2 = r0.colIndexOfKey(r2)
                if (r2 < 0) goto Lf
                androidx.collection.MapCollections r0 = r1.this$0
                r0.colRemoveAt(r2)
                r2 = 1
                return r2
            Lf:
                r2 = 0
                return r2
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(java.util.Collection<?> r2) {
                r1 = this;
                androidx.collection.MapCollections r0 = r1.this$0
                java.util.Map r0 = r0.colGetMap()
                boolean r2 = androidx.collection.MapCollections.removeAllHelper(r0, r2)
                return r2
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(java.util.Collection<?> r2) {
                r1 = this;
                androidx.collection.MapCollections r0 = r1.this$0
                java.util.Map r0 = r0.colGetMap()
                boolean r2 = androidx.collection.MapCollections.retainAllHelper(r0, r2)
                return r2
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
                r1 = this;
                androidx.collection.MapCollections r0 = r1.this$0
                int r0 = r0.colGetSize()
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public java.lang.Object[] toArray() {
                r2 = this;
                androidx.collection.MapCollections r0 = r2.this$0
                r1 = 0
                java.lang.Object[] r0 = r0.toArrayHelper(r1)
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] r3) {
                r2 = this;
                androidx.collection.MapCollections r0 = r2.this$0
                r1 = 0
                java.lang.Object[] r3 = r0.toArrayHelper(r3, r1)
                return r3
        }
    }

    final class MapIterator implements java.util.Iterator<java.util.Map.Entry<K, V>>, java.util.Map.Entry<K, V> {
        int mEnd;
        boolean mEntryValid;
        int mIndex;
        final /* synthetic */ androidx.collection.MapCollections this$0;

        MapIterator(androidx.collection.MapCollections r2) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                r0 = 0
                r1.mEntryValid = r0
                int r2 = r2.colGetSize()
                int r2 = r2 + (-1)
                r1.mEnd = r2
                r2 = -1
                r1.mIndex = r2
                return
        }

        @Override // java.util.Map.Entry
        public boolean equals(java.lang.Object r5) {
                r4 = this;
                boolean r0 = r4.mEntryValid
                if (r0 == 0) goto L33
                boolean r0 = r5 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 != 0) goto La
                return r1
            La:
                java.util.Map$Entry r5 = (java.util.Map.Entry) r5
                java.lang.Object r0 = r5.getKey()
                androidx.collection.MapCollections r2 = r4.this$0
                int r3 = r4.mIndex
                java.lang.Object r2 = r2.colGetEntry(r3, r1)
                boolean r0 = androidx.collection.ContainerHelpers.equal(r0, r2)
                if (r0 == 0) goto L32
                java.lang.Object r5 = r5.getValue()
                androidx.collection.MapCollections r0 = r4.this$0
                int r2 = r4.mIndex
                r3 = 1
                java.lang.Object r0 = r0.colGetEntry(r2, r3)
                boolean r5 = androidx.collection.ContainerHelpers.equal(r5, r0)
                if (r5 == 0) goto L32
                r1 = r3
            L32:
                return r1
            L33:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "This container does not support retaining Map.Entry objects"
                r5.<init>(r0)
                throw r5
        }

        @Override // java.util.Map.Entry
        public K getKey() {
                r3 = this;
                boolean r0 = r3.mEntryValid
                if (r0 == 0) goto Le
                androidx.collection.MapCollections r0 = r3.this$0
                int r1 = r3.mIndex
                r2 = 0
                java.lang.Object r0 = r0.colGetEntry(r1, r2)
                return r0
            Le:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "This container does not support retaining Map.Entry objects"
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.Map.Entry
        public V getValue() {
                r3 = this;
                boolean r0 = r3.mEntryValid
                if (r0 == 0) goto Le
                androidx.collection.MapCollections r0 = r3.this$0
                int r1 = r3.mIndex
                r2 = 1
                java.lang.Object r0 = r0.colGetEntry(r1, r2)
                return r0
            Le:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "This container does not support retaining Map.Entry objects"
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.mIndex
                int r1 = r2.mEnd
                if (r0 >= r1) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
                r5 = this;
                boolean r0 = r5.mEntryValid
                if (r0 == 0) goto L27
                androidx.collection.MapCollections r0 = r5.this$0
                int r1 = r5.mIndex
                r2 = 0
                java.lang.Object r0 = r0.colGetEntry(r1, r2)
                androidx.collection.MapCollections r1 = r5.this$0
                int r3 = r5.mIndex
                r4 = 1
                java.lang.Object r1 = r1.colGetEntry(r3, r4)
                if (r0 != 0) goto L1a
                r0 = r2
                goto L1e
            L1a:
                int r0 = r0.hashCode()
            L1e:
                if (r1 != 0) goto L21
                goto L25
            L21:
                int r2 = r1.hashCode()
            L25:
                r0 = r0 ^ r2
                return r0
            L27:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "This container does not support retaining Map.Entry objects"
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.Object next() {
                r1 = this;
                java.util.Map$Entry r0 = r1.next()
                return r0
        }

        @Override // java.util.Iterator
        public java.util.Map.Entry<K, V> next() {
                r2 = this;
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto Lf
                int r0 = r2.mIndex
                r1 = 1
                int r0 = r0 + r1
                r2.mIndex = r0
                r2.mEntryValid = r1
                return r2
            Lf:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                boolean r0 = r2.mEntryValid
                if (r0 == 0) goto L1b
                androidx.collection.MapCollections r0 = r2.this$0
                int r1 = r2.mIndex
                r0.colRemoveAt(r1)
                int r0 = r2.mIndex
                int r0 = r0 + (-1)
                r2.mIndex = r0
                int r0 = r2.mEnd
                int r0 = r0 + (-1)
                r2.mEnd = r0
                r0 = 0
                r2.mEntryValid = r0
                return
            L1b:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Map.Entry
        public V setValue(V r3) {
                r2 = this;
                boolean r0 = r2.mEntryValid
                if (r0 == 0) goto Ld
                androidx.collection.MapCollections r0 = r2.this$0
                int r1 = r2.mIndex
                java.lang.Object r3 = r0.colSetValue(r1, r3)
                return r3
            Ld:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "This container does not support retaining Map.Entry objects"
                r3.<init>(r0)
                throw r3
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.Object r1 = r2.getKey()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "="
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.Object r1 = r2.getValue()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    final class ValuesCollection implements java.util.Collection<V> {
        final /* synthetic */ androidx.collection.MapCollections this$0;

        ValuesCollection(androidx.collection.MapCollections r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.util.Collection
        public boolean add(V r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.Collection
        public boolean addAll(java.util.Collection<? extends V> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.Collection
        public void clear() {
                r1 = this;
                androidx.collection.MapCollections r0 = r1.this$0
                r0.colClear()
                return
        }

        @Override // java.util.Collection
        public boolean contains(java.lang.Object r2) {
                r1 = this;
                androidx.collection.MapCollections r0 = r1.this$0
                int r2 = r0.colIndexOfValue(r2)
                if (r2 < 0) goto La
                r2 = 1
                goto Lb
            La:
                r2 = 0
            Lb:
                return r2
        }

        @Override // java.util.Collection
        public boolean containsAll(java.util.Collection<?> r2) {
                r1 = this;
                java.util.Iterator r2 = r2.iterator()
            L4:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L16
                java.lang.Object r0 = r2.next()
                boolean r0 = r1.contains(r0)
                if (r0 != 0) goto L4
                r2 = 0
                return r2
            L16:
                r2 = 1
                return r2
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
                r1 = this;
                androidx.collection.MapCollections r0 = r1.this$0
                int r0 = r0.colGetSize()
                if (r0 != 0) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                return r0
        }

        @Override // java.util.Collection, java.lang.Iterable
        public java.util.Iterator<V> iterator() {
                r3 = this;
                androidx.collection.MapCollections$ArrayIterator r0 = new androidx.collection.MapCollections$ArrayIterator
                androidx.collection.MapCollections r1 = r3.this$0
                r2 = 1
                r0.<init>(r1, r2)
                return r0
        }

        @Override // java.util.Collection
        public boolean remove(java.lang.Object r2) {
                r1 = this;
                androidx.collection.MapCollections r0 = r1.this$0
                int r2 = r0.colIndexOfValue(r2)
                if (r2 < 0) goto Lf
                androidx.collection.MapCollections r0 = r1.this$0
                r0.colRemoveAt(r2)
                r2 = 1
                return r2
            Lf:
                r2 = 0
                return r2
        }

        @Override // java.util.Collection
        public boolean removeAll(java.util.Collection<?> r6) {
                r5 = this;
                androidx.collection.MapCollections r0 = r5.this$0
                int r0 = r0.colGetSize()
                r1 = 0
                r2 = r1
            L8:
                if (r1 >= r0) goto L23
                androidx.collection.MapCollections r3 = r5.this$0
                r4 = 1
                java.lang.Object r3 = r3.colGetEntry(r1, r4)
                boolean r3 = r6.contains(r3)
                if (r3 == 0) goto L21
                androidx.collection.MapCollections r2 = r5.this$0
                r2.colRemoveAt(r1)
                int r1 = r1 + (-1)
                int r0 = r0 + (-1)
                r2 = r4
            L21:
                int r1 = r1 + r4
                goto L8
            L23:
                return r2
        }

        @Override // java.util.Collection
        public boolean retainAll(java.util.Collection<?> r6) {
                r5 = this;
                androidx.collection.MapCollections r0 = r5.this$0
                int r0 = r0.colGetSize()
                r1 = 0
                r2 = r1
            L8:
                if (r1 >= r0) goto L23
                androidx.collection.MapCollections r3 = r5.this$0
                r4 = 1
                java.lang.Object r3 = r3.colGetEntry(r1, r4)
                boolean r3 = r6.contains(r3)
                if (r3 != 0) goto L21
                androidx.collection.MapCollections r2 = r5.this$0
                r2.colRemoveAt(r1)
                int r1 = r1 + (-1)
                int r0 = r0 + (-1)
                r2 = r4
            L21:
                int r1 = r1 + r4
                goto L8
            L23:
                return r2
        }

        @Override // java.util.Collection
        public int size() {
                r1 = this;
                androidx.collection.MapCollections r0 = r1.this$0
                int r0 = r0.colGetSize()
                return r0
        }

        @Override // java.util.Collection
        public java.lang.Object[] toArray() {
                r2 = this;
                androidx.collection.MapCollections r0 = r2.this$0
                r1 = 1
                java.lang.Object[] r0 = r0.toArrayHelper(r1)
                return r0
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] r3) {
                r2 = this;
                androidx.collection.MapCollections r0 = r2.this$0
                r1 = 1
                java.lang.Object[] r3 = r0.toArrayHelper(r3, r1)
                return r3
        }
    }

    MapCollections() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <K, V> boolean containsAllHelper(java.util.Map<K, V> r1, java.util.Collection<?> r2) {
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L16
            java.lang.Object r0 = r2.next()
            boolean r0 = r1.containsKey(r0)
            if (r0 != 0) goto L4
            r1 = 0
            return r1
        L16:
            r1 = 1
            return r1
    }

    public static <T> boolean equalsSetHelper(java.util.Set<T> r4, java.lang.Object r5) {
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof java.util.Set
            r2 = 0
            if (r1 == 0) goto L1e
            java.util.Set r5 = (java.util.Set) r5
            int r1 = r4.size()     // Catch: java.lang.Throwable -> L1e
            int r3 = r5.size()     // Catch: java.lang.Throwable -> L1e
            if (r1 != r3) goto L1c
            boolean r4 = r4.containsAll(r5)     // Catch: java.lang.Throwable -> L1e
            if (r4 == 0) goto L1c
            goto L1d
        L1c:
            r0 = r2
        L1d:
            return r0
        L1e:
            return r2
    }

    public static <K, V> boolean removeAllHelper(java.util.Map<K, V> r2, java.util.Collection<?> r3) {
            int r0 = r2.size()
            java.util.Iterator r3 = r3.iterator()
        L8:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r3.next()
            r2.remove(r1)
            goto L8
        L16:
            int r2 = r2.size()
            if (r0 == r2) goto L1e
            r2 = 1
            goto L1f
        L1e:
            r2 = 0
        L1f:
            return r2
    }

    public static <K, V> boolean retainAllHelper(java.util.Map<K, V> r3, java.util.Collection<?> r4) {
            int r0 = r3.size()
            java.util.Set r1 = r3.keySet()
            java.util.Iterator r1 = r1.iterator()
        Lc:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L20
            java.lang.Object r2 = r1.next()
            boolean r2 = r4.contains(r2)
            if (r2 != 0) goto Lc
            r1.remove()
            goto Lc
        L20:
            int r3 = r3.size()
            if (r0 == r3) goto L28
            r3 = 1
            goto L29
        L28:
            r3 = 0
        L29:
            return r3
    }

    protected abstract void colClear();

    protected abstract java.lang.Object colGetEntry(int r1, int r2);

    protected abstract java.util.Map<K, V> colGetMap();

    protected abstract int colGetSize();

    protected abstract int colIndexOfKey(java.lang.Object r1);

    protected abstract int colIndexOfValue(java.lang.Object r1);

    protected abstract void colPut(K r1, V r2);

    protected abstract void colRemoveAt(int r1);

    protected abstract V colSetValue(int r1, V r2);

    public java.util.Set<java.util.Map.Entry<K, V>> getEntrySet() {
            r1 = this;
            androidx.collection.MapCollections<K, V>$EntrySet r0 = r1.mEntrySet
            if (r0 != 0) goto Lb
            androidx.collection.MapCollections$EntrySet r0 = new androidx.collection.MapCollections$EntrySet
            r0.<init>(r1)
            r1.mEntrySet = r0
        Lb:
            androidx.collection.MapCollections<K, V>$EntrySet r0 = r1.mEntrySet
            return r0
    }

    public java.util.Set<K> getKeySet() {
            r1 = this;
            androidx.collection.MapCollections<K, V>$KeySet r0 = r1.mKeySet
            if (r0 != 0) goto Lb
            androidx.collection.MapCollections$KeySet r0 = new androidx.collection.MapCollections$KeySet
            r0.<init>(r1)
            r1.mKeySet = r0
        Lb:
            androidx.collection.MapCollections<K, V>$KeySet r0 = r1.mKeySet
            return r0
    }

    public java.util.Collection<V> getValues() {
            r1 = this;
            androidx.collection.MapCollections<K, V>$ValuesCollection r0 = r1.mValues
            if (r0 != 0) goto Lb
            androidx.collection.MapCollections$ValuesCollection r0 = new androidx.collection.MapCollections$ValuesCollection
            r0.<init>(r1)
            r1.mValues = r0
        Lb:
            androidx.collection.MapCollections<K, V>$ValuesCollection r0 = r1.mValues
            return r0
    }

    public java.lang.Object[] toArrayHelper(int r5) {
            r4 = this;
            int r0 = r4.colGetSize()
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
        L7:
            if (r2 >= r0) goto L12
            java.lang.Object r3 = r4.colGetEntry(r2, r5)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L7
        L12:
            return r1
    }

    public <T> T[] toArrayHelper(T[] r4, int r5) {
            r3 = this;
            int r0 = r3.colGetSize()
            int r1 = r4.length
            if (r1 >= r0) goto L17
            java.lang.Class r4 = r4.getClass()
            java.lang.Class r4 = r4.getComponentType()
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r0)
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.Object[] r4 = (java.lang.Object[]) r4
        L17:
            r1 = 0
        L18:
            if (r1 >= r0) goto L23
            java.lang.Object r2 = r3.colGetEntry(r1, r5)
            r4[r1] = r2
            int r1 = r1 + 1
            goto L18
        L23:
            int r5 = r4.length
            if (r5 <= r0) goto L29
            r5 = 0
            r4[r0] = r5
        L29:
            return r4
    }
}
