package androidx.arch.core.executor;

/* loaded from: classes.dex */
public class DefaultTaskExecutor extends androidx.arch.core.executor.TaskExecutor {
    private final java.util.concurrent.ExecutorService mDiskIO;
    private final java.lang.Object mLock;
    private volatile android.os.Handler mMainHandler;


    public DefaultTaskExecutor() {
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.mLock = r0
            androidx.arch.core.executor.DefaultTaskExecutor$1 r0 = new androidx.arch.core.executor.DefaultTaskExecutor$1
            r0.<init>(r2)
            r1 = 4
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newFixedThreadPool(r1, r0)
            r2.mDiskIO = r0
            return
    }

    private static android.os.Handler createAsync(android.os.Looper r7) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            android.os.Handler r7 = android.os.Handler.createAsync(r7)
            return r7
        Lb:
            java.lang.Class<android.os.Handler> r0 = android.os.Handler.class
            r1 = 3
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L37 java.lang.Throwable -> L3d
            java.lang.Class<android.os.Looper> r3 = android.os.Looper.class
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.reflect.InvocationTargetException -> L37 java.lang.Throwable -> L3d
            java.lang.Class<android.os.Handler$Callback> r3 = android.os.Handler.Callback.class
            r5 = 1
            r2[r5] = r3     // Catch: java.lang.reflect.InvocationTargetException -> L37 java.lang.Throwable -> L3d
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L37 java.lang.Throwable -> L3d
            r6 = 2
            r2[r6] = r3     // Catch: java.lang.reflect.InvocationTargetException -> L37 java.lang.Throwable -> L3d
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L37 java.lang.Throwable -> L3d
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L37 java.lang.Throwable -> L3d
            r1[r4] = r7     // Catch: java.lang.reflect.InvocationTargetException -> L37 java.lang.Throwable -> L3d
            r2 = 0
            r1[r5] = r2     // Catch: java.lang.reflect.InvocationTargetException -> L37 java.lang.Throwable -> L3d
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L37 java.lang.Throwable -> L3d
            r1[r6] = r2     // Catch: java.lang.reflect.InvocationTargetException -> L37 java.lang.Throwable -> L3d
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L37 java.lang.Throwable -> L3d
            android.os.Handler r0 = (android.os.Handler) r0     // Catch: java.lang.reflect.InvocationTargetException -> L37 java.lang.Throwable -> L3d
            return r0
        L37:
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r7)
            return r0
        L3d:
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r7)
            return r0
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public void executeOnDiskIO(java.lang.Runnable r2) {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.mDiskIO
            r0.execute(r2)
            return
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public boolean isMainThread() {
            r2 = this;
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 != r1) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public void postToMainThread(java.lang.Runnable r3) {
            r2 = this;
            android.os.Handler r0 = r2.mMainHandler
            if (r0 != 0) goto L1a
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            android.os.Handler r1 = r2.mMainHandler     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L15
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L17
            android.os.Handler r1 = createAsync(r1)     // Catch: java.lang.Throwable -> L17
            r2.mMainHandler = r1     // Catch: java.lang.Throwable -> L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            goto L1a
        L17:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r3
        L1a:
            android.os.Handler r0 = r2.mMainHandler
            r0.post(r3)
            return
    }
}
