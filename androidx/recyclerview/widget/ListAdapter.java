package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView.ViewHolder;

/* loaded from: classes.dex */
public abstract class ListAdapter<T, VH extends androidx.recyclerview.widget.RecyclerView.ViewHolder> extends androidx.recyclerview.widget.RecyclerView.Adapter<VH> {
    final androidx.recyclerview.widget.AsyncListDiffer<T> mDiffer;
    private final androidx.recyclerview.widget.AsyncListDiffer.ListListener<T> mListener;


    protected ListAdapter(androidx.recyclerview.widget.AsyncDifferConfig<T> r4) {
            r3 = this;
            r3.<init>()
            androidx.recyclerview.widget.ListAdapter$1 r0 = new androidx.recyclerview.widget.ListAdapter$1
            r0.<init>(r3)
            r3.mListener = r0
            androidx.recyclerview.widget.AsyncListDiffer r1 = new androidx.recyclerview.widget.AsyncListDiffer
            androidx.recyclerview.widget.AdapterListUpdateCallback r2 = new androidx.recyclerview.widget.AdapterListUpdateCallback
            r2.<init>(r3)
            r1.<init>(r2, r4)
            r3.mDiffer = r1
            r1.addListListener(r0)
            return
    }

    protected ListAdapter(androidx.recyclerview.widget.DiffUtil.ItemCallback<T> r5) {
            r4 = this;
            r4.<init>()
            androidx.recyclerview.widget.ListAdapter$1 r0 = new androidx.recyclerview.widget.ListAdapter$1
            r0.<init>(r4)
            r4.mListener = r0
            androidx.recyclerview.widget.AsyncListDiffer r1 = new androidx.recyclerview.widget.AsyncListDiffer
            androidx.recyclerview.widget.AdapterListUpdateCallback r2 = new androidx.recyclerview.widget.AdapterListUpdateCallback
            r2.<init>(r4)
            androidx.recyclerview.widget.AsyncDifferConfig$Builder r3 = new androidx.recyclerview.widget.AsyncDifferConfig$Builder
            r3.<init>(r5)
            androidx.recyclerview.widget.AsyncDifferConfig r5 = r3.build()
            r1.<init>(r2, r5)
            r4.mDiffer = r1
            r1.addListListener(r0)
            return
    }

    public java.util.List<T> getCurrentList() {
            r1 = this;
            androidx.recyclerview.widget.AsyncListDiffer<T> r0 = r1.mDiffer
            java.util.List r0 = r0.getCurrentList()
            return r0
    }

    protected T getItem(int r2) {
            r1 = this;
            androidx.recyclerview.widget.AsyncListDiffer<T> r0 = r1.mDiffer
            java.util.List r0 = r0.getCurrentList()
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
            r1 = this;
            androidx.recyclerview.widget.AsyncListDiffer<T> r0 = r1.mDiffer
            java.util.List r0 = r0.getCurrentList()
            int r0 = r0.size()
            return r0
    }

    public void onCurrentListChanged(java.util.List<T> r1, java.util.List<T> r2) {
            r0 = this;
            return
    }

    public void submitList(java.util.List<T> r2) {
            r1 = this;
            androidx.recyclerview.widget.AsyncListDiffer<T> r0 = r1.mDiffer
            r0.submitList(r2)
            return
    }

    public void submitList(java.util.List<T> r2, java.lang.Runnable r3) {
            r1 = this;
            androidx.recyclerview.widget.AsyncListDiffer<T> r0 = r1.mDiffer
            r0.submitList(r2, r3)
            return
    }
}
