package io.reactivex.internal.disposables;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class DisposableHelper$$ExternalSyntheticBackportWithForwarding0 {
    /* renamed from: m */
    public static /* synthetic */ boolean m51m(java.util.concurrent.atomic.AtomicReference r1, java.lang.Object r2, java.lang.Object r3) {
        L0:
            boolean r0 = r1.compareAndSet(r2, r3)
            if (r0 == 0) goto L8
            r1 = 1
            return r1
        L8:
            java.lang.Object r0 = r1.get()
            if (r0 == r2) goto L0
            r1 = 0
            return r1
    }
}
