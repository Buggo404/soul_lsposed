package androidx.recyclerview.widget;

/* loaded from: classes.dex */
public final class AdapterListUpdateCallback implements androidx.recyclerview.widget.ListUpdateCallback {
    private final androidx.recyclerview.widget.RecyclerView.Adapter mAdapter;

    public AdapterListUpdateCallback(androidx.recyclerview.widget.RecyclerView.Adapter r1) {
            r0 = this;
            r0.<init>()
            r0.mAdapter = r1
            return
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onChanged(int r2, int r3, java.lang.Object r4) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r1.mAdapter
            r0.notifyItemRangeChanged(r2, r3, r4)
            return
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onInserted(int r2, int r3) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r1.mAdapter
            r0.notifyItemRangeInserted(r2, r3)
            return
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onMoved(int r2, int r3) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r1.mAdapter
            r0.notifyItemMoved(r2, r3)
            return
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onRemoved(int r2, int r3) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r1.mAdapter
            r0.notifyItemRangeRemoved(r2, r3)
            return
    }
}
