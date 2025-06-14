package androidx.constraintlayout.core.widgets;

/* loaded from: classes.dex */
public class Placeholder extends androidx.constraintlayout.core.widgets.VirtualLayout {
    public Placeholder() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void addToSolver(androidx.constraintlayout.core.LinearSystem r2, boolean r3) {
            r1 = this;
            super.addToSolver(r2, r3)
            int r2 = r1.mWidgetsCount
            if (r2 <= 0) goto L2b
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r2 = r1.mWidgets
            r3 = 0
            r2 = r2[r3]
            r2.resetAllConstraints()
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            r2.connect(r3, r1, r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            r2.connect(r3, r1, r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            r2.connect(r3, r1, r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            r2.connect(r3, r1, r0)
        L2b:
            return
    }

    @Override // androidx.constraintlayout.core.widgets.VirtualLayout
    public void measure(int r6, int r7, int r8, int r9) {
            r5 = this;
            int r0 = r5.getPaddingLeft()
            int r1 = r5.getPaddingRight()
            int r2 = r5.getPaddingTop()
            int r3 = r5.getPaddingBottom()
            int r0 = r0 + r1
            r1 = 0
            int r0 = r0 + r1
            int r2 = r2 + r3
            int r2 = r2 + r1
            int r3 = r5.mWidgetsCount
            if (r3 <= 0) goto L2b
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r3 = r5.mWidgets
            r3 = r3[r1]
            int r3 = r3.getWidth()
            int r0 = r0 + r3
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r3 = r5.mWidgets
            r3 = r3[r1]
            int r3 = r3.getHeight()
            int r2 = r2 + r3
        L2b:
            int r3 = r5.getMinWidth()
            int r0 = java.lang.Math.max(r3, r0)
            int r3 = r5.getMinHeight()
            int r2 = java.lang.Math.max(r3, r2)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r6 != r4) goto L42
            goto L4e
        L42:
            if (r6 != r3) goto L49
            int r7 = java.lang.Math.min(r0, r7)
            goto L4e
        L49:
            if (r6 != 0) goto L4d
            r7 = r0
            goto L4e
        L4d:
            r7 = r1
        L4e:
            if (r8 != r4) goto L51
            goto L5d
        L51:
            if (r8 != r3) goto L58
            int r9 = java.lang.Math.min(r2, r9)
            goto L5d
        L58:
            if (r8 != 0) goto L5c
            r9 = r2
            goto L5d
        L5c:
            r9 = r1
        L5d:
            r5.setMeasure(r7, r9)
            r5.setWidth(r7)
            r5.setHeight(r9)
            int r6 = r5.mWidgetsCount
            if (r6 <= 0) goto L6b
            r1 = 1
        L6b:
            r5.needsCallbackFromSolver(r1)
            return
    }
}
