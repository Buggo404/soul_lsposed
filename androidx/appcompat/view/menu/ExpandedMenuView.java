package androidx.appcompat.view.menu;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends android.widget.ListView implements androidx.appcompat.view.menu.MenuBuilder.ItemInvoker, androidx.appcompat.view.menu.MenuView, android.widget.AdapterView.OnItemClickListener {
    private static final int[] TINT_ATTRS = null;
    private int mAnimations;
    private androidx.appcompat.view.menu.MenuBuilder mMenu;

    static {
            r0 = 2
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [16842964, 16843049} // fill-array
            androidx.appcompat.view.menu.ExpandedMenuView.TINT_ATTRS = r0
            return
    }

    public ExpandedMenuView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 16842868(0x1010074, float:2.3693883E-38)
            r1.<init>(r2, r3, r0)
            return
    }

    public ExpandedMenuView(android.content.Context r3, android.util.AttributeSet r4, int r5) {
            r2 = this;
            r2.<init>(r3, r4)
            r2.setOnItemClickListener(r2)
            int[] r0 = androidx.appcompat.view.menu.ExpandedMenuView.TINT_ATTRS
            r1 = 0
            androidx.appcompat.widget.TintTypedArray r3 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r3, r4, r0, r5, r1)
            boolean r4 = r3.hasValue(r1)
            if (r4 == 0) goto L1a
            android.graphics.drawable.Drawable r4 = r3.getDrawable(r1)
            r2.setBackgroundDrawable(r4)
        L1a:
            r4 = 1
            boolean r5 = r3.hasValue(r4)
            if (r5 == 0) goto L28
            android.graphics.drawable.Drawable r4 = r3.getDrawable(r4)
            r2.setDivider(r4)
        L28:
            r3.recycle()
            return
    }

    @Override // androidx.appcompat.view.menu.MenuView
    public int getWindowAnimations() {
            r1 = this;
            int r0 = r1.mAnimations
            return r0
    }

    @Override // androidx.appcompat.view.menu.MenuView
    public void initialize(androidx.appcompat.view.menu.MenuBuilder r1) {
            r0 = this;
            r0.mMenu = r1
            return
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.ItemInvoker
    public boolean invokeItem(androidx.appcompat.view.menu.MenuItemImpl r3) {
            r2 = this;
            androidx.appcompat.view.menu.MenuBuilder r0 = r2.mMenu
            r1 = 0
            boolean r3 = r0.performItemAction(r3, r1)
            return r3
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            r0 = 0
            r1.setChildrenDrawingCacheEnabled(r0)
            return
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            android.widget.ListAdapter r1 = r0.getAdapter()
            java.lang.Object r1 = r1.getItem(r3)
            androidx.appcompat.view.menu.MenuItemImpl r1 = (androidx.appcompat.view.menu.MenuItemImpl) r1
            r0.invokeItem(r1)
            return
    }
}
