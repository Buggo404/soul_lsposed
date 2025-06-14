package androidx.appcompat.widget;

/* loaded from: classes.dex */
public interface DecorToolbar {
    void animateToVisibility(int r1);

    boolean canShowOverflowMenu();

    void collapseActionView();

    void dismissPopupMenus();

    android.content.Context getContext();

    android.view.View getCustomView();

    int getDisplayOptions();

    int getDropdownItemCount();

    int getDropdownSelectedPosition();

    int getHeight();

    android.view.Menu getMenu();

    int getNavigationMode();

    java.lang.CharSequence getSubtitle();

    java.lang.CharSequence getTitle();

    android.view.ViewGroup getViewGroup();

    int getVisibility();

    boolean hasEmbeddedTabs();

    boolean hasExpandedActionView();

    boolean hasIcon();

    boolean hasLogo();

    boolean hideOverflowMenu();

    void initIndeterminateProgress();

    void initProgress();

    boolean isOverflowMenuShowPending();

    boolean isOverflowMenuShowing();

    boolean isTitleTruncated();

    void restoreHierarchyState(android.util.SparseArray<android.os.Parcelable> r1);

    void saveHierarchyState(android.util.SparseArray<android.os.Parcelable> r1);

    void setBackgroundDrawable(android.graphics.drawable.Drawable r1);

    void setCollapsible(boolean r1);

    void setCustomView(android.view.View r1);

    void setDefaultNavigationContentDescription(int r1);

    void setDefaultNavigationIcon(android.graphics.drawable.Drawable r1);

    void setDisplayOptions(int r1);

    void setDropdownParams(android.widget.SpinnerAdapter r1, android.widget.AdapterView.OnItemSelectedListener r2);

    void setDropdownSelectedPosition(int r1);

    void setEmbeddedTabView(androidx.appcompat.widget.ScrollingTabContainerView r1);

    void setHomeButtonEnabled(boolean r1);

    void setIcon(int r1);

    void setIcon(android.graphics.drawable.Drawable r1);

    void setLogo(int r1);

    void setLogo(android.graphics.drawable.Drawable r1);

    void setMenu(android.view.Menu r1, androidx.appcompat.view.menu.MenuPresenter.Callback r2);

    void setMenuCallbacks(androidx.appcompat.view.menu.MenuPresenter.Callback r1, androidx.appcompat.view.menu.MenuBuilder.Callback r2);

    void setMenuPrepared();

    void setNavigationContentDescription(int r1);

    void setNavigationContentDescription(java.lang.CharSequence r1);

    void setNavigationIcon(int r1);

    void setNavigationIcon(android.graphics.drawable.Drawable r1);

    void setNavigationMode(int r1);

    void setSubtitle(java.lang.CharSequence r1);

    void setTitle(java.lang.CharSequence r1);

    void setVisibility(int r1);

    void setWindowCallback(android.view.Window.Callback r1);

    void setWindowTitle(java.lang.CharSequence r1);

    androidx.core.view.ViewPropertyAnimatorCompat setupAnimatorToVisibility(int r1, long r2);

    boolean showOverflowMenu();
}
