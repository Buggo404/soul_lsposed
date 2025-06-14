package org.greenrobot.greendao;

/* loaded from: classes.dex */
public final class InternalQueryDaoAccess<T> {
    private final org.greenrobot.greendao.AbstractDao<T, ?> dao;

    public InternalQueryDaoAccess(org.greenrobot.greendao.AbstractDao<T, ?> r1) {
            r0 = this;
            r0.<init>()
            r0.dao = r1
            return
    }

    public static <T2> org.greenrobot.greendao.internal.TableStatements getStatements(org.greenrobot.greendao.AbstractDao<T2, ?> r0) {
            org.greenrobot.greendao.internal.TableStatements r0 = r0.getStatements()
            return r0
    }

    public org.greenrobot.greendao.internal.TableStatements getStatements() {
            r1 = this;
            org.greenrobot.greendao.AbstractDao<T, ?> r0 = r1.dao
            org.greenrobot.greendao.internal.TableStatements r0 = r0.getStatements()
            return r0
    }

    public java.util.List<T> loadAllAndCloseCursor(android.database.Cursor r2) {
            r1 = this;
            org.greenrobot.greendao.AbstractDao<T, ?> r0 = r1.dao
            java.util.List r2 = r0.loadAllAndCloseCursor(r2)
            return r2
    }

    public T loadCurrent(android.database.Cursor r2, int r3, boolean r4) {
            r1 = this;
            org.greenrobot.greendao.AbstractDao<T, ?> r0 = r1.dao
            java.lang.Object r2 = r0.loadCurrent(r2, r3, r4)
            return r2
    }

    public T loadUniqueAndCloseCursor(android.database.Cursor r2) {
            r1 = this;
            org.greenrobot.greendao.AbstractDao<T, ?> r0 = r1.dao
            java.lang.Object r2 = r0.loadUniqueAndCloseCursor(r2)
            return r2
    }
}
