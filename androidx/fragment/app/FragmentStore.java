package androidx.fragment.app;

/* loaded from: classes.dex */
class FragmentStore {
    private static final java.lang.String TAG = "FragmentManager";
    private final java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> mActive;
    private final java.util.ArrayList<androidx.fragment.app.Fragment> mAdded;
    private androidx.fragment.app.FragmentManagerViewModel mNonConfig;

    FragmentStore() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mAdded = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mActive = r0
            return
    }

    void addFragment(androidx.fragment.app.Fragment r4) {
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r3.mAdded
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto L18
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r3.mAdded
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r3.mAdded     // Catch: java.lang.Throwable -> L15
            r1.add(r4)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            r0 = 1
            r4.mAdded = r0
            return
        L15:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r4
        L18:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment already added: "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    void burpActive() {
            r2 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r0 = r2.mActive
            java.util.Collection r0 = r0.values()
            r1 = 0
            java.util.Set r1 = java.util.Collections.singleton(r1)
            r0.removeAll(r1)
            return
    }

    boolean containsActiveFragment(java.lang.String r2) {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r0 = r1.mActive
            java.lang.Object r2 = r0.get(r2)
            if (r2 == 0) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            return r2
    }

    void dispatchStateChange(int r3) {
            r2 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r0 = r2.mActive
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.FragmentStateManager r1 = (androidx.fragment.app.FragmentStateManager) r1
            if (r1 == 0) goto La
            r1.setFragmentManagerState(r3)
            goto La
        L1c:
            return
    }

    void dump(java.lang.String r4, java.io.FileDescriptor r5, java.io.PrintWriter r6, java.lang.String[] r7) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r1 = "    "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r1 = r3.mActive
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L4f
            r6.print(r4)
            java.lang.String r1 = "Active Fragments:"
            r6.println(r1)
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r1 = r3.mActive
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L2d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4f
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.FragmentStateManager r2 = (androidx.fragment.app.FragmentStateManager) r2
            r6.print(r4)
            if (r2 == 0) goto L49
            androidx.fragment.app.Fragment r2 = r2.getFragment()
            r6.println(r2)
            r2.dump(r0, r5, r6, r7)
            goto L2d
        L49:
            java.lang.String r2 = "null"
            r6.println(r2)
            goto L2d
        L4f:
            java.util.ArrayList<androidx.fragment.app.Fragment> r5 = r3.mAdded
            int r5 = r5.size()
            if (r5 <= 0) goto L84
            r6.print(r4)
            java.lang.String r7 = "Added Fragments:"
            r6.println(r7)
            r7 = 0
        L60:
            if (r7 >= r5) goto L84
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r3.mAdded
            java.lang.Object r0 = r0.get(r7)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            r6.print(r4)
            java.lang.String r1 = "  #"
            r6.print(r1)
            r6.print(r7)
            java.lang.String r1 = ": "
            r6.print(r1)
            java.lang.String r0 = r0.toString()
            r6.println(r0)
            int r7 = r7 + 1
            goto L60
        L84:
            return
    }

    androidx.fragment.app.Fragment findActiveFragment(java.lang.String r2) {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r0 = r1.mActive
            java.lang.Object r2 = r0.get(r2)
            androidx.fragment.app.FragmentStateManager r2 = (androidx.fragment.app.FragmentStateManager) r2
            if (r2 == 0) goto Lf
            androidx.fragment.app.Fragment r2 = r2.getFragment()
            return r2
        Lf:
            r2 = 0
            return r2
    }

    androidx.fragment.app.Fragment findFragmentById(int r4) {
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r3.mAdded
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L1c
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r3.mAdded
            java.lang.Object r1 = r1.get(r0)
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L19
            int r2 = r1.mFragmentId
            if (r2 != r4) goto L19
            return r1
        L19:
            int r0 = r0 + (-1)
            goto L8
        L1c:
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r0 = r3.mActive
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L26:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.FragmentStateManager r1 = (androidx.fragment.app.FragmentStateManager) r1
            if (r1 == 0) goto L26
            androidx.fragment.app.Fragment r1 = r1.getFragment()
            int r2 = r1.mFragmentId
            if (r2 != r4) goto L26
            return r1
        L3d:
            r4 = 0
            return r4
    }

    androidx.fragment.app.Fragment findFragmentByTag(java.lang.String r4) {
            r3 = this;
            if (r4 == 0) goto L22
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r3.mAdded
            int r0 = r0.size()
            int r0 = r0 + (-1)
        La:
            if (r0 < 0) goto L22
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r3.mAdded
            java.lang.Object r1 = r1.get(r0)
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L1f
            java.lang.String r2 = r1.mTag
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L1f
            return r1
        L1f:
            int r0 = r0 + (-1)
            goto La
        L22:
            if (r4 == 0) goto L49
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r0 = r3.mActive
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L2e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L49
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.FragmentStateManager r1 = (androidx.fragment.app.FragmentStateManager) r1
            if (r1 == 0) goto L2e
            androidx.fragment.app.Fragment r1 = r1.getFragment()
            java.lang.String r2 = r1.mTag
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L2e
            return r1
        L49:
            r4 = 0
            return r4
    }

    androidx.fragment.app.Fragment findFragmentByWho(java.lang.String r3) {
            r2 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r0 = r2.mActive
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.FragmentStateManager r1 = (androidx.fragment.app.FragmentStateManager) r1
            if (r1 == 0) goto La
            androidx.fragment.app.Fragment r1 = r1.getFragment()
            androidx.fragment.app.Fragment r1 = r1.findFragmentByWho(r3)
            if (r1 == 0) goto La
            return r1
        L23:
            r3 = 0
            return r3
    }

    int findFragmentIndexInContainer(androidx.fragment.app.Fragment r6) {
            r5 = this;
            android.view.ViewGroup r0 = r6.mContainer
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.util.ArrayList<androidx.fragment.app.Fragment> r2 = r5.mAdded
            int r6 = r2.indexOf(r6)
            int r2 = r6 + (-1)
        Le:
            if (r2 < 0) goto L2c
            java.util.ArrayList<androidx.fragment.app.Fragment> r3 = r5.mAdded
            java.lang.Object r3 = r3.get(r2)
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            android.view.ViewGroup r4 = r3.mContainer
            if (r4 != r0) goto L29
            android.view.View r4 = r3.mView
            if (r4 == 0) goto L29
            android.view.View r6 = r3.mView
            int r6 = r0.indexOfChild(r6)
            int r6 = r6 + 1
            return r6
        L29:
            int r2 = r2 + (-1)
            goto Le
        L2c:
            int r6 = r6 + 1
            java.util.ArrayList<androidx.fragment.app.Fragment> r2 = r5.mAdded
            int r2 = r2.size()
            if (r6 >= r2) goto L4e
            java.util.ArrayList<androidx.fragment.app.Fragment> r2 = r5.mAdded
            java.lang.Object r2 = r2.get(r6)
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            android.view.ViewGroup r3 = r2.mContainer
            if (r3 != r0) goto L4d
            android.view.View r3 = r2.mView
            if (r3 == 0) goto L4d
            android.view.View r6 = r2.mView
            int r6 = r0.indexOfChild(r6)
            return r6
        L4d:
            goto L2c
        L4e:
            return r1
    }

    int getActiveFragmentCount() {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r0 = r1.mActive
            int r0 = r0.size()
            return r0
    }

    java.util.List<androidx.fragment.app.FragmentStateManager> getActiveFragmentStateManagers() {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r1 = r3.mActive
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L21
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.FragmentStateManager r2 = (androidx.fragment.app.FragmentStateManager) r2
            if (r2 == 0) goto Lf
            r0.add(r2)
            goto Lf
        L21:
            return r0
    }

    java.util.List<androidx.fragment.app.Fragment> getActiveFragments() {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r1 = r3.mActive
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2a
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.FragmentStateManager r2 = (androidx.fragment.app.FragmentStateManager) r2
            if (r2 == 0) goto L25
            androidx.fragment.app.Fragment r2 = r2.getFragment()
            r0.add(r2)
            goto Lf
        L25:
            r2 = 0
            r0.add(r2)
            goto Lf
        L2a:
            return r0
    }

    androidx.fragment.app.FragmentStateManager getFragmentStateManager(java.lang.String r2) {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r0 = r1.mActive
            java.lang.Object r2 = r0.get(r2)
            androidx.fragment.app.FragmentStateManager r2 = (androidx.fragment.app.FragmentStateManager) r2
            return r2
    }

    java.util.List<androidx.fragment.app.Fragment> getFragments() {
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r3.mAdded
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        Ld:
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r3.mAdded
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L19
            java.util.ArrayList<androidx.fragment.app.Fragment> r2 = r3.mAdded     // Catch: java.lang.Throwable -> L19
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L19
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return r1
        L19:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r1
    }

    androidx.fragment.app.FragmentManagerViewModel getNonConfig() {
            r1 = this;
            androidx.fragment.app.FragmentManagerViewModel r0 = r1.mNonConfig
            return r0
    }

    void makeActive(androidx.fragment.app.FragmentStateManager r4) {
            r3 = this;
            androidx.fragment.app.Fragment r0 = r4.getFragment()
            java.lang.String r1 = r0.mWho
            boolean r1 = r3.containsActiveFragment(r1)
            if (r1 == 0) goto Ld
            return
        Ld:
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r1 = r3.mActive
            java.lang.String r2 = r0.mWho
            r1.put(r2, r4)
            boolean r4 = r0.mRetainInstanceChangedWhileDetached
            if (r4 == 0) goto L2a
            boolean r4 = r0.mRetainInstance
            if (r4 == 0) goto L22
            androidx.fragment.app.FragmentManagerViewModel r4 = r3.mNonConfig
            r4.addRetainedFragment(r0)
            goto L27
        L22:
            androidx.fragment.app.FragmentManagerViewModel r4 = r3.mNonConfig
            r4.removeRetainedFragment(r0)
        L27:
            r4 = 0
            r0.mRetainInstanceChangedWhileDetached = r4
        L2a:
            r4 = 2
            boolean r4 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r4)
            if (r4 == 0) goto L45
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r1 = "Added fragment to active set "
            r4.<init>(r1)
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "FragmentManager"
            android.util.Log.v(r0, r4)
        L45:
            return
    }

    void makeInactive(androidx.fragment.app.FragmentStateManager r4) {
            r3 = this;
            androidx.fragment.app.Fragment r4 = r4.getFragment()
            boolean r0 = r4.mRetainInstance
            if (r0 == 0) goto Ld
            androidx.fragment.app.FragmentManagerViewModel r0 = r3.mNonConfig
            r0.removeRetainedFragment(r4)
        Ld:
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r0 = r3.mActive
            java.lang.String r1 = r4.mWho
            r2 = 0
            java.lang.Object r0 = r0.put(r1, r2)
            androidx.fragment.app.FragmentStateManager r0 = (androidx.fragment.app.FragmentStateManager) r0
            if (r0 != 0) goto L1b
            return
        L1b:
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Removed fragment from active set "
            r0.<init>(r1)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "FragmentManager"
            android.util.Log.v(r0, r4)
        L36:
            return
    }

    void moveToExpectedState() {
            r4 = this;
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r4.mAdded
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r2 = r4.mActive
            java.lang.String r1 = r1.mWho
            java.lang.Object r1 = r2.get(r1)
            androidx.fragment.app.FragmentStateManager r1 = (androidx.fragment.app.FragmentStateManager) r1
            if (r1 == 0) goto L6
            r1.moveToExpectedState()
            goto L6
        L22:
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r0 = r4.mActive
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L2c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L54
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.FragmentStateManager r1 = (androidx.fragment.app.FragmentStateManager) r1
            if (r1 == 0) goto L2c
            r1.moveToExpectedState()
            androidx.fragment.app.Fragment r2 = r1.getFragment()
            boolean r3 = r2.mRemoving
            if (r3 == 0) goto L4d
            boolean r2 = r2.isInBackStack()
            if (r2 != 0) goto L4d
            r2 = 1
            goto L4e
        L4d:
            r2 = 0
        L4e:
            if (r2 == 0) goto L2c
            r4.makeInactive(r1)
            goto L2c
        L54:
            return
    }

    void removeFragment(androidx.fragment.app.Fragment r3) {
            r2 = this;
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r2.mAdded
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r2.mAdded     // Catch: java.lang.Throwable -> Ld
            r1.remove(r3)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            r0 = 0
            r3.mAdded = r0
            return
        Ld:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r3
    }

    void resetActiveFragments() {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r0 = r1.mActive
            r0.clear()
            return
    }

    void restoreAddedFragments(java.util.List<java.lang.String> r5) {
            r4 = this;
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r4.mAdded
            r0.clear()
            if (r5 == 0) goto L61
            java.util.Iterator r5 = r5.iterator()
        Lb:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L61
            java.lang.Object r0 = r5.next()
            java.lang.String r0 = (java.lang.String) r0
            androidx.fragment.app.Fragment r1 = r4.findActiveFragment(r0)
            if (r1 == 0) goto L46
            r2 = 2
            boolean r2 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r2)
            if (r2 == 0) goto L42
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "restoreSaveState: added ("
            r2.<init>(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r2 = "): "
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.v(r2, r0)
        L42:
            r4.addFragment(r1)
            goto Lb
        L46:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "No instantiated fragment for ("
            r1.<init>(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L61:
            return
    }

    java.util.ArrayList<androidx.fragment.app.FragmentState> saveActiveFragments() {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r1 = r6.mActive
            int r1 = r1.size()
            r0.<init>(r1)
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r1 = r6.mActive
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L15:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L56
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.FragmentStateManager r2 = (androidx.fragment.app.FragmentStateManager) r2
            if (r2 == 0) goto L15
            androidx.fragment.app.Fragment r3 = r2.getFragment()
            androidx.fragment.app.FragmentState r2 = r2.saveState()
            r0.add(r2)
            r4 = 2
            boolean r4 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r4)
            if (r4 == 0) goto L15
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Saved state of "
            r4.<init>(r5)
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r4 = ": "
            java.lang.StringBuilder r3 = r3.append(r4)
            android.os.Bundle r2 = r2.mSavedFragmentState
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "FragmentManager"
            android.util.Log.v(r3, r2)
            goto L15
        L56:
            return r0
    }

    java.util.ArrayList<java.lang.String> saveAddedFragments() {
            r7 = this;
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r7.mAdded
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r7.mAdded     // Catch: java.lang.Throwable -> L5e
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L5e
            if (r1 == 0) goto Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5e
            r0 = 0
            return r0
        Le:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L5e
            java.util.ArrayList<androidx.fragment.app.Fragment> r2 = r7.mAdded     // Catch: java.lang.Throwable -> L5e
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L5e
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L5e
            java.util.ArrayList<androidx.fragment.app.Fragment> r2 = r7.mAdded     // Catch: java.lang.Throwable -> L5e
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L5e
        L1f:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L5e
            if (r3 == 0) goto L5c
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L5e
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3     // Catch: java.lang.Throwable -> L5e
            java.lang.String r4 = r3.mWho     // Catch: java.lang.Throwable -> L5e
            r1.add(r4)     // Catch: java.lang.Throwable -> L5e
            r4 = 2
            boolean r4 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r4)     // Catch: java.lang.Throwable -> L5e
            if (r4 == 0) goto L1f
            java.lang.String r4 = "FragmentManager"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5e
            r5.<init>()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r6 = "saveAllState: adding fragment ("
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r6 = r3.mWho     // Catch: java.lang.Throwable -> L5e
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r6 = "): "
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.Throwable -> L5e
            java.lang.StringBuilder r3 = r5.append(r3)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L5e
            android.util.Log.v(r4, r3)     // Catch: java.lang.Throwable -> L5e
            goto L1f
        L5c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5e
            return r1
        L5e:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5e
            throw r1
    }

    void setNonConfig(androidx.fragment.app.FragmentManagerViewModel r1) {
            r0 = this;
            r0.mNonConfig = r1
            return
    }
}
