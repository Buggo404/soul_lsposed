package org.greenrobot.greendao.identityscope;

/* loaded from: classes.dex */
public class IdentityScopeLong<T> implements org.greenrobot.greendao.identityscope.IdentityScope<java.lang.Long, T> {
    private final java.util.concurrent.locks.ReentrantLock lock;
    private final org.greenrobot.greendao.internal.LongHashMap<java.lang.ref.Reference<T>> map;

    public IdentityScopeLong() {
            r1 = this;
            r1.<init>()
            org.greenrobot.greendao.internal.LongHashMap r0 = new org.greenrobot.greendao.internal.LongHashMap
            r0.<init>()
            r1.map = r0
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            r1.lock = r0
            return
    }

    @Override // org.greenrobot.greendao.identityscope.IdentityScope
    public void clear() {
            r2 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r2.lock
            r0.lock()
            org.greenrobot.greendao.internal.LongHashMap<java.lang.ref.Reference<T>> r0 = r2.map     // Catch: java.lang.Throwable -> L10
            r0.clear()     // Catch: java.lang.Throwable -> L10
            java.util.concurrent.locks.ReentrantLock r0 = r2.lock
            r0.unlock()
            return
        L10:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantLock r1 = r2.lock
            r1.unlock()
            throw r0
    }

    /* renamed from: detach, reason: avoid collision after fix types in other method */
    public boolean detach2(java.lang.Long r2, T r3) {
            r1 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r1.lock
            r0.lock()
            java.lang.Object r0 = r1.get3(r2)     // Catch: java.lang.Throwable -> L1e
            if (r0 != r3) goto L17
            if (r3 == 0) goto L17
            r1.remove2(r2)     // Catch: java.lang.Throwable -> L1e
            java.util.concurrent.locks.ReentrantLock r2 = r1.lock
            r2.unlock()
            r2 = 1
            return r2
        L17:
            java.util.concurrent.locks.ReentrantLock r2 = r1.lock
            r2.unlock()
            r2 = 0
            return r2
        L1e:
            r2 = move-exception
            java.util.concurrent.locks.ReentrantLock r3 = r1.lock
            r3.unlock()
            throw r2
    }

    @Override // org.greenrobot.greendao.identityscope.IdentityScope
    public /* bridge */ /* synthetic */ boolean detach(java.lang.Long r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Long r1 = (java.lang.Long) r1
            boolean r1 = r0.detach2(r1, r2)
            return r1
    }

    /* renamed from: get, reason: avoid collision after fix types in other method */
    public T get3(java.lang.Long r3) {
            r2 = this;
            long r0 = r3.longValue()
            java.lang.Object r3 = r2.get2(r0)
            return r3
    }

    @Override // org.greenrobot.greendao.identityscope.IdentityScope
    public /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Long r1) {
            r0 = this;
            java.lang.Long r1 = (java.lang.Long) r1
            java.lang.Object r1 = r0.get3(r1)
            return r1
    }

    public T get2(long r2) {
            r1 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r1.lock
            r0.lock()
            org.greenrobot.greendao.internal.LongHashMap<java.lang.ref.Reference<T>> r0 = r1.map     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L1b
            java.lang.ref.Reference r2 = (java.lang.ref.Reference) r2     // Catch: java.lang.Throwable -> L1b
            java.util.concurrent.locks.ReentrantLock r3 = r1.lock
            r3.unlock()
            if (r2 == 0) goto L19
            java.lang.Object r2 = r2.get()
            return r2
        L19:
            r2 = 0
            return r2
        L1b:
            r2 = move-exception
            java.util.concurrent.locks.ReentrantLock r3 = r1.lock
            r3.unlock()
            throw r2
    }

    public T get2NoLock(long r2) {
            r1 = this;
            org.greenrobot.greendao.internal.LongHashMap<java.lang.ref.Reference<T>> r0 = r1.map
            java.lang.Object r2 = r0.get(r2)
            java.lang.ref.Reference r2 = (java.lang.ref.Reference) r2
            if (r2 == 0) goto Lf
            java.lang.Object r2 = r2.get()
            return r2
        Lf:
            r2 = 0
            return r2
    }

    /* renamed from: getNoLock, reason: avoid collision after fix types in other method */
    public T getNoLock2(java.lang.Long r3) {
            r2 = this;
            long r0 = r3.longValue()
            java.lang.Object r3 = r2.get2NoLock(r0)
            return r3
    }

    @Override // org.greenrobot.greendao.identityscope.IdentityScope
    public /* bridge */ /* synthetic */ java.lang.Object getNoLock(java.lang.Long r1) {
            r0 = this;
            java.lang.Long r1 = (java.lang.Long) r1
            java.lang.Object r1 = r0.getNoLock2(r1)
            return r1
    }

    @Override // org.greenrobot.greendao.identityscope.IdentityScope
    public void lock() {
            r1 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r1.lock
            r0.lock()
            return
    }

    /* renamed from: put, reason: avoid collision after fix types in other method */
    public void put3(java.lang.Long r3, T r4) {
            r2 = this;
            long r0 = r3.longValue()
            r2.put2(r0, r4)
            return
    }

    @Override // org.greenrobot.greendao.identityscope.IdentityScope
    public /* bridge */ /* synthetic */ void put(java.lang.Long r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Long r1 = (java.lang.Long) r1
            r0.put3(r1, r2)
            return
    }

    public void put2(long r3, T r5) {
            r2 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r2.lock
            r0.lock()
            org.greenrobot.greendao.internal.LongHashMap<java.lang.ref.Reference<T>> r0 = r2.map     // Catch: java.lang.Throwable -> L15
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L15
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L15
            r0.put(r3, r1)     // Catch: java.lang.Throwable -> L15
            java.util.concurrent.locks.ReentrantLock r3 = r2.lock
            r3.unlock()
            return
        L15:
            r3 = move-exception
            java.util.concurrent.locks.ReentrantLock r4 = r2.lock
            r4.unlock()
            throw r3
    }

    public void put2NoLock(long r3, T r5) {
            r2 = this;
            org.greenrobot.greendao.internal.LongHashMap<java.lang.ref.Reference<T>> r0 = r2.map
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r5)
            r0.put(r3, r1)
            return
    }

    /* renamed from: putNoLock, reason: avoid collision after fix types in other method */
    public void putNoLock2(java.lang.Long r3, T r4) {
            r2 = this;
            long r0 = r3.longValue()
            r2.put2NoLock(r0, r4)
            return
    }

    @Override // org.greenrobot.greendao.identityscope.IdentityScope
    public /* bridge */ /* synthetic */ void putNoLock(java.lang.Long r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Long r1 = (java.lang.Long) r1
            r0.putNoLock2(r1, r2)
            return
    }

    @Override // org.greenrobot.greendao.identityscope.IdentityScope
    public void remove(java.lang.Iterable<java.lang.Long> r5) {
            r4 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r4.lock
            r0.lock()
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L25
        L9:
            boolean r0 = r5.hasNext()     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L1f
            java.lang.Object r0 = r5.next()     // Catch: java.lang.Throwable -> L25
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L25
            org.greenrobot.greendao.internal.LongHashMap<java.lang.ref.Reference<T>> r1 = r4.map     // Catch: java.lang.Throwable -> L25
            long r2 = r0.longValue()     // Catch: java.lang.Throwable -> L25
            r1.remove(r2)     // Catch: java.lang.Throwable -> L25
            goto L9
        L1f:
            java.util.concurrent.locks.ReentrantLock r5 = r4.lock
            r5.unlock()
            return
        L25:
            r5 = move-exception
            java.util.concurrent.locks.ReentrantLock r0 = r4.lock
            r0.unlock()
            throw r5
    }

    /* renamed from: remove, reason: avoid collision after fix types in other method */
    public void remove2(java.lang.Long r4) {
            r3 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r3.lock
            r0.lock()
            org.greenrobot.greendao.internal.LongHashMap<java.lang.ref.Reference<T>> r0 = r3.map     // Catch: java.lang.Throwable -> L14
            long r1 = r4.longValue()     // Catch: java.lang.Throwable -> L14
            r0.remove(r1)     // Catch: java.lang.Throwable -> L14
            java.util.concurrent.locks.ReentrantLock r4 = r3.lock
            r4.unlock()
            return
        L14:
            r4 = move-exception
            java.util.concurrent.locks.ReentrantLock r0 = r3.lock
            r0.unlock()
            throw r4
    }

    @Override // org.greenrobot.greendao.identityscope.IdentityScope
    public /* bridge */ /* synthetic */ void remove(java.lang.Long r1) {
            r0 = this;
            java.lang.Long r1 = (java.lang.Long) r1
            r0.remove2(r1)
            return
    }

    @Override // org.greenrobot.greendao.identityscope.IdentityScope
    public void reserveRoom(int r2) {
            r1 = this;
            org.greenrobot.greendao.internal.LongHashMap<java.lang.ref.Reference<T>> r0 = r1.map
            r0.reserveRoom(r2)
            return
    }

    @Override // org.greenrobot.greendao.identityscope.IdentityScope
    public void unlock() {
            r1 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r1.lock
            r0.unlock()
            return
    }
}
