package androidx.viewpager2.widget;

/* loaded from: classes.dex */
final class ScrollEventAdapter extends androidx.recyclerview.widget.RecyclerView.OnScrollListener {
    private static final int NO_POSITION = -1;
    private static final int STATE_IDLE = 0;
    private static final int STATE_IN_PROGRESS_FAKE_DRAG = 4;
    private static final int STATE_IN_PROGRESS_IMMEDIATE_SCROLL = 3;
    private static final int STATE_IN_PROGRESS_MANUAL_DRAG = 1;
    private static final int STATE_IN_PROGRESS_SMOOTH_SCROLL = 2;
    private int mAdapterState;
    private androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback mCallback;
    private boolean mDataSetChangeHappened;
    private boolean mDispatchSelected;
    private int mDragStartPosition;
    private boolean mFakeDragging;
    private final androidx.recyclerview.widget.LinearLayoutManager mLayoutManager;
    private final androidx.recyclerview.widget.RecyclerView mRecyclerView;
    private boolean mScrollHappened;
    private int mScrollState;
    private androidx.viewpager2.widget.ScrollEventAdapter.ScrollEventValues mScrollValues;
    private int mTarget;
    private final androidx.viewpager2.widget.ViewPager2 mViewPager;

    private static final class ScrollEventValues {
        float mOffset;
        int mOffsetPx;
        int mPosition;

        ScrollEventValues() {
                r0 = this;
                r0.<init>()
                return
        }

        void reset() {
                r1 = this;
                r0 = -1
                r1.mPosition = r0
                r0 = 0
                r1.mOffset = r0
                r0 = 0
                r1.mOffsetPx = r0
                return
        }
    }

    ScrollEventAdapter(androidx.viewpager2.widget.ViewPager2 r1) {
            r0 = this;
            r0.<init>()
            r0.mViewPager = r1
            androidx.recyclerview.widget.RecyclerView r1 = r1.mRecyclerView
            r0.mRecyclerView = r1
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r1.getLayoutManager()
            androidx.recyclerview.widget.LinearLayoutManager r1 = (androidx.recyclerview.widget.LinearLayoutManager) r1
            r0.mLayoutManager = r1
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r1 = new androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues
            r1.<init>()
            r0.mScrollValues = r1
            r0.resetState()
            return
    }

    private void dispatchScrolled(int r2, float r3, int r4) {
            r1 = this;
            androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback r0 = r1.mCallback
            if (r0 == 0) goto L7
            r0.onPageScrolled(r2, r3, r4)
        L7:
            return
    }

    private void dispatchSelected(int r2) {
            r1 = this;
            androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback r0 = r1.mCallback
            if (r0 == 0) goto L7
            r0.onPageSelected(r2)
        L7:
            return
    }

    private void dispatchStateChanged(int r3) {
            r2 = this;
            int r0 = r2.mAdapterState
            r1 = 3
            if (r0 != r1) goto La
            int r0 = r2.mScrollState
            if (r0 != 0) goto La
            return
        La:
            int r0 = r2.mScrollState
            if (r0 != r3) goto Lf
            return
        Lf:
            r2.mScrollState = r3
            androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback r0 = r2.mCallback
            if (r0 == 0) goto L18
            r0.onPageScrollStateChanged(r3)
        L18:
            return
    }

    private int getPosition() {
            r1 = this;
            androidx.recyclerview.widget.LinearLayoutManager r0 = r1.mLayoutManager
            int r0 = r0.findFirstVisibleItemPosition()
            return r0
    }

    private boolean isInAnyDraggingState() {
            r3 = this;
            int r0 = r3.mAdapterState
            r1 = 1
            if (r0 == r1) goto La
            r2 = 4
            if (r0 != r2) goto L9
            goto La
        L9:
            r1 = 0
        La:
            return r1
    }

    private void resetState() {
            r2 = this;
            r0 = 0
            r2.mAdapterState = r0
            r2.mScrollState = r0
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r1 = r2.mScrollValues
            r1.reset()
            r1 = -1
            r2.mDragStartPosition = r1
            r2.mTarget = r1
            r2.mDispatchSelected = r0
            r2.mScrollHappened = r0
            r2.mFakeDragging = r0
            r2.mDataSetChangeHappened = r0
            return
    }

    private void startDrag(boolean r3) {
            r2 = this;
            r2.mFakeDragging = r3
            r0 = 1
            if (r3 == 0) goto L7
            r3 = 4
            goto L8
        L7:
            r3 = r0
        L8:
            r2.mAdapterState = r3
            int r3 = r2.mTarget
            r1 = -1
            if (r3 == r1) goto L14
            r2.mDragStartPosition = r3
            r2.mTarget = r1
            goto L1e
        L14:
            int r3 = r2.mDragStartPosition
            if (r3 != r1) goto L1e
            int r3 = r2.getPosition()
            r2.mDragStartPosition = r3
        L1e:
            r2.dispatchStateChanged(r0)
            return
    }

    private void updateScrollEventValues() {
            r9 = this;
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r0 = r9.mScrollValues
            androidx.recyclerview.widget.LinearLayoutManager r1 = r9.mLayoutManager
            int r1 = r1.findFirstVisibleItemPosition()
            r0.mPosition = r1
            int r1 = r0.mPosition
            r2 = -1
            if (r1 != r2) goto L13
            r0.reset()
            return
        L13:
            androidx.recyclerview.widget.LinearLayoutManager r1 = r9.mLayoutManager
            int r2 = r0.mPosition
            android.view.View r1 = r1.findViewByPosition(r2)
            if (r1 != 0) goto L21
            r0.reset()
            return
        L21:
            androidx.recyclerview.widget.LinearLayoutManager r2 = r9.mLayoutManager
            int r2 = r2.getLeftDecorationWidth(r1)
            androidx.recyclerview.widget.LinearLayoutManager r3 = r9.mLayoutManager
            int r3 = r3.getRightDecorationWidth(r1)
            androidx.recyclerview.widget.LinearLayoutManager r4 = r9.mLayoutManager
            int r4 = r4.getTopDecorationHeight(r1)
            androidx.recyclerview.widget.LinearLayoutManager r5 = r9.mLayoutManager
            int r5 = r5.getBottomDecorationHeight(r1)
            android.view.ViewGroup$LayoutParams r6 = r1.getLayoutParams()
            boolean r7 = r6 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r7 == 0) goto L4f
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r7 = r6.leftMargin
            int r2 = r2 + r7
            int r7 = r6.rightMargin
            int r3 = r3 + r7
            int r7 = r6.topMargin
            int r4 = r4 + r7
            int r6 = r6.bottomMargin
            int r5 = r5 + r6
        L4f:
            int r6 = r1.getHeight()
            int r6 = r6 + r4
            int r6 = r6 + r5
            int r5 = r1.getWidth()
            int r5 = r5 + r2
            int r5 = r5 + r3
            androidx.recyclerview.widget.LinearLayoutManager r3 = r9.mLayoutManager
            int r3 = r3.getOrientation()
            r7 = 1
            r8 = 0
            if (r3 != 0) goto L67
            r3 = r7
            goto L68
        L67:
            r3 = r8
        L68:
            if (r3 == 0) goto L81
            int r1 = r1.getLeft()
            int r1 = r1 - r2
            androidx.recyclerview.widget.RecyclerView r2 = r9.mRecyclerView
            int r2 = r2.getPaddingLeft()
            int r1 = r1 - r2
            androidx.viewpager2.widget.ViewPager2 r2 = r9.mViewPager
            boolean r2 = r2.isRtl()
            if (r2 == 0) goto L7f
            int r1 = -r1
        L7f:
            r6 = r5
            goto L8d
        L81:
            int r1 = r1.getTop()
            int r1 = r1 - r4
            androidx.recyclerview.widget.RecyclerView r2 = r9.mRecyclerView
            int r2 = r2.getPaddingTop()
            int r1 = r1 - r2
        L8d:
            int r1 = -r1
            r0.mOffsetPx = r1
            int r1 = r0.mOffsetPx
            if (r1 >= 0) goto Lc1
            androidx.viewpager2.widget.AnimateLayoutChangeDetector r1 = new androidx.viewpager2.widget.AnimateLayoutChangeDetector
            androidx.recyclerview.widget.LinearLayoutManager r2 = r9.mLayoutManager
            r1.<init>(r2)
            boolean r1 = r1.mayHaveInterferingAnimations()
            if (r1 == 0) goto La9
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started."
            r0.<init>(r1)
            throw r0
        La9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.util.Locale r2 = java.util.Locale.US
            java.lang.Object[] r3 = new java.lang.Object[r7]
            int r0 = r0.mOffsetPx
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r8] = r0
            java.lang.String r0 = "Page can only be offset by a positive amount, not by %d"
            java.lang.String r0 = java.lang.String.format(r2, r0, r3)
            r1.<init>(r0)
            throw r1
        Lc1:
            if (r6 != 0) goto Lc5
            r1 = 0
            goto Lca
        Lc5:
            int r1 = r0.mOffsetPx
            float r1 = (float) r1
            float r2 = (float) r6
            float r1 = r1 / r2
        Lca:
            r0.mOffset = r1
            return
    }

    double getRelativeScrollPosition() {
            r4 = this;
            r4.updateScrollEventValues()
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r0 = r4.mScrollValues
            int r0 = r0.mPosition
            double r0 = (double) r0
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r2 = r4.mScrollValues
            float r2 = r2.mOffset
            double r2 = (double) r2
            double r0 = r0 + r2
            return r0
    }

    int getScrollState() {
            r1 = this;
            int r0 = r1.mScrollState
            return r0
    }

    boolean isDragging() {
            r2 = this;
            int r0 = r2.mScrollState
            r1 = 1
            if (r0 != r1) goto L6
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
    }

    boolean isFakeDragging() {
            r1 = this;
            boolean r0 = r1.mFakeDragging
            return r0
    }

    boolean isIdle() {
            r1 = this;
            int r0 = r1.mScrollState
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    void notifyBeginFakeDrag() {
            r1 = this;
            r0 = 4
            r1.mAdapterState = r0
            r0 = 1
            r1.startDrag(r0)
            return
    }

    void notifyDataSetChangeHappened() {
            r1 = this;
            r0 = 1
            r1.mDataSetChangeHappened = r0
            return
    }

    void notifyEndFakeDrag() {
            r3 = this;
            boolean r0 = r3.isDragging()
            if (r0 == 0) goto Lb
            boolean r0 = r3.mFakeDragging
            if (r0 != 0) goto Lb
            return
        Lb:
            r0 = 0
            r3.mFakeDragging = r0
            r3.updateScrollEventValues()
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r1 = r3.mScrollValues
            int r1 = r1.mOffsetPx
            if (r1 != 0) goto L2d
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r1 = r3.mScrollValues
            int r1 = r1.mPosition
            int r2 = r3.mDragStartPosition
            if (r1 == r2) goto L26
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r1 = r3.mScrollValues
            int r1 = r1.mPosition
            r3.dispatchSelected(r1)
        L26:
            r3.dispatchStateChanged(r0)
            r3.resetState()
            goto L31
        L2d:
            r0 = 2
            r3.dispatchStateChanged(r0)
        L31:
            return
    }

    void notifyProgrammaticScroll(int r3, boolean r4) {
            r2 = this;
            r0 = 2
            if (r4 == 0) goto L5
            r4 = r0
            goto L6
        L5:
            r4 = 3
        L6:
            r2.mAdapterState = r4
            r4 = 0
            r2.mFakeDragging = r4
            int r1 = r2.mTarget
            if (r1 == r3) goto L10
            r4 = 1
        L10:
            r2.mTarget = r3
            r2.dispatchStateChanged(r0)
            if (r4 == 0) goto L1a
            r2.dispatchSelected(r3)
        L1a:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView r6, int r7) {
            r5 = this;
            int r6 = r5.mAdapterState
            r0 = 0
            r1 = 1
            if (r6 != r1) goto La
            int r6 = r5.mScrollState
            if (r6 == r1) goto L10
        La:
            if (r7 != r1) goto L10
            r5.startDrag(r0)
            return
        L10:
            boolean r6 = r5.isInAnyDraggingState()
            r2 = 2
            if (r6 == 0) goto L23
            if (r7 != r2) goto L23
            boolean r6 = r5.mScrollHappened
            if (r6 == 0) goto L22
            r5.dispatchStateChanged(r2)
            r5.mDispatchSelected = r1
        L22:
            return
        L23:
            boolean r6 = r5.isInAnyDraggingState()
            r3 = -1
            if (r6 == 0) goto L61
            if (r7 != 0) goto L61
            r5.updateScrollEventValues()
            boolean r6 = r5.mScrollHappened
            if (r6 != 0) goto L42
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r6 = r5.mScrollValues
            int r6 = r6.mPosition
            if (r6 == r3) goto L59
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r6 = r5.mScrollValues
            int r6 = r6.mPosition
            r4 = 0
            r5.dispatchScrolled(r6, r4, r0)
            goto L59
        L42:
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r6 = r5.mScrollValues
            int r6 = r6.mOffsetPx
            if (r6 != 0) goto L58
            int r6 = r5.mDragStartPosition
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r4 = r5.mScrollValues
            int r4 = r4.mPosition
            if (r6 == r4) goto L59
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r6 = r5.mScrollValues
            int r6 = r6.mPosition
            r5.dispatchSelected(r6)
            goto L59
        L58:
            r1 = r0
        L59:
            if (r1 == 0) goto L61
            r5.dispatchStateChanged(r0)
            r5.resetState()
        L61:
            int r6 = r5.mAdapterState
            if (r6 != r2) goto L91
            if (r7 != 0) goto L91
            boolean r6 = r5.mDataSetChangeHappened
            if (r6 == 0) goto L91
            r5.updateScrollEventValues()
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r6 = r5.mScrollValues
            int r6 = r6.mOffsetPx
            if (r6 != 0) goto L91
            int r6 = r5.mTarget
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r7 = r5.mScrollValues
            int r7 = r7.mPosition
            if (r6 == r7) goto L8b
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r6 = r5.mScrollValues
            int r6 = r6.mPosition
            if (r6 != r3) goto L84
            r6 = r0
            goto L88
        L84:
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r6 = r5.mScrollValues
            int r6 = r6.mPosition
        L88:
            r5.dispatchSelected(r6)
        L8b:
            r5.dispatchStateChanged(r0)
            r5.resetState()
        L91:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(androidx.recyclerview.widget.RecyclerView r4, int r5, int r6) {
            r3 = this;
            r4 = 1
            r3.mScrollHappened = r4
            r3.updateScrollEventValues()
            boolean r0 = r3.mDispatchSelected
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L3f
            r3.mDispatchSelected = r2
            if (r6 > 0) goto L22
            if (r6 != 0) goto L20
            if (r5 >= 0) goto L16
            r5 = r4
            goto L17
        L16:
            r5 = r2
        L17:
            androidx.viewpager2.widget.ViewPager2 r6 = r3.mViewPager
            boolean r6 = r6.isRtl()
            if (r5 != r6) goto L20
            goto L22
        L20:
            r5 = r2
            goto L23
        L22:
            r5 = r4
        L23:
            if (r5 == 0) goto L31
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r5 = r3.mScrollValues
            int r5 = r5.mOffsetPx
            if (r5 == 0) goto L31
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r5 = r3.mScrollValues
            int r5 = r5.mPosition
            int r5 = r5 + r4
            goto L35
        L31:
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r5 = r3.mScrollValues
            int r5 = r5.mPosition
        L35:
            r3.mTarget = r5
            int r6 = r3.mDragStartPosition
            if (r6 == r5) goto L4d
            r3.dispatchSelected(r5)
            goto L4d
        L3f:
            int r5 = r3.mAdapterState
            if (r5 != 0) goto L4d
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r5 = r3.mScrollValues
            int r5 = r5.mPosition
            if (r5 != r1) goto L4a
            r5 = r2
        L4a:
            r3.dispatchSelected(r5)
        L4d:
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r5 = r3.mScrollValues
            int r5 = r5.mPosition
            if (r5 != r1) goto L55
            r5 = r2
            goto L59
        L55:
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r5 = r3.mScrollValues
            int r5 = r5.mPosition
        L59:
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r6 = r3.mScrollValues
            float r6 = r6.mOffset
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r0 = r3.mScrollValues
            int r0 = r0.mOffsetPx
            r3.dispatchScrolled(r5, r6, r0)
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r5 = r3.mScrollValues
            int r5 = r5.mPosition
            int r6 = r3.mTarget
            if (r5 == r6) goto L6e
            if (r6 != r1) goto L7e
        L6e:
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r5 = r3.mScrollValues
            int r5 = r5.mOffsetPx
            if (r5 != 0) goto L7e
            int r5 = r3.mScrollState
            if (r5 == r4) goto L7e
            r3.dispatchStateChanged(r2)
            r3.resetState()
        L7e:
            return
    }

    void setOnPageChangeCallback(androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback r1) {
            r0 = this;
            r0.mCallback = r1
            return
    }
}
