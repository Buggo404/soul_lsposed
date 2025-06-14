package io.reactivex.subjects;

/* loaded from: classes.dex */
final class SerializedSubject<T> extends io.reactivex.subjects.Subject<T> implements io.reactivex.internal.util.AppendOnlyLinkedArrayList.NonThrowingPredicate<java.lang.Object> {
    final io.reactivex.subjects.Subject<T> actual;
    volatile boolean done;
    boolean emitting;
    io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> queue;

    SerializedSubject(io.reactivex.subjects.Subject<T> r1) {
            r0 = this;
            r0.<init>()
            r0.actual = r1
            return
    }

    void emitLoop() {
            r2 = this;
        L0:
            monitor-enter(r2)
            io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> r0 = r2.queue     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto La
            r0 = 0
            r2.emitting = r0     // Catch: java.lang.Throwable -> L12
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            return
        La:
            r1 = 0
            r2.queue = r1     // Catch: java.lang.Throwable -> L12
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            r0.forEachWhile(r2)
            goto L0
        L12:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            throw r0
    }

    @Override // io.reactivex.subjects.Subject
    public java.lang.Throwable getThrowable() {
            r1 = this;
            io.reactivex.subjects.Subject<T> r0 = r1.actual
            java.lang.Throwable r0 = r0.getThrowable()
            return r0
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasComplete() {
            r1 = this;
            io.reactivex.subjects.Subject<T> r0 = r1.actual
            boolean r0 = r0.hasComplete()
            return r0
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasObservers() {
            r1 = this;
            io.reactivex.subjects.Subject<T> r0 = r1.actual
            boolean r0 = r0.hasObservers()
            return r0
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasThrowable() {
            r1 = this;
            io.reactivex.subjects.Subject<T> r0 = r1.actual
            boolean r0 = r0.hasThrowable()
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
            r0 = 1
            r2.done = r0     // Catch: java.lang.Throwable -> L31
            boolean r1 = r2.emitting     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L28
            io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> r0 = r2.queue     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L1f
            io.reactivex.internal.util.AppendOnlyLinkedArrayList r0 = new io.reactivex.internal.util.AppendOnlyLinkedArrayList     // Catch: java.lang.Throwable -> L31
            r1 = 4
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L31
            r2.queue = r0     // Catch: java.lang.Throwable -> L31
        L1f:
            java.lang.Object r1 = io.reactivex.internal.util.NotificationLite.complete()     // Catch: java.lang.Throwable -> L31
            r0.add(r1)     // Catch: java.lang.Throwable -> L31
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L31
            return
        L28:
            r2.emitting = r0     // Catch: java.lang.Throwable -> L31
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L31
            io.reactivex.subjects.Subject<T> r0 = r2.actual
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
            boolean r0 = r2.done     // Catch: java.lang.Throwable -> L3a
            r1 = 1
            if (r0 == 0) goto Lf
            goto L2d
        Lf:
            r2.done = r1     // Catch: java.lang.Throwable -> L3a
            boolean r0 = r2.emitting     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L2a
            io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> r0 = r2.queue     // Catch: java.lang.Throwable -> L3a
            if (r0 != 0) goto L21
            io.reactivex.internal.util.AppendOnlyLinkedArrayList r0 = new io.reactivex.internal.util.AppendOnlyLinkedArrayList     // Catch: java.lang.Throwable -> L3a
            r1 = 4
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L3a
            r2.queue = r0     // Catch: java.lang.Throwable -> L3a
        L21:
            java.lang.Object r3 = io.reactivex.internal.util.NotificationLite.error(r3)     // Catch: java.lang.Throwable -> L3a
            r0.setFirst(r3)     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3a
            return
        L2a:
            r2.emitting = r1     // Catch: java.lang.Throwable -> L3a
            r1 = 0
        L2d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3a
            if (r1 == 0) goto L34
            io.reactivex.plugins.RxJavaPlugins.onError(r3)
            return
        L34:
            io.reactivex.subjects.Subject<T> r0 = r2.actual
            r0.onError(r3)
            return
        L3a:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3a
            throw r3
    }

    @Override // io.reactivex.Observer
    public void onNext(T r3) {
            r2 = this;
            boolean r0 = r2.done
            if (r0 == 0) goto L5
            return
        L5:
            monitor-enter(r2)
            boolean r0 = r2.done     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto Lc
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L32
            return
        Lc:
            boolean r0 = r2.emitting     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto L25
            io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> r0 = r2.queue     // Catch: java.lang.Throwable -> L32
            if (r0 != 0) goto L1c
            io.reactivex.internal.util.AppendOnlyLinkedArrayList r0 = new io.reactivex.internal.util.AppendOnlyLinkedArrayList     // Catch: java.lang.Throwable -> L32
            r1 = 4
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L32
            r2.queue = r0     // Catch: java.lang.Throwable -> L32
        L1c:
            java.lang.Object r3 = io.reactivex.internal.util.NotificationLite.next(r3)     // Catch: java.lang.Throwable -> L32
            r0.add(r3)     // Catch: java.lang.Throwable -> L32
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L32
            return
        L25:
            r0 = 1
            r2.emitting = r0     // Catch: java.lang.Throwable -> L32
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L32
            io.reactivex.subjects.Subject<T> r0 = r2.actual
            r0.onNext(r3)
            r2.emitLoop()
            return
        L32:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L32
            throw r3
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(io.reactivex.disposables.Disposable r3) {
            r2 = this;
            boolean r0 = r2.done
            r1 = 1
            if (r0 != 0) goto L2d
            monitor-enter(r2)
            boolean r0 = r2.done     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto Lb
            goto L28
        Lb:
            boolean r0 = r2.emitting     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L24
            io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> r0 = r2.queue     // Catch: java.lang.Throwable -> L2a
            if (r0 != 0) goto L1b
            io.reactivex.internal.util.AppendOnlyLinkedArrayList r0 = new io.reactivex.internal.util.AppendOnlyLinkedArrayList     // Catch: java.lang.Throwable -> L2a
            r1 = 4
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L2a
            r2.queue = r0     // Catch: java.lang.Throwable -> L2a
        L1b:
            java.lang.Object r3 = io.reactivex.internal.util.NotificationLite.disposable(r3)     // Catch: java.lang.Throwable -> L2a
            r0.add(r3)     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2a
            return
        L24:
            r2.emitting = r1     // Catch: java.lang.Throwable -> L2a
            r0 = 0
            r1 = r0
        L28:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2a
            goto L2d
        L2a:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2a
            throw r3
        L2d:
            if (r1 == 0) goto L33
            r3.dispose()
            goto L3b
        L33:
            io.reactivex.subjects.Subject<T> r0 = r2.actual
            r0.onSubscribe(r3)
            r2.emitLoop()
        L3b:
            return
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> r2) {
            r1 = this;
            io.reactivex.subjects.Subject<T> r0 = r1.actual
            r0.subscribe(r2)
            return
    }

    @Override // io.reactivex.internal.util.AppendOnlyLinkedArrayList.NonThrowingPredicate, io.reactivex.functions.Predicate
    public boolean test(java.lang.Object r2) {
            r1 = this;
            io.reactivex.subjects.Subject<T> r0 = r1.actual
            boolean r2 = io.reactivex.internal.util.NotificationLite.acceptFull(r2, r0)
            return r2
    }
}
