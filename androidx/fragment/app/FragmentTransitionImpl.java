package androidx.fragment.app;

/* loaded from: classes.dex */
public abstract class FragmentTransitionImpl {




    public FragmentTransitionImpl() {
            r0 = this;
            r0.<init>()
            return
    }

    protected static void bfsAddViewChildren(java.util.List<android.view.View> r6, android.view.View r7) {
            int r0 = r6.size()
            boolean r1 = containedBeforeIndex(r6, r7, r0)
            if (r1 == 0) goto Lb
            return
        Lb:
            java.lang.String r1 = androidx.core.view.ViewCompat.getTransitionName(r7)
            if (r1 == 0) goto L14
            r6.add(r7)
        L14:
            r7 = r0
        L15:
            int r1 = r6.size()
            if (r7 >= r1) goto L47
            java.lang.Object r1 = r6.get(r7)
            android.view.View r1 = (android.view.View) r1
            boolean r2 = r1 instanceof android.view.ViewGroup
            if (r2 == 0) goto L44
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            int r2 = r1.getChildCount()
            r3 = 0
        L2c:
            if (r3 >= r2) goto L44
            android.view.View r4 = r1.getChildAt(r3)
            boolean r5 = containedBeforeIndex(r6, r4, r0)
            if (r5 != 0) goto L41
            java.lang.String r5 = androidx.core.view.ViewCompat.getTransitionName(r4)
            if (r5 == 0) goto L41
            r6.add(r4)
        L41:
            int r3 = r3 + 1
            goto L2c
        L44:
            int r7 = r7 + 1
            goto L15
        L47:
            return
    }

    private static boolean containedBeforeIndex(java.util.List<android.view.View> r3, android.view.View r4, int r5) {
            r0 = 0
            r1 = r0
        L2:
            if (r1 >= r5) goto Lf
            java.lang.Object r2 = r3.get(r1)
            if (r2 != r4) goto Lc
            r3 = 1
            return r3
        Lc:
            int r1 = r1 + 1
            goto L2
        Lf:
            return r0
    }

    static java.lang.String findKeyForValue(java.util.Map<java.lang.String, java.lang.String> r2, java.lang.String r3) {
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getValue()
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L8
            java.lang.Object r2 = r0.getKey()
            java.lang.String r2 = (java.lang.String) r2
            return r2
        L25:
            r2 = 0
            return r2
    }

    protected static boolean isNullOrEmpty(java.util.List r0) {
            if (r0 == 0) goto Lb
            boolean r0 = r0.isEmpty()
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

    public abstract void addTarget(java.lang.Object r1, android.view.View r2);

    public abstract void addTargets(java.lang.Object r1, java.util.ArrayList<android.view.View> r2);

    public abstract void beginDelayedTransition(android.view.ViewGroup r1, java.lang.Object r2);

    public abstract boolean canHandle(java.lang.Object r1);

    void captureTransitioningViews(java.util.ArrayList<android.view.View> r4, android.view.View r5) {
            r3 = this;
            int r0 = r5.getVisibility()
            if (r0 != 0) goto L2a
            boolean r0 = r5 instanceof android.view.ViewGroup
            if (r0 == 0) goto L27
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            boolean r0 = androidx.core.view.ViewGroupCompat.isTransitionGroup(r5)
            if (r0 == 0) goto L16
            r4.add(r5)
            goto L2a
        L16:
            int r0 = r5.getChildCount()
            r1 = 0
        L1b:
            if (r1 >= r0) goto L2a
            android.view.View r2 = r5.getChildAt(r1)
            r3.captureTransitioningViews(r4, r2)
            int r1 = r1 + 1
            goto L1b
        L27:
            r4.add(r5)
        L2a:
            return
    }

    public abstract java.lang.Object cloneTransition(java.lang.Object r1);

    void findNamedViews(java.util.Map<java.lang.String, android.view.View> r4, android.view.View r5) {
            r3 = this;
            int r0 = r5.getVisibility()
            if (r0 != 0) goto L26
            java.lang.String r0 = androidx.core.view.ViewCompat.getTransitionName(r5)
            if (r0 == 0) goto Lf
            r4.put(r0, r5)
        Lf:
            boolean r0 = r5 instanceof android.view.ViewGroup
            if (r0 == 0) goto L26
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            int r0 = r5.getChildCount()
            r1 = 0
        L1a:
            if (r1 >= r0) goto L26
            android.view.View r2 = r5.getChildAt(r1)
            r3.findNamedViews(r4, r2)
            int r1 = r1 + 1
            goto L1a
        L26:
            return
    }

    protected void getBoundsOnScreen(android.view.View r5, android.graphics.Rect r6) {
            r4 = this;
            boolean r0 = androidx.core.view.ViewCompat.isAttachedToWindow(r5)
            if (r0 != 0) goto L7
            return
        L7:
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            int r1 = r5.getWidth()
            float r1 = (float) r1
            int r2 = r5.getHeight()
            float r2 = (float) r2
            r3 = 0
            r0.set(r3, r3, r1, r2)
            android.graphics.Matrix r1 = r5.getMatrix()
            r1.mapRect(r0)
            int r1 = r5.getLeft()
            float r1 = (float) r1
            int r2 = r5.getTop()
            float r2 = (float) r2
            r0.offset(r1, r2)
            android.view.ViewParent r1 = r5.getParent()
        L32:
            boolean r2 = r1 instanceof android.view.View
            if (r2 == 0) goto L60
            android.view.View r1 = (android.view.View) r1
            int r2 = r1.getScrollX()
            int r2 = -r2
            float r2 = (float) r2
            int r3 = r1.getScrollY()
            int r3 = -r3
            float r3 = (float) r3
            r0.offset(r2, r3)
            android.graphics.Matrix r2 = r1.getMatrix()
            r2.mapRect(r0)
            int r2 = r1.getLeft()
            float r2 = (float) r2
            int r3 = r1.getTop()
            float r3 = (float) r3
            r0.offset(r2, r3)
            android.view.ViewParent r1 = r1.getParent()
            goto L32
        L60:
            r1 = 2
            int[] r1 = new int[r1]
            android.view.View r5 = r5.getRootView()
            r5.getLocationOnScreen(r1)
            r5 = 0
            r5 = r1[r5]
            float r5 = (float) r5
            r2 = 1
            r1 = r1[r2]
            float r1 = (float) r1
            r0.offset(r5, r1)
            float r5 = r0.left
            int r5 = java.lang.Math.round(r5)
            float r1 = r0.top
            int r1 = java.lang.Math.round(r1)
            float r2 = r0.right
            int r2 = java.lang.Math.round(r2)
            float r0 = r0.bottom
            int r0 = java.lang.Math.round(r0)
            r6.set(r5, r1, r2, r0)
            return
    }

    public abstract java.lang.Object mergeTransitionsInSequence(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3);

    public abstract java.lang.Object mergeTransitionsTogether(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3);

    java.util.ArrayList<java.lang.String> prepareSetNameOverridesReordered(java.util.ArrayList<android.view.View> r6) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r6.size()
            r2 = 0
        La:
            if (r2 >= r1) goto L20
            java.lang.Object r3 = r6.get(r2)
            android.view.View r3 = (android.view.View) r3
            java.lang.String r4 = androidx.core.view.ViewCompat.getTransitionName(r3)
            r0.add(r4)
            r4 = 0
            androidx.core.view.ViewCompat.setTransitionName(r3, r4)
            int r2 = r2 + 1
            goto La
        L20:
            return r0
    }

    public abstract void removeTarget(java.lang.Object r1, android.view.View r2);

    public abstract void replaceTargets(java.lang.Object r1, java.util.ArrayList<android.view.View> r2, java.util.ArrayList<android.view.View> r3);

    public abstract void scheduleHideFragmentView(java.lang.Object r1, android.view.View r2, java.util.ArrayList<android.view.View> r3);

    void scheduleNameReset(android.view.ViewGroup r2, java.util.ArrayList<android.view.View> r3, java.util.Map<java.lang.String, java.lang.String> r4) {
            r1 = this;
            androidx.fragment.app.FragmentTransitionImpl$3 r0 = new androidx.fragment.app.FragmentTransitionImpl$3
            r0.<init>(r1, r3, r4)
            androidx.core.view.OneShotPreDrawListener.add(r2, r0)
            return
    }

    public abstract void scheduleRemoveTargets(java.lang.Object r1, java.lang.Object r2, java.util.ArrayList<android.view.View> r3, java.lang.Object r4, java.util.ArrayList<android.view.View> r5, java.lang.Object r6, java.util.ArrayList<android.view.View> r7);

    public abstract void setEpicenter(java.lang.Object r1, android.graphics.Rect r2);

    public abstract void setEpicenter(java.lang.Object r1, android.view.View r2);

    public void setListenerForTransitionEnd(androidx.fragment.app.Fragment r1, java.lang.Object r2, androidx.core.os.CancellationSignal r3, java.lang.Runnable r4) {
            r0 = this;
            r4.run()
            return
    }

    void setNameOverridesOrdered(android.view.View r2, java.util.ArrayList<android.view.View> r3, java.util.Map<java.lang.String, java.lang.String> r4) {
            r1 = this;
            androidx.fragment.app.FragmentTransitionImpl$2 r0 = new androidx.fragment.app.FragmentTransitionImpl$2
            r0.<init>(r1, r3, r4)
            androidx.core.view.OneShotPreDrawListener.add(r2, r0)
            return
    }

    void setNameOverridesReordered(android.view.View r9, java.util.ArrayList<android.view.View> r10, java.util.ArrayList<android.view.View> r11, java.util.ArrayList<java.lang.String> r12, java.util.Map<java.lang.String, java.lang.String> r13) {
            r8 = this;
            int r2 = r11.size()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r0 = 0
            r1 = r0
        Lb:
            if (r1 >= r2) goto L44
            java.lang.Object r3 = r10.get(r1)
            android.view.View r3 = (android.view.View) r3
            java.lang.String r4 = androidx.core.view.ViewCompat.getTransitionName(r3)
            r6.add(r4)
            if (r4 != 0) goto L1d
            goto L41
        L1d:
            r5 = 0
            androidx.core.view.ViewCompat.setTransitionName(r3, r5)
            java.lang.Object r3 = r13.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            r5 = r0
        L28:
            if (r5 >= r2) goto L41
            java.lang.Object r7 = r12.get(r5)
            boolean r7 = r3.equals(r7)
            if (r7 == 0) goto L3e
            java.lang.Object r3 = r11.get(r5)
            android.view.View r3 = (android.view.View) r3
            androidx.core.view.ViewCompat.setTransitionName(r3, r4)
            goto L41
        L3e:
            int r5 = r5 + 1
            goto L28
        L41:
            int r1 = r1 + 1
            goto Lb
        L44:
            androidx.fragment.app.FragmentTransitionImpl$1 r13 = new androidx.fragment.app.FragmentTransitionImpl$1
            r0 = r13
            r1 = r8
            r3 = r11
            r4 = r12
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            androidx.core.view.OneShotPreDrawListener.add(r9, r13)
            return
    }

    public abstract void setSharedElementTargets(java.lang.Object r1, android.view.View r2, java.util.ArrayList<android.view.View> r3);

    public abstract void swapSharedElementTargets(java.lang.Object r1, java.util.ArrayList<android.view.View> r2, java.util.ArrayList<android.view.View> r3);

    public abstract java.lang.Object wrapTransitionInSet(java.lang.Object r1);
}
