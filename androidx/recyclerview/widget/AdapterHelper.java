package androidx.recyclerview.widget;

/* loaded from: classes.dex */
class AdapterHelper implements androidx.recyclerview.widget.OpReorderer.Callback {
    private static final boolean DEBUG = false;
    static final int POSITION_TYPE_INVISIBLE = 0;
    static final int POSITION_TYPE_NEW_OR_LAID_OUT = 1;
    private static final java.lang.String TAG = "AHT";
    final androidx.recyclerview.widget.AdapterHelper.Callback mCallback;
    final boolean mDisableRecycler;
    private int mExistingUpdateTypes;
    java.lang.Runnable mOnItemProcessedCallback;
    final androidx.recyclerview.widget.OpReorderer mOpReorderer;
    final java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper.UpdateOp> mPendingUpdates;
    final java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper.UpdateOp> mPostponedList;
    private androidx.core.util.Pools.Pool<androidx.recyclerview.widget.AdapterHelper.UpdateOp> mUpdateOpPool;

    interface Callback {
        androidx.recyclerview.widget.RecyclerView.ViewHolder findViewHolder(int r1);

        void markViewHoldersUpdated(int r1, int r2, java.lang.Object r3);

        void offsetPositionsForAdd(int r1, int r2);

        void offsetPositionsForMove(int r1, int r2);

        void offsetPositionsForRemovingInvisible(int r1, int r2);

        void offsetPositionsForRemovingLaidOutOrNewView(int r1, int r2);

        void onDispatchFirstPass(androidx.recyclerview.widget.AdapterHelper.UpdateOp r1);

        void onDispatchSecondPass(androidx.recyclerview.widget.AdapterHelper.UpdateOp r1);
    }

    static class UpdateOp {
        static final int ADD = 1;
        static final int MOVE = 8;
        static final int POOL_SIZE = 30;
        static final int REMOVE = 2;
        static final int UPDATE = 4;
        int cmd;
        int itemCount;
        java.lang.Object payload;
        int positionStart;

        UpdateOp(int r1, int r2, int r3, java.lang.Object r4) {
                r0 = this;
                r0.<init>()
                r0.cmd = r1
                r0.positionStart = r2
                r0.itemCount = r3
                r0.payload = r4
                return
        }

        java.lang.String cmdToString() {
                r2 = this;
                int r0 = r2.cmd
                r1 = 1
                if (r0 == r1) goto L1b
                r1 = 2
                if (r0 == r1) goto L18
                r1 = 4
                if (r0 == r1) goto L15
                r1 = 8
                if (r0 == r1) goto L12
                java.lang.String r0 = "??"
                return r0
            L12:
                java.lang.String r0 = "mv"
                return r0
            L15:
                java.lang.String r0 = "up"
                return r0
            L18:
                java.lang.String r0 = "rm"
                return r0
            L1b:
                java.lang.String r0 = "add"
                return r0
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 == 0) goto L58
                java.lang.Class r2 = r4.getClass()
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L12
                goto L58
            L12:
                androidx.recyclerview.widget.AdapterHelper$UpdateOp r5 = (androidx.recyclerview.widget.AdapterHelper.UpdateOp) r5
                int r2 = r4.cmd
                int r3 = r5.cmd
                if (r2 == r3) goto L1b
                return r1
            L1b:
                r3 = 8
                if (r2 != r3) goto L37
                int r2 = r4.itemCount
                int r3 = r4.positionStart
                int r2 = r2 - r3
                int r2 = java.lang.Math.abs(r2)
                if (r2 != r0) goto L37
                int r2 = r4.itemCount
                int r3 = r5.positionStart
                if (r2 != r3) goto L37
                int r2 = r4.positionStart
                int r3 = r5.itemCount
                if (r2 != r3) goto L37
                return r0
            L37:
                int r2 = r4.itemCount
                int r3 = r5.itemCount
                if (r2 == r3) goto L3e
                return r1
            L3e:
                int r2 = r4.positionStart
                int r3 = r5.positionStart
                if (r2 == r3) goto L45
                return r1
            L45:
                java.lang.Object r2 = r4.payload
                if (r2 == 0) goto L52
                java.lang.Object r5 = r5.payload
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L57
                return r1
            L52:
                java.lang.Object r5 = r5.payload
                if (r5 == 0) goto L57
                return r1
            L57:
                return r0
            L58:
                return r1
        }

        public int hashCode() {
                r2 = this;
                int r0 = r2.cmd
                int r0 = r0 * 31
                int r1 = r2.positionStart
                int r0 = r0 + r1
                int r0 = r0 * 31
                int r1 = r2.itemCount
                int r0 = r0 + r1
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                int r1 = java.lang.System.identityHashCode(r2)
                java.lang.String r1 = java.lang.Integer.toHexString(r1)
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "["
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = r2.cmdToString()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ",s:"
                java.lang.StringBuilder r0 = r0.append(r1)
                int r1 = r2.positionStart
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "c:"
                java.lang.StringBuilder r0 = r0.append(r1)
                int r1 = r2.itemCount
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ",p:"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.Object r1 = r2.payload
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "]"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    AdapterHelper(androidx.recyclerview.widget.AdapterHelper.Callback r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    AdapterHelper(androidx.recyclerview.widget.AdapterHelper.Callback r3, boolean r4) {
            r2 = this;
            r2.<init>()
            androidx.core.util.Pools$SimplePool r0 = new androidx.core.util.Pools$SimplePool
            r1 = 30
            r0.<init>(r1)
            r2.mUpdateOpPool = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.mPendingUpdates = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.mPostponedList = r0
            r0 = 0
            r2.mExistingUpdateTypes = r0
            r2.mCallback = r3
            r2.mDisableRecycler = r4
            androidx.recyclerview.widget.OpReorderer r3 = new androidx.recyclerview.widget.OpReorderer
            r3.<init>(r2)
            r2.mOpReorderer = r3
            return
    }

    private void applyAdd(androidx.recyclerview.widget.AdapterHelper.UpdateOp r1) {
            r0 = this;
            r0.postponeAndUpdateViewHolders(r1)
            return
    }

    private void applyMove(androidx.recyclerview.widget.AdapterHelper.UpdateOp r1) {
            r0 = this;
            r0.postponeAndUpdateViewHolders(r1)
            return
    }

    private void applyRemove(androidx.recyclerview.widget.AdapterHelper.UpdateOp r11) {
            r10 = this;
            int r0 = r11.positionStart
            int r1 = r11.positionStart
            int r2 = r11.itemCount
            int r1 = r1 + r2
            int r2 = r11.positionStart
            r3 = 0
            r4 = -1
            r5 = r3
        Lc:
            r6 = 0
            r7 = 2
            if (r2 >= r1) goto L46
            androidx.recyclerview.widget.AdapterHelper$Callback r8 = r10.mCallback
            androidx.recyclerview.widget.RecyclerView$ViewHolder r8 = r8.findViewHolder(r2)
            r9 = 1
            if (r8 != 0) goto L2e
            boolean r8 = r10.canFindInPreLayout(r2)
            if (r8 == 0) goto L20
            goto L2e
        L20:
            if (r4 != r9) goto L2b
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r4 = r10.obtainUpdateOp(r7, r0, r5, r6)
            r10.postponeAndUpdateViewHolders(r4)
            r4 = r9
            goto L2c
        L2b:
            r4 = r3
        L2c:
            r6 = r3
            goto L3b
        L2e:
            if (r4 != 0) goto L39
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r4 = r10.obtainUpdateOp(r7, r0, r5, r6)
            r10.dispatchAndUpdateViewHolders(r4)
            r4 = r9
            goto L3a
        L39:
            r4 = r3
        L3a:
            r6 = r9
        L3b:
            if (r4 == 0) goto L41
            int r2 = r2 - r5
            int r1 = r1 - r5
            r5 = r9
            goto L43
        L41:
            int r5 = r5 + 1
        L43:
            int r2 = r2 + r9
            r4 = r6
            goto Lc
        L46:
            int r1 = r11.itemCount
            if (r5 == r1) goto L51
            r10.recycleUpdateOp(r11)
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r11 = r10.obtainUpdateOp(r7, r0, r5, r6)
        L51:
            if (r4 != 0) goto L57
            r10.dispatchAndUpdateViewHolders(r11)
            goto L5a
        L57:
            r10.postponeAndUpdateViewHolders(r11)
        L5a:
            return
    }

    private void applyUpdate(androidx.recyclerview.widget.AdapterHelper.UpdateOp r10) {
            r9 = this;
            int r0 = r10.positionStart
            int r1 = r10.positionStart
            int r2 = r10.itemCount
            int r1 = r1 + r2
            int r2 = r10.positionStart
            r3 = 0
            r4 = -1
            r5 = r3
        Lc:
            r6 = 4
            if (r2 >= r1) goto L40
            androidx.recyclerview.widget.AdapterHelper$Callback r7 = r9.mCallback
            androidx.recyclerview.widget.RecyclerView$ViewHolder r7 = r7.findViewHolder(r2)
            r8 = 1
            if (r7 != 0) goto L2e
            boolean r7 = r9.canFindInPreLayout(r2)
            if (r7 == 0) goto L1f
            goto L2e
        L1f:
            if (r4 != r8) goto L2c
            java.lang.Object r4 = r10.payload
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r0 = r9.obtainUpdateOp(r6, r0, r5, r4)
            r9.postponeAndUpdateViewHolders(r0)
            r0 = r2
            r5 = r3
        L2c:
            r4 = r3
            goto L3c
        L2e:
            if (r4 != 0) goto L3b
            java.lang.Object r4 = r10.payload
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r0 = r9.obtainUpdateOp(r6, r0, r5, r4)
            r9.dispatchAndUpdateViewHolders(r0)
            r0 = r2
            r5 = r3
        L3b:
            r4 = r8
        L3c:
            int r5 = r5 + r8
            int r2 = r2 + 1
            goto Lc
        L40:
            int r1 = r10.itemCount
            if (r5 == r1) goto L4d
            java.lang.Object r1 = r10.payload
            r9.recycleUpdateOp(r10)
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r10 = r9.obtainUpdateOp(r6, r0, r5, r1)
        L4d:
            if (r4 != 0) goto L53
            r9.dispatchAndUpdateViewHolders(r10)
            goto L56
        L53:
            r9.postponeAndUpdateViewHolders(r10)
        L56:
            return
    }

    private boolean canFindInPreLayout(int r8) {
            r7 = this;
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r0 = r7.mPostponedList
            int r0 = r0.size()
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L40
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r3 = r7.mPostponedList
            java.lang.Object r3 = r3.get(r2)
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r3 = (androidx.recyclerview.widget.AdapterHelper.UpdateOp) r3
            int r4 = r3.cmd
            r5 = 8
            r6 = 1
            if (r4 != r5) goto L24
            int r3 = r3.itemCount
            int r4 = r2 + 1
            int r3 = r7.findPositionOffset(r3, r4)
            if (r3 != r8) goto L3d
            return r6
        L24:
            int r4 = r3.cmd
            if (r4 != r6) goto L3d
            int r4 = r3.positionStart
            int r5 = r3.itemCount
            int r4 = r4 + r5
            int r3 = r3.positionStart
        L2f:
            if (r3 >= r4) goto L3d
            int r5 = r2 + 1
            int r5 = r7.findPositionOffset(r3, r5)
            if (r5 != r8) goto L3a
            return r6
        L3a:
            int r3 = r3 + 1
            goto L2f
        L3d:
            int r2 = r2 + 1
            goto L8
        L40:
            return r1
    }

    private void dispatchAndUpdateViewHolders(androidx.recyclerview.widget.AdapterHelper.UpdateOp r13) {
            r12 = this;
            int r0 = r13.cmd
            r1 = 1
            if (r0 == r1) goto L89
            int r0 = r13.cmd
            r2 = 8
            if (r0 == r2) goto L89
            int r0 = r13.positionStart
            int r2 = r13.cmd
            int r0 = r12.updatePositionWithPostponed(r0, r2)
            int r2 = r13.positionStart
            int r3 = r13.cmd
            r4 = 2
            r5 = 4
            r6 = 0
            if (r3 == r4) goto L35
            if (r3 != r5) goto L20
            r3 = r1
            goto L36
        L20:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "op should be remove or update."
            r1.<init>(r2)
            java.lang.StringBuilder r13 = r1.append(r13)
            java.lang.String r13 = r13.toString()
            r0.<init>(r13)
            throw r0
        L35:
            r3 = r6
        L36:
            r7 = r1
            r8 = r7
        L38:
            int r9 = r13.itemCount
            if (r7 >= r9) goto L75
            int r9 = r13.positionStart
            int r10 = r3 * r7
            int r9 = r9 + r10
            int r10 = r13.cmd
            int r9 = r12.updatePositionWithPostponed(r9, r10)
            int r10 = r13.cmd
            if (r10 == r4) goto L55
            if (r10 == r5) goto L4f
        L4d:
            r10 = r6
            goto L58
        L4f:
            int r10 = r0 + 1
            if (r9 != r10) goto L4d
        L53:
            r10 = r1
            goto L58
        L55:
            if (r9 != r0) goto L4d
            goto L53
        L58:
            if (r10 == 0) goto L5d
            int r8 = r8 + 1
            goto L72
        L5d:
            int r10 = r13.cmd
            java.lang.Object r11 = r13.payload
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r0 = r12.obtainUpdateOp(r10, r0, r8, r11)
            r12.dispatchFirstPassAndUpdateViewHolders(r0, r2)
            r12.recycleUpdateOp(r0)
            int r0 = r13.cmd
            if (r0 != r5) goto L70
            int r2 = r2 + r8
        L70:
            r8 = r1
            r0 = r9
        L72:
            int r7 = r7 + 1
            goto L38
        L75:
            java.lang.Object r1 = r13.payload
            r12.recycleUpdateOp(r13)
            if (r8 <= 0) goto L88
            int r13 = r13.cmd
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r13 = r12.obtainUpdateOp(r13, r0, r8, r1)
            r12.dispatchFirstPassAndUpdateViewHolders(r13, r2)
            r12.recycleUpdateOp(r13)
        L88:
            return
        L89:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "should not dispatch add or move for pre layout"
            r13.<init>(r0)
            throw r13
    }

    private void postponeAndUpdateViewHolders(androidx.recyclerview.widget.AdapterHelper.UpdateOp r4) {
            r3 = this;
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r0 = r3.mPostponedList
            r0.add(r4)
            int r0 = r4.cmd
            r1 = 1
            if (r0 == r1) goto L49
            r1 = 2
            if (r0 == r1) goto L3f
            r1 = 4
            if (r0 == r1) goto L33
            r1 = 8
            if (r0 != r1) goto L1e
            androidx.recyclerview.widget.AdapterHelper$Callback r0 = r3.mCallback
            int r1 = r4.positionStart
            int r4 = r4.itemCount
            r0.offsetPositionsForMove(r1, r4)
            goto L52
        L1e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown update op type for "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L33:
            androidx.recyclerview.widget.AdapterHelper$Callback r0 = r3.mCallback
            int r1 = r4.positionStart
            int r2 = r4.itemCount
            java.lang.Object r4 = r4.payload
            r0.markViewHoldersUpdated(r1, r2, r4)
            goto L52
        L3f:
            androidx.recyclerview.widget.AdapterHelper$Callback r0 = r3.mCallback
            int r1 = r4.positionStart
            int r4 = r4.itemCount
            r0.offsetPositionsForRemovingLaidOutOrNewView(r1, r4)
            goto L52
        L49:
            androidx.recyclerview.widget.AdapterHelper$Callback r0 = r3.mCallback
            int r1 = r4.positionStart
            int r4 = r4.itemCount
            r0.offsetPositionsForAdd(r1, r4)
        L52:
            return
    }

    private int updatePositionWithPostponed(int r7, int r8) {
            r6 = this;
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r0 = r6.mPostponedList
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            r2 = 8
            if (r0 < 0) goto L99
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r3 = r6.mPostponedList
            java.lang.Object r3 = r3.get(r0)
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r3 = (androidx.recyclerview.widget.AdapterHelper.UpdateOp) r3
            int r4 = r3.cmd
            r5 = 2
            if (r4 != r2) goto L72
            int r2 = r3.positionStart
            int r4 = r3.itemCount
            if (r2 >= r4) goto L24
            int r2 = r3.positionStart
            int r4 = r3.itemCount
            goto L28
        L24:
            int r2 = r3.itemCount
            int r4 = r3.positionStart
        L28:
            if (r7 < r2) goto L54
            if (r7 > r4) goto L54
            int r4 = r3.positionStart
            if (r2 != r4) goto L42
            if (r8 != r1) goto L38
            int r2 = r3.itemCount
            int r2 = r2 + r1
            r3.itemCount = r2
            goto L3f
        L38:
            if (r8 != r5) goto L3f
            int r2 = r3.itemCount
            int r2 = r2 - r1
            r3.itemCount = r2
        L3f:
            int r7 = r7 + 1
            goto L95
        L42:
            if (r8 != r1) goto L4a
            int r2 = r3.positionStart
            int r2 = r2 + r1
            r3.positionStart = r2
            goto L51
        L4a:
            if (r8 != r5) goto L51
            int r2 = r3.positionStart
            int r2 = r2 - r1
            r3.positionStart = r2
        L51:
            int r7 = r7 + (-1)
            goto L95
        L54:
            int r2 = r3.positionStart
            if (r7 >= r2) goto L95
            if (r8 != r1) goto L65
            int r2 = r3.positionStart
            int r2 = r2 + r1
            r3.positionStart = r2
            int r2 = r3.itemCount
            int r2 = r2 + r1
            r3.itemCount = r2
            goto L95
        L65:
            if (r8 != r5) goto L95
            int r2 = r3.positionStart
            int r2 = r2 - r1
            r3.positionStart = r2
            int r2 = r3.itemCount
            int r2 = r2 - r1
            r3.itemCount = r2
            goto L95
        L72:
            int r2 = r3.positionStart
            if (r2 > r7) goto L86
            int r2 = r3.cmd
            if (r2 != r1) goto L7e
            int r2 = r3.itemCount
            int r7 = r7 - r2
            goto L95
        L7e:
            int r2 = r3.cmd
            if (r2 != r5) goto L95
            int r2 = r3.itemCount
            int r7 = r7 + r2
            goto L95
        L86:
            if (r8 != r1) goto L8e
            int r2 = r3.positionStart
            int r2 = r2 + r1
            r3.positionStart = r2
            goto L95
        L8e:
            if (r8 != r5) goto L95
            int r2 = r3.positionStart
            int r2 = r2 - r1
            r3.positionStart = r2
        L95:
            int r0 = r0 + (-1)
            goto L8
        L99:
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r8 = r6.mPostponedList
            int r8 = r8.size()
            int r8 = r8 - r1
        La0:
            if (r8 < 0) goto Ld0
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r0 = r6.mPostponedList
            java.lang.Object r0 = r0.get(r8)
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r0 = (androidx.recyclerview.widget.AdapterHelper.UpdateOp) r0
            int r1 = r0.cmd
            if (r1 != r2) goto Lc1
            int r1 = r0.itemCount
            int r3 = r0.positionStart
            if (r1 == r3) goto Lb8
            int r1 = r0.itemCount
            if (r1 >= 0) goto Lcd
        Lb8:
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r1 = r6.mPostponedList
            r1.remove(r8)
            r6.recycleUpdateOp(r0)
            goto Lcd
        Lc1:
            int r1 = r0.itemCount
            if (r1 > 0) goto Lcd
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r1 = r6.mPostponedList
            r1.remove(r8)
            r6.recycleUpdateOp(r0)
        Lcd:
            int r8 = r8 + (-1)
            goto La0
        Ld0:
            return r7
    }

    androidx.recyclerview.widget.AdapterHelper addUpdateOp(androidx.recyclerview.widget.AdapterHelper.UpdateOp... r2) {
            r1 = this;
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r0 = r1.mPendingUpdates
            java.util.Collections.addAll(r0, r2)
            return r1
    }

    public int applyPendingUpdatesToPosition(int r6) {
            r5 = this;
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r0 = r5.mPendingUpdates
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L4d
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r2 = r5.mPendingUpdates
            java.lang.Object r2 = r2.get(r1)
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r2 = (androidx.recyclerview.widget.AdapterHelper.UpdateOp) r2
            int r3 = r2.cmd
            r4 = 1
            if (r3 == r4) goto L43
            r4 = 2
            if (r3 == r4) goto L32
            r4 = 8
            if (r3 == r4) goto L1e
            goto L4a
        L1e:
            int r3 = r2.positionStart
            if (r3 != r6) goto L25
            int r6 = r2.itemCount
            goto L4a
        L25:
            int r3 = r2.positionStart
            if (r3 >= r6) goto L2b
            int r6 = r6 + (-1)
        L2b:
            int r2 = r2.itemCount
            if (r2 > r6) goto L4a
            int r6 = r6 + 1
            goto L4a
        L32:
            int r3 = r2.positionStart
            if (r3 > r6) goto L4a
            int r3 = r2.positionStart
            int r4 = r2.itemCount
            int r3 = r3 + r4
            if (r3 <= r6) goto L3f
            r6 = -1
            return r6
        L3f:
            int r2 = r2.itemCount
            int r6 = r6 - r2
            goto L4a
        L43:
            int r3 = r2.positionStart
            if (r3 > r6) goto L4a
            int r2 = r2.itemCount
            int r6 = r6 + r2
        L4a:
            int r1 = r1 + 1
            goto L7
        L4d:
            return r6
    }

    void consumePostponedUpdates() {
            r5 = this;
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r0 = r5.mPostponedList
            int r0 = r0.size()
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L1a
            androidx.recyclerview.widget.AdapterHelper$Callback r3 = r5.mCallback
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r4 = r5.mPostponedList
            java.lang.Object r4 = r4.get(r2)
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r4 = (androidx.recyclerview.widget.AdapterHelper.UpdateOp) r4
            r3.onDispatchSecondPass(r4)
            int r2 = r2 + 1
            goto L8
        L1a:
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r0 = r5.mPostponedList
            r5.recycleUpdateOpsAndClearList(r0)
            r5.mExistingUpdateTypes = r1
            return
    }

    void consumeUpdatesInOnePass() {
            r7 = this;
            r7.consumePostponedUpdates()
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r0 = r7.mPendingUpdates
            int r0 = r0.size()
            r1 = 0
            r2 = r1
        Lb:
            if (r2 >= r0) goto L6c
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r3 = r7.mPendingUpdates
            java.lang.Object r3 = r3.get(r2)
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r3 = (androidx.recyclerview.widget.AdapterHelper.UpdateOp) r3
            int r4 = r3.cmd
            r5 = 1
            if (r4 == r5) goto L54
            r5 = 2
            if (r4 == r5) goto L45
            r5 = 4
            if (r4 == r5) goto L34
            r5 = 8
            if (r4 == r5) goto L25
            goto L62
        L25:
            androidx.recyclerview.widget.AdapterHelper$Callback r4 = r7.mCallback
            r4.onDispatchSecondPass(r3)
            androidx.recyclerview.widget.AdapterHelper$Callback r4 = r7.mCallback
            int r5 = r3.positionStart
            int r3 = r3.itemCount
            r4.offsetPositionsForMove(r5, r3)
            goto L62
        L34:
            androidx.recyclerview.widget.AdapterHelper$Callback r4 = r7.mCallback
            r4.onDispatchSecondPass(r3)
            androidx.recyclerview.widget.AdapterHelper$Callback r4 = r7.mCallback
            int r5 = r3.positionStart
            int r6 = r3.itemCount
            java.lang.Object r3 = r3.payload
            r4.markViewHoldersUpdated(r5, r6, r3)
            goto L62
        L45:
            androidx.recyclerview.widget.AdapterHelper$Callback r4 = r7.mCallback
            r4.onDispatchSecondPass(r3)
            androidx.recyclerview.widget.AdapterHelper$Callback r4 = r7.mCallback
            int r5 = r3.positionStart
            int r3 = r3.itemCount
            r4.offsetPositionsForRemovingInvisible(r5, r3)
            goto L62
        L54:
            androidx.recyclerview.widget.AdapterHelper$Callback r4 = r7.mCallback
            r4.onDispatchSecondPass(r3)
            androidx.recyclerview.widget.AdapterHelper$Callback r4 = r7.mCallback
            int r5 = r3.positionStart
            int r3 = r3.itemCount
            r4.offsetPositionsForAdd(r5, r3)
        L62:
            java.lang.Runnable r3 = r7.mOnItemProcessedCallback
            if (r3 == 0) goto L69
            r3.run()
        L69:
            int r2 = r2 + 1
            goto Lb
        L6c:
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r0 = r7.mPendingUpdates
            r7.recycleUpdateOpsAndClearList(r0)
            r7.mExistingUpdateTypes = r1
            return
    }

    void dispatchFirstPassAndUpdateViewHolders(androidx.recyclerview.widget.AdapterHelper.UpdateOp r3, int r4) {
            r2 = this;
            androidx.recyclerview.widget.AdapterHelper$Callback r0 = r2.mCallback
            r0.onDispatchFirstPass(r3)
            int r0 = r3.cmd
            r1 = 2
            if (r0 == r1) goto L1f
            r1 = 4
            if (r0 != r1) goto L17
            androidx.recyclerview.widget.AdapterHelper$Callback r0 = r2.mCallback
            int r1 = r3.itemCount
            java.lang.Object r3 = r3.payload
            r0.markViewHoldersUpdated(r4, r1, r3)
            goto L26
        L17:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "only remove and update ops can be dispatched in first pass"
            r3.<init>(r4)
            throw r3
        L1f:
            androidx.recyclerview.widget.AdapterHelper$Callback r0 = r2.mCallback
            int r3 = r3.itemCount
            r0.offsetPositionsForRemovingInvisible(r4, r3)
        L26:
            return
    }

    int findPositionOffset(int r2) {
            r1 = this;
            r0 = 0
            int r2 = r1.findPositionOffset(r2, r0)
            return r2
    }

    int findPositionOffset(int r5, int r6) {
            r4 = this;
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r0 = r4.mPostponedList
            int r0 = r0.size()
        L6:
            if (r6 >= r0) goto L4b
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r1 = r4.mPostponedList
            java.lang.Object r1 = r1.get(r6)
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r1 = (androidx.recyclerview.widget.AdapterHelper.UpdateOp) r1
            int r2 = r1.cmd
            r3 = 8
            if (r2 != r3) goto L2a
            int r2 = r1.positionStart
            if (r2 != r5) goto L1d
            int r5 = r1.itemCount
            goto L48
        L1d:
            int r2 = r1.positionStart
            if (r2 >= r5) goto L23
            int r5 = r5 + (-1)
        L23:
            int r1 = r1.itemCount
            if (r1 > r5) goto L48
            int r5 = r5 + 1
            goto L48
        L2a:
            int r2 = r1.positionStart
            if (r2 > r5) goto L48
            int r2 = r1.cmd
            r3 = 2
            if (r2 != r3) goto L40
            int r2 = r1.positionStart
            int r3 = r1.itemCount
            int r2 = r2 + r3
            if (r5 >= r2) goto L3c
            r5 = -1
            return r5
        L3c:
            int r1 = r1.itemCount
            int r5 = r5 - r1
            goto L48
        L40:
            int r2 = r1.cmd
            r3 = 1
            if (r2 != r3) goto L48
            int r1 = r1.itemCount
            int r5 = r5 + r1
        L48:
            int r6 = r6 + 1
            goto L6
        L4b:
            return r5
    }

    boolean hasAnyUpdateTypes(int r2) {
            r1 = this;
            int r0 = r1.mExistingUpdateTypes
            r2 = r2 & r0
            if (r2 == 0) goto L7
            r2 = 1
            goto L8
        L7:
            r2 = 0
        L8:
            return r2
    }

    boolean hasPendingUpdates() {
            r1 = this;
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r0 = r1.mPendingUpdates
            int r0 = r0.size()
            if (r0 <= 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    boolean hasUpdates() {
            r1 = this;
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r0 = r1.mPostponedList
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L12
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r0 = r1.mPendingUpdates
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    @Override // androidx.recyclerview.widget.OpReorderer.Callback
    public androidx.recyclerview.widget.AdapterHelper.UpdateOp obtainUpdateOp(int r2, int r3, int r4, java.lang.Object r5) {
            r1 = this;
            androidx.core.util.Pools$Pool<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r0 = r1.mUpdateOpPool
            java.lang.Object r0 = r0.acquire()
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r0 = (androidx.recyclerview.widget.AdapterHelper.UpdateOp) r0
            if (r0 != 0) goto L10
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r0 = new androidx.recyclerview.widget.AdapterHelper$UpdateOp
            r0.<init>(r2, r3, r4, r5)
            goto L18
        L10:
            r0.cmd = r2
            r0.positionStart = r3
            r0.itemCount = r4
            r0.payload = r5
        L18:
            return r0
    }

    boolean onItemRangeChanged(int r5, int r6, java.lang.Object r7) {
            r4 = this;
            r0 = 0
            r1 = 1
            if (r6 >= r1) goto L5
            return r0
        L5:
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r2 = r4.mPendingUpdates
            r3 = 4
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r5 = r4.obtainUpdateOp(r3, r5, r6, r7)
            r2.add(r5)
            int r5 = r4.mExistingUpdateTypes
            r5 = r5 | r3
            r4.mExistingUpdateTypes = r5
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r5 = r4.mPendingUpdates
            int r5 = r5.size()
            if (r5 != r1) goto L1d
            r0 = r1
        L1d:
            return r0
    }

    boolean onItemRangeInserted(int r5, int r6) {
            r4 = this;
            r0 = 0
            r1 = 1
            if (r6 >= r1) goto L5
            return r0
        L5:
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r2 = r4.mPendingUpdates
            r3 = 0
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r5 = r4.obtainUpdateOp(r1, r5, r6, r3)
            r2.add(r5)
            int r5 = r4.mExistingUpdateTypes
            r5 = r5 | r1
            r4.mExistingUpdateTypes = r5
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r5 = r4.mPendingUpdates
            int r5 = r5.size()
            if (r5 != r1) goto L1d
            r0 = r1
        L1d:
            return r0
    }

    boolean onItemRangeMoved(int r5, int r6, int r7) {
            r4 = this;
            r0 = 0
            if (r5 != r6) goto L4
            return r0
        L4:
            r1 = 1
            if (r7 != r1) goto L22
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r7 = r4.mPendingUpdates
            r2 = 0
            r3 = 8
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r5 = r4.obtainUpdateOp(r3, r5, r6, r2)
            r7.add(r5)
            int r5 = r4.mExistingUpdateTypes
            r5 = r5 | r3
            r4.mExistingUpdateTypes = r5
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r5 = r4.mPendingUpdates
            int r5 = r5.size()
            if (r5 != r1) goto L21
            r0 = r1
        L21:
            return r0
        L22:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Moving more than 1 item is not supported yet"
            r5.<init>(r6)
            throw r5
    }

    boolean onItemRangeRemoved(int r6, int r7) {
            r5 = this;
            r0 = 0
            r1 = 1
            if (r7 >= r1) goto L5
            return r0
        L5:
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r2 = r5.mPendingUpdates
            r3 = 0
            r4 = 2
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r6 = r5.obtainUpdateOp(r4, r6, r7, r3)
            r2.add(r6)
            int r6 = r5.mExistingUpdateTypes
            r6 = r6 | r4
            r5.mExistingUpdateTypes = r6
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r6 = r5.mPendingUpdates
            int r6 = r6.size()
            if (r6 != r1) goto L1e
            r0 = r1
        L1e:
            return r0
    }

    void preProcess() {
            r5 = this;
            androidx.recyclerview.widget.OpReorderer r0 = r5.mOpReorderer
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r1 = r5.mPendingUpdates
            r0.reorderOps(r1)
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r0 = r5.mPendingUpdates
            int r0 = r0.size()
            r1 = 0
        Le:
            if (r1 >= r0) goto L41
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r2 = r5.mPendingUpdates
            java.lang.Object r2 = r2.get(r1)
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r2 = (androidx.recyclerview.widget.AdapterHelper.UpdateOp) r2
            int r3 = r2.cmd
            r4 = 1
            if (r3 == r4) goto L34
            r4 = 2
            if (r3 == r4) goto L30
            r4 = 4
            if (r3 == r4) goto L2c
            r4 = 8
            if (r3 == r4) goto L28
            goto L37
        L28:
            r5.applyMove(r2)
            goto L37
        L2c:
            r5.applyUpdate(r2)
            goto L37
        L30:
            r5.applyRemove(r2)
            goto L37
        L34:
            r5.applyAdd(r2)
        L37:
            java.lang.Runnable r2 = r5.mOnItemProcessedCallback
            if (r2 == 0) goto L3e
            r2.run()
        L3e:
            int r1 = r1 + 1
            goto Le
        L41:
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r0 = r5.mPendingUpdates
            r0.clear()
            return
    }

    @Override // androidx.recyclerview.widget.OpReorderer.Callback
    public void recycleUpdateOp(androidx.recyclerview.widget.AdapterHelper.UpdateOp r2) {
            r1 = this;
            boolean r0 = r1.mDisableRecycler
            if (r0 != 0) goto Lc
            r0 = 0
            r2.payload = r0
            androidx.core.util.Pools$Pool<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r0 = r1.mUpdateOpPool
            r0.release(r2)
        Lc:
            return
    }

    void recycleUpdateOpsAndClearList(java.util.List<androidx.recyclerview.widget.AdapterHelper.UpdateOp> r4) {
            r3 = this;
            int r0 = r4.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L13
            java.lang.Object r2 = r4.get(r1)
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r2 = (androidx.recyclerview.widget.AdapterHelper.UpdateOp) r2
            r3.recycleUpdateOp(r2)
            int r1 = r1 + 1
            goto L5
        L13:
            r4.clear()
            return
    }

    void reset() {
            r1 = this;
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r0 = r1.mPendingUpdates
            r1.recycleUpdateOpsAndClearList(r0)
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r0 = r1.mPostponedList
            r1.recycleUpdateOpsAndClearList(r0)
            r0 = 0
            r1.mExistingUpdateTypes = r0
            return
    }
}
