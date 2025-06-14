package androidx.appcompat.view.menu;

/* loaded from: classes.dex */
public class MenuPopupHelper implements androidx.appcompat.view.menu.MenuHelper {
    private static final int TOUCH_EPICENTER_SIZE_DP = 48;
    private android.view.View mAnchorView;
    private final android.content.Context mContext;
    private int mDropDownGravity;
    private boolean mForceShowIcon;
    private final android.widget.PopupWindow.OnDismissListener mInternalOnDismissListener;
    private final androidx.appcompat.view.menu.MenuBuilder mMenu;
    private android.widget.PopupWindow.OnDismissListener mOnDismissListener;
    private final boolean mOverflowOnly;
    private androidx.appcompat.view.menu.MenuPopup mPopup;
    private final int mPopupStyleAttr;
    private final int mPopupStyleRes;
    private androidx.appcompat.view.menu.MenuPresenter.Callback mPresenterCallback;


    public MenuPopupHelper(android.content.Context r8, androidx.appcompat.view.menu.MenuBuilder r9) {
            r7 = this;
            r3 = 0
            r4 = 0
            int r5 = androidx.appcompat.C0015R.attr.popupMenuStyle
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public MenuPopupHelper(android.content.Context r8, androidx.appcompat.view.menu.MenuBuilder r9, android.view.View r10) {
            r7 = this;
            r4 = 0
            int r5 = androidx.appcompat.C0015R.attr.popupMenuStyle
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public MenuPopupHelper(android.content.Context r8, androidx.appcompat.view.menu.MenuBuilder r9, android.view.View r10, boolean r11, int r12) {
            r7 = this;
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public MenuPopupHelper(android.content.Context r2, androidx.appcompat.view.menu.MenuBuilder r3, android.view.View r4, boolean r5, int r6, int r7) {
            r1 = this;
            r1.<init>()
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r1.mDropDownGravity = r0
            androidx.appcompat.view.menu.MenuPopupHelper$1 r0 = new androidx.appcompat.view.menu.MenuPopupHelper$1
            r0.<init>(r1)
            r1.mInternalOnDismissListener = r0
            r1.mContext = r2
            r1.mMenu = r3
            r1.mAnchorView = r4
            r1.mOverflowOnly = r5
            r1.mPopupStyleAttr = r6
            r1.mPopupStyleRes = r7
            return
    }

    private androidx.appcompat.view.menu.MenuPopup createPopup() {
            r14 = this;
            android.content.Context r0 = r14.mContext
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            r0.getRealSize(r1)
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r14.mContext
            android.content.res.Resources r1 = r1.getResources()
            int r2 = androidx.appcompat.C0015R.dimen.abc_cascading_menus_min_smallest_width
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L2e
            r0 = 1
            goto L2f
        L2e:
            r0 = 0
        L2f:
            if (r0 == 0) goto L42
            androidx.appcompat.view.menu.CascadingMenuPopup r0 = new androidx.appcompat.view.menu.CascadingMenuPopup
            android.content.Context r2 = r14.mContext
            android.view.View r3 = r14.mAnchorView
            int r4 = r14.mPopupStyleAttr
            int r5 = r14.mPopupStyleRes
            boolean r6 = r14.mOverflowOnly
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L54
        L42:
            androidx.appcompat.view.menu.StandardMenuPopup r0 = new androidx.appcompat.view.menu.StandardMenuPopup
            android.content.Context r8 = r14.mContext
            androidx.appcompat.view.menu.MenuBuilder r9 = r14.mMenu
            android.view.View r10 = r14.mAnchorView
            int r11 = r14.mPopupStyleAttr
            int r12 = r14.mPopupStyleRes
            boolean r13 = r14.mOverflowOnly
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L54:
            androidx.appcompat.view.menu.MenuBuilder r1 = r14.mMenu
            r0.addMenu(r1)
            android.widget.PopupWindow$OnDismissListener r1 = r14.mInternalOnDismissListener
            r0.setOnDismissListener(r1)
            android.view.View r1 = r14.mAnchorView
            r0.setAnchorView(r1)
            androidx.appcompat.view.menu.MenuPresenter$Callback r1 = r14.mPresenterCallback
            r0.setCallback(r1)
            boolean r1 = r14.mForceShowIcon
            r0.setForceShowIcon(r1)
            int r1 = r14.mDropDownGravity
            r0.setGravity(r1)
            return r0
    }

    private void showPopup(int r4, int r5, boolean r6, boolean r7) {
            r3 = this;
            androidx.appcompat.view.menu.MenuPopup r0 = r3.getPopup()
            r0.setShowTitle(r7)
            if (r6 == 0) goto L48
            int r6 = r3.mDropDownGravity
            android.view.View r7 = r3.mAnchorView
            int r7 = androidx.core.view.ViewCompat.getLayoutDirection(r7)
            int r6 = androidx.core.view.GravityCompat.getAbsoluteGravity(r6, r7)
            r6 = r6 & 7
            r7 = 5
            if (r6 != r7) goto L21
            android.view.View r6 = r3.mAnchorView
            int r6 = r6.getWidth()
            int r4 = r4 - r6
        L21:
            r0.setHorizontalOffset(r4)
            r0.setVerticalOffset(r5)
            android.content.Context r6 = r3.mContext
            android.content.res.Resources r6 = r6.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            r7 = 1111490560(0x42400000, float:48.0)
            float r6 = r6 * r7
            r7 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r7
            int r6 = (int) r6
            android.graphics.Rect r7 = new android.graphics.Rect
            int r1 = r4 - r6
            int r2 = r5 - r6
            int r4 = r4 + r6
            int r5 = r5 + r6
            r7.<init>(r1, r2, r4, r5)
            r0.setEpicenterBounds(r7)
        L48:
            r0.show()
            return
    }

    @Override // androidx.appcompat.view.menu.MenuHelper
    public void dismiss() {
            r1 = this;
            boolean r0 = r1.isShowing()
            if (r0 == 0) goto Lb
            androidx.appcompat.view.menu.MenuPopup r0 = r1.mPopup
            r0.dismiss()
        Lb:
            return
    }

    public int getGravity() {
            r1 = this;
            int r0 = r1.mDropDownGravity
            return r0
    }

    public android.widget.ListView getListView() {
            r1 = this;
            androidx.appcompat.view.menu.MenuPopup r0 = r1.getPopup()
            android.widget.ListView r0 = r0.getListView()
            return r0
    }

    public androidx.appcompat.view.menu.MenuPopup getPopup() {
            r1 = this;
            androidx.appcompat.view.menu.MenuPopup r0 = r1.mPopup
            if (r0 != 0) goto La
            androidx.appcompat.view.menu.MenuPopup r0 = r1.createPopup()
            r1.mPopup = r0
        La:
            androidx.appcompat.view.menu.MenuPopup r0 = r1.mPopup
            return r0
    }

    public boolean isShowing() {
            r1 = this;
            androidx.appcompat.view.menu.MenuPopup r0 = r1.mPopup
            if (r0 == 0) goto Lc
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    protected void onDismiss() {
            r1 = this;
            r0 = 0
            r1.mPopup = r0
            android.widget.PopupWindow$OnDismissListener r0 = r1.mOnDismissListener
            if (r0 == 0) goto La
            r0.onDismiss()
        La:
            return
    }

    public void setAnchorView(android.view.View r1) {
            r0 = this;
            r0.mAnchorView = r1
            return
    }

    public void setForceShowIcon(boolean r2) {
            r1 = this;
            r1.mForceShowIcon = r2
            androidx.appcompat.view.menu.MenuPopup r0 = r1.mPopup
            if (r0 == 0) goto L9
            r0.setForceShowIcon(r2)
        L9:
            return
    }

    public void setGravity(int r1) {
            r0 = this;
            r0.mDropDownGravity = r1
            return
    }

    public void setOnDismissListener(android.widget.PopupWindow.OnDismissListener r1) {
            r0 = this;
            r0.mOnDismissListener = r1
            return
    }

    @Override // androidx.appcompat.view.menu.MenuHelper
    public void setPresenterCallback(androidx.appcompat.view.menu.MenuPresenter.Callback r2) {
            r1 = this;
            r1.mPresenterCallback = r2
            androidx.appcompat.view.menu.MenuPopup r0 = r1.mPopup
            if (r0 == 0) goto L9
            r0.setCallback(r2)
        L9:
            return
    }

    public void show() {
            r2 = this;
            boolean r0 = r2.tryShow()
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "MenuPopupHelper cannot be used without an anchor"
            r0.<init>(r1)
            throw r0
    }

    public void show(int r1, int r2) {
            r0 = this;
            boolean r1 = r0.tryShow(r1, r2)
            if (r1 == 0) goto L7
            return
        L7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "MenuPopupHelper cannot be used without an anchor"
            r1.<init>(r2)
            throw r1
    }

    public boolean tryShow() {
            r3 = this;
            boolean r0 = r3.isShowing()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            android.view.View r0 = r3.mAnchorView
            r2 = 0
            if (r0 != 0) goto Le
            return r2
        Le:
            r3.showPopup(r2, r2, r2, r2)
            return r1
    }

    public boolean tryShow(int r3, int r4) {
            r2 = this;
            boolean r0 = r2.isShowing()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            android.view.View r0 = r2.mAnchorView
            if (r0 != 0) goto Le
            r3 = 0
            return r3
        Le:
            r2.showPopup(r3, r4, r1, r1)
            return r1
    }
}
