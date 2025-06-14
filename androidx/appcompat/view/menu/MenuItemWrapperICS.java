package androidx.appcompat.view.menu;

/* loaded from: classes.dex */
public class MenuItemWrapperICS extends androidx.appcompat.view.menu.BaseMenuWrapper implements android.view.MenuItem {
    static final java.lang.String LOG_TAG = "MenuItemWrapper";
    private java.lang.reflect.Method mSetExclusiveCheckableMethod;
    private final androidx.core.internal.view.SupportMenuItem mWrappedObject;

    private class ActionProviderWrapper extends androidx.core.view.ActionProvider {
        final android.view.ActionProvider mInner;
        final /* synthetic */ androidx.appcompat.view.menu.MenuItemWrapperICS this$0;

        ActionProviderWrapper(androidx.appcompat.view.menu.MenuItemWrapperICS r1, android.content.Context r2, android.view.ActionProvider r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                r0.mInner = r3
                return
        }

        @Override // androidx.core.view.ActionProvider
        public boolean hasSubMenu() {
                r1 = this;
                android.view.ActionProvider r0 = r1.mInner
                boolean r0 = r0.hasSubMenu()
                return r0
        }

        @Override // androidx.core.view.ActionProvider
        public android.view.View onCreateActionView() {
                r1 = this;
                android.view.ActionProvider r0 = r1.mInner
                android.view.View r0 = r0.onCreateActionView()
                return r0
        }

        @Override // androidx.core.view.ActionProvider
        public boolean onPerformDefaultAction() {
                r1 = this;
                android.view.ActionProvider r0 = r1.mInner
                boolean r0 = r0.onPerformDefaultAction()
                return r0
        }

        @Override // androidx.core.view.ActionProvider
        public void onPrepareSubMenu(android.view.SubMenu r3) {
                r2 = this;
                android.view.ActionProvider r0 = r2.mInner
                androidx.appcompat.view.menu.MenuItemWrapperICS r1 = r2.this$0
                android.view.SubMenu r3 = r1.getSubMenuWrapper(r3)
                r0.onPrepareSubMenu(r3)
                return
        }
    }

    private class ActionProviderWrapperJB extends androidx.appcompat.view.menu.MenuItemWrapperICS.ActionProviderWrapper implements android.view.ActionProvider.VisibilityListener {
        private androidx.core.view.ActionProvider.VisibilityListener mListener;
        final /* synthetic */ androidx.appcompat.view.menu.MenuItemWrapperICS this$0;

        ActionProviderWrapperJB(androidx.appcompat.view.menu.MenuItemWrapperICS r1, android.content.Context r2, android.view.ActionProvider r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1, r2, r3)
                return
        }

        @Override // androidx.core.view.ActionProvider
        public boolean isVisible() {
                r1 = this;
                android.view.ActionProvider r0 = r1.mInner
                boolean r0 = r0.isVisible()
                return r0
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean r2) {
                r1 = this;
                androidx.core.view.ActionProvider$VisibilityListener r0 = r1.mListener
                if (r0 == 0) goto L7
                r0.onActionProviderVisibilityChanged(r2)
            L7:
                return
        }

        @Override // androidx.core.view.ActionProvider
        public android.view.View onCreateActionView(android.view.MenuItem r2) {
                r1 = this;
                android.view.ActionProvider r0 = r1.mInner
                android.view.View r2 = r0.onCreateActionView(r2)
                return r2
        }

        @Override // androidx.core.view.ActionProvider
        public boolean overridesItemVisibility() {
                r1 = this;
                android.view.ActionProvider r0 = r1.mInner
                boolean r0 = r0.overridesItemVisibility()
                return r0
        }

        @Override // androidx.core.view.ActionProvider
        public void refreshVisibility() {
                r1 = this;
                android.view.ActionProvider r0 = r1.mInner
                r0.refreshVisibility()
                return
        }

        @Override // androidx.core.view.ActionProvider
        public void setVisibilityListener(androidx.core.view.ActionProvider.VisibilityListener r2) {
                r1 = this;
                r1.mListener = r2
                android.view.ActionProvider r0 = r1.mInner
                if (r2 == 0) goto L8
                r2 = r1
                goto L9
            L8:
                r2 = 0
            L9:
                r0.setVisibilityListener(r2)
                return
        }
    }

    static class CollapsibleActionViewWrapper extends android.widget.FrameLayout implements androidx.appcompat.view.CollapsibleActionView {
        final android.view.CollapsibleActionView mWrappedView;

        CollapsibleActionViewWrapper(android.view.View r2) {
                r1 = this;
                android.content.Context r0 = r2.getContext()
                r1.<init>(r0)
                r0 = r2
                android.view.CollapsibleActionView r0 = (android.view.CollapsibleActionView) r0
                r1.mWrappedView = r0
                r1.addView(r2)
                return
        }

        android.view.View getWrappedView() {
                r1 = this;
                android.view.CollapsibleActionView r0 = r1.mWrappedView
                android.view.View r0 = (android.view.View) r0
                return r0
        }

        @Override // androidx.appcompat.view.CollapsibleActionView
        public void onActionViewCollapsed() {
                r1 = this;
                android.view.CollapsibleActionView r0 = r1.mWrappedView
                r0.onActionViewCollapsed()
                return
        }

        @Override // androidx.appcompat.view.CollapsibleActionView
        public void onActionViewExpanded() {
                r1 = this;
                android.view.CollapsibleActionView r0 = r1.mWrappedView
                r0.onActionViewExpanded()
                return
        }
    }

    private class OnActionExpandListenerWrapper implements android.view.MenuItem.OnActionExpandListener {
        private final android.view.MenuItem.OnActionExpandListener mObject;
        final /* synthetic */ androidx.appcompat.view.menu.MenuItemWrapperICS this$0;

        OnActionExpandListenerWrapper(androidx.appcompat.view.menu.MenuItemWrapperICS r1, android.view.MenuItem.OnActionExpandListener r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.mObject = r2
                return
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(android.view.MenuItem r3) {
                r2 = this;
                android.view.MenuItem$OnActionExpandListener r0 = r2.mObject
                androidx.appcompat.view.menu.MenuItemWrapperICS r1 = r2.this$0
                android.view.MenuItem r3 = r1.getMenuItemWrapper(r3)
                boolean r3 = r0.onMenuItemActionCollapse(r3)
                return r3
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(android.view.MenuItem r3) {
                r2 = this;
                android.view.MenuItem$OnActionExpandListener r0 = r2.mObject
                androidx.appcompat.view.menu.MenuItemWrapperICS r1 = r2.this$0
                android.view.MenuItem r3 = r1.getMenuItemWrapper(r3)
                boolean r3 = r0.onMenuItemActionExpand(r3)
                return r3
        }
    }

    private class OnMenuItemClickListenerWrapper implements android.view.MenuItem.OnMenuItemClickListener {
        private final android.view.MenuItem.OnMenuItemClickListener mObject;
        final /* synthetic */ androidx.appcompat.view.menu.MenuItemWrapperICS this$0;

        OnMenuItemClickListenerWrapper(androidx.appcompat.view.menu.MenuItemWrapperICS r1, android.view.MenuItem.OnMenuItemClickListener r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.mObject = r2
                return
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(android.view.MenuItem r3) {
                r2 = this;
                android.view.MenuItem$OnMenuItemClickListener r0 = r2.mObject
                androidx.appcompat.view.menu.MenuItemWrapperICS r1 = r2.this$0
                android.view.MenuItem r3 = r1.getMenuItemWrapper(r3)
                boolean r3 = r0.onMenuItemClick(r3)
                return r3
        }
    }

    public MenuItemWrapperICS(android.content.Context r1, androidx.core.internal.view.SupportMenuItem r2) {
            r0 = this;
            r0.<init>(r1)
            if (r2 == 0) goto L8
            r0.mWrappedObject = r2
            return
        L8:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Wrapped Object can not be null."
            r1.<init>(r2)
            throw r1
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
            r1 = this;
            androidx.core.internal.view.SupportMenuItem r0 = r1.mWrappedObject
            boolean r0 = r0.collapseActionView()
            return r0
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
            r1 = this;
            androidx.core.internal.view.SupportMenuItem r0 = r1.mWrappedObject
            boolean r0 = r0.expandActionView()
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.ActionProvider getActionProvider() {
            r2 = this;
            androidx.core.internal.view.SupportMenuItem r0 = r2.mWrappedObject
            androidx.core.view.ActionProvider r0 = r0.getSupportActionProvider()
            boolean r1 = r0 instanceof androidx.appcompat.view.menu.MenuItemWrapperICS.ActionProviderWrapper
            if (r1 == 0) goto Lf
            androidx.appcompat.view.menu.MenuItemWrapperICS$ActionProviderWrapper r0 = (androidx.appcompat.view.menu.MenuItemWrapperICS.ActionProviderWrapper) r0
            android.view.ActionProvider r0 = r0.mInner
            return r0
        Lf:
            r0 = 0
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.View getActionView() {
            r2 = this;
            androidx.core.internal.view.SupportMenuItem r0 = r2.mWrappedObject
            android.view.View r0 = r0.getActionView()
            boolean r1 = r0 instanceof androidx.appcompat.view.menu.MenuItemWrapperICS.CollapsibleActionViewWrapper
            if (r1 == 0) goto L10
            androidx.appcompat.view.menu.MenuItemWrapperICS$CollapsibleActionViewWrapper r0 = (androidx.appcompat.view.menu.MenuItemWrapperICS.CollapsibleActionViewWrapper) r0
            android.view.View r0 = r0.getWrappedView()
        L10:
            return r0
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
            r1 = this;
            androidx.core.internal.view.SupportMenuItem r0 = r1.mWrappedObject
            int r0 = r0.getAlphabeticModifiers()
            return r0
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
            r1 = this;
            androidx.core.internal.view.SupportMenuItem r0 = r1.mWrappedObject
            char r0 = r0.getAlphabeticShortcut()
            return r0
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getContentDescription() {
            r1 = this;
            androidx.core.internal.view.SupportMenuItem r0 = r1.mWrappedObject
            java.lang.CharSequence r0 = r0.getContentDescription()
            return r0
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
            r1 = this;
            androidx.core.internal.view.SupportMenuItem r0 = r1.mWrappedObject
            int r0 = r0.getGroupId()
            return r0
    }

    @Override // android.view.MenuItem
    public android.graphics.drawable.Drawable getIcon() {
            r1 = this;
            androidx.core.internal.view.SupportMenuItem r0 = r1.mWrappedObject
            android.graphics.drawable.Drawable r0 = r0.getIcon()
            return r0
    }

    @Override // android.view.MenuItem
    public android.content.res.ColorStateList getIconTintList() {
            r1 = this;
            androidx.core.internal.view.SupportMenuItem r0 = r1.mWrappedObject
            android.content.res.ColorStateList r0 = r0.getIconTintList()
            return r0
    }

    @Override // android.view.MenuItem
    public android.graphics.PorterDuff.Mode getIconTintMode() {
            r1 = this;
            androidx.core.internal.view.SupportMenuItem r0 = r1.mWrappedObject
            android.graphics.PorterDuff$Mode r0 = r0.getIconTintMode()
            return r0
    }

    @Override // android.view.MenuItem
    public android.content.Intent getIntent() {
            r1 = this;
            androidx.core.internal.view.SupportMenuItem r0 = r1.mWrappedObject
            android.content.Intent r0 = r0.getIntent()
            return r0
    }

    @Override // android.view.MenuItem
    public int getItemId() {
            r1 = this;
            androidx.core.internal.view.SupportMenuItem r0 = r1.mWrappedObject
            int r0 = r0.getItemId()
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.ContextMenu.ContextMenuInfo getMenuInfo() {
            r1 = this;
            androidx.core.internal.view.SupportMenuItem r0 = r1.mWrappedObject
            android.view.ContextMenu$ContextMenuInfo r0 = r0.getMenuInfo()
            return r0
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
            r1 = this;
            androidx.core.internal.view.SupportMenuItem r0 = r1.mWrappedObject
            int r0 = r0.getNumericModifiers()
            return r0
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
            r1 = this;
            androidx.core.internal.view.SupportMenuItem r0 = r1.mWrappedObject
            char r0 = r0.getNumericShortcut()
            return r0
    }

    @Override // android.view.MenuItem
    public int getOrder() {
            r1 = this;
            androidx.core.internal.view.SupportMenuItem r0 = r1.mWrappedObject
            int r0 = r0.getOrder()
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.SubMenu getSubMenu() {
            r1 = this;
            androidx.core.internal.view.SupportMenuItem r0 = r1.mWrappedObject
            android.view.SubMenu r0 = r0.getSubMenu()
            android.view.SubMenu r0 = r1.getSubMenuWrapper(r0)
            return r0
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getTitle() {
            r1 = this;
            androidx.core.internal.view.SupportMenuItem r0 = r1.mWrappedObject
            java.lang.CharSequence r0 = r0.getTitle()
            return r0
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getTitleCondensed() {
            r1 = this;
            androidx.core.internal.view.SupportMenuItem r0 = r1.mWrappedObject
            java.lang.CharSequence r0 = r0.getTitleCondensed()
            return r0
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getTooltipText() {
            r1 = this;
            androidx.core.internal.view.SupportMenuItem r0 = r1.mWrappedObject
            java.lang.CharSequence r0 = r0.getTooltipText()
            return r0
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
            r1 = this;
            androidx.core.internal.view.SupportMenuItem r0 = r1.mWrappedObject
            boolean r0 = r0.hasSubMenu()
            return r0
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
            r1 = this;
            androidx.core.internal.view.SupportMenuItem r0 = r1.mWrappedObject
            boolean r0 = r0.isActionViewExpanded()
            return r0
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
            r1 = this;
            androidx.core.internal.view.SupportMenuItem r0 = r1.mWrappedObject
            boolean r0 = r0.isCheckable()
            return r0
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
            r1 = this;
            androidx.core.internal.view.SupportMenuItem r0 = r1.mWrappedObject
            boolean r0 = r0.isChecked()
            return r0
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
            r1 = this;
            androidx.core.internal.view.SupportMenuItem r0 = r1.mWrappedObject
            boolean r0 = r0.isEnabled()
            return r0
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
            r1 = this;
            androidx.core.internal.view.SupportMenuItem r0 = r1.mWrappedObject
            boolean r0 = r0.isVisible()
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setActionProvider(android.view.ActionProvider r3) {
            r2 = this;
            androidx.appcompat.view.menu.MenuItemWrapperICS$ActionProviderWrapperJB r0 = new androidx.appcompat.view.menu.MenuItemWrapperICS$ActionProviderWrapperJB
            android.content.Context r1 = r2.mContext
            r0.<init>(r2, r1, r3)
            androidx.core.internal.view.SupportMenuItem r1 = r2.mWrappedObject
            if (r3 == 0) goto Lc
            goto Ld
        Lc:
            r0 = 0
        Ld:
            r1.setSupportActionProvider(r0)
            return r2
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setActionView(int r3) {
            r2 = this;
            androidx.core.internal.view.SupportMenuItem r0 = r2.mWrappedObject
            r0.setActionView(r3)
            androidx.core.internal.view.SupportMenuItem r3 = r2.mWrappedObject
            android.view.View r3 = r3.getActionView()
            boolean r0 = r3 instanceof android.view.CollapsibleActionView
            if (r0 == 0) goto L19
            androidx.core.internal.view.SupportMenuItem r0 = r2.mWrappedObject
            androidx.appcompat.view.menu.MenuItemWrapperICS$CollapsibleActionViewWrapper r1 = new androidx.appcompat.view.menu.MenuItemWrapperICS$CollapsibleActionViewWrapper
            r1.<init>(r3)
            r0.setActionView(r1)
        L19:
            return r2
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setActionView(android.view.View r2) {
            r1 = this;
            boolean r0 = r2 instanceof android.view.CollapsibleActionView
            if (r0 == 0) goto La
            androidx.appcompat.view.menu.MenuItemWrapperICS$CollapsibleActionViewWrapper r0 = new androidx.appcompat.view.menu.MenuItemWrapperICS$CollapsibleActionViewWrapper
            r0.<init>(r2)
            r2 = r0
        La:
            androidx.core.internal.view.SupportMenuItem r0 = r1.mWrappedObject
            r0.setActionView(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setAlphabeticShortcut(char r2) {
            r1 = this;
            androidx.core.internal.view.SupportMenuItem r0 = r1.mWrappedObject
            r0.setAlphabeticShortcut(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setAlphabeticShortcut(char r2, int r3) {
            r1 = this;
            androidx.core.internal.view.SupportMenuItem r0 = r1.mWrappedObject
            r0.setAlphabeticShortcut(r2, r3)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setCheckable(boolean r2) {
            r1 = this;
            androidx.core.internal.view.SupportMenuItem r0 = r1.mWrappedObject
            r0.setCheckable(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setChecked(boolean r2) {
            r1 = this;
            androidx.core.internal.view.SupportMenuItem r0 = r1.mWrappedObject
            r0.setChecked(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setContentDescription(java.lang.CharSequence r2) {
            r1 = this;
            androidx.core.internal.view.SupportMenuItem r0 = r1.mWrappedObject
            r0.setContentDescription(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setEnabled(boolean r2) {
            r1 = this;
            androidx.core.internal.view.SupportMenuItem r0 = r1.mWrappedObject
            r0.setEnabled(r2)
            return r1
    }

    public void setExclusiveCheckable(boolean r7) {
            r6 = this;
            java.lang.reflect.Method r0 = r6.mSetExclusiveCheckableMethod     // Catch: java.lang.Exception -> L2a
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L1a
            androidx.core.internal.view.SupportMenuItem r0 = r6.mWrappedObject     // Catch: java.lang.Exception -> L2a
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Exception -> L2a
            java.lang.String r3 = "setExclusiveCheckable"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L2a
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch: java.lang.Exception -> L2a
            r4[r1] = r5     // Catch: java.lang.Exception -> L2a
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r3, r4)     // Catch: java.lang.Exception -> L2a
            r6.mSetExclusiveCheckableMethod = r0     // Catch: java.lang.Exception -> L2a
        L1a:
            java.lang.reflect.Method r0 = r6.mSetExclusiveCheckableMethod     // Catch: java.lang.Exception -> L2a
            androidx.core.internal.view.SupportMenuItem r3 = r6.mWrappedObject     // Catch: java.lang.Exception -> L2a
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L2a
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Exception -> L2a
            r2[r1] = r7     // Catch: java.lang.Exception -> L2a
            r0.invoke(r3, r2)     // Catch: java.lang.Exception -> L2a
            goto L32
        L2a:
            r7 = move-exception
            java.lang.String r0 = "MenuItemWrapper"
            java.lang.String r1 = "Error while calling setExclusiveCheckable"
            android.util.Log.w(r0, r1, r7)
        L32:
            return
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIcon(int r2) {
            r1 = this;
            androidx.core.internal.view.SupportMenuItem r0 = r1.mWrappedObject
            r0.setIcon(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            androidx.core.internal.view.SupportMenuItem r0 = r1.mWrappedObject
            r0.setIcon(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIconTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            androidx.core.internal.view.SupportMenuItem r0 = r1.mWrappedObject
            r0.setIconTintList(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            androidx.core.internal.view.SupportMenuItem r0 = r1.mWrappedObject
            r0.setIconTintMode(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIntent(android.content.Intent r2) {
            r1 = this;
            androidx.core.internal.view.SupportMenuItem r0 = r1.mWrappedObject
            r0.setIntent(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setNumericShortcut(char r2) {
            r1 = this;
            androidx.core.internal.view.SupportMenuItem r0 = r1.mWrappedObject
            r0.setNumericShortcut(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setNumericShortcut(char r2, int r3) {
            r1 = this;
            androidx.core.internal.view.SupportMenuItem r0 = r1.mWrappedObject
            r0.setNumericShortcut(r2, r3)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener r3) {
            r2 = this;
            androidx.core.internal.view.SupportMenuItem r0 = r2.mWrappedObject
            if (r3 == 0) goto La
            androidx.appcompat.view.menu.MenuItemWrapperICS$OnActionExpandListenerWrapper r1 = new androidx.appcompat.view.menu.MenuItemWrapperICS$OnActionExpandListenerWrapper
            r1.<init>(r2, r3)
            goto Lb
        La:
            r1 = 0
        Lb:
            r0.setOnActionExpandListener(r1)
            return r2
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener r3) {
            r2 = this;
            androidx.core.internal.view.SupportMenuItem r0 = r2.mWrappedObject
            if (r3 == 0) goto La
            androidx.appcompat.view.menu.MenuItemWrapperICS$OnMenuItemClickListenerWrapper r1 = new androidx.appcompat.view.menu.MenuItemWrapperICS$OnMenuItemClickListenerWrapper
            r1.<init>(r2, r3)
            goto Lb
        La:
            r1 = 0
        Lb:
            r0.setOnMenuItemClickListener(r1)
            return r2
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setShortcut(char r2, char r3) {
            r1 = this;
            androidx.core.internal.view.SupportMenuItem r0 = r1.mWrappedObject
            r0.setShortcut(r2, r3)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setShortcut(char r2, char r3, int r4, int r5) {
            r1 = this;
            androidx.core.internal.view.SupportMenuItem r0 = r1.mWrappedObject
            r0.setShortcut(r2, r3, r4, r5)
            return r1
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int r2) {
            r1 = this;
            androidx.core.internal.view.SupportMenuItem r0 = r1.mWrappedObject
            r0.setShowAsAction(r2)
            return
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setShowAsActionFlags(int r2) {
            r1 = this;
            androidx.core.internal.view.SupportMenuItem r0 = r1.mWrappedObject
            r0.setShowAsActionFlags(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitle(int r2) {
            r1 = this;
            androidx.core.internal.view.SupportMenuItem r0 = r1.mWrappedObject
            r0.setTitle(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitle(java.lang.CharSequence r2) {
            r1 = this;
            androidx.core.internal.view.SupportMenuItem r0 = r1.mWrappedObject
            r0.setTitle(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitleCondensed(java.lang.CharSequence r2) {
            r1 = this;
            androidx.core.internal.view.SupportMenuItem r0 = r1.mWrappedObject
            r0.setTitleCondensed(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTooltipText(java.lang.CharSequence r2) {
            r1 = this;
            androidx.core.internal.view.SupportMenuItem r0 = r1.mWrappedObject
            r0.setTooltipText(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setVisible(boolean r2) {
            r1 = this;
            androidx.core.internal.view.SupportMenuItem r0 = r1.mWrappedObject
            android.view.MenuItem r2 = r0.setVisible(r2)
            return r2
    }
}
