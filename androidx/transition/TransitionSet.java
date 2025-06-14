package androidx.transition;

/* loaded from: classes.dex */
public class TransitionSet extends androidx.transition.Transition {
    private static final int FLAG_CHANGE_EPICENTER = 8;
    private static final int FLAG_CHANGE_INTERPOLATOR = 1;
    private static final int FLAG_CHANGE_PATH_MOTION = 4;
    private static final int FLAG_CHANGE_PROPAGATION = 2;
    public static final int ORDERING_SEQUENTIAL = 1;
    public static final int ORDERING_TOGETHER = 0;
    private int mChangeFlags;
    int mCurrentListeners;
    private boolean mPlayTogether;
    boolean mStarted;
    private java.util.ArrayList<androidx.transition.Transition> mTransitions;


    static class TransitionSetListener extends androidx.transition.TransitionListenerAdapter {
        androidx.transition.TransitionSet mTransitionSet;

        TransitionSetListener(androidx.transition.TransitionSet r1) {
                r0 = this;
                r0.<init>()
                r0.mTransitionSet = r1
                return
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(androidx.transition.Transition r3) {
                r2 = this;
                androidx.transition.TransitionSet r0 = r2.mTransitionSet
                int r1 = r0.mCurrentListeners
                int r1 = r1 + (-1)
                r0.mCurrentListeners = r1
                androidx.transition.TransitionSet r0 = r2.mTransitionSet
                int r0 = r0.mCurrentListeners
                if (r0 != 0) goto L18
                androidx.transition.TransitionSet r0 = r2.mTransitionSet
                r1 = 0
                r0.mStarted = r1
                androidx.transition.TransitionSet r0 = r2.mTransitionSet
                r0.end()
            L18:
                r3.removeListener(r2)
                return
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionStart(androidx.transition.Transition r2) {
                r1 = this;
                androidx.transition.TransitionSet r2 = r1.mTransitionSet
                boolean r2 = r2.mStarted
                if (r2 != 0) goto L10
                androidx.transition.TransitionSet r2 = r1.mTransitionSet
                r2.start()
                androidx.transition.TransitionSet r2 = r1.mTransitionSet
                r0 = 1
                r2.mStarted = r0
            L10:
                return
        }
    }

    public TransitionSet() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mTransitions = r0
            r0 = 1
            r1.mPlayTogether = r0
            r0 = 0
            r1.mStarted = r0
            r1.mChangeFlags = r0
            return
    }

    public TransitionSet(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r2.<init>(r3, r4)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.mTransitions = r0
            r0 = 1
            r2.mPlayTogether = r0
            r0 = 0
            r2.mStarted = r0
            r2.mChangeFlags = r0
            int[] r1 = androidx.transition.Styleable.TRANSITION_SET
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r1)
            android.content.res.XmlResourceParser r4 = (android.content.res.XmlResourceParser) r4
            java.lang.String r1 = "transitionOrdering"
            int r4 = androidx.core.content.res.TypedArrayUtils.getNamedInt(r3, r4, r1, r0, r0)
            r2.setOrdering(r4)
            r3.recycle()
            return
    }

    private void addTransitionInternal(androidx.transition.Transition r2) {
            r1 = this;
            java.util.ArrayList<androidx.transition.Transition> r0 = r1.mTransitions
            r0.add(r2)
            r2.mParent = r1
            return
    }

    private void setupStartEndListeners() {
            r3 = this;
            androidx.transition.TransitionSet$TransitionSetListener r0 = new androidx.transition.TransitionSet$TransitionSetListener
            r0.<init>(r3)
            java.util.ArrayList<androidx.transition.Transition> r1 = r3.mTransitions
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1b
            java.lang.Object r2 = r1.next()
            androidx.transition.Transition r2 = (androidx.transition.Transition) r2
            r2.addListener(r0)
            goto Lb
        L1b:
            java.util.ArrayList<androidx.transition.Transition> r0 = r3.mTransitions
            int r0 = r0.size()
            r3.mCurrentListeners = r0
            return
    }

    @Override // androidx.transition.Transition
    public /* bridge */ /* synthetic */ androidx.transition.Transition addListener(androidx.transition.Transition.TransitionListener r1) {
            r0 = this;
            androidx.transition.TransitionSet r1 = r0.addListener(r1)
            return r1
    }

    @Override // androidx.transition.Transition
    public androidx.transition.TransitionSet addListener(androidx.transition.Transition.TransitionListener r1) {
            r0 = this;
            androidx.transition.Transition r1 = super.addListener(r1)
            androidx.transition.TransitionSet r1 = (androidx.transition.TransitionSet) r1
            return r1
    }

    @Override // androidx.transition.Transition
    public /* bridge */ /* synthetic */ androidx.transition.Transition addTarget(int r1) {
            r0 = this;
            androidx.transition.TransitionSet r1 = r0.addTarget(r1)
            return r1
    }

    @Override // androidx.transition.Transition
    public /* bridge */ /* synthetic */ androidx.transition.Transition addTarget(android.view.View r1) {
            r0 = this;
            androidx.transition.TransitionSet r1 = r0.addTarget(r1)
            return r1
    }

    @Override // androidx.transition.Transition
    public /* bridge */ /* synthetic */ androidx.transition.Transition addTarget(java.lang.Class r1) {
            r0 = this;
            androidx.transition.TransitionSet r1 = r0.addTarget(r1)
            return r1
    }

    @Override // androidx.transition.Transition
    public /* bridge */ /* synthetic */ androidx.transition.Transition addTarget(java.lang.String r1) {
            r0 = this;
            androidx.transition.TransitionSet r1 = r0.addTarget(r1)
            return r1
    }

    @Override // androidx.transition.Transition
    public androidx.transition.TransitionSet addTarget(int r3) {
            r2 = this;
            r0 = 0
        L1:
            java.util.ArrayList<androidx.transition.Transition> r1 = r2.mTransitions
            int r1 = r1.size()
            if (r0 >= r1) goto L17
            java.util.ArrayList<androidx.transition.Transition> r1 = r2.mTransitions
            java.lang.Object r1 = r1.get(r0)
            androidx.transition.Transition r1 = (androidx.transition.Transition) r1
            r1.addTarget(r3)
            int r0 = r0 + 1
            goto L1
        L17:
            androidx.transition.Transition r3 = super.addTarget(r3)
            androidx.transition.TransitionSet r3 = (androidx.transition.TransitionSet) r3
            return r3
    }

    @Override // androidx.transition.Transition
    public androidx.transition.TransitionSet addTarget(android.view.View r3) {
            r2 = this;
            r0 = 0
        L1:
            java.util.ArrayList<androidx.transition.Transition> r1 = r2.mTransitions
            int r1 = r1.size()
            if (r0 >= r1) goto L17
            java.util.ArrayList<androidx.transition.Transition> r1 = r2.mTransitions
            java.lang.Object r1 = r1.get(r0)
            androidx.transition.Transition r1 = (androidx.transition.Transition) r1
            r1.addTarget(r3)
            int r0 = r0 + 1
            goto L1
        L17:
            androidx.transition.Transition r3 = super.addTarget(r3)
            androidx.transition.TransitionSet r3 = (androidx.transition.TransitionSet) r3
            return r3
    }

    @Override // androidx.transition.Transition
    public androidx.transition.TransitionSet addTarget(java.lang.Class<?> r3) {
            r2 = this;
            r0 = 0
        L1:
            java.util.ArrayList<androidx.transition.Transition> r1 = r2.mTransitions
            int r1 = r1.size()
            if (r0 >= r1) goto L17
            java.util.ArrayList<androidx.transition.Transition> r1 = r2.mTransitions
            java.lang.Object r1 = r1.get(r0)
            androidx.transition.Transition r1 = (androidx.transition.Transition) r1
            r1.addTarget(r3)
            int r0 = r0 + 1
            goto L1
        L17:
            androidx.transition.Transition r3 = super.addTarget(r3)
            androidx.transition.TransitionSet r3 = (androidx.transition.TransitionSet) r3
            return r3
    }

    @Override // androidx.transition.Transition
    public androidx.transition.TransitionSet addTarget(java.lang.String r3) {
            r2 = this;
            r0 = 0
        L1:
            java.util.ArrayList<androidx.transition.Transition> r1 = r2.mTransitions
            int r1 = r1.size()
            if (r0 >= r1) goto L17
            java.util.ArrayList<androidx.transition.Transition> r1 = r2.mTransitions
            java.lang.Object r1 = r1.get(r0)
            androidx.transition.Transition r1 = (androidx.transition.Transition) r1
            r1.addTarget(r3)
            int r0 = r0 + 1
            goto L1
        L17:
            androidx.transition.Transition r3 = super.addTarget(r3)
            androidx.transition.TransitionSet r3 = (androidx.transition.TransitionSet) r3
            return r3
    }

    public androidx.transition.TransitionSet addTransition(androidx.transition.Transition r5) {
            r4 = this;
            r4.addTransitionInternal(r5)
            long r0 = r4.mDuration
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L10
            long r0 = r4.mDuration
            r5.setDuration(r0)
        L10:
            int r0 = r4.mChangeFlags
            r0 = r0 & 1
            if (r0 == 0) goto L1d
            android.animation.TimeInterpolator r0 = r4.getInterpolator()
            r5.setInterpolator(r0)
        L1d:
            int r0 = r4.mChangeFlags
            r0 = r0 & 2
            if (r0 == 0) goto L2a
            androidx.transition.TransitionPropagation r0 = r4.getPropagation()
            r5.setPropagation(r0)
        L2a:
            int r0 = r4.mChangeFlags
            r0 = r0 & 4
            if (r0 == 0) goto L37
            androidx.transition.PathMotion r0 = r4.getPathMotion()
            r5.setPathMotion(r0)
        L37:
            int r0 = r4.mChangeFlags
            r0 = r0 & 8
            if (r0 == 0) goto L44
            androidx.transition.Transition$EpicenterCallback r0 = r4.getEpicenterCallback()
            r5.setEpicenterCallback(r0)
        L44:
            return r4
    }

    @Override // androidx.transition.Transition
    protected void cancel() {
            r3 = this;
            super.cancel()
            java.util.ArrayList<androidx.transition.Transition> r0 = r3.mTransitions
            int r0 = r0.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L1a
            java.util.ArrayList<androidx.transition.Transition> r2 = r3.mTransitions
            java.lang.Object r2 = r2.get(r1)
            androidx.transition.Transition r2 = (androidx.transition.Transition) r2
            r2.cancel()
            int r1 = r1 + 1
            goto La
        L1a:
            return
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(androidx.transition.TransitionValues r4) {
            r3 = this;
            android.view.View r0 = r4.view
            boolean r0 = r3.isValidTarget(r0)
            if (r0 == 0) goto L2b
            java.util.ArrayList<androidx.transition.Transition> r0 = r3.mTransitions
            java.util.Iterator r0 = r0.iterator()
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()
            androidx.transition.Transition r1 = (androidx.transition.Transition) r1
            android.view.View r2 = r4.view
            boolean r2 = r1.isValidTarget(r2)
            if (r2 == 0) goto Le
            r1.captureEndValues(r4)
            java.util.ArrayList<androidx.transition.Transition> r2 = r4.mTargetedTransitions
            r2.add(r1)
            goto Le
        L2b:
            return
    }

    @Override // androidx.transition.Transition
    void capturePropagationValues(androidx.transition.TransitionValues r4) {
            r3 = this;
            super.capturePropagationValues(r4)
            java.util.ArrayList<androidx.transition.Transition> r0 = r3.mTransitions
            int r0 = r0.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L1a
            java.util.ArrayList<androidx.transition.Transition> r2 = r3.mTransitions
            java.lang.Object r2 = r2.get(r1)
            androidx.transition.Transition r2 = (androidx.transition.Transition) r2
            r2.capturePropagationValues(r4)
            int r1 = r1 + 1
            goto La
        L1a:
            return
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(androidx.transition.TransitionValues r4) {
            r3 = this;
            android.view.View r0 = r4.view
            boolean r0 = r3.isValidTarget(r0)
            if (r0 == 0) goto L2b
            java.util.ArrayList<androidx.transition.Transition> r0 = r3.mTransitions
            java.util.Iterator r0 = r0.iterator()
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()
            androidx.transition.Transition r1 = (androidx.transition.Transition) r1
            android.view.View r2 = r4.view
            boolean r2 = r1.isValidTarget(r2)
            if (r2 == 0) goto Le
            r1.captureStartValues(r4)
            java.util.ArrayList<androidx.transition.Transition> r2 = r4.mTargetedTransitions
            r2.add(r1)
            goto Le
        L2b:
            return
    }

    @Override // androidx.transition.Transition
    public androidx.transition.Transition clone() {
            r4 = this;
            androidx.transition.Transition r0 = super.clone()
            androidx.transition.TransitionSet r0 = (androidx.transition.TransitionSet) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.mTransitions = r1
            java.util.ArrayList<androidx.transition.Transition> r1 = r4.mTransitions
            int r1 = r1.size()
            r2 = 0
        L14:
            if (r2 >= r1) goto L28
            java.util.ArrayList<androidx.transition.Transition> r3 = r4.mTransitions
            java.lang.Object r3 = r3.get(r2)
            androidx.transition.Transition r3 = (androidx.transition.Transition) r3
            androidx.transition.Transition r3 = r3.clone()
            r0.addTransitionInternal(r3)
            int r2 = r2 + 1
            goto L14
        L28:
            return r0
    }

    @Override // androidx.transition.Transition
    /* renamed from: clone */
    public /* bridge */ /* synthetic */ java.lang.Object mo133clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            androidx.transition.Transition r0 = r1.clone()
            return r0
    }

    @Override // androidx.transition.Transition
    protected void createAnimators(android.view.ViewGroup r13, androidx.transition.TransitionValuesMaps r14, androidx.transition.TransitionValuesMaps r15, java.util.ArrayList<androidx.transition.TransitionValues> r16, java.util.ArrayList<androidx.transition.TransitionValues> r17) {
            r12 = this;
            r0 = r12
            long r1 = r12.getStartDelay()
            java.util.ArrayList<androidx.transition.Transition> r3 = r0.mTransitions
            int r3 = r3.size()
            r4 = 0
        Lc:
            if (r4 >= r3) goto L40
            java.util.ArrayList<androidx.transition.Transition> r5 = r0.mTransitions
            java.lang.Object r5 = r5.get(r4)
            r6 = r5
            androidx.transition.Transition r6 = (androidx.transition.Transition) r6
            r7 = 0
            int r5 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r5 <= 0) goto L33
            boolean r5 = r0.mPlayTogether
            if (r5 != 0) goto L23
            if (r4 != 0) goto L33
        L23:
            long r9 = r6.getStartDelay()
            int r5 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r5 <= 0) goto L30
            long r9 = r9 + r1
            r6.setStartDelay(r9)
            goto L33
        L30:
            r6.setStartDelay(r1)
        L33:
            r7 = r13
            r8 = r14
            r9 = r15
            r10 = r16
            r11 = r17
            r6.createAnimators(r7, r8, r9, r10, r11)
            int r4 = r4 + 1
            goto Lc
        L40:
            return
    }

    @Override // androidx.transition.Transition
    public androidx.transition.Transition excludeTarget(int r3, boolean r4) {
            r2 = this;
            r0 = 0
        L1:
            java.util.ArrayList<androidx.transition.Transition> r1 = r2.mTransitions
            int r1 = r1.size()
            if (r0 >= r1) goto L17
            java.util.ArrayList<androidx.transition.Transition> r1 = r2.mTransitions
            java.lang.Object r1 = r1.get(r0)
            androidx.transition.Transition r1 = (androidx.transition.Transition) r1
            r1.excludeTarget(r3, r4)
            int r0 = r0 + 1
            goto L1
        L17:
            androidx.transition.Transition r3 = super.excludeTarget(r3, r4)
            return r3
    }

    @Override // androidx.transition.Transition
    public androidx.transition.Transition excludeTarget(android.view.View r3, boolean r4) {
            r2 = this;
            r0 = 0
        L1:
            java.util.ArrayList<androidx.transition.Transition> r1 = r2.mTransitions
            int r1 = r1.size()
            if (r0 >= r1) goto L17
            java.util.ArrayList<androidx.transition.Transition> r1 = r2.mTransitions
            java.lang.Object r1 = r1.get(r0)
            androidx.transition.Transition r1 = (androidx.transition.Transition) r1
            r1.excludeTarget(r3, r4)
            int r0 = r0 + 1
            goto L1
        L17:
            androidx.transition.Transition r3 = super.excludeTarget(r3, r4)
            return r3
    }

    @Override // androidx.transition.Transition
    public androidx.transition.Transition excludeTarget(java.lang.Class<?> r3, boolean r4) {
            r2 = this;
            r0 = 0
        L1:
            java.util.ArrayList<androidx.transition.Transition> r1 = r2.mTransitions
            int r1 = r1.size()
            if (r0 >= r1) goto L17
            java.util.ArrayList<androidx.transition.Transition> r1 = r2.mTransitions
            java.lang.Object r1 = r1.get(r0)
            androidx.transition.Transition r1 = (androidx.transition.Transition) r1
            r1.excludeTarget(r3, r4)
            int r0 = r0 + 1
            goto L1
        L17:
            androidx.transition.Transition r3 = super.excludeTarget(r3, r4)
            return r3
    }

    @Override // androidx.transition.Transition
    public androidx.transition.Transition excludeTarget(java.lang.String r3, boolean r4) {
            r2 = this;
            r0 = 0
        L1:
            java.util.ArrayList<androidx.transition.Transition> r1 = r2.mTransitions
            int r1 = r1.size()
            if (r0 >= r1) goto L17
            java.util.ArrayList<androidx.transition.Transition> r1 = r2.mTransitions
            java.lang.Object r1 = r1.get(r0)
            androidx.transition.Transition r1 = (androidx.transition.Transition) r1
            r1.excludeTarget(r3, r4)
            int r0 = r0 + 1
            goto L1
        L17:
            androidx.transition.Transition r3 = super.excludeTarget(r3, r4)
            return r3
    }

    @Override // androidx.transition.Transition
    void forceToEnd(android.view.ViewGroup r4) {
            r3 = this;
            super.forceToEnd(r4)
            java.util.ArrayList<androidx.transition.Transition> r0 = r3.mTransitions
            int r0 = r0.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L1a
            java.util.ArrayList<androidx.transition.Transition> r2 = r3.mTransitions
            java.lang.Object r2 = r2.get(r1)
            androidx.transition.Transition r2 = (androidx.transition.Transition) r2
            r2.forceToEnd(r4)
            int r1 = r1 + 1
            goto La
        L1a:
            return
    }

    public int getOrdering() {
            r1 = this;
            boolean r0 = r1.mPlayTogether
            r0 = r0 ^ 1
            return r0
    }

    public androidx.transition.Transition getTransitionAt(int r2) {
            r1 = this;
            if (r2 < 0) goto L14
            java.util.ArrayList<androidx.transition.Transition> r0 = r1.mTransitions
            int r0 = r0.size()
            if (r2 < r0) goto Lb
            goto L14
        Lb:
            java.util.ArrayList<androidx.transition.Transition> r0 = r1.mTransitions
            java.lang.Object r2 = r0.get(r2)
            androidx.transition.Transition r2 = (androidx.transition.Transition) r2
            return r2
        L14:
            r2 = 0
            return r2
    }

    public int getTransitionCount() {
            r1 = this;
            java.util.ArrayList<androidx.transition.Transition> r0 = r1.mTransitions
            int r0 = r0.size()
            return r0
    }

    @Override // androidx.transition.Transition
    public void pause(android.view.View r4) {
            r3 = this;
            super.pause(r4)
            java.util.ArrayList<androidx.transition.Transition> r0 = r3.mTransitions
            int r0 = r0.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L1a
            java.util.ArrayList<androidx.transition.Transition> r2 = r3.mTransitions
            java.lang.Object r2 = r2.get(r1)
            androidx.transition.Transition r2 = (androidx.transition.Transition) r2
            r2.pause(r4)
            int r1 = r1 + 1
            goto La
        L1a:
            return
    }

    @Override // androidx.transition.Transition
    public /* bridge */ /* synthetic */ androidx.transition.Transition removeListener(androidx.transition.Transition.TransitionListener r1) {
            r0 = this;
            androidx.transition.TransitionSet r1 = r0.removeListener(r1)
            return r1
    }

    @Override // androidx.transition.Transition
    public androidx.transition.TransitionSet removeListener(androidx.transition.Transition.TransitionListener r1) {
            r0 = this;
            androidx.transition.Transition r1 = super.removeListener(r1)
            androidx.transition.TransitionSet r1 = (androidx.transition.TransitionSet) r1
            return r1
    }

    @Override // androidx.transition.Transition
    public /* bridge */ /* synthetic */ androidx.transition.Transition removeTarget(int r1) {
            r0 = this;
            androidx.transition.TransitionSet r1 = r0.removeTarget(r1)
            return r1
    }

    @Override // androidx.transition.Transition
    public /* bridge */ /* synthetic */ androidx.transition.Transition removeTarget(android.view.View r1) {
            r0 = this;
            androidx.transition.TransitionSet r1 = r0.removeTarget(r1)
            return r1
    }

    @Override // androidx.transition.Transition
    public /* bridge */ /* synthetic */ androidx.transition.Transition removeTarget(java.lang.Class r1) {
            r0 = this;
            androidx.transition.TransitionSet r1 = r0.removeTarget(r1)
            return r1
    }

    @Override // androidx.transition.Transition
    public /* bridge */ /* synthetic */ androidx.transition.Transition removeTarget(java.lang.String r1) {
            r0 = this;
            androidx.transition.TransitionSet r1 = r0.removeTarget(r1)
            return r1
    }

    @Override // androidx.transition.Transition
    public androidx.transition.TransitionSet removeTarget(int r3) {
            r2 = this;
            r0 = 0
        L1:
            java.util.ArrayList<androidx.transition.Transition> r1 = r2.mTransitions
            int r1 = r1.size()
            if (r0 >= r1) goto L17
            java.util.ArrayList<androidx.transition.Transition> r1 = r2.mTransitions
            java.lang.Object r1 = r1.get(r0)
            androidx.transition.Transition r1 = (androidx.transition.Transition) r1
            r1.removeTarget(r3)
            int r0 = r0 + 1
            goto L1
        L17:
            androidx.transition.Transition r3 = super.removeTarget(r3)
            androidx.transition.TransitionSet r3 = (androidx.transition.TransitionSet) r3
            return r3
    }

    @Override // androidx.transition.Transition
    public androidx.transition.TransitionSet removeTarget(android.view.View r3) {
            r2 = this;
            r0 = 0
        L1:
            java.util.ArrayList<androidx.transition.Transition> r1 = r2.mTransitions
            int r1 = r1.size()
            if (r0 >= r1) goto L17
            java.util.ArrayList<androidx.transition.Transition> r1 = r2.mTransitions
            java.lang.Object r1 = r1.get(r0)
            androidx.transition.Transition r1 = (androidx.transition.Transition) r1
            r1.removeTarget(r3)
            int r0 = r0 + 1
            goto L1
        L17:
            androidx.transition.Transition r3 = super.removeTarget(r3)
            androidx.transition.TransitionSet r3 = (androidx.transition.TransitionSet) r3
            return r3
    }

    @Override // androidx.transition.Transition
    public androidx.transition.TransitionSet removeTarget(java.lang.Class<?> r3) {
            r2 = this;
            r0 = 0
        L1:
            java.util.ArrayList<androidx.transition.Transition> r1 = r2.mTransitions
            int r1 = r1.size()
            if (r0 >= r1) goto L17
            java.util.ArrayList<androidx.transition.Transition> r1 = r2.mTransitions
            java.lang.Object r1 = r1.get(r0)
            androidx.transition.Transition r1 = (androidx.transition.Transition) r1
            r1.removeTarget(r3)
            int r0 = r0 + 1
            goto L1
        L17:
            androidx.transition.Transition r3 = super.removeTarget(r3)
            androidx.transition.TransitionSet r3 = (androidx.transition.TransitionSet) r3
            return r3
    }

    @Override // androidx.transition.Transition
    public androidx.transition.TransitionSet removeTarget(java.lang.String r3) {
            r2 = this;
            r0 = 0
        L1:
            java.util.ArrayList<androidx.transition.Transition> r1 = r2.mTransitions
            int r1 = r1.size()
            if (r0 >= r1) goto L17
            java.util.ArrayList<androidx.transition.Transition> r1 = r2.mTransitions
            java.lang.Object r1 = r1.get(r0)
            androidx.transition.Transition r1 = (androidx.transition.Transition) r1
            r1.removeTarget(r3)
            int r0 = r0 + 1
            goto L1
        L17:
            androidx.transition.Transition r3 = super.removeTarget(r3)
            androidx.transition.TransitionSet r3 = (androidx.transition.TransitionSet) r3
            return r3
    }

    public androidx.transition.TransitionSet removeTransition(androidx.transition.Transition r2) {
            r1 = this;
            java.util.ArrayList<androidx.transition.Transition> r0 = r1.mTransitions
            r0.remove(r2)
            r0 = 0
            r2.mParent = r0
            return r1
    }

    @Override // androidx.transition.Transition
    public void resume(android.view.View r4) {
            r3 = this;
            super.resume(r4)
            java.util.ArrayList<androidx.transition.Transition> r0 = r3.mTransitions
            int r0 = r0.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L1a
            java.util.ArrayList<androidx.transition.Transition> r2 = r3.mTransitions
            java.lang.Object r2 = r2.get(r1)
            androidx.transition.Transition r2 = (androidx.transition.Transition) r2
            r2.resume(r4)
            int r1 = r1 + 1
            goto La
        L1a:
            return
    }

    @Override // androidx.transition.Transition
    protected void runAnimators() {
            r4 = this;
            java.util.ArrayList<androidx.transition.Transition> r0 = r4.mTransitions
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lf
            r4.start()
            r4.end()
            return
        Lf:
            r4.setupStartEndListeners()
            boolean r0 = r4.mPlayTogether
            if (r0 != 0) goto L4b
            r0 = 1
        L17:
            java.util.ArrayList<androidx.transition.Transition> r1 = r4.mTransitions
            int r1 = r1.size()
            if (r0 >= r1) goto L3c
            java.util.ArrayList<androidx.transition.Transition> r1 = r4.mTransitions
            int r2 = r0 + (-1)
            java.lang.Object r1 = r1.get(r2)
            androidx.transition.Transition r1 = (androidx.transition.Transition) r1
            java.util.ArrayList<androidx.transition.Transition> r2 = r4.mTransitions
            java.lang.Object r2 = r2.get(r0)
            androidx.transition.Transition r2 = (androidx.transition.Transition) r2
            androidx.transition.TransitionSet$1 r3 = new androidx.transition.TransitionSet$1
            r3.<init>(r4, r2)
            r1.addListener(r3)
            int r0 = r0 + 1
            goto L17
        L3c:
            java.util.ArrayList<androidx.transition.Transition> r0 = r4.mTransitions
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            androidx.transition.Transition r0 = (androidx.transition.Transition) r0
            if (r0 == 0) goto L61
            r0.runAnimators()
            goto L61
        L4b:
            java.util.ArrayList<androidx.transition.Transition> r0 = r4.mTransitions
            java.util.Iterator r0 = r0.iterator()
        L51:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L61
            java.lang.Object r1 = r0.next()
            androidx.transition.Transition r1 = (androidx.transition.Transition) r1
            r1.runAnimators()
            goto L51
        L61:
            return
    }

    @Override // androidx.transition.Transition
    void setCanRemoveViews(boolean r4) {
            r3 = this;
            super.setCanRemoveViews(r4)
            java.util.ArrayList<androidx.transition.Transition> r0 = r3.mTransitions
            int r0 = r0.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L1a
            java.util.ArrayList<androidx.transition.Transition> r2 = r3.mTransitions
            java.lang.Object r2 = r2.get(r1)
            androidx.transition.Transition r2 = (androidx.transition.Transition) r2
            r2.setCanRemoveViews(r4)
            int r1 = r1 + 1
            goto La
        L1a:
            return
    }

    @Override // androidx.transition.Transition
    public /* bridge */ /* synthetic */ androidx.transition.Transition setDuration(long r1) {
            r0 = this;
            androidx.transition.TransitionSet r1 = r0.setDuration(r1)
            return r1
    }

    @Override // androidx.transition.Transition
    public androidx.transition.TransitionSet setDuration(long r5) {
            r4 = this;
            super.setDuration(r5)
            long r0 = r4.mDuration
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L24
            java.util.ArrayList<androidx.transition.Transition> r0 = r4.mTransitions
            if (r0 == 0) goto L24
            int r0 = r0.size()
            r1 = 0
        L14:
            if (r1 >= r0) goto L24
            java.util.ArrayList<androidx.transition.Transition> r2 = r4.mTransitions
            java.lang.Object r2 = r2.get(r1)
            androidx.transition.Transition r2 = (androidx.transition.Transition) r2
            r2.setDuration(r5)
            int r1 = r1 + 1
            goto L14
        L24:
            return r4
    }

    @Override // androidx.transition.Transition
    public void setEpicenterCallback(androidx.transition.Transition.EpicenterCallback r4) {
            r3 = this;
            super.setEpicenterCallback(r4)
            int r0 = r3.mChangeFlags
            r0 = r0 | 8
            r3.mChangeFlags = r0
            java.util.ArrayList<androidx.transition.Transition> r0 = r3.mTransitions
            int r0 = r0.size()
            r1 = 0
        L10:
            if (r1 >= r0) goto L20
            java.util.ArrayList<androidx.transition.Transition> r2 = r3.mTransitions
            java.lang.Object r2 = r2.get(r1)
            androidx.transition.Transition r2 = (androidx.transition.Transition) r2
            r2.setEpicenterCallback(r4)
            int r1 = r1 + 1
            goto L10
        L20:
            return
    }

    @Override // androidx.transition.Transition
    public /* bridge */ /* synthetic */ androidx.transition.Transition setInterpolator(android.animation.TimeInterpolator r1) {
            r0 = this;
            androidx.transition.TransitionSet r1 = r0.setInterpolator(r1)
            return r1
    }

    @Override // androidx.transition.Transition
    public androidx.transition.TransitionSet setInterpolator(android.animation.TimeInterpolator r4) {
            r3 = this;
            int r0 = r3.mChangeFlags
            r0 = r0 | 1
            r3.mChangeFlags = r0
            java.util.ArrayList<androidx.transition.Transition> r0 = r3.mTransitions
            if (r0 == 0) goto L1f
            int r0 = r0.size()
            r1 = 0
        Lf:
            if (r1 >= r0) goto L1f
            java.util.ArrayList<androidx.transition.Transition> r2 = r3.mTransitions
            java.lang.Object r2 = r2.get(r1)
            androidx.transition.Transition r2 = (androidx.transition.Transition) r2
            r2.setInterpolator(r4)
            int r1 = r1 + 1
            goto Lf
        L1f:
            androidx.transition.Transition r4 = super.setInterpolator(r4)
            androidx.transition.TransitionSet r4 = (androidx.transition.TransitionSet) r4
            return r4
    }

    public androidx.transition.TransitionSet setOrdering(int r4) {
            r3 = this;
            r0 = 1
            if (r4 == 0) goto L1e
            if (r4 != r0) goto L9
            r4 = 0
            r3.mPlayTogether = r4
            goto L20
        L9:
            android.util.AndroidRuntimeException r0 = new android.util.AndroidRuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid parameter for TransitionSet ordering: "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L1e:
            r3.mPlayTogether = r0
        L20:
            return r3
    }

    @Override // androidx.transition.Transition
    public void setPathMotion(androidx.transition.PathMotion r3) {
            r2 = this;
            super.setPathMotion(r3)
            int r0 = r2.mChangeFlags
            r0 = r0 | 4
            r2.mChangeFlags = r0
            java.util.ArrayList<androidx.transition.Transition> r0 = r2.mTransitions
            if (r0 == 0) goto L24
            r0 = 0
        Le:
            java.util.ArrayList<androidx.transition.Transition> r1 = r2.mTransitions
            int r1 = r1.size()
            if (r0 >= r1) goto L24
            java.util.ArrayList<androidx.transition.Transition> r1 = r2.mTransitions
            java.lang.Object r1 = r1.get(r0)
            androidx.transition.Transition r1 = (androidx.transition.Transition) r1
            r1.setPathMotion(r3)
            int r0 = r0 + 1
            goto Le
        L24:
            return
    }

    @Override // androidx.transition.Transition
    public void setPropagation(androidx.transition.TransitionPropagation r4) {
            r3 = this;
            super.setPropagation(r4)
            int r0 = r3.mChangeFlags
            r0 = r0 | 2
            r3.mChangeFlags = r0
            java.util.ArrayList<androidx.transition.Transition> r0 = r3.mTransitions
            int r0 = r0.size()
            r1 = 0
        L10:
            if (r1 >= r0) goto L20
            java.util.ArrayList<androidx.transition.Transition> r2 = r3.mTransitions
            java.lang.Object r2 = r2.get(r1)
            androidx.transition.Transition r2 = (androidx.transition.Transition) r2
            r2.setPropagation(r4)
            int r1 = r1 + 1
            goto L10
        L20:
            return
    }

    @Override // androidx.transition.Transition
    /* bridge */ /* synthetic */ androidx.transition.Transition setSceneRoot(android.view.ViewGroup r1) {
            r0 = this;
            androidx.transition.TransitionSet r1 = r0.setSceneRoot(r1)
            return r1
    }

    @Override // androidx.transition.Transition
    androidx.transition.TransitionSet setSceneRoot(android.view.ViewGroup r4) {
            r3 = this;
            super.setSceneRoot(r4)
            java.util.ArrayList<androidx.transition.Transition> r0 = r3.mTransitions
            int r0 = r0.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L1a
            java.util.ArrayList<androidx.transition.Transition> r2 = r3.mTransitions
            java.lang.Object r2 = r2.get(r1)
            androidx.transition.Transition r2 = (androidx.transition.Transition) r2
            r2.setSceneRoot(r4)
            int r1 = r1 + 1
            goto La
        L1a:
            return r3
    }

    @Override // androidx.transition.Transition
    public /* bridge */ /* synthetic */ androidx.transition.Transition setStartDelay(long r1) {
            r0 = this;
            androidx.transition.TransitionSet r1 = r0.setStartDelay(r1)
            return r1
    }

    @Override // androidx.transition.Transition
    public androidx.transition.TransitionSet setStartDelay(long r1) {
            r0 = this;
            androidx.transition.Transition r1 = super.setStartDelay(r1)
            androidx.transition.TransitionSet r1 = (androidx.transition.TransitionSet) r1
            return r1
    }

    @Override // androidx.transition.Transition
    java.lang.String toString(java.lang.String r6) {
            r5 = this;
            java.lang.String r0 = super.toString(r6)
            r1 = 0
        L5:
            java.util.ArrayList<androidx.transition.Transition> r2 = r5.mTransitions
            int r2 = r2.size()
            if (r1 >= r2) goto L46
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r2 = "\n"
            java.lang.StringBuilder r0 = r0.append(r2)
            java.util.ArrayList<androidx.transition.Transition> r2 = r5.mTransitions
            java.lang.Object r2 = r2.get(r1)
            androidx.transition.Transition r2 = (androidx.transition.Transition) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r6)
            java.lang.String r4 = "  "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r2 = r2.toString(r3)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            int r1 = r1 + 1
            goto L5
        L46:
            return r0
    }
}
