package io.reactivex.internal.util;

/* loaded from: classes.dex */
public final class BlockingHelper {
    private BlockingHelper() {
            r2 = this;
            r2.<init>()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No instances!"
            r0.<init>(r1)
            throw r0
    }

    public static void awaitForComplete(java.util.concurrent.CountDownLatch r4, io.reactivex.disposables.Disposable r5) {
            long r0 = r4.getCount()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto Lb
            return
        Lb:
            verifyNonBlocking()     // Catch: java.lang.InterruptedException -> L12
            r4.await()     // Catch: java.lang.InterruptedException -> L12
            return
        L12:
            r4 = move-exception
            r5.dispose()
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            r5.interrupt()
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Interrupted while waiting for subscription to complete."
            r5.<init>(r0, r4)
            throw r5
    }

    public static void verifyNonBlocking() {
            boolean r0 = io.reactivex.plugins.RxJavaPlugins.isFailOnNonBlockingScheduler()
            if (r0 == 0) goto L38
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r0 = r0 instanceof io.reactivex.internal.schedulers.NonBlockingThread
            if (r0 != 0) goto L15
            boolean r0 = io.reactivex.plugins.RxJavaPlugins.onBeforeBlocking()
            if (r0 != 0) goto L15
            goto L38
        L15:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Attempt to block on a Scheduler "
            r1.<init>(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " that doesn't support blocking operators as they may lead to deadlock"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L38:
            return
    }
}
