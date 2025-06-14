package com.google.android.material.expandable;

/* loaded from: classes.dex */
public final class ExpandableWidgetHelper {
    private boolean expanded;
    private int expandedComponentIdHint;
    private final android.view.View widget;

    public ExpandableWidgetHelper(com.google.android.material.expandable.ExpandableWidget r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.expanded = r0
            r1.expandedComponentIdHint = r0
            android.view.View r2 = (android.view.View) r2
            r1.widget = r2
            return
    }

    private void dispatchExpandedStateChanged() {
            r2 = this;
            android.view.View r0 = r2.widget
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            if (r1 == 0) goto L11
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            android.view.View r1 = r2.widget
            r0.dispatchDependentViewsChanged(r1)
        L11:
            return
    }

    public int getExpandedComponentIdHint() {
            r1 = this;
            int r0 = r1.expandedComponentIdHint
            return r0
    }

    public boolean isExpanded() {
            r1 = this;
            boolean r0 = r1.expanded
            return r0
    }

    public void onRestoreInstanceState(android.os.Bundle r3) {
            r2 = this;
            java.lang.String r0 = "expanded"
            r1 = 0
            boolean r0 = r3.getBoolean(r0, r1)
            r2.expanded = r0
            java.lang.String r0 = "expandedComponentIdHint"
            int r3 = r3.getInt(r0, r1)
            r2.expandedComponentIdHint = r3
            boolean r3 = r2.expanded
            if (r3 == 0) goto L18
            r2.dispatchExpandedStateChanged()
        L18:
            return
    }

    public android.os.Bundle onSaveInstanceState() {
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "expanded"
            boolean r2 = r3.expanded
            r0.putBoolean(r1, r2)
            java.lang.String r1 = "expandedComponentIdHint"
            int r2 = r3.expandedComponentIdHint
            r0.putInt(r1, r2)
            return r0
    }

    public boolean setExpanded(boolean r2) {
            r1 = this;
            boolean r0 = r1.expanded
            if (r0 == r2) goto Lb
            r1.expanded = r2
            r1.dispatchExpandedStateChanged()
            r2 = 1
            return r2
        Lb:
            r2 = 0
            return r2
    }

    public void setExpandedComponentIdHint(int r1) {
            r0 = this;
            r0.expandedComponentIdHint = r1
            return
    }
}
