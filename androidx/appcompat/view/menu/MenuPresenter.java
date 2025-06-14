package androidx.appcompat.view.menu;

/* loaded from: classes.dex */
public interface MenuPresenter {

    public interface Callback {
        void onCloseMenu(androidx.appcompat.view.menu.MenuBuilder r1, boolean r2);

        boolean onOpenSubMenu(androidx.appcompat.view.menu.MenuBuilder r1);
    }

    boolean collapseItemActionView(androidx.appcompat.view.menu.MenuBuilder r1, androidx.appcompat.view.menu.MenuItemImpl r2);

    boolean expandItemActionView(androidx.appcompat.view.menu.MenuBuilder r1, androidx.appcompat.view.menu.MenuItemImpl r2);

    boolean flagActionItems();

    int getId();

    androidx.appcompat.view.menu.MenuView getMenuView(android.view.ViewGroup r1);

    void initForMenu(android.content.Context r1, androidx.appcompat.view.menu.MenuBuilder r2);

    void onCloseMenu(androidx.appcompat.view.menu.MenuBuilder r1, boolean r2);

    void onRestoreInstanceState(android.os.Parcelable r1);

    android.os.Parcelable onSaveInstanceState();

    boolean onSubMenuSelected(androidx.appcompat.view.menu.SubMenuBuilder r1);

    void setCallback(androidx.appcompat.view.menu.MenuPresenter.Callback r1);

    void updateMenuView(boolean r1);
}
