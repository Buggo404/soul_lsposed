package androidx.transition;

/* loaded from: classes.dex */
public class TransitionManager {
    private static final java.lang.String LOG_TAG = "TransitionManager";
    private static androidx.transition.Transition sDefaultTransition;
    static java.util.ArrayList<android.view.ViewGroup> sPendingTransitions;
    private static java.lang.ThreadLocal<java.lang.ref.WeakReference<androidx.collection.ArrayMap<android.view.ViewGroup, java.util.ArrayList<androidx.transition.Transition>>>> sRunningTransitions;
    private androidx.collection.ArrayMap<androidx.transition.Scene, androidx.collection.ArrayMap<androidx.transition.Scene, androidx.transition.Transition>> mScenePairTransitions;
    private androidx.collection.ArrayMap<androidx.transition.Scene, androidx.transition.Transition> mSceneTransitions;

    private static class MultiListener implements android.view.ViewTreeObserver.OnPreDrawListener, android.view.View.OnAttachStateChangeListener {
        android.view.ViewGroup mSceneRoot;
        androidx.transition.Transition mTransition;


        MultiListener(androidx.transition.Transition r1, android.view.ViewGroup r2) {
                r0 = this;
                r0.<init>()
                r0.mTransition = r1
                r0.mSceneRoot = r2
                return
        }

        private void removeListeners() {
                r1 = this;
                android.view.ViewGroup r0 = r1.mSceneRoot
                android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
                r0.removeOnPreDrawListener(r1)
                android.view.ViewGroup r0 = r1.mSceneRoot
                r0.removeOnAttachStateChangeListener(r1)
                return
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
                r5 = this;
                r5.removeListeners()
                java.util.ArrayList<android.view.ViewGroup> r0 = androidx.transition.TransitionManager.sPendingTransitions
                android.view.ViewGroup r1 = r5.mSceneRoot
                boolean r0 = r0.remove(r1)
                r1 = 1
                if (r0 != 0) goto Lf
                return r1
            Lf:
                androidx.collection.ArrayMap r0 = androidx.transition.TransitionManager.getRunningTransitions()
                android.view.ViewGroup r2 = r5.mSceneRoot
                java.lang.Object r2 = r0.get(r2)
                java.util.ArrayList r2 = (java.util.ArrayList) r2
                r3 = 0
                if (r2 != 0) goto L29
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                android.view.ViewGroup r4 = r5.mSceneRoot
                r0.put(r4, r2)
                goto L34
            L29:
                int r4 = r2.size()
                if (r4 <= 0) goto L34
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>(r2)
            L34:
                androidx.transition.Transition r4 = r5.mTransition
                r2.add(r4)
                androidx.transition.Transition r2 = r5.mTransition
                androidx.transition.TransitionManager$MultiListener$1 r4 = new androidx.transition.TransitionManager$MultiListener$1
                r4.<init>(r5, r0)
                r2.addListener(r4)
                androidx.transition.Transition r0 = r5.mTransition
                android.view.ViewGroup r2 = r5.mSceneRoot
                r4 = 0
                r0.captureValues(r2, r4)
                if (r3 == 0) goto L63
                java.util.Iterator r0 = r3.iterator()
            L51:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L63
                java.lang.Object r2 = r0.next()
                androidx.transition.Transition r2 = (androidx.transition.Transition) r2
                android.view.ViewGroup r3 = r5.mSceneRoot
                r2.resume(r3)
                goto L51
            L63:
                androidx.transition.Transition r0 = r5.mTransition
                android.view.ViewGroup r2 = r5.mSceneRoot
                r0.playTransition(r2)
                return r1
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(android.view.View r1) {
                r0 = this;
                return
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(android.view.View r3) {
                r2 = this;
                r2.removeListeners()
                java.util.ArrayList<android.view.ViewGroup> r3 = androidx.transition.TransitionManager.sPendingTransitions
                android.view.ViewGroup r0 = r2.mSceneRoot
                r3.remove(r0)
                androidx.collection.ArrayMap r3 = androidx.transition.TransitionManager.getRunningTransitions()
                android.view.ViewGroup r0 = r2.mSceneRoot
                java.lang.Object r3 = r3.get(r0)
                java.util.ArrayList r3 = (java.util.ArrayList) r3
                if (r3 == 0) goto L34
                int r0 = r3.size()
                if (r0 <= 0) goto L34
                java.util.Iterator r3 = r3.iterator()
            L22:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L34
                java.lang.Object r0 = r3.next()
                androidx.transition.Transition r0 = (androidx.transition.Transition) r0
                android.view.ViewGroup r1 = r2.mSceneRoot
                r0.resume(r1)
                goto L22
            L34:
                androidx.transition.Transition r3 = r2.mTransition
                r0 = 1
                r3.clearValues(r0)
                return
        }
    }

    static {
            androidx.transition.AutoTransition r0 = new androidx.transition.AutoTransition
            r0.<init>()
            androidx.transition.TransitionManager.sDefaultTransition = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            androidx.transition.TransitionManager.sRunningTransitions = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            androidx.transition.TransitionManager.sPendingTransitions = r0
            return
    }

    public TransitionManager() {
            r1 = this;
            r1.<init>()
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            r1.mSceneTransitions = r0
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            r1.mScenePairTransitions = r0
            return
    }

    public static void beginDelayedTransition(android.view.ViewGroup r1) {
            r0 = 0
            beginDelayedTransition(r1, r0)
            return
    }

    public static void beginDelayedTransition(android.view.ViewGroup r1, androidx.transition.Transition r2) {
            java.util.ArrayList<android.view.ViewGroup> r0 = androidx.transition.TransitionManager.sPendingTransitions
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L25
            boolean r0 = androidx.core.view.ViewCompat.isLaidOut(r1)
            if (r0 == 0) goto L25
            java.util.ArrayList<android.view.ViewGroup> r0 = androidx.transition.TransitionManager.sPendingTransitions
            r0.add(r1)
            if (r2 != 0) goto L17
            androidx.transition.Transition r2 = androidx.transition.TransitionManager.sDefaultTransition
        L17:
            androidx.transition.Transition r2 = r2.clone()
            sceneChangeSetup(r1, r2)
            r0 = 0
            androidx.transition.Scene.setCurrentScene(r1, r0)
            sceneChangeRunTransition(r1, r2)
        L25:
            return
    }

    private static void changeScene(androidx.transition.Scene r3, androidx.transition.Transition r4) {
            android.view.ViewGroup r0 = r3.getSceneRoot()
            java.util.ArrayList<android.view.ViewGroup> r1 = androidx.transition.TransitionManager.sPendingTransitions
            boolean r1 = r1.contains(r0)
            if (r1 != 0) goto L3c
            androidx.transition.Scene r1 = androidx.transition.Scene.getCurrentScene(r0)
            if (r4 != 0) goto L1b
            if (r1 == 0) goto L17
            r1.exit()
        L17:
            r3.enter()
            goto L3c
        L1b:
            java.util.ArrayList<android.view.ViewGroup> r2 = androidx.transition.TransitionManager.sPendingTransitions
            r2.add(r0)
            androidx.transition.Transition r4 = r4.clone()
            r4.setSceneRoot(r0)
            if (r1 == 0) goto L33
            boolean r1 = r1.isCreatedFromLayoutResource()
            if (r1 == 0) goto L33
            r1 = 1
            r4.setCanRemoveViews(r1)
        L33:
            sceneChangeSetup(r0, r4)
            r3.enter()
            sceneChangeRunTransition(r0, r4)
        L3c:
            return
    }

    public static void endTransitions(android.view.ViewGroup r3) {
            java.util.ArrayList<android.view.ViewGroup> r0 = androidx.transition.TransitionManager.sPendingTransitions
            r0.remove(r3)
            androidx.collection.ArrayMap r0 = getRunningTransitions()
            java.lang.Object r0 = r0.get(r3)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L30
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L30
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            int r0 = r1.size()
            int r0 = r0 + (-1)
        L22:
            if (r0 < 0) goto L30
            java.lang.Object r2 = r1.get(r0)
            androidx.transition.Transition r2 = (androidx.transition.Transition) r2
            r2.forceToEnd(r3)
            int r0 = r0 + (-1)
            goto L22
        L30:
            return
    }

    static androidx.collection.ArrayMap<android.view.ViewGroup, java.util.ArrayList<androidx.transition.Transition>> getRunningTransitions() {
            java.lang.ThreadLocal<java.lang.ref.WeakReference<androidx.collection.ArrayMap<android.view.ViewGroup, java.util.ArrayList<androidx.transition.Transition>>>> r0 = androidx.transition.TransitionManager.sRunningTransitions
            java.lang.Object r0 = r0.get()
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            if (r0 == 0) goto L13
            java.lang.Object r0 = r0.get()
            androidx.collection.ArrayMap r0 = (androidx.collection.ArrayMap) r0
            if (r0 == 0) goto L13
            return r0
        L13:
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r0)
            java.lang.ThreadLocal<java.lang.ref.WeakReference<androidx.collection.ArrayMap<android.view.ViewGroup, java.util.ArrayList<androidx.transition.Transition>>>> r2 = androidx.transition.TransitionManager.sRunningTransitions
            r2.set(r1)
            return r0
    }

    private androidx.transition.Transition getTransition(androidx.transition.Scene r3) {
            r2 = this;
            android.view.ViewGroup r0 = r3.getSceneRoot()
            if (r0 == 0) goto L1f
            androidx.transition.Scene r0 = androidx.transition.Scene.getCurrentScene(r0)
            if (r0 == 0) goto L1f
            androidx.collection.ArrayMap<androidx.transition.Scene, androidx.collection.ArrayMap<androidx.transition.Scene, androidx.transition.Transition>> r1 = r2.mScenePairTransitions
            java.lang.Object r1 = r1.get(r3)
            androidx.collection.ArrayMap r1 = (androidx.collection.ArrayMap) r1
            if (r1 == 0) goto L1f
            java.lang.Object r0 = r1.get(r0)
            androidx.transition.Transition r0 = (androidx.transition.Transition) r0
            if (r0 == 0) goto L1f
            return r0
        L1f:
            androidx.collection.ArrayMap<androidx.transition.Scene, androidx.transition.Transition> r0 = r2.mSceneTransitions
            java.lang.Object r3 = r0.get(r3)
            androidx.transition.Transition r3 = (androidx.transition.Transition) r3
            if (r3 == 0) goto L2a
            goto L2c
        L2a:
            androidx.transition.Transition r3 = androidx.transition.TransitionManager.sDefaultTransition
        L2c:
            return r3
    }

    /* renamed from: go */
    public static void m13go(androidx.transition.Scene r1) {
            androidx.transition.Transition r0 = androidx.transition.TransitionManager.sDefaultTransition
            changeScene(r1, r0)
            return
    }

    /* renamed from: go */
    public static void m14go(androidx.transition.Scene r0, androidx.transition.Transition r1) {
            changeScene(r0, r1)
            return
    }

    private static void sceneChangeRunTransition(android.view.ViewGroup r1, androidx.transition.Transition r2) {
            if (r2 == 0) goto L13
            if (r1 == 0) goto L13
            androidx.transition.TransitionManager$MultiListener r0 = new androidx.transition.TransitionManager$MultiListener
            r0.<init>(r2, r1)
            r1.addOnAttachStateChangeListener(r0)
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
            r1.addOnPreDrawListener(r0)
        L13:
            return
    }

    private static void sceneChangeSetup(android.view.ViewGroup r2, androidx.transition.Transition r3) {
            androidx.collection.ArrayMap r0 = getRunningTransitions()
            java.lang.Object r0 = r0.get(r2)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L26
            int r1 = r0.size()
            if (r1 <= 0) goto L26
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            androidx.transition.Transition r1 = (androidx.transition.Transition) r1
            r1.pause(r2)
            goto L16
        L26:
            if (r3 == 0) goto L2c
            r0 = 1
            r3.captureValues(r2, r0)
        L2c:
            androidx.transition.Scene r2 = androidx.transition.Scene.getCurrentScene(r2)
            if (r2 == 0) goto L35
            r2.exit()
        L35:
            return
    }

    public void setTransition(androidx.transition.Scene r3, androidx.transition.Scene r4, androidx.transition.Transition r5) {
            r2 = this;
            androidx.collection.ArrayMap<androidx.transition.Scene, androidx.collection.ArrayMap<androidx.transition.Scene, androidx.transition.Transition>> r0 = r2.mScenePairTransitions
            java.lang.Object r0 = r0.get(r4)
            androidx.collection.ArrayMap r0 = (androidx.collection.ArrayMap) r0
            if (r0 != 0) goto L14
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            androidx.collection.ArrayMap<androidx.transition.Scene, androidx.collection.ArrayMap<androidx.transition.Scene, androidx.transition.Transition>> r1 = r2.mScenePairTransitions
            r1.put(r4, r0)
        L14:
            r0.put(r3, r5)
            return
    }

    public void setTransition(androidx.transition.Scene r2, androidx.transition.Transition r3) {
            r1 = this;
            androidx.collection.ArrayMap<androidx.transition.Scene, androidx.transition.Transition> r0 = r1.mSceneTransitions
            r0.put(r2, r3)
            return
    }

    public void transitionTo(androidx.transition.Scene r2) {
            r1 = this;
            androidx.transition.Transition r0 = r1.getTransition(r2)
            changeScene(r2, r0)
            return
    }
}
