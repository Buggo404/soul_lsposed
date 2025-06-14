package org.greenrobot.greendao.async;

/* loaded from: classes.dex */
public class AsyncOperation {
    public static final int FLAG_MERGE_TX = 1;
    public static final int FLAG_STOP_QUEUE_ON_EXCEPTION = 2;
    public static final int FLAG_TRACK_CREATOR_STACKTRACE = 4;
    private volatile boolean completed;
    final java.lang.Exception creatorStacktrace;
    final org.greenrobot.greendao.AbstractDao<java.lang.Object, java.lang.Object> dao;
    private final org.greenrobot.greendao.database.Database database;
    final int flags;
    volatile int mergedOperationsCount;
    final java.lang.Object parameter;
    volatile java.lang.Object result;
    int sequenceNumber;
    volatile java.lang.Throwable throwable;
    volatile long timeCompleted;
    volatile long timeStarted;
    final org.greenrobot.greendao.async.AsyncOperation.OperationType type;

    public enum OperationType extends java.lang.Enum<org.greenrobot.greendao.async.AsyncOperation.OperationType> {
        private static final /* synthetic */ org.greenrobot.greendao.async.AsyncOperation.OperationType[] $VALUES = null;
        public static final org.greenrobot.greendao.async.AsyncOperation.OperationType Count = null;
        public static final org.greenrobot.greendao.async.AsyncOperation.OperationType Delete = null;
        public static final org.greenrobot.greendao.async.AsyncOperation.OperationType DeleteAll = null;
        public static final org.greenrobot.greendao.async.AsyncOperation.OperationType DeleteByKey = null;
        public static final org.greenrobot.greendao.async.AsyncOperation.OperationType DeleteInTxArray = null;
        public static final org.greenrobot.greendao.async.AsyncOperation.OperationType DeleteInTxIterable = null;
        public static final org.greenrobot.greendao.async.AsyncOperation.OperationType Insert = null;
        public static final org.greenrobot.greendao.async.AsyncOperation.OperationType InsertInTxArray = null;
        public static final org.greenrobot.greendao.async.AsyncOperation.OperationType InsertInTxIterable = null;
        public static final org.greenrobot.greendao.async.AsyncOperation.OperationType InsertOrReplace = null;
        public static final org.greenrobot.greendao.async.AsyncOperation.OperationType InsertOrReplaceInTxArray = null;
        public static final org.greenrobot.greendao.async.AsyncOperation.OperationType InsertOrReplaceInTxIterable = null;
        public static final org.greenrobot.greendao.async.AsyncOperation.OperationType Load = null;
        public static final org.greenrobot.greendao.async.AsyncOperation.OperationType LoadAll = null;
        public static final org.greenrobot.greendao.async.AsyncOperation.OperationType QueryList = null;
        public static final org.greenrobot.greendao.async.AsyncOperation.OperationType QueryUnique = null;
        public static final org.greenrobot.greendao.async.AsyncOperation.OperationType Refresh = null;
        public static final org.greenrobot.greendao.async.AsyncOperation.OperationType TransactionCallable = null;
        public static final org.greenrobot.greendao.async.AsyncOperation.OperationType TransactionRunnable = null;
        public static final org.greenrobot.greendao.async.AsyncOperation.OperationType Update = null;
        public static final org.greenrobot.greendao.async.AsyncOperation.OperationType UpdateInTxArray = null;
        public static final org.greenrobot.greendao.async.AsyncOperation.OperationType UpdateInTxIterable = null;

        static {
                org.greenrobot.greendao.async.AsyncOperation$OperationType r0 = new org.greenrobot.greendao.async.AsyncOperation$OperationType
                java.lang.String r1 = "Insert"
                r2 = 0
                r0.<init>(r1, r2)
                org.greenrobot.greendao.async.AsyncOperation.OperationType.Insert = r0
                org.greenrobot.greendao.async.AsyncOperation$OperationType r1 = new org.greenrobot.greendao.async.AsyncOperation$OperationType
                java.lang.String r3 = "InsertInTxIterable"
                r4 = 1
                r1.<init>(r3, r4)
                org.greenrobot.greendao.async.AsyncOperation.OperationType.InsertInTxIterable = r1
                org.greenrobot.greendao.async.AsyncOperation$OperationType r3 = new org.greenrobot.greendao.async.AsyncOperation$OperationType
                java.lang.String r5 = "InsertInTxArray"
                r6 = 2
                r3.<init>(r5, r6)
                org.greenrobot.greendao.async.AsyncOperation.OperationType.InsertInTxArray = r3
                org.greenrobot.greendao.async.AsyncOperation$OperationType r5 = new org.greenrobot.greendao.async.AsyncOperation$OperationType
                java.lang.String r7 = "InsertOrReplace"
                r8 = 3
                r5.<init>(r7, r8)
                org.greenrobot.greendao.async.AsyncOperation.OperationType.InsertOrReplace = r5
                org.greenrobot.greendao.async.AsyncOperation$OperationType r7 = new org.greenrobot.greendao.async.AsyncOperation$OperationType
                java.lang.String r9 = "InsertOrReplaceInTxIterable"
                r10 = 4
                r7.<init>(r9, r10)
                org.greenrobot.greendao.async.AsyncOperation.OperationType.InsertOrReplaceInTxIterable = r7
                org.greenrobot.greendao.async.AsyncOperation$OperationType r9 = new org.greenrobot.greendao.async.AsyncOperation$OperationType
                java.lang.String r11 = "InsertOrReplaceInTxArray"
                r12 = 5
                r9.<init>(r11, r12)
                org.greenrobot.greendao.async.AsyncOperation.OperationType.InsertOrReplaceInTxArray = r9
                org.greenrobot.greendao.async.AsyncOperation$OperationType r11 = new org.greenrobot.greendao.async.AsyncOperation$OperationType
                java.lang.String r13 = "Update"
                r14 = 6
                r11.<init>(r13, r14)
                org.greenrobot.greendao.async.AsyncOperation.OperationType.Update = r11
                org.greenrobot.greendao.async.AsyncOperation$OperationType r13 = new org.greenrobot.greendao.async.AsyncOperation$OperationType
                java.lang.String r15 = "UpdateInTxIterable"
                r14 = 7
                r13.<init>(r15, r14)
                org.greenrobot.greendao.async.AsyncOperation.OperationType.UpdateInTxIterable = r13
                org.greenrobot.greendao.async.AsyncOperation$OperationType r15 = new org.greenrobot.greendao.async.AsyncOperation$OperationType
                java.lang.String r14 = "UpdateInTxArray"
                r12 = 8
                r15.<init>(r14, r12)
                org.greenrobot.greendao.async.AsyncOperation.OperationType.UpdateInTxArray = r15
                org.greenrobot.greendao.async.AsyncOperation$OperationType r14 = new org.greenrobot.greendao.async.AsyncOperation$OperationType
                java.lang.String r12 = "Delete"
                r10 = 9
                r14.<init>(r12, r10)
                org.greenrobot.greendao.async.AsyncOperation.OperationType.Delete = r14
                org.greenrobot.greendao.async.AsyncOperation$OperationType r12 = new org.greenrobot.greendao.async.AsyncOperation$OperationType
                java.lang.String r10 = "DeleteInTxIterable"
                r8 = 10
                r12.<init>(r10, r8)
                org.greenrobot.greendao.async.AsyncOperation.OperationType.DeleteInTxIterable = r12
                org.greenrobot.greendao.async.AsyncOperation$OperationType r10 = new org.greenrobot.greendao.async.AsyncOperation$OperationType
                java.lang.String r8 = "DeleteInTxArray"
                r6 = 11
                r10.<init>(r8, r6)
                org.greenrobot.greendao.async.AsyncOperation.OperationType.DeleteInTxArray = r10
                org.greenrobot.greendao.async.AsyncOperation$OperationType r8 = new org.greenrobot.greendao.async.AsyncOperation$OperationType
                java.lang.String r6 = "DeleteByKey"
                r4 = 12
                r8.<init>(r6, r4)
                org.greenrobot.greendao.async.AsyncOperation.OperationType.DeleteByKey = r8
                org.greenrobot.greendao.async.AsyncOperation$OperationType r6 = new org.greenrobot.greendao.async.AsyncOperation$OperationType
                java.lang.String r4 = "DeleteAll"
                r2 = 13
                r6.<init>(r4, r2)
                org.greenrobot.greendao.async.AsyncOperation.OperationType.DeleteAll = r6
                org.greenrobot.greendao.async.AsyncOperation$OperationType r4 = new org.greenrobot.greendao.async.AsyncOperation$OperationType
                java.lang.String r2 = "TransactionRunnable"
                r17 = r6
                r6 = 14
                r4.<init>(r2, r6)
                org.greenrobot.greendao.async.AsyncOperation.OperationType.TransactionRunnable = r4
                org.greenrobot.greendao.async.AsyncOperation$OperationType r2 = new org.greenrobot.greendao.async.AsyncOperation$OperationType
                java.lang.String r6 = "TransactionCallable"
                r18 = r4
                r4 = 15
                r2.<init>(r6, r4)
                org.greenrobot.greendao.async.AsyncOperation.OperationType.TransactionCallable = r2
                org.greenrobot.greendao.async.AsyncOperation$OperationType r6 = new org.greenrobot.greendao.async.AsyncOperation$OperationType
                java.lang.String r4 = "QueryList"
                r19 = r2
                r2 = 16
                r6.<init>(r4, r2)
                org.greenrobot.greendao.async.AsyncOperation.OperationType.QueryList = r6
                org.greenrobot.greendao.async.AsyncOperation$OperationType r4 = new org.greenrobot.greendao.async.AsyncOperation$OperationType
                java.lang.String r2 = "QueryUnique"
                r20 = r6
                r6 = 17
                r4.<init>(r2, r6)
                org.greenrobot.greendao.async.AsyncOperation.OperationType.QueryUnique = r4
                org.greenrobot.greendao.async.AsyncOperation$OperationType r2 = new org.greenrobot.greendao.async.AsyncOperation$OperationType
                java.lang.String r6 = "Load"
                r21 = r4
                r4 = 18
                r2.<init>(r6, r4)
                org.greenrobot.greendao.async.AsyncOperation.OperationType.Load = r2
                org.greenrobot.greendao.async.AsyncOperation$OperationType r6 = new org.greenrobot.greendao.async.AsyncOperation$OperationType
                java.lang.String r4 = "LoadAll"
                r22 = r2
                r2 = 19
                r6.<init>(r4, r2)
                org.greenrobot.greendao.async.AsyncOperation.OperationType.LoadAll = r6
                org.greenrobot.greendao.async.AsyncOperation$OperationType r4 = new org.greenrobot.greendao.async.AsyncOperation$OperationType
                java.lang.String r2 = "Count"
                r23 = r6
                r6 = 20
                r4.<init>(r2, r6)
                org.greenrobot.greendao.async.AsyncOperation.OperationType.Count = r4
                org.greenrobot.greendao.async.AsyncOperation$OperationType r2 = new org.greenrobot.greendao.async.AsyncOperation$OperationType
                java.lang.String r6 = "Refresh"
                r24 = r4
                r4 = 21
                r2.<init>(r6, r4)
                org.greenrobot.greendao.async.AsyncOperation.OperationType.Refresh = r2
                r6 = 22
                org.greenrobot.greendao.async.AsyncOperation$OperationType[] r6 = new org.greenrobot.greendao.async.AsyncOperation.OperationType[r6]
                r16 = 0
                r6[r16] = r0
                r0 = 1
                r6[r0] = r1
                r0 = 2
                r6[r0] = r3
                r0 = 3
                r6[r0] = r5
                r0 = 4
                r6[r0] = r7
                r0 = 5
                r6[r0] = r9
                r0 = 6
                r6[r0] = r11
                r0 = 7
                r6[r0] = r13
                r0 = 8
                r6[r0] = r15
                r0 = 9
                r6[r0] = r14
                r0 = 10
                r6[r0] = r12
                r0 = 11
                r6[r0] = r10
                r0 = 12
                r6[r0] = r8
                r0 = 13
                r6[r0] = r17
                r0 = 14
                r6[r0] = r18
                r0 = 15
                r6[r0] = r19
                r0 = 16
                r6[r0] = r20
                r0 = 17
                r6[r0] = r21
                r0 = 18
                r6[r0] = r22
                r0 = 19
                r6[r0] = r23
                r0 = 20
                r6[r0] = r24
                r6[r4] = r2
                org.greenrobot.greendao.async.AsyncOperation.OperationType.$VALUES = r6
                return
        }

        OperationType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static org.greenrobot.greendao.async.AsyncOperation.OperationType valueOf(java.lang.String r1) {
                java.lang.Class<org.greenrobot.greendao.async.AsyncOperation$OperationType> r0 = org.greenrobot.greendao.async.AsyncOperation.OperationType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.greenrobot.greendao.async.AsyncOperation$OperationType r1 = (org.greenrobot.greendao.async.AsyncOperation.OperationType) r1
                return r1
        }

        public static org.greenrobot.greendao.async.AsyncOperation.OperationType[] values() {
                org.greenrobot.greendao.async.AsyncOperation$OperationType[] r0 = org.greenrobot.greendao.async.AsyncOperation.OperationType.$VALUES
                java.lang.Object r0 = r0.clone()
                org.greenrobot.greendao.async.AsyncOperation$OperationType[] r0 = (org.greenrobot.greendao.async.AsyncOperation.OperationType[]) r0
                return r0
        }
    }

    AsyncOperation(org.greenrobot.greendao.async.AsyncOperation.OperationType r1, org.greenrobot.greendao.AbstractDao<?, ?> r2, org.greenrobot.greendao.database.Database r3, java.lang.Object r4, int r5) {
            r0 = this;
            r0.<init>()
            r0.type = r1
            r0.flags = r5
            r0.dao = r2
            r0.database = r3
            r0.parameter = r4
            r1 = r5 & 4
            if (r1 == 0) goto L19
            java.lang.Exception r1 = new java.lang.Exception
            java.lang.String r2 = "AsyncOperation was created here"
            r1.<init>(r2)
            goto L1a
        L19:
            r1 = 0
        L1a:
            r0.creatorStacktrace = r1
            return
    }

    public java.lang.Exception getCreatorStacktrace() {
            r1 = this;
            java.lang.Exception r0 = r1.creatorStacktrace
            return r0
    }

    org.greenrobot.greendao.database.Database getDatabase() {
            r1 = this;
            org.greenrobot.greendao.database.Database r0 = r1.database
            if (r0 == 0) goto L5
            goto Lb
        L5:
            org.greenrobot.greendao.AbstractDao<java.lang.Object, java.lang.Object> r0 = r1.dao
            org.greenrobot.greendao.database.Database r0 = r0.getDatabase()
        Lb:
            return r0
    }

    public long getDuration() {
            r4 = this;
            long r0 = r4.timeCompleted
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Le
            long r0 = r4.timeCompleted
            long r2 = r4.timeStarted
            long r0 = r0 - r2
            return r0
        Le:
            org.greenrobot.greendao.DaoException r0 = new org.greenrobot.greendao.DaoException
            java.lang.String r1 = "This operation did not yet complete"
            r0.<init>(r1)
            throw r0
    }

    public int getMergedOperationsCount() {
            r1 = this;
            int r0 = r1.mergedOperationsCount
            return r0
    }

    public java.lang.Object getParameter() {
            r1 = this;
            java.lang.Object r0 = r1.parameter
            return r0
    }

    public synchronized java.lang.Object getResult() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.completed     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L8
            r2.waitForCompletion()     // Catch: java.lang.Throwable -> L18
        L8:
            java.lang.Throwable r0 = r2.throwable     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L10
            java.lang.Object r0 = r2.result     // Catch: java.lang.Throwable -> L18
            monitor-exit(r2)
            return r0
        L10:
            org.greenrobot.greendao.async.AsyncDaoException r0 = new org.greenrobot.greendao.async.AsyncDaoException     // Catch: java.lang.Throwable -> L18
            java.lang.Throwable r1 = r2.throwable     // Catch: java.lang.Throwable -> L18
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L18
            throw r0     // Catch: java.lang.Throwable -> L18
        L18:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public int getSequenceNumber() {
            r1 = this;
            int r0 = r1.sequenceNumber
            return r0
    }

    public java.lang.Throwable getThrowable() {
            r1 = this;
            java.lang.Throwable r0 = r1.throwable
            return r0
    }

    public long getTimeCompleted() {
            r2 = this;
            long r0 = r2.timeCompleted
            return r0
    }

    public long getTimeStarted() {
            r2 = this;
            long r0 = r2.timeStarted
            return r0
    }

    public org.greenrobot.greendao.async.AsyncOperation.OperationType getType() {
            r1 = this;
            org.greenrobot.greendao.async.AsyncOperation$OperationType r0 = r1.type
            return r0
    }

    public boolean isCompleted() {
            r1 = this;
            boolean r0 = r1.completed
            return r0
    }

    public boolean isCompletedSucessfully() {
            r1 = this;
            boolean r0 = r1.completed
            if (r0 == 0) goto La
            java.lang.Throwable r0 = r1.throwable
            if (r0 != 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    public boolean isFailed() {
            r1 = this;
            java.lang.Throwable r0 = r1.throwable
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public boolean isMergeTx() {
            r2 = this;
            int r0 = r2.flags
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L7
            goto L8
        L7:
            r1 = 0
        L8:
            return r1
    }

    boolean isMergeableWith(org.greenrobot.greendao.async.AsyncOperation r2) {
            r1 = this;
            if (r2 == 0) goto L1a
            boolean r0 = r1.isMergeTx()
            if (r0 == 0) goto L1a
            boolean r0 = r2.isMergeTx()
            if (r0 == 0) goto L1a
            org.greenrobot.greendao.database.Database r0 = r1.getDatabase()
            org.greenrobot.greendao.database.Database r2 = r2.getDatabase()
            if (r0 != r2) goto L1a
            r2 = 1
            goto L1b
        L1a:
            r2 = 0
        L1b:
            return r2
    }

    void reset() {
            r2 = this;
            r0 = 0
            r2.timeStarted = r0
            r2.timeCompleted = r0
            r0 = 0
            r2.completed = r0
            r1 = 0
            r2.throwable = r1
            r2.result = r1
            r2.mergedOperationsCount = r0
            return
    }

    synchronized void setCompleted() {
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            r1.completed = r0     // Catch: java.lang.Throwable -> L9
            r1.notifyAll()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return
        L9:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public void setThrowable(java.lang.Throwable r1) {
            r0 = this;
            r0.throwable = r1
            return
    }

    public synchronized java.lang.Object waitForCompletion() {
            r3 = this;
            monitor-enter(r3)
        L1:
            boolean r0 = r3.completed     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L12
            r3.wait()     // Catch: java.lang.InterruptedException -> L9 java.lang.Throwable -> L16
            goto L1
        L9:
            r0 = move-exception
            org.greenrobot.greendao.DaoException r1 = new org.greenrobot.greendao.DaoException     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = "Interrupted while waiting for operation to complete"
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L16
            throw r1     // Catch: java.lang.Throwable -> L16
        L12:
            java.lang.Object r0 = r3.result     // Catch: java.lang.Throwable -> L16
            monitor-exit(r3)
            return r0
        L16:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    public synchronized boolean waitForCompletion(int r3) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.completed     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L13
            long r0 = (long) r3
            r2.wait(r0)     // Catch: java.lang.InterruptedException -> La java.lang.Throwable -> L17
            goto L13
        La:
            r3 = move-exception
            org.greenrobot.greendao.DaoException r0 = new org.greenrobot.greendao.DaoException     // Catch: java.lang.Throwable -> L17
            java.lang.String r1 = "Interrupted while waiting for operation to complete"
            r0.<init>(r1, r3)     // Catch: java.lang.Throwable -> L17
            throw r0     // Catch: java.lang.Throwable -> L17
        L13:
            boolean r3 = r2.completed     // Catch: java.lang.Throwable -> L17
            monitor-exit(r2)
            return r3
        L17:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }
}
