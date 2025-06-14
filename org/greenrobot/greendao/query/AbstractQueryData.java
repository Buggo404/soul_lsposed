package org.greenrobot.greendao.query;

import org.greenrobot.greendao.query.AbstractQuery;

/* loaded from: classes.dex */
abstract class AbstractQueryData<T, Q extends org.greenrobot.greendao.query.AbstractQuery<T>> {
    final org.greenrobot.greendao.AbstractDao<T, ?> dao;
    final java.lang.String[] initialValues;
    final java.util.Map<java.lang.Long, java.lang.ref.WeakReference<Q>> queriesForThreads;
    final java.lang.String sql;

    AbstractQueryData(org.greenrobot.greendao.AbstractDao<T, ?> r1, java.lang.String r2, java.lang.String[] r3) {
            r0 = this;
            r0.<init>()
            r0.dao = r1
            r0.sql = r2
            r0.initialValues = r3
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.queriesForThreads = r1
            return
    }

    protected abstract Q createQuery();

    Q forCurrentThread() {
            r6 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            long r0 = r0.getId()
            java.util.Map<java.lang.Long, java.lang.ref.WeakReference<Q extends org.greenrobot.greendao.query.AbstractQuery<T>>> r2 = r6.queriesForThreads
            monitor-enter(r2)
            java.util.Map<java.lang.Long, java.lang.ref.WeakReference<Q extends org.greenrobot.greendao.query.AbstractQuery<T>>> r3 = r6.queriesForThreads     // Catch: java.lang.Throwable -> L46
            java.lang.Long r4 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L46
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L46
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3     // Catch: java.lang.Throwable -> L46
            if (r3 == 0) goto L20
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L46
            org.greenrobot.greendao.query.AbstractQuery r3 = (org.greenrobot.greendao.query.AbstractQuery) r3     // Catch: java.lang.Throwable -> L46
            goto L21
        L20:
            r3 = 0
        L21:
            if (r3 != 0) goto L39
            r6.m118gc()     // Catch: java.lang.Throwable -> L46
            org.greenrobot.greendao.query.AbstractQuery r3 = r6.createQuery()     // Catch: java.lang.Throwable -> L46
            java.util.Map<java.lang.Long, java.lang.ref.WeakReference<Q extends org.greenrobot.greendao.query.AbstractQuery<T>>> r4 = r6.queriesForThreads     // Catch: java.lang.Throwable -> L46
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L46
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L46
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L46
            r4.put(r0, r1)     // Catch: java.lang.Throwable -> L46
            goto L44
        L39:
            java.lang.String[] r0 = r6.initialValues     // Catch: java.lang.Throwable -> L46
            java.lang.String[] r1 = r3.parameters     // Catch: java.lang.Throwable -> L46
            java.lang.String[] r4 = r6.initialValues     // Catch: java.lang.Throwable -> L46
            int r4 = r4.length     // Catch: java.lang.Throwable -> L46
            r5 = 0
            java.lang.System.arraycopy(r0, r5, r1, r5, r4)     // Catch: java.lang.Throwable -> L46
        L44:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L46
            return r3
        L46:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L46
            throw r0
    }

    Q forCurrentThread(Q r5) {
            r4 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.Thread r1 = r5.ownerThread
            if (r0 != r1) goto L14
            java.lang.String[] r0 = r4.initialValues
            java.lang.String[] r1 = r5.parameters
            java.lang.String[] r2 = r4.initialValues
            int r2 = r2.length
            r3 = 0
            java.lang.System.arraycopy(r0, r3, r1, r3, r2)
            return r5
        L14:
            org.greenrobot.greendao.query.AbstractQuery r5 = r4.forCurrentThread()
            return r5
    }

    /* renamed from: gc */
    void m118gc() {
            r3 = this;
            java.util.Map<java.lang.Long, java.lang.ref.WeakReference<Q extends org.greenrobot.greendao.query.AbstractQuery<T>>> r0 = r3.queriesForThreads
            monitor-enter(r0)
            java.util.Map<java.lang.Long, java.lang.ref.WeakReference<Q extends org.greenrobot.greendao.query.AbstractQuery<T>>> r1 = r3.queriesForThreads     // Catch: java.lang.Throwable -> L2b
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L2b
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L2b
        Ld:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L29
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L2b
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L2b
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L2b
            if (r2 != 0) goto Ld
            r1.remove()     // Catch: java.lang.Throwable -> L2b
            goto Ld
        L29:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            return
        L2b:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            throw r1
    }
}
