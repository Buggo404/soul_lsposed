package com.google.android.material.floatingactionbutton;

/* loaded from: classes.dex */
abstract class BaseMotionStrategy implements com.google.android.material.floatingactionbutton.MotionStrategy {
    private final android.content.Context context;
    private com.google.android.material.animation.MotionSpec defaultMotionSpec;
    private final com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton fab;
    private final java.util.ArrayList<android.animation.Animator.AnimatorListener> listeners;
    private com.google.android.material.animation.MotionSpec motionSpec;
    private final com.google.android.material.floatingactionbutton.AnimatorTracker tracker;


    BaseMotionStrategy(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r2, com.google.android.material.floatingactionbutton.AnimatorTracker r3) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.listeners = r0
            r1.fab = r2
            android.content.Context r2 = r2.getContext()
            r1.context = r2
            r1.tracker = r3
            return
    }

    static /* synthetic */ com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton access$000(com.google.android.material.floatingactionbutton.BaseMotionStrategy r0) {
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r0.fab
            return r0
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    public final void addAnimationListener(android.animation.Animator.AnimatorListener r2) {
            r1 = this;
            java.util.ArrayList<android.animation.Animator$AnimatorListener> r0 = r1.listeners
            r0.add(r2)
            return
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    public android.animation.AnimatorSet createAnimator() {
            r1 = this;
            com.google.android.material.animation.MotionSpec r0 = r1.getCurrentMotionSpec()
            android.animation.AnimatorSet r0 = r1.createAnimator(r0)
            return r0
    }

    android.animation.AnimatorSet createAnimator(com.google.android.material.animation.MotionSpec r7) {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "opacity"
            boolean r2 = r7.hasPropertyValues(r1)
            if (r2 == 0) goto L18
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r2 = r6.fab
            android.util.Property r3 = android.view.View.ALPHA
            android.animation.ObjectAnimator r1 = r7.getAnimator(r1, r2, r3)
            r0.add(r1)
        L18:
            java.lang.String r1 = "scale"
            boolean r2 = r7.hasPropertyValues(r1)
            if (r2 == 0) goto L36
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r2 = r6.fab
            android.util.Property r3 = android.view.View.SCALE_Y
            android.animation.ObjectAnimator r2 = r7.getAnimator(r1, r2, r3)
            r0.add(r2)
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r2 = r6.fab
            android.util.Property r3 = android.view.View.SCALE_X
            android.animation.ObjectAnimator r1 = r7.getAnimator(r1, r2, r3)
            r0.add(r1)
        L36:
            java.lang.String r1 = "width"
            boolean r2 = r7.hasPropertyValues(r1)
            if (r2 == 0) goto L49
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r2 = r6.fab
            android.util.Property<android.view.View, java.lang.Float> r3 = com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.WIDTH
            android.animation.ObjectAnimator r1 = r7.getAnimator(r1, r2, r3)
            r0.add(r1)
        L49:
            java.lang.String r1 = "height"
            boolean r2 = r7.hasPropertyValues(r1)
            if (r2 == 0) goto L5c
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r2 = r6.fab
            android.util.Property<android.view.View, java.lang.Float> r3 = com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.HEIGHT
            android.animation.ObjectAnimator r1 = r7.getAnimator(r1, r2, r3)
            r0.add(r1)
        L5c:
            java.lang.String r1 = "paddingStart"
            boolean r2 = r7.hasPropertyValues(r1)
            if (r2 == 0) goto L6f
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r2 = r6.fab
            android.util.Property<android.view.View, java.lang.Float> r3 = com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.PADDING_START
            android.animation.ObjectAnimator r1 = r7.getAnimator(r1, r2, r3)
            r0.add(r1)
        L6f:
            java.lang.String r1 = "paddingEnd"
            boolean r2 = r7.hasPropertyValues(r1)
            if (r2 == 0) goto L82
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r2 = r6.fab
            android.util.Property<android.view.View, java.lang.Float> r3 = com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.PADDING_END
            android.animation.ObjectAnimator r1 = r7.getAnimator(r1, r2, r3)
            r0.add(r1)
        L82:
            java.lang.String r1 = "labelOpacity"
            boolean r2 = r7.hasPropertyValues(r1)
            if (r2 == 0) goto L9c
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r2 = r6.fab
            com.google.android.material.floatingactionbutton.BaseMotionStrategy$1 r3 = new com.google.android.material.floatingactionbutton.BaseMotionStrategy$1
            java.lang.Class<java.lang.Float> r4 = java.lang.Float.class
            java.lang.String r5 = "LABEL_OPACITY_PROPERTY"
            r3.<init>(r6, r4, r5)
            android.animation.ObjectAnimator r7 = r7.getAnimator(r1, r2, r3)
            r0.add(r7)
        L9c:
            android.animation.AnimatorSet r7 = new android.animation.AnimatorSet
            r7.<init>()
            com.google.android.material.animation.AnimatorSetCompat.playTogether(r7, r0)
            return r7
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    public final com.google.android.material.animation.MotionSpec getCurrentMotionSpec() {
            r2 = this;
            com.google.android.material.animation.MotionSpec r0 = r2.motionSpec
            if (r0 == 0) goto L5
            return r0
        L5:
            com.google.android.material.animation.MotionSpec r0 = r2.defaultMotionSpec
            if (r0 != 0) goto L15
            android.content.Context r0 = r2.context
            int r1 = r2.getDefaultMotionSpecResource()
            com.google.android.material.animation.MotionSpec r0 = com.google.android.material.animation.MotionSpec.createFromResource(r0, r1)
            r2.defaultMotionSpec = r0
        L15:
            com.google.android.material.animation.MotionSpec r0 = r2.defaultMotionSpec
            java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r0)
            com.google.android.material.animation.MotionSpec r0 = (com.google.android.material.animation.MotionSpec) r0
            return r0
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    public final java.util.List<android.animation.Animator.AnimatorListener> getListeners() {
            r1 = this;
            java.util.ArrayList<android.animation.Animator$AnimatorListener> r0 = r1.listeners
            return r0
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    public com.google.android.material.animation.MotionSpec getMotionSpec() {
            r1 = this;
            com.google.android.material.animation.MotionSpec r0 = r1.motionSpec
            return r0
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    public void onAnimationCancel() {
            r1 = this;
            com.google.android.material.floatingactionbutton.AnimatorTracker r0 = r1.tracker
            r0.clear()
            return
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    public void onAnimationEnd() {
            r1 = this;
            com.google.android.material.floatingactionbutton.AnimatorTracker r0 = r1.tracker
            r0.clear()
            return
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    public void onAnimationStart(android.animation.Animator r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.AnimatorTracker r0 = r1.tracker
            r0.onNextAnimationStart(r2)
            return
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    public final void removeAnimationListener(android.animation.Animator.AnimatorListener r2) {
            r1 = this;
            java.util.ArrayList<android.animation.Animator$AnimatorListener> r0 = r1.listeners
            r0.remove(r2)
            return
    }

    @Override // com.google.android.material.floatingactionbutton.MotionStrategy
    public final void setMotionSpec(com.google.android.material.animation.MotionSpec r1) {
            r0 = this;
            r0.motionSpec = r1
            return
    }
}
