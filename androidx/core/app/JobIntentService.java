package androidx.core.app;

/* loaded from: classes.dex */
public abstract class JobIntentService extends android.app.Service {
    static final boolean DEBUG = false;
    static final java.lang.String TAG = "JobIntentService";
    static final java.util.HashMap<android.content.ComponentName, androidx.core.app.JobIntentService.WorkEnqueuer> sClassWorkEnqueuer = null;
    static final java.lang.Object sLock = null;
    final java.util.ArrayList<androidx.core.app.JobIntentService.CompatWorkItem> mCompatQueue;
    androidx.core.app.JobIntentService.WorkEnqueuer mCompatWorkEnqueuer;
    androidx.core.app.JobIntentService.CommandProcessor mCurProcessor;
    boolean mDestroyed;
    boolean mInterruptIfStopped;
    androidx.core.app.JobIntentService.CompatJobEngine mJobImpl;
    boolean mStopped;

    final class CommandProcessor extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Void> {
        final /* synthetic */ androidx.core.app.JobIntentService this$0;

        CommandProcessor(androidx.core.app.JobIntentService r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // android.os.AsyncTask
        protected /* bridge */ /* synthetic */ java.lang.Void doInBackground(java.lang.Void[] r1) {
                r0 = this;
                java.lang.Void[] r1 = (java.lang.Void[]) r1
                java.lang.Void r1 = r0.doInBackground2(r1)
                return r1
        }

        /* renamed from: doInBackground, reason: avoid collision after fix types in other method */
        protected java.lang.Void doInBackground2(java.lang.Void... r3) {
                r2 = this;
            L0:
                androidx.core.app.JobIntentService r3 = r2.this$0
                androidx.core.app.JobIntentService$GenericWorkItem r3 = r3.dequeueWork()
                if (r3 == 0) goto L15
                androidx.core.app.JobIntentService r0 = r2.this$0
                android.content.Intent r1 = r3.getIntent()
                r0.onHandleWork(r1)
                r3.complete()
                goto L0
            L15:
                r3 = 0
                return r3
        }

        @Override // android.os.AsyncTask
        protected /* bridge */ /* synthetic */ void onCancelled(java.lang.Void r1) {
                r0 = this;
                java.lang.Void r1 = (java.lang.Void) r1
                r0.onCancelled2(r1)
                return
        }

        /* renamed from: onCancelled, reason: avoid collision after fix types in other method */
        protected void onCancelled2(java.lang.Void r1) {
                r0 = this;
                androidx.core.app.JobIntentService r1 = r0.this$0
                r1.processorFinished()
                return
        }

        @Override // android.os.AsyncTask
        protected /* bridge */ /* synthetic */ void onPostExecute(java.lang.Void r1) {
                r0 = this;
                java.lang.Void r1 = (java.lang.Void) r1
                r0.onPostExecute2(r1)
                return
        }

        /* renamed from: onPostExecute, reason: avoid collision after fix types in other method */
        protected void onPostExecute2(java.lang.Void r1) {
                r0 = this;
                androidx.core.app.JobIntentService r1 = r0.this$0
                r1.processorFinished()
                return
        }
    }

    interface CompatJobEngine {
        android.os.IBinder compatGetBinder();

        androidx.core.app.JobIntentService.GenericWorkItem dequeueWork();
    }

    static final class CompatWorkEnqueuer extends androidx.core.app.JobIntentService.WorkEnqueuer {
        private final android.content.Context mContext;
        private final android.os.PowerManager.WakeLock mLaunchWakeLock;
        boolean mLaunchingService;
        private final android.os.PowerManager.WakeLock mRunWakeLock;
        boolean mServiceProcessing;

        CompatWorkEnqueuer(android.content.Context r4, android.content.ComponentName r5) {
                r3 = this;
                r3.<init>(r5)
                android.content.Context r0 = r4.getApplicationContext()
                r3.mContext = r0
                java.lang.String r0 = "power"
                java.lang.Object r4 = r4.getSystemService(r0)
                android.os.PowerManager r4 = (android.os.PowerManager) r4
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r5.getClassName()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ":launch"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 1
                android.os.PowerManager$WakeLock r0 = r4.newWakeLock(r1, r0)
                r3.mLaunchWakeLock = r0
                r2 = 0
                r0.setReferenceCounted(r2)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r5 = r5.getClassName()
                java.lang.StringBuilder r5 = r0.append(r5)
                java.lang.String r0 = ":run"
                java.lang.StringBuilder r5 = r5.append(r0)
                java.lang.String r5 = r5.toString()
                android.os.PowerManager$WakeLock r4 = r4.newWakeLock(r1, r5)
                r3.mRunWakeLock = r4
                r4.setReferenceCounted(r2)
                return
        }

        @Override // androidx.core.app.JobIntentService.WorkEnqueuer
        void enqueueWork(android.content.Intent r3) {
                r2 = this;
                android.content.Intent r0 = new android.content.Intent
                r0.<init>(r3)
                android.content.ComponentName r3 = r2.mComponentName
                r0.setComponent(r3)
                android.content.Context r3 = r2.mContext
                android.content.ComponentName r3 = r3.startService(r0)
                if (r3 == 0) goto L2b
                monitor-enter(r2)
                boolean r3 = r2.mLaunchingService     // Catch: java.lang.Throwable -> L28
                if (r3 != 0) goto L26
                r3 = 1
                r2.mLaunchingService = r3     // Catch: java.lang.Throwable -> L28
                boolean r3 = r2.mServiceProcessing     // Catch: java.lang.Throwable -> L28
                if (r3 != 0) goto L26
                android.os.PowerManager$WakeLock r3 = r2.mLaunchWakeLock     // Catch: java.lang.Throwable -> L28
                r0 = 60000(0xea60, double:2.9644E-319)
                r3.acquire(r0)     // Catch: java.lang.Throwable -> L28
            L26:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L28
                goto L2b
            L28:
                r3 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L28
                throw r3
            L2b:
                return
        }

        @Override // androidx.core.app.JobIntentService.WorkEnqueuer
        public void serviceProcessingFinished() {
                r3 = this;
                monitor-enter(r3)
                boolean r0 = r3.mServiceProcessing     // Catch: java.lang.Throwable -> L1b
                if (r0 == 0) goto L19
                boolean r0 = r3.mLaunchingService     // Catch: java.lang.Throwable -> L1b
                if (r0 == 0) goto L11
                android.os.PowerManager$WakeLock r0 = r3.mLaunchWakeLock     // Catch: java.lang.Throwable -> L1b
                r1 = 60000(0xea60, double:2.9644E-319)
                r0.acquire(r1)     // Catch: java.lang.Throwable -> L1b
            L11:
                r0 = 0
                r3.mServiceProcessing = r0     // Catch: java.lang.Throwable -> L1b
                android.os.PowerManager$WakeLock r0 = r3.mRunWakeLock     // Catch: java.lang.Throwable -> L1b
                r0.release()     // Catch: java.lang.Throwable -> L1b
            L19:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L1b
                return
            L1b:
                r0 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L1b
                throw r0
        }

        @Override // androidx.core.app.JobIntentService.WorkEnqueuer
        public void serviceProcessingStarted() {
                r3 = this;
                monitor-enter(r3)
                boolean r0 = r3.mServiceProcessing     // Catch: java.lang.Throwable -> L17
                if (r0 != 0) goto L15
                r0 = 1
                r3.mServiceProcessing = r0     // Catch: java.lang.Throwable -> L17
                android.os.PowerManager$WakeLock r0 = r3.mRunWakeLock     // Catch: java.lang.Throwable -> L17
                r1 = 600000(0x927c0, double:2.964394E-318)
                r0.acquire(r1)     // Catch: java.lang.Throwable -> L17
                android.os.PowerManager$WakeLock r0 = r3.mLaunchWakeLock     // Catch: java.lang.Throwable -> L17
                r0.release()     // Catch: java.lang.Throwable -> L17
            L15:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L17
                return
            L17:
                r0 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L17
                throw r0
        }

        @Override // androidx.core.app.JobIntentService.WorkEnqueuer
        public void serviceStartReceived() {
                r1 = this;
                monitor-enter(r1)
                r0 = 0
                r1.mLaunchingService = r0     // Catch: java.lang.Throwable -> L6
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L6
                return
            L6:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L6
                throw r0
        }
    }

    final class CompatWorkItem implements androidx.core.app.JobIntentService.GenericWorkItem {
        final android.content.Intent mIntent;
        final int mStartId;
        final /* synthetic */ androidx.core.app.JobIntentService this$0;

        CompatWorkItem(androidx.core.app.JobIntentService r1, android.content.Intent r2, int r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.mIntent = r2
                r0.mStartId = r3
                return
        }

        @Override // androidx.core.app.JobIntentService.GenericWorkItem
        public void complete() {
                r2 = this;
                androidx.core.app.JobIntentService r0 = r2.this$0
                int r1 = r2.mStartId
                r0.stopSelf(r1)
                return
        }

        @Override // androidx.core.app.JobIntentService.GenericWorkItem
        public android.content.Intent getIntent() {
                r1 = this;
                android.content.Intent r0 = r1.mIntent
                return r0
        }
    }

    interface GenericWorkItem {
        void complete();

        android.content.Intent getIntent();
    }

    static final class JobServiceEngineImpl extends android.app.job.JobServiceEngine implements androidx.core.app.JobIntentService.CompatJobEngine {
        static final boolean DEBUG = false;
        static final java.lang.String TAG = "JobServiceEngineImpl";
        final java.lang.Object mLock;
        android.app.job.JobParameters mParams;
        final androidx.core.app.JobIntentService mService;

        final class WrapperWorkItem implements androidx.core.app.JobIntentService.GenericWorkItem {
            final android.app.job.JobWorkItem mJobWork;
            final /* synthetic */ androidx.core.app.JobIntentService.JobServiceEngineImpl this$0;

            WrapperWorkItem(androidx.core.app.JobIntentService.JobServiceEngineImpl r1, android.app.job.JobWorkItem r2) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    r0.mJobWork = r2
                    return
            }

            @Override // androidx.core.app.JobIntentService.GenericWorkItem
            public void complete() {
                    r3 = this;
                    androidx.core.app.JobIntentService$JobServiceEngineImpl r0 = r3.this$0
                    java.lang.Object r0 = r0.mLock
                    monitor-enter(r0)
                    androidx.core.app.JobIntentService$JobServiceEngineImpl r1 = r3.this$0     // Catch: java.lang.Throwable -> L16
                    android.app.job.JobParameters r1 = r1.mParams     // Catch: java.lang.Throwable -> L16
                    if (r1 == 0) goto L14
                    androidx.core.app.JobIntentService$JobServiceEngineImpl r1 = r3.this$0     // Catch: java.lang.Throwable -> L16
                    android.app.job.JobParameters r1 = r1.mParams     // Catch: java.lang.Throwable -> L16
                    android.app.job.JobWorkItem r2 = r3.mJobWork     // Catch: java.lang.Throwable -> L16
                    r1.completeWork(r2)     // Catch: java.lang.Throwable -> L16
                L14:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
                    return
                L16:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
                    throw r1
            }

            @Override // androidx.core.app.JobIntentService.GenericWorkItem
            public android.content.Intent getIntent() {
                    r1 = this;
                    android.app.job.JobWorkItem r0 = r1.mJobWork
                    android.content.Intent r0 = r0.getIntent()
                    return r0
            }
        }

        JobServiceEngineImpl(androidx.core.app.JobIntentService r2) {
                r1 = this;
                r1.<init>(r2)
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                r1.mLock = r0
                r1.mService = r2
                return
        }

        @Override // androidx.core.app.JobIntentService.CompatJobEngine
        public android.os.IBinder compatGetBinder() {
                r1 = this;
                android.os.IBinder r0 = r1.getBinder()
                return r0
        }

        @Override // androidx.core.app.JobIntentService.CompatJobEngine
        public androidx.core.app.JobIntentService.GenericWorkItem dequeueWork() {
                r3 = this;
                java.lang.Object r0 = r3.mLock
                monitor-enter(r0)
                android.app.job.JobParameters r1 = r3.mParams     // Catch: java.lang.Throwable -> L25
                r2 = 0
                if (r1 != 0) goto La
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
                return r2
            La:
                android.app.job.JobWorkItem r1 = r1.dequeueWork()     // Catch: java.lang.Throwable -> L25
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
                if (r1 == 0) goto L24
                android.content.Intent r0 = r1.getIntent()
                androidx.core.app.JobIntentService r2 = r3.mService
                java.lang.ClassLoader r2 = r2.getClassLoader()
                r0.setExtrasClassLoader(r2)
                androidx.core.app.JobIntentService$JobServiceEngineImpl$WrapperWorkItem r0 = new androidx.core.app.JobIntentService$JobServiceEngineImpl$WrapperWorkItem
                r0.<init>(r3, r1)
                return r0
            L24:
                return r2
            L25:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
                throw r1
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStartJob(android.app.job.JobParameters r2) {
                r1 = this;
                r1.mParams = r2
                androidx.core.app.JobIntentService r2 = r1.mService
                r0 = 0
                r2.ensureProcessorRunningLocked(r0)
                r2 = 1
                return r2
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStopJob(android.app.job.JobParameters r3) {
                r2 = this;
                androidx.core.app.JobIntentService r3 = r2.mService
                boolean r3 = r3.doStopCurrentWork()
                java.lang.Object r0 = r2.mLock
                monitor-enter(r0)
                r1 = 0
                r2.mParams = r1     // Catch: java.lang.Throwable -> Le
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
                return r3
            Le:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
                throw r3
        }
    }

    static final class JobWorkEnqueuer extends androidx.core.app.JobIntentService.WorkEnqueuer {
        private final android.app.job.JobInfo mJobInfo;
        private final android.app.job.JobScheduler mJobScheduler;

        JobWorkEnqueuer(android.content.Context r3, android.content.ComponentName r4, int r5) {
                r2 = this;
                r2.<init>(r4)
                r2.ensureJobId(r5)
                android.app.job.JobInfo$Builder r4 = new android.app.job.JobInfo$Builder
                android.content.ComponentName r0 = r2.mComponentName
                r4.<init>(r5, r0)
                r0 = 0
                android.app.job.JobInfo$Builder r4 = r4.setOverrideDeadline(r0)
                android.app.job.JobInfo r4 = r4.build()
                r2.mJobInfo = r4
                android.content.Context r3 = r3.getApplicationContext()
                java.lang.String r4 = "jobscheduler"
                java.lang.Object r3 = r3.getSystemService(r4)
                android.app.job.JobScheduler r3 = (android.app.job.JobScheduler) r3
                r2.mJobScheduler = r3
                return
        }

        @Override // androidx.core.app.JobIntentService.WorkEnqueuer
        void enqueueWork(android.content.Intent r4) {
                r3 = this;
                android.app.job.JobScheduler r0 = r3.mJobScheduler
                android.app.job.JobInfo r1 = r3.mJobInfo
                android.app.job.JobWorkItem r2 = new android.app.job.JobWorkItem
                r2.<init>(r4)
                r0.enqueue(r1, r2)
                return
        }
    }

    static abstract class WorkEnqueuer {
        final android.content.ComponentName mComponentName;
        boolean mHasJobId;
        int mJobId;

        WorkEnqueuer(android.content.ComponentName r1) {
                r0 = this;
                r0.<init>()
                r0.mComponentName = r1
                return
        }

        abstract void enqueueWork(android.content.Intent r1);

        void ensureJobId(int r4) {
                r3 = this;
                boolean r0 = r3.mHasJobId
                if (r0 != 0) goto La
                r0 = 1
                r3.mHasJobId = r0
                r3.mJobId = r4
                goto Le
            La:
                int r0 = r3.mJobId
                if (r0 != r4) goto Lf
            Le:
                return
            Lf:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Given job ID "
                r1.<init>(r2)
                java.lang.StringBuilder r4 = r1.append(r4)
                java.lang.String r1 = " is different than previous "
                java.lang.StringBuilder r4 = r4.append(r1)
                int r1 = r3.mJobId
                java.lang.StringBuilder r4 = r4.append(r1)
                java.lang.String r4 = r4.toString()
                r0.<init>(r4)
                throw r0
        }

        public void serviceProcessingFinished() {
                r0 = this;
                return
        }

        public void serviceProcessingStarted() {
                r0 = this;
                return
        }

        public void serviceStartReceived() {
                r0 = this;
                return
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.core.app.JobIntentService.sLock = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            androidx.core.app.JobIntentService.sClassWorkEnqueuer = r0
            return
    }

    public JobIntentService() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mInterruptIfStopped = r0
            r2.mStopped = r0
            r2.mDestroyed = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L14
            r0 = 0
            r2.mCompatQueue = r0
            goto L1b
        L14:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.mCompatQueue = r0
        L1b:
            return
    }

    public static void enqueueWork(android.content.Context r2, android.content.ComponentName r3, int r4, android.content.Intent r5) {
            if (r5 == 0) goto L15
            java.lang.Object r0 = androidx.core.app.JobIntentService.sLock
            monitor-enter(r0)
            r1 = 1
            androidx.core.app.JobIntentService$WorkEnqueuer r2 = getWorkEnqueuer(r2, r3, r1, r4)     // Catch: java.lang.Throwable -> L12
            r2.ensureJobId(r4)     // Catch: java.lang.Throwable -> L12
            r2.enqueueWork(r5)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r2
        L15:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "work must not be null"
            r2.<init>(r3)
            throw r2
    }

    public static void enqueueWork(android.content.Context r1, java.lang.Class<?> r2, int r3, android.content.Intent r4) {
            android.content.ComponentName r0 = new android.content.ComponentName
            r0.<init>(r1, r2)
            enqueueWork(r1, r0, r3, r4)
            return
    }

    static androidx.core.app.JobIntentService.WorkEnqueuer getWorkEnqueuer(android.content.Context r3, android.content.ComponentName r4, boolean r5, int r6) {
            java.util.HashMap<android.content.ComponentName, androidx.core.app.JobIntentService$WorkEnqueuer> r0 = androidx.core.app.JobIntentService.sClassWorkEnqueuer
            java.lang.Object r1 = r0.get(r4)
            androidx.core.app.JobIntentService$WorkEnqueuer r1 = (androidx.core.app.JobIntentService.WorkEnqueuer) r1
            if (r1 != 0) goto L29
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L20
            if (r5 == 0) goto L18
            androidx.core.app.JobIntentService$JobWorkEnqueuer r5 = new androidx.core.app.JobIntentService$JobWorkEnqueuer
            r5.<init>(r3, r4, r6)
            goto L25
        L18:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Can't be here without a job id"
            r3.<init>(r4)
            throw r3
        L20:
            androidx.core.app.JobIntentService$CompatWorkEnqueuer r5 = new androidx.core.app.JobIntentService$CompatWorkEnqueuer
            r5.<init>(r3, r4)
        L25:
            r1 = r5
            r0.put(r4, r1)
        L29:
            return r1
    }

    androidx.core.app.JobIntentService.GenericWorkItem dequeueWork() {
            r3 = this;
            androidx.core.app.JobIntentService$CompatJobEngine r0 = r3.mJobImpl
            if (r0 == 0) goto L9
            androidx.core.app.JobIntentService$GenericWorkItem r0 = r0.dequeueWork()
            return r0
        L9:
            java.util.ArrayList<androidx.core.app.JobIntentService$CompatWorkItem> r0 = r3.mCompatQueue
            monitor-enter(r0)
            java.util.ArrayList<androidx.core.app.JobIntentService$CompatWorkItem> r1 = r3.mCompatQueue     // Catch: java.lang.Throwable -> L22
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L22
            if (r1 <= 0) goto L1f
            java.util.ArrayList<androidx.core.app.JobIntentService$CompatWorkItem> r1 = r3.mCompatQueue     // Catch: java.lang.Throwable -> L22
            r2 = 0
            java.lang.Object r1 = r1.remove(r2)     // Catch: java.lang.Throwable -> L22
            androidx.core.app.JobIntentService$GenericWorkItem r1 = (androidx.core.app.JobIntentService.GenericWorkItem) r1     // Catch: java.lang.Throwable -> L22
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            return r1
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            r0 = 0
            return r0
        L22:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            throw r1
    }

    boolean doStopCurrentWork() {
            r2 = this;
            androidx.core.app.JobIntentService$CommandProcessor r0 = r2.mCurProcessor
            if (r0 == 0) goto L9
            boolean r1 = r2.mInterruptIfStopped
            r0.cancel(r1)
        L9:
            r0 = 1
            r2.mStopped = r0
            boolean r0 = r2.onStopCurrentWork()
            return r0
    }

    void ensureProcessorRunningLocked(boolean r3) {
            r2 = this;
            androidx.core.app.JobIntentService$CommandProcessor r0 = r2.mCurProcessor
            if (r0 != 0) goto L1e
            androidx.core.app.JobIntentService$CommandProcessor r0 = new androidx.core.app.JobIntentService$CommandProcessor
            r0.<init>(r2)
            r2.mCurProcessor = r0
            androidx.core.app.JobIntentService$WorkEnqueuer r0 = r2.mCompatWorkEnqueuer
            if (r0 == 0) goto L14
            if (r3 == 0) goto L14
            r0.serviceProcessingStarted()
        L14:
            androidx.core.app.JobIntentService$CommandProcessor r3 = r2.mCurProcessor
            java.util.concurrent.Executor r0 = android.os.AsyncTask.THREAD_POOL_EXECUTOR
            r1 = 0
            java.lang.Void[] r1 = new java.lang.Void[r1]
            r3.executeOnExecutor(r0, r1)
        L1e:
            return
    }

    public boolean isStopped() {
            r1 = this;
            boolean r0 = r1.mStopped
            return r0
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent r1) {
            r0 = this;
            androidx.core.app.JobIntentService$CompatJobEngine r1 = r0.mJobImpl
            if (r1 == 0) goto L9
            android.os.IBinder r1 = r1.compatGetBinder()
            return r1
        L9:
            r1 = 0
            return r1
    }

    @Override // android.app.Service
    public void onCreate() {
            r3 = this;
            super.onCreate()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            r2 = 0
            if (r0 < r1) goto L14
            androidx.core.app.JobIntentService$JobServiceEngineImpl r0 = new androidx.core.app.JobIntentService$JobServiceEngineImpl
            r0.<init>(r3)
            r3.mJobImpl = r0
            r3.mCompatWorkEnqueuer = r2
            goto L26
        L14:
            r3.mJobImpl = r2
            android.content.ComponentName r0 = new android.content.ComponentName
            java.lang.Class r1 = r3.getClass()
            r0.<init>(r3, r1)
            r1 = 0
            androidx.core.app.JobIntentService$WorkEnqueuer r0 = getWorkEnqueuer(r3, r0, r1, r1)
            r3.mCompatWorkEnqueuer = r0
        L26:
            return
    }

    @Override // android.app.Service
    public void onDestroy() {
            r2 = this;
            super.onDestroy()
            java.util.ArrayList<androidx.core.app.JobIntentService$CompatWorkItem> r0 = r2.mCompatQueue
            if (r0 == 0) goto L15
            monitor-enter(r0)
            r1 = 1
            r2.mDestroyed = r1     // Catch: java.lang.Throwable -> L12
            androidx.core.app.JobIntentService$WorkEnqueuer r1 = r2.mCompatWorkEnqueuer     // Catch: java.lang.Throwable -> L12
            r1.serviceProcessingFinished()     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            goto L15
        L12:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r1
        L15:
            return
    }

    protected abstract void onHandleWork(android.content.Intent r1);

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent r3, int r4, int r5) {
            r2 = this;
            java.util.ArrayList<androidx.core.app.JobIntentService$CompatWorkItem> r4 = r2.mCompatQueue
            if (r4 == 0) goto L28
            androidx.core.app.JobIntentService$WorkEnqueuer r4 = r2.mCompatWorkEnqueuer
            r4.serviceStartReceived()
            java.util.ArrayList<androidx.core.app.JobIntentService$CompatWorkItem> r4 = r2.mCompatQueue
            monitor-enter(r4)
            java.util.ArrayList<androidx.core.app.JobIntentService$CompatWorkItem> r0 = r2.mCompatQueue     // Catch: java.lang.Throwable -> L25
            androidx.core.app.JobIntentService$CompatWorkItem r1 = new androidx.core.app.JobIntentService$CompatWorkItem     // Catch: java.lang.Throwable -> L25
            if (r3 == 0) goto L13
            goto L18
        L13:
            android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.Throwable -> L25
            r3.<init>()     // Catch: java.lang.Throwable -> L25
        L18:
            r1.<init>(r2, r3, r5)     // Catch: java.lang.Throwable -> L25
            r0.add(r1)     // Catch: java.lang.Throwable -> L25
            r3 = 1
            r2.ensureProcessorRunningLocked(r3)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L25
            r3 = 3
            return r3
        L25:
            r3 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L25
            throw r3
        L28:
            r3 = 2
            return r3
    }

    public boolean onStopCurrentWork() {
            r1 = this;
            r0 = 1
            return r0
    }

    void processorFinished() {
            r2 = this;
            java.util.ArrayList<androidx.core.app.JobIntentService$CompatWorkItem> r0 = r2.mCompatQueue
            if (r0 == 0) goto L25
            monitor-enter(r0)
            r1 = 0
            r2.mCurProcessor = r1     // Catch: java.lang.Throwable -> L22
            java.util.ArrayList<androidx.core.app.JobIntentService$CompatWorkItem> r1 = r2.mCompatQueue     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L17
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L22
            if (r1 <= 0) goto L17
            r1 = 0
            r2.ensureProcessorRunningLocked(r1)     // Catch: java.lang.Throwable -> L22
            goto L20
        L17:
            boolean r1 = r2.mDestroyed     // Catch: java.lang.Throwable -> L22
            if (r1 != 0) goto L20
            androidx.core.app.JobIntentService$WorkEnqueuer r1 = r2.mCompatWorkEnqueuer     // Catch: java.lang.Throwable -> L22
            r1.serviceProcessingFinished()     // Catch: java.lang.Throwable -> L22
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            goto L25
        L22:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            throw r1
        L25:
            return
    }

    public void setInterruptIfStopped(boolean r1) {
            r0 = this;
            r0.mInterruptIfStopped = r1
            return
    }
}
