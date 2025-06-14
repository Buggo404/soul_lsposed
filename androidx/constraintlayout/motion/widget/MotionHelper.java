package androidx.constraintlayout.motion.widget;

/* loaded from: classes.dex */
public class MotionHelper extends androidx.constraintlayout.widget.ConstraintHelper implements androidx.constraintlayout.motion.widget.MotionHelperInterface {
    private float mProgress;
    private boolean mUseOnHide;
    private boolean mUseOnShow;
    protected android.view.View[] views;

    public MotionHelper(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.mUseOnShow = r1
            r0.mUseOnHide = r1
            return
    }

    public MotionHelper(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.mUseOnShow = r1
            r0.mUseOnHide = r1
            r0.init(r2)
            return
    }

    public MotionHelper(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 0
            r0.mUseOnShow = r1
            r0.mUseOnHide = r1
            r0.init(r2)
            return
    }

    @Override // androidx.constraintlayout.motion.widget.Animatable
    public float getProgress() {
            r1 = this;
            float r0 = r1.mProgress
            return r0
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    protected void init(android.util.AttributeSet r5) {
            r4 = this;
            super.init(r5)
            if (r5 == 0) goto L39
            android.content.Context r0 = r4.getContext()
            int[] r1 = androidx.constraintlayout.widget.C0156R.styleable.MotionHelper
            android.content.res.TypedArray r5 = r0.obtainStyledAttributes(r5, r1)
            int r0 = r5.getIndexCount()
            r1 = 0
        L14:
            if (r1 >= r0) goto L36
            int r2 = r5.getIndex(r1)
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.MotionHelper_onShow
            if (r2 != r3) goto L27
            boolean r3 = r4.mUseOnShow
            boolean r2 = r5.getBoolean(r2, r3)
            r4.mUseOnShow = r2
            goto L33
        L27:
            int r3 = androidx.constraintlayout.widget.C0156R.styleable.MotionHelper_onHide
            if (r2 != r3) goto L33
            boolean r3 = r4.mUseOnHide
            boolean r2 = r5.getBoolean(r2, r3)
            r4.mUseOnHide = r2
        L33:
            int r1 = r1 + 1
            goto L14
        L36:
            r5.recycle()
        L39:
            return
    }

    public boolean isDecorator() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelperInterface
    public boolean isUseOnHide() {
            r1 = this;
            boolean r0 = r1.mUseOnHide
            return r0
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelperInterface
    public boolean isUsedOnShow() {
            r1 = this;
            boolean r0 = r1.mUseOnShow
            return r0
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelperInterface
    public void onFinishedMotionScene(androidx.constraintlayout.motion.widget.MotionLayout r1) {
            r0 = this;
            return
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelperInterface
    public void onPostDraw(android.graphics.Canvas r1) {
            r0 = this;
            return
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelperInterface
    public void onPreDraw(android.graphics.Canvas r1) {
            r0 = this;
            return
    }

    public void onPreSetup(androidx.constraintlayout.motion.widget.MotionLayout r1, java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r2) {
            r0 = this;
            return
    }

    public void onTransitionChange(androidx.constraintlayout.motion.widget.MotionLayout r1, int r2, int r3, float r4) {
            r0 = this;
            return
    }

    public void onTransitionCompleted(androidx.constraintlayout.motion.widget.MotionLayout r1, int r2) {
            r0 = this;
            return
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public void onTransitionStarted(androidx.constraintlayout.motion.widget.MotionLayout r1, int r2, int r3) {
            r0 = this;
            return
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public void onTransitionTrigger(androidx.constraintlayout.motion.widget.MotionLayout r1, int r2, boolean r3, float r4) {
            r0 = this;
            return
    }

    @Override // androidx.constraintlayout.motion.widget.Animatable
    public void setProgress(float r6) {
            r5 = this;
            r5.mProgress = r6
            int r0 = r5.mCount
            r1 = 0
            if (r0 <= 0) goto L21
            android.view.ViewParent r0 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            android.view.View[] r0 = r5.getViews(r0)
            r5.views = r0
        L13:
            int r0 = r5.mCount
            if (r1 >= r0) goto L3c
            android.view.View[] r0 = r5.views
            r0 = r0[r1]
            r5.setProgress(r0, r6)
            int r1 = r1 + 1
            goto L13
        L21:
            android.view.ViewParent r0 = r5.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r2 = r0.getChildCount()
        L2b:
            if (r1 >= r2) goto L3c
            android.view.View r3 = r0.getChildAt(r1)
            boolean r4 = r3 instanceof androidx.constraintlayout.motion.widget.MotionHelper
            if (r4 == 0) goto L36
            goto L39
        L36:
            r5.setProgress(r3, r6)
        L39:
            int r1 = r1 + 1
            goto L2b
        L3c:
            return
    }

    public void setProgress(android.view.View r1, float r2) {
            r0 = this;
            return
    }
}
