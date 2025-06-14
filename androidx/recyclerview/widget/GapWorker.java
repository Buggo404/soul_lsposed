package androidx.recyclerview.widget;

/* loaded from: classes.dex */
final class GapWorker implements java.lang.Runnable {
    static final java.lang.ThreadLocal<androidx.recyclerview.widget.GapWorker> sGapWorker = null;
    static java.util.Comparator<androidx.recyclerview.widget.GapWorker.Task> sTaskComparator;
    long mFrameIntervalNs;
    long mPostTimeNs;
    java.util.ArrayList<androidx.recyclerview.widget.RecyclerView> mRecyclerViews;
    private java.util.ArrayList<androidx.recyclerview.widget.GapWorker.Task> mTasks;


    static class LayoutPrefetchRegistryImpl implements androidx.recyclerview.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry {
        int mCount;
        int[] mPrefetchArray;
        int mPrefetchDx;
        int mPrefetchDy;

        LayoutPrefetchRegistryImpl() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry
        public void addPosition(int r6, int r7) {
                r5 = this;
                if (r6 < 0) goto L3b
                if (r7 < 0) goto L33
                int r0 = r5.mCount
                int r0 = r0 * 2
                int[] r1 = r5.mPrefetchArray
                if (r1 != 0) goto L16
                r1 = 4
                int[] r1 = new int[r1]
                r5.mPrefetchArray = r1
                r2 = -1
                java.util.Arrays.fill(r1, r2)
                goto L24
            L16:
                int r2 = r1.length
                if (r0 < r2) goto L24
                int r2 = r0 * 2
                int[] r2 = new int[r2]
                r5.mPrefetchArray = r2
                int r3 = r1.length
                r4 = 0
                java.lang.System.arraycopy(r1, r4, r2, r4, r3)
            L24:
                int[] r1 = r5.mPrefetchArray
                r1[r0] = r6
                int r0 = r0 + 1
                r1[r0] = r7
                int r6 = r5.mCount
                int r6 = r6 + 1
                r5.mCount = r6
                return
            L33:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r7 = "Pixel distance must be non-negative"
                r6.<init>(r7)
                throw r6
            L3b:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r7 = "Layout positions must be non-negative"
                r6.<init>(r7)
                throw r6
        }

        void clearPrefetchPositions() {
                r2 = this;
                int[] r0 = r2.mPrefetchArray
                if (r0 == 0) goto L8
                r1 = -1
                java.util.Arrays.fill(r0, r1)
            L8:
                r0 = 0
                r2.mCount = r0
                return
        }

        void collectPrefetchPositionsFromView(androidx.recyclerview.widget.RecyclerView r5, boolean r6) {
                r4 = this;
                r0 = 0
                r4.mCount = r0
                int[] r0 = r4.mPrefetchArray
                if (r0 == 0) goto Lb
                r1 = -1
                java.util.Arrays.fill(r0, r1)
            Lb:
                androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r5.mLayout
                androidx.recyclerview.widget.RecyclerView$Adapter r1 = r5.mAdapter
                if (r1 == 0) goto L4d
                if (r0 == 0) goto L4d
                boolean r1 = r0.isItemPrefetchEnabled()
                if (r1 == 0) goto L4d
                if (r6 == 0) goto L2d
                androidx.recyclerview.widget.AdapterHelper r1 = r5.mAdapterHelper
                boolean r1 = r1.hasPendingUpdates()
                if (r1 != 0) goto L3c
                androidx.recyclerview.widget.RecyclerView$Adapter r1 = r5.mAdapter
                int r1 = r1.getItemCount()
                r0.collectInitialPrefetchPositions(r1, r4)
                goto L3c
            L2d:
                boolean r1 = r5.hasPendingAdapterUpdates()
                if (r1 != 0) goto L3c
                int r1 = r4.mPrefetchDx
                int r2 = r4.mPrefetchDy
                androidx.recyclerview.widget.RecyclerView$State r3 = r5.mState
                r0.collectAdjacentPrefetchPositions(r1, r2, r3, r4)
            L3c:
                int r1 = r4.mCount
                int r2 = r0.mPrefetchMaxCountObserved
                if (r1 <= r2) goto L4d
                int r1 = r4.mCount
                r0.mPrefetchMaxCountObserved = r1
                r0.mPrefetchMaxObservedInInitialPrefetch = r6
                androidx.recyclerview.widget.RecyclerView$Recycler r5 = r5.mRecycler
                r5.updateViewCacheSize()
            L4d:
                return
        }

        boolean lastPrefetchIncludedPosition(int r5) {
                r4 = this;
                int[] r0 = r4.mPrefetchArray
                r1 = 0
                if (r0 == 0) goto L17
                int r0 = r4.mCount
                int r0 = r0 * 2
                r2 = r1
            La:
                if (r2 >= r0) goto L17
                int[] r3 = r4.mPrefetchArray
                r3 = r3[r2]
                if (r3 != r5) goto L14
                r5 = 1
                return r5
            L14:
                int r2 = r2 + 2
                goto La
            L17:
                return r1
        }

        void setPrefetchVector(int r1, int r2) {
                r0 = this;
                r0.mPrefetchDx = r1
                r0.mPrefetchDy = r2
                return
        }
    }

    static class Task {
        public int distanceToItem;
        public boolean immediate;
        public int position;
        public androidx.recyclerview.widget.RecyclerView view;
        public int viewVelocity;

        Task() {
                r0 = this;
                r0.<init>()
                return
        }

        public void clear() {
                r2 = this;
                r0 = 0
                r2.immediate = r0
                r2.viewVelocity = r0
                r2.distanceToItem = r0
                r1 = 0
                r2.view = r1
                r2.position = r0
                return
        }
    }

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            androidx.recyclerview.widget.GapWorker.sGapWorker = r0
            androidx.recyclerview.widget.GapWorker$1 r0 = new androidx.recyclerview.widget.GapWorker$1
            r0.<init>()
            androidx.recyclerview.widget.GapWorker.sTaskComparator = r0
            return
    }

    GapWorker() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mRecyclerViews = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mTasks = r0
            return
    }

    private void buildTaskList() {
            r11 = this;
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView> r0 = r11.mRecyclerViews
            int r0 = r0.size()
            r1 = 0
            r2 = r1
            r3 = r2
        L9:
            if (r2 >= r0) goto L26
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView> r4 = r11.mRecyclerViews
            java.lang.Object r4 = r4.get(r2)
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            int r5 = r4.getWindowVisibility()
            if (r5 != 0) goto L23
            androidx.recyclerview.widget.GapWorker$LayoutPrefetchRegistryImpl r5 = r4.mPrefetchRegistry
            r5.collectPrefetchPositionsFromView(r4, r1)
            androidx.recyclerview.widget.GapWorker$LayoutPrefetchRegistryImpl r4 = r4.mPrefetchRegistry
            int r4 = r4.mCount
            int r3 = r3 + r4
        L23:
            int r2 = r2 + 1
            goto L9
        L26:
            java.util.ArrayList<androidx.recyclerview.widget.GapWorker$Task> r2 = r11.mTasks
            r2.ensureCapacity(r3)
            r2 = r1
            r3 = r2
        L2d:
            if (r2 >= r0) goto L90
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView> r4 = r11.mRecyclerViews
            java.lang.Object r4 = r4.get(r2)
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            int r5 = r4.getWindowVisibility()
            if (r5 == 0) goto L3e
            goto L8d
        L3e:
            androidx.recyclerview.widget.GapWorker$LayoutPrefetchRegistryImpl r5 = r4.mPrefetchRegistry
            int r6 = r5.mPrefetchDx
            int r6 = java.lang.Math.abs(r6)
            int r7 = r5.mPrefetchDy
            int r7 = java.lang.Math.abs(r7)
            int r6 = r6 + r7
            r7 = r1
        L4e:
            int r8 = r5.mCount
            int r8 = r8 * 2
            if (r7 >= r8) goto L8d
            java.util.ArrayList<androidx.recyclerview.widget.GapWorker$Task> r8 = r11.mTasks
            int r8 = r8.size()
            if (r3 < r8) goto L67
            androidx.recyclerview.widget.GapWorker$Task r8 = new androidx.recyclerview.widget.GapWorker$Task
            r8.<init>()
            java.util.ArrayList<androidx.recyclerview.widget.GapWorker$Task> r9 = r11.mTasks
            r9.add(r8)
            goto L6f
        L67:
            java.util.ArrayList<androidx.recyclerview.widget.GapWorker$Task> r8 = r11.mTasks
            java.lang.Object r8 = r8.get(r3)
            androidx.recyclerview.widget.GapWorker$Task r8 = (androidx.recyclerview.widget.GapWorker.Task) r8
        L6f:
            int[] r9 = r5.mPrefetchArray
            int r10 = r7 + 1
            r9 = r9[r10]
            if (r9 > r6) goto L79
            r10 = 1
            goto L7a
        L79:
            r10 = r1
        L7a:
            r8.immediate = r10
            r8.viewVelocity = r6
            r8.distanceToItem = r9
            r8.view = r4
            int[] r9 = r5.mPrefetchArray
            r9 = r9[r7]
            r8.position = r9
            int r3 = r3 + 1
            int r7 = r7 + 2
            goto L4e
        L8d:
            int r2 = r2 + 1
            goto L2d
        L90:
            java.util.ArrayList<androidx.recyclerview.widget.GapWorker$Task> r0 = r11.mTasks
            java.util.Comparator<androidx.recyclerview.widget.GapWorker$Task> r1 = androidx.recyclerview.widget.GapWorker.sTaskComparator
            java.util.Collections.sort(r0, r1)
            return
    }

    private void flushTaskWithDeadline(androidx.recyclerview.widget.GapWorker.Task r4, long r5) {
            r3 = this;
            boolean r0 = r4.immediate
            if (r0 == 0) goto La
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto Lb
        La:
            r0 = r5
        Lb:
            androidx.recyclerview.widget.RecyclerView r2 = r4.view
            int r4 = r4.position
            androidx.recyclerview.widget.RecyclerView$ViewHolder r4 = r3.prefetchPositionWithDeadline(r2, r4, r0)
            if (r4 == 0) goto L30
            java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView> r0 = r4.mNestedRecyclerView
            if (r0 == 0) goto L30
            boolean r0 = r4.isBound()
            if (r0 == 0) goto L30
            boolean r0 = r4.isInvalid()
            if (r0 != 0) goto L30
            java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView> r4 = r4.mNestedRecyclerView
            java.lang.Object r4 = r4.get()
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            r3.prefetchInnerRecyclerViewWithDeadline(r4, r5)
        L30:
            return
    }

    private void flushTasksWithDeadline(long r4) {
            r3 = this;
            r0 = 0
        L1:
            java.util.ArrayList<androidx.recyclerview.widget.GapWorker$Task> r1 = r3.mTasks
            int r1 = r1.size()
            if (r0 >= r1) goto L1f
            java.util.ArrayList<androidx.recyclerview.widget.GapWorker$Task> r1 = r3.mTasks
            java.lang.Object r1 = r1.get(r0)
            androidx.recyclerview.widget.GapWorker$Task r1 = (androidx.recyclerview.widget.GapWorker.Task) r1
            androidx.recyclerview.widget.RecyclerView r2 = r1.view
            if (r2 != 0) goto L16
            goto L1f
        L16:
            r3.flushTaskWithDeadline(r1, r4)
            r1.clear()
            int r0 = r0 + 1
            goto L1
        L1f:
            return
    }

    static boolean isPrefetchPositionAttached(androidx.recyclerview.widget.RecyclerView r5, int r6) {
            androidx.recyclerview.widget.ChildHelper r0 = r5.mChildHelper
            int r0 = r0.getUnfilteredChildCount()
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L23
            androidx.recyclerview.widget.ChildHelper r3 = r5.mChildHelper
            android.view.View r3 = r3.getUnfilteredChildAt(r2)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r3)
            int r4 = r3.mPosition
            if (r4 != r6) goto L20
            boolean r3 = r3.isInvalid()
            if (r3 != 0) goto L20
            r5 = 1
            return r5
        L20:
            int r2 = r2 + 1
            goto L8
        L23:
            return r1
    }

    private void prefetchInnerRecyclerViewWithDeadline(androidx.recyclerview.widget.RecyclerView r4, long r5) {
            r3 = this;
            if (r4 != 0) goto L3
            return
        L3:
            boolean r0 = r4.mDataSetHasChangedAfterLayout
            if (r0 == 0) goto L12
            androidx.recyclerview.widget.ChildHelper r0 = r4.mChildHelper
            int r0 = r0.getUnfilteredChildCount()
            if (r0 == 0) goto L12
            r4.removeAndRecycleViews()
        L12:
            androidx.recyclerview.widget.GapWorker$LayoutPrefetchRegistryImpl r0 = r4.mPrefetchRegistry
            r1 = 1
            r0.collectPrefetchPositionsFromView(r4, r1)
            int r1 = r0.mCount
            if (r1 == 0) goto L42
            java.lang.String r1 = "RV Nested Prefetch"
            androidx.core.os.TraceCompat.beginSection(r1)     // Catch: java.lang.Throwable -> L3d
            androidx.recyclerview.widget.RecyclerView$State r1 = r4.mState     // Catch: java.lang.Throwable -> L3d
            androidx.recyclerview.widget.RecyclerView$Adapter r2 = r4.mAdapter     // Catch: java.lang.Throwable -> L3d
            r1.prepareForNestedPrefetch(r2)     // Catch: java.lang.Throwable -> L3d
            r1 = 0
        L29:
            int r2 = r0.mCount     // Catch: java.lang.Throwable -> L3d
            int r2 = r2 * 2
            if (r1 >= r2) goto L39
            int[] r2 = r0.mPrefetchArray     // Catch: java.lang.Throwable -> L3d
            r2 = r2[r1]     // Catch: java.lang.Throwable -> L3d
            r3.prefetchPositionWithDeadline(r4, r2, r5)     // Catch: java.lang.Throwable -> L3d
            int r1 = r1 + 2
            goto L29
        L39:
            androidx.core.os.TraceCompat.endSection()
            goto L42
        L3d:
            r4 = move-exception
            androidx.core.os.TraceCompat.endSection()
            throw r4
        L42:
            return
    }

    private androidx.recyclerview.widget.RecyclerView.ViewHolder prefetchPositionWithDeadline(androidx.recyclerview.widget.RecyclerView r3, int r4, long r5) {
            r2 = this;
            boolean r0 = isPrefetchPositionAttached(r3, r4)
            if (r0 == 0) goto L8
            r3 = 0
            return r3
        L8:
            androidx.recyclerview.widget.RecyclerView$Recycler r0 = r3.mRecycler
            r1 = 0
            r3.onEnterLayoutOrScroll()     // Catch: java.lang.Throwable -> L2d
            androidx.recyclerview.widget.RecyclerView$ViewHolder r4 = r0.tryGetViewHolderForPositionByDeadline(r4, r1, r5)     // Catch: java.lang.Throwable -> L2d
            if (r4 == 0) goto L29
            boolean r5 = r4.isBound()     // Catch: java.lang.Throwable -> L2d
            if (r5 == 0) goto L26
            boolean r5 = r4.isInvalid()     // Catch: java.lang.Throwable -> L2d
            if (r5 != 0) goto L26
            android.view.View r5 = r4.itemView     // Catch: java.lang.Throwable -> L2d
            r0.recycleView(r5)     // Catch: java.lang.Throwable -> L2d
            goto L29
        L26:
            r0.addViewHolderToRecycledViewPool(r4, r1)     // Catch: java.lang.Throwable -> L2d
        L29:
            r3.onExitLayoutOrScroll(r1)
            return r4
        L2d:
            r4 = move-exception
            r3.onExitLayoutOrScroll(r1)
            throw r4
    }

    public void add(androidx.recyclerview.widget.RecyclerView r2) {
            r1 = this;
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView> r0 = r1.mRecyclerViews
            r0.add(r2)
            return
    }

    void postFromTraversal(androidx.recyclerview.widget.RecyclerView r5, int r6, int r7) {
            r4 = this;
            boolean r0 = r5.isAttachedToWindow()
            if (r0 == 0) goto L17
            long r0 = r4.mPostTimeNs
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L17
            long r0 = r5.getNanoTime()
            r4.mPostTimeNs = r0
            r5.post(r4)
        L17:
            androidx.recyclerview.widget.GapWorker$LayoutPrefetchRegistryImpl r5 = r5.mPrefetchRegistry
            r5.setPrefetchVector(r6, r7)
            return
    }

    void prefetch(long r1) {
            r0 = this;
            r0.buildTaskList()
            r0.flushTasksWithDeadline(r1)
            return
    }

    public void remove(androidx.recyclerview.widget.RecyclerView r2) {
            r1 = this;
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView> r0 = r1.mRecyclerViews
            r0.remove(r2)
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r8 = this;
            r0 = 0
            java.lang.String r2 = "RV Prefetch"
            androidx.core.os.TraceCompat.beginSection(r2)     // Catch: java.lang.Throwable -> L4f
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView> r2 = r8.mRecyclerViews     // Catch: java.lang.Throwable -> L4f
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L4f
            if (r2 == 0) goto L15
        Lf:
            r8.mPostTimeNs = r0
            androidx.core.os.TraceCompat.endSection()
            return
        L15:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView> r2 = r8.mRecyclerViews     // Catch: java.lang.Throwable -> L4f
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L4f
            r3 = 0
            r4 = r0
        L1d:
            if (r3 >= r2) goto L38
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView> r6 = r8.mRecyclerViews     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r6 = r6.get(r3)     // Catch: java.lang.Throwable -> L4f
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6     // Catch: java.lang.Throwable -> L4f
            int r7 = r6.getWindowVisibility()     // Catch: java.lang.Throwable -> L4f
            if (r7 != 0) goto L35
            long r6 = r6.getDrawingTime()     // Catch: java.lang.Throwable -> L4f
            long r4 = java.lang.Math.max(r6, r4)     // Catch: java.lang.Throwable -> L4f
        L35:
            int r3 = r3 + 1
            goto L1d
        L38:
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto L3d
            goto Lf
        L3d:
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L4f
            long r2 = r2.toNanos(r4)     // Catch: java.lang.Throwable -> L4f
            long r4 = r8.mFrameIntervalNs     // Catch: java.lang.Throwable -> L4f
            long r2 = r2 + r4
            r8.prefetch(r2)     // Catch: java.lang.Throwable -> L4f
            r8.mPostTimeNs = r0
            androidx.core.os.TraceCompat.endSection()
            return
        L4f:
            r2 = move-exception
            r8.mPostTimeNs = r0
            androidx.core.os.TraceCompat.endSection()
            throw r2
    }
}
