package org.greenrobot.greendao.query;

/* loaded from: classes.dex */
public class LazyList<E> implements java.util.List<E>, java.io.Closeable {
    private final android.database.Cursor cursor;
    private final org.greenrobot.greendao.InternalQueryDaoAccess<E> daoAccess;
    private final java.util.List<E> entities;
    private volatile int loadedCount;
    private final java.util.concurrent.locks.ReentrantLock lock;
    private final int size;

    protected class LazyIterator implements org.greenrobot.greendao.query.CloseableListIterator<E> {
        private final boolean closeWhenDone;
        private int index;
        final /* synthetic */ org.greenrobot.greendao.query.LazyList this$0;

        public LazyIterator(org.greenrobot.greendao.query.LazyList r1, int r2, boolean r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.index = r2
                r0.closeWhenDone = r3
                return
        }

        @Override // java.util.ListIterator
        public void add(E r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r1 = this;
                org.greenrobot.greendao.query.LazyList r0 = r1.this$0
                r0.close()
                return
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.index
                org.greenrobot.greendao.query.LazyList r1 = r2.this$0
                int r1 = org.greenrobot.greendao.query.LazyList.access$000(r1)
                if (r0 >= r1) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
                r1 = this;
                int r0 = r1.index
                if (r0 <= 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
                r3 = this;
                int r0 = r3.index
                org.greenrobot.greendao.query.LazyList r1 = r3.this$0
                int r1 = org.greenrobot.greendao.query.LazyList.access$000(r1)
                if (r0 >= r1) goto L28
                org.greenrobot.greendao.query.LazyList r0 = r3.this$0
                int r1 = r3.index
                java.lang.Object r0 = r0.get(r1)
                int r1 = r3.index
                int r1 = r1 + 1
                r3.index = r1
                org.greenrobot.greendao.query.LazyList r2 = r3.this$0
                int r2 = org.greenrobot.greendao.query.LazyList.access$000(r2)
                if (r1 != r2) goto L27
                boolean r1 = r3.closeWhenDone
                if (r1 == 0) goto L27
                r3.close()
            L27:
                return r0
            L28:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
                r1 = this;
                int r0 = r1.index
                return r0
        }

        @Override // java.util.ListIterator
        public E previous() {
                r2 = this;
                int r0 = r2.index
                if (r0 <= 0) goto Lf
                int r0 = r0 + (-1)
                r2.index = r0
                org.greenrobot.greendao.query.LazyList r1 = r2.this$0
                java.lang.Object r0 = r1.get(r0)
                return r0
            Lf:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
                r1 = this;
                int r0 = r1.index
                int r0 = r0 + (-1)
                return r0
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // java.util.ListIterator
        public void set(E r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }
    }

    LazyList(org.greenrobot.greendao.InternalQueryDaoAccess<E> r2, android.database.Cursor r3, boolean r4) {
            r1 = this;
            r1.<init>()
            r1.cursor = r3
            r1.daoAccess = r2
            int r2 = r3.getCount()
            r1.size = r2
            r0 = 0
            if (r4 == 0) goto L24
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r2)
            r1.entities = r4
            r2 = 0
        L18:
            int r4 = r1.size
            if (r2 >= r4) goto L26
            java.util.List<E> r4 = r1.entities
            r4.add(r0)
            int r2 = r2 + 1
            goto L18
        L24:
            r1.entities = r0
        L26:
            int r2 = r1.size
            if (r2 != 0) goto L2d
            r3.close()
        L2d:
            java.util.concurrent.locks.ReentrantLock r2 = new java.util.concurrent.locks.ReentrantLock
            r2.<init>()
            r1.lock = r2
            return
    }

    static /* synthetic */ int access$000(org.greenrobot.greendao.query.LazyList r0) {
            int r0 = r0.size
            return r0
    }

    @Override // java.util.List
    public void add(int r1, E r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(E r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.List
    public boolean addAll(int r1, java.util.Collection<? extends E> r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(java.util.Collection<? extends E> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    protected void checkCached() {
            r2 = this;
            java.util.List<E> r0 = r2.entities
            if (r0 == 0) goto L5
            return
        L5:
            org.greenrobot.greendao.DaoException r0 = new org.greenrobot.greendao.DaoException
            java.lang.String r1 = "This operation only works with cached lazy lists"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            android.database.Cursor r0 = r1.cursor
            r0.close()
            return
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(java.lang.Object r2) {
            r1 = this;
            r1.loadRemaining()
            java.util.List<E> r0 = r1.entities
            boolean r2 = r0.contains(r2)
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(java.util.Collection<?> r2) {
            r1 = this;
            r1.loadRemaining()
            java.util.List<E> r0 = r1.entities
            boolean r2 = r0.containsAll(r2)
            return r2
    }

    @Override // java.util.List
    public E get(int r3) {
            r2 = this;
            java.util.List<E> r0 = r2.entities
            if (r0 == 0) goto L3f
            java.lang.Object r0 = r0.get(r3)
            if (r0 != 0) goto L3e
            java.util.concurrent.locks.ReentrantLock r0 = r2.lock
            r0.lock()
            java.util.List<E> r0 = r2.entities     // Catch: java.lang.Throwable -> L37
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L37
            if (r0 != 0) goto L31
            java.lang.Object r0 = r2.loadEntity(r3)     // Catch: java.lang.Throwable -> L37
            java.util.List<E> r1 = r2.entities     // Catch: java.lang.Throwable -> L37
            r1.set(r3, r0)     // Catch: java.lang.Throwable -> L37
            int r3 = r2.loadedCount     // Catch: java.lang.Throwable -> L37
            int r3 = r3 + 1
            r2.loadedCount = r3     // Catch: java.lang.Throwable -> L37
            int r3 = r2.loadedCount     // Catch: java.lang.Throwable -> L37
            int r1 = r2.size     // Catch: java.lang.Throwable -> L37
            if (r3 != r1) goto L31
            android.database.Cursor r3 = r2.cursor     // Catch: java.lang.Throwable -> L37
            r3.close()     // Catch: java.lang.Throwable -> L37
        L31:
            java.util.concurrent.locks.ReentrantLock r3 = r2.lock
            r3.unlock()
            goto L3e
        L37:
            r3 = move-exception
            java.util.concurrent.locks.ReentrantLock r0 = r2.lock
            r0.unlock()
            throw r3
        L3e:
            return r0
        L3f:
            java.util.concurrent.locks.ReentrantLock r0 = r2.lock
            r0.lock()
            java.lang.Object r3 = r2.loadEntity(r3)     // Catch: java.lang.Throwable -> L4e
            java.util.concurrent.locks.ReentrantLock r0 = r2.lock
            r0.unlock()
            return r3
        L4e:
            r3 = move-exception
            java.util.concurrent.locks.ReentrantLock r0 = r2.lock
            r0.unlock()
            throw r3
    }

    public int getLoadedCount() {
            r1 = this;
            int r0 = r1.loadedCount
            return r0
    }

    @Override // java.util.List
    public int indexOf(java.lang.Object r2) {
            r1 = this;
            r1.loadRemaining()
            java.util.List<E> r0 = r1.entities
            int r2 = r0.indexOf(r2)
            return r2
    }

    public boolean isClosed() {
            r1 = this;
            android.database.Cursor r0 = r1.cursor
            boolean r0 = r0.isClosed()
            return r0
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.size
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public boolean isLoadedCompletely() {
            r2 = this;
            int r0 = r2.loadedCount
            int r1 = r2.size
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public java.util.Iterator<E> iterator() {
            r2 = this;
            org.greenrobot.greendao.query.LazyList$LazyIterator r0 = new org.greenrobot.greendao.query.LazyList$LazyIterator
            r1 = 0
            r0.<init>(r2, r1, r1)
            return r0
    }

    @Override // java.util.List
    public int lastIndexOf(java.lang.Object r2) {
            r1 = this;
            r1.loadRemaining()
            java.util.List<E> r0 = r1.entities
            int r2 = r0.lastIndexOf(r2)
            return r2
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ java.util.ListIterator listIterator() {
            r1 = this;
            org.greenrobot.greendao.query.CloseableListIterator r0 = r1.listIterator()
            return r0
    }

    @Override // java.util.List
    public java.util.ListIterator<E> listIterator(int r3) {
            r2 = this;
            org.greenrobot.greendao.query.LazyList$LazyIterator r0 = new org.greenrobot.greendao.query.LazyList$LazyIterator
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    @Override // java.util.List
    public org.greenrobot.greendao.query.CloseableListIterator<E> listIterator() {
            r2 = this;
            org.greenrobot.greendao.query.LazyList$LazyIterator r0 = new org.greenrobot.greendao.query.LazyList$LazyIterator
            r1 = 0
            r0.<init>(r2, r1, r1)
            return r0
    }

    public org.greenrobot.greendao.query.CloseableListIterator<E> listIteratorAutoClose() {
            r3 = this;
            org.greenrobot.greendao.query.LazyList$LazyIterator r0 = new org.greenrobot.greendao.query.LazyList$LazyIterator
            r1 = 0
            r2 = 1
            r0.<init>(r3, r1, r2)
            return r0
    }

    protected E loadEntity(int r5) {
            r4 = this;
            android.database.Cursor r0 = r4.cursor
            boolean r0 = r0.moveToPosition(r5)
            if (r0 == 0) goto L2a
            org.greenrobot.greendao.InternalQueryDaoAccess<E> r0 = r4.daoAccess
            android.database.Cursor r1 = r4.cursor
            r2 = 0
            r3 = 1
            java.lang.Object r0 = r0.loadCurrent(r1, r2, r3)
            if (r0 == 0) goto L15
            return r0
        L15:
            org.greenrobot.greendao.DaoException r0 = new org.greenrobot.greendao.DaoException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Loading of entity failed (null) at position "
            r1.<init>(r2)
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
        L2a:
            org.greenrobot.greendao.DaoException r0 = new org.greenrobot.greendao.DaoException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Could not move to cursor location "
            r1.<init>(r2)
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
    }

    public void loadRemaining() {
            r2 = this;
            r2.checkCached()
            java.util.List<E> r0 = r2.entities
            int r0 = r0.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L12
            r2.get(r1)
            int r1 = r1 + 1
            goto La
        L12:
            return
    }

    public E peek(int r2) {
            r1 = this;
            java.util.List<E> r0 = r1.entities
            if (r0 == 0) goto L9
            java.lang.Object r2 = r0.get(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    @Override // java.util.List
    public E remove(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(java.util.Collection<?> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(java.util.Collection<?> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.List
    public E set(int r1, E r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
            r1 = this;
            int r0 = r1.size
            return r0
    }

    @Override // java.util.List
    public java.util.List<E> subList(int r2, int r3) {
            r1 = this;
            r1.checkCached()
            r0 = r2
        L4:
            if (r0 >= r3) goto Lc
            r1.get(r0)
            int r0 = r0 + 1
            goto L4
        Lc:
            java.util.List<E> r0 = r1.entities
            java.util.List r2 = r0.subList(r2, r3)
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public java.lang.Object[] toArray() {
            r1 = this;
            r1.loadRemaining()
            java.util.List<E> r0 = r1.entities
            java.lang.Object[] r0 = r0.toArray()
            return r0
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] r2) {
            r1 = this;
            r1.loadRemaining()
            java.util.List<E> r0 = r1.entities
            java.lang.Object[] r2 = r0.toArray(r2)
            return r2
    }
}
