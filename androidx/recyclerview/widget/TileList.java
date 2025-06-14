package androidx.recyclerview.widget;

/* loaded from: classes.dex */
class TileList<T> {
    androidx.recyclerview.widget.TileList.Tile<T> mLastAccessedTile;
    final int mTileSize;
    private final android.util.SparseArray<androidx.recyclerview.widget.TileList.Tile<T>> mTiles;

    public static class Tile<T> {
        public int mItemCount;
        public final T[] mItems;
        androidx.recyclerview.widget.TileList.Tile<T> mNext;
        public int mStartPosition;

        public Tile(java.lang.Class<T> r1, int r2) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r2)
                java.lang.Object[] r1 = (java.lang.Object[]) r1
                java.lang.Object[] r1 = (java.lang.Object[]) r1
                r0.mItems = r1
                return
        }

        boolean containsPosition(int r3) {
                r2 = this;
                int r0 = r2.mStartPosition
                if (r0 > r3) goto Lb
                int r1 = r2.mItemCount
                int r0 = r0 + r1
                if (r3 >= r0) goto Lb
                r3 = 1
                goto Lc
            Lb:
                r3 = 0
            Lc:
                return r3
        }

        T getByPosition(int r3) {
                r2 = this;
                T[] r0 = r2.mItems
                int r1 = r2.mStartPosition
                int r3 = r3 - r1
                r3 = r0[r3]
                return r3
        }
    }

    public TileList(int r3) {
            r2 = this;
            r2.<init>()
            android.util.SparseArray r0 = new android.util.SparseArray
            r1 = 10
            r0.<init>(r1)
            r2.mTiles = r0
            r2.mTileSize = r3
            return
    }

    public androidx.recyclerview.widget.TileList.Tile<T> addOrReplace(androidx.recyclerview.widget.TileList.Tile<T> r4) {
            r3 = this;
            android.util.SparseArray<androidx.recyclerview.widget.TileList$Tile<T>> r0 = r3.mTiles
            int r1 = r4.mStartPosition
            int r0 = r0.indexOfKey(r1)
            if (r0 >= 0) goto L13
            android.util.SparseArray<androidx.recyclerview.widget.TileList$Tile<T>> r0 = r3.mTiles
            int r1 = r4.mStartPosition
            r0.put(r1, r4)
            r4 = 0
            return r4
        L13:
            android.util.SparseArray<androidx.recyclerview.widget.TileList$Tile<T>> r1 = r3.mTiles
            java.lang.Object r1 = r1.valueAt(r0)
            androidx.recyclerview.widget.TileList$Tile r1 = (androidx.recyclerview.widget.TileList.Tile) r1
            android.util.SparseArray<androidx.recyclerview.widget.TileList$Tile<T>> r2 = r3.mTiles
            r2.setValueAt(r0, r4)
            androidx.recyclerview.widget.TileList$Tile<T> r0 = r3.mLastAccessedTile
            if (r0 != r1) goto L26
            r3.mLastAccessedTile = r4
        L26:
            return r1
    }

    public void clear() {
            r1 = this;
            android.util.SparseArray<androidx.recyclerview.widget.TileList$Tile<T>> r0 = r1.mTiles
            r0.clear()
            return
    }

    public androidx.recyclerview.widget.TileList.Tile<T> getAtIndex(int r2) {
            r1 = this;
            android.util.SparseArray<androidx.recyclerview.widget.TileList$Tile<T>> r0 = r1.mTiles
            java.lang.Object r2 = r0.valueAt(r2)
            androidx.recyclerview.widget.TileList$Tile r2 = (androidx.recyclerview.widget.TileList.Tile) r2
            return r2
    }

    public T getItemAt(int r3) {
            r2 = this;
            androidx.recyclerview.widget.TileList$Tile<T> r0 = r2.mLastAccessedTile
            if (r0 == 0) goto La
            boolean r0 = r0.containsPosition(r3)
            if (r0 != 0) goto L24
        La:
            int r0 = r2.mTileSize
            int r0 = r3 % r0
            int r0 = r3 - r0
            android.util.SparseArray<androidx.recyclerview.widget.TileList$Tile<T>> r1 = r2.mTiles
            int r0 = r1.indexOfKey(r0)
            if (r0 >= 0) goto L1a
            r3 = 0
            return r3
        L1a:
            android.util.SparseArray<androidx.recyclerview.widget.TileList$Tile<T>> r1 = r2.mTiles
            java.lang.Object r0 = r1.valueAt(r0)
            androidx.recyclerview.widget.TileList$Tile r0 = (androidx.recyclerview.widget.TileList.Tile) r0
            r2.mLastAccessedTile = r0
        L24:
            androidx.recyclerview.widget.TileList$Tile<T> r0 = r2.mLastAccessedTile
            java.lang.Object r3 = r0.getByPosition(r3)
            return r3
    }

    public androidx.recyclerview.widget.TileList.Tile<T> removeAtPos(int r3) {
            r2 = this;
            android.util.SparseArray<androidx.recyclerview.widget.TileList$Tile<T>> r0 = r2.mTiles
            java.lang.Object r0 = r0.get(r3)
            androidx.recyclerview.widget.TileList$Tile r0 = (androidx.recyclerview.widget.TileList.Tile) r0
            androidx.recyclerview.widget.TileList$Tile<T> r1 = r2.mLastAccessedTile
            if (r1 != r0) goto Lf
            r1 = 0
            r2.mLastAccessedTile = r1
        Lf:
            android.util.SparseArray<androidx.recyclerview.widget.TileList$Tile<T>> r1 = r2.mTiles
            r1.delete(r3)
            return r0
    }

    public int size() {
            r1 = this;
            android.util.SparseArray<androidx.recyclerview.widget.TileList$Tile<T>> r0 = r1.mTiles
            int r0 = r0.size()
            return r0
    }
}
