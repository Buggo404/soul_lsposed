package androidx.fragment.app;

/* loaded from: classes.dex */
class FragmentAnim {




    static class AnimationOrAnimator {
        public final android.view.animation.Animation animation;
        public final android.animation.Animator animator;

        AnimationOrAnimator(android.animation.Animator r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.animation = r0
                r1.animator = r2
                if (r2 == 0) goto Lb
                return
            Lb:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "Animator cannot be null"
                r2.<init>(r0)
                throw r2
        }

        AnimationOrAnimator(android.view.animation.Animation r2) {
                r1 = this;
                r1.<init>()
                r1.animation = r2
                r0 = 0
                r1.animator = r0
                if (r2 == 0) goto Lb
                return
            Lb:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "Animation cannot be null"
                r2.<init>(r0)
                throw r2
        }
    }

    static class EndViewTransitionAnimation extends android.view.animation.AnimationSet implements java.lang.Runnable {
        private boolean mAnimating;
        private final android.view.View mChild;
        private boolean mEnded;
        private final android.view.ViewGroup mParent;
        private boolean mTransitionEnded;

        EndViewTransitionAnimation(android.view.animation.Animation r2, android.view.ViewGroup r3, android.view.View r4) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r0 = 1
                r1.mAnimating = r0
                r1.mParent = r3
                r1.mChild = r4
                r1.addAnimation(r2)
                r3.post(r1)
                return
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long r3, android.view.animation.Transformation r5) {
                r2 = this;
                r0 = 1
                r2.mAnimating = r0
                boolean r1 = r2.mEnded
                if (r1 == 0) goto Lb
                boolean r3 = r2.mTransitionEnded
                r3 = r3 ^ r0
                return r3
            Lb:
                boolean r3 = super.getTransformation(r3, r5)
                if (r3 != 0) goto L18
                r2.mEnded = r0
                android.view.ViewGroup r3 = r2.mParent
                androidx.core.view.OneShotPreDrawListener.add(r3, r2)
            L18:
                return r0
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long r3, android.view.animation.Transformation r5, float r6) {
                r2 = this;
                r0 = 1
                r2.mAnimating = r0
                boolean r1 = r2.mEnded
                if (r1 == 0) goto Lb
                boolean r3 = r2.mTransitionEnded
                r3 = r3 ^ r0
                return r3
            Lb:
                boolean r3 = super.getTransformation(r3, r5, r6)
                if (r3 != 0) goto L18
                r2.mEnded = r0
                android.view.ViewGroup r3 = r2.mParent
                androidx.core.view.OneShotPreDrawListener.add(r3, r2)
            L18:
                return r0
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                boolean r0 = r2.mEnded
                if (r0 != 0) goto L11
                boolean r0 = r2.mAnimating
                if (r0 == 0) goto L11
                r0 = 0
                r2.mAnimating = r0
                android.view.ViewGroup r0 = r2.mParent
                r0.post(r2)
                goto L1b
            L11:
                android.view.ViewGroup r0 = r2.mParent
                android.view.View r1 = r2.mChild
                r0.endViewTransition(r1)
                r0 = 1
                r2.mTransitionEnded = r0
            L1b:
                return
        }
    }

    private FragmentAnim() {
            r0 = this;
            r0.<init>()
            return
    }

    static void animateRemoveFragment(androidx.fragment.app.Fragment r7, androidx.fragment.app.FragmentAnim.AnimationOrAnimator r8, androidx.fragment.app.FragmentTransition.Callback r9) {
            android.view.View r2 = r7.mView
            android.view.ViewGroup r1 = r7.mContainer
            r1.startViewTransition(r2)
            androidx.core.os.CancellationSignal r5 = new androidx.core.os.CancellationSignal
            r5.<init>()
            androidx.fragment.app.FragmentAnim$1 r0 = new androidx.fragment.app.FragmentAnim$1
            r0.<init>(r7)
            r5.setOnCancelListener(r0)
            r9.onStart(r7, r5)
            android.view.animation.Animation r0 = r8.animation
            if (r0 == 0) goto L35
            androidx.fragment.app.FragmentAnim$EndViewTransitionAnimation r0 = new androidx.fragment.app.FragmentAnim$EndViewTransitionAnimation
            android.view.animation.Animation r8 = r8.animation
            r0.<init>(r8, r1, r2)
            android.view.View r8 = r7.mView
            r7.setAnimatingAway(r8)
            androidx.fragment.app.FragmentAnim$2 r8 = new androidx.fragment.app.FragmentAnim$2
            r8.<init>(r1, r7, r9, r5)
            r0.setAnimationListener(r8)
            android.view.View r7 = r7.mView
            r7.startAnimation(r0)
            goto L4f
        L35:
            android.animation.Animator r6 = r8.animator
            android.animation.Animator r8 = r8.animator
            r7.setAnimator(r8)
            androidx.fragment.app.FragmentAnim$3 r8 = new androidx.fragment.app.FragmentAnim$3
            r0 = r8
            r3 = r7
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r6.addListener(r8)
            android.view.View r7 = r7.mView
            r6.setTarget(r7)
            r6.start()
        L4f:
            return
    }

    private static int getNextAnim(androidx.fragment.app.Fragment r0, boolean r1, boolean r2) {
            if (r2 == 0) goto Le
            if (r1 == 0) goto L9
            int r0 = r0.getPopEnterAnim()
            return r0
        L9:
            int r0 = r0.getPopExitAnim()
            return r0
        Le:
            if (r1 == 0) goto L15
            int r0 = r0.getEnterAnim()
            return r0
        L15:
            int r0 = r0.getExitAnim()
            return r0
    }

    static androidx.fragment.app.FragmentAnim.AnimationOrAnimator loadAnimation(android.content.Context r5, androidx.fragment.app.Fragment r6, boolean r7, boolean r8) {
            int r0 = r6.getNextTransition()
            int r8 = getNextAnim(r6, r7, r8)
            r1 = 0
            r6.setAnimations(r1, r1, r1, r1)
            android.view.ViewGroup r2 = r6.mContainer
            r3 = 0
            if (r2 == 0) goto L22
            android.view.ViewGroup r2 = r6.mContainer
            int r4 = androidx.fragment.C0252R.id.visible_removing_fragment_view_tag
            java.lang.Object r2 = r2.getTag(r4)
            if (r2 == 0) goto L22
            android.view.ViewGroup r2 = r6.mContainer
            int r4 = androidx.fragment.C0252R.id.visible_removing_fragment_view_tag
            r2.setTag(r4, r3)
        L22:
            android.view.ViewGroup r2 = r6.mContainer
            if (r2 == 0) goto L2f
            android.view.ViewGroup r2 = r6.mContainer
            android.animation.LayoutTransition r2 = r2.getLayoutTransition()
            if (r2 == 0) goto L2f
            return r3
        L2f:
            android.view.animation.Animation r2 = r6.onCreateAnimation(r0, r7, r8)
            if (r2 == 0) goto L3b
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r5 = new androidx.fragment.app.FragmentAnim$AnimationOrAnimator
            r5.<init>(r2)
            return r5
        L3b:
            android.animation.Animator r6 = r6.onCreateAnimator(r0, r7, r8)
            if (r6 == 0) goto L47
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r5 = new androidx.fragment.app.FragmentAnim$AnimationOrAnimator
            r5.<init>(r6)
            return r5
        L47:
            if (r8 != 0) goto L4f
            if (r0 == 0) goto L4f
            int r8 = transitToAnimResourceId(r0, r7)
        L4f:
            if (r8 == 0) goto L8f
            android.content.res.Resources r6 = r5.getResources()
            java.lang.String r6 = r6.getResourceTypeName(r8)
            java.lang.String r7 = "anim"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L71
            android.view.animation.Animation r7 = android.view.animation.AnimationUtils.loadAnimation(r5, r8)     // Catch: android.content.res.Resources.NotFoundException -> L6f java.lang.RuntimeException -> L71
            if (r7 == 0) goto L6d
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r0 = new androidx.fragment.app.FragmentAnim$AnimationOrAnimator     // Catch: android.content.res.Resources.NotFoundException -> L6f java.lang.RuntimeException -> L71
            r0.<init>(r7)     // Catch: android.content.res.Resources.NotFoundException -> L6f java.lang.RuntimeException -> L71
            return r0
        L6d:
            r1 = 1
            goto L71
        L6f:
            r5 = move-exception
            throw r5
        L71:
            if (r1 != 0) goto L8f
            android.animation.Animator r7 = android.animation.AnimatorInflater.loadAnimator(r5, r8)     // Catch: java.lang.RuntimeException -> L7f
            if (r7 == 0) goto L8f
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r0 = new androidx.fragment.app.FragmentAnim$AnimationOrAnimator     // Catch: java.lang.RuntimeException -> L7f
            r0.<init>(r7)     // Catch: java.lang.RuntimeException -> L7f
            return r0
        L7f:
            r7 = move-exception
            if (r6 != 0) goto L8e
            android.view.animation.Animation r5 = android.view.animation.AnimationUtils.loadAnimation(r5, r8)
            if (r5 == 0) goto L8f
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r6 = new androidx.fragment.app.FragmentAnim$AnimationOrAnimator
            r6.<init>(r5)
            return r6
        L8e:
            throw r7
        L8f:
            return r3
    }

    private static int transitToAnimResourceId(int r1, boolean r2) {
            r0 = 4097(0x1001, float:5.741E-42)
            if (r1 == r0) goto L1e
            r0 = 4099(0x1003, float:5.744E-42)
            if (r1 == r0) goto L16
            r0 = 8194(0x2002, float:1.1482E-41)
            if (r1 == r0) goto Le
            r1 = -1
            goto L25
        Le:
            if (r2 == 0) goto L13
            int r1 = androidx.fragment.C0252R.animator.fragment_close_enter
            goto L25
        L13:
            int r1 = androidx.fragment.C0252R.animator.fragment_close_exit
            goto L25
        L16:
            if (r2 == 0) goto L1b
            int r1 = androidx.fragment.C0252R.animator.fragment_fade_enter
            goto L25
        L1b:
            int r1 = androidx.fragment.C0252R.animator.fragment_fade_exit
            goto L25
        L1e:
            if (r2 == 0) goto L23
            int r1 = androidx.fragment.C0252R.animator.fragment_open_enter
            goto L25
        L23:
            int r1 = androidx.fragment.C0252R.animator.fragment_open_exit
        L25:
            return r1
    }
}
