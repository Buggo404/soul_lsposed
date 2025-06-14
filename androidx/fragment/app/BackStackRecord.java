package androidx.fragment.app;

/* loaded from: classes.dex */
final class BackStackRecord extends androidx.fragment.app.FragmentTransaction implements androidx.fragment.app.FragmentManager.BackStackEntry, androidx.fragment.app.FragmentManager.OpGenerator {
    private static final java.lang.String TAG = "FragmentManager";
    boolean mCommitted;
    int mIndex;
    final androidx.fragment.app.FragmentManager mManager;

    BackStackRecord(androidx.fragment.app.FragmentManager r3) {
            r2 = this;
            androidx.fragment.app.FragmentFactory r0 = r3.getFragmentFactory()
            androidx.fragment.app.FragmentHostCallback r1 = r3.getHost()
            if (r1 == 0) goto L17
            androidx.fragment.app.FragmentHostCallback r1 = r3.getHost()
            android.content.Context r1 = r1.getContext()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            goto L18
        L17:
            r1 = 0
        L18:
            r2.<init>(r0, r1)
            r0 = -1
            r2.mIndex = r0
            r2.mManager = r3
            return
    }

    private static boolean isFragmentPostponed(androidx.fragment.app.FragmentTransaction.C0303Op r1) {
            androidx.fragment.app.Fragment r1 = r1.mFragment
            if (r1 == 0) goto L1c
            boolean r0 = r1.mAdded
            if (r0 == 0) goto L1c
            android.view.View r0 = r1.mView
            if (r0 == 0) goto L1c
            boolean r0 = r1.mDetached
            if (r0 != 0) goto L1c
            boolean r0 = r1.mHidden
            if (r0 != 0) goto L1c
            boolean r1 = r1.isPostponed()
            if (r1 == 0) goto L1c
            r1 = 1
            goto L1d
        L1c:
            r1 = 0
        L1d:
            return r1
    }

    void bumpBackStackNesting(int r8) {
            r7 = this;
            boolean r0 = r7.mAddToBackStack
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 2
            boolean r1 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            java.lang.String r2 = "FragmentManager"
            if (r1 == 0) goto L2a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Bump nesting in "
            r1.<init>(r3)
            java.lang.StringBuilder r1 = r1.append(r7)
            java.lang.String r3 = " by "
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r8)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r2, r1)
        L2a:
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r1 = r7.mOps
            int r1 = r1.size()
            r3 = 0
        L31:
            if (r3 >= r1) goto L71
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r4 = r7.mOps
            java.lang.Object r4 = r4.get(r3)
            androidx.fragment.app.FragmentTransaction$Op r4 = (androidx.fragment.app.FragmentTransaction.C0303Op) r4
            androidx.fragment.app.Fragment r5 = r4.mFragment
            if (r5 == 0) goto L6e
            androidx.fragment.app.Fragment r5 = r4.mFragment
            int r6 = r5.mBackStackNesting
            int r6 = r6 + r8
            r5.mBackStackNesting = r6
            boolean r5 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r5 == 0) goto L6e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Bump nesting of "
            r5.<init>(r6)
            androidx.fragment.app.Fragment r6 = r4.mFragment
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = " to "
            java.lang.StringBuilder r5 = r5.append(r6)
            androidx.fragment.app.Fragment r4 = r4.mFragment
            int r4 = r4.mBackStackNesting
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.String r4 = r4.toString()
            android.util.Log.v(r2, r4)
        L6e:
            int r3 = r3 + 1
            goto L31
        L71:
            return
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public int commit() {
            r1 = this;
            r0 = 0
            int r0 = r1.commitInternal(r0)
            return r0
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public int commitAllowingStateLoss() {
            r1 = this;
            r0 = 1
            int r0 = r1.commitInternal(r0)
            return r0
    }

    int commitInternal(boolean r3) {
            r2 = this;
            boolean r0 = r2.mCommitted
            if (r0 != 0) goto L4c
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L31
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Commit: "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
            androidx.fragment.app.LogWriter r0 = new androidx.fragment.app.LogWriter
            r0.<init>(r1)
            java.io.PrintWriter r1 = new java.io.PrintWriter
            r1.<init>(r0)
            java.lang.String r0 = "  "
            r2.dump(r0, r1)
            r1.close()
        L31:
            r0 = 1
            r2.mCommitted = r0
            boolean r0 = r2.mAddToBackStack
            if (r0 == 0) goto L41
            androidx.fragment.app.FragmentManager r0 = r2.mManager
            int r0 = r0.allocBackStackIndex()
            r2.mIndex = r0
            goto L44
        L41:
            r0 = -1
            r2.mIndex = r0
        L44:
            androidx.fragment.app.FragmentManager r0 = r2.mManager
            r0.enqueueAction(r2, r3)
            int r3 = r2.mIndex
            return r3
        L4c:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "commit already called"
            r3.<init>(r0)
            throw r3
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public void commitNow() {
            r2 = this;
            r2.disallowAddToBackStack()
            androidx.fragment.app.FragmentManager r0 = r2.mManager
            r1 = 0
            r0.execSingleAction(r2, r1)
            return
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public void commitNowAllowingStateLoss() {
            r2 = this;
            r2.disallowAddToBackStack()
            androidx.fragment.app.FragmentManager r0 = r2.mManager
            r1 = 1
            r0.execSingleAction(r2, r1)
            return
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public androidx.fragment.app.FragmentTransaction detach(androidx.fragment.app.Fragment r4) {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r4.mFragmentManager
            if (r0 == 0) goto L2a
            androidx.fragment.app.FragmentManager r0 = r4.mFragmentManager
            androidx.fragment.app.FragmentManager r1 = r3.mManager
            if (r0 != r1) goto Lb
            goto L2a
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Cannot detach Fragment attached to a different FragmentManager. Fragment "
            r1.<init>(r2)
            java.lang.String r4 = r4.toString()
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = " is already attached to a FragmentManager."
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L2a:
            androidx.fragment.app.FragmentTransaction r4 = super.detach(r4)
            return r4
    }

    @Override // androidx.fragment.app.FragmentTransaction
    void doAddOp(int r1, androidx.fragment.app.Fragment r2, java.lang.String r3, int r4) {
            r0 = this;
            super.doAddOp(r1, r2, r3, r4)
            androidx.fragment.app.FragmentManager r1 = r0.mManager
            r2.mFragmentManager = r1
            return
    }

    public void dump(java.lang.String r2, java.io.PrintWriter r3) {
            r1 = this;
            r0 = 1
            r1.dump(r2, r3, r0)
            return
    }

    public void dump(java.lang.String r6, java.io.PrintWriter r7, boolean r8) {
            r5 = this;
            if (r8 == 0) goto Lcc
            r7.print(r6)
            java.lang.String r0 = "mName="
            r7.print(r0)
            java.lang.String r0 = r5.mName
            r7.print(r0)
            java.lang.String r0 = " mIndex="
            r7.print(r0)
            int r0 = r5.mIndex
            r7.print(r0)
            java.lang.String r0 = " mCommitted="
            r7.print(r0)
            boolean r0 = r5.mCommitted
            r7.println(r0)
            int r0 = r5.mTransition
            if (r0 == 0) goto L38
            r7.print(r6)
            java.lang.String r0 = "mTransition=#"
            r7.print(r0)
            int r0 = r5.mTransition
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.print(r0)
        L38:
            int r0 = r5.mEnterAnim
            if (r0 != 0) goto L40
            int r0 = r5.mExitAnim
            if (r0 == 0) goto L5f
        L40:
            r7.print(r6)
            java.lang.String r0 = "mEnterAnim=#"
            r7.print(r0)
            int r0 = r5.mEnterAnim
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.print(r0)
            java.lang.String r0 = " mExitAnim=#"
            r7.print(r0)
            int r0 = r5.mExitAnim
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.println(r0)
        L5f:
            int r0 = r5.mPopEnterAnim
            if (r0 != 0) goto L67
            int r0 = r5.mPopExitAnim
            if (r0 == 0) goto L86
        L67:
            r7.print(r6)
            java.lang.String r0 = "mPopEnterAnim=#"
            r7.print(r0)
            int r0 = r5.mPopEnterAnim
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.print(r0)
            java.lang.String r0 = " mPopExitAnim=#"
            r7.print(r0)
            int r0 = r5.mPopExitAnim
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.println(r0)
        L86:
            int r0 = r5.mBreadCrumbTitleRes
            if (r0 != 0) goto L8e
            java.lang.CharSequence r0 = r5.mBreadCrumbTitleText
            if (r0 == 0) goto La9
        L8e:
            r7.print(r6)
            java.lang.String r0 = "mBreadCrumbTitleRes=#"
            r7.print(r0)
            int r0 = r5.mBreadCrumbTitleRes
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.print(r0)
            java.lang.String r0 = " mBreadCrumbTitleText="
            r7.print(r0)
            java.lang.CharSequence r0 = r5.mBreadCrumbTitleText
            r7.println(r0)
        La9:
            int r0 = r5.mBreadCrumbShortTitleRes
            if (r0 != 0) goto Lb1
            java.lang.CharSequence r0 = r5.mBreadCrumbShortTitleText
            if (r0 == 0) goto Lcc
        Lb1:
            r7.print(r6)
            java.lang.String r0 = "mBreadCrumbShortTitleRes=#"
            r7.print(r0)
            int r0 = r5.mBreadCrumbShortTitleRes
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.print(r0)
            java.lang.String r0 = " mBreadCrumbShortTitleText="
            r7.print(r0)
            java.lang.CharSequence r0 = r5.mBreadCrumbShortTitleText
            r7.println(r0)
        Lcc:
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r0 = r5.mOps
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L195
            r7.print(r6)
            java.lang.String r0 = "Operations:"
            r7.println(r0)
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r0 = r5.mOps
            int r0 = r0.size()
            r1 = 0
        Le3:
            if (r1 >= r0) goto L195
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r2 = r5.mOps
            java.lang.Object r2 = r2.get(r1)
            androidx.fragment.app.FragmentTransaction$Op r2 = (androidx.fragment.app.FragmentTransaction.C0303Op) r2
            int r3 = r2.mCmd
            switch(r3) {
                case 0: goto L122;
                case 1: goto L11f;
                case 2: goto L11c;
                case 3: goto L119;
                case 4: goto L116;
                case 5: goto L113;
                case 6: goto L110;
                case 7: goto L10d;
                case 8: goto L10a;
                case 9: goto L107;
                case 10: goto L104;
                default: goto Lf2;
            }
        Lf2:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "cmd="
            r3.<init>(r4)
            int r4 = r2.mCmd
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            goto L124
        L104:
            java.lang.String r3 = "OP_SET_MAX_LIFECYCLE"
            goto L124
        L107:
            java.lang.String r3 = "UNSET_PRIMARY_NAV"
            goto L124
        L10a:
            java.lang.String r3 = "SET_PRIMARY_NAV"
            goto L124
        L10d:
            java.lang.String r3 = "ATTACH"
            goto L124
        L110:
            java.lang.String r3 = "DETACH"
            goto L124
        L113:
            java.lang.String r3 = "SHOW"
            goto L124
        L116:
            java.lang.String r3 = "HIDE"
            goto L124
        L119:
            java.lang.String r3 = "REMOVE"
            goto L124
        L11c:
            java.lang.String r3 = "REPLACE"
            goto L124
        L11f:
            java.lang.String r3 = "ADD"
            goto L124
        L122:
            java.lang.String r3 = "NULL"
        L124:
            r7.print(r6)
            java.lang.String r4 = "  Op #"
            r7.print(r4)
            r7.print(r1)
            java.lang.String r4 = ": "
            r7.print(r4)
            r7.print(r3)
            java.lang.String r3 = " "
            r7.print(r3)
            androidx.fragment.app.Fragment r3 = r2.mFragment
            r7.println(r3)
            if (r8 == 0) goto L191
            int r3 = r2.mEnterAnim
            if (r3 != 0) goto L14b
            int r3 = r2.mExitAnim
            if (r3 == 0) goto L16a
        L14b:
            r7.print(r6)
            java.lang.String r3 = "enterAnim=#"
            r7.print(r3)
            int r3 = r2.mEnterAnim
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r7.print(r3)
            java.lang.String r3 = " exitAnim=#"
            r7.print(r3)
            int r3 = r2.mExitAnim
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r7.println(r3)
        L16a:
            int r3 = r2.mPopEnterAnim
            if (r3 != 0) goto L172
            int r3 = r2.mPopExitAnim
            if (r3 == 0) goto L191
        L172:
            r7.print(r6)
            java.lang.String r3 = "popEnterAnim=#"
            r7.print(r3)
            int r3 = r2.mPopEnterAnim
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r7.print(r3)
            java.lang.String r3 = " popExitAnim=#"
            r7.print(r3)
            int r2 = r2.mPopExitAnim
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r7.println(r2)
        L191:
            int r1 = r1 + 1
            goto Le3
        L195:
            return
    }

    void executeOps() {
            r10 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r0 = r10.mOps
            int r0 = r0.size()
            r1 = 0
            r2 = r1
        L8:
            r3 = 1
            if (r2 >= r0) goto Le5
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r4 = r10.mOps
            java.lang.Object r4 = r4.get(r2)
            androidx.fragment.app.FragmentTransaction$Op r4 = (androidx.fragment.app.FragmentTransaction.C0303Op) r4
            androidx.fragment.app.Fragment r5 = r4.mFragment
            if (r5 == 0) goto L26
            r5.setPopDirection(r1)
            int r6 = r10.mTransition
            r5.setNextTransition(r6)
            java.util.ArrayList<java.lang.String> r6 = r10.mSharedElementSourceNames
            java.util.ArrayList<java.lang.String> r7 = r10.mSharedElementTargetNames
            r5.setSharedElementNames(r6, r7)
        L26:
            int r6 = r4.mCmd
            switch(r6) {
                case 1: goto Lb9;
                case 2: goto L2b;
                case 3: goto La8;
                case 4: goto L97;
                case 5: goto L81;
                case 6: goto L70;
                case 7: goto L5a;
                case 8: goto L53;
                case 9: goto L4b;
                case 10: goto L42;
                default: goto L2b;
            }
        L2b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown cmd: "
            r1.<init>(r2)
            int r2 = r4.mCmd
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L42:
            androidx.fragment.app.FragmentManager r6 = r10.mManager
            androidx.lifecycle.Lifecycle$State r7 = r4.mCurrentMaxState
            r6.setMaxLifecycle(r5, r7)
            goto Lce
        L4b:
            androidx.fragment.app.FragmentManager r6 = r10.mManager
            r7 = 0
            r6.setPrimaryNavigationFragment(r7)
            goto Lce
        L53:
            androidx.fragment.app.FragmentManager r6 = r10.mManager
            r6.setPrimaryNavigationFragment(r5)
            goto Lce
        L5a:
            int r6 = r4.mEnterAnim
            int r7 = r4.mExitAnim
            int r8 = r4.mPopEnterAnim
            int r9 = r4.mPopExitAnim
            r5.setAnimations(r6, r7, r8, r9)
            androidx.fragment.app.FragmentManager r6 = r10.mManager
            r6.setExitAnimationOrder(r5, r1)
            androidx.fragment.app.FragmentManager r6 = r10.mManager
            r6.attachFragment(r5)
            goto Lce
        L70:
            int r6 = r4.mEnterAnim
            int r7 = r4.mExitAnim
            int r8 = r4.mPopEnterAnim
            int r9 = r4.mPopExitAnim
            r5.setAnimations(r6, r7, r8, r9)
            androidx.fragment.app.FragmentManager r6 = r10.mManager
            r6.detachFragment(r5)
            goto Lce
        L81:
            int r6 = r4.mEnterAnim
            int r7 = r4.mExitAnim
            int r8 = r4.mPopEnterAnim
            int r9 = r4.mPopExitAnim
            r5.setAnimations(r6, r7, r8, r9)
            androidx.fragment.app.FragmentManager r6 = r10.mManager
            r6.setExitAnimationOrder(r5, r1)
            androidx.fragment.app.FragmentManager r6 = r10.mManager
            r6.showFragment(r5)
            goto Lce
        L97:
            int r6 = r4.mEnterAnim
            int r7 = r4.mExitAnim
            int r8 = r4.mPopEnterAnim
            int r9 = r4.mPopExitAnim
            r5.setAnimations(r6, r7, r8, r9)
            androidx.fragment.app.FragmentManager r6 = r10.mManager
            r6.hideFragment(r5)
            goto Lce
        La8:
            int r6 = r4.mEnterAnim
            int r7 = r4.mExitAnim
            int r8 = r4.mPopEnterAnim
            int r9 = r4.mPopExitAnim
            r5.setAnimations(r6, r7, r8, r9)
            androidx.fragment.app.FragmentManager r6 = r10.mManager
            r6.removeFragment(r5)
            goto Lce
        Lb9:
            int r6 = r4.mEnterAnim
            int r7 = r4.mExitAnim
            int r8 = r4.mPopEnterAnim
            int r9 = r4.mPopExitAnim
            r5.setAnimations(r6, r7, r8, r9)
            androidx.fragment.app.FragmentManager r6 = r10.mManager
            r6.setExitAnimationOrder(r5, r1)
            androidx.fragment.app.FragmentManager r6 = r10.mManager
            r6.addFragment(r5)
        Lce:
            boolean r6 = r10.mReorderingAllowed
            if (r6 != 0) goto Le1
            int r4 = r4.mCmd
            if (r4 == r3) goto Le1
            if (r5 == 0) goto Le1
            boolean r3 = androidx.fragment.app.FragmentManager.USE_STATE_MANAGER
            if (r3 != 0) goto Le1
            androidx.fragment.app.FragmentManager r3 = r10.mManager
            r3.moveFragmentToExpectedState(r5)
        Le1:
            int r2 = r2 + 1
            goto L8
        Le5:
            boolean r0 = r10.mReorderingAllowed
            if (r0 != 0) goto Lf4
            boolean r0 = androidx.fragment.app.FragmentManager.USE_STATE_MANAGER
            if (r0 != 0) goto Lf4
            androidx.fragment.app.FragmentManager r0 = r10.mManager
            int r1 = r0.mCurState
            r0.moveToState(r1, r3)
        Lf4:
            return
    }

    void executePopOps(boolean r9) {
            r8 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r0 = r8.mOps
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            if (r0 < 0) goto Le9
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r2 = r8.mOps
            java.lang.Object r2 = r2.get(r0)
            androidx.fragment.app.FragmentTransaction$Op r2 = (androidx.fragment.app.FragmentTransaction.C0303Op) r2
            androidx.fragment.app.Fragment r3 = r2.mFragment
            if (r3 == 0) goto L29
            r3.setPopDirection(r1)
            int r4 = r8.mTransition
            int r4 = androidx.fragment.app.FragmentManager.reverseTransit(r4)
            r3.setNextTransition(r4)
            java.util.ArrayList<java.lang.String> r4 = r8.mSharedElementTargetNames
            java.util.ArrayList<java.lang.String> r5 = r8.mSharedElementSourceNames
            r3.setSharedElementNames(r4, r5)
        L29:
            int r4 = r2.mCmd
            switch(r4) {
                case 1: goto Lbc;
                case 2: goto L2e;
                case 3: goto Lab;
                case 4: goto L9a;
                case 5: goto L84;
                case 6: goto L73;
                case 7: goto L5d;
                case 8: goto L55;
                case 9: goto L4e;
                case 10: goto L45;
                default: goto L2e;
            }
        L2e:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unknown cmd: "
            r0.<init>(r1)
            int r1 = r2.mCmd
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        L45:
            androidx.fragment.app.FragmentManager r4 = r8.mManager
            androidx.lifecycle.Lifecycle$State r5 = r2.mOldMaxState
            r4.setMaxLifecycle(r3, r5)
            goto Ld1
        L4e:
            androidx.fragment.app.FragmentManager r4 = r8.mManager
            r4.setPrimaryNavigationFragment(r3)
            goto Ld1
        L55:
            androidx.fragment.app.FragmentManager r4 = r8.mManager
            r5 = 0
            r4.setPrimaryNavigationFragment(r5)
            goto Ld1
        L5d:
            int r4 = r2.mEnterAnim
            int r5 = r2.mExitAnim
            int r6 = r2.mPopEnterAnim
            int r7 = r2.mPopExitAnim
            r3.setAnimations(r4, r5, r6, r7)
            androidx.fragment.app.FragmentManager r4 = r8.mManager
            r4.setExitAnimationOrder(r3, r1)
            androidx.fragment.app.FragmentManager r4 = r8.mManager
            r4.detachFragment(r3)
            goto Ld1
        L73:
            int r4 = r2.mEnterAnim
            int r5 = r2.mExitAnim
            int r6 = r2.mPopEnterAnim
            int r7 = r2.mPopExitAnim
            r3.setAnimations(r4, r5, r6, r7)
            androidx.fragment.app.FragmentManager r4 = r8.mManager
            r4.attachFragment(r3)
            goto Ld1
        L84:
            int r4 = r2.mEnterAnim
            int r5 = r2.mExitAnim
            int r6 = r2.mPopEnterAnim
            int r7 = r2.mPopExitAnim
            r3.setAnimations(r4, r5, r6, r7)
            androidx.fragment.app.FragmentManager r4 = r8.mManager
            r4.setExitAnimationOrder(r3, r1)
            androidx.fragment.app.FragmentManager r4 = r8.mManager
            r4.hideFragment(r3)
            goto Ld1
        L9a:
            int r4 = r2.mEnterAnim
            int r5 = r2.mExitAnim
            int r6 = r2.mPopEnterAnim
            int r7 = r2.mPopExitAnim
            r3.setAnimations(r4, r5, r6, r7)
            androidx.fragment.app.FragmentManager r4 = r8.mManager
            r4.showFragment(r3)
            goto Ld1
        Lab:
            int r4 = r2.mEnterAnim
            int r5 = r2.mExitAnim
            int r6 = r2.mPopEnterAnim
            int r7 = r2.mPopExitAnim
            r3.setAnimations(r4, r5, r6, r7)
            androidx.fragment.app.FragmentManager r4 = r8.mManager
            r4.addFragment(r3)
            goto Ld1
        Lbc:
            int r4 = r2.mEnterAnim
            int r5 = r2.mExitAnim
            int r6 = r2.mPopEnterAnim
            int r7 = r2.mPopExitAnim
            r3.setAnimations(r4, r5, r6, r7)
            androidx.fragment.app.FragmentManager r4 = r8.mManager
            r4.setExitAnimationOrder(r3, r1)
            androidx.fragment.app.FragmentManager r4 = r8.mManager
            r4.removeFragment(r3)
        Ld1:
            boolean r4 = r8.mReorderingAllowed
            if (r4 != 0) goto Le5
            int r2 = r2.mCmd
            r4 = 3
            if (r2 == r4) goto Le5
            if (r3 == 0) goto Le5
            boolean r2 = androidx.fragment.app.FragmentManager.USE_STATE_MANAGER
            if (r2 != 0) goto Le5
            androidx.fragment.app.FragmentManager r2 = r8.mManager
            r2.moveFragmentToExpectedState(r3)
        Le5:
            int r0 = r0 + (-1)
            goto L8
        Le9:
            boolean r0 = r8.mReorderingAllowed
            if (r0 != 0) goto Lfa
            if (r9 == 0) goto Lfa
            boolean r9 = androidx.fragment.app.FragmentManager.USE_STATE_MANAGER
            if (r9 != 0) goto Lfa
            androidx.fragment.app.FragmentManager r9 = r8.mManager
            int r0 = r9.mCurState
            r9.moveToState(r0, r1)
        Lfa:
            return
    }

    androidx.fragment.app.Fragment expandOps(java.util.ArrayList<androidx.fragment.app.Fragment> r17, androidx.fragment.app.Fragment r18) {
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = 0
        L7:
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r5 = r0.mOps
            int r5 = r5.size()
            if (r4 >= r5) goto Lbc
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r5 = r0.mOps
            java.lang.Object r5 = r5.get(r4)
            androidx.fragment.app.FragmentTransaction$Op r5 = (androidx.fragment.app.FragmentTransaction.C0303Op) r5
            int r6 = r5.mCmd
            r7 = 1
            if (r6 == r7) goto Lb4
            r8 = 2
            r9 = 0
            r10 = 3
            r11 = 9
            if (r6 == r8) goto L5a
            if (r6 == r10) goto L41
            r8 = 6
            if (r6 == r8) goto L41
            r8 = 7
            if (r6 == r8) goto Lb4
            r8 = 8
            if (r6 == r8) goto L31
            goto Lb9
        L31:
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r6 = r0.mOps
            androidx.fragment.app.FragmentTransaction$Op r8 = new androidx.fragment.app.FragmentTransaction$Op
            r8.<init>(r11, r3)
            r6.add(r4, r8)
            int r4 = r4 + 1
            androidx.fragment.app.Fragment r3 = r5.mFragment
            goto Lb9
        L41:
            androidx.fragment.app.Fragment r6 = r5.mFragment
            r1.remove(r6)
            androidx.fragment.app.Fragment r6 = r5.mFragment
            if (r6 != r3) goto Lb9
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r3 = r0.mOps
            androidx.fragment.app.FragmentTransaction$Op r6 = new androidx.fragment.app.FragmentTransaction$Op
            androidx.fragment.app.Fragment r5 = r5.mFragment
            r6.<init>(r11, r5)
            r3.add(r4, r6)
            int r4 = r4 + 1
            r3 = r9
            goto Lb9
        L5a:
            androidx.fragment.app.Fragment r6 = r5.mFragment
            int r8 = r6.mContainerId
            int r12 = r17.size()
            int r12 = r12 - r7
            r13 = 0
        L64:
            if (r12 < 0) goto La4
            java.lang.Object r14 = r1.get(r12)
            androidx.fragment.app.Fragment r14 = (androidx.fragment.app.Fragment) r14
            int r15 = r14.mContainerId
            if (r15 != r8) goto La1
            if (r14 != r6) goto L74
            r13 = r7
            goto La1
        L74:
            if (r14 != r3) goto L83
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r3 = r0.mOps
            androidx.fragment.app.FragmentTransaction$Op r15 = new androidx.fragment.app.FragmentTransaction$Op
            r15.<init>(r11, r14)
            r3.add(r4, r15)
            int r4 = r4 + 1
            r3 = r9
        L83:
            androidx.fragment.app.FragmentTransaction$Op r15 = new androidx.fragment.app.FragmentTransaction$Op
            r15.<init>(r10, r14)
            int r2 = r5.mEnterAnim
            r15.mEnterAnim = r2
            int r2 = r5.mPopEnterAnim
            r15.mPopEnterAnim = r2
            int r2 = r5.mExitAnim
            r15.mExitAnim = r2
            int r2 = r5.mPopExitAnim
            r15.mPopExitAnim = r2
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r2 = r0.mOps
            r2.add(r4, r15)
            r1.remove(r14)
            int r4 = r4 + r7
        La1:
            int r12 = r12 + (-1)
            goto L64
        La4:
            if (r13 == 0) goto Lae
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r2 = r0.mOps
            r2.remove(r4)
            int r4 = r4 + (-1)
            goto Lb9
        Lae:
            r5.mCmd = r7
            r1.add(r6)
            goto Lb9
        Lb4:
            androidx.fragment.app.Fragment r2 = r5.mFragment
            r1.add(r2)
        Lb9:
            int r4 = r4 + r7
            goto L7
        Lbc:
            return r3
    }

    @Override // androidx.fragment.app.FragmentManager.OpGenerator
    public boolean generateOps(java.util.ArrayList<androidx.fragment.app.BackStackRecord> r3, java.util.ArrayList<java.lang.Boolean> r4) {
            r2 = this;
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L1b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Run: "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L1b:
            r3.add(r2)
            r3 = 0
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r4.add(r3)
            boolean r3 = r2.mAddToBackStack
            if (r3 == 0) goto L2f
            androidx.fragment.app.FragmentManager r3 = r2.mManager
            r3.addBackStackState(r2)
        L2f:
            r3 = 1
            return r3
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    public java.lang.CharSequence getBreadCrumbShortTitle() {
            r2 = this;
            int r0 = r2.mBreadCrumbShortTitleRes
            if (r0 == 0) goto L15
            androidx.fragment.app.FragmentManager r0 = r2.mManager
            androidx.fragment.app.FragmentHostCallback r0 = r0.getHost()
            android.content.Context r0 = r0.getContext()
            int r1 = r2.mBreadCrumbShortTitleRes
            java.lang.CharSequence r0 = r0.getText(r1)
            return r0
        L15:
            java.lang.CharSequence r0 = r2.mBreadCrumbShortTitleText
            return r0
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    public int getBreadCrumbShortTitleRes() {
            r1 = this;
            int r0 = r1.mBreadCrumbShortTitleRes
            return r0
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    public java.lang.CharSequence getBreadCrumbTitle() {
            r2 = this;
            int r0 = r2.mBreadCrumbTitleRes
            if (r0 == 0) goto L15
            androidx.fragment.app.FragmentManager r0 = r2.mManager
            androidx.fragment.app.FragmentHostCallback r0 = r0.getHost()
            android.content.Context r0 = r0.getContext()
            int r1 = r2.mBreadCrumbTitleRes
            java.lang.CharSequence r0 = r0.getText(r1)
            return r0
        L15:
            java.lang.CharSequence r0 = r2.mBreadCrumbTitleText
            return r0
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    public int getBreadCrumbTitleRes() {
            r1 = this;
            int r0 = r1.mBreadCrumbTitleRes
            return r0
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    public int getId() {
            r1 = this;
            int r0 = r1.mIndex
            return r0
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.mName
            return r0
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public androidx.fragment.app.FragmentTransaction hide(androidx.fragment.app.Fragment r4) {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r4.mFragmentManager
            if (r0 == 0) goto L2a
            androidx.fragment.app.FragmentManager r0 = r4.mFragmentManager
            androidx.fragment.app.FragmentManager r1 = r3.mManager
            if (r0 != r1) goto Lb
            goto L2a
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Cannot hide Fragment attached to a different FragmentManager. Fragment "
            r1.<init>(r2)
            java.lang.String r4 = r4.toString()
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = " is already attached to a FragmentManager."
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L2a:
            androidx.fragment.app.FragmentTransaction r4 = super.hide(r4)
            return r4
    }

    boolean interactsWith(int r6) {
            r5 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r0 = r5.mOps
            int r0 = r0.size()
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L25
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r3 = r5.mOps
            java.lang.Object r3 = r3.get(r2)
            androidx.fragment.app.FragmentTransaction$Op r3 = (androidx.fragment.app.FragmentTransaction.C0303Op) r3
            androidx.fragment.app.Fragment r4 = r3.mFragment
            if (r4 == 0) goto L1b
            androidx.fragment.app.Fragment r3 = r3.mFragment
            int r3 = r3.mContainerId
            goto L1c
        L1b:
            r3 = r1
        L1c:
            if (r3 == 0) goto L22
            if (r3 != r6) goto L22
            r6 = 1
            return r6
        L22:
            int r2 = r2 + 1
            goto L8
        L25:
            return r1
    }

    boolean interactsWith(java.util.ArrayList<androidx.fragment.app.BackStackRecord> r11, int r12, int r13) {
            r10 = this;
            r0 = 0
            if (r13 != r12) goto L4
            return r0
        L4:
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r1 = r10.mOps
            int r1 = r1.size()
            r2 = -1
            r3 = r0
        Lc:
            if (r3 >= r1) goto L56
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r4 = r10.mOps
            java.lang.Object r4 = r4.get(r3)
            androidx.fragment.app.FragmentTransaction$Op r4 = (androidx.fragment.app.FragmentTransaction.C0303Op) r4
            androidx.fragment.app.Fragment r5 = r4.mFragment
            if (r5 == 0) goto L1f
            androidx.fragment.app.Fragment r4 = r4.mFragment
            int r4 = r4.mContainerId
            goto L20
        L1f:
            r4 = r0
        L20:
            if (r4 == 0) goto L53
            if (r4 == r2) goto L53
            r2 = r12
        L25:
            if (r2 >= r13) goto L52
            java.lang.Object r5 = r11.get(r2)
            androidx.fragment.app.BackStackRecord r5 = (androidx.fragment.app.BackStackRecord) r5
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r6 = r5.mOps
            int r6 = r6.size()
            r7 = r0
        L34:
            if (r7 >= r6) goto L4f
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r8 = r5.mOps
            java.lang.Object r8 = r8.get(r7)
            androidx.fragment.app.FragmentTransaction$Op r8 = (androidx.fragment.app.FragmentTransaction.C0303Op) r8
            androidx.fragment.app.Fragment r9 = r8.mFragment
            if (r9 == 0) goto L47
            androidx.fragment.app.Fragment r8 = r8.mFragment
            int r8 = r8.mContainerId
            goto L48
        L47:
            r8 = r0
        L48:
            if (r8 != r4) goto L4c
            r11 = 1
            return r11
        L4c:
            int r7 = r7 + 1
            goto L34
        L4f:
            int r2 = r2 + 1
            goto L25
        L52:
            r2 = r4
        L53:
            int r3 = r3 + 1
            goto Lc
        L56:
            return r0
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public boolean isEmpty() {
            r1 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r0 = r1.mOps
            boolean r0 = r0.isEmpty()
            return r0
    }

    boolean isPostponed() {
            r3 = this;
            r0 = 0
            r1 = r0
        L2:
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r2 = r3.mOps
            int r2 = r2.size()
            if (r1 >= r2) goto L1d
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r2 = r3.mOps
            java.lang.Object r2 = r2.get(r1)
            androidx.fragment.app.FragmentTransaction$Op r2 = (androidx.fragment.app.FragmentTransaction.C0303Op) r2
            boolean r2 = isFragmentPostponed(r2)
            if (r2 == 0) goto L1a
            r0 = 1
            return r0
        L1a:
            int r1 = r1 + 1
            goto L2
        L1d:
            return r0
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public androidx.fragment.app.FragmentTransaction remove(androidx.fragment.app.Fragment r4) {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r4.mFragmentManager
            if (r0 == 0) goto L2a
            androidx.fragment.app.FragmentManager r0 = r4.mFragmentManager
            androidx.fragment.app.FragmentManager r1 = r3.mManager
            if (r0 != r1) goto Lb
            goto L2a
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Cannot remove Fragment attached to a different FragmentManager. Fragment "
            r1.<init>(r2)
            java.lang.String r4 = r4.toString()
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = " is already attached to a FragmentManager."
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L2a:
            androidx.fragment.app.FragmentTransaction r4 = super.remove(r4)
            return r4
    }

    public void runOnCommitRunnables() {
            r2 = this;
            java.util.ArrayList<java.lang.Runnable> r0 = r2.mCommitRunnables
            if (r0 == 0) goto L1e
            r0 = 0
        L5:
            java.util.ArrayList<java.lang.Runnable> r1 = r2.mCommitRunnables
            int r1 = r1.size()
            if (r0 >= r1) goto L1b
            java.util.ArrayList<java.lang.Runnable> r1 = r2.mCommitRunnables
            java.lang.Object r1 = r1.get(r0)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r1.run()
            int r0 = r0 + 1
            goto L5
        L1b:
            r0 = 0
            r2.mCommitRunnables = r0
        L1e:
            return
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public androidx.fragment.app.FragmentTransaction setMaxLifecycle(androidx.fragment.app.Fragment r4, androidx.lifecycle.Lifecycle.State r5) {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r4.mFragmentManager
            androidx.fragment.app.FragmentManager r1 = r3.mManager
            if (r0 != r1) goto L4d
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.INITIALIZED
            java.lang.String r1 = "Cannot set maximum Lifecycle to "
            if (r5 != r0) goto L2b
            int r0 = r4.mState
            r2 = -1
            if (r0 > r2) goto L12
            goto L2b
        L12:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r0 = " after the Fragment has been created"
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L2b:
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r5 == r0) goto L34
            androidx.fragment.app.FragmentTransaction r4 = super.setMaxLifecycle(r4, r5)
            return r4
        L34:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r0 = ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction."
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L4d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Cannot setMaxLifecycle for Fragment not attached to FragmentManager "
            r5.<init>(r0)
            androidx.fragment.app.FragmentManager r0 = r3.mManager
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    void setOnStartPostponedListener(androidx.fragment.app.Fragment.OnStartEnterTransitionListener r4) {
            r3 = this;
            r0 = 0
        L1:
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r1 = r3.mOps
            int r1 = r1.size()
            if (r0 >= r1) goto L1f
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r1 = r3.mOps
            java.lang.Object r1 = r1.get(r0)
            androidx.fragment.app.FragmentTransaction$Op r1 = (androidx.fragment.app.FragmentTransaction.C0303Op) r1
            boolean r2 = isFragmentPostponed(r1)
            if (r2 == 0) goto L1c
            androidx.fragment.app.Fragment r1 = r1.mFragment
            r1.setOnStartEnterTransitionListener(r4)
        L1c:
            int r0 = r0 + 1
            goto L1
        L1f:
            return
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public androidx.fragment.app.FragmentTransaction setPrimaryNavigationFragment(androidx.fragment.app.Fragment r4) {
            r3 = this;
            if (r4 == 0) goto L2c
            androidx.fragment.app.FragmentManager r0 = r4.mFragmentManager
            if (r0 == 0) goto L2c
            androidx.fragment.app.FragmentManager r0 = r4.mFragmentManager
            androidx.fragment.app.FragmentManager r1 = r3.mManager
            if (r0 != r1) goto Ld
            goto L2c
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment "
            r1.<init>(r2)
            java.lang.String r4 = r4.toString()
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = " is already attached to a FragmentManager."
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L2c:
            androidx.fragment.app.FragmentTransaction r4 = super.setPrimaryNavigationFragment(r4)
            return r4
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public androidx.fragment.app.FragmentTransaction show(androidx.fragment.app.Fragment r4) {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r4.mFragmentManager
            if (r0 == 0) goto L2a
            androidx.fragment.app.FragmentManager r0 = r4.mFragmentManager
            androidx.fragment.app.FragmentManager r1 = r3.mManager
            if (r0 != r1) goto Lb
            goto L2a
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Cannot show Fragment attached to a different FragmentManager. Fragment "
            r1.<init>(r2)
            java.lang.String r4 = r4.toString()
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = " is already attached to a FragmentManager."
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L2a:
            androidx.fragment.app.FragmentTransaction r4 = super.show(r4)
            return r4
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.794E-43)
            r0.<init>(r1)
            java.lang.String r1 = "BackStackEntry{"
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r2)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            int r1 = r2.mIndex
            if (r1 < 0) goto L25
            java.lang.String r1 = " #"
            r0.append(r1)
            int r1 = r2.mIndex
            r0.append(r1)
        L25:
            java.lang.String r1 = r2.mName
            if (r1 == 0) goto L33
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.String r1 = r2.mName
            r0.append(r1)
        L33:
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    androidx.fragment.app.Fragment trackAddedFragmentsInPop(java.util.ArrayList<androidx.fragment.app.Fragment> r6, androidx.fragment.app.Fragment r7) {
            r5 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r0 = r5.mOps
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            if (r0 < 0) goto L35
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r2 = r5.mOps
            java.lang.Object r2 = r2.get(r0)
            androidx.fragment.app.FragmentTransaction$Op r2 = (androidx.fragment.app.FragmentTransaction.C0303Op) r2
            int r3 = r2.mCmd
            if (r3 == r1) goto L2d
            r4 = 3
            if (r3 == r4) goto L27
            switch(r3) {
                case 6: goto L27;
                case 7: goto L2d;
                case 8: goto L25;
                case 9: goto L22;
                case 10: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L32
        L1d:
            androidx.lifecycle.Lifecycle$State r3 = r2.mOldMaxState
            r2.mCurrentMaxState = r3
            goto L32
        L22:
            androidx.fragment.app.Fragment r7 = r2.mFragment
            goto L32
        L25:
            r7 = 0
            goto L32
        L27:
            androidx.fragment.app.Fragment r2 = r2.mFragment
            r6.add(r2)
            goto L32
        L2d:
            androidx.fragment.app.Fragment r2 = r2.mFragment
            r6.remove(r2)
        L32:
            int r0 = r0 + (-1)
            goto L8
        L35:
            return r7
    }
}
