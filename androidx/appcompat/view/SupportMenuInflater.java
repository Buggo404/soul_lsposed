package androidx.appcompat.view;

/* loaded from: classes.dex */
public class SupportMenuInflater extends android.view.MenuInflater {
    static final java.lang.Class<?>[] ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE = null;
    static final java.lang.Class<?>[] ACTION_VIEW_CONSTRUCTOR_SIGNATURE = null;
    static final java.lang.String LOG_TAG = "SupportMenuInflater";
    static final int NO_ID = 0;
    private static final java.lang.String XML_GROUP = "group";
    private static final java.lang.String XML_ITEM = "item";
    private static final java.lang.String XML_MENU = "menu";
    final java.lang.Object[] mActionProviderConstructorArguments;
    final java.lang.Object[] mActionViewConstructorArguments;
    android.content.Context mContext;
    private java.lang.Object mRealOwner;

    private static class InflatedOnMenuItemClickListener implements android.view.MenuItem.OnMenuItemClickListener {
        private static final java.lang.Class<?>[] PARAM_TYPES = null;
        private java.lang.reflect.Method mMethod;
        private java.lang.Object mRealOwner;

        static {
                r0 = 1
                java.lang.Class[] r0 = new java.lang.Class[r0]
                r1 = 0
                java.lang.Class<android.view.MenuItem> r2 = android.view.MenuItem.class
                r0[r1] = r2
                androidx.appcompat.view.SupportMenuInflater.InflatedOnMenuItemClickListener.PARAM_TYPES = r0
                return
        }

        public InflatedOnMenuItemClickListener(java.lang.Object r5, java.lang.String r6) {
                r4 = this;
                r4.<init>()
                r4.mRealOwner = r5
                java.lang.Class r5 = r5.getClass()
                java.lang.Class<?>[] r0 = androidx.appcompat.view.SupportMenuInflater.InflatedOnMenuItemClickListener.PARAM_TYPES     // Catch: java.lang.Exception -> L12
                java.lang.reflect.Method r0 = r5.getMethod(r6, r0)     // Catch: java.lang.Exception -> L12
                r4.mMethod = r0     // Catch: java.lang.Exception -> L12
                return
            L12:
                r0 = move-exception
                android.view.InflateException r1 = new android.view.InflateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "Couldn't resolve menu item onClick handler "
                r2.<init>(r3)
                java.lang.StringBuilder r6 = r2.append(r6)
                java.lang.String r2 = " in class "
                java.lang.StringBuilder r6 = r6.append(r2)
                java.lang.String r5 = r5.getName()
                java.lang.StringBuilder r5 = r6.append(r5)
                java.lang.String r5 = r5.toString()
                r1.<init>(r5)
                r1.initCause(r0)
                throw r1
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(android.view.MenuItem r6) {
                r5 = this;
                java.lang.reflect.Method r0 = r5.mMethod     // Catch: java.lang.Exception -> L2b
                java.lang.Class r0 = r0.getReturnType()     // Catch: java.lang.Exception -> L2b
                java.lang.Class r1 = java.lang.Boolean.TYPE     // Catch: java.lang.Exception -> L2b
                r2 = 0
                r3 = 1
                if (r0 != r1) goto L1f
                java.lang.reflect.Method r0 = r5.mMethod     // Catch: java.lang.Exception -> L2b
                java.lang.Object r1 = r5.mRealOwner     // Catch: java.lang.Exception -> L2b
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L2b
                r3[r2] = r6     // Catch: java.lang.Exception -> L2b
                java.lang.Object r6 = r0.invoke(r1, r3)     // Catch: java.lang.Exception -> L2b
                java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Exception -> L2b
                boolean r6 = r6.booleanValue()     // Catch: java.lang.Exception -> L2b
                return r6
            L1f:
                java.lang.reflect.Method r0 = r5.mMethod     // Catch: java.lang.Exception -> L2b
                java.lang.Object r1 = r5.mRealOwner     // Catch: java.lang.Exception -> L2b
                java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L2b
                r4[r2] = r6     // Catch: java.lang.Exception -> L2b
                r0.invoke(r1, r4)     // Catch: java.lang.Exception -> L2b
                return r3
            L2b:
                r6 = move-exception
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                r0.<init>(r6)
                throw r0
        }
    }

    private class MenuState {
        private static final int defaultGroupId = 0;
        private static final int defaultItemCategory = 0;
        private static final int defaultItemCheckable = 0;
        private static final boolean defaultItemChecked = false;
        private static final boolean defaultItemEnabled = true;
        private static final int defaultItemId = 0;
        private static final int defaultItemOrder = 0;
        private static final boolean defaultItemVisible = true;
        private int groupCategory;
        private int groupCheckable;
        private boolean groupEnabled;
        private int groupId;
        private int groupOrder;
        private boolean groupVisible;
        androidx.core.view.ActionProvider itemActionProvider;
        private java.lang.String itemActionProviderClassName;
        private java.lang.String itemActionViewClassName;
        private int itemActionViewLayout;
        private boolean itemAdded;
        private int itemAlphabeticModifiers;
        private char itemAlphabeticShortcut;
        private int itemCategoryOrder;
        private int itemCheckable;
        private boolean itemChecked;
        private java.lang.CharSequence itemContentDescription;
        private boolean itemEnabled;
        private int itemIconResId;
        private android.content.res.ColorStateList itemIconTintList;
        private android.graphics.PorterDuff.Mode itemIconTintMode;
        private int itemId;
        private java.lang.String itemListenerMethodName;
        private int itemNumericModifiers;
        private char itemNumericShortcut;
        private int itemShowAsAction;
        private java.lang.CharSequence itemTitle;
        private java.lang.CharSequence itemTitleCondensed;
        private java.lang.CharSequence itemTooltipText;
        private boolean itemVisible;
        private android.view.Menu menu;
        final /* synthetic */ androidx.appcompat.view.SupportMenuInflater this$0;

        public MenuState(androidx.appcompat.view.SupportMenuInflater r1, android.view.Menu r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r1 = 0
                r0.itemIconTintList = r1
                r0.itemIconTintMode = r1
                r0.menu = r2
                r0.resetGroup()
                return
        }

        private char getShortcut(java.lang.String r2) {
                r1 = this;
                r0 = 0
                if (r2 != 0) goto L4
                return r0
            L4:
                char r2 = r2.charAt(r0)
                return r2
        }

        private <T> T newInstance(java.lang.String r3, java.lang.Class<?>[] r4, java.lang.Object[] r5) {
                r2 = this;
                androidx.appcompat.view.SupportMenuInflater r0 = r2.this$0     // Catch: java.lang.Exception -> L1a
                android.content.Context r0 = r0.mContext     // Catch: java.lang.Exception -> L1a
                java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.Exception -> L1a
                r1 = 0
                java.lang.Class r0 = java.lang.Class.forName(r3, r1, r0)     // Catch: java.lang.Exception -> L1a
                java.lang.reflect.Constructor r4 = r0.getConstructor(r4)     // Catch: java.lang.Exception -> L1a
                r0 = 1
                r4.setAccessible(r0)     // Catch: java.lang.Exception -> L1a
                java.lang.Object r3 = r4.newInstance(r5)     // Catch: java.lang.Exception -> L1a
                return r3
            L1a:
                r4 = move-exception
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                java.lang.String r0 = "Cannot instantiate class: "
                r5.<init>(r0)
                java.lang.StringBuilder r3 = r5.append(r3)
                java.lang.String r3 = r3.toString()
                java.lang.String r5 = "SupportMenuInflater"
                android.util.Log.w(r5, r3, r4)
                r3 = 0
                return r3
        }

        private void setItem(android.view.MenuItem r6) {
                r5 = this;
                boolean r0 = r5.itemChecked
                android.view.MenuItem r0 = r6.setChecked(r0)
                boolean r1 = r5.itemVisible
                android.view.MenuItem r0 = r0.setVisible(r1)
                boolean r1 = r5.itemEnabled
                android.view.MenuItem r0 = r0.setEnabled(r1)
                int r1 = r5.itemCheckable
                r2 = 0
                r3 = 1
                if (r1 < r3) goto L1a
                r1 = r3
                goto L1b
            L1a:
                r1 = r2
            L1b:
                android.view.MenuItem r0 = r0.setCheckable(r1)
                java.lang.CharSequence r1 = r5.itemTitleCondensed
                android.view.MenuItem r0 = r0.setTitleCondensed(r1)
                int r1 = r5.itemIconResId
                r0.setIcon(r1)
                int r0 = r5.itemShowAsAction
                if (r0 < 0) goto L31
                r6.setShowAsAction(r0)
            L31:
                java.lang.String r0 = r5.itemListenerMethodName
                if (r0 == 0) goto L58
                androidx.appcompat.view.SupportMenuInflater r0 = r5.this$0
                android.content.Context r0 = r0.mContext
                boolean r0 = r0.isRestricted()
                if (r0 != 0) goto L50
                androidx.appcompat.view.SupportMenuInflater$InflatedOnMenuItemClickListener r0 = new androidx.appcompat.view.SupportMenuInflater$InflatedOnMenuItemClickListener
                androidx.appcompat.view.SupportMenuInflater r1 = r5.this$0
                java.lang.Object r1 = r1.getRealOwner()
                java.lang.String r4 = r5.itemListenerMethodName
                r0.<init>(r1, r4)
                r6.setOnMenuItemClickListener(r0)
                goto L58
            L50:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "The android:onClick attribute cannot be used within a restricted context"
                r6.<init>(r0)
                throw r6
            L58:
                int r0 = r5.itemCheckable
                r1 = 2
                if (r0 < r1) goto L72
                boolean r0 = r6 instanceof androidx.appcompat.view.menu.MenuItemImpl
                if (r0 == 0) goto L68
                r0 = r6
                androidx.appcompat.view.menu.MenuItemImpl r0 = (androidx.appcompat.view.menu.MenuItemImpl) r0
                r0.setExclusiveCheckable(r3)
                goto L72
            L68:
                boolean r0 = r6 instanceof androidx.appcompat.view.menu.MenuItemWrapperICS
                if (r0 == 0) goto L72
                r0 = r6
                androidx.appcompat.view.menu.MenuItemWrapperICS r0 = (androidx.appcompat.view.menu.MenuItemWrapperICS) r0
                r0.setExclusiveCheckable(r3)
            L72:
                java.lang.String r0 = r5.itemActionViewClassName
                if (r0 == 0) goto L86
                java.lang.Class<?>[] r1 = androidx.appcompat.view.SupportMenuInflater.ACTION_VIEW_CONSTRUCTOR_SIGNATURE
                androidx.appcompat.view.SupportMenuInflater r2 = r5.this$0
                java.lang.Object[] r2 = r2.mActionViewConstructorArguments
                java.lang.Object r0 = r5.newInstance(r0, r1, r2)
                android.view.View r0 = (android.view.View) r0
                r6.setActionView(r0)
                r2 = r3
            L86:
                int r0 = r5.itemActionViewLayout
                if (r0 <= 0) goto L97
                if (r2 != 0) goto L90
                r6.setActionView(r0)
                goto L97
            L90:
                java.lang.String r0 = "SupportMenuInflater"
                java.lang.String r1 = "Ignoring attribute 'itemActionViewLayout'. Action view already specified."
                android.util.Log.w(r0, r1)
            L97:
                androidx.core.view.ActionProvider r0 = r5.itemActionProvider
                if (r0 == 0) goto L9e
                androidx.core.view.MenuItemCompat.setActionProvider(r6, r0)
            L9e:
                java.lang.CharSequence r0 = r5.itemContentDescription
                androidx.core.view.MenuItemCompat.setContentDescription(r6, r0)
                java.lang.CharSequence r0 = r5.itemTooltipText
                androidx.core.view.MenuItemCompat.setTooltipText(r6, r0)
                char r0 = r5.itemAlphabeticShortcut
                int r1 = r5.itemAlphabeticModifiers
                androidx.core.view.MenuItemCompat.setAlphabeticShortcut(r6, r0, r1)
                char r0 = r5.itemNumericShortcut
                int r1 = r5.itemNumericModifiers
                androidx.core.view.MenuItemCompat.setNumericShortcut(r6, r0, r1)
                android.graphics.PorterDuff$Mode r0 = r5.itemIconTintMode
                if (r0 == 0) goto Lbd
                androidx.core.view.MenuItemCompat.setIconTintMode(r6, r0)
            Lbd:
                android.content.res.ColorStateList r0 = r5.itemIconTintList
                if (r0 == 0) goto Lc4
                androidx.core.view.MenuItemCompat.setIconTintList(r6, r0)
            Lc4:
                return
        }

        public void addItem() {
                r5 = this;
                r0 = 1
                r5.itemAdded = r0
                android.view.Menu r0 = r5.menu
                int r1 = r5.groupId
                int r2 = r5.itemId
                int r3 = r5.itemCategoryOrder
                java.lang.CharSequence r4 = r5.itemTitle
                android.view.MenuItem r0 = r0.add(r1, r2, r3, r4)
                r5.setItem(r0)
                return
        }

        public android.view.SubMenu addSubMenuItem() {
                r5 = this;
                r0 = 1
                r5.itemAdded = r0
                android.view.Menu r0 = r5.menu
                int r1 = r5.groupId
                int r2 = r5.itemId
                int r3 = r5.itemCategoryOrder
                java.lang.CharSequence r4 = r5.itemTitle
                android.view.SubMenu r0 = r0.addSubMenu(r1, r2, r3, r4)
                android.view.MenuItem r1 = r0.getItem()
                r5.setItem(r1)
                return r0
        }

        public boolean hasAddedItem() {
                r1 = this;
                boolean r0 = r1.itemAdded
                return r0
        }

        public void readGroup(android.util.AttributeSet r3) {
                r2 = this;
                androidx.appcompat.view.SupportMenuInflater r0 = r2.this$0
                android.content.Context r0 = r0.mContext
                int[] r1 = androidx.appcompat.C0015R.styleable.MenuGroup
                android.content.res.TypedArray r3 = r0.obtainStyledAttributes(r3, r1)
                int r0 = androidx.appcompat.C0015R.styleable.MenuGroup_android_id
                r1 = 0
                int r0 = r3.getResourceId(r0, r1)
                r2.groupId = r0
                int r0 = androidx.appcompat.C0015R.styleable.MenuGroup_android_menuCategory
                int r0 = r3.getInt(r0, r1)
                r2.groupCategory = r0
                int r0 = androidx.appcompat.C0015R.styleable.MenuGroup_android_orderInCategory
                int r0 = r3.getInt(r0, r1)
                r2.groupOrder = r0
                int r0 = androidx.appcompat.C0015R.styleable.MenuGroup_android_checkableBehavior
                int r0 = r3.getInt(r0, r1)
                r2.groupCheckable = r0
                int r0 = androidx.appcompat.C0015R.styleable.MenuGroup_android_visible
                r1 = 1
                boolean r0 = r3.getBoolean(r0, r1)
                r2.groupVisible = r0
                int r0 = androidx.appcompat.C0015R.styleable.MenuGroup_android_enabled
                boolean r0 = r3.getBoolean(r0, r1)
                r2.groupEnabled = r0
                r3.recycle()
                return
        }

        public void readItem(android.util.AttributeSet r7) {
                r6 = this;
                androidx.appcompat.view.SupportMenuInflater r0 = r6.this$0
                android.content.Context r0 = r0.mContext
                int[] r1 = androidx.appcompat.C0015R.styleable.MenuItem
                androidx.appcompat.widget.TintTypedArray r7 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r0, r7, r1)
                int r0 = androidx.appcompat.C0015R.styleable.MenuItem_android_id
                r1 = 0
                int r0 = r7.getResourceId(r0, r1)
                r6.itemId = r0
                int r0 = androidx.appcompat.C0015R.styleable.MenuItem_android_menuCategory
                int r2 = r6.groupCategory
                int r0 = r7.getInt(r0, r2)
                int r2 = androidx.appcompat.C0015R.styleable.MenuItem_android_orderInCategory
                int r3 = r6.groupOrder
                int r2 = r7.getInt(r2, r3)
                r3 = -65536(0xffffffffffff0000, float:NaN)
                r0 = r0 & r3
                r3 = 65535(0xffff, float:9.1834E-41)
                r2 = r2 & r3
                r0 = r0 | r2
                r6.itemCategoryOrder = r0
                int r0 = androidx.appcompat.C0015R.styleable.MenuItem_android_title
                java.lang.CharSequence r0 = r7.getText(r0)
                r6.itemTitle = r0
                int r0 = androidx.appcompat.C0015R.styleable.MenuItem_android_titleCondensed
                java.lang.CharSequence r0 = r7.getText(r0)
                r6.itemTitleCondensed = r0
                int r0 = androidx.appcompat.C0015R.styleable.MenuItem_android_icon
                int r0 = r7.getResourceId(r0, r1)
                r6.itemIconResId = r0
                int r0 = androidx.appcompat.C0015R.styleable.MenuItem_android_alphabeticShortcut
                java.lang.String r0 = r7.getString(r0)
                char r0 = r6.getShortcut(r0)
                r6.itemAlphabeticShortcut = r0
                int r0 = androidx.appcompat.C0015R.styleable.MenuItem_alphabeticModifiers
                r2 = 4096(0x1000, float:5.74E-42)
                int r0 = r7.getInt(r0, r2)
                r6.itemAlphabeticModifiers = r0
                int r0 = androidx.appcompat.C0015R.styleable.MenuItem_android_numericShortcut
                java.lang.String r0 = r7.getString(r0)
                char r0 = r6.getShortcut(r0)
                r6.itemNumericShortcut = r0
                int r0 = androidx.appcompat.C0015R.styleable.MenuItem_numericModifiers
                int r0 = r7.getInt(r0, r2)
                r6.itemNumericModifiers = r0
                int r0 = androidx.appcompat.C0015R.styleable.MenuItem_android_checkable
                boolean r0 = r7.hasValue(r0)
                if (r0 == 0) goto L80
                int r0 = androidx.appcompat.C0015R.styleable.MenuItem_android_checkable
                boolean r0 = r7.getBoolean(r0, r1)
                r6.itemCheckable = r0
                goto L84
            L80:
                int r0 = r6.groupCheckable
                r6.itemCheckable = r0
            L84:
                int r0 = androidx.appcompat.C0015R.styleable.MenuItem_android_checked
                boolean r0 = r7.getBoolean(r0, r1)
                r6.itemChecked = r0
                int r0 = androidx.appcompat.C0015R.styleable.MenuItem_android_visible
                boolean r2 = r6.groupVisible
                boolean r0 = r7.getBoolean(r0, r2)
                r6.itemVisible = r0
                int r0 = androidx.appcompat.C0015R.styleable.MenuItem_android_enabled
                boolean r2 = r6.groupEnabled
                boolean r0 = r7.getBoolean(r0, r2)
                r6.itemEnabled = r0
                int r0 = androidx.appcompat.C0015R.styleable.MenuItem_showAsAction
                r2 = -1
                int r0 = r7.getInt(r0, r2)
                r6.itemShowAsAction = r0
                int r0 = androidx.appcompat.C0015R.styleable.MenuItem_android_onClick
                java.lang.String r0 = r7.getString(r0)
                r6.itemListenerMethodName = r0
                int r0 = androidx.appcompat.C0015R.styleable.MenuItem_actionLayout
                int r0 = r7.getResourceId(r0, r1)
                r6.itemActionViewLayout = r0
                int r0 = androidx.appcompat.C0015R.styleable.MenuItem_actionViewClass
                java.lang.String r0 = r7.getString(r0)
                r6.itemActionViewClassName = r0
                int r0 = androidx.appcompat.C0015R.styleable.MenuItem_actionProviderClass
                java.lang.String r0 = r7.getString(r0)
                r6.itemActionProviderClassName = r0
                if (r0 == 0) goto Lcd
                r3 = 1
                goto Lce
            Lcd:
                r3 = r1
            Lce:
                r4 = 0
                if (r3 == 0) goto Le8
                int r5 = r6.itemActionViewLayout
                if (r5 != 0) goto Le8
                java.lang.String r5 = r6.itemActionViewClassName
                if (r5 != 0) goto Le8
                java.lang.Class<?>[] r3 = androidx.appcompat.view.SupportMenuInflater.ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE
                androidx.appcompat.view.SupportMenuInflater r5 = r6.this$0
                java.lang.Object[] r5 = r5.mActionProviderConstructorArguments
                java.lang.Object r0 = r6.newInstance(r0, r3, r5)
                androidx.core.view.ActionProvider r0 = (androidx.core.view.ActionProvider) r0
                r6.itemActionProvider = r0
                goto Lf3
            Le8:
                if (r3 == 0) goto Lf1
                java.lang.String r0 = "SupportMenuInflater"
                java.lang.String r3 = "Ignoring attribute 'actionProviderClass'. Action view already specified."
                android.util.Log.w(r0, r3)
            Lf1:
                r6.itemActionProvider = r4
            Lf3:
                int r0 = androidx.appcompat.C0015R.styleable.MenuItem_contentDescription
                java.lang.CharSequence r0 = r7.getText(r0)
                r6.itemContentDescription = r0
                int r0 = androidx.appcompat.C0015R.styleable.MenuItem_tooltipText
                java.lang.CharSequence r0 = r7.getText(r0)
                r6.itemTooltipText = r0
                int r0 = androidx.appcompat.C0015R.styleable.MenuItem_iconTintMode
                boolean r0 = r7.hasValue(r0)
                if (r0 == 0) goto L11a
                int r0 = androidx.appcompat.C0015R.styleable.MenuItem_iconTintMode
                int r0 = r7.getInt(r0, r2)
                android.graphics.PorterDuff$Mode r2 = r6.itemIconTintMode
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.DrawableUtils.parseTintMode(r0, r2)
                r6.itemIconTintMode = r0
                goto L11c
            L11a:
                r6.itemIconTintMode = r4
            L11c:
                int r0 = androidx.appcompat.C0015R.styleable.MenuItem_iconTint
                boolean r0 = r7.hasValue(r0)
                if (r0 == 0) goto L12d
                int r0 = androidx.appcompat.C0015R.styleable.MenuItem_iconTint
                android.content.res.ColorStateList r0 = r7.getColorStateList(r0)
                r6.itemIconTintList = r0
                goto L12f
            L12d:
                r6.itemIconTintList = r4
            L12f:
                r7.recycle()
                r6.itemAdded = r1
                return
        }

        public void resetGroup() {
                r1 = this;
                r0 = 0
                r1.groupId = r0
                r1.groupCategory = r0
                r1.groupOrder = r0
                r1.groupCheckable = r0
                r0 = 1
                r1.groupVisible = r0
                r1.groupEnabled = r0
                return
        }
    }

    static {
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            androidx.appcompat.view.SupportMenuInflater.ACTION_VIEW_CONSTRUCTOR_SIGNATURE = r0
            androidx.appcompat.view.SupportMenuInflater.ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE = r0
            return
    }

    public SupportMenuInflater(android.content.Context r3) {
            r2 = this;
            r2.<init>(r3)
            r2.mContext = r3
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r2.mActionViewConstructorArguments = r0
            r2.mActionProviderConstructorArguments = r0
            return
    }

    private java.lang.Object findRealOwner(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof android.app.Activity
            if (r0 == 0) goto L5
            return r2
        L5:
            boolean r0 = r2 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L13
            android.content.ContextWrapper r2 = (android.content.ContextWrapper) r2
            android.content.Context r2 = r2.getBaseContext()
            java.lang.Object r2 = r1.findRealOwner(r2)
        L13:
            return r2
    }

    private void parseMenu(org.xmlpull.v1.XmlPullParser r13, android.util.AttributeSet r14, android.view.Menu r15) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r12 = this;
            androidx.appcompat.view.SupportMenuInflater$MenuState r0 = new androidx.appcompat.view.SupportMenuInflater$MenuState
            r0.<init>(r12, r15)
            int r15 = r13.getEventType()
        L9:
            r1 = 2
            java.lang.String r2 = "menu"
            r3 = 1
            if (r15 != r1) goto L33
            java.lang.String r15 = r13.getName()
            boolean r4 = r15.equals(r2)
            if (r4 == 0) goto L1e
            int r15 = r13.next()
            goto L39
        L1e:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "Expecting menu, got "
            r14.<init>(r0)
            java.lang.StringBuilder r14 = r14.append(r15)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L33:
            int r15 = r13.next()
            if (r15 != r3) goto L9
        L39:
            r4 = 0
            r5 = 0
            r6 = r4
            r7 = r6
            r8 = r5
        L3e:
            if (r6 != 0) goto Lc8
            if (r15 == r3) goto Lc0
            java.lang.String r9 = "item"
            java.lang.String r10 = "group"
            if (r15 == r1) goto L8f
            r11 = 3
            if (r15 == r11) goto L4d
            goto Lba
        L4d:
            java.lang.String r15 = r13.getName()
            if (r7 == 0) goto L5d
            boolean r11 = r15.equals(r8)
            if (r11 == 0) goto L5d
            r7 = r4
            r8 = r5
            goto Lba
        L5d:
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L67
            r0.resetGroup()
            goto Lba
        L67:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto L87
            boolean r15 = r0.hasAddedItem()
            if (r15 != 0) goto Lba
            androidx.core.view.ActionProvider r15 = r0.itemActionProvider
            if (r15 == 0) goto L83
            androidx.core.view.ActionProvider r15 = r0.itemActionProvider
            boolean r15 = r15.hasSubMenu()
            if (r15 == 0) goto L83
            r0.addSubMenuItem()
            goto Lba
        L83:
            r0.addItem()
            goto Lba
        L87:
            boolean r15 = r15.equals(r2)
            if (r15 == 0) goto Lba
            r6 = r3
            goto Lba
        L8f:
            if (r7 == 0) goto L92
            goto Lba
        L92:
            java.lang.String r15 = r13.getName()
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto La0
            r0.readGroup(r14)
            goto Lba
        La0:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto Laa
            r0.readItem(r14)
            goto Lba
        Laa:
            boolean r9 = r15.equals(r2)
            if (r9 == 0) goto Lb8
            android.view.SubMenu r15 = r0.addSubMenuItem()
            r12.parseMenu(r13, r14, r15)
            goto Lba
        Lb8:
            r8 = r15
            r7 = r3
        Lba:
            int r15 = r13.next()
            goto L3e
        Lc0:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r14 = "Unexpected end of document"
            r13.<init>(r14)
            throw r13
        Lc8:
            return
    }

    java.lang.Object getRealOwner() {
            r1 = this;
            java.lang.Object r0 = r1.mRealOwner
            if (r0 != 0) goto Lc
            android.content.Context r0 = r1.mContext
            java.lang.Object r0 = r1.findRealOwner(r0)
            r1.mRealOwner = r0
        Lc:
            java.lang.Object r0 = r1.mRealOwner
            return r0
    }

    @Override // android.view.MenuInflater
    public void inflate(int r4, android.view.Menu r5) {
            r3 = this;
            java.lang.String r0 = "Error inflating menu XML"
            boolean r1 = r5 instanceof androidx.core.internal.view.SupportMenu
            if (r1 != 0) goto La
            super.inflate(r4, r5)
            return
        La:
            r1 = 0
            android.content.Context r2 = r3.mContext     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24 org.xmlpull.v1.XmlPullParserException -> L2b
            android.content.res.Resources r2 = r2.getResources()     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24 org.xmlpull.v1.XmlPullParserException -> L2b
            android.content.res.XmlResourceParser r1 = r2.getLayout(r4)     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24 org.xmlpull.v1.XmlPullParserException -> L2b
            android.util.AttributeSet r4 = android.util.Xml.asAttributeSet(r1)     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24 org.xmlpull.v1.XmlPullParserException -> L2b
            r3.parseMenu(r1, r4, r5)     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24 org.xmlpull.v1.XmlPullParserException -> L2b
            if (r1 == 0) goto L21
            r1.close()
        L21:
            return
        L22:
            r4 = move-exception
            goto L32
        L24:
            r4 = move-exception
            android.view.InflateException r5 = new android.view.InflateException     // Catch: java.lang.Throwable -> L22
            r5.<init>(r0, r4)     // Catch: java.lang.Throwable -> L22
            throw r5     // Catch: java.lang.Throwable -> L22
        L2b:
            r4 = move-exception
            android.view.InflateException r5 = new android.view.InflateException     // Catch: java.lang.Throwable -> L22
            r5.<init>(r0, r4)     // Catch: java.lang.Throwable -> L22
            throw r5     // Catch: java.lang.Throwable -> L22
        L32:
            if (r1 == 0) goto L37
            r1.close()
        L37:
            throw r4
    }
}
