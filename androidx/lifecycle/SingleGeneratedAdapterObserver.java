package androidx.lifecycle;

/* loaded from: classes.dex */
class SingleGeneratedAdapterObserver implements androidx.lifecycle.LifecycleEventObserver {
    private final androidx.lifecycle.GeneratedAdapter mGeneratedAdapter;

    SingleGeneratedAdapterObserver(androidx.lifecycle.GeneratedAdapter r1) {
            r0 = this;
            r0.<init>()
            r0.mGeneratedAdapter = r1
            return
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(androidx.lifecycle.LifecycleOwner r4, androidx.lifecycle.Lifecycle.Event r5) {
            r3 = this;
            androidx.lifecycle.GeneratedAdapter r0 = r3.mGeneratedAdapter
            r1 = 0
            r2 = 0
            r0.callMethods(r4, r5, r1, r2)
            androidx.lifecycle.GeneratedAdapter r0 = r3.mGeneratedAdapter
            r1 = 1
            r0.callMethods(r4, r5, r1, r2)
            return
    }
}
