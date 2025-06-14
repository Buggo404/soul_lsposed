package org.greenrobot.greendao.identityscope;

/* loaded from: classes.dex */
public interface IdentityScope<K, T> {
    void clear();

    boolean detach(K r1, T r2);

    T get(K r1);

    T getNoLock(K r1);

    void lock();

    void put(K r1, T r2);

    void putNoLock(K r1, T r2);

    void remove(java.lang.Iterable<K> r1);

    void remove(K r1);

    void reserveRoom(int r1);

    void unlock();
}
