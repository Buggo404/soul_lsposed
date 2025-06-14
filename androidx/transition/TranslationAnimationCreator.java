package androidx.transition;

/* loaded from: classes.dex */
class TranslationAnimationCreator {

    private static class TransitionPositionListener extends android.animation.AnimatorListenerAdapter implements androidx.transition.Transition.TransitionListener {
        private final android.view.View mMovingView;
        private float mPausedX;
        private float mPausedY;
        private final int mStartX;
        private final int mStartY;
        private final float mTerminalX;
        private final float mTerminalY;
        private int[] mTransitionPosition;
        private final android.view.View mViewInHierarchy;

        TransitionPositionListener(android.view.View r2, android.view.View r3, int r4, int r5, float r6, float r7) {
                r1 = this;
                r1.<init>()
                r1.mMovingView = r2
                r1.mViewInHierarchy = r3
                float r0 = r2.getTranslationX()
                int r0 = java.lang.Math.round(r0)
                int r4 = r4 - r0
                r1.mStartX = r4
                float r2 = r2.getTranslationY()
                int r2 = java.lang.Math.round(r2)
                int r5 = r5 - r2
                r1.mStartY = r5
                r1.mTerminalX = r6
                r1.mTerminalY = r7
                int r2 = androidx.transition.C0425R.id.transition_position
                java.lang.Object r2 = r3.getTag(r2)
                int[] r2 = (int[]) r2
                int[] r2 = (int[]) r2
                r1.mTransitionPosition = r2
                if (r2 == 0) goto L35
                int r2 = androidx.transition.C0425R.id.transition_position
                r4 = 0
                r3.setTag(r2, r4)
            L35:
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator r3) {
                r2 = this;
                int[] r3 = r2.mTransitionPosition
                if (r3 != 0) goto L9
                r3 = 2
                int[] r3 = new int[r3]
                r2.mTransitionPosition = r3
            L9:
                int[] r3 = r2.mTransitionPosition
                int r0 = r2.mStartX
                float r0 = (float) r0
                android.view.View r1 = r2.mMovingView
                float r1 = r1.getTranslationX()
                float r0 = r0 + r1
                int r0 = java.lang.Math.round(r0)
                r1 = 0
                r3[r1] = r0
                int[] r3 = r2.mTransitionPosition
                int r0 = r2.mStartY
                float r0 = (float) r0
                android.view.View r1 = r2.mMovingView
                float r1 = r1.getTranslationY()
                float r0 = r0 + r1
                int r0 = java.lang.Math.round(r0)
                r1 = 1
                r3[r1] = r0
                android.view.View r3 = r2.mViewInHierarchy
                int r0 = androidx.transition.C0425R.id.transition_position
                int[] r1 = r2.mTransitionPosition
                r3.setTag(r0, r1)
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(android.animation.Animator r2) {
                r1 = this;
                android.view.View r2 = r1.mMovingView
                float r2 = r2.getTranslationX()
                r1.mPausedX = r2
                android.view.View r2 = r1.mMovingView
                float r2 = r2.getTranslationY()
                r1.mPausedY = r2
                android.view.View r2 = r1.mMovingView
                float r0 = r1.mTerminalX
                r2.setTranslationX(r0)
                android.view.View r2 = r1.mMovingView
                float r0 = r1.mTerminalY
                r2.setTranslationY(r0)
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(android.animation.Animator r2) {
                r1 = this;
                android.view.View r2 = r1.mMovingView
                float r0 = r1.mPausedX
                r2.setTranslationX(r0)
                android.view.View r2 = r1.mMovingView
                float r0 = r1.mPausedY
                r2.setTranslationY(r0)
                return
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionCancel(androidx.transition.Transition r1) {
                r0 = this;
                return
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(androidx.transition.Transition r3) {
                r2 = this;
                android.view.View r0 = r2.mMovingView
                float r1 = r2.mTerminalX
                r0.setTranslationX(r1)
                android.view.View r0 = r2.mMovingView
                float r1 = r2.mTerminalY
                r0.setTranslationY(r1)
                r3.removeListener(r2)
                return
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionPause(androidx.transition.Transition r1) {
                r0 = this;
                return
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionResume(androidx.transition.Transition r1) {
                r0 = this;
                return
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionStart(androidx.transition.Transition r1) {
                r0 = this;
                return
        }
    }

    private TranslationAnimationCreator() {
            r0 = this;
            r0.<init>()
            return
    }

    static android.animation.Animator createAnimation(android.view.View r14, androidx.transition.TransitionValues r15, int r16, int r17, float r18, float r19, float r20, float r21, android.animation.TimeInterpolator r22, androidx.transition.Transition r23) {
            r0 = r14
            r1 = r15
            float r2 = r14.getTranslationX()
            float r3 = r14.getTranslationY()
            android.view.View r4 = r1.view
            int r5 = androidx.transition.C0425R.id.transition_position
            java.lang.Object r4 = r4.getTag(r5)
            int[] r4 = (int[]) r4
            int[] r4 = (int[]) r4
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L27
            r7 = r4[r6]
            int r7 = r7 - r16
            float r7 = (float) r7
            float r7 = r7 + r2
            r4 = r4[r5]
            int r4 = r4 - r17
            float r4 = (float) r4
            float r4 = r4 + r3
            goto L2b
        L27:
            r7 = r18
            r4 = r19
        L2b:
            float r8 = r7 - r2
            int r8 = java.lang.Math.round(r8)
            int r8 = r16 + r8
            float r9 = r4 - r3
            int r9 = java.lang.Math.round(r9)
            int r9 = r17 + r9
            r14.setTranslationX(r7)
            r14.setTranslationY(r4)
            int r10 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1))
            if (r10 != 0) goto L4b
            int r10 = (r4 > r21 ? 1 : (r4 == r21 ? 0 : -1))
            if (r10 != 0) goto L4b
            r0 = 0
            return r0
        L4b:
            r10 = 2
            android.animation.PropertyValuesHolder[] r11 = new android.animation.PropertyValuesHolder[r10]
            android.util.Property r12 = android.view.View.TRANSLATION_X
            float[] r13 = new float[r10]
            r13[r6] = r7
            r13[r5] = r20
            android.animation.PropertyValuesHolder r7 = android.animation.PropertyValuesHolder.ofFloat(r12, r13)
            r11[r6] = r7
            android.util.Property r7 = android.view.View.TRANSLATION_Y
            float[] r10 = new float[r10]
            r10[r6] = r4
            r10[r5] = r21
            android.animation.PropertyValuesHolder r4 = android.animation.PropertyValuesHolder.ofFloat(r7, r10)
            r11[r5] = r4
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r14, r11)
            androidx.transition.TranslationAnimationCreator$TransitionPositionListener r5 = new androidx.transition.TranslationAnimationCreator$TransitionPositionListener
            android.view.View r1 = r1.view
            r15 = r5
            r16 = r14
            r17 = r1
            r18 = r8
            r19 = r9
            r20 = r2
            r21 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21)
            r0 = r23
            r0.addListener(r5)
            r4.addListener(r5)
            androidx.transition.AnimatorUtils.addPauseListener(r4, r5)
            r0 = r22
            r4.setInterpolator(r0)
            return r4
    }
}
