package io.reactivex.observers;

/* loaded from: classes.dex */
public final class SerializedObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
    static final int QUEUE_LINK_SIZE = 4;
    final io.reactivex.Observer<? super T> actual;
    final boolean delayError;
    volatile boolean done;
    boolean emitting;
    io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> queue;

    /* renamed from: s */
    io.reactivex.disposables.Disposable f563s;

    public SerializedObserver(io.reactivex.Observer<? super T> r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public SerializedObserver(io.reactivex.Observer<? super T> r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.actual = r1
            r0.delayError = r2
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
            r1 = this;
            io.reactivex.disposables.Disposable r0 = r1.f563s
            r0.dispose()
            return
    }

    void emitLoop() {
            r2 = this;
        L0:
            monitor-enter(r2)
            io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> r0 = r2.queue     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto La
            r0 = 0
            r2.emitting = r0     // Catch: java.lang.Throwable -> L17
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            return
        La:
            r1 = 0
            r2.queue = r1     // Catch: java.lang.Throwable -> L17
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            io.reactivex.Observer<? super T> r1 = r2.actual
            boolean r0 = r0.accept(r1)
            if (r0 == 0) goto L0
            return
        L17:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            throw r0
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
            r1 = this;
            io.reactivex.disposables.Disposable r0 = r1.f563s
            boolean r0 = r0.isDisposed()
            return r0
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
            r2 = this;
            boolean r0 = r2.done
            if (r0 == 0) goto L5
            return
        L5:
            monitor-enter(r2)
            boolean r0 = r2.done     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto Lc
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L31
            return
        Lc:
            boolean r0 = r2.emitting     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L25
            io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> r0 = r2.queue     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L1c
            io.reactivex.internal.util.AppendOnlyLinkedArrayList r0 = new io.reactivex.internal.util.AppendOnlyLinkedArrayList     // Catch: java.lang.Throwable -> L31
            r1 = 4
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L31
            r2.queue = r0     // Catch: java.lang.Throwable -> L31
        L1c:
            java.lang.Object r1 = io.reactivex.internal.util.NotificationLite.complete()     // Catch: java.lang.Throwable -> L31
            r0.add(r1)     // Catch: java.lang.Throwable -> L31
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L31
            return
        L25:
            r0 = 1
            r2.done = r0     // Catch: java.lang.Throwable -> L31
            r2.emitting = r0     // Catch: java.lang.Throwable -> L31
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L31
            io.reactivex.Observer<? super T> r0 = r2.actual
            r0.onComplete()
            return
        L31:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L31
            throw r0
    }

    @Override // io.reactivex.Observer
    public void onError(java.lang.Throwable r3) {
            r2 = this;
            boolean r0 = r2.done
            if (r0 == 0) goto L8
            io.reactivex.plugins.RxJavaPlugins.onError(r3)
            return
        L8:
            monitor-enter(r2)
            boolean r0 = r2.done     // Catch: java.lang.Throwable -> L44
            r1 = 1
            if (r0 == 0) goto Lf
            goto L37
        Lf:
            boolean r0 = r2.emitting     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L32
            r2.done = r1     // Catch: java.lang.Throwable -> L44
            io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> r0 = r2.queue     // Catch: java.lang.Throwable -> L44
            if (r0 != 0) goto L21
            io.reactivex.internal.util.AppendOnlyLinkedArrayList r0 = new io.reactivex.internal.util.AppendOnlyLinkedArrayList     // Catch: java.lang.Throwable -> L44
            r1 = 4
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L44
            r2.queue = r0     // Catch: java.lang.Throwable -> L44
        L21:
            java.lang.Object r3 = io.reactivex.internal.util.NotificationLite.error(r3)     // Catch: java.lang.Throwable -> L44
            boolean r1 = r2.delayError     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L2d
            r0.add(r3)     // Catch: java.lang.Throwable -> L44
            goto L30
        L2d:
            r0.setFirst(r3)     // Catch: java.lang.Throwable -> L44
        L30:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L44
            return
        L32:
            r2.done = r1     // Catch: java.lang.Throwable -> L44
            r2.emitting = r1     // Catch: java.lang.Throwable -> L44
            r1 = 0
        L37:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L3e
            io.reactivex.plugins.RxJavaPlugins.onError(r3)
            return
        L3e:
            io.reactivex.Observer<? super T> r0 = r2.actual
            r0.onError(r3)
            return
        L44:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L44
            throw r3
    }

    @Override // io.reactivex.Observer
    public void onNext(T r3) {
            r2 = this;
            boolean r0 = r2.done
            if (r0 == 0) goto L5
            return
        L5:
            if (r3 != 0) goto L17
            io.reactivex.disposables.Disposable r3 = r2.f563s
            r3.dispose()
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "onNext called with null. Null values are generally not allowed in 2.x operators and sources."
            r3.<init>(r0)
            r2.onError(r3)
            return
        L17:
            monitor-enter(r2)
            boolean r0 = r2.done     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L1e
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L44
            return
        L1e:
            boolean r0 = r2.emitting     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L37
            io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> r0 = r2.queue     // Catch: java.lang.Throwable -> L44
            if (r0 != 0) goto L2e
            io.reactivex.internal.util.AppendOnlyLinkedArrayList r0 = new io.reactivex.internal.util.AppendOnlyLinkedArrayList     // Catch: java.lang.Throwable -> L44
            r1 = 4
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L44
            r2.queue = r0     // Catch: java.lang.Throwable -> L44
        L2e:
            java.lang.Object r3 = io.reactivex.internal.util.NotificationLite.next(r3)     // Catch: java.lang.Throwable -> L44
            r0.add(r3)     // Catch: java.lang.Throwable -> L44
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L44
            return
        L37:
            r0 = 1
            r2.emitting = r0     // Catch: java.lang.Throwable -> L44
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L44
            io.reactivex.Observer<? super T> r0 = r2.actual
            r0.onNext(r3)
            r2.emitLoop()
            return
        L44:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L44
            throw r3
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(io.reactivex.disposables.Disposable r2) {
            r1 = this;
            io.reactivex.disposables.Disposable r0 = r1.f563s
            boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
            if (r0 == 0) goto Lf
            r1.f563s = r2
            io.reactivex.Observer<? super T> r2 = r1.actual
            r2.onSubscribe(r1)
        Lf:
            return
    }
}
