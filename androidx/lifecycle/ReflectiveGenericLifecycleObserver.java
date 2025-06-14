package androidx.lifecycle;

/* loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements androidx.lifecycle.LifecycleEventObserver {
    private final androidx.lifecycle.ClassesInfoCache.CallbackInfo mInfo;
    private final java.lang.Object mWrapped;

    ReflectiveGenericLifecycleObserver(java.lang.Object r2) {
            r1 = this;
            r1.<init>()
            r1.mWrapped = r2
            androidx.lifecycle.ClassesInfoCache r0 = androidx.lifecycle.ClassesInfoCache.sInstance
            java.lang.Class r2 = r2.getClass()
            androidx.lifecycle.ClassesInfoCache$CallbackInfo r2 = r0.getInfo(r2)
            r1.mInfo = r2
            return
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(androidx.lifecycle.LifecycleOwner r3, androidx.lifecycle.Lifecycle.Event r4) {
            r2 = this;
            androidx.lifecycle.ClassesInfoCache$CallbackInfo r0 = r2.mInfo
            java.lang.Object r1 = r2.mWrapped
            r0.invokeCallbacks(r3, r4, r1)
            return
    }
}
