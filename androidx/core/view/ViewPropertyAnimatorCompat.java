package androidx.core.view;

/* loaded from: classes.dex */
public final class ViewPropertyAnimatorCompat {
    static final int LISTENER_TAG_ID = 2113929216;
    java.lang.Runnable mEndAction;
    int mOldLayerType;
    java.lang.Runnable mStartAction;
    private java.lang.ref.WeakReference<android.view.View> mView;



    static class ViewPropertyAnimatorListenerApi14 implements androidx.core.view.ViewPropertyAnimatorListener {
        boolean mAnimEndCalled;
        androidx.core.view.ViewPropertyAnimatorCompat mVpa;

        ViewPropertyAnimatorListenerApi14(androidx.core.view.ViewPropertyAnimatorCompat r1) {
                r0 = this;
                r0.<init>()
                r0.mVpa = r1
                return
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationCancel(android.view.View r3) {
                r2 = this;
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r3.getTag(r0)
                boolean r1 = r0 instanceof androidx.core.view.ViewPropertyAnimatorListener
                if (r1 == 0) goto Ld
                androidx.core.view.ViewPropertyAnimatorListener r0 = (androidx.core.view.ViewPropertyAnimatorListener) r0
                goto Le
            Ld:
                r0 = 0
            Le:
                if (r0 == 0) goto L13
                r0.onAnimationCancel(r3)
            L13:
                return
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationEnd(android.view.View r4) {
                r3 = this;
                androidx.core.view.ViewPropertyAnimatorCompat r0 = r3.mVpa
                int r0 = r0.mOldLayerType
                r1 = 0
                r2 = -1
                if (r0 <= r2) goto L13
                androidx.core.view.ViewPropertyAnimatorCompat r0 = r3.mVpa
                int r0 = r0.mOldLayerType
                r4.setLayerType(r0, r1)
                androidx.core.view.ViewPropertyAnimatorCompat r0 = r3.mVpa
                r0.mOldLayerType = r2
            L13:
                androidx.core.view.ViewPropertyAnimatorCompat r0 = r3.mVpa
                java.lang.Runnable r0 = r0.mEndAction
                if (r0 == 0) goto L24
                androidx.core.view.ViewPropertyAnimatorCompat r0 = r3.mVpa
                java.lang.Runnable r0 = r0.mEndAction
                androidx.core.view.ViewPropertyAnimatorCompat r2 = r3.mVpa
                r2.mEndAction = r1
                r0.run()
            L24:
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r4.getTag(r0)
                boolean r2 = r0 instanceof androidx.core.view.ViewPropertyAnimatorListener
                if (r2 == 0) goto L31
                r1 = r0
                androidx.core.view.ViewPropertyAnimatorListener r1 = (androidx.core.view.ViewPropertyAnimatorListener) r1
            L31:
                if (r1 == 0) goto L36
                r1.onAnimationEnd(r4)
            L36:
                r4 = 1
                r3.mAnimEndCalled = r4
                return
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationStart(android.view.View r4) {
                r3 = this;
                r0 = 0
                r3.mAnimEndCalled = r0
                androidx.core.view.ViewPropertyAnimatorCompat r0 = r3.mVpa
                int r0 = r0.mOldLayerType
                r1 = -1
                r2 = 0
                if (r0 <= r1) goto Lf
                r0 = 2
                r4.setLayerType(r0, r2)
            Lf:
                androidx.core.view.ViewPropertyAnimatorCompat r0 = r3.mVpa
                java.lang.Runnable r0 = r0.mStartAction
                if (r0 == 0) goto L20
                androidx.core.view.ViewPropertyAnimatorCompat r0 = r3.mVpa
                java.lang.Runnable r0 = r0.mStartAction
                androidx.core.view.ViewPropertyAnimatorCompat r1 = r3.mVpa
                r1.mStartAction = r2
                r0.run()
            L20:
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r4.getTag(r0)
                boolean r1 = r0 instanceof androidx.core.view.ViewPropertyAnimatorListener
                if (r1 == 0) goto L2d
                r2 = r0
                androidx.core.view.ViewPropertyAnimatorListener r2 = (androidx.core.view.ViewPropertyAnimatorListener) r2
            L2d:
                if (r2 == 0) goto L32
                r2.onAnimationStart(r4)
            L32:
                return
        }
    }

    ViewPropertyAnimatorCompat(android.view.View r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mStartAction = r0
            r1.mEndAction = r0
            r0 = -1
            r1.mOldLayerType = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.mView = r0
            return
    }

    private void setListenerInternal(android.view.View r3, androidx.core.view.ViewPropertyAnimatorListener r4) {
            r2 = this;
            if (r4 == 0) goto Lf
            android.view.ViewPropertyAnimator r0 = r3.animate()
            androidx.core.view.ViewPropertyAnimatorCompat$1 r1 = new androidx.core.view.ViewPropertyAnimatorCompat$1
            r1.<init>(r2, r4, r3)
            r0.setListener(r1)
            goto L17
        Lf:
            android.view.ViewPropertyAnimator r3 = r3.animate()
            r4 = 0
            r3.setListener(r4)
        L17:
            return
    }

    public androidx.core.view.ViewPropertyAnimatorCompat alpha(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.alpha(r2)
        L11:
            return r1
    }

    public androidx.core.view.ViewPropertyAnimatorCompat alphaBy(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.alphaBy(r2)
        L11:
            return r1
    }

    public void cancel() {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.cancel()
        L11:
            return
    }

    public long getDuration() {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L13
            android.view.ViewPropertyAnimator r0 = r0.animate()
            long r0 = r0.getDuration()
            return r0
        L13:
            r0 = 0
            return r0
    }

    public android.view.animation.Interpolator getInterpolator() {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L15
            android.view.ViewPropertyAnimator r0 = r0.animate()
            android.animation.TimeInterpolator r0 = r0.getInterpolator()
            android.view.animation.Interpolator r0 = (android.view.animation.Interpolator) r0
            return r0
        L15:
            r0 = 0
            return r0
    }

    public long getStartDelay() {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L13
            android.view.ViewPropertyAnimator r0 = r0.animate()
            long r0 = r0.getStartDelay()
            return r0
        L13:
            r0 = 0
            return r0
    }

    public androidx.core.view.ViewPropertyAnimatorCompat rotation(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.rotation(r2)
        L11:
            return r1
    }

    public androidx.core.view.ViewPropertyAnimatorCompat rotationBy(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.rotationBy(r2)
        L11:
            return r1
    }

    public androidx.core.view.ViewPropertyAnimatorCompat rotationX(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.rotationX(r2)
        L11:
            return r1
    }

    public androidx.core.view.ViewPropertyAnimatorCompat rotationXBy(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.rotationXBy(r2)
        L11:
            return r1
    }

    public androidx.core.view.ViewPropertyAnimatorCompat rotationY(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.rotationY(r2)
        L11:
            return r1
    }

    public androidx.core.view.ViewPropertyAnimatorCompat rotationYBy(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.rotationYBy(r2)
        L11:
            return r1
    }

    public androidx.core.view.ViewPropertyAnimatorCompat scaleX(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.scaleX(r2)
        L11:
            return r1
    }

    public androidx.core.view.ViewPropertyAnimatorCompat scaleXBy(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.scaleXBy(r2)
        L11:
            return r1
    }

    public androidx.core.view.ViewPropertyAnimatorCompat scaleY(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.scaleY(r2)
        L11:
            return r1
    }

    public androidx.core.view.ViewPropertyAnimatorCompat scaleYBy(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.scaleYBy(r2)
        L11:
            return r1
    }

    public androidx.core.view.ViewPropertyAnimatorCompat setDuration(long r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.setDuration(r2)
        L11:
            return r1
    }

    public androidx.core.view.ViewPropertyAnimatorCompat setInterpolator(android.view.animation.Interpolator r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.setInterpolator(r2)
        L11:
            return r1
    }

    public androidx.core.view.ViewPropertyAnimatorCompat setListener(androidx.core.view.ViewPropertyAnimatorListener r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto Ld
            r1.setListenerInternal(r0, r2)
        Ld:
            return r1
    }

    public androidx.core.view.ViewPropertyAnimatorCompat setStartDelay(long r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.setStartDelay(r2)
        L11:
            return r1
    }

    public androidx.core.view.ViewPropertyAnimatorCompat setUpdateListener(androidx.core.view.ViewPropertyAnimatorUpdateListener r3) {
            r2 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r2.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L1a
            if (r3 == 0) goto L12
            androidx.core.view.ViewPropertyAnimatorCompat$2 r1 = new androidx.core.view.ViewPropertyAnimatorCompat$2
            r1.<init>(r2, r3, r0)
            goto L13
        L12:
            r1 = 0
        L13:
            android.view.ViewPropertyAnimator r3 = r0.animate()
            r3.setUpdateListener(r1)
        L1a:
            return r2
    }

    public void start() {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.start()
        L11:
            return
    }

    public androidx.core.view.ViewPropertyAnimatorCompat translationX(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.translationX(r2)
        L11:
            return r1
    }

    public androidx.core.view.ViewPropertyAnimatorCompat translationXBy(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.translationXBy(r2)
        L11:
            return r1
    }

    public androidx.core.view.ViewPropertyAnimatorCompat translationY(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.translationY(r2)
        L11:
            return r1
    }

    public androidx.core.view.ViewPropertyAnimatorCompat translationYBy(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.translationYBy(r2)
        L11:
            return r1
    }

    public androidx.core.view.ViewPropertyAnimatorCompat translationZ(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.translationZ(r2)
        L11:
            return r1
    }

    public androidx.core.view.ViewPropertyAnimatorCompat translationZBy(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.translationZBy(r2)
        L11:
            return r1
    }

    public androidx.core.view.ViewPropertyAnimatorCompat withEndAction(java.lang.Runnable r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.withEndAction(r2)
        L11:
            return r1
    }

    public androidx.core.view.ViewPropertyAnimatorCompat withLayer() {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.withLayer()
        L11:
            return r1
    }

    public androidx.core.view.ViewPropertyAnimatorCompat withStartAction(java.lang.Runnable r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.withStartAction(r2)
        L11:
            return r1
    }

    /* renamed from: x */
    public androidx.core.view.ViewPropertyAnimatorCompat m10x(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.x(r2)
        L11:
            return r1
    }

    public androidx.core.view.ViewPropertyAnimatorCompat xBy(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.xBy(r2)
        L11:
            return r1
    }

    /* renamed from: y */
    public androidx.core.view.ViewPropertyAnimatorCompat m11y(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.y(r2)
        L11:
            return r1
    }

    public androidx.core.view.ViewPropertyAnimatorCompat yBy(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.yBy(r2)
        L11:
            return r1
    }

    /* renamed from: z */
    public androidx.core.view.ViewPropertyAnimatorCompat m12z(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.z(r2)
        L11:
            return r1
    }

    public androidx.core.view.ViewPropertyAnimatorCompat zBy(float r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.mView
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L11
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.zBy(r2)
        L11:
            return r1
    }
}
