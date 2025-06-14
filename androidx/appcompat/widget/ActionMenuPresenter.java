package androidx.appcompat.widget;

/* loaded from: classes.dex */
class ActionMenuPresenter extends androidx.appcompat.view.menu.BaseMenuPresenter implements androidx.core.view.ActionProvider.SubUiVisibilityListener {
    private static final java.lang.String TAG = "ActionMenuPresenter";
    private final android.util.SparseBooleanArray mActionButtonGroups;
    androidx.appcompat.widget.ActionMenuPresenter.ActionButtonSubmenu mActionButtonPopup;
    private int mActionItemWidthLimit;
    private boolean mExpandedActionViewsExclusive;
    private int mMaxItems;
    private boolean mMaxItemsSet;
    private int mMinCellSize;
    int mOpenSubMenuId;
    androidx.appcompat.widget.ActionMenuPresenter.OverflowMenuButton mOverflowButton;
    androidx.appcompat.widget.ActionMenuPresenter.OverflowPopup mOverflowPopup;
    private android.graphics.drawable.Drawable mPendingOverflowIcon;
    private boolean mPendingOverflowIconSet;
    private androidx.appcompat.widget.ActionMenuPresenter.ActionMenuPopupCallback mPopupCallback;
    final androidx.appcompat.widget.ActionMenuPresenter.PopupPresenterCallback mPopupPresenterCallback;
    androidx.appcompat.widget.ActionMenuPresenter.OpenOverflowRunnable mPostedOpenRunnable;
    private boolean mReserveOverflow;
    private boolean mReserveOverflowSet;
    private boolean mStrictWidthLimit;
    private int mWidthLimit;
    private boolean mWidthLimitSet;

    private class ActionButtonSubmenu extends androidx.appcompat.view.menu.MenuPopupHelper {
        final /* synthetic */ androidx.appcompat.widget.ActionMenuPresenter this$0;

        public ActionButtonSubmenu(androidx.appcompat.widget.ActionMenuPresenter r7, android.content.Context r8, androidx.appcompat.view.menu.SubMenuBuilder r9, android.view.View r10) {
                r6 = this;
                r6.this$0 = r7
                r4 = 0
                int r5 = androidx.appcompat.C0015R.attr.actionOverflowMenuStyle
                r0 = r6
                r1 = r8
                r2 = r9
                r3 = r10
                r0.<init>(r1, r2, r3, r4, r5)
                android.view.MenuItem r8 = r9.getItem()
                androidx.appcompat.view.menu.MenuItemImpl r8 = (androidx.appcompat.view.menu.MenuItemImpl) r8
                boolean r8 = r8.isActionButton()
                if (r8 != 0) goto L28
                androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r8 = r7.mOverflowButton
                if (r8 != 0) goto L23
                androidx.appcompat.view.menu.MenuView r8 = androidx.appcompat.widget.ActionMenuPresenter.access$200(r7)
                android.view.View r8 = (android.view.View) r8
                goto L25
            L23:
                androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r8 = r7.mOverflowButton
            L25:
                r6.setAnchorView(r8)
            L28:
                androidx.appcompat.widget.ActionMenuPresenter$PopupPresenterCallback r7 = r7.mPopupPresenterCallback
                r6.setPresenterCallback(r7)
                return
        }

        @Override // androidx.appcompat.view.menu.MenuPopupHelper
        protected void onDismiss() {
                r2 = this;
                androidx.appcompat.widget.ActionMenuPresenter r0 = r2.this$0
                r1 = 0
                r0.mActionButtonPopup = r1
                androidx.appcompat.widget.ActionMenuPresenter r0 = r2.this$0
                r1 = 0
                r0.mOpenSubMenuId = r1
                super.onDismiss()
                return
        }
    }

    private class ActionMenuPopupCallback extends androidx.appcompat.view.menu.ActionMenuItemView.PopupCallback {
        final /* synthetic */ androidx.appcompat.widget.ActionMenuPresenter this$0;

        ActionMenuPopupCallback(androidx.appcompat.widget.ActionMenuPresenter r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.PopupCallback
        public androidx.appcompat.view.menu.ShowableListMenu getPopup() {
                r1 = this;
                androidx.appcompat.widget.ActionMenuPresenter r0 = r1.this$0
                androidx.appcompat.widget.ActionMenuPresenter$ActionButtonSubmenu r0 = r0.mActionButtonPopup
                if (r0 == 0) goto Lf
                androidx.appcompat.widget.ActionMenuPresenter r0 = r1.this$0
                androidx.appcompat.widget.ActionMenuPresenter$ActionButtonSubmenu r0 = r0.mActionButtonPopup
                androidx.appcompat.view.menu.MenuPopup r0 = r0.getPopup()
                goto L10
            Lf:
                r0 = 0
            L10:
                return r0
        }
    }

    private class OpenOverflowRunnable implements java.lang.Runnable {
        private androidx.appcompat.widget.ActionMenuPresenter.OverflowPopup mPopup;
        final /* synthetic */ androidx.appcompat.widget.ActionMenuPresenter this$0;

        public OpenOverflowRunnable(androidx.appcompat.widget.ActionMenuPresenter r1, androidx.appcompat.widget.ActionMenuPresenter.OverflowPopup r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.mPopup = r2
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                androidx.appcompat.widget.ActionMenuPresenter r0 = r2.this$0
                androidx.appcompat.view.menu.MenuBuilder r0 = androidx.appcompat.widget.ActionMenuPresenter.access$400(r0)
                if (r0 == 0) goto L11
                androidx.appcompat.widget.ActionMenuPresenter r0 = r2.this$0
                androidx.appcompat.view.menu.MenuBuilder r0 = androidx.appcompat.widget.ActionMenuPresenter.access$500(r0)
                r0.changeMenuMode()
            L11:
                androidx.appcompat.widget.ActionMenuPresenter r0 = r2.this$0
                androidx.appcompat.view.menu.MenuView r0 = androidx.appcompat.widget.ActionMenuPresenter.access$600(r0)
                android.view.View r0 = (android.view.View) r0
                if (r0 == 0) goto L2f
                android.os.IBinder r0 = r0.getWindowToken()
                if (r0 == 0) goto L2f
                androidx.appcompat.widget.ActionMenuPresenter$OverflowPopup r0 = r2.mPopup
                boolean r0 = r0.tryShow()
                if (r0 == 0) goto L2f
                androidx.appcompat.widget.ActionMenuPresenter r0 = r2.this$0
                androidx.appcompat.widget.ActionMenuPresenter$OverflowPopup r1 = r2.mPopup
                r0.mOverflowPopup = r1
            L2f:
                androidx.appcompat.widget.ActionMenuPresenter r0 = r2.this$0
                r1 = 0
                r0.mPostedOpenRunnable = r1
                return
        }
    }

    private class OverflowMenuButton extends androidx.appcompat.widget.AppCompatImageView implements androidx.appcompat.widget.ActionMenuView.ActionMenuChildView {
        final /* synthetic */ androidx.appcompat.widget.ActionMenuPresenter this$0;


        public OverflowMenuButton(androidx.appcompat.widget.ActionMenuPresenter r3, android.content.Context r4) {
                r2 = this;
                r2.this$0 = r3
                r0 = 0
                int r1 = androidx.appcompat.C0015R.attr.actionOverflowButtonStyle
                r2.<init>(r4, r0, r1)
                r4 = 1
                r2.setClickable(r4)
                r2.setFocusable(r4)
                r0 = 0
                r2.setVisibility(r0)
                r2.setEnabled(r4)
                java.lang.CharSequence r4 = r2.getContentDescription()
                androidx.appcompat.widget.TooltipCompat.setTooltipText(r2, r4)
                androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton$1 r4 = new androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton$1
                r4.<init>(r2, r2, r3)
                r2.setOnTouchListener(r4)
                return
        }

        @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
        public boolean needsDividerAfter() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
        public boolean needsDividerBefore() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.view.View
        public boolean performClick() {
                r2 = this;
                boolean r0 = super.performClick()
                r1 = 1
                if (r0 == 0) goto L8
                return r1
            L8:
                r0 = 0
                r2.playSoundEffect(r0)
                androidx.appcompat.widget.ActionMenuPresenter r0 = r2.this$0
                r0.showOverflowMenu()
                return r1
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int r5, int r6, int r7, int r8) {
                r4 = this;
                boolean r5 = super.setFrame(r5, r6, r7, r8)
                android.graphics.drawable.Drawable r6 = r4.getDrawable()
                android.graphics.drawable.Drawable r7 = r4.getBackground()
                if (r6 == 0) goto L3f
                if (r7 == 0) goto L3f
                int r6 = r4.getWidth()
                int r8 = r4.getHeight()
                int r0 = java.lang.Math.max(r6, r8)
                int r0 = r0 / 2
                int r1 = r4.getPaddingLeft()
                int r2 = r4.getPaddingRight()
                int r1 = r1 - r2
                int r2 = r4.getPaddingTop()
                int r3 = r4.getPaddingBottom()
                int r2 = r2 - r3
                int r6 = r6 + r1
                int r6 = r6 / 2
                int r8 = r8 + r2
                int r8 = r8 / 2
                int r1 = r6 - r0
                int r2 = r8 - r0
                int r6 = r6 + r0
                int r8 = r8 + r0
                androidx.core.graphics.drawable.DrawableCompat.setHotspotBounds(r7, r1, r2, r6, r8)
            L3f:
                return r5
        }
    }

    private class OverflowPopup extends androidx.appcompat.view.menu.MenuPopupHelper {
        final /* synthetic */ androidx.appcompat.widget.ActionMenuPresenter this$0;

        public OverflowPopup(androidx.appcompat.widget.ActionMenuPresenter r7, android.content.Context r8, androidx.appcompat.view.menu.MenuBuilder r9, android.view.View r10, boolean r11) {
                r6 = this;
                r6.this$0 = r7
                int r5 = androidx.appcompat.C0015R.attr.actionOverflowMenuStyle
                r0 = r6
                r1 = r8
                r2 = r9
                r3 = r10
                r4 = r11
                r0.<init>(r1, r2, r3, r4, r5)
                r8 = 8388613(0x800005, float:1.175495E-38)
                r6.setGravity(r8)
                androidx.appcompat.widget.ActionMenuPresenter$PopupPresenterCallback r7 = r7.mPopupPresenterCallback
                r6.setPresenterCallback(r7)
                return
        }

        @Override // androidx.appcompat.view.menu.MenuPopupHelper
        protected void onDismiss() {
                r2 = this;
                androidx.appcompat.widget.ActionMenuPresenter r0 = r2.this$0
                androidx.appcompat.view.menu.MenuBuilder r0 = androidx.appcompat.widget.ActionMenuPresenter.access$000(r0)
                if (r0 == 0) goto L11
                androidx.appcompat.widget.ActionMenuPresenter r0 = r2.this$0
                androidx.appcompat.view.menu.MenuBuilder r0 = androidx.appcompat.widget.ActionMenuPresenter.access$100(r0)
                r0.close()
            L11:
                androidx.appcompat.widget.ActionMenuPresenter r0 = r2.this$0
                r1 = 0
                r0.mOverflowPopup = r1
                super.onDismiss()
                return
        }
    }

    private class PopupPresenterCallback implements androidx.appcompat.view.menu.MenuPresenter.Callback {
        final /* synthetic */ androidx.appcompat.widget.ActionMenuPresenter this$0;

        PopupPresenterCallback(androidx.appcompat.widget.ActionMenuPresenter r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public void onCloseMenu(androidx.appcompat.view.menu.MenuBuilder r3, boolean r4) {
                r2 = this;
                boolean r0 = r3 instanceof androidx.appcompat.view.menu.SubMenuBuilder
                if (r0 == 0) goto Lc
                androidx.appcompat.view.menu.MenuBuilder r0 = r3.getRootMenu()
                r1 = 0
                r0.close(r1)
            Lc:
                androidx.appcompat.widget.ActionMenuPresenter r0 = r2.this$0
                androidx.appcompat.view.menu.MenuPresenter$Callback r0 = r0.getCallback()
                if (r0 == 0) goto L17
                r0.onCloseMenu(r3, r4)
            L17:
                return
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public boolean onOpenSubMenu(androidx.appcompat.view.menu.MenuBuilder r4) {
                r3 = this;
                androidx.appcompat.widget.ActionMenuPresenter r0 = r3.this$0
                androidx.appcompat.view.menu.MenuBuilder r0 = androidx.appcompat.widget.ActionMenuPresenter.access$300(r0)
                r1 = 0
                if (r4 != r0) goto La
                return r1
            La:
                androidx.appcompat.widget.ActionMenuPresenter r0 = r3.this$0
                r2 = r4
                androidx.appcompat.view.menu.SubMenuBuilder r2 = (androidx.appcompat.view.menu.SubMenuBuilder) r2
                android.view.MenuItem r2 = r2.getItem()
                int r2 = r2.getItemId()
                r0.mOpenSubMenuId = r2
                androidx.appcompat.widget.ActionMenuPresenter r0 = r3.this$0
                androidx.appcompat.view.menu.MenuPresenter$Callback r0 = r0.getCallback()
                if (r0 == 0) goto L25
                boolean r1 = r0.onOpenSubMenu(r4)
            L25:
                return r1
        }
    }

    private static class SavedState implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<androidx.appcompat.widget.ActionMenuPresenter.SavedState> CREATOR = null;
        public int openSubMenuId;


        static {
                androidx.appcompat.widget.ActionMenuPresenter$SavedState$1 r0 = new androidx.appcompat.widget.ActionMenuPresenter$SavedState$1
                r0.<init>()
                androidx.appcompat.widget.ActionMenuPresenter.SavedState.CREATOR = r0
                return
        }

        SavedState() {
                r0 = this;
                r0.<init>()
                return
        }

        SavedState(android.os.Parcel r1) {
                r0 = this;
                r0.<init>()
                int r1 = r1.readInt()
                r0.openSubMenuId = r1
                return
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                int r2 = r0.openSubMenuId
                r1.writeInt(r2)
                return
        }
    }

    public ActionMenuPresenter(android.content.Context r3) {
            r2 = this;
            int r0 = androidx.appcompat.C0015R.layout.abc_action_menu_layout
            int r1 = androidx.appcompat.C0015R.layout.abc_action_menu_item_layout
            r2.<init>(r3, r0, r1)
            android.util.SparseBooleanArray r3 = new android.util.SparseBooleanArray
            r3.<init>()
            r2.mActionButtonGroups = r3
            androidx.appcompat.widget.ActionMenuPresenter$PopupPresenterCallback r3 = new androidx.appcompat.widget.ActionMenuPresenter$PopupPresenterCallback
            r3.<init>(r2)
            r2.mPopupPresenterCallback = r3
            return
    }

    static /* synthetic */ androidx.appcompat.view.menu.MenuBuilder access$000(androidx.appcompat.widget.ActionMenuPresenter r0) {
            androidx.appcompat.view.menu.MenuBuilder r0 = r0.mMenu
            return r0
    }

    static /* synthetic */ androidx.appcompat.view.menu.MenuBuilder access$100(androidx.appcompat.widget.ActionMenuPresenter r0) {
            androidx.appcompat.view.menu.MenuBuilder r0 = r0.mMenu
            return r0
    }

    static /* synthetic */ androidx.appcompat.view.menu.MenuView access$200(androidx.appcompat.widget.ActionMenuPresenter r0) {
            androidx.appcompat.view.menu.MenuView r0 = r0.mMenuView
            return r0
    }

    static /* synthetic */ androidx.appcompat.view.menu.MenuBuilder access$300(androidx.appcompat.widget.ActionMenuPresenter r0) {
            androidx.appcompat.view.menu.MenuBuilder r0 = r0.mMenu
            return r0
    }

    static /* synthetic */ androidx.appcompat.view.menu.MenuBuilder access$400(androidx.appcompat.widget.ActionMenuPresenter r0) {
            androidx.appcompat.view.menu.MenuBuilder r0 = r0.mMenu
            return r0
    }

    static /* synthetic */ androidx.appcompat.view.menu.MenuBuilder access$500(androidx.appcompat.widget.ActionMenuPresenter r0) {
            androidx.appcompat.view.menu.MenuBuilder r0 = r0.mMenu
            return r0
    }

    static /* synthetic */ androidx.appcompat.view.menu.MenuView access$600(androidx.appcompat.widget.ActionMenuPresenter r0) {
            androidx.appcompat.view.menu.MenuView r0 = r0.mMenuView
            return r0
    }

    private android.view.View findViewForItem(android.view.MenuItem r7) {
            r6 = this;
            androidx.appcompat.view.menu.MenuView r0 = r6.mMenuView
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r2 = r0.getChildCount()
            r3 = 0
        Ld:
            if (r3 >= r2) goto L24
            android.view.View r4 = r0.getChildAt(r3)
            boolean r5 = r4 instanceof androidx.appcompat.view.menu.MenuView.ItemView
            if (r5 == 0) goto L21
            r5 = r4
            androidx.appcompat.view.menu.MenuView$ItemView r5 = (androidx.appcompat.view.menu.MenuView.ItemView) r5
            androidx.appcompat.view.menu.MenuItemImpl r5 = r5.getItemData()
            if (r5 != r7) goto L21
            return r4
        L21:
            int r3 = r3 + 1
            goto Ld
        L24:
            return r1
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter
    public void bindItemView(androidx.appcompat.view.menu.MenuItemImpl r2, androidx.appcompat.view.menu.MenuView.ItemView r3) {
            r1 = this;
            r0 = 0
            r3.initialize(r2, r0)
            androidx.appcompat.view.menu.MenuView r2 = r1.mMenuView
            androidx.appcompat.widget.ActionMenuView r2 = (androidx.appcompat.widget.ActionMenuView) r2
            androidx.appcompat.view.menu.ActionMenuItemView r3 = (androidx.appcompat.view.menu.ActionMenuItemView) r3
            r3.setItemInvoker(r2)
            androidx.appcompat.widget.ActionMenuPresenter$ActionMenuPopupCallback r2 = r1.mPopupCallback
            if (r2 != 0) goto L18
            androidx.appcompat.widget.ActionMenuPresenter$ActionMenuPopupCallback r2 = new androidx.appcompat.widget.ActionMenuPresenter$ActionMenuPopupCallback
            r2.<init>(r1)
            r1.mPopupCallback = r2
        L18:
            androidx.appcompat.widget.ActionMenuPresenter$ActionMenuPopupCallback r2 = r1.mPopupCallback
            r3.setPopupCallback(r2)
            return
    }

    public boolean dismissPopupMenus() {
            r2 = this;
            boolean r0 = r2.hideOverflowMenu()
            boolean r1 = r2.hideSubMenus()
            r0 = r0 | r1
            return r0
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter
    public boolean filterLeftoverView(android.view.ViewGroup r3, int r4) {
            r2 = this;
            android.view.View r0 = r3.getChildAt(r4)
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r1 = r2.mOverflowButton
            if (r0 != r1) goto La
            r3 = 0
            return r3
        La:
            boolean r3 = super.filterLeftoverView(r3, r4)
            return r3
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public boolean flagActionItems() {
            r20 = this;
            r0 = r20
            androidx.appcompat.view.menu.MenuBuilder r1 = r0.mMenu
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L13
            androidx.appcompat.view.menu.MenuBuilder r1 = r0.mMenu
            java.util.ArrayList r1 = r1.getVisibleItems()
            int r4 = r1.size()
            goto L15
        L13:
            r1 = r2
            r4 = r3
        L15:
            int r5 = r0.mMaxItems
            int r6 = r0.mActionItemWidthLimit
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
            androidx.appcompat.view.menu.MenuView r8 = r0.mMenuView
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            r9 = r3
            r10 = r9
            r11 = r10
            r12 = r11
        L25:
            if (r9 >= r4) goto L4e
            java.lang.Object r14 = r1.get(r9)
            androidx.appcompat.view.menu.MenuItemImpl r14 = (androidx.appcompat.view.menu.MenuItemImpl) r14
            boolean r15 = r14.requiresActionButton()
            if (r15 == 0) goto L36
            int r11 = r11 + 1
            goto L40
        L36:
            boolean r15 = r14.requestsActionButton()
            if (r15 == 0) goto L3f
            int r12 = r12 + 1
            goto L40
        L3f:
            r10 = 1
        L40:
            boolean r13 = r0.mExpandedActionViewsExclusive
            if (r13 == 0) goto L4b
            boolean r13 = r14.isActionViewExpanded()
            if (r13 == 0) goto L4b
            r5 = r3
        L4b:
            int r9 = r9 + 1
            goto L25
        L4e:
            boolean r9 = r0.mReserveOverflow
            if (r9 == 0) goto L59
            if (r10 != 0) goto L57
            int r12 = r12 + r11
            if (r12 <= r5) goto L59
        L57:
            int r5 = r5 + (-1)
        L59:
            int r5 = r5 - r11
            android.util.SparseBooleanArray r9 = r0.mActionButtonGroups
            r9.clear()
            boolean r10 = r0.mStrictWidthLimit
            if (r10 == 0) goto L6c
            int r10 = r0.mMinCellSize
            int r11 = r6 / r10
            int r12 = r6 % r10
            int r12 = r12 / r11
            int r10 = r10 + r12
            goto L6e
        L6c:
            r10 = r3
            r11 = r10
        L6e:
            r12 = r3
            r14 = r12
        L70:
            if (r12 >= r4) goto L145
            java.lang.Object r15 = r1.get(r12)
            androidx.appcompat.view.menu.MenuItemImpl r15 = (androidx.appcompat.view.menu.MenuItemImpl) r15
            boolean r16 = r15.requiresActionButton()
            if (r16 == 0) goto La9
            android.view.View r13 = r0.getItemView(r15, r2, r8)
            boolean r2 = r0.mStrictWidthLimit
            if (r2 == 0) goto L8c
            int r2 = androidx.appcompat.widget.ActionMenuView.measureChildForCells(r13, r10, r11, r7, r3)
            int r11 = r11 - r2
            goto L8f
        L8c:
            r13.measure(r7, r7)
        L8f:
            int r2 = r13.getMeasuredWidth()
            int r6 = r6 - r2
            if (r14 != 0) goto L97
            r14 = r2
        L97:
            int r2 = r15.getGroupId()
            r13 = 1
            if (r2 == 0) goto La1
            r9.put(r2, r13)
        La1:
            r15.setIsActionButton(r13)
            r0 = r3
            r17 = r4
            goto L13b
        La9:
            boolean r2 = r15.requestsActionButton()
            if (r2 == 0) goto L135
            int r2 = r15.getGroupId()
            boolean r13 = r9.get(r2)
            if (r5 > 0) goto Lbb
            if (r13 == 0) goto Lc5
        Lbb:
            if (r6 <= 0) goto Lc5
            boolean r3 = r0.mStrictWidthLimit
            if (r3 == 0) goto Lc3
            if (r11 <= 0) goto Lc5
        Lc3:
            r3 = 1
            goto Lc6
        Lc5:
            r3 = 0
        Lc6:
            r18 = r3
            r17 = r4
            if (r3 == 0) goto Lfd
            r3 = 0
            android.view.View r4 = r0.getItemView(r15, r3, r8)
            boolean r3 = r0.mStrictWidthLimit
            if (r3 == 0) goto Le1
            r3 = 0
            int r19 = androidx.appcompat.widget.ActionMenuView.measureChildForCells(r4, r10, r11, r7, r3)
            int r11 = r11 - r19
            if (r19 != 0) goto Le4
            r18 = 0
            goto Le4
        Le1:
            r4.measure(r7, r7)
        Le4:
            r3 = r18
            int r4 = r4.getMeasuredWidth()
            int r6 = r6 - r4
            if (r14 != 0) goto Lee
            r14 = r4
        Lee:
            boolean r4 = r0.mStrictWidthLimit
            if (r4 == 0) goto Lf5
            if (r6 < 0) goto Lfb
            goto Lf9
        Lf5:
            int r4 = r6 + r14
            if (r4 <= 0) goto Lfb
        Lf9:
            r4 = 1
            goto Lfc
        Lfb:
            r4 = 0
        Lfc:
            r3 = r3 & r4
        Lfd:
            if (r3 == 0) goto L106
            if (r2 == 0) goto L106
            r4 = 1
            r9.put(r2, r4)
            goto L12c
        L106:
            if (r13 == 0) goto L12c
            r4 = 0
            r9.put(r2, r4)
            r4 = 0
        L10d:
            if (r4 >= r12) goto L12c
            java.lang.Object r13 = r1.get(r4)
            androidx.appcompat.view.menu.MenuItemImpl r13 = (androidx.appcompat.view.menu.MenuItemImpl) r13
            int r0 = r13.getGroupId()
            if (r0 != r2) goto L127
            boolean r0 = r13.isActionButton()
            if (r0 == 0) goto L123
            int r5 = r5 + 1
        L123:
            r0 = 0
            r13.setIsActionButton(r0)
        L127:
            int r4 = r4 + 1
            r0 = r20
            goto L10d
        L12c:
            if (r3 == 0) goto L130
            int r5 = r5 + (-1)
        L130:
            r15.setIsActionButton(r3)
            r0 = 0
            goto L13b
        L135:
            r0 = r3
            r17 = r4
            r15.setIsActionButton(r0)
        L13b:
            int r12 = r12 + 1
            r3 = r0
            r4 = r17
            r2 = 0
            r0 = r20
            goto L70
        L145:
            r2 = 1
            return r2
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter
    public android.view.View getItemView(androidx.appcompat.view.menu.MenuItemImpl r3, android.view.View r4, android.view.ViewGroup r5) {
            r2 = this;
            android.view.View r0 = r3.getActionView()
            if (r0 == 0) goto Lc
            boolean r1 = r3.hasCollapsibleActionView()
            if (r1 == 0) goto L10
        Lc:
            android.view.View r0 = super.getItemView(r3, r4, r5)
        L10:
            boolean r3 = r3.isActionViewExpanded()
            if (r3 == 0) goto L19
            r3 = 8
            goto L1a
        L19:
            r3 = 0
        L1a:
            r0.setVisibility(r3)
            androidx.appcompat.widget.ActionMenuView r5 = (androidx.appcompat.widget.ActionMenuView) r5
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            boolean r4 = r5.checkLayoutParams(r3)
            if (r4 != 0) goto L30
            androidx.appcompat.widget.ActionMenuView$LayoutParams r3 = r5.generateLayoutParams(r3)
            r0.setLayoutParams(r3)
        L30:
            return r0
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public androidx.appcompat.view.menu.MenuView getMenuView(android.view.ViewGroup r2) {
            r1 = this;
            androidx.appcompat.view.menu.MenuView r0 = r1.mMenuView
            androidx.appcompat.view.menu.MenuView r2 = super.getMenuView(r2)
            if (r0 == r2) goto Le
            r0 = r2
            androidx.appcompat.widget.ActionMenuView r0 = (androidx.appcompat.widget.ActionMenuView) r0
            r0.setPresenter(r1)
        Le:
            return r2
    }

    public android.graphics.drawable.Drawable getOverflowIcon() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r0 = r1.mOverflowButton
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            return r0
        L9:
            boolean r0 = r1.mPendingOverflowIconSet
            if (r0 == 0) goto L10
            android.graphics.drawable.Drawable r0 = r1.mPendingOverflowIcon
            return r0
        L10:
            r0 = 0
            return r0
    }

    public boolean hideOverflowMenu() {
            r3 = this;
            androidx.appcompat.widget.ActionMenuPresenter$OpenOverflowRunnable r0 = r3.mPostedOpenRunnable
            r1 = 1
            if (r0 == 0) goto L16
            androidx.appcompat.view.menu.MenuView r0 = r3.mMenuView
            if (r0 == 0) goto L16
            androidx.appcompat.view.menu.MenuView r0 = r3.mMenuView
            android.view.View r0 = (android.view.View) r0
            androidx.appcompat.widget.ActionMenuPresenter$OpenOverflowRunnable r2 = r3.mPostedOpenRunnable
            r0.removeCallbacks(r2)
            r0 = 0
            r3.mPostedOpenRunnable = r0
            return r1
        L16:
            androidx.appcompat.widget.ActionMenuPresenter$OverflowPopup r0 = r3.mOverflowPopup
            if (r0 == 0) goto L1e
            r0.dismiss()
            return r1
        L1e:
            r0 = 0
            return r0
    }

    public boolean hideSubMenus() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuPresenter$ActionButtonSubmenu r0 = r1.mActionButtonPopup
            if (r0 == 0) goto L9
            r0.dismiss()
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public void initForMenu(android.content.Context r5, androidx.appcompat.view.menu.MenuBuilder r6) {
            r4 = this;
            super.initForMenu(r5, r6)
            android.content.res.Resources r6 = r5.getResources()
            androidx.appcompat.view.ActionBarPolicy r5 = androidx.appcompat.view.ActionBarPolicy.get(r5)
            boolean r0 = r4.mReserveOverflowSet
            if (r0 != 0) goto L15
            boolean r0 = r5.showsOverflowMenuButton()
            r4.mReserveOverflow = r0
        L15:
            boolean r0 = r4.mWidthLimitSet
            if (r0 != 0) goto L1f
            int r0 = r5.getEmbeddedMenuWidthLimit()
            r4.mWidthLimit = r0
        L1f:
            boolean r0 = r4.mMaxItemsSet
            if (r0 != 0) goto L29
            int r5 = r5.getMaxActionButtons()
            r4.mMaxItems = r5
        L29:
            int r5 = r4.mWidthLimit
            boolean r0 = r4.mReserveOverflow
            r1 = 0
            if (r0 == 0) goto L5c
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r0 = r4.mOverflowButton
            if (r0 != 0) goto L54
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r0 = new androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton
            android.content.Context r2 = r4.mSystemContext
            r0.<init>(r4, r2)
            r4.mOverflowButton = r0
            boolean r2 = r4.mPendingOverflowIconSet
            r3 = 0
            if (r2 == 0) goto L4b
            android.graphics.drawable.Drawable r2 = r4.mPendingOverflowIcon
            r0.setImageDrawable(r2)
            r4.mPendingOverflowIcon = r1
            r4.mPendingOverflowIconSet = r3
        L4b:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r1 = r4.mOverflowButton
            r1.measure(r0, r0)
        L54:
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r0 = r4.mOverflowButton
            int r0 = r0.getMeasuredWidth()
            int r5 = r5 - r0
            goto L5e
        L5c:
            r4.mOverflowButton = r1
        L5e:
            r4.mActionItemWidthLimit = r5
            android.util.DisplayMetrics r5 = r6.getDisplayMetrics()
            float r5 = r5.density
            r6 = 1113587712(0x42600000, float:56.0)
            float r5 = r5 * r6
            int r5 = (int) r5
            r4.mMinCellSize = r5
            return
    }

    public boolean isOverflowMenuShowPending() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuPresenter$OpenOverflowRunnable r0 = r1.mPostedOpenRunnable
            if (r0 != 0) goto Ld
            boolean r0 = r1.isOverflowMenuShowing()
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    public boolean isOverflowMenuShowing() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuPresenter$OverflowPopup r0 = r1.mOverflowPopup
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

    public boolean isOverflowReserved() {
            r1 = this;
            boolean r0 = r1.mReserveOverflow
            return r0
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public void onCloseMenu(androidx.appcompat.view.menu.MenuBuilder r1, boolean r2) {
            r0 = this;
            r0.dismissPopupMenus()
            super.onCloseMenu(r1, r2)
            return
    }

    public void onConfigurationChanged(android.content.res.Configuration r2) {
            r1 = this;
            boolean r2 = r1.mMaxItemsSet
            if (r2 != 0) goto L10
            android.content.Context r2 = r1.mContext
            androidx.appcompat.view.ActionBarPolicy r2 = androidx.appcompat.view.ActionBarPolicy.get(r2)
            int r2 = r2.getMaxActionButtons()
            r1.mMaxItems = r2
        L10:
            androidx.appcompat.view.menu.MenuBuilder r2 = r1.mMenu
            if (r2 == 0) goto L1a
            androidx.appcompat.view.menu.MenuBuilder r2 = r1.mMenu
            r0 = 1
            r2.onItemsChanged(r0)
        L1a:
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.appcompat.widget.ActionMenuPresenter.SavedState
            if (r0 != 0) goto L5
            return
        L5:
            androidx.appcompat.widget.ActionMenuPresenter$SavedState r2 = (androidx.appcompat.widget.ActionMenuPresenter.SavedState) r2
            int r0 = r2.openSubMenuId
            if (r0 <= 0) goto L1e
            androidx.appcompat.view.menu.MenuBuilder r0 = r1.mMenu
            int r2 = r2.openSubMenuId
            android.view.MenuItem r2 = r0.findItem(r2)
            if (r2 == 0) goto L1e
            android.view.SubMenu r2 = r2.getSubMenu()
            androidx.appcompat.view.menu.SubMenuBuilder r2 = (androidx.appcompat.view.menu.SubMenuBuilder) r2
            r1.onSubMenuSelected(r2)
        L1e:
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            androidx.appcompat.widget.ActionMenuPresenter$SavedState r0 = new androidx.appcompat.widget.ActionMenuPresenter$SavedState
            r0.<init>()
            int r1 = r2.mOpenSubMenuId
            r0.openSubMenuId = r1
            return r0
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public boolean onSubMenuSelected(androidx.appcompat.view.menu.SubMenuBuilder r8) {
            r7 = this;
            boolean r0 = r8.hasVisibleItems()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r0 = r8
        L9:
            android.view.Menu r2 = r0.getParentMenu()
            androidx.appcompat.view.menu.MenuBuilder r3 = r7.mMenu
            if (r2 == r3) goto L18
            android.view.Menu r0 = r0.getParentMenu()
            androidx.appcompat.view.menu.SubMenuBuilder r0 = (androidx.appcompat.view.menu.SubMenuBuilder) r0
            goto L9
        L18:
            android.view.MenuItem r0 = r0.getItem()
            android.view.View r0 = r7.findViewForItem(r0)
            if (r0 != 0) goto L23
            return r1
        L23:
            android.view.MenuItem r2 = r8.getItem()
            int r2 = r2.getItemId()
            r7.mOpenSubMenuId = r2
            int r2 = r8.size()
            r3 = r1
        L32:
            r4 = 1
            if (r3 >= r2) goto L4a
            android.view.MenuItem r5 = r8.getItem(r3)
            boolean r6 = r5.isVisible()
            if (r6 == 0) goto L47
            android.graphics.drawable.Drawable r5 = r5.getIcon()
            if (r5 == 0) goto L47
            r1 = r4
            goto L4a
        L47:
            int r3 = r3 + 1
            goto L32
        L4a:
            androidx.appcompat.widget.ActionMenuPresenter$ActionButtonSubmenu r2 = new androidx.appcompat.widget.ActionMenuPresenter$ActionButtonSubmenu
            android.content.Context r3 = r7.mContext
            r2.<init>(r7, r3, r8, r0)
            r7.mActionButtonPopup = r2
            r2.setForceShowIcon(r1)
            androidx.appcompat.widget.ActionMenuPresenter$ActionButtonSubmenu r0 = r7.mActionButtonPopup
            r0.show()
            super.onSubMenuSelected(r8)
            return r4
    }

    @Override // androidx.core.view.ActionProvider.SubUiVisibilityListener
    public void onSubUiVisibilityChanged(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L7
            r2 = 0
            super.onSubMenuSelected(r2)
            goto L11
        L7:
            androidx.appcompat.view.menu.MenuBuilder r2 = r1.mMenu
            if (r2 == 0) goto L11
            androidx.appcompat.view.menu.MenuBuilder r2 = r1.mMenu
            r0 = 0
            r2.close(r0)
        L11:
            return
    }

    public void setExpandedActionViewsExclusive(boolean r1) {
            r0 = this;
            r0.mExpandedActionViewsExclusive = r1
            return
    }

    public void setItemLimit(int r1) {
            r0 = this;
            r0.mMaxItems = r1
            r1 = 1
            r0.mMaxItemsSet = r1
            return
    }

    public void setMenuView(androidx.appcompat.widget.ActionMenuView r2) {
            r1 = this;
            r1.mMenuView = r2
            androidx.appcompat.view.menu.MenuBuilder r0 = r1.mMenu
            r2.initialize(r0)
            return
    }

    public void setOverflowIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r0 = r1.mOverflowButton
            if (r0 == 0) goto L8
            r0.setImageDrawable(r2)
            goto Ld
        L8:
            r0 = 1
            r1.mPendingOverflowIconSet = r0
            r1.mPendingOverflowIcon = r2
        Ld:
            return
    }

    public void setReserveOverflow(boolean r1) {
            r0 = this;
            r0.mReserveOverflow = r1
            r1 = 1
            r0.mReserveOverflowSet = r1
            return
    }

    public void setWidthLimit(int r1, boolean r2) {
            r0 = this;
            r0.mWidthLimit = r1
            r0.mStrictWidthLimit = r2
            r1 = 1
            r0.mWidthLimitSet = r1
            return
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter
    public boolean shouldIncludeItem(int r1, androidx.appcompat.view.menu.MenuItemImpl r2) {
            r0 = this;
            boolean r1 = r2.isActionButton()
            return r1
    }

    public boolean showOverflowMenu() {
            r7 = this;
            boolean r0 = r7.mReserveOverflow
            if (r0 == 0) goto L42
            boolean r0 = r7.isOverflowMenuShowing()
            if (r0 != 0) goto L42
            androidx.appcompat.view.menu.MenuBuilder r0 = r7.mMenu
            if (r0 == 0) goto L42
            androidx.appcompat.view.menu.MenuView r0 = r7.mMenuView
            if (r0 == 0) goto L42
            androidx.appcompat.widget.ActionMenuPresenter$OpenOverflowRunnable r0 = r7.mPostedOpenRunnable
            if (r0 != 0) goto L42
            androidx.appcompat.view.menu.MenuBuilder r0 = r7.mMenu
            java.util.ArrayList r0 = r0.getNonActionItems()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L42
            androidx.appcompat.widget.ActionMenuPresenter$OverflowPopup r0 = new androidx.appcompat.widget.ActionMenuPresenter$OverflowPopup
            android.content.Context r3 = r7.mContext
            androidx.appcompat.view.menu.MenuBuilder r4 = r7.mMenu
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r5 = r7.mOverflowButton
            r6 = 1
            r1 = r0
            r2 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            androidx.appcompat.widget.ActionMenuPresenter$OpenOverflowRunnable r1 = new androidx.appcompat.widget.ActionMenuPresenter$OpenOverflowRunnable
            r1.<init>(r7, r0)
            r7.mPostedOpenRunnable = r1
            androidx.appcompat.view.menu.MenuView r0 = r7.mMenuView
            android.view.View r0 = (android.view.View) r0
            androidx.appcompat.widget.ActionMenuPresenter$OpenOverflowRunnable r1 = r7.mPostedOpenRunnable
            r0.post(r1)
            r0 = 1
            return r0
        L42:
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public void updateMenuView(boolean r5) {
            r4 = this;
            super.updateMenuView(r5)
            androidx.appcompat.view.menu.MenuView r5 = r4.mMenuView
            android.view.View r5 = (android.view.View) r5
            r5.requestLayout()
            androidx.appcompat.view.menu.MenuBuilder r5 = r4.mMenu
            r0 = 0
            if (r5 == 0) goto L2e
            androidx.appcompat.view.menu.MenuBuilder r5 = r4.mMenu
            java.util.ArrayList r5 = r5.getActionItems()
            int r1 = r5.size()
            r2 = r0
        L1a:
            if (r2 >= r1) goto L2e
            java.lang.Object r3 = r5.get(r2)
            androidx.appcompat.view.menu.MenuItemImpl r3 = (androidx.appcompat.view.menu.MenuItemImpl) r3
            androidx.core.view.ActionProvider r3 = r3.getSupportActionProvider()
            if (r3 == 0) goto L2b
            r3.setSubUiVisibilityListener(r4)
        L2b:
            int r2 = r2 + 1
            goto L1a
        L2e:
            androidx.appcompat.view.menu.MenuBuilder r5 = r4.mMenu
            if (r5 == 0) goto L39
            androidx.appcompat.view.menu.MenuBuilder r5 = r4.mMenu
            java.util.ArrayList r5 = r5.getNonActionItems()
            goto L3a
        L39:
            r5 = 0
        L3a:
            boolean r1 = r4.mReserveOverflow
            if (r1 == 0) goto L57
            if (r5 == 0) goto L57
            int r1 = r5.size()
            r2 = 1
            if (r1 != r2) goto L54
            java.lang.Object r5 = r5.get(r0)
            androidx.appcompat.view.menu.MenuItemImpl r5 = (androidx.appcompat.view.menu.MenuItemImpl) r5
            boolean r5 = r5.isActionViewExpanded()
            r0 = r5 ^ 1
            goto L57
        L54:
            if (r1 <= 0) goto L57
            r0 = r2
        L57:
            if (r0 == 0) goto L87
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r5 = r4.mOverflowButton
            if (r5 != 0) goto L66
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r5 = new androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton
            android.content.Context r0 = r4.mSystemContext
            r5.<init>(r4, r0)
            r4.mOverflowButton = r5
        L66:
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r5 = r4.mOverflowButton
            android.view.ViewParent r5 = r5.getParent()
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            androidx.appcompat.view.menu.MenuView r0 = r4.mMenuView
            if (r5 == r0) goto L9c
            if (r5 == 0) goto L79
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r0 = r4.mOverflowButton
            r5.removeView(r0)
        L79:
            androidx.appcompat.view.menu.MenuView r5 = r4.mMenuView
            androidx.appcompat.widget.ActionMenuView r5 = (androidx.appcompat.widget.ActionMenuView) r5
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r0 = r4.mOverflowButton
            androidx.appcompat.widget.ActionMenuView$LayoutParams r1 = r5.generateOverflowButtonLayoutParams()
            r5.addView(r0, r1)
            goto L9c
        L87:
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r5 = r4.mOverflowButton
            if (r5 == 0) goto L9c
            android.view.ViewParent r5 = r5.getParent()
            androidx.appcompat.view.menu.MenuView r0 = r4.mMenuView
            if (r5 != r0) goto L9c
            androidx.appcompat.view.menu.MenuView r5 = r4.mMenuView
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r0 = r4.mOverflowButton
            r5.removeView(r0)
        L9c:
            androidx.appcompat.view.menu.MenuView r5 = r4.mMenuView
            androidx.appcompat.widget.ActionMenuView r5 = (androidx.appcompat.widget.ActionMenuView) r5
            boolean r0 = r4.mReserveOverflow
            r5.setOverflowReserved(r0)
            return
    }
}
