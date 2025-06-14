package io.reactivex.subjects;

/* loaded from: classes.dex */
public final class MaybeSubject<T> extends io.reactivex.Maybe<T> implements io.reactivex.MaybeObserver<T> {
    static final io.reactivex.subjects.MaybeSubject.MaybeDisposable[] EMPTY = null;
    static final io.reactivex.subjects.MaybeSubject.MaybeDisposable[] TERMINATED = null;
    java.lang.Throwable error;
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.MaybeSubject.MaybeDisposable<T>[]> observers;
    final java.util.concurrent.atomic.AtomicBoolean once;
    T value;

    static final class MaybeDisposable<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.MaybeSubject<T>> implements io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -7650903191002190468L;
        final io.reactivex.MaybeObserver<? super T> actual;

        MaybeDisposable(io.reactivex.MaybeObserver<? super T> r1, io.reactivex.subjects.MaybeSubject<T> r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.lazySet(r2)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                r0 = 0
                java.lang.Object r0 = r1.getAndSet(r0)
                io.reactivex.subjects.MaybeSubject r0 = (io.reactivex.subjects.MaybeSubject) r0
                if (r0 == 0) goto Lc
                r0.remove(r1)
            Lc:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                java.lang.Object r0 = r1.get()
                if (r0 != 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }
    }

    static {
            r0 = 0
            io.reactivex.subjects.MaybeSubject$MaybeDisposable[] r1 = new io.reactivex.subjects.MaybeSubject.MaybeDisposable[r0]
            io.reactivex.subjects.MaybeSubject.EMPTY = r1
            io.reactivex.subjects.MaybeSubject$MaybeDisposable[] r0 = new io.reactivex.subjects.MaybeSubject.MaybeDisposable[r0]
            io.reactivex.subjects.MaybeSubject.TERMINATED = r0
            return
    }

    MaybeSubject() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r2.once = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            io.reactivex.subjects.MaybeSubject$MaybeDisposable[] r1 = io.reactivex.subjects.MaybeSubject.EMPTY
            r0.<init>(r1)
            r2.observers = r0
            return
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.subjects.MaybeSubject<T> create() {
            io.reactivex.subjects.MaybeSubject r0 = new io.reactivex.subjects.MaybeSubject
            r0.<init>()
            return r0
    }

    boolean add(io.reactivex.subjects.MaybeSubject.MaybeDisposable<T> r5) {
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.MaybeSubject$MaybeDisposable<T>[]> r0 = r4.observers
            java.lang.Object r0 = r0.get()
            io.reactivex.subjects.MaybeSubject$MaybeDisposable[] r0 = (io.reactivex.subjects.MaybeSubject.MaybeDisposable[]) r0
            io.reactivex.subjects.MaybeSubject$MaybeDisposable[] r1 = io.reactivex.subjects.MaybeSubject.TERMINATED
            r2 = 0
            if (r0 != r1) goto Le
            return r2
        Le:
            int r1 = r0.length
            int r3 = r1 + 1
            io.reactivex.subjects.MaybeSubject$MaybeDisposable[] r3 = new io.reactivex.subjects.MaybeSubject.MaybeDisposable[r3]
            java.lang.System.arraycopy(r0, r2, r3, r2, r1)
            r3[r1] = r5
            java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.MaybeSubject$MaybeDisposable<T>[]> r1 = r4.observers
            boolean r0 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r1, r0, r3)
            if (r0 == 0) goto L0
            r5 = 1
            return r5
    }

    public java.lang.Throwable getThrowable() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.MaybeSubject$MaybeDisposable<T>[]> r0 = r2.observers
            java.lang.Object r0 = r0.get()
            io.reactivex.subjects.MaybeSubject$MaybeDisposable[] r1 = io.reactivex.subjects.MaybeSubject.TERMINATED
            if (r0 != r1) goto Ld
            java.lang.Throwable r0 = r2.error
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public T getValue() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.MaybeSubject$MaybeDisposable<T>[]> r0 = r2.observers
            java.lang.Object r0 = r0.get()
            io.reactivex.subjects.MaybeSubject$MaybeDisposable[] r1 = io.reactivex.subjects.MaybeSubject.TERMINATED
            if (r0 != r1) goto Ld
            T r0 = r2.value
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public boolean hasComplete() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.MaybeSubject$MaybeDisposable<T>[]> r0 = r2.observers
            java.lang.Object r0 = r0.get()
            io.reactivex.subjects.MaybeSubject$MaybeDisposable[] r1 = io.reactivex.subjects.MaybeSubject.TERMINATED
            if (r0 != r1) goto L14
            T r0 = r2.value
            if (r0 != 0) goto L14
            java.lang.Throwable r0 = r2.error
            if (r0 != 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            return r0
    }

    public boolean hasObservers() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.MaybeSubject$MaybeDisposable<T>[]> r0 = r1.observers
            java.lang.Object r0 = r0.get()
            io.reactivex.subjects.MaybeSubject$MaybeDisposable[] r0 = (io.reactivex.subjects.MaybeSubject.MaybeDisposable[]) r0
            int r0 = r0.length
            if (r0 == 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    public boolean hasThrowable() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.MaybeSubject$MaybeDisposable<T>[]> r0 = r2.observers
            java.lang.Object r0 = r0.get()
            io.reactivex.subjects.MaybeSubject$MaybeDisposable[] r1 = io.reactivex.subjects.MaybeSubject.TERMINATED
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

    public boolean hasValue() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.MaybeSubject$MaybeDisposable<T>[]> r0 = r2.observers
            java.lang.Object r0 = r0.get()
            io.reactivex.subjects.MaybeSubject$MaybeDisposable[] r1 = io.reactivex.subjects.MaybeSubject.TERMINATED
            if (r0 != r1) goto L10
            T r0 = r2.value
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    int observerCount() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.MaybeSubject$MaybeDisposable<T>[]> r0 = r1.observers
            java.lang.Object r0 = r0.get()
            io.reactivex.subjects.MaybeSubject$MaybeDisposable[] r0 = (io.reactivex.subjects.MaybeSubject.MaybeDisposable[]) r0
            int r0 = r0.length
            return r0
    }

    @Override // io.reactivex.MaybeObserver
    public void onComplete() {
            r4 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.once
            r1 = 1
            r2 = 0
            boolean r0 = r0.compareAndSet(r2, r1)
            if (r0 == 0) goto L21
            java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.MaybeSubject$MaybeDisposable<T>[]> r0 = r4.observers
            io.reactivex.subjects.MaybeSubject$MaybeDisposable[] r1 = io.reactivex.subjects.MaybeSubject.TERMINATED
            java.lang.Object r0 = r0.getAndSet(r1)
            io.reactivex.subjects.MaybeSubject$MaybeDisposable[] r0 = (io.reactivex.subjects.MaybeSubject.MaybeDisposable[]) r0
            int r1 = r0.length
        L15:
            if (r2 >= r1) goto L21
            r3 = r0[r2]
            io.reactivex.MaybeObserver<? super T> r3 = r3.actual
            r3.onComplete()
            int r2 = r2 + 1
            goto L15
        L21:
            return
    }

    @Override // io.reactivex.MaybeObserver
    public void onError(java.lang.Throwable r5) {
            r4 = this;
            java.lang.String r0 = "onError called with null. Null values are generally not allowed in 2.x operators and sources."
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.once
            r1 = 1
            r2 = 0
            boolean r0 = r0.compareAndSet(r2, r1)
            if (r0 == 0) goto L28
            r4.error = r5
            java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.MaybeSubject$MaybeDisposable<T>[]> r0 = r4.observers
            io.reactivex.subjects.MaybeSubject$MaybeDisposable[] r1 = io.reactivex.subjects.MaybeSubject.TERMINATED
            java.lang.Object r0 = r0.getAndSet(r1)
            io.reactivex.subjects.MaybeSubject$MaybeDisposable[] r0 = (io.reactivex.subjects.MaybeSubject.MaybeDisposable[]) r0
            int r1 = r0.length
        L1c:
            if (r2 >= r1) goto L2b
            r3 = r0[r2]
            io.reactivex.MaybeObserver<? super T> r3 = r3.actual
            r3.onError(r5)
            int r2 = r2 + 1
            goto L1c
        L28:
            io.reactivex.plugins.RxJavaPlugins.onError(r5)
        L2b:
            return
    }

    @Override // io.reactivex.MaybeObserver
    public void onSubscribe(io.reactivex.disposables.Disposable r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.MaybeSubject$MaybeDisposable<T>[]> r0 = r2.observers
            java.lang.Object r0 = r0.get()
            io.reactivex.subjects.MaybeSubject$MaybeDisposable[] r1 = io.reactivex.subjects.MaybeSubject.TERMINATED
            if (r0 != r1) goto Ld
            r3.dispose()
        Ld:
            return
    }

    @Override // io.reactivex.MaybeObserver
    public void onSuccess(T r5) {
            r4 = this;
            java.lang.String r0 = "onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.once
            r1 = 1
            r2 = 0
            boolean r0 = r0.compareAndSet(r2, r1)
            if (r0 == 0) goto L28
            r4.value = r5
            java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.MaybeSubject$MaybeDisposable<T>[]> r0 = r4.observers
            io.reactivex.subjects.MaybeSubject$MaybeDisposable[] r1 = io.reactivex.subjects.MaybeSubject.TERMINATED
            java.lang.Object r0 = r0.getAndSet(r1)
            io.reactivex.subjects.MaybeSubject$MaybeDisposable[] r0 = (io.reactivex.subjects.MaybeSubject.MaybeDisposable[]) r0
            int r1 = r0.length
        L1c:
            if (r2 >= r1) goto L28
            r3 = r0[r2]
            io.reactivex.MaybeObserver<? super T> r3 = r3.actual
            r3.onSuccess(r5)
            int r2 = r2 + 1
            goto L1c
        L28:
            return
    }

    void remove(io.reactivex.subjects.MaybeSubject.MaybeDisposable<T> r7) {
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.MaybeSubject$MaybeDisposable<T>[]> r0 = r6.observers
            java.lang.Object r0 = r0.get()
            io.reactivex.subjects.MaybeSubject$MaybeDisposable[] r0 = (io.reactivex.subjects.MaybeSubject.MaybeDisposable[]) r0
            int r1 = r0.length
            if (r1 != 0) goto Lc
            return
        Lc:
            r2 = 0
            r3 = r2
        Le:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 != r7) goto L15
            goto L19
        L15:
            int r3 = r3 + 1
            goto Le
        L18:
            r3 = -1
        L19:
            if (r3 >= 0) goto L1c
            return
        L1c:
            r4 = 1
            if (r1 != r4) goto L22
            io.reactivex.subjects.MaybeSubject$MaybeDisposable[] r1 = io.reactivex.subjects.MaybeSubject.EMPTY
            goto L31
        L22:
            int r5 = r1 + (-1)
            io.reactivex.subjects.MaybeSubject$MaybeDisposable[] r5 = new io.reactivex.subjects.MaybeSubject.MaybeDisposable[r5]
            java.lang.System.arraycopy(r0, r2, r5, r2, r3)
            int r2 = r3 + 1
            int r1 = r1 - r3
            int r1 = r1 - r4
            java.lang.System.arraycopy(r0, r2, r5, r3, r1)
            r1 = r5
        L31:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.MaybeSubject$MaybeDisposable<T>[]> r2 = r6.observers
            boolean r0 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r2, r0, r1)
            if (r0 == 0) goto L0
            return
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super T> r3) {
            r2 = this;
            io.reactivex.subjects.MaybeSubject$MaybeDisposable r0 = new io.reactivex.subjects.MaybeSubject$MaybeDisposable
            r0.<init>(r3, r2)
            r3.onSubscribe(r0)
            boolean r1 = r2.add(r0)
            if (r1 == 0) goto L18
            boolean r3 = r0.isDisposed()
            if (r3 == 0) goto L2b
            r2.remove(r0)
            goto L2b
        L18:
            java.lang.Throwable r0 = r2.error
            if (r0 == 0) goto L20
            r3.onError(r0)
            goto L2b
        L20:
            T r0 = r2.value
            if (r0 != 0) goto L28
            r3.onComplete()
            goto L2b
        L28:
            r3.onSuccess(r0)
        L2b:
            return
    }
}
