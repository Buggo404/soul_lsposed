package androidx.recyclerview.widget;

/* loaded from: classes.dex */
interface ThreadUtil<T> {

    public interface BackgroundCallback<T> {
        void loadTile(int r1, int r2);

        void recycleTile(androidx.recyclerview.widget.TileList.Tile<T> r1);

        void refresh(int r1);

        void updateRange(int r1, int r2, int r3, int r4, int r5);
    }

    public interface MainThreadCallback<T> {
        void addTile(int r1, androidx.recyclerview.widget.TileList.Tile<T> r2);

        void removeTile(int r1, int r2);

        void updateItemCount(int r1, int r2);
    }

    androidx.recyclerview.widget.ThreadUtil.BackgroundCallback<T> getBackgroundProxy(androidx.recyclerview.widget.ThreadUtil.BackgroundCallback<T> r1);

    androidx.recyclerview.widget.ThreadUtil.MainThreadCallback<T> getMainThreadProxy(androidx.recyclerview.widget.ThreadUtil.MainThreadCallback<T> r1);
}
