package androidx.lifecycle;

/* loaded from: classes.dex */
public abstract class LiveData<T> {
    static final java.lang.Object NOT_SET = null;
    static final int START_VERSION = -1;
    int mActiveCount;
    private boolean mChangingActiveState;
    private volatile java.lang.Object mData;
    final java.lang.Object mDataLock;
    private boolean mDispatchInvalidated;
    private boolean mDispatchingValue;
    private androidx.arch.core.internal.SafeIterableMap<androidx.lifecycle.Observer<? super T>, androidx.lifecycle.LiveData<T>.ObserverWrapper> mObservers;
    volatile java.lang.Object mPendingData;
    private final java.lang.Runnable mPostValueRunnable;
    private int mVersion;


    private class AlwaysActiveObserver extends androidx.lifecycle.LiveData<T>.ObserverWrapper {
        final /* synthetic */ androidx.lifecycle.LiveData this$0;

        AlwaysActiveObserver(androidx.lifecycle.LiveData r1, androidx.lifecycle.Observer<? super T> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1, r2)
                return
        }

        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        boolean shouldBeActive() {
                r1 = this;
                r0 = 1
                return r0
        }
    }

    class LifecycleBoundObserver extends androidx.lifecycle.LiveData<T>.ObserverWrapper implements androidx.lifecycle.LifecycleEventObserver {
        final androidx.lifecycle.LifecycleOwner mOwner;
        final /* synthetic */ androidx.lifecycle.LiveData this$0;

        LifecycleBoundObserver(androidx.lifecycle.LiveData r1, androidx.lifecycle.LifecycleOwner r2, androidx.lifecycle.Observer<? super T> r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1, r3)
                r0.mOwner = r2
                return
        }

        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        void detachObserver() {
                r1 = this;
                androidx.lifecycle.LifecycleOwner r0 = r1.mOwner
                androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
                r0.removeObserver(r1)
                return
        }

        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        boolean isAttachedTo(androidx.lifecycle.LifecycleOwner r2) {
                r1 = this;
                androidx.lifecycle.LifecycleOwner r0 = r1.mOwner
                if (r0 != r2) goto L6
                r2 = 1
                goto L7
            L6:
                r2 = 0
            L7:
                return r2
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(androidx.lifecycle.LifecycleOwner r2, androidx.lifecycle.Lifecycle.Event r3) {
                r1 = this;
                androidx.lifecycle.LifecycleOwner r2 = r1.mOwner
                androidx.lifecycle.Lifecycle r2 = r2.getLifecycle()
                androidx.lifecycle.Lifecycle$State r2 = r2.getCurrentState()
                androidx.lifecycle.Lifecycle$State r3 = androidx.lifecycle.Lifecycle.State.DESTROYED
                if (r2 != r3) goto L16
                androidx.lifecycle.LiveData r2 = r1.this$0
                androidx.lifecycle.Observer<? super T> r3 = r1.mObserver
                r2.removeObserver(r3)
                return
            L16:
                r3 = 0
            L17:
                if (r3 == r2) goto L2e
                boolean r3 = r1.shouldBeActive()
                r1.activeStateChanged(r3)
                androidx.lifecycle.LifecycleOwner r3 = r1.mOwner
                androidx.lifecycle.Lifecycle r3 = r3.getLifecycle()
                androidx.lifecycle.Lifecycle$State r3 = r3.getCurrentState()
                r0 = r3
                r3 = r2
                r2 = r0
                goto L17
            L2e:
                return
        }

        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        boolean shouldBeActive() {
                r2 = this;
                androidx.lifecycle.LifecycleOwner r0 = r2.mOwner
                androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
                androidx.lifecycle.Lifecycle$State r0 = r0.getCurrentState()
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.STARTED
                boolean r0 = r0.isAtLeast(r1)
                return r0
        }
    }

    private abstract class ObserverWrapper {
        boolean mActive;
        int mLastVersion;
        final androidx.lifecycle.Observer<? super T> mObserver;
        final /* synthetic */ androidx.lifecycle.LiveData this$0;

        ObserverWrapper(androidx.lifecycle.LiveData r1, androidx.lifecycle.Observer<? super T> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r1 = -1
                r0.mLastVersion = r1
                r0.mObserver = r2
                return
        }

        void activeStateChanged(boolean r2) {
                r1 = this;
                boolean r0 = r1.mActive
                if (r2 != r0) goto L5
                return
            L5:
                r1.mActive = r2
                androidx.lifecycle.LiveData r0 = r1.this$0
                if (r2 == 0) goto Ld
                r2 = 1
                goto Le
            Ld:
                r2 = -1
            Le:
                r0.changeActiveCounter(r2)
                boolean r2 = r1.mActive
                if (r2 == 0) goto L1a
                androidx.lifecycle.LiveData r2 = r1.this$0
                r2.dispatchingValue(r1)
            L1a:
                return
        }

        void detachObserver() {
                r0 = this;
                return
        }

        boolean isAttachedTo(androidx.lifecycle.LifecycleOwner r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        abstract boolean shouldBeActive();
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.lifecycle.LiveData.NOT_SET = r0
            return
    }

    public LiveData() {
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.mDataLock = r0
            androidx.arch.core.internal.SafeIterableMap r0 = new androidx.arch.core.internal.SafeIterableMap
            r0.<init>()
            r2.mObservers = r0
            r0 = 0
            r2.mActiveCount = r0
            java.lang.Object r0 = androidx.lifecycle.LiveData.NOT_SET
            r2.mPendingData = r0
            androidx.lifecycle.LiveData$1 r1 = new androidx.lifecycle.LiveData$1
            r1.<init>(r2)
            r2.mPostValueRunnable = r1
            r2.mData = r0
            r0 = -1
            r2.mVersion = r0
            return
    }

    public LiveData(T r3) {
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.mDataLock = r0
            androidx.arch.core.internal.SafeIterableMap r0 = new androidx.arch.core.internal.SafeIterableMap
            r0.<init>()
            r2.mObservers = r0
            r0 = 0
            r2.mActiveCount = r0
            java.lang.Object r1 = androidx.lifecycle.LiveData.NOT_SET
            r2.mPendingData = r1
            androidx.lifecycle.LiveData$1 r1 = new androidx.lifecycle.LiveData$1
            r1.<init>(r2)
            r2.mPostValueRunnable = r1
            r2.mData = r3
            r2.mVersion = r0
            return
    }

    static void assertMainThread(java.lang.String r3) {
            androidx.arch.core.executor.ArchTaskExecutor r0 = androidx.arch.core.executor.ArchTaskExecutor.getInstance()
            boolean r0 = r0.isMainThread()
            if (r0 == 0) goto Lb
            return
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Cannot invoke "
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r1 = " on a background thread"
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    private void considerNotify(androidx.lifecycle.LiveData<T>.ObserverWrapper r3) {
            r2 = this;
            boolean r0 = r3.mActive
            if (r0 != 0) goto L5
            return
        L5:
            boolean r0 = r3.shouldBeActive()
            if (r0 != 0) goto L10
            r0 = 0
            r3.activeStateChanged(r0)
            return
        L10:
            int r0 = r3.mLastVersion
            int r1 = r2.mVersion
            if (r0 < r1) goto L17
            return
        L17:
            r3.mLastVersion = r1
            androidx.lifecycle.Observer<? super T> r3 = r3.mObserver
            java.lang.Object r0 = r2.mData
            r3.onChanged(r0)
            return
    }

    void changeActiveCounter(int r5) {
            r4 = this;
            int r0 = r4.mActiveCount
            int r5 = r5 + r0
            r4.mActiveCount = r5
            boolean r5 = r4.mChangingActiveState
            if (r5 == 0) goto La
            return
        La:
            r5 = 1
            r4.mChangingActiveState = r5
        Ld:
            r1 = 0
            int r2 = r4.mActiveCount     // Catch: java.lang.Throwable -> L30
            if (r0 == r2) goto L2d
            if (r0 != 0) goto L18
            if (r2 <= 0) goto L18
            r3 = r5
            goto L19
        L18:
            r3 = r1
        L19:
            if (r0 <= 0) goto L1f
            if (r2 != 0) goto L1f
            r0 = r5
            goto L20
        L1f:
            r0 = r1
        L20:
            if (r3 == 0) goto L26
            r4.onActive()     // Catch: java.lang.Throwable -> L30
            goto L2b
        L26:
            if (r0 == 0) goto L2b
            r4.onInactive()     // Catch: java.lang.Throwable -> L30
        L2b:
            r0 = r2
            goto Ld
        L2d:
            r4.mChangingActiveState = r1
            return
        L30:
            r5 = move-exception
            r4.mChangingActiveState = r1
            throw r5
    }

    void dispatchingValue(androidx.lifecycle.LiveData<T>.ObserverWrapper r4) {
            r3 = this;
            boolean r0 = r3.mDispatchingValue
            r1 = 1
            if (r0 == 0) goto L8
            r3.mDispatchInvalidated = r1
            return
        L8:
            r3.mDispatchingValue = r1
        La:
            r0 = 0
            r3.mDispatchInvalidated = r0
            if (r4 == 0) goto L14
            r3.considerNotify(r4)
            r4 = 0
            goto L33
        L14:
            androidx.arch.core.internal.SafeIterableMap<androidx.lifecycle.Observer<? super T>, androidx.lifecycle.LiveData<T>$ObserverWrapper> r1 = r3.mObservers
            androidx.arch.core.internal.SafeIterableMap$IteratorWithAdditions r1 = r1.iteratorWithAdditions()
        L1a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L33
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getValue()
            androidx.lifecycle.LiveData$ObserverWrapper r2 = (androidx.lifecycle.LiveData.ObserverWrapper) r2
            r3.considerNotify(r2)
            boolean r2 = r3.mDispatchInvalidated
            if (r2 == 0) goto L1a
        L33:
            boolean r1 = r3.mDispatchInvalidated
            if (r1 != 0) goto La
            r3.mDispatchingValue = r0
            return
    }

    public T getValue() {
            r2 = this;
            java.lang.Object r0 = r2.mData
            java.lang.Object r1 = androidx.lifecycle.LiveData.NOT_SET
            if (r0 == r1) goto L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    int getVersion() {
            r1 = this;
            int r0 = r1.mVersion
            return r0
    }

    public boolean hasActiveObservers() {
            r1 = this;
            int r0 = r1.mActiveCount
            if (r0 <= 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public boolean hasObservers() {
            r1 = this;
            androidx.arch.core.internal.SafeIterableMap<androidx.lifecycle.Observer<? super T>, androidx.lifecycle.LiveData<T>$ObserverWrapper> r0 = r1.mObservers
            int r0 = r0.size()
            if (r0 <= 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    public void observe(androidx.lifecycle.LifecycleOwner r3, androidx.lifecycle.Observer<? super T> r4) {
            r2 = this;
            java.lang.String r0 = "observe"
            assertMainThread(r0)
            androidx.lifecycle.Lifecycle r0 = r3.getLifecycle()
            androidx.lifecycle.Lifecycle$State r0 = r0.getCurrentState()
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r0 != r1) goto L12
            return
        L12:
            androidx.lifecycle.LiveData$LifecycleBoundObserver r0 = new androidx.lifecycle.LiveData$LifecycleBoundObserver
            r0.<init>(r2, r3, r4)
            androidx.arch.core.internal.SafeIterableMap<androidx.lifecycle.Observer<? super T>, androidx.lifecycle.LiveData<T>$ObserverWrapper> r1 = r2.mObservers
            java.lang.Object r4 = r1.putIfAbsent(r4, r0)
            androidx.lifecycle.LiveData$ObserverWrapper r4 = (androidx.lifecycle.LiveData.ObserverWrapper) r4
            if (r4 == 0) goto L30
            boolean r1 = r4.isAttachedTo(r3)
            if (r1 == 0) goto L28
            goto L30
        L28:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Cannot add the same observer with different lifecycles"
            r3.<init>(r4)
            throw r3
        L30:
            if (r4 == 0) goto L33
            return
        L33:
            androidx.lifecycle.Lifecycle r3 = r3.getLifecycle()
            r3.addObserver(r0)
            return
    }

    public void observeForever(androidx.lifecycle.Observer<? super T> r3) {
            r2 = this;
            java.lang.String r0 = "observeForever"
            assertMainThread(r0)
            androidx.lifecycle.LiveData$AlwaysActiveObserver r0 = new androidx.lifecycle.LiveData$AlwaysActiveObserver
            r0.<init>(r2, r3)
            androidx.arch.core.internal.SafeIterableMap<androidx.lifecycle.Observer<? super T>, androidx.lifecycle.LiveData<T>$ObserverWrapper> r1 = r2.mObservers
            java.lang.Object r3 = r1.putIfAbsent(r3, r0)
            androidx.lifecycle.LiveData$ObserverWrapper r3 = (androidx.lifecycle.LiveData.ObserverWrapper) r3
            boolean r1 = r3 instanceof androidx.lifecycle.LiveData.LifecycleBoundObserver
            if (r1 != 0) goto L1e
            if (r3 == 0) goto L19
            return
        L19:
            r3 = 1
            r0.activeStateChanged(r3)
            return
        L1e:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Cannot add the same observer with different lifecycles"
            r3.<init>(r0)
            throw r3
    }

    protected void onActive() {
            r0 = this;
            return
    }

    protected void onInactive() {
            r0 = this;
            return
    }

    protected void postValue(T r4) {
            r3 = this;
            java.lang.Object r0 = r3.mDataLock
            monitor-enter(r0)
            java.lang.Object r1 = r3.mPendingData     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r2 = androidx.lifecycle.LiveData.NOT_SET     // Catch: java.lang.Throwable -> L1c
            if (r1 != r2) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            r3.mPendingData = r4     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L12
            return
        L12:
            androidx.arch.core.executor.ArchTaskExecutor r4 = androidx.arch.core.executor.ArchTaskExecutor.getInstance()
            java.lang.Runnable r0 = r3.mPostValueRunnable
            r4.postToMainThread(r0)
            return
        L1c:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r4
    }

    public void removeObserver(androidx.lifecycle.Observer<? super T> r2) {
            r1 = this;
            java.lang.String r0 = "removeObserver"
            assertMainThread(r0)
            androidx.arch.core.internal.SafeIterableMap<androidx.lifecycle.Observer<? super T>, androidx.lifecycle.LiveData<T>$ObserverWrapper> r0 = r1.mObservers
            java.lang.Object r2 = r0.remove(r2)
            androidx.lifecycle.LiveData$ObserverWrapper r2 = (androidx.lifecycle.LiveData.ObserverWrapper) r2
            if (r2 != 0) goto L10
            return
        L10:
            r2.detachObserver()
            r0 = 0
            r2.activeStateChanged(r0)
            return
    }

    public void removeObservers(androidx.lifecycle.LifecycleOwner r4) {
            r3 = this;
            java.lang.String r0 = "removeObservers"
            assertMainThread(r0)
            androidx.arch.core.internal.SafeIterableMap<androidx.lifecycle.Observer<? super T>, androidx.lifecycle.LiveData<T>$ObserverWrapper> r0 = r3.mObservers
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            androidx.lifecycle.LiveData$ObserverWrapper r2 = (androidx.lifecycle.LiveData.ObserverWrapper) r2
            boolean r2 = r2.isAttachedTo(r4)
            if (r2 == 0) goto Lb
            java.lang.Object r1 = r1.getKey()
            androidx.lifecycle.Observer r1 = (androidx.lifecycle.Observer) r1
            r3.removeObserver(r1)
            goto Lb
        L2d:
            return
    }

    protected void setValue(T r2) {
            r1 = this;
            java.lang.String r0 = "setValue"
            assertMainThread(r0)
            int r0 = r1.mVersion
            int r0 = r0 + 1
            r1.mVersion = r0
            r1.mData = r2
            r2 = 0
            r1.dispatchingValue(r2)
            return
    }
}
