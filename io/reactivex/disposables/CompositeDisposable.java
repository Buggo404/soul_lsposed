package io.reactivex.disposables;

/* loaded from: classes.dex */
public final class CompositeDisposable implements io.reactivex.disposables.Disposable, io.reactivex.internal.disposables.DisposableContainer {
    volatile boolean disposed;
    io.reactivex.internal.util.OpenHashSet<io.reactivex.disposables.Disposable> resources;

    public CompositeDisposable() {
            r0 = this;
            r0.<init>()
            return
    }

    public CompositeDisposable(java.lang.Iterable<? extends io.reactivex.disposables.Disposable> r3) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "resources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)
            io.reactivex.internal.util.OpenHashSet r0 = new io.reactivex.internal.util.OpenHashSet
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
            io.reactivex.internal.util.OpenHashSet<io.reactivex.disposables.Disposable> r1 = r2.resources
            r1.add(r0)
            goto L13
        L2a:
            return
    }

    public CompositeDisposable(io.reactivex.disposables.Disposable... r5) {
            r4 = this;
            r4.<init>()
            java.lang.String r0 = "resources is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            io.reactivex.internal.util.OpenHashSet r0 = new io.reactivex.internal.util.OpenHashSet
            int r1 = r5.length
            int r1 = r1 + 1
            r0.<init>(r1)
            r4.resources = r0
            int r0 = r5.length
            r1 = 0
        L14:
            if (r1 >= r0) goto L25
            r2 = r5[r1]
            java.lang.String r3 = "Disposable item is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r3)
            io.reactivex.internal.util.OpenHashSet<io.reactivex.disposables.Disposable> r3 = r4.resources
            r3.add(r2)
            int r1 = r1 + 1
            goto L14
        L25:
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
            io.reactivex.internal.util.OpenHashSet<io.reactivex.disposables.Disposable> r0 = r1.resources     // Catch: java.lang.Throwable -> L21
            if (r0 != 0) goto L19
            io.reactivex.internal.util.OpenHashSet r0 = new io.reactivex.internal.util.OpenHashSet     // Catch: java.lang.Throwable -> L21
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

    public boolean addAll(io.reactivex.disposables.Disposable... r7) {
            r6 = this;
            java.lang.String r0 = "ds is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r0)
            boolean r0 = r6.disposed
            r1 = 0
            if (r0 != 0) goto L34
            monitor-enter(r6)
            boolean r0 = r6.disposed     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L2f
            io.reactivex.internal.util.OpenHashSet<io.reactivex.disposables.Disposable> r0 = r6.resources     // Catch: java.lang.Throwable -> L31
            r2 = 1
            if (r0 != 0) goto L1d
            io.reactivex.internal.util.OpenHashSet r0 = new io.reactivex.internal.util.OpenHashSet     // Catch: java.lang.Throwable -> L31
            int r3 = r7.length     // Catch: java.lang.Throwable -> L31
            int r3 = r3 + r2
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L31
            r6.resources = r0     // Catch: java.lang.Throwable -> L31
        L1d:
            int r3 = r7.length     // Catch: java.lang.Throwable -> L31
        L1e:
            if (r1 >= r3) goto L2d
            r4 = r7[r1]     // Catch: java.lang.Throwable -> L31
            java.lang.String r5 = "d is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r5)     // Catch: java.lang.Throwable -> L31
            r0.add(r4)     // Catch: java.lang.Throwable -> L31
            int r1 = r1 + 1
            goto L1e
        L2d:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L31
            return r2
        L2f:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L31
            goto L34
        L31:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L31
            throw r7
        L34:
            int r0 = r7.length
            r2 = r1
        L36:
            if (r2 >= r0) goto L40
            r3 = r7[r2]
            r3.dispose()
            int r2 = r2 + 1
            goto L36
        L40:
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
            io.reactivex.internal.util.OpenHashSet<io.reactivex.disposables.Disposable> r0 = r2.resources     // Catch: java.lang.Throwable -> L16
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
            io.reactivex.internal.util.OpenHashSet<io.reactivex.disposables.Disposable> r0 = r2.resources     // Catch: java.lang.Throwable -> L22
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
            io.reactivex.internal.util.OpenHashSet<io.reactivex.disposables.Disposable> r0 = r2.resources     // Catch: java.lang.Throwable -> L19
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

    void dispose(io.reactivex.internal.util.OpenHashSet<io.reactivex.disposables.Disposable> r7) {
            r6 = this;
            if (r7 != 0) goto L3
            return
        L3:
            java.lang.Object[] r7 = r7.keys()
            int r0 = r7.length
            r1 = 0
            r2 = 0
            r3 = r1
        Lb:
            if (r3 >= r0) goto L2a
            r4 = r7[r3]
            boolean r5 = r4 instanceof io.reactivex.disposables.Disposable
            if (r5 == 0) goto L27
            io.reactivex.disposables.Disposable r4 = (io.reactivex.disposables.Disposable) r4     // Catch: java.lang.Throwable -> L19
            r4.dispose()     // Catch: java.lang.Throwable -> L19
            goto L27
        L19:
            r4 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r4)
            if (r2 != 0) goto L24
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L24:
            r2.add(r4)
        L27:
            int r3 = r3 + 1
            goto Lb
        L2a:
            if (r2 == 0) goto L44
            int r7 = r2.size()
            r0 = 1
            if (r7 != r0) goto L3e
            java.lang.Object r7 = r2.get(r1)
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            java.lang.RuntimeException r7 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r7)
            throw r7
        L3e:
            io.reactivex.exceptions.CompositeException r7 = new io.reactivex.exceptions.CompositeException
            r7.<init>(r2)
            throw r7
        L44:
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

    public int size() {
            r2 = this;
            boolean r0 = r2.disposed
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            monitor-enter(r2)
            boolean r0 = r2.disposed     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto Ld
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            return r1
        Ld:
            io.reactivex.internal.util.OpenHashSet<io.reactivex.disposables.Disposable> r0 = r2.resources     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L15
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L17
        L15:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            return r1
        L17:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            throw r0
    }
}
