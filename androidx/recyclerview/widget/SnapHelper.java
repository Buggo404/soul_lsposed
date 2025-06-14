package androidx.recyclerview.widget;

/* loaded from: classes.dex */
public abstract class SnapHelper extends androidx.recyclerview.widget.RecyclerView.OnFlingListener {
    static final float MILLISECONDS_PER_INCH = 100.0f;
    private android.widget.Scroller mGravityScroller;
    androidx.recyclerview.widget.RecyclerView mRecyclerView;
    private final androidx.recyclerview.widget.RecyclerView.OnScrollListener mScrollListener;



    public SnapHelper() {
            r1 = this;
            r1.<init>()
            androidx.recyclerview.widget.SnapHelper$1 r0 = new androidx.recyclerview.widget.SnapHelper$1
            r0.<init>(r1)
            r1.mScrollListener = r0
            return
    }

    private void destroyCallbacks() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
            androidx.recyclerview.widget.RecyclerView$OnScrollListener r1 = r2.mScrollListener
            r0.removeOnScrollListener(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
            r1 = 0
            r0.setOnFlingListener(r1)
            return
    }

    private void setupCallbacks() throws java.lang.IllegalStateException {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
            androidx.recyclerview.widget.RecyclerView$OnFlingListener r0 = r0.getOnFlingListener()
            if (r0 != 0) goto L15
            androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
            androidx.recyclerview.widget.RecyclerView$OnScrollListener r1 = r2.mScrollListener
            r0.addOnScrollListener(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
            r0.setOnFlingListener(r2)
            return
        L15:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "An instance of OnFlingListener already set."
            r0.<init>(r1)
            throw r0
    }

    private boolean snapFromFling(androidx.recyclerview.widget.RecyclerView.LayoutManager r3, int r4, int r5) {
            r2 = this;
            boolean r0 = r3 instanceof androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            androidx.recyclerview.widget.RecyclerView$SmoothScroller r0 = r2.createScroller(r3)
            if (r0 != 0) goto Ld
            return r1
        Ld:
            int r4 = r2.findTargetSnapPosition(r3, r4, r5)
            r5 = -1
            if (r4 != r5) goto L15
            return r1
        L15:
            r0.setTargetPosition(r4)
            r3.startSmoothScroll(r0)
            r3 = 1
            return r3
    }

    public void attachToRecyclerView(androidx.recyclerview.widget.RecyclerView r3) throws java.lang.IllegalStateException {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
            if (r0 != r3) goto L5
            return
        L5:
            if (r0 == 0) goto La
            r2.destroyCallbacks()
        La:
            r2.mRecyclerView = r3
            if (r3 == 0) goto L26
            r2.setupCallbacks()
            android.widget.Scroller r3 = new android.widget.Scroller
            androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
            android.content.Context r0 = r0.getContext()
            android.view.animation.DecelerateInterpolator r1 = new android.view.animation.DecelerateInterpolator
            r1.<init>()
            r3.<init>(r0, r1)
            r2.mGravityScroller = r3
            r2.snapToTargetExistingView()
        L26:
            return
    }

    public abstract int[] calculateDistanceToFinalSnap(androidx.recyclerview.widget.RecyclerView.LayoutManager r1, android.view.View r2);

    public int[] calculateScrollDistance(int r11, int r12) {
            r10 = this;
            r0 = 2
            int[] r0 = new int[r0]
            android.widget.Scroller r1 = r10.mGravityScroller
            r2 = 0
            r3 = 0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 2147483647(0x7fffffff, float:NaN)
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 2147483647(0x7fffffff, float:NaN)
            r4 = r11
            r5 = r12
            r1.fling(r2, r3, r4, r5, r6, r7, r8, r9)
            android.widget.Scroller r11 = r10.mGravityScroller
            int r11 = r11.getFinalX()
            r12 = 0
            r0[r12] = r11
            android.widget.Scroller r11 = r10.mGravityScroller
            int r11 = r11.getFinalY()
            r12 = 1
            r0[r12] = r11
            return r0
    }

    protected androidx.recyclerview.widget.RecyclerView.SmoothScroller createScroller(androidx.recyclerview.widget.RecyclerView.LayoutManager r1) {
            r0 = this;
            androidx.recyclerview.widget.LinearSmoothScroller r1 = r0.createSnapScroller(r1)
            return r1
    }

    @java.lang.Deprecated
    protected androidx.recyclerview.widget.LinearSmoothScroller createSnapScroller(androidx.recyclerview.widget.RecyclerView.LayoutManager r2) {
            r1 = this;
            boolean r2 = r2 instanceof androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
            if (r2 != 0) goto L6
            r2 = 0
            return r2
        L6:
            androidx.recyclerview.widget.SnapHelper$2 r2 = new androidx.recyclerview.widget.SnapHelper$2
            androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
            android.content.Context r0 = r0.getContext()
            r2.<init>(r1, r0)
            return r2
    }

    public abstract android.view.View findSnapView(androidx.recyclerview.widget.RecyclerView.LayoutManager r1);

    public abstract int findTargetSnapPosition(androidx.recyclerview.widget.RecyclerView.LayoutManager r1, int r2, int r3);

    @Override // androidx.recyclerview.widget.RecyclerView.OnFlingListener
    public boolean onFling(int r5, int r6) {
            r4 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r4.mRecyclerView
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            androidx.recyclerview.widget.RecyclerView r2 = r4.mRecyclerView
            androidx.recyclerview.widget.RecyclerView$Adapter r2 = r2.getAdapter()
            if (r2 != 0) goto L13
            return r1
        L13:
            androidx.recyclerview.widget.RecyclerView r2 = r4.mRecyclerView
            int r2 = r2.getMinFlingVelocity()
            int r3 = java.lang.Math.abs(r6)
            if (r3 > r2) goto L25
            int r3 = java.lang.Math.abs(r5)
            if (r3 <= r2) goto L2c
        L25:
            boolean r5 = r4.snapFromFling(r0, r5, r6)
            if (r5 == 0) goto L2c
            r1 = 1
        L2c:
            return r1
    }

    void snapToTargetExistingView() {
            r4 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r4.mRecyclerView
            if (r0 != 0) goto L5
            return
        L5:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
            if (r0 != 0) goto Lc
            return
        Lc:
            android.view.View r1 = r4.findSnapView(r0)
            if (r1 != 0) goto L13
            return
        L13:
            int[] r0 = r4.calculateDistanceToFinalSnap(r0, r1)
            r1 = 0
            r1 = r0[r1]
            r2 = 1
            if (r1 != 0) goto L21
            r3 = r0[r2]
            if (r3 == 0) goto L28
        L21:
            androidx.recyclerview.widget.RecyclerView r3 = r4.mRecyclerView
            r0 = r0[r2]
            r3.smoothScrollBy(r1, r0)
        L28:
            return
    }
}
