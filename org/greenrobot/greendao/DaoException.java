package org.greenrobot.greendao;

/* loaded from: classes.dex */
public class DaoException extends android.database.SQLException {
    private static final long serialVersionUID = -5877937327907457779L;

    public DaoException() {
            r0 = this;
            r0.<init>()
            return
    }

    public DaoException(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public DaoException(java.lang.String r1, java.lang.Throwable r2) {
            r0 = this;
            r0.<init>(r1)
            r0.safeInitCause(r2)
            return
    }

    public DaoException(java.lang.Throwable r1) {
            r0 = this;
            r0.<init>()
            r0.safeInitCause(r1)
            return
    }

    protected void safeInitCause(java.lang.Throwable r3) {
            r2 = this;
            r2.initCause(r3)     // Catch: java.lang.Throwable -> L4
            goto Lf
        L4:
            r0 = move-exception
            java.lang.String r1 = "Could not set initial cause"
            org.greenrobot.greendao.DaoLog.m103e(r1, r0)
            java.lang.String r0 = "Initial cause is:"
            org.greenrobot.greendao.DaoLog.m103e(r0, r3)
        Lf:
            return
    }
}
