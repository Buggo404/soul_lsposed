package androidx.fragment.app;

@java.lang.Deprecated
/* loaded from: classes.dex */
public abstract class FragmentPagerAdapter extends androidx.viewpager.widget.PagerAdapter {
    public static final int BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT = 1;

    @java.lang.Deprecated
    public static final int BEHAVIOR_SET_USER_VISIBLE_HINT = 0;
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "FragmentPagerAdapter";
    private final int mBehavior;
    private androidx.fragment.app.FragmentTransaction mCurTransaction;
    private androidx.fragment.app.Fragment mCurrentPrimaryItem;
    private boolean mExecutingFinishUpdate;
    private final androidx.fragment.app.FragmentManager mFragmentManager;

    @java.lang.Deprecated
    public FragmentPagerAdapter(androidx.fragment.app.FragmentManager r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public FragmentPagerAdapter(androidx.fragment.app.FragmentManager r2, int r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mCurTransaction = r0
            r1.mCurrentPrimaryItem = r0
            r1.mFragmentManager = r2
            r1.mBehavior = r3
            return
    }

    private static java.lang.String makeFragmentName(int r2, long r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "android:switcher:"
            r0.<init>(r1)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r0 = ":"
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            return r2
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(android.view.ViewGroup r1, int r2, java.lang.Object r3) {
            r0 = this;
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            androidx.fragment.app.FragmentTransaction r1 = r0.mCurTransaction
            if (r1 != 0) goto Le
            androidx.fragment.app.FragmentManager r1 = r0.mFragmentManager
            androidx.fragment.app.FragmentTransaction r1 = r1.beginTransaction()
            r0.mCurTransaction = r1
        Le:
            androidx.fragment.app.FragmentTransaction r1 = r0.mCurTransaction
            r1.detach(r3)
            androidx.fragment.app.Fragment r1 = r0.mCurrentPrimaryItem
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L1e
            r1 = 0
            r0.mCurrentPrimaryItem = r1
        L1e:
            return
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void finishUpdate(android.view.ViewGroup r3) {
            r2 = this;
            androidx.fragment.app.FragmentTransaction r3 = r2.mCurTransaction
            if (r3 == 0) goto L19
            boolean r0 = r2.mExecutingFinishUpdate
            if (r0 != 0) goto L16
            r0 = 1
            r1 = 0
            r2.mExecutingFinishUpdate = r0     // Catch: java.lang.Throwable -> L12
            r3.commitNowAllowingStateLoss()     // Catch: java.lang.Throwable -> L12
            r2.mExecutingFinishUpdate = r1
            goto L16
        L12:
            r3 = move-exception
            r2.mExecutingFinishUpdate = r1
            throw r3
        L16:
            r3 = 0
            r2.mCurTransaction = r3
        L19:
            return
    }

    public abstract androidx.fragment.app.Fragment getItem(int r1);

    public long getItemId(int r3) {
            r2 = this;
            long r0 = (long) r3
            return r0
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public java.lang.Object instantiateItem(android.view.ViewGroup r5, int r6) {
            r4 = this;
            androidx.fragment.app.FragmentTransaction r0 = r4.mCurTransaction
            if (r0 != 0) goto Lc
            androidx.fragment.app.FragmentManager r0 = r4.mFragmentManager
            androidx.fragment.app.FragmentTransaction r0 = r0.beginTransaction()
            r4.mCurTransaction = r0
        Lc:
            long r0 = r4.getItemId(r6)
            int r2 = r5.getId()
            java.lang.String r2 = makeFragmentName(r2, r0)
            androidx.fragment.app.FragmentManager r3 = r4.mFragmentManager
            androidx.fragment.app.Fragment r2 = r3.findFragmentByTag(r2)
            if (r2 == 0) goto L26
            androidx.fragment.app.FragmentTransaction r5 = r4.mCurTransaction
            r5.attach(r2)
            goto L3b
        L26:
            androidx.fragment.app.Fragment r2 = r4.getItem(r6)
            androidx.fragment.app.FragmentTransaction r6 = r4.mCurTransaction
            int r3 = r5.getId()
            int r5 = r5.getId()
            java.lang.String r5 = makeFragmentName(r5, r0)
            r6.add(r3, r2, r5)
        L3b:
            androidx.fragment.app.Fragment r5 = r4.mCurrentPrimaryItem
            if (r2 == r5) goto L53
            r5 = 0
            r2.setMenuVisibility(r5)
            int r6 = r4.mBehavior
            r0 = 1
            if (r6 != r0) goto L50
            androidx.fragment.app.FragmentTransaction r5 = r4.mCurTransaction
            androidx.lifecycle.Lifecycle$State r6 = androidx.lifecycle.Lifecycle.State.STARTED
            r5.setMaxLifecycle(r2, r6)
            goto L53
        L50:
            r2.setUserVisibleHint(r5)
        L53:
            return r2
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(android.view.View r1, java.lang.Object r2) {
            r0 = this;
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            android.view.View r2 = r2.getView()
            if (r2 != r1) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            return r1
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void restoreState(android.os.Parcelable r1, java.lang.ClassLoader r2) {
            r0 = this;
            return
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public android.os.Parcelable saveState() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(android.view.ViewGroup r3, int r4, java.lang.Object r5) {
            r2 = this;
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            androidx.fragment.app.Fragment r3 = r2.mCurrentPrimaryItem
            if (r5 == r3) goto L4c
            r4 = 1
            if (r3 == 0) goto L2c
            r0 = 0
            r3.setMenuVisibility(r0)
            int r3 = r2.mBehavior
            if (r3 != r4) goto L27
            androidx.fragment.app.FragmentTransaction r3 = r2.mCurTransaction
            if (r3 != 0) goto L1d
            androidx.fragment.app.FragmentManager r3 = r2.mFragmentManager
            androidx.fragment.app.FragmentTransaction r3 = r3.beginTransaction()
            r2.mCurTransaction = r3
        L1d:
            androidx.fragment.app.FragmentTransaction r3 = r2.mCurTransaction
            androidx.fragment.app.Fragment r0 = r2.mCurrentPrimaryItem
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.STARTED
            r3.setMaxLifecycle(r0, r1)
            goto L2c
        L27:
            androidx.fragment.app.Fragment r3 = r2.mCurrentPrimaryItem
            r3.setUserVisibleHint(r0)
        L2c:
            r5.setMenuVisibility(r4)
            int r3 = r2.mBehavior
            if (r3 != r4) goto L47
            androidx.fragment.app.FragmentTransaction r3 = r2.mCurTransaction
            if (r3 != 0) goto L3f
            androidx.fragment.app.FragmentManager r3 = r2.mFragmentManager
            androidx.fragment.app.FragmentTransaction r3 = r3.beginTransaction()
            r2.mCurTransaction = r3
        L3f:
            androidx.fragment.app.FragmentTransaction r3 = r2.mCurTransaction
            androidx.lifecycle.Lifecycle$State r4 = androidx.lifecycle.Lifecycle.State.RESUMED
            r3.setMaxLifecycle(r5, r4)
            goto L4a
        L47:
            r5.setUserVisibleHint(r4)
        L4a:
            r2.mCurrentPrimaryItem = r5
        L4c:
            return
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void startUpdate(android.view.ViewGroup r3) {
            r2 = this;
            int r3 = r3.getId()
            r0 = -1
            if (r3 == r0) goto L8
            return
        L8:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ViewPager with adapter "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r1 = " requires a view id"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }
}
