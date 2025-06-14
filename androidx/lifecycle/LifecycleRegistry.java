package androidx.lifecycle;

/* loaded from: classes.dex */
public class LifecycleRegistry extends androidx.lifecycle.Lifecycle {
    private int mAddingObserverCounter;
    private final boolean mEnforceMainThread;
    private boolean mHandlingEvent;
    private final java.lang.ref.WeakReference<androidx.lifecycle.LifecycleOwner> mLifecycleOwner;
    private boolean mNewEventOccurred;
    private androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry.ObserverWithState> mObserverMap;
    private java.util.ArrayList<androidx.lifecycle.Lifecycle.State> mParentStates;
    private androidx.lifecycle.Lifecycle.State mState;

    static class ObserverWithState {
        androidx.lifecycle.LifecycleEventObserver mLifecycleObserver;
        androidx.lifecycle.Lifecycle.State mState;

        ObserverWithState(androidx.lifecycle.LifecycleObserver r1, androidx.lifecycle.Lifecycle.State r2) {
                r0 = this;
                r0.<init>()
                androidx.lifecycle.LifecycleEventObserver r1 = androidx.lifecycle.Lifecycling.lifecycleEventObserver(r1)
                r0.mLifecycleObserver = r1
                r0.mState = r2
                return
        }

        void dispatchEvent(androidx.lifecycle.LifecycleOwner r3, androidx.lifecycle.Lifecycle.Event r4) {
                r2 = this;
                androidx.lifecycle.Lifecycle$State r0 = r4.getTargetState()
                androidx.lifecycle.Lifecycle$State r1 = r2.mState
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.LifecycleRegistry.min(r1, r0)
                r2.mState = r1
                androidx.lifecycle.LifecycleEventObserver r1 = r2.mLifecycleObserver
                r1.onStateChanged(r3, r4)
                r2.mState = r0
                return
        }
    }

    public LifecycleRegistry(androidx.lifecycle.LifecycleOwner r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0)
            return
    }

    private LifecycleRegistry(androidx.lifecycle.LifecycleOwner r2, boolean r3) {
            r1 = this;
            r1.<init>()
            androidx.arch.core.internal.FastSafeIterableMap r0 = new androidx.arch.core.internal.FastSafeIterableMap
            r0.<init>()
            r1.mObserverMap = r0
            r0 = 0
            r1.mAddingObserverCounter = r0
            r1.mHandlingEvent = r0
            r1.mNewEventOccurred = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mParentStates = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.mLifecycleOwner = r0
            androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.INITIALIZED
            r1.mState = r2
            r1.mEnforceMainThread = r3
            return
    }

    private void backwardPass(androidx.lifecycle.LifecycleOwner r6) {
            r5 = this;
            androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r0 = r5.mObserverMap
            java.util.Iterator r0 = r0.descendingIterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L63
            boolean r1 = r5.mNewEventOccurred
            if (r1 != 0) goto L63
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            androidx.lifecycle.LifecycleRegistry$ObserverWithState r2 = (androidx.lifecycle.LifecycleRegistry.ObserverWithState) r2
        L1c:
            androidx.lifecycle.Lifecycle$State r3 = r2.mState
            androidx.lifecycle.Lifecycle$State r4 = r5.mState
            int r3 = r3.compareTo(r4)
            if (r3 <= 0) goto L6
            boolean r3 = r5.mNewEventOccurred
            if (r3 != 0) goto L6
            androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r3 = r5.mObserverMap
            java.lang.Object r4 = r1.getKey()
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L6
            androidx.lifecycle.Lifecycle$State r3 = r2.mState
            androidx.lifecycle.Lifecycle$Event r3 = androidx.lifecycle.Lifecycle.Event.downFrom(r3)
            if (r3 == 0) goto L4c
            androidx.lifecycle.Lifecycle$State r4 = r3.getTargetState()
            r5.pushParentState(r4)
            r2.dispatchEvent(r6, r3)
            r5.popParentState()
            goto L1c
        L4c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "no event down from "
            r0.<init>(r1)
            androidx.lifecycle.Lifecycle$State r1 = r2.mState
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L63:
            return
    }

    private androidx.lifecycle.Lifecycle.State calculateTargetState(androidx.lifecycle.LifecycleObserver r3) {
            r2 = this;
            androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r0 = r2.mObserverMap
            java.util.Map$Entry r3 = r0.ceil(r3)
            r0 = 0
            if (r3 == 0) goto L12
            java.lang.Object r3 = r3.getValue()
            androidx.lifecycle.LifecycleRegistry$ObserverWithState r3 = (androidx.lifecycle.LifecycleRegistry.ObserverWithState) r3
            androidx.lifecycle.Lifecycle$State r3 = r3.mState
            goto L13
        L12:
            r3 = r0
        L13:
            java.util.ArrayList<androidx.lifecycle.Lifecycle$State> r1 = r2.mParentStates
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L29
            java.util.ArrayList<androidx.lifecycle.Lifecycle$State> r0 = r2.mParentStates
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            androidx.lifecycle.Lifecycle$State r0 = (androidx.lifecycle.Lifecycle.State) r0
        L29:
            androidx.lifecycle.Lifecycle$State r1 = r2.mState
            androidx.lifecycle.Lifecycle$State r3 = min(r1, r3)
            androidx.lifecycle.Lifecycle$State r3 = min(r3, r0)
            return r3
    }

    public static androidx.lifecycle.LifecycleRegistry createUnsafe(androidx.lifecycle.LifecycleOwner r2) {
            androidx.lifecycle.LifecycleRegistry r0 = new androidx.lifecycle.LifecycleRegistry
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    private void enforceMainThreadIfNeeded(java.lang.String r4) {
            r3 = this;
            boolean r0 = r3.mEnforceMainThread
            if (r0 == 0) goto L2a
            androidx.arch.core.executor.ArchTaskExecutor r0 = androidx.arch.core.executor.ArchTaskExecutor.getInstance()
            boolean r0 = r0.isMainThread()
            if (r0 == 0) goto Lf
            goto L2a
        Lf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Method "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = " must be called on the main thread"
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L2a:
            return
    }

    private void forwardPass(androidx.lifecycle.LifecycleOwner r6) {
            r5 = this;
            androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r0 = r5.mObserverMap
            androidx.arch.core.internal.SafeIterableMap$IteratorWithAdditions r0 = r0.iteratorWithAdditions()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L61
            boolean r1 = r5.mNewEventOccurred
            if (r1 != 0) goto L61
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            androidx.lifecycle.LifecycleRegistry$ObserverWithState r2 = (androidx.lifecycle.LifecycleRegistry.ObserverWithState) r2
        L1c:
            androidx.lifecycle.Lifecycle$State r3 = r2.mState
            androidx.lifecycle.Lifecycle$State r4 = r5.mState
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L6
            boolean r3 = r5.mNewEventOccurred
            if (r3 != 0) goto L6
            androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r3 = r5.mObserverMap
            java.lang.Object r4 = r1.getKey()
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L6
            androidx.lifecycle.Lifecycle$State r3 = r2.mState
            r5.pushParentState(r3)
            androidx.lifecycle.Lifecycle$State r3 = r2.mState
            androidx.lifecycle.Lifecycle$Event r3 = androidx.lifecycle.Lifecycle.Event.upFrom(r3)
            if (r3 == 0) goto L4a
            r2.dispatchEvent(r6, r3)
            r5.popParentState()
            goto L1c
        L4a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "no event up from "
            r0.<init>(r1)
            androidx.lifecycle.Lifecycle$State r1 = r2.mState
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L61:
            return
    }

    private boolean isSynced() {
            r3 = this;
            androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r0 = r3.mObserverMap
            int r0 = r0.size()
            r1 = 1
            if (r0 != 0) goto La
            return r1
        La:
            androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r0 = r3.mObserverMap
            java.util.Map$Entry r0 = r0.eldest()
            java.lang.Object r0 = r0.getValue()
            androidx.lifecycle.LifecycleRegistry$ObserverWithState r0 = (androidx.lifecycle.LifecycleRegistry.ObserverWithState) r0
            androidx.lifecycle.Lifecycle$State r0 = r0.mState
            androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r2 = r3.mObserverMap
            java.util.Map$Entry r2 = r2.newest()
            java.lang.Object r2 = r2.getValue()
            androidx.lifecycle.LifecycleRegistry$ObserverWithState r2 = (androidx.lifecycle.LifecycleRegistry.ObserverWithState) r2
            androidx.lifecycle.Lifecycle$State r2 = r2.mState
            if (r0 != r2) goto L2d
            androidx.lifecycle.Lifecycle$State r0 = r3.mState
            if (r0 != r2) goto L2d
            goto L2e
        L2d:
            r1 = 0
        L2e:
            return r1
    }

    static androidx.lifecycle.Lifecycle.State min(androidx.lifecycle.Lifecycle.State r1, androidx.lifecycle.Lifecycle.State r2) {
            if (r2 == 0) goto L9
            int r0 = r2.compareTo(r1)
            if (r0 >= 0) goto L9
            r1 = r2
        L9:
            return r1
    }

    private void moveToState(androidx.lifecycle.Lifecycle.State r2) {
            r1 = this;
            androidx.lifecycle.Lifecycle$State r0 = r1.mState
            if (r0 != r2) goto L5
            return
        L5:
            r1.mState = r2
            boolean r2 = r1.mHandlingEvent
            r0 = 1
            if (r2 != 0) goto L1a
            int r2 = r1.mAddingObserverCounter
            if (r2 == 0) goto L11
            goto L1a
        L11:
            r1.mHandlingEvent = r0
            r1.sync()
            r2 = 0
            r1.mHandlingEvent = r2
            return
        L1a:
            r1.mNewEventOccurred = r0
            return
    }

    private void popParentState() {
            r2 = this;
            java.util.ArrayList<androidx.lifecycle.Lifecycle$State> r0 = r2.mParentStates
            int r1 = r0.size()
            int r1 = r1 + (-1)
            r0.remove(r1)
            return
    }

    private void pushParentState(androidx.lifecycle.Lifecycle.State r2) {
            r1 = this;
            java.util.ArrayList<androidx.lifecycle.Lifecycle$State> r0 = r1.mParentStates
            r0.add(r2)
            return
    }

    private void sync() {
            r3 = this;
            java.lang.ref.WeakReference<androidx.lifecycle.LifecycleOwner> r0 = r3.mLifecycleOwner
            java.lang.Object r0 = r0.get()
            androidx.lifecycle.LifecycleOwner r0 = (androidx.lifecycle.LifecycleOwner) r0
            if (r0 == 0) goto L4f
        La:
            boolean r1 = r3.isSynced()
            r2 = 0
            if (r1 != 0) goto L4c
            r3.mNewEventOccurred = r2
            androidx.lifecycle.Lifecycle$State r1 = r3.mState
            androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r2 = r3.mObserverMap
            java.util.Map$Entry r2 = r2.eldest()
            java.lang.Object r2 = r2.getValue()
            androidx.lifecycle.LifecycleRegistry$ObserverWithState r2 = (androidx.lifecycle.LifecycleRegistry.ObserverWithState) r2
            androidx.lifecycle.Lifecycle$State r2 = r2.mState
            int r1 = r1.compareTo(r2)
            if (r1 >= 0) goto L2c
            r3.backwardPass(r0)
        L2c:
            androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r1 = r3.mObserverMap
            java.util.Map$Entry r1 = r1.newest()
            boolean r2 = r3.mNewEventOccurred
            if (r2 != 0) goto La
            if (r1 == 0) goto La
            androidx.lifecycle.Lifecycle$State r2 = r3.mState
            java.lang.Object r1 = r1.getValue()
            androidx.lifecycle.LifecycleRegistry$ObserverWithState r1 = (androidx.lifecycle.LifecycleRegistry.ObserverWithState) r1
            androidx.lifecycle.Lifecycle$State r1 = r1.mState
            int r1 = r2.compareTo(r1)
            if (r1 <= 0) goto La
            r3.forwardPass(r0)
            goto La
        L4c:
            r3.mNewEventOccurred = r2
            return
        L4f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state."
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.lifecycle.Lifecycle
    public void addObserver(androidx.lifecycle.LifecycleObserver r7) {
            r6 = this;
            java.lang.String r0 = "addObserver"
            r6.enforceMainThreadIfNeeded(r0)
            androidx.lifecycle.Lifecycle$State r0 = r6.mState
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r0 != r1) goto Le
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.DESTROYED
            goto L10
        Le:
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.INITIALIZED
        L10:
            androidx.lifecycle.LifecycleRegistry$ObserverWithState r1 = new androidx.lifecycle.LifecycleRegistry$ObserverWithState
            r1.<init>(r7, r0)
            androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r0 = r6.mObserverMap
            java.lang.Object r0 = r0.putIfAbsent(r7, r1)
            androidx.lifecycle.LifecycleRegistry$ObserverWithState r0 = (androidx.lifecycle.LifecycleRegistry.ObserverWithState) r0
            if (r0 == 0) goto L20
            return
        L20:
            java.lang.ref.WeakReference<androidx.lifecycle.LifecycleOwner> r0 = r6.mLifecycleOwner
            java.lang.Object r0 = r0.get()
            androidx.lifecycle.LifecycleOwner r0 = (androidx.lifecycle.LifecycleOwner) r0
            if (r0 != 0) goto L2b
            return
        L2b:
            int r2 = r6.mAddingObserverCounter
            r3 = 1
            if (r2 != 0) goto L37
            boolean r2 = r6.mHandlingEvent
            if (r2 == 0) goto L35
            goto L37
        L35:
            r2 = 0
            goto L38
        L37:
            r2 = r3
        L38:
            androidx.lifecycle.Lifecycle$State r4 = r6.calculateTargetState(r7)
            int r5 = r6.mAddingObserverCounter
            int r5 = r5 + r3
            r6.mAddingObserverCounter = r5
        L41:
            androidx.lifecycle.Lifecycle$State r5 = r1.mState
            int r4 = r5.compareTo(r4)
            if (r4 >= 0) goto L80
            androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r4 = r6.mObserverMap
            boolean r4 = r4.contains(r7)
            if (r4 == 0) goto L80
            androidx.lifecycle.Lifecycle$State r4 = r1.mState
            r6.pushParentState(r4)
            androidx.lifecycle.Lifecycle$State r4 = r1.mState
            androidx.lifecycle.Lifecycle$Event r4 = androidx.lifecycle.Lifecycle.Event.upFrom(r4)
            if (r4 == 0) goto L69
            r1.dispatchEvent(r0, r4)
            r6.popParentState()
            androidx.lifecycle.Lifecycle$State r4 = r6.calculateTargetState(r7)
            goto L41
        L69:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "no event up from "
            r0.<init>(r2)
            androidx.lifecycle.Lifecycle$State r1 = r1.mState
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L80:
            if (r2 != 0) goto L85
            r6.sync()
        L85:
            int r7 = r6.mAddingObserverCounter
            int r7 = r7 - r3
            r6.mAddingObserverCounter = r7
            return
    }

    @Override // androidx.lifecycle.Lifecycle
    public androidx.lifecycle.Lifecycle.State getCurrentState() {
            r1 = this;
            androidx.lifecycle.Lifecycle$State r0 = r1.mState
            return r0
    }

    public int getObserverCount() {
            r1 = this;
            java.lang.String r0 = "getObserverCount"
            r1.enforceMainThreadIfNeeded(r0)
            androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r0 = r1.mObserverMap
            int r0 = r0.size()
            return r0
    }

    public void handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event r2) {
            r1 = this;
            java.lang.String r0 = "handleLifecycleEvent"
            r1.enforceMainThreadIfNeeded(r0)
            androidx.lifecycle.Lifecycle$State r2 = r2.getTargetState()
            r1.moveToState(r2)
            return
    }

    @java.lang.Deprecated
    public void markState(androidx.lifecycle.Lifecycle.State r2) {
            r1 = this;
            java.lang.String r0 = "markState"
            r1.enforceMainThreadIfNeeded(r0)
            r1.setCurrentState(r2)
            return
    }

    @Override // androidx.lifecycle.Lifecycle
    public void removeObserver(androidx.lifecycle.LifecycleObserver r2) {
            r1 = this;
            java.lang.String r0 = "removeObserver"
            r1.enforceMainThreadIfNeeded(r0)
            androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r0 = r1.mObserverMap
            r0.remove(r2)
            return
    }

    public void setCurrentState(androidx.lifecycle.Lifecycle.State r2) {
            r1 = this;
            java.lang.String r0 = "setCurrentState"
            r1.enforceMainThreadIfNeeded(r0)
            r1.moveToState(r2)
            return
    }
}
