package androidx.fragment.app;

/* loaded from: classes.dex */
class FragmentLifecycleCallbacksDispatcher {
    private final androidx.fragment.app.FragmentManager mFragmentManager;
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder> mLifecycleCallbacks;

    private static final class FragmentLifecycleCallbacksHolder {
        final androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks mCallback;
        final boolean mRecursive;

        FragmentLifecycleCallbacksHolder(androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks r1, boolean r2) {
                r0 = this;
                r0.<init>()
                r0.mCallback = r1
                r0.mRecursive = r2
                return
        }
    }

    FragmentLifecycleCallbacksDispatcher(androidx.fragment.app.FragmentManager r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.mLifecycleCallbacks = r0
            r1.mFragmentManager = r2
            return
    }

    void dispatchOnFragmentActivityCreated(androidx.fragment.app.Fragment r4, android.os.Bundle r5, boolean r6) {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r3.mFragmentManager
            androidx.fragment.app.Fragment r0 = r0.getParent()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r0.getLifecycleCallbacksDispatcher()
            r1 = 1
            r0.dispatchOnFragmentActivityCreated(r4, r5, r1)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r0 = r3.mLifecycleCallbacks
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r1 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r1
            if (r6 == 0) goto L2c
            boolean r2 = r1.mRecursive
            if (r2 == 0) goto L1a
        L2c:
            androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks r1 = r1.mCallback
            androidx.fragment.app.FragmentManager r2 = r3.mFragmentManager
            r1.onFragmentActivityCreated(r2, r4, r5)
            goto L1a
        L34:
            return
    }

    void dispatchOnFragmentAttached(androidx.fragment.app.Fragment r5, boolean r6) {
            r4 = this;
            androidx.fragment.app.FragmentManager r0 = r4.mFragmentManager
            androidx.fragment.app.FragmentHostCallback r0 = r0.getHost()
            android.content.Context r0 = r0.getContext()
            androidx.fragment.app.FragmentManager r1 = r4.mFragmentManager
            androidx.fragment.app.Fragment r1 = r1.getParent()
            if (r1 == 0) goto L1e
            androidx.fragment.app.FragmentManager r1 = r1.getParentFragmentManager()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r1 = r1.getLifecycleCallbacksDispatcher()
            r2 = 1
            r1.dispatchOnFragmentAttached(r5, r2)
        L1e:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r1 = r4.mLifecycleCallbacks
            java.util.Iterator r1 = r1.iterator()
        L24:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r2 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r2
            if (r6 == 0) goto L36
            boolean r3 = r2.mRecursive
            if (r3 == 0) goto L24
        L36:
            androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks r2 = r2.mCallback
            androidx.fragment.app.FragmentManager r3 = r4.mFragmentManager
            r2.onFragmentAttached(r3, r5, r0)
            goto L24
        L3e:
            return
    }

    void dispatchOnFragmentCreated(androidx.fragment.app.Fragment r4, android.os.Bundle r5, boolean r6) {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r3.mFragmentManager
            androidx.fragment.app.Fragment r0 = r0.getParent()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r0.getLifecycleCallbacksDispatcher()
            r1 = 1
            r0.dispatchOnFragmentCreated(r4, r5, r1)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r0 = r3.mLifecycleCallbacks
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r1 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r1
            if (r6 == 0) goto L2c
            boolean r2 = r1.mRecursive
            if (r2 == 0) goto L1a
        L2c:
            androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks r1 = r1.mCallback
            androidx.fragment.app.FragmentManager r2 = r3.mFragmentManager
            r1.onFragmentCreated(r2, r4, r5)
            goto L1a
        L34:
            return
    }

    void dispatchOnFragmentDestroyed(androidx.fragment.app.Fragment r4, boolean r5) {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r3.mFragmentManager
            androidx.fragment.app.Fragment r0 = r0.getParent()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r0.getLifecycleCallbacksDispatcher()
            r1 = 1
            r0.dispatchOnFragmentDestroyed(r4, r1)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r0 = r3.mLifecycleCallbacks
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r1 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r1
            if (r5 == 0) goto L2c
            boolean r2 = r1.mRecursive
            if (r2 == 0) goto L1a
        L2c:
            androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks r1 = r1.mCallback
            androidx.fragment.app.FragmentManager r2 = r3.mFragmentManager
            r1.onFragmentDestroyed(r2, r4)
            goto L1a
        L34:
            return
    }

    void dispatchOnFragmentDetached(androidx.fragment.app.Fragment r4, boolean r5) {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r3.mFragmentManager
            androidx.fragment.app.Fragment r0 = r0.getParent()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r0.getLifecycleCallbacksDispatcher()
            r1 = 1
            r0.dispatchOnFragmentDetached(r4, r1)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r0 = r3.mLifecycleCallbacks
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r1 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r1
            if (r5 == 0) goto L2c
            boolean r2 = r1.mRecursive
            if (r2 == 0) goto L1a
        L2c:
            androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks r1 = r1.mCallback
            androidx.fragment.app.FragmentManager r2 = r3.mFragmentManager
            r1.onFragmentDetached(r2, r4)
            goto L1a
        L34:
            return
    }

    void dispatchOnFragmentPaused(androidx.fragment.app.Fragment r4, boolean r5) {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r3.mFragmentManager
            androidx.fragment.app.Fragment r0 = r0.getParent()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r0.getLifecycleCallbacksDispatcher()
            r1 = 1
            r0.dispatchOnFragmentPaused(r4, r1)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r0 = r3.mLifecycleCallbacks
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r1 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r1
            if (r5 == 0) goto L2c
            boolean r2 = r1.mRecursive
            if (r2 == 0) goto L1a
        L2c:
            androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks r1 = r1.mCallback
            androidx.fragment.app.FragmentManager r2 = r3.mFragmentManager
            r1.onFragmentPaused(r2, r4)
            goto L1a
        L34:
            return
    }

    void dispatchOnFragmentPreAttached(androidx.fragment.app.Fragment r5, boolean r6) {
            r4 = this;
            androidx.fragment.app.FragmentManager r0 = r4.mFragmentManager
            androidx.fragment.app.FragmentHostCallback r0 = r0.getHost()
            android.content.Context r0 = r0.getContext()
            androidx.fragment.app.FragmentManager r1 = r4.mFragmentManager
            androidx.fragment.app.Fragment r1 = r1.getParent()
            if (r1 == 0) goto L1e
            androidx.fragment.app.FragmentManager r1 = r1.getParentFragmentManager()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r1 = r1.getLifecycleCallbacksDispatcher()
            r2 = 1
            r1.dispatchOnFragmentPreAttached(r5, r2)
        L1e:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r1 = r4.mLifecycleCallbacks
            java.util.Iterator r1 = r1.iterator()
        L24:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r2 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r2
            if (r6 == 0) goto L36
            boolean r3 = r2.mRecursive
            if (r3 == 0) goto L24
        L36:
            androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks r2 = r2.mCallback
            androidx.fragment.app.FragmentManager r3 = r4.mFragmentManager
            r2.onFragmentPreAttached(r3, r5, r0)
            goto L24
        L3e:
            return
    }

    void dispatchOnFragmentPreCreated(androidx.fragment.app.Fragment r4, android.os.Bundle r5, boolean r6) {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r3.mFragmentManager
            androidx.fragment.app.Fragment r0 = r0.getParent()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r0.getLifecycleCallbacksDispatcher()
            r1 = 1
            r0.dispatchOnFragmentPreCreated(r4, r5, r1)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r0 = r3.mLifecycleCallbacks
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r1 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r1
            if (r6 == 0) goto L2c
            boolean r2 = r1.mRecursive
            if (r2 == 0) goto L1a
        L2c:
            androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks r1 = r1.mCallback
            androidx.fragment.app.FragmentManager r2 = r3.mFragmentManager
            r1.onFragmentPreCreated(r2, r4, r5)
            goto L1a
        L34:
            return
    }

    void dispatchOnFragmentResumed(androidx.fragment.app.Fragment r4, boolean r5) {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r3.mFragmentManager
            androidx.fragment.app.Fragment r0 = r0.getParent()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r0.getLifecycleCallbacksDispatcher()
            r1 = 1
            r0.dispatchOnFragmentResumed(r4, r1)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r0 = r3.mLifecycleCallbacks
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r1 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r1
            if (r5 == 0) goto L2c
            boolean r2 = r1.mRecursive
            if (r2 == 0) goto L1a
        L2c:
            androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks r1 = r1.mCallback
            androidx.fragment.app.FragmentManager r2 = r3.mFragmentManager
            r1.onFragmentResumed(r2, r4)
            goto L1a
        L34:
            return
    }

    void dispatchOnFragmentSaveInstanceState(androidx.fragment.app.Fragment r4, android.os.Bundle r5, boolean r6) {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r3.mFragmentManager
            androidx.fragment.app.Fragment r0 = r0.getParent()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r0.getLifecycleCallbacksDispatcher()
            r1 = 1
            r0.dispatchOnFragmentSaveInstanceState(r4, r5, r1)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r0 = r3.mLifecycleCallbacks
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r1 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r1
            if (r6 == 0) goto L2c
            boolean r2 = r1.mRecursive
            if (r2 == 0) goto L1a
        L2c:
            androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks r1 = r1.mCallback
            androidx.fragment.app.FragmentManager r2 = r3.mFragmentManager
            r1.onFragmentSaveInstanceState(r2, r4, r5)
            goto L1a
        L34:
            return
    }

    void dispatchOnFragmentStarted(androidx.fragment.app.Fragment r4, boolean r5) {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r3.mFragmentManager
            androidx.fragment.app.Fragment r0 = r0.getParent()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r0.getLifecycleCallbacksDispatcher()
            r1 = 1
            r0.dispatchOnFragmentStarted(r4, r1)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r0 = r3.mLifecycleCallbacks
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r1 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r1
            if (r5 == 0) goto L2c
            boolean r2 = r1.mRecursive
            if (r2 == 0) goto L1a
        L2c:
            androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks r1 = r1.mCallback
            androidx.fragment.app.FragmentManager r2 = r3.mFragmentManager
            r1.onFragmentStarted(r2, r4)
            goto L1a
        L34:
            return
    }

    void dispatchOnFragmentStopped(androidx.fragment.app.Fragment r4, boolean r5) {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r3.mFragmentManager
            androidx.fragment.app.Fragment r0 = r0.getParent()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r0.getLifecycleCallbacksDispatcher()
            r1 = 1
            r0.dispatchOnFragmentStopped(r4, r1)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r0 = r3.mLifecycleCallbacks
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r1 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r1
            if (r5 == 0) goto L2c
            boolean r2 = r1.mRecursive
            if (r2 == 0) goto L1a
        L2c:
            androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks r1 = r1.mCallback
            androidx.fragment.app.FragmentManager r2 = r3.mFragmentManager
            r1.onFragmentStopped(r2, r4)
            goto L1a
        L34:
            return
    }

    void dispatchOnFragmentViewCreated(androidx.fragment.app.Fragment r4, android.view.View r5, android.os.Bundle r6, boolean r7) {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r3.mFragmentManager
            androidx.fragment.app.Fragment r0 = r0.getParent()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r0.getLifecycleCallbacksDispatcher()
            r1 = 1
            r0.dispatchOnFragmentViewCreated(r4, r5, r6, r1)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r0 = r3.mLifecycleCallbacks
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r1 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r1
            if (r7 == 0) goto L2c
            boolean r2 = r1.mRecursive
            if (r2 == 0) goto L1a
        L2c:
            androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks r1 = r1.mCallback
            androidx.fragment.app.FragmentManager r2 = r3.mFragmentManager
            r1.onFragmentViewCreated(r2, r4, r5, r6)
            goto L1a
        L34:
            return
    }

    void dispatchOnFragmentViewDestroyed(androidx.fragment.app.Fragment r4, boolean r5) {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r3.mFragmentManager
            androidx.fragment.app.Fragment r0 = r0.getParent()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r0.getLifecycleCallbacksDispatcher()
            r1 = 1
            r0.dispatchOnFragmentViewDestroyed(r4, r1)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r0 = r3.mLifecycleCallbacks
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r1 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r1
            if (r5 == 0) goto L2c
            boolean r2 = r1.mRecursive
            if (r2 == 0) goto L1a
        L2c:
            androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks r1 = r1.mCallback
            androidx.fragment.app.FragmentManager r2 = r3.mFragmentManager
            r1.onFragmentViewDestroyed(r2, r4)
            goto L1a
        L34:
            return
    }

    public void registerFragmentLifecycleCallbacks(androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks r3, boolean r4) {
            r2 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r0 = r2.mLifecycleCallbacks
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r1 = new androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder
            r1.<init>(r3, r4)
            r0.add(r1)
            return
    }

    public void unregisterFragmentLifecycleCallbacks(androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks r5) {
            r4 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r0 = r4.mLifecycleCallbacks
            monitor-enter(r0)
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r1 = r4.mLifecycleCallbacks     // Catch: java.lang.Throwable -> L23
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L23
            r2 = 0
        La:
            if (r2 >= r1) goto L21
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r3 = r4.mLifecycleCallbacks     // Catch: java.lang.Throwable -> L23
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> L23
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r3 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r3     // Catch: java.lang.Throwable -> L23
            androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks r3 = r3.mCallback     // Catch: java.lang.Throwable -> L23
            if (r3 != r5) goto L1e
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r5 = r4.mLifecycleCallbacks     // Catch: java.lang.Throwable -> L23
            r5.remove(r2)     // Catch: java.lang.Throwable -> L23
            goto L21
        L1e:
            int r2 = r2 + 1
            goto La
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            return
        L23:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            throw r5
    }
}
