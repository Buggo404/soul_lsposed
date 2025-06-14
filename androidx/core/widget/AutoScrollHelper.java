package androidx.core.widget;

/* loaded from: classes.dex */
public abstract class AutoScrollHelper implements android.view.View.OnTouchListener {
    private static final int DEFAULT_ACTIVATION_DELAY = 0;
    private static final int DEFAULT_EDGE_TYPE = 1;
    private static final float DEFAULT_MAXIMUM_EDGE = Float.MAX_VALUE;
    private static final int DEFAULT_MAXIMUM_VELOCITY_DIPS = 1575;
    private static final int DEFAULT_MINIMUM_VELOCITY_DIPS = 315;
    private static final int DEFAULT_RAMP_DOWN_DURATION = 500;
    private static final int DEFAULT_RAMP_UP_DURATION = 500;
    private static final float DEFAULT_RELATIVE_EDGE = 0.2f;
    private static final float DEFAULT_RELATIVE_VELOCITY = 1.0f;
    public static final int EDGE_TYPE_INSIDE = 0;
    public static final int EDGE_TYPE_INSIDE_EXTEND = 1;
    public static final int EDGE_TYPE_OUTSIDE = 2;
    private static final int HORIZONTAL = 0;
    public static final float NO_MAX = Float.MAX_VALUE;
    public static final float NO_MIN = 0.0f;
    public static final float RELATIVE_UNSPECIFIED = 0.0f;
    private static final int VERTICAL = 1;
    private int mActivationDelay;
    private boolean mAlreadyDelayed;
    boolean mAnimating;
    private final android.view.animation.Interpolator mEdgeInterpolator;
    private int mEdgeType;
    private boolean mEnabled;
    private boolean mExclusive;
    private float[] mMaximumEdges;
    private float[] mMaximumVelocity;
    private float[] mMinimumVelocity;
    boolean mNeedsCancel;
    boolean mNeedsReset;
    private float[] mRelativeEdges;
    private float[] mRelativeVelocity;
    private java.lang.Runnable mRunnable;
    final androidx.core.widget.AutoScrollHelper.ClampedScroller mScroller;
    final android.view.View mTarget;

    private static class ClampedScroller {
        private long mDeltaTime;
        private int mDeltaX;
        private int mDeltaY;
        private int mEffectiveRampDown;
        private int mRampDownDuration;
        private int mRampUpDuration;
        private long mStartTime;
        private long mStopTime;
        private float mStopValue;
        private float mTargetVelocityX;
        private float mTargetVelocityY;

        ClampedScroller() {
                r2 = this;
                r2.<init>()
                r0 = -9223372036854775808
                r2.mStartTime = r0
                r0 = -1
                r2.mStopTime = r0
                r0 = 0
                r2.mDeltaTime = r0
                r0 = 0
                r2.mDeltaX = r0
                r2.mDeltaY = r0
                return
        }

        private float getValueAt(long r9) {
                r8 = this;
                long r0 = r8.mStartTime
                int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                r3 = 0
                if (r2 >= 0) goto L8
                return r3
            L8:
                long r4 = r8.mStopTime
                r6 = 0
                int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                r6 = 1065353216(0x3f800000, float:1.0)
                if (r2 < 0) goto L28
                int r2 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
                if (r2 >= 0) goto L17
                goto L28
            L17:
                long r9 = r9 - r4
                float r0 = r8.mStopValue
                float r1 = r6 - r0
                float r9 = (float) r9
                int r10 = r8.mEffectiveRampDown
                float r10 = (float) r10
                float r9 = r9 / r10
                float r9 = androidx.core.widget.AutoScrollHelper.constrain(r9, r3, r6)
                float r0 = r0 * r9
                float r1 = r1 + r0
                return r1
            L28:
                long r9 = r9 - r0
                float r9 = (float) r9
                int r10 = r8.mRampUpDuration
                float r10 = (float) r10
                float r9 = r9 / r10
                float r9 = androidx.core.widget.AutoScrollHelper.constrain(r9, r3, r6)
                r10 = 1056964608(0x3f000000, float:0.5)
                float r9 = r9 * r10
                return r9
        }

        private float interpolateValue(float r3) {
                r2 = this;
                r0 = -1065353216(0xffffffffc0800000, float:-4.0)
                float r0 = r0 * r3
                float r0 = r0 * r3
                r1 = 1082130432(0x40800000, float:4.0)
                float r3 = r3 * r1
                float r0 = r0 + r3
                return r0
        }

        public void computeScrollDelta() {
                r5 = this;
                long r0 = r5.mDeltaTime
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto L29
                long r0 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
                float r2 = r5.getValueAt(r0)
                float r2 = r5.interpolateValue(r2)
                long r3 = r5.mDeltaTime
                long r3 = r0 - r3
                r5.mDeltaTime = r0
                float r0 = (float) r3
                float r0 = r0 * r2
                float r1 = r5.mTargetVelocityX
                float r1 = r1 * r0
                int r1 = (int) r1
                r5.mDeltaX = r1
                float r1 = r5.mTargetVelocityY
                float r0 = r0 * r1
                int r0 = (int) r0
                r5.mDeltaY = r0
                return
            L29:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.String r1 = "Cannot compute scroll delta before calling start()"
                r0.<init>(r1)
                throw r0
        }

        public int getDeltaX() {
                r1 = this;
                int r0 = r1.mDeltaX
                return r0
        }

        public int getDeltaY() {
                r1 = this;
                int r0 = r1.mDeltaY
                return r0
        }

        public int getHorizontalDirection() {
                r2 = this;
                float r0 = r2.mTargetVelocityX
                float r1 = java.lang.Math.abs(r0)
                float r0 = r0 / r1
                int r0 = (int) r0
                return r0
        }

        public int getVerticalDirection() {
                r2 = this;
                float r0 = r2.mTargetVelocityY
                float r1 = java.lang.Math.abs(r0)
                float r0 = r0 / r1
                int r0 = (int) r0
                return r0
        }

        public boolean isFinished() {
                r6 = this;
                long r0 = r6.mStopTime
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 <= 0) goto L18
                long r0 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
                long r2 = r6.mStopTime
                int r4 = r6.mEffectiveRampDown
                long r4 = (long) r4
                long r2 = r2 + r4
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 <= 0) goto L18
                r0 = 1
                goto L19
            L18:
                r0 = 0
            L19:
                return r0
        }

        public void requestStop() {
                r5 = this;
                long r0 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
                long r2 = r5.mStartTime
                long r2 = r0 - r2
                int r2 = (int) r2
                r3 = 0
                int r4 = r5.mRampDownDuration
                int r2 = androidx.core.widget.AutoScrollHelper.constrain(r2, r3, r4)
                r5.mEffectiveRampDown = r2
                float r2 = r5.getValueAt(r0)
                r5.mStopValue = r2
                r5.mStopTime = r0
                return
        }

        public void setRampDownDuration(int r1) {
                r0 = this;
                r0.mRampDownDuration = r1
                return
        }

        public void setRampUpDuration(int r1) {
                r0 = this;
                r0.mRampUpDuration = r1
                return
        }

        public void setTargetVelocity(float r1, float r2) {
                r0 = this;
                r0.mTargetVelocityX = r1
                r0.mTargetVelocityY = r2
                return
        }

        public void start() {
                r4 = this;
                long r0 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
                r4.mStartTime = r0
                r2 = -1
                r4.mStopTime = r2
                r4.mDeltaTime = r0
                r0 = 1056964608(0x3f000000, float:0.5)
                r4.mStopValue = r0
                r0 = 0
                r4.mDeltaX = r0
                r4.mDeltaY = r0
                return
        }
    }

    private class ScrollAnimationRunnable implements java.lang.Runnable {
        final /* synthetic */ androidx.core.widget.AutoScrollHelper this$0;

        ScrollAnimationRunnable(androidx.core.widget.AutoScrollHelper r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                androidx.core.widget.AutoScrollHelper r0 = r3.this$0
                boolean r0 = r0.mAnimating
                if (r0 != 0) goto L7
                return
            L7:
                androidx.core.widget.AutoScrollHelper r0 = r3.this$0
                boolean r0 = r0.mNeedsReset
                r1 = 0
                if (r0 == 0) goto L19
                androidx.core.widget.AutoScrollHelper r0 = r3.this$0
                r0.mNeedsReset = r1
                androidx.core.widget.AutoScrollHelper r0 = r3.this$0
                androidx.core.widget.AutoScrollHelper$ClampedScroller r0 = r0.mScroller
                r0.start()
            L19:
                androidx.core.widget.AutoScrollHelper r0 = r3.this$0
                androidx.core.widget.AutoScrollHelper$ClampedScroller r0 = r0.mScroller
                boolean r2 = r0.isFinished()
                if (r2 != 0) goto L53
                androidx.core.widget.AutoScrollHelper r2 = r3.this$0
                boolean r2 = r2.shouldAnimate()
                if (r2 != 0) goto L2c
                goto L53
            L2c:
                androidx.core.widget.AutoScrollHelper r2 = r3.this$0
                boolean r2 = r2.mNeedsCancel
                if (r2 == 0) goto L3b
                androidx.core.widget.AutoScrollHelper r2 = r3.this$0
                r2.mNeedsCancel = r1
                androidx.core.widget.AutoScrollHelper r1 = r3.this$0
                r1.cancelTargetTouch()
            L3b:
                r0.computeScrollDelta()
                int r1 = r0.getDeltaX()
                int r0 = r0.getDeltaY()
                androidx.core.widget.AutoScrollHelper r2 = r3.this$0
                r2.scrollTargetBy(r1, r0)
                androidx.core.widget.AutoScrollHelper r0 = r3.this$0
                android.view.View r0 = r0.mTarget
                androidx.core.view.ViewCompat.postOnAnimation(r0, r3)
                return
            L53:
                androidx.core.widget.AutoScrollHelper r0 = r3.this$0
                r0.mAnimating = r1
                return
        }
    }

    static {
            int r0 = android.view.ViewConfiguration.getTapTimeout()
            androidx.core.widget.AutoScrollHelper.DEFAULT_ACTIVATION_DELAY = r0
            return
    }

    public AutoScrollHelper(android.view.View r4) {
            r3 = this;
            r3.<init>()
            androidx.core.widget.AutoScrollHelper$ClampedScroller r0 = new androidx.core.widget.AutoScrollHelper$ClampedScroller
            r0.<init>()
            r3.mScroller = r0
            android.view.animation.AccelerateInterpolator r0 = new android.view.animation.AccelerateInterpolator
            r0.<init>()
            r3.mEdgeInterpolator = r0
            r0 = 2
            float[] r1 = new float[r0]
            r1 = {x007c: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            r3.mRelativeEdges = r1
            float[] r1 = new float[r0]
            r1 = {x0084: FILL_ARRAY_DATA , data: [2139095039, 2139095039} // fill-array
            r3.mMaximumEdges = r1
            float[] r1 = new float[r0]
            r1 = {x008c: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            r3.mRelativeVelocity = r1
            float[] r1 = new float[r0]
            r1 = {x0094: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            r3.mMinimumVelocity = r1
            float[] r0 = new float[r0]
            r0 = {x009c: FILL_ARRAY_DATA , data: [2139095039, 2139095039} // fill-array
            r3.mMaximumVelocity = r0
            r3.mTarget = r4
            android.content.res.Resources r4 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            r0 = 1153753088(0x44c4e000, float:1575.0)
            float r1 = r4.density
            float r1 = r1 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r1 = (int) r1
            r2 = 1134395392(0x439d8000, float:315.0)
            float r4 = r4.density
            float r4 = r4 * r2
            float r4 = r4 + r0
            int r4 = (int) r4
            float r0 = (float) r1
            r3.setMaximumVelocity(r0, r0)
            float r4 = (float) r4
            r3.setMinimumVelocity(r4, r4)
            r4 = 1
            r3.setEdgeType(r4)
            r4 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r3.setMaximumEdges(r4, r4)
            r4 = 1045220557(0x3e4ccccd, float:0.2)
            r3.setRelativeEdges(r4, r4)
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.setRelativeVelocity(r4, r4)
            int r4 = androidx.core.widget.AutoScrollHelper.DEFAULT_ACTIVATION_DELAY
            r3.setActivationDelay(r4)
            r4 = 500(0x1f4, float:7.0E-43)
            r3.setRampUpDuration(r4)
            r3.setRampDownDuration(r4)
            return
    }

    private float computeTargetVelocity(int r4, float r5, float r6, float r7) {
            r3 = this;
            float[] r0 = r3.mRelativeEdges
            r0 = r0[r4]
            float[] r1 = r3.mMaximumEdges
            r1 = r1[r4]
            float r5 = r3.getEdgeValue(r0, r6, r1, r5)
            r6 = 0
            int r0 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r0 != 0) goto L12
            return r6
        L12:
            float[] r6 = r3.mRelativeVelocity
            r6 = r6[r4]
            float[] r1 = r3.mMinimumVelocity
            r1 = r1[r4]
            float[] r2 = r3.mMaximumVelocity
            r4 = r2[r4]
            float r6 = r6 * r7
            if (r0 <= 0) goto L27
            float r5 = r5 * r6
            float r4 = constrain(r5, r1, r4)
            return r4
        L27:
            float r5 = -r5
            float r5 = r5 * r6
            float r4 = constrain(r5, r1, r4)
            float r4 = -r4
            return r4
    }

    static float constrain(float r1, float r2, float r3) {
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L5
            return r3
        L5:
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 >= 0) goto La
            return r2
        La:
            return r1
    }

    static int constrain(int r0, int r1, int r2) {
            if (r0 <= r2) goto L3
            return r2
        L3:
            if (r0 >= r1) goto L6
            return r1
        L6:
            return r0
    }

    private float constrainEdgeValue(float r6, float r7) {
            r5 = this;
            r0 = 0
            int r1 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r1 != 0) goto L6
            return r0
        L6:
            int r1 = r5.mEdgeType
            r2 = 1
            if (r1 == 0) goto L18
            if (r1 == r2) goto L18
            r2 = 2
            if (r1 == r2) goto L11
            goto L2c
        L11:
            int r1 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r1 >= 0) goto L2c
            float r7 = -r7
            float r6 = r6 / r7
            return r6
        L18:
            int r3 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r3 >= 0) goto L2c
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r3 < 0) goto L25
            float r6 = r6 / r7
            float r4 = r4 - r6
            return r4
        L25:
            boolean r6 = r5.mAnimating
            if (r6 == 0) goto L2c
            if (r1 != r2) goto L2c
            return r4
        L2c:
            return r0
    }

    private float getEdgeValue(float r2, float r3, float r4, float r5) {
            r1 = this;
            float r2 = r2 * r3
            r0 = 0
            float r2 = constrain(r2, r0, r4)
            float r4 = r1.constrainEdgeValue(r5, r2)
            float r3 = r3 - r5
            float r2 = r1.constrainEdgeValue(r3, r2)
            float r2 = r2 - r4
            int r3 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r3 >= 0) goto L1d
            android.view.animation.Interpolator r3 = r1.mEdgeInterpolator
            float r2 = -r2
            float r2 = r3.getInterpolation(r2)
            float r2 = -r2
            goto L27
        L1d:
            int r3 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r3 <= 0) goto L30
            android.view.animation.Interpolator r3 = r1.mEdgeInterpolator
            float r2 = r3.getInterpolation(r2)
        L27:
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4 = 1065353216(0x3f800000, float:1.0)
            float r2 = constrain(r2, r3, r4)
            return r2
        L30:
            return r0
    }

    private void requestStop() {
            r1 = this;
            boolean r0 = r1.mNeedsReset
            if (r0 == 0) goto L8
            r0 = 0
            r1.mAnimating = r0
            goto Ld
        L8:
            androidx.core.widget.AutoScrollHelper$ClampedScroller r0 = r1.mScroller
            r0.requestStop()
        Ld:
            return
    }

    private void startAnimating() {
            r6 = this;
            java.lang.Runnable r0 = r6.mRunnable
            if (r0 != 0) goto Lb
            androidx.core.widget.AutoScrollHelper$ScrollAnimationRunnable r0 = new androidx.core.widget.AutoScrollHelper$ScrollAnimationRunnable
            r0.<init>(r6)
            r6.mRunnable = r0
        Lb:
            r0 = 1
            r6.mAnimating = r0
            r6.mNeedsReset = r0
            boolean r1 = r6.mAlreadyDelayed
            if (r1 != 0) goto L21
            int r1 = r6.mActivationDelay
            if (r1 <= 0) goto L21
            android.view.View r2 = r6.mTarget
            java.lang.Runnable r3 = r6.mRunnable
            long r4 = (long) r1
            androidx.core.view.ViewCompat.postOnAnimationDelayed(r2, r3, r4)
            goto L26
        L21:
            java.lang.Runnable r1 = r6.mRunnable
            r1.run()
        L26:
            r6.mAlreadyDelayed = r0
            return
    }

    public abstract boolean canTargetScrollHorizontally(int r1);

    public abstract boolean canTargetScrollVertically(int r1);

    void cancelTargetTouch() {
            r8 = this;
            long r2 = android.os.SystemClock.uptimeMillis()
            r4 = 3
            r5 = 0
            r6 = 0
            r7 = 0
            r0 = r2
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r0, r2, r4, r5, r6, r7)
            android.view.View r1 = r8.mTarget
            r1.onTouchEvent(r0)
            r0.recycle()
            return
    }

    public boolean isEnabled() {
            r1 = this;
            boolean r0 = r1.mEnabled
            return r0
    }

    public boolean isExclusive() {
            r1 = this;
            boolean r0 = r1.mExclusive
            return r0
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
            r5 = this;
            boolean r0 = r5.mEnabled
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.requestStop()
            goto L58
        L1a:
            r5.mNeedsCancel = r2
            r5.mAlreadyDelayed = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.mTarget
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.computeTargetVelocity(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.mTarget
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.computeTargetVelocity(r2, r7, r6, r3)
            androidx.core.widget.AutoScrollHelper$ClampedScroller r7 = r5.mScroller
            r7.setTargetVelocity(r0, r6)
            boolean r6 = r5.mAnimating
            if (r6 != 0) goto L58
            boolean r6 = r5.shouldAnimate()
            if (r6 == 0) goto L58
            r5.startAnimating()
        L58:
            boolean r6 = r5.mExclusive
            if (r6 == 0) goto L61
            boolean r6 = r5.mAnimating
            if (r6 == 0) goto L61
            r1 = r2
        L61:
            return r1
    }

    public abstract void scrollTargetBy(int r1, int r2);

    public androidx.core.widget.AutoScrollHelper setActivationDelay(int r1) {
            r0 = this;
            r0.mActivationDelay = r1
            return r0
    }

    public androidx.core.widget.AutoScrollHelper setEdgeType(int r1) {
            r0 = this;
            r0.mEdgeType = r1
            return r0
    }

    public androidx.core.widget.AutoScrollHelper setEnabled(boolean r2) {
            r1 = this;
            boolean r0 = r1.mEnabled
            if (r0 == 0) goto L9
            if (r2 != 0) goto L9
            r1.requestStop()
        L9:
            r1.mEnabled = r2
            return r1
    }

    public androidx.core.widget.AutoScrollHelper setExclusive(boolean r1) {
            r0 = this;
            r0.mExclusive = r1
            return r0
    }

    public androidx.core.widget.AutoScrollHelper setMaximumEdges(float r3, float r4) {
            r2 = this;
            float[] r0 = r2.mMaximumEdges
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            return r2
    }

    public androidx.core.widget.AutoScrollHelper setMaximumVelocity(float r4, float r5) {
            r3 = this;
            float[] r0 = r3.mMaximumVelocity
            r1 = 1148846080(0x447a0000, float:1000.0)
            float r4 = r4 / r1
            r2 = 0
            r0[r2] = r4
            r4 = 1
            float r5 = r5 / r1
            r0[r4] = r5
            return r3
    }

    public androidx.core.widget.AutoScrollHelper setMinimumVelocity(float r4, float r5) {
            r3 = this;
            float[] r0 = r3.mMinimumVelocity
            r1 = 1148846080(0x447a0000, float:1000.0)
            float r4 = r4 / r1
            r2 = 0
            r0[r2] = r4
            r4 = 1
            float r5 = r5 / r1
            r0[r4] = r5
            return r3
    }

    public androidx.core.widget.AutoScrollHelper setRampDownDuration(int r2) {
            r1 = this;
            androidx.core.widget.AutoScrollHelper$ClampedScroller r0 = r1.mScroller
            r0.setRampDownDuration(r2)
            return r1
    }

    public androidx.core.widget.AutoScrollHelper setRampUpDuration(int r2) {
            r1 = this;
            androidx.core.widget.AutoScrollHelper$ClampedScroller r0 = r1.mScroller
            r0.setRampUpDuration(r2)
            return r1
    }

    public androidx.core.widget.AutoScrollHelper setRelativeEdges(float r3, float r4) {
            r2 = this;
            float[] r0 = r2.mRelativeEdges
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            return r2
    }

    public androidx.core.widget.AutoScrollHelper setRelativeVelocity(float r4, float r5) {
            r3 = this;
            float[] r0 = r3.mRelativeVelocity
            r1 = 1148846080(0x447a0000, float:1000.0)
            float r4 = r4 / r1
            r2 = 0
            r0[r2] = r4
            r4 = 1
            float r5 = r5 / r1
            r0[r4] = r5
            return r3
    }

    boolean shouldAnimate() {
            r2 = this;
            androidx.core.widget.AutoScrollHelper$ClampedScroller r0 = r2.mScroller
            int r1 = r0.getVerticalDirection()
            int r0 = r0.getHorizontalDirection()
            if (r1 == 0) goto L12
            boolean r1 = r2.canTargetScrollVertically(r1)
            if (r1 != 0) goto L1a
        L12:
            if (r0 == 0) goto L1c
            boolean r0 = r2.canTargetScrollHorizontally(r0)
            if (r0 == 0) goto L1c
        L1a:
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            return r0
    }
}
