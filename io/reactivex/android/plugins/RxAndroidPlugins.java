package io.reactivex.android.plugins;

/* loaded from: classes.dex */
public final class RxAndroidPlugins {
    private static volatile io.reactivex.functions.Function<java.util.concurrent.Callable<io.reactivex.Scheduler>, io.reactivex.Scheduler> onInitMainThreadHandler;
    private static volatile io.reactivex.functions.Function<io.reactivex.Scheduler, io.reactivex.Scheduler> onMainThreadHandler;

    private RxAndroidPlugins() {
            r2 = this;
            r2.<init>()
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "No instances."
            r0.<init>(r1)
            throw r0
    }

    static <T, R> R apply(io.reactivex.functions.Function<T, R> r0, T r1) {
            java.lang.Object r0 = r0.apply(r1)     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = move-exception
            java.lang.RuntimeException r0 = io.reactivex.exceptions.Exceptions.propagate(r0)
            throw r0
    }

    static io.reactivex.Scheduler applyRequireNonNull(io.reactivex.functions.Function<java.util.concurrent.Callable<io.reactivex.Scheduler>, io.reactivex.Scheduler> r0, java.util.concurrent.Callable<io.reactivex.Scheduler> r1) {
            java.lang.Object r0 = apply(r0, r1)
            io.reactivex.Scheduler r0 = (io.reactivex.Scheduler) r0
            if (r0 == 0) goto L9
            return r0
        L9:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Scheduler Callable returned null"
            r0.<init>(r1)
            throw r0
    }

    static io.reactivex.Scheduler callRequireNonNull(java.util.concurrent.Callable<io.reactivex.Scheduler> r1) {
            java.lang.Object r1 = r1.call()     // Catch: java.lang.Throwable -> L11
            io.reactivex.Scheduler r1 = (io.reactivex.Scheduler) r1     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L9
            return r1
        L9:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L11
            java.lang.String r0 = "Scheduler Callable returned null"
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L11
            throw r1     // Catch: java.lang.Throwable -> L11
        L11:
            r1 = move-exception
            java.lang.RuntimeException r1 = io.reactivex.exceptions.Exceptions.propagate(r1)
            throw r1
    }

    public static io.reactivex.functions.Function<java.util.concurrent.Callable<io.reactivex.Scheduler>, io.reactivex.Scheduler> getInitMainThreadSchedulerHandler() {
            io.reactivex.functions.Function<java.util.concurrent.Callable<io.reactivex.Scheduler>, io.reactivex.Scheduler> r0 = io.reactivex.android.plugins.RxAndroidPlugins.onInitMainThreadHandler
            return r0
    }

    public static io.reactivex.functions.Function<io.reactivex.Scheduler, io.reactivex.Scheduler> getOnMainThreadSchedulerHandler() {
            io.reactivex.functions.Function<io.reactivex.Scheduler, io.reactivex.Scheduler> r0 = io.reactivex.android.plugins.RxAndroidPlugins.onMainThreadHandler
            return r0
    }

    public static io.reactivex.Scheduler initMainThreadScheduler(java.util.concurrent.Callable<io.reactivex.Scheduler> r1) {
            if (r1 == 0) goto L10
            io.reactivex.functions.Function<java.util.concurrent.Callable<io.reactivex.Scheduler>, io.reactivex.Scheduler> r0 = io.reactivex.android.plugins.RxAndroidPlugins.onInitMainThreadHandler
            if (r0 != 0) goto Lb
            io.reactivex.Scheduler r1 = callRequireNonNull(r1)
            return r1
        Lb:
            io.reactivex.Scheduler r1 = applyRequireNonNull(r0, r1)
            return r1
        L10:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "scheduler == null"
            r1.<init>(r0)
            throw r1
    }

    public static io.reactivex.Scheduler onMainThreadScheduler(io.reactivex.Scheduler r1) {
            if (r1 == 0) goto Le
            io.reactivex.functions.Function<io.reactivex.Scheduler, io.reactivex.Scheduler> r0 = io.reactivex.android.plugins.RxAndroidPlugins.onMainThreadHandler
            if (r0 != 0) goto L7
            return r1
        L7:
            java.lang.Object r1 = apply(r0, r1)
            io.reactivex.Scheduler r1 = (io.reactivex.Scheduler) r1
            return r1
        Le:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "scheduler == null"
            r1.<init>(r0)
            throw r1
    }

    public static void reset() {
            r0 = 0
            setInitMainThreadSchedulerHandler(r0)
            setMainThreadSchedulerHandler(r0)
            return
    }

    public static void setInitMainThreadSchedulerHandler(io.reactivex.functions.Function<java.util.concurrent.Callable<io.reactivex.Scheduler>, io.reactivex.Scheduler> r0) {
            io.reactivex.android.plugins.RxAndroidPlugins.onInitMainThreadHandler = r0
            return
    }

    public static void setMainThreadSchedulerHandler(io.reactivex.functions.Function<io.reactivex.Scheduler, io.reactivex.Scheduler> r0) {
            io.reactivex.android.plugins.RxAndroidPlugins.onMainThreadHandler = r0
            return
    }
}
