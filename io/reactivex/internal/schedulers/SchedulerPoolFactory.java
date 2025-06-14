package io.reactivex.internal.schedulers;

/* loaded from: classes.dex */
public final class SchedulerPoolFactory {
    static final java.util.Map<java.util.concurrent.ScheduledThreadPoolExecutor, java.lang.Object> POOLS = null;
    public static final boolean PURGE_ENABLED = false;
    static final java.lang.String PURGE_ENABLED_KEY = "rx2.purge-enabled";
    public static final int PURGE_PERIOD_SECONDS = 0;
    static final java.lang.String PURGE_PERIOD_SECONDS_KEY = "rx2.purge-period-seconds";
    static final java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ScheduledExecutorService> PURGE_THREAD = null;

    static final class PurgeProperties {
        boolean purgeEnable;
        int purgePeriod;

        PurgeProperties() {
                r0 = this;
                r0.<init>()
                return
        }

        void load(java.util.Properties r4) {
                r3 = this;
                java.lang.String r0 = "rx2.purge-enabled"
                boolean r1 = r4.containsKey(r0)
                r2 = 1
                if (r1 == 0) goto L14
                java.lang.String r0 = r4.getProperty(r0)
                boolean r0 = java.lang.Boolean.parseBoolean(r0)
                r3.purgeEnable = r0
                goto L16
            L14:
                r3.purgeEnable = r2
            L16:
                boolean r0 = r3.purgeEnable
                if (r0 == 0) goto L30
                java.lang.String r0 = "rx2.purge-period-seconds"
                boolean r1 = r4.containsKey(r0)
                if (r1 == 0) goto L30
                java.lang.String r4 = r4.getProperty(r0)     // Catch: java.lang.NumberFormatException -> L2d
                int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.NumberFormatException -> L2d
                r3.purgePeriod = r4     // Catch: java.lang.NumberFormatException -> L2d
                goto L32
            L2d:
                r3.purgePeriod = r2
                goto L32
            L30:
                r3.purgePeriod = r2
            L32:
                return
        }
    }

    static final class ScheduledTask implements java.lang.Runnable {
        ScheduledTask() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                java.util.Map<java.util.concurrent.ScheduledThreadPoolExecutor, java.lang.Object> r1 = io.reactivex.internal.schedulers.SchedulerPoolFactory.POOLS
                java.util.Set r1 = r1.keySet()
                r0.<init>(r1)
                java.util.Iterator r0 = r0.iterator()
            Lf:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L2b
                java.lang.Object r1 = r0.next()
                java.util.concurrent.ScheduledThreadPoolExecutor r1 = (java.util.concurrent.ScheduledThreadPoolExecutor) r1
                boolean r2 = r1.isShutdown()
                if (r2 == 0) goto L27
                java.util.Map<java.util.concurrent.ScheduledThreadPoolExecutor, java.lang.Object> r2 = io.reactivex.internal.schedulers.SchedulerPoolFactory.POOLS
                r2.remove(r1)
                goto Lf
            L27:
                r1.purge()
                goto Lf
            L2b:
                return
        }
    }

    static {
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            io.reactivex.internal.schedulers.SchedulerPoolFactory.PURGE_THREAD = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            io.reactivex.internal.schedulers.SchedulerPoolFactory.POOLS = r0
            java.util.Properties r0 = java.lang.System.getProperties()
            io.reactivex.internal.schedulers.SchedulerPoolFactory$PurgeProperties r1 = new io.reactivex.internal.schedulers.SchedulerPoolFactory$PurgeProperties
            r1.<init>()
            r1.load(r0)
            boolean r0 = r1.purgeEnable
            io.reactivex.internal.schedulers.SchedulerPoolFactory.PURGE_ENABLED = r0
            int r0 = r1.purgePeriod
            io.reactivex.internal.schedulers.SchedulerPoolFactory.PURGE_PERIOD_SECONDS = r0
            start()
            return
    }

    private SchedulerPoolFactory() {
            r2 = this;
            r2.<init>()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No instances!"
            r0.<init>(r1)
            throw r0
    }

    public static java.util.concurrent.ScheduledExecutorService create(java.util.concurrent.ThreadFactory r1) {
            r0 = 1
            java.util.concurrent.ScheduledExecutorService r1 = java.util.concurrent.Executors.newScheduledThreadPool(r0, r1)
            boolean r0 = io.reactivex.internal.schedulers.SchedulerPoolFactory.PURGE_ENABLED
            tryPutIntoPool(r0, r1)
            return r1
    }

    public static void shutdown() {
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ScheduledExecutorService> r0 = io.reactivex.internal.schedulers.SchedulerPoolFactory.PURGE_THREAD
            r1 = 0
            java.lang.Object r0 = r0.getAndSet(r1)
            java.util.concurrent.ScheduledExecutorService r0 = (java.util.concurrent.ScheduledExecutorService) r0
            if (r0 == 0) goto Le
            r0.shutdownNow()
        Le:
            java.util.Map<java.util.concurrent.ScheduledThreadPoolExecutor, java.lang.Object> r0 = io.reactivex.internal.schedulers.SchedulerPoolFactory.POOLS
            r0.clear()
            return
    }

    public static void start() {
            boolean r0 = io.reactivex.internal.schedulers.SchedulerPoolFactory.PURGE_ENABLED
            tryStart(r0)
            return
    }

    static void tryPutIntoPool(boolean r1, java.util.concurrent.ScheduledExecutorService r2) {
            if (r1 == 0) goto Le
            boolean r1 = r2 instanceof java.util.concurrent.ScheduledThreadPoolExecutor
            if (r1 == 0) goto Le
            r1 = r2
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = (java.util.concurrent.ScheduledThreadPoolExecutor) r1
            java.util.Map<java.util.concurrent.ScheduledThreadPoolExecutor, java.lang.Object> r0 = io.reactivex.internal.schedulers.SchedulerPoolFactory.POOLS
            r0.put(r1, r2)
        Le:
            return
    }

    static void tryStart(boolean r10) {
            if (r10 == 0) goto L32
        L2:
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ScheduledExecutorService> r10 = io.reactivex.internal.schedulers.SchedulerPoolFactory.PURGE_THREAD
            java.lang.Object r0 = r10.get()
            java.util.concurrent.ScheduledExecutorService r0 = (java.util.concurrent.ScheduledExecutorService) r0
            if (r0 == 0) goto Ld
            return
        Ld:
            io.reactivex.internal.schedulers.RxThreadFactory r1 = new io.reactivex.internal.schedulers.RxThreadFactory
            java.lang.String r2 = "RxSchedulerPurge"
            r1.<init>(r2)
            r2 = 1
            java.util.concurrent.ScheduledExecutorService r3 = java.util.concurrent.Executors.newScheduledThreadPool(r2, r1)
            boolean r10 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r10, r0, r3)
            if (r10 == 0) goto L2e
            io.reactivex.internal.schedulers.SchedulerPoolFactory$ScheduledTask r4 = new io.reactivex.internal.schedulers.SchedulerPoolFactory$ScheduledTask
            r4.<init>()
            int r10 = io.reactivex.internal.schedulers.SchedulerPoolFactory.PURGE_PERIOD_SECONDS
            long r5 = (long) r10
            long r7 = (long) r10
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS
            r3.scheduleAtFixedRate(r4, r5, r7, r9)
            return
        L2e:
            r3.shutdownNow()
            goto L2
        L32:
            return
    }
}
