package io.reactivex.internal.schedulers;

/* loaded from: classes.dex */
public interface SchedulerMultiWorkerSupport {

    public interface WorkerCallback {
        void onWorker(int r1, io.reactivex.Scheduler.Worker r2);
    }

    void createWorkers(int r1, io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport.WorkerCallback r2);
}
