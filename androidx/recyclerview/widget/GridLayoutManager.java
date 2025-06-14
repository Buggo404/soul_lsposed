package androidx.recyclerview.widget;

/* loaded from: classes.dex */
public class GridLayoutManager extends androidx.recyclerview.widget.LinearLayoutManager {
    private static final boolean DEBUG = false;
    public static final int DEFAULT_SPAN_COUNT = -1;
    private static final java.lang.String TAG = "GridLayoutManager";
    int[] mCachedBorders;
    final android.graphics.Rect mDecorInsets;
    boolean mPendingSpanCountChange;
    final android.util.SparseIntArray mPreLayoutSpanIndexCache;
    final android.util.SparseIntArray mPreLayoutSpanSizeCache;
    android.view.View[] mSet;
    int mSpanCount;
    androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup mSpanSizeLookup;
    private boolean mUsingSpansToEstimateScrollBarDimensions;

    public static final class DefaultSpanSizeLookup extends androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup {
        public DefaultSpanSizeLookup() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanIndex(int r1, int r2) {
                r0 = this;
                int r1 = r1 % r2
                return r1
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int r1) {
                r0 = this;
                r1 = 1
                return r1
        }
    }

    public static class LayoutParams extends androidx.recyclerview.widget.RecyclerView.LayoutParams {
        public static final int INVALID_SPAN_ID = -1;
        int mSpanIndex;
        int mSpanSize;

        public LayoutParams(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = -1
                r0.mSpanIndex = r1
                r1 = 0
                r0.mSpanSize = r1
                return
        }

        public LayoutParams(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = -1
                r0.mSpanIndex = r1
                r1 = 0
                r0.mSpanSize = r1
                return
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = -1
                r0.mSpanIndex = r1
                r1 = 0
                r0.mSpanSize = r1
                return
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = -1
                r0.mSpanIndex = r1
                r1 = 0
                r0.mSpanSize = r1
                return
        }

        public LayoutParams(androidx.recyclerview.widget.RecyclerView.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = -1
                r0.mSpanIndex = r1
                r1 = 0
                r0.mSpanSize = r1
                return
        }

        public int getSpanIndex() {
                r1 = this;
                int r0 = r1.mSpanIndex
                return r0
        }

        public int getSpanSize() {
                r1 = this;
                int r0 = r1.mSpanSize
                return r0
        }
    }

    public static abstract class SpanSizeLookup {
        private boolean mCacheSpanGroupIndices;
        private boolean mCacheSpanIndices;
        final android.util.SparseIntArray mSpanGroupIndexCache;
        final android.util.SparseIntArray mSpanIndexCache;

        public SpanSizeLookup() {
                r1 = this;
                r1.<init>()
                android.util.SparseIntArray r0 = new android.util.SparseIntArray
                r0.<init>()
                r1.mSpanIndexCache = r0
                android.util.SparseIntArray r0 = new android.util.SparseIntArray
                r0.<init>()
                r1.mSpanGroupIndexCache = r0
                r0 = 0
                r1.mCacheSpanIndices = r0
                r1.mCacheSpanGroupIndices = r0
                return
        }

        static int findFirstKeyLessThan(android.util.SparseIntArray r4, int r5) {
                int r0 = r4.size()
                int r0 = r0 + (-1)
                r1 = 0
            L7:
                if (r1 > r0) goto L1b
                int r2 = r1 + r0
                int r2 = r2 >>> 1
                int r3 = r4.keyAt(r2)
                if (r3 >= r5) goto L17
                int r2 = r2 + 1
                r1 = r2
                goto L7
            L17:
                int r2 = r2 + (-1)
                r0 = r2
                goto L7
            L1b:
                int r1 = r1 + (-1)
                if (r1 < 0) goto L2a
                int r5 = r4.size()
                if (r1 >= r5) goto L2a
                int r4 = r4.keyAt(r1)
                return r4
            L2a:
                r4 = -1
                return r4
        }

        int getCachedSpanGroupIndex(int r3, int r4) {
                r2 = this;
                boolean r0 = r2.mCacheSpanGroupIndices
                if (r0 != 0) goto L9
                int r3 = r2.getSpanGroupIndex(r3, r4)
                return r3
            L9:
                android.util.SparseIntArray r0 = r2.mSpanGroupIndexCache
                r1 = -1
                int r0 = r0.get(r3, r1)
                if (r0 == r1) goto L13
                return r0
            L13:
                int r4 = r2.getSpanGroupIndex(r3, r4)
                android.util.SparseIntArray r0 = r2.mSpanGroupIndexCache
                r0.put(r3, r4)
                return r4
        }

        int getCachedSpanIndex(int r3, int r4) {
                r2 = this;
                boolean r0 = r2.mCacheSpanIndices
                if (r0 != 0) goto L9
                int r3 = r2.getSpanIndex(r3, r4)
                return r3
            L9:
                android.util.SparseIntArray r0 = r2.mSpanIndexCache
                r1 = -1
                int r0 = r0.get(r3, r1)
                if (r0 == r1) goto L13
                return r0
            L13:
                int r4 = r2.getSpanIndex(r3, r4)
                android.util.SparseIntArray r0 = r2.mSpanIndexCache
                r0.put(r3, r4)
                return r4
        }

        public int getSpanGroupIndex(int r7, int r8) {
                r6 = this;
                boolean r0 = r6.mCacheSpanGroupIndices
                r1 = 0
                if (r0 == 0) goto L25
                android.util.SparseIntArray r0 = r6.mSpanGroupIndexCache
                int r0 = findFirstKeyLessThan(r0, r7)
                r2 = -1
                if (r0 == r2) goto L25
                android.util.SparseIntArray r2 = r6.mSpanGroupIndexCache
                int r2 = r2.get(r0)
                int r3 = r0 + 1
                int r4 = r6.getCachedSpanIndex(r0, r8)
                int r0 = r6.getSpanSize(r0)
                int r4 = r4 + r0
                if (r4 != r8) goto L28
                int r2 = r2 + 1
                r4 = r1
                goto L28
            L25:
                r2 = r1
                r3 = r2
                r4 = r3
            L28:
                int r0 = r6.getSpanSize(r7)
            L2c:
                if (r3 >= r7) goto L41
                int r5 = r6.getSpanSize(r3)
                int r4 = r4 + r5
                if (r4 != r8) goto L39
                int r2 = r2 + 1
                r4 = r1
                goto L3e
            L39:
                if (r4 <= r8) goto L3e
                int r2 = r2 + 1
                r4 = r5
            L3e:
                int r3 = r3 + 1
                goto L2c
            L41:
                int r4 = r4 + r0
                if (r4 <= r8) goto L46
                int r2 = r2 + 1
            L46:
                return r2
        }

        public int getSpanIndex(int r6, int r7) {
                r5 = this;
                int r0 = r5.getSpanSize(r6)
                r1 = 0
                if (r0 != r7) goto L8
                return r1
            L8:
                boolean r2 = r5.mCacheSpanIndices
                if (r2 == 0) goto L20
                android.util.SparseIntArray r2 = r5.mSpanIndexCache
                int r2 = findFirstKeyLessThan(r2, r6)
                if (r2 < 0) goto L20
                android.util.SparseIntArray r3 = r5.mSpanIndexCache
                int r3 = r3.get(r2)
                int r4 = r5.getSpanSize(r2)
                int r3 = r3 + r4
                goto L30
            L20:
                r2 = r1
                r3 = r2
            L22:
                if (r2 >= r6) goto L33
                int r4 = r5.getSpanSize(r2)
                int r3 = r3 + r4
                if (r3 != r7) goto L2d
                r3 = r1
                goto L30
            L2d:
                if (r3 <= r7) goto L30
                r3 = r4
            L30:
                int r2 = r2 + 1
                goto L22
            L33:
                int r0 = r0 + r3
                if (r0 > r7) goto L37
                return r3
            L37:
                return r1
        }

        public abstract int getSpanSize(int r1);

        public void invalidateSpanGroupIndexCache() {
                r1 = this;
                android.util.SparseIntArray r0 = r1.mSpanGroupIndexCache
                r0.clear()
                return
        }

        public void invalidateSpanIndexCache() {
                r1 = this;
                android.util.SparseIntArray r0 = r1.mSpanIndexCache
                r0.clear()
                return
        }

        public boolean isSpanGroupIndexCacheEnabled() {
                r1 = this;
                boolean r0 = r1.mCacheSpanGroupIndices
                return r0
        }

        public boolean isSpanIndexCacheEnabled() {
                r1 = this;
                boolean r0 = r1.mCacheSpanIndices
                return r0
        }

        public void setSpanGroupIndexCacheEnabled(boolean r2) {
                r1 = this;
                if (r2 != 0) goto L7
                android.util.SparseIntArray r0 = r1.mSpanGroupIndexCache
                r0.clear()
            L7:
                r1.mCacheSpanGroupIndices = r2
                return
        }

        public void setSpanIndexCacheEnabled(boolean r2) {
                r1 = this;
                if (r2 != 0) goto L7
                android.util.SparseIntArray r0 = r1.mSpanGroupIndexCache
                r0.clear()
            L7:
                r1.mCacheSpanIndices = r2
                return
        }
    }

    public GridLayoutManager(android.content.Context r1, int r2) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.mPendingSpanCountChange = r1
            r1 = -1
            r0.mSpanCount = r1
            android.util.SparseIntArray r1 = new android.util.SparseIntArray
            r1.<init>()
            r0.mPreLayoutSpanSizeCache = r1
            android.util.SparseIntArray r1 = new android.util.SparseIntArray
            r1.<init>()
            r0.mPreLayoutSpanIndexCache = r1
            androidx.recyclerview.widget.GridLayoutManager$DefaultSpanSizeLookup r1 = new androidx.recyclerview.widget.GridLayoutManager$DefaultSpanSizeLookup
            r1.<init>()
            r0.mSpanSizeLookup = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.mDecorInsets = r1
            r0.setSpanCount(r2)
            return
    }

    public GridLayoutManager(android.content.Context r1, int r2, int r3, boolean r4) {
            r0 = this;
            r0.<init>(r1, r3, r4)
            r1 = 0
            r0.mPendingSpanCountChange = r1
            r1 = -1
            r0.mSpanCount = r1
            android.util.SparseIntArray r1 = new android.util.SparseIntArray
            r1.<init>()
            r0.mPreLayoutSpanSizeCache = r1
            android.util.SparseIntArray r1 = new android.util.SparseIntArray
            r1.<init>()
            r0.mPreLayoutSpanIndexCache = r1
            androidx.recyclerview.widget.GridLayoutManager$DefaultSpanSizeLookup r1 = new androidx.recyclerview.widget.GridLayoutManager$DefaultSpanSizeLookup
            r1.<init>()
            r0.mSpanSizeLookup = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.mDecorInsets = r1
            r0.setSpanCount(r2)
            return
    }

    public GridLayoutManager(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5) {
            r1 = this;
            r1.<init>(r2, r3, r4, r5)
            r0 = 0
            r1.mPendingSpanCountChange = r0
            r0 = -1
            r1.mSpanCount = r0
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            r1.mPreLayoutSpanSizeCache = r0
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            r1.mPreLayoutSpanIndexCache = r0
            androidx.recyclerview.widget.GridLayoutManager$DefaultSpanSizeLookup r0 = new androidx.recyclerview.widget.GridLayoutManager$DefaultSpanSizeLookup
            r0.<init>()
            r1.mSpanSizeLookup = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.mDecorInsets = r0
            androidx.recyclerview.widget.RecyclerView$LayoutManager$Properties r2 = getProperties(r2, r3, r4, r5)
            int r2 = r2.spanCount
            r1.setSpanCount(r2)
            return
    }

    private void assignSpans(androidx.recyclerview.widget.RecyclerView.Recycler r5, androidx.recyclerview.widget.RecyclerView.State r6, int r7, boolean r8) {
            r4 = this;
            r0 = 0
            if (r8 == 0) goto L8
            r8 = 1
            r1 = r8
            r8 = r7
            r7 = r0
            goto Lc
        L8:
            int r7 = r7 + (-1)
            r8 = -1
            r1 = r8
        Lc:
            if (r7 == r8) goto L29
            android.view.View[] r2 = r4.mSet
            r2 = r2[r7]
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r3 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r3
            int r2 = r4.getPosition(r2)
            int r2 = r4.getSpanSize(r5, r6, r2)
            r3.mSpanSize = r2
            r3.mSpanIndex = r0
            int r2 = r3.mSpanSize
            int r0 = r0 + r2
            int r7 = r7 + r1
            goto Lc
        L29:
            return
    }

    private void cachePreLayoutSpanMapping() {
            r6 = this;
            int r0 = r6.getChildCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L2a
            android.view.View r2 = r6.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r2 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r2
            int r3 = r2.getViewLayoutPosition()
            android.util.SparseIntArray r4 = r6.mPreLayoutSpanSizeCache
            int r5 = r2.getSpanSize()
            r4.put(r3, r5)
            android.util.SparseIntArray r4 = r6.mPreLayoutSpanIndexCache
            int r2 = r2.getSpanIndex()
            r4.put(r3, r2)
            int r1 = r1 + 1
            goto L5
        L2a:
            return
    }

    private void calculateItemBorders(int r3) {
            r2 = this;
            int[] r0 = r2.mCachedBorders
            int r1 = r2.mSpanCount
            int[] r3 = calculateItemBorders(r0, r1, r3)
            r2.mCachedBorders = r3
            return
    }

    static int[] calculateItemBorders(int[] r5, int r6, int r7) {
            r0 = 1
            if (r5 == 0) goto Le
            int r1 = r5.length
            int r2 = r6 + 1
            if (r1 != r2) goto Le
            int r1 = r5.length
            int r1 = r1 - r0
            r1 = r5[r1]
            if (r1 == r7) goto L12
        Le:
            int r5 = r6 + 1
            int[] r5 = new int[r5]
        L12:
            r1 = 0
            r5[r1] = r1
            int r2 = r7 / r6
            int r7 = r7 % r6
            r3 = r1
        L19:
            if (r0 > r6) goto L2d
            int r1 = r1 + r7
            if (r1 <= 0) goto L26
            int r4 = r6 - r1
            if (r4 >= r7) goto L26
            int r4 = r2 + 1
            int r1 = r1 - r6
            goto L27
        L26:
            r4 = r2
        L27:
            int r3 = r3 + r4
            r5[r0] = r3
            int r0 = r0 + 1
            goto L19
        L2d:
            return r5
    }

    private void clearPreLayoutSpanMappingCache() {
            r1 = this;
            android.util.SparseIntArray r0 = r1.mPreLayoutSpanSizeCache
            r0.clear()
            android.util.SparseIntArray r0 = r1.mPreLayoutSpanIndexCache
            r0.clear()
            return
    }

    private int computeScrollOffsetWithSpanInfo(androidx.recyclerview.widget.RecyclerView.State r10) {
            r9 = this;
            int r0 = r9.getChildCount()
            r1 = 0
            if (r0 == 0) goto Lad
            int r0 = r10.getItemCount()
            if (r0 != 0) goto Lf
            goto Lad
        Lf:
            r9.ensureLayoutState()
            boolean r0 = r9.isSmoothScrollbarEnabled()
            r2 = r0 ^ 1
            r3 = 1
            android.view.View r2 = r9.findFirstVisibleChildClosestToStart(r2, r3)
            r4 = r0 ^ 1
            android.view.View r4 = r9.findFirstVisibleChildClosestToEnd(r4, r3)
            if (r2 == 0) goto Lad
            if (r4 != 0) goto L29
            goto Lad
        L29:
            androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup r5 = r9.mSpanSizeLookup
            int r6 = r9.getPosition(r2)
            int r7 = r9.mSpanCount
            int r5 = r5.getCachedSpanGroupIndex(r6, r7)
            androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup r6 = r9.mSpanSizeLookup
            int r7 = r9.getPosition(r4)
            int r8 = r9.mSpanCount
            int r6 = r6.getCachedSpanGroupIndex(r7, r8)
            int r7 = java.lang.Math.min(r5, r6)
            int r5 = java.lang.Math.max(r5, r6)
            androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup r6 = r9.mSpanSizeLookup
            int r10 = r10.getItemCount()
            int r10 = r10 - r3
            int r8 = r9.mSpanCount
            int r10 = r6.getCachedSpanGroupIndex(r10, r8)
            int r10 = r10 + r3
            boolean r6 = r9.mShouldReverseLayout
            if (r6 == 0) goto L62
            int r10 = r10 - r5
            int r10 = r10 - r3
            int r10 = java.lang.Math.max(r1, r10)
            goto L66
        L62:
            int r10 = java.lang.Math.max(r1, r7)
        L66:
            if (r0 != 0) goto L69
            return r10
        L69:
            androidx.recyclerview.widget.OrientationHelper r0 = r9.mOrientationHelper
            int r0 = r0.getDecoratedEnd(r4)
            androidx.recyclerview.widget.OrientationHelper r1 = r9.mOrientationHelper
            int r1 = r1.getDecoratedStart(r2)
            int r0 = r0 - r1
            int r0 = java.lang.Math.abs(r0)
            androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup r1 = r9.mSpanSizeLookup
            int r5 = r9.getPosition(r2)
            int r6 = r9.mSpanCount
            int r1 = r1.getCachedSpanGroupIndex(r5, r6)
            androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup r5 = r9.mSpanSizeLookup
            int r4 = r9.getPosition(r4)
            int r6 = r9.mSpanCount
            int r4 = r5.getCachedSpanGroupIndex(r4, r6)
            int r4 = r4 - r1
            int r4 = r4 + r3
            float r0 = (float) r0
            float r1 = (float) r4
            float r0 = r0 / r1
            float r10 = (float) r10
            float r10 = r10 * r0
            androidx.recyclerview.widget.OrientationHelper r0 = r9.mOrientationHelper
            int r0 = r0.getStartAfterPadding()
            androidx.recyclerview.widget.OrientationHelper r1 = r9.mOrientationHelper
            int r1 = r1.getDecoratedStart(r2)
            int r0 = r0 - r1
            float r0 = (float) r0
            float r10 = r10 + r0
            int r10 = java.lang.Math.round(r10)
            return r10
        Lad:
            return r1
    }

    private int computeScrollRangeWithSpanInfo(androidx.recyclerview.widget.RecyclerView.State r7) {
            r6 = this;
            int r0 = r6.getChildCount()
            r1 = 0
            if (r0 == 0) goto L7a
            int r0 = r7.getItemCount()
            if (r0 != 0) goto Le
            goto L7a
        Le:
            r6.ensureLayoutState()
            boolean r0 = r6.isSmoothScrollbarEnabled()
            r2 = 1
            r0 = r0 ^ r2
            android.view.View r0 = r6.findFirstVisibleChildClosestToStart(r0, r2)
            boolean r3 = r6.isSmoothScrollbarEnabled()
            r3 = r3 ^ r2
            android.view.View r3 = r6.findFirstVisibleChildClosestToEnd(r3, r2)
            if (r0 == 0) goto L7a
            if (r3 != 0) goto L29
            goto L7a
        L29:
            boolean r1 = r6.isSmoothScrollbarEnabled()
            if (r1 != 0) goto L3e
            androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup r0 = r6.mSpanSizeLookup
            int r7 = r7.getItemCount()
            int r7 = r7 - r2
            int r1 = r6.mSpanCount
            int r7 = r0.getCachedSpanGroupIndex(r7, r1)
            int r7 = r7 + r2
            return r7
        L3e:
            androidx.recyclerview.widget.OrientationHelper r1 = r6.mOrientationHelper
            int r1 = r1.getDecoratedEnd(r3)
            androidx.recyclerview.widget.OrientationHelper r4 = r6.mOrientationHelper
            int r4 = r4.getDecoratedStart(r0)
            int r1 = r1 - r4
            androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup r4 = r6.mSpanSizeLookup
            int r0 = r6.getPosition(r0)
            int r5 = r6.mSpanCount
            int r0 = r4.getCachedSpanGroupIndex(r0, r5)
            androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup r4 = r6.mSpanSizeLookup
            int r3 = r6.getPosition(r3)
            int r5 = r6.mSpanCount
            int r3 = r4.getCachedSpanGroupIndex(r3, r5)
            androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup r4 = r6.mSpanSizeLookup
            int r7 = r7.getItemCount()
            int r7 = r7 - r2
            int r5 = r6.mSpanCount
            int r7 = r4.getCachedSpanGroupIndex(r7, r5)
            int r7 = r7 + r2
            int r3 = r3 - r0
            int r3 = r3 + r2
            float r0 = (float) r1
            float r1 = (float) r3
            float r0 = r0 / r1
            float r7 = (float) r7
            float r0 = r0 * r7
            int r7 = (int) r0
            return r7
        L7a:
            return r1
    }

    private void ensureAnchorIsInCorrectSpan(androidx.recyclerview.widget.RecyclerView.Recycler r5, androidx.recyclerview.widget.RecyclerView.State r6, androidx.recyclerview.widget.LinearLayoutManager.AnchorInfo r7, int r8) {
            r4 = this;
            r0 = 1
            if (r8 != r0) goto L5
            r8 = r0
            goto L6
        L5:
            r8 = 0
        L6:
            int r1 = r7.mPosition
            int r1 = r4.getSpanIndex(r5, r6, r1)
            if (r8 == 0) goto L20
        Le:
            if (r1 <= 0) goto L36
            int r8 = r7.mPosition
            if (r8 <= 0) goto L36
            int r8 = r7.mPosition
            int r8 = r8 - r0
            r7.mPosition = r8
            int r8 = r7.mPosition
            int r1 = r4.getSpanIndex(r5, r6, r8)
            goto Le
        L20:
            int r8 = r6.getItemCount()
            int r8 = r8 - r0
            int r0 = r7.mPosition
        L27:
            if (r0 >= r8) goto L34
            int r2 = r0 + 1
            int r3 = r4.getSpanIndex(r5, r6, r2)
            if (r3 <= r1) goto L34
            r0 = r2
            r1 = r3
            goto L27
        L34:
            r7.mPosition = r0
        L36:
            return
    }

    private void ensureViewSet() {
            r2 = this;
            android.view.View[] r0 = r2.mSet
            if (r0 == 0) goto L9
            int r0 = r0.length
            int r1 = r2.mSpanCount
            if (r0 == r1) goto Lf
        L9:
            int r0 = r2.mSpanCount
            android.view.View[] r0 = new android.view.View[r0]
            r2.mSet = r0
        Lf:
            return
    }

    private int getSpanGroupIndex(androidx.recyclerview.widget.RecyclerView.Recycler r1, androidx.recyclerview.widget.RecyclerView.State r2, int r3) {
            r0 = this;
            boolean r2 = r2.isPreLayout()
            if (r2 != 0) goto Lf
            androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup r1 = r0.mSpanSizeLookup
            int r2 = r0.mSpanCount
            int r1 = r1.getCachedSpanGroupIndex(r3, r2)
            return r1
        Lf:
            int r1 = r1.convertPreLayoutPositionToPostLayout(r3)
            r2 = -1
            if (r1 != r2) goto L2c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Cannot find span size for pre layout position. "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "GridLayoutManager"
            android.util.Log.w(r2, r1)
            r1 = 0
            return r1
        L2c:
            androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup r2 = r0.mSpanSizeLookup
            int r3 = r0.mSpanCount
            int r1 = r2.getCachedSpanGroupIndex(r1, r3)
            return r1
    }

    private int getSpanIndex(androidx.recyclerview.widget.RecyclerView.Recycler r2, androidx.recyclerview.widget.RecyclerView.State r3, int r4) {
            r1 = this;
            boolean r3 = r3.isPreLayout()
            if (r3 != 0) goto Lf
            androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup r2 = r1.mSpanSizeLookup
            int r3 = r1.mSpanCount
            int r2 = r2.getCachedSpanIndex(r4, r3)
            return r2
        Lf:
            android.util.SparseIntArray r3 = r1.mPreLayoutSpanIndexCache
            r0 = -1
            int r3 = r3.get(r4, r0)
            if (r3 == r0) goto L19
            return r3
        L19:
            int r2 = r2.convertPreLayoutPositionToPostLayout(r4)
            if (r2 != r0) goto L35
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:"
            r2.<init>(r3)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "GridLayoutManager"
            android.util.Log.w(r3, r2)
            r2 = 0
            return r2
        L35:
            androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup r3 = r1.mSpanSizeLookup
            int r4 = r1.mSpanCount
            int r2 = r3.getCachedSpanIndex(r2, r4)
            return r2
    }

    private int getSpanSize(androidx.recyclerview.widget.RecyclerView.Recycler r2, androidx.recyclerview.widget.RecyclerView.State r3, int r4) {
            r1 = this;
            boolean r3 = r3.isPreLayout()
            if (r3 != 0) goto Ld
            androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup r2 = r1.mSpanSizeLookup
            int r2 = r2.getSpanSize(r4)
            return r2
        Ld:
            android.util.SparseIntArray r3 = r1.mPreLayoutSpanSizeCache
            r0 = -1
            int r3 = r3.get(r4, r0)
            if (r3 == r0) goto L17
            return r3
        L17:
            int r2 = r2.convertPreLayoutPositionToPostLayout(r4)
            if (r2 != r0) goto L33
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:"
            r2.<init>(r3)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "GridLayoutManager"
            android.util.Log.w(r3, r2)
            r2 = 1
            return r2
        L33:
            androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup r3 = r1.mSpanSizeLookup
            int r2 = r3.getSpanSize(r2)
            return r2
    }

    private void guessMeasurement(float r2, int r3) {
            r1 = this;
            int r0 = r1.mSpanCount
            float r0 = (float) r0
            float r2 = r2 * r0
            int r2 = java.lang.Math.round(r2)
            int r2 = java.lang.Math.max(r2, r3)
            r1.calculateItemBorders(r2)
            return
    }

    private void measureChild(android.view.View r9, int r10, boolean r11) {
            r8 = this;
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r0 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r0
            android.graphics.Rect r1 = r0.mDecorInsets
            int r2 = r1.top
            int r3 = r1.bottom
            int r2 = r2 + r3
            int r3 = r0.topMargin
            int r2 = r2 + r3
            int r3 = r0.bottomMargin
            int r2 = r2 + r3
            int r3 = r1.left
            int r1 = r1.right
            int r3 = r3 + r1
            int r1 = r0.leftMargin
            int r3 = r3 + r1
            int r1 = r0.rightMargin
            int r3 = r3 + r1
            int r1 = r0.mSpanIndex
            int r4 = r0.mSpanSize
            int r1 = r8.getSpaceForSpanRange(r1, r4)
            int r4 = r8.mOrientation
            r5 = 0
            r6 = 1
            if (r4 != r6) goto L43
            int r4 = r0.width
            int r10 = getChildMeasureSpec(r1, r10, r3, r4, r5)
            androidx.recyclerview.widget.OrientationHelper r1 = r8.mOrientationHelper
            int r1 = r1.getTotalSpace()
            int r3 = r8.getHeightMode()
            int r0 = r0.height
            int r0 = getChildMeasureSpec(r1, r3, r2, r0, r6)
            goto L5c
        L43:
            int r4 = r0.height
            int r10 = getChildMeasureSpec(r1, r10, r2, r4, r5)
            androidx.recyclerview.widget.OrientationHelper r1 = r8.mOrientationHelper
            int r1 = r1.getTotalSpace()
            int r2 = r8.getWidthMode()
            int r0 = r0.width
            int r0 = getChildMeasureSpec(r1, r2, r3, r0, r6)
            r7 = r0
            r0 = r10
            r10 = r7
        L5c:
            r8.measureChildWithDecorationsAndMargin(r9, r10, r0, r11)
            return
    }

    private void measureChildWithDecorationsAndMargin(android.view.View r2, int r3, int r4, boolean r5) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r0 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r0
            if (r5 == 0) goto Ld
            boolean r5 = r1.shouldReMeasureChild(r2, r3, r4, r0)
            goto L11
        Ld:
            boolean r5 = r1.shouldMeasureChild(r2, r3, r4, r0)
        L11:
            if (r5 == 0) goto L16
            r2.measure(r3, r4)
        L16:
            return
    }

    private void updateMeasurements() {
            r2 = this;
            int r0 = r2.getOrientation()
            r1 = 1
            if (r0 != r1) goto L15
            int r0 = r2.getWidth()
            int r1 = r2.getPaddingRight()
            int r0 = r0 - r1
            int r1 = r2.getPaddingLeft()
            goto L22
        L15:
            int r0 = r2.getHeight()
            int r1 = r2.getPaddingBottom()
            int r0 = r0 - r1
            int r1 = r2.getPaddingTop()
        L22:
            int r0 = r0 - r1
            r2.calculateItemBorders(r0)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean checkLayoutParams(androidx.recyclerview.widget.RecyclerView.LayoutParams r1) {
            r0 = this;
            boolean r1 = r1 instanceof androidx.recyclerview.widget.GridLayoutManager.LayoutParams
            return r1
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void collectPrefetchPositionsForLayoutState(androidx.recyclerview.widget.RecyclerView.State r6, androidx.recyclerview.widget.LinearLayoutManager.LayoutState r7, androidx.recyclerview.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry r8) {
            r5 = this;
            int r0 = r5.mSpanCount
            r1 = 0
            r2 = r1
        L4:
            int r3 = r5.mSpanCount
            if (r2 >= r3) goto L2c
            boolean r3 = r7.hasMore(r6)
            if (r3 == 0) goto L2c
            if (r0 <= 0) goto L2c
            int r3 = r7.mCurrentPosition
            int r4 = r7.mScrollingOffset
            int r4 = java.lang.Math.max(r1, r4)
            r8.addPosition(r3, r4)
            androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup r4 = r5.mSpanSizeLookup
            int r3 = r4.getSpanSize(r3)
            int r0 = r0 - r3
            int r3 = r7.mCurrentPosition
            int r4 = r7.mItemDirection
            int r3 = r3 + r4
            r7.mCurrentPosition = r3
            int r2 = r2 + 1
            goto L4
        L2c:
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(androidx.recyclerview.widget.RecyclerView.State r2) {
            r1 = this;
            boolean r0 = r1.mUsingSpansToEstimateScrollBarDimensions
            if (r0 == 0) goto L9
            int r2 = r1.computeScrollOffsetWithSpanInfo(r2)
            return r2
        L9:
            int r2 = super.computeHorizontalScrollOffset(r2)
            return r2
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(androidx.recyclerview.widget.RecyclerView.State r2) {
            r1 = this;
            boolean r0 = r1.mUsingSpansToEstimateScrollBarDimensions
            if (r0 == 0) goto L9
            int r2 = r1.computeScrollRangeWithSpanInfo(r2)
            return r2
        L9:
            int r2 = super.computeHorizontalScrollRange(r2)
            return r2
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(androidx.recyclerview.widget.RecyclerView.State r2) {
            r1 = this;
            boolean r0 = r1.mUsingSpansToEstimateScrollBarDimensions
            if (r0 == 0) goto L9
            int r2 = r1.computeScrollOffsetWithSpanInfo(r2)
            return r2
        L9:
            int r2 = super.computeVerticalScrollOffset(r2)
            return r2
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(androidx.recyclerview.widget.RecyclerView.State r2) {
            r1 = this;
            boolean r0 = r1.mUsingSpansToEstimateScrollBarDimensions
            if (r0 == 0) goto L9
            int r2 = r1.computeScrollRangeWithSpanInfo(r2)
            return r2
        L9:
            int r2 = super.computeVerticalScrollRange(r2)
            return r2
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    android.view.View findReferenceChild(androidx.recyclerview.widget.RecyclerView.Recycler r8, androidx.recyclerview.widget.RecyclerView.State r9, int r10, int r11, int r12) {
            r7 = this;
            r7.ensureLayoutState()
            androidx.recyclerview.widget.OrientationHelper r0 = r7.mOrientationHelper
            int r0 = r0.getStartAfterPadding()
            androidx.recyclerview.widget.OrientationHelper r1 = r7.mOrientationHelper
            int r1 = r1.getEndAfterPadding()
            if (r11 <= r10) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = -1
        L14:
            r3 = 0
            r4 = r3
        L16:
            if (r10 == r11) goto L52
            android.view.View r5 = r7.getChildAt(r10)
            int r6 = r7.getPosition(r5)
            if (r6 < 0) goto L50
            if (r6 >= r12) goto L50
            int r6 = r7.getSpanIndex(r8, r9, r6)
            if (r6 == 0) goto L2b
            goto L50
        L2b:
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r6 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r6
            boolean r6 = r6.isItemRemoved()
            if (r6 == 0) goto L3b
            if (r4 != 0) goto L50
            r4 = r5
            goto L50
        L3b:
            androidx.recyclerview.widget.OrientationHelper r6 = r7.mOrientationHelper
            int r6 = r6.getDecoratedStart(r5)
            if (r6 >= r1) goto L4d
            androidx.recyclerview.widget.OrientationHelper r6 = r7.mOrientationHelper
            int r6 = r6.getDecoratedEnd(r5)
            if (r6 >= r0) goto L4c
            goto L4d
        L4c:
            return r5
        L4d:
            if (r3 != 0) goto L50
            r3 = r5
        L50:
            int r10 = r10 + r2
            goto L16
        L52:
            if (r3 == 0) goto L55
            goto L56
        L55:
            r3 = r4
        L56:
            return r3
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateDefaultLayoutParams() {
            r3 = this;
            int r0 = r3.mOrientation
            r1 = -2
            r2 = -1
            if (r0 != 0) goto Lc
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r0 = new androidx.recyclerview.widget.GridLayoutManager$LayoutParams
            r0.<init>(r1, r2)
            return r0
        Lc:
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r0 = new androidx.recyclerview.widget.GridLayoutManager$LayoutParams
            r0.<init>(r2, r1)
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateLayoutParams(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r0 = new androidx.recyclerview.widget.GridLayoutManager$LayoutParams
            r0.<init>(r2, r3)
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto Lc
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r0 = new androidx.recyclerview.widget.GridLayoutManager$LayoutParams
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r0.<init>(r2)
            return r0
        Lc:
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r0 = new androidx.recyclerview.widget.GridLayoutManager$LayoutParams
            r0.<init>(r2)
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getColumnCountForAccessibility(androidx.recyclerview.widget.RecyclerView.Recycler r3, androidx.recyclerview.widget.RecyclerView.State r4) {
            r2 = this;
            int r0 = r2.mOrientation
            r1 = 1
            if (r0 != r1) goto L8
            int r3 = r2.mSpanCount
            return r3
        L8:
            int r0 = r4.getItemCount()
            if (r0 >= r1) goto L10
            r3 = 0
            return r3
        L10:
            int r0 = r4.getItemCount()
            int r0 = r0 - r1
            int r3 = r2.getSpanGroupIndex(r3, r4, r0)
            int r3 = r3 + r1
            return r3
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getRowCountForAccessibility(androidx.recyclerview.widget.RecyclerView.Recycler r3, androidx.recyclerview.widget.RecyclerView.State r4) {
            r2 = this;
            int r0 = r2.mOrientation
            if (r0 != 0) goto L7
            int r3 = r2.mSpanCount
            return r3
        L7:
            int r0 = r4.getItemCount()
            r1 = 1
            if (r0 >= r1) goto L10
            r3 = 0
            return r3
        L10:
            int r0 = r4.getItemCount()
            int r0 = r0 - r1
            int r3 = r2.getSpanGroupIndex(r3, r4, r0)
            int r3 = r3 + r1
            return r3
    }

    int getSpaceForSpanRange(int r4, int r5) {
            r3 = this;
            int r0 = r3.mOrientation
            r1 = 1
            if (r0 != r1) goto L19
            boolean r0 = r3.isLayoutRTL()
            if (r0 == 0) goto L19
            int[] r0 = r3.mCachedBorders
            int r1 = r3.mSpanCount
            int r2 = r1 - r4
            r2 = r0[r2]
            int r1 = r1 - r4
            int r1 = r1 - r5
            r4 = r0[r1]
            int r2 = r2 - r4
            return r2
        L19:
            int[] r0 = r3.mCachedBorders
            int r5 = r5 + r4
            r5 = r0[r5]
            r4 = r0[r4]
            int r5 = r5 - r4
            return r5
    }

    public int getSpanCount() {
            r1 = this;
            int r0 = r1.mSpanCount
            return r0
    }

    public androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup getSpanSizeLookup() {
            r1 = this;
            androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup r0 = r1.mSpanSizeLookup
            return r0
    }

    public boolean isUsingSpansToEstimateScrollbarDimensions() {
            r1 = this;
            boolean r0 = r1.mUsingSpansToEstimateScrollBarDimensions
            return r0
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void layoutChunk(androidx.recyclerview.widget.RecyclerView.Recycler r18, androidx.recyclerview.widget.RecyclerView.State r19, androidx.recyclerview.widget.LinearLayoutManager.LayoutState r20, androidx.recyclerview.widget.LinearLayoutManager.LayoutChunkResult r21) {
            r17 = this;
            r6 = r17
            r0 = r18
            r1 = r19
            r2 = r20
            r7 = r21
            androidx.recyclerview.widget.OrientationHelper r3 = r6.mOrientationHelper
            int r3 = r3.getModeInOther()
            r8 = 1
            r4 = 0
            r5 = 1073741824(0x40000000, float:2.0)
            if (r3 == r5) goto L18
            r9 = r8
            goto L19
        L18:
            r9 = r4
        L19:
            int r10 = r17.getChildCount()
            if (r10 <= 0) goto L26
            int[] r10 = r6.mCachedBorders
            int r11 = r6.mSpanCount
            r10 = r10[r11]
            goto L27
        L26:
            r10 = r4
        L27:
            if (r9 == 0) goto L2c
            r17.updateMeasurements()
        L2c:
            int r11 = r2.mItemDirection
            if (r11 != r8) goto L32
            r11 = r8
            goto L33
        L32:
            r11 = r4
        L33:
            int r12 = r6.mSpanCount
            if (r11 != 0) goto L44
            int r12 = r2.mCurrentPosition
            int r12 = r6.getSpanIndex(r0, r1, r12)
            int r13 = r2.mCurrentPosition
            int r13 = r6.getSpanSize(r0, r1, r13)
            int r12 = r12 + r13
        L44:
            r13 = r4
        L45:
            int r14 = r6.mSpanCount
            if (r13 >= r14) goto La0
            boolean r14 = r2.hasMore(r1)
            if (r14 == 0) goto La0
            if (r12 <= 0) goto La0
            int r14 = r2.mCurrentPosition
            int r15 = r6.getSpanSize(r0, r1, r14)
            int r5 = r6.mSpanCount
            if (r15 > r5) goto L6f
            int r12 = r12 - r15
            if (r12 >= 0) goto L5f
            goto La0
        L5f:
            android.view.View r5 = r2.next(r0)
            if (r5 != 0) goto L66
            goto La0
        L66:
            android.view.View[] r14 = r6.mSet
            r14[r13] = r5
            int r13 = r13 + 1
            r5 = 1073741824(0x40000000, float:2.0)
            goto L45
        L6f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Item at position "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r14)
            java.lang.String r2 = " requires "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r15)
            java.lang.String r2 = " spans but GridLayoutManager has only "
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r6.mSpanCount
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " spans."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        La0:
            if (r13 != 0) goto La5
            r7.mFinished = r8
            return
        La5:
            r6.assignSpans(r0, r1, r13, r11)
            r0 = 0
            r1 = r4
            r5 = r1
        Lab:
            if (r1 >= r13) goto Lf5
            android.view.View[] r12 = r6.mSet
            r12 = r12[r1]
            java.util.List<androidx.recyclerview.widget.RecyclerView$ViewHolder> r14 = r2.mScrapList
            if (r14 != 0) goto Lbf
            if (r11 == 0) goto Lbb
            r6.addView(r12)
            goto Lc8
        Lbb:
            r6.addView(r12, r4)
            goto Lc8
        Lbf:
            if (r11 == 0) goto Lc5
            r6.addDisappearingView(r12)
            goto Lc8
        Lc5:
            r6.addDisappearingView(r12, r4)
        Lc8:
            android.graphics.Rect r14 = r6.mDecorInsets
            r6.calculateItemDecorationsForChild(r12, r14)
            r6.measureChild(r12, r3, r4)
            androidx.recyclerview.widget.OrientationHelper r14 = r6.mOrientationHelper
            int r14 = r14.getDecoratedMeasurement(r12)
            if (r14 <= r5) goto Ld9
            r5 = r14
        Ld9:
            android.view.ViewGroup$LayoutParams r14 = r12.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r14 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r14
            androidx.recyclerview.widget.OrientationHelper r15 = r6.mOrientationHelper
            int r12 = r15.getDecoratedMeasurementInOther(r12)
            float r12 = (float) r12
            r15 = 1065353216(0x3f800000, float:1.0)
            float r12 = r12 * r15
            int r14 = r14.mSpanSize
            float r14 = (float) r14
            float r12 = r12 / r14
            int r14 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r14 <= 0) goto Lf2
            r0 = r12
        Lf2:
            int r1 = r1 + 1
            goto Lab
        Lf5:
            if (r9 == 0) goto L113
            r6.guessMeasurement(r0, r10)
            r0 = r4
            r5 = r0
        Lfc:
            if (r0 >= r13) goto L113
            android.view.View[] r1 = r6.mSet
            r1 = r1[r0]
            r3 = 1073741824(0x40000000, float:2.0)
            r6.measureChild(r1, r3, r8)
            androidx.recyclerview.widget.OrientationHelper r3 = r6.mOrientationHelper
            int r1 = r3.getDecoratedMeasurement(r1)
            if (r1 <= r5) goto L110
            r5 = r1
        L110:
            int r0 = r0 + 1
            goto Lfc
        L113:
            r0 = r4
        L114:
            if (r0 >= r13) goto L173
            android.view.View[] r1 = r6.mSet
            r1 = r1[r0]
            androidx.recyclerview.widget.OrientationHelper r3 = r6.mOrientationHelper
            int r3 = r3.getDecoratedMeasurement(r1)
            if (r3 == r5) goto L16e
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r3 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r3
            android.graphics.Rect r9 = r3.mDecorInsets
            int r10 = r9.top
            int r11 = r9.bottom
            int r10 = r10 + r11
            int r11 = r3.topMargin
            int r10 = r10 + r11
            int r11 = r3.bottomMargin
            int r10 = r10 + r11
            int r11 = r9.left
            int r9 = r9.right
            int r11 = r11 + r9
            int r9 = r3.leftMargin
            int r11 = r11 + r9
            int r9 = r3.rightMargin
            int r11 = r11 + r9
            int r9 = r3.mSpanIndex
            int r12 = r3.mSpanSize
            int r9 = r6.getSpaceForSpanRange(r9, r12)
            int r12 = r6.mOrientation
            if (r12 != r8) goto L15b
            int r3 = r3.width
            r12 = 1073741824(0x40000000, float:2.0)
            int r3 = getChildMeasureSpec(r9, r12, r11, r3, r4)
            int r9 = r5 - r10
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r12)
            goto L16a
        L15b:
            r12 = 1073741824(0x40000000, float:2.0)
            int r11 = r5 - r11
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r12)
            int r3 = r3.height
            int r9 = getChildMeasureSpec(r9, r12, r10, r3, r4)
            r3 = r11
        L16a:
            r6.measureChildWithDecorationsAndMargin(r1, r3, r9, r8)
            goto L170
        L16e:
            r12 = 1073741824(0x40000000, float:2.0)
        L170:
            int r0 = r0 + 1
            goto L114
        L173:
            r7.mConsumed = r5
            int r0 = r6.mOrientation
            r1 = -1
            if (r0 != r8) goto L18b
            int r0 = r2.mLayoutDirection
            if (r0 != r1) goto L183
            int r0 = r2.mOffset
            int r1 = r0 - r5
            goto L187
        L183:
            int r1 = r2.mOffset
            int r0 = r1 + r5
        L187:
            r2 = r1
            r1 = r4
            r3 = r1
            goto L19c
        L18b:
            int r0 = r2.mLayoutDirection
            if (r0 != r1) goto L194
            int r0 = r2.mOffset
            int r1 = r0 - r5
            goto L198
        L194:
            int r1 = r2.mOffset
            int r0 = r1 + r5
        L198:
            r3 = r1
            r2 = r4
            r1 = r0
            r0 = r2
        L19c:
            r9 = r4
        L19d:
            if (r9 >= r13) goto L228
            android.view.View[] r4 = r6.mSet
            r10 = r4[r9]
            android.view.ViewGroup$LayoutParams r4 = r10.getLayoutParams()
            r11 = r4
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r11 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r11
            int r4 = r6.mOrientation
            if (r4 != r8) goto L1e6
            boolean r1 = r17.isLayoutRTL()
            if (r1 == 0) goto L1ce
            int r1 = r17.getPaddingLeft()
            int[] r3 = r6.mCachedBorders
            int r4 = r6.mSpanCount
            int r5 = r11.mSpanIndex
            int r4 = r4 - r5
            r3 = r3[r4]
            int r1 = r1 + r3
            androidx.recyclerview.widget.OrientationHelper r3 = r6.mOrientationHelper
            int r3 = r3.getDecoratedMeasurementInOther(r10)
            int r3 = r1 - r3
            r12 = r0
            r14 = r1
            r15 = r2
            goto L1fb
        L1ce:
            int r1 = r17.getPaddingLeft()
            int[] r3 = r6.mCachedBorders
            int r4 = r11.mSpanIndex
            r3 = r3[r4]
            int r1 = r1 + r3
            androidx.recyclerview.widget.OrientationHelper r3 = r6.mOrientationHelper
            int r3 = r3.getDecoratedMeasurementInOther(r10)
            int r3 = r3 + r1
            r12 = r0
            r16 = r1
            r15 = r2
            r14 = r3
            goto L1fd
        L1e6:
            int r0 = r17.getPaddingTop()
            int[] r2 = r6.mCachedBorders
            int r4 = r11.mSpanIndex
            r2 = r2[r4]
            int r0 = r0 + r2
            androidx.recyclerview.widget.OrientationHelper r2 = r6.mOrientationHelper
            int r2 = r2.getDecoratedMeasurementInOther(r10)
            int r2 = r2 + r0
            r15 = r0
            r14 = r1
            r12 = r2
        L1fb:
            r16 = r3
        L1fd:
            r0 = r17
            r1 = r10
            r2 = r16
            r3 = r15
            r4 = r14
            r5 = r12
            r0.layoutDecoratedWithMargins(r1, r2, r3, r4, r5)
            boolean r0 = r11.isItemRemoved()
            if (r0 != 0) goto L214
            boolean r0 = r11.isItemChanged()
            if (r0 == 0) goto L216
        L214:
            r7.mIgnoreConsumed = r8
        L216:
            boolean r0 = r7.mFocusable
            boolean r1 = r10.hasFocusable()
            r0 = r0 | r1
            r7.mFocusable = r0
            int r9 = r9 + 1
            r0 = r12
            r1 = r14
            r2 = r15
            r3 = r16
            goto L19d
        L228:
            android.view.View[] r0 = r6.mSet
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void onAnchorReady(androidx.recyclerview.widget.RecyclerView.Recycler r2, androidx.recyclerview.widget.RecyclerView.State r3, androidx.recyclerview.widget.LinearLayoutManager.AnchorInfo r4, int r5) {
            r1 = this;
            super.onAnchorReady(r2, r3, r4, r5)
            r1.updateMeasurements()
            int r0 = r3.getItemCount()
            if (r0 <= 0) goto L15
            boolean r0 = r3.isPreLayout()
            if (r0 != 0) goto L15
            r1.ensureAnchorIsInCorrectSpan(r2, r3, r4, r5)
        L15:
            r1.ensureViewSet()
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public android.view.View onFocusSearchFailed(android.view.View r23, int r24, androidx.recyclerview.widget.RecyclerView.Recycler r25, androidx.recyclerview.widget.RecyclerView.State r26) {
            r22 = this;
            r0 = r22
            r1 = r25
            r2 = r26
            android.view.View r3 = r22.findContainingItemView(r23)
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r5 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r5
            int r6 = r5.mSpanIndex
            int r7 = r5.mSpanIndex
            int r5 = r5.mSpanSize
            int r7 = r7 + r5
            android.view.View r5 = super.onFocusSearchFailed(r23, r24, r25, r26)
            if (r5 != 0) goto L22
            return r4
        L22:
            r5 = r24
            int r5 = r0.convertFocusDirectionToLayoutDirection(r5)
            r9 = 1
            if (r5 != r9) goto L2d
            r5 = r9
            goto L2e
        L2d:
            r5 = 0
        L2e:
            boolean r10 = r0.mShouldReverseLayout
            if (r5 == r10) goto L34
            r5 = r9
            goto L35
        L34:
            r5 = 0
        L35:
            r10 = -1
            if (r5 == 0) goto L40
            int r5 = r22.getChildCount()
            int r5 = r5 - r9
            r11 = r10
            r12 = r11
            goto L47
        L40:
            int r5 = r22.getChildCount()
            r11 = r5
            r12 = r9
            r5 = 0
        L47:
            int r13 = r0.mOrientation
            if (r13 != r9) goto L53
            boolean r13 = r22.isLayoutRTL()
            if (r13 == 0) goto L53
            r13 = r9
            goto L54
        L53:
            r13 = 0
        L54:
            int r14 = r0.getSpanGroupIndex(r1, r2, r5)
            r15 = r10
            r16 = r15
            r8 = 0
            r17 = 0
            r10 = r5
            r5 = r4
        L60:
            if (r10 == r11) goto L14a
            int r9 = r0.getSpanGroupIndex(r1, r2, r10)
            android.view.View r1 = r0.getChildAt(r10)
            if (r1 != r3) goto L6e
            goto L14a
        L6e:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L88
            if (r9 == r14) goto L88
            if (r4 == 0) goto L7a
            goto L14a
        L7a:
            r18 = r3
            r20 = r5
            r23 = r8
            r19 = r11
            r11 = r16
            r5 = r17
            goto L136
        L88:
            android.view.ViewGroup$LayoutParams r9 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r9 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r9
            int r2 = r9.mSpanIndex
            r18 = r3
            int r3 = r9.mSpanIndex
            r19 = r11
            int r11 = r9.mSpanSize
            int r3 = r3 + r11
            boolean r11 = r1.hasFocusable()
            if (r11 == 0) goto La4
            if (r2 != r6) goto La4
            if (r3 != r7) goto La4
            return r1
        La4:
            boolean r11 = r1.hasFocusable()
            if (r11 == 0) goto Lac
            if (r4 == 0) goto Lb4
        Lac:
            boolean r11 = r1.hasFocusable()
            if (r11 != 0) goto Lbe
            if (r5 != 0) goto Lbe
        Lb4:
            r20 = r5
            r23 = r8
            r11 = r16
            r5 = r17
        Lbc:
            r8 = 1
            goto L107
        Lbe:
            int r11 = java.lang.Math.max(r2, r6)
            int r20 = java.lang.Math.min(r3, r7)
            int r11 = r20 - r11
            boolean r20 = r1.hasFocusable()
            if (r20 == 0) goto Ldb
            if (r11 <= r8) goto Ld1
            goto Lb4
        Ld1:
            if (r11 != r8) goto Lfe
            if (r2 <= r15) goto Ld7
            r11 = 1
            goto Ld8
        Ld7:
            r11 = 0
        Ld8:
            if (r13 != r11) goto Lfe
            goto Lb4
        Ldb:
            if (r4 != 0) goto Lfe
            r20 = r5
            r23 = r8
            r5 = 0
            r8 = 1
            boolean r21 = r0.isViewPartiallyVisible(r1, r5, r8)
            if (r21 == 0) goto L102
            r5 = r17
            if (r11 <= r5) goto Lf0
            r11 = r16
            goto L107
        Lf0:
            if (r11 != r5) goto Lfb
            r11 = r16
            if (r2 <= r11) goto Lf7
            goto Lf8
        Lf7:
            r8 = 0
        Lf8:
            if (r13 != r8) goto L106
            goto Lbc
        Lfb:
            r11 = r16
            goto L106
        Lfe:
            r20 = r5
            r23 = r8
        L102:
            r11 = r16
            r5 = r17
        L106:
            r8 = 0
        L107:
            if (r8 == 0) goto L136
            boolean r8 = r1.hasFocusable()
            if (r8 == 0) goto L124
            int r4 = r9.mSpanIndex
            int r3 = java.lang.Math.min(r3, r7)
            int r2 = java.lang.Math.max(r2, r6)
            int r8 = r3 - r2
            r15 = r4
            r17 = r5
            r16 = r11
            r5 = r20
            r4 = r1
            goto L13e
        L124:
            int r5 = r9.mSpanIndex
            int r3 = java.lang.Math.min(r3, r7)
            int r2 = java.lang.Math.max(r2, r6)
            int r17 = r3 - r2
            r8 = r23
            r16 = r5
            r5 = r1
            goto L13e
        L136:
            r8 = r23
            r17 = r5
            r16 = r11
            r5 = r20
        L13e:
            int r10 = r10 + r12
            r1 = r25
            r2 = r26
            r3 = r18
            r11 = r19
            r9 = 1
            goto L60
        L14a:
            r20 = r5
            if (r4 == 0) goto L14f
            goto L151
        L14f:
            r4 = r20
        L151:
            return r4
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityNodeInfoForItem(androidx.recyclerview.widget.RecyclerView.Recycler r8, androidx.recyclerview.widget.RecyclerView.State r9, android.view.View r10, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r11) {
            r7 = this;
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            boolean r1 = r0 instanceof androidx.recyclerview.widget.GridLayoutManager.LayoutParams
            if (r1 != 0) goto Lc
            super.onInitializeAccessibilityNodeInfoForItem(r10, r11)
            return
        Lc:
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r0 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r0
            int r10 = r0.getViewLayoutPosition()
            int r8 = r7.getSpanGroupIndex(r8, r9, r10)
            int r9 = r7.mOrientation
            if (r9 != 0) goto L2e
            int r1 = r0.getSpanIndex()
            int r2 = r0.getSpanSize()
            r4 = 1
            r5 = 0
            r6 = 0
            r3 = r8
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat r8 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(r1, r2, r3, r4, r5, r6)
            r11.setCollectionItemInfo(r8)
            goto L41
        L2e:
            r2 = 1
            int r3 = r0.getSpanIndex()
            int r4 = r0.getSpanSize()
            r5 = 0
            r6 = 0
            r1 = r8
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat r8 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(r1, r2, r3, r4, r5, r6)
            r11.setCollectionItemInfo(r8)
        L41:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(androidx.recyclerview.widget.RecyclerView r1, int r2, int r3) {
            r0 = this;
            androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup r1 = r0.mSpanSizeLookup
            r1.invalidateSpanIndexCache()
            androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup r1 = r0.mSpanSizeLookup
            r1.invalidateSpanGroupIndexCache()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsChanged(androidx.recyclerview.widget.RecyclerView r1) {
            r0 = this;
            androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup r1 = r0.mSpanSizeLookup
            r1.invalidateSpanIndexCache()
            androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup r1 = r0.mSpanSizeLookup
            r1.invalidateSpanGroupIndexCache()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsMoved(androidx.recyclerview.widget.RecyclerView r1, int r2, int r3, int r4) {
            r0 = this;
            androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup r1 = r0.mSpanSizeLookup
            r1.invalidateSpanIndexCache()
            androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup r1 = r0.mSpanSizeLookup
            r1.invalidateSpanGroupIndexCache()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(androidx.recyclerview.widget.RecyclerView r1, int r2, int r3) {
            r0 = this;
            androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup r1 = r0.mSpanSizeLookup
            r1.invalidateSpanIndexCache()
            androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup r1 = r0.mSpanSizeLookup
            r1.invalidateSpanGroupIndexCache()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(androidx.recyclerview.widget.RecyclerView r1, int r2, int r3, java.lang.Object r4) {
            r0 = this;
            androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup r1 = r0.mSpanSizeLookup
            r1.invalidateSpanIndexCache()
            androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup r1 = r0.mSpanSizeLookup
            r1.invalidateSpanGroupIndexCache()
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(androidx.recyclerview.widget.RecyclerView.Recycler r2, androidx.recyclerview.widget.RecyclerView.State r3) {
            r1 = this;
            boolean r0 = r3.isPreLayout()
            if (r0 == 0) goto L9
            r1.cachePreLayoutSpanMapping()
        L9:
            super.onLayoutChildren(r2, r3)
            r1.clearPreLayoutSpanMappingCache()
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(androidx.recyclerview.widget.RecyclerView.State r1) {
            r0 = this;
            super.onLayoutCompleted(r1)
            r1 = 0
            r0.mPendingSpanCountChange = r1
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int r1, androidx.recyclerview.widget.RecyclerView.Recycler r2, androidx.recyclerview.widget.RecyclerView.State r3) {
            r0 = this;
            r0.updateMeasurements()
            r0.ensureViewSet()
            int r1 = super.scrollHorizontallyBy(r1, r2, r3)
            return r1
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int r1, androidx.recyclerview.widget.RecyclerView.Recycler r2, androidx.recyclerview.widget.RecyclerView.State r3) {
            r0 = this;
            r0.updateMeasurements()
            r0.ensureViewSet()
            int r1 = super.scrollVerticallyBy(r1, r2, r3)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void setMeasuredDimension(android.graphics.Rect r5, int r6, int r7) {
            r4 = this;
            int[] r0 = r4.mCachedBorders
            if (r0 != 0) goto L7
            super.setMeasuredDimension(r5, r6, r7)
        L7:
            int r0 = r4.getPaddingLeft()
            int r1 = r4.getPaddingRight()
            int r0 = r0 + r1
            int r1 = r4.getPaddingTop()
            int r2 = r4.getPaddingBottom()
            int r1 = r1 + r2
            int r2 = r4.mOrientation
            r3 = 1
            if (r2 != r3) goto L3b
            int r5 = r5.height()
            int r5 = r5 + r1
            int r1 = r4.getMinimumHeight()
            int r5 = chooseSize(r7, r5, r1)
            int[] r7 = r4.mCachedBorders
            int r1 = r7.length
            int r1 = r1 - r3
            r7 = r7[r1]
            int r7 = r7 + r0
            int r0 = r4.getMinimumWidth()
            int r6 = chooseSize(r6, r7, r0)
            goto L57
        L3b:
            int r5 = r5.width()
            int r5 = r5 + r0
            int r0 = r4.getMinimumWidth()
            int r6 = chooseSize(r6, r5, r0)
            int[] r5 = r4.mCachedBorders
            int r0 = r5.length
            int r0 = r0 - r3
            r5 = r5[r0]
            int r5 = r5 + r1
            int r0 = r4.getMinimumHeight()
            int r5 = chooseSize(r7, r5, r0)
        L57:
            r4.setMeasuredDimension(r6, r5)
            return
    }

    public void setSpanCount(int r4) {
            r3 = this;
            int r0 = r3.mSpanCount
            if (r4 != r0) goto L5
            return
        L5:
            r0 = 1
            r3.mPendingSpanCountChange = r0
            if (r4 < r0) goto L15
            r3.mSpanCount = r4
            androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup r4 = r3.mSpanSizeLookup
            r4.invalidateSpanIndexCache()
            r3.requestLayout()
            return
        L15:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Span count should be at least 1. Provided "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    public void setSpanSizeLookup(androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup r1) {
            r0 = this;
            r0.mSpanSizeLookup = r1
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void setStackFromEnd(boolean r2) {
            r1 = this;
            if (r2 != 0) goto L7
            r2 = 0
            super.setStackFromEnd(r2)
            return
        L7:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "GridLayoutManager does not support stack from end. Consider using reverse layout"
            r2.<init>(r0)
            throw r2
    }

    public void setUsingSpansToEstimateScrollbarDimensions(boolean r1) {
            r0 = this;
            r0.mUsingSpansToEstimateScrollBarDimensions = r1
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
            r1 = this;
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r0 = r1.mPendingSavedState
            if (r0 != 0) goto La
            boolean r0 = r1.mPendingSpanCountChange
            if (r0 != 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }
}
