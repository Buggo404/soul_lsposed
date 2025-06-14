package androidx.recyclerview.widget;

/* loaded from: classes.dex */
class LayoutState {
    static final int INVALID_LAYOUT = Integer.MIN_VALUE;
    static final int ITEM_DIRECTION_HEAD = -1;
    static final int ITEM_DIRECTION_TAIL = 1;
    static final int LAYOUT_END = 1;
    static final int LAYOUT_START = -1;
    int mAvailable;
    int mCurrentPosition;
    int mEndLine;
    boolean mInfinite;
    int mItemDirection;
    int mLayoutDirection;
    boolean mRecycle;
    int mStartLine;
    boolean mStopInFocusable;

    LayoutState() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.mRecycle = r0
            r0 = 0
            r1.mStartLine = r0
            r1.mEndLine = r0
            return
    }

    boolean hasMore(androidx.recyclerview.widget.RecyclerView.State r2) {
            r1 = this;
            int r0 = r1.mCurrentPosition
            if (r0 < 0) goto Lc
            int r2 = r2.getItemCount()
            if (r0 >= r2) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            return r2
    }

    android.view.View next(androidx.recyclerview.widget.RecyclerView.Recycler r3) {
            r2 = this;
            int r0 = r2.mCurrentPosition
            android.view.View r3 = r3.getViewForPosition(r0)
            int r0 = r2.mCurrentPosition
            int r1 = r2.mItemDirection
            int r0 = r0 + r1
            r2.mCurrentPosition = r0
            return r3
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LayoutState{mAvailable="
            r0.<init>(r1)
            int r1 = r2.mAvailable
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", mCurrentPosition="
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r2.mCurrentPosition
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", mItemDirection="
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r2.mItemDirection
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", mLayoutDirection="
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r2.mLayoutDirection
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", mStartLine="
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r2.mStartLine
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", mEndLine="
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r2.mEndLine
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
