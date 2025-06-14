package androidx.constraintlayout.core;

/* loaded from: classes.dex */
public class PriorityGoalRow extends androidx.constraintlayout.core.ArrayRow {
    private static final boolean DEBUG = false;
    static final int NOT_FOUND = -1;
    private static final float epsilon = 1.0E-4f;
    private int TABLE_SIZE;
    androidx.constraintlayout.core.PriorityGoalRow.GoalVariableAccessor accessor;
    private androidx.constraintlayout.core.SolverVariable[] arrayGoals;
    androidx.constraintlayout.core.Cache mCache;
    private int numGoals;
    private androidx.constraintlayout.core.SolverVariable[] sortArray;


    class GoalVariableAccessor {
        androidx.constraintlayout.core.PriorityGoalRow row;
        final /* synthetic */ androidx.constraintlayout.core.PriorityGoalRow this$0;
        androidx.constraintlayout.core.SolverVariable variable;

        public GoalVariableAccessor(androidx.constraintlayout.core.PriorityGoalRow r1, androidx.constraintlayout.core.PriorityGoalRow r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.row = r2
                return
        }

        public void add(androidx.constraintlayout.core.SolverVariable r5) {
                r4 = this;
                r0 = 0
            L1:
                r1 = 9
                if (r0 >= r1) goto L2d
                androidx.constraintlayout.core.SolverVariable r1 = r4.variable
                float[] r1 = r1.goalStrengthVector
                r2 = r1[r0]
                float[] r3 = r5.goalStrengthVector
                r3 = r3[r0]
                float r2 = r2 + r3
                r1[r0] = r2
                androidx.constraintlayout.core.SolverVariable r1 = r4.variable
                float[] r1 = r1.goalStrengthVector
                r1 = r1[r0]
                float r1 = java.lang.Math.abs(r1)
                r2 = 953267991(0x38d1b717, float:1.0E-4)
                int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r1 >= 0) goto L2a
                androidx.constraintlayout.core.SolverVariable r1 = r4.variable
                float[] r1 = r1.goalStrengthVector
                r2 = 0
                r1[r0] = r2
            L2a:
                int r0 = r0 + 1
                goto L1
            L2d:
                return
        }

        public boolean addToGoal(androidx.constraintlayout.core.SolverVariable r10, float r11) {
                r9 = this;
                androidx.constraintlayout.core.SolverVariable r0 = r9.variable
                boolean r0 = r0.inGoal
                r1 = 953267991(0x38d1b717, float:1.0E-4)
                r2 = 9
                r3 = 0
                r4 = 1
                r5 = 0
                if (r0 == 0) goto L42
                r0 = r5
            Lf:
                if (r0 >= r2) goto L38
                androidx.constraintlayout.core.SolverVariable r6 = r9.variable
                float[] r6 = r6.goalStrengthVector
                r7 = r6[r0]
                float[] r8 = r10.goalStrengthVector
                r8 = r8[r0]
                float r8 = r8 * r11
                float r7 = r7 + r8
                r6[r0] = r7
                androidx.constraintlayout.core.SolverVariable r6 = r9.variable
                float[] r6 = r6.goalStrengthVector
                r6 = r6[r0]
                float r6 = java.lang.Math.abs(r6)
                int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                if (r6 >= 0) goto L34
                androidx.constraintlayout.core.SolverVariable r6 = r9.variable
                float[] r6 = r6.goalStrengthVector
                r6[r0] = r3
                goto L35
            L34:
                r4 = r5
            L35:
                int r0 = r0 + 1
                goto Lf
            L38:
                if (r4 == 0) goto L41
                androidx.constraintlayout.core.PriorityGoalRow r10 = r9.this$0
                androidx.constraintlayout.core.SolverVariable r11 = r9.variable
                androidx.constraintlayout.core.PriorityGoalRow.access$000(r10, r11)
            L41:
                return r5
            L42:
                if (r5 >= r2) goto L66
                float[] r0 = r10.goalStrengthVector
                r0 = r0[r5]
                int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r6 == 0) goto L5d
                float r0 = r0 * r11
                float r6 = java.lang.Math.abs(r0)
                int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                if (r6 >= 0) goto L56
                r0 = r3
            L56:
                androidx.constraintlayout.core.SolverVariable r6 = r9.variable
                float[] r6 = r6.goalStrengthVector
                r6[r5] = r0
                goto L63
            L5d:
                androidx.constraintlayout.core.SolverVariable r0 = r9.variable
                float[] r0 = r0.goalStrengthVector
                r0[r5] = r3
            L63:
                int r5 = r5 + 1
                goto L42
            L66:
                return r4
        }

        public void init(androidx.constraintlayout.core.SolverVariable r1) {
                r0 = this;
                r0.variable = r1
                return
        }

        public final boolean isNegative() {
                r5 = this;
                r0 = 8
            L2:
                r1 = 0
                if (r0 < 0) goto L1a
                androidx.constraintlayout.core.SolverVariable r2 = r5.variable
                float[] r2 = r2.goalStrengthVector
                r2 = r2[r0]
                r3 = 0
                int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r4 <= 0) goto L11
                return r1
            L11:
                int r1 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r1 >= 0) goto L17
                r0 = 1
                return r0
            L17:
                int r0 = r0 + (-1)
                goto L2
            L1a:
                return r1
        }

        public final boolean isNull() {
                r4 = this;
                r0 = 0
                r1 = r0
            L2:
                r2 = 9
                if (r1 >= r2) goto L15
                androidx.constraintlayout.core.SolverVariable r2 = r4.variable
                float[] r2 = r2.goalStrengthVector
                r2 = r2[r1]
                r3 = 0
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r2 == 0) goto L12
                return r0
            L12:
                int r1 = r1 + 1
                goto L2
            L15:
                r0 = 1
                return r0
        }

        public final boolean isSmallerThan(androidx.constraintlayout.core.SolverVariable r6) {
                r5 = this;
                r0 = 8
            L2:
                r1 = 0
                if (r0 < 0) goto L1c
                float[] r2 = r6.goalStrengthVector
                r2 = r2[r0]
                androidx.constraintlayout.core.SolverVariable r3 = r5.variable
                float[] r3 = r3.goalStrengthVector
                r3 = r3[r0]
                int r4 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
                if (r4 != 0) goto L16
                int r0 = r0 + (-1)
                goto L2
            L16:
                int r6 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
                if (r6 >= 0) goto L1c
                r6 = 1
                return r6
            L1c:
                return r1
        }

        public void reset() {
                r2 = this;
                androidx.constraintlayout.core.SolverVariable r0 = r2.variable
                float[] r0 = r0.goalStrengthVector
                r1 = 0
                java.util.Arrays.fill(r0, r1)
                return
        }

        public java.lang.String toString() {
                r3 = this;
                androidx.constraintlayout.core.SolverVariable r0 = r3.variable
                java.lang.String r1 = "[ "
                if (r0 == 0) goto L2b
                r0 = 0
            L7:
                r2 = 9
                if (r0 >= r2) goto L2b
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.StringBuilder r1 = r2.append(r1)
                androidx.constraintlayout.core.SolverVariable r2 = r3.variable
                float[] r2 = r2.goalStrengthVector
                r2 = r2[r0]
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r2 = " "
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                int r0 = r0 + 1
                goto L7
            L2b:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "] "
                java.lang.StringBuilder r0 = r0.append(r1)
                androidx.constraintlayout.core.SolverVariable r1 = r3.variable
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public PriorityGoalRow(androidx.constraintlayout.core.Cache r3) {
            r2 = this;
            r2.<init>(r3)
            r0 = 128(0x80, float:1.794E-43)
            r2.TABLE_SIZE = r0
            androidx.constraintlayout.core.SolverVariable[] r1 = new androidx.constraintlayout.core.SolverVariable[r0]
            r2.arrayGoals = r1
            androidx.constraintlayout.core.SolverVariable[] r0 = new androidx.constraintlayout.core.SolverVariable[r0]
            r2.sortArray = r0
            r0 = 0
            r2.numGoals = r0
            androidx.constraintlayout.core.PriorityGoalRow$GoalVariableAccessor r0 = new androidx.constraintlayout.core.PriorityGoalRow$GoalVariableAccessor
            r0.<init>(r2, r2)
            r2.accessor = r0
            r2.mCache = r3
            return
    }

    static /* synthetic */ void access$000(androidx.constraintlayout.core.PriorityGoalRow r0, androidx.constraintlayout.core.SolverVariable r1) {
            r0.removeGoal(r1)
            return
    }

    private final void addToGoal(androidx.constraintlayout.core.SolverVariable r6) {
            r5 = this;
            int r0 = r5.numGoals
            r1 = 1
            int r0 = r0 + r1
            androidx.constraintlayout.core.SolverVariable[] r2 = r5.arrayGoals
            int r3 = r2.length
            if (r0 <= r3) goto L1f
            int r0 = r2.length
            int r0 = r0 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r0)
            androidx.constraintlayout.core.SolverVariable[] r0 = (androidx.constraintlayout.core.SolverVariable[]) r0
            r5.arrayGoals = r0
            int r2 = r0.length
            int r2 = r2 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            androidx.constraintlayout.core.SolverVariable[] r0 = (androidx.constraintlayout.core.SolverVariable[]) r0
            r5.sortArray = r0
        L1f:
            androidx.constraintlayout.core.SolverVariable[] r0 = r5.arrayGoals
            int r2 = r5.numGoals
            r0[r2] = r6
            int r2 = r2 + r1
            r5.numGoals = r2
            if (r2 <= r1) goto L5d
            int r2 = r2 - r1
            r0 = r0[r2]
            int r0 = r0.f13id
            int r2 = r6.f13id
            if (r0 <= r2) goto L5d
            r0 = 0
            r2 = r0
        L35:
            int r3 = r5.numGoals
            if (r2 >= r3) goto L44
            androidx.constraintlayout.core.SolverVariable[] r3 = r5.sortArray
            androidx.constraintlayout.core.SolverVariable[] r4 = r5.arrayGoals
            r4 = r4[r2]
            r3[r2] = r4
            int r2 = r2 + 1
            goto L35
        L44:
            androidx.constraintlayout.core.SolverVariable[] r2 = r5.sortArray
            androidx.constraintlayout.core.PriorityGoalRow$1 r4 = new androidx.constraintlayout.core.PriorityGoalRow$1
            r4.<init>(r5)
            java.util.Arrays.sort(r2, r0, r3, r4)
        L4e:
            int r2 = r5.numGoals
            if (r0 >= r2) goto L5d
            androidx.constraintlayout.core.SolverVariable[] r2 = r5.arrayGoals
            androidx.constraintlayout.core.SolverVariable[] r3 = r5.sortArray
            r3 = r3[r0]
            r2[r0] = r3
            int r0 = r0 + 1
            goto L4e
        L5d:
            r6.inGoal = r1
            r6.addToRow(r5)
            return
    }

    private final void removeGoal(androidx.constraintlayout.core.SolverVariable r6) {
            r5 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r5.numGoals
            if (r1 >= r2) goto L26
            androidx.constraintlayout.core.SolverVariable[] r2 = r5.arrayGoals
            r2 = r2[r1]
            if (r2 != r6) goto L23
        Lc:
            int r2 = r5.numGoals
            int r3 = r2 + (-1)
            if (r1 >= r3) goto L1c
            androidx.constraintlayout.core.SolverVariable[] r2 = r5.arrayGoals
            int r3 = r1 + 1
            r4 = r2[r3]
            r2[r1] = r4
            r1 = r3
            goto Lc
        L1c:
            int r2 = r2 + (-1)
            r5.numGoals = r2
            r6.inGoal = r0
            return
        L23:
            int r1 = r1 + 1
            goto L2
        L26:
            return
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public void addError(androidx.constraintlayout.core.SolverVariable r4) {
            r3 = this;
            androidx.constraintlayout.core.PriorityGoalRow$GoalVariableAccessor r0 = r3.accessor
            r0.init(r4)
            androidx.constraintlayout.core.PriorityGoalRow$GoalVariableAccessor r0 = r3.accessor
            r0.reset()
            float[] r0 = r4.goalStrengthVector
            int r1 = r4.strength
            r2 = 1065353216(0x3f800000, float:1.0)
            r0[r1] = r2
            r3.addToGoal(r4)
            return
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public void clear() {
            r1 = this;
            r0 = 0
            r1.numGoals = r0
            r0 = 0
            r1.constantValue = r0
            return
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public androidx.constraintlayout.core.SolverVariable getPivotCandidate(androidx.constraintlayout.core.LinearSystem r5, boolean[] r6) {
            r4 = this;
            r5 = -1
            r0 = 0
            r1 = r5
        L3:
            int r2 = r4.numGoals
            if (r0 >= r2) goto L32
            androidx.constraintlayout.core.SolverVariable[] r2 = r4.arrayGoals
            r2 = r2[r0]
            int r3 = r2.f13id
            boolean r3 = r6[r3]
            if (r3 == 0) goto L12
            goto L2f
        L12:
            androidx.constraintlayout.core.PriorityGoalRow$GoalVariableAccessor r3 = r4.accessor
            r3.init(r2)
            if (r1 != r5) goto L22
            androidx.constraintlayout.core.PriorityGoalRow$GoalVariableAccessor r2 = r4.accessor
            boolean r2 = r2.isNegative()
            if (r2 == 0) goto L2f
            goto L2e
        L22:
            androidx.constraintlayout.core.PriorityGoalRow$GoalVariableAccessor r2 = r4.accessor
            androidx.constraintlayout.core.SolverVariable[] r3 = r4.arrayGoals
            r3 = r3[r1]
            boolean r2 = r2.isSmallerThan(r3)
            if (r2 == 0) goto L2f
        L2e:
            r1 = r0
        L2f:
            int r0 = r0 + 1
            goto L3
        L32:
            if (r1 != r5) goto L36
            r5 = 0
            return r5
        L36:
            androidx.constraintlayout.core.SolverVariable[] r5 = r4.arrayGoals
            r5 = r5[r1]
            return r5
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.numGoals
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // androidx.constraintlayout.core.ArrayRow
    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = " goal -> ("
            r0.<init>(r1)
            float r1 = r4.constantValue
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ") : "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
        L18:
            int r2 = r4.numGoals
            if (r1 >= r2) goto L41
            androidx.constraintlayout.core.SolverVariable[] r2 = r4.arrayGoals
            r2 = r2[r1]
            androidx.constraintlayout.core.PriorityGoalRow$GoalVariableAccessor r3 = r4.accessor
            r3.init(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r0 = r2.append(r0)
            androidx.constraintlayout.core.PriorityGoalRow$GoalVariableAccessor r2 = r4.accessor
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r2 = " "
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            int r1 = r1 + 1
            goto L18
        L41:
            return r0
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public void updateFromRow(androidx.constraintlayout.core.LinearSystem r6, androidx.constraintlayout.core.ArrayRow r7, boolean r8) {
            r5 = this;
            androidx.constraintlayout.core.SolverVariable r6 = r7.variable
            if (r6 != 0) goto L5
            return
        L5:
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r8 = r7.variables
            int r0 = r8.getCurrentSize()
            r1 = 0
        Lc:
            if (r1 >= r0) goto L31
            androidx.constraintlayout.core.SolverVariable r2 = r8.getVariable(r1)
            float r3 = r8.getVariableValue(r1)
            androidx.constraintlayout.core.PriorityGoalRow$GoalVariableAccessor r4 = r5.accessor
            r4.init(r2)
            androidx.constraintlayout.core.PriorityGoalRow$GoalVariableAccessor r4 = r5.accessor
            boolean r4 = r4.addToGoal(r6, r3)
            if (r4 == 0) goto L26
            r5.addToGoal(r2)
        L26:
            float r2 = r5.constantValue
            float r4 = r7.constantValue
            float r4 = r4 * r3
            float r2 = r2 + r4
            r5.constantValue = r2
            int r1 = r1 + 1
            goto Lc
        L31:
            r5.removeGoal(r6)
            return
    }
}
