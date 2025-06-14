package androidx.activity;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {
    private final java.lang.Runnable mFallbackOnBackPressed;
    final java.util.ArrayDeque<androidx.activity.OnBackPressedCallback> mOnBackPressedCallbacks;

    private class LifecycleOnBackPressedCancellable implements androidx.lifecycle.LifecycleEventObserver, androidx.activity.Cancellable {
        private androidx.activity.Cancellable mCurrentCancellable;
        private final androidx.lifecycle.Lifecycle mLifecycle;
        private final androidx.activity.OnBackPressedCallback mOnBackPressedCallback;
        final /* synthetic */ androidx.activity.OnBackPressedDispatcher this$0;

        LifecycleOnBackPressedCancellable(androidx.activity.OnBackPressedDispatcher r1, androidx.lifecycle.Lifecycle r2, androidx.activity.OnBackPressedCallback r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.mLifecycle = r2
                r0.mOnBackPressedCallback = r3
                r2.addObserver(r0)
                return
        }

        @Override // androidx.activity.Cancellable
        public void cancel() {
                r1 = this;
                androidx.lifecycle.Lifecycle r0 = r1.mLifecycle
                r0.removeObserver(r1)
                androidx.activity.OnBackPressedCallback r0 = r1.mOnBackPressedCallback
                r0.removeCancellable(r1)
                androidx.activity.Cancellable r0 = r1.mCurrentCancellable
                if (r0 == 0) goto L14
                r0.cancel()
                r0 = 0
                r1.mCurrentCancellable = r0
            L14:
                return
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(androidx.lifecycle.LifecycleOwner r1, androidx.lifecycle.Lifecycle.Event r2) {
                r0 = this;
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_START
                if (r2 != r1) goto Lf
                androidx.activity.OnBackPressedDispatcher r1 = r0.this$0
                androidx.activity.OnBackPressedCallback r2 = r0.mOnBackPressedCallback
                androidx.activity.Cancellable r1 = r1.addCancellableCallback(r2)
                r0.mCurrentCancellable = r1
                goto L22
            Lf:
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_STOP
                if (r2 != r1) goto L1b
                androidx.activity.Cancellable r1 = r0.mCurrentCancellable
                if (r1 == 0) goto L22
                r1.cancel()
                goto L22
            L1b:
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
                if (r2 != r1) goto L22
                r0.cancel()
            L22:
                return
        }
    }

    private class OnBackPressedCancellable implements androidx.activity.Cancellable {
        private final androidx.activity.OnBackPressedCallback mOnBackPressedCallback;
        final /* synthetic */ androidx.activity.OnBackPressedDispatcher this$0;

        OnBackPressedCancellable(androidx.activity.OnBackPressedDispatcher r1, androidx.activity.OnBackPressedCallback r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.mOnBackPressedCallback = r2
                return
        }

        @Override // androidx.activity.Cancellable
        public void cancel() {
                r2 = this;
                androidx.activity.OnBackPressedDispatcher r0 = r2.this$0
                java.util.ArrayDeque<androidx.activity.OnBackPressedCallback> r0 = r0.mOnBackPressedCallbacks
                androidx.activity.OnBackPressedCallback r1 = r2.mOnBackPressedCallback
                r0.remove(r1)
                androidx.activity.OnBackPressedCallback r0 = r2.mOnBackPressedCallback
                r0.removeCancellable(r2)
                return
        }
    }

    public OnBackPressedDispatcher() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public OnBackPressedDispatcher(java.lang.Runnable r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r1.mOnBackPressedCallbacks = r0
            r1.mFallbackOnBackPressed = r2
            return
    }

    public void addCallback(androidx.activity.OnBackPressedCallback r1) {
            r0 = this;
            r0.addCancellableCallback(r1)
            return
    }

    public void addCallback(androidx.lifecycle.LifecycleOwner r3, androidx.activity.OnBackPressedCallback r4) {
            r2 = this;
            androidx.lifecycle.Lifecycle r3 = r3.getLifecycle()
            androidx.lifecycle.Lifecycle$State r0 = r3.getCurrentState()
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r0 != r1) goto Ld
            return
        Ld:
            androidx.activity.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable r0 = new androidx.activity.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable
            r0.<init>(r2, r3, r4)
            r4.addCancellable(r0)
            return
    }

    androidx.activity.Cancellable addCancellableCallback(androidx.activity.OnBackPressedCallback r2) {
            r1 = this;
            java.util.ArrayDeque<androidx.activity.OnBackPressedCallback> r0 = r1.mOnBackPressedCallbacks
            r0.add(r2)
            androidx.activity.OnBackPressedDispatcher$OnBackPressedCancellable r0 = new androidx.activity.OnBackPressedDispatcher$OnBackPressedCancellable
            r0.<init>(r1, r2)
            r2.addCancellable(r0)
            return r0
    }

    public boolean hasEnabledCallbacks() {
            r2 = this;
            java.util.ArrayDeque<androidx.activity.OnBackPressedCallback> r0 = r2.mOnBackPressedCallbacks
            java.util.Iterator r0 = r0.descendingIterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            androidx.activity.OnBackPressedCallback r1 = (androidx.activity.OnBackPressedCallback) r1
            boolean r1 = r1.isEnabled()
            if (r1 == 0) goto L6
            r0 = 1
            return r0
        L1a:
            r0 = 0
            return r0
    }

    public void onBackPressed() {
            r3 = this;
            java.util.ArrayDeque<androidx.activity.OnBackPressedCallback> r0 = r3.mOnBackPressedCallbacks
            java.util.Iterator r0 = r0.descendingIterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            androidx.activity.OnBackPressedCallback r1 = (androidx.activity.OnBackPressedCallback) r1
            boolean r2 = r1.isEnabled()
            if (r2 == 0) goto L6
            r1.handleOnBackPressed()
            return
        L1c:
            java.lang.Runnable r0 = r3.mFallbackOnBackPressed
            if (r0 == 0) goto L23
            r0.run()
        L23:
            return
    }
}
