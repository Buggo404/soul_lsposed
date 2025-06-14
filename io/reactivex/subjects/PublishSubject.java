package io.reactivex.subjects;

/* loaded from: classes.dex */
public final class PublishSubject<T> extends io.reactivex.subjects.Subject<T> {
    static final io.reactivex.subjects.PublishSubject.PublishDisposable[] EMPTY = null;
    static final io.reactivex.subjects.PublishSubject.PublishDisposable[] TERMINATED = null;
    java.lang.Throwable error;
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.PublishSubject.PublishDisposable<T>[]> subscribers;

    static final class PublishDisposable<T> extends java.util.concurrent.atomic.AtomicBoolean implements io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 3562861878281475070L;
        final io.reactivex.Observer<? super T> actual;
        final io.reactivex.subjects.PublishSubject<T> parent;

        PublishDisposable(io.reactivex.Observer<? super T> r1, io.reactivex.subjects.PublishSubject<T> r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.parent = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r2 = this;
                r0 = 0
                r1 = 1
                boolean r0 = r2.compareAndSet(r0, r1)
                if (r0 == 0) goto Ld
                io.reactivex.subjects.PublishSubject<T> r0 = r2.parent
                r0.remove(r2)
            Ld:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                boolean r0 = r1.get()
                return r0
        }

        public void onComplete() {
                r1 = this;
                boolean r0 = r1.get()
                if (r0 != 0) goto Lb
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onComplete()
            Lb:
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.get()
                if (r0 == 0) goto La
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
                goto Lf
            La:
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onError(r2)
            Lf:
                return
        }

        public void onNext(T r2) {
                r1 = this;
                boolean r0 = r1.get()
                if (r0 != 0) goto Lb
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onNext(r2)
            Lb:
                return
        }
    }

    static {
            r0 = 0
            io.reactivex.subjects.PublishSubject$PublishDisposable[] r1 = new io.reactivex.subjects.PublishSubject.PublishDisposable[r0]
            io.reactivex.subjects.PublishSubject.TERMINATED = r1
            io.reactivex.subjects.PublishSubject$PublishDisposable[] r0 = new io.reactivex.subjects.PublishSubject.PublishDisposable[r0]
            io.reactivex.subjects.PublishSubject.EMPTY = r0
            return
    }

    PublishSubject() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            io.reactivex.subjects.PublishSubject$PublishDisposable[] r1 = io.reactivex.subjects.PublishSubject.EMPTY
            r0.<init>(r1)
            r2.subscribers = r0
            return
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.subjects.PublishSubject<T> create() {
            io.reactivex.subjects.PublishSubject r0 = new io.reactivex.subjects.PublishSubject
            r0.<init>()
            return r0
    }

    boolean add(io.reactivex.subjects.PublishSubject.PublishDisposable<T> r5) {
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.PublishSubject$PublishDisposable<T>[]> r0 = r4.subscribers
            java.lang.Object r0 = r0.get()
            io.reactivex.subjects.PublishSubject$PublishDisposable[] r0 = (io.reactivex.subjects.PublishSubject.PublishDisposable[]) r0
            io.reactivex.subjects.PublishSubject$PublishDisposable[] r1 = io.reactivex.subjects.PublishSubject.TERMINATED
            r2 = 0
            if (r0 != r1) goto Le
            return r2
        Le:
            int r1 = r0.length
            int r3 = r1 + 1
            io.reactivex.subjects.PublishSubject$PublishDisposable[] r3 = new io.reactivex.subjects.PublishSubject.PublishDisposable[r3]
            java.lang.System.arraycopy(r0, r2, r3, r2, r1)
            r3[r1] = r5
            java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.PublishSubject$PublishDisposable<T>[]> r1 = r4.subscribers
            boolean r0 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r1, r0, r3)
            if (r0 == 0) goto L0
            r5 = 1
            return r5
    }

    @Override // io.reactivex.subjects.Subject
    public java.lang.Throwable getThrowable() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.PublishSubject$PublishDisposable<T>[]> r0 = r2.subscribers
            java.lang.Object r0 = r0.get()
            io.reactivex.subjects.PublishSubject$PublishDisposable[] r1 = io.reactivex.subjects.PublishSubject.TERMINATED
            if (r0 != r1) goto Ld
            java.lang.Throwable r0 = r2.error
            return r0
        Ld:
            r0 = 0
            return r0
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasComplete() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.PublishSubject$PublishDisposable<T>[]> r0 = r2.subscribers
            java.lang.Object r0 = r0.get()
            io.reactivex.subjects.PublishSubject$PublishDisposable[] r1 = io.reactivex.subjects.PublishSubject.TERMINATED
            if (r0 != r1) goto L10
            java.lang.Throwable r0 = r2.error
            if (r0 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasObservers() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.PublishSubject$PublishDisposable<T>[]> r0 = r1.subscribers
            java.lang.Object r0 = r0.get()
            io.reactivex.subjects.PublishSubject$PublishDisposable[] r0 = (io.reactivex.subjects.PublishSubject.PublishDisposable[]) r0
            int r0 = r0.length
            if (r0 == 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasThrowable() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.PublishSubject$PublishDisposable<T>[]> r0 = r2.subscribers
            java.lang.Object r0 = r0.get()
            io.reactivex.subjects.PublishSubject$PublishDisposable[] r1 = io.reactivex.subjects.PublishSubject.TERMINATED
            if (r0 != r1) goto L10
            java.lang.Throwable r0 = r2.error
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
            r4 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.PublishSubject$PublishDisposable<T>[]> r0 = r4.subscribers
            java.lang.Object r0 = r0.get()
            io.reactivex.subjects.PublishSubject$PublishDisposable[] r1 = io.reactivex.subjects.PublishSubject.TERMINATED
            if (r0 != r1) goto Lb
            return
        Lb:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.PublishSubject$PublishDisposable<T>[]> r0 = r4.subscribers
            java.lang.Object r0 = r0.getAndSet(r1)
            io.reactivex.subjects.PublishSubject$PublishDisposable[] r0 = (io.reactivex.subjects.PublishSubject.PublishDisposable[]) r0
            int r1 = r0.length
            r2 = 0
        L15:
            if (r2 >= r1) goto L1f
            r3 = r0[r2]
            r3.onComplete()
            int r2 = r2 + 1
            goto L15
        L1f:
            return
    }

    @Override // io.reactivex.Observer
    public void onError(java.lang.Throwable r5) {
            r4 = this;
            java.lang.String r0 = "onError called with null. Null values are generally not allowed in 2.x operators and sources."
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.PublishSubject$PublishDisposable<T>[]> r0 = r4.subscribers
            java.lang.Object r0 = r0.get()
            io.reactivex.subjects.PublishSubject$PublishDisposable[] r1 = io.reactivex.subjects.PublishSubject.TERMINATED
            if (r0 != r1) goto L13
            io.reactivex.plugins.RxJavaPlugins.onError(r5)
            return
        L13:
            r4.error = r5
            java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.PublishSubject$PublishDisposable<T>[]> r0 = r4.subscribers
            java.lang.Object r0 = r0.getAndSet(r1)
            io.reactivex.subjects.PublishSubject$PublishDisposable[] r0 = (io.reactivex.subjects.PublishSubject.PublishDisposable[]) r0
            int r1 = r0.length
            r2 = 0
        L1f:
            if (r2 >= r1) goto L29
            r3 = r0[r2]
            r3.onError(r5)
            int r2 = r2 + 1
            goto L1f
        L29:
            return
    }

    @Override // io.reactivex.Observer
    public void onNext(T r5) {
            r4 = this;
            java.lang.String r0 = "onNext called with null. Null values are generally not allowed in 2.x operators and sources."
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.PublishSubject$PublishDisposable<T>[]> r0 = r4.subscribers
            java.lang.Object r0 = r0.get()
            io.reactivex.subjects.PublishSubject$PublishDisposable[] r0 = (io.reactivex.subjects.PublishSubject.PublishDisposable[]) r0
            int r1 = r0.length
            r2 = 0
        Lf:
            if (r2 >= r1) goto L19
            r3 = r0[r2]
            r3.onNext(r5)
            int r2 = r2 + 1
            goto Lf
        L19:
            return
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(io.reactivex.disposables.Disposable r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.PublishSubject$PublishDisposable<T>[]> r0 = r2.subscribers
            java.lang.Object r0 = r0.get()
            io.reactivex.subjects.PublishSubject$PublishDisposable[] r1 = io.reactivex.subjects.PublishSubject.TERMINATED
            if (r0 != r1) goto Ld
            r3.dispose()
        Ld:
            return
    }

    void remove(io.reactivex.subjects.PublishSubject.PublishDisposable<T> r7) {
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.PublishSubject$PublishDisposable<T>[]> r0 = r6.subscribers
            java.lang.Object r0 = r0.get()
            io.reactivex.subjects.PublishSubject$PublishDisposable[] r0 = (io.reactivex.subjects.PublishSubject.PublishDisposable[]) r0
            io.reactivex.subjects.PublishSubject$PublishDisposable[] r1 = io.reactivex.subjects.PublishSubject.TERMINATED
            if (r0 == r1) goto L3f
            io.reactivex.subjects.PublishSubject$PublishDisposable[] r1 = io.reactivex.subjects.PublishSubject.EMPTY
            if (r0 != r1) goto L11
            goto L3f
        L11:
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L14:
            if (r3 >= r1) goto L1e
            r4 = r0[r3]
            if (r4 != r7) goto L1b
            goto L1f
        L1b:
            int r3 = r3 + 1
            goto L14
        L1e:
            r3 = -1
        L1f:
            if (r3 >= 0) goto L22
            return
        L22:
            r4 = 1
            if (r1 != r4) goto L28
            io.reactivex.subjects.PublishSubject$PublishDisposable[] r1 = io.reactivex.subjects.PublishSubject.EMPTY
            goto L37
        L28:
            int r5 = r1 + (-1)
            io.reactivex.subjects.PublishSubject$PublishDisposable[] r5 = new io.reactivex.subjects.PublishSubject.PublishDisposable[r5]
            java.lang.System.arraycopy(r0, r2, r5, r2, r3)
            int r2 = r3 + 1
            int r1 = r1 - r3
            int r1 = r1 - r4
            java.lang.System.arraycopy(r0, r2, r5, r3, r1)
            r1 = r5
        L37:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.PublishSubject$PublishDisposable<T>[]> r2 = r6.subscribers
            boolean r0 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r2, r0, r1)
            if (r0 == 0) goto L0
        L3f:
            return
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> r3) {
            r2 = this;
            io.reactivex.subjects.PublishSubject$PublishDisposable r0 = new io.reactivex.subjects.PublishSubject$PublishDisposable
            r0.<init>(r3, r2)
            r3.onSubscribe(r0)
            boolean r1 = r2.add(r0)
            if (r1 == 0) goto L18
            boolean r3 = r0.isDisposed()
            if (r3 == 0) goto L23
            r2.remove(r0)
            goto L23
        L18:
            java.lang.Throwable r0 = r2.error
            if (r0 == 0) goto L20
            r3.onError(r0)
            goto L23
        L20:
            r3.onComplete()
        L23:
            return
    }
}
