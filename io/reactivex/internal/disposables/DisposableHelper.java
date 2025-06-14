package io.reactivex.internal.disposables;

/* loaded from: classes.dex */
public enum DisposableHelper extends java.lang.Enum<io.reactivex.internal.disposables.DisposableHelper> implements io.reactivex.disposables.Disposable {
    private static final /* synthetic */ io.reactivex.internal.disposables.DisposableHelper[] $VALUES = null;
    public static final io.reactivex.internal.disposables.DisposableHelper DISPOSED = null;

    static {
            io.reactivex.internal.disposables.DisposableHelper r0 = new io.reactivex.internal.disposables.DisposableHelper
            java.lang.String r1 = "DISPOSED"
            r2 = 0
            r0.<init>(r1, r2)
            io.reactivex.internal.disposables.DisposableHelper.DISPOSED = r0
            r1 = 1
            io.reactivex.internal.disposables.DisposableHelper[] r1 = new io.reactivex.internal.disposables.DisposableHelper[r1]
            r1[r2] = r0
            io.reactivex.internal.disposables.DisposableHelper.$VALUES = r1
            return
    }

    DisposableHelper(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static boolean dispose(java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r2) {
            java.lang.Object r0 = r2.get()
            io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
            io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
            if (r0 == r1) goto L19
            java.lang.Object r2 = r2.getAndSet(r1)
            io.reactivex.disposables.Disposable r2 = (io.reactivex.disposables.Disposable) r2
            if (r2 == r1) goto L19
            if (r2 == 0) goto L17
            r2.dispose()
        L17:
            r2 = 1
            return r2
        L19:
            r2 = 0
            return r2
    }

    public static boolean isDisposed(io.reactivex.disposables.Disposable r1) {
            io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
            if (r1 != r0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
    }

    public static boolean replace(java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r2, io.reactivex.disposables.Disposable r3) {
        L0:
            java.lang.Object r0 = r2.get()
            io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
            io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
            if (r0 != r1) goto L11
            if (r3 == 0) goto Lf
            r3.dispose()
        Lf:
            r2 = 0
            return r2
        L11:
            boolean r0 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r2, r0, r3)
            if (r0 == 0) goto L0
            r2 = 1
            return r2
    }

    public static void reportDisposableSet() {
            io.reactivex.exceptions.ProtocolViolationException r0 = new io.reactivex.exceptions.ProtocolViolationException
            java.lang.String r1 = "Disposable already set!"
            r0.<init>(r1)
            io.reactivex.plugins.RxJavaPlugins.onError(r0)
            return
    }

    public static boolean set(java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r2, io.reactivex.disposables.Disposable r3) {
        L0:
            java.lang.Object r0 = r2.get()
            io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
            io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
            if (r0 != r1) goto L11
            if (r3 == 0) goto Lf
            r3.dispose()
        Lf:
            r2 = 0
            return r2
        L11:
            boolean r1 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r2, r0, r3)
            if (r1 == 0) goto L0
            if (r0 == 0) goto L1c
            r0.dispose()
        L1c:
            r2 = 1
            return r2
    }

    public static boolean setOnce(java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r1, io.reactivex.disposables.Disposable r2) {
            java.lang.String r0 = "d is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            r0 = 0
            boolean r0 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r1, r0, r2)
            if (r0 != 0) goto L1c
            r2.dispose()
            java.lang.Object r1 = r1.get()
            io.reactivex.internal.disposables.DisposableHelper r2 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
            if (r1 == r2) goto L1a
            reportDisposableSet()
        L1a:
            r1 = 0
            return r1
        L1c:
            r1 = 1
            return r1
    }

    public static boolean trySet(java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r1, io.reactivex.disposables.Disposable r2) {
            r0 = 0
            boolean r0 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r1, r0, r2)
            if (r0 != 0) goto L14
            java.lang.Object r1 = r1.get()
            io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
            if (r1 != r0) goto L12
            r2.dispose()
        L12:
            r1 = 0
            return r1
        L14:
            r1 = 1
            return r1
    }

    public static boolean validate(io.reactivex.disposables.Disposable r1, io.reactivex.disposables.Disposable r2) {
            r0 = 0
            if (r2 != 0) goto Le
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "next is null"
            r1.<init>(r2)
            io.reactivex.plugins.RxJavaPlugins.onError(r1)
            return r0
        Le:
            if (r1 == 0) goto L17
            r2.dispose()
            reportDisposableSet()
            return r0
        L17:
            r1 = 1
            return r1
    }

    public static io.reactivex.internal.disposables.DisposableHelper valueOf(java.lang.String r1) {
            java.lang.Class<io.reactivex.internal.disposables.DisposableHelper> r0 = io.reactivex.internal.disposables.DisposableHelper.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.reactivex.internal.disposables.DisposableHelper r1 = (io.reactivex.internal.disposables.DisposableHelper) r1
            return r1
    }

    public static io.reactivex.internal.disposables.DisposableHelper[] values() {
            io.reactivex.internal.disposables.DisposableHelper[] r0 = io.reactivex.internal.disposables.DisposableHelper.$VALUES
            java.lang.Object r0 = r0.clone()
            io.reactivex.internal.disposables.DisposableHelper[] r0 = (io.reactivex.internal.disposables.DisposableHelper[]) r0
            return r0
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
            r0 = this;
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
            r1 = this;
            r0 = 1
            return r0
    }
}
