package androidx.arch.core.executor;

/* loaded from: classes.dex */
public class ArchTaskExecutor extends androidx.arch.core.executor.TaskExecutor {
    private static final java.util.concurrent.Executor sIOThreadExecutor = null;
    private static volatile androidx.arch.core.executor.ArchTaskExecutor sInstance;
    private static final java.util.concurrent.Executor sMainThreadExecutor = null;
    private androidx.arch.core.executor.TaskExecutor mDefaultTaskExecutor;
    private androidx.arch.core.executor.TaskExecutor mDelegate;



    static {
            androidx.arch.core.executor.ArchTaskExecutor$1 r0 = new androidx.arch.core.executor.ArchTaskExecutor$1
            r0.<init>()
            androidx.arch.core.executor.ArchTaskExecutor.sMainThreadExecutor = r0
            androidx.arch.core.executor.ArchTaskExecutor$2 r0 = new androidx.arch.core.executor.ArchTaskExecutor$2
            r0.<init>()
            androidx.arch.core.executor.ArchTaskExecutor.sIOThreadExecutor = r0
            return
    }

    private ArchTaskExecutor() {
            r1 = this;
            r1.<init>()
            androidx.arch.core.executor.DefaultTaskExecutor r0 = new androidx.arch.core.executor.DefaultTaskExecutor
            r0.<init>()
            r1.mDefaultTaskExecutor = r0
            r1.mDelegate = r0
            return
    }

    public static java.util.concurrent.Executor getIOThreadExecutor() {
            java.util.concurrent.Executor r0 = androidx.arch.core.executor.ArchTaskExecutor.sIOThreadExecutor
            return r0
    }

    public static androidx.arch.core.executor.ArchTaskExecutor getInstance() {
            androidx.arch.core.executor.ArchTaskExecutor r0 = androidx.arch.core.executor.ArchTaskExecutor.sInstance
            if (r0 == 0) goto L7
            androidx.arch.core.executor.ArchTaskExecutor r0 = androidx.arch.core.executor.ArchTaskExecutor.sInstance
            return r0
        L7:
            java.lang.Class<androidx.arch.core.executor.ArchTaskExecutor> r0 = androidx.arch.core.executor.ArchTaskExecutor.class
            monitor-enter(r0)
            androidx.arch.core.executor.ArchTaskExecutor r1 = androidx.arch.core.executor.ArchTaskExecutor.sInstance     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L15
            androidx.arch.core.executor.ArchTaskExecutor r1 = new androidx.arch.core.executor.ArchTaskExecutor     // Catch: java.lang.Throwable -> L19
            r1.<init>()     // Catch: java.lang.Throwable -> L19
            androidx.arch.core.executor.ArchTaskExecutor.sInstance = r1     // Catch: java.lang.Throwable -> L19
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            androidx.arch.core.executor.ArchTaskExecutor r0 = androidx.arch.core.executor.ArchTaskExecutor.sInstance
            return r0
        L19:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r1
    }

    public static java.util.concurrent.Executor getMainThreadExecutor() {
            java.util.concurrent.Executor r0 = androidx.arch.core.executor.ArchTaskExecutor.sMainThreadExecutor
            return r0
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public void executeOnDiskIO(java.lang.Runnable r2) {
            r1 = this;
            androidx.arch.core.executor.TaskExecutor r0 = r1.mDelegate
            r0.executeOnDiskIO(r2)
            return
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public boolean isMainThread() {
            r1 = this;
            androidx.arch.core.executor.TaskExecutor r0 = r1.mDelegate
            boolean r0 = r0.isMainThread()
            return r0
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public void postToMainThread(java.lang.Runnable r2) {
            r1 = this;
            androidx.arch.core.executor.TaskExecutor r0 = r1.mDelegate
            r0.postToMainThread(r2)
            return
    }

    public void setDelegate(androidx.arch.core.executor.TaskExecutor r1) {
            r0 = this;
            if (r1 != 0) goto L4
            androidx.arch.core.executor.TaskExecutor r1 = r0.mDefaultTaskExecutor
        L4:
            r0.mDelegate = r1
            return
    }
}
