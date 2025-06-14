package com.google.android.material.internal;

/* loaded from: classes.dex */
public final class StateListAnimator {
    private final android.animation.Animator.AnimatorListener animationListener;
    private com.google.android.material.internal.StateListAnimator.Tuple lastMatch;
    android.animation.ValueAnimator runningAnimator;
    private final java.util.ArrayList<com.google.android.material.internal.StateListAnimator.Tuple> tuples;


    static class Tuple {
        final android.animation.ValueAnimator animator;
        final int[] specs;

        Tuple(int[] r1, android.animation.ValueAnimator r2) {
                r0 = this;
                r0.<init>()
                r0.specs = r1
                r0.animator = r2
                return
        }
    }

    public StateListAnimator() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.tuples = r0
            r0 = 0
            r1.lastMatch = r0
            r1.runningAnimator = r0
            com.google.android.material.internal.StateListAnimator$1 r0 = new com.google.android.material.internal.StateListAnimator$1
            r0.<init>(r1)
            r1.animationListener = r0
            return
    }

    private void cancel() {
            r1 = this;
            android.animation.ValueAnimator r0 = r1.runningAnimator
            if (r0 == 0) goto La
            r0.cancel()
            r0 = 0
            r1.runningAnimator = r0
        La:
            return
    }

    private void start(com.google.android.material.internal.StateListAnimator.Tuple r1) {
            r0 = this;
            android.animation.ValueAnimator r1 = r1.animator
            r0.runningAnimator = r1
            r1.start()
            return
    }

    public void addState(int[] r2, android.animation.ValueAnimator r3) {
            r1 = this;
            com.google.android.material.internal.StateListAnimator$Tuple r0 = new com.google.android.material.internal.StateListAnimator$Tuple
            r0.<init>(r2, r3)
            android.animation.Animator$AnimatorListener r2 = r1.animationListener
            r3.addListener(r2)
            java.util.ArrayList<com.google.android.material.internal.StateListAnimator$Tuple> r2 = r1.tuples
            r2.add(r0)
            return
    }

    public void jumpToCurrentState() {
            r1 = this;
            android.animation.ValueAnimator r0 = r1.runningAnimator
            if (r0 == 0) goto La
            r0.end()
            r0 = 0
            r1.runningAnimator = r0
        La:
            return
    }

    public void setState(int[] r5) {
            r4 = this;
            java.util.ArrayList<com.google.android.material.internal.StateListAnimator$Tuple> r0 = r4.tuples
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L1d
            java.util.ArrayList<com.google.android.material.internal.StateListAnimator$Tuple> r2 = r4.tuples
            java.lang.Object r2 = r2.get(r1)
            com.google.android.material.internal.StateListAnimator$Tuple r2 = (com.google.android.material.internal.StateListAnimator.Tuple) r2
            int[] r3 = r2.specs
            boolean r3 = android.util.StateSet.stateSetMatches(r3, r5)
            if (r3 == 0) goto L1a
            goto L1e
        L1a:
            int r1 = r1 + 1
            goto L7
        L1d:
            r2 = 0
        L1e:
            com.google.android.material.internal.StateListAnimator$Tuple r5 = r4.lastMatch
            if (r2 != r5) goto L23
            return
        L23:
            if (r5 == 0) goto L28
            r4.cancel()
        L28:
            r4.lastMatch = r2
            if (r2 == 0) goto L2f
            r4.start(r2)
        L2f:
            return
    }
}
