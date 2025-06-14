package org.greenrobot.greendao.identityscope;

/* loaded from: classes.dex */
public class IdentityScopeObject<K, T> implements org.greenrobot.greendao.identityscope.IdentityScope<K, T> {
    private final java.util.concurrent.locks.ReentrantLock lock;
    private final java.util.HashMap<K, java.lang.ref.Reference<T>> map;

    public IdentityScopeObject() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
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
            java.util.HashMap<K, java.lang.ref.Reference<T>> r0 = r2.map     // Catch: java.lang.Throwable -> L10
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

    @Override // org.greenrobot.greendao.identityscope.IdentityScope
    public boolean detach(K r2, T r3) {
            r1 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r1.lock
            r0.lock()
            java.lang.Object r0 = r1.get(r2)     // Catch: java.lang.Throwable -> L1e
            if (r0 != r3) goto L17
            if (r3 == 0) goto L17
            r1.remove(r2)     // Catch: java.lang.Throwable -> L1e
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
    public T get(K r2) {
            r1 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r1.lock
            r0.lock()
            java.util.HashMap<K, java.lang.ref.Reference<T>> r0 = r1.map     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L1b
            java.lang.ref.Reference r2 = (java.lang.ref.Reference) r2     // Catch: java.lang.Throwable -> L1b
            java.util.concurrent.locks.ReentrantLock r0 = r1.lock
            r0.unlock()
            if (r2 == 0) goto L19
            java.lang.Object r2 = r2.get()
            return r2
        L19:
            r2 = 0
            return r2
        L1b:
            r2 = move-exception
            java.util.concurrent.locks.ReentrantLock r0 = r1.lock
            r0.unlock()
            throw r2
    }

    @Override // org.greenrobot.greendao.identityscope.IdentityScope
    public T getNoLock(K r2) {
            r1 = this;
            java.util.HashMap<K, java.lang.ref.Reference<T>> r0 = r1.map
            java.lang.Object r2 = r0.get(r2)
            java.lang.ref.Reference r2 = (java.lang.ref.Reference) r2
            if (r2 == 0) goto Lf
            java.lang.Object r2 = r2.get()
            return r2
        Lf:
            r2 = 0
            return r2
    }

    @Override // org.greenrobot.greendao.identityscope.IdentityScope
    public void lock() {
            r1 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r1.lock
            r0.lock()
            return
    }

    @Override // org.greenrobot.greendao.identityscope.IdentityScope
    public void put(K r3, T r4) {
            r2 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r2.lock
            r0.lock()
            java.util.HashMap<K, java.lang.ref.Reference<T>> r0 = r2.map     // Catch: java.lang.Throwable -> L15
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L15
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L15
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

    @Override // org.greenrobot.greendao.identityscope.IdentityScope
    public void putNoLock(K r3, T r4) {
            r2 = this;
            java.util.HashMap<K, java.lang.ref.Reference<T>> r0 = r2.map
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r4)
            r0.put(r3, r1)
            return
    }

    @Override // org.greenrobot.greendao.identityscope.IdentityScope
    public void remove(java.lang.Iterable<K> r3) {
            r2 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r2.lock
            r0.lock()
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L1f
        L9:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L19
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L1f
            java.util.HashMap<K, java.lang.ref.Reference<T>> r1 = r2.map     // Catch: java.lang.Throwable -> L1f
            r1.remove(r0)     // Catch: java.lang.Throwable -> L1f
            goto L9
        L19:
            java.util.concurrent.locks.ReentrantLock r3 = r2.lock
            r3.unlock()
            return
        L1f:
            r3 = move-exception
            java.util.concurrent.locks.ReentrantLock r0 = r2.lock
            r0.unlock()
            throw r3
    }

    @Override // org.greenrobot.greendao.identityscope.IdentityScope
    public void remove(K r2) {
            r1 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r1.lock
            r0.lock()
            java.util.HashMap<K, java.lang.ref.Reference<T>> r0 = r1.map     // Catch: java.lang.Throwable -> L10
            r0.remove(r2)     // Catch: java.lang.Throwable -> L10
            java.util.concurrent.locks.ReentrantLock r2 = r1.lock
            r2.unlock()
            return
        L10:
            r2 = move-exception
            java.util.concurrent.locks.ReentrantLock r0 = r1.lock
            r0.unlock()
            throw r2
    }

    @Override // org.greenrobot.greendao.identityscope.IdentityScope
    public void reserveRoom(int r1) {
            r0 = this;
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
