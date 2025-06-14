package com.google.android.material.floatingactionbutton;

/* loaded from: classes.dex */
interface MotionStrategy {
    void addAnimationListener(android.animation.Animator.AnimatorListener r1);

    android.animation.AnimatorSet createAnimator();

    com.google.android.material.animation.MotionSpec getCurrentMotionSpec();

    int getDefaultMotionSpecResource();

    java.util.List<android.animation.Animator.AnimatorListener> getListeners();

    com.google.android.material.animation.MotionSpec getMotionSpec();

    void onAnimationCancel();

    void onAnimationEnd();

    void onAnimationStart(android.animation.Animator r1);

    void onChange(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OnChangedCallback r1);

    void performNow();

    void removeAnimationListener(android.animation.Animator.AnimatorListener r1);

    void setMotionSpec(com.google.android.material.animation.MotionSpec r1);

    boolean shouldCancel();
}
