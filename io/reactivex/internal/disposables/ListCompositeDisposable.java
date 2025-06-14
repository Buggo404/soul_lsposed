package io.reactivex.internal.disposables;

/* loaded from: classes.dex */
public final class ListCompositeDisposable implements io.reactivex.disposables.Disposable, io.reactivex.internal.disposables.DisposableContainer {
    volatile boolean disposed;
    java.util.List<io.reactivex.disposables.Disposable> resources;

    public ListCompositeDisposable() {
            r0 = this;
            r0.<init>()
            return
    }

    public ListCompositeDisposable(java.lang.Iterable<? extends io.reactivex.disposables.Disposable> r3) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "resources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r2.resources = r0
            java.util.Iterator r3 = r3.iterator()
        L13:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r3.next()
            io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
            java.lang.String r1 = "Disposable item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)
            java.util.List<io.reactivex.disposables.Disposable> r1 = r2.resources
            r1.add(r0)
            goto L13
        L2a:
            return
    }

    public ListCompositeDisposable(io.reactivex.disposables.Disposable... r5) {
            r4 = this;
            r4.<init>()
            java.lang.String r0 = "resources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r4.resources = r0
            int r0 = r5.length
            r1 = 0
        L11:
            if (r1 >= r0) goto L22
            r2 = r5[r1]
            java.lang.String r3 = "Disposable item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r3)
            java.util.List<io.reactivex.disposables.Disposable> r3 = r4.resources
            r3.add(r2)
            int r1 = r1 + 1
            goto L11
        L22:
            return
    }

    @Override // io.reactivex.internal.disposables.DisposableContainer
    public boolean add(io.reactivex.disposables.Disposable r2) {
            r1 = this;
            java.lang.String r0 = "d is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            boolean r0 = r1.disposed
            if (r0 != 0) goto L24
            monitor-enter(r1)
            boolean r0 = r1.disposed     // Catch: java.lang.Throwable -> L21
            if (r0 != 0) goto L1f
            java.util.List<io.reactivex.disposables.Disposable> r0 = r1.resources     // Catch: java.lang.Throwable -> L21
            if (r0 != 0) goto L19
            java.util.LinkedList r0 = new java.util.LinkedList     // Catch: java.lang.Throwable -> L21
            r0.<init>()     // Catch: java.lang.Throwable -> L21
            r1.resources = r0     // Catch: java.lang.Throwable -> L21
        L19:
            r0.add(r2)     // Catch: java.lang.Throwable -> L21
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L21
            r2 = 1
            return r2
        L1f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L21
            goto L24
        L21:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L21
            throw r2
        L24:
            r2.dispose()
            r2 = 0
            return r2
    }

    public boolean addAll(io.reactivex.disposables.Disposable... r6) {
            r5 = this;
            java.lang.String r0 = "ds is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r0)
            boolean r0 = r5.disposed
            r1 = 0
            if (r0 != 0) goto L32
            monitor-enter(r5)
            boolean r0 = r5.disposed     // Catch: java.lang.Throwable -> L2f
            if (r0 != 0) goto L2d
            java.util.List<io.reactivex.disposables.Disposable> r0 = r5.resources     // Catch: java.lang.Throwable -> L2f
            if (r0 != 0) goto L1a
            java.util.LinkedList r0 = new java.util.LinkedList     // Catch: java.lang.Throwable -> L2f
            r0.<init>()     // Catch: java.lang.Throwable -> L2f
            r5.resources = r0     // Catch: java.lang.Throwable -> L2f
        L1a:
            int r2 = r6.length     // Catch: java.lang.Throwable -> L2f
        L1b:
            if (r1 >= r2) goto L2a
            r3 = r6[r1]     // Catch: java.lang.Throwable -> L2f
            java.lang.String r4 = "d is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r4)     // Catch: java.lang.Throwable -> L2f
            r0.add(r3)     // Catch: java.lang.Throwable -> L2f
            int r1 = r1 + 1
            goto L1b
        L2a:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2f
            r6 = 1
            return r6
        L2d:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2f
            goto L32
        L2f:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2f
            throw r6
        L32:
            int r0 = r6.length
            r2 = r1
        L34:
            if (r2 >= r0) goto L3e
            r3 = r6[r2]
            r3.dispose()
            int r2 = r2 + 1
            goto L34
        L3e:
            return r1
    }

    public void clear() {
            r2 = this;
            boolean r0 = r2.disposed
            if (r0 == 0) goto L5
            return
        L5:
            monitor-enter(r2)
            boolean r0 = r2.disposed     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto Lc
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            return
        Lc:
            java.util.List<io.reactivex.disposables.Disposable> r0 = r2.resources     // Catch: java.lang.Throwable -> L16
            r1 = 0
            r2.resources = r1     // Catch: java.lang.Throwable -> L16
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            r2.dispose(r0)
            return
        L16:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            throw r0
    }

    @Override // io.reactivex.internal.disposables.DisposableContainer
    public boolean delete(io.reactivex.disposables.Disposable r3) {
            r2 = this;
            java.lang.String r0 = "Disposable item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            boolean r0 = r2.disposed
            r1 = 0
            if (r0 == 0) goto Lb
            return r1
        Lb:
            monitor-enter(r2)
            boolean r0 = r2.disposed     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L12
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L22
            return r1
        L12:
            java.util.List<io.reactivex.disposables.Disposable> r0 = r2.resources     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L20
            boolean r3 = r0.remove(r3)     // Catch: java.lang.Throwable -> L22
            if (r3 != 0) goto L1d
            goto L20
        L1d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L22
            r3 = 1
            return r3
        L20:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L22
            return r1
        L22:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L22
            throw r3
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
            r2 = this;
            boolean r0 = r2.disposed
            if (r0 == 0) goto L5
            return
        L5:
            monitor-enter(r2)
            boolean r0 = r2.disposed     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto Lc
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            return
        Lc:
            r0 = 1
            r2.disposed = r0     // Catch: java.lang.Throwable -> L19
            java.util.List<io.reactivex.disposables.Disposable> r0 = r2.resources     // Catch: java.lang.Throwable -> L19
            r1 = 0
            r2.resources = r1     // Catch: java.lang.Throwable -> L19
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            r2.dispose(r0)
            return
        L19:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            throw r0
    }

    void dispose(java.util.List<io.reactivex.disposables.Disposable> r3) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        L8:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r3.next()
            io.reactivex.disposables.Disposable r1 = (io.reactivex.disposables.Disposable) r1
            r1.dispose()     // Catch: java.lang.Throwable -> L18
            goto L8
        L18:
            r1 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
            if (r0 != 0) goto L23
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L23:
            r0.add(r1)
            goto L8
        L27:
            if (r0 == 0) goto L42
            int r3 = r0.size()
            r1 = 1
            if (r3 != r1) goto L3c
            r3 = 0
            java.lang.Object r3 = r0.get(r3)
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.RuntimeException r3 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r3)
            throw r3
        L3c:
            io.reactivex.exceptions.CompositeException r3 = new io.reactivex.exceptions.CompositeException
            r3.<init>(r0)
            throw r3
        L42:
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
            r1 = this;
            boolean r0 = r1.disposed
            return r0
    }

    @Override // io.reactivex.internal.disposables.DisposableContainer
    public boolean remove(io.reactivex.disposables.Disposable r2) {
            r1 = this;
            boolean r0 = r1.delete(r2)
            if (r0 == 0) goto Lb
            r2.dispose()
            r2 = 1
            return r2
        Lb:
            r2 = 0
            return r2
    }
}
