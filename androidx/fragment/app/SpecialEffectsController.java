package androidx.fragment.app;

/* loaded from: classes.dex */
abstract class SpecialEffectsController {
    private final android.view.ViewGroup mContainer;
    boolean mIsContainerPostponed;
    boolean mOperationDirectionIsPop;
    final java.util.ArrayList<androidx.fragment.app.SpecialEffectsController.Operation> mPendingOperations;
    final java.util.ArrayList<androidx.fragment.app.SpecialEffectsController.Operation> mRunningOperations;



    /* renamed from: androidx.fragment.app.SpecialEffectsController$3 */
    static /* synthetic */ class C03223 {

        /* renamed from: $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$LifecycleImpact */
        static final /* synthetic */ int[] f76xb9e640f0 = null;

        /* renamed from: $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State */
        static final /* synthetic */ int[] f77xe493b431 = null;

        static {
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact[] r0 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.fragment.app.SpecialEffectsController.C03223.f76xb9e640f0 = r0
                r1 = 1
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r2 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = androidx.fragment.app.SpecialEffectsController.C03223.f76xb9e640f0     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r3 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.REMOVING     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                r2 = 3
                int[] r3 = androidx.fragment.app.SpecialEffectsController.C03223.f76xb9e640f0     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r4 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.NONE     // Catch: java.lang.NoSuchFieldError -> L28
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                androidx.fragment.app.SpecialEffectsController$Operation$State[] r3 = androidx.fragment.app.SpecialEffectsController.Operation.State.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                androidx.fragment.app.SpecialEffectsController.C03223.f77xe493b431 = r3
                androidx.fragment.app.SpecialEffectsController$Operation$State r4 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED     // Catch: java.lang.NoSuchFieldError -> L39
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L39
                r3[r4] = r1     // Catch: java.lang.NoSuchFieldError -> L39
            L39:
                int[] r1 = androidx.fragment.app.SpecialEffectsController.C03223.f77xe493b431     // Catch: java.lang.NoSuchFieldError -> L43
                androidx.fragment.app.SpecialEffectsController$Operation$State r3 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE     // Catch: java.lang.NoSuchFieldError -> L43
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L43
                r1[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L43
            L43:
                int[] r0 = androidx.fragment.app.SpecialEffectsController.C03223.f77xe493b431     // Catch: java.lang.NoSuchFieldError -> L4d
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE     // Catch: java.lang.NoSuchFieldError -> L4d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4d
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L4d
            L4d:
                int[] r0 = androidx.fragment.app.SpecialEffectsController.C03223.f77xe493b431     // Catch: java.lang.NoSuchFieldError -> L58
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.INVISIBLE     // Catch: java.lang.NoSuchFieldError -> L58
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L58
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L58
            L58:
                return
        }
    }

    private static class FragmentStateManagerOperation extends androidx.fragment.app.SpecialEffectsController.Operation {
        private final androidx.fragment.app.FragmentStateManager mFragmentStateManager;

        FragmentStateManagerOperation(androidx.fragment.app.SpecialEffectsController.Operation.State r2, androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact r3, androidx.fragment.app.FragmentStateManager r4, androidx.core.os.CancellationSignal r5) {
                r1 = this;
                androidx.fragment.app.Fragment r0 = r4.getFragment()
                r1.<init>(r2, r3, r0, r5)
                r1.mFragmentStateManager = r4
                return
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public void complete() {
                r1 = this;
                super.complete()
                androidx.fragment.app.FragmentStateManager r0 = r1.mFragmentStateManager
                r0.moveToExpectedState()
                return
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        void onStart() {
                r4 = this;
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r0 = r4.getLifecycleImpact()
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r1 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING
                if (r0 != r1) goto L6e
                androidx.fragment.app.FragmentStateManager r0 = r4.mFragmentStateManager
                androidx.fragment.app.Fragment r0 = r0.getFragment()
                android.view.View r1 = r0.mView
                android.view.View r1 = r1.findFocus()
                if (r1 == 0) goto L3e
                r0.setFocusedView(r1)
                r2 = 2
                boolean r2 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r2)
                if (r2 == 0) goto L3e
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "requestFocus: Saved focused view "
                r2.<init>(r3)
                java.lang.StringBuilder r1 = r2.append(r1)
                java.lang.String r2 = " for Fragment "
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.StringBuilder r1 = r1.append(r0)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "FragmentManager"
                android.util.Log.v(r2, r1)
            L3e:
                androidx.fragment.app.Fragment r1 = r4.getFragment()
                android.view.View r1 = r1.requireView()
                android.view.ViewParent r2 = r1.getParent()
                r3 = 0
                if (r2 != 0) goto L55
                androidx.fragment.app.FragmentStateManager r2 = r4.mFragmentStateManager
                r2.addViewToContainer()
                r1.setAlpha(r3)
            L55:
                float r2 = r1.getAlpha()
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r2 != 0) goto L67
                int r2 = r1.getVisibility()
                if (r2 != 0) goto L67
                r2 = 4
                r1.setVisibility(r2)
            L67:
                float r0 = r0.getPostOnViewCreatedAlpha()
                r1.setAlpha(r0)
            L6e:
                return
        }
    }

    static class Operation {
        private final java.util.List<java.lang.Runnable> mCompletionListeners;
        private androidx.fragment.app.SpecialEffectsController.Operation.State mFinalState;
        private final androidx.fragment.app.Fragment mFragment;
        private boolean mIsCanceled;
        private boolean mIsComplete;
        private androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact mLifecycleImpact;
        private final java.util.HashSet<androidx.core.os.CancellationSignal> mSpecialEffectsSignals;


        enum LifecycleImpact extends java.lang.Enum<androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact> {
            private static final /* synthetic */ androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact[] $VALUES = null;
            public static final androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact ADDING = null;
            public static final androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact NONE = null;
            public static final androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact REMOVING = null;

            static {
                    androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r0 = new androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact
                    java.lang.String r1 = "NONE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.NONE = r0
                    androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r1 = new androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact
                    java.lang.String r3 = "ADDING"
                    r4 = 1
                    r1.<init>(r3, r4)
                    androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING = r1
                    androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r3 = new androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact
                    java.lang.String r5 = "REMOVING"
                    r6 = 2
                    r3.<init>(r5, r6)
                    androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.REMOVING = r3
                    r5 = 3
                    androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact[] r5 = new androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact[r5]
                    r5[r2] = r0
                    r5[r4] = r1
                    r5[r6] = r3
                    androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.$VALUES = r5
                    return
            }

            LifecycleImpact(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact valueOf(java.lang.String r1) {
                    java.lang.Class<androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact> r0 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r1 = (androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact) r1
                    return r1
            }

            public static androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact[] values() {
                    androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact[] r0 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.$VALUES
                    java.lang.Object r0 = r0.clone()
                    androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact[] r0 = (androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact[]) r0
                    return r0
            }
        }

        enum State extends java.lang.Enum<androidx.fragment.app.SpecialEffectsController.Operation.State> {
            private static final /* synthetic */ androidx.fragment.app.SpecialEffectsController.Operation.State[] $VALUES = null;
            public static final androidx.fragment.app.SpecialEffectsController.Operation.State GONE = null;
            public static final androidx.fragment.app.SpecialEffectsController.Operation.State INVISIBLE = null;
            public static final androidx.fragment.app.SpecialEffectsController.Operation.State REMOVED = null;
            public static final androidx.fragment.app.SpecialEffectsController.Operation.State VISIBLE = null;

            static {
                    androidx.fragment.app.SpecialEffectsController$Operation$State r0 = new androidx.fragment.app.SpecialEffectsController$Operation$State
                    java.lang.String r1 = "REMOVED"
                    r2 = 0
                    r0.<init>(r1, r2)
                    androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED = r0
                    androidx.fragment.app.SpecialEffectsController$Operation$State r1 = new androidx.fragment.app.SpecialEffectsController$Operation$State
                    java.lang.String r3 = "VISIBLE"
                    r4 = 1
                    r1.<init>(r3, r4)
                    androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE = r1
                    androidx.fragment.app.SpecialEffectsController$Operation$State r3 = new androidx.fragment.app.SpecialEffectsController$Operation$State
                    java.lang.String r5 = "GONE"
                    r6 = 2
                    r3.<init>(r5, r6)
                    androidx.fragment.app.SpecialEffectsController.Operation.State.GONE = r3
                    androidx.fragment.app.SpecialEffectsController$Operation$State r5 = new androidx.fragment.app.SpecialEffectsController$Operation$State
                    java.lang.String r7 = "INVISIBLE"
                    r8 = 3
                    r5.<init>(r7, r8)
                    androidx.fragment.app.SpecialEffectsController.Operation.State.INVISIBLE = r5
                    r7 = 4
                    androidx.fragment.app.SpecialEffectsController$Operation$State[] r7 = new androidx.fragment.app.SpecialEffectsController.Operation.State[r7]
                    r7[r2] = r0
                    r7[r4] = r1
                    r7[r6] = r3
                    r7[r8] = r5
                    androidx.fragment.app.SpecialEffectsController.Operation.State.$VALUES = r7
                    return
            }

            State(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            static androidx.fragment.app.SpecialEffectsController.Operation.State from(int r3) {
                    if (r3 == 0) goto L24
                    r0 = 4
                    if (r3 == r0) goto L21
                    r0 = 8
                    if (r3 != r0) goto Lc
                    androidx.fragment.app.SpecialEffectsController$Operation$State r3 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE
                    return r3
                Lc:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    java.lang.String r2 = "Unknown visibility "
                    r1.<init>(r2)
                    java.lang.StringBuilder r3 = r1.append(r3)
                    java.lang.String r3 = r3.toString()
                    r0.<init>(r3)
                    throw r0
                L21:
                    androidx.fragment.app.SpecialEffectsController$Operation$State r3 = androidx.fragment.app.SpecialEffectsController.Operation.State.INVISIBLE
                    return r3
                L24:
                    androidx.fragment.app.SpecialEffectsController$Operation$State r3 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
                    return r3
            }

            static androidx.fragment.app.SpecialEffectsController.Operation.State from(android.view.View r2) {
                    float r0 = r2.getAlpha()
                    r1 = 0
                    int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                    if (r0 != 0) goto L12
                    int r0 = r2.getVisibility()
                    if (r0 != 0) goto L12
                    androidx.fragment.app.SpecialEffectsController$Operation$State r2 = androidx.fragment.app.SpecialEffectsController.Operation.State.INVISIBLE
                    return r2
                L12:
                    int r2 = r2.getVisibility()
                    androidx.fragment.app.SpecialEffectsController$Operation$State r2 = from(r2)
                    return r2
            }

            public static androidx.fragment.app.SpecialEffectsController.Operation.State valueOf(java.lang.String r1) {
                    java.lang.Class<androidx.fragment.app.SpecialEffectsController$Operation$State> r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    androidx.fragment.app.SpecialEffectsController$Operation$State r1 = (androidx.fragment.app.SpecialEffectsController.Operation.State) r1
                    return r1
            }

            public static androidx.fragment.app.SpecialEffectsController.Operation.State[] values() {
                    androidx.fragment.app.SpecialEffectsController$Operation$State[] r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.$VALUES
                    java.lang.Object r0 = r0.clone()
                    androidx.fragment.app.SpecialEffectsController$Operation$State[] r0 = (androidx.fragment.app.SpecialEffectsController.Operation.State[]) r0
                    return r0
            }

            void applyState(android.view.View r6) {
                    r5 = this;
                    int[] r0 = androidx.fragment.app.SpecialEffectsController.C03223.f77xe493b431
                    int r1 = r5.ordinal()
                    r0 = r0[r1]
                    r1 = 1
                    java.lang.String r2 = "FragmentManager"
                    r3 = 2
                    if (r0 == r1) goto L7d
                    java.lang.String r1 = "SpecialEffectsController: Setting view "
                    if (r0 == r3) goto L5c
                    r4 = 3
                    if (r0 == r4) goto L3a
                    r4 = 4
                    if (r0 == r4) goto L1a
                    goto Laa
                L1a:
                    boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r3)
                    if (r0 == 0) goto L36
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>(r1)
                    java.lang.StringBuilder r0 = r0.append(r6)
                    java.lang.String r1 = " to INVISIBLE"
                    java.lang.StringBuilder r0 = r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    android.util.Log.v(r2, r0)
                L36:
                    r6.setVisibility(r4)
                    goto Laa
                L3a:
                    boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r3)
                    if (r0 == 0) goto L56
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>(r1)
                    java.lang.StringBuilder r0 = r0.append(r6)
                    java.lang.String r1 = " to GONE"
                    java.lang.StringBuilder r0 = r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    android.util.Log.v(r2, r0)
                L56:
                    r0 = 8
                    r6.setVisibility(r0)
                    goto Laa
                L5c:
                    boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r3)
                    if (r0 == 0) goto L78
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>(r1)
                    java.lang.StringBuilder r0 = r0.append(r6)
                    java.lang.String r1 = " to VISIBLE"
                    java.lang.StringBuilder r0 = r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    android.util.Log.v(r2, r0)
                L78:
                    r0 = 0
                    r6.setVisibility(r0)
                    goto Laa
                L7d:
                    android.view.ViewParent r0 = r6.getParent()
                    android.view.ViewGroup r0 = (android.view.ViewGroup) r0
                    if (r0 == 0) goto Laa
                    boolean r1 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r3)
                    if (r1 == 0) goto La7
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    java.lang.String r3 = "SpecialEffectsController: Removing view "
                    r1.<init>(r3)
                    java.lang.StringBuilder r1 = r1.append(r6)
                    java.lang.String r3 = " from container "
                    java.lang.StringBuilder r1 = r1.append(r3)
                    java.lang.StringBuilder r1 = r1.append(r0)
                    java.lang.String r1 = r1.toString()
                    android.util.Log.v(r2, r1)
                La7:
                    r0.removeView(r6)
                Laa:
                    return
            }
        }

        Operation(androidx.fragment.app.SpecialEffectsController.Operation.State r2, androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact r3, androidx.fragment.app.Fragment r4, androidx.core.os.CancellationSignal r5) {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mCompletionListeners = r0
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r1.mSpecialEffectsSignals = r0
                r0 = 0
                r1.mIsCanceled = r0
                r1.mIsComplete = r0
                r1.mFinalState = r2
                r1.mLifecycleImpact = r3
                r1.mFragment = r4
                androidx.fragment.app.SpecialEffectsController$Operation$1 r2 = new androidx.fragment.app.SpecialEffectsController$Operation$1
                r2.<init>(r1)
                r5.setOnCancelListener(r2)
                return
        }

        final void addCompletionListener(java.lang.Runnable r2) {
                r1 = this;
                java.util.List<java.lang.Runnable> r0 = r1.mCompletionListeners
                r0.add(r2)
                return
        }

        final void cancel() {
                r2 = this;
                boolean r0 = r2.isCanceled()
                if (r0 == 0) goto L7
                return
            L7:
                r0 = 1
                r2.mIsCanceled = r0
                java.util.HashSet<androidx.core.os.CancellationSignal> r0 = r2.mSpecialEffectsSignals
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L16
                r2.complete()
                goto L31
            L16:
                java.util.ArrayList r0 = new java.util.ArrayList
                java.util.HashSet<androidx.core.os.CancellationSignal> r1 = r2.mSpecialEffectsSignals
                r0.<init>(r1)
                java.util.Iterator r0 = r0.iterator()
            L21:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L31
                java.lang.Object r1 = r0.next()
                androidx.core.os.CancellationSignal r1 = (androidx.core.os.CancellationSignal) r1
                r1.cancel()
                goto L21
            L31:
                return
        }

        public void complete() {
                r2 = this;
                boolean r0 = r2.mIsComplete
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 2
                boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
                if (r0 == 0) goto L26
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "SpecialEffectsController: "
                r0.<init>(r1)
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.String r1 = " has called complete."
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "FragmentManager"
                android.util.Log.v(r1, r0)
            L26:
                r0 = 1
                r2.mIsComplete = r0
                java.util.List<java.lang.Runnable> r0 = r2.mCompletionListeners
                java.util.Iterator r0 = r0.iterator()
            L2f:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L3f
                java.lang.Object r1 = r0.next()
                java.lang.Runnable r1 = (java.lang.Runnable) r1
                r1.run()
                goto L2f
            L3f:
                return
        }

        public final void completeSpecialEffect(androidx.core.os.CancellationSignal r2) {
                r1 = this;
                java.util.HashSet<androidx.core.os.CancellationSignal> r0 = r1.mSpecialEffectsSignals
                boolean r2 = r0.remove(r2)
                if (r2 == 0) goto L13
                java.util.HashSet<androidx.core.os.CancellationSignal> r2 = r1.mSpecialEffectsSignals
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L13
                r1.complete()
            L13:
                return
        }

        public androidx.fragment.app.SpecialEffectsController.Operation.State getFinalState() {
                r1 = this;
                androidx.fragment.app.SpecialEffectsController$Operation$State r0 = r1.mFinalState
                return r0
        }

        public final androidx.fragment.app.Fragment getFragment() {
                r1 = this;
                androidx.fragment.app.Fragment r0 = r1.mFragment
                return r0
        }

        androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact getLifecycleImpact() {
                r1 = this;
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r0 = r1.mLifecycleImpact
                return r0
        }

        final boolean isCanceled() {
                r1 = this;
                boolean r0 = r1.mIsCanceled
                return r0
        }

        final boolean isComplete() {
                r1 = this;
                boolean r0 = r1.mIsComplete
                return r0
        }

        public final void markStartedSpecialEffect(androidx.core.os.CancellationSignal r2) {
                r1 = this;
                r1.onStart()
                java.util.HashSet<androidx.core.os.CancellationSignal> r0 = r1.mSpecialEffectsSignals
                r0.add(r2)
                return
        }

        final void mergeWith(androidx.fragment.app.SpecialEffectsController.Operation.State r6, androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact r7) {
                r5 = this;
                int[] r0 = androidx.fragment.app.SpecialEffectsController.C03223.f76xb9e640f0
                int r7 = r7.ordinal()
                r7 = r0[r7]
                r0 = 1
                java.lang.String r1 = "SpecialEffectsController: For fragment "
                java.lang.String r2 = "FragmentManager"
                r3 = 2
                if (r7 == r0) goto L91
                java.lang.String r0 = " mFinalState = "
                if (r7 == r3) goto L54
                r4 = 3
                if (r7 == r4) goto L19
                goto Lc9
            L19:
                androidx.fragment.app.SpecialEffectsController$Operation$State r7 = r5.mFinalState
                androidx.fragment.app.SpecialEffectsController$Operation$State r4 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED
                if (r7 == r4) goto Lc9
                boolean r7 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r3)
                if (r7 == 0) goto L51
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>(r1)
                androidx.fragment.app.Fragment r1 = r5.mFragment
                java.lang.StringBuilder r7 = r7.append(r1)
                java.lang.StringBuilder r7 = r7.append(r0)
                androidx.fragment.app.SpecialEffectsController$Operation$State r0 = r5.mFinalState
                java.lang.StringBuilder r7 = r7.append(r0)
                java.lang.String r0 = " -> "
                java.lang.StringBuilder r7 = r7.append(r0)
                java.lang.StringBuilder r7 = r7.append(r6)
                java.lang.String r0 = ". "
                java.lang.StringBuilder r7 = r7.append(r0)
                java.lang.String r7 = r7.toString()
                android.util.Log.v(r2, r7)
            L51:
                r5.mFinalState = r6
                goto Lc9
            L54:
                boolean r6 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r3)
                if (r6 == 0) goto L88
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>(r1)
                androidx.fragment.app.Fragment r7 = r5.mFragment
                java.lang.StringBuilder r6 = r6.append(r7)
                java.lang.StringBuilder r6 = r6.append(r0)
                androidx.fragment.app.SpecialEffectsController$Operation$State r7 = r5.mFinalState
                java.lang.StringBuilder r6 = r6.append(r7)
                java.lang.String r7 = " -> REMOVED. mLifecycleImpact  = "
                java.lang.StringBuilder r6 = r6.append(r7)
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r7 = r5.mLifecycleImpact
                java.lang.StringBuilder r6 = r6.append(r7)
                java.lang.String r7 = " to REMOVING."
                java.lang.StringBuilder r6 = r6.append(r7)
                java.lang.String r6 = r6.toString()
                android.util.Log.v(r2, r6)
            L88:
                androidx.fragment.app.SpecialEffectsController$Operation$State r6 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED
                r5.mFinalState = r6
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r6 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.REMOVING
                r5.mLifecycleImpact = r6
                goto Lc9
            L91:
                androidx.fragment.app.SpecialEffectsController$Operation$State r6 = r5.mFinalState
                androidx.fragment.app.SpecialEffectsController$Operation$State r7 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED
                if (r6 != r7) goto Lc9
                boolean r6 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r3)
                if (r6 == 0) goto Lc1
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>(r1)
                androidx.fragment.app.Fragment r7 = r5.mFragment
                java.lang.StringBuilder r6 = r6.append(r7)
                java.lang.String r7 = " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = "
                java.lang.StringBuilder r6 = r6.append(r7)
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r7 = r5.mLifecycleImpact
                java.lang.StringBuilder r6 = r6.append(r7)
                java.lang.String r7 = " to ADDING."
                java.lang.StringBuilder r6 = r6.append(r7)
                java.lang.String r6 = r6.toString()
                android.util.Log.v(r2, r6)
            Lc1:
                androidx.fragment.app.SpecialEffectsController$Operation$State r6 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
                r5.mFinalState = r6
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r6 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING
                r5.mLifecycleImpact = r6
            Lc9:
                return
        }

        void onStart() {
                r0 = this;
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Operation {"
                r0.<init>(r1)
                int r1 = java.lang.System.identityHashCode(r2)
                java.lang.String r1 = java.lang.Integer.toHexString(r1)
                r0.append(r1)
                java.lang.String r1 = "} {mFinalState = "
                r0.append(r1)
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = r2.mFinalState
                r0.append(r1)
                java.lang.String r1 = "} {mLifecycleImpact = "
                r0.append(r1)
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r1 = r2.mLifecycleImpact
                r0.append(r1)
                java.lang.String r1 = "} {mFragment = "
                r0.append(r1)
                androidx.fragment.app.Fragment r1 = r2.mFragment
                r0.append(r1)
                java.lang.String r1 = "}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    SpecialEffectsController(android.view.ViewGroup r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mPendingOperations = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mRunningOperations = r0
            r0 = 0
            r1.mOperationDirectionIsPop = r0
            r1.mIsContainerPostponed = r0
            r1.mContainer = r2
            return
    }

    private void enqueue(androidx.fragment.app.SpecialEffectsController.Operation.State r4, androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact r5, androidx.fragment.app.FragmentStateManager r6) {
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r0 = r3.mPendingOperations
            monitor-enter(r0)
            androidx.core.os.CancellationSignal r1 = new androidx.core.os.CancellationSignal     // Catch: java.lang.Throwable -> L33
            r1.<init>()     // Catch: java.lang.Throwable -> L33
            androidx.fragment.app.Fragment r2 = r6.getFragment()     // Catch: java.lang.Throwable -> L33
            androidx.fragment.app.SpecialEffectsController$Operation r2 = r3.findPendingOperation(r2)     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L17
            r2.mergeWith(r4, r5)     // Catch: java.lang.Throwable -> L33
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            return
        L17:
            androidx.fragment.app.SpecialEffectsController$FragmentStateManagerOperation r2 = new androidx.fragment.app.SpecialEffectsController$FragmentStateManagerOperation     // Catch: java.lang.Throwable -> L33
            r2.<init>(r4, r5, r6, r1)     // Catch: java.lang.Throwable -> L33
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r4 = r3.mPendingOperations     // Catch: java.lang.Throwable -> L33
            r4.add(r2)     // Catch: java.lang.Throwable -> L33
            androidx.fragment.app.SpecialEffectsController$1 r4 = new androidx.fragment.app.SpecialEffectsController$1     // Catch: java.lang.Throwable -> L33
            r4.<init>(r3, r2)     // Catch: java.lang.Throwable -> L33
            r2.addCompletionListener(r4)     // Catch: java.lang.Throwable -> L33
            androidx.fragment.app.SpecialEffectsController$2 r4 = new androidx.fragment.app.SpecialEffectsController$2     // Catch: java.lang.Throwable -> L33
            r4.<init>(r3, r2)     // Catch: java.lang.Throwable -> L33
            r2.addCompletionListener(r4)     // Catch: java.lang.Throwable -> L33
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            return
        L33:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            throw r4
    }

    private androidx.fragment.app.SpecialEffectsController.Operation findPendingOperation(androidx.fragment.app.Fragment r4) {
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r0 = r3.mPendingOperations
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.SpecialEffectsController$Operation r1 = (androidx.fragment.app.SpecialEffectsController.Operation) r1
            androidx.fragment.app.Fragment r2 = r1.getFragment()
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L6
            boolean r2 = r1.isCanceled()
            if (r2 != 0) goto L6
            return r1
        L23:
            r4 = 0
            return r4
    }

    private androidx.fragment.app.SpecialEffectsController.Operation findRunningOperation(androidx.fragment.app.Fragment r4) {
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r0 = r3.mRunningOperations
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.SpecialEffectsController$Operation r1 = (androidx.fragment.app.SpecialEffectsController.Operation) r1
            androidx.fragment.app.Fragment r2 = r1.getFragment()
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L6
            boolean r2 = r1.isCanceled()
            if (r2 != 0) goto L6
            return r1
        L23:
            r4 = 0
            return r4
    }

    static androidx.fragment.app.SpecialEffectsController getOrCreateController(android.view.ViewGroup r0, androidx.fragment.app.FragmentManager r1) {
            androidx.fragment.app.SpecialEffectsControllerFactory r1 = r1.getSpecialEffectsControllerFactory()
            androidx.fragment.app.SpecialEffectsController r0 = getOrCreateController(r0, r1)
            return r0
    }

    static androidx.fragment.app.SpecialEffectsController getOrCreateController(android.view.ViewGroup r2, androidx.fragment.app.SpecialEffectsControllerFactory r3) {
            int r0 = androidx.fragment.C0252R.id.special_effects_controller_view_tag
            java.lang.Object r0 = r2.getTag(r0)
            boolean r1 = r0 instanceof androidx.fragment.app.SpecialEffectsController
            if (r1 == 0) goto Ld
            androidx.fragment.app.SpecialEffectsController r0 = (androidx.fragment.app.SpecialEffectsController) r0
            return r0
        Ld:
            androidx.fragment.app.SpecialEffectsController r3 = r3.createController(r2)
            int r0 = androidx.fragment.C0252R.id.special_effects_controller_view_tag
            r2.setTag(r0, r3)
            return r3
    }

    private void updateFinalState() {
            r4 = this;
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r0 = r4.mPendingOperations
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.SpecialEffectsController$Operation r1 = (androidx.fragment.app.SpecialEffectsController.Operation) r1
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r2 = r1.getLifecycleImpact()
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r3 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING
            if (r2 != r3) goto L6
            androidx.fragment.app.Fragment r2 = r1.getFragment()
            android.view.View r2 = r2.requireView()
            int r2 = r2.getVisibility()
            androidx.fragment.app.SpecialEffectsController$Operation$State r2 = androidx.fragment.app.SpecialEffectsController.Operation.State.from(r2)
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r3 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.NONE
            r1.mergeWith(r2, r3)
            goto L6
        L30:
            return
    }

    void enqueueAdd(androidx.fragment.app.SpecialEffectsController.Operation.State r3, androidx.fragment.app.FragmentStateManager r4) {
            r2 = this;
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L1f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SpecialEffectsController: Enqueuing add operation for fragment "
            r0.<init>(r1)
            androidx.fragment.app.Fragment r1 = r4.getFragment()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L1f:
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r0 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING
            r2.enqueue(r3, r0, r4)
            return
    }

    void enqueueHide(androidx.fragment.app.FragmentStateManager r3) {
            r2 = this;
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L1f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SpecialEffectsController: Enqueuing hide operation for fragment "
            r0.<init>(r1)
            androidx.fragment.app.Fragment r1 = r3.getFragment()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L1f:
            androidx.fragment.app.SpecialEffectsController$Operation$State r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r1 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.NONE
            r2.enqueue(r0, r1, r3)
            return
    }

    void enqueueRemove(androidx.fragment.app.FragmentStateManager r3) {
            r2 = this;
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L1f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SpecialEffectsController: Enqueuing remove operation for fragment "
            r0.<init>(r1)
            androidx.fragment.app.Fragment r1 = r3.getFragment()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L1f:
            androidx.fragment.app.SpecialEffectsController$Operation$State r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r1 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.REMOVING
            r2.enqueue(r0, r1, r3)
            return
    }

    void enqueueShow(androidx.fragment.app.FragmentStateManager r3) {
            r2 = this;
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L1f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SpecialEffectsController: Enqueuing show operation for fragment "
            r0.<init>(r1)
            androidx.fragment.app.Fragment r1 = r3.getFragment()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L1f:
            androidx.fragment.app.SpecialEffectsController$Operation$State r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r1 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.NONE
            r2.enqueue(r0, r1, r3)
            return
    }

    abstract void executeOperations(java.util.List<androidx.fragment.app.SpecialEffectsController.Operation> r1, boolean r2);

    void executePendingOperations() {
            r7 = this;
            boolean r0 = r7.mIsContainerPostponed
            if (r0 == 0) goto L5
            return
        L5:
            android.view.ViewGroup r0 = r7.mContainer
            boolean r0 = androidx.core.view.ViewCompat.isAttachedToWindow(r0)
            r1 = 0
            if (r0 != 0) goto L14
            r7.forceCompleteAllOperations()
            r7.mOperationDirectionIsPop = r1
            return
        L14:
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r0 = r7.mPendingOperations
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r2 = r7.mPendingOperations     // Catch: java.lang.Throwable -> L9a
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L9a
            if (r2 != 0) goto L98
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L9a
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r3 = r7.mRunningOperations     // Catch: java.lang.Throwable -> L9a
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L9a
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r3 = r7.mRunningOperations     // Catch: java.lang.Throwable -> L9a
            r3.clear()     // Catch: java.lang.Throwable -> L9a
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L9a
        L2f:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L9a
            if (r3 == 0) goto L69
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L9a
            androidx.fragment.app.SpecialEffectsController$Operation r3 = (androidx.fragment.app.SpecialEffectsController.Operation) r3     // Catch: java.lang.Throwable -> L9a
            r4 = 2
            boolean r4 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r4)     // Catch: java.lang.Throwable -> L9a
            if (r4 == 0) goto L5a
            java.lang.String r4 = "FragmentManager"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9a
            r5.<init>()     // Catch: java.lang.Throwable -> L9a
            java.lang.String r6 = "SpecialEffectsController: Cancelling operation "
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.Throwable -> L9a
            java.lang.StringBuilder r5 = r5.append(r3)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L9a
            android.util.Log.v(r4, r5)     // Catch: java.lang.Throwable -> L9a
        L5a:
            r3.cancel()     // Catch: java.lang.Throwable -> L9a
            boolean r4 = r3.isComplete()     // Catch: java.lang.Throwable -> L9a
            if (r4 != 0) goto L2f
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r4 = r7.mRunningOperations     // Catch: java.lang.Throwable -> L9a
            r4.add(r3)     // Catch: java.lang.Throwable -> L9a
            goto L2f
        L69:
            r7.updateFinalState()     // Catch: java.lang.Throwable -> L9a
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L9a
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r3 = r7.mPendingOperations     // Catch: java.lang.Throwable -> L9a
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L9a
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r3 = r7.mPendingOperations     // Catch: java.lang.Throwable -> L9a
            r3.clear()     // Catch: java.lang.Throwable -> L9a
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r3 = r7.mRunningOperations     // Catch: java.lang.Throwable -> L9a
            r3.addAll(r2)     // Catch: java.lang.Throwable -> L9a
            java.util.Iterator r3 = r2.iterator()     // Catch: java.lang.Throwable -> L9a
        L81:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L9a
            if (r4 == 0) goto L91
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L9a
            androidx.fragment.app.SpecialEffectsController$Operation r4 = (androidx.fragment.app.SpecialEffectsController.Operation) r4     // Catch: java.lang.Throwable -> L9a
            r4.onStart()     // Catch: java.lang.Throwable -> L9a
            goto L81
        L91:
            boolean r3 = r7.mOperationDirectionIsPop     // Catch: java.lang.Throwable -> L9a
            r7.executeOperations(r2, r3)     // Catch: java.lang.Throwable -> L9a
            r7.mOperationDirectionIsPop = r1     // Catch: java.lang.Throwable -> L9a
        L98:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9a
            return
        L9a:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9a
            throw r1
    }

    void forceCompleteAllOperations() {
            r9 = this;
            android.view.ViewGroup r0 = r9.mContainer
            boolean r0 = androidx.core.view.ViewCompat.isAttachedToWindow(r0)
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r1 = r9.mPendingOperations
            monitor-enter(r1)
            r9.updateFinalState()     // Catch: java.lang.Throwable -> Leb
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r2 = r9.mPendingOperations     // Catch: java.lang.Throwable -> Leb
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Leb
        L12:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> Leb
            if (r3 == 0) goto L22
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> Leb
            androidx.fragment.app.SpecialEffectsController$Operation r3 = (androidx.fragment.app.SpecialEffectsController.Operation) r3     // Catch: java.lang.Throwable -> Leb
            r3.onStart()     // Catch: java.lang.Throwable -> Leb
            goto L12
        L22:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Leb
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r3 = r9.mRunningOperations     // Catch: java.lang.Throwable -> Leb
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Leb
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Leb
        L2d:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> Leb
            r4 = 2
            if (r3 == 0) goto L86
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> Leb
            androidx.fragment.app.SpecialEffectsController$Operation r3 = (androidx.fragment.app.SpecialEffectsController.Operation) r3     // Catch: java.lang.Throwable -> Leb
            boolean r4 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r4)     // Catch: java.lang.Throwable -> Leb
            if (r4 == 0) goto L82
            java.lang.String r4 = "FragmentManager"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Leb
            r5.<init>()     // Catch: java.lang.Throwable -> Leb
            java.lang.String r6 = "SpecialEffectsController: "
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.Throwable -> Leb
            if (r0 == 0) goto L52
            java.lang.String r6 = ""
            goto L6d
        L52:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Leb
            r6.<init>()     // Catch: java.lang.Throwable -> Leb
            java.lang.String r7 = "Container "
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Throwable -> Leb
            android.view.ViewGroup r7 = r9.mContainer     // Catch: java.lang.Throwable -> Leb
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Throwable -> Leb
            java.lang.String r7 = " is not attached to window. "
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Throwable -> Leb
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Leb
        L6d:
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.Throwable -> Leb
            java.lang.String r6 = "Cancelling running operation "
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.Throwable -> Leb
            java.lang.StringBuilder r5 = r5.append(r3)     // Catch: java.lang.Throwable -> Leb
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> Leb
            android.util.Log.v(r4, r5)     // Catch: java.lang.Throwable -> Leb
        L82:
            r3.cancel()     // Catch: java.lang.Throwable -> Leb
            goto L2d
        L86:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Leb
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r3 = r9.mPendingOperations     // Catch: java.lang.Throwable -> Leb
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Leb
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Leb
        L91:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> Leb
            if (r3 == 0) goto Le9
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> Leb
            androidx.fragment.app.SpecialEffectsController$Operation r3 = (androidx.fragment.app.SpecialEffectsController.Operation) r3     // Catch: java.lang.Throwable -> Leb
            boolean r5 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r4)     // Catch: java.lang.Throwable -> Leb
            if (r5 == 0) goto Le5
            java.lang.String r5 = "FragmentManager"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Leb
            r6.<init>()     // Catch: java.lang.Throwable -> Leb
            java.lang.String r7 = "SpecialEffectsController: "
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Throwable -> Leb
            if (r0 == 0) goto Lb5
            java.lang.String r7 = ""
            goto Ld0
        Lb5:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Leb
            r7.<init>()     // Catch: java.lang.Throwable -> Leb
            java.lang.String r8 = "Container "
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Throwable -> Leb
            android.view.ViewGroup r8 = r9.mContainer     // Catch: java.lang.Throwable -> Leb
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Throwable -> Leb
            java.lang.String r8 = " is not attached to window. "
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Throwable -> Leb
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> Leb
        Ld0:
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Throwable -> Leb
            java.lang.String r7 = "Cancelling pending operation "
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Throwable -> Leb
            java.lang.StringBuilder r6 = r6.append(r3)     // Catch: java.lang.Throwable -> Leb
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Leb
            android.util.Log.v(r5, r6)     // Catch: java.lang.Throwable -> Leb
        Le5:
            r3.cancel()     // Catch: java.lang.Throwable -> Leb
            goto L91
        Le9:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Leb
            return
        Leb:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Leb
            throw r0
    }

    void forcePostponedExecutePendingOperations() {
            r1 = this;
            boolean r0 = r1.mIsContainerPostponed
            if (r0 == 0) goto La
            r0 = 0
            r1.mIsContainerPostponed = r0
            r1.executePendingOperations()
        La:
            return
    }

    androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact getAwaitingCompletionLifecycleImpact(androidx.fragment.app.FragmentStateManager r3) {
            r2 = this;
            androidx.fragment.app.Fragment r0 = r3.getFragment()
            androidx.fragment.app.SpecialEffectsController$Operation r0 = r2.findPendingOperation(r0)
            if (r0 == 0) goto Lf
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r0 = r0.getLifecycleImpact()
            goto L10
        Lf:
            r0 = 0
        L10:
            androidx.fragment.app.Fragment r3 = r3.getFragment()
            androidx.fragment.app.SpecialEffectsController$Operation r3 = r2.findRunningOperation(r3)
            if (r3 == 0) goto L25
            if (r0 == 0) goto L20
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r1 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.NONE
            if (r0 != r1) goto L25
        L20:
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r3 = r3.getLifecycleImpact()
            return r3
        L25:
            return r0
    }

    public android.view.ViewGroup getContainer() {
            r1 = this;
            android.view.ViewGroup r0 = r1.mContainer
            return r0
    }

    void markPostponedState() {
            r6 = this;
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r0 = r6.mPendingOperations
            monitor-enter(r0)
            r6.updateFinalState()     // Catch: java.lang.Throwable -> L41
            r1 = 0
            r6.mIsContainerPostponed = r1     // Catch: java.lang.Throwable -> L41
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r1 = r6.mPendingOperations     // Catch: java.lang.Throwable -> L41
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L41
            int r1 = r1 + (-1)
        L11:
            if (r1 < 0) goto L3f
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r2 = r6.mPendingOperations     // Catch: java.lang.Throwable -> L41
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L41
            androidx.fragment.app.SpecialEffectsController$Operation r2 = (androidx.fragment.app.SpecialEffectsController.Operation) r2     // Catch: java.lang.Throwable -> L41
            androidx.fragment.app.Fragment r3 = r2.getFragment()     // Catch: java.lang.Throwable -> L41
            android.view.View r3 = r3.mView     // Catch: java.lang.Throwable -> L41
            androidx.fragment.app.SpecialEffectsController$Operation$State r3 = androidx.fragment.app.SpecialEffectsController.Operation.State.from(r3)     // Catch: java.lang.Throwable -> L41
            androidx.fragment.app.SpecialEffectsController$Operation$State r4 = r2.getFinalState()     // Catch: java.lang.Throwable -> L41
            androidx.fragment.app.SpecialEffectsController$Operation$State r5 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE     // Catch: java.lang.Throwable -> L41
            if (r4 != r5) goto L3c
            androidx.fragment.app.SpecialEffectsController$Operation$State r4 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE     // Catch: java.lang.Throwable -> L41
            if (r3 == r4) goto L3c
            androidx.fragment.app.Fragment r1 = r2.getFragment()     // Catch: java.lang.Throwable -> L41
            boolean r1 = r1.isPostponed()     // Catch: java.lang.Throwable -> L41
            r6.mIsContainerPostponed = r1     // Catch: java.lang.Throwable -> L41
            goto L3f
        L3c:
            int r1 = r1 + (-1)
            goto L11
        L3f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L41
            return
        L41:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L41
            throw r1
    }

    void updateOperationDirection(boolean r1) {
            r0 = this;
            r0.mOperationDirectionIsPop = r1
            return
    }
}
