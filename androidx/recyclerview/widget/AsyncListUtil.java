package androidx.recyclerview.widget;

/* loaded from: classes.dex */
public class AsyncListUtil<T> {
    static final boolean DEBUG = false;
    static final java.lang.String TAG = "AsyncListUtil";
    boolean mAllowScrollHints;
    private final androidx.recyclerview.widget.ThreadUtil.BackgroundCallback<T> mBackgroundCallback;
    final androidx.recyclerview.widget.ThreadUtil.BackgroundCallback<T> mBackgroundProxy;
    final androidx.recyclerview.widget.AsyncListUtil.DataCallback<T> mDataCallback;
    int mDisplayedGeneration;
    int mItemCount;
    private final androidx.recyclerview.widget.ThreadUtil.MainThreadCallback<T> mMainThreadCallback;
    final androidx.recyclerview.widget.ThreadUtil.MainThreadCallback<T> mMainThreadProxy;
    final android.util.SparseIntArray mMissingPositions;
    final int[] mPrevRange;
    int mRequestedGeneration;
    private int mScrollHint;
    final java.lang.Class<T> mTClass;
    final androidx.recyclerview.widget.TileList<T> mTileList;
    final int mTileSize;
    final int[] mTmpRange;
    final int[] mTmpRangeExtended;
    final androidx.recyclerview.widget.AsyncListUtil.ViewCallback mViewCallback;



    public static abstract class DataCallback<T> {
        public DataCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract void fillData(T[] r1, int r2, int r3);

        public int getMaxCachedTiles() {
                r1 = this;
                r0 = 10
                return r0
        }

        public void recycleData(T[] r1, int r2) {
                r0 = this;
                return
        }

        public abstract int refreshData();
    }

    public static abstract class ViewCallback {
        public static final int HINT_SCROLL_ASC = 2;
        public static final int HINT_SCROLL_DESC = 1;
        public static final int HINT_SCROLL_NONE = 0;

        public ViewCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        public void extendRangeInto(int[] r7, int[] r8, int r9) {
                r6 = this;
                r0 = 1
                r1 = r7[r0]
                r2 = 0
                r7 = r7[r2]
                int r3 = r1 - r7
                int r3 = r3 + r0
                int r4 = r3 / 2
                if (r9 != r0) goto Lf
                r5 = r3
                goto L10
            Lf:
                r5 = r4
            L10:
                int r7 = r7 - r5
                r8[r2] = r7
                r7 = 2
                if (r9 != r7) goto L17
                goto L18
            L17:
                r3 = r4
            L18:
                int r1 = r1 + r3
                r8[r0] = r1
                return
        }

        public abstract void getItemRangeInto(int[] r1);

        public abstract void onDataRefresh();

        public abstract void onItemLoaded(int r1);
    }

    public AsyncListUtil(java.lang.Class<T> r3, int r4, androidx.recyclerview.widget.AsyncListUtil.DataCallback<T> r5, androidx.recyclerview.widget.AsyncListUtil.ViewCallback r6) {
            r2 = this;
            r2.<init>()
            r0 = 2
            int[] r1 = new int[r0]
            r2.mTmpRange = r1
            int[] r1 = new int[r0]
            r2.mPrevRange = r1
            int[] r0 = new int[r0]
            r2.mTmpRangeExtended = r0
            r0 = 0
            r2.mScrollHint = r0
            r2.mItemCount = r0
            r2.mDisplayedGeneration = r0
            r2.mRequestedGeneration = r0
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            r2.mMissingPositions = r0
            androidx.recyclerview.widget.AsyncListUtil$1 r0 = new androidx.recyclerview.widget.AsyncListUtil$1
            r0.<init>(r2)
            r2.mMainThreadCallback = r0
            androidx.recyclerview.widget.AsyncListUtil$2 r1 = new androidx.recyclerview.widget.AsyncListUtil$2
            r1.<init>(r2)
            r2.mBackgroundCallback = r1
            r2.mTClass = r3
            r2.mTileSize = r4
            r2.mDataCallback = r5
            r2.mViewCallback = r6
            androidx.recyclerview.widget.TileList r3 = new androidx.recyclerview.widget.TileList
            r3.<init>(r4)
            r2.mTileList = r3
            androidx.recyclerview.widget.MessageThreadUtil r3 = new androidx.recyclerview.widget.MessageThreadUtil
            r3.<init>()
            androidx.recyclerview.widget.ThreadUtil$MainThreadCallback r4 = r3.getMainThreadProxy(r0)
            r2.mMainThreadProxy = r4
            androidx.recyclerview.widget.ThreadUtil$BackgroundCallback r3 = r3.getBackgroundProxy(r1)
            r2.mBackgroundProxy = r3
            r2.refresh()
            return
    }

    private boolean isRefreshPending() {
            r2 = this;
            int r0 = r2.mRequestedGeneration
            int r1 = r2.mDisplayedGeneration
            if (r0 == r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public T getItem(int r4) {
            r3 = this;
            if (r4 < 0) goto L1b
            int r0 = r3.mItemCount
            if (r4 >= r0) goto L1b
            androidx.recyclerview.widget.TileList<T> r0 = r3.mTileList
            java.lang.Object r0 = r0.getItemAt(r4)
            if (r0 != 0) goto L1a
            boolean r1 = r3.isRefreshPending()
            if (r1 != 0) goto L1a
            android.util.SparseIntArray r1 = r3.mMissingPositions
            r2 = 0
            r1.put(r4, r2)
        L1a:
            return r0
        L1b:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = " is not within 0 and "
            java.lang.StringBuilder r4 = r4.append(r1)
            int r1 = r3.mItemCount
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    public int getItemCount() {
            r1 = this;
            int r0 = r1.mItemCount
            return r0
    }

    void log(java.lang.String r3, java.lang.Object... r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[MAIN] "
            r0.<init>(r1)
            java.lang.String r3 = java.lang.String.format(r3, r4)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "AsyncListUtil"
            android.util.Log.d(r4, r3)
            return
    }

    public void onRangeChanged() {
            r1 = this;
            boolean r0 = r1.isRefreshPending()
            if (r0 == 0) goto L7
            return
        L7:
            r1.updateRange()
            r0 = 1
            r1.mAllowScrollHints = r0
            return
    }

    public void refresh() {
            r2 = this;
            android.util.SparseIntArray r0 = r2.mMissingPositions
            r0.clear()
            androidx.recyclerview.widget.ThreadUtil$BackgroundCallback<T> r0 = r2.mBackgroundProxy
            int r1 = r2.mRequestedGeneration
            int r1 = r1 + 1
            r2.mRequestedGeneration = r1
            r0.refresh(r1)
            return
    }

    void updateRange() {
            r10 = this;
            androidx.recyclerview.widget.AsyncListUtil$ViewCallback r0 = r10.mViewCallback
            int[] r1 = r10.mTmpRange
            r0.getItemRangeInto(r1)
            int[] r0 = r10.mTmpRange
            r1 = 0
            r2 = r0[r1]
            r3 = 1
            r4 = r0[r3]
            if (r2 > r4) goto L81
            if (r2 >= 0) goto L14
            goto L81
        L14:
            int r5 = r10.mItemCount
            if (r4 < r5) goto L19
            return
        L19:
            boolean r5 = r10.mAllowScrollHints
            if (r5 != 0) goto L20
            r10.mScrollHint = r1
            goto L38
        L20:
            int[] r5 = r10.mPrevRange
            r6 = r5[r3]
            if (r2 > r6) goto L36
            r5 = r5[r1]
            if (r5 <= r4) goto L2b
            goto L36
        L2b:
            if (r2 >= r5) goto L30
            r10.mScrollHint = r3
            goto L38
        L30:
            if (r2 <= r5) goto L38
            r5 = 2
            r10.mScrollHint = r5
            goto L38
        L36:
            r10.mScrollHint = r1
        L38:
            int[] r5 = r10.mPrevRange
            r5[r1] = r2
            r5[r3] = r4
            androidx.recyclerview.widget.AsyncListUtil$ViewCallback r2 = r10.mViewCallback
            int[] r4 = r10.mTmpRangeExtended
            int r5 = r10.mScrollHint
            r2.extendRangeInto(r0, r4, r5)
            int[] r0 = r10.mTmpRangeExtended
            int[] r2 = r10.mTmpRange
            r2 = r2[r1]
            r4 = r0[r1]
            int r4 = java.lang.Math.max(r4, r1)
            int r2 = java.lang.Math.min(r2, r4)
            r0[r1] = r2
            int[] r0 = r10.mTmpRangeExtended
            int[] r2 = r10.mTmpRange
            r2 = r2[r3]
            r4 = r0[r3]
            int r5 = r10.mItemCount
            int r5 = r5 - r3
            int r4 = java.lang.Math.min(r4, r5)
            int r2 = java.lang.Math.max(r2, r4)
            r0[r3] = r2
            androidx.recyclerview.widget.ThreadUtil$BackgroundCallback<T> r4 = r10.mBackgroundProxy
            int[] r0 = r10.mTmpRange
            r5 = r0[r1]
            r6 = r0[r3]
            int[] r0 = r10.mTmpRangeExtended
            r7 = r0[r1]
            r8 = r0[r3]
            int r9 = r10.mScrollHint
            r4.updateRange(r5, r6, r7, r8, r9)
        L81:
            return
    }
}
