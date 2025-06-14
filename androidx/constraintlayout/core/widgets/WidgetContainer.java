package androidx.constraintlayout.core.widgets;

/* loaded from: classes.dex */
public class WidgetContainer extends androidx.constraintlayout.core.widgets.ConstraintWidget {
    public java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> mChildren;

    public WidgetContainer() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mChildren = r0
            return
    }

    public WidgetContainer(int r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.mChildren = r1
            return
    }

    public WidgetContainer(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.mChildren = r1
            return
    }

    public void add(androidx.constraintlayout.core.widgets.ConstraintWidget r2) {
            r1 = this;
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r0 = r1.mChildren
            r0.add(r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r2.getParent()
            if (r0 == 0) goto L14
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r2.getParent()
            androidx.constraintlayout.core.widgets.WidgetContainer r0 = (androidx.constraintlayout.core.widgets.WidgetContainer) r0
            r0.remove(r2)
        L14:
            r2.setParent(r1)
            return
    }

    public void add(androidx.constraintlayout.core.widgets.ConstraintWidget... r4) {
            r3 = this;
            int r0 = r4.length
            r1 = 0
        L2:
            if (r1 >= r0) goto Lc
            r2 = r4[r1]
            r3.add(r2)
            int r1 = r1 + 1
            goto L2
        Lc:
            return
    }

    public java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> getChildren() {
            r1 = this;
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r0 = r1.mChildren
            return r0
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidgetContainer getRootConstraintContainer() {
            r4 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r4.getParent()
            boolean r1 = r4 instanceof androidx.constraintlayout.core.widgets.ConstraintWidgetContainer
            if (r1 == 0) goto Lc
            r1 = r4
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1 = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) r1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            if (r0 == 0) goto L1c
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r0.getParent()
            boolean r3 = r0 instanceof androidx.constraintlayout.core.widgets.ConstraintWidgetContainer
            if (r3 == 0) goto L1a
            r1 = r0
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1 = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) r1
        L1a:
            r0 = r2
            goto Ld
        L1c:
            return r1
    }

    public void layout() {
            r4 = this;
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r0 = r4.mChildren
            if (r0 != 0) goto L5
            return
        L5:
            int r0 = r0.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L20
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r2 = r4.mChildren
            java.lang.Object r2 = r2.get(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            boolean r3 = r2 instanceof androidx.constraintlayout.core.widgets.WidgetContainer
            if (r3 == 0) goto L1d
            androidx.constraintlayout.core.widgets.WidgetContainer r2 = (androidx.constraintlayout.core.widgets.WidgetContainer) r2
            r2.layout()
        L1d:
            int r1 = r1 + 1
            goto La
        L20:
            return
    }

    public void remove(androidx.constraintlayout.core.widgets.ConstraintWidget r2) {
            r1 = this;
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r0 = r1.mChildren
            r0.remove(r2)
            r2.reset()
            return
    }

    public void removeAllChildren() {
            r1 = this;
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r0 = r1.mChildren
            r0.clear()
            return
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void reset() {
            r1 = this;
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r0 = r1.mChildren
            r0.clear()
            super.reset()
            return
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void resetSolverVariables(androidx.constraintlayout.core.Cache r4) {
            r3 = this;
            super.resetSolverVariables(r4)
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r0 = r3.mChildren
            int r0 = r0.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L1a
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r2 = r3.mChildren
            java.lang.Object r2 = r2.get(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            r2.resetSolverVariables(r4)
            int r1 = r1 + 1
            goto La
        L1a:
            return
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void setOffset(int r4, int r5) {
            r3 = this;
            super.setOffset(r4, r5)
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r4 = r3.mChildren
            int r4 = r4.size()
            r5 = 0
        La:
            if (r5 >= r4) goto L22
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r0 = r3.mChildren
            java.lang.Object r0 = r0.get(r5)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r0
            int r1 = r3.getRootX()
            int r2 = r3.getRootY()
            r0.setOffset(r1, r2)
            int r5 = r5 + 1
            goto La
        L22:
            return
    }
}
