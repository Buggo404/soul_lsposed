package androidx.fragment.app;

/* loaded from: classes.dex */
public final class FragmentContainerView extends android.widget.FrameLayout {
    private android.view.View.OnApplyWindowInsetsListener mApplyWindowInsetsListener;
    private java.util.ArrayList<android.view.View> mDisappearingFragmentChildren;
    private boolean mDrawDisappearingViewsFirst;
    private java.util.ArrayList<android.view.View> mTransitioningFragmentViews;

    public FragmentContainerView(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1
            r0.mDrawDisappearingViewsFirst = r1
            return
    }

    public FragmentContainerView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public FragmentContainerView(android.content.Context r3, android.util.AttributeSet r4, int r5) {
            r2 = this;
            r2.<init>(r3, r4, r5)
            r5 = 1
            r2.mDrawDisappearingViewsFirst = r5
            if (r4 == 0) goto L50
            java.lang.String r5 = r4.getClassAttribute()
            int[] r0 = androidx.fragment.C0252R.styleable.FragmentContainerView
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r0)
            if (r5 != 0) goto L1d
            int r4 = androidx.fragment.C0252R.styleable.FragmentContainerView_android_name
            java.lang.String r5 = r3.getString(r4)
            java.lang.String r4 = "android:name"
            goto L1f
        L1d:
            java.lang.String r4 = "class"
        L1f:
            r3.recycle()
            if (r5 == 0) goto L50
            boolean r3 = r2.isInEditMode()
            if (r3 == 0) goto L2b
            goto L50
        L2b:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FragmentContainerView must be within a FragmentActivity to use "
            r0.<init>(r1)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r0 = "=\""
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = "\""
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L50:
            return
    }

    FragmentContainerView(android.content.Context r6, android.util.AttributeSet r7, androidx.fragment.app.FragmentManager r8) {
            r5 = this;
            r5.<init>(r6, r7)
            r0 = 1
            r5.mDrawDisappearingViewsFirst = r0
            java.lang.String r1 = r7.getClassAttribute()
            int[] r2 = androidx.fragment.C0252R.styleable.FragmentContainerView
            android.content.res.TypedArray r2 = r6.obtainStyledAttributes(r7, r2)
            if (r1 != 0) goto L18
            int r1 = androidx.fragment.C0252R.styleable.FragmentContainerView_android_name
            java.lang.String r1 = r2.getString(r1)
        L18:
            int r3 = androidx.fragment.C0252R.styleable.FragmentContainerView_android_tag
            java.lang.String r3 = r2.getString(r3)
            r2.recycle()
            int r2 = r5.getId()
            androidx.fragment.app.Fragment r4 = r8.findFragmentById(r2)
            if (r1 == 0) goto L7b
            if (r4 != 0) goto L7b
            if (r2 > 0) goto L5c
            if (r3 == 0) goto L41
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = " with tag "
            r6.<init>(r7)
            java.lang.StringBuilder r6 = r6.append(r3)
            java.lang.String r6 = r6.toString()
            goto L43
        L41:
            java.lang.String r6 = ""
        L43:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "FragmentContainerView must have an android:id to add Fragment "
            r8.<init>(r0)
            java.lang.StringBuilder r8 = r8.append(r1)
            java.lang.StringBuilder r6 = r8.append(r6)
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
        L5c:
            androidx.fragment.app.FragmentFactory r2 = r8.getFragmentFactory()
            java.lang.ClassLoader r4 = r6.getClassLoader()
            androidx.fragment.app.Fragment r1 = r2.instantiate(r4, r1)
            r2 = 0
            r1.onInflate(r6, r7, r2)
            androidx.fragment.app.FragmentTransaction r6 = r8.beginTransaction()
            androidx.fragment.app.FragmentTransaction r6 = r6.setReorderingAllowed(r0)
            androidx.fragment.app.FragmentTransaction r6 = r6.add(r5, r1, r3)
            r6.commitNowAllowingStateLoss()
        L7b:
            r8.onContainerAvailable(r5)
            return
    }

    private void addDisappearingFragmentView(android.view.View r2) {
            r1 = this;
            java.util.ArrayList<android.view.View> r0 = r1.mTransitioningFragmentViews
            if (r0 == 0) goto L1a
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L1a
            java.util.ArrayList<android.view.View> r0 = r1.mDisappearingFragmentChildren
            if (r0 != 0) goto L15
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mDisappearingFragmentChildren = r0
        L15:
            java.util.ArrayList<android.view.View> r0 = r1.mDisappearingFragmentChildren
            r0.add(r2)
        L1a:
            return
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View r2, int r3, android.view.ViewGroup.LayoutParams r4) {
            r1 = this;
            androidx.fragment.app.Fragment r0 = androidx.fragment.app.FragmentManager.getViewFragment(r2)
            if (r0 == 0) goto La
            super.addView(r2, r3, r4)
            return
        La:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "Views added to a FragmentContainerView must be associated with a Fragment. View "
            r4.<init>(r0)
            java.lang.StringBuilder r2 = r4.append(r2)
            java.lang.String r4 = " is not associated with a Fragment."
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(android.view.View r2, int r3, android.view.ViewGroup.LayoutParams r4, boolean r5) {
            r1 = this;
            androidx.fragment.app.Fragment r0 = androidx.fragment.app.FragmentManager.getViewFragment(r2)
            if (r0 == 0) goto Lb
            boolean r2 = super.addViewInLayout(r2, r3, r4, r5)
            return r2
        Lb:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Views added to a FragmentContainerView must be associated with a Fragment. View "
            r4.<init>(r5)
            java.lang.StringBuilder r2 = r4.append(r2)
            java.lang.String r4 = " is not associated with a Fragment."
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    @Override // android.view.ViewGroup, android.view.View
    public android.view.WindowInsets dispatchApplyWindowInsets(android.view.WindowInsets r5) {
            r4 = this;
            androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r5)
            android.view.View$OnApplyWindowInsetsListener r1 = r4.mApplyWindowInsetsListener
            if (r1 == 0) goto L11
            android.view.WindowInsets r0 = r1.onApplyWindowInsets(r4, r5)
            androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r0)
            goto L15
        L11:
            androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.ViewCompat.onApplyWindowInsets(r4, r0)
        L15:
            boolean r1 = r0.isConsumed()
            if (r1 != 0) goto L2c
            int r1 = r4.getChildCount()
            r2 = 0
        L20:
            if (r2 >= r1) goto L2c
            android.view.View r3 = r4.getChildAt(r2)
            androidx.core.view.ViewCompat.dispatchApplyWindowInsets(r3, r0)
            int r2 = r2 + 1
            goto L20
        L2c:
            return r5
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(android.graphics.Canvas r5) {
            r4 = this;
            boolean r0 = r4.mDrawDisappearingViewsFirst
            if (r0 == 0) goto L23
            java.util.ArrayList<android.view.View> r0 = r4.mDisappearingFragmentChildren
            if (r0 == 0) goto L23
            r0 = 0
        L9:
            java.util.ArrayList<android.view.View> r1 = r4.mDisappearingFragmentChildren
            int r1 = r1.size()
            if (r0 >= r1) goto L23
            java.util.ArrayList<android.view.View> r1 = r4.mDisappearingFragmentChildren
            java.lang.Object r1 = r1.get(r0)
            android.view.View r1 = (android.view.View) r1
            long r2 = r4.getDrawingTime()
            super.drawChild(r5, r1, r2)
            int r0 = r0 + 1
            goto L9
        L23:
            super.dispatchDraw(r5)
            return
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(android.graphics.Canvas r2, android.view.View r3, long r4) {
            r1 = this;
            boolean r0 = r1.mDrawDisappearingViewsFirst
            if (r0 == 0) goto L18
            java.util.ArrayList<android.view.View> r0 = r1.mDisappearingFragmentChildren
            if (r0 == 0) goto L18
            int r0 = r0.size()
            if (r0 <= 0) goto L18
            java.util.ArrayList<android.view.View> r0 = r1.mDisappearingFragmentChildren
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L18
            r2 = 0
            return r2
        L18:
            boolean r2 = super.drawChild(r2, r3, r4)
            return r2
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(android.view.View r2) {
            r1 = this;
            java.util.ArrayList<android.view.View> r0 = r1.mTransitioningFragmentViews
            if (r0 == 0) goto L14
            r0.remove(r2)
            java.util.ArrayList<android.view.View> r0 = r1.mDisappearingFragmentChildren
            if (r0 == 0) goto L14
            boolean r0 = r0.remove(r2)
            if (r0 == 0) goto L14
            r0 = 1
            r1.mDrawDisappearingViewsFirst = r0
        L14:
            super.endViewTransition(r2)
            return
    }

    @Override // android.view.View
    public android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets r1) {
            r0 = this;
            return r1
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
            r2 = this;
            int r0 = r2.getChildCount()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L12
            android.view.View r1 = r2.getChildAt(r0)
            r2.addDisappearingFragmentView(r1)
            int r0 = r0 + (-1)
            goto L6
        L12:
            super.removeAllViewsInLayout()
            return
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(android.view.View r1, boolean r2) {
            r0 = this;
            if (r2 == 0) goto L5
            r0.addDisappearingFragmentView(r1)
        L5:
            super.removeDetachedView(r1, r2)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(android.view.View r1) {
            r0 = this;
            r0.addDisappearingFragmentView(r1)
            super.removeView(r1)
            return
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int r2) {
            r1 = this;
            android.view.View r0 = r1.getChildAt(r2)
            r1.addDisappearingFragmentView(r0)
            super.removeViewAt(r2)
            return
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(android.view.View r1) {
            r0 = this;
            r0.addDisappearingFragmentView(r1)
            super.removeViewInLayout(r1)
            return
    }

    @Override // android.view.ViewGroup
    public void removeViews(int r3, int r4) {
            r2 = this;
            r0 = r3
        L1:
            int r1 = r3 + r4
            if (r0 >= r1) goto Lf
            android.view.View r1 = r2.getChildAt(r0)
            r2.addDisappearingFragmentView(r1)
            int r0 = r0 + 1
            goto L1
        Lf:
            super.removeViews(r3, r4)
            return
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int r3, int r4) {
            r2 = this;
            r0 = r3
        L1:
            int r1 = r3 + r4
            if (r0 >= r1) goto Lf
            android.view.View r1 = r2.getChildAt(r0)
            r2.addDisappearingFragmentView(r1)
            int r0 = r0 + 1
            goto L1
        Lf:
            super.removeViewsInLayout(r3, r4)
            return
    }

    void setDrawDisappearingViewsLast(boolean r1) {
            r0 = this;
            r0.mDrawDisappearingViewsFirst = r1
            return
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(android.animation.LayoutTransition r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\"."
            r2.<init>(r0)
            throw r2
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(android.view.View.OnApplyWindowInsetsListener r1) {
            r0 = this;
            r0.mApplyWindowInsetsListener = r1
            return
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(android.view.View r2) {
            r1 = this;
            android.view.ViewParent r0 = r2.getParent()
            if (r0 != r1) goto L16
            java.util.ArrayList<android.view.View> r0 = r1.mTransitioningFragmentViews
            if (r0 != 0) goto L11
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mTransitioningFragmentViews = r0
        L11:
            java.util.ArrayList<android.view.View> r0 = r1.mTransitioningFragmentViews
            r0.add(r2)
        L16:
            super.startViewTransition(r2)
            return
    }
}
