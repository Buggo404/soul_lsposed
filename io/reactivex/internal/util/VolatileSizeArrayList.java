package io.reactivex.internal.util;

/* loaded from: classes.dex */
public final class VolatileSizeArrayList<T> extends java.util.concurrent.atomic.AtomicInteger implements java.util.List<T>, java.util.RandomAccess {
    private static final long serialVersionUID = 3972397474470203923L;
    final java.util.ArrayList<T> list;

    public VolatileSizeArrayList() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.list = r0
            return
    }

    public VolatileSizeArrayList(int r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r1.list = r0
            return
    }

    @Override // java.util.List
    public void add(int r2, T r3) {
            r1 = this;
            java.util.ArrayList<T> r0 = r1.list
            r0.add(r2, r3)
            java.util.ArrayList<T> r2 = r1.list
            int r2 = r2.size()
            r1.lazySet(r2)
            return
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T r2) {
            r1 = this;
            java.util.ArrayList<T> r0 = r1.list
            boolean r2 = r0.add(r2)
            java.util.ArrayList<T> r0 = r1.list
            int r0 = r0.size()
            r1.lazySet(r0)
            return r2
    }

    @Override // java.util.List
    public boolean addAll(int r2, java.util.Collection<? extends T> r3) {
            r1 = this;
            java.util.ArrayList<T> r0 = r1.list
            boolean r2 = r0.addAll(r2, r3)
            java.util.ArrayList<T> r3 = r1.list
            int r3 = r3.size()
            r1.lazySet(r3)
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(java.util.Collection<? extends T> r2) {
            r1 = this;
            java.util.ArrayList<T> r0 = r1.list
            boolean r2 = r0.addAll(r2)
            java.util.ArrayList<T> r0 = r1.list
            int r0 = r0.size()
            r1.lazySet(r0)
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
            r1 = this;
            java.util.ArrayList<T> r0 = r1.list
            r0.clear()
            r0 = 0
            r1.lazySet(r0)
            return
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(java.lang.Object r2) {
            r1 = this;
            java.util.ArrayList<T> r0 = r1.list
            boolean r2 = r0.contains(r2)
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(java.util.Collection<?> r2) {
            r1 = this;
            java.util.ArrayList<T> r0 = r1.list
            boolean r2 = r0.containsAll(r2)
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof io.reactivex.internal.util.VolatileSizeArrayList
            if (r0 == 0) goto Lf
            java.util.ArrayList<T> r0 = r1.list
            io.reactivex.internal.util.VolatileSizeArrayList r2 = (io.reactivex.internal.util.VolatileSizeArrayList) r2
            java.util.ArrayList<T> r2 = r2.list
            boolean r2 = r0.equals(r2)
            return r2
        Lf:
            java.util.ArrayList<T> r0 = r1.list
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // java.util.List
    public T get(int r2) {
            r1 = this;
            java.util.ArrayList<T> r0 = r1.list
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
            r1 = this;
            java.util.ArrayList<T> r0 = r1.list
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.util.List
    public int indexOf(java.lang.Object r2) {
            r1 = this;
            java.util.ArrayList<T> r0 = r1.list
            int r2 = r0.indexOf(r2)
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.get()
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public java.util.Iterator<T> iterator() {
            r1 = this;
            java.util.ArrayList<T> r0 = r1.list
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    @Override // java.util.List
    public int lastIndexOf(java.lang.Object r2) {
            r1 = this;
            java.util.ArrayList<T> r0 = r1.list
            int r2 = r0.lastIndexOf(r2)
            return r2
    }

    @Override // java.util.List
    public java.util.ListIterator<T> listIterator() {
            r1 = this;
            java.util.ArrayList<T> r0 = r1.list
            java.util.ListIterator r0 = r0.listIterator()
            return r0
    }

    @Override // java.util.List
    public java.util.ListIterator<T> listIterator(int r2) {
            r1 = this;
            java.util.ArrayList<T> r0 = r1.list
            java.util.ListIterator r2 = r0.listIterator(r2)
            return r2
    }

    @Override // java.util.List
    public T remove(int r2) {
            r1 = this;
            java.util.ArrayList<T> r0 = r1.list
            java.lang.Object r2 = r0.remove(r2)
            java.util.ArrayList<T> r0 = r1.list
            int r0 = r0.size()
            r1.lazySet(r0)
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(java.lang.Object r2) {
            r1 = this;
            java.util.ArrayList<T> r0 = r1.list
            boolean r2 = r0.remove(r2)
            java.util.ArrayList<T> r0 = r1.list
            int r0 = r0.size()
            r1.lazySet(r0)
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(java.util.Collection<?> r2) {
            r1 = this;
            java.util.ArrayList<T> r0 = r1.list
            boolean r2 = r0.removeAll(r2)
            java.util.ArrayList<T> r0 = r1.list
            int r0 = r0.size()
            r1.lazySet(r0)
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(java.util.Collection<?> r2) {
            r1 = this;
            java.util.ArrayList<T> r0 = r1.list
            boolean r2 = r0.retainAll(r2)
            java.util.ArrayList<T> r0 = r1.list
            int r0 = r0.size()
            r1.lazySet(r0)
            return r2
    }

    @Override // java.util.List
    public T set(int r2, T r3) {
            r1 = this;
            java.util.ArrayList<T> r0 = r1.list
            java.lang.Object r2 = r0.set(r2, r3)
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
            r1 = this;
            int r0 = r1.get()
            return r0
    }

    @Override // java.util.List
    public java.util.List<T> subList(int r2, int r3) {
            r1 = this;
            java.util.ArrayList<T> r0 = r1.list
            java.util.List r2 = r0.subList(r2, r3)
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public java.lang.Object[] toArray() {
            r1 = this;
            java.util.ArrayList<T> r0 = r1.list
            java.lang.Object[] r0 = r0.toArray()
            return r0
    }

    @Override // java.util.List, java.util.Collection
    public <E> E[] toArray(E[] r2) {
            r1 = this;
            java.util.ArrayList<T> r0 = r1.list
            java.lang.Object[] r2 = r0.toArray(r2)
            return r2
    }

    @Override // java.util.concurrent.atomic.AtomicInteger
    public java.lang.String toString() {
            r1 = this;
            java.util.ArrayList<T> r0 = r1.list
            java.lang.String r0 = r0.toString()
            return r0
    }
}
