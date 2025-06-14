package androidx.constraintlayout.core;

/* loaded from: classes.dex */
public class ArrayRow implements androidx.constraintlayout.core.LinearSystem.Row {
    private static final boolean DEBUG = false;
    private static final boolean FULL_NEW_CHECK = false;
    float constantValue;
    boolean isSimpleDefinition;
    boolean used;
    androidx.constraintlayout.core.SolverVariable variable;
    public androidx.constraintlayout.core.ArrayRow.ArrayRowVariables variables;
    java.util.ArrayList<androidx.constraintlayout.core.SolverVariable> variablesToUpdate;

    public interface ArrayRowVariables {
        void add(androidx.constraintlayout.core.SolverVariable r1, float r2, boolean r3);

        void clear();

        boolean contains(androidx.constraintlayout.core.SolverVariable r1);

        void display();

        void divideByAmount(float r1);

        float get(androidx.constraintlayout.core.SolverVariable r1);

        int getCurrentSize();

        androidx.constraintlayout.core.SolverVariable getVariable(int r1);

        float getVariableValue(int r1);

        int indexOf(androidx.constraintlayout.core.SolverVariable r1);

        void invert();

        void put(androidx.constraintlayout.core.SolverVariable r1, float r2);

        float remove(androidx.constraintlayout.core.SolverVariable r1, boolean r2);

        int sizeInBytes();

        float use(androidx.constraintlayout.core.ArrayRow r1, boolean r2);
    }

    public ArrayRow() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.variable = r0
            r0 = 0
            r2.constantValue = r0
            r0 = 0
            r2.used = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.variablesToUpdate = r1
            r2.isSimpleDefinition = r0
            return
    }

    public ArrayRow(androidx.constraintlayout.core.Cache r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.variable = r0
            r0 = 0
            r2.constantValue = r0
            r0 = 0
            r2.used = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.variablesToUpdate = r1
            r2.isSimpleDefinition = r0
            androidx.constraintlayout.core.ArrayLinkedVariables r0 = new androidx.constraintlayout.core.ArrayLinkedVariables
            r0.<init>(r2, r3)
            r2.variables = r0
            return
    }

    private boolean isNew(androidx.constraintlayout.core.SolverVariable r1, androidx.constraintlayout.core.LinearSystem r2) {
            r0 = this;
            int r1 = r1.usageInRowCount
            r2 = 1
            if (r1 > r2) goto L6
            goto L7
        L6:
            r2 = 0
        L7:
            return r2
    }

    private androidx.constraintlayout.core.SolverVariable pickPivotInVariables(boolean[] r10, androidx.constraintlayout.core.SolverVariable r11) {
            r9 = this;
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r0 = r9.variables
            int r0 = r0.getCurrentSize()
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = r1
        La:
            if (r3 >= r0) goto L3b
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r5 = r9.variables
            float r5 = r5.getVariableValue(r3)
            int r6 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r6 >= 0) goto L38
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r6 = r9.variables
            androidx.constraintlayout.core.SolverVariable r6 = r6.getVariable(r3)
            if (r10 == 0) goto L24
            int r7 = r6.f13id
            boolean r7 = r10[r7]
            if (r7 != 0) goto L38
        L24:
            if (r6 == r11) goto L38
            androidx.constraintlayout.core.SolverVariable$Type r7 = r6.mType
            androidx.constraintlayout.core.SolverVariable$Type r8 = androidx.constraintlayout.core.SolverVariable.Type.SLACK
            if (r7 == r8) goto L32
            androidx.constraintlayout.core.SolverVariable$Type r7 = r6.mType
            androidx.constraintlayout.core.SolverVariable$Type r8 = androidx.constraintlayout.core.SolverVariable.Type.ERROR
            if (r7 != r8) goto L38
        L32:
            int r7 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r7 >= 0) goto L38
            r4 = r5
            r2 = r6
        L38:
            int r3 = r3 + 1
            goto La
        L3b:
            return r2
    }

    public androidx.constraintlayout.core.ArrayRow addError(androidx.constraintlayout.core.LinearSystem r4, int r5) {
            r3 = this;
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r0 = r3.variables
            java.lang.String r1 = "ep"
            androidx.constraintlayout.core.SolverVariable r1 = r4.createErrorVariable(r5, r1)
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.put(r1, r2)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r0 = r3.variables
            java.lang.String r1 = "em"
            androidx.constraintlayout.core.SolverVariable r4 = r4.createErrorVariable(r5, r1)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.put(r4, r5)
            return r3
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void addError(androidx.constraintlayout.core.SolverVariable r4) {
            r3 = this;
            int r0 = r4.strength
            r1 = 1
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 != r1) goto L8
            goto L2a
        L8:
            int r0 = r4.strength
            r1 = 2
            if (r0 != r1) goto L10
            r2 = 1148846080(0x447a0000, float:1000.0)
            goto L2a
        L10:
            int r0 = r4.strength
            r1 = 3
            if (r0 != r1) goto L19
            r2 = 1232348160(0x49742400, float:1000000.0)
            goto L2a
        L19:
            int r0 = r4.strength
            r1 = 4
            if (r0 != r1) goto L22
            r2 = 1315859240(0x4e6e6b28, float:1.0E9)
            goto L2a
        L22:
            int r0 = r4.strength
            r1 = 5
            if (r0 != r1) goto L2a
            r2 = 1399379109(0x5368d4a5, float:1.0E12)
        L2a:
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r0 = r3.variables
            r0.put(r4, r2)
            return
    }

    androidx.constraintlayout.core.ArrayRow addSingleError(androidx.constraintlayout.core.SolverVariable r2, int r3) {
            r1 = this;
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r0 = r1.variables
            float r3 = (float) r3
            r0.put(r2, r3)
            return r1
    }

    boolean chooseSubject(androidx.constraintlayout.core.LinearSystem r3) {
            r2 = this;
            androidx.constraintlayout.core.SolverVariable r3 = r2.chooseSubjectInVariables(r3)
            r0 = 1
            if (r3 != 0) goto L9
            r3 = r0
            goto Ld
        L9:
            r2.pivot(r3)
            r3 = 0
        Ld:
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r1 = r2.variables
            int r1 = r1.getCurrentSize()
            if (r1 != 0) goto L17
            r2.isSimpleDefinition = r0
        L17:
            return r3
    }

    androidx.constraintlayout.core.SolverVariable chooseSubjectInVariables(androidx.constraintlayout.core.LinearSystem r15) {
            r14 = this;
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r0 = r14.variables
            int r0 = r0.getCurrentSize()
            r1 = 0
            r2 = 0
            r3 = 0
            r7 = r2
            r8 = r7
            r4 = r3
            r5 = r4
            r6 = r5
            r3 = r1
        Lf:
            if (r4 >= r0) goto L6a
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r9 = r14.variables
            float r9 = r9.getVariableValue(r4)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r10 = r14.variables
            androidx.constraintlayout.core.SolverVariable r10 = r10.getVariable(r4)
            androidx.constraintlayout.core.SolverVariable$Type r11 = r10.mType
            androidx.constraintlayout.core.SolverVariable$Type r12 = androidx.constraintlayout.core.SolverVariable.Type.UNRESTRICTED
            r13 = 1
            if (r11 != r12) goto L43
            if (r1 != 0) goto L2e
            boolean r1 = r14.isNew(r10, r15)
        L2a:
            r5 = r1
            r7 = r9
            r1 = r10
            goto L67
        L2e:
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 <= 0) goto L37
            boolean r1 = r14.isNew(r10, r15)
            goto L2a
        L37:
            if (r5 != 0) goto L67
            boolean r11 = r14.isNew(r10, r15)
            if (r11 == 0) goto L67
            r7 = r9
            r1 = r10
            r5 = r13
            goto L67
        L43:
            if (r1 != 0) goto L67
            int r11 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r11 >= 0) goto L67
            if (r3 != 0) goto L53
            boolean r3 = r14.isNew(r10, r15)
        L4f:
            r6 = r3
            r8 = r9
            r3 = r10
            goto L67
        L53:
            int r11 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r11 <= 0) goto L5c
            boolean r3 = r14.isNew(r10, r15)
            goto L4f
        L5c:
            if (r6 != 0) goto L67
            boolean r11 = r14.isNew(r10, r15)
            if (r11 == 0) goto L67
            r8 = r9
            r3 = r10
            r6 = r13
        L67:
            int r4 = r4 + 1
            goto Lf
        L6a:
            if (r1 == 0) goto L6d
            return r1
        L6d:
            return r3
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void clear() {
            r1 = this;
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r0 = r1.variables
            r0.clear()
            r0 = 0
            r1.variable = r0
            r0 = 0
            r1.constantValue = r0
            return
    }

    androidx.constraintlayout.core.ArrayRow createRowCentering(androidx.constraintlayout.core.SolverVariable r6, androidx.constraintlayout.core.SolverVariable r7, int r8, float r9, androidx.constraintlayout.core.SolverVariable r10, androidx.constraintlayout.core.SolverVariable r11, int r12) {
            r5 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r7 != r10) goto L16
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r8 = r5.variables
            r8.put(r6, r0)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r6 = r5.variables
            r6.put(r11, r0)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r6 = r5.variables
            r8 = -1073741824(0xffffffffc0000000, float:-2.0)
            r6.put(r7, r8)
            return r5
        L16:
            r1 = 1056964608(0x3f000000, float:0.5)
            int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L3c
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r9 = r5.variables
            r9.put(r6, r0)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r6 = r5.variables
            r6.put(r7, r2)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r6 = r5.variables
            r6.put(r10, r2)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r6 = r5.variables
            r6.put(r11, r0)
            if (r8 > 0) goto L36
            if (r12 <= 0) goto L8a
        L36:
            int r6 = -r8
            int r6 = r6 + r12
            float r6 = (float) r6
            r5.constantValue = r6
            goto L8a
        L3c:
            r1 = 0
            int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r1 > 0) goto L4f
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r9 = r5.variables
            r9.put(r6, r2)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r6 = r5.variables
            r6.put(r7, r0)
            float r6 = (float) r8
            r5.constantValue = r6
            goto L8a
        L4f:
            int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r1 < 0) goto L62
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r6 = r5.variables
            r6.put(r11, r2)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r6 = r5.variables
            r6.put(r10, r0)
            int r6 = -r12
            float r6 = (float) r6
            r5.constantValue = r6
            goto L8a
        L62:
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r1 = r5.variables
            float r3 = r0 - r9
            float r4 = r3 * r0
            r1.put(r6, r4)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r6 = r5.variables
            float r1 = r3 * r2
            r6.put(r7, r1)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r6 = r5.variables
            float r2 = r2 * r9
            r6.put(r10, r2)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r6 = r5.variables
            float r0 = r0 * r9
            r6.put(r11, r0)
            if (r8 > 0) goto L82
            if (r12 <= 0) goto L8a
        L82:
            int r6 = -r8
            float r6 = (float) r6
            float r6 = r6 * r3
            float r7 = (float) r12
            float r7 = r7 * r9
            float r6 = r6 + r7
            r5.constantValue = r6
        L8a:
            return r5
    }

    androidx.constraintlayout.core.ArrayRow createRowDefinition(androidx.constraintlayout.core.SolverVariable r1, int r2) {
            r0 = this;
            r0.variable = r1
            float r2 = (float) r2
            r1.computedValue = r2
            r0.constantValue = r2
            r1 = 1
            r0.isSimpleDefinition = r1
            return r0
    }

    androidx.constraintlayout.core.ArrayRow createRowDimensionPercent(androidx.constraintlayout.core.SolverVariable r3, androidx.constraintlayout.core.SolverVariable r4, float r5) {
            r2 = this;
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r0 = r2.variables
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.put(r3, r1)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r3 = r2.variables
            r3.put(r4, r5)
            return r2
    }

    public androidx.constraintlayout.core.ArrayRow createRowDimensionRatio(androidx.constraintlayout.core.SolverVariable r3, androidx.constraintlayout.core.SolverVariable r4, androidx.constraintlayout.core.SolverVariable r5, androidx.constraintlayout.core.SolverVariable r6, float r7) {
            r2 = this;
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r0 = r2.variables
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.put(r3, r1)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r3 = r2.variables
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.put(r4, r0)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r3 = r2.variables
            r3.put(r5, r7)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r3 = r2.variables
            float r4 = -r7
            r3.put(r6, r4)
            return r2
    }

    public androidx.constraintlayout.core.ArrayRow createRowEqualDimension(float r4, float r5, float r6, androidx.constraintlayout.core.SolverVariable r7, int r8, androidx.constraintlayout.core.SolverVariable r9, int r10, androidx.constraintlayout.core.SolverVariable r11, int r12, androidx.constraintlayout.core.SolverVariable r13, int r14) {
            r3 = this;
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L32
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto Le
            goto L32
        Le:
            float r4 = r4 / r5
            float r6 = r6 / r5
            float r4 = r4 / r6
            int r5 = -r8
            int r5 = r5 - r10
            float r5 = (float) r5
            float r6 = (float) r12
            float r6 = r6 * r4
            float r5 = r5 + r6
            float r6 = (float) r14
            float r6 = r6 * r4
            float r5 = r5 + r6
            r3.constantValue = r5
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r5 = r3.variables
            r5.put(r7, r2)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r5 = r3.variables
            r5.put(r9, r1)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r5 = r3.variables
            r5.put(r13, r4)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r5 = r3.variables
            float r4 = -r4
            r5.put(r11, r4)
            goto L4d
        L32:
            int r4 = -r8
            int r4 = r4 - r10
            int r4 = r4 + r12
            int r4 = r4 + r14
            float r4 = (float) r4
            r3.constantValue = r4
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r4 = r3.variables
            r4.put(r7, r2)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r4 = r3.variables
            r4.put(r9, r1)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r4 = r3.variables
            r4.put(r13, r2)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r4 = r3.variables
            r4.put(r11, r1)
        L4d:
            return r3
    }

    public androidx.constraintlayout.core.ArrayRow createRowEqualMatchDimensions(float r5, float r6, float r7, androidx.constraintlayout.core.SolverVariable r8, androidx.constraintlayout.core.SolverVariable r9, androidx.constraintlayout.core.SolverVariable r10, androidx.constraintlayout.core.SolverVariable r11) {
            r4 = this;
            r0 = 0
            r4.constantValue = r0
            int r1 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L47
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 != 0) goto L10
            goto L47
        L10:
            int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r1 != 0) goto L1f
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r5 = r4.variables
            r5.put(r8, r3)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r5 = r4.variables
            r5.put(r9, r2)
            goto L5b
        L1f:
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 != 0) goto L2e
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r5 = r4.variables
            r5.put(r10, r3)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r5 = r4.variables
            r5.put(r11, r2)
            goto L5b
        L2e:
            float r5 = r5 / r6
            float r7 = r7 / r6
            float r5 = r5 / r7
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r6 = r4.variables
            r6.put(r8, r3)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r6 = r4.variables
            r6.put(r9, r2)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r6 = r4.variables
            r6.put(r11, r5)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r6 = r4.variables
            float r5 = -r5
            r6.put(r10, r5)
            goto L5b
        L47:
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r5 = r4.variables
            r5.put(r8, r3)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r5 = r4.variables
            r5.put(r9, r2)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r5 = r4.variables
            r5.put(r11, r3)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r5 = r4.variables
            r5.put(r10, r2)
        L5b:
            return r4
    }

    public androidx.constraintlayout.core.ArrayRow createRowEquals(androidx.constraintlayout.core.SolverVariable r2, int r3) {
            r1 = this;
            if (r3 >= 0) goto Lf
            int r3 = r3 * (-1)
            float r3 = (float) r3
            r1.constantValue = r3
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r3 = r1.variables
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.put(r2, r0)
            goto L19
        Lf:
            float r3 = (float) r3
            r1.constantValue = r3
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r3 = r1.variables
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3.put(r2, r0)
        L19:
            return r1
    }

    public androidx.constraintlayout.core.ArrayRow createRowEquals(androidx.constraintlayout.core.SolverVariable r3, androidx.constraintlayout.core.SolverVariable r4, int r5) {
            r2 = this;
            r0 = 0
            if (r5 == 0) goto Lb
            if (r5 >= 0) goto L8
            int r5 = r5 * (-1)
            r0 = 1
        L8:
            float r5 = (float) r5
            r2.constantValue = r5
        Lb:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L1c
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r0 = r2.variables
            r0.put(r3, r5)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r3 = r2.variables
            r3.put(r4, r1)
            goto L26
        L1c:
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r0 = r2.variables
            r0.put(r3, r1)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r3 = r2.variables
            r3.put(r4, r5)
        L26:
            return r2
    }

    public androidx.constraintlayout.core.ArrayRow createRowGreaterThan(androidx.constraintlayout.core.SolverVariable r1, int r2, androidx.constraintlayout.core.SolverVariable r3) {
            r0 = this;
            float r2 = (float) r2
            r0.constantValue = r2
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r2 = r0.variables
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.put(r1, r3)
            return r0
    }

    public androidx.constraintlayout.core.ArrayRow createRowGreaterThan(androidx.constraintlayout.core.SolverVariable r3, androidx.constraintlayout.core.SolverVariable r4, androidx.constraintlayout.core.SolverVariable r5, int r6) {
            r2 = this;
            r0 = 0
            if (r6 == 0) goto Lb
            if (r6 >= 0) goto L8
            int r6 = r6 * (-1)
            r0 = 1
        L8:
            float r6 = (float) r6
            r2.constantValue = r6
        Lb:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L21
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r0 = r2.variables
            r0.put(r3, r6)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r3 = r2.variables
            r3.put(r4, r1)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r3 = r2.variables
            r3.put(r5, r1)
            goto L30
        L21:
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r0 = r2.variables
            r0.put(r3, r1)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r3 = r2.variables
            r3.put(r4, r6)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r3 = r2.variables
            r3.put(r5, r6)
        L30:
            return r2
    }

    public androidx.constraintlayout.core.ArrayRow createRowLowerThan(androidx.constraintlayout.core.SolverVariable r3, androidx.constraintlayout.core.SolverVariable r4, androidx.constraintlayout.core.SolverVariable r5, int r6) {
            r2 = this;
            r0 = 0
            if (r6 == 0) goto Lb
            if (r6 >= 0) goto L8
            int r6 = r6 * (-1)
            r0 = 1
        L8:
            float r6 = (float) r6
            r2.constantValue = r6
        Lb:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L21
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r0 = r2.variables
            r0.put(r3, r6)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r3 = r2.variables
            r3.put(r4, r1)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r3 = r2.variables
            r3.put(r5, r6)
            goto L30
        L21:
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r0 = r2.variables
            r0.put(r3, r1)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r3 = r2.variables
            r3.put(r4, r6)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r3 = r2.variables
            r3.put(r5, r1)
        L30:
            return r2
    }

    public androidx.constraintlayout.core.ArrayRow createRowWithAngle(androidx.constraintlayout.core.SolverVariable r3, androidx.constraintlayout.core.SolverVariable r4, androidx.constraintlayout.core.SolverVariable r5, androidx.constraintlayout.core.SolverVariable r6, float r7) {
            r2 = this;
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r0 = r2.variables
            r1 = 1056964608(0x3f000000, float:0.5)
            r0.put(r5, r1)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r5 = r2.variables
            r5.put(r6, r1)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r5 = r2.variables
            r6 = -1090519040(0xffffffffbf000000, float:-0.5)
            r5.put(r3, r6)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r3 = r2.variables
            r3.put(r4, r6)
            float r3 = -r7
            r2.constantValue = r3
            return r2
    }

    void ensurePositiveConstant() {
            r2 = this;
            float r0 = r2.constantValue
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 >= 0) goto L11
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r0 = r0 * r1
            r2.constantValue = r0
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r0 = r2.variables
            r0.invert()
        L11:
            return
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public androidx.constraintlayout.core.SolverVariable getKey() {
            r1 = this;
            androidx.constraintlayout.core.SolverVariable r0 = r1.variable
            return r0
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public androidx.constraintlayout.core.SolverVariable getPivotCandidate(androidx.constraintlayout.core.LinearSystem r1, boolean[] r2) {
            r0 = this;
            r1 = 0
            androidx.constraintlayout.core.SolverVariable r1 = r0.pickPivotInVariables(r2, r1)
            return r1
    }

    boolean hasKeyVariable() {
            r2 = this;
            androidx.constraintlayout.core.SolverVariable r0 = r2.variable
            if (r0 == 0) goto L13
            androidx.constraintlayout.core.SolverVariable$Type r0 = r0.mType
            androidx.constraintlayout.core.SolverVariable$Type r1 = androidx.constraintlayout.core.SolverVariable.Type.UNRESTRICTED
            if (r0 == r1) goto L11
            float r0 = r2.constantValue
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L13
        L11:
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            return r0
    }

    boolean hasVariable(androidx.constraintlayout.core.SolverVariable r2) {
            r1 = this;
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r0 = r1.variables
            boolean r2 = r0.contains(r2)
            return r2
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void initFromRow(androidx.constraintlayout.core.LinearSystem.Row r6) {
            r5 = this;
            boolean r0 = r6 instanceof androidx.constraintlayout.core.ArrayRow
            if (r0 == 0) goto L2c
            androidx.constraintlayout.core.ArrayRow r6 = (androidx.constraintlayout.core.ArrayRow) r6
            r0 = 0
            r5.variable = r0
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r0 = r5.variables
            r0.clear()
            r0 = 0
        Lf:
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r1 = r6.variables
            int r1 = r1.getCurrentSize()
            if (r0 >= r1) goto L2c
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r1 = r6.variables
            androidx.constraintlayout.core.SolverVariable r1 = r1.getVariable(r0)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r2 = r6.variables
            float r2 = r2.getVariableValue(r0)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r3 = r5.variables
            r4 = 1
            r3.add(r1, r2, r4)
            int r0 = r0 + 1
            goto Lf
        L2c:
            return
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public boolean isEmpty() {
            r2 = this;
            androidx.constraintlayout.core.SolverVariable r0 = r2.variable
            if (r0 != 0) goto L15
            float r0 = r2.constantValue
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L15
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r0 = r2.variables
            int r0 = r0.getCurrentSize()
            if (r0 != 0) goto L15
            r0 = 1
            goto L16
        L15:
            r0 = 0
        L16:
            return r0
    }

    public androidx.constraintlayout.core.SolverVariable pickPivot(androidx.constraintlayout.core.SolverVariable r2) {
            r1 = this;
            r0 = 0
            androidx.constraintlayout.core.SolverVariable r2 = r1.pickPivotInVariables(r0, r2)
            return r2
    }

    void pivot(androidx.constraintlayout.core.SolverVariable r4) {
            r3 = this;
            androidx.constraintlayout.core.SolverVariable r0 = r3.variable
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 == 0) goto L13
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r2 = r3.variables
            r2.put(r0, r1)
            androidx.constraintlayout.core.SolverVariable r0 = r3.variable
            r2 = -1
            r0.definitionId = r2
            r0 = 0
            r3.variable = r0
        L13:
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r0 = r3.variables
            r2 = 1
            float r0 = r0.remove(r4, r2)
            float r0 = r0 * r1
            r3.variable = r4
            r4 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 != 0) goto L24
            return
        L24:
            float r4 = r3.constantValue
            float r4 = r4 / r0
            r3.constantValue = r4
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r4 = r3.variables
            r4.divideByAmount(r0)
            return
    }

    public void reset() {
            r1 = this;
            r0 = 0
            r1.variable = r0
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r0 = r1.variables
            r0.clear()
            r0 = 0
            r1.constantValue = r0
            r0 = 0
            r1.isSimpleDefinition = r0
            return
    }

    int sizeInBytes() {
            r2 = this;
            androidx.constraintlayout.core.SolverVariable r0 = r2.variable
            r1 = 4
            if (r0 == 0) goto L7
            r0 = r1
            goto L8
        L7:
            r0 = 0
        L8:
            int r0 = r0 + r1
            int r0 = r0 + r1
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r1 = r2.variables
            int r1 = r1.sizeInBytes()
            int r0 = r0 + r1
            return r0
    }

    java.lang.String toReadableString() {
            r10 = this;
            androidx.constraintlayout.core.SolverVariable r0 = r10.variable
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L18
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            androidx.constraintlayout.core.SolverVariable r1 = r10.variable
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
        L18:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = " = "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            float r1 = r10.constantValue
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L49
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            float r1 = r10.constantValue
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r4
            goto L4a
        L49:
            r1 = r3
        L4a:
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r5 = r10.variables
            int r5 = r5.getCurrentSize()
        L50:
            if (r3 >= r5) goto Lea
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r6 = r10.variables
            androidx.constraintlayout.core.SolverVariable r6 = r6.getVariable(r3)
            if (r6 != 0) goto L5c
            goto Le6
        L5c:
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r7 = r10.variables
            float r7 = r7.getVariableValue(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L68
            goto Le6
        L68:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L88
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto Lb2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = "- "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto Lb1
        L88:
            if (r8 <= 0) goto L9e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = " + "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto Lb2
        L9e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = " - "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
        Lb1:
            float r7 = r7 * r9
        Lb2:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto Lca
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.StringBuilder r0 = r0.append(r6)
            java.lang.String r0 = r0.toString()
            goto Le5
        Lca:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.StringBuilder r0 = r0.append(r7)
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r6)
            java.lang.String r0 = r0.toString()
        Le5:
            r1 = r4
        Le6:
            int r3 = r3 + 1
            goto L50
        Lea:
            if (r1 != 0) goto Lff
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = "0.0"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
        Lff:
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.toReadableString()
            return r0
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void updateFromFinalVariable(androidx.constraintlayout.core.LinearSystem r4, androidx.constraintlayout.core.SolverVariable r5, boolean r6) {
            r3 = this;
            if (r5 == 0) goto L30
            boolean r0 = r5.isFinalValue
            if (r0 != 0) goto L7
            goto L30
        L7:
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r0 = r3.variables
            float r0 = r0.get(r5)
            float r1 = r3.constantValue
            float r2 = r5.computedValue
            float r2 = r2 * r0
            float r1 = r1 + r2
            r3.constantValue = r1
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r0 = r3.variables
            r0.remove(r5, r6)
            if (r6 == 0) goto L1f
            r5.removeFromRow(r3)
        L1f:
            boolean r5 = androidx.constraintlayout.core.LinearSystem.SIMPLIFY_SYNONYMS
            if (r5 == 0) goto L30
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r5 = r3.variables
            int r5 = r5.getCurrentSize()
            if (r5 != 0) goto L30
            r5 = 1
            r3.isSimpleDefinition = r5
            r4.hasSimpleDefinition = r5
        L30:
            return
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void updateFromRow(androidx.constraintlayout.core.LinearSystem r4, androidx.constraintlayout.core.ArrayRow r5, boolean r6) {
            r3 = this;
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r0 = r3.variables
            float r0 = r0.use(r5, r6)
            float r1 = r3.constantValue
            float r2 = r5.constantValue
            float r2 = r2 * r0
            float r1 = r1 + r2
            r3.constantValue = r1
            if (r6 == 0) goto L15
            androidx.constraintlayout.core.SolverVariable r5 = r5.variable
            r5.removeFromRow(r3)
        L15:
            boolean r5 = androidx.constraintlayout.core.LinearSystem.SIMPLIFY_SYNONYMS
            if (r5 == 0) goto L2a
            androidx.constraintlayout.core.SolverVariable r5 = r3.variable
            if (r5 == 0) goto L2a
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r5 = r3.variables
            int r5 = r5.getCurrentSize()
            if (r5 != 0) goto L2a
            r5 = 1
            r3.isSimpleDefinition = r5
            r4.hasSimpleDefinition = r5
        L2a:
            return
    }

    public void updateFromSynonymVariable(androidx.constraintlayout.core.LinearSystem r4, androidx.constraintlayout.core.SolverVariable r5, boolean r6) {
            r3 = this;
            if (r5 == 0) goto L3d
            boolean r0 = r5.isSynonym
            if (r0 != 0) goto L7
            goto L3d
        L7:
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r0 = r3.variables
            float r0 = r0.get(r5)
            float r1 = r3.constantValue
            float r2 = r5.synonymDelta
            float r2 = r2 * r0
            float r1 = r1 + r2
            r3.constantValue = r1
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r1 = r3.variables
            r1.remove(r5, r6)
            if (r6 == 0) goto L1f
            r5.removeFromRow(r3)
        L1f:
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r1 = r3.variables
            androidx.constraintlayout.core.Cache r2 = r4.mCache
            androidx.constraintlayout.core.SolverVariable[] r2 = r2.mIndexedVariables
            int r5 = r5.synonym
            r5 = r2[r5]
            r1.add(r5, r0, r6)
            boolean r5 = androidx.constraintlayout.core.LinearSystem.SIMPLIFY_SYNONYMS
            if (r5 == 0) goto L3d
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r5 = r3.variables
            int r5 = r5.getCurrentSize()
            if (r5 != 0) goto L3d
            r5 = 1
            r3.isSimpleDefinition = r5
            r4.hasSimpleDefinition = r5
        L3d:
            return
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void updateFromSystem(androidx.constraintlayout.core.LinearSystem r9) {
            r8 = this;
            androidx.constraintlayout.core.ArrayRow[] r0 = r9.mRows
            int r0 = r0.length
            if (r0 != 0) goto L6
            return
        L6:
            r0 = 0
            r1 = r0
        L8:
            r2 = 1
            if (r1 != 0) goto L66
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r3 = r8.variables
            int r3 = r3.getCurrentSize()
            r4 = r0
        L12:
            if (r4 >= r3) goto L2f
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r5 = r8.variables
            androidx.constraintlayout.core.SolverVariable r5 = r5.getVariable(r4)
            int r6 = r5.definitionId
            r7 = -1
            if (r6 != r7) goto L27
            boolean r6 = r5.isFinalValue
            if (r6 != 0) goto L27
            boolean r6 = r5.isSynonym
            if (r6 == 0) goto L2c
        L27:
            java.util.ArrayList<androidx.constraintlayout.core.SolverVariable> r6 = r8.variablesToUpdate
            r6.add(r5)
        L2c:
            int r4 = r4 + 1
            goto L12
        L2f:
            java.util.ArrayList<androidx.constraintlayout.core.SolverVariable> r3 = r8.variablesToUpdate
            int r3 = r3.size()
            if (r3 <= 0) goto L64
            r4 = r0
        L38:
            if (r4 >= r3) goto L5e
            java.util.ArrayList<androidx.constraintlayout.core.SolverVariable> r5 = r8.variablesToUpdate
            java.lang.Object r5 = r5.get(r4)
            androidx.constraintlayout.core.SolverVariable r5 = (androidx.constraintlayout.core.SolverVariable) r5
            boolean r6 = r5.isFinalValue
            if (r6 == 0) goto L4a
            r8.updateFromFinalVariable(r9, r5, r2)
            goto L5b
        L4a:
            boolean r6 = r5.isSynonym
            if (r6 == 0) goto L52
            r8.updateFromSynonymVariable(r9, r5, r2)
            goto L5b
        L52:
            androidx.constraintlayout.core.ArrayRow[] r6 = r9.mRows
            int r5 = r5.definitionId
            r5 = r6[r5]
            r8.updateFromRow(r9, r5, r2)
        L5b:
            int r4 = r4 + 1
            goto L38
        L5e:
            java.util.ArrayList<androidx.constraintlayout.core.SolverVariable> r2 = r8.variablesToUpdate
            r2.clear()
            goto L8
        L64:
            r1 = r2
            goto L8
        L66:
            boolean r0 = androidx.constraintlayout.core.LinearSystem.SIMPLIFY_SYNONYMS
            if (r0 == 0) goto L7a
            androidx.constraintlayout.core.SolverVariable r0 = r8.variable
            if (r0 == 0) goto L7a
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r0 = r8.variables
            int r0 = r0.getCurrentSize()
            if (r0 != 0) goto L7a
            r8.isSimpleDefinition = r2
            r9.hasSimpleDefinition = r2
        L7a:
            return
    }
}
