package androidx.recyclerview.widget;

/* loaded from: classes.dex */
public abstract class SimpleItemAnimator extends androidx.recyclerview.widget.RecyclerView.ItemAnimator {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "SimpleItemAnimator";
    boolean mSupportsChangeAnimations;

    public SimpleItemAnimator() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.mSupportsChangeAnimations = r0
            return
    }

    public abstract boolean animateAdd(androidx.recyclerview.widget.RecyclerView.ViewHolder r1);

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean animateAppearance(androidx.recyclerview.widget.RecyclerView.ViewHolder r9, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo r10, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo r11) {
            r8 = this;
            if (r10 == 0) goto L1d
            int r0 = r10.left
            int r1 = r11.left
            if (r0 != r1) goto Le
            int r0 = r10.top
            int r1 = r11.top
            if (r0 == r1) goto L1d
        Le:
            int r4 = r10.left
            int r5 = r10.top
            int r6 = r11.left
            int r7 = r11.top
            r2 = r8
            r3 = r9
            boolean r9 = r2.animateMove(r3, r4, r5, r6, r7)
            return r9
        L1d:
            boolean r9 = r8.animateAdd(r9)
            return r9
    }

    public abstract boolean animateChange(androidx.recyclerview.widget.RecyclerView.ViewHolder r1, androidx.recyclerview.widget.RecyclerView.ViewHolder r2, int r3, int r4, int r5, int r6);

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean animateChange(androidx.recyclerview.widget.RecyclerView.ViewHolder r8, androidx.recyclerview.widget.RecyclerView.ViewHolder r9, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo r10, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo r11) {
            r7 = this;
            int r3 = r10.left
            int r4 = r10.top
            boolean r0 = r9.shouldIgnore()
            if (r0 == 0) goto L11
            int r11 = r10.left
            int r10 = r10.top
            r6 = r10
            r5 = r11
            goto L17
        L11:
            int r10 = r11.left
            int r11 = r11.top
            r5 = r10
            r6 = r11
        L17:
            r0 = r7
            r1 = r8
            r2 = r9
            boolean r8 = r0.animateChange(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean animateDisappearance(androidx.recyclerview.widget.RecyclerView.ViewHolder r7, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo r8, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo r9) {
            r6 = this;
            int r2 = r8.left
            int r3 = r8.top
            android.view.View r8 = r7.itemView
            if (r9 != 0) goto Ld
            int r0 = r8.getLeft()
            goto Lf
        Ld:
            int r0 = r9.left
        Lf:
            r4 = r0
            if (r9 != 0) goto L17
            int r9 = r8.getTop()
            goto L19
        L17:
            int r9 = r9.top
        L19:
            r5 = r9
            boolean r9 = r7.isRemoved()
            if (r9 != 0) goto L38
            if (r2 != r4) goto L24
            if (r3 == r5) goto L38
        L24:
            int r9 = r8.getWidth()
            int r9 = r9 + r4
            int r0 = r8.getHeight()
            int r0 = r0 + r5
            r8.layout(r4, r5, r9, r0)
            r0 = r6
            r1 = r7
            boolean r7 = r0.animateMove(r1, r2, r3, r4, r5)
            return r7
        L38:
            boolean r7 = r6.animateRemove(r7)
            return r7
    }

    public abstract boolean animateMove(androidx.recyclerview.widget.RecyclerView.ViewHolder r1, int r2, int r3, int r4, int r5);

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean animatePersistence(androidx.recyclerview.widget.RecyclerView.ViewHolder r7, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo r8, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo r9) {
            r6 = this;
            int r0 = r8.left
            int r1 = r9.left
            if (r0 != r1) goto L12
            int r0 = r8.top
            int r1 = r9.top
            if (r0 == r1) goto Ld
            goto L12
        Ld:
            r6.dispatchMoveFinished(r7)
            r7 = 0
            return r7
        L12:
            int r2 = r8.left
            int r3 = r8.top
            int r4 = r9.left
            int r5 = r9.top
            r0 = r6
            r1 = r7
            boolean r7 = r0.animateMove(r1, r2, r3, r4, r5)
            return r7
    }

    public abstract boolean animateRemove(androidx.recyclerview.widget.RecyclerView.ViewHolder r1);

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean canReuseUpdatedViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r2) {
            r1 = this;
            boolean r0 = r1.mSupportsChangeAnimations
            if (r0 == 0) goto Ld
            boolean r2 = r2.isInvalid()
            if (r2 == 0) goto Lb
            goto Ld
        Lb:
            r2 = 0
            goto Le
        Ld:
            r2 = 1
        Le:
            return r2
    }

    public final void dispatchAddFinished(androidx.recyclerview.widget.RecyclerView.ViewHolder r1) {
            r0 = this;
            r0.onAddFinished(r1)
            r0.dispatchAnimationFinished(r1)
            return
    }

    public final void dispatchAddStarting(androidx.recyclerview.widget.RecyclerView.ViewHolder r1) {
            r0 = this;
            r0.onAddStarting(r1)
            return
    }

    public final void dispatchChangeFinished(androidx.recyclerview.widget.RecyclerView.ViewHolder r1, boolean r2) {
            r0 = this;
            r0.onChangeFinished(r1, r2)
            r0.dispatchAnimationFinished(r1)
            return
    }

    public final void dispatchChangeStarting(androidx.recyclerview.widget.RecyclerView.ViewHolder r1, boolean r2) {
            r0 = this;
            r0.onChangeStarting(r1, r2)
            return
    }

    public final void dispatchMoveFinished(androidx.recyclerview.widget.RecyclerView.ViewHolder r1) {
            r0 = this;
            r0.onMoveFinished(r1)
            r0.dispatchAnimationFinished(r1)
            return
    }

    public final void dispatchMoveStarting(androidx.recyclerview.widget.RecyclerView.ViewHolder r1) {
            r0 = this;
            r0.onMoveStarting(r1)
            return
    }

    public final void dispatchRemoveFinished(androidx.recyclerview.widget.RecyclerView.ViewHolder r1) {
            r0 = this;
            r0.onRemoveFinished(r1)
            r0.dispatchAnimationFinished(r1)
            return
    }

    public final void dispatchRemoveStarting(androidx.recyclerview.widget.RecyclerView.ViewHolder r1) {
            r0 = this;
            r0.onRemoveStarting(r1)
            return
    }

    public boolean getSupportsChangeAnimations() {
            r1 = this;
            boolean r0 = r1.mSupportsChangeAnimations
            return r0
    }

    public void onAddFinished(androidx.recyclerview.widget.RecyclerView.ViewHolder r1) {
            r0 = this;
            return
    }

    public void onAddStarting(androidx.recyclerview.widget.RecyclerView.ViewHolder r1) {
            r0 = this;
            return
    }

    public void onChangeFinished(androidx.recyclerview.widget.RecyclerView.ViewHolder r1, boolean r2) {
            r0 = this;
            return
    }

    public void onChangeStarting(androidx.recyclerview.widget.RecyclerView.ViewHolder r1, boolean r2) {
            r0 = this;
            return
    }

    public void onMoveFinished(androidx.recyclerview.widget.RecyclerView.ViewHolder r1) {
            r0 = this;
            return
    }

    public void onMoveStarting(androidx.recyclerview.widget.RecyclerView.ViewHolder r1) {
            r0 = this;
            return
    }

    public void onRemoveFinished(androidx.recyclerview.widget.RecyclerView.ViewHolder r1) {
            r0 = this;
            return
    }

    public void onRemoveStarting(androidx.recyclerview.widget.RecyclerView.ViewHolder r1) {
            r0 = this;
            return
    }

    public void setSupportsChangeAnimations(boolean r1) {
            r0 = this;
            r0.mSupportsChangeAnimations = r1
            return
    }
}
