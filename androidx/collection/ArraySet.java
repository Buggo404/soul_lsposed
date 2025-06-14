package androidx.collection;

/* loaded from: classes.dex */
public final class ArraySet<E> implements java.util.Collection<E>, java.util.Set<E> {
    private static final int BASE_SIZE = 4;
    private static final int CACHE_SIZE = 10;
    private static final boolean DEBUG = false;
    private static final int[] INT = null;
    private static final java.lang.Object[] OBJECT = null;
    private static final java.lang.String TAG = "ArraySet";
    private static java.lang.Object[] sBaseCache;
    private static int sBaseCacheSize;
    private static java.lang.Object[] sTwiceBaseCache;
    private static int sTwiceBaseCacheSize;
    java.lang.Object[] mArray;
    private androidx.collection.MapCollections<E, E> mCollections;
    private int[] mHashes;
    int mSize;


    static {
            r0 = 0
            int[] r1 = new int[r0]
            androidx.collection.ArraySet.INT = r1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            androidx.collection.ArraySet.OBJECT = r0
            return
    }

    public ArraySet() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public ArraySet(int r1) {
            r0 = this;
            r0.<init>()
            if (r1 != 0) goto Le
            int[] r1 = androidx.collection.ArraySet.INT
            r0.mHashes = r1
            java.lang.Object[] r1 = androidx.collection.ArraySet.OBJECT
            r0.mArray = r1
            goto L11
        Le:
            r0.allocArrays(r1)
        L11:
            r1 = 0
            r0.mSize = r1
            return
    }

    public ArraySet(androidx.collection.ArraySet<E> r1) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L8
            r0.addAll(r1)
        L8:
            return
    }

    public ArraySet(java.util.Collection<E> r1) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L8
            r0.addAll(r1)
        L8:
            return
    }

    private void allocArrays(int r6) {
            r5 = this;
            r0 = 8
            r1 = 0
            r2 = 0
            r3 = 1
            if (r6 != r0) goto L30
            java.lang.Class<androidx.collection.ArraySet> r0 = androidx.collection.ArraySet.class
            monitor-enter(r0)
            java.lang.Object[] r4 = androidx.collection.ArraySet.sTwiceBaseCache     // Catch: java.lang.Throwable -> L2d
            if (r4 == 0) goto L2b
            r5.mArray = r4     // Catch: java.lang.Throwable -> L2d
            r6 = r4[r2]     // Catch: java.lang.Throwable -> L2d
            java.lang.Object[] r6 = (java.lang.Object[]) r6     // Catch: java.lang.Throwable -> L2d
            java.lang.Object[] r6 = (java.lang.Object[]) r6     // Catch: java.lang.Throwable -> L2d
            androidx.collection.ArraySet.sTwiceBaseCache = r6     // Catch: java.lang.Throwable -> L2d
            r6 = r4[r3]     // Catch: java.lang.Throwable -> L2d
            int[] r6 = (int[]) r6     // Catch: java.lang.Throwable -> L2d
            int[] r6 = (int[]) r6     // Catch: java.lang.Throwable -> L2d
            r5.mHashes = r6     // Catch: java.lang.Throwable -> L2d
            r4[r3] = r1     // Catch: java.lang.Throwable -> L2d
            r4[r2] = r1     // Catch: java.lang.Throwable -> L2d
            int r6 = androidx.collection.ArraySet.sTwiceBaseCacheSize     // Catch: java.lang.Throwable -> L2d
            int r6 = r6 - r3
            androidx.collection.ArraySet.sTwiceBaseCacheSize = r6     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
            return
        L2b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
            goto L5c
        L2d:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
            throw r6
        L30:
            r0 = 4
            if (r6 != r0) goto L5c
            java.lang.Class<androidx.collection.ArraySet> r0 = androidx.collection.ArraySet.class
            monitor-enter(r0)
            java.lang.Object[] r4 = androidx.collection.ArraySet.sBaseCache     // Catch: java.lang.Throwable -> L59
            if (r4 == 0) goto L57
            r5.mArray = r4     // Catch: java.lang.Throwable -> L59
            r6 = r4[r2]     // Catch: java.lang.Throwable -> L59
            java.lang.Object[] r6 = (java.lang.Object[]) r6     // Catch: java.lang.Throwable -> L59
            java.lang.Object[] r6 = (java.lang.Object[]) r6     // Catch: java.lang.Throwable -> L59
            androidx.collection.ArraySet.sBaseCache = r6     // Catch: java.lang.Throwable -> L59
            r6 = r4[r3]     // Catch: java.lang.Throwable -> L59
            int[] r6 = (int[]) r6     // Catch: java.lang.Throwable -> L59
            int[] r6 = (int[]) r6     // Catch: java.lang.Throwable -> L59
            r5.mHashes = r6     // Catch: java.lang.Throwable -> L59
            r4[r3] = r1     // Catch: java.lang.Throwable -> L59
            r4[r2] = r1     // Catch: java.lang.Throwable -> L59
            int r6 = androidx.collection.ArraySet.sBaseCacheSize     // Catch: java.lang.Throwable -> L59
            int r6 = r6 - r3
            androidx.collection.ArraySet.sBaseCacheSize = r6     // Catch: java.lang.Throwable -> L59
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L59
            return
        L57:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L59
            goto L5c
        L59:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L59
            throw r6
        L5c:
            int[] r0 = new int[r6]
            r5.mHashes = r0
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r5.mArray = r6
            return
    }

    private static void freeArrays(int[] r7, java.lang.Object[] r8, int r9) {
            int r0 = r7.length
            r1 = 8
            r2 = 0
            r3 = 2
            r4 = 0
            r5 = 10
            r6 = 1
            if (r0 != r1) goto L2c
            java.lang.Class<androidx.collection.ArraySet> r0 = androidx.collection.ArraySet.class
            monitor-enter(r0)
            int r1 = androidx.collection.ArraySet.sTwiceBaseCacheSize     // Catch: java.lang.Throwable -> L29
            if (r1 >= r5) goto L27
            java.lang.Object[] r1 = androidx.collection.ArraySet.sTwiceBaseCache     // Catch: java.lang.Throwable -> L29
            r8[r4] = r1     // Catch: java.lang.Throwable -> L29
            r8[r6] = r7     // Catch: java.lang.Throwable -> L29
            int r9 = r9 - r6
        L19:
            if (r9 < r3) goto L20
            r8[r9] = r2     // Catch: java.lang.Throwable -> L29
            int r9 = r9 + (-1)
            goto L19
        L20:
            androidx.collection.ArraySet.sTwiceBaseCache = r8     // Catch: java.lang.Throwable -> L29
            int r7 = androidx.collection.ArraySet.sTwiceBaseCacheSize     // Catch: java.lang.Throwable -> L29
            int r7 = r7 + r6
            androidx.collection.ArraySet.sTwiceBaseCacheSize = r7     // Catch: java.lang.Throwable -> L29
        L27:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            goto L51
        L29:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            throw r7
        L2c:
            int r0 = r7.length
            r1 = 4
            if (r0 != r1) goto L51
            java.lang.Class<androidx.collection.ArraySet> r0 = androidx.collection.ArraySet.class
            monitor-enter(r0)
            int r1 = androidx.collection.ArraySet.sBaseCacheSize     // Catch: java.lang.Throwable -> L4e
            if (r1 >= r5) goto L4c
            java.lang.Object[] r1 = androidx.collection.ArraySet.sBaseCache     // Catch: java.lang.Throwable -> L4e
            r8[r4] = r1     // Catch: java.lang.Throwable -> L4e
            r8[r6] = r7     // Catch: java.lang.Throwable -> L4e
            int r9 = r9 - r6
        L3e:
            if (r9 < r3) goto L45
            r8[r9] = r2     // Catch: java.lang.Throwable -> L4e
            int r9 = r9 + (-1)
            goto L3e
        L45:
            androidx.collection.ArraySet.sBaseCache = r8     // Catch: java.lang.Throwable -> L4e
            int r7 = androidx.collection.ArraySet.sBaseCacheSize     // Catch: java.lang.Throwable -> L4e
            int r7 = r7 + r6
            androidx.collection.ArraySet.sBaseCacheSize = r7     // Catch: java.lang.Throwable -> L4e
        L4c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4e
            goto L51
        L4e:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4e
            throw r7
        L51:
            return
    }

    private androidx.collection.MapCollections<E, E> getCollection() {
            r1 = this;
            androidx.collection.MapCollections<E, E> r0 = r1.mCollections
            if (r0 != 0) goto Lb
            androidx.collection.ArraySet$1 r0 = new androidx.collection.ArraySet$1
            r0.<init>(r1)
            r1.mCollections = r0
        Lb:
            androidx.collection.MapCollections<E, E> r0 = r1.mCollections
            return r0
    }

    private int indexOf(java.lang.Object r5, int r6) {
            r4 = this;
            int r0 = r4.mSize
            if (r0 != 0) goto L6
            r5 = -1
            return r5
        L6:
            int[] r1 = r4.mHashes
            int r1 = androidx.collection.ContainerHelpers.binarySearch(r1, r0, r6)
            if (r1 >= 0) goto Lf
            return r1
        Lf:
            java.lang.Object[] r2 = r4.mArray
            r2 = r2[r1]
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L1a
            return r1
        L1a:
            int r2 = r1 + 1
        L1c:
            if (r2 >= r0) goto L32
            int[] r3 = r4.mHashes
            r3 = r3[r2]
            if (r3 != r6) goto L32
            java.lang.Object[] r3 = r4.mArray
            r3 = r3[r2]
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L2f
            return r2
        L2f:
            int r2 = r2 + 1
            goto L1c
        L32:
            int r1 = r1 + (-1)
        L34:
            if (r1 < 0) goto L4a
            int[] r0 = r4.mHashes
            r0 = r0[r1]
            if (r0 != r6) goto L4a
            java.lang.Object[] r0 = r4.mArray
            r0 = r0[r1]
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L47
            return r1
        L47:
            int r1 = r1 + (-1)
            goto L34
        L4a:
            int r5 = ~r2
            return r5
    }

    private int indexOfNull() {
            r4 = this;
            int r0 = r4.mSize
            if (r0 != 0) goto L6
            r0 = -1
            return r0
        L6:
            int[] r1 = r4.mHashes
            r2 = 0
            int r1 = androidx.collection.ContainerHelpers.binarySearch(r1, r0, r2)
            if (r1 >= 0) goto L10
            return r1
        L10:
            java.lang.Object[] r2 = r4.mArray
            r2 = r2[r1]
            if (r2 != 0) goto L17
            return r1
        L17:
            int r2 = r1 + 1
        L19:
            if (r2 >= r0) goto L2b
            int[] r3 = r4.mHashes
            r3 = r3[r2]
            if (r3 != 0) goto L2b
            java.lang.Object[] r3 = r4.mArray
            r3 = r3[r2]
            if (r3 != 0) goto L28
            return r2
        L28:
            int r2 = r2 + 1
            goto L19
        L2b:
            int r1 = r1 + (-1)
        L2d:
            if (r1 < 0) goto L3f
            int[] r0 = r4.mHashes
            r0 = r0[r1]
            if (r0 != 0) goto L3f
            java.lang.Object[] r0 = r4.mArray
            r0 = r0[r1]
            if (r0 != 0) goto L3c
            return r1
        L3c:
            int r1 = r1 + (-1)
            goto L2d
        L3f:
            int r0 = ~r2
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E r9) {
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L9
            int r1 = r8.indexOfNull()
            r2 = r0
            goto L14
        L9:
            int r1 = r9.hashCode()
            int r2 = r8.indexOf(r9, r1)
            r7 = r2
            r2 = r1
            r1 = r7
        L14:
            if (r1 < 0) goto L17
            return r0
        L17:
            int r1 = ~r1
            int r3 = r8.mSize
            int[] r4 = r8.mHashes
            int r5 = r4.length
            if (r3 < r5) goto L45
            r5 = 8
            if (r3 < r5) goto L27
            int r5 = r3 >> 1
            int r5 = r5 + r3
            goto L2c
        L27:
            r6 = 4
            if (r3 < r6) goto L2b
            goto L2c
        L2b:
            r5 = r6
        L2c:
            java.lang.Object[] r3 = r8.mArray
            r8.allocArrays(r5)
            int[] r5 = r8.mHashes
            int r6 = r5.length
            if (r6 <= 0) goto L40
            int r6 = r4.length
            java.lang.System.arraycopy(r4, r0, r5, r0, r6)
            java.lang.Object[] r5 = r8.mArray
            int r6 = r3.length
            java.lang.System.arraycopy(r3, r0, r5, r0, r6)
        L40:
            int r0 = r8.mSize
            freeArrays(r4, r3, r0)
        L45:
            int r0 = r8.mSize
            if (r1 >= r0) goto L59
            int[] r3 = r8.mHashes
            int r4 = r1 + 1
            int r0 = r0 - r1
            java.lang.System.arraycopy(r3, r1, r3, r4, r0)
            java.lang.Object[] r0 = r8.mArray
            int r3 = r8.mSize
            int r3 = r3 - r1
            java.lang.System.arraycopy(r0, r1, r0, r4, r3)
        L59:
            int[] r0 = r8.mHashes
            r0[r1] = r2
            java.lang.Object[] r0 = r8.mArray
            r0[r1] = r9
            int r9 = r8.mSize
            r0 = 1
            int r9 = r9 + r0
            r8.mSize = r9
            return r0
    }

    public void addAll(androidx.collection.ArraySet<? extends E> r5) {
            r4 = this;
            int r0 = r5.mSize
            int r1 = r4.mSize
            int r1 = r1 + r0
            r4.ensureCapacity(r1)
            int r1 = r4.mSize
            r2 = 0
            if (r1 != 0) goto L20
            if (r0 <= 0) goto L2c
            int[] r1 = r5.mHashes
            int[] r3 = r4.mHashes
            java.lang.System.arraycopy(r1, r2, r3, r2, r0)
            java.lang.Object[] r5 = r5.mArray
            java.lang.Object[] r1 = r4.mArray
            java.lang.System.arraycopy(r5, r2, r1, r2, r0)
            r4.mSize = r0
            goto L2c
        L20:
            if (r2 >= r0) goto L2c
            java.lang.Object r1 = r5.valueAt(r2)
            r4.add(r1)
            int r2 = r2 + 1
            goto L20
        L2c:
            return
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(java.util.Collection<? extends E> r3) {
            r2 = this;
            int r0 = r2.mSize
            int r1 = r3.size()
            int r0 = r0 + r1
            r2.ensureCapacity(r0)
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        Lf:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r3.next()
            boolean r1 = r2.add(r1)
            r0 = r0 | r1
            goto Lf
        L1f:
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
            r3 = this;
            int r0 = r3.mSize
            if (r0 == 0) goto L16
            int[] r1 = r3.mHashes
            java.lang.Object[] r2 = r3.mArray
            freeArrays(r1, r2, r0)
            int[] r0 = androidx.collection.ArraySet.INT
            r3.mHashes = r0
            java.lang.Object[] r0 = androidx.collection.ArraySet.OBJECT
            r3.mArray = r0
            r0 = 0
            r3.mSize = r0
        L16:
            return
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.indexOf(r1)
            if (r1 < 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    @Override // java.util.Collection, java.util.Set
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

    public void ensureCapacity(int r5) {
            r4 = this;
            int[] r0 = r4.mHashes
            int r1 = r0.length
            if (r1 >= r5) goto L20
            java.lang.Object[] r1 = r4.mArray
            r4.allocArrays(r5)
            int r5 = r4.mSize
            if (r5 <= 0) goto L1b
            int[] r2 = r4.mHashes
            r3 = 0
            java.lang.System.arraycopy(r0, r3, r2, r3, r5)
            java.lang.Object[] r5 = r4.mArray
            int r2 = r4.mSize
            java.lang.System.arraycopy(r1, r3, r5, r3, r2)
        L1b:
            int r5 = r4.mSize
            freeArrays(r0, r1, r5)
        L20:
            return
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof java.util.Set
            r2 = 0
            if (r1 == 0) goto L2a
            java.util.Set r5 = (java.util.Set) r5
            int r1 = r4.size()
            int r3 = r5.size()
            if (r1 == r3) goto L16
            return r2
        L16:
            r1 = r2
        L17:
            int r3 = r4.mSize     // Catch: java.lang.Throwable -> L2a
            if (r1 >= r3) goto L29
            java.lang.Object r3 = r4.valueAt(r1)     // Catch: java.lang.Throwable -> L2a
            boolean r3 = r5.contains(r3)     // Catch: java.lang.Throwable -> L2a
            if (r3 != 0) goto L26
            return r2
        L26:
            int r1 = r1 + 1
            goto L17
        L29:
            return r0
        L2a:
            return r2
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
            r5 = this;
            int[] r0 = r5.mHashes
            int r1 = r5.mSize
            r2 = 0
            r3 = r2
        L6:
            if (r2 >= r1) goto Le
            r4 = r0[r2]
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L6
        Le:
            return r3
    }

    public int indexOf(java.lang.Object r2) {
            r1 = this;
            if (r2 != 0) goto L7
            int r2 = r1.indexOfNull()
            goto Lf
        L7:
            int r0 = r2.hashCode()
            int r2 = r1.indexOf(r2, r0)
        Lf:
            return r2
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.mSize
            if (r0 > 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator<E> iterator() {
            r1 = this;
            androidx.collection.MapCollections r0 = r1.getCollection()
            java.util.Set r0 = r0.getKeySet()
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.indexOf(r1)
            if (r1 < 0) goto Lb
            r0.removeAt(r1)
            r1 = 1
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public boolean removeAll(androidx.collection.ArraySet<? extends E> r6) {
            r5 = this;
            int r0 = r6.mSize
            int r1 = r5.mSize
            r2 = 0
            r3 = r2
        L6:
            if (r3 >= r0) goto L12
            java.lang.Object r4 = r6.valueAt(r3)
            r5.remove(r4)
            int r3 = r3 + 1
            goto L6
        L12:
            int r6 = r5.mSize
            if (r1 == r6) goto L17
            r2 = 1
        L17:
            return r2
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(java.util.Collection<?> r3) {
            r2 = this;
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        L5:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L15
            java.lang.Object r1 = r3.next()
            boolean r1 = r2.remove(r1)
            r0 = r0 | r1
            goto L5
        L15:
            return r0
    }

    public E removeAt(int r9) {
            r8 = this;
            java.lang.Object[] r0 = r8.mArray
            r1 = r0[r9]
            int r2 = r8.mSize
            r3 = 0
            r4 = 1
            if (r2 > r4) goto L1a
            int[] r9 = r8.mHashes
            freeArrays(r9, r0, r2)
            int[] r9 = androidx.collection.ArraySet.INT
            r8.mHashes = r9
            java.lang.Object[] r9 = androidx.collection.ArraySet.OBJECT
            r8.mArray = r9
            r8.mSize = r3
            goto L6f
        L1a:
            int[] r5 = r8.mHashes
            int r6 = r5.length
            r7 = 8
            if (r6 <= r7) goto L55
            int r6 = r5.length
            int r6 = r6 / 3
            if (r2 >= r6) goto L55
            if (r2 <= r7) goto L2c
            int r6 = r2 >> 1
            int r7 = r2 + r6
        L2c:
            r8.allocArrays(r7)
            int r2 = r8.mSize
            int r2 = r2 - r4
            r8.mSize = r2
            if (r9 <= 0) goto L40
            int[] r2 = r8.mHashes
            java.lang.System.arraycopy(r5, r3, r2, r3, r9)
            java.lang.Object[] r2 = r8.mArray
            java.lang.System.arraycopy(r0, r3, r2, r3, r9)
        L40:
            int r2 = r8.mSize
            if (r9 >= r2) goto L6f
            int r3 = r9 + 1
            int[] r4 = r8.mHashes
            int r2 = r2 - r9
            java.lang.System.arraycopy(r5, r3, r4, r9, r2)
            java.lang.Object[] r2 = r8.mArray
            int r4 = r8.mSize
            int r4 = r4 - r9
            java.lang.System.arraycopy(r0, r3, r2, r9, r4)
            goto L6f
        L55:
            int r2 = r2 - r4
            r8.mSize = r2
            if (r9 >= r2) goto L68
            int r0 = r9 + 1
            int r2 = r2 - r9
            java.lang.System.arraycopy(r5, r0, r5, r9, r2)
            java.lang.Object[] r2 = r8.mArray
            int r3 = r8.mSize
            int r3 = r3 - r9
            java.lang.System.arraycopy(r2, r0, r2, r9, r3)
        L68:
            java.lang.Object[] r9 = r8.mArray
            int r0 = r8.mSize
            r2 = 0
            r9[r0] = r2
        L6f:
            return r1
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(java.util.Collection<?> r5) {
            r4 = this;
            int r0 = r4.mSize
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
        L5:
            if (r0 < 0) goto L18
            java.lang.Object[] r3 = r4.mArray
            r3 = r3[r0]
            boolean r3 = r5.contains(r3)
            if (r3 != 0) goto L15
            r4.removeAt(r0)
            r2 = r1
        L15:
            int r0 = r0 + (-1)
            goto L5
        L18:
            return r2
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
            r1 = this;
            int r0 = r1.mSize
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public java.lang.Object[] toArray() {
            r4 = this;
            int r0 = r4.mSize
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Object[] r2 = r4.mArray
            r3 = 0
            java.lang.System.arraycopy(r2, r3, r1, r3, r0)
            return r1
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] r4) {
            r3 = this;
            int r0 = r4.length
            int r1 = r3.mSize
            if (r0 >= r1) goto L17
            java.lang.Class r4 = r4.getClass()
            java.lang.Class r4 = r4.getComponentType()
            int r0 = r3.mSize
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r0)
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.Object[] r4 = (java.lang.Object[]) r4
        L17:
            java.lang.Object[] r0 = r3.mArray
            int r1 = r3.mSize
            r2 = 0
            java.lang.System.arraycopy(r0, r2, r4, r2, r1)
            int r0 = r4.length
            int r1 = r3.mSize
            if (r0 <= r1) goto L27
            r0 = 0
            r4[r1] = r0
        L27:
            return r4
    }

    public java.lang.String toString() {
            r3 = this;
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L9
            java.lang.String r0 = "{}"
            return r0
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r3.mSize
            int r1 = r1 * 14
            r0.<init>(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            r1 = 0
        L18:
            int r2 = r3.mSize
            if (r1 >= r2) goto L35
            if (r1 <= 0) goto L23
            java.lang.String r2 = ", "
            r0.append(r2)
        L23:
            java.lang.Object r2 = r3.valueAt(r1)
            if (r2 == r3) goto L2d
            r0.append(r2)
            goto L32
        L2d:
            java.lang.String r2 = "(this Set)"
            r0.append(r2)
        L32:
            int r1 = r1 + 1
            goto L18
        L35:
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public E valueAt(int r2) {
            r1 = this;
            java.lang.Object[] r0 = r1.mArray
            r2 = r0[r2]
            return r2
    }
}
