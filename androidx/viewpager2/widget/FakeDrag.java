package androidx.viewpager2.widget;

/* loaded from: classes.dex */
final class FakeDrag {
    private int mActualDraggedDistance;
    private long mFakeDragBeginTime;
    private int mMaximumVelocity;
    private final androidx.recyclerview.widget.RecyclerView mRecyclerView;
    private float mRequestedDragDistance;
    private final androidx.viewpager2.widget.ScrollEventAdapter mScrollEventAdapter;
    private android.view.VelocityTracker mVelocityTracker;
    private final androidx.viewpager2.widget.ViewPager2 mViewPager;

    FakeDrag(androidx.viewpager2.widget.ViewPager2 r1, androidx.viewpager2.widget.ScrollEventAdapter r2, androidx.recyclerview.widget.RecyclerView r3) {
            r0 = this;
            r0.<init>()
            r0.mViewPager = r1
            r0.mScrollEventAdapter = r2
            r0.mRecyclerView = r3
            return
    }

    private void addFakeMotionEvent(long r9, int r11, float r12, float r13) {
            r8 = this;
            long r0 = r8.mFakeDragBeginTime
            r7 = 0
            r2 = r9
            r4 = r11
            r5 = r12
            r6 = r13
            android.view.MotionEvent r9 = android.view.MotionEvent.obtain(r0, r2, r4, r5, r6, r7)
            android.view.VelocityTracker r10 = r8.mVelocityTracker
            r10.addMovement(r9)
            r9.recycle()
            return
    }

    private void beginFakeVelocityTracker() {
            r1 = this;
            android.view.VelocityTracker r0 = r1.mVelocityTracker
            if (r0 != 0) goto L1b
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r1.mVelocityTracker = r0
            androidx.viewpager2.widget.ViewPager2 r0 = r1.mViewPager
            android.content.Context r0 = r0.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledMaximumFlingVelocity()
            r1.mMaximumVelocity = r0
            goto L1e
        L1b:
            r0.clear()
        L1e:
            return
    }

    boolean beginFakeDrag() {
            r7 = this;
            androidx.viewpager2.widget.ScrollEventAdapter r0 = r7.mScrollEventAdapter
            boolean r0 = r0.isDragging()
            r1 = 0
            if (r0 == 0) goto La
            return r1
        La:
            r7.mActualDraggedDistance = r1
            float r0 = (float) r1
            r7.mRequestedDragDistance = r0
            long r0 = android.os.SystemClock.uptimeMillis()
            r7.mFakeDragBeginTime = r0
            r7.beginFakeVelocityTracker()
            androidx.viewpager2.widget.ScrollEventAdapter r0 = r7.mScrollEventAdapter
            r0.notifyBeginFakeDrag()
            androidx.viewpager2.widget.ScrollEventAdapter r0 = r7.mScrollEventAdapter
            boolean r0 = r0.isIdle()
            if (r0 != 0) goto L2a
            androidx.recyclerview.widget.RecyclerView r0 = r7.mRecyclerView
            r0.stopScroll()
        L2a:
            long r2 = r7.mFakeDragBeginTime
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r7
            r1.addFakeMotionEvent(r2, r4, r5, r6)
            r0 = 1
            return r0
    }

    boolean endFakeDrag() {
            r3 = this;
            androidx.viewpager2.widget.ScrollEventAdapter r0 = r3.mScrollEventAdapter
            boolean r0 = r0.isFakeDragging()
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            androidx.viewpager2.widget.ScrollEventAdapter r0 = r3.mScrollEventAdapter
            r0.notifyEndFakeDrag()
            android.view.VelocityTracker r0 = r3.mVelocityTracker
            int r1 = r3.mMaximumVelocity
            float r1 = (float) r1
            r2 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r2, r1)
            float r1 = r0.getXVelocity()
            int r1 = (int) r1
            float r0 = r0.getYVelocity()
            int r0 = (int) r0
            androidx.recyclerview.widget.RecyclerView r2 = r3.mRecyclerView
            boolean r0 = r2.fling(r1, r0)
            if (r0 != 0) goto L30
            androidx.viewpager2.widget.ViewPager2 r0 = r3.mViewPager
            r0.snapToPage()
        L30:
            r0 = 1
            return r0
    }

    boolean fakeDragBy(float r10) {
            r9 = this;
            androidx.viewpager2.widget.ScrollEventAdapter r0 = r9.mScrollEventAdapter
            boolean r0 = r0.isFakeDragging()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            float r0 = r9.mRequestedDragDistance
            float r0 = r0 - r10
            r9.mRequestedDragDistance = r0
            int r10 = r9.mActualDraggedDistance
            float r10 = (float) r10
            float r0 = r0 - r10
            int r10 = java.lang.Math.round(r0)
            int r0 = r9.mActualDraggedDistance
            int r0 = r0 + r10
            r9.mActualDraggedDistance = r0
            long r3 = android.os.SystemClock.uptimeMillis()
            androidx.viewpager2.widget.ViewPager2 r0 = r9.mViewPager
            int r0 = r0.getOrientation()
            r8 = 1
            if (r0 != 0) goto L2b
            r0 = r8
            goto L2c
        L2b:
            r0 = r1
        L2c:
            if (r0 == 0) goto L30
            r2 = r10
            goto L31
        L30:
            r2 = r1
        L31:
            if (r0 == 0) goto L34
            goto L35
        L34:
            r1 = r10
        L35:
            r10 = 0
            if (r0 == 0) goto L3c
            float r5 = r9.mRequestedDragDistance
            r6 = r5
            goto L3d
        L3c:
            r6 = r10
        L3d:
            if (r0 == 0) goto L40
            goto L42
        L40:
            float r10 = r9.mRequestedDragDistance
        L42:
            r7 = r10
            androidx.recyclerview.widget.RecyclerView r10 = r9.mRecyclerView
            r10.scrollBy(r2, r1)
            r5 = 2
            r2 = r9
            r2.addFakeMotionEvent(r3, r5, r6, r7)
            return r8
    }

    boolean isFakeDragging() {
            r1 = this;
            androidx.viewpager2.widget.ScrollEventAdapter r0 = r1.mScrollEventAdapter
            boolean r0 = r0.isFakeDragging()
            return r0
    }
}
