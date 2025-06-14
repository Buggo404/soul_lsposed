package io.reactivex.schedulers;

/* loaded from: classes.dex */
public final class Schedulers {
    static final io.reactivex.Scheduler COMPUTATION = null;

    /* renamed from: IO */
    static final io.reactivex.Scheduler f565IO = null;
    static final io.reactivex.Scheduler NEW_THREAD = null;
    static final io.reactivex.Scheduler SINGLE = null;
    static final io.reactivex.Scheduler TRAMPOLINE = null;

    static final class ComputationHolder {
        static final io.reactivex.Scheduler DEFAULT = null;

        static {
                io.reactivex.internal.schedulers.ComputationScheduler r0 = new io.reactivex.internal.schedulers.ComputationScheduler
                r0.<init>()
                io.reactivex.schedulers.Schedulers.ComputationHolder.DEFAULT = r0
                return
        }

        ComputationHolder() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static final class ComputationTask implements java.util.concurrent.Callable<io.reactivex.Scheduler> {
        ComputationTask() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public io.reactivex.Scheduler call() throws java.lang.Exception {
                r1 = this;
                io.reactivex.Scheduler r0 = io.reactivex.schedulers.Schedulers.ComputationHolder.DEFAULT
                return r0
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ io.reactivex.Scheduler call() throws java.lang.Exception {
                r1 = this;
                io.reactivex.Scheduler r0 = r1.call()
                return r0
        }
    }

    static final class IOTask implements java.util.concurrent.Callable<io.reactivex.Scheduler> {
        IOTask() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public io.reactivex.Scheduler call() throws java.lang.Exception {
                r1 = this;
                io.reactivex.Scheduler r0 = io.reactivex.schedulers.Schedulers.IoHolder.DEFAULT
                return r0
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ io.reactivex.Scheduler call() throws java.lang.Exception {
                r1 = this;
                io.reactivex.Scheduler r0 = r1.call()
                return r0
        }
    }

    static final class IoHolder {
        static final io.reactivex.Scheduler DEFAULT = null;

        static {
                io.reactivex.internal.schedulers.IoScheduler r0 = new io.reactivex.internal.schedulers.IoScheduler
                r0.<init>()
                io.reactivex.schedulers.Schedulers.IoHolder.DEFAULT = r0
                return
        }

        IoHolder() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static final class NewThreadHolder {
        static final io.reactivex.Scheduler DEFAULT = null;

        static {
                io.reactivex.internal.schedulers.NewThreadScheduler r0 = new io.reactivex.internal.schedulers.NewThreadScheduler
                r0.<init>()
                io.reactivex.schedulers.Schedulers.NewThreadHolder.DEFAULT = r0
                return
        }

        NewThreadHolder() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static final class NewThreadTask implements java.util.concurrent.Callable<io.reactivex.Scheduler> {
        NewThreadTask() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public io.reactivex.Scheduler call() throws java.lang.Exception {
                r1 = this;
                io.reactivex.Scheduler r0 = io.reactivex.schedulers.Schedulers.NewThreadHolder.DEFAULT
                return r0
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ io.reactivex.Scheduler call() throws java.lang.Exception {
                r1 = this;
                io.reactivex.Scheduler r0 = r1.call()
                return r0
        }
    }

    static final class SingleHolder {
        static final io.reactivex.Scheduler DEFAULT = null;

        static {
                io.reactivex.internal.schedulers.SingleScheduler r0 = new io.reactivex.internal.schedulers.SingleScheduler
                r0.<init>()
                io.reactivex.schedulers.Schedulers.SingleHolder.DEFAULT = r0
                return
        }

        SingleHolder() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static final class SingleTask implements java.util.concurrent.Callable<io.reactivex.Scheduler> {
        SingleTask() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public io.reactivex.Scheduler call() throws java.lang.Exception {
                r1 = this;
                io.reactivex.Scheduler r0 = io.reactivex.schedulers.Schedulers.SingleHolder.DEFAULT
                return r0
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ io.reactivex.Scheduler call() throws java.lang.Exception {
                r1 = this;
                io.reactivex.Scheduler r0 = r1.call()
                return r0
        }
    }

    static {
            io.reactivex.schedulers.Schedulers$SingleTask r0 = new io.reactivex.schedulers.Schedulers$SingleTask
            r0.<init>()
            io.reactivex.Scheduler r0 = io.reactivex.plugins.RxJavaPlugins.initSingleScheduler(r0)
            io.reactivex.schedulers.Schedulers.SINGLE = r0
            io.reactivex.schedulers.Schedulers$ComputationTask r0 = new io.reactivex.schedulers.Schedulers$ComputationTask
            r0.<init>()
            io.reactivex.Scheduler r0 = io.reactivex.plugins.RxJavaPlugins.initComputationScheduler(r0)
            io.reactivex.schedulers.Schedulers.COMPUTATION = r0
            io.reactivex.schedulers.Schedulers$IOTask r0 = new io.reactivex.schedulers.Schedulers$IOTask
            r0.<init>()
            io.reactivex.Scheduler r0 = io.reactivex.plugins.RxJavaPlugins.initIoScheduler(r0)
            io.reactivex.schedulers.Schedulers.f565IO = r0
            io.reactivex.internal.schedulers.TrampolineScheduler r0 = io.reactivex.internal.schedulers.TrampolineScheduler.instance()
            io.reactivex.schedulers.Schedulers.TRAMPOLINE = r0
            io.reactivex.schedulers.Schedulers$NewThreadTask r0 = new io.reactivex.schedulers.Schedulers$NewThreadTask
            r0.<init>()
            io.reactivex.Scheduler r0 = io.reactivex.plugins.RxJavaPlugins.initNewThreadScheduler(r0)
            io.reactivex.schedulers.Schedulers.NEW_THREAD = r0
            return
    }

    private Schedulers() {
            r2 = this;
            r2.<init>()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No instances!"
            r0.<init>(r1)
            throw r0
    }

    public static io.reactivex.Scheduler computation() {
            io.reactivex.Scheduler r0 = io.reactivex.schedulers.Schedulers.COMPUTATION
            io.reactivex.Scheduler r0 = io.reactivex.plugins.RxJavaPlugins.onComputationScheduler(r0)
            return r0
    }

    public static io.reactivex.Scheduler from(java.util.concurrent.Executor r1) {
            io.reactivex.internal.schedulers.ExecutorScheduler r0 = new io.reactivex.internal.schedulers.ExecutorScheduler
            r0.<init>(r1)
            return r0
    }

    /* renamed from: io */
    public static io.reactivex.Scheduler m54io() {
            io.reactivex.Scheduler r0 = io.reactivex.schedulers.Schedulers.f565IO
            io.reactivex.Scheduler r0 = io.reactivex.plugins.RxJavaPlugins.onIoScheduler(r0)
            return r0
    }

    public static io.reactivex.Scheduler newThread() {
            io.reactivex.Scheduler r0 = io.reactivex.schedulers.Schedulers.NEW_THREAD
            io.reactivex.Scheduler r0 = io.reactivex.plugins.RxJavaPlugins.onNewThreadScheduler(r0)
            return r0
    }

    public static void shutdown() {
            io.reactivex.Scheduler r0 = computation()
            r0.shutdown()
            io.reactivex.Scheduler r0 = m54io()
            r0.shutdown()
            io.reactivex.Scheduler r0 = newThread()
            r0.shutdown()
            io.reactivex.Scheduler r0 = single()
            r0.shutdown()
            io.reactivex.Scheduler r0 = trampoline()
            r0.shutdown()
            io.reactivex.internal.schedulers.SchedulerPoolFactory.shutdown()
            return
    }

    public static io.reactivex.Scheduler single() {
            io.reactivex.Scheduler r0 = io.reactivex.schedulers.Schedulers.SINGLE
            io.reactivex.Scheduler r0 = io.reactivex.plugins.RxJavaPlugins.onSingleScheduler(r0)
            return r0
    }

    public static void start() {
            io.reactivex.Scheduler r0 = computation()
            r0.start()
            io.reactivex.Scheduler r0 = m54io()
            r0.start()
            io.reactivex.Scheduler r0 = newThread()
            r0.start()
            io.reactivex.Scheduler r0 = single()
            r0.start()
            io.reactivex.Scheduler r0 = trampoline()
            r0.start()
            io.reactivex.internal.schedulers.SchedulerPoolFactory.start()
            return
    }

    public static io.reactivex.Scheduler trampoline() {
            io.reactivex.Scheduler r0 = io.reactivex.schedulers.Schedulers.TRAMPOLINE
            return r0
    }
}
