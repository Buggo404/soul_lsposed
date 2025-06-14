package androidx.constraintlayout.core.widgets;

/* loaded from: classes.dex */
public class HelperWidget extends androidx.constraintlayout.core.widgets.ConstraintWidget implements androidx.constraintlayout.core.widgets.Helper {
    public androidx.constraintlayout.core.widgets.ConstraintWidget[] mWidgets;
    public int mWidgetsCount;

    public HelperWidget() {
            r1 = this;
            r1.<init>()
            r0 = 4
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r0 = new androidx.constraintlayout.core.widgets.ConstraintWidget[r0]
            r1.mWidgets = r0
            r0 = 0
            r1.mWidgetsCount = r0
            return
    }

    @Override // androidx.constraintlayout.core.widgets.Helper
    public void add(androidx.constraintlayout.core.widgets.ConstraintWidget r4) {
            r3 = this;
            if (r4 == r3) goto L23
            if (r4 != 0) goto L5
            goto L23
        L5:
            int r0 = r3.mWidgetsCount
            int r0 = r0 + 1
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r1 = r3.mWidgets
            int r2 = r1.length
            if (r0 <= r2) goto L19
            int r0 = r1.length
            int r0 = r0 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r0 = (androidx.constraintlayout.core.widgets.ConstraintWidget[]) r0
            r3.mWidgets = r0
        L19:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r0 = r3.mWidgets
            int r1 = r3.mWidgetsCount
            r0[r1] = r4
            int r1 = r1 + 1
            r3.mWidgetsCount = r1
        L23:
            return
    }

    public void addDependents(java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetGroup> r4, int r5, androidx.constraintlayout.core.widgets.analyzer.WidgetGroup r6) {
            r3 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r3.mWidgetsCount
            if (r1 >= r2) goto L10
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r2 = r3.mWidgets
            r2 = r2[r1]
            r6.add(r2)
            int r1 = r1 + 1
            goto L2
        L10:
            int r1 = r3.mWidgetsCount
            if (r0 >= r1) goto L1e
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r1 = r3.mWidgets
            r1 = r1[r0]
            androidx.constraintlayout.core.widgets.analyzer.Grouping.findDependents(r1, r5, r4, r6)
            int r0 = r0 + 1
            goto L10
        L1e:
            return
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void copy(androidx.constraintlayout.core.widgets.ConstraintWidget r4, java.util.HashMap<androidx.constraintlayout.core.widgets.ConstraintWidget, androidx.constraintlayout.core.widgets.ConstraintWidget> r5) {
            r3 = this;
            super.copy(r4, r5)
            androidx.constraintlayout.core.widgets.HelperWidget r4 = (androidx.constraintlayout.core.widgets.HelperWidget) r4
            r0 = 0
            r3.mWidgetsCount = r0
            int r1 = r4.mWidgetsCount
        La:
            if (r0 >= r1) goto L1c
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r2 = r4.mWidgets
            r2 = r2[r0]
            java.lang.Object r2 = r5.get(r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            r3.add(r2)
            int r0 = r0 + 1
            goto La
        L1c:
            return
    }

    public int findGroupInDependents(int r5) {
            r4 = this;
            r0 = 0
        L1:
            int r1 = r4.mWidgetsCount
            r2 = -1
            if (r0 >= r1) goto L20
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r1 = r4.mWidgets
            r1 = r1[r0]
            if (r5 != 0) goto L13
            int r3 = r1.horizontalGroup
            if (r3 == r2) goto L13
            int r5 = r1.horizontalGroup
            return r5
        L13:
            r3 = 1
            if (r5 != r3) goto L1d
            int r3 = r1.verticalGroup
            if (r3 == r2) goto L1d
            int r5 = r1.verticalGroup
            return r5
        L1d:
            int r0 = r0 + 1
            goto L1
        L20:
            return r2
    }

    @Override // androidx.constraintlayout.core.widgets.Helper
    public void removeAllIds() {
            r2 = this;
            r0 = 0
            r2.mWidgetsCount = r0
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r0 = r2.mWidgets
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            return
    }

    @Override // androidx.constraintlayout.core.widgets.Helper
    public void updateConstraints(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1) {
            r0 = this;
            return
    }
}
