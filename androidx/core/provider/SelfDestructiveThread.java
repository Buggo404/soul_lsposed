package androidx.core.provider;

@java.lang.Deprecated
/* loaded from: classes.dex */
public class SelfDestructiveThread {
    private static final int MSG_DESTRUCTION = 0;
    private static final int MSG_INVOKE_RUNNABLE = 1;
    private android.os.Handler.Callback mCallback;
    private final int mDestructAfterMillisec;
    private int mGeneration;
    private android.os.Handler mHandler;
    private final java.lang.Object mLock;
    private final int mPriority;
    private android.os.HandlerThread mThread;
    private final java.lang.String mThreadName;




    public interface ReplyCallback<T> {
        void onReply(T r1);
    }

    public SelfDestructiveThread(java.lang.String r2, int r3, int r4) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.mLock = r0
            androidx.core.provider.SelfDestructiveThread$1 r0 = new androidx.core.provider.SelfDestructiveThread$1
            r0.<init>(r1)
            r1.mCallback = r0
            r1.mThreadName = r2
            r1.mPriority = r3
            r1.mDestructAfterMillisec = r4
            r2 = 0
            r1.mGeneration = r2
            return
    }

    private void post(java.lang.Runnable r6) {
            r5 = this;
            java.lang.Object r0 = r5.mLock
            monitor-enter(r0)
            android.os.HandlerThread r1 = r5.mThread     // Catch: java.lang.Throwable -> L3b
            r2 = 1
            if (r1 != 0) goto L2a
            android.os.HandlerThread r1 = new android.os.HandlerThread     // Catch: java.lang.Throwable -> L3b
            java.lang.String r3 = r5.mThreadName     // Catch: java.lang.Throwable -> L3b
            int r4 = r5.mPriority     // Catch: java.lang.Throwable -> L3b
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L3b
            r5.mThread = r1     // Catch: java.lang.Throwable -> L3b
            r1.start()     // Catch: java.lang.Throwable -> L3b
            android.os.Handler r1 = new android.os.Handler     // Catch: java.lang.Throwable -> L3b
            android.os.HandlerThread r3 = r5.mThread     // Catch: java.lang.Throwable -> L3b
            android.os.Looper r3 = r3.getLooper()     // Catch: java.lang.Throwable -> L3b
            android.os.Handler$Callback r4 = r5.mCallback     // Catch: java.lang.Throwable -> L3b
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L3b
            r5.mHandler = r1     // Catch: java.lang.Throwable -> L3b
            int r1 = r5.mGeneration     // Catch: java.lang.Throwable -> L3b
            int r1 = r1 + r2
            r5.mGeneration = r1     // Catch: java.lang.Throwable -> L3b
        L2a:
            android.os.Handler r1 = r5.mHandler     // Catch: java.lang.Throwable -> L3b
            r3 = 0
            r1.removeMessages(r3)     // Catch: java.lang.Throwable -> L3b
            android.os.Handler r1 = r5.mHandler     // Catch: java.lang.Throwable -> L3b
            android.os.Message r6 = r1.obtainMessage(r2, r6)     // Catch: java.lang.Throwable -> L3b
            r1.sendMessage(r6)     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3b
            return
        L3b:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3b
            throw r6
    }

    public int getGeneration() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            int r1 = r2.mGeneration     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public boolean isRunning() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            android.os.HandlerThread r1 = r2.mThread     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return r1
        Lc:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r1
    }

    void onDestruction() {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            android.os.Handler r1 = r3.mHandler     // Catch: java.lang.Throwable -> L1a
            r2 = 1
            boolean r1 = r1.hasMessages(r2)     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            return
        Le:
            android.os.HandlerThread r1 = r3.mThread     // Catch: java.lang.Throwable -> L1a
            r1.quit()     // Catch: java.lang.Throwable -> L1a
            r1 = 0
            r3.mThread = r1     // Catch: java.lang.Throwable -> L1a
            r3.mHandler = r1     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            return
        L1a:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r1
    }

    void onInvokeRunnable(java.lang.Runnable r5) {
            r4 = this;
            r5.run()
            java.lang.Object r5 = r4.mLock
            monitor-enter(r5)
            android.os.Handler r0 = r4.mHandler     // Catch: java.lang.Throwable -> L1a
            r1 = 0
            r0.removeMessages(r1)     // Catch: java.lang.Throwable -> L1a
            android.os.Handler r0 = r4.mHandler     // Catch: java.lang.Throwable -> L1a
            android.os.Message r1 = r0.obtainMessage(r1)     // Catch: java.lang.Throwable -> L1a
            int r2 = r4.mDestructAfterMillisec     // Catch: java.lang.Throwable -> L1a
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L1a
            r0.sendMessageDelayed(r1, r2)     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L1a
            return
        L1a:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L1a
            throw r0
    }

    public <T> void postAndReply(java.util.concurrent.Callable<T> r3, androidx.core.provider.SelfDestructiveThread.ReplyCallback<T> r4) {
            r2 = this;
            android.os.Handler r0 = androidx.core.provider.CalleeHandler.create()
            androidx.core.provider.SelfDestructiveThread$2 r1 = new androidx.core.provider.SelfDestructiveThread$2
            r1.<init>(r2, r3, r0, r4)
            r2.post(r1)
            return
    }

    public <T> T postAndWait(java.util.concurrent.Callable<T> r13, int r14) throws java.lang.InterruptedException {
            r12 = this;
            java.util.concurrent.locks.ReentrantLock r7 = new java.util.concurrent.locks.ReentrantLock
            r7.<init>()
            java.util.concurrent.locks.Condition r8 = r7.newCondition()
            java.util.concurrent.atomic.AtomicReference r9 = new java.util.concurrent.atomic.AtomicReference
            r9.<init>()
            java.util.concurrent.atomic.AtomicBoolean r10 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 1
            r10.<init>(r0)
            androidx.core.provider.SelfDestructiveThread$3 r11 = new androidx.core.provider.SelfDestructiveThread$3
            r0 = r11
            r1 = r12
            r2 = r9
            r3 = r13
            r4 = r7
            r5 = r10
            r6 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r12.post(r11)
            r7.lock()
            boolean r13 = r10.get()     // Catch: java.lang.Throwable -> L5c
            if (r13 != 0) goto L34
            java.lang.Object r13 = r9.get()     // Catch: java.lang.Throwable -> L5c
            r7.unlock()
            return r13
        L34:
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L5c
            long r0 = (long) r14     // Catch: java.lang.Throwable -> L5c
            long r13 = r13.toNanos(r0)     // Catch: java.lang.Throwable -> L5c
        L3b:
            long r13 = r8.awaitNanos(r13)     // Catch: java.lang.InterruptedException -> L3f java.lang.Throwable -> L5c
        L3f:
            boolean r0 = r10.get()     // Catch: java.lang.Throwable -> L5c
            if (r0 != 0) goto L4d
            java.lang.Object r13 = r9.get()     // Catch: java.lang.Throwable -> L5c
            r7.unlock()
            return r13
        L4d:
            r0 = 0
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 <= 0) goto L54
            goto L3b
        L54:
            java.lang.InterruptedException r13 = new java.lang.InterruptedException     // Catch: java.lang.Throwable -> L5c
            java.lang.String r14 = "timeout"
            r13.<init>(r14)     // Catch: java.lang.Throwable -> L5c
            throw r13     // Catch: java.lang.Throwable -> L5c
        L5c:
            r13 = move-exception
            r7.unlock()
            throw r13
    }
}
