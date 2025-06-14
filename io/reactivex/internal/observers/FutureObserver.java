package io.reactivex.internal.observers;

/* loaded from: classes.dex */
public final class FutureObserver<T> extends java.util.concurrent.CountDownLatch implements io.reactivex.Observer<T>, java.util.concurrent.Future<T>, io.reactivex.disposables.Disposable {
    java.lang.Throwable error;

    /* renamed from: s */
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> f181s;
    T value;

    public FutureObserver() {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r1.f181s = r0
            return
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean r3) {
            r2 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r3 = r2.f181s
            java.lang.Object r3 = r3.get()
            io.reactivex.disposables.Disposable r3 = (io.reactivex.disposables.Disposable) r3
            if (r3 == r2) goto L23
            io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
            if (r3 != r0) goto Lf
            goto L23
        Lf:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r2.f181s
            io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
            boolean r0 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r0, r3, r1)
            if (r0 == 0) goto L0
            if (r3 == 0) goto L1e
            r3.dispose()
        L1e:
            r2.countDown()
            r3 = 1
            return r3
        L23:
            r3 = 0
            return r3
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
            r0 = this;
            return
    }

    @Override // java.util.concurrent.Future
    public T get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
            r4 = this;
            long r0 = r4.getCount()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L10
            io.reactivex.internal.util.BlockingHelper.verifyNonBlocking()
            r4.await()
        L10:
            boolean r0 = r4.isCancelled()
            if (r0 != 0) goto L23
            java.lang.Throwable r0 = r4.error
            if (r0 != 0) goto L1d
            T r0 = r4.value
            return r0
        L1d:
            java.util.concurrent.ExecutionException r1 = new java.util.concurrent.ExecutionException
            r1.<init>(r0)
            throw r1
        L23:
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.concurrent.Future
    public T get(long r5, java.util.concurrent.TimeUnit r7) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
            r4 = this;
            long r0 = r4.getCount()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1a
            io.reactivex.internal.util.BlockingHelper.verifyNonBlocking()
            boolean r5 = r4.await(r5, r7)
            if (r5 == 0) goto L14
            goto L1a
        L14:
            java.util.concurrent.TimeoutException r5 = new java.util.concurrent.TimeoutException
            r5.<init>()
            throw r5
        L1a:
            boolean r5 = r4.isCancelled()
            if (r5 != 0) goto L2d
            java.lang.Throwable r5 = r4.error
            if (r5 != 0) goto L27
            T r5 = r4.value
            return r5
        L27:
            java.util.concurrent.ExecutionException r6 = new java.util.concurrent.ExecutionException
            r6.<init>(r5)
            throw r6
        L2d:
            java.util.concurrent.CancellationException r5 = new java.util.concurrent.CancellationException
            r5.<init>()
            throw r5
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.f181s
            java.lang.Object r0 = r0.get()
            io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
            boolean r0 = io.reactivex.internal.disposables.DisposableHelper.isDisposed(r0)
            return r0
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
            r1 = this;
            boolean r0 = r1.isDone()
            return r0
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
            r4 = this;
            long r0 = r4.getCount()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
            r2 = this;
            T r0 = r2.value
            if (r0 != 0) goto Lf
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "The source is empty"
            r0.<init>(r1)
            r2.onError(r0)
            return
        Lf:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r2.f181s
            java.lang.Object r0 = r0.get()
            io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
            if (r0 == r2) goto L29
            io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
            if (r0 != r1) goto L1e
            goto L29
        L1e:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r1 = r2.f181s
            boolean r0 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r1, r0, r2)
            if (r0 == 0) goto Lf
            r2.countDown()
        L29:
            return
    }

    @Override // io.reactivex.Observer
    public void onError(java.lang.Throwable r3) {
            r2 = this;
            java.lang.Throwable r0 = r2.error
            if (r0 != 0) goto L25
            r2.error = r3
        L6:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r2.f181s
            java.lang.Object r0 = r0.get()
            io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
            if (r0 == r2) goto L21
            io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
            if (r0 != r1) goto L15
            goto L21
        L15:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r1 = r2.f181s
            boolean r0 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r1, r0, r2)
            if (r0 == 0) goto L6
            r2.countDown()
            return
        L21:
            io.reactivex.plugins.RxJavaPlugins.onError(r3)
            return
        L25:
            io.reactivex.plugins.RxJavaPlugins.onError(r3)
            return
    }

    @Override // io.reactivex.Observer
    public void onNext(T r2) {
            r1 = this;
            T r0 = r1.value
            if (r0 == 0) goto L1a
            java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r2 = r1.f181s
            java.lang.Object r2 = r2.get()
            io.reactivex.disposables.Disposable r2 = (io.reactivex.disposables.Disposable) r2
            r2.dispose()
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.String r0 = "More than one element received"
            r2.<init>(r0)
            r1.onError(r2)
            return
        L1a:
            r1.value = r2
            return
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(io.reactivex.disposables.Disposable r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.f181s
            io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r2)
            return
    }
}
