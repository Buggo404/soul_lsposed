package androidx.dynamicanimation.animation;

/* loaded from: classes.dex */
class AnimationHandler {
    private static final long FRAME_DELAY_MS = 10;
    public static final java.lang.ThreadLocal<androidx.dynamicanimation.animation.AnimationHandler> sAnimatorHandler = null;
    final java.util.ArrayList<androidx.dynamicanimation.animation.AnimationHandler.AnimationFrameCallback> mAnimationCallbacks;
    private final androidx.dynamicanimation.animation.AnimationHandler.AnimationCallbackDispatcher mCallbackDispatcher;
    long mCurrentFrameTime;
    private final androidx.collection.SimpleArrayMap<androidx.dynamicanimation.animation.AnimationHandler.AnimationFrameCallback, java.lang.Long> mDelayedCallbackStartTime;
    private boolean mListDirty;
    private androidx.dynamicanimation.animation.AnimationHandler.AnimationFrameCallbackProvider mProvider;

    class AnimationCallbackDispatcher {
        final /* synthetic */ androidx.dynamicanimation.animation.AnimationHandler this$0;

        AnimationCallbackDispatcher(androidx.dynamicanimation.animation.AnimationHandler r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        void dispatchAnimationFrame() {
                r3 = this;
                androidx.dynamicanimation.animation.AnimationHandler r0 = r3.this$0
                long r1 = android.os.SystemClock.uptimeMillis()
                r0.mCurrentFrameTime = r1
                androidx.dynamicanimation.animation.AnimationHandler r0 = r3.this$0
                long r1 = r0.mCurrentFrameTime
                r0.doAnimationFrame(r1)
                androidx.dynamicanimation.animation.AnimationHandler r0 = r3.this$0
                java.util.ArrayList<androidx.dynamicanimation.animation.AnimationHandler$AnimationFrameCallback> r0 = r0.mAnimationCallbacks
                int r0 = r0.size()
                if (r0 <= 0) goto L22
                androidx.dynamicanimation.animation.AnimationHandler r0 = r3.this$0
                androidx.dynamicanimation.animation.AnimationHandler$AnimationFrameCallbackProvider r0 = r0.getProvider()
                r0.postFrameCallback()
            L22:
                return
        }
    }

    interface AnimationFrameCallback {
        boolean doAnimationFrame(long r1);
    }

    static abstract class AnimationFrameCallbackProvider {
        final androidx.dynamicanimation.animation.AnimationHandler.AnimationCallbackDispatcher mDispatcher;

        AnimationFrameCallbackProvider(androidx.dynamicanimation.animation.AnimationHandler.AnimationCallbackDispatcher r1) {
                r0 = this;
                r0.<init>()
                r0.mDispatcher = r1
                return
        }

        abstract void postFrameCallback();
    }

    private static class FrameCallbackProvider14 extends androidx.dynamicanimation.animation.AnimationHandler.AnimationFrameCallbackProvider {
        private final android.os.Handler mHandler;
        long mLastFrameTime;
        private final java.lang.Runnable mRunnable;


        FrameCallbackProvider14(androidx.dynamicanimation.animation.AnimationHandler.AnimationCallbackDispatcher r3) {
                r2 = this;
                r2.<init>(r3)
                r0 = -1
                r2.mLastFrameTime = r0
                androidx.dynamicanimation.animation.AnimationHandler$FrameCallbackProvider14$1 r3 = new androidx.dynamicanimation.animation.AnimationHandler$FrameCallbackProvider14$1
                r3.<init>(r2)
                r2.mRunnable = r3
                android.os.Handler r3 = new android.os.Handler
                android.os.Looper r0 = android.os.Looper.myLooper()
                r3.<init>(r0)
                r2.mHandler = r3
                return
        }

        @Override // androidx.dynamicanimation.animation.AnimationHandler.AnimationFrameCallbackProvider
        void postFrameCallback() {
                r4 = this;
                long r0 = android.os.SystemClock.uptimeMillis()
                long r2 = r4.mLastFrameTime
                long r0 = r0 - r2
                r2 = 10
                long r2 = r2 - r0
                r0 = 0
                long r0 = java.lang.Math.max(r2, r0)
                android.os.Handler r2 = r4.mHandler
                java.lang.Runnable r3 = r4.mRunnable
                r2.postDelayed(r3, r0)
                return
        }
    }

    private static class FrameCallbackProvider16 extends androidx.dynamicanimation.animation.AnimationHandler.AnimationFrameCallbackProvider {
        private final android.view.Choreographer mChoreographer;
        private final android.view.Choreographer.FrameCallback mChoreographerCallback;


        FrameCallbackProvider16(androidx.dynamicanimation.animation.AnimationHandler.AnimationCallbackDispatcher r1) {
                r0 = this;
                r0.<init>(r1)
                android.view.Choreographer r1 = android.view.Choreographer.getInstance()
                r0.mChoreographer = r1
                androidx.dynamicanimation.animation.AnimationHandler$FrameCallbackProvider16$1 r1 = new androidx.dynamicanimation.animation.AnimationHandler$FrameCallbackProvider16$1
                r1.<init>(r0)
                r0.mChoreographerCallback = r1
                return
        }

        @Override // androidx.dynamicanimation.animation.AnimationHandler.AnimationFrameCallbackProvider
        void postFrameCallback() {
                r2 = this;
                android.view.Choreographer r0 = r2.mChoreographer
                android.view.Choreographer$FrameCallback r1 = r2.mChoreographerCallback
                r0.postFrameCallback(r1)
                return
        }
    }

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            androidx.dynamicanimation.animation.AnimationHandler.sAnimatorHandler = r0
            return
    }

    AnimationHandler() {
            r2 = this;
            r2.<init>()
            androidx.collection.SimpleArrayMap r0 = new androidx.collection.SimpleArrayMap
            r0.<init>()
            r2.mDelayedCallbackStartTime = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.mAnimationCallbacks = r0
            androidx.dynamicanimation.animation.AnimationHandler$AnimationCallbackDispatcher r0 = new androidx.dynamicanimation.animation.AnimationHandler$AnimationCallbackDispatcher
            r0.<init>(r2)
            r2.mCallbackDispatcher = r0
            r0 = 0
            r2.mCurrentFrameTime = r0
            r0 = 0
            r2.mListDirty = r0
            return
    }

    private void cleanUpList() {
            r2 = this;
            boolean r0 = r2.mListDirty
            if (r0 == 0) goto L21
            java.util.ArrayList<androidx.dynamicanimation.animation.AnimationHandler$AnimationFrameCallback> r0 = r2.mAnimationCallbacks
            int r0 = r0.size()
            int r0 = r0 + (-1)
        Lc:
            if (r0 < 0) goto L1e
            java.util.ArrayList<androidx.dynamicanimation.animation.AnimationHandler$AnimationFrameCallback> r1 = r2.mAnimationCallbacks
            java.lang.Object r1 = r1.get(r0)
            if (r1 != 0) goto L1b
            java.util.ArrayList<androidx.dynamicanimation.animation.AnimationHandler$AnimationFrameCallback> r1 = r2.mAnimationCallbacks
            r1.remove(r0)
        L1b:
            int r0 = r0 + (-1)
            goto Lc
        L1e:
            r0 = 0
            r2.mListDirty = r0
        L21:
            return
    }

    public static long getFrameTime() {
            java.lang.ThreadLocal<androidx.dynamicanimation.animation.AnimationHandler> r0 = androidx.dynamicanimation.animation.AnimationHandler.sAnimatorHandler
            java.lang.Object r1 = r0.get()
            if (r1 != 0) goto Lb
            r0 = 0
            return r0
        Lb:
            java.lang.Object r0 = r0.get()
            androidx.dynamicanimation.animation.AnimationHandler r0 = (androidx.dynamicanimation.animation.AnimationHandler) r0
            long r0 = r0.mCurrentFrameTime
            return r0
    }

    public static androidx.dynamicanimation.animation.AnimationHandler getInstance() {
            java.lang.ThreadLocal<androidx.dynamicanimation.animation.AnimationHandler> r0 = androidx.dynamicanimation.animation.AnimationHandler.sAnimatorHandler
            java.lang.Object r1 = r0.get()
            if (r1 != 0) goto L10
            androidx.dynamicanimation.animation.AnimationHandler r1 = new androidx.dynamicanimation.animation.AnimationHandler
            r1.<init>()
            r0.set(r1)
        L10:
            java.lang.Object r0 = r0.get()
            androidx.dynamicanimation.animation.AnimationHandler r0 = (androidx.dynamicanimation.animation.AnimationHandler) r0
            return r0
    }

    private boolean isCallbackDue(androidx.dynamicanimation.animation.AnimationHandler.AnimationFrameCallback r5, long r6) {
            r4 = this;
            androidx.collection.SimpleArrayMap<androidx.dynamicanimation.animation.AnimationHandler$AnimationFrameCallback, java.lang.Long> r0 = r4.mDelayedCallbackStartTime
            java.lang.Object r0 = r0.get(r5)
            java.lang.Long r0 = (java.lang.Long) r0
            r1 = 1
            if (r0 != 0) goto Lc
            return r1
        Lc:
            long r2 = r0.longValue()
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 >= 0) goto L1a
            androidx.collection.SimpleArrayMap<androidx.dynamicanimation.animation.AnimationHandler$AnimationFrameCallback, java.lang.Long> r6 = r4.mDelayedCallbackStartTime
            r6.remove(r5)
            return r1
        L1a:
            r5 = 0
            return r5
    }

    public void addAnimationFrameCallback(androidx.dynamicanimation.animation.AnimationHandler.AnimationFrameCallback r4, long r5) {
            r3 = this;
            java.util.ArrayList<androidx.dynamicanimation.animation.AnimationHandler$AnimationFrameCallback> r0 = r3.mAnimationCallbacks
            int r0 = r0.size()
            if (r0 != 0) goto Lf
            androidx.dynamicanimation.animation.AnimationHandler$AnimationFrameCallbackProvider r0 = r3.getProvider()
            r0.postFrameCallback()
        Lf:
            java.util.ArrayList<androidx.dynamicanimation.animation.AnimationHandler$AnimationFrameCallback> r0 = r3.mAnimationCallbacks
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto L1c
            java.util.ArrayList<androidx.dynamicanimation.animation.AnimationHandler$AnimationFrameCallback> r0 = r3.mAnimationCallbacks
            r0.add(r4)
        L1c:
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L30
            androidx.collection.SimpleArrayMap<androidx.dynamicanimation.animation.AnimationHandler$AnimationFrameCallback, java.lang.Long> r0 = r3.mDelayedCallbackStartTime
            long r1 = android.os.SystemClock.uptimeMillis()
            long r1 = r1 + r5
            java.lang.Long r5 = java.lang.Long.valueOf(r1)
            r0.put(r4, r5)
        L30:
            return
    }

    void doAnimationFrame(long r6) {
            r5 = this;
            long r0 = android.os.SystemClock.uptimeMillis()
            r2 = 0
        L5:
            java.util.ArrayList<androidx.dynamicanimation.animation.AnimationHandler$AnimationFrameCallback> r3 = r5.mAnimationCallbacks
            int r3 = r3.size()
            if (r2 >= r3) goto L24
            java.util.ArrayList<androidx.dynamicanimation.animation.AnimationHandler$AnimationFrameCallback> r3 = r5.mAnimationCallbacks
            java.lang.Object r3 = r3.get(r2)
            androidx.dynamicanimation.animation.AnimationHandler$AnimationFrameCallback r3 = (androidx.dynamicanimation.animation.AnimationHandler.AnimationFrameCallback) r3
            if (r3 != 0) goto L18
            goto L21
        L18:
            boolean r4 = r5.isCallbackDue(r3, r0)
            if (r4 == 0) goto L21
            r3.doAnimationFrame(r6)
        L21:
            int r2 = r2 + 1
            goto L5
        L24:
            r5.cleanUpList()
            return
    }

    androidx.dynamicanimation.animation.AnimationHandler.AnimationFrameCallbackProvider getProvider() {
            r2 = this;
            androidx.dynamicanimation.animation.AnimationHandler$AnimationFrameCallbackProvider r0 = r2.mProvider
            if (r0 != 0) goto Ld
            androidx.dynamicanimation.animation.AnimationHandler$FrameCallbackProvider16 r0 = new androidx.dynamicanimation.animation.AnimationHandler$FrameCallbackProvider16
            androidx.dynamicanimation.animation.AnimationHandler$AnimationCallbackDispatcher r1 = r2.mCallbackDispatcher
            r0.<init>(r1)
            r2.mProvider = r0
        Ld:
            androidx.dynamicanimation.animation.AnimationHandler$AnimationFrameCallbackProvider r0 = r2.mProvider
            return r0
    }

    public void removeCallback(androidx.dynamicanimation.animation.AnimationHandler.AnimationFrameCallback r3) {
            r2 = this;
            androidx.collection.SimpleArrayMap<androidx.dynamicanimation.animation.AnimationHandler$AnimationFrameCallback, java.lang.Long> r0 = r2.mDelayedCallbackStartTime
            r0.remove(r3)
            java.util.ArrayList<androidx.dynamicanimation.animation.AnimationHandler$AnimationFrameCallback> r0 = r2.mAnimationCallbacks
            int r3 = r0.indexOf(r3)
            if (r3 < 0) goto L16
            java.util.ArrayList<androidx.dynamicanimation.animation.AnimationHandler$AnimationFrameCallback> r0 = r2.mAnimationCallbacks
            r1 = 0
            r0.set(r3, r1)
            r3 = 1
            r2.mListDirty = r3
        L16:
            return
    }

    public void setProvider(androidx.dynamicanimation.animation.AnimationHandler.AnimationFrameCallbackProvider r1) {
            r0 = this;
            r0.mProvider = r1
            return
    }
}
