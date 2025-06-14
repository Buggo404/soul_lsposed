package org.greenrobot.greendao.async;

/* loaded from: classes.dex */
public class AsyncSession {
    private final org.greenrobot.greendao.AbstractDaoSession daoSession;
    private final org.greenrobot.greendao.async.AsyncOperationExecutor executor;
    private int sessionFlags;

    public AsyncSession(org.greenrobot.greendao.AbstractDaoSession r1) {
            r0 = this;
            r0.<init>()
            r0.daoSession = r1
            org.greenrobot.greendao.async.AsyncOperationExecutor r1 = new org.greenrobot.greendao.async.AsyncOperationExecutor
            r1.<init>()
            r0.executor = r1
            return
    }

    private <E> org.greenrobot.greendao.async.AsyncOperation enqueEntityOperation(org.greenrobot.greendao.async.AsyncOperation.OperationType r8, java.lang.Class<E> r9, java.lang.Object r10, int r11) {
            r7 = this;
            org.greenrobot.greendao.AbstractDaoSession r0 = r7.daoSession
            org.greenrobot.greendao.AbstractDao r3 = r0.getDao(r9)
            org.greenrobot.greendao.async.AsyncOperation r9 = new org.greenrobot.greendao.async.AsyncOperation
            r4 = 0
            int r0 = r7.sessionFlags
            r6 = r11 | r0
            r1 = r9
            r2 = r8
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            org.greenrobot.greendao.async.AsyncOperationExecutor r8 = r7.executor
            r8.enqueue(r9)
            return r9
    }

    private org.greenrobot.greendao.async.AsyncOperation enqueueDatabaseOperation(org.greenrobot.greendao.async.AsyncOperation.OperationType r8, java.lang.Object r9, int r10) {
            r7 = this;
            org.greenrobot.greendao.AbstractDaoSession r0 = r7.daoSession
            org.greenrobot.greendao.database.Database r4 = r0.getDatabase()
            org.greenrobot.greendao.async.AsyncOperation r0 = new org.greenrobot.greendao.async.AsyncOperation
            r3 = 0
            int r1 = r7.sessionFlags
            r6 = r10 | r1
            r1 = r0
            r2 = r8
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            org.greenrobot.greendao.async.AsyncOperationExecutor r8 = r7.executor
            r8.enqueue(r0)
            return r0
    }

    private org.greenrobot.greendao.async.AsyncOperation enqueueEntityOperation(org.greenrobot.greendao.async.AsyncOperation.OperationType r2, java.lang.Object r3, int r4) {
            r1 = this;
            java.lang.Class r0 = r3.getClass()
            org.greenrobot.greendao.async.AsyncOperation r2 = r1.enqueEntityOperation(r2, r0, r3, r4)
            return r2
    }

    public org.greenrobot.greendao.async.AsyncOperation callInTx(java.util.concurrent.Callable<?> r2) {
            r1 = this;
            r0 = 0
            org.greenrobot.greendao.async.AsyncOperation r2 = r1.callInTx(r2, r0)
            return r2
    }

    public org.greenrobot.greendao.async.AsyncOperation callInTx(java.util.concurrent.Callable<?> r2, int r3) {
            r1 = this;
            org.greenrobot.greendao.async.AsyncOperation$OperationType r0 = org.greenrobot.greendao.async.AsyncOperation.OperationType.TransactionCallable
            org.greenrobot.greendao.async.AsyncOperation r2 = r1.enqueueDatabaseOperation(r0, r2, r3)
            return r2
    }

    public org.greenrobot.greendao.async.AsyncOperation count(java.lang.Class<?> r2) {
            r1 = this;
            r0 = 0
            org.greenrobot.greendao.async.AsyncOperation r2 = r1.count(r2, r0)
            return r2
    }

    public org.greenrobot.greendao.async.AsyncOperation count(java.lang.Class<?> r3, int r4) {
            r2 = this;
            org.greenrobot.greendao.async.AsyncOperation$OperationType r0 = org.greenrobot.greendao.async.AsyncOperation.OperationType.Count
            r1 = 0
            org.greenrobot.greendao.async.AsyncOperation r3 = r2.enqueEntityOperation(r0, r3, r1, r4)
            return r3
    }

    public org.greenrobot.greendao.async.AsyncOperation delete(java.lang.Object r2) {
            r1 = this;
            r0 = 0
            org.greenrobot.greendao.async.AsyncOperation r2 = r1.delete(r2, r0)
            return r2
    }

    public org.greenrobot.greendao.async.AsyncOperation delete(java.lang.Object r2, int r3) {
            r1 = this;
            org.greenrobot.greendao.async.AsyncOperation$OperationType r0 = org.greenrobot.greendao.async.AsyncOperation.OperationType.Delete
            org.greenrobot.greendao.async.AsyncOperation r2 = r1.enqueueEntityOperation(r0, r2, r3)
            return r2
    }

    public <E> org.greenrobot.greendao.async.AsyncOperation deleteAll(java.lang.Class<E> r2) {
            r1 = this;
            r0 = 0
            org.greenrobot.greendao.async.AsyncOperation r2 = r1.deleteAll(r2, r0)
            return r2
    }

    public <E> org.greenrobot.greendao.async.AsyncOperation deleteAll(java.lang.Class<E> r3, int r4) {
            r2 = this;
            org.greenrobot.greendao.async.AsyncOperation$OperationType r0 = org.greenrobot.greendao.async.AsyncOperation.OperationType.DeleteAll
            r1 = 0
            org.greenrobot.greendao.async.AsyncOperation r3 = r2.enqueEntityOperation(r0, r3, r1, r4)
            return r3
    }

    public org.greenrobot.greendao.async.AsyncOperation deleteByKey(java.lang.Object r2) {
            r1 = this;
            r0 = 0
            org.greenrobot.greendao.async.AsyncOperation r2 = r1.deleteByKey(r2, r0)
            return r2
    }

    public org.greenrobot.greendao.async.AsyncOperation deleteByKey(java.lang.Object r2, int r3) {
            r1 = this;
            org.greenrobot.greendao.async.AsyncOperation$OperationType r0 = org.greenrobot.greendao.async.AsyncOperation.OperationType.DeleteByKey
            org.greenrobot.greendao.async.AsyncOperation r2 = r1.enqueueEntityOperation(r0, r2, r3)
            return r2
    }

    public <E> org.greenrobot.greendao.async.AsyncOperation deleteInTx(java.lang.Class<E> r2, int r3, E... r4) {
            r1 = this;
            org.greenrobot.greendao.async.AsyncOperation$OperationType r0 = org.greenrobot.greendao.async.AsyncOperation.OperationType.DeleteInTxArray
            org.greenrobot.greendao.async.AsyncOperation r2 = r1.enqueEntityOperation(r0, r2, r4, r3)
            return r2
    }

    public <E> org.greenrobot.greendao.async.AsyncOperation deleteInTx(java.lang.Class<E> r2, java.lang.Iterable<E> r3) {
            r1 = this;
            r0 = 0
            org.greenrobot.greendao.async.AsyncOperation r2 = r1.deleteInTx(r2, r3, r0)
            return r2
    }

    public <E> org.greenrobot.greendao.async.AsyncOperation deleteInTx(java.lang.Class<E> r2, java.lang.Iterable<E> r3, int r4) {
            r1 = this;
            org.greenrobot.greendao.async.AsyncOperation$OperationType r0 = org.greenrobot.greendao.async.AsyncOperation.OperationType.DeleteInTxIterable
            org.greenrobot.greendao.async.AsyncOperation r2 = r1.enqueEntityOperation(r0, r2, r3, r4)
            return r2
    }

    public <E> org.greenrobot.greendao.async.AsyncOperation deleteInTx(java.lang.Class<E> r2, E... r3) {
            r1 = this;
            r0 = 0
            org.greenrobot.greendao.async.AsyncOperation r2 = r1.deleteInTx(r2, r0, r3)
            return r2
    }

    public org.greenrobot.greendao.async.AsyncOperationListener getListener() {
            r1 = this;
            org.greenrobot.greendao.async.AsyncOperationExecutor r0 = r1.executor
            org.greenrobot.greendao.async.AsyncOperationListener r0 = r0.getListener()
            return r0
    }

    public org.greenrobot.greendao.async.AsyncOperationListener getListenerMainThread() {
            r1 = this;
            org.greenrobot.greendao.async.AsyncOperationExecutor r0 = r1.executor
            org.greenrobot.greendao.async.AsyncOperationListener r0 = r0.getListenerMainThread()
            return r0
    }

    public int getMaxOperationCountToMerge() {
            r1 = this;
            org.greenrobot.greendao.async.AsyncOperationExecutor r0 = r1.executor
            int r0 = r0.getMaxOperationCountToMerge()
            return r0
    }

    public int getSessionFlags() {
            r1 = this;
            int r0 = r1.sessionFlags
            return r0
    }

    public int getWaitForMergeMillis() {
            r1 = this;
            org.greenrobot.greendao.async.AsyncOperationExecutor r0 = r1.executor
            int r0 = r0.getWaitForMergeMillis()
            return r0
    }

    public org.greenrobot.greendao.async.AsyncOperation insert(java.lang.Object r2) {
            r1 = this;
            r0 = 0
            org.greenrobot.greendao.async.AsyncOperation r2 = r1.insert(r2, r0)
            return r2
    }

    public org.greenrobot.greendao.async.AsyncOperation insert(java.lang.Object r2, int r3) {
            r1 = this;
            org.greenrobot.greendao.async.AsyncOperation$OperationType r0 = org.greenrobot.greendao.async.AsyncOperation.OperationType.Insert
            org.greenrobot.greendao.async.AsyncOperation r2 = r1.enqueueEntityOperation(r0, r2, r3)
            return r2
    }

    public <E> org.greenrobot.greendao.async.AsyncOperation insertInTx(java.lang.Class<E> r2, int r3, E... r4) {
            r1 = this;
            org.greenrobot.greendao.async.AsyncOperation$OperationType r0 = org.greenrobot.greendao.async.AsyncOperation.OperationType.InsertInTxArray
            org.greenrobot.greendao.async.AsyncOperation r2 = r1.enqueEntityOperation(r0, r2, r4, r3)
            return r2
    }

    public <E> org.greenrobot.greendao.async.AsyncOperation insertInTx(java.lang.Class<E> r2, java.lang.Iterable<E> r3) {
            r1 = this;
            r0 = 0
            org.greenrobot.greendao.async.AsyncOperation r2 = r1.insertInTx(r2, r3, r0)
            return r2
    }

    public <E> org.greenrobot.greendao.async.AsyncOperation insertInTx(java.lang.Class<E> r2, java.lang.Iterable<E> r3, int r4) {
            r1 = this;
            org.greenrobot.greendao.async.AsyncOperation$OperationType r0 = org.greenrobot.greendao.async.AsyncOperation.OperationType.InsertInTxIterable
            org.greenrobot.greendao.async.AsyncOperation r2 = r1.enqueEntityOperation(r0, r2, r3, r4)
            return r2
    }

    public <E> org.greenrobot.greendao.async.AsyncOperation insertInTx(java.lang.Class<E> r2, E... r3) {
            r1 = this;
            r0 = 0
            org.greenrobot.greendao.async.AsyncOperation r2 = r1.insertInTx(r2, r0, r3)
            return r2
    }

    public org.greenrobot.greendao.async.AsyncOperation insertOrReplace(java.lang.Object r2) {
            r1 = this;
            r0 = 0
            org.greenrobot.greendao.async.AsyncOperation r2 = r1.insertOrReplace(r2, r0)
            return r2
    }

    public org.greenrobot.greendao.async.AsyncOperation insertOrReplace(java.lang.Object r2, int r3) {
            r1 = this;
            org.greenrobot.greendao.async.AsyncOperation$OperationType r0 = org.greenrobot.greendao.async.AsyncOperation.OperationType.InsertOrReplace
            org.greenrobot.greendao.async.AsyncOperation r2 = r1.enqueueEntityOperation(r0, r2, r3)
            return r2
    }

    public <E> org.greenrobot.greendao.async.AsyncOperation insertOrReplaceInTx(java.lang.Class<E> r2, int r3, E... r4) {
            r1 = this;
            org.greenrobot.greendao.async.AsyncOperation$OperationType r0 = org.greenrobot.greendao.async.AsyncOperation.OperationType.InsertOrReplaceInTxArray
            org.greenrobot.greendao.async.AsyncOperation r2 = r1.enqueEntityOperation(r0, r2, r4, r3)
            return r2
    }

    public <E> org.greenrobot.greendao.async.AsyncOperation insertOrReplaceInTx(java.lang.Class<E> r2, java.lang.Iterable<E> r3) {
            r1 = this;
            r0 = 0
            org.greenrobot.greendao.async.AsyncOperation r2 = r1.insertOrReplaceInTx(r2, r3, r0)
            return r2
    }

    public <E> org.greenrobot.greendao.async.AsyncOperation insertOrReplaceInTx(java.lang.Class<E> r2, java.lang.Iterable<E> r3, int r4) {
            r1 = this;
            org.greenrobot.greendao.async.AsyncOperation$OperationType r0 = org.greenrobot.greendao.async.AsyncOperation.OperationType.InsertOrReplaceInTxIterable
            org.greenrobot.greendao.async.AsyncOperation r2 = r1.enqueEntityOperation(r0, r2, r3, r4)
            return r2
    }

    public <E> org.greenrobot.greendao.async.AsyncOperation insertOrReplaceInTx(java.lang.Class<E> r2, E... r3) {
            r1 = this;
            r0 = 0
            org.greenrobot.greendao.async.AsyncOperation r2 = r1.insertOrReplaceInTx(r2, r0, r3)
            return r2
    }

    public boolean isCompleted() {
            r1 = this;
            org.greenrobot.greendao.async.AsyncOperationExecutor r0 = r1.executor
            boolean r0 = r0.isCompleted()
            return r0
    }

    public org.greenrobot.greendao.async.AsyncOperation load(java.lang.Class<?> r2, java.lang.Object r3) {
            r1 = this;
            r0 = 0
            org.greenrobot.greendao.async.AsyncOperation r2 = r1.load(r2, r3, r0)
            return r2
    }

    public org.greenrobot.greendao.async.AsyncOperation load(java.lang.Class<?> r2, java.lang.Object r3, int r4) {
            r1 = this;
            org.greenrobot.greendao.async.AsyncOperation$OperationType r0 = org.greenrobot.greendao.async.AsyncOperation.OperationType.Load
            org.greenrobot.greendao.async.AsyncOperation r2 = r1.enqueEntityOperation(r0, r2, r3, r4)
            return r2
    }

    public org.greenrobot.greendao.async.AsyncOperation loadAll(java.lang.Class<?> r2) {
            r1 = this;
            r0 = 0
            org.greenrobot.greendao.async.AsyncOperation r2 = r1.loadAll(r2, r0)
            return r2
    }

    public org.greenrobot.greendao.async.AsyncOperation loadAll(java.lang.Class<?> r3, int r4) {
            r2 = this;
            org.greenrobot.greendao.async.AsyncOperation$OperationType r0 = org.greenrobot.greendao.async.AsyncOperation.OperationType.LoadAll
            r1 = 0
            org.greenrobot.greendao.async.AsyncOperation r3 = r2.enqueEntityOperation(r0, r3, r1, r4)
            return r3
    }

    public org.greenrobot.greendao.async.AsyncOperation queryList(org.greenrobot.greendao.query.Query<?> r2) {
            r1 = this;
            r0 = 0
            org.greenrobot.greendao.async.AsyncOperation r2 = r1.queryList(r2, r0)
            return r2
    }

    public org.greenrobot.greendao.async.AsyncOperation queryList(org.greenrobot.greendao.query.Query<?> r2, int r3) {
            r1 = this;
            org.greenrobot.greendao.async.AsyncOperation$OperationType r0 = org.greenrobot.greendao.async.AsyncOperation.OperationType.QueryList
            org.greenrobot.greendao.async.AsyncOperation r2 = r1.enqueueDatabaseOperation(r0, r2, r3)
            return r2
    }

    public org.greenrobot.greendao.async.AsyncOperation queryUnique(org.greenrobot.greendao.query.Query<?> r2) {
            r1 = this;
            r0 = 0
            org.greenrobot.greendao.async.AsyncOperation r2 = r1.queryUnique(r2, r0)
            return r2
    }

    public org.greenrobot.greendao.async.AsyncOperation queryUnique(org.greenrobot.greendao.query.Query<?> r2, int r3) {
            r1 = this;
            org.greenrobot.greendao.async.AsyncOperation$OperationType r0 = org.greenrobot.greendao.async.AsyncOperation.OperationType.QueryUnique
            org.greenrobot.greendao.async.AsyncOperation r2 = r1.enqueueDatabaseOperation(r0, r2, r3)
            return r2
    }

    public org.greenrobot.greendao.async.AsyncOperation refresh(java.lang.Object r2) {
            r1 = this;
            r0 = 0
            org.greenrobot.greendao.async.AsyncOperation r2 = r1.refresh(r2, r0)
            return r2
    }

    public org.greenrobot.greendao.async.AsyncOperation refresh(java.lang.Object r2, int r3) {
            r1 = this;
            org.greenrobot.greendao.async.AsyncOperation$OperationType r0 = org.greenrobot.greendao.async.AsyncOperation.OperationType.Refresh
            org.greenrobot.greendao.async.AsyncOperation r2 = r1.enqueueEntityOperation(r0, r2, r3)
            return r2
    }

    public org.greenrobot.greendao.async.AsyncOperation runInTx(java.lang.Runnable r2) {
            r1 = this;
            r0 = 0
            org.greenrobot.greendao.async.AsyncOperation r2 = r1.runInTx(r2, r0)
            return r2
    }

    public org.greenrobot.greendao.async.AsyncOperation runInTx(java.lang.Runnable r2, int r3) {
            r1 = this;
            org.greenrobot.greendao.async.AsyncOperation$OperationType r0 = org.greenrobot.greendao.async.AsyncOperation.OperationType.TransactionRunnable
            org.greenrobot.greendao.async.AsyncOperation r2 = r1.enqueueDatabaseOperation(r0, r2, r3)
            return r2
    }

    public void setListener(org.greenrobot.greendao.async.AsyncOperationListener r2) {
            r1 = this;
            org.greenrobot.greendao.async.AsyncOperationExecutor r0 = r1.executor
            r0.setListener(r2)
            return
    }

    public void setListenerMainThread(org.greenrobot.greendao.async.AsyncOperationListener r2) {
            r1 = this;
            org.greenrobot.greendao.async.AsyncOperationExecutor r0 = r1.executor
            r0.setListenerMainThread(r2)
            return
    }

    public void setMaxOperationCountToMerge(int r2) {
            r1 = this;
            org.greenrobot.greendao.async.AsyncOperationExecutor r0 = r1.executor
            r0.setMaxOperationCountToMerge(r2)
            return
    }

    public void setSessionFlags(int r1) {
            r0 = this;
            r0.sessionFlags = r1
            return
    }

    public void setWaitForMergeMillis(int r2) {
            r1 = this;
            org.greenrobot.greendao.async.AsyncOperationExecutor r0 = r1.executor
            r0.setWaitForMergeMillis(r2)
            return
    }

    public org.greenrobot.greendao.async.AsyncOperation update(java.lang.Object r2) {
            r1 = this;
            r0 = 0
            org.greenrobot.greendao.async.AsyncOperation r2 = r1.update(r2, r0)
            return r2
    }

    public org.greenrobot.greendao.async.AsyncOperation update(java.lang.Object r2, int r3) {
            r1 = this;
            org.greenrobot.greendao.async.AsyncOperation$OperationType r0 = org.greenrobot.greendao.async.AsyncOperation.OperationType.Update
            org.greenrobot.greendao.async.AsyncOperation r2 = r1.enqueueEntityOperation(r0, r2, r3)
            return r2
    }

    public <E> org.greenrobot.greendao.async.AsyncOperation updateInTx(java.lang.Class<E> r2, int r3, E... r4) {
            r1 = this;
            org.greenrobot.greendao.async.AsyncOperation$OperationType r0 = org.greenrobot.greendao.async.AsyncOperation.OperationType.UpdateInTxArray
            org.greenrobot.greendao.async.AsyncOperation r2 = r1.enqueEntityOperation(r0, r2, r4, r3)
            return r2
    }

    public <E> org.greenrobot.greendao.async.AsyncOperation updateInTx(java.lang.Class<E> r2, java.lang.Iterable<E> r3) {
            r1 = this;
            r0 = 0
            org.greenrobot.greendao.async.AsyncOperation r2 = r1.updateInTx(r2, r3, r0)
            return r2
    }

    public <E> org.greenrobot.greendao.async.AsyncOperation updateInTx(java.lang.Class<E> r2, java.lang.Iterable<E> r3, int r4) {
            r1 = this;
            org.greenrobot.greendao.async.AsyncOperation$OperationType r0 = org.greenrobot.greendao.async.AsyncOperation.OperationType.UpdateInTxIterable
            org.greenrobot.greendao.async.AsyncOperation r2 = r1.enqueEntityOperation(r0, r2, r3, r4)
            return r2
    }

    public <E> org.greenrobot.greendao.async.AsyncOperation updateInTx(java.lang.Class<E> r2, E... r3) {
            r1 = this;
            r0 = 0
            org.greenrobot.greendao.async.AsyncOperation r2 = r1.updateInTx(r2, r0, r3)
            return r2
    }

    public void waitForCompletion() {
            r1 = this;
            org.greenrobot.greendao.async.AsyncOperationExecutor r0 = r1.executor
            r0.waitForCompletion()
            return
    }

    public boolean waitForCompletion(int r2) {
            r1 = this;
            org.greenrobot.greendao.async.AsyncOperationExecutor r0 = r1.executor
            boolean r2 = r0.waitForCompletion(r2)
            return r2
    }
}
