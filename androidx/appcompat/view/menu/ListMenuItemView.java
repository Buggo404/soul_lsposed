package androidx.appcompat.view.menu;

/* loaded from: classes.dex */
public class ListMenuItemView extends android.widget.LinearLayout implements androidx.appcompat.view.menu.MenuView.ItemView, android.widget.AbsListView.SelectionBoundsAdjuster {
    private static final java.lang.String TAG = "ListMenuItemView";
    private android.graphics.drawable.Drawable mBackground;
    private android.widget.CheckBox mCheckBox;
    private android.widget.LinearLayout mContent;
    private boolean mForceShowIcon;
    private android.widget.ImageView mGroupDivider;
    private boolean mHasListDivider;
    private android.widget.ImageView mIconView;
    private android.view.LayoutInflater mInflater;
    private androidx.appcompat.view.menu.MenuItemImpl mItemData;
    private boolean mPreserveIconSpacing;
    private android.widget.RadioButton mRadioButton;
    private android.widget.TextView mShortcutView;
    private android.graphics.drawable.Drawable mSubMenuArrow;
    private android.widget.ImageView mSubMenuArrowView;
    private int mTextAppearance;
    private android.content.Context mTextAppearanceContext;
    private android.widget.TextView mTitleView;

    public ListMenuItemView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = androidx.appcompat.C0015R.attr.listMenuViewStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public ListMenuItemView(android.content.Context r4, android.util.AttributeSet r5, int r6) {
            r3 = this;
            r3.<init>(r4, r5)
            android.content.Context r0 = r3.getContext()
            int[] r1 = androidx.appcompat.C0015R.styleable.MenuView
            r2 = 0
            androidx.appcompat.widget.TintTypedArray r5 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r0, r5, r1, r6, r2)
            int r6 = androidx.appcompat.C0015R.styleable.MenuView_android_itemBackground
            android.graphics.drawable.Drawable r6 = r5.getDrawable(r6)
            r3.mBackground = r6
            int r6 = androidx.appcompat.C0015R.styleable.MenuView_android_itemTextAppearance
            r0 = -1
            int r6 = r5.getResourceId(r6, r0)
            r3.mTextAppearance = r6
            int r6 = androidx.appcompat.C0015R.styleable.MenuView_preserveIconSpacing
            boolean r6 = r5.getBoolean(r6, r2)
            r3.mPreserveIconSpacing = r6
            r3.mTextAppearanceContext = r4
            int r6 = androidx.appcompat.C0015R.styleable.MenuView_subMenuArrow
            android.graphics.drawable.Drawable r6 = r5.getDrawable(r6)
            r3.mSubMenuArrow = r6
            android.content.res.Resources$Theme r4 = r4.getTheme()
            r6 = 1
            int[] r6 = new int[r6]
            r0 = 16843049(0x1010129, float:2.369439E-38)
            r6[r2] = r0
            int r0 = androidx.appcompat.C0015R.attr.dropDownListViewStyle
            r1 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r1, r6, r0, r2)
            boolean r6 = r4.hasValue(r2)
            r3.mHasListDivider = r6
            r5.recycle()
            r4.recycle()
            return
    }

    private void addContentView(android.view.View r2) {
            r1 = this;
            r0 = -1
            r1.addContentView(r2, r0)
            return
    }

    private void addContentView(android.view.View r2, int r3) {
            r1 = this;
            android.widget.LinearLayout r0 = r1.mContent
            if (r0 == 0) goto L8
            r0.addView(r2, r3)
            goto Lb
        L8:
            r1.addView(r2, r3)
        Lb:
            return
    }

    private android.view.LayoutInflater getInflater() {
            r1 = this;
            android.view.LayoutInflater r0 = r1.mInflater
            if (r0 != 0) goto Le
            android.content.Context r0 = r1.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1.mInflater = r0
        Le:
            android.view.LayoutInflater r0 = r1.mInflater
            return r0
    }

    private void insertCheckBox() {
            r3 = this;
            android.view.LayoutInflater r0 = r3.getInflater()
            int r1 = androidx.appcompat.C0015R.layout.abc_list_menu_item_checkbox
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            android.widget.CheckBox r0 = (android.widget.CheckBox) r0
            r3.mCheckBox = r0
            r3.addContentView(r0)
            return
    }

    private void insertIconView() {
            r3 = this;
            android.view.LayoutInflater r0 = r3.getInflater()
            int r1 = androidx.appcompat.C0015R.layout.abc_list_menu_item_icon
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.mIconView = r0
            r3.addContentView(r0, r2)
            return
    }

    private void insertRadioButton() {
            r3 = this;
            android.view.LayoutInflater r0 = r3.getInflater()
            int r1 = androidx.appcompat.C0015R.layout.abc_list_menu_item_radio
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            android.widget.RadioButton r0 = (android.widget.RadioButton) r0
            r3.mRadioButton = r0
            r3.addContentView(r0)
            return
    }

    private void setSubMenuArrowVisible(boolean r2) {
            r1 = this;
            android.widget.ImageView r0 = r1.mSubMenuArrowView
            if (r0 == 0) goto Ld
            if (r2 == 0) goto L8
            r2 = 0
            goto La
        L8:
            r2 = 8
        La:
            r0.setVisibility(r2)
        Ld:
            return
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(android.graphics.Rect r5) {
            r4 = this;
            android.widget.ImageView r0 = r4.mGroupDivider
            if (r0 == 0) goto L23
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L23
            android.widget.ImageView r0 = r4.mGroupDivider
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r1 = r5.top
            android.widget.ImageView r2 = r4.mGroupDivider
            int r2 = r2.getHeight()
            int r3 = r0.topMargin
            int r2 = r2 + r3
            int r0 = r0.bottomMargin
            int r2 = r2 + r0
            int r1 = r1 + r2
            r5.top = r1
        L23:
            return
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public androidx.appcompat.view.menu.MenuItemImpl getItemData() {
            r1 = this;
            androidx.appcompat.view.menu.MenuItemImpl r0 = r1.mItemData
            return r0
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void initialize(androidx.appcompat.view.menu.MenuItemImpl r2, int r3) {
            r1 = this;
            r1.mItemData = r2
            boolean r3 = r2.isVisible()
            if (r3 == 0) goto La
            r3 = 0
            goto Lc
        La:
            r3 = 8
        Lc:
            r1.setVisibility(r3)
            java.lang.CharSequence r3 = r2.getTitleForItemView(r1)
            r1.setTitle(r3)
            boolean r3 = r2.isCheckable()
            r1.setCheckable(r3)
            boolean r3 = r2.shouldShowShortcut()
            char r0 = r2.getShortcut()
            r1.setShortcut(r3, r0)
            android.graphics.drawable.Drawable r3 = r2.getIcon()
            r1.setIcon(r3)
            boolean r3 = r2.isEnabled()
            r1.setEnabled(r3)
            boolean r3 = r2.hasSubMenu()
            r1.setSubMenuArrowVisible(r3)
            java.lang.CharSequence r2 = r2.getContentDescription()
            r1.setContentDescription(r2)
            return
    }

    @Override // android.view.View
    protected void onFinishInflate() {
            r3 = this;
            super.onFinishInflate()
            android.graphics.drawable.Drawable r0 = r3.mBackground
            androidx.core.view.ViewCompat.setBackground(r3, r0)
            int r0 = androidx.appcompat.C0015R.id.title
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.mTitleView = r0
            int r1 = r3.mTextAppearance
            r2 = -1
            if (r1 == r2) goto L1c
            android.content.Context r2 = r3.mTextAppearanceContext
            r0.setTextAppearance(r2, r1)
        L1c:
            int r0 = androidx.appcompat.C0015R.id.shortcut
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.mShortcutView = r0
            int r0 = androidx.appcompat.C0015R.id.submenuarrow
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.mSubMenuArrowView = r0
            if (r0 == 0) goto L37
            android.graphics.drawable.Drawable r1 = r3.mSubMenuArrow
            r0.setImageDrawable(r1)
        L37:
            int r0 = androidx.appcompat.C0015R.id.group_divider
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.mGroupDivider = r0
            int r0 = androidx.appcompat.C0015R.id.content
            android.view.View r0 = r3.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r3.mContent = r0
            return
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int r4, int r5) {
            r3 = this;
            android.widget.ImageView r0 = r3.mIconView
            if (r0 == 0) goto L20
            boolean r0 = r3.mPreserveIconSpacing
            if (r0 == 0) goto L20
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            android.widget.ImageView r1 = r3.mIconView
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            int r2 = r0.height
            if (r2 <= 0) goto L20
            int r2 = r1.width
            if (r2 > 0) goto L20
            int r0 = r0.height
            r1.width = r0
        L20:
            super.onMeasure(r4, r5)
            return
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean prefersCondensedTitle() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setCheckable(boolean r4) {
            r3 = this;
            if (r4 != 0) goto Lb
            android.widget.RadioButton r0 = r3.mRadioButton
            if (r0 != 0) goto Lb
            android.widget.CheckBox r0 = r3.mCheckBox
            if (r0 != 0) goto Lb
            return
        Lb:
            androidx.appcompat.view.menu.MenuItemImpl r0 = r3.mItemData
            boolean r0 = r0.isExclusiveCheckable()
            if (r0 == 0) goto L1f
            android.widget.RadioButton r0 = r3.mRadioButton
            if (r0 != 0) goto L1a
            r3.insertRadioButton()
        L1a:
            android.widget.RadioButton r0 = r3.mRadioButton
            android.widget.CheckBox r1 = r3.mCheckBox
            goto L2a
        L1f:
            android.widget.CheckBox r0 = r3.mCheckBox
            if (r0 != 0) goto L26
            r3.insertCheckBox()
        L26:
            android.widget.CheckBox r0 = r3.mCheckBox
            android.widget.RadioButton r1 = r3.mRadioButton
        L2a:
            r2 = 8
            if (r4 == 0) goto L4d
            androidx.appcompat.view.menu.MenuItemImpl r4 = r3.mItemData
            boolean r4 = r4.isChecked()
            r0.setChecked(r4)
            int r4 = r0.getVisibility()
            if (r4 == 0) goto L41
            r4 = 0
            r0.setVisibility(r4)
        L41:
            if (r1 == 0) goto L5b
            int r4 = r1.getVisibility()
            if (r4 == r2) goto L5b
            r1.setVisibility(r2)
            goto L5b
        L4d:
            android.widget.CheckBox r4 = r3.mCheckBox
            if (r4 == 0) goto L54
            r4.setVisibility(r2)
        L54:
            android.widget.RadioButton r4 = r3.mRadioButton
            if (r4 == 0) goto L5b
            r4.setVisibility(r2)
        L5b:
            return
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setChecked(boolean r2) {
            r1 = this;
            androidx.appcompat.view.menu.MenuItemImpl r0 = r1.mItemData
            boolean r0 = r0.isExclusiveCheckable()
            if (r0 == 0) goto L12
            android.widget.RadioButton r0 = r1.mRadioButton
            if (r0 != 0) goto Lf
            r1.insertRadioButton()
        Lf:
            android.widget.RadioButton r0 = r1.mRadioButton
            goto L1b
        L12:
            android.widget.CheckBox r0 = r1.mCheckBox
            if (r0 != 0) goto L19
            r1.insertCheckBox()
        L19:
            android.widget.CheckBox r0 = r1.mCheckBox
        L1b:
            r0.setChecked(r2)
            return
    }

    public void setForceShowIcon(boolean r1) {
            r0 = this;
            r0.mForceShowIcon = r1
            r0.mPreserveIconSpacing = r1
            return
    }

    public void setGroupDividerEnabled(boolean r3) {
            r2 = this;
            android.widget.ImageView r0 = r2.mGroupDivider
            if (r0 == 0) goto L11
            boolean r1 = r2.mHasListDivider
            if (r1 != 0) goto Lc
            if (r3 == 0) goto Lc
            r3 = 0
            goto Le
        Lc:
            r3 = 8
        Le:
            r0.setVisibility(r3)
        L11:
            return
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setIcon(android.graphics.drawable.Drawable r5) {
            r4 = this;
            androidx.appcompat.view.menu.MenuItemImpl r0 = r4.mItemData
            boolean r0 = r0.shouldShowIcon()
            r1 = 0
            if (r0 != 0) goto L10
            boolean r0 = r4.mForceShowIcon
            if (r0 == 0) goto Le
            goto L10
        Le:
            r0 = r1
            goto L11
        L10:
            r0 = 1
        L11:
            if (r0 != 0) goto L18
            boolean r2 = r4.mPreserveIconSpacing
            if (r2 != 0) goto L18
            return
        L18:
            android.widget.ImageView r2 = r4.mIconView
            if (r2 != 0) goto L23
            if (r5 != 0) goto L23
            boolean r3 = r4.mPreserveIconSpacing
            if (r3 != 0) goto L23
            return
        L23:
            if (r2 != 0) goto L28
            r4.insertIconView()
        L28:
            if (r5 != 0) goto L37
            boolean r2 = r4.mPreserveIconSpacing
            if (r2 == 0) goto L2f
            goto L37
        L2f:
            android.widget.ImageView r5 = r4.mIconView
            r0 = 8
            r5.setVisibility(r0)
            goto L4d
        L37:
            android.widget.ImageView r2 = r4.mIconView
            if (r0 == 0) goto L3c
            goto L3d
        L3c:
            r5 = 0
        L3d:
            r2.setImageDrawable(r5)
            android.widget.ImageView r5 = r4.mIconView
            int r5 = r5.getVisibility()
            if (r5 == 0) goto L4d
            android.widget.ImageView r5 = r4.mIconView
            r5.setVisibility(r1)
        L4d:
            return
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setShortcut(boolean r2, char r3) {
            r1 = this;
            if (r2 == 0) goto Lc
            androidx.appcompat.view.menu.MenuItemImpl r2 = r1.mItemData
            boolean r2 = r2.shouldShowShortcut()
            if (r2 == 0) goto Lc
            r2 = 0
            goto Le
        Lc:
            r2 = 8
        Le:
            if (r2 != 0) goto L1b
            android.widget.TextView r3 = r1.mShortcutView
            androidx.appcompat.view.menu.MenuItemImpl r0 = r1.mItemData
            java.lang.String r0 = r0.getShortcutLabel()
            r3.setText(r0)
        L1b:
            android.widget.TextView r3 = r1.mShortcutView
            int r3 = r3.getVisibility()
            if (r3 == r2) goto L28
            android.widget.TextView r3 = r1.mShortcutView
            r3.setVisibility(r2)
        L28:
            return
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setTitle(java.lang.CharSequence r2) {
            r1 = this;
            if (r2 == 0) goto L16
            android.widget.TextView r0 = r1.mTitleView
            r0.setText(r2)
            android.widget.TextView r2 = r1.mTitleView
            int r2 = r2.getVisibility()
            if (r2 == 0) goto L25
            android.widget.TextView r2 = r1.mTitleView
            r0 = 0
            r2.setVisibility(r0)
            goto L25
        L16:
            android.widget.TextView r2 = r1.mTitleView
            int r2 = r2.getVisibility()
            r0 = 8
            if (r2 == r0) goto L25
            android.widget.TextView r2 = r1.mTitleView
            r2.setVisibility(r0)
        L25:
            return
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean showsIcon() {
            r1 = this;
            boolean r0 = r1.mForceShowIcon
            return r0
    }
}
