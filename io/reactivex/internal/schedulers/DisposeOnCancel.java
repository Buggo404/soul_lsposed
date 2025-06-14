package io.reactivex.internal.schedulers;

/* loaded from: classes.dex */
final class DisposeOnCancel implements java.util.concurrent.Future<java.lang.Object> {

    /* renamed from: d */
    final io.reactivex.disposables.Disposable f521d;

    DisposeOnCancel(io.reactivex.disposables.Disposable r1) {
            r0 = this;
            r0.<init>()
            r0.f521d = r1
            return
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean r1) {
            r0 = this;
            io.reactivex.disposables.Disposable r1 = r0.f521d
            r1.dispose()
            r1 = 0
            return r1
    }

    @Override // java.util.concurrent.Future
    public java.lang.Object get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.concurrent.Future
    public java.lang.Object get(long r1, java.util.concurrent.TimeUnit r3) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
            r1 = this;
            r0 = 0
            return r0
    }
}
