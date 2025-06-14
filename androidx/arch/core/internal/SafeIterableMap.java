package androidx.arch.core.internal;

/* loaded from: classes.dex */
public class SafeIterableMap<K, V> implements java.lang.Iterable<java.util.Map.Entry<K, V>> {
    private androidx.arch.core.internal.SafeIterableMap.Entry<K, V> mEnd;
    private java.util.WeakHashMap<androidx.arch.core.internal.SafeIterableMap.SupportRemove<K, V>, java.lang.Boolean> mIterators;
    private int mSize;
    androidx.arch.core.internal.SafeIterableMap.Entry<K, V> mStart;

    static class AscendingIterator<K, V> extends androidx.arch.core.internal.SafeIterableMap.ListIterator<K, V> {
        AscendingIterator(androidx.arch.core.internal.SafeIterableMap.Entry<K, V> r1, androidx.arch.core.internal.SafeIterableMap.Entry<K, V> r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.ListIterator
        androidx.arch.core.internal.SafeIterableMap.Entry<K, V> backward(androidx.arch.core.internal.SafeIterableMap.Entry<K, V> r1) {
                r0 = this;
                androidx.arch.core.internal.SafeIterableMap$Entry<K, V> r1 = r1.mPrevious
                return r1
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.ListIterator
        androidx.arch.core.internal.SafeIterableMap.Entry<K, V> forward(androidx.arch.core.internal.SafeIterableMap.Entry<K, V> r1) {
                r0 = this;
                androidx.arch.core.internal.SafeIterableMap$Entry<K, V> r1 = r1.mNext
                return r1
        }
    }

    private static class DescendingIterator<K, V> extends androidx.arch.core.internal.SafeIterableMap.ListIterator<K, V> {
        DescendingIterator(androidx.arch.core.internal.SafeIterableMap.Entry<K, V> r1, androidx.arch.core.internal.SafeIterableMap.Entry<K, V> r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.ListIterator
        androidx.arch.core.internal.SafeIterableMap.Entry<K, V> backward(androidx.arch.core.internal.SafeIterableMap.Entry<K, V> r1) {
                r0 = this;
                androidx.arch.core.internal.SafeIterableMap$Entry<K, V> r1 = r1.mNext
                return r1
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.ListIterator
        androidx.arch.core.internal.SafeIterableMap.Entry<K, V> forward(androidx.arch.core.internal.SafeIterableMap.Entry<K, V> r1) {
                r0 = this;
                androidx.arch.core.internal.SafeIterableMap$Entry<K, V> r1 = r1.mPrevious
                return r1
        }
    }

    static class Entry<K, V> implements java.util.Map.Entry<K, V> {
        final K mKey;
        androidx.arch.core.internal.SafeIterableMap.Entry<K, V> mNext;
        androidx.arch.core.internal.SafeIterableMap.Entry<K, V> mPrevious;
        final V mValue;

        Entry(K r1, V r2) {
                r0 = this;
                r0.<init>()
                r0.mKey = r1
                r0.mValue = r2
                return
        }

        @Override // java.util.Map.Entry
        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r5 != r4) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof androidx.arch.core.internal.SafeIterableMap.Entry
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                androidx.arch.core.internal.SafeIterableMap$Entry r5 = (androidx.arch.core.internal.SafeIterableMap.Entry) r5
                K r1 = r4.mKey
                K r3 = r5.mKey
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L21
                V r1 = r4.mValue
                V r5 = r5.mValue
                boolean r5 = r1.equals(r5)
                if (r5 == 0) goto L21
                goto L22
            L21:
                r0 = r2
            L22:
                return r0
        }

        @Override // java.util.Map.Entry
        public K getKey() {
                r1 = this;
                K r0 = r1.mKey
                return r0
        }

        @Override // java.util.Map.Entry
        public V getValue() {
                r1 = this;
                V r0 = r1.mValue
                return r0
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
                r2 = this;
                K r0 = r2.mKey
                int r0 = r0.hashCode()
                V r1 = r2.mValue
                int r1 = r1.hashCode()
                r0 = r0 ^ r1
                return r0
        }

        @Override // java.util.Map.Entry
        public V setValue(V r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "An entry modification is not supported"
                r2.<init>(r0)
                throw r2
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                K r1 = r2.mKey
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "="
                java.lang.StringBuilder r0 = r0.append(r1)
                V r1 = r2.mValue
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    private class IteratorWithAdditions implements java.util.Iterator<java.util.Map.Entry<K, V>>, androidx.arch.core.internal.SafeIterableMap.SupportRemove<K, V> {
        private boolean mBeforeStart;
        private androidx.arch.core.internal.SafeIterableMap.Entry<K, V> mCurrent;
        final /* synthetic */ androidx.arch.core.internal.SafeIterableMap this$0;

        IteratorWithAdditions(androidx.arch.core.internal.SafeIterableMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r1 = 1
                r0.mBeforeStart = r1
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r3 = this;
                boolean r0 = r3.mBeforeStart
                r1 = 1
                r2 = 0
                if (r0 == 0) goto Lf
                androidx.arch.core.internal.SafeIterableMap r0 = r3.this$0
                androidx.arch.core.internal.SafeIterableMap$Entry<K, V> r0 = r0.mStart
                if (r0 == 0) goto Ld
                goto Le
            Ld:
                r1 = r2
            Le:
                return r1
            Lf:
                androidx.arch.core.internal.SafeIterableMap$Entry<K, V> r0 = r3.mCurrent
                if (r0 == 0) goto L18
                androidx.arch.core.internal.SafeIterableMap$Entry<K, V> r0 = r0.mNext
                if (r0 == 0) goto L18
                goto L19
            L18:
                r1 = r2
            L19:
                return r1
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.Object next() {
                r1 = this;
                java.util.Map$Entry r0 = r1.next()
                return r0
        }

        @Override // java.util.Iterator
        public java.util.Map.Entry<K, V> next() {
                r1 = this;
                boolean r0 = r1.mBeforeStart
                if (r0 == 0) goto Le
                r0 = 0
                r1.mBeforeStart = r0
                androidx.arch.core.internal.SafeIterableMap r0 = r1.this$0
                androidx.arch.core.internal.SafeIterableMap$Entry<K, V> r0 = r0.mStart
                r1.mCurrent = r0
                goto L18
            Le:
                androidx.arch.core.internal.SafeIterableMap$Entry<K, V> r0 = r1.mCurrent
                if (r0 == 0) goto L15
                androidx.arch.core.internal.SafeIterableMap$Entry<K, V> r0 = r0.mNext
                goto L16
            L15:
                r0 = 0
            L16:
                r1.mCurrent = r0
            L18:
                androidx.arch.core.internal.SafeIterableMap$Entry<K, V> r0 = r1.mCurrent
                return r0
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.SupportRemove
        public void supportRemove(androidx.arch.core.internal.SafeIterableMap.Entry<K, V> r2) {
                r1 = this;
                androidx.arch.core.internal.SafeIterableMap$Entry<K, V> r0 = r1.mCurrent
                if (r2 != r0) goto Lf
                androidx.arch.core.internal.SafeIterableMap$Entry<K, V> r2 = r0.mPrevious
                r1.mCurrent = r2
                if (r2 != 0) goto Lc
                r2 = 1
                goto Ld
            Lc:
                r2 = 0
            Ld:
                r1.mBeforeStart = r2
            Lf:
                return
        }
    }

    private static abstract class ListIterator<K, V> implements java.util.Iterator<java.util.Map.Entry<K, V>>, androidx.arch.core.internal.SafeIterableMap.SupportRemove<K, V> {
        androidx.arch.core.internal.SafeIterableMap.Entry<K, V> mExpectedEnd;
        androidx.arch.core.internal.SafeIterableMap.Entry<K, V> mNext;

        ListIterator(androidx.arch.core.internal.SafeIterableMap.Entry<K, V> r1, androidx.arch.core.internal.SafeIterableMap.Entry<K, V> r2) {
                r0 = this;
                r0.<init>()
                r0.mExpectedEnd = r2
                r0.mNext = r1
                return
        }

        private androidx.arch.core.internal.SafeIterableMap.Entry<K, V> nextNode() {
                r2 = this;
                androidx.arch.core.internal.SafeIterableMap$Entry<K, V> r0 = r2.mNext
                androidx.arch.core.internal.SafeIterableMap$Entry<K, V> r1 = r2.mExpectedEnd
                if (r0 == r1) goto Le
                if (r1 != 0) goto L9
                goto Le
            L9:
                androidx.arch.core.internal.SafeIterableMap$Entry r0 = r2.forward(r0)
                return r0
            Le:
                r0 = 0
                return r0
        }

        abstract androidx.arch.core.internal.SafeIterableMap.Entry<K, V> backward(androidx.arch.core.internal.SafeIterableMap.Entry<K, V> r1);

        abstract androidx.arch.core.internal.SafeIterableMap.Entry<K, V> forward(androidx.arch.core.internal.SafeIterableMap.Entry<K, V> r1);

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                androidx.arch.core.internal.SafeIterableMap$Entry<K, V> r0 = r1.mNext
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
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
                androidx.arch.core.internal.SafeIterableMap$Entry<K, V> r0 = r2.mNext
                androidx.arch.core.internal.SafeIterableMap$Entry r1 = r2.nextNode()
                r2.mNext = r1
                return r0
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.SupportRemove
        public void supportRemove(androidx.arch.core.internal.SafeIterableMap.Entry<K, V> r2) {
                r1 = this;
                androidx.arch.core.internal.SafeIterableMap$Entry<K, V> r0 = r1.mExpectedEnd
                if (r0 != r2) goto Ld
                androidx.arch.core.internal.SafeIterableMap$Entry<K, V> r0 = r1.mNext
                if (r2 != r0) goto Ld
                r0 = 0
                r1.mNext = r0
                r1.mExpectedEnd = r0
            Ld:
                androidx.arch.core.internal.SafeIterableMap$Entry<K, V> r0 = r1.mExpectedEnd
                if (r0 != r2) goto L17
                androidx.arch.core.internal.SafeIterableMap$Entry r0 = r1.backward(r0)
                r1.mExpectedEnd = r0
            L17:
                androidx.arch.core.internal.SafeIterableMap$Entry<K, V> r0 = r1.mNext
                if (r0 != r2) goto L21
                androidx.arch.core.internal.SafeIterableMap$Entry r2 = r1.nextNode()
                r1.mNext = r2
            L21:
                return
        }
    }

    interface SupportRemove<K, V> {
        void supportRemove(androidx.arch.core.internal.SafeIterableMap.Entry<K, V> r1);
    }

    public SafeIterableMap() {
            r1 = this;
            r1.<init>()
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r1.mIterators = r0
            r0 = 0
            r1.mSize = r0
            return
    }

    public java.util.Iterator<java.util.Map.Entry<K, V>> descendingIterator() {
            r3 = this;
            androidx.arch.core.internal.SafeIterableMap$DescendingIterator r0 = new androidx.arch.core.internal.SafeIterableMap$DescendingIterator
            androidx.arch.core.internal.SafeIterableMap$Entry<K, V> r1 = r3.mEnd
            androidx.arch.core.internal.SafeIterableMap$Entry<K, V> r2 = r3.mStart
            r0.<init>(r1, r2)
            java.util.WeakHashMap<androidx.arch.core.internal.SafeIterableMap$SupportRemove<K, V>, java.lang.Boolean> r1 = r3.mIterators
            r2 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1.put(r0, r2)
            return r0
    }

    public java.util.Map.Entry<K, V> eldest() {
            r1 = this;
            androidx.arch.core.internal.SafeIterableMap$Entry<K, V> r0 = r1.mStart
            return r0
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof androidx.arch.core.internal.SafeIterableMap
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            androidx.arch.core.internal.SafeIterableMap r6 = (androidx.arch.core.internal.SafeIterableMap) r6
            int r1 = r5.size()
            int r3 = r6.size()
            if (r1 == r3) goto L17
            return r2
        L17:
            java.util.Iterator r1 = r5.iterator()
            java.util.Iterator r6 = r6.iterator()
        L1f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L42
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L42
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r6.next()
            if (r3 != 0) goto L39
            if (r4 != 0) goto L41
        L39:
            if (r3 == 0) goto L1f
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1f
        L41:
            return r2
        L42:
            boolean r1 = r1.hasNext()
            if (r1 != 0) goto L4f
            boolean r6 = r6.hasNext()
            if (r6 != 0) goto L4f
            goto L50
        L4f:
            r0 = r2
        L50:
            return r0
    }

    protected androidx.arch.core.internal.SafeIterableMap.Entry<K, V> get(K r3) {
            r2 = this;
            androidx.arch.core.internal.SafeIterableMap$Entry<K, V> r0 = r2.mStart
        L2:
            if (r0 == 0) goto L10
            K r1 = r0.mKey
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Ld
            goto L10
        Ld:
            androidx.arch.core.internal.SafeIterableMap$Entry<K, V> r0 = r0.mNext
            goto L2
        L10:
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.util.Iterator r0 = r3.iterator()
            r1 = 0
        L5:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L17
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            int r2 = r2.hashCode()
            int r1 = r1 + r2
            goto L5
        L17:
            return r1
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
            r3 = this;
            androidx.arch.core.internal.SafeIterableMap$AscendingIterator r0 = new androidx.arch.core.internal.SafeIterableMap$AscendingIterator
            androidx.arch.core.internal.SafeIterableMap$Entry<K, V> r1 = r3.mStart
            androidx.arch.core.internal.SafeIterableMap$Entry<K, V> r2 = r3.mEnd
            r0.<init>(r1, r2)
            java.util.WeakHashMap<androidx.arch.core.internal.SafeIterableMap$SupportRemove<K, V>, java.lang.Boolean> r1 = r3.mIterators
            r2 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1.put(r0, r2)
            return r0
    }

    public androidx.arch.core.internal.SafeIterableMap<K, V>.IteratorWithAdditions iteratorWithAdditions() {
            r3 = this;
            androidx.arch.core.internal.SafeIterableMap$IteratorWithAdditions r0 = new androidx.arch.core.internal.SafeIterableMap$IteratorWithAdditions
            r0.<init>(r3)
            java.util.WeakHashMap<androidx.arch.core.internal.SafeIterableMap$SupportRemove<K, V>, java.lang.Boolean> r1 = r3.mIterators
            r2 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1.put(r0, r2)
            return r0
    }

    public java.util.Map.Entry<K, V> newest() {
            r1 = this;
            androidx.arch.core.internal.SafeIterableMap$Entry<K, V> r0 = r1.mEnd
            return r0
    }

    protected androidx.arch.core.internal.SafeIterableMap.Entry<K, V> put(K r2, V r3) {
            r1 = this;
            androidx.arch.core.internal.SafeIterableMap$Entry r0 = new androidx.arch.core.internal.SafeIterableMap$Entry
            r0.<init>(r2, r3)
            int r2 = r1.mSize
            int r2 = r2 + 1
            r1.mSize = r2
            androidx.arch.core.internal.SafeIterableMap$Entry<K, V> r2 = r1.mEnd
            if (r2 != 0) goto L14
            r1.mStart = r0
            r1.mEnd = r0
            return r0
        L14:
            r2.mNext = r0
            androidx.arch.core.internal.SafeIterableMap$Entry<K, V> r2 = r1.mEnd
            r0.mPrevious = r2
            r1.mEnd = r0
            return r0
    }

    public V putIfAbsent(K r2, V r3) {
            r1 = this;
            androidx.arch.core.internal.SafeIterableMap$Entry r0 = r1.get(r2)
            if (r0 == 0) goto L9
            V r2 = r0.mValue
            return r2
        L9:
            r1.put(r2, r3)
            r2 = 0
            return r2
    }

    public V remove(K r4) {
            r3 = this;
            androidx.arch.core.internal.SafeIterableMap$Entry r4 = r3.get(r4)
            r0 = 0
            if (r4 != 0) goto L8
            return r0
        L8:
            int r1 = r3.mSize
            int r1 = r1 + (-1)
            r3.mSize = r1
            java.util.WeakHashMap<androidx.arch.core.internal.SafeIterableMap$SupportRemove<K, V>, java.lang.Boolean> r1 = r3.mIterators
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L30
            java.util.WeakHashMap<androidx.arch.core.internal.SafeIterableMap$SupportRemove<K, V>, java.lang.Boolean> r1 = r3.mIterators
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L20:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L30
            java.lang.Object r2 = r1.next()
            androidx.arch.core.internal.SafeIterableMap$SupportRemove r2 = (androidx.arch.core.internal.SafeIterableMap.SupportRemove) r2
            r2.supportRemove(r4)
            goto L20
        L30:
            androidx.arch.core.internal.SafeIterableMap$Entry<K, V> r1 = r4.mPrevious
            if (r1 == 0) goto L3b
            androidx.arch.core.internal.SafeIterableMap$Entry<K, V> r1 = r4.mPrevious
            androidx.arch.core.internal.SafeIterableMap$Entry<K, V> r2 = r4.mNext
            r1.mNext = r2
            goto L3f
        L3b:
            androidx.arch.core.internal.SafeIterableMap$Entry<K, V> r1 = r4.mNext
            r3.mStart = r1
        L3f:
            androidx.arch.core.internal.SafeIterableMap$Entry<K, V> r1 = r4.mNext
            if (r1 == 0) goto L4a
            androidx.arch.core.internal.SafeIterableMap$Entry<K, V> r1 = r4.mNext
            androidx.arch.core.internal.SafeIterableMap$Entry<K, V> r2 = r4.mPrevious
            r1.mPrevious = r2
            goto L4e
        L4a:
            androidx.arch.core.internal.SafeIterableMap$Entry<K, V> r1 = r4.mPrevious
            r3.mEnd = r1
        L4e:
            r4.mNext = r0
            r4.mPrevious = r0
            V r4 = r4.mValue
            return r4
    }

    public int size() {
            r1 = this;
            int r0 = r1.mSize
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "["
            r0.<init>(r1)
            java.util.Iterator r1 = r3.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2a
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lb
            java.lang.String r2 = ", "
            r0.append(r2)
            goto Lb
        L2a:
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
