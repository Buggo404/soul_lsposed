package androidx.appcompat.view.menu;

/* loaded from: classes.dex */
final class StandardMenuPopup extends androidx.appcompat.view.menu.MenuPopup implements android.widget.PopupWindow.OnDismissListener, android.widget.AdapterView.OnItemClickListener, androidx.appcompat.view.menu.MenuPresenter, android.view.View.OnKeyListener {
    private static final int ITEM_LAYOUT = 0;
    private final androidx.appcompat.view.menu.MenuAdapter mAdapter;
    private android.view.View mAnchorView;
    private final android.view.View.OnAttachStateChangeListener mAttachStateChangeListener;
    private int mContentWidth;
    private final android.content.Context mContext;
    private int mDropDownGravity;
    final android.view.ViewTreeObserver.OnGlobalLayoutListener mGlobalLayoutListener;
    private boolean mHasContentWidth;
    private final androidx.appcompat.view.menu.MenuBuilder mMenu;
    private android.widget.PopupWindow.OnDismissListener mOnDismissListener;
    private final boolean mOverflowOnly;
    final androidx.appcompat.widget.MenuPopupWindow mPopup;
    private final int mPopupMaxWidth;
    private final int mPopupStyleAttr;
    private final int mPopupStyleRes;
    private androidx.appcompat.view.menu.MenuPresenter.Callback mPresenterCallback;
    private boolean mShowTitle;
    android.view.View mShownAnchorView;
    android.view.ViewTreeObserver mTreeObserver;
    private boolean mWasDismissed;



    static {
            int r0 = androidx.appcompat.C0015R.layout.abc_popup_menu_item_layout
            androidx.appcompat.view.menu.StandardMenuPopup.ITEM_LAYOUT = r0
            return
    }

    public StandardMenuPopup(android.content.Context r4, androidx.appcompat.view.menu.MenuBuilder r5, android.view.View r6, int r7, int r8, boolean r9) {
            r3 = this;
            r3.<init>()
            androidx.appcompat.view.menu.StandardMenuPopup$1 r0 = new androidx.appcompat.view.menu.StandardMenuPopup$1
            r0.<init>(r3)
            r3.mGlobalLayoutListener = r0
            androidx.appcompat.view.menu.StandardMenuPopup$2 r0 = new androidx.appcompat.view.menu.StandardMenuPopup$2
            r0.<init>(r3)
            r3.mAttachStateChangeListener = r0
            r0 = 0
            r3.mDropDownGravity = r0
            r3.mContext = r4
            r3.mMenu = r5
            r3.mOverflowOnly = r9
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r4)
            androidx.appcompat.view.menu.MenuAdapter r1 = new androidx.appcompat.view.menu.MenuAdapter
            int r2 = androidx.appcompat.view.menu.StandardMenuPopup.ITEM_LAYOUT
            r1.<init>(r5, r0, r9, r2)
            r3.mAdapter = r1
            r3.mPopupStyleAttr = r7
            r3.mPopupStyleRes = r8
            android.content.res.Resources r9 = r4.getResources()
            android.util.DisplayMetrics r0 = r9.getDisplayMetrics()
            int r0 = r0.widthPixels
            int r0 = r0 / 2
            int r1 = androidx.appcompat.C0015R.dimen.abc_config_prefDialogWidth
            int r9 = r9.getDimensionPixelSize(r1)
            int r9 = java.lang.Math.max(r0, r9)
            r3.mPopupMaxWidth = r9
            r3.mAnchorView = r6
            androidx.appcompat.widget.MenuPopupWindow r6 = new androidx.appcompat.widget.MenuPopupWindow
            r9 = 0
            r6.<init>(r4, r9, r7, r8)
            r3.mPopup = r6
            r5.addMenuPresenter(r3, r4)
            return
    }

    private boolean tryShow() {
            r7 = this;
            boolean r0 = r7.isShowing()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r7.mWasDismissed
            r2 = 0
            if (r0 != 0) goto Lc3
            android.view.View r0 = r7.mAnchorView
            if (r0 != 0) goto L13
            goto Lc3
        L13:
            r7.mShownAnchorView = r0
            androidx.appcompat.widget.MenuPopupWindow r0 = r7.mPopup
            r0.setOnDismissListener(r7)
            androidx.appcompat.widget.MenuPopupWindow r0 = r7.mPopup
            r0.setOnItemClickListener(r7)
            androidx.appcompat.widget.MenuPopupWindow r0 = r7.mPopup
            r0.setModal(r1)
            android.view.View r0 = r7.mShownAnchorView
            android.view.ViewTreeObserver r3 = r7.mTreeObserver
            if (r3 != 0) goto L2c
            r3 = r1
            goto L2d
        L2c:
            r3 = r2
        L2d:
            android.view.ViewTreeObserver r4 = r0.getViewTreeObserver()
            r7.mTreeObserver = r4
            if (r3 == 0) goto L3a
            android.view.ViewTreeObserver$OnGlobalLayoutListener r3 = r7.mGlobalLayoutListener
            r4.addOnGlobalLayoutListener(r3)
        L3a:
            android.view.View$OnAttachStateChangeListener r3 = r7.mAttachStateChangeListener
            r0.addOnAttachStateChangeListener(r3)
            androidx.appcompat.widget.MenuPopupWindow r3 = r7.mPopup
            r3.setAnchorView(r0)
            androidx.appcompat.widget.MenuPopupWindow r0 = r7.mPopup
            int r3 = r7.mDropDownGravity
            r0.setDropDownGravity(r3)
            boolean r0 = r7.mHasContentWidth
            r3 = 0
            if (r0 != 0) goto L5e
            androidx.appcompat.view.menu.MenuAdapter r0 = r7.mAdapter
            android.content.Context r4 = r7.mContext
            int r5 = r7.mPopupMaxWidth
            int r0 = measureIndividualMenuWidth(r0, r3, r4, r5)
            r7.mContentWidth = r0
            r7.mHasContentWidth = r1
        L5e:
            androidx.appcompat.widget.MenuPopupWindow r0 = r7.mPopup
            int r4 = r7.mContentWidth
            r0.setContentWidth(r4)
            androidx.appcompat.widget.MenuPopupWindow r0 = r7.mPopup
            r4 = 2
            r0.setInputMethodMode(r4)
            androidx.appcompat.widget.MenuPopupWindow r0 = r7.mPopup
            android.graphics.Rect r4 = r7.getEpicenterBounds()
            r0.setEpicenterBounds(r4)
            androidx.appcompat.widget.MenuPopupWindow r0 = r7.mPopup
            r0.show()
            androidx.appcompat.widget.MenuPopupWindow r0 = r7.mPopup
            android.widget.ListView r0 = r0.getListView()
            r0.setOnKeyListener(r7)
            boolean r4 = r7.mShowTitle
            if (r4 == 0) goto Lb6
            androidx.appcompat.view.menu.MenuBuilder r4 = r7.mMenu
            java.lang.CharSequence r4 = r4.getHeaderTitle()
            if (r4 == 0) goto Lb6
            android.content.Context r4 = r7.mContext
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            int r5 = androidx.appcompat.C0015R.layout.abc_popup_menu_header_item_layout
            android.view.View r4 = r4.inflate(r5, r0, r2)
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            r5 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto Lb0
            androidx.appcompat.view.menu.MenuBuilder r6 = r7.mMenu
            java.lang.CharSequence r6 = r6.getHeaderTitle()
            r5.setText(r6)
        Lb0:
            r4.setEnabled(r2)
            r0.addHeaderView(r4, r3, r2)
        Lb6:
            androidx.appcompat.widget.MenuPopupWindow r0 = r7.mPopup
            androidx.appcompat.view.menu.MenuAdapter r2 = r7.mAdapter
            r0.setAdapter(r2)
            androidx.appcompat.widget.MenuPopupWindow r0 = r7.mPopup
            r0.show()
            return r1
        Lc3:
            return r2
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void addMenu(androidx.appcompat.view.menu.MenuBuilder r1) {
            r0 = this;
            return
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void dismiss() {
            r1 = this;
            boolean r0 = r1.isShowing()
            if (r0 == 0) goto Lb
            androidx.appcompat.widget.MenuPopupWindow r0 = r1.mPopup
            r0.dismiss()
        Lb:
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
            r1 = this;
            androidx.appcompat.widget.MenuPopupWindow r0 = r1.mPopup
            android.widget.ListView r0 = r0.getListView()
            return r0
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public boolean isShowing() {
            r1 = this;
            boolean r0 = r1.mWasDismissed
            if (r0 != 0) goto Le
            androidx.appcompat.widget.MenuPopupWindow r0 = r1.mPopup
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onCloseMenu(androidx.appcompat.view.menu.MenuBuilder r2, boolean r3) {
            r1 = this;
            androidx.appcompat.view.menu.MenuBuilder r0 = r1.mMenu
            if (r2 == r0) goto L5
            return
        L5:
            r1.dismiss()
            androidx.appcompat.view.menu.MenuPresenter$Callback r0 = r1.mPresenterCallback
            if (r0 == 0) goto Lf
            r0.onCloseMenu(r2, r3)
        Lf:
            return
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
            r2 = this;
            r0 = 1
            r2.mWasDismissed = r0
            androidx.appcompat.view.menu.MenuBuilder r0 = r2.mMenu
            r0.close()
            android.view.ViewTreeObserver r0 = r2.mTreeObserver
            if (r0 == 0) goto L24
            boolean r0 = r0.isAlive()
            if (r0 != 0) goto L1a
            android.view.View r0 = r2.mShownAnchorView
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r2.mTreeObserver = r0
        L1a:
            android.view.ViewTreeObserver r0 = r2.mTreeObserver
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = r2.mGlobalLayoutListener
            r0.removeGlobalOnLayoutListener(r1)
            r0 = 0
            r2.mTreeObserver = r0
        L24:
            android.view.View r0 = r2.mShownAnchorView
            android.view.View$OnAttachStateChangeListener r1 = r2.mAttachStateChangeListener
            r0.removeOnAttachStateChangeListener(r1)
            android.widget.PopupWindow$OnDismissListener r0 = r2.mOnDismissListener
            if (r0 == 0) goto L32
            r0.onDismiss()
        L32:
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
    public boolean onSubMenuSelected(androidx.appcompat.view.menu.SubMenuBuilder r10) {
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L64
            androidx.appcompat.view.menu.MenuPopupHelper r0 = new androidx.appcompat.view.menu.MenuPopupHelper
            android.content.Context r3 = r9.mContext
            android.view.View r5 = r9.mShownAnchorView
            boolean r6 = r9.mOverflowOnly
            int r7 = r9.mPopupStyleAttr
            int r8 = r9.mPopupStyleRes
            r2 = r0
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            androidx.appcompat.view.menu.MenuPresenter$Callback r2 = r9.mPresenterCallback
            r0.setPresenterCallback(r2)
            boolean r2 = androidx.appcompat.view.menu.MenuPopup.shouldPreserveIconSpacing(r10)
            r0.setForceShowIcon(r2)
            android.widget.PopupWindow$OnDismissListener r2 = r9.mOnDismissListener
            r0.setOnDismissListener(r2)
            r2 = 0
            r9.mOnDismissListener = r2
            androidx.appcompat.view.menu.MenuBuilder r2 = r9.mMenu
            r2.close(r1)
            androidx.appcompat.widget.MenuPopupWindow r2 = r9.mPopup
            int r2 = r2.getHorizontalOffset()
            androidx.appcompat.widget.MenuPopupWindow r3 = r9.mPopup
            int r3 = r3.getVerticalOffset()
            int r4 = r9.mDropDownGravity
            android.view.View r5 = r9.mAnchorView
            int r5 = androidx.core.view.ViewCompat.getLayoutDirection(r5)
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L55
            android.view.View r4 = r9.mAnchorView
            int r4 = r4.getWidth()
            int r2 = r2 + r4
        L55:
            boolean r0 = r0.tryShow(r2, r3)
            if (r0 == 0) goto L64
            androidx.appcompat.view.menu.MenuPresenter$Callback r0 = r9.mPresenterCallback
            if (r0 == 0) goto L62
            r0.onOpenSubMenu(r10)
        L62:
            r10 = 1
            return r10
        L64:
            return r1
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setAnchorView(android.view.View r1) {
            r0 = this;
            r0.mAnchorView = r1
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void setCallback(androidx.appcompat.view.menu.MenuPresenter.Callback r1) {
            r0 = this;
            r0.mPresenterCallback = r1
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setForceShowIcon(boolean r2) {
            r1 = this;
            androidx.appcompat.view.menu.MenuAdapter r0 = r1.mAdapter
            r0.setForceShowIcon(r2)
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setGravity(int r1) {
            r0 = this;
            r0.mDropDownGravity = r1
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setHorizontalOffset(int r2) {
            r1 = this;
            androidx.appcompat.widget.MenuPopupWindow r0 = r1.mPopup
            r0.setHorizontalOffset(r2)
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
            androidx.appcompat.widget.MenuPopupWindow r0 = r1.mPopup
            r0.setVerticalOffset(r2)
            return
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void show() {
            r2 = this;
            boolean r0 = r2.tryShow()
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "StandardMenuPopup cannot be used without an anchor"
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void updateMenuView(boolean r1) {
            r0 = this;
            r1 = 0
            r0.mHasContentWidth = r1
            androidx.appcompat.view.menu.MenuAdapter r1 = r0.mAdapter
            if (r1 == 0) goto La
            r1.notifyDataSetChanged()
        La:
            return
    }
}
