package androidx.lifecycle;

/* loaded from: classes.dex */
public abstract class ComputableLiveData<T> {
    final java.util.concurrent.atomic.AtomicBoolean mComputing;
    final java.util.concurrent.Executor mExecutor;
    final java.util.concurrent.atomic.AtomicBoolean mInvalid;
    final java.lang.Runnable mInvalidationRunnable;
    final androidx.lifecycle.LiveData<T> mLiveData;
    final java.lang.Runnable mRefreshRunnable;




    public ComputableLiveData() {
            r1 = this;
            java.util.concurrent.Executor r0 = androidx.arch.core.executor.ArchTaskExecutor.getIOThreadExecutor()
            r1.<init>(r0)
            return
    }

    public ComputableLiveData(java.util.concurrent.Executor r3) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 1
            r0.<init>(r1)
            r2.mInvalid = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.mComputing = r0
            androidx.lifecycle.ComputableLiveData$2 r0 = new androidx.lifecycle.ComputableLiveData$2
            r0.<init>(r2)
            r2.mRefreshRunnable = r0
            androidx.lifecycle.ComputableLiveData$3 r0 = new androidx.lifecycle.ComputableLiveData$3
            r0.<init>(r2)
            r2.mInvalidationRunnable = r0
            r2.mExecutor = r3
            androidx.lifecycle.ComputableLiveData$1 r3 = new androidx.lifecycle.ComputableLiveData$1
            r3.<init>(r2)
            r2.mLiveData = r3
            return
    }

    protected abstract T compute();

    public androidx.lifecycle.LiveData<T> getLiveData() {
            r1 = this;
            androidx.lifecycle.LiveData<T> r0 = r1.mLiveData
            return r0
    }

    public void invalidate() {
            r2 = this;
            androidx.arch.core.executor.ArchTaskExecutor r0 = androidx.arch.core.executor.ArchTaskExecutor.getInstance()
            java.lang.Runnable r1 = r2.mInvalidationRunnable
            r0.executeOnMainThread(r1)
            return
    }
}
