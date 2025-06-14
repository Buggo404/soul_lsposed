package com.google.android.material.bottomnavigation;

/* loaded from: classes.dex */
public class BottomNavigationPresenter implements androidx.appcompat.view.menu.MenuPresenter {

    /* renamed from: id */
    private int f110id;
    private androidx.appcompat.view.menu.MenuBuilder menu;
    private com.google.android.material.bottomnavigation.BottomNavigationMenuView menuView;
    private boolean updateSuspended;

    static class SavedState implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.google.android.material.bottomnavigation.BottomNavigationPresenter.SavedState> CREATOR = null;
        com.google.android.material.internal.ParcelableSparseArray badgeSavedStates;
        int selectedItemId;


        static {
                com.google.android.material.bottomnavigation.BottomNavigationPresenter$SavedState$1 r0 = new com.google.android.material.bottomnavigation.BottomNavigationPresenter$SavedState$1
                r0.<init>()
                com.google.android.material.bottomnavigation.BottomNavigationPresenter.SavedState.CREATOR = r0
                return
        }

        SavedState() {
                r0 = this;
                r0.<init>()
                return
        }

        SavedState(android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                int r0 = r2.readInt()
                r1.selectedItemId = r0
                java.lang.Class r0 = r1.getClass()
                java.lang.ClassLoader r0 = r0.getClassLoader()
                android.os.Parcelable r2 = r2.readParcelable(r0)
                com.google.android.material.internal.ParcelableSparseArray r2 = (com.google.android.material.internal.ParcelableSparseArray) r2
                r1.badgeSavedStates = r2
                return
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r2, int r3) {
                r1 = this;
                int r3 = r1.selectedItemId
                r2.writeInt(r3)
                com.google.android.material.internal.ParcelableSparseArray r3 = r1.badgeSavedStates
                r0 = 0
                r2.writeParcelable(r3, r0)
                return
        }
    }

    public BottomNavigationPresenter() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.updateSuspended = r0
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

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public int getId() {
            r1 = this;
            int r0 = r1.f110id
            return r0
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public androidx.appcompat.view.menu.MenuView getMenuView(android.view.ViewGroup r1) {
            r0 = this;
            com.google.android.material.bottomnavigation.BottomNavigationMenuView r1 = r0.menuView
            return r1
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void initForMenu(android.content.Context r1, androidx.appcompat.view.menu.MenuBuilder r2) {
            r0 = this;
            r0.menu = r2
            com.google.android.material.bottomnavigation.BottomNavigationMenuView r1 = r0.menuView
            r1.initialize(r2)
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onCloseMenu(androidx.appcompat.view.menu.MenuBuilder r1, boolean r2) {
            r0 = this;
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onRestoreInstanceState(android.os.Parcelable r3) {
            r2 = this;
            boolean r0 = r3 instanceof com.google.android.material.bottomnavigation.BottomNavigationPresenter.SavedState
            if (r0 == 0) goto L1e
            com.google.android.material.bottomnavigation.BottomNavigationMenuView r0 = r2.menuView
            com.google.android.material.bottomnavigation.BottomNavigationPresenter$SavedState r3 = (com.google.android.material.bottomnavigation.BottomNavigationPresenter.SavedState) r3
            int r1 = r3.selectedItemId
            r0.tryRestoreSelectedItemId(r1)
            com.google.android.material.bottomnavigation.BottomNavigationMenuView r0 = r2.menuView
            android.content.Context r0 = r0.getContext()
            com.google.android.material.internal.ParcelableSparseArray r3 = r3.badgeSavedStates
            android.util.SparseArray r3 = com.google.android.material.badge.BadgeUtils.createBadgeDrawablesFromSavedStates(r0, r3)
            com.google.android.material.bottomnavigation.BottomNavigationMenuView r0 = r2.menuView
            r0.setBadgeDrawables(r3)
        L1e:
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            com.google.android.material.bottomnavigation.BottomNavigationPresenter$SavedState r0 = new com.google.android.material.bottomnavigation.BottomNavigationPresenter$SavedState
            r0.<init>()
            com.google.android.material.bottomnavigation.BottomNavigationMenuView r1 = r2.menuView
            int r1 = r1.getSelectedItemId()
            r0.selectedItemId = r1
            com.google.android.material.bottomnavigation.BottomNavigationMenuView r1 = r2.menuView
            android.util.SparseArray r1 = r1.getBadgeDrawables()
            com.google.android.material.internal.ParcelableSparseArray r1 = com.google.android.material.badge.BadgeUtils.createParcelableBadgeStates(r1)
            r0.badgeSavedStates = r1
            return r0
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean onSubMenuSelected(androidx.appcompat.view.menu.SubMenuBuilder r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public void setBottomNavigationMenuView(com.google.android.material.bottomnavigation.BottomNavigationMenuView r1) {
            r0 = this;
            r0.menuView = r1
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void setCallback(androidx.appcompat.view.menu.MenuPresenter.Callback r1) {
            r0 = this;
            return
    }

    public void setId(int r1) {
            r0 = this;
            r0.f110id = r1
            return
    }

    public void setUpdateSuspended(boolean r1) {
            r0 = this;
            r0.updateSuspended = r1
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void updateMenuView(boolean r2) {
            r1 = this;
            boolean r0 = r1.updateSuspended
            if (r0 == 0) goto L5
            return
        L5:
            if (r2 == 0) goto Ld
            com.google.android.material.bottomnavigation.BottomNavigationMenuView r2 = r1.menuView
            r2.buildMenuView()
            goto L12
        Ld:
            com.google.android.material.bottomnavigation.BottomNavigationMenuView r2 = r1.menuView
            r2.updateMenuView()
        L12:
            return
    }
}
