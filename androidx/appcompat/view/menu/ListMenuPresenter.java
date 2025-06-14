package androidx.appcompat.view.menu;

/* loaded from: classes.dex */
public class ListMenuPresenter implements androidx.appcompat.view.menu.MenuPresenter, android.widget.AdapterView.OnItemClickListener {
    private static final java.lang.String TAG = "ListMenuPresenter";
    public static final java.lang.String VIEWS_TAG = "android:menu:list";
    androidx.appcompat.view.menu.ListMenuPresenter.MenuAdapter mAdapter;
    private androidx.appcompat.view.menu.MenuPresenter.Callback mCallback;
    android.content.Context mContext;
    private int mId;
    android.view.LayoutInflater mInflater;
    int mItemIndexOffset;
    int mItemLayoutRes;
    androidx.appcompat.view.menu.MenuBuilder mMenu;
    androidx.appcompat.view.menu.ExpandedMenuView mMenuView;
    int mThemeRes;

    private class MenuAdapter extends android.widget.BaseAdapter {
        private int mExpandedIndex;
        final /* synthetic */ androidx.appcompat.view.menu.ListMenuPresenter this$0;

        public MenuAdapter(androidx.appcompat.view.menu.ListMenuPresenter r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r1 = -1
                r0.mExpandedIndex = r1
                r0.findExpandedIndex()
                return
        }

        void findExpandedIndex() {
                r5 = this;
                androidx.appcompat.view.menu.ListMenuPresenter r0 = r5.this$0
                androidx.appcompat.view.menu.MenuBuilder r0 = r0.mMenu
                androidx.appcompat.view.menu.MenuItemImpl r0 = r0.getExpandedItem()
                if (r0 == 0) goto L27
                androidx.appcompat.view.menu.ListMenuPresenter r1 = r5.this$0
                androidx.appcompat.view.menu.MenuBuilder r1 = r1.mMenu
                java.util.ArrayList r1 = r1.getNonActionItems()
                int r2 = r1.size()
                r3 = 0
            L17:
                if (r3 >= r2) goto L27
                java.lang.Object r4 = r1.get(r3)
                androidx.appcompat.view.menu.MenuItemImpl r4 = (androidx.appcompat.view.menu.MenuItemImpl) r4
                if (r4 != r0) goto L24
                r5.mExpandedIndex = r3
                return
            L24:
                int r3 = r3 + 1
                goto L17
            L27:
                r0 = -1
                r5.mExpandedIndex = r0
                return
        }

        @Override // android.widget.Adapter
        public int getCount() {
                r2 = this;
                androidx.appcompat.view.menu.ListMenuPresenter r0 = r2.this$0
                androidx.appcompat.view.menu.MenuBuilder r0 = r0.mMenu
                java.util.ArrayList r0 = r0.getNonActionItems()
                int r0 = r0.size()
                androidx.appcompat.view.menu.ListMenuPresenter r1 = r2.this$0
                int r1 = r1.mItemIndexOffset
                int r0 = r0 - r1
                int r1 = r2.mExpandedIndex
                if (r1 >= 0) goto L16
                return r0
            L16:
                int r0 = r0 + (-1)
                return r0
        }

        @Override // android.widget.Adapter
        public androidx.appcompat.view.menu.MenuItemImpl getItem(int r3) {
                r2 = this;
                androidx.appcompat.view.menu.ListMenuPresenter r0 = r2.this$0
                androidx.appcompat.view.menu.MenuBuilder r0 = r0.mMenu
                java.util.ArrayList r0 = r0.getNonActionItems()
                androidx.appcompat.view.menu.ListMenuPresenter r1 = r2.this$0
                int r1 = r1.mItemIndexOffset
                int r3 = r3 + r1
                int r1 = r2.mExpandedIndex
                if (r1 < 0) goto L15
                if (r3 < r1) goto L15
                int r3 = r3 + 1
            L15:
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
        public android.view.View getView(int r3, android.view.View r4, android.view.ViewGroup r5) {
                r2 = this;
                r0 = 0
                if (r4 != 0) goto Lf
                androidx.appcompat.view.menu.ListMenuPresenter r4 = r2.this$0
                android.view.LayoutInflater r4 = r4.mInflater
                androidx.appcompat.view.menu.ListMenuPresenter r1 = r2.this$0
                int r1 = r1.mItemLayoutRes
                android.view.View r4 = r4.inflate(r1, r5, r0)
            Lf:
                r5 = r4
                androidx.appcompat.view.menu.MenuView$ItemView r5 = (androidx.appcompat.view.menu.MenuView.ItemView) r5
                androidx.appcompat.view.menu.MenuItemImpl r3 = r2.getItem(r3)
                r5.initialize(r3, r0)
                return r4
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
                r0 = this;
                r0.findExpandedIndex()
                super.notifyDataSetChanged()
                return
        }
    }

    public ListMenuPresenter(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.mItemLayoutRes = r1
            r0.mThemeRes = r2
            return
    }

    public ListMenuPresenter(android.content.Context r2, int r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r3, r0)
            r1.mContext = r2
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            r1.mInflater = r2
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean collapseItemActionView(androidx.appcompat.view.menu.MenuBuilder r1, androidx.appcompat.view.menu.MenuItemImpl r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean expandItemActionView(androidx.appcompat.view.menu.MenuBuilder r1, androidx.appcompat.view.menu.MenuItemImpl r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean flagActionItems() {
            r1 = this;
            r0 = 0
            return r0
    }

    public android.widget.ListAdapter getAdapter() {
            r1 = this;
            androidx.appcompat.view.menu.ListMenuPresenter$MenuAdapter r0 = r1.mAdapter
            if (r0 != 0) goto Lb
            androidx.appcompat.view.menu.ListMenuPresenter$MenuAdapter r0 = new androidx.appcompat.view.menu.ListMenuPresenter$MenuAdapter
            r0.<init>(r1)
            r1.mAdapter = r0
        Lb:
            androidx.appcompat.view.menu.ListMenuPresenter$MenuAdapter r0 = r1.mAdapter
            return r0
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public int getId() {
            r1 = this;
            int r0 = r1.mId
            return r0
    }

    int getItemIndexOffset() {
            r1 = this;
            int r0 = r1.mItemIndexOffset
            return r0
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public androidx.appcompat.view.menu.MenuView getMenuView(android.view.ViewGroup r4) {
            r3 = this;
            androidx.appcompat.view.menu.ExpandedMenuView r0 = r3.mMenuView
            if (r0 != 0) goto L28
            android.view.LayoutInflater r0 = r3.mInflater
            int r1 = androidx.appcompat.C0015R.layout.abc_expanded_menu_layout
            r2 = 0
            android.view.View r4 = r0.inflate(r1, r4, r2)
            androidx.appcompat.view.menu.ExpandedMenuView r4 = (androidx.appcompat.view.menu.ExpandedMenuView) r4
            r3.mMenuView = r4
            androidx.appcompat.view.menu.ListMenuPresenter$MenuAdapter r4 = r3.mAdapter
            if (r4 != 0) goto L1c
            androidx.appcompat.view.menu.ListMenuPresenter$MenuAdapter r4 = new androidx.appcompat.view.menu.ListMenuPresenter$MenuAdapter
            r4.<init>(r3)
            r3.mAdapter = r4
        L1c:
            androidx.appcompat.view.menu.ExpandedMenuView r4 = r3.mMenuView
            androidx.appcompat.view.menu.ListMenuPresenter$MenuAdapter r0 = r3.mAdapter
            r4.setAdapter(r0)
            androidx.appcompat.view.menu.ExpandedMenuView r4 = r3.mMenuView
            r4.setOnItemClickListener(r3)
        L28:
            androidx.appcompat.view.menu.ExpandedMenuView r4 = r3.mMenuView
            return r4
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void initForMenu(android.content.Context r3, androidx.appcompat.view.menu.MenuBuilder r4) {
            r2 = this;
            int r0 = r2.mThemeRes
            if (r0 == 0) goto L14
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            int r1 = r2.mThemeRes
            r0.<init>(r3, r1)
            r2.mContext = r0
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r0)
            r2.mInflater = r3
            goto L24
        L14:
            android.content.Context r0 = r2.mContext
            if (r0 == 0) goto L24
            r2.mContext = r3
            android.view.LayoutInflater r0 = r2.mInflater
            if (r0 != 0) goto L24
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r2.mInflater = r3
        L24:
            r2.mMenu = r4
            androidx.appcompat.view.menu.ListMenuPresenter$MenuAdapter r3 = r2.mAdapter
            if (r3 == 0) goto L2d
            r3.notifyDataSetChanged()
        L2d:
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onCloseMenu(androidx.appcompat.view.menu.MenuBuilder r2, boolean r3) {
            r1 = this;
            androidx.appcompat.view.menu.MenuPresenter$Callback r0 = r1.mCallback
            if (r0 == 0) goto L7
            r0.onCloseMenu(r2, r3)
        L7:
            return
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            androidx.appcompat.view.menu.MenuBuilder r1 = r0.mMenu
            androidx.appcompat.view.menu.ListMenuPresenter$MenuAdapter r2 = r0.mAdapter
            androidx.appcompat.view.menu.MenuItemImpl r2 = r2.getItem(r3)
            r3 = 0
            r1.performItemAction(r2, r0, r3)
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onRestoreInstanceState(android.os.Parcelable r1) {
            r0 = this;
            android.os.Bundle r1 = (android.os.Bundle) r1
            r0.restoreHierarchyState(r1)
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public android.os.Parcelable onSaveInstanceState() {
            r1 = this;
            androidx.appcompat.view.menu.ExpandedMenuView r0 = r1.mMenuView
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1.saveHierarchyState(r0)
            return r0
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean onSubMenuSelected(androidx.appcompat.view.menu.SubMenuBuilder r3) {
            r2 = this;
            boolean r0 = r3.hasVisibleItems()
            if (r0 != 0) goto L8
            r3 = 0
            return r3
        L8:
            androidx.appcompat.view.menu.MenuDialogHelper r0 = new androidx.appcompat.view.menu.MenuDialogHelper
            r0.<init>(r3)
            r1 = 0
            r0.show(r1)
            androidx.appcompat.view.menu.MenuPresenter$Callback r0 = r2.mCallback
            if (r0 == 0) goto L18
            r0.onOpenSubMenu(r3)
        L18:
            r3 = 1
            return r3
    }

    public void restoreHierarchyState(android.os.Bundle r2) {
            r1 = this;
            java.lang.String r0 = "android:menu:list"
            android.util.SparseArray r2 = r2.getSparseParcelableArray(r0)
            if (r2 == 0) goto Ld
            androidx.appcompat.view.menu.ExpandedMenuView r0 = r1.mMenuView
            r0.restoreHierarchyState(r2)
        Ld:
            return
    }

    public void saveHierarchyState(android.os.Bundle r3) {
            r2 = this;
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            androidx.appcompat.view.menu.ExpandedMenuView r1 = r2.mMenuView
            if (r1 == 0) goto Lc
            r1.saveHierarchyState(r0)
        Lc:
            java.lang.String r1 = "android:menu:list"
            r3.putSparseParcelableArray(r1, r0)
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void setCallback(androidx.appcompat.view.menu.MenuPresenter.Callback r1) {
            r0 = this;
            r0.mCallback = r1
            return
    }

    public void setId(int r1) {
            r0 = this;
            r0.mId = r1
            return
    }

    public void setItemIndexOffset(int r1) {
            r0 = this;
            r0.mItemIndexOffset = r1
            androidx.appcompat.view.menu.ExpandedMenuView r1 = r0.mMenuView
            if (r1 == 0) goto La
            r1 = 0
            r0.updateMenuView(r1)
        La:
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void updateMenuView(boolean r1) {
            r0 = this;
            androidx.appcompat.view.menu.ListMenuPresenter$MenuAdapter r1 = r0.mAdapter
            if (r1 == 0) goto L7
            r1.notifyDataSetChanged()
        L7:
            return
    }
}
