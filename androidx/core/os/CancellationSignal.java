package androidx.core.os;

/* loaded from: classes.dex */
public final class CancellationSignal {
    private boolean mCancelInProgress;
    private java.lang.Object mCancellationSignalObj;
    private boolean mIsCanceled;
    private androidx.core.os.CancellationSignal.OnCancelListener mOnCancelListener;

    public interface OnCancelListener {
        void onCancel();
    }

    public CancellationSignal() {
            r0 = this;
            r0.<init>()
            return
    }

    private void waitForCancelFinishedLocked() {
            r1 = this;
        L0:
            boolean r0 = r1.mCancelInProgress
            if (r0 == 0) goto L8
            r1.wait()     // Catch: java.lang.InterruptedException -> L0
            goto L0
        L8:
            return
    }

    public void cancel() {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.mIsCanceled     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L7
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L38
            return
        L7:
            r0 = 1
            r3.mIsCanceled = r0     // Catch: java.lang.Throwable -> L38
            r3.mCancelInProgress = r0     // Catch: java.lang.Throwable -> L38
            androidx.core.os.CancellationSignal$OnCancelListener r0 = r3.mOnCancelListener     // Catch: java.lang.Throwable -> L38
            java.lang.Object r1 = r3.mCancellationSignalObj     // Catch: java.lang.Throwable -> L38
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L38
            r2 = 0
            if (r0 == 0) goto L1a
            r0.onCancel()     // Catch: java.lang.Throwable -> L18
            goto L1a
        L18:
            r0 = move-exception
            goto L22
        L1a:
            if (r1 == 0) goto L2d
            android.os.CancellationSignal r1 = (android.os.CancellationSignal) r1     // Catch: java.lang.Throwable -> L18
            r1.cancel()     // Catch: java.lang.Throwable -> L18
            goto L2d
        L22:
            monitor-enter(r3)
            r3.mCancelInProgress = r2     // Catch: java.lang.Throwable -> L2a
            r3.notifyAll()     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2a
            throw r0
        L2a:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2a
            throw r0
        L2d:
            monitor-enter(r3)
            r3.mCancelInProgress = r2     // Catch: java.lang.Throwable -> L35
            r3.notifyAll()     // Catch: java.lang.Throwable -> L35
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L35
            return
        L35:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L35
            throw r0
        L38:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L38
            throw r0
    }

    public java.lang.Object getCancellationSignalObject() {
            r2 = this;
            monitor-enter(r2)
            java.lang.Object r0 = r2.mCancellationSignalObj     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L16
            android.os.CancellationSignal r0 = new android.os.CancellationSignal     // Catch: java.lang.Throwable -> L1a
            r0.<init>()     // Catch: java.lang.Throwable -> L1a
            r2.mCancellationSignalObj = r0     // Catch: java.lang.Throwable -> L1a
            boolean r1 = r2.mIsCanceled     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L16
            r1 = r0
            android.os.CancellationSignal r1 = (android.os.CancellationSignal) r1     // Catch: java.lang.Throwable -> L1a
            r0.cancel()     // Catch: java.lang.Throwable -> L1a
        L16:
            java.lang.Object r0 = r2.mCancellationSignalObj     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1a
            return r0
        L1a:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1a
            throw r0
    }

    public boolean isCanceled() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.mIsCanceled     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public void setOnCancelListener(androidx.core.os.CancellationSignal.OnCancelListener r2) {
            r1 = this;
            monitor-enter(r1)
            r1.waitForCancelFinishedLocked()     // Catch: java.lang.Throwable -> L1a
            androidx.core.os.CancellationSignal$OnCancelListener r0 = r1.mOnCancelListener     // Catch: java.lang.Throwable -> L1a
            if (r0 != r2) goto La
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            return
        La:
            r1.mOnCancelListener = r2     // Catch: java.lang.Throwable -> L1a
            boolean r0 = r1.mIsCanceled     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L18
            if (r2 != 0) goto L13
            goto L18
        L13:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            r2.onCancel()
            return
        L18:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            return
        L1a:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            throw r2
    }

    public void throwIfCanceled() {
            r1 = this;
            boolean r0 = r1.isCanceled()
            if (r0 != 0) goto L7
            return
        L7:
            androidx.core.os.OperationCanceledException r0 = new androidx.core.os.OperationCanceledException
            r0.<init>()
            throw r0
    }
}
