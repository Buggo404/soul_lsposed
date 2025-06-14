package androidx.fragment.app;

/* loaded from: classes.dex */
public abstract class FragmentTransaction {
    static final int OP_ADD = 1;
    static final int OP_ATTACH = 7;
    static final int OP_DETACH = 6;
    static final int OP_HIDE = 4;
    static final int OP_NULL = 0;
    static final int OP_REMOVE = 3;
    static final int OP_REPLACE = 2;
    static final int OP_SET_MAX_LIFECYCLE = 10;
    static final int OP_SET_PRIMARY_NAV = 8;
    static final int OP_SHOW = 5;
    static final int OP_UNSET_PRIMARY_NAV = 9;
    public static final int TRANSIT_ENTER_MASK = 4096;
    public static final int TRANSIT_EXIT_MASK = 8192;
    public static final int TRANSIT_FRAGMENT_CLOSE = 8194;
    public static final int TRANSIT_FRAGMENT_FADE = 4099;
    public static final int TRANSIT_FRAGMENT_OPEN = 4097;
    public static final int TRANSIT_NONE = 0;
    public static final int TRANSIT_UNSET = -1;
    boolean mAddToBackStack;
    boolean mAllowAddToBackStack;
    int mBreadCrumbShortTitleRes;
    java.lang.CharSequence mBreadCrumbShortTitleText;
    int mBreadCrumbTitleRes;
    java.lang.CharSequence mBreadCrumbTitleText;
    private final java.lang.ClassLoader mClassLoader;
    java.util.ArrayList<java.lang.Runnable> mCommitRunnables;
    int mEnterAnim;
    int mExitAnim;
    private final androidx.fragment.app.FragmentFactory mFragmentFactory;
    java.lang.String mName;
    java.util.ArrayList<androidx.fragment.app.FragmentTransaction.C0303Op> mOps;
    int mPopEnterAnim;
    int mPopExitAnim;
    boolean mReorderingAllowed;
    java.util.ArrayList<java.lang.String> mSharedElementSourceNames;
    java.util.ArrayList<java.lang.String> mSharedElementTargetNames;
    int mTransition;

    /* renamed from: androidx.fragment.app.FragmentTransaction$Op */
    static final class C0303Op {
        int mCmd;
        androidx.lifecycle.Lifecycle.State mCurrentMaxState;
        int mEnterAnim;
        int mExitAnim;
        androidx.fragment.app.Fragment mFragment;
        androidx.lifecycle.Lifecycle.State mOldMaxState;
        int mPopEnterAnim;
        int mPopExitAnim;

        C0303Op() {
                r0 = this;
                r0.<init>()
                return
        }

        C0303Op(int r1, androidx.fragment.app.Fragment r2) {
                r0 = this;
                r0.<init>()
                r0.mCmd = r1
                r0.mFragment = r2
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.RESUMED
                r0.mOldMaxState = r1
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.RESUMED
                r0.mCurrentMaxState = r1
                return
        }

        C0303Op(int r1, androidx.fragment.app.Fragment r2, androidx.lifecycle.Lifecycle.State r3) {
                r0 = this;
                r0.<init>()
                r0.mCmd = r1
                r0.mFragment = r2
                androidx.lifecycle.Lifecycle$State r1 = r2.mMaxState
                r0.mOldMaxState = r1
                r0.mCurrentMaxState = r3
                return
        }
    }

    @java.lang.Deprecated
    public FragmentTransaction() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mOps = r0
            r0 = 1
            r1.mAllowAddToBackStack = r0
            r0 = 0
            r1.mReorderingAllowed = r0
            r0 = 0
            r1.mFragmentFactory = r0
            r1.mClassLoader = r0
            return
    }

    FragmentTransaction(androidx.fragment.app.FragmentFactory r2, java.lang.ClassLoader r3) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mOps = r0
            r0 = 1
            r1.mAllowAddToBackStack = r0
            r0 = 0
            r1.mReorderingAllowed = r0
            r1.mFragmentFactory = r2
            r1.mClassLoader = r3
            return
    }

    private androidx.fragment.app.Fragment createFragment(java.lang.Class<? extends androidx.fragment.app.Fragment> r3, android.os.Bundle r4) {
            r2 = this;
            androidx.fragment.app.FragmentFactory r0 = r2.mFragmentFactory
            if (r0 == 0) goto L1e
            java.lang.ClassLoader r1 = r2.mClassLoader
            if (r1 == 0) goto L16
            java.lang.String r3 = r3.getName()
            androidx.fragment.app.Fragment r3 = r0.instantiate(r1, r3)
            if (r4 == 0) goto L15
            r3.setArguments(r4)
        L15:
            return r3
        L16:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "The FragmentManager must be attached to itshost to create a Fragment"
            r3.<init>(r4)
            throw r3
        L1e:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()"
            r3.<init>(r4)
            throw r3
    }

    public androidx.fragment.app.FragmentTransaction add(int r3, androidx.fragment.app.Fragment r4) {
            r2 = this;
            r0 = 0
            r1 = 1
            r2.doAddOp(r3, r4, r0, r1)
            return r2
    }

    public androidx.fragment.app.FragmentTransaction add(int r2, androidx.fragment.app.Fragment r3, java.lang.String r4) {
            r1 = this;
            r0 = 1
            r1.doAddOp(r2, r3, r4, r0)
            return r1
    }

    public final androidx.fragment.app.FragmentTransaction add(int r1, java.lang.Class<? extends androidx.fragment.app.Fragment> r2, android.os.Bundle r3) {
            r0 = this;
            androidx.fragment.app.Fragment r2 = r0.createFragment(r2, r3)
            androidx.fragment.app.FragmentTransaction r1 = r0.add(r1, r2)
            return r1
    }

    public final androidx.fragment.app.FragmentTransaction add(int r1, java.lang.Class<? extends androidx.fragment.app.Fragment> r2, android.os.Bundle r3, java.lang.String r4) {
            r0 = this;
            androidx.fragment.app.Fragment r2 = r0.createFragment(r2, r3)
            androidx.fragment.app.FragmentTransaction r1 = r0.add(r1, r2, r4)
            return r1
    }

    androidx.fragment.app.FragmentTransaction add(android.view.ViewGroup r1, androidx.fragment.app.Fragment r2, java.lang.String r3) {
            r0 = this;
            r2.mContainer = r1
            int r1 = r1.getId()
            androidx.fragment.app.FragmentTransaction r1 = r0.add(r1, r2, r3)
            return r1
    }

    public androidx.fragment.app.FragmentTransaction add(androidx.fragment.app.Fragment r3, java.lang.String r4) {
            r2 = this;
            r0 = 0
            r1 = 1
            r2.doAddOp(r0, r3, r4, r1)
            return r2
    }

    public final androidx.fragment.app.FragmentTransaction add(java.lang.Class<? extends androidx.fragment.app.Fragment> r1, android.os.Bundle r2, java.lang.String r3) {
            r0 = this;
            androidx.fragment.app.Fragment r1 = r0.createFragment(r1, r2)
            androidx.fragment.app.FragmentTransaction r1 = r0.add(r1, r3)
            return r1
    }

    void addOp(androidx.fragment.app.FragmentTransaction.C0303Op r2) {
            r1 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r0 = r1.mOps
            r0.add(r2)
            int r0 = r1.mEnterAnim
            r2.mEnterAnim = r0
            int r0 = r1.mExitAnim
            r2.mExitAnim = r0
            int r0 = r1.mPopEnterAnim
            r2.mPopEnterAnim = r0
            int r0 = r1.mPopExitAnim
            r2.mPopExitAnim = r0
            return
    }

    public androidx.fragment.app.FragmentTransaction addSharedElement(android.view.View r4, java.lang.String r5) {
            r3 = this;
            boolean r0 = androidx.fragment.app.FragmentTransition.supportsTransition()
            if (r0 == 0) goto L76
            java.lang.String r4 = androidx.core.view.ViewCompat.getTransitionName(r4)
            if (r4 == 0) goto L6e
            java.util.ArrayList<java.lang.String> r0 = r3.mSharedElementSourceNames
            if (r0 != 0) goto L1f
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.mSharedElementSourceNames = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.mSharedElementTargetNames = r0
            goto L31
        L1f:
            java.util.ArrayList<java.lang.String> r0 = r3.mSharedElementTargetNames
            boolean r0 = r0.contains(r5)
            java.lang.String r1 = "' has already been added to the transaction."
            if (r0 != 0) goto L55
            java.util.ArrayList<java.lang.String> r0 = r3.mSharedElementSourceNames
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto L3c
        L31:
            java.util.ArrayList<java.lang.String> r0 = r3.mSharedElementSourceNames
            r0.add(r4)
            java.util.ArrayList<java.lang.String> r4 = r3.mSharedElementTargetNames
            r4.add(r5)
            goto L76
        L3c:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "A shared element with the source name '"
            r0.<init>(r2)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
        L55:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "A shared element with the target name '"
            r0.<init>(r2)
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.StringBuilder r5 = r5.append(r1)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L6e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Unique transitionNames are required for all sharedElements"
            r4.<init>(r5)
            throw r4
        L76:
            return r3
    }

    public androidx.fragment.app.FragmentTransaction addToBackStack(java.lang.String r2) {
            r1 = this;
            boolean r0 = r1.mAllowAddToBackStack
            if (r0 == 0) goto La
            r0 = 1
            r1.mAddToBackStack = r0
            r1.mName = r2
            return r1
        La:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "This FragmentTransaction is not allowed to be added to the back stack."
            r2.<init>(r0)
            throw r2
    }

    public androidx.fragment.app.FragmentTransaction attach(androidx.fragment.app.Fragment r3) {
            r2 = this;
            androidx.fragment.app.FragmentTransaction$Op r0 = new androidx.fragment.app.FragmentTransaction$Op
            r1 = 7
            r0.<init>(r1, r3)
            r2.addOp(r0)
            return r2
    }

    public abstract int commit();

    public abstract int commitAllowingStateLoss();

    public abstract void commitNow();

    public abstract void commitNowAllowingStateLoss();

    public androidx.fragment.app.FragmentTransaction detach(androidx.fragment.app.Fragment r3) {
            r2 = this;
            androidx.fragment.app.FragmentTransaction$Op r0 = new androidx.fragment.app.FragmentTransaction$Op
            r1 = 6
            r0.<init>(r1, r3)
            r2.addOp(r0)
            return r2
    }

    public androidx.fragment.app.FragmentTransaction disallowAddToBackStack() {
            r2 = this;
            boolean r0 = r2.mAddToBackStack
            if (r0 != 0) goto L8
            r0 = 0
            r2.mAllowAddToBackStack = r0
            return r2
        L8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This transaction is already being added to the back stack"
            r0.<init>(r1)
            throw r0
    }

    void doAddOp(int r4, androidx.fragment.app.Fragment r5, java.lang.String r6, int r7) {
            r3 = this;
            java.lang.Class r0 = r5.getClass()
            int r1 = r0.getModifiers()
            boolean r2 = r0.isAnonymousClass()
            if (r2 != 0) goto Lc4
            boolean r2 = java.lang.reflect.Modifier.isPublic(r1)
            if (r2 == 0) goto Lc4
            boolean r2 = r0.isMemberClass()
            if (r2 == 0) goto L20
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            if (r1 == 0) goto Lc4
        L20:
            java.lang.String r0 = " now "
            java.lang.String r1 = ": was "
            if (r6 == 0) goto L5c
            java.lang.String r2 = r5.mTag
            if (r2 == 0) goto L5a
            java.lang.String r2 = r5.mTag
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L33
            goto L5a
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r2 = "Can't change tag of fragment "
            r7.<init>(r2)
            java.lang.StringBuilder r7 = r7.append(r5)
            java.lang.StringBuilder r7 = r7.append(r1)
            java.lang.String r5 = r5.mTag
            java.lang.StringBuilder r5 = r7.append(r5)
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L5a:
            r5.mTag = r6
        L5c:
            if (r4 == 0) goto Lbb
            r2 = -1
            if (r4 == r2) goto L96
            int r6 = r5.mFragmentId
            if (r6 == 0) goto L91
            int r6 = r5.mFragmentId
            if (r6 != r4) goto L6a
            goto L91
        L6a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r2 = "Can't change container ID of fragment "
            r7.<init>(r2)
            java.lang.StringBuilder r7 = r7.append(r5)
            java.lang.StringBuilder r7 = r7.append(r1)
            int r5 = r5.mFragmentId
            java.lang.StringBuilder r5 = r7.append(r5)
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.String r4 = r4.toString()
            r6.<init>(r4)
            throw r6
        L91:
            r5.mFragmentId = r4
            r5.mContainerId = r4
            goto Lbb
        L96:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Can't add fragment "
            r7.<init>(r0)
            java.lang.StringBuilder r5 = r7.append(r5)
            java.lang.String r7 = " with tag "
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = " to container view with no id"
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        Lbb:
            androidx.fragment.app.FragmentTransaction$Op r4 = new androidx.fragment.app.FragmentTransaction$Op
            r4.<init>(r7, r5)
            r3.addOp(r4)
            return
        Lc4:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Fragment "
            r5.<init>(r6)
            java.lang.String r6 = r0.getCanonicalName()
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = " must be a public static class to be  properly recreated from instance state."
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    public androidx.fragment.app.FragmentTransaction hide(androidx.fragment.app.Fragment r3) {
            r2 = this;
            androidx.fragment.app.FragmentTransaction$Op r0 = new androidx.fragment.app.FragmentTransaction$Op
            r1 = 4
            r0.<init>(r1, r3)
            r2.addOp(r0)
            return r2
    }

    public boolean isAddToBackStackAllowed() {
            r1 = this;
            boolean r0 = r1.mAllowAddToBackStack
            return r0
    }

    public boolean isEmpty() {
            r1 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r0 = r1.mOps
            boolean r0 = r0.isEmpty()
            return r0
    }

    public androidx.fragment.app.FragmentTransaction remove(androidx.fragment.app.Fragment r3) {
            r2 = this;
            androidx.fragment.app.FragmentTransaction$Op r0 = new androidx.fragment.app.FragmentTransaction$Op
            r1 = 3
            r0.<init>(r1, r3)
            r2.addOp(r0)
            return r2
    }

    public androidx.fragment.app.FragmentTransaction replace(int r2, androidx.fragment.app.Fragment r3) {
            r1 = this;
            r0 = 0
            androidx.fragment.app.FragmentTransaction r2 = r1.replace(r2, r3, r0)
            return r2
    }

    public androidx.fragment.app.FragmentTransaction replace(int r2, androidx.fragment.app.Fragment r3, java.lang.String r4) {
            r1 = this;
            if (r2 == 0) goto L7
            r0 = 2
            r1.doAddOp(r2, r3, r4, r0)
            return r1
        L7:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Must use non-zero containerViewId"
            r2.<init>(r3)
            throw r2
    }

    public final androidx.fragment.app.FragmentTransaction replace(int r2, java.lang.Class<? extends androidx.fragment.app.Fragment> r3, android.os.Bundle r4) {
            r1 = this;
            r0 = 0
            androidx.fragment.app.FragmentTransaction r2 = r1.replace(r2, r3, r4, r0)
            return r2
    }

    public final androidx.fragment.app.FragmentTransaction replace(int r1, java.lang.Class<? extends androidx.fragment.app.Fragment> r2, android.os.Bundle r3, java.lang.String r4) {
            r0 = this;
            androidx.fragment.app.Fragment r2 = r0.createFragment(r2, r3)
            androidx.fragment.app.FragmentTransaction r1 = r0.replace(r1, r2, r4)
            return r1
    }

    public androidx.fragment.app.FragmentTransaction runOnCommit(java.lang.Runnable r2) {
            r1 = this;
            r1.disallowAddToBackStack()
            java.util.ArrayList<java.lang.Runnable> r0 = r1.mCommitRunnables
            if (r0 != 0) goto Le
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mCommitRunnables = r0
        Le:
            java.util.ArrayList<java.lang.Runnable> r0 = r1.mCommitRunnables
            r0.add(r2)
            return r1
    }

    @java.lang.Deprecated
    public androidx.fragment.app.FragmentTransaction setAllowOptimization(boolean r1) {
            r0 = this;
            androidx.fragment.app.FragmentTransaction r1 = r0.setReorderingAllowed(r1)
            return r1
    }

    @java.lang.Deprecated
    public androidx.fragment.app.FragmentTransaction setBreadCrumbShortTitle(int r1) {
            r0 = this;
            r0.mBreadCrumbShortTitleRes = r1
            r1 = 0
            r0.mBreadCrumbShortTitleText = r1
            return r0
    }

    @java.lang.Deprecated
    public androidx.fragment.app.FragmentTransaction setBreadCrumbShortTitle(java.lang.CharSequence r2) {
            r1 = this;
            r0 = 0
            r1.mBreadCrumbShortTitleRes = r0
            r1.mBreadCrumbShortTitleText = r2
            return r1
    }

    @java.lang.Deprecated
    public androidx.fragment.app.FragmentTransaction setBreadCrumbTitle(int r1) {
            r0 = this;
            r0.mBreadCrumbTitleRes = r1
            r1 = 0
            r0.mBreadCrumbTitleText = r1
            return r0
    }

    @java.lang.Deprecated
    public androidx.fragment.app.FragmentTransaction setBreadCrumbTitle(java.lang.CharSequence r2) {
            r1 = this;
            r0 = 0
            r1.mBreadCrumbTitleRes = r0
            r1.mBreadCrumbTitleText = r2
            return r1
    }

    public androidx.fragment.app.FragmentTransaction setCustomAnimations(int r2, int r3) {
            r1 = this;
            r0 = 0
            androidx.fragment.app.FragmentTransaction r2 = r1.setCustomAnimations(r2, r3, r0, r0)
            return r2
    }

    public androidx.fragment.app.FragmentTransaction setCustomAnimations(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.mEnterAnim = r1
            r0.mExitAnim = r2
            r0.mPopEnterAnim = r3
            r0.mPopExitAnim = r4
            return r0
    }

    public androidx.fragment.app.FragmentTransaction setMaxLifecycle(androidx.fragment.app.Fragment r3, androidx.lifecycle.Lifecycle.State r4) {
            r2 = this;
            androidx.fragment.app.FragmentTransaction$Op r0 = new androidx.fragment.app.FragmentTransaction$Op
            r1 = 10
            r0.<init>(r1, r3, r4)
            r2.addOp(r0)
            return r2
    }

    public androidx.fragment.app.FragmentTransaction setPrimaryNavigationFragment(androidx.fragment.app.Fragment r3) {
            r2 = this;
            androidx.fragment.app.FragmentTransaction$Op r0 = new androidx.fragment.app.FragmentTransaction$Op
            r1 = 8
            r0.<init>(r1, r3)
            r2.addOp(r0)
            return r2
    }

    public androidx.fragment.app.FragmentTransaction setReorderingAllowed(boolean r1) {
            r0 = this;
            r0.mReorderingAllowed = r1
            return r0
    }

    public androidx.fragment.app.FragmentTransaction setTransition(int r1) {
            r0 = this;
            r0.mTransition = r1
            return r0
    }

    @java.lang.Deprecated
    public androidx.fragment.app.FragmentTransaction setTransitionStyle(int r1) {
            r0 = this;
            return r0
    }

    public androidx.fragment.app.FragmentTransaction show(androidx.fragment.app.Fragment r3) {
            r2 = this;
            androidx.fragment.app.FragmentTransaction$Op r0 = new androidx.fragment.app.FragmentTransaction$Op
            r1 = 5
            r0.<init>(r1, r3)
            r2.addOp(r0)
            return r2
    }
}
