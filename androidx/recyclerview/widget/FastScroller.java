package androidx.recyclerview.widget;

/* loaded from: classes.dex */
class FastScroller extends androidx.recyclerview.widget.RecyclerView.ItemDecoration implements androidx.recyclerview.widget.RecyclerView.OnItemTouchListener {
    private static final int ANIMATION_STATE_FADING_IN = 1;
    private static final int ANIMATION_STATE_FADING_OUT = 3;
    private static final int ANIMATION_STATE_IN = 2;
    private static final int ANIMATION_STATE_OUT = 0;
    private static final int DRAG_NONE = 0;
    private static final int DRAG_X = 1;
    private static final int DRAG_Y = 2;
    private static final int[] EMPTY_STATE_SET = null;
    private static final int HIDE_DELAY_AFTER_DRAGGING_MS = 1200;
    private static final int HIDE_DELAY_AFTER_VISIBLE_MS = 1500;
    private static final int HIDE_DURATION_MS = 500;
    private static final int[] PRESSED_STATE_SET = null;
    private static final int SCROLLBAR_FULL_OPAQUE = 255;
    private static final int SHOW_DURATION_MS = 500;
    private static final int STATE_DRAGGING = 2;
    private static final int STATE_HIDDEN = 0;
    private static final int STATE_VISIBLE = 1;
    int mAnimationState;
    private int mDragState;
    private final java.lang.Runnable mHideRunnable;
    float mHorizontalDragX;
    private final int[] mHorizontalRange;
    int mHorizontalThumbCenterX;
    private final android.graphics.drawable.StateListDrawable mHorizontalThumbDrawable;
    private final int mHorizontalThumbHeight;
    int mHorizontalThumbWidth;
    private final android.graphics.drawable.Drawable mHorizontalTrackDrawable;
    private final int mHorizontalTrackHeight;
    private final int mMargin;
    private boolean mNeedHorizontalScrollbar;
    private boolean mNeedVerticalScrollbar;
    private final androidx.recyclerview.widget.RecyclerView.OnScrollListener mOnScrollListener;
    private androidx.recyclerview.widget.RecyclerView mRecyclerView;
    private int mRecyclerViewHeight;
    private int mRecyclerViewWidth;
    private final int mScrollbarMinimumRange;
    final android.animation.ValueAnimator mShowHideAnimator;
    private int mState;
    float mVerticalDragY;
    private final int[] mVerticalRange;
    int mVerticalThumbCenterY;
    final android.graphics.drawable.StateListDrawable mVerticalThumbDrawable;
    int mVerticalThumbHeight;
    private final int mVerticalThumbWidth;
    final android.graphics.drawable.Drawable mVerticalTrackDrawable;
    private final int mVerticalTrackWidth;



    private class AnimatorListener extends android.animation.AnimatorListenerAdapter {
        private boolean mCanceled;
        final /* synthetic */ androidx.recyclerview.widget.FastScroller this$0;

        AnimatorListener(androidx.recyclerview.widget.FastScroller r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r1 = 0
                r0.mCanceled = r1
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator r1) {
                r0 = this;
                r1 = 1
                r0.mCanceled = r1
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r3) {
                r2 = this;
                boolean r3 = r2.mCanceled
                r0 = 0
                if (r3 == 0) goto L8
                r2.mCanceled = r0
                return
            L8:
                androidx.recyclerview.widget.FastScroller r3 = r2.this$0
                android.animation.ValueAnimator r3 = r3.mShowHideAnimator
                java.lang.Object r3 = r3.getAnimatedValue()
                java.lang.Float r3 = (java.lang.Float) r3
                float r3 = r3.floatValue()
                r1 = 0
                int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r3 != 0) goto L25
                androidx.recyclerview.widget.FastScroller r3 = r2.this$0
                r3.mAnimationState = r0
                androidx.recyclerview.widget.FastScroller r3 = r2.this$0
                r3.setState(r0)
                goto L2f
            L25:
                androidx.recyclerview.widget.FastScroller r3 = r2.this$0
                r0 = 2
                r3.mAnimationState = r0
                androidx.recyclerview.widget.FastScroller r3 = r2.this$0
                r3.requestRedraw()
            L2f:
                return
        }
    }

    private class AnimatorUpdater implements android.animation.ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ androidx.recyclerview.widget.FastScroller this$0;

        AnimatorUpdater(androidx.recyclerview.widget.FastScroller r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(android.animation.ValueAnimator r2) {
                r1 = this;
                java.lang.Object r2 = r2.getAnimatedValue()
                java.lang.Float r2 = (java.lang.Float) r2
                float r2 = r2.floatValue()
                r0 = 1132396544(0x437f0000, float:255.0)
                float r2 = r2 * r0
                int r2 = (int) r2
                androidx.recyclerview.widget.FastScroller r0 = r1.this$0
                android.graphics.drawable.StateListDrawable r0 = r0.mVerticalThumbDrawable
                r0.setAlpha(r2)
                androidx.recyclerview.widget.FastScroller r0 = r1.this$0
                android.graphics.drawable.Drawable r0 = r0.mVerticalTrackDrawable
                r0.setAlpha(r2)
                androidx.recyclerview.widget.FastScroller r2 = r1.this$0
                r2.requestRedraw()
                return
        }
    }

    static {
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 16842919(0x10100a7, float:2.3694026E-38)
            r2 = 0
            r0[r2] = r1
            androidx.recyclerview.widget.FastScroller.PRESSED_STATE_SET = r0
            int[] r0 = new int[r2]
            androidx.recyclerview.widget.FastScroller.EMPTY_STATE_SET = r0
            return
    }

    FastScroller(androidx.recyclerview.widget.RecyclerView r4, android.graphics.drawable.StateListDrawable r5, android.graphics.drawable.Drawable r6, android.graphics.drawable.StateListDrawable r7, android.graphics.drawable.Drawable r8, int r9, int r10, int r11) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.mRecyclerViewWidth = r0
            r3.mRecyclerViewHeight = r0
            r3.mNeedVerticalScrollbar = r0
            r3.mNeedHorizontalScrollbar = r0
            r3.mState = r0
            r3.mDragState = r0
            r1 = 2
            int[] r2 = new int[r1]
            r3.mVerticalRange = r2
            int[] r2 = new int[r1]
            r3.mHorizontalRange = r2
            float[] r1 = new float[r1]
            r1 = {x0084: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
            r3.mShowHideAnimator = r1
            r3.mAnimationState = r0
            androidx.recyclerview.widget.FastScroller$1 r0 = new androidx.recyclerview.widget.FastScroller$1
            r0.<init>(r3)
            r3.mHideRunnable = r0
            androidx.recyclerview.widget.FastScroller$2 r0 = new androidx.recyclerview.widget.FastScroller$2
            r0.<init>(r3)
            r3.mOnScrollListener = r0
            r3.mVerticalThumbDrawable = r5
            r3.mVerticalTrackDrawable = r6
            r3.mHorizontalThumbDrawable = r7
            r3.mHorizontalTrackDrawable = r8
            int r0 = r5.getIntrinsicWidth()
            int r0 = java.lang.Math.max(r9, r0)
            r3.mVerticalThumbWidth = r0
            int r0 = r6.getIntrinsicWidth()
            int r0 = java.lang.Math.max(r9, r0)
            r3.mVerticalTrackWidth = r0
            int r7 = r7.getIntrinsicWidth()
            int r7 = java.lang.Math.max(r9, r7)
            r3.mHorizontalThumbHeight = r7
            int r7 = r8.getIntrinsicWidth()
            int r7 = java.lang.Math.max(r9, r7)
            r3.mHorizontalTrackHeight = r7
            r3.mScrollbarMinimumRange = r10
            r3.mMargin = r11
            r7 = 255(0xff, float:3.57E-43)
            r5.setAlpha(r7)
            r6.setAlpha(r7)
            androidx.recyclerview.widget.FastScroller$AnimatorListener r5 = new androidx.recyclerview.widget.FastScroller$AnimatorListener
            r5.<init>(r3)
            r1.addListener(r5)
            androidx.recyclerview.widget.FastScroller$AnimatorUpdater r5 = new androidx.recyclerview.widget.FastScroller$AnimatorUpdater
            r5.<init>(r3)
            r1.addUpdateListener(r5)
            r3.attachToRecyclerView(r4)
            return
    }

    private void cancelHide() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
            java.lang.Runnable r1 = r2.mHideRunnable
            r0.removeCallbacks(r1)
            return
    }

    private void destroyCallbacks() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
            r0.removeItemDecoration(r2)
            androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
            r0.removeOnItemTouchListener(r2)
            androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
            androidx.recyclerview.widget.RecyclerView$OnScrollListener r1 = r2.mOnScrollListener
            r0.removeOnScrollListener(r1)
            r2.cancelHide()
            return
    }

    private void drawHorizontalScrollbar(android.graphics.Canvas r7) {
            r6 = this;
            int r0 = r6.mRecyclerViewHeight
            int r1 = r6.mHorizontalThumbHeight
            int r0 = r0 - r1
            int r2 = r6.mHorizontalThumbCenterX
            int r3 = r6.mHorizontalThumbWidth
            int r4 = r3 / 2
            int r2 = r2 - r4
            android.graphics.drawable.StateListDrawable r4 = r6.mHorizontalThumbDrawable
            r5 = 0
            r4.setBounds(r5, r5, r3, r1)
            android.graphics.drawable.Drawable r1 = r6.mHorizontalTrackDrawable
            int r3 = r6.mRecyclerViewWidth
            int r4 = r6.mHorizontalTrackHeight
            r1.setBounds(r5, r5, r3, r4)
            float r1 = (float) r0
            r3 = 0
            r7.translate(r3, r1)
            android.graphics.drawable.Drawable r1 = r6.mHorizontalTrackDrawable
            r1.draw(r7)
            float r1 = (float) r2
            r7.translate(r1, r3)
            android.graphics.drawable.StateListDrawable r1 = r6.mHorizontalThumbDrawable
            r1.draw(r7)
            int r1 = -r2
            float r1 = (float) r1
            int r0 = -r0
            float r0 = (float) r0
            r7.translate(r1, r0)
            return
    }

    private void drawVerticalScrollbar(android.graphics.Canvas r7) {
            r6 = this;
            int r0 = r6.mRecyclerViewWidth
            int r1 = r6.mVerticalThumbWidth
            int r0 = r0 - r1
            int r2 = r6.mVerticalThumbCenterY
            int r3 = r6.mVerticalThumbHeight
            int r4 = r3 / 2
            int r2 = r2 - r4
            android.graphics.drawable.StateListDrawable r4 = r6.mVerticalThumbDrawable
            r5 = 0
            r4.setBounds(r5, r5, r1, r3)
            android.graphics.drawable.Drawable r1 = r6.mVerticalTrackDrawable
            int r3 = r6.mVerticalTrackWidth
            int r4 = r6.mRecyclerViewHeight
            r1.setBounds(r5, r5, r3, r4)
            boolean r1 = r6.isLayoutRTL()
            if (r1 == 0) goto L46
            android.graphics.drawable.Drawable r0 = r6.mVerticalTrackDrawable
            r0.draw(r7)
            int r0 = r6.mVerticalThumbWidth
            float r0 = (float) r0
            float r1 = (float) r2
            r7.translate(r0, r1)
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = 1065353216(0x3f800000, float:1.0)
            r7.scale(r0, r1)
            android.graphics.drawable.StateListDrawable r0 = r6.mVerticalThumbDrawable
            r0.draw(r7)
            r7.scale(r1, r1)
            int r0 = r6.mVerticalThumbWidth
            int r0 = -r0
            float r0 = (float) r0
            int r1 = -r2
            float r1 = (float) r1
            r7.translate(r0, r1)
            goto L60
        L46:
            float r1 = (float) r0
            r3 = 0
            r7.translate(r1, r3)
            android.graphics.drawable.Drawable r1 = r6.mVerticalTrackDrawable
            r1.draw(r7)
            float r1 = (float) r2
            r7.translate(r3, r1)
            android.graphics.drawable.StateListDrawable r1 = r6.mVerticalThumbDrawable
            r1.draw(r7)
            int r0 = -r0
            float r0 = (float) r0
            int r1 = -r2
            float r1 = (float) r1
            r7.translate(r0, r1)
        L60:
            return
    }

    private int[] getHorizontalRange() {
            r3 = this;
            int[] r0 = r3.mHorizontalRange
            int r1 = r3.mMargin
            r2 = 0
            r0[r2] = r1
            int r2 = r3.mRecyclerViewWidth
            int r2 = r2 - r1
            r1 = 1
            r0[r1] = r2
            return r0
    }

    private int[] getVerticalRange() {
            r3 = this;
            int[] r0 = r3.mVerticalRange
            int r1 = r3.mMargin
            r2 = 0
            r0[r2] = r1
            int r2 = r3.mRecyclerViewHeight
            int r2 = r2 - r1
            r1 = 1
            r0[r1] = r2
            return r0
    }

    private void horizontalScrollTo(float r9) {
            r8 = this;
            int[] r3 = r8.getHorizontalRange()
            r7 = 0
            r0 = r3[r7]
            float r0 = (float) r0
            r1 = 1
            r1 = r3[r1]
            float r1 = (float) r1
            float r9 = java.lang.Math.min(r1, r9)
            float r9 = java.lang.Math.max(r0, r9)
            int r0 = r8.mHorizontalThumbCenterX
            float r0 = (float) r0
            float r0 = r0 - r9
            float r0 = java.lang.Math.abs(r0)
            r1 = 1073741824(0x40000000, float:2.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L23
            return
        L23:
            float r1 = r8.mHorizontalDragX
            androidx.recyclerview.widget.RecyclerView r0 = r8.mRecyclerView
            int r4 = r0.computeHorizontalScrollRange()
            androidx.recyclerview.widget.RecyclerView r0 = r8.mRecyclerView
            int r5 = r0.computeHorizontalScrollOffset()
            int r6 = r8.mRecyclerViewWidth
            r0 = r8
            r2 = r9
            int r0 = r0.scrollTo(r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L40
            androidx.recyclerview.widget.RecyclerView r1 = r8.mRecyclerView
            r1.scrollBy(r0, r7)
        L40:
            r8.mHorizontalDragX = r9
            return
    }

    private boolean isLayoutRTL() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
            int r0 = androidx.core.view.ViewCompat.getLayoutDirection(r0)
            r1 = 1
            if (r0 != r1) goto La
            goto Lb
        La:
            r1 = 0
        Lb:
            return r1
    }

    private void resetHideDelay(int r5) {
            r4 = this;
            r4.cancelHide()
            androidx.recyclerview.widget.RecyclerView r0 = r4.mRecyclerView
            java.lang.Runnable r1 = r4.mHideRunnable
            long r2 = (long) r5
            r0.postDelayed(r1, r2)
            return
    }

    private int scrollTo(float r3, float r4, int[] r5, int r6, int r7, int r8) {
            r2 = this;
            r0 = 1
            r0 = r5[r0]
            r1 = 0
            r5 = r5[r1]
            int r0 = r0 - r5
            if (r0 != 0) goto La
            return r1
        La:
            float r4 = r4 - r3
            float r3 = (float) r0
            float r4 = r4 / r3
            int r6 = r6 - r8
            float r3 = (float) r6
            float r4 = r4 * r3
            int r3 = (int) r4
            int r7 = r7 + r3
            if (r7 >= r6) goto L17
            if (r7 < 0) goto L17
            return r3
        L17:
            return r1
    }

    private void setupCallbacks() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
            r0.addItemDecoration(r2)
            androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
            r0.addOnItemTouchListener(r2)
            androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
            androidx.recyclerview.widget.RecyclerView$OnScrollListener r1 = r2.mOnScrollListener
            r0.addOnScrollListener(r1)
            return
    }

    private void verticalScrollTo(float r9) {
            r8 = this;
            int[] r3 = r8.getVerticalRange()
            r7 = 0
            r0 = r3[r7]
            float r0 = (float) r0
            r1 = 1
            r1 = r3[r1]
            float r1 = (float) r1
            float r9 = java.lang.Math.min(r1, r9)
            float r9 = java.lang.Math.max(r0, r9)
            int r0 = r8.mVerticalThumbCenterY
            float r0 = (float) r0
            float r0 = r0 - r9
            float r0 = java.lang.Math.abs(r0)
            r1 = 1073741824(0x40000000, float:2.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L23
            return
        L23:
            float r1 = r8.mVerticalDragY
            androidx.recyclerview.widget.RecyclerView r0 = r8.mRecyclerView
            int r4 = r0.computeVerticalScrollRange()
            androidx.recyclerview.widget.RecyclerView r0 = r8.mRecyclerView
            int r5 = r0.computeVerticalScrollOffset()
            int r6 = r8.mRecyclerViewHeight
            r0 = r8
            r2 = r9
            int r0 = r0.scrollTo(r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L40
            androidx.recyclerview.widget.RecyclerView r1 = r8.mRecyclerView
            r1.scrollBy(r7, r0)
        L40:
            r8.mVerticalDragY = r9
            return
    }

    public void attachToRecyclerView(androidx.recyclerview.widget.RecyclerView r2) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
            if (r0 != r2) goto L5
            return
        L5:
            if (r0 == 0) goto La
            r1.destroyCallbacks()
        La:
            r1.mRecyclerView = r2
            if (r2 == 0) goto L11
            r1.setupCallbacks()
        L11:
            return
    }

    android.graphics.drawable.Drawable getHorizontalThumbDrawable() {
            r1 = this;
            android.graphics.drawable.StateListDrawable r0 = r1.mHorizontalThumbDrawable
            return r0
    }

    android.graphics.drawable.Drawable getHorizontalTrackDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mHorizontalTrackDrawable
            return r0
    }

    android.graphics.drawable.Drawable getVerticalThumbDrawable() {
            r1 = this;
            android.graphics.drawable.StateListDrawable r0 = r1.mVerticalThumbDrawable
            return r0
    }

    android.graphics.drawable.Drawable getVerticalTrackDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mVerticalTrackDrawable
            return r0
    }

    void hide(int r6) {
            r5 = this;
            int r0 = r5.mAnimationState
            r1 = 2
            r2 = 1
            if (r0 == r2) goto L9
            if (r0 == r1) goto Le
            goto L33
        L9:
            android.animation.ValueAnimator r0 = r5.mShowHideAnimator
            r0.cancel()
        Le:
            r0 = 3
            r5.mAnimationState = r0
            android.animation.ValueAnimator r0 = r5.mShowHideAnimator
            float[] r1 = new float[r1]
            java.lang.Object r3 = r0.getAnimatedValue()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            r4 = 0
            r1[r4] = r3
            r3 = 0
            r1[r2] = r3
            r0.setFloatValues(r1)
            android.animation.ValueAnimator r0 = r5.mShowHideAnimator
            long r1 = (long) r6
            r0.setDuration(r1)
            android.animation.ValueAnimator r6 = r5.mShowHideAnimator
            r6.start()
        L33:
            return
    }

    public boolean isDragging() {
            r2 = this;
            int r0 = r2.mState
            r1 = 2
            if (r0 != r1) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    boolean isPointInsideHorizontalThumb(float r3, float r4) {
            r2 = this;
            int r0 = r2.mRecyclerViewHeight
            int r1 = r2.mHorizontalThumbHeight
            int r0 = r0 - r1
            float r0 = (float) r0
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 < 0) goto L21
            int r4 = r2.mHorizontalThumbCenterX
            int r0 = r2.mHorizontalThumbWidth
            int r1 = r0 / 2
            int r1 = r4 - r1
            float r1 = (float) r1
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 < 0) goto L21
            int r0 = r0 / 2
            int r4 = r4 + r0
            float r4 = (float) r4
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 > 0) goto L21
            r3 = 1
            goto L22
        L21:
            r3 = 0
        L22:
            return r3
    }

    boolean isPointInsideVerticalThumb(float r3, float r4) {
            r2 = this;
            boolean r0 = r2.isLayoutRTL()
            if (r0 == 0) goto L10
            int r0 = r2.mVerticalThumbWidth
            int r0 = r0 / 2
            float r0 = (float) r0
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 > 0) goto L31
            goto L1a
        L10:
            int r0 = r2.mRecyclerViewWidth
            int r1 = r2.mVerticalThumbWidth
            int r0 = r0 - r1
            float r0 = (float) r0
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 < 0) goto L31
        L1a:
            int r3 = r2.mVerticalThumbCenterY
            int r0 = r2.mVerticalThumbHeight
            int r1 = r0 / 2
            int r1 = r3 - r1
            float r1 = (float) r1
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 < 0) goto L31
            int r0 = r0 / 2
            int r3 = r3 + r0
            float r3 = (float) r3
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 > 0) goto L31
            r3 = 1
            goto L32
        L31:
            r3 = 0
        L32:
            return r3
    }

    boolean isVisible() {
            r2 = this;
            int r0 = r2.mState
            r1 = 1
            if (r0 != r1) goto L6
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(android.graphics.Canvas r1, androidx.recyclerview.widget.RecyclerView r2, androidx.recyclerview.widget.RecyclerView.State r3) {
            r0 = this;
            int r2 = r0.mRecyclerViewWidth
            androidx.recyclerview.widget.RecyclerView r3 = r0.mRecyclerView
            int r3 = r3.getWidth()
            if (r2 != r3) goto L28
            int r2 = r0.mRecyclerViewHeight
            androidx.recyclerview.widget.RecyclerView r3 = r0.mRecyclerView
            int r3 = r3.getHeight()
            if (r2 == r3) goto L15
            goto L28
        L15:
            int r2 = r0.mAnimationState
            if (r2 == 0) goto L27
            boolean r2 = r0.mNeedVerticalScrollbar
            if (r2 == 0) goto L20
            r0.drawVerticalScrollbar(r1)
        L20:
            boolean r2 = r0.mNeedHorizontalScrollbar
            if (r2 == 0) goto L27
            r0.drawHorizontalScrollbar(r1)
        L27:
            return
        L28:
            androidx.recyclerview.widget.RecyclerView r1 = r0.mRecyclerView
            int r1 = r1.getWidth()
            r0.mRecyclerViewWidth = r1
            androidx.recyclerview.widget.RecyclerView r1 = r0.mRecyclerView
            int r1 = r1.getHeight()
            r0.mRecyclerViewHeight = r1
            r1 = 0
            r0.setState(r1)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public boolean onInterceptTouchEvent(androidx.recyclerview.widget.RecyclerView r6, android.view.MotionEvent r7) {
            r5 = this;
            int r6 = r5.mState
            r0 = 0
            r1 = 2
            r2 = 1
            if (r6 != r2) goto L46
            float r6 = r7.getX()
            float r3 = r7.getY()
            boolean r6 = r5.isPointInsideVerticalThumb(r6, r3)
            float r3 = r7.getX()
            float r4 = r7.getY()
            boolean r3 = r5.isPointInsideHorizontalThumb(r3, r4)
            int r4 = r7.getAction()
            if (r4 != 0) goto L49
            if (r6 != 0) goto L29
            if (r3 == 0) goto L49
        L29:
            if (r3 == 0) goto L36
            r5.mDragState = r2
            float r6 = r7.getX()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.mHorizontalDragX = r6
            goto L42
        L36:
            if (r6 == 0) goto L42
            r5.mDragState = r1
            float r6 = r7.getY()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.mVerticalDragY = r6
        L42:
            r5.setState(r1)
            goto L48
        L46:
            if (r6 != r1) goto L49
        L48:
            r0 = r2
        L49:
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void onRequestDisallowInterceptTouchEvent(boolean r1) {
            r0 = this;
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void onTouchEvent(androidx.recyclerview.widget.RecyclerView r5, android.view.MotionEvent r6) {
            r4 = this;
            int r5 = r4.mState
            if (r5 != 0) goto L5
            return
        L5:
            int r5 = r6.getAction()
            r0 = 1
            r1 = 2
            if (r5 != 0) goto L46
            float r5 = r6.getX()
            float r2 = r6.getY()
            boolean r5 = r4.isPointInsideVerticalThumb(r5, r2)
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r2 = r4.isPointInsideHorizontalThumb(r2, r3)
            if (r5 != 0) goto L29
            if (r2 == 0) goto L7f
        L29:
            if (r2 == 0) goto L36
            r4.mDragState = r0
            float r5 = r6.getX()
            int r5 = (int) r5
            float r5 = (float) r5
            r4.mHorizontalDragX = r5
            goto L42
        L36:
            if (r5 == 0) goto L42
            r4.mDragState = r1
            float r5 = r6.getY()
            int r5 = (int) r5
            float r5 = (float) r5
            r4.mVerticalDragY = r5
        L42:
            r4.setState(r1)
            goto L7f
        L46:
            int r5 = r6.getAction()
            if (r5 != r0) goto L5c
            int r5 = r4.mState
            if (r5 != r1) goto L5c
            r5 = 0
            r4.mVerticalDragY = r5
            r4.mHorizontalDragX = r5
            r4.setState(r0)
            r5 = 0
            r4.mDragState = r5
            goto L7f
        L5c:
            int r5 = r6.getAction()
            if (r5 != r1) goto L7f
            int r5 = r4.mState
            if (r5 != r1) goto L7f
            r4.show()
            int r5 = r4.mDragState
            if (r5 != r0) goto L74
            float r5 = r6.getX()
            r4.horizontalScrollTo(r5)
        L74:
            int r5 = r4.mDragState
            if (r5 != r1) goto L7f
            float r5 = r6.getY()
            r4.verticalScrollTo(r5)
        L7f:
            return
    }

    void requestRedraw() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
            r0.invalidate()
            return
    }

    void setState(int r4) {
            r3 = this;
            r0 = 2
            if (r4 != r0) goto L11
            int r1 = r3.mState
            if (r1 == r0) goto L11
            android.graphics.drawable.StateListDrawable r1 = r3.mVerticalThumbDrawable
            int[] r2 = androidx.recyclerview.widget.FastScroller.PRESSED_STATE_SET
            r1.setState(r2)
            r3.cancelHide()
        L11:
            if (r4 != 0) goto L17
            r3.requestRedraw()
            goto L1a
        L17:
            r3.show()
        L1a:
            int r1 = r3.mState
            if (r1 != r0) goto L2d
            if (r4 == r0) goto L2d
            android.graphics.drawable.StateListDrawable r0 = r3.mVerticalThumbDrawable
            int[] r1 = androidx.recyclerview.widget.FastScroller.EMPTY_STATE_SET
            r0.setState(r1)
            r0 = 1200(0x4b0, float:1.682E-42)
            r3.resetHideDelay(r0)
            goto L35
        L2d:
            r0 = 1
            if (r4 != r0) goto L35
            r0 = 1500(0x5dc, float:2.102E-42)
            r3.resetHideDelay(r0)
        L35:
            r3.mState = r4
            return
    }

    public void show() {
            r5 = this;
            int r0 = r5.mAnimationState
            if (r0 == 0) goto Ld
            r1 = 3
            if (r0 == r1) goto L8
            goto L3c
        L8:
            android.animation.ValueAnimator r0 = r5.mShowHideAnimator
            r0.cancel()
        Ld:
            r0 = 1
            r5.mAnimationState = r0
            android.animation.ValueAnimator r1 = r5.mShowHideAnimator
            r2 = 2
            float[] r2 = new float[r2]
            java.lang.Object r3 = r1.getAnimatedValue()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            r4 = 0
            r2[r4] = r3
            r3 = 1065353216(0x3f800000, float:1.0)
            r2[r0] = r3
            r1.setFloatValues(r2)
            android.animation.ValueAnimator r0 = r5.mShowHideAnimator
            r1 = 500(0x1f4, double:2.47E-321)
            r0.setDuration(r1)
            android.animation.ValueAnimator r0 = r5.mShowHideAnimator
            r1 = 0
            r0.setStartDelay(r1)
            android.animation.ValueAnimator r0 = r5.mShowHideAnimator
            r0.start()
        L3c:
            return
    }

    void updateScrollPosition(int r9, int r10) {
            r8 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r8.mRecyclerView
            int r0 = r0.computeVerticalScrollRange()
            int r1 = r8.mRecyclerViewHeight
            int r2 = r0 - r1
            r3 = 0
            r4 = 1
            if (r2 <= 0) goto L14
            int r2 = r8.mScrollbarMinimumRange
            if (r1 < r2) goto L14
            r2 = r4
            goto L15
        L14:
            r2 = r3
        L15:
            r8.mNeedVerticalScrollbar = r2
            androidx.recyclerview.widget.RecyclerView r2 = r8.mRecyclerView
            int r2 = r2.computeHorizontalScrollRange()
            int r5 = r8.mRecyclerViewWidth
            int r6 = r2 - r5
            if (r6 <= 0) goto L29
            int r6 = r8.mScrollbarMinimumRange
            if (r5 < r6) goto L29
            r6 = r4
            goto L2a
        L29:
            r6 = r3
        L2a:
            r8.mNeedHorizontalScrollbar = r6
            boolean r7 = r8.mNeedVerticalScrollbar
            if (r7 != 0) goto L3a
            if (r6 != 0) goto L3a
            int r9 = r8.mState
            if (r9 == 0) goto L39
            r8.setState(r3)
        L39:
            return
        L3a:
            r3 = 1073741824(0x40000000, float:2.0)
            if (r7 == 0) goto L52
            float r10 = (float) r10
            float r6 = (float) r1
            float r7 = r6 / r3
            float r10 = r10 + r7
            float r6 = r6 * r10
            float r10 = (float) r0
            float r6 = r6 / r10
            int r10 = (int) r6
            r8.mVerticalThumbCenterY = r10
            int r10 = r1 * r1
            int r10 = r10 / r0
            int r10 = java.lang.Math.min(r1, r10)
            r8.mVerticalThumbHeight = r10
        L52:
            boolean r10 = r8.mNeedHorizontalScrollbar
            if (r10 == 0) goto L6a
            float r9 = (float) r9
            float r10 = (float) r5
            float r0 = r10 / r3
            float r9 = r9 + r0
            float r10 = r10 * r9
            float r9 = (float) r2
            float r10 = r10 / r9
            int r9 = (int) r10
            r8.mHorizontalThumbCenterX = r9
            int r9 = r5 * r5
            int r9 = r9 / r2
            int r9 = java.lang.Math.min(r5, r9)
            r8.mHorizontalThumbWidth = r9
        L6a:
            int r9 = r8.mState
            if (r9 == 0) goto L70
            if (r9 != r4) goto L73
        L70:
            r8.setState(r4)
        L73:
            return
    }
}
