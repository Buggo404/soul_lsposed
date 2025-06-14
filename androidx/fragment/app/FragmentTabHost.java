package androidx.fragment.app;

@java.lang.Deprecated
/* loaded from: classes.dex */
public class FragmentTabHost extends android.widget.TabHost implements android.widget.TabHost.OnTabChangeListener {
    private boolean mAttached;
    private int mContainerId;
    private android.content.Context mContext;
    private androidx.fragment.app.FragmentManager mFragmentManager;
    private androidx.fragment.app.FragmentTabHost.TabInfo mLastTab;
    private android.widget.TabHost.OnTabChangeListener mOnTabChangeListener;
    private android.widget.FrameLayout mRealTabContent;
    private final java.util.ArrayList<androidx.fragment.app.FragmentTabHost.TabInfo> mTabs;

    static class DummyTabFactory implements android.widget.TabHost.TabContentFactory {
        private final android.content.Context mContext;

        public DummyTabFactory(android.content.Context r1) {
                r0 = this;
                r0.<init>()
                r0.mContext = r1
                return
        }

        @Override // android.widget.TabHost.TabContentFactory
        public android.view.View createTabContent(java.lang.String r2) {
                r1 = this;
                android.view.View r2 = new android.view.View
                android.content.Context r0 = r1.mContext
                r2.<init>(r0)
                r0 = 0
                r2.setMinimumWidth(r0)
                r2.setMinimumHeight(r0)
                return r2
        }
    }

    static class SavedState extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<androidx.fragment.app.FragmentTabHost.SavedState> CREATOR = null;
        java.lang.String curTab;


        static {
                androidx.fragment.app.FragmentTabHost$SavedState$1 r0 = new androidx.fragment.app.FragmentTabHost$SavedState$1
                r0.<init>()
                androidx.fragment.app.FragmentTabHost.SavedState.CREATOR = r0
                return
        }

        SavedState(android.os.Parcel r1) {
                r0 = this;
                r0.<init>(r1)
                java.lang.String r1 = r1.readString()
                r0.curTab = r1
                return
        }

        SavedState(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "FragmentTabHost.SavedState{"
                r0.<init>(r1)
                int r1 = java.lang.System.identityHashCode(r2)
                java.lang.String r1 = java.lang.Integer.toHexString(r1)
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = " curTab="
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = r2.curTab
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "}"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                java.lang.String r2 = r0.curTab
                r1.writeString(r2)
                return
        }
    }

    static final class TabInfo {
        final android.os.Bundle args;
        final java.lang.Class<?> clss;
        androidx.fragment.app.Fragment fragment;
        final java.lang.String tag;

        TabInfo(java.lang.String r1, java.lang.Class<?> r2, android.os.Bundle r3) {
                r0 = this;
                r0.<init>()
                r0.tag = r1
                r0.clss = r2
                r0.args = r3
                return
        }
    }

    @java.lang.Deprecated
    public FragmentTabHost(android.content.Context r3) {
            r2 = this;
            r0 = 0
            r2.<init>(r3, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.mTabs = r1
            r2.initFragmentTabHost(r3, r0)
            return
    }

    @java.lang.Deprecated
    public FragmentTabHost(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mTabs = r0
            r1.initFragmentTabHost(r2, r3)
            return
    }

    private androidx.fragment.app.FragmentTransaction doTabChanged(java.lang.String r4, androidx.fragment.app.FragmentTransaction r5) {
            r3 = this;
            androidx.fragment.app.FragmentTabHost$TabInfo r4 = r3.getTabInfoForTag(r4)
            androidx.fragment.app.FragmentTabHost$TabInfo r0 = r3.mLastTab
            if (r0 == r4) goto L55
            if (r5 != 0) goto L10
            androidx.fragment.app.FragmentManager r5 = r3.mFragmentManager
            androidx.fragment.app.FragmentTransaction r5 = r5.beginTransaction()
        L10:
            androidx.fragment.app.FragmentTabHost$TabInfo r0 = r3.mLastTab
            if (r0 == 0) goto L1f
            androidx.fragment.app.Fragment r0 = r0.fragment
            if (r0 == 0) goto L1f
            androidx.fragment.app.FragmentTabHost$TabInfo r0 = r3.mLastTab
            androidx.fragment.app.Fragment r0 = r0.fragment
            r5.detach(r0)
        L1f:
            if (r4 == 0) goto L53
            androidx.fragment.app.Fragment r0 = r4.fragment
            if (r0 != 0) goto L4e
            androidx.fragment.app.FragmentManager r0 = r3.mFragmentManager
            androidx.fragment.app.FragmentFactory r0 = r0.getFragmentFactory()
            android.content.Context r1 = r3.mContext
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.lang.Class<?> r2 = r4.clss
            java.lang.String r2 = r2.getName()
            androidx.fragment.app.Fragment r0 = r0.instantiate(r1, r2)
            r4.fragment = r0
            androidx.fragment.app.Fragment r0 = r4.fragment
            android.os.Bundle r1 = r4.args
            r0.setArguments(r1)
            int r0 = r3.mContainerId
            androidx.fragment.app.Fragment r1 = r4.fragment
            java.lang.String r2 = r4.tag
            r5.add(r0, r1, r2)
            goto L53
        L4e:
            androidx.fragment.app.Fragment r0 = r4.fragment
            r5.attach(r0)
        L53:
            r3.mLastTab = r4
        L55:
            return r5
    }

    private void ensureContent() {
            r3 = this;
            android.widget.FrameLayout r0 = r3.mRealTabContent
            if (r0 != 0) goto L28
            int r0 = r3.mContainerId
            android.view.View r0 = r3.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r3.mRealTabContent = r0
            if (r0 == 0) goto L11
            goto L28
        L11:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "No tab content FrameLayout found for id "
            r1.<init>(r2)
            int r2 = r3.mContainerId
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L28:
            return
    }

    private void ensureHierarchy(android.content.Context r8) {
            r7 = this;
            r0 = 16908307(0x1020013, float:2.3877282E-38)
            android.view.View r1 = r7.findViewById(r0)
            if (r1 != 0) goto L5a
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r8)
            r2 = 1
            r1.setOrientation(r2)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = -1
            r2.<init>(r3, r3)
            r7.addView(r1, r2)
            android.widget.TabWidget r2 = new android.widget.TabWidget
            r2.<init>(r8)
            r2.setId(r0)
            r0 = 0
            r2.setOrientation(r0)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r5 = -2
            r6 = 0
            r4.<init>(r3, r5, r6)
            r1.addView(r2, r4)
            android.widget.FrameLayout r2 = new android.widget.FrameLayout
            r2.<init>(r8)
            r4 = 16908305(0x1020011, float:2.3877277E-38)
            r2.setId(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r4.<init>(r0, r0, r6)
            r1.addView(r2, r4)
            android.widget.FrameLayout r2 = new android.widget.FrameLayout
            r2.<init>(r8)
            r7.mRealTabContent = r2
            int r8 = r7.mContainerId
            r2.setId(r8)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r4 = 1065353216(0x3f800000, float:1.0)
            r8.<init>(r3, r0, r4)
            r1.addView(r2, r8)
        L5a:
            return
    }

    private androidx.fragment.app.FragmentTabHost.TabInfo getTabInfoForTag(java.lang.String r5) {
            r4 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentTabHost$TabInfo> r0 = r4.mTabs
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L1d
            java.util.ArrayList<androidx.fragment.app.FragmentTabHost$TabInfo> r2 = r4.mTabs
            java.lang.Object r2 = r2.get(r1)
            androidx.fragment.app.FragmentTabHost$TabInfo r2 = (androidx.fragment.app.FragmentTabHost.TabInfo) r2
            java.lang.String r3 = r2.tag
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L1a
            return r2
        L1a:
            int r1 = r1 + 1
            goto L7
        L1d:
            r5 = 0
            return r5
    }

    private void initFragmentTabHost(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 16842995(0x10100f3, float:2.369424E-38)
            r2 = 0
            r0[r2] = r1
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r0, r2, r2)
            int r5 = r4.getResourceId(r2, r2)
            r3.mContainerId = r5
            r4.recycle()
            super.setOnTabChangedListener(r3)
            return
    }

    @java.lang.Deprecated
    public void addTab(android.widget.TabHost.TabSpec r3, java.lang.Class<?> r4, android.os.Bundle r5) {
            r2 = this;
            androidx.fragment.app.FragmentTabHost$DummyTabFactory r0 = new androidx.fragment.app.FragmentTabHost$DummyTabFactory
            android.content.Context r1 = r2.mContext
            r0.<init>(r1)
            r3.setContent(r0)
            java.lang.String r0 = r3.getTag()
            androidx.fragment.app.FragmentTabHost$TabInfo r1 = new androidx.fragment.app.FragmentTabHost$TabInfo
            r1.<init>(r0, r4, r5)
            boolean r4 = r2.mAttached
            if (r4 == 0) goto L39
            androidx.fragment.app.FragmentManager r4 = r2.mFragmentManager
            androidx.fragment.app.Fragment r4 = r4.findFragmentByTag(r0)
            r1.fragment = r4
            androidx.fragment.app.Fragment r4 = r1.fragment
            if (r4 == 0) goto L39
            androidx.fragment.app.Fragment r4 = r1.fragment
            boolean r4 = r4.isDetached()
            if (r4 != 0) goto L39
            androidx.fragment.app.FragmentManager r4 = r2.mFragmentManager
            androidx.fragment.app.FragmentTransaction r4 = r4.beginTransaction()
            androidx.fragment.app.Fragment r5 = r1.fragment
            r4.detach(r5)
            r4.commit()
        L39:
            java.util.ArrayList<androidx.fragment.app.FragmentTabHost$TabInfo> r4 = r2.mTabs
            r4.add(r1)
            r2.addTab(r3)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    @java.lang.Deprecated
    protected void onAttachedToWindow() {
            r7 = this;
            super.onAttachedToWindow()
            java.lang.String r0 = r7.getCurrentTabTag()
            java.util.ArrayList<androidx.fragment.app.FragmentTabHost$TabInfo> r1 = r7.mTabs
            int r1 = r1.size()
            r2 = 0
            r3 = 0
        Lf:
            if (r3 >= r1) goto L4a
            java.util.ArrayList<androidx.fragment.app.FragmentTabHost$TabInfo> r4 = r7.mTabs
            java.lang.Object r4 = r4.get(r3)
            androidx.fragment.app.FragmentTabHost$TabInfo r4 = (androidx.fragment.app.FragmentTabHost.TabInfo) r4
            androidx.fragment.app.FragmentManager r5 = r7.mFragmentManager
            java.lang.String r6 = r4.tag
            androidx.fragment.app.Fragment r5 = r5.findFragmentByTag(r6)
            r4.fragment = r5
            androidx.fragment.app.Fragment r5 = r4.fragment
            if (r5 == 0) goto L47
            androidx.fragment.app.Fragment r5 = r4.fragment
            boolean r5 = r5.isDetached()
            if (r5 != 0) goto L47
            java.lang.String r5 = r4.tag
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L3a
            r7.mLastTab = r4
            goto L47
        L3a:
            if (r2 != 0) goto L42
            androidx.fragment.app.FragmentManager r2 = r7.mFragmentManager
            androidx.fragment.app.FragmentTransaction r2 = r2.beginTransaction()
        L42:
            androidx.fragment.app.Fragment r4 = r4.fragment
            r2.detach(r4)
        L47:
            int r3 = r3 + 1
            goto Lf
        L4a:
            r1 = 1
            r7.mAttached = r1
            androidx.fragment.app.FragmentTransaction r0 = r7.doTabChanged(r0, r2)
            if (r0 == 0) goto L5b
            r0.commit()
            androidx.fragment.app.FragmentManager r0 = r7.mFragmentManager
            r0.executePendingTransactions()
        L5b:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    @java.lang.Deprecated
    protected void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            r0 = 0
            r1.mAttached = r0
            return
    }

    @Override // android.view.View
    @java.lang.Deprecated
    protected void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.fragment.app.FragmentTabHost.SavedState
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            androidx.fragment.app.FragmentTabHost$SavedState r2 = (androidx.fragment.app.FragmentTabHost.SavedState) r2
            android.os.Parcelable r0 = r2.getSuperState()
            super.onRestoreInstanceState(r0)
            java.lang.String r2 = r2.curTab
            r1.setCurrentTabByTag(r2)
            return
    }

    @Override // android.view.View
    @java.lang.Deprecated
    protected android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            androidx.fragment.app.FragmentTabHost$SavedState r1 = new androidx.fragment.app.FragmentTabHost$SavedState
            r1.<init>(r0)
            java.lang.String r0 = r2.getCurrentTabTag()
            r1.curTab = r0
            return r1
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    @java.lang.Deprecated
    public void onTabChanged(java.lang.String r2) {
            r1 = this;
            boolean r0 = r1.mAttached
            if (r0 == 0) goto Le
            r0 = 0
            androidx.fragment.app.FragmentTransaction r0 = r1.doTabChanged(r2, r0)
            if (r0 == 0) goto Le
            r0.commit()
        Le:
            android.widget.TabHost$OnTabChangeListener r0 = r1.mOnTabChangeListener
            if (r0 == 0) goto L15
            r0.onTabChanged(r2)
        L15:
            return
    }

    @Override // android.widget.TabHost
    @java.lang.Deprecated
    public void setOnTabChangedListener(android.widget.TabHost.OnTabChangeListener r1) {
            r0 = this;
            r0.mOnTabChangeListener = r1
            return
    }

    @Override // android.widget.TabHost
    @java.lang.Deprecated
    public void setup() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Must call setup() that takes a Context and FragmentManager"
            r0.<init>(r1)
            throw r0
    }

    @java.lang.Deprecated
    public void setup(android.content.Context r1, androidx.fragment.app.FragmentManager r2) {
            r0 = this;
            r0.ensureHierarchy(r1)
            super.setup()
            r0.mContext = r1
            r0.mFragmentManager = r2
            r0.ensureContent()
            return
    }

    @java.lang.Deprecated
    public void setup(android.content.Context r1, androidx.fragment.app.FragmentManager r2, int r3) {
            r0 = this;
            r0.ensureHierarchy(r1)
            super.setup()
            r0.mContext = r1
            r0.mFragmentManager = r2
            r0.mContainerId = r3
            r0.ensureContent()
            android.widget.FrameLayout r1 = r0.mRealTabContent
            r1.setId(r3)
            int r1 = r0.getId()
            r2 = -1
            if (r1 != r2) goto L21
            r1 = 16908306(0x1020012, float:2.387728E-38)
            r0.setId(r1)
        L21:
            return
    }
}
