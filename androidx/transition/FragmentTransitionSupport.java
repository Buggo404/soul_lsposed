package androidx.transition;

/* loaded from: classes.dex */
public class FragmentTransitionSupport extends androidx.fragment.app.FragmentTransitionImpl {





    public FragmentTransitionSupport() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean hasSimpleTarget(androidx.transition.Transition r1) {
            java.util.List r0 = r1.getTargetIds()
            boolean r0 = isNullOrEmpty(r0)
            if (r0 == 0) goto L21
            java.util.List r0 = r1.getTargetNames()
            boolean r0 = isNullOrEmpty(r0)
            if (r0 == 0) goto L21
            java.util.List r1 = r1.getTargetTypes()
            boolean r1 = isNullOrEmpty(r1)
            if (r1 != 0) goto L1f
            goto L21
        L1f:
            r1 = 0
            goto L22
        L21:
            r1 = 1
        L22:
            return r1
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void addTarget(java.lang.Object r1, android.view.View r2) {
            r0 = this;
            if (r1 == 0) goto L7
            androidx.transition.Transition r1 = (androidx.transition.Transition) r1
            r1.addTarget(r2)
        L7:
            return
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void addTargets(java.lang.Object r4, java.util.ArrayList<android.view.View> r5) {
            r3 = this;
            androidx.transition.Transition r4 = (androidx.transition.Transition) r4
            if (r4 != 0) goto L5
            return
        L5:
            boolean r0 = r4 instanceof androidx.transition.TransitionSet
            r1 = 0
            if (r0 == 0) goto L1c
            androidx.transition.TransitionSet r4 = (androidx.transition.TransitionSet) r4
            int r0 = r4.getTransitionCount()
        L10:
            if (r1 >= r0) goto L3e
            androidx.transition.Transition r2 = r4.getTransitionAt(r1)
            r3.addTargets(r2, r5)
            int r1 = r1 + 1
            goto L10
        L1c:
            boolean r0 = hasSimpleTarget(r4)
            if (r0 != 0) goto L3e
            java.util.List r0 = r4.getTargets()
            boolean r0 = isNullOrEmpty(r0)
            if (r0 == 0) goto L3e
            int r0 = r5.size()
        L30:
            if (r1 >= r0) goto L3e
            java.lang.Object r2 = r5.get(r1)
            android.view.View r2 = (android.view.View) r2
            r4.addTarget(r2)
            int r1 = r1 + 1
            goto L30
        L3e:
            return
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void beginDelayedTransition(android.view.ViewGroup r1, java.lang.Object r2) {
            r0 = this;
            androidx.transition.Transition r2 = (androidx.transition.Transition) r2
            androidx.transition.TransitionManager.beginDelayedTransition(r1, r2)
            return
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public boolean canHandle(java.lang.Object r1) {
            r0 = this;
            boolean r1 = r1 instanceof androidx.transition.Transition
            return r1
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public java.lang.Object cloneTransition(java.lang.Object r1) {
            r0 = this;
            if (r1 == 0) goto L9
            androidx.transition.Transition r1 = (androidx.transition.Transition) r1
            androidx.transition.Transition r1 = r1.clone()
            goto La
        L9:
            r1 = 0
        La:
            return r1
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public java.lang.Object mergeTransitionsInSequence(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            androidx.transition.Transition r2 = (androidx.transition.Transition) r2
            androidx.transition.Transition r3 = (androidx.transition.Transition) r3
            androidx.transition.Transition r4 = (androidx.transition.Transition) r4
            if (r2 == 0) goto L1d
            if (r3 == 0) goto L1d
            androidx.transition.TransitionSet r0 = new androidx.transition.TransitionSet
            r0.<init>()
            androidx.transition.TransitionSet r2 = r0.addTransition(r2)
            androidx.transition.TransitionSet r2 = r2.addTransition(r3)
            r3 = 1
            androidx.transition.TransitionSet r2 = r2.setOrdering(r3)
            goto L25
        L1d:
            if (r2 == 0) goto L20
            goto L25
        L20:
            if (r3 == 0) goto L24
            r2 = r3
            goto L25
        L24:
            r2 = 0
        L25:
            if (r4 == 0) goto L35
            androidx.transition.TransitionSet r3 = new androidx.transition.TransitionSet
            r3.<init>()
            if (r2 == 0) goto L31
            r3.addTransition(r2)
        L31:
            r3.addTransition(r4)
            return r3
        L35:
            return r2
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public java.lang.Object mergeTransitionsTogether(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            androidx.transition.TransitionSet r0 = new androidx.transition.TransitionSet
            r0.<init>()
            if (r2 == 0) goto Lc
            androidx.transition.Transition r2 = (androidx.transition.Transition) r2
            r0.addTransition(r2)
        Lc:
            if (r3 == 0) goto L13
            androidx.transition.Transition r3 = (androidx.transition.Transition) r3
            r0.addTransition(r3)
        L13:
            if (r4 == 0) goto L1a
            androidx.transition.Transition r4 = (androidx.transition.Transition) r4
            r0.addTransition(r4)
        L1a:
            return r0
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void removeTarget(java.lang.Object r1, android.view.View r2) {
            r0 = this;
            if (r1 == 0) goto L7
            androidx.transition.Transition r1 = (androidx.transition.Transition) r1
            r1.removeTarget(r2)
        L7:
            return
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void replaceTargets(java.lang.Object r5, java.util.ArrayList<android.view.View> r6, java.util.ArrayList<android.view.View> r7) {
            r4 = this;
            androidx.transition.Transition r5 = (androidx.transition.Transition) r5
            boolean r0 = r5 instanceof androidx.transition.TransitionSet
            r1 = 0
            if (r0 == 0) goto L19
            androidx.transition.TransitionSet r5 = (androidx.transition.TransitionSet) r5
            int r0 = r5.getTransitionCount()
        Ld:
            if (r1 >= r0) goto L5d
            androidx.transition.Transition r2 = r5.getTransitionAt(r1)
            r4.replaceTargets(r2, r6, r7)
            int r1 = r1 + 1
            goto Ld
        L19:
            boolean r0 = hasSimpleTarget(r5)
            if (r0 != 0) goto L5d
            java.util.List r0 = r5.getTargets()
            int r2 = r0.size()
            int r3 = r6.size()
            if (r2 != r3) goto L5d
            boolean r0 = r0.containsAll(r6)
            if (r0 == 0) goto L5d
            if (r7 != 0) goto L37
            r0 = r1
            goto L3b
        L37:
            int r0 = r7.size()
        L3b:
            if (r1 >= r0) goto L49
            java.lang.Object r2 = r7.get(r1)
            android.view.View r2 = (android.view.View) r2
            r5.addTarget(r2)
            int r1 = r1 + 1
            goto L3b
        L49:
            int r7 = r6.size()
            int r7 = r7 + (-1)
        L4f:
            if (r7 < 0) goto L5d
            java.lang.Object r0 = r6.get(r7)
            android.view.View r0 = (android.view.View) r0
            r5.removeTarget(r0)
            int r7 = r7 + (-1)
            goto L4f
        L5d:
            return
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void scheduleHideFragmentView(java.lang.Object r2, android.view.View r3, java.util.ArrayList<android.view.View> r4) {
            r1 = this;
            androidx.transition.Transition r2 = (androidx.transition.Transition) r2
            androidx.transition.FragmentTransitionSupport$2 r0 = new androidx.transition.FragmentTransitionSupport$2
            r0.<init>(r1, r3, r4)
            r2.addListener(r0)
            return
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void scheduleRemoveTargets(java.lang.Object r11, java.lang.Object r12, java.util.ArrayList<android.view.View> r13, java.lang.Object r14, java.util.ArrayList<android.view.View> r15, java.lang.Object r16, java.util.ArrayList<android.view.View> r17) {
            r10 = this;
            r0 = r11
            androidx.transition.Transition r0 = (androidx.transition.Transition) r0
            androidx.transition.FragmentTransitionSupport$3 r9 = new androidx.transition.FragmentTransitionSupport$3
            r1 = r9
            r2 = r10
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r0.addListener(r9)
            return
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void setEpicenter(java.lang.Object r2, android.graphics.Rect r3) {
            r1 = this;
            if (r2 == 0) goto Lc
            androidx.transition.Transition r2 = (androidx.transition.Transition) r2
            androidx.transition.FragmentTransitionSupport$4 r0 = new androidx.transition.FragmentTransitionSupport$4
            r0.<init>(r1, r3)
            r2.setEpicenterCallback(r0)
        Lc:
            return
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void setEpicenter(java.lang.Object r2, android.view.View r3) {
            r1 = this;
            if (r3 == 0) goto L14
            androidx.transition.Transition r2 = (androidx.transition.Transition) r2
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.getBoundsOnScreen(r3, r0)
            androidx.transition.FragmentTransitionSupport$1 r3 = new androidx.transition.FragmentTransitionSupport$1
            r3.<init>(r1, r0)
            r2.setEpicenterCallback(r3)
        L14:
            return
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void setSharedElementTargets(java.lang.Object r5, android.view.View r6, java.util.ArrayList<android.view.View> r7) {
            r4 = this;
            androidx.transition.TransitionSet r5 = (androidx.transition.TransitionSet) r5
            java.util.List r0 = r5.getTargets()
            r0.clear()
            int r1 = r7.size()
            r2 = 0
        Le:
            if (r2 >= r1) goto L1c
            java.lang.Object r3 = r7.get(r2)
            android.view.View r3 = (android.view.View) r3
            bfsAddViewChildren(r0, r3)
            int r2 = r2 + 1
            goto Le
        L1c:
            r0.add(r6)
            r7.add(r6)
            r4.addTargets(r5, r7)
            return
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void swapSharedElementTargets(java.lang.Object r2, java.util.ArrayList<android.view.View> r3, java.util.ArrayList<android.view.View> r4) {
            r1 = this;
            androidx.transition.TransitionSet r2 = (androidx.transition.TransitionSet) r2
            if (r2 == 0) goto L15
            java.util.List r0 = r2.getTargets()
            r0.clear()
            java.util.List r0 = r2.getTargets()
            r0.addAll(r4)
            r1.replaceTargets(r2, r3, r4)
        L15:
            return
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public java.lang.Object wrapTransitionInSet(java.lang.Object r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            androidx.transition.TransitionSet r0 = new androidx.transition.TransitionSet
            r0.<init>()
            androidx.transition.Transition r2 = (androidx.transition.Transition) r2
            r0.addTransition(r2)
            return r0
    }
}
