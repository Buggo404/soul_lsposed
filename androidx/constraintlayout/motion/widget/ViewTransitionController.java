package androidx.constraintlayout.motion.widget;

/* loaded from: classes.dex */
public class ViewTransitionController {
    private java.lang.String TAG;
    java.util.ArrayList<androidx.constraintlayout.motion.widget.ViewTransition.Animate> animations;
    private final androidx.constraintlayout.motion.widget.MotionLayout mMotionLayout;
    private java.util.HashSet<android.view.View> mRelatedViews;
    java.util.ArrayList<androidx.constraintlayout.motion.widget.ViewTransition.Animate> removeList;
    private java.util.ArrayList<androidx.constraintlayout.motion.widget.ViewTransition> viewTransitions;


    public ViewTransitionController(androidx.constraintlayout.motion.widget.MotionLayout r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.viewTransitions = r0
            java.lang.String r0 = "ViewTransitionController"
            r1.TAG = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.removeList = r0
            r1.mMotionLayout = r2
            return
    }

    static /* synthetic */ androidx.constraintlayout.motion.widget.MotionLayout access$000(androidx.constraintlayout.motion.widget.ViewTransitionController r0) {
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r0.mMotionLayout
            return r0
    }

    private void listenForSharedVariable(androidx.constraintlayout.motion.widget.ViewTransition r10, boolean r11) {
            r9 = this;
            int r3 = r10.getSharedValueID()
            int r5 = r10.getSharedValue()
            androidx.constraintlayout.widget.SharedValues r6 = androidx.constraintlayout.widget.ConstraintLayout.getSharedValues()
            int r7 = r10.getSharedValueID()
            androidx.constraintlayout.motion.widget.ViewTransitionController$1 r8 = new androidx.constraintlayout.motion.widget.ViewTransitionController$1
            r0 = r8
            r1 = r9
            r2 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r6.addListener(r7, r8)
            return
    }

    private void viewTransition(androidx.constraintlayout.motion.widget.ViewTransition r8, android.view.View... r9) {
            r7 = this;
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r7.mMotionLayout
            int r4 = r0.getCurrentState()
            int r0 = r8.mViewTransitionMode
            r1 = 2
            if (r0 == r1) goto L3b
            r0 = -1
            if (r4 != r0) goto L29
            java.lang.String r8 = r7.TAG
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "No support for ViewTransition within transition yet. Currently: "
            r9.<init>(r0)
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r7.mMotionLayout
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r9 = r9.append(r0)
            java.lang.String r9 = r9.toString()
            android.util.Log.w(r8, r9)
            return
        L29:
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r7.mMotionLayout
            androidx.constraintlayout.widget.ConstraintSet r5 = r0.getConstraintSet(r4)
            if (r5 != 0) goto L32
            return
        L32:
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r7.mMotionLayout
            r1 = r8
            r2 = r7
            r6 = r9
            r1.applyTransition(r2, r3, r4, r5, r6)
            goto L44
        L3b:
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r7.mMotionLayout
            r5 = 0
            r1 = r8
            r2 = r7
            r6 = r9
            r1.applyTransition(r2, r3, r4, r5, r6)
        L44:
            return
    }

    public void add(androidx.constraintlayout.motion.widget.ViewTransition r3) {
            r2 = this;
            java.util.ArrayList<androidx.constraintlayout.motion.widget.ViewTransition> r0 = r2.viewTransitions
            r0.add(r3)
            r0 = 0
            r2.mRelatedViews = r0
            int r0 = r3.getStateTransition()
            r1 = 4
            if (r0 != r1) goto L14
            r0 = 1
            r2.listenForSharedVariable(r3, r0)
            goto L1f
        L14:
            int r0 = r3.getStateTransition()
            r1 = 5
            if (r0 != r1) goto L1f
            r0 = 0
            r2.listenForSharedVariable(r3, r0)
        L1f:
            return
    }

    void addAnimation(androidx.constraintlayout.motion.widget.ViewTransition.Animate r2) {
            r1 = this;
            java.util.ArrayList<androidx.constraintlayout.motion.widget.ViewTransition$Animate> r0 = r1.animations
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.animations = r0
        Lb:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.ViewTransition$Animate> r0 = r1.animations
            r0.add(r2)
            return
    }

    void animate() {
            r2 = this;
            java.util.ArrayList<androidx.constraintlayout.motion.widget.ViewTransition$Animate> r0 = r2.animations
            if (r0 != 0) goto L5
            return
        L5:
            java.util.Iterator r0 = r0.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.motion.widget.ViewTransition$Animate r1 = (androidx.constraintlayout.motion.widget.ViewTransition.Animate) r1
            r1.mutate()
            goto L9
        L19:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.ViewTransition$Animate> r0 = r2.animations
            java.util.ArrayList<androidx.constraintlayout.motion.widget.ViewTransition$Animate> r1 = r2.removeList
            r0.removeAll(r1)
            java.util.ArrayList<androidx.constraintlayout.motion.widget.ViewTransition$Animate> r0 = r2.removeList
            r0.clear()
            java.util.ArrayList<androidx.constraintlayout.motion.widget.ViewTransition$Animate> r0 = r2.animations
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L30
            r0 = 0
            r2.animations = r0
        L30:
            return
    }

    boolean applyViewTransition(int r4, androidx.constraintlayout.motion.widget.MotionController r5) {
            r3 = this;
            java.util.ArrayList<androidx.constraintlayout.motion.widget.ViewTransition> r0 = r3.viewTransitions
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.motion.widget.ViewTransition r1 = (androidx.constraintlayout.motion.widget.ViewTransition) r1
            int r2 = r1.getId()
            if (r2 != r4) goto L6
            androidx.constraintlayout.motion.widget.KeyFrames r4 = r1.mKeyFrames
            r4.addAllFrames(r5)
            r4 = 1
            return r4
        L1f:
            r4 = 0
            return r4
    }

    void enableViewTransition(int r4, boolean r5) {
            r3 = this;
            java.util.ArrayList<androidx.constraintlayout.motion.widget.ViewTransition> r0 = r3.viewTransitions
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1b
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.motion.widget.ViewTransition r1 = (androidx.constraintlayout.motion.widget.ViewTransition) r1
            int r2 = r1.getId()
            if (r2 != r4) goto L6
            r1.setEnabled(r5)
        L1b:
            return
    }

    void invalidate() {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r1.mMotionLayout
            r0.invalidate()
            return
    }

    boolean isViewTransitionEnabled(int r4) {
            r3 = this;
            java.util.ArrayList<androidx.constraintlayout.motion.widget.ViewTransition> r0 = r3.viewTransitions
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.motion.widget.ViewTransition r1 = (androidx.constraintlayout.motion.widget.ViewTransition) r1
            int r2 = r1.getId()
            if (r2 != r4) goto L6
            boolean r4 = r1.isEnabled()
            return r4
        L1d:
            r4 = 0
            return r4
    }

    void remove(int r5) {
            r4 = this;
            java.util.ArrayList<androidx.constraintlayout.motion.widget.ViewTransition> r0 = r4.viewTransitions
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.motion.widget.ViewTransition r1 = (androidx.constraintlayout.motion.widget.ViewTransition) r1
            int r3 = r1.getId()
            if (r3 != r5) goto L6
            goto L1b
        L1a:
            r1 = r2
        L1b:
            if (r1 == 0) goto L24
            r4.mRelatedViews = r2
            java.util.ArrayList<androidx.constraintlayout.motion.widget.ViewTransition> r5 = r4.viewTransitions
            r5.remove(r1)
        L24:
            return
    }

    void removeAnimation(androidx.constraintlayout.motion.widget.ViewTransition.Animate r2) {
            r1 = this;
            java.util.ArrayList<androidx.constraintlayout.motion.widget.ViewTransition$Animate> r0 = r1.removeList
            r0.add(r2)
            return
    }

    void touchEvent(android.view.MotionEvent r20) {
            r19 = this;
            r6 = r19
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r6.mMotionLayout
            int r7 = r0.getCurrentState()
            r0 = -1
            if (r7 != r0) goto Lc
            return
        Lc:
            java.util.HashSet<android.view.View> r0 = r6.mRelatedViews
            r8 = 0
            if (r0 != 0) goto L4a
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r6.mRelatedViews = r0
            java.util.ArrayList<androidx.constraintlayout.motion.widget.ViewTransition> r0 = r6.viewTransitions
            java.util.Iterator r0 = r0.iterator()
        L1e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4a
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.motion.widget.ViewTransition r1 = (androidx.constraintlayout.motion.widget.ViewTransition) r1
            androidx.constraintlayout.motion.widget.MotionLayout r2 = r6.mMotionLayout
            int r2 = r2.getChildCount()
            r3 = r8
        L31:
            if (r3 >= r2) goto L1e
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r6.mMotionLayout
            android.view.View r4 = r4.getChildAt(r3)
            boolean r5 = r1.matchesView(r4)
            if (r5 == 0) goto L47
            r4.getId()
            java.util.HashSet<android.view.View> r5 = r6.mRelatedViews
            r5.add(r4)
        L47:
            int r3 = r3 + 1
            goto L31
        L4a:
            float r9 = r20.getX()
            float r10 = r20.getY()
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
            int r12 = r20.getAction()
            java.util.ArrayList<androidx.constraintlayout.motion.widget.ViewTransition$Animate> r0 = r6.animations
            if (r0 == 0) goto L7b
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L7b
            java.util.ArrayList<androidx.constraintlayout.motion.widget.ViewTransition$Animate> r0 = r6.animations
            java.util.Iterator r0 = r0.iterator()
        L6b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L7b
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.motion.widget.ViewTransition$Animate r1 = (androidx.constraintlayout.motion.widget.ViewTransition.Animate) r1
            r1.reactTo(r12, r9, r10)
            goto L6b
        L7b:
            r13 = 1
            if (r12 == 0) goto L81
            if (r12 == r13) goto L81
            goto Lde
        L81:
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r6.mMotionLayout
            androidx.constraintlayout.widget.ConstraintSet r14 = r0.getConstraintSet(r7)
            java.util.ArrayList<androidx.constraintlayout.motion.widget.ViewTransition> r0 = r6.viewTransitions
            java.util.Iterator r15 = r0.iterator()
        L8d:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto Lde
            java.lang.Object r0 = r15.next()
            r5 = r0
            androidx.constraintlayout.motion.widget.ViewTransition r5 = (androidx.constraintlayout.motion.widget.ViewTransition) r5
            boolean r0 = r5.supports(r12)
            if (r0 == 0) goto L8d
            java.util.HashSet<android.view.View> r0 = r6.mRelatedViews
            java.util.Iterator r16 = r0.iterator()
        La6:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L8d
            java.lang.Object r0 = r16.next()
            android.view.View r0 = (android.view.View) r0
            boolean r1 = r5.matchesView(r0)
            if (r1 != 0) goto Lb9
            goto La6
        Lb9:
            r0.getHitRect(r11)
            int r1 = (int) r9
            int r2 = (int) r10
            boolean r1 = r11.contains(r1, r2)
            if (r1 == 0) goto Ld9
            androidx.constraintlayout.motion.widget.MotionLayout r2 = r6.mMotionLayout
            android.view.View[] r4 = new android.view.View[r13]
            r4[r8] = r0
            r0 = r5
            r1 = r19
            r3 = r7
            r17 = r4
            r4 = r14
            r18 = r5
            r5 = r17
            r0.applyTransition(r1, r2, r3, r4, r5)
            goto Ldb
        Ld9:
            r18 = r5
        Ldb:
            r5 = r18
            goto La6
        Lde:
            return
    }

    void viewTransition(int r9, android.view.View... r10) {
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList<androidx.constraintlayout.motion.widget.ViewTransition> r1 = r8.viewTransitions
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        Lc:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L47
            java.lang.Object r3 = r1.next()
            androidx.constraintlayout.motion.widget.ViewTransition r3 = (androidx.constraintlayout.motion.widget.ViewTransition) r3
            int r4 = r3.getId()
            if (r4 != r9) goto Lc
            int r2 = r10.length
            r4 = 0
            r5 = r4
        L21:
            if (r5 >= r2) goto L31
            r6 = r10[r5]
            boolean r7 = r3.checkTags(r6)
            if (r7 == 0) goto L2e
            r0.add(r6)
        L2e:
            int r5 = r5 + 1
            goto L21
        L31:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L45
            android.view.View[] r2 = new android.view.View[r4]
            java.lang.Object[] r2 = r0.toArray(r2)
            android.view.View[] r2 = (android.view.View[]) r2
            r8.viewTransition(r3, r2)
            r0.clear()
        L45:
            r2 = r3
            goto Lc
        L47:
            if (r2 != 0) goto L50
            java.lang.String r9 = r8.TAG
            java.lang.String r10 = " Could not find ViewTransition"
            android.util.Log.e(r9, r10)
        L50:
            return
    }
}
