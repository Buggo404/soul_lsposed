package org.greenrobot.greendao.async;

/* loaded from: classes.dex */
class AsyncOperationExecutor implements java.lang.Runnable, android.os.Handler.Callback {
    private static java.util.concurrent.ExecutorService executorService;
    private int countOperationsCompleted;
    private int countOperationsEnqueued;
    private volatile boolean executorRunning;
    private android.os.Handler handlerMainThread;
    private int lastSequenceNumber;
    private volatile org.greenrobot.greendao.async.AsyncOperationListener listener;
    private volatile org.greenrobot.greendao.async.AsyncOperationListener listenerMainThread;
    private volatile int maxOperationCountToMerge;
    private final java.util.concurrent.BlockingQueue<org.greenrobot.greendao.async.AsyncOperation> queue;
    private volatile int waitForMergeMillis;

    /* renamed from: org.greenrobot.greendao.async.AsyncOperationExecutor$1 */
    static /* synthetic */ class C12101 {

        /* renamed from: $SwitchMap$org$greenrobot$greendao$async$AsyncOperation$OperationType */
        static final /* synthetic */ int[] f617x3b8ffa8 = null;

        static {
                org.greenrobot.greendao.async.AsyncOperation$OperationType[] r0 = org.greenrobot.greendao.async.AsyncOperation.OperationType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                org.greenrobot.greendao.async.AsyncOperationExecutor.C12101.f617x3b8ffa8 = r0
                org.greenrobot.greendao.async.AsyncOperation$OperationType r1 = org.greenrobot.greendao.async.AsyncOperation.OperationType.Delete     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = org.greenrobot.greendao.async.AsyncOperationExecutor.C12101.f617x3b8ffa8     // Catch: java.lang.NoSuchFieldError -> L1d
                org.greenrobot.greendao.async.AsyncOperation$OperationType r1 = org.greenrobot.greendao.async.AsyncOperation.OperationType.DeleteInTxIterable     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = org.greenrobot.greendao.async.AsyncOperationExecutor.C12101.f617x3b8ffa8     // Catch: java.lang.NoSuchFieldError -> L28
                org.greenrobot.greendao.async.AsyncOperation$OperationType r1 = org.greenrobot.greendao.async.AsyncOperation.OperationType.DeleteInTxArray     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = org.greenrobot.greendao.async.AsyncOperationExecutor.C12101.f617x3b8ffa8     // Catch: java.lang.NoSuchFieldError -> L33
                org.greenrobot.greendao.async.AsyncOperation$OperationType r1 = org.greenrobot.greendao.async.AsyncOperation.OperationType.Insert     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = org.greenrobot.greendao.async.AsyncOperationExecutor.C12101.f617x3b8ffa8     // Catch: java.lang.NoSuchFieldError -> L3e
                org.greenrobot.greendao.async.AsyncOperation$OperationType r1 = org.greenrobot.greendao.async.AsyncOperation.OperationType.InsertInTxIterable     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = org.greenrobot.greendao.async.AsyncOperationExecutor.C12101.f617x3b8ffa8     // Catch: java.lang.NoSuchFieldError -> L49
                org.greenrobot.greendao.async.AsyncOperation$OperationType r1 = org.greenrobot.greendao.async.AsyncOperation.OperationType.InsertInTxArray     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = org.greenrobot.greendao.async.AsyncOperationExecutor.C12101.f617x3b8ffa8     // Catch: java.lang.NoSuchFieldError -> L54
                org.greenrobot.greendao.async.AsyncOperation$OperationType r1 = org.greenrobot.greendao.async.AsyncOperation.OperationType.InsertOrReplace     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r0 = org.greenrobot.greendao.async.AsyncOperationExecutor.C12101.f617x3b8ffa8     // Catch: java.lang.NoSuchFieldError -> L60
                org.greenrobot.greendao.async.AsyncOperation$OperationType r1 = org.greenrobot.greendao.async.AsyncOperation.OperationType.InsertOrReplaceInTxIterable     // Catch: java.lang.NoSuchFieldError -> L60
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                int[] r0 = org.greenrobot.greendao.async.AsyncOperationExecutor.C12101.f617x3b8ffa8     // Catch: java.lang.NoSuchFieldError -> L6c
                org.greenrobot.greendao.async.AsyncOperation$OperationType r1 = org.greenrobot.greendao.async.AsyncOperation.OperationType.InsertOrReplaceInTxArray     // Catch: java.lang.NoSuchFieldError -> L6c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6c
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6c
            L6c:
                int[] r0 = org.greenrobot.greendao.async.AsyncOperationExecutor.C12101.f617x3b8ffa8     // Catch: java.lang.NoSuchFieldError -> L78
                org.greenrobot.greendao.async.AsyncOperation$OperationType r1 = org.greenrobot.greendao.async.AsyncOperation.OperationType.Update     // Catch: java.lang.NoSuchFieldError -> L78
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r2 = 10
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L78
            L78:
                int[] r0 = org.greenrobot.greendao.async.AsyncOperationExecutor.C12101.f617x3b8ffa8     // Catch: java.lang.NoSuchFieldError -> L84
                org.greenrobot.greendao.async.AsyncOperation$OperationType r1 = org.greenrobot.greendao.async.AsyncOperation.OperationType.UpdateInTxIterable     // Catch: java.lang.NoSuchFieldError -> L84
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L84
                r2 = 11
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L84
            L84:
                int[] r0 = org.greenrobot.greendao.async.AsyncOperationExecutor.C12101.f617x3b8ffa8     // Catch: java.lang.NoSuchFieldError -> L90
                org.greenrobot.greendao.async.AsyncOperation$OperationType r1 = org.greenrobot.greendao.async.AsyncOperation.OperationType.UpdateInTxArray     // Catch: java.lang.NoSuchFieldError -> L90
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L90
                r2 = 12
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L90
            L90:
                int[] r0 = org.greenrobot.greendao.async.AsyncOperationExecutor.C12101.f617x3b8ffa8     // Catch: java.lang.NoSuchFieldError -> L9c
                org.greenrobot.greendao.async.AsyncOperation$OperationType r1 = org.greenrobot.greendao.async.AsyncOperation.OperationType.TransactionRunnable     // Catch: java.lang.NoSuchFieldError -> L9c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9c
                r2 = 13
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L9c
            L9c:
                int[] r0 = org.greenrobot.greendao.async.AsyncOperationExecutor.C12101.f617x3b8ffa8     // Catch: java.lang.NoSuchFieldError -> La8
                org.greenrobot.greendao.async.AsyncOperation$OperationType r1 = org.greenrobot.greendao.async.AsyncOperation.OperationType.TransactionCallable     // Catch: java.lang.NoSuchFieldError -> La8
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La8
                r2 = 14
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> La8
            La8:
                int[] r0 = org.greenrobot.greendao.async.AsyncOperationExecutor.C12101.f617x3b8ffa8     // Catch: java.lang.NoSuchFieldError -> Lb4
                org.greenrobot.greendao.async.AsyncOperation$OperationType r1 = org.greenrobot.greendao.async.AsyncOperation.OperationType.QueryList     // Catch: java.lang.NoSuchFieldError -> Lb4
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lb4
                r2 = 15
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lb4
            Lb4:
                int[] r0 = org.greenrobot.greendao.async.AsyncOperationExecutor.C12101.f617x3b8ffa8     // Catch: java.lang.NoSuchFieldError -> Lc0
                org.greenrobot.greendao.async.AsyncOperation$OperationType r1 = org.greenrobot.greendao.async.AsyncOperation.OperationType.QueryUnique     // Catch: java.lang.NoSuchFieldError -> Lc0
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lc0
                r2 = 16
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lc0
            Lc0:
                int[] r0 = org.greenrobot.greendao.async.AsyncOperationExecutor.C12101.f617x3b8ffa8     // Catch: java.lang.NoSuchFieldError -> Lcc
                org.greenrobot.greendao.async.AsyncOperation$OperationType r1 = org.greenrobot.greendao.async.AsyncOperation.OperationType.DeleteByKey     // Catch: java.lang.NoSuchFieldError -> Lcc
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lcc
                r2 = 17
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lcc
            Lcc:
                int[] r0 = org.greenrobot.greendao.async.AsyncOperationExecutor.C12101.f617x3b8ffa8     // Catch: java.lang.NoSuchFieldError -> Ld8
                org.greenrobot.greendao.async.AsyncOperation$OperationType r1 = org.greenrobot.greendao.async.AsyncOperation.OperationType.DeleteAll     // Catch: java.lang.NoSuchFieldError -> Ld8
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Ld8
                r2 = 18
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Ld8
            Ld8:
                int[] r0 = org.greenrobot.greendao.async.AsyncOperationExecutor.C12101.f617x3b8ffa8     // Catch: java.lang.NoSuchFieldError -> Le4
                org.greenrobot.greendao.async.AsyncOperation$OperationType r1 = org.greenrobot.greendao.async.AsyncOperation.OperationType.Load     // Catch: java.lang.NoSuchFieldError -> Le4
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Le4
                r2 = 19
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Le4
            Le4:
                int[] r0 = org.greenrobot.greendao.async.AsyncOperationExecutor.C12101.f617x3b8ffa8     // Catch: java.lang.NoSuchFieldError -> Lf0
                org.greenrobot.greendao.async.AsyncOperation$OperationType r1 = org.greenrobot.greendao.async.AsyncOperation.OperationType.LoadAll     // Catch: java.lang.NoSuchFieldError -> Lf0
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lf0
                r2 = 20
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lf0
            Lf0:
                int[] r0 = org.greenrobot.greendao.async.AsyncOperationExecutor.C12101.f617x3b8ffa8     // Catch: java.lang.NoSuchFieldError -> Lfc
                org.greenrobot.greendao.async.AsyncOperation$OperationType r1 = org.greenrobot.greendao.async.AsyncOperation.OperationType.Count     // Catch: java.lang.NoSuchFieldError -> Lfc
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lfc
                r2 = 21
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lfc
            Lfc:
                int[] r0 = org.greenrobot.greendao.async.AsyncOperationExecutor.C12101.f617x3b8ffa8     // Catch: java.lang.NoSuchFieldError -> L108
                org.greenrobot.greendao.async.AsyncOperation$OperationType r1 = org.greenrobot.greendao.async.AsyncOperation.OperationType.Refresh     // Catch: java.lang.NoSuchFieldError -> L108
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L108
                r2 = 22
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L108
            L108:
                return
        }
    }

    static {
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newCachedThreadPool()
            org.greenrobot.greendao.async.AsyncOperationExecutor.executorService = r0
            return
    }

    AsyncOperationExecutor() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r0.<init>()
            r1.queue = r0
            r0 = 50
            r1.maxOperationCountToMerge = r0
            r1.waitForMergeMillis = r0
            return
    }

    private void executeOperation(org.greenrobot.greendao.async.AsyncOperation r4) {
            r3 = this;
            java.lang.String r0 = "Unsupported operation: "
            long r1 = java.lang.System.currentTimeMillis()
            r4.timeStarted = r1
            int[] r1 = org.greenrobot.greendao.async.AsyncOperationExecutor.C12101.f617x3b8ffa8     // Catch: java.lang.Throwable -> L105
            org.greenrobot.greendao.async.AsyncOperation$OperationType r2 = r4.type     // Catch: java.lang.Throwable -> L105
            int r2 = r2.ordinal()     // Catch: java.lang.Throwable -> L105
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L105
            switch(r1) {
                case 1: goto Lea;
                case 2: goto Le0;
                case 3: goto Ld6;
                case 4: goto Lce;
                case 5: goto Lc4;
                case 6: goto Lba;
                case 7: goto Lb2;
                case 8: goto La8;
                case 9: goto L9e;
                case 10: goto L96;
                case 11: goto L8b;
                case 12: goto L80;
                case 13: goto L7b;
                case 14: goto L76;
                case 15: goto L66;
                case 16: goto L56;
                case 17: goto L4d;
                case 18: goto L46;
                case 19: goto L3a;
                case 20: goto L30;
                case 21: goto L22;
                case 22: goto L19;
                default: goto L15;
            }     // Catch: java.lang.Throwable -> L105
        L15:
            org.greenrobot.greendao.DaoException r1 = new org.greenrobot.greendao.DaoException     // Catch: java.lang.Throwable -> L105
            goto Lf2
        L19:
            org.greenrobot.greendao.AbstractDao<java.lang.Object, java.lang.Object> r0 = r4.dao     // Catch: java.lang.Throwable -> L105
            java.lang.Object r1 = r4.parameter     // Catch: java.lang.Throwable -> L105
            r0.refresh(r1)     // Catch: java.lang.Throwable -> L105
            goto L108
        L22:
            org.greenrobot.greendao.AbstractDao<java.lang.Object, java.lang.Object> r0 = r4.dao     // Catch: java.lang.Throwable -> L105
            long r0 = r0.count()     // Catch: java.lang.Throwable -> L105
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L105
            r4.result = r0     // Catch: java.lang.Throwable -> L105
            goto L108
        L30:
            org.greenrobot.greendao.AbstractDao<java.lang.Object, java.lang.Object> r0 = r4.dao     // Catch: java.lang.Throwable -> L105
            java.util.List r0 = r0.loadAll()     // Catch: java.lang.Throwable -> L105
            r4.result = r0     // Catch: java.lang.Throwable -> L105
            goto L108
        L3a:
            org.greenrobot.greendao.AbstractDao<java.lang.Object, java.lang.Object> r0 = r4.dao     // Catch: java.lang.Throwable -> L105
            java.lang.Object r1 = r4.parameter     // Catch: java.lang.Throwable -> L105
            java.lang.Object r0 = r0.load(r1)     // Catch: java.lang.Throwable -> L105
            r4.result = r0     // Catch: java.lang.Throwable -> L105
            goto L108
        L46:
            org.greenrobot.greendao.AbstractDao<java.lang.Object, java.lang.Object> r0 = r4.dao     // Catch: java.lang.Throwable -> L105
            r0.deleteAll()     // Catch: java.lang.Throwable -> L105
            goto L108
        L4d:
            org.greenrobot.greendao.AbstractDao<java.lang.Object, java.lang.Object> r0 = r4.dao     // Catch: java.lang.Throwable -> L105
            java.lang.Object r1 = r4.parameter     // Catch: java.lang.Throwable -> L105
            r0.deleteByKey(r1)     // Catch: java.lang.Throwable -> L105
            goto L108
        L56:
            java.lang.Object r0 = r4.parameter     // Catch: java.lang.Throwable -> L105
            org.greenrobot.greendao.query.Query r0 = (org.greenrobot.greendao.query.Query) r0     // Catch: java.lang.Throwable -> L105
            org.greenrobot.greendao.query.Query r0 = r0.forCurrentThread()     // Catch: java.lang.Throwable -> L105
            java.lang.Object r0 = r0.unique()     // Catch: java.lang.Throwable -> L105
            r4.result = r0     // Catch: java.lang.Throwable -> L105
            goto L108
        L66:
            java.lang.Object r0 = r4.parameter     // Catch: java.lang.Throwable -> L105
            org.greenrobot.greendao.query.Query r0 = (org.greenrobot.greendao.query.Query) r0     // Catch: java.lang.Throwable -> L105
            org.greenrobot.greendao.query.Query r0 = r0.forCurrentThread()     // Catch: java.lang.Throwable -> L105
            java.util.List r0 = r0.list()     // Catch: java.lang.Throwable -> L105
            r4.result = r0     // Catch: java.lang.Throwable -> L105
            goto L108
        L76:
            r3.executeTransactionCallable(r4)     // Catch: java.lang.Throwable -> L105
            goto L108
        L7b:
            r3.executeTransactionRunnable(r4)     // Catch: java.lang.Throwable -> L105
            goto L108
        L80:
            org.greenrobot.greendao.AbstractDao<java.lang.Object, java.lang.Object> r0 = r4.dao     // Catch: java.lang.Throwable -> L105
            java.lang.Object r1 = r4.parameter     // Catch: java.lang.Throwable -> L105
            java.lang.Object[] r1 = (java.lang.Object[]) r1     // Catch: java.lang.Throwable -> L105
            r0.updateInTx(r1)     // Catch: java.lang.Throwable -> L105
            goto L108
        L8b:
            org.greenrobot.greendao.AbstractDao<java.lang.Object, java.lang.Object> r0 = r4.dao     // Catch: java.lang.Throwable -> L105
            java.lang.Object r1 = r4.parameter     // Catch: java.lang.Throwable -> L105
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L105
            r0.updateInTx(r1)     // Catch: java.lang.Throwable -> L105
            goto L108
        L96:
            org.greenrobot.greendao.AbstractDao<java.lang.Object, java.lang.Object> r0 = r4.dao     // Catch: java.lang.Throwable -> L105
            java.lang.Object r1 = r4.parameter     // Catch: java.lang.Throwable -> L105
            r0.update(r1)     // Catch: java.lang.Throwable -> L105
            goto L108
        L9e:
            org.greenrobot.greendao.AbstractDao<java.lang.Object, java.lang.Object> r0 = r4.dao     // Catch: java.lang.Throwable -> L105
            java.lang.Object r1 = r4.parameter     // Catch: java.lang.Throwable -> L105
            java.lang.Object[] r1 = (java.lang.Object[]) r1     // Catch: java.lang.Throwable -> L105
            r0.insertOrReplaceInTx(r1)     // Catch: java.lang.Throwable -> L105
            goto L108
        La8:
            org.greenrobot.greendao.AbstractDao<java.lang.Object, java.lang.Object> r0 = r4.dao     // Catch: java.lang.Throwable -> L105
            java.lang.Object r1 = r4.parameter     // Catch: java.lang.Throwable -> L105
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L105
            r0.insertOrReplaceInTx(r1)     // Catch: java.lang.Throwable -> L105
            goto L108
        Lb2:
            org.greenrobot.greendao.AbstractDao<java.lang.Object, java.lang.Object> r0 = r4.dao     // Catch: java.lang.Throwable -> L105
            java.lang.Object r1 = r4.parameter     // Catch: java.lang.Throwable -> L105
            r0.insertOrReplace(r1)     // Catch: java.lang.Throwable -> L105
            goto L108
        Lba:
            org.greenrobot.greendao.AbstractDao<java.lang.Object, java.lang.Object> r0 = r4.dao     // Catch: java.lang.Throwable -> L105
            java.lang.Object r1 = r4.parameter     // Catch: java.lang.Throwable -> L105
            java.lang.Object[] r1 = (java.lang.Object[]) r1     // Catch: java.lang.Throwable -> L105
            r0.insertInTx(r1)     // Catch: java.lang.Throwable -> L105
            goto L108
        Lc4:
            org.greenrobot.greendao.AbstractDao<java.lang.Object, java.lang.Object> r0 = r4.dao     // Catch: java.lang.Throwable -> L105
            java.lang.Object r1 = r4.parameter     // Catch: java.lang.Throwable -> L105
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L105
            r0.insertInTx(r1)     // Catch: java.lang.Throwable -> L105
            goto L108
        Lce:
            org.greenrobot.greendao.AbstractDao<java.lang.Object, java.lang.Object> r0 = r4.dao     // Catch: java.lang.Throwable -> L105
            java.lang.Object r1 = r4.parameter     // Catch: java.lang.Throwable -> L105
            r0.insert(r1)     // Catch: java.lang.Throwable -> L105
            goto L108
        Ld6:
            org.greenrobot.greendao.AbstractDao<java.lang.Object, java.lang.Object> r0 = r4.dao     // Catch: java.lang.Throwable -> L105
            java.lang.Object r1 = r4.parameter     // Catch: java.lang.Throwable -> L105
            java.lang.Object[] r1 = (java.lang.Object[]) r1     // Catch: java.lang.Throwable -> L105
            r0.deleteInTx(r1)     // Catch: java.lang.Throwable -> L105
            goto L108
        Le0:
            org.greenrobot.greendao.AbstractDao<java.lang.Object, java.lang.Object> r0 = r4.dao     // Catch: java.lang.Throwable -> L105
            java.lang.Object r1 = r4.parameter     // Catch: java.lang.Throwable -> L105
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L105
            r0.deleteInTx(r1)     // Catch: java.lang.Throwable -> L105
            goto L108
        Lea:
            org.greenrobot.greendao.AbstractDao<java.lang.Object, java.lang.Object> r0 = r4.dao     // Catch: java.lang.Throwable -> L105
            java.lang.Object r1 = r4.parameter     // Catch: java.lang.Throwable -> L105
            r0.delete(r1)     // Catch: java.lang.Throwable -> L105
            goto L108
        Lf2:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L105
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L105
            org.greenrobot.greendao.async.AsyncOperation$OperationType r0 = r4.type     // Catch: java.lang.Throwable -> L105
            java.lang.StringBuilder r0 = r2.append(r0)     // Catch: java.lang.Throwable -> L105
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L105
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L105
            throw r1     // Catch: java.lang.Throwable -> L105
        L105:
            r0 = move-exception
            r4.throwable = r0
        L108:
            long r0 = java.lang.System.currentTimeMillis()
            r4.timeCompleted = r0
            return
    }

    private void executeOperationAndPostCompleted(org.greenrobot.greendao.async.AsyncOperation r1) {
            r0 = this;
            r0.executeOperation(r1)
            r0.handleOperationCompleted(r1)
            return
    }

    private void executeTransactionCallable(org.greenrobot.greendao.async.AsyncOperation r3) throws java.lang.Exception {
            r2 = this;
            org.greenrobot.greendao.database.Database r0 = r3.getDatabase()
            r0.beginTransaction()
            java.lang.Object r1 = r3.parameter     // Catch: java.lang.Throwable -> L18
            java.util.concurrent.Callable r1 = (java.util.concurrent.Callable) r1     // Catch: java.lang.Throwable -> L18
            java.lang.Object r1 = r1.call()     // Catch: java.lang.Throwable -> L18
            r3.result = r1     // Catch: java.lang.Throwable -> L18
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L18
            r0.endTransaction()
            return
        L18:
            r3 = move-exception
            r0.endTransaction()
            throw r3
    }

    private void executeTransactionRunnable(org.greenrobot.greendao.async.AsyncOperation r2) {
            r1 = this;
            org.greenrobot.greendao.database.Database r0 = r2.getDatabase()
            r0.beginTransaction()
            java.lang.Object r2 = r2.parameter     // Catch: java.lang.Throwable -> L15
            java.lang.Runnable r2 = (java.lang.Runnable) r2     // Catch: java.lang.Throwable -> L15
            r2.run()     // Catch: java.lang.Throwable -> L15
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L15
            r0.endTransaction()
            return
        L15:
            r2 = move-exception
            r0.endTransaction()
            throw r2
    }

    private void handleOperationCompleted(org.greenrobot.greendao.async.AsyncOperation r4) {
            r3 = this;
            r4.setCompleted()
            org.greenrobot.greendao.async.AsyncOperationListener r0 = r3.listener
            if (r0 == 0) goto La
            r0.onAsyncOperationCompleted(r4)
        La:
            org.greenrobot.greendao.async.AsyncOperationListener r0 = r3.listenerMainThread
            r1 = 1
            if (r0 == 0) goto L29
            android.os.Handler r0 = r3.handlerMainThread
            if (r0 != 0) goto L1e
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r0.<init>(r2, r3)
            r3.handlerMainThread = r0
        L1e:
            android.os.Handler r0 = r3.handlerMainThread
            android.os.Message r4 = r0.obtainMessage(r1, r4)
            android.os.Handler r0 = r3.handlerMainThread
            r0.sendMessage(r4)
        L29:
            monitor-enter(r3)
            int r4 = r3.countOperationsCompleted     // Catch: java.lang.Throwable -> L38
            int r4 = r4 + r1
            r3.countOperationsCompleted = r4     // Catch: java.lang.Throwable -> L38
            int r0 = r3.countOperationsEnqueued     // Catch: java.lang.Throwable -> L38
            if (r4 != r0) goto L36
            r3.notifyAll()     // Catch: java.lang.Throwable -> L38
        L36:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L38
            return
        L38:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L38
            throw r4
    }

    private void mergeTxAndExecute(org.greenrobot.greendao.async.AsyncOperation r7, org.greenrobot.greendao.async.AsyncOperation r8) {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r7)
            r0.add(r8)
            org.greenrobot.greendao.database.Database r7 = r7.getDatabase()
            r7.beginTransaction()
            r8 = 0
            r1 = r8
        L14:
            int r2 = r0.size()     // Catch: java.lang.Throwable -> Lb3
            if (r1 >= r2) goto L61
            java.lang.Object r2 = r0.get(r1)     // Catch: java.lang.Throwable -> Lb3
            org.greenrobot.greendao.async.AsyncOperation r2 = (org.greenrobot.greendao.async.AsyncOperation) r2     // Catch: java.lang.Throwable -> Lb3
            r6.executeOperation(r2)     // Catch: java.lang.Throwable -> Lb3
            boolean r3 = r2.isFailed()     // Catch: java.lang.Throwable -> Lb3
            if (r3 == 0) goto L2a
            goto L61
        L2a:
            int r3 = r0.size()     // Catch: java.lang.Throwable -> Lb3
            r4 = 1
            int r3 = r3 - r4
            if (r1 != r3) goto L5e
            java.util.concurrent.BlockingQueue<org.greenrobot.greendao.async.AsyncOperation> r3 = r6.queue     // Catch: java.lang.Throwable -> Lb3
            java.lang.Object r3 = r3.peek()     // Catch: java.lang.Throwable -> Lb3
            org.greenrobot.greendao.async.AsyncOperation r3 = (org.greenrobot.greendao.async.AsyncOperation) r3     // Catch: java.lang.Throwable -> Lb3
            int r5 = r6.maxOperationCountToMerge     // Catch: java.lang.Throwable -> Lb3
            if (r1 >= r5) goto L5a
            boolean r2 = r2.isMergeableWith(r3)     // Catch: java.lang.Throwable -> Lb3
            if (r2 == 0) goto L5a
            java.util.concurrent.BlockingQueue<org.greenrobot.greendao.async.AsyncOperation> r2 = r6.queue     // Catch: java.lang.Throwable -> Lb3
            java.lang.Object r2 = r2.remove()     // Catch: java.lang.Throwable -> Lb3
            org.greenrobot.greendao.async.AsyncOperation r2 = (org.greenrobot.greendao.async.AsyncOperation) r2     // Catch: java.lang.Throwable -> Lb3
            if (r2 != r3) goto L52
            r0.add(r2)     // Catch: java.lang.Throwable -> Lb3
            goto L5e
        L52:
            org.greenrobot.greendao.DaoException r8 = new org.greenrobot.greendao.DaoException     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r0 = "Internal error: peeked op did not match removed op"
            r8.<init>(r0)     // Catch: java.lang.Throwable -> Lb3
            throw r8     // Catch: java.lang.Throwable -> Lb3
        L5a:
            r7.setTransactionSuccessful()     // Catch: java.lang.Throwable -> Lb3
            goto L62
        L5e:
            int r1 = r1 + 1
            goto L14
        L61:
            r4 = r8
        L62:
            r7.endTransaction()     // Catch: java.lang.RuntimeException -> L67
            r8 = r4
            goto L7a
        L67:
            r7 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Async transaction could not be ended, success so far was: "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            org.greenrobot.greendao.DaoLog.m105i(r1, r7)
        L7a:
            if (r8 == 0) goto L96
            int r7 = r0.size()
            java.util.Iterator r8 = r0.iterator()
        L84:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto Lb2
            java.lang.Object r0 = r8.next()
            org.greenrobot.greendao.async.AsyncOperation r0 = (org.greenrobot.greendao.async.AsyncOperation) r0
            r0.mergedOperationsCount = r7
            r6.handleOperationCompleted(r0)
            goto L84
        L96:
            java.lang.String r7 = "Reverted merged transaction because one of the operations failed. Executing operations one by one instead..."
            org.greenrobot.greendao.DaoLog.m104i(r7)
            java.util.Iterator r7 = r0.iterator()
        L9f:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lb2
            java.lang.Object r8 = r7.next()
            org.greenrobot.greendao.async.AsyncOperation r8 = (org.greenrobot.greendao.async.AsyncOperation) r8
            r8.reset()
            r6.executeOperationAndPostCompleted(r8)
            goto L9f
        Lb2:
            return
        Lb3:
            r8 = move-exception
            r7.endTransaction()     // Catch: java.lang.RuntimeException -> Lb8
            goto Lbe
        Lb8:
            r7 = move-exception
            java.lang.String r0 = "Async transaction could not be ended, success so far was: false"
            org.greenrobot.greendao.DaoLog.m105i(r0, r7)
        Lbe:
            throw r8
    }

    public void enqueue(org.greenrobot.greendao.async.AsyncOperation r3) {
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.lastSequenceNumber     // Catch: java.lang.Throwable -> L20
            r1 = 1
            int r0 = r0 + r1
            r2.lastSequenceNumber = r0     // Catch: java.lang.Throwable -> L20
            r3.sequenceNumber = r0     // Catch: java.lang.Throwable -> L20
            java.util.concurrent.BlockingQueue<org.greenrobot.greendao.async.AsyncOperation> r0 = r2.queue     // Catch: java.lang.Throwable -> L20
            r0.add(r3)     // Catch: java.lang.Throwable -> L20
            int r3 = r2.countOperationsEnqueued     // Catch: java.lang.Throwable -> L20
            int r3 = r3 + r1
            r2.countOperationsEnqueued = r3     // Catch: java.lang.Throwable -> L20
            boolean r3 = r2.executorRunning     // Catch: java.lang.Throwable -> L20
            if (r3 != 0) goto L1e
            r2.executorRunning = r1     // Catch: java.lang.Throwable -> L20
            java.util.concurrent.ExecutorService r3 = org.greenrobot.greendao.async.AsyncOperationExecutor.executorService     // Catch: java.lang.Throwable -> L20
            r3.execute(r2)     // Catch: java.lang.Throwable -> L20
        L1e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            return
        L20:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r3
    }

    public org.greenrobot.greendao.async.AsyncOperationListener getListener() {
            r1 = this;
            org.greenrobot.greendao.async.AsyncOperationListener r0 = r1.listener
            return r0
    }

    public org.greenrobot.greendao.async.AsyncOperationListener getListenerMainThread() {
            r1 = this;
            org.greenrobot.greendao.async.AsyncOperationListener r0 = r1.listenerMainThread
            return r0
    }

    public int getMaxOperationCountToMerge() {
            r1 = this;
            int r0 = r1.maxOperationCountToMerge
            return r0
    }

    public int getWaitForMergeMillis() {
            r1 = this;
            int r0 = r1.waitForMergeMillis
            return r0
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message r2) {
            r1 = this;
            org.greenrobot.greendao.async.AsyncOperationListener r0 = r1.listenerMainThread
            if (r0 == 0) goto Lb
            java.lang.Object r2 = r2.obj
            org.greenrobot.greendao.async.AsyncOperation r2 = (org.greenrobot.greendao.async.AsyncOperation) r2
            r0.onAsyncOperationCompleted(r2)
        Lb:
            r2 = 0
            return r2
    }

    public synchronized boolean isCompleted() {
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.countOperationsEnqueued     // Catch: java.lang.Throwable -> Lc
            int r1 = r2.countOperationsCompleted     // Catch: java.lang.Throwable -> Lc
            if (r0 != r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            monitor-exit(r2)
            return r0
        Lc:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    @Override // java.lang.Runnable
    public void run() {
            r6 = this;
        L0:
            r0 = 0
            java.util.concurrent.BlockingQueue<org.greenrobot.greendao.async.AsyncOperation> r1 = r6.queue     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L51
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L51
            r3 = 1
            java.lang.Object r1 = r1.poll(r3, r2)     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L51
            org.greenrobot.greendao.async.AsyncOperation r1 = (org.greenrobot.greendao.async.AsyncOperation) r1     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L51
            if (r1 != 0) goto L25
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L51
            java.util.concurrent.BlockingQueue<org.greenrobot.greendao.async.AsyncOperation> r1 = r6.queue     // Catch: java.lang.Throwable -> L22
            java.lang.Object r1 = r1.poll()     // Catch: java.lang.Throwable -> L22
            org.greenrobot.greendao.async.AsyncOperation r1 = (org.greenrobot.greendao.async.AsyncOperation) r1     // Catch: java.lang.Throwable -> L22
            if (r1 != 0) goto L20
            r6.executorRunning = r0     // Catch: java.lang.Throwable -> L22
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L22
            r6.executorRunning = r0
            return
        L20:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L22
            goto L25
        L22:
            r1 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L22
            throw r1     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L51
        L25:
            boolean r2 = r1.isMergeTx()     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L51
            if (r2 == 0) goto L4b
            java.util.concurrent.BlockingQueue<org.greenrobot.greendao.async.AsyncOperation> r2 = r6.queue     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L51
            int r3 = r6.waitForMergeMillis     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L51
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L51
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L51
            java.lang.Object r2 = r2.poll(r3, r5)     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L51
            org.greenrobot.greendao.async.AsyncOperation r2 = (org.greenrobot.greendao.async.AsyncOperation) r2     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L51
            if (r2 == 0) goto L4b
            boolean r3 = r1.isMergeableWith(r2)     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L51
            if (r3 == 0) goto L44
            r6.mergeTxAndExecute(r1, r2)     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L51
            goto L0
        L44:
            r6.executeOperationAndPostCompleted(r1)     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L51
            r6.executeOperationAndPostCompleted(r2)     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L51
            goto L0
        L4b:
            r6.executeOperationAndPostCompleted(r1)     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L51
            goto L0
        L4f:
            r1 = move-exception
            goto L73
        L51:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f
            r2.<init>()     // Catch: java.lang.Throwable -> L4f
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> L4f
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r3 = " was interruppted"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L4f
            org.greenrobot.greendao.DaoLog.m109w(r2, r1)     // Catch: java.lang.Throwable -> L4f
            r6.executorRunning = r0
            return
        L73:
            r6.executorRunning = r0
            throw r1
    }

    public void setListener(org.greenrobot.greendao.async.AsyncOperationListener r1) {
            r0 = this;
            r0.listener = r1
            return
    }

    public void setListenerMainThread(org.greenrobot.greendao.async.AsyncOperationListener r1) {
            r0 = this;
            r0.listenerMainThread = r1
            return
    }

    public void setMaxOperationCountToMerge(int r1) {
            r0 = this;
            r0.maxOperationCountToMerge = r1
            return
    }

    public void setWaitForMergeMillis(int r1) {
            r0 = this;
            r0.waitForMergeMillis = r1
            return
    }

    public synchronized void waitForCompletion() {
            r3 = this;
            monitor-enter(r3)
        L1:
            boolean r0 = r3.isCompleted()     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L14
            r3.wait()     // Catch: java.lang.InterruptedException -> Lb java.lang.Throwable -> L16
            goto L1
        Lb:
            r0 = move-exception
            org.greenrobot.greendao.DaoException r1 = new org.greenrobot.greendao.DaoException     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = "Interrupted while waiting for all operations to complete"
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L16
            throw r1     // Catch: java.lang.Throwable -> L16
        L14:
            monitor-exit(r3)
            return
        L16:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    public synchronized boolean waitForCompletion(int r3) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.isCompleted()     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L15
            long r0 = (long) r3
            r2.wait(r0)     // Catch: java.lang.InterruptedException -> Lc java.lang.Throwable -> L1b
            goto L15
        Lc:
            r3 = move-exception
            org.greenrobot.greendao.DaoException r0 = new org.greenrobot.greendao.DaoException     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = "Interrupted while waiting for all operations to complete"
            r0.<init>(r1, r3)     // Catch: java.lang.Throwable -> L1b
            throw r0     // Catch: java.lang.Throwable -> L1b
        L15:
            boolean r3 = r2.isCompleted()     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r2)
            return r3
        L1b:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }
}
