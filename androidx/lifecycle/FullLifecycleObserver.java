package androidx.lifecycle;

/* loaded from: classes.dex */
interface FullLifecycleObserver extends androidx.lifecycle.LifecycleObserver {
    void onCreate(androidx.lifecycle.LifecycleOwner r1);

    void onDestroy(androidx.lifecycle.LifecycleOwner r1);

    void onPause(androidx.lifecycle.LifecycleOwner r1);

    void onResume(androidx.lifecycle.LifecycleOwner r1);

    void onStart(androidx.lifecycle.LifecycleOwner r1);

    void onStop(androidx.lifecycle.LifecycleOwner r1);
}
