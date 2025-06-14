package androidx.fragment.app;

/* loaded from: classes.dex */
class DefaultSpecialEffectsController extends androidx.fragment.app.SpecialEffectsController {


    /* renamed from: androidx.fragment.app.DefaultSpecialEffectsController$10 */
    static /* synthetic */ class C025510 {

        /* renamed from: $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State */
        static final /* synthetic */ int[] f75xe493b431 = null;

        static {
                androidx.fragment.app.SpecialEffectsController$Operation$State[] r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.fragment.app.DefaultSpecialEffectsController.C025510.f75xe493b431 = r0
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.fragment.app.DefaultSpecialEffectsController.C025510.f75xe493b431     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.INVISIBLE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.fragment.app.DefaultSpecialEffectsController.C025510.f75xe493b431     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = androidx.fragment.app.DefaultSpecialEffectsController.C025510.f75xe493b431     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }









    private static class AnimationInfo extends androidx.fragment.app.DefaultSpecialEffectsController.SpecialEffectsInfo {
        private androidx.fragment.app.FragmentAnim.AnimationOrAnimator mAnimation;
        private boolean mIsPop;
        private boolean mLoadedAnim;

        AnimationInfo(androidx.fragment.app.SpecialEffectsController.Operation r1, androidx.core.os.CancellationSignal r2, boolean r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 0
                r0.mLoadedAnim = r1
                r0.mIsPop = r3
                return
        }

        androidx.fragment.app.FragmentAnim.AnimationOrAnimator getAnimation(android.content.Context r5) {
                r4 = this;
                boolean r0 = r4.mLoadedAnim
                if (r0 == 0) goto L7
                androidx.fragment.app.FragmentAnim$AnimationOrAnimator r5 = r4.mAnimation
                return r5
            L7:
                androidx.fragment.app.SpecialEffectsController$Operation r0 = r4.getOperation()
                androidx.fragment.app.Fragment r0 = r0.getFragment()
                androidx.fragment.app.SpecialEffectsController$Operation r1 = r4.getOperation()
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = r1.getFinalState()
                androidx.fragment.app.SpecialEffectsController$Operation$State r2 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
                r3 = 1
                if (r1 != r2) goto L1e
                r1 = r3
                goto L1f
            L1e:
                r1 = 0
            L1f:
                boolean r2 = r4.mIsPop
                androidx.fragment.app.FragmentAnim$AnimationOrAnimator r5 = androidx.fragment.app.FragmentAnim.loadAnimation(r5, r0, r1, r2)
                r4.mAnimation = r5
                r4.mLoadedAnim = r3
                return r5
        }
    }

    private static class SpecialEffectsInfo {
        private final androidx.fragment.app.SpecialEffectsController.Operation mOperation;
        private final androidx.core.os.CancellationSignal mSignal;

        SpecialEffectsInfo(androidx.fragment.app.SpecialEffectsController.Operation r1, androidx.core.os.CancellationSignal r2) {
                r0 = this;
                r0.<init>()
                r0.mOperation = r1
                r0.mSignal = r2
                return
        }

        void completeSpecialEffect() {
                r2 = this;
                androidx.fragment.app.SpecialEffectsController$Operation r0 = r2.mOperation
                androidx.core.os.CancellationSignal r1 = r2.mSignal
                r0.completeSpecialEffect(r1)
                return
        }

        androidx.fragment.app.SpecialEffectsController.Operation getOperation() {
                r1 = this;
                androidx.fragment.app.SpecialEffectsController$Operation r0 = r1.mOperation
                return r0
        }

        androidx.core.os.CancellationSignal getSignal() {
                r1 = this;
                androidx.core.os.CancellationSignal r0 = r1.mSignal
                return r0
        }

        boolean isVisibilityUnchanged() {
                r3 = this;
                androidx.fragment.app.SpecialEffectsController$Operation r0 = r3.mOperation
                androidx.fragment.app.Fragment r0 = r0.getFragment()
                android.view.View r0 = r0.mView
                androidx.fragment.app.SpecialEffectsController$Operation$State r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.from(r0)
                androidx.fragment.app.SpecialEffectsController$Operation r1 = r3.mOperation
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = r1.getFinalState()
                if (r0 == r1) goto L1f
                androidx.fragment.app.SpecialEffectsController$Operation$State r2 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
                if (r0 == r2) goto L1d
                androidx.fragment.app.SpecialEffectsController$Operation$State r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
                if (r1 == r0) goto L1d
                goto L1f
            L1d:
                r0 = 0
                goto L20
            L1f:
                r0 = 1
            L20:
                return r0
        }
    }

    private static class TransitionInfo extends androidx.fragment.app.DefaultSpecialEffectsController.SpecialEffectsInfo {
        private final boolean mOverlapAllowed;
        private final java.lang.Object mSharedElementTransition;
        private final java.lang.Object mTransition;

        TransitionInfo(androidx.fragment.app.SpecialEffectsController.Operation r2, androidx.core.os.CancellationSignal r3, boolean r4, boolean r5) {
                r1 = this;
                r1.<init>(r2, r3)
                androidx.fragment.app.SpecialEffectsController$Operation$State r3 = r2.getFinalState()
                androidx.fragment.app.SpecialEffectsController$Operation$State r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
                if (r3 != r0) goto L36
                if (r4 == 0) goto L16
                androidx.fragment.app.Fragment r3 = r2.getFragment()
                java.lang.Object r3 = r3.getReenterTransition()
                goto L1e
            L16:
                androidx.fragment.app.Fragment r3 = r2.getFragment()
                java.lang.Object r3 = r3.getEnterTransition()
            L1e:
                r1.mTransition = r3
                if (r4 == 0) goto L2b
                androidx.fragment.app.Fragment r3 = r2.getFragment()
                boolean r3 = r3.getAllowReturnTransitionOverlap()
                goto L33
            L2b:
                androidx.fragment.app.Fragment r3 = r2.getFragment()
                boolean r3 = r3.getAllowEnterTransitionOverlap()
            L33:
                r1.mOverlapAllowed = r3
                goto L4e
            L36:
                if (r4 == 0) goto L41
                androidx.fragment.app.Fragment r3 = r2.getFragment()
                java.lang.Object r3 = r3.getReturnTransition()
                goto L49
            L41:
                androidx.fragment.app.Fragment r3 = r2.getFragment()
                java.lang.Object r3 = r3.getExitTransition()
            L49:
                r1.mTransition = r3
                r3 = 1
                r1.mOverlapAllowed = r3
            L4e:
                if (r5 == 0) goto L68
                if (r4 == 0) goto L5d
                androidx.fragment.app.Fragment r2 = r2.getFragment()
                java.lang.Object r2 = r2.getSharedElementReturnTransition()
                r1.mSharedElementTransition = r2
                goto L6b
            L5d:
                androidx.fragment.app.Fragment r2 = r2.getFragment()
                java.lang.Object r2 = r2.getSharedElementEnterTransition()
                r1.mSharedElementTransition = r2
                goto L6b
            L68:
                r2 = 0
                r1.mSharedElementTransition = r2
            L6b:
                return
        }

        private androidx.fragment.app.FragmentTransitionImpl getHandlingImpl(java.lang.Object r4) {
                r3 = this;
                if (r4 != 0) goto L4
                r4 = 0
                return r4
            L4:
                androidx.fragment.app.FragmentTransitionImpl r0 = androidx.fragment.app.FragmentTransition.PLATFORM_IMPL
                if (r0 == 0) goto L13
                androidx.fragment.app.FragmentTransitionImpl r0 = androidx.fragment.app.FragmentTransition.PLATFORM_IMPL
                boolean r0 = r0.canHandle(r4)
                if (r0 == 0) goto L13
                androidx.fragment.app.FragmentTransitionImpl r4 = androidx.fragment.app.FragmentTransition.PLATFORM_IMPL
                return r4
            L13:
                androidx.fragment.app.FragmentTransitionImpl r0 = androidx.fragment.app.FragmentTransition.SUPPORT_IMPL
                if (r0 == 0) goto L22
                androidx.fragment.app.FragmentTransitionImpl r0 = androidx.fragment.app.FragmentTransition.SUPPORT_IMPL
                boolean r0 = r0.canHandle(r4)
                if (r0 == 0) goto L22
                androidx.fragment.app.FragmentTransitionImpl r4 = androidx.fragment.app.FragmentTransition.SUPPORT_IMPL
                return r4
            L22:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Transition "
                r1.<init>(r2)
                java.lang.StringBuilder r4 = r1.append(r4)
                java.lang.String r1 = " for fragment "
                java.lang.StringBuilder r4 = r4.append(r1)
                androidx.fragment.app.SpecialEffectsController$Operation r1 = r3.getOperation()
                androidx.fragment.app.Fragment r1 = r1.getFragment()
                java.lang.StringBuilder r4 = r4.append(r1)
                java.lang.String r1 = " is not a valid framework Transition or AndroidX Transition"
                java.lang.StringBuilder r4 = r4.append(r1)
                java.lang.String r4 = r4.toString()
                r0.<init>(r4)
                throw r0
        }

        androidx.fragment.app.FragmentTransitionImpl getHandlingImpl() {
                r3 = this;
                java.lang.Object r0 = r3.mTransition
                androidx.fragment.app.FragmentTransitionImpl r0 = r3.getHandlingImpl(r0)
                java.lang.Object r1 = r3.mSharedElementTransition
                androidx.fragment.app.FragmentTransitionImpl r1 = r3.getHandlingImpl(r1)
                if (r0 == 0) goto L48
                if (r1 == 0) goto L48
                if (r0 != r1) goto L13
                goto L48
            L13:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "
                r1.<init>(r2)
                androidx.fragment.app.SpecialEffectsController$Operation r2 = r3.getOperation()
                androidx.fragment.app.Fragment r2 = r2.getFragment()
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r2 = " returned Transition "
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.Object r2 = r3.mTransition
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r2 = " which uses a different Transition  type than its shared element transition "
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.Object r2 = r3.mSharedElementTransition
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L48:
                if (r0 == 0) goto L4b
                goto L4c
            L4b:
                r0 = r1
            L4c:
                return r0
        }

        public java.lang.Object getSharedElementTransition() {
                r1 = this;
                java.lang.Object r0 = r1.mSharedElementTransition
                return r0
        }

        java.lang.Object getTransition() {
                r1 = this;
                java.lang.Object r0 = r1.mTransition
                return r0
        }

        public boolean hasSharedElementTransition() {
                r1 = this;
                java.lang.Object r0 = r1.mSharedElementTransition
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        boolean isOverlapAllowed() {
                r1 = this;
                boolean r0 = r1.mOverlapAllowed
                return r0
        }
    }

    DefaultSpecialEffectsController(android.view.ViewGroup r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private void startAnimations(java.util.List<androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo> r19, java.util.List<androidx.fragment.app.SpecialEffectsController.Operation> r20, boolean r21, java.util.Map<androidx.fragment.app.SpecialEffectsController.Operation, java.lang.Boolean> r22) {
            r18 = this;
            r7 = r18
            android.view.ViewGroup r8 = r18.getContainer()
            android.content.Context r9 = r8.getContext()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r11 = r19.iterator()
            r0 = 0
        L14:
            boolean r1 = r11.hasNext()
            java.lang.String r2 = "FragmentManager"
            r3 = 2
            if (r1 == 0) goto Lbc
            java.lang.Object r1 = r11.next()
            r13 = r1
            androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r13 = (androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo) r13
            boolean r1 = r13.isVisibilityUnchanged()
            if (r1 == 0) goto L30
            r13.completeSpecialEffect()
        L2d:
            r15 = r22
            goto L14
        L30:
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r1 = r13.getAnimation(r9)
            if (r1 != 0) goto L3a
            r13.completeSpecialEffect()
            goto L2d
        L3a:
            android.animation.Animator r14 = r1.animator
            if (r14 != 0) goto L42
            r10.add(r13)
            goto L2d
        L42:
            androidx.fragment.app.SpecialEffectsController$Operation r5 = r13.getOperation()
            androidx.fragment.app.Fragment r1 = r5.getFragment()
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r15 = r22
            java.lang.Object r6 = r15.get(r5)
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L7a
            boolean r3 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r3)
            if (r3 == 0) goto L76
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Ignoring Animator set on "
            r3.<init>(r4)
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.String r3 = " as this Fragment was involved in a Transition."
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r2, r1)
        L76:
            r13.completeSpecialEffect()
            goto L14
        L7a:
            androidx.fragment.app.SpecialEffectsController$Operation$State r0 = r5.getFinalState()
            androidx.fragment.app.SpecialEffectsController$Operation$State r2 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE
            r16 = 1
            if (r0 != r2) goto L87
            r4 = r16
            goto L88
        L87:
            r4 = 0
        L88:
            r6 = r20
            if (r4 == 0) goto L8f
            r6.remove(r5)
        L8f:
            android.view.View r3 = r1.mView
            r8.startViewTransition(r3)
            androidx.fragment.app.DefaultSpecialEffectsController$2 r2 = new androidx.fragment.app.DefaultSpecialEffectsController$2
            r0 = r2
            r1 = r18
            r12 = r2
            r2 = r8
            r17 = r3
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r14.addListener(r12)
            r0 = r17
            r14.setTarget(r0)
            r14.start()
            androidx.core.os.CancellationSignal r0 = r13.getSignal()
            androidx.fragment.app.DefaultSpecialEffectsController$3 r1 = new androidx.fragment.app.DefaultSpecialEffectsController$3
            r1.<init>(r7, r14)
            r0.setOnCancelListener(r1)
            r0 = r16
            goto L14
        Lbc:
            java.util.Iterator r1 = r10.iterator()
        Lc0:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L15e
            java.lang.Object r4 = r1.next()
            androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r4 = (androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo) r4
            androidx.fragment.app.SpecialEffectsController$Operation r5 = r4.getOperation()
            androidx.fragment.app.Fragment r6 = r5.getFragment()
            java.lang.String r10 = "Ignoring Animation set on "
            if (r21 == 0) goto Lf8
            boolean r5 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r3)
            if (r5 == 0) goto Lf4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r10)
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = " as Animations cannot run alongside Transitions."
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.util.Log.v(r2, r5)
        Lf4:
            r4.completeSpecialEffect()
            goto Lc0
        Lf8:
            if (r0 == 0) goto L11a
            boolean r5 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r3)
            if (r5 == 0) goto L116
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r10)
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = " as Animations cannot run alongside Animators."
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.util.Log.v(r2, r5)
        L116:
            r4.completeSpecialEffect()
            goto Lc0
        L11a:
            android.view.View r6 = r6.mView
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r10 = r4.getAnimation(r9)
            java.lang.Object r10 = androidx.core.util.Preconditions.checkNotNull(r10)
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r10 = (androidx.fragment.app.FragmentAnim.AnimationOrAnimator) r10
            android.view.animation.Animation r10 = r10.animation
            java.lang.Object r10 = androidx.core.util.Preconditions.checkNotNull(r10)
            android.view.animation.Animation r10 = (android.view.animation.Animation) r10
            androidx.fragment.app.SpecialEffectsController$Operation$State r5 = r5.getFinalState()
            androidx.fragment.app.SpecialEffectsController$Operation$State r11 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED
            if (r5 == r11) goto L13d
            r6.startAnimation(r10)
            r4.completeSpecialEffect()
            goto L150
        L13d:
            r8.startViewTransition(r6)
            androidx.fragment.app.FragmentAnim$EndViewTransitionAnimation r5 = new androidx.fragment.app.FragmentAnim$EndViewTransitionAnimation
            r5.<init>(r10, r8, r6)
            androidx.fragment.app.DefaultSpecialEffectsController$4 r10 = new androidx.fragment.app.DefaultSpecialEffectsController$4
            r10.<init>(r7, r8, r6, r4)
            r5.setAnimationListener(r10)
            r6.startAnimation(r5)
        L150:
            androidx.core.os.CancellationSignal r5 = r4.getSignal()
            androidx.fragment.app.DefaultSpecialEffectsController$5 r10 = new androidx.fragment.app.DefaultSpecialEffectsController$5
            r10.<init>(r7, r6, r8, r4)
            r5.setOnCancelListener(r10)
            goto Lc0
        L15e:
            return
    }

    private java.util.Map<androidx.fragment.app.SpecialEffectsController.Operation, java.lang.Boolean> startTransitions(java.util.List<androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo> r32, java.util.List<androidx.fragment.app.SpecialEffectsController.Operation> r33, boolean r34, androidx.fragment.app.SpecialEffectsController.Operation r35, androidx.fragment.app.SpecialEffectsController.Operation r36) {
            r31 = this;
            r6 = r31
            r7 = r34
            r8 = r35
            r9 = r36
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            java.util.Iterator r0 = r32.iterator()
            r15 = 0
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L63
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r1 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r1
            boolean r2 = r1.isVisibilityUnchanged()
            if (r2 == 0) goto L25
            goto L12
        L25:
            androidx.fragment.app.FragmentTransitionImpl r2 = r1.getHandlingImpl()
            if (r15 != 0) goto L2d
            r15 = r2
            goto L12
        L2d:
            if (r2 == 0) goto L12
            if (r15 != r2) goto L32
            goto L12
        L32:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "
            r2.<init>(r3)
            androidx.fragment.app.SpecialEffectsController$Operation r3 = r1.getOperation()
            androidx.fragment.app.Fragment r3 = r3.getFragment()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " returned Transition "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.Object r1 = r1.getTransition()
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r2 = " which uses a different Transition  type than other Fragments."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L63:
            r14 = 0
            if (r15 != 0) goto L86
            java.util.Iterator r0 = r32.iterator()
        L6a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L85
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r1 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r1
            androidx.fragment.app.SpecialEffectsController$Operation r2 = r1.getOperation()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r14)
            r10.put(r2, r3)
            r1.completeSpecialEffect()
            goto L6a
        L85:
            return r10
        L86:
            android.view.View r13 = new android.view.View
            android.view.ViewGroup r0 = r31.getContainer()
            android.content.Context r0 = r0.getContext()
            r13.<init>(r0)
            android.graphics.Rect r12 = new android.graphics.Rect
            r12.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            androidx.collection.ArrayMap r3 = new androidx.collection.ArrayMap
            r3.<init>()
            java.util.Iterator r20 = r32.iterator()
            r21 = r14
            r0 = 0
            r2 = 0
        Laf:
            boolean r1 = r20.hasNext()
            if (r1 == 0) goto L31c
            java.lang.Object r1 = r20.next()
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r1 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r1
            boolean r16 = r1.hasSharedElementTransition()
            if (r16 == 0) goto L2f6
            if (r8 == 0) goto L2f6
            if (r9 == 0) goto L2f6
            java.lang.Object r0 = r1.getSharedElementTransition()
            java.lang.Object r0 = r15.cloneTransition(r0)
            java.lang.Object r1 = r15.wrapTransitionInSet(r0)
            androidx.fragment.app.Fragment r0 = r36.getFragment()
            java.util.ArrayList r0 = r0.getSharedElementSourceNames()
            androidx.fragment.app.Fragment r16 = r35.getFragment()
            java.util.ArrayList r14 = r16.getSharedElementSourceNames()
            androidx.fragment.app.Fragment r16 = r35.getFragment()
            java.util.ArrayList r11 = r16.getSharedElementTargetNames()
            r16 = r1
            r18 = r2
            r1 = 0
        Lee:
            int r2 = r11.size()
            if (r1 >= r2) goto L10d
            java.lang.Object r2 = r11.get(r1)
            int r2 = r0.indexOf(r2)
            r19 = r11
            r11 = -1
            if (r2 == r11) goto L108
            java.lang.Object r11 = r14.get(r1)
            r0.set(r2, r11)
        L108:
            int r1 = r1 + 1
            r11 = r19
            goto Lee
        L10d:
            androidx.fragment.app.Fragment r1 = r36.getFragment()
            java.util.ArrayList r11 = r1.getSharedElementTargetNames()
            if (r7 != 0) goto L128
            androidx.fragment.app.Fragment r1 = r35.getFragment()
            androidx.core.app.SharedElementCallback r1 = r1.getExitTransitionCallback()
            androidx.fragment.app.Fragment r2 = r36.getFragment()
            androidx.core.app.SharedElementCallback r2 = r2.getEnterTransitionCallback()
            goto L138
        L128:
            androidx.fragment.app.Fragment r1 = r35.getFragment()
            androidx.core.app.SharedElementCallback r1 = r1.getEnterTransitionCallback()
            androidx.fragment.app.Fragment r2 = r36.getFragment()
            androidx.core.app.SharedElementCallback r2 = r2.getExitTransitionCallback()
        L138:
            int r14 = r0.size()
            r9 = 0
        L13d:
            if (r9 >= r14) goto L15b
            java.lang.Object r19 = r0.get(r9)
            r22 = r14
            r14 = r19
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r19 = r11.get(r9)
            r8 = r19
            java.lang.String r8 = (java.lang.String) r8
            r3.put(r14, r8)
            int r9 = r9 + 1
            r8 = r35
            r14 = r22
            goto L13d
        L15b:
            androidx.collection.ArrayMap r8 = new androidx.collection.ArrayMap
            r8.<init>()
            androidx.fragment.app.Fragment r9 = r35.getFragment()
            android.view.View r9 = r9.mView
            r6.findNamedViews(r8, r9)
            r8.retainAll(r0)
            if (r1 == 0) goto L1ae
            r1.onMapSharedElements(r0, r8)
            int r1 = r0.size()
            r9 = 1
            int r1 = r1 - r9
        L177:
            if (r1 < 0) goto L1ab
            java.lang.Object r9 = r0.get(r1)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r14 = r8.get(r9)
            android.view.View r14 = (android.view.View) r14
            if (r14 != 0) goto L18d
            r3.remove(r9)
            r19 = r0
            goto L1a6
        L18d:
            r19 = r0
            java.lang.String r0 = androidx.core.view.ViewCompat.getTransitionName(r14)
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L1a6
            java.lang.Object r0 = r3.remove(r9)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r9 = androidx.core.view.ViewCompat.getTransitionName(r14)
            r3.put(r9, r0)
        L1a6:
            int r1 = r1 + (-1)
            r0 = r19
            goto L177
        L1ab:
            r19 = r0
            goto L1b7
        L1ae:
            r19 = r0
            java.util.Set r0 = r8.keySet()
            r3.retainAll(r0)
        L1b7:
            androidx.collection.ArrayMap r9 = new androidx.collection.ArrayMap
            r9.<init>()
            androidx.fragment.app.Fragment r0 = r36.getFragment()
            android.view.View r0 = r0.mView
            r6.findNamedViews(r9, r0)
            r9.retainAll(r11)
            java.util.Collection r0 = r3.values()
            r9.retainAll(r0)
            if (r2 == 0) goto L20e
            r2.onMapSharedElements(r11, r9)
            int r0 = r11.size()
            r1 = 1
            int r0 = r0 - r1
        L1da:
            if (r0 < 0) goto L211
            java.lang.Object r1 = r11.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r9.get(r1)
            android.view.View r2 = (android.view.View) r2
            if (r2 != 0) goto L1f4
            java.lang.String r1 = androidx.fragment.app.FragmentTransition.findKeyForValue(r3, r1)
            if (r1 == 0) goto L20b
            r3.remove(r1)
            goto L20b
        L1f4:
            java.lang.String r14 = androidx.core.view.ViewCompat.getTransitionName(r2)
            boolean r14 = r1.equals(r14)
            if (r14 != 0) goto L20b
            java.lang.String r1 = androidx.fragment.app.FragmentTransition.findKeyForValue(r3, r1)
            if (r1 == 0) goto L20b
            java.lang.String r2 = androidx.core.view.ViewCompat.getTransitionName(r2)
            r3.put(r1, r2)
        L20b:
            int r0 = r0 + (-1)
            goto L1da
        L20e:
            androidx.fragment.app.FragmentTransition.retainValues(r3, r9)
        L211:
            java.util.Set r0 = r3.keySet()
            r6.retainMatchingViews(r8, r0)
            java.util.Collection r0 = r3.values()
            r6.retainMatchingViews(r9, r0)
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L241
            r5.clear()
            r4.clear()
            r24 = r3
            r9 = r4
            r4 = r12
            r8 = r13
            r11 = r15
            r2 = r18
            r0 = 0
            r1 = 0
            r3 = r36
            r15 = r10
            r10 = r35
            r30 = r6
            r6 = r5
            r5 = r30
            goto L309
        L241:
            androidx.fragment.app.Fragment r0 = r36.getFragment()
            androidx.fragment.app.Fragment r1 = r35.getFragment()
            r2 = 1
            androidx.fragment.app.FragmentTransition.callSharedElementStartEnd(r0, r1, r7, r8, r2)
            android.view.ViewGroup r14 = r31.getContainer()
            androidx.fragment.app.DefaultSpecialEffectsController$6 r2 = new androidx.fragment.app.DefaultSpecialEffectsController$6
            r1 = r19
            r0 = r2
            r7 = r16
            r1 = r31
            r22 = r10
            r23 = r18
            r10 = r2
            r2 = r36
            r24 = r3
            r3 = r35
            r16 = r13
            r13 = r4
            r4 = r34
            r6 = r5
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.core.view.OneShotPreDrawListener.add(r14, r10)
            java.util.Collection r0 = r8.values()
            r6.addAll(r0)
            boolean r0 = r19.isEmpty()
            if (r0 != 0) goto L293
            r0 = r19
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r8.get(r0)
            android.view.View r0 = (android.view.View) r0
            r15.setEpicenter(r7, r0)
            r2 = r0
            goto L296
        L293:
            r1 = 0
            r2 = r23
        L296:
            java.util.Collection r0 = r9.values()
            r13.addAll(r0)
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L2c4
            java.lang.Object r0 = r11.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r9.get(r0)
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L2c4
            android.view.ViewGroup r3 = r31.getContainer()
            androidx.fragment.app.DefaultSpecialEffectsController$7 r4 = new androidx.fragment.app.DefaultSpecialEffectsController$7
            r5 = r31
            r4.<init>(r5, r15, r0, r12)
            androidx.core.view.OneShotPreDrawListener.add(r3, r4)
            r0 = r16
            r21 = 1
            goto L2c8
        L2c4:
            r5 = r31
            r0 = r16
        L2c8:
            r15.setSharedElementTargets(r7, r0, r6)
            r14 = 0
            r3 = 0
            r16 = 0
            r17 = 0
            r4 = r12
            r12 = r15
            r8 = r0
            r9 = r13
            r13 = r7
            r11 = r15
            r15 = r3
            r18 = r7
            r19 = r9
            r12.scheduleRemoveTargets(r13, r14, r15, r16, r17, r18, r19)
            r0 = 1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            r10 = r35
            r15 = r22
            r15.put(r10, r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3 = r36
            r15.put(r3, r0)
            r0 = r7
            goto L309
        L2f6:
            r23 = r2
            r24 = r3
            r3 = r9
            r1 = r14
            r11 = r15
            r9 = r4
            r15 = r10
            r4 = r12
            r10 = r8
            r8 = r13
            r30 = r6
            r6 = r5
            r5 = r30
            r2 = r23
        L309:
            r7 = r34
            r14 = r1
            r12 = r4
            r13 = r8
            r4 = r9
            r8 = r10
            r10 = r15
            r9 = r3
            r15 = r11
            r3 = r24
            r30 = r6
            r6 = r5
            r5 = r30
            goto Laf
        L31c:
            r23 = r2
            r24 = r3
            r3 = r9
            r1 = r14
            r11 = r15
            r9 = r4
            r15 = r10
            r4 = r12
            r10 = r8
            r8 = r13
            r30 = r6
            r6 = r5
            r5 = r30
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r7 = r32.iterator()
            r13 = 0
            r14 = 0
        L338:
            boolean r12 = r7.hasNext()
            if (r12 == 0) goto L465
            java.lang.Object r12 = r7.next()
            r20 = r12
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r20 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r20
            boolean r12 = r20.isVisibilityUnchanged()
            if (r12 == 0) goto L35f
            androidx.fragment.app.SpecialEffectsController$Operation r12 = r20.getOperation()
            r34 = r7
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r1)
            r15.put(r12, r7)
            r20.completeSpecialEffect()
        L35c:
            r7 = r34
            goto L338
        L35f:
            r34 = r7
            java.lang.Object r7 = r20.getTransition()
            java.lang.Object r7 = r11.cloneTransition(r7)
            androidx.fragment.app.SpecialEffectsController$Operation r12 = r20.getOperation()
            if (r0 == 0) goto L376
            if (r12 == r10) goto L373
            if (r12 != r3) goto L376
        L373:
            r16 = 1
            goto L378
        L376:
            r16 = r1
        L378:
            if (r7 != 0) goto L397
            if (r16 != 0) goto L386
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r1)
            r15.put(r12, r7)
            r20.completeSpecialEffect()
        L386:
            r12 = r33
            r28 = r6
            r26 = r8
            r29 = r9
            r7 = r13
            r6 = r14
            r9 = r15
            r1 = r23
            r13 = 0
            r14 = 1
            goto L457
        L397:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r17 = r13
            androidx.fragment.app.Fragment r13 = r12.getFragment()
            android.view.View r13 = r13.mView
            r5.captureTransitioningViews(r1, r13)
            if (r16 == 0) goto L3b2
            if (r12 != r10) goto L3af
            r1.removeAll(r6)
            goto L3b2
        L3af:
            r1.removeAll(r9)
        L3b2:
            boolean r13 = r1.isEmpty()
            if (r13 == 0) goto L3c9
            r11.addTarget(r7, r8)
            r28 = r6
            r26 = r8
            r29 = r9
            r13 = r12
            r6 = r14
            r9 = r15
            r8 = r17
            r12 = r33
            goto L425
        L3c9:
            r11.addTargets(r7, r1)
            r16 = 0
            r18 = 0
            r19 = 0
            r25 = 0
            r13 = r12
            r12 = r11
            r26 = r8
            r27 = r13
            r8 = r17
            r13 = r7
            r28 = r6
            r6 = r14
            r14 = r7
            r29 = r9
            r9 = r15
            r15 = r1
            r17 = r18
            r18 = r19
            r19 = r25
            r12.scheduleRemoveTargets(r13, r14, r15, r16, r17, r18, r19)
            androidx.fragment.app.SpecialEffectsController$Operation$State r12 = r27.getFinalState()
            androidx.fragment.app.SpecialEffectsController$Operation$State r13 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE
            if (r12 != r13) goto L421
            r12 = r33
            r13 = r27
            r12.remove(r13)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>(r1)
            androidx.fragment.app.Fragment r15 = r13.getFragment()
            android.view.View r15 = r15.mView
            r14.remove(r15)
            androidx.fragment.app.Fragment r15 = r13.getFragment()
            android.view.View r15 = r15.mView
            r11.scheduleHideFragmentView(r7, r15, r14)
            android.view.ViewGroup r14 = r31.getContainer()
            androidx.fragment.app.DefaultSpecialEffectsController$8 r15 = new androidx.fragment.app.DefaultSpecialEffectsController$8
            r15.<init>(r5, r1)
            androidx.core.view.OneShotPreDrawListener.add(r14, r15)
            goto L425
        L421:
            r12 = r33
            r13 = r27
        L425:
            androidx.fragment.app.SpecialEffectsController$Operation$State r14 = r13.getFinalState()
            androidx.fragment.app.SpecialEffectsController$Operation$State r15 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
            if (r14 != r15) goto L438
            r2.addAll(r1)
            if (r21 == 0) goto L435
            r11.setEpicenter(r7, r4)
        L435:
            r1 = r23
            goto L43d
        L438:
            r1 = r23
            r11.setEpicenter(r7, r1)
        L43d:
            r14 = 1
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r14)
            r9.put(r13, r15)
            boolean r13 = r20.isOverlapAllowed()
            if (r13 == 0) goto L452
            r13 = 0
            java.lang.Object r6 = r11.mergeTransitionsTogether(r6, r7, r13)
            r7 = r8
            goto L457
        L452:
            r13 = 0
            java.lang.Object r7 = r11.mergeTransitionsTogether(r8, r7, r13)
        L457:
            r23 = r1
            r14 = r6
            r13 = r7
            r15 = r9
            r8 = r26
            r6 = r28
            r9 = r29
            r1 = 0
            goto L35c
        L465:
            r28 = r6
            r29 = r9
            r8 = r13
            r6 = r14
            r9 = r15
            r14 = 1
            java.lang.Object r1 = r11.mergeTransitionsInSequence(r6, r8, r0)
            java.util.Iterator r4 = r32.iterator()
        L475:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L4e9
            java.lang.Object r6 = r4.next()
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r6 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r6
            boolean r7 = r6.isVisibilityUnchanged()
            if (r7 == 0) goto L488
            goto L475
        L488:
            java.lang.Object r7 = r6.getTransition()
            androidx.fragment.app.SpecialEffectsController$Operation r8 = r6.getOperation()
            if (r0 == 0) goto L498
            if (r8 == r10) goto L496
            if (r8 != r3) goto L498
        L496:
            r12 = r14
            goto L499
        L498:
            r12 = 0
        L499:
            if (r7 != 0) goto L49d
            if (r12 == 0) goto L475
        L49d:
            android.view.ViewGroup r7 = r31.getContainer()
            boolean r7 = androidx.core.view.ViewCompat.isLaidOut(r7)
            if (r7 != 0) goto L4d4
            r7 = 2
            boolean r7 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r7)
            if (r7 == 0) goto L4d0
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r12 = "SpecialEffectsController: Container "
            r7.<init>(r12)
            android.view.ViewGroup r12 = r31.getContainer()
            java.lang.StringBuilder r7 = r7.append(r12)
            java.lang.String r12 = " has not been laid out. Completing operation "
            java.lang.StringBuilder r7 = r7.append(r12)
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "FragmentManager"
            android.util.Log.v(r8, r7)
        L4d0:
            r6.completeSpecialEffect()
            goto L475
        L4d4:
            androidx.fragment.app.SpecialEffectsController$Operation r7 = r6.getOperation()
            androidx.fragment.app.Fragment r7 = r7.getFragment()
            androidx.core.os.CancellationSignal r8 = r6.getSignal()
            androidx.fragment.app.DefaultSpecialEffectsController$9 r12 = new androidx.fragment.app.DefaultSpecialEffectsController$9
            r12.<init>(r5, r6)
            r11.setListenerForTransitionEnd(r7, r1, r8, r12)
            goto L475
        L4e9:
            android.view.ViewGroup r3 = r31.getContainer()
            boolean r3 = androidx.core.view.ViewCompat.isLaidOut(r3)
            if (r3 != 0) goto L4f4
            return r9
        L4f4:
            r3 = 4
            androidx.fragment.app.FragmentTransition.setViewVisibility(r2, r3)
            r3 = r29
            java.util.ArrayList r16 = r11.prepareSetNameOverridesReordered(r3)
            android.view.ViewGroup r4 = r31.getContainer()
            r11.beginDelayedTransition(r4, r1)
            android.view.ViewGroup r13 = r31.getContainer()
            r12 = r11
            r14 = r28
            r15 = r3
            r17 = r24
            r12.setNameOverridesReordered(r13, r14, r15, r16, r17)
            r1 = 0
            androidx.fragment.app.FragmentTransition.setViewVisibility(r2, r1)
            r1 = r28
            r11.swapSharedElementTargets(r0, r1, r3)
            return r9
    }

    void applyContainerChanges(androidx.fragment.app.SpecialEffectsController.Operation r2) {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r2.getFragment()
            android.view.View r0 = r0.mView
            androidx.fragment.app.SpecialEffectsController$Operation$State r2 = r2.getFinalState()
            r2.applyState(r0)
            return
    }

    void captureTransitioningViews(java.util.ArrayList<android.view.View> r5, android.view.View r6) {
            r4 = this;
            boolean r0 = r6 instanceof android.view.ViewGroup
            if (r0 == 0) goto L2e
            r0 = r6
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            boolean r1 = androidx.core.view.ViewGroupCompat.isTransitionGroup(r0)
            if (r1 == 0) goto L17
            boolean r6 = r5.contains(r6)
            if (r6 != 0) goto L37
            r5.add(r0)
            goto L37
        L17:
            int r6 = r0.getChildCount()
            r1 = 0
        L1c:
            if (r1 >= r6) goto L37
            android.view.View r2 = r0.getChildAt(r1)
            int r3 = r2.getVisibility()
            if (r3 != 0) goto L2b
            r4.captureTransitioningViews(r5, r2)
        L2b:
            int r1 = r1 + 1
            goto L1c
        L2e:
            boolean r0 = r5.contains(r6)
            if (r0 != 0) goto L37
            r5.add(r6)
        L37:
            return
    }

    @Override // androidx.fragment.app.SpecialEffectsController
    void executeOperations(java.util.List<androidx.fragment.app.SpecialEffectsController.Operation> r11, boolean r12) {
            r10 = this;
            java.util.Iterator r0 = r11.iterator()
            r1 = 0
            r6 = r1
            r7 = r6
        L7:
            boolean r1 = r0.hasNext()
            r8 = 1
            if (r1 == 0) goto L44
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.SpecialEffectsController$Operation r1 = (androidx.fragment.app.SpecialEffectsController.Operation) r1
            androidx.fragment.app.Fragment r2 = r1.getFragment()
            android.view.View r2 = r2.mView
            androidx.fragment.app.SpecialEffectsController$Operation$State r2 = androidx.fragment.app.SpecialEffectsController.Operation.State.from(r2)
            int[] r3 = androidx.fragment.app.DefaultSpecialEffectsController.C025510.f75xe493b431
            androidx.fragment.app.SpecialEffectsController$Operation$State r4 = r1.getFinalState()
            int r4 = r4.ordinal()
            r3 = r3[r4]
            if (r3 == r8) goto L3c
            r4 = 2
            if (r3 == r4) goto L3c
            r4 = 3
            if (r3 == r4) goto L3c
            r4 = 4
            if (r3 == r4) goto L36
            goto L7
        L36:
            androidx.fragment.app.SpecialEffectsController$Operation$State r3 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
            if (r2 == r3) goto L7
            r7 = r1
            goto L7
        L3c:
            androidx.fragment.app.SpecialEffectsController$Operation$State r3 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
            if (r2 != r3) goto L7
            if (r6 != 0) goto L7
            r6 = r1
            goto L7
        L44:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r11)
            java.util.Iterator r11 = r11.iterator()
        L57:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L95
            java.lang.Object r2 = r11.next()
            androidx.fragment.app.SpecialEffectsController$Operation r2 = (androidx.fragment.app.SpecialEffectsController.Operation) r2
            androidx.core.os.CancellationSignal r4 = new androidx.core.os.CancellationSignal
            r4.<init>()
            r2.markStartedSpecialEffect(r4)
            androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r5 = new androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo
            r5.<init>(r2, r4, r12)
            r0.add(r5)
            androidx.core.os.CancellationSignal r4 = new androidx.core.os.CancellationSignal
            r4.<init>()
            r2.markStartedSpecialEffect(r4)
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r5 = new androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo
            r9 = 0
            if (r12 == 0) goto L83
            if (r2 != r6) goto L86
            goto L85
        L83:
            if (r2 != r7) goto L86
        L85:
            r9 = r8
        L86:
            r5.<init>(r2, r4, r12, r9)
            r3.add(r5)
            androidx.fragment.app.DefaultSpecialEffectsController$1 r4 = new androidx.fragment.app.DefaultSpecialEffectsController$1
            r4.<init>(r10, r1, r2)
            r2.addCompletionListener(r4)
            goto L57
        L95:
            r2 = r10
            r4 = r1
            r5 = r12
            java.util.Map r11 = r2.startTransitions(r3, r4, r5, r6, r7)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r8)
            boolean r12 = r11.containsValue(r12)
            r10.startAnimations(r0, r1, r12, r11)
            java.util.Iterator r11 = r1.iterator()
        Lab:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto Lbb
            java.lang.Object r12 = r11.next()
            androidx.fragment.app.SpecialEffectsController$Operation r12 = (androidx.fragment.app.SpecialEffectsController.Operation) r12
            r10.applyContainerChanges(r12)
            goto Lab
        Lbb:
            r1.clear()
            return
    }

    void findNamedViews(java.util.Map<java.lang.String, android.view.View> r5, android.view.View r6) {
            r4 = this;
            java.lang.String r0 = androidx.core.view.ViewCompat.getTransitionName(r6)
            if (r0 == 0) goto L9
            r5.put(r0, r6)
        L9:
            boolean r0 = r6 instanceof android.view.ViewGroup
            if (r0 == 0) goto L26
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            int r0 = r6.getChildCount()
            r1 = 0
        L14:
            if (r1 >= r0) goto L26
            android.view.View r2 = r6.getChildAt(r1)
            int r3 = r2.getVisibility()
            if (r3 != 0) goto L23
            r4.findNamedViews(r5, r2)
        L23:
            int r1 = r1 + 1
            goto L14
        L26:
            return
    }

    void retainMatchingViews(androidx.collection.ArrayMap<java.lang.String, android.view.View> r2, java.util.Collection<java.lang.String> r3) {
            r1 = this;
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L28
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            java.lang.String r0 = androidx.core.view.ViewCompat.getTransitionName(r0)
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L8
            r2.remove()
            goto L8
        L28:
            return
    }
}
