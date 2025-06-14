package androidx.fragment.app;

/* loaded from: classes.dex */
class FragmentLayoutInflaterFactory implements android.view.LayoutInflater.Factory2 {
    private static final java.lang.String TAG = "FragmentManager";
    final androidx.fragment.app.FragmentManager mFragmentManager;


    FragmentLayoutInflaterFactory(androidx.fragment.app.FragmentManager r1) {
            r0 = this;
            r0.<init>()
            r0.mFragmentManager = r1
            return
    }

    @Override // android.view.LayoutInflater.Factory2
    public android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
            r8 = this;
            java.lang.Class<androidx.fragment.app.FragmentContainerView> r0 = androidx.fragment.app.FragmentContainerView.class
            java.lang.String r0 = r0.getName()
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentContainerView r9 = new androidx.fragment.app.FragmentContainerView
            androidx.fragment.app.FragmentManager r10 = r8.mFragmentManager
            r9.<init>(r11, r12, r10)
            return r9
        L14:
            java.lang.String r0 = "fragment"
            boolean r10 = r0.equals(r10)
            r0 = 0
            if (r10 != 0) goto L1e
            return r0
        L1e:
            java.lang.String r10 = "class"
            java.lang.String r10 = r12.getAttributeValue(r0, r10)
            int[] r1 = androidx.fragment.C0252R.styleable.Fragment
            android.content.res.TypedArray r1 = r11.obtainStyledAttributes(r12, r1)
            if (r10 != 0) goto L32
            int r10 = androidx.fragment.C0252R.styleable.Fragment_android_name
            java.lang.String r10 = r1.getString(r10)
        L32:
            int r2 = androidx.fragment.C0252R.styleable.Fragment_android_id
            r3 = -1
            int r2 = r1.getResourceId(r2, r3)
            int r4 = androidx.fragment.C0252R.styleable.Fragment_android_tag
            java.lang.String r4 = r1.getString(r4)
            r1.recycle()
            if (r10 == 0) goto L1e3
            java.lang.ClassLoader r1 = r11.getClassLoader()
            boolean r1 = androidx.fragment.app.FragmentFactory.isFragmentClass(r1, r10)
            if (r1 != 0) goto L50
            goto L1e3
        L50:
            if (r9 == 0) goto L57
            int r1 = r9.getId()
            goto L58
        L57:
            r1 = 0
        L58:
            if (r1 != r3) goto L80
            if (r2 != r3) goto L80
            if (r4 == 0) goto L5f
            goto L80
        L5f:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = r12.getPositionDescription()
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.String r12 = ": Must specify unique android:id, android:tag, or have a parent with an id for "
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.StringBuilder r10 = r11.append(r10)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L80:
            if (r2 == r3) goto L88
            androidx.fragment.app.FragmentManager r0 = r8.mFragmentManager
            androidx.fragment.app.Fragment r0 = r0.findFragmentById(r2)
        L88:
            if (r0 != 0) goto L92
            if (r4 == 0) goto L92
            androidx.fragment.app.FragmentManager r0 = r8.mFragmentManager
            androidx.fragment.app.Fragment r0 = r0.findFragmentByTag(r4)
        L92:
            if (r0 != 0) goto L9c
            if (r1 == r3) goto L9c
            androidx.fragment.app.FragmentManager r0 = r8.mFragmentManager
            androidx.fragment.app.Fragment r0 = r0.findFragmentById(r1)
        L9c:
            java.lang.String r3 = "Fragment "
            java.lang.String r5 = "FragmentManager"
            r6 = 2
            r7 = 1
            if (r0 != 0) goto L107
            androidx.fragment.app.FragmentManager r0 = r8.mFragmentManager
            androidx.fragment.app.FragmentFactory r0 = r0.getFragmentFactory()
            java.lang.ClassLoader r11 = r11.getClassLoader()
            androidx.fragment.app.Fragment r0 = r0.instantiate(r11, r10)
            r0.mFromLayout = r7
            if (r2 == 0) goto Lb8
            r11 = r2
            goto Lb9
        Lb8:
            r11 = r1
        Lb9:
            r0.mFragmentId = r11
            r0.mContainerId = r1
            r0.mTag = r4
            r0.mInLayout = r7
            androidx.fragment.app.FragmentManager r11 = r8.mFragmentManager
            r0.mFragmentManager = r11
            androidx.fragment.app.FragmentManager r11 = r8.mFragmentManager
            androidx.fragment.app.FragmentHostCallback r11 = r11.getHost()
            r0.mHost = r11
            androidx.fragment.app.FragmentManager r11 = r8.mFragmentManager
            androidx.fragment.app.FragmentHostCallback r11 = r11.getHost()
            android.content.Context r11 = r11.getContext()
            android.os.Bundle r1 = r0.mSavedFragmentState
            r0.onInflate(r11, r12, r1)
            androidx.fragment.app.FragmentManager r11 = r8.mFragmentManager
            androidx.fragment.app.FragmentStateManager r11 = r11.addFragment(r0)
            boolean r12 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r6)
            if (r12 == 0) goto L154
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r3)
            java.lang.StringBuilder r12 = r12.append(r0)
            java.lang.String r1 = " has been inflated via the <fragment> tag: id=0x"
            java.lang.StringBuilder r12 = r12.append(r1)
            java.lang.String r1 = java.lang.Integer.toHexString(r2)
            java.lang.StringBuilder r12 = r12.append(r1)
            java.lang.String r12 = r12.toString()
            android.util.Log.v(r5, r12)
            goto L154
        L107:
            boolean r11 = r0.mInLayout
            if (r11 != 0) goto L19c
            r0.mInLayout = r7
            androidx.fragment.app.FragmentManager r11 = r8.mFragmentManager
            r0.mFragmentManager = r11
            androidx.fragment.app.FragmentManager r11 = r8.mFragmentManager
            androidx.fragment.app.FragmentHostCallback r11 = r11.getHost()
            r0.mHost = r11
            androidx.fragment.app.FragmentManager r11 = r8.mFragmentManager
            androidx.fragment.app.FragmentHostCallback r11 = r11.getHost()
            android.content.Context r11 = r11.getContext()
            android.os.Bundle r1 = r0.mSavedFragmentState
            r0.onInflate(r11, r12, r1)
            androidx.fragment.app.FragmentManager r11 = r8.mFragmentManager
            androidx.fragment.app.FragmentStateManager r11 = r11.createOrGetFragmentStateManager(r0)
            boolean r12 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r6)
            if (r12 == 0) goto L154
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r1 = "Retained Fragment "
            r12.<init>(r1)
            java.lang.StringBuilder r12 = r12.append(r0)
            java.lang.String r1 = " has been re-attached via the <fragment> tag: id=0x"
            java.lang.StringBuilder r12 = r12.append(r1)
            java.lang.String r1 = java.lang.Integer.toHexString(r2)
            java.lang.StringBuilder r12 = r12.append(r1)
            java.lang.String r12 = r12.toString()
            android.util.Log.v(r5, r12)
        L154:
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            r0.mContainer = r9
            r11.moveToExpectedState()
            r11.ensureInflatedView()
            android.view.View r9 = r0.mView
            if (r9 == 0) goto L183
            if (r2 == 0) goto L169
            android.view.View r9 = r0.mView
            r9.setId(r2)
        L169:
            android.view.View r9 = r0.mView
            java.lang.Object r9 = r9.getTag()
            if (r9 != 0) goto L176
            android.view.View r9 = r0.mView
            r9.setTag(r4)
        L176:
            android.view.View r9 = r0.mView
            androidx.fragment.app.FragmentLayoutInflaterFactory$1 r10 = new androidx.fragment.app.FragmentLayoutInflaterFactory$1
            r10.<init>(r8, r11)
            r9.addOnAttachStateChangeListener(r10)
            android.view.View r9 = r0.mView
            return r9
        L183:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r3)
            java.lang.StringBuilder r10 = r11.append(r10)
            java.lang.String r11 = " did not create a view."
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L19c:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = r12.getPositionDescription()
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.String r12 = ": Duplicate id 0x"
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.String r12 = java.lang.Integer.toHexString(r2)
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.String r12 = ", tag "
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.StringBuilder r11 = r11.append(r4)
            java.lang.String r12 = ", or parent id 0x"
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.String r12 = java.lang.Integer.toHexString(r1)
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.String r12 = " with another fragment for "
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.StringBuilder r10 = r11.append(r10)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L1e3:
            return r0
    }

    @Override // android.view.LayoutInflater.Factory
    public android.view.View onCreateView(java.lang.String r2, android.content.Context r3, android.util.AttributeSet r4) {
            r1 = this;
            r0 = 0
            android.view.View r2 = r1.onCreateView(r0, r2, r3, r4)
            return r2
    }
}
