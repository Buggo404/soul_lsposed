package androidx.appcompat.view.menu;

/* loaded from: classes.dex */
public class ActionMenuItemView extends androidx.appcompat.widget.AppCompatTextView implements androidx.appcompat.view.menu.MenuView.ItemView, android.view.View.OnClickListener, androidx.appcompat.widget.ActionMenuView.ActionMenuChildView {
    private static final int MAX_ICON_SIZE = 32;
    private static final java.lang.String TAG = "ActionMenuItemView";
    private boolean mAllowTextWithIcon;
    private boolean mExpandedFormat;
    private androidx.appcompat.widget.ForwardingListener mForwardingListener;
    private android.graphics.drawable.Drawable mIcon;
    androidx.appcompat.view.menu.MenuItemImpl mItemData;
    androidx.appcompat.view.menu.MenuBuilder.ItemInvoker mItemInvoker;
    private int mMaxIconSize;
    private int mMinWidth;
    androidx.appcompat.view.menu.ActionMenuItemView.PopupCallback mPopupCallback;
    private int mSavedPaddingLeft;
    private java.lang.CharSequence mTitle;

    private class ActionMenuItemForwardingListener extends androidx.appcompat.widget.ForwardingListener {
        final /* synthetic */ androidx.appcompat.view.menu.ActionMenuItemView this$0;

        public ActionMenuItemForwardingListener(androidx.appcompat.view.menu.ActionMenuItemView r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        public androidx.appcompat.view.menu.ShowableListMenu getPopup() {
                r1 = this;
                androidx.appcompat.view.menu.ActionMenuItemView r0 = r1.this$0
                androidx.appcompat.view.menu.ActionMenuItemView$PopupCallback r0 = r0.mPopupCallback
                if (r0 == 0) goto Lf
                androidx.appcompat.view.menu.ActionMenuItemView r0 = r1.this$0
                androidx.appcompat.view.menu.ActionMenuItemView$PopupCallback r0 = r0.mPopupCallback
                androidx.appcompat.view.menu.ShowableListMenu r0 = r0.getPopup()
                return r0
            Lf:
                r0 = 0
                return r0
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        protected boolean onForwardingStarted() {
                r3 = this;
                androidx.appcompat.view.menu.ActionMenuItemView r0 = r3.this$0
                androidx.appcompat.view.menu.MenuBuilder$ItemInvoker r0 = r0.mItemInvoker
                r1 = 0
                if (r0 == 0) goto L22
                androidx.appcompat.view.menu.ActionMenuItemView r0 = r3.this$0
                androidx.appcompat.view.menu.MenuBuilder$ItemInvoker r0 = r0.mItemInvoker
                androidx.appcompat.view.menu.ActionMenuItemView r2 = r3.this$0
                androidx.appcompat.view.menu.MenuItemImpl r2 = r2.mItemData
                boolean r0 = r0.invokeItem(r2)
                if (r0 == 0) goto L22
                androidx.appcompat.view.menu.ShowableListMenu r0 = r3.getPopup()
                if (r0 == 0) goto L22
                boolean r0 = r0.isShowing()
                if (r0 == 0) goto L22
                r1 = 1
            L22:
                return r1
        }
    }

    public static abstract class PopupCallback {
        public PopupCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract androidx.appcompat.view.menu.ShowableListMenu getPopup();
    }

    public ActionMenuItemView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ActionMenuItemView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public ActionMenuItemView(android.content.Context r4, android.util.AttributeSet r5, int r6) {
            r3 = this;
            r3.<init>(r4, r5, r6)
            android.content.res.Resources r0 = r4.getResources()
            boolean r1 = r3.shouldAllowTextWithIcon()
            r3.mAllowTextWithIcon = r1
            int[] r1 = androidx.appcompat.C0015R.styleable.ActionMenuItemView
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r6, r2)
            int r5 = androidx.appcompat.C0015R.styleable.ActionMenuItemView_android_minWidth
            int r5 = r4.getDimensionPixelSize(r5, r2)
            r3.mMinWidth = r5
            r4.recycle()
            android.util.DisplayMetrics r4 = r0.getDisplayMetrics()
            float r4 = r4.density
            r5 = 1107296256(0x42000000, float:32.0)
            float r4 = r4 * r5
            r5 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 + r5
            int r4 = (int) r4
            r3.mMaxIconSize = r4
            r3.setOnClickListener(r3)
            r4 = -1
            r3.mSavedPaddingLeft = r4
            r3.setSaveEnabled(r2)
            return
    }

    private boolean shouldAllowTextWithIcon() {
            r5 = this;
            android.content.Context r0 = r5.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r1 = r0.screenWidthDp
            int r2 = r0.screenHeightDp
            r3 = 480(0x1e0, float:6.73E-43)
            if (r1 >= r3) goto L22
            r4 = 640(0x280, float:8.97E-43)
            if (r1 < r4) goto L1a
            if (r2 >= r3) goto L22
        L1a:
            int r0 = r0.orientation
            r1 = 2
            if (r0 != r1) goto L20
            goto L22
        L20:
            r0 = 0
            goto L23
        L22:
            r0 = 1
        L23:
            return r0
    }

    private void updateTextButtonVisibility() {
            r4 = this;
            java.lang.CharSequence r0 = r4.mTitle
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 1
            r0 = r0 ^ r1
            android.graphics.drawable.Drawable r2 = r4.mIcon
            if (r2 == 0) goto L1e
            androidx.appcompat.view.menu.MenuItemImpl r2 = r4.mItemData
            boolean r2 = r2.showsTextAsAction()
            if (r2 == 0) goto L1d
            boolean r2 = r4.mAllowTextWithIcon
            if (r2 != 0) goto L1e
            boolean r2 = r4.mExpandedFormat
            if (r2 == 0) goto L1d
            goto L1e
        L1d:
            r1 = 0
        L1e:
            r0 = r0 & r1
            r1 = 0
            if (r0 == 0) goto L25
            java.lang.CharSequence r2 = r4.mTitle
            goto L26
        L25:
            r2 = r1
        L26:
            r4.setText(r2)
            androidx.appcompat.view.menu.MenuItemImpl r2 = r4.mItemData
            java.lang.CharSequence r2 = r2.getContentDescription()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L43
            if (r0 == 0) goto L39
            r2 = r1
            goto L3f
        L39:
            androidx.appcompat.view.menu.MenuItemImpl r2 = r4.mItemData
            java.lang.CharSequence r2 = r2.getTitle()
        L3f:
            r4.setContentDescription(r2)
            goto L46
        L43:
            r4.setContentDescription(r2)
        L46:
            androidx.appcompat.view.menu.MenuItemImpl r2 = r4.mItemData
            java.lang.CharSequence r2 = r2.getTooltipText()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L5f
            if (r0 == 0) goto L55
            goto L5b
        L55:
            androidx.appcompat.view.menu.MenuItemImpl r0 = r4.mItemData
            java.lang.CharSequence r1 = r0.getTitle()
        L5b:
            androidx.appcompat.widget.TooltipCompat.setTooltipText(r4, r1)
            goto L62
        L5f:
            androidx.appcompat.widget.TooltipCompat.setTooltipText(r4, r2)
        L62:
            return
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public androidx.appcompat.view.menu.MenuItemImpl getItemData() {
            r1 = this;
            androidx.appcompat.view.menu.MenuItemImpl r0 = r1.mItemData
            return r0
    }

    public boolean hasText() {
            r1 = this;
            java.lang.CharSequence r0 = r1.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            return r0
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void initialize(androidx.appcompat.view.menu.MenuItemImpl r1, int r2) {
            r0 = this;
            r0.mItemData = r1
            android.graphics.drawable.Drawable r2 = r1.getIcon()
            r0.setIcon(r2)
            java.lang.CharSequence r2 = r1.getTitleForItemView(r0)
            r0.setTitle(r2)
            int r2 = r1.getItemId()
            r0.setId(r2)
            boolean r2 = r1.isVisible()
            if (r2 == 0) goto L1f
            r2 = 0
            goto L21
        L1f:
            r2 = 8
        L21:
            r0.setVisibility(r2)
            boolean r2 = r1.isEnabled()
            r0.setEnabled(r2)
            boolean r1 = r1.hasSubMenu()
            if (r1 == 0) goto L3c
            androidx.appcompat.widget.ForwardingListener r1 = r0.mForwardingListener
            if (r1 != 0) goto L3c
            androidx.appcompat.view.menu.ActionMenuItemView$ActionMenuItemForwardingListener r1 = new androidx.appcompat.view.menu.ActionMenuItemView$ActionMenuItemForwardingListener
            r1.<init>(r0)
            r0.mForwardingListener = r1
        L3c:
            return
    }

    @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
    public boolean needsDividerAfter() {
            r1 = this;
            boolean r0 = r1.hasText()
            return r0
    }

    @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
    public boolean needsDividerBefore() {
            r1 = this;
            boolean r0 = r1.hasText()
            if (r0 == 0) goto L10
            androidx.appcompat.view.menu.MenuItemImpl r0 = r1.mItemData
            android.graphics.drawable.Drawable r0 = r0.getIcon()
            if (r0 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r2) {
            r1 = this;
            androidx.appcompat.view.menu.MenuBuilder$ItemInvoker r2 = r1.mItemInvoker
            if (r2 == 0) goto L9
            androidx.appcompat.view.menu.MenuItemImpl r0 = r1.mItemData
            r2.invokeItem(r0)
        L9:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            super.onConfigurationChanged(r1)
            boolean r1 = r0.shouldAllowTextWithIcon()
            r0.mAllowTextWithIcon = r1
            r0.updateTextButtonVisibility()
            return
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected void onMeasure(int r6, int r7) {
            r5 = this;
            boolean r0 = r5.hasText()
            if (r0 == 0) goto L19
            int r1 = r5.mSavedPaddingLeft
            if (r1 < 0) goto L19
            int r2 = r5.getPaddingTop()
            int r3 = r5.getPaddingRight()
            int r4 = r5.getPaddingBottom()
            super.setPadding(r1, r2, r3, r4)
        L19:
            super.onMeasure(r6, r7)
            int r1 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r2 = r5.getMeasuredWidth()
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r3) goto L33
            int r3 = r5.mMinWidth
            int r6 = java.lang.Math.min(r6, r3)
            goto L35
        L33:
            int r6 = r5.mMinWidth
        L35:
            r3 = 1073741824(0x40000000, float:2.0)
            if (r1 == r3) goto L46
            int r1 = r5.mMinWidth
            if (r1 <= 0) goto L46
            if (r2 >= r6) goto L46
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r3)
            super.onMeasure(r6, r7)
        L46:
            if (r0 != 0) goto L6c
            android.graphics.drawable.Drawable r6 = r5.mIcon
            if (r6 == 0) goto L6c
            int r6 = r5.getMeasuredWidth()
            android.graphics.drawable.Drawable r7 = r5.mIcon
            android.graphics.Rect r7 = r7.getBounds()
            int r7 = r7.width()
            int r6 = r6 - r7
            int r6 = r6 / 2
            int r7 = r5.getPaddingTop()
            int r0 = r5.getPaddingRight()
            int r1 = r5.getPaddingBottom()
            super.setPadding(r6, r7, r0, r1)
        L6c:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(android.os.Parcelable r1) {
            r0 = this;
            r1 = 0
            super.onRestoreInstanceState(r1)
            return
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            androidx.appcompat.view.menu.MenuItemImpl r0 = r1.mItemData
            boolean r0 = r0.hasSubMenu()
            if (r0 == 0) goto L14
            androidx.appcompat.widget.ForwardingListener r0 = r1.mForwardingListener
            if (r0 == 0) goto L14
            boolean r0 = r0.onTouch(r1, r2)
            if (r0 == 0) goto L14
            r2 = 1
            return r2
        L14:
            boolean r2 = super.onTouchEvent(r2)
            return r2
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean prefersCondensedTitle() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setCheckable(boolean r1) {
            r0 = this;
            return
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setChecked(boolean r1) {
            r0 = this;
            return
    }

    public void setExpandedFormat(boolean r2) {
            r1 = this;
            boolean r0 = r1.mExpandedFormat
            if (r0 == r2) goto Ld
            r1.mExpandedFormat = r2
            androidx.appcompat.view.menu.MenuItemImpl r2 = r1.mItemData
            if (r2 == 0) goto Ld
            r2.actionFormatChanged()
        Ld:
            return
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setIcon(android.graphics.drawable.Drawable r5) {
            r4 = this;
            r4.mIcon = r5
            if (r5 == 0) goto L25
            int r0 = r5.getIntrinsicWidth()
            int r1 = r5.getIntrinsicHeight()
            int r2 = r4.mMaxIconSize
            if (r0 <= r2) goto L17
            float r3 = (float) r2
            float r0 = (float) r0
            float r3 = r3 / r0
            float r0 = (float) r1
            float r0 = r0 * r3
            int r1 = (int) r0
            r0 = r2
        L17:
            if (r1 <= r2) goto L20
            float r3 = (float) r2
            float r1 = (float) r1
            float r3 = r3 / r1
            float r0 = (float) r0
            float r0 = r0 * r3
            int r0 = (int) r0
            goto L21
        L20:
            r2 = r1
        L21:
            r1 = 0
            r5.setBounds(r1, r1, r0, r2)
        L25:
            r0 = 0
            r4.setCompoundDrawables(r5, r0, r0, r0)
            r4.updateTextButtonVisibility()
            return
    }

    public void setItemInvoker(androidx.appcompat.view.menu.MenuBuilder.ItemInvoker r1) {
            r0 = this;
            r0.mItemInvoker = r1
            return
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.mSavedPaddingLeft = r1
            super.setPadding(r1, r2, r3, r4)
            return
    }

    public void setPopupCallback(androidx.appcompat.view.menu.ActionMenuItemView.PopupCallback r1) {
            r0 = this;
            r0.mPopupCallback = r1
            return
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setShortcut(boolean r1, char r2) {
            r0 = this;
            return
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setTitle(java.lang.CharSequence r1) {
            r0 = this;
            r0.mTitle = r1
            r0.updateTextButtonVisibility()
            return
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean showsIcon() {
            r1 = this;
            r0 = 1
            return r0
    }
}
