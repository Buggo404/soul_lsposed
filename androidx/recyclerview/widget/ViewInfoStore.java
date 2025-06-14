package androidx.recyclerview.widget;

/* loaded from: classes.dex */
class ViewInfoStore {
    private static final boolean DEBUG = false;
    final androidx.collection.SimpleArrayMap<androidx.recyclerview.widget.RecyclerView.ViewHolder, androidx.recyclerview.widget.ViewInfoStore.InfoRecord> mLayoutHolderMap;
    final androidx.collection.LongSparseArray<androidx.recyclerview.widget.RecyclerView.ViewHolder> mOldChangedHolders;

    static class InfoRecord {
        static final int FLAG_APPEAR = 2;
        static final int FLAG_APPEAR_AND_DISAPPEAR = 3;
        static final int FLAG_APPEAR_PRE_AND_POST = 14;
        static final int FLAG_DISAPPEARED = 1;
        static final int FLAG_POST = 8;
        static final int FLAG_PRE = 4;
        static final int FLAG_PRE_AND_POST = 12;
        static androidx.core.util.Pools.Pool<androidx.recyclerview.widget.ViewInfoStore.InfoRecord> sPool;
        int flags;
        androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo postInfo;
        androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo preInfo;

        static {
                androidx.core.util.Pools$SimplePool r0 = new androidx.core.util.Pools$SimplePool
                r1 = 20
                r0.<init>(r1)
                androidx.recyclerview.widget.ViewInfoStore.InfoRecord.sPool = r0
                return
        }

        private InfoRecord() {
                r0 = this;
                r0.<init>()
                return
        }

        static void drainCache() {
            L0:
                androidx.core.util.Pools$Pool<androidx.recyclerview.widget.ViewInfoStore$InfoRecord> r0 = androidx.recyclerview.widget.ViewInfoStore.InfoRecord.sPool
                java.lang.Object r0 = r0.acquire()
                if (r0 == 0) goto L9
                goto L0
            L9:
                return
        }

        static androidx.recyclerview.widget.ViewInfoStore.InfoRecord obtain() {
                androidx.core.util.Pools$Pool<androidx.recyclerview.widget.ViewInfoStore$InfoRecord> r0 = androidx.recyclerview.widget.ViewInfoStore.InfoRecord.sPool
                java.lang.Object r0 = r0.acquire()
                androidx.recyclerview.widget.ViewInfoStore$InfoRecord r0 = (androidx.recyclerview.widget.ViewInfoStore.InfoRecord) r0
                if (r0 != 0) goto Lf
                androidx.recyclerview.widget.ViewInfoStore$InfoRecord r0 = new androidx.recyclerview.widget.ViewInfoStore$InfoRecord
                r0.<init>()
            Lf:
                return r0
        }

        static void recycle(androidx.recyclerview.widget.ViewInfoStore.InfoRecord r1) {
                r0 = 0
                r1.flags = r0
                r0 = 0
                r1.preInfo = r0
                r1.postInfo = r0
                androidx.core.util.Pools$Pool<androidx.recyclerview.widget.ViewInfoStore$InfoRecord> r0 = androidx.recyclerview.widget.ViewInfoStore.InfoRecord.sPool
                r0.release(r1)
                return
        }
    }

    interface ProcessCallback {
        void processAppeared(androidx.recyclerview.widget.RecyclerView.ViewHolder r1, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo r2, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo r3);

        void processDisappeared(androidx.recyclerview.widget.RecyclerView.ViewHolder r1, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo r2, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo r3);

        void processPersistent(androidx.recyclerview.widget.RecyclerView.ViewHolder r1, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo r2, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo r3);

        void unused(androidx.recyclerview.widget.RecyclerView.ViewHolder r1);
    }

    ViewInfoStore() {
            r1 = this;
            r1.<init>()
            androidx.collection.SimpleArrayMap r0 = new androidx.collection.SimpleArrayMap
            r0.<init>()
            r1.mLayoutHolderMap = r0
            androidx.collection.LongSparseArray r0 = new androidx.collection.LongSparseArray
            r0.<init>()
            r1.mOldChangedHolders = r0
            return
    }

    private androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo popFromLayoutStep(androidx.recyclerview.widget.RecyclerView.ViewHolder r4, int r5) {
            r3 = this;
            androidx.collection.SimpleArrayMap<androidx.recyclerview.widget.RecyclerView$ViewHolder, androidx.recyclerview.widget.ViewInfoStore$InfoRecord> r0 = r3.mLayoutHolderMap
            int r4 = r0.indexOfKey(r4)
            r0 = 0
            if (r4 >= 0) goto La
            return r0
        La:
            androidx.collection.SimpleArrayMap<androidx.recyclerview.widget.RecyclerView$ViewHolder, androidx.recyclerview.widget.ViewInfoStore$InfoRecord> r1 = r3.mLayoutHolderMap
            java.lang.Object r1 = r1.valueAt(r4)
            androidx.recyclerview.widget.ViewInfoStore$InfoRecord r1 = (androidx.recyclerview.widget.ViewInfoStore.InfoRecord) r1
            if (r1 == 0) goto L42
            int r2 = r1.flags
            r2 = r2 & r5
            if (r2 == 0) goto L42
            int r0 = r1.flags
            int r2 = ~r5
            r0 = r0 & r2
            r1.flags = r0
            r0 = 4
            if (r5 != r0) goto L25
            androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemHolderInfo r5 = r1.preInfo
            goto L2b
        L25:
            r0 = 8
            if (r5 != r0) goto L3a
            androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemHolderInfo r5 = r1.postInfo
        L2b:
            int r0 = r1.flags
            r0 = r0 & 12
            if (r0 != 0) goto L39
            androidx.collection.SimpleArrayMap<androidx.recyclerview.widget.RecyclerView$ViewHolder, androidx.recyclerview.widget.ViewInfoStore$InfoRecord> r0 = r3.mLayoutHolderMap
            r0.removeAt(r4)
            androidx.recyclerview.widget.ViewInfoStore.InfoRecord.recycle(r1)
        L39:
            return r5
        L3a:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Must provide flag PRE or POST"
            r4.<init>(r5)
            throw r4
        L42:
            return r0
    }

    void addToAppearedInPreLayoutHolders(androidx.recyclerview.widget.RecyclerView.ViewHolder r3, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo r4) {
            r2 = this;
            androidx.collection.SimpleArrayMap<androidx.recyclerview.widget.RecyclerView$ViewHolder, androidx.recyclerview.widget.ViewInfoStore$InfoRecord> r0 = r2.mLayoutHolderMap
            java.lang.Object r0 = r0.get(r3)
            androidx.recyclerview.widget.ViewInfoStore$InfoRecord r0 = (androidx.recyclerview.widget.ViewInfoStore.InfoRecord) r0
            if (r0 != 0) goto L13
            androidx.recyclerview.widget.ViewInfoStore$InfoRecord r0 = androidx.recyclerview.widget.ViewInfoStore.InfoRecord.obtain()
            androidx.collection.SimpleArrayMap<androidx.recyclerview.widget.RecyclerView$ViewHolder, androidx.recyclerview.widget.ViewInfoStore$InfoRecord> r1 = r2.mLayoutHolderMap
            r1.put(r3, r0)
        L13:
            int r3 = r0.flags
            r3 = r3 | 2
            r0.flags = r3
            r0.preInfo = r4
            return
    }

    void addToDisappearedInLayout(androidx.recyclerview.widget.RecyclerView.ViewHolder r3) {
            r2 = this;
            androidx.collection.SimpleArrayMap<androidx.recyclerview.widget.RecyclerView$ViewHolder, androidx.recyclerview.widget.ViewInfoStore$InfoRecord> r0 = r2.mLayoutHolderMap
            java.lang.Object r0 = r0.get(r3)
            androidx.recyclerview.widget.ViewInfoStore$InfoRecord r0 = (androidx.recyclerview.widget.ViewInfoStore.InfoRecord) r0
            if (r0 != 0) goto L13
            androidx.recyclerview.widget.ViewInfoStore$InfoRecord r0 = androidx.recyclerview.widget.ViewInfoStore.InfoRecord.obtain()
            androidx.collection.SimpleArrayMap<androidx.recyclerview.widget.RecyclerView$ViewHolder, androidx.recyclerview.widget.ViewInfoStore$InfoRecord> r1 = r2.mLayoutHolderMap
            r1.put(r3, r0)
        L13:
            int r3 = r0.flags
            r3 = r3 | 1
            r0.flags = r3
            return
    }

    void addToOldChangeHolders(long r2, androidx.recyclerview.widget.RecyclerView.ViewHolder r4) {
            r1 = this;
            androidx.collection.LongSparseArray<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r1.mOldChangedHolders
            r0.put(r2, r4)
            return
    }

    void addToPostLayout(androidx.recyclerview.widget.RecyclerView.ViewHolder r3, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo r4) {
            r2 = this;
            androidx.collection.SimpleArrayMap<androidx.recyclerview.widget.RecyclerView$ViewHolder, androidx.recyclerview.widget.ViewInfoStore$InfoRecord> r0 = r2.mLayoutHolderMap
            java.lang.Object r0 = r0.get(r3)
            androidx.recyclerview.widget.ViewInfoStore$InfoRecord r0 = (androidx.recyclerview.widget.ViewInfoStore.InfoRecord) r0
            if (r0 != 0) goto L13
            androidx.recyclerview.widget.ViewInfoStore$InfoRecord r0 = androidx.recyclerview.widget.ViewInfoStore.InfoRecord.obtain()
            androidx.collection.SimpleArrayMap<androidx.recyclerview.widget.RecyclerView$ViewHolder, androidx.recyclerview.widget.ViewInfoStore$InfoRecord> r1 = r2.mLayoutHolderMap
            r1.put(r3, r0)
        L13:
            r0.postInfo = r4
            int r3 = r0.flags
            r3 = r3 | 8
            r0.flags = r3
            return
    }

    void addToPreLayout(androidx.recyclerview.widget.RecyclerView.ViewHolder r3, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo r4) {
            r2 = this;
            androidx.collection.SimpleArrayMap<androidx.recyclerview.widget.RecyclerView$ViewHolder, androidx.recyclerview.widget.ViewInfoStore$InfoRecord> r0 = r2.mLayoutHolderMap
            java.lang.Object r0 = r0.get(r3)
            androidx.recyclerview.widget.ViewInfoStore$InfoRecord r0 = (androidx.recyclerview.widget.ViewInfoStore.InfoRecord) r0
            if (r0 != 0) goto L13
            androidx.recyclerview.widget.ViewInfoStore$InfoRecord r0 = androidx.recyclerview.widget.ViewInfoStore.InfoRecord.obtain()
            androidx.collection.SimpleArrayMap<androidx.recyclerview.widget.RecyclerView$ViewHolder, androidx.recyclerview.widget.ViewInfoStore$InfoRecord> r1 = r2.mLayoutHolderMap
            r1.put(r3, r0)
        L13:
            r0.preInfo = r4
            int r3 = r0.flags
            r3 = r3 | 4
            r0.flags = r3
            return
    }

    void clear() {
            r1 = this;
            androidx.collection.SimpleArrayMap<androidx.recyclerview.widget.RecyclerView$ViewHolder, androidx.recyclerview.widget.ViewInfoStore$InfoRecord> r0 = r1.mLayoutHolderMap
            r0.clear()
            androidx.collection.LongSparseArray<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r1.mOldChangedHolders
            r0.clear()
            return
    }

    androidx.recyclerview.widget.RecyclerView.ViewHolder getFromOldChangeHolders(long r2) {
            r1 = this;
            androidx.collection.LongSparseArray<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r1.mOldChangedHolders
            java.lang.Object r2 = r0.get(r2)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r2
            return r2
    }

    boolean isDisappearing(androidx.recyclerview.widget.RecyclerView.ViewHolder r2) {
            r1 = this;
            androidx.collection.SimpleArrayMap<androidx.recyclerview.widget.RecyclerView$ViewHolder, androidx.recyclerview.widget.ViewInfoStore$InfoRecord> r0 = r1.mLayoutHolderMap
            java.lang.Object r2 = r0.get(r2)
            androidx.recyclerview.widget.ViewInfoStore$InfoRecord r2 = (androidx.recyclerview.widget.ViewInfoStore.InfoRecord) r2
            if (r2 == 0) goto L11
            int r2 = r2.flags
            r0 = 1
            r2 = r2 & r0
            if (r2 == 0) goto L11
            goto L12
        L11:
            r0 = 0
        L12:
            return r0
    }

    boolean isInPreLayout(androidx.recyclerview.widget.RecyclerView.ViewHolder r2) {
            r1 = this;
            androidx.collection.SimpleArrayMap<androidx.recyclerview.widget.RecyclerView$ViewHolder, androidx.recyclerview.widget.ViewInfoStore$InfoRecord> r0 = r1.mLayoutHolderMap
            java.lang.Object r2 = r0.get(r2)
            androidx.recyclerview.widget.ViewInfoStore$InfoRecord r2 = (androidx.recyclerview.widget.ViewInfoStore.InfoRecord) r2
            if (r2 == 0) goto L12
            int r2 = r2.flags
            r2 = r2 & 4
            if (r2 == 0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            return r2
    }

    void onDetach() {
            r0 = this;
            androidx.recyclerview.widget.ViewInfoStore.InfoRecord.drainCache()
            return
    }

    public void onViewDetached(androidx.recyclerview.widget.RecyclerView.ViewHolder r1) {
            r0 = this;
            r0.removeFromDisappearedInLayout(r1)
            return
    }

    androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo popFromPostLayout(androidx.recyclerview.widget.RecyclerView.ViewHolder r2) {
            r1 = this;
            r0 = 8
            androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemHolderInfo r2 = r1.popFromLayoutStep(r2, r0)
            return r2
    }

    androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo popFromPreLayout(androidx.recyclerview.widget.RecyclerView.ViewHolder r2) {
            r1 = this;
            r0 = 4
            androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemHolderInfo r2 = r1.popFromLayoutStep(r2, r0)
            return r2
    }

    void process(androidx.recyclerview.widget.ViewInfoStore.ProcessCallback r6) {
            r5 = this;
            androidx.collection.SimpleArrayMap<androidx.recyclerview.widget.RecyclerView$ViewHolder, androidx.recyclerview.widget.ViewInfoStore$InfoRecord> r0 = r5.mLayoutHolderMap
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L7b
            androidx.collection.SimpleArrayMap<androidx.recyclerview.widget.RecyclerView$ViewHolder, androidx.recyclerview.widget.ViewInfoStore$InfoRecord> r1 = r5.mLayoutHolderMap
            java.lang.Object r1 = r1.keyAt(r0)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r1 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r1
            androidx.collection.SimpleArrayMap<androidx.recyclerview.widget.RecyclerView$ViewHolder, androidx.recyclerview.widget.ViewInfoStore$InfoRecord> r2 = r5.mLayoutHolderMap
            java.lang.Object r2 = r2.removeAt(r0)
            androidx.recyclerview.widget.ViewInfoStore$InfoRecord r2 = (androidx.recyclerview.widget.ViewInfoStore.InfoRecord) r2
            int r3 = r2.flags
            r4 = 3
            r3 = r3 & r4
            if (r3 != r4) goto L24
            r6.unused(r1)
            goto L75
        L24:
            int r3 = r2.flags
            r3 = r3 & 1
            if (r3 == 0) goto L3a
            androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemHolderInfo r3 = r2.preInfo
            if (r3 != 0) goto L32
            r6.unused(r1)
            goto L75
        L32:
            androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemHolderInfo r3 = r2.preInfo
            androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemHolderInfo r4 = r2.postInfo
            r6.processDisappeared(r1, r3, r4)
            goto L75
        L3a:
            int r3 = r2.flags
            r4 = 14
            r3 = r3 & r4
            if (r3 != r4) goto L49
            androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemHolderInfo r3 = r2.preInfo
            androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemHolderInfo r4 = r2.postInfo
            r6.processAppeared(r1, r3, r4)
            goto L75
        L49:
            int r3 = r2.flags
            r4 = 12
            r3 = r3 & r4
            if (r3 != r4) goto L58
            androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemHolderInfo r3 = r2.preInfo
            androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemHolderInfo r4 = r2.postInfo
            r6.processPersistent(r1, r3, r4)
            goto L75
        L58:
            int r3 = r2.flags
            r3 = r3 & 4
            if (r3 == 0) goto L65
            androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemHolderInfo r3 = r2.preInfo
            r4 = 0
            r6.processDisappeared(r1, r3, r4)
            goto L75
        L65:
            int r3 = r2.flags
            r3 = r3 & 8
            if (r3 == 0) goto L73
            androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemHolderInfo r3 = r2.preInfo
            androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemHolderInfo r4 = r2.postInfo
            r6.processAppeared(r1, r3, r4)
            goto L75
        L73:
            int r1 = r2.flags
        L75:
            androidx.recyclerview.widget.ViewInfoStore.InfoRecord.recycle(r2)
            int r0 = r0 + (-1)
            goto L8
        L7b:
            return
    }

    void removeFromDisappearedInLayout(androidx.recyclerview.widget.RecyclerView.ViewHolder r2) {
            r1 = this;
            androidx.collection.SimpleArrayMap<androidx.recyclerview.widget.RecyclerView$ViewHolder, androidx.recyclerview.widget.ViewInfoStore$InfoRecord> r0 = r1.mLayoutHolderMap
            java.lang.Object r2 = r0.get(r2)
            androidx.recyclerview.widget.ViewInfoStore$InfoRecord r2 = (androidx.recyclerview.widget.ViewInfoStore.InfoRecord) r2
            if (r2 != 0) goto Lb
            return
        Lb:
            int r0 = r2.flags
            r0 = r0 & (-2)
            r2.flags = r0
            return
    }

    void removeViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r3) {
            r2 = this;
            androidx.collection.LongSparseArray<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r2.mOldChangedHolders
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L1b
            androidx.collection.LongSparseArray<androidx.recyclerview.widget.RecyclerView$ViewHolder> r1 = r2.mOldChangedHolders
            java.lang.Object r1 = r1.valueAt(r0)
            if (r3 != r1) goto L18
            androidx.collection.LongSparseArray<androidx.recyclerview.widget.RecyclerView$ViewHolder> r1 = r2.mOldChangedHolders
            r1.removeAt(r0)
            goto L1b
        L18:
            int r0 = r0 + (-1)
            goto L8
        L1b:
            androidx.collection.SimpleArrayMap<androidx.recyclerview.widget.RecyclerView$ViewHolder, androidx.recyclerview.widget.ViewInfoStore$InfoRecord> r0 = r2.mLayoutHolderMap
            java.lang.Object r3 = r0.remove(r3)
            androidx.recyclerview.widget.ViewInfoStore$InfoRecord r3 = (androidx.recyclerview.widget.ViewInfoStore.InfoRecord) r3
            if (r3 == 0) goto L28
            androidx.recyclerview.widget.ViewInfoStore.InfoRecord.recycle(r3)
        L28:
            return
    }
}
