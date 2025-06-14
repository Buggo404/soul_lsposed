package androidx.fragment.app;

/* loaded from: classes.dex */
class FragmentTransition {
    private static final int[] INVERSE_OPS = null;
    static final androidx.fragment.app.FragmentTransitionImpl PLATFORM_IMPL = null;
    static final androidx.fragment.app.FragmentTransitionImpl SUPPORT_IMPL = null;







    interface Callback {
        void onComplete(androidx.fragment.app.Fragment r1, androidx.core.os.CancellationSignal r2);

        void onStart(androidx.fragment.app.Fragment r1, androidx.core.os.CancellationSignal r2);
    }

    static class FragmentContainerTransition {
        public androidx.fragment.app.Fragment firstOut;
        public boolean firstOutIsPop;
        public androidx.fragment.app.BackStackRecord firstOutTransaction;
        public androidx.fragment.app.Fragment lastIn;
        public boolean lastInIsPop;
        public androidx.fragment.app.BackStackRecord lastInTransaction;

        FragmentContainerTransition() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            r0 = 11
            int[] r0 = new int[r0]
            r0 = {x0018: FILL_ARRAY_DATA , data: [0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10} // fill-array
            androidx.fragment.app.FragmentTransition.INVERSE_OPS = r0
            androidx.fragment.app.FragmentTransitionCompat21 r0 = new androidx.fragment.app.FragmentTransitionCompat21
            r0.<init>()
            androidx.fragment.app.FragmentTransition.PLATFORM_IMPL = r0
            androidx.fragment.app.FragmentTransitionImpl r0 = resolveSupportImpl()
            androidx.fragment.app.FragmentTransition.SUPPORT_IMPL = r0
            return
    }

    private FragmentTransition() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void addSharedElementsWithMatchingNames(java.util.ArrayList<android.view.View> r3, androidx.collection.ArrayMap<java.lang.String, android.view.View> r4, java.util.Collection<java.lang.String> r5) {
            int r0 = r4.size()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L1e
            java.lang.Object r1 = r4.valueAt(r0)
            android.view.View r1 = (android.view.View) r1
            java.lang.String r2 = androidx.core.view.ViewCompat.getTransitionName(r1)
            boolean r2 = r5.contains(r2)
            if (r2 == 0) goto L1b
            r3.add(r1)
        L1b:
            int r0 = r0 + (-1)
            goto L6
        L1e:
            return
    }

    private static void addToFirstInLastOut(androidx.fragment.app.BackStackRecord r8, androidx.fragment.app.FragmentTransaction.C0303Op r9, android.util.SparseArray<androidx.fragment.app.FragmentTransition.FragmentContainerTransition> r10, boolean r11, boolean r12) {
            androidx.fragment.app.Fragment r0 = r9.mFragment
            if (r0 != 0) goto L5
            return
        L5:
            int r1 = r0.mContainerId
            if (r1 != 0) goto La
            return
        La:
            if (r11 == 0) goto L13
            int[] r2 = androidx.fragment.app.FragmentTransition.INVERSE_OPS
            int r9 = r9.mCmd
            r9 = r2[r9]
            goto L15
        L13:
            int r9 = r9.mCmd
        L15:
            r2 = 0
            r3 = 1
            if (r9 == r3) goto L82
            r4 = 3
            if (r9 == r4) goto L58
            r4 = 4
            if (r9 == r4) goto L40
            r4 = 5
            if (r9 == r4) goto L2d
            r4 = 6
            if (r9 == r4) goto L58
            r4 = 7
            if (r9 == r4) goto L82
            r9 = r2
            r3 = r9
            r4 = r3
            goto L95
        L2d:
            if (r12 == 0) goto L3c
            boolean r9 = r0.mHiddenChanged
            if (r9 == 0) goto L91
            boolean r9 = r0.mHidden
            if (r9 != 0) goto L91
            boolean r9 = r0.mAdded
            if (r9 == 0) goto L91
            goto L8f
        L3c:
            boolean r9 = r0.mHidden
            goto L92
        L40:
            if (r12 == 0) goto L4f
            boolean r9 = r0.mHiddenChanged
            if (r9 == 0) goto L73
            boolean r9 = r0.mAdded
            if (r9 == 0) goto L73
            boolean r9 = r0.mHidden
            if (r9 == 0) goto L73
        L4e:
            goto L71
        L4f:
            boolean r9 = r0.mAdded
            if (r9 == 0) goto L73
            boolean r9 = r0.mHidden
            if (r9 != 0) goto L73
            goto L4e
        L58:
            if (r12 == 0) goto L75
            boolean r9 = r0.mAdded
            if (r9 != 0) goto L73
            android.view.View r9 = r0.mView
            if (r9 == 0) goto L73
            android.view.View r9 = r0.mView
            int r9 = r9.getVisibility()
            if (r9 != 0) goto L73
            float r9 = r0.mPostponedAlpha
            r4 = 0
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 < 0) goto L73
        L71:
            r9 = r3
            goto L7e
        L73:
            r9 = r2
            goto L7e
        L75:
            boolean r9 = r0.mAdded
            if (r9 == 0) goto L73
            boolean r9 = r0.mHidden
            if (r9 != 0) goto L73
            goto L71
        L7e:
            r4 = r9
            r9 = r3
            r3 = r2
            goto L95
        L82:
            if (r12 == 0) goto L87
            boolean r9 = r0.mIsNewlyAdded
            goto L92
        L87:
            boolean r9 = r0.mAdded
            if (r9 != 0) goto L91
            boolean r9 = r0.mHidden
            if (r9 != 0) goto L91
        L8f:
            r9 = r3
            goto L92
        L91:
            r9 = r2
        L92:
            r4 = r2
            r2 = r9
            r9 = r4
        L95:
            java.lang.Object r5 = r10.get(r1)
            androidx.fragment.app.FragmentTransition$FragmentContainerTransition r5 = (androidx.fragment.app.FragmentTransition.FragmentContainerTransition) r5
            if (r2 == 0) goto La7
            androidx.fragment.app.FragmentTransition$FragmentContainerTransition r5 = ensureContainer(r5, r10, r1)
            r5.lastIn = r0
            r5.lastInIsPop = r11
            r5.lastInTransaction = r8
        La7:
            r2 = 0
            if (r12 != 0) goto Lc8
            if (r3 == 0) goto Lc8
            if (r5 == 0) goto Lb4
            androidx.fragment.app.Fragment r3 = r5.firstOut
            if (r3 != r0) goto Lb4
            r5.firstOut = r2
        Lb4:
            boolean r3 = r8.mReorderingAllowed
            if (r3 != 0) goto Lc8
            androidx.fragment.app.FragmentManager r3 = r8.mManager
            androidx.fragment.app.FragmentStateManager r6 = r3.createOrGetFragmentStateManager(r0)
            androidx.fragment.app.FragmentStore r7 = r3.getFragmentStore()
            r7.makeActive(r6)
            r3.moveToState(r0)
        Lc8:
            if (r4 == 0) goto Lda
            if (r5 == 0) goto Ld0
            androidx.fragment.app.Fragment r3 = r5.firstOut
            if (r3 != 0) goto Lda
        Ld0:
            androidx.fragment.app.FragmentTransition$FragmentContainerTransition r5 = ensureContainer(r5, r10, r1)
            r5.firstOut = r0
            r5.firstOutIsPop = r11
            r5.firstOutTransaction = r8
        Lda:
            if (r12 != 0) goto Le6
            if (r9 == 0) goto Le6
            if (r5 == 0) goto Le6
            androidx.fragment.app.Fragment r8 = r5.lastIn
            if (r8 != r0) goto Le6
            r5.lastIn = r2
        Le6:
            return
    }

    public static void calculateFragments(androidx.fragment.app.BackStackRecord r4, android.util.SparseArray<androidx.fragment.app.FragmentTransition.FragmentContainerTransition> r5, boolean r6) {
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r0 = r4.mOps
            int r0 = r0.size()
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L18
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r3 = r4.mOps
            java.lang.Object r3 = r3.get(r2)
            androidx.fragment.app.FragmentTransaction$Op r3 = (androidx.fragment.app.FragmentTransaction.C0303Op) r3
            addToFirstInLastOut(r4, r3, r5, r1, r6)
            int r2 = r2 + 1
            goto L8
        L18:
            return
    }

    private static androidx.collection.ArrayMap<java.lang.String, java.lang.String> calculateNameOverrides(int r9, java.util.ArrayList<androidx.fragment.app.BackStackRecord> r10, java.util.ArrayList<java.lang.Boolean> r11, int r12, int r13) {
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            int r13 = r13 + (-1)
        L7:
            if (r13 < r12) goto L5c
            java.lang.Object r1 = r10.get(r13)
            androidx.fragment.app.BackStackRecord r1 = (androidx.fragment.app.BackStackRecord) r1
            boolean r2 = r1.interactsWith(r9)
            if (r2 != 0) goto L16
            goto L59
        L16:
            java.lang.Object r2 = r11.get(r13)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            java.util.ArrayList<java.lang.String> r3 = r1.mSharedElementSourceNames
            if (r3 == 0) goto L59
            java.util.ArrayList<java.lang.String> r3 = r1.mSharedElementSourceNames
            int r3 = r3.size()
            if (r2 == 0) goto L31
            java.util.ArrayList<java.lang.String> r2 = r1.mSharedElementSourceNames
            java.util.ArrayList<java.lang.String> r1 = r1.mSharedElementTargetNames
            goto L38
        L31:
            java.util.ArrayList<java.lang.String> r2 = r1.mSharedElementSourceNames
            java.util.ArrayList<java.lang.String> r1 = r1.mSharedElementTargetNames
            r8 = r2
            r2 = r1
            r1 = r8
        L38:
            r4 = 0
        L39:
            if (r4 >= r3) goto L59
            java.lang.Object r5 = r1.get(r4)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r2.get(r4)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r0.remove(r6)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L53
            r0.put(r5, r7)
            goto L56
        L53:
            r0.put(r5, r6)
        L56:
            int r4 = r4 + 1
            goto L39
        L59:
            int r13 = r13 + (-1)
            goto L7
        L5c:
            return r0
    }

    public static void calculatePopFragments(androidx.fragment.app.BackStackRecord r3, android.util.SparseArray<androidx.fragment.app.FragmentTransition.FragmentContainerTransition> r4, boolean r5) {
            androidx.fragment.app.FragmentManager r0 = r3.mManager
            androidx.fragment.app.FragmentContainer r0 = r0.getContainer()
            boolean r0 = r0.onHasView()
            if (r0 != 0) goto Ld
            return
        Ld:
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r0 = r3.mOps
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L15:
            if (r0 < 0) goto L25
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r2 = r3.mOps
            java.lang.Object r2 = r2.get(r0)
            androidx.fragment.app.FragmentTransaction$Op r2 = (androidx.fragment.app.FragmentTransaction.C0303Op) r2
            addToFirstInLastOut(r3, r2, r4, r1, r5)
            int r0 = r0 + (-1)
            goto L15
        L25:
            return
    }

    static void callSharedElementStartEnd(androidx.fragment.app.Fragment r3, androidx.fragment.app.Fragment r4, boolean r5, androidx.collection.ArrayMap<java.lang.String, android.view.View> r6, boolean r7) {
            if (r5 == 0) goto L7
            androidx.core.app.SharedElementCallback r3 = r4.getEnterTransitionCallback()
            goto Lb
        L7:
            androidx.core.app.SharedElementCallback r3 = r3.getEnterTransitionCallback()
        Lb:
            if (r3 == 0) goto L3d
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r0 = 0
            if (r6 != 0) goto L1c
            r1 = r0
            goto L20
        L1c:
            int r1 = r6.size()
        L20:
            if (r0 >= r1) goto L33
            java.lang.Object r2 = r6.keyAt(r0)
            r5.add(r2)
            java.lang.Object r2 = r6.valueAt(r0)
            r4.add(r2)
            int r0 = r0 + 1
            goto L20
        L33:
            r6 = 0
            if (r7 == 0) goto L3a
            r3.onSharedElementStart(r5, r4, r6)
            goto L3d
        L3a:
            r3.onSharedElementEnd(r5, r4, r6)
        L3d:
            return
    }

    private static boolean canHandleAll(androidx.fragment.app.FragmentTransitionImpl r4, java.util.List<java.lang.Object> r5) {
            int r0 = r5.size()
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r0) goto L16
            java.lang.Object r3 = r5.get(r2)
            boolean r3 = r4.canHandle(r3)
            if (r3 != 0) goto L13
            return r1
        L13:
            int r2 = r2 + 1
            goto L6
        L16:
            r4 = 1
            return r4
    }

    static androidx.collection.ArrayMap<java.lang.String, android.view.View> captureInSharedElements(androidx.fragment.app.FragmentTransitionImpl r3, androidx.collection.ArrayMap<java.lang.String, java.lang.String> r4, java.lang.Object r5, androidx.fragment.app.FragmentTransition.FragmentContainerTransition r6) {
            androidx.fragment.app.Fragment r0 = r6.lastIn
            android.view.View r1 = r0.getView()
            boolean r2 = r4.isEmpty()
            if (r2 != 0) goto L7b
            if (r5 == 0) goto L7b
            if (r1 != 0) goto L11
            goto L7b
        L11:
            androidx.collection.ArrayMap r5 = new androidx.collection.ArrayMap
            r5.<init>()
            r3.findNamedViews(r5, r1)
            androidx.fragment.app.BackStackRecord r3 = r6.lastInTransaction
            boolean r6 = r6.lastInIsPop
            if (r6 == 0) goto L26
            androidx.core.app.SharedElementCallback r6 = r0.getExitTransitionCallback()
            java.util.ArrayList<java.lang.String> r3 = r3.mSharedElementSourceNames
            goto L2c
        L26:
            androidx.core.app.SharedElementCallback r6 = r0.getEnterTransitionCallback()
            java.util.ArrayList<java.lang.String> r3 = r3.mSharedElementTargetNames
        L2c:
            if (r3 == 0) goto L38
            r5.retainAll(r3)
            java.util.Collection r0 = r4.values()
            r5.retainAll(r0)
        L38:
            if (r6 == 0) goto L77
            r6.onMapSharedElements(r3, r5)
            int r6 = r3.size()
            int r6 = r6 + (-1)
        L43:
            if (r6 < 0) goto L7a
            java.lang.Object r0 = r3.get(r6)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r5.get(r0)
            android.view.View r1 = (android.view.View) r1
            if (r1 != 0) goto L5d
            java.lang.String r0 = findKeyForValue(r4, r0)
            if (r0 == 0) goto L74
            r4.remove(r0)
            goto L74
        L5d:
            java.lang.String r2 = androidx.core.view.ViewCompat.getTransitionName(r1)
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L74
            java.lang.String r0 = findKeyForValue(r4, r0)
            if (r0 == 0) goto L74
            java.lang.String r1 = androidx.core.view.ViewCompat.getTransitionName(r1)
            r4.put(r0, r1)
        L74:
            int r6 = r6 + (-1)
            goto L43
        L77:
            retainValues(r4, r5)
        L7a:
            return r5
        L7b:
            r4.clear()
            r3 = 0
            return r3
    }

    private static androidx.collection.ArrayMap<java.lang.String, android.view.View> captureOutSharedElements(androidx.fragment.app.FragmentTransitionImpl r3, androidx.collection.ArrayMap<java.lang.String, java.lang.String> r4, java.lang.Object r5, androidx.fragment.app.FragmentTransition.FragmentContainerTransition r6) {
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L70
            if (r5 != 0) goto L9
            goto L70
        L9:
            androidx.fragment.app.Fragment r5 = r6.firstOut
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            android.view.View r1 = r5.requireView()
            r3.findNamedViews(r0, r1)
            androidx.fragment.app.BackStackRecord r3 = r6.firstOutTransaction
            boolean r6 = r6.firstOutIsPop
            if (r6 == 0) goto L24
            androidx.core.app.SharedElementCallback r5 = r5.getEnterTransitionCallback()
            java.util.ArrayList<java.lang.String> r3 = r3.mSharedElementTargetNames
            goto L2a
        L24:
            androidx.core.app.SharedElementCallback r5 = r5.getExitTransitionCallback()
            java.util.ArrayList<java.lang.String> r3 = r3.mSharedElementSourceNames
        L2a:
            if (r3 == 0) goto L2f
            r0.retainAll(r3)
        L2f:
            if (r5 == 0) goto L68
            r5.onMapSharedElements(r3, r0)
            int r5 = r3.size()
            int r5 = r5 + (-1)
        L3a:
            if (r5 < 0) goto L6f
            java.lang.Object r6 = r3.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r1 = r0.get(r6)
            android.view.View r1 = (android.view.View) r1
            if (r1 != 0) goto L4e
            r4.remove(r6)
            goto L65
        L4e:
            java.lang.String r2 = androidx.core.view.ViewCompat.getTransitionName(r1)
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L65
            java.lang.Object r6 = r4.remove(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r1 = androidx.core.view.ViewCompat.getTransitionName(r1)
            r4.put(r1, r6)
        L65:
            int r5 = r5 + (-1)
            goto L3a
        L68:
            java.util.Set r3 = r0.keySet()
            r4.retainAll(r3)
        L6f:
            return r0
        L70:
            r4.clear()
            r3 = 0
            return r3
    }

    private static androidx.fragment.app.FragmentTransitionImpl chooseImpl(androidx.fragment.app.Fragment r2, androidx.fragment.app.Fragment r3) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r2 == 0) goto L22
            java.lang.Object r1 = r2.getExitTransition()
            if (r1 == 0) goto L10
            r0.add(r1)
        L10:
            java.lang.Object r1 = r2.getReturnTransition()
            if (r1 == 0) goto L19
            r0.add(r1)
        L19:
            java.lang.Object r2 = r2.getSharedElementReturnTransition()
            if (r2 == 0) goto L22
            r0.add(r2)
        L22:
            if (r3 == 0) goto L3f
            java.lang.Object r2 = r3.getEnterTransition()
            if (r2 == 0) goto L2d
            r0.add(r2)
        L2d:
            java.lang.Object r2 = r3.getReenterTransition()
            if (r2 == 0) goto L36
            r0.add(r2)
        L36:
            java.lang.Object r2 = r3.getSharedElementEnterTransition()
            if (r2 == 0) goto L3f
            r0.add(r2)
        L3f:
            boolean r2 = r0.isEmpty()
            r3 = 0
            if (r2 == 0) goto L47
            return r3
        L47:
            androidx.fragment.app.FragmentTransitionImpl r2 = androidx.fragment.app.FragmentTransition.PLATFORM_IMPL
            if (r2 == 0) goto L52
            boolean r1 = canHandleAll(r2, r0)
            if (r1 == 0) goto L52
            return r2
        L52:
            androidx.fragment.app.FragmentTransitionImpl r1 = androidx.fragment.app.FragmentTransition.SUPPORT_IMPL
            if (r1 == 0) goto L5d
            boolean r0 = canHandleAll(r1, r0)
            if (r0 == 0) goto L5d
            return r1
        L5d:
            if (r2 != 0) goto L62
            if (r1 != 0) goto L62
            return r3
        L62:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Invalid Transition types"
            r2.<init>(r3)
            throw r2
    }

    static java.util.ArrayList<android.view.View> configureEnteringExitingViews(androidx.fragment.app.FragmentTransitionImpl r1, java.lang.Object r2, androidx.fragment.app.Fragment r3, java.util.ArrayList<android.view.View> r4, android.view.View r5) {
            if (r2 == 0) goto L22
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.view.View r3 = r3.getView()
            if (r3 == 0) goto L10
            r1.captureTransitioningViews(r0, r3)
        L10:
            if (r4 == 0) goto L15
            r0.removeAll(r4)
        L15:
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L23
            r0.add(r5)
            r1.addTargets(r2, r0)
            goto L23
        L22:
            r0 = 0
        L23:
            return r0
    }

    private static java.lang.Object configureSharedElementsOrdered(androidx.fragment.app.FragmentTransitionImpl r17, android.view.ViewGroup r18, android.view.View r19, androidx.collection.ArrayMap<java.lang.String, java.lang.String> r20, androidx.fragment.app.FragmentTransition.FragmentContainerTransition r21, java.util.ArrayList<android.view.View> r22, java.util.ArrayList<android.view.View> r23, java.lang.Object r24, java.lang.Object r25) {
            r6 = r17
            r7 = r21
            r10 = r22
            r11 = r24
            androidx.fragment.app.Fragment r8 = r7.lastIn
            androidx.fragment.app.Fragment r9 = r7.firstOut
            r0 = 0
            if (r8 == 0) goto L87
            if (r9 != 0) goto L13
            goto L87
        L13:
            boolean r12 = r7.lastInIsPop
            boolean r1 = r20.isEmpty()
            if (r1 == 0) goto L1f
            r13 = r20
            r1 = r0
            goto L25
        L1f:
            java.lang.Object r1 = getSharedElementTransition(r6, r8, r9, r12)
            r13 = r20
        L25:
            androidx.collection.ArrayMap r3 = captureOutSharedElements(r6, r13, r1, r7)
            boolean r2 = r20.isEmpty()
            if (r2 == 0) goto L31
            r14 = r0
            goto L39
        L31:
            java.util.Collection r2 = r3.values()
            r10.addAll(r2)
            r14 = r1
        L39:
            if (r11 != 0) goto L40
            if (r25 != 0) goto L40
            if (r14 != 0) goto L40
            return r0
        L40:
            r1 = 1
            callSharedElementStartEnd(r8, r9, r12, r3, r1)
            if (r14 == 0) goto L66
            android.graphics.Rect r15 = new android.graphics.Rect
            r15.<init>()
            r5 = r19
            r6.setSharedElementTargets(r14, r5, r10)
            boolean r4 = r7.firstOutIsPop
            androidx.fragment.app.BackStackRecord r2 = r7.firstOutTransaction
            r0 = r17
            r1 = r14
            r16 = r2
            r2 = r25
            r5 = r16
            setOutEpicenter(r0, r1, r2, r3, r4, r5)
            if (r11 == 0) goto L67
            r6.setEpicenter(r11, r15)
            goto L67
        L66:
            r15 = r0
        L67:
            androidx.fragment.app.FragmentTransition$6 r5 = new androidx.fragment.app.FragmentTransition$6
            r0 = r5
            r1 = r17
            r2 = r20
            r3 = r14
            r4 = r21
            r13 = r5
            r5 = r23
            r6 = r19
            r7 = r8
            r8 = r9
            r9 = r12
            r10 = r22
            r11 = r24
            r12 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = r18
            androidx.core.view.OneShotPreDrawListener.add(r0, r13)
            return r14
        L87:
            return r0
    }

    private static java.lang.Object configureSharedElementsReordered(androidx.fragment.app.FragmentTransitionImpl r15, android.view.ViewGroup r16, android.view.View r17, androidx.collection.ArrayMap<java.lang.String, java.lang.String> r18, androidx.fragment.app.FragmentTransition.FragmentContainerTransition r19, java.util.ArrayList<android.view.View> r20, java.util.ArrayList<android.view.View> r21, java.lang.Object r22, java.lang.Object r23) {
            r6 = r15
            r0 = r17
            r1 = r18
            r7 = r19
            r2 = r20
            r3 = r21
            r8 = r22
            androidx.fragment.app.Fragment r9 = r7.lastIn
            androidx.fragment.app.Fragment r10 = r7.firstOut
            if (r9 == 0) goto L1b
            android.view.View r4 = r9.requireView()
            r5 = 0
            r4.setVisibility(r5)
        L1b:
            r4 = 0
            if (r9 == 0) goto L9c
            if (r10 != 0) goto L22
            goto L9c
        L22:
            boolean r11 = r7.lastInIsPop
            boolean r5 = r18.isEmpty()
            if (r5 == 0) goto L2c
            r5 = r4
            goto L30
        L2c:
            java.lang.Object r5 = getSharedElementTransition(r15, r9, r10, r11)
        L30:
            androidx.collection.ArrayMap r12 = captureOutSharedElements(r15, r1, r5, r7)
            androidx.collection.ArrayMap r13 = captureInSharedElements(r15, r1, r5, r7)
            boolean r14 = r18.isEmpty()
            if (r14 == 0) goto L4a
            if (r12 == 0) goto L43
            r12.clear()
        L43:
            if (r13 == 0) goto L48
            r13.clear()
        L48:
            r14 = r4
            goto L59
        L4a:
            java.util.Set r14 = r18.keySet()
            addSharedElementsWithMatchingNames(r2, r12, r14)
            java.util.Collection r1 = r18.values()
            addSharedElementsWithMatchingNames(r3, r13, r1)
            r14 = r5
        L59:
            if (r8 != 0) goto L60
            if (r23 != 0) goto L60
            if (r14 != 0) goto L60
            return r4
        L60:
            r1 = 1
            callSharedElementStartEnd(r9, r10, r11, r12, r1)
            if (r14 == 0) goto L89
            r3.add(r0)
            r15.setSharedElementTargets(r14, r0, r2)
            boolean r4 = r7.firstOutIsPop
            androidx.fragment.app.BackStackRecord r5 = r7.firstOutTransaction
            r0 = r15
            r1 = r14
            r2 = r23
            r3 = r12
            setOutEpicenter(r0, r1, r2, r3, r4, r5)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.view.View r1 = getInEpicenterView(r13, r7, r8, r11)
            if (r1 == 0) goto L86
            r15.setEpicenter(r8, r0)
        L86:
            r7 = r0
            r5 = r1
            goto L8b
        L89:
            r5 = r4
            r7 = r5
        L8b:
            androidx.fragment.app.FragmentTransition$5 r8 = new androidx.fragment.app.FragmentTransition$5
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r13
            r6 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = r16
            androidx.core.view.OneShotPreDrawListener.add(r0, r8)
            return r14
        L9c:
            return r4
    }

    private static void configureTransitionsOrdered(android.view.ViewGroup r20, androidx.fragment.app.FragmentTransition.FragmentContainerTransition r21, android.view.View r22, androidx.collection.ArrayMap<java.lang.String, java.lang.String> r23, androidx.fragment.app.FragmentTransition.Callback r24) {
            r9 = r20
            r10 = r21
            r11 = r22
            r12 = r23
            r13 = r24
            androidx.fragment.app.Fragment r14 = r10.lastIn
            androidx.fragment.app.Fragment r15 = r10.firstOut
            androidx.fragment.app.FragmentTransitionImpl r8 = chooseImpl(r15, r14)
            if (r8 != 0) goto L15
            return
        L15:
            boolean r0 = r10.lastInIsPop
            boolean r1 = r10.firstOutIsPop
            java.lang.Object r7 = getEnterTransition(r8, r14, r0)
            java.lang.Object r6 = getExitTransition(r8, r15, r1)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0 = r8
            r1 = r20
            r2 = r22
            r3 = r23
            r16 = r4
            r4 = r21
            r17 = r5
            r18 = r6
            r6 = r16
            r19 = r7
            r9 = r8
            r8 = r18
            java.lang.Object r6 = configureSharedElementsOrdered(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r8 = r19
            if (r8 != 0) goto L50
            if (r6 != 0) goto L50
            r0 = r18
            if (r0 != 0) goto L52
            return
        L50:
            r0 = r18
        L52:
            r7 = r17
            java.util.ArrayList r17 = configureEnteringExitingViews(r9, r0, r15, r7, r11)
            if (r17 == 0) goto L60
            boolean r1 = r17.isEmpty()
            if (r1 == 0) goto L61
        L60:
            r0 = 0
        L61:
            r18 = r0
            r9.addTarget(r8, r11)
            boolean r5 = r10.lastInIsPop
            r0 = r9
            r1 = r8
            r2 = r18
            r3 = r6
            r4 = r14
            java.lang.Object r10 = mergeTransitions(r0, r1, r2, r3, r4, r5)
            if (r15 == 0) goto L92
            if (r17 == 0) goto L92
            int r0 = r17.size()
            if (r0 > 0) goto L82
            int r0 = r7.size()
            if (r0 <= 0) goto L92
        L82:
            androidx.core.os.CancellationSignal r0 = new androidx.core.os.CancellationSignal
            r0.<init>()
            r13.onStart(r15, r0)
            androidx.fragment.app.FragmentTransition$3 r1 = new androidx.fragment.app.FragmentTransition$3
            r1.<init>(r13, r15, r0)
            r9.setListenerForTransitionEnd(r15, r10, r0, r1)
        L92:
            if (r10 == 0) goto Lc4
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r0 = r9
            r1 = r10
            r2 = r8
            r3 = r13
            r4 = r18
            r5 = r17
            r7 = r16
            r0.scheduleRemoveTargets(r1, r2, r3, r4, r5, r6, r7)
            r1 = r20
            r2 = r14
            r3 = r22
            r4 = r16
            r5 = r8
            r6 = r13
            r7 = r18
            r8 = r17
            scheduleTargetChange(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = r20
            r1 = r9
            r2 = r16
            r1.setNameOverridesOrdered(r0, r2, r12)
            r1.beginDelayedTransition(r0, r10)
            r1.scheduleNameReset(r0, r2, r12)
        Lc4:
            return
    }

    private static void configureTransitionsReordered(android.view.ViewGroup r17, androidx.fragment.app.FragmentTransition.FragmentContainerTransition r18, android.view.View r19, androidx.collection.ArrayMap<java.lang.String, java.lang.String> r20, androidx.fragment.app.FragmentTransition.Callback r21) {
            r4 = r18
            r9 = r19
            r10 = r21
            androidx.fragment.app.Fragment r11 = r4.lastIn
            androidx.fragment.app.Fragment r12 = r4.firstOut
            androidx.fragment.app.FragmentTransitionImpl r13 = chooseImpl(r12, r11)
            if (r13 != 0) goto L11
            return
        L11:
            boolean r14 = r4.lastInIsPop
            boolean r0 = r4.firstOutIsPop
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.lang.Object r7 = getEnterTransition(r13, r11, r14)
            java.lang.Object r6 = getExitTransition(r13, r12, r0)
            r0 = r13
            r1 = r17
            r2 = r19
            r3 = r20
            r4 = r18
            r5 = r8
            r18 = r6
            r6 = r15
            r16 = r7
            r10 = r8
            r8 = r18
            java.lang.Object r8 = configureSharedElementsReordered(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r6 = r16
            if (r6 != 0) goto L48
            if (r8 != 0) goto L48
            r7 = r18
            if (r7 != 0) goto L4a
            return
        L48:
            r7 = r18
        L4a:
            java.util.ArrayList r5 = configureEnteringExitingViews(r13, r7, r12, r10, r9)
            java.util.ArrayList r9 = configureEnteringExitingViews(r13, r6, r11, r15, r9)
            r0 = 4
            setViewVisibility(r9, r0)
            r0 = r13
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r11
            r11 = r5
            r5 = r14
            java.lang.Object r14 = mergeTransitions(r0, r1, r2, r3, r4, r5)
            if (r12 == 0) goto L83
            if (r11 == 0) goto L83
            int r0 = r11.size()
            if (r0 > 0) goto L71
            int r0 = r10.size()
            if (r0 <= 0) goto L83
        L71:
            androidx.core.os.CancellationSignal r0 = new androidx.core.os.CancellationSignal
            r0.<init>()
            r1 = r21
            r1.onStart(r12, r0)
            androidx.fragment.app.FragmentTransition$1 r2 = new androidx.fragment.app.FragmentTransition$1
            r2.<init>(r1, r12, r0)
            r13.setListenerForTransitionEnd(r12, r14, r0, r2)
        L83:
            if (r14 == 0) goto Lab
            replaceHide(r13, r7, r12, r11)
            java.util.ArrayList r12 = r13.prepareSetNameOverridesReordered(r15)
            r0 = r13
            r1 = r14
            r2 = r6
            r3 = r9
            r4 = r7
            r5 = r11
            r6 = r8
            r7 = r15
            r0.scheduleRemoveTargets(r1, r2, r3, r4, r5, r6, r7)
            r1 = r17
            r13.beginDelayedTransition(r1, r14)
            r2 = r10
            r3 = r15
            r4 = r12
            r5 = r20
            r0.setNameOverridesReordered(r1, r2, r3, r4, r5)
            r0 = 0
            setViewVisibility(r9, r0)
            r13.swapSharedElementTargets(r8, r10, r15)
        Lab:
            return
    }

    private static androidx.fragment.app.FragmentTransition.FragmentContainerTransition ensureContainer(androidx.fragment.app.FragmentTransition.FragmentContainerTransition r0, android.util.SparseArray<androidx.fragment.app.FragmentTransition.FragmentContainerTransition> r1, int r2) {
            if (r0 != 0) goto La
            androidx.fragment.app.FragmentTransition$FragmentContainerTransition r0 = new androidx.fragment.app.FragmentTransition$FragmentContainerTransition
            r0.<init>()
            r1.put(r2, r0)
        La:
            return r0
    }

    static java.lang.String findKeyForValue(androidx.collection.ArrayMap<java.lang.String, java.lang.String> r3, java.lang.String r4) {
            int r0 = r3.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L1b
            java.lang.Object r2 = r3.valueAt(r1)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L18
            java.lang.Object r3 = r3.keyAt(r1)
            java.lang.String r3 = (java.lang.String) r3
            return r3
        L18:
            int r1 = r1 + 1
            goto L5
        L1b:
            r3 = 0
            return r3
    }

    private static java.lang.Object getEnterTransition(androidx.fragment.app.FragmentTransitionImpl r0, androidx.fragment.app.Fragment r1, boolean r2) {
            if (r1 != 0) goto L4
            r0 = 0
            return r0
        L4:
            if (r2 == 0) goto Lb
            java.lang.Object r1 = r1.getReenterTransition()
            goto Lf
        Lb:
            java.lang.Object r1 = r1.getEnterTransition()
        Lf:
            java.lang.Object r0 = r0.cloneTransition(r1)
            return r0
    }

    private static java.lang.Object getExitTransition(androidx.fragment.app.FragmentTransitionImpl r0, androidx.fragment.app.Fragment r1, boolean r2) {
            if (r1 != 0) goto L4
            r0 = 0
            return r0
        L4:
            if (r2 == 0) goto Lb
            java.lang.Object r1 = r1.getReturnTransition()
            goto Lf
        Lb:
            java.lang.Object r1 = r1.getExitTransition()
        Lf:
            java.lang.Object r0 = r0.cloneTransition(r1)
            return r0
    }

    static android.view.View getInEpicenterView(androidx.collection.ArrayMap<java.lang.String, android.view.View> r0, androidx.fragment.app.FragmentTransition.FragmentContainerTransition r1, java.lang.Object r2, boolean r3) {
            androidx.fragment.app.BackStackRecord r1 = r1.lastInTransaction
            if (r2 == 0) goto L2d
            if (r0 == 0) goto L2d
            java.util.ArrayList<java.lang.String> r2 = r1.mSharedElementSourceNames
            if (r2 == 0) goto L2d
            java.util.ArrayList<java.lang.String> r2 = r1.mSharedElementSourceNames
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L2d
            r2 = 0
            if (r3 == 0) goto L1e
            java.util.ArrayList<java.lang.String> r1 = r1.mSharedElementSourceNames
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            goto L26
        L1e:
            java.util.ArrayList<java.lang.String> r1 = r1.mSharedElementTargetNames
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
        L26:
            java.lang.Object r0 = r0.get(r1)
            android.view.View r0 = (android.view.View) r0
            return r0
        L2d:
            r0 = 0
            return r0
    }

    private static java.lang.Object getSharedElementTransition(androidx.fragment.app.FragmentTransitionImpl r0, androidx.fragment.app.Fragment r1, androidx.fragment.app.Fragment r2, boolean r3) {
            if (r1 == 0) goto L19
            if (r2 != 0) goto L5
            goto L19
        L5:
            if (r3 == 0) goto Lc
            java.lang.Object r1 = r2.getSharedElementReturnTransition()
            goto L10
        Lc:
            java.lang.Object r1 = r1.getSharedElementEnterTransition()
        L10:
            java.lang.Object r1 = r0.cloneTransition(r1)
            java.lang.Object r0 = r0.wrapTransitionInSet(r1)
            return r0
        L19:
            r0 = 0
            return r0
    }

    private static java.lang.Object mergeTransitions(androidx.fragment.app.FragmentTransitionImpl r0, java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, androidx.fragment.app.Fragment r4, boolean r5) {
            if (r1 == 0) goto L12
            if (r2 == 0) goto L12
            if (r4 == 0) goto L12
            if (r5 == 0) goto Ld
            boolean r4 = r4.getAllowReturnTransitionOverlap()
            goto L13
        Ld:
            boolean r4 = r4.getAllowEnterTransitionOverlap()
            goto L13
        L12:
            r4 = 1
        L13:
            if (r4 == 0) goto L1a
            java.lang.Object r0 = r0.mergeTransitionsTogether(r2, r1, r3)
            goto L1e
        L1a:
            java.lang.Object r0 = r0.mergeTransitionsInSequence(r2, r1, r3)
        L1e:
            return r0
    }

    private static void replaceHide(androidx.fragment.app.FragmentTransitionImpl r1, java.lang.Object r2, androidx.fragment.app.Fragment r3, java.util.ArrayList<android.view.View> r4) {
            if (r3 == 0) goto L25
            if (r2 == 0) goto L25
            boolean r0 = r3.mAdded
            if (r0 == 0) goto L25
            boolean r0 = r3.mHidden
            if (r0 == 0) goto L25
            boolean r0 = r3.mHiddenChanged
            if (r0 == 0) goto L25
            r0 = 1
            r3.setHideReplaced(r0)
            android.view.View r0 = r3.getView()
            r1.scheduleHideFragmentView(r2, r0, r4)
            android.view.ViewGroup r1 = r3.mContainer
            androidx.fragment.app.FragmentTransition$2 r2 = new androidx.fragment.app.FragmentTransition$2
            r2.<init>(r4)
            androidx.core.view.OneShotPreDrawListener.add(r1, r2)
        L25:
            return
    }

    private static androidx.fragment.app.FragmentTransitionImpl resolveSupportImpl() {
            java.lang.String r0 = "androidx.transition.FragmentTransitionSupport"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L16
            r1 = 0
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L16
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r2)     // Catch: java.lang.Exception -> L16
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L16
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Exception -> L16
            androidx.fragment.app.FragmentTransitionImpl r0 = (androidx.fragment.app.FragmentTransitionImpl) r0     // Catch: java.lang.Exception -> L16
            return r0
        L16:
            r0 = 0
            return r0
    }

    static void retainValues(androidx.collection.ArrayMap<java.lang.String, java.lang.String> r2, androidx.collection.ArrayMap<java.lang.String, android.view.View> r3) {
            int r0 = r2.size()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L1a
            java.lang.Object r1 = r2.valueAt(r0)
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r3.containsKey(r1)
            if (r1 != 0) goto L17
            r2.removeAt(r0)
        L17:
            int r0 = r0 + (-1)
            goto L6
        L1a:
            return
    }

    private static void scheduleTargetChange(androidx.fragment.app.FragmentTransitionImpl r10, android.view.ViewGroup r11, androidx.fragment.app.Fragment r12, android.view.View r13, java.util.ArrayList<android.view.View> r14, java.lang.Object r15, java.util.ArrayList<android.view.View> r16, java.lang.Object r17, java.util.ArrayList<android.view.View> r18) {
            androidx.fragment.app.FragmentTransition$4 r9 = new androidx.fragment.app.FragmentTransition$4
            r0 = r9
            r1 = r15
            r2 = r10
            r3 = r13
            r4 = r12
            r5 = r14
            r6 = r16
            r7 = r18
            r8 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = r11
            androidx.core.view.OneShotPreDrawListener.add(r11, r9)
            return
    }

    private static void setOutEpicenter(androidx.fragment.app.FragmentTransitionImpl r1, java.lang.Object r2, java.lang.Object r3, androidx.collection.ArrayMap<java.lang.String, android.view.View> r4, boolean r5, androidx.fragment.app.BackStackRecord r6) {
            java.util.ArrayList<java.lang.String> r0 = r6.mSharedElementSourceNames
            if (r0 == 0) goto L2e
            java.util.ArrayList<java.lang.String> r0 = r6.mSharedElementSourceNames
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2e
            r0 = 0
            if (r5 == 0) goto L18
            java.util.ArrayList<java.lang.String> r5 = r6.mSharedElementTargetNames
            java.lang.Object r5 = r5.get(r0)
            java.lang.String r5 = (java.lang.String) r5
            goto L20
        L18:
            java.util.ArrayList<java.lang.String> r5 = r6.mSharedElementSourceNames
            java.lang.Object r5 = r5.get(r0)
            java.lang.String r5 = (java.lang.String) r5
        L20:
            java.lang.Object r4 = r4.get(r5)
            android.view.View r4 = (android.view.View) r4
            r1.setEpicenter(r2, r4)
            if (r3 == 0) goto L2e
            r1.setEpicenter(r3, r4)
        L2e:
            return
    }

    static void setViewVisibility(java.util.ArrayList<android.view.View> r2, int r3) {
            if (r2 != 0) goto L3
            return
        L3:
            int r0 = r2.size()
            int r0 = r0 + (-1)
        L9:
            if (r0 < 0) goto L17
            java.lang.Object r1 = r2.get(r0)
            android.view.View r1 = (android.view.View) r1
            r1.setVisibility(r3)
            int r0 = r0 + (-1)
            goto L9
        L17:
            return
    }

    static void startTransitions(android.content.Context r7, androidx.fragment.app.FragmentContainer r8, java.util.ArrayList<androidx.fragment.app.BackStackRecord> r9, java.util.ArrayList<java.lang.Boolean> r10, int r11, int r12, boolean r13, androidx.fragment.app.FragmentTransition.Callback r14) {
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1 = r11
        L6:
            if (r1 >= r12) goto L24
            java.lang.Object r2 = r9.get(r1)
            androidx.fragment.app.BackStackRecord r2 = (androidx.fragment.app.BackStackRecord) r2
            java.lang.Object r3 = r10.get(r1)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L1e
            calculatePopFragments(r2, r0, r13)
            goto L21
        L1e:
            calculateFragments(r2, r0, r13)
        L21:
            int r1 = r1 + 1
            goto L6
        L24:
            int r1 = r0.size()
            if (r1 == 0) goto L5f
            android.view.View r1 = new android.view.View
            r1.<init>(r7)
            int r7 = r0.size()
            r2 = 0
        L34:
            if (r2 >= r7) goto L5f
            int r3 = r0.keyAt(r2)
            androidx.collection.ArrayMap r4 = calculateNameOverrides(r3, r9, r10, r11, r12)
            java.lang.Object r5 = r0.valueAt(r2)
            androidx.fragment.app.FragmentTransition$FragmentContainerTransition r5 = (androidx.fragment.app.FragmentTransition.FragmentContainerTransition) r5
            boolean r6 = r8.onHasView()
            if (r6 == 0) goto L5c
            android.view.View r3 = r8.onFindViewById(r3)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            if (r3 != 0) goto L53
            goto L5c
        L53:
            if (r13 == 0) goto L59
            configureTransitionsReordered(r3, r5, r1, r4, r14)
            goto L5c
        L59:
            configureTransitionsOrdered(r3, r5, r1, r4, r14)
        L5c:
            int r2 = r2 + 1
            goto L34
        L5f:
            return
    }

    static boolean supportsTransition() {
            androidx.fragment.app.FragmentTransitionImpl r0 = androidx.fragment.app.FragmentTransition.PLATFORM_IMPL
            if (r0 != 0) goto Lb
            androidx.fragment.app.FragmentTransitionImpl r0 = androidx.fragment.app.FragmentTransition.SUPPORT_IMPL
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            return r0
    }
}
