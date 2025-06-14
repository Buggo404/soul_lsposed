package androidx.appcompat.view.menu;

/* loaded from: classes.dex */
public class MenuAdapter extends android.widget.BaseAdapter {
    androidx.appcompat.view.menu.MenuBuilder mAdapterMenu;
    private int mExpandedIndex;
    private boolean mForceShowIcon;
    private final android.view.LayoutInflater mInflater;
    private final int mItemLayoutRes;
    private final boolean mOverflowOnly;

    public MenuAdapter(androidx.appcompat.view.menu.MenuBuilder r2, android.view.LayoutInflater r3, boolean r4, int r5) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.mExpandedIndex = r0
            r1.mOverflowOnly = r4
            r1.mInflater = r3
            r1.mAdapterMenu = r2
            r1.mItemLayoutRes = r5
            r1.findExpandedIndex()
            return
    }

    void findExpandedIndex() {
            r5 = this;
            androidx.appcompat.view.menu.MenuBuilder r0 = r5.mAdapterMenu
            androidx.appcompat.view.menu.MenuItemImpl r0 = r0.getExpandedItem()
            if (r0 == 0) goto L23
            androidx.appcompat.view.menu.MenuBuilder r1 = r5.mAdapterMenu
            java.util.ArrayList r1 = r1.getNonActionItems()
            int r2 = r1.size()
            r3 = 0
        L13:
            if (r3 >= r2) goto L23
            java.lang.Object r4 = r1.get(r3)
            androidx.appcompat.view.menu.MenuItemImpl r4 = (androidx.appcompat.view.menu.MenuItemImpl) r4
            if (r4 != r0) goto L20
            r5.mExpandedIndex = r3
            return
        L20:
            int r3 = r3 + 1
            goto L13
        L23:
            r0 = -1
            r5.mExpandedIndex = r0
            return
    }

    public androidx.appcompat.view.menu.MenuBuilder getAdapterMenu() {
            r1 = this;
            androidx.appcompat.view.menu.MenuBuilder r0 = r1.mAdapterMenu
            return r0
    }

    @Override // android.widget.Adapter
    public int getCount() {
            r2 = this;
            boolean r0 = r2.mOverflowOnly
            if (r0 == 0) goto Lb
            androidx.appcompat.view.menu.MenuBuilder r0 = r2.mAdapterMenu
            java.util.ArrayList r0 = r0.getNonActionItems()
            goto L11
        Lb:
            androidx.appcompat.view.menu.MenuBuilder r0 = r2.mAdapterMenu
            java.util.ArrayList r0 = r0.getVisibleItems()
        L11:
            int r1 = r2.mExpandedIndex
            if (r1 >= 0) goto L1a
            int r0 = r0.size()
            return r0
        L1a:
            int r0 = r0.size()
            int r0 = r0 + (-1)
            return r0
    }

    public boolean getForceShowIcon() {
            r1 = this;
            boolean r0 = r1.mForceShowIcon
            return r0
    }

    @Override // android.widget.Adapter
    public androidx.appcompat.view.menu.MenuItemImpl getItem(int r3) {
            r2 = this;
            boolean r0 = r2.mOverflowOnly
            if (r0 == 0) goto Lb
            androidx.appcompat.view.menu.MenuBuilder r0 = r2.mAdapterMenu
            java.util.ArrayList r0 = r0.getNonActionItems()
            goto L11
        Lb:
            androidx.appcompat.view.menu.MenuBuilder r0 = r2.mAdapterMenu
            java.util.ArrayList r0 = r0.getVisibleItems()
        L11:
            int r1 = r2.mExpandedIndex
            if (r1 < 0) goto L19
            if (r3 < r1) goto L19
            int r3 = r3 + 1
        L19:
            java.lang.Object r3 = r0.get(r3)
            androidx.appcompat.view.menu.MenuItemImpl r3 = (androidx.appcompat.view.menu.MenuItemImpl) r3
            return r3
    }

    @Override // android.widget.Adapter
    public /* bridge */ /* synthetic */ java.lang.Object getItem(int r1) {
            r0 = this;
            androidx.appcompat.view.menu.MenuItemImpl r1 = r0.getItem(r1)
            return r1
    }

    @Override // android.widget.Adapter
    public long getItemId(int r3) {
            r2 = this;
            long r0 = (long) r3
            return r0
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
            r5 = this;
            r0 = 0
            if (r7 != 0) goto Lb
            android.view.LayoutInflater r7 = r5.mInflater
            int r1 = r5.mItemLayoutRes
            android.view.View r7 = r7.inflate(r1, r8, r0)
        Lb:
            androidx.appcompat.view.menu.MenuItemImpl r8 = r5.getItem(r6)
            int r8 = r8.getGroupId()
            int r1 = r6 + (-1)
            if (r1 < 0) goto L20
            androidx.appcompat.view.menu.MenuItemImpl r1 = r5.getItem(r1)
            int r1 = r1.getGroupId()
            goto L21
        L20:
            r1 = r8
        L21:
            r2 = r7
            androidx.appcompat.view.menu.ListMenuItemView r2 = (androidx.appcompat.view.menu.ListMenuItemView) r2
            androidx.appcompat.view.menu.MenuBuilder r3 = r5.mAdapterMenu
            boolean r3 = r3.isGroupDividerEnabled()
            r4 = 1
            if (r3 == 0) goto L31
            if (r8 == r1) goto L31
            r8 = r4
            goto L32
        L31:
            r8 = r0
        L32:
            r2.setGroupDividerEnabled(r8)
            r8 = r7
            androidx.appcompat.view.menu.MenuView$ItemView r8 = (androidx.appcompat.view.menu.MenuView.ItemView) r8
            boolean r1 = r5.mForceShowIcon
            if (r1 == 0) goto L3f
            r2.setForceShowIcon(r4)
        L3f:
            androidx.appcompat.view.menu.MenuItemImpl r6 = r5.getItem(r6)
            r8.initialize(r6, r0)
            return r7
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
            r0 = this;
            r0.findExpandedIndex()
            super.notifyDataSetChanged()
            return
    }

    public void setForceShowIcon(boolean r1) {
            r0 = this;
            r0.mForceShowIcon = r1
            return
    }
}
