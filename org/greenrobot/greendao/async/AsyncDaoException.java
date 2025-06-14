package org.greenrobot.greendao.async;

/* loaded from: classes.dex */
public class AsyncDaoException extends org.greenrobot.greendao.DaoException {
    private static final long serialVersionUID = 5872157552005102382L;
    private final org.greenrobot.greendao.async.AsyncOperation failedOperation;

    public AsyncDaoException(org.greenrobot.greendao.async.AsyncOperation r1, java.lang.Throwable r2) {
            r0 = this;
            r0.<init>(r2)
            r0.failedOperation = r1
            return
    }

    public org.greenrobot.greendao.async.AsyncOperation getFailedOperation() {
            r1 = this;
            org.greenrobot.greendao.async.AsyncOperation r0 = r1.failedOperation
            return r0
    }
}
