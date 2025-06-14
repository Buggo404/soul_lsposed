package androidx.appcompat.view.menu;

/* loaded from: classes.dex */
final class CascadingMenuPopup extends androidx.appcompat.view.menu.MenuPopup implements androidx.appcompat.view.menu.MenuPresenter, android.view.View.OnKeyListener, android.widget.PopupWindow.OnDismissListener {
    static final int HORIZ_POSITION_LEFT = 0;
    static final int HORIZ_POSITION_RIGHT = 1;
    private static final int ITEM_LAYOUT = 0;
    static final int SUBMENU_TIMEOUT_MS = 200;
    private android.view.View mAnchorView;
    private final android.view.View.OnAttachStateChangeListener mAttachStateChangeListener;
    private final android.content.Context mContext;
    private int mDropDownGravity;
    private boolean mForceShowIcon;
    final android.view.ViewTreeObserver.OnGlobalLayoutListener mGlobalLayoutListener;
    private boolean mHasXOffset;
    private boolean mHasYOffset;
    private int mLastPosition;
    private final androidx.appcompat.widget.MenuItemHoverListener mMenuItemHoverListener;
    private final int mMenuMaxWidth;
    private android.widget.PopupWindow.OnDismissListener mOnDismissListener;
    private final boolean mOverflowOnly;
    private final java.util.List<androidx.appcompat.view.menu.MenuBuilder> mPendingMenus;
    private final int mPopupStyleAttr;
    private final int mPopupStyleRes;
    private androidx.appcompat.view.menu.MenuPresenter.Callback mPresenterCallback;
    private int mRawDropDownGravity;
    boolean mShouldCloseImmediately;
    private boolean mShowTitle;
    final java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo> mShowingMenus;
    android.view.View mShownAnchorView;
    final android.os.Handler mSubMenuHoverHandler;
    android.view.ViewTreeObserver mTreeObserver;
    private int mXOffset;
    private int mYOffset;




    private static class CascadingMenuInfo {
        public final androidx.appcompat.view.menu.MenuBuilder menu;
        public final int position;
        public final androidx.appcompat.widget.MenuPopupWindow window;

        public CascadingMenuInfo(androidx.appcompat.widget.MenuPopupWindow r1, androidx.appcompat.view.menu.MenuBuilder r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.window = r1
                r0.menu = r2
                r0.position = r3
                return
        }

        public android.widget.ListView getListView() {
                r1 = this;
                androidx.appcompat.widget.MenuPopupWindow r0 = r1.window
                android.widget.ListView r0 = r0.getListView()
                return r0
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface HorizPosition {
    }

    static {
            int r0 = androidx.appcompat.C0015R.layout.abc_cascading_menu_item_layout
            androidx.appcompat.view.menu.CascadingMenuPopup.ITEM_LAYOUT = r0
            return
    }

    public CascadingMenuPopup(android.content.Context r2, android.view.View r3, int r4, int r5, boolean r6) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mPendingMenus = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mShowingMenus = r0
            androidx.appcompat.view.menu.CascadingMenuPopup$1 r0 = new androidx.appcompat.view.menu.CascadingMenuPopup$1
            r0.<init>(r1)
            r1.mGlobalLayoutListener = r0
            androidx.appcompat.view.menu.CascadingMenuPopup$2 r0 = new androidx.appcompat.view.menu.CascadingMenuPopup$2
            r0.<init>(r1)
            r1.mAttachStateChangeListener = r0
            androidx.appcompat.view.menu.CascadingMenuPopup$3 r0 = new androidx.appcompat.view.menu.CascadingMenuPopup$3
            r0.<init>(r1)
            r1.mMenuItemHoverListener = r0
            r0 = 0
            r1.mRawDropDownGravity = r0
            r1.mDropDownGravity = r0
            r1.mContext = r2
            r1.mAnchorView = r3
            r1.mPopupStyleAttr = r4
            r1.mPopupStyleRes = r5
            r1.mOverflowOnly = r6
            r1.mForceShowIcon = r0
            int r3 = r1.getInitialMenuPosition()
            r1.mLastPosition = r3
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r3 = r2.getDisplayMetrics()
            int r3 = r3.widthPixels
            int r3 = r3 / 2
            int r4 = androidx.appcompat.C0015R.dimen.abc_config_prefDialogWidth
            int r2 = r2.getDimensionPixelSize(r4)
            int r2 = java.lang.Math.max(r3, r2)
            r1.mMenuMaxWidth = r2
            android.os.Handler r2 = new android.os.Handler
            r2.<init>()
            r1.mSubMenuHoverHandler = r2
            return
    }

    private androidx.appcompat.widget.MenuPopupWindow createPopupWindow() {
            r5 = this;
            androidx.appcompat.widget.MenuPopupWindow r0 = new androidx.appcompat.widget.MenuPopupWindow
            android.content.Context r1 = r5.mContext
            int r2 = r5.mPopupStyleAttr
            int r3 = r5.mPopupStyleRes
            r4 = 0
            r0.<init>(r1, r4, r2, r3)
            androidx.appcompat.widget.MenuItemHoverListener r1 = r5.mMenuItemHoverListener
            r0.setHoverListener(r1)
            r0.setOnItemClickListener(r5)
            r0.setOnDismissListener(r5)
            android.view.View r1 = r5.mAnchorView
            r0.setAnchorView(r1)
            int r1 = r5.mDropDownGravity
            r0.setDropDownGravity(r1)
            r1 = 1
            r0.setModal(r1)
            r1 = 2
            r0.setInputMethodMode(r1)
            return r0
    }

    private int findIndexOfAddedMenu(androidx.appcompat.view.menu.MenuBuilder r4) {
            r3 = this;
            java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo> r0 = r3.mShowingMenus
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L19
            java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo> r2 = r3.mShowingMenus
            java.lang.Object r2 = r2.get(r1)
            androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo r2 = (androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo) r2
            androidx.appcompat.view.menu.MenuBuilder r2 = r2.menu
            if (r4 != r2) goto L16
            return r1
        L16:
            int r1 = r1 + 1
            goto L7
        L19:
            r4 = -1
            return r4
    }

    private android.view.MenuItem findMenuItemForSubmenu(androidx.appcompat.view.menu.MenuBuilder r5, androidx.appcompat.view.menu.MenuBuilder r6) {
            r4 = this;
            int r0 = r5.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L1b
            android.view.MenuItem r2 = r5.getItem(r1)
            boolean r3 = r2.hasSubMenu()
            if (r3 == 0) goto L18
            android.view.SubMenu r3 = r2.getSubMenu()
            if (r6 != r3) goto L18
            return r2
        L18:
            int r1 = r1 + 1
            goto L5
        L1b:
            r5 = 0
            return r5
    }

    private android.view.View findParentViewForSubmenu(androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo r8, androidx.appcompat.view.menu.MenuBuilder r9) {
            r7 = this;
            androidx.appcompat.view.menu.MenuBuilder r0 = r8.menu
            android.view.MenuItem r9 = r7.findMenuItemForSubmenu(r0, r9)
            r0 = 0
            if (r9 != 0) goto La
            return r0
        La:
            android.widget.ListView r8 = r8.getListView()
            android.widget.ListAdapter r1 = r8.getAdapter()
            boolean r2 = r1 instanceof android.widget.HeaderViewListAdapter
            r3 = 0
            if (r2 == 0) goto L24
            android.widget.HeaderViewListAdapter r1 = (android.widget.HeaderViewListAdapter) r1
            int r2 = r1.getHeadersCount()
            android.widget.ListAdapter r1 = r1.getWrappedAdapter()
            androidx.appcompat.view.menu.MenuAdapter r1 = (androidx.appcompat.view.menu.MenuAdapter) r1
            goto L27
        L24:
            androidx.appcompat.view.menu.MenuAdapter r1 = (androidx.appcompat.view.menu.MenuAdapter) r1
            r2 = r3
        L27:
            int r4 = r1.getCount()
        L2b:
            r5 = -1
            if (r3 >= r4) goto L38
            androidx.appcompat.view.menu.MenuItemImpl r6 = r1.getItem(r3)
            if (r9 != r6) goto L35
            goto L39
        L35:
            int r3 = r3 + 1
            goto L2b
        L38:
            r3 = r5
        L39:
            if (r3 != r5) goto L3c
            return r0
        L3c:
            int r3 = r3 + r2
            int r9 = r8.getFirstVisiblePosition()
            int r3 = r3 - r9
            if (r3 < 0) goto L50
            int r9 = r8.getChildCount()
            if (r3 < r9) goto L4b
            goto L50
        L4b:
            android.view.View r8 = r8.getChildAt(r3)
            return r8
        L50:
            return r0
    }

    private int getInitialMenuPosition() {
            r2 = this;
            android.view.View r0 = r2.mAnchorView
            int r0 = androidx.core.view.ViewCompat.getLayoutDirection(r0)
            r1 = 1
            if (r0 != r1) goto La
            r1 = 0
        La:
            return r1
    }

    private int getNextMenuPosition(int r7) {
            r6 = this;
            java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo> r0 = r6.mShowingMenus
            int r1 = r0.size()
            r2 = 1
            int r1 = r1 - r2
            java.lang.Object r0 = r0.get(r1)
            androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo r0 = (androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo) r0
            android.widget.ListView r0 = r0.getListView()
            r1 = 2
            int[] r1 = new int[r1]
            r0.getLocationOnScreen(r1)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            android.view.View r4 = r6.mShownAnchorView
            r4.getWindowVisibleDisplayFrame(r3)
            int r4 = r6.mLastPosition
            r5 = 0
            if (r4 != r2) goto L35
            r1 = r1[r5]
            int r0 = r0.getWidth()
            int r1 = r1 + r0
            int r1 = r1 + r7
            int r7 = r3.right
            if (r1 <= r7) goto L34
            return r5
        L34:
            return r2
        L35:
            r0 = r1[r5]
            int r0 = r0 - r7
            if (r0 >= 0) goto L3b
            return r2
        L3b:
            return r5
    }

    private void showMenu(androidx.appcompat.view.menu.MenuBuilder r15) {
            r14 = this;
            android.content.Context r0 = r14.mContext
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            androidx.appcompat.view.menu.MenuAdapter r1 = new androidx.appcompat.view.menu.MenuAdapter
            boolean r2 = r14.mOverflowOnly
            int r3 = androidx.appcompat.view.menu.CascadingMenuPopup.ITEM_LAYOUT
            r1.<init>(r15, r0, r2, r3)
            boolean r2 = r14.isShowing()
            r3 = 1
            if (r2 != 0) goto L1e
            boolean r2 = r14.mForceShowIcon
            if (r2 == 0) goto L1e
            r1.setForceShowIcon(r3)
            goto L2b
        L1e:
            boolean r2 = r14.isShowing()
            if (r2 == 0) goto L2b
            boolean r2 = androidx.appcompat.view.menu.MenuPopup.shouldPreserveIconSpacing(r15)
            r1.setForceShowIcon(r2)
        L2b:
            android.content.Context r2 = r14.mContext
            int r4 = r14.mMenuMaxWidth
            r5 = 0
            int r2 = measureIndividualMenuWidth(r1, r5, r2, r4)
            androidx.appcompat.widget.MenuPopupWindow r4 = r14.createPopupWindow()
            r4.setAdapter(r1)
            r4.setContentWidth(r2)
            int r1 = r14.mDropDownGravity
            r4.setDropDownGravity(r1)
            java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo> r1 = r14.mShowingMenus
            int r1 = r1.size()
            if (r1 <= 0) goto L5d
            java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo> r1 = r14.mShowingMenus
            int r6 = r1.size()
            int r6 = r6 - r3
            java.lang.Object r1 = r1.get(r6)
            androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo r1 = (androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo) r1
            android.view.View r6 = r14.findParentViewForSubmenu(r1, r15)
            goto L5f
        L5d:
            r1 = r5
            r6 = r1
        L5f:
            r7 = 0
            if (r6 == 0) goto Ld1
            r4.setTouchModal(r7)
            r4.setEnterTransition(r5)
            int r8 = r14.getNextMenuPosition(r2)
            if (r8 != r3) goto L70
            r9 = r3
            goto L71
        L70:
            r9 = r7
        L71:
            r14.mLastPosition = r8
            int r8 = android.os.Build.VERSION.SDK_INT
            r10 = 26
            r11 = 5
            if (r8 < r10) goto L80
            r4.setAnchorView(r6)
            r8 = r7
            r12 = r8
            goto Lb1
        L80:
            r8 = 2
            int[] r10 = new int[r8]
            android.view.View r12 = r14.mAnchorView
            r12.getLocationOnScreen(r10)
            int[] r8 = new int[r8]
            r6.getLocationOnScreen(r8)
            int r12 = r14.mDropDownGravity
            r12 = r12 & 7
            if (r12 != r11) goto La7
            r12 = r10[r7]
            android.view.View r13 = r14.mAnchorView
            int r13 = r13.getWidth()
            int r12 = r12 + r13
            r10[r7] = r12
            r12 = r8[r7]
            int r13 = r6.getWidth()
            int r12 = r12 + r13
            r8[r7] = r12
        La7:
            r12 = r8[r7]
            r13 = r10[r7]
            int r12 = r12 - r13
            r8 = r8[r3]
            r10 = r10[r3]
            int r8 = r8 - r10
        Lb1:
            int r10 = r14.mDropDownGravity
            r10 = r10 & r11
            if (r10 != r11) goto Lbe
            if (r9 == 0) goto Lb9
            goto Lc4
        Lb9:
            int r2 = r6.getWidth()
            goto Lc6
        Lbe:
            if (r9 == 0) goto Lc6
            int r2 = r6.getWidth()
        Lc4:
            int r12 = r12 + r2
            goto Lc7
        Lc6:
            int r12 = r12 - r2
        Lc7:
            r4.setHorizontalOffset(r12)
            r4.setOverlapAnchor(r3)
            r4.setVerticalOffset(r8)
            goto Lea
        Ld1:
            boolean r2 = r14.mHasXOffset
            if (r2 == 0) goto Lda
            int r2 = r14.mXOffset
            r4.setHorizontalOffset(r2)
        Lda:
            boolean r2 = r14.mHasYOffset
            if (r2 == 0) goto Le3
            int r2 = r14.mYOffset
            r4.setVerticalOffset(r2)
        Le3:
            android.graphics.Rect r2 = r14.getEpicenterBounds()
            r4.setEpicenterBounds(r2)
        Lea:
            androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo r2 = new androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo
            int r3 = r14.mLastPosition
            r2.<init>(r4, r15, r3)
            java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo> r3 = r14.mShowingMenus
            r3.add(r2)
            r4.show()
            android.widget.ListView r2 = r4.getListView()
            r2.setOnKeyListener(r14)
            if (r1 != 0) goto L12d
            boolean r1 = r14.mShowTitle
            if (r1 == 0) goto L12d
            java.lang.CharSequence r1 = r15.getHeaderTitle()
            if (r1 == 0) goto L12d
            int r1 = androidx.appcompat.C0015R.layout.abc_popup_menu_header_item_layout
            android.view.View r0 = r0.inflate(r1, r2, r7)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r1 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.setEnabled(r7)
            java.lang.CharSequence r15 = r15.getHeaderTitle()
            r1.setText(r15)
            r2.addHeaderView(r0, r5, r7)
            r4.show()
        L12d:
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void addMenu(androidx.appcompat.view.menu.MenuBuilder r2) {
            r1 = this;
            android.content.Context r0 = r1.mContext
            r2.addMenuPresenter(r1, r0)
            boolean r0 = r1.isShowing()
            if (r0 == 0) goto Lf
            r1.showMenu(r2)
            goto L14
        Lf:
            java.util.List<androidx.appcompat.view.menu.MenuBuilder> r0 = r1.mPendingMenus
            r0.add(r2)
        L14:
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    protected boolean closeMenuOnSubMenuOpened() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void dismiss() {
            r4 = this;
            java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo> r0 = r4.mShowingMenus
            int r0 = r0.size()
            if (r0 <= 0) goto L28
            java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo> r1 = r4.mShowingMenus
            androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo[] r2 = new androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo[r0]
            java.lang.Object[] r1 = r1.toArray(r2)
            androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo[] r1 = (androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo[]) r1
            int r0 = r0 + (-1)
        L14:
            if (r0 < 0) goto L28
            r2 = r1[r0]
            androidx.appcompat.widget.MenuPopupWindow r3 = r2.window
            boolean r3 = r3.isShowing()
            if (r3 == 0) goto L25
            androidx.appcompat.widget.MenuPopupWindow r2 = r2.window
            r2.dismiss()
        L25:
            int r0 = r0 + (-1)
            goto L14
        L28:
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean flagActionItems() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public android.widget.ListView getListView() {
            r2 = this;
            java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo> r0 = r2.mShowingMenus
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto La
            r0 = 0
            goto L1c
        La:
            java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo> r0 = r2.mShowingMenus
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo r0 = (androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo) r0
            android.widget.ListView r0 = r0.getListView()
        L1c:
            return r0
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public boolean isShowing() {
            r2 = this;
            java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo> r0 = r2.mShowingMenus
            int r0 = r0.size()
            r1 = 0
            if (r0 <= 0) goto L1a
            java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo> r0 = r2.mShowingMenus
            java.lang.Object r0 = r0.get(r1)
            androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo r0 = (androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo) r0
            androidx.appcompat.widget.MenuPopupWindow r0 = r0.window
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L1a
            r1 = 1
        L1a:
            return r1
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onCloseMenu(androidx.appcompat.view.menu.MenuBuilder r6, boolean r7) {
            r5 = this;
            int r0 = r5.findIndexOfAddedMenu(r6)
            if (r0 >= 0) goto L7
            return
        L7:
            int r1 = r0 + 1
            java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo> r2 = r5.mShowingMenus
            int r2 = r2.size()
            r3 = 0
            if (r1 >= r2) goto L1f
            java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo> r2 = r5.mShowingMenus
            java.lang.Object r1 = r2.get(r1)
            androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo r1 = (androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo) r1
            androidx.appcompat.view.menu.MenuBuilder r1 = r1.menu
            r1.close(r3)
        L1f:
            java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo> r1 = r5.mShowingMenus
            java.lang.Object r0 = r1.remove(r0)
            androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo r0 = (androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo) r0
            androidx.appcompat.view.menu.MenuBuilder r1 = r0.menu
            r1.removeMenuPresenter(r5)
            boolean r1 = r5.mShouldCloseImmediately
            r2 = 0
            if (r1 == 0) goto L3b
            androidx.appcompat.widget.MenuPopupWindow r1 = r0.window
            r1.setExitTransition(r2)
            androidx.appcompat.widget.MenuPopupWindow r1 = r0.window
            r1.setAnimationStyle(r3)
        L3b:
            androidx.appcompat.widget.MenuPopupWindow r0 = r0.window
            r0.dismiss()
            java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo> r0 = r5.mShowingMenus
            int r0 = r0.size()
            if (r0 <= 0) goto L57
            java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo> r1 = r5.mShowingMenus
            int r4 = r0 + (-1)
            java.lang.Object r1 = r1.get(r4)
            androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo r1 = (androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo) r1
            int r1 = r1.position
            r5.mLastPosition = r1
            goto L5d
        L57:
            int r1 = r5.getInitialMenuPosition()
            r5.mLastPosition = r1
        L5d:
            if (r0 != 0) goto L8a
            r5.dismiss()
            androidx.appcompat.view.menu.MenuPresenter$Callback r7 = r5.mPresenterCallback
            if (r7 == 0) goto L6a
            r0 = 1
            r7.onCloseMenu(r6, r0)
        L6a:
            android.view.ViewTreeObserver r6 = r5.mTreeObserver
            if (r6 == 0) goto L7d
            boolean r6 = r6.isAlive()
            if (r6 == 0) goto L7b
            android.view.ViewTreeObserver r6 = r5.mTreeObserver
            android.view.ViewTreeObserver$OnGlobalLayoutListener r7 = r5.mGlobalLayoutListener
            r6.removeGlobalOnLayoutListener(r7)
        L7b:
            r5.mTreeObserver = r2
        L7d:
            android.view.View r6 = r5.mShownAnchorView
            android.view.View$OnAttachStateChangeListener r7 = r5.mAttachStateChangeListener
            r6.removeOnAttachStateChangeListener(r7)
            android.widget.PopupWindow$OnDismissListener r6 = r5.mOnDismissListener
            r6.onDismiss()
            goto L99
        L8a:
            if (r7 == 0) goto L99
            java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo> r6 = r5.mShowingMenus
            java.lang.Object r6 = r6.get(r3)
            androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo r6 = (androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo) r6
            androidx.appcompat.view.menu.MenuBuilder r6 = r6.menu
            r6.close(r3)
        L99:
            return
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
            r5 = this;
            java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo> r0 = r5.mShowingMenus
            int r0 = r0.size()
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L1e
            java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo> r3 = r5.mShowingMenus
            java.lang.Object r3 = r3.get(r2)
            androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo r3 = (androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo) r3
            androidx.appcompat.widget.MenuPopupWindow r4 = r3.window
            boolean r4 = r4.isShowing()
            if (r4 != 0) goto L1b
            goto L1f
        L1b:
            int r2 = r2 + 1
            goto L8
        L1e:
            r3 = 0
        L1f:
            if (r3 == 0) goto L26
            androidx.appcompat.view.menu.MenuBuilder r0 = r3.menu
            r0.close(r1)
        L26:
            return
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(android.view.View r1, int r2, android.view.KeyEvent r3) {
            r0 = this;
            int r1 = r3.getAction()
            r3 = 1
            if (r1 != r3) goto Lf
            r1 = 82
            if (r2 != r1) goto Lf
            r0.dismiss()
            return r3
        Lf:
            r1 = 0
            return r1
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onRestoreInstanceState(android.os.Parcelable r1) {
            r0 = this;
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public android.os.Parcelable onSaveInstanceState() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean onSubMenuSelected(androidx.appcompat.view.menu.SubMenuBuilder r5) {
            r4 = this;
            java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo> r0 = r4.mShowingMenus
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            r2 = 1
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo r1 = (androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo) r1
            androidx.appcompat.view.menu.MenuBuilder r3 = r1.menu
            if (r5 != r3) goto L6
            android.widget.ListView r5 = r1.getListView()
            r5.requestFocus()
            return r2
        L1f:
            boolean r0 = r5.hasVisibleItems()
            if (r0 == 0) goto L30
            r4.addMenu(r5)
            androidx.appcompat.view.menu.MenuPresenter$Callback r0 = r4.mPresenterCallback
            if (r0 == 0) goto L2f
            r0.onOpenSubMenu(r5)
        L2f:
            return r2
        L30:
            r5 = 0
            return r5
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setAnchorView(android.view.View r2) {
            r1 = this;
            android.view.View r0 = r1.mAnchorView
            if (r0 == r2) goto L12
            r1.mAnchorView = r2
            int r0 = r1.mRawDropDownGravity
            int r2 = androidx.core.view.ViewCompat.getLayoutDirection(r2)
            int r2 = androidx.core.view.GravityCompat.getAbsoluteGravity(r0, r2)
            r1.mDropDownGravity = r2
        L12:
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void setCallback(androidx.appcompat.view.menu.MenuPresenter.Callback r1) {
            r0 = this;
            r0.mPresenterCallback = r1
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setForceShowIcon(boolean r1) {
            r0 = this;
            r0.mForceShowIcon = r1
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setGravity(int r2) {
            r1 = this;
            int r0 = r1.mRawDropDownGravity
            if (r0 == r2) goto L12
            r1.mRawDropDownGravity = r2
            android.view.View r0 = r1.mAnchorView
            int r0 = androidx.core.view.ViewCompat.getLayoutDirection(r0)
            int r2 = androidx.core.view.GravityCompat.getAbsoluteGravity(r2, r0)
            r1.mDropDownGravity = r2
        L12:
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setHorizontalOffset(int r2) {
            r1 = this;
            r0 = 1
            r1.mHasXOffset = r0
            r1.mXOffset = r2
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setOnDismissListener(android.widget.PopupWindow.OnDismissListener r1) {
            r0 = this;
            r0.mOnDismissListener = r1
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setShowTitle(boolean r1) {
            r0 = this;
            r0.mShowTitle = r1
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setVerticalOffset(int r2) {
            r1 = this;
            r0 = 1
            r1.mHasYOffset = r0
            r1.mYOffset = r2
            return
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void show() {
            r2 = this;
            boolean r0 = r2.isShowing()
            if (r0 == 0) goto L7
            return
        L7:
            java.util.List<androidx.appcompat.view.menu.MenuBuilder> r0 = r2.mPendingMenus
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            androidx.appcompat.view.menu.MenuBuilder r1 = (androidx.appcompat.view.menu.MenuBuilder) r1
            r2.showMenu(r1)
            goto Ld
        L1d:
            java.util.List<androidx.appcompat.view.menu.MenuBuilder> r0 = r2.mPendingMenus
            r0.clear()
            android.view.View r0 = r2.mAnchorView
            r2.mShownAnchorView = r0
            if (r0 == 0) goto L43
            android.view.ViewTreeObserver r1 = r2.mTreeObserver
            if (r1 != 0) goto L2e
            r1 = 1
            goto L2f
        L2e:
            r1 = 0
        L2f:
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r2.mTreeObserver = r0
            if (r1 == 0) goto L3c
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = r2.mGlobalLayoutListener
            r0.addOnGlobalLayoutListener(r1)
        L3c:
            android.view.View r0 = r2.mShownAnchorView
            android.view.View$OnAttachStateChangeListener r1 = r2.mAttachStateChangeListener
            r0.addOnAttachStateChangeListener(r1)
        L43:
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void updateMenuView(boolean r2) {
            r1 = this;
            java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo> r2 = r1.mShowingMenus
            java.util.Iterator r2 = r2.iterator()
        L6:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r2.next()
            androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo r0 = (androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo) r0
            android.widget.ListView r0 = r0.getListView()
            android.widget.ListAdapter r0 = r0.getAdapter()
            androidx.appcompat.view.menu.MenuAdapter r0 = toMenuAdapter(r0)
            r0.notifyDataSetChanged()
            goto L6
        L22:
            return
    }
}
