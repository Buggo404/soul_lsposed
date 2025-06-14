package androidx.constraintlayout.core;

/* loaded from: classes.dex */
public class GoalRow extends androidx.constraintlayout.core.ArrayRow {
    public GoalRow(androidx.constraintlayout.core.Cache r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public void addError(androidx.constraintlayout.core.SolverVariable r2) {
            r1 = this;
            super.addError(r2)
            int r0 = r2.usageInRowCount
            int r0 = r0 + (-1)
            r2.usageInRowCount = r0
            return
    }
}
