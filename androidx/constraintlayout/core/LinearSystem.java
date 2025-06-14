package androidx.constraintlayout.core;

/* loaded from: classes.dex */
public class LinearSystem {
    public static long ARRAY_ROW_CREATION = 0;
    public static final boolean DEBUG = false;
    private static final boolean DEBUG_CONSTRAINTS = false;
    public static final boolean FULL_DEBUG = false;
    public static final boolean MEASURE = false;
    public static long OPTIMIZED_ARRAY_ROW_CREATION = 0;
    public static boolean OPTIMIZED_ENGINE = false;
    private static int POOL_SIZE = 1000;
    public static boolean SIMPLIFY_SYNONYMS = true;
    public static boolean SKIP_COLUMNS = true;
    public static boolean USE_BASIC_SYNONYMS = true;
    public static boolean USE_DEPENDENCY_ORDERING = false;
    public static boolean USE_SYNONYMS = true;
    public static androidx.constraintlayout.core.Metrics sMetrics;
    private int TABLE_SIZE;
    public boolean graphOptimizer;
    public boolean hasSimpleDefinition;
    private boolean[] mAlreadyTestedCandidates;
    final androidx.constraintlayout.core.Cache mCache;
    private androidx.constraintlayout.core.LinearSystem.Row mGoal;
    private int mMaxColumns;
    private int mMaxRows;
    int mNumColumns;
    int mNumRows;
    private androidx.constraintlayout.core.SolverVariable[] mPoolVariables;
    private int mPoolVariablesCount;
    androidx.constraintlayout.core.ArrayRow[] mRows;
    private androidx.constraintlayout.core.LinearSystem.Row mTempGoal;
    private java.util.HashMap<java.lang.String, androidx.constraintlayout.core.SolverVariable> mVariables;
    int mVariablesID;
    public boolean newgraphOptimizer;

    interface Row {
        void addError(androidx.constraintlayout.core.SolverVariable r1);

        void clear();

        androidx.constraintlayout.core.SolverVariable getKey();

        androidx.constraintlayout.core.SolverVariable getPivotCandidate(androidx.constraintlayout.core.LinearSystem r1, boolean[] r2);

        void initFromRow(androidx.constraintlayout.core.LinearSystem.Row r1);

        boolean isEmpty();

        void updateFromFinalVariable(androidx.constraintlayout.core.LinearSystem r1, androidx.constraintlayout.core.SolverVariable r2, boolean r3);

        void updateFromRow(androidx.constraintlayout.core.LinearSystem r1, androidx.constraintlayout.core.ArrayRow r2, boolean r3);

        void updateFromSystem(androidx.constraintlayout.core.LinearSystem r1);
    }

    class ValuesRow extends androidx.constraintlayout.core.ArrayRow {
        final /* synthetic */ androidx.constraintlayout.core.LinearSystem this$0;

        public ValuesRow(androidx.constraintlayout.core.LinearSystem r1, androidx.constraintlayout.core.Cache r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                androidx.constraintlayout.core.SolverVariableValues r1 = new androidx.constraintlayout.core.SolverVariableValues
                r1.<init>(r0, r2)
                r0.variables = r1
                return
        }
    }

    static {
            return
    }

    public LinearSystem() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.hasSimpleDefinition = r0
            r3.mVariablesID = r0
            r1 = 0
            r3.mVariables = r1
            r2 = 32
            r3.TABLE_SIZE = r2
            r3.mMaxColumns = r2
            r3.mRows = r1
            r3.graphOptimizer = r0
            r3.newgraphOptimizer = r0
            boolean[] r1 = new boolean[r2]
            r3.mAlreadyTestedCandidates = r1
            r1 = 1
            r3.mNumColumns = r1
            r3.mNumRows = r0
            r3.mMaxRows = r2
            int r1 = androidx.constraintlayout.core.LinearSystem.POOL_SIZE
            androidx.constraintlayout.core.SolverVariable[] r1 = new androidx.constraintlayout.core.SolverVariable[r1]
            r3.mPoolVariables = r1
            r3.mPoolVariablesCount = r0
            androidx.constraintlayout.core.ArrayRow[] r0 = new androidx.constraintlayout.core.ArrayRow[r2]
            r3.mRows = r0
            r3.releaseRows()
            androidx.constraintlayout.core.Cache r0 = new androidx.constraintlayout.core.Cache
            r0.<init>()
            r3.mCache = r0
            androidx.constraintlayout.core.PriorityGoalRow r1 = new androidx.constraintlayout.core.PriorityGoalRow
            r1.<init>(r0)
            r3.mGoal = r1
            boolean r1 = androidx.constraintlayout.core.LinearSystem.OPTIMIZED_ENGINE
            if (r1 == 0) goto L4b
            androidx.constraintlayout.core.LinearSystem$ValuesRow r1 = new androidx.constraintlayout.core.LinearSystem$ValuesRow
            r1.<init>(r3, r0)
            r3.mTempGoal = r1
            goto L52
        L4b:
            androidx.constraintlayout.core.ArrayRow r1 = new androidx.constraintlayout.core.ArrayRow
            r1.<init>(r0)
            r3.mTempGoal = r1
        L52:
            return
    }

    private androidx.constraintlayout.core.SolverVariable acquireSolverVariable(androidx.constraintlayout.core.SolverVariable.Type r3, java.lang.String r4) {
            r2 = this;
            androidx.constraintlayout.core.Cache r0 = r2.mCache
            androidx.constraintlayout.core.Pools$Pool<androidx.constraintlayout.core.SolverVariable> r0 = r0.solverVariablePool
            java.lang.Object r0 = r0.acquire()
            androidx.constraintlayout.core.SolverVariable r0 = (androidx.constraintlayout.core.SolverVariable) r0
            if (r0 != 0) goto L15
            androidx.constraintlayout.core.SolverVariable r0 = new androidx.constraintlayout.core.SolverVariable
            r0.<init>(r3, r4)
            r0.setType(r3, r4)
            goto L1b
        L15:
            r0.reset()
            r0.setType(r3, r4)
        L1b:
            int r3 = r2.mPoolVariablesCount
            int r4 = androidx.constraintlayout.core.LinearSystem.POOL_SIZE
            if (r3 < r4) goto L2f
            int r4 = r4 * 2
            androidx.constraintlayout.core.LinearSystem.POOL_SIZE = r4
            androidx.constraintlayout.core.SolverVariable[] r3 = r2.mPoolVariables
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)
            androidx.constraintlayout.core.SolverVariable[] r3 = (androidx.constraintlayout.core.SolverVariable[]) r3
            r2.mPoolVariables = r3
        L2f:
            androidx.constraintlayout.core.SolverVariable[] r3 = r2.mPoolVariables
            int r4 = r2.mPoolVariablesCount
            int r1 = r4 + 1
            r2.mPoolVariablesCount = r1
            r3[r4] = r0
            return r0
    }

    private void addError(androidx.constraintlayout.core.ArrayRow r2) {
            r1 = this;
            r0 = 0
            r2.addError(r1, r0)
            return
    }

    private final void addRow(androidx.constraintlayout.core.ArrayRow r8) {
            r7 = this;
            boolean r0 = androidx.constraintlayout.core.LinearSystem.SIMPLIFY_SYNONYMS
            if (r0 == 0) goto L10
            boolean r0 = r8.isSimpleDefinition
            if (r0 == 0) goto L10
            androidx.constraintlayout.core.SolverVariable r0 = r8.variable
            float r8 = r8.constantValue
            r0.setFinalValue(r7, r8)
            goto L27
        L10:
            androidx.constraintlayout.core.ArrayRow[] r0 = r7.mRows
            int r1 = r7.mNumRows
            r0[r1] = r8
            androidx.constraintlayout.core.SolverVariable r0 = r8.variable
            int r1 = r7.mNumRows
            r0.definitionId = r1
            int r0 = r7.mNumRows
            int r0 = r0 + 1
            r7.mNumRows = r0
            androidx.constraintlayout.core.SolverVariable r0 = r8.variable
            r0.updateReferencesWithNewDefinition(r7, r8)
        L27:
            boolean r8 = androidx.constraintlayout.core.LinearSystem.SIMPLIFY_SYNONYMS
            if (r8 == 0) goto La3
            boolean r8 = r7.hasSimpleDefinition
            if (r8 == 0) goto La3
            r8 = 0
            r0 = r8
        L31:
            int r1 = r7.mNumRows
            if (r0 >= r1) goto La1
            androidx.constraintlayout.core.ArrayRow[] r1 = r7.mRows
            r1 = r1[r0]
            if (r1 != 0) goto L42
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.String r2 = "WTF"
            r1.println(r2)
        L42:
            androidx.constraintlayout.core.ArrayRow[] r1 = r7.mRows
            r1 = r1[r0]
            if (r1 == 0) goto L9e
            boolean r1 = r1.isSimpleDefinition
            if (r1 == 0) goto L9e
            androidx.constraintlayout.core.ArrayRow[] r1 = r7.mRows
            r1 = r1[r0]
            androidx.constraintlayout.core.SolverVariable r2 = r1.variable
            float r3 = r1.constantValue
            r2.setFinalValue(r7, r3)
            boolean r2 = androidx.constraintlayout.core.LinearSystem.OPTIMIZED_ENGINE
            if (r2 == 0) goto L63
            androidx.constraintlayout.core.Cache r2 = r7.mCache
            androidx.constraintlayout.core.Pools$Pool<androidx.constraintlayout.core.ArrayRow> r2 = r2.optimizedArrayRowPool
            r2.release(r1)
            goto L6a
        L63:
            androidx.constraintlayout.core.Cache r2 = r7.mCache
            androidx.constraintlayout.core.Pools$Pool<androidx.constraintlayout.core.ArrayRow> r2 = r2.arrayRowPool
            r2.release(r1)
        L6a:
            androidx.constraintlayout.core.ArrayRow[] r1 = r7.mRows
            r2 = 0
            r1[r0] = r2
            int r1 = r0 + 1
            r3 = r1
        L72:
            int r4 = r7.mNumRows
            if (r1 >= r4) goto L92
            androidx.constraintlayout.core.ArrayRow[] r3 = r7.mRows
            int r4 = r1 + (-1)
            r5 = r3[r1]
            r3[r4] = r5
            androidx.constraintlayout.core.SolverVariable r3 = r5.variable
            int r3 = r3.definitionId
            if (r3 != r1) goto L8c
            androidx.constraintlayout.core.ArrayRow[] r3 = r7.mRows
            r3 = r3[r4]
            androidx.constraintlayout.core.SolverVariable r3 = r3.variable
            r3.definitionId = r4
        L8c:
            int r3 = r1 + 1
            r6 = r3
            r3 = r1
            r1 = r6
            goto L72
        L92:
            if (r3 >= r4) goto L98
            androidx.constraintlayout.core.ArrayRow[] r1 = r7.mRows
            r1[r3] = r2
        L98:
            int r4 = r4 + (-1)
            r7.mNumRows = r4
            int r0 = r0 + (-1)
        L9e:
            int r0 = r0 + 1
            goto L31
        La1:
            r7.hasSimpleDefinition = r8
        La3:
            return
    }

    private void addSingleError(androidx.constraintlayout.core.ArrayRow r2, int r3) {
            r1 = this;
            r0 = 0
            r1.addSingleError(r2, r3, r0)
            return
    }

    private void computeValues() {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r3.mNumRows
            if (r0 >= r1) goto L12
            androidx.constraintlayout.core.ArrayRow[] r1 = r3.mRows
            r1 = r1[r0]
            androidx.constraintlayout.core.SolverVariable r2 = r1.variable
            float r1 = r1.constantValue
            r2.computedValue = r1
            int r0 = r0 + 1
            goto L1
        L12:
            return
    }

    public static androidx.constraintlayout.core.ArrayRow createRowDimensionPercent(androidx.constraintlayout.core.LinearSystem r0, androidx.constraintlayout.core.SolverVariable r1, androidx.constraintlayout.core.SolverVariable r2, float r3) {
            androidx.constraintlayout.core.ArrayRow r0 = r0.createRow()
            androidx.constraintlayout.core.ArrayRow r0 = r0.createRowDimensionPercent(r1, r2, r3)
            return r0
    }

    private androidx.constraintlayout.core.SolverVariable createVariable(java.lang.String r6, androidx.constraintlayout.core.SolverVariable.Type r7) {
            r5 = this;
            androidx.constraintlayout.core.Metrics r0 = androidx.constraintlayout.core.LinearSystem.sMetrics
            if (r0 == 0) goto Lb
            long r1 = r0.variables
            r3 = 1
            long r1 = r1 + r3
            r0.variables = r1
        Lb:
            int r0 = r5.mNumColumns
            int r0 = r0 + 1
            int r1 = r5.mMaxColumns
            if (r0 < r1) goto L16
            r5.increaseTableSize()
        L16:
            r0 = 0
            androidx.constraintlayout.core.SolverVariable r7 = r5.acquireSolverVariable(r7, r0)
            r7.setName(r6)
            int r0 = r5.mVariablesID
            int r0 = r0 + 1
            r5.mVariablesID = r0
            int r1 = r5.mNumColumns
            int r1 = r1 + 1
            r5.mNumColumns = r1
            r7.f13id = r0
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.SolverVariable> r0 = r5.mVariables
            if (r0 != 0) goto L37
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r5.mVariables = r0
        L37:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.SolverVariable> r0 = r5.mVariables
            r0.put(r6, r7)
            androidx.constraintlayout.core.Cache r6 = r5.mCache
            androidx.constraintlayout.core.SolverVariable[] r6 = r6.mIndexedVariables
            int r0 = r5.mVariablesID
            r6[r0] = r7
            return r7
    }

    private void displayRows() {
            r4 = this;
            r4.displaySolverVariables()
            java.lang.String r0 = ""
            r1 = 0
        L6:
            int r2 = r4.mNumRows
            java.lang.String r3 = "\n"
            if (r1 >= r2) goto L35
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r0 = r2.append(r0)
            androidx.constraintlayout.core.ArrayRow[] r2 = r4.mRows
            r2 = r2[r1]
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            int r1 = r1 + 1
            goto L6
        L35:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            androidx.constraintlayout.core.LinearSystem$Row r1 = r4.mGoal
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
            return
    }

    private void displaySolverVariables() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Display Rows ("
            r0.<init>(r1)
            int r1 = r2.mNumRows
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "x"
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r2.mNumColumns
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ")\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
            return
    }

    private int enforceBFS(androidx.constraintlayout.core.LinearSystem.Row r20) throws java.lang.Exception {
            r19 = this;
            r0 = r19
            r2 = 0
        L3:
            int r3 = r0.mNumRows
            r4 = 0
            if (r2 >= r3) goto L24
            androidx.constraintlayout.core.ArrayRow[] r3 = r0.mRows
            r3 = r3[r2]
            androidx.constraintlayout.core.SolverVariable r3 = r3.variable
            androidx.constraintlayout.core.SolverVariable$Type r3 = r3.mType
            androidx.constraintlayout.core.SolverVariable$Type r6 = androidx.constraintlayout.core.SolverVariable.Type.UNRESTRICTED
            if (r3 != r6) goto L15
            goto L21
        L15:
            androidx.constraintlayout.core.ArrayRow[] r3 = r0.mRows
            r3 = r3[r2]
            float r3 = r3.constantValue
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L21
            r2 = 1
            goto L25
        L21:
            int r2 = r2 + 1
            goto L3
        L24:
            r2 = 0
        L25:
            if (r2 == 0) goto L10d
            r2 = 0
            r3 = 0
        L29:
            if (r2 != 0) goto L10b
            androidx.constraintlayout.core.Metrics r6 = androidx.constraintlayout.core.LinearSystem.sMetrics
            r7 = 1
            if (r6 == 0) goto L36
            long r9 = r6.bfs
            long r9 = r9 + r7
            r6.bfs = r9
        L36:
            int r3 = r3 + 1
            r9 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r10 = 0
            r11 = -1
            r12 = -1
            r13 = 0
        L3f:
            int r14 = r0.mNumRows
            if (r10 >= r14) goto Ld8
            androidx.constraintlayout.core.ArrayRow[] r14 = r0.mRows
            r14 = r14[r10]
            androidx.constraintlayout.core.SolverVariable r15 = r14.variable
            androidx.constraintlayout.core.SolverVariable$Type r15 = r15.mType
            androidx.constraintlayout.core.SolverVariable$Type r1 = androidx.constraintlayout.core.SolverVariable.Type.UNRESTRICTED
            if (r15 != r1) goto L51
            goto Ld2
        L51:
            boolean r1 = r14.isSimpleDefinition
            if (r1 == 0) goto L57
            goto Ld2
        L57:
            float r1 = r14.constantValue
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 >= 0) goto Ld2
            boolean r1 = androidx.constraintlayout.core.LinearSystem.SKIP_COLUMNS
            r15 = 9
            if (r1 == 0) goto L9e
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r1 = r14.variables
            int r1 = r1.getCurrentSize()
            r5 = 0
        L6a:
            if (r5 >= r1) goto Ld2
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r7 = r14.variables
            androidx.constraintlayout.core.SolverVariable r7 = r7.getVariable(r5)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r8 = r14.variables
            float r8 = r8.get(r7)
            int r16 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r16 > 0) goto L7d
            goto L97
        L7d:
            r6 = 0
        L7e:
            if (r6 >= r15) goto L97
            float[] r15 = r7.strengthVector
            r15 = r15[r6]
            float r15 = r15 / r8
            int r18 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r18 >= 0) goto L8b
            if (r6 == r13) goto L8d
        L8b:
            if (r6 <= r13) goto L92
        L8d:
            int r12 = r7.f13id
            r13 = r6
            r11 = r10
            r9 = r15
        L92:
            int r6 = r6 + 1
            r15 = 9
            goto L7e
        L97:
            int r5 = r5 + 1
            r7 = 1
            r15 = 9
            goto L6a
        L9e:
            r1 = 1
        L9f:
            int r5 = r0.mNumColumns
            if (r1 >= r5) goto Ld2
            androidx.constraintlayout.core.Cache r5 = r0.mCache
            androidx.constraintlayout.core.SolverVariable[] r5 = r5.mIndexedVariables
            r5 = r5[r1]
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r6 = r14.variables
            float r6 = r6.get(r5)
            int r7 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r7 > 0) goto Lb6
            r8 = 9
            goto Lcf
        Lb6:
            r7 = 0
            r8 = 9
        Lb9:
            if (r7 >= r8) goto Lcf
            float[] r15 = r5.strengthVector
            r15 = r15[r7]
            float r15 = r15 / r6
            int r17 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r17 >= 0) goto Lc6
            if (r7 == r13) goto Lc8
        Lc6:
            if (r7 <= r13) goto Lcc
        Lc8:
            r12 = r1
            r13 = r7
            r11 = r10
            r9 = r15
        Lcc:
            int r7 = r7 + 1
            goto Lb9
        Lcf:
            int r1 = r1 + 1
            goto L9f
        Ld2:
            int r10 = r10 + 1
            r7 = 1
            goto L3f
        Ld8:
            r1 = -1
            if (r11 == r1) goto L101
            androidx.constraintlayout.core.ArrayRow[] r5 = r0.mRows
            r5 = r5[r11]
            androidx.constraintlayout.core.SolverVariable r6 = r5.variable
            r6.definitionId = r1
            androidx.constraintlayout.core.Metrics r1 = androidx.constraintlayout.core.LinearSystem.sMetrics
            if (r1 == 0) goto Lee
            long r6 = r1.pivots
            r8 = 1
            long r6 = r6 + r8
            r1.pivots = r6
        Lee:
            androidx.constraintlayout.core.Cache r1 = r0.mCache
            androidx.constraintlayout.core.SolverVariable[] r1 = r1.mIndexedVariables
            r1 = r1[r12]
            r5.pivot(r1)
            androidx.constraintlayout.core.SolverVariable r1 = r5.variable
            r1.definitionId = r11
            androidx.constraintlayout.core.SolverVariable r1 = r5.variable
            r1.updateReferencesWithNewDefinition(r0, r5)
            goto L102
        L101:
            r2 = 1
        L102:
            int r1 = r0.mNumColumns
            int r1 = r1 / 2
            if (r3 <= r1) goto L29
            r2 = 1
            goto L29
        L10b:
            r1 = r3
            goto L10e
        L10d:
            r1 = 0
        L10e:
            return r1
    }

    private java.lang.String getDisplaySize(int r4) {
            r3 = this;
            int r4 = r4 * 4
            int r0 = r4 / 1024
            int r1 = r0 / 1024
            java.lang.String r2 = ""
            if (r1 <= 0) goto L1e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r2)
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r0 = " Mb"
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r4 = r4.toString()
            return r4
        L1e:
            if (r0 <= 0) goto L34
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r2)
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r0 = " Kb"
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r4 = r4.toString()
            return r4
        L34:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r0 = " bytes"
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r4 = r4.toString()
            return r4
    }

    private java.lang.String getDisplayStrength(int r2) {
            r1 = this;
            r0 = 1
            if (r2 != r0) goto L6
            java.lang.String r2 = "LOW"
            return r2
        L6:
            r0 = 2
            if (r2 != r0) goto Lc
            java.lang.String r2 = "MEDIUM"
            return r2
        Lc:
            r0 = 3
            if (r2 != r0) goto L12
            java.lang.String r2 = "HIGH"
            return r2
        L12:
            r0 = 4
            if (r2 != r0) goto L18
            java.lang.String r2 = "HIGHEST"
            return r2
        L18:
            r0 = 5
            if (r2 != r0) goto L1e
            java.lang.String r2 = "EQUALITY"
            return r2
        L1e:
            r0 = 8
            if (r2 != r0) goto L25
            java.lang.String r2 = "FIXED"
            return r2
        L25:
            r0 = 6
            if (r2 != r0) goto L2b
            java.lang.String r2 = "BARRIER"
            return r2
        L2b:
            java.lang.String r2 = "NONE"
            return r2
    }

    public static androidx.constraintlayout.core.Metrics getMetrics() {
            androidx.constraintlayout.core.Metrics r0 = androidx.constraintlayout.core.LinearSystem.sMetrics
            return r0
    }

    private void increaseTableSize() {
            r5 = this;
            int r0 = r5.TABLE_SIZE
            int r0 = r0 * 2
            r5.TABLE_SIZE = r0
            androidx.constraintlayout.core.ArrayRow[] r1 = r5.mRows
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            androidx.constraintlayout.core.ArrayRow[] r0 = (androidx.constraintlayout.core.ArrayRow[]) r0
            r5.mRows = r0
            androidx.constraintlayout.core.Cache r0 = r5.mCache
            androidx.constraintlayout.core.SolverVariable[] r1 = r0.mIndexedVariables
            int r2 = r5.TABLE_SIZE
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            androidx.constraintlayout.core.SolverVariable[] r1 = (androidx.constraintlayout.core.SolverVariable[]) r1
            r0.mIndexedVariables = r1
            int r0 = r5.TABLE_SIZE
            boolean[] r1 = new boolean[r0]
            r5.mAlreadyTestedCandidates = r1
            r5.mMaxColumns = r0
            r5.mMaxRows = r0
            androidx.constraintlayout.core.Metrics r0 = androidx.constraintlayout.core.LinearSystem.sMetrics
            if (r0 == 0) goto L46
            long r1 = r0.tableSizeIncrease
            r3 = 1
            long r1 = r1 + r3
            r0.tableSizeIncrease = r1
            androidx.constraintlayout.core.Metrics r0 = androidx.constraintlayout.core.LinearSystem.sMetrics
            long r1 = r0.maxTableSize
            int r3 = r5.TABLE_SIZE
            long r3 = (long) r3
            long r1 = java.lang.Math.max(r1, r3)
            r0.maxTableSize = r1
            androidx.constraintlayout.core.Metrics r0 = androidx.constraintlayout.core.LinearSystem.sMetrics
            long r1 = r0.maxTableSize
            r0.lastTableSize = r1
        L46:
            return
    }

    private final int optimize(androidx.constraintlayout.core.LinearSystem.Row r13, boolean r14) {
            r12 = this;
            androidx.constraintlayout.core.Metrics r14 = androidx.constraintlayout.core.LinearSystem.sMetrics
            r0 = 1
            if (r14 == 0) goto Lb
            long r2 = r14.optimize
            long r2 = r2 + r0
            r14.optimize = r2
        Lb:
            r14 = 0
            r2 = r14
        Ld:
            int r3 = r12.mNumColumns
            if (r2 >= r3) goto L18
            boolean[] r3 = r12.mAlreadyTestedCandidates
            r3[r2] = r14
            int r2 = r2 + 1
            goto Ld
        L18:
            r2 = r14
            r3 = r2
        L1a:
            if (r2 != 0) goto Lb6
            androidx.constraintlayout.core.Metrics r4 = androidx.constraintlayout.core.LinearSystem.sMetrics
            if (r4 == 0) goto L25
            long r5 = r4.iterations
            long r5 = r5 + r0
            r4.iterations = r5
        L25:
            int r3 = r3 + 1
            int r4 = r12.mNumColumns
            int r4 = r4 * 2
            if (r3 < r4) goto L2e
            return r3
        L2e:
            androidx.constraintlayout.core.SolverVariable r4 = r13.getKey()
            r5 = 1
            if (r4 == 0) goto L3f
            boolean[] r4 = r12.mAlreadyTestedCandidates
            androidx.constraintlayout.core.SolverVariable r6 = r13.getKey()
            int r6 = r6.f13id
            r4[r6] = r5
        L3f:
            boolean[] r4 = r12.mAlreadyTestedCandidates
            androidx.constraintlayout.core.SolverVariable r4 = r13.getPivotCandidate(r12, r4)
            if (r4 == 0) goto L56
            boolean[] r6 = r12.mAlreadyTestedCandidates
            int r7 = r4.f13id
            boolean r6 = r6[r7]
            if (r6 == 0) goto L50
            return r3
        L50:
            boolean[] r6 = r12.mAlreadyTestedCandidates
            int r7 = r4.f13id
            r6[r7] = r5
        L56:
            if (r4 == 0) goto Lb3
            r5 = -1
            r6 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r7 = r14
            r8 = r5
        L5e:
            int r9 = r12.mNumRows
            if (r7 >= r9) goto L92
            androidx.constraintlayout.core.ArrayRow[] r9 = r12.mRows
            r9 = r9[r7]
            androidx.constraintlayout.core.SolverVariable r10 = r9.variable
            androidx.constraintlayout.core.SolverVariable$Type r10 = r10.mType
            androidx.constraintlayout.core.SolverVariable$Type r11 = androidx.constraintlayout.core.SolverVariable.Type.UNRESTRICTED
            if (r10 != r11) goto L6f
            goto L8f
        L6f:
            boolean r10 = r9.isSimpleDefinition
            if (r10 == 0) goto L74
            goto L8f
        L74:
            boolean r10 = r9.hasVariable(r4)
            if (r10 == 0) goto L8f
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r10 = r9.variables
            float r10 = r10.get(r4)
            r11 = 0
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 >= 0) goto L8f
            float r9 = r9.constantValue
            float r9 = -r9
            float r9 = r9 / r10
            int r10 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r10 >= 0) goto L8f
            r8 = r7
            r6 = r9
        L8f:
            int r7 = r7 + 1
            goto L5e
        L92:
            if (r8 <= r5) goto L1a
            androidx.constraintlayout.core.ArrayRow[] r6 = r12.mRows
            r6 = r6[r8]
            androidx.constraintlayout.core.SolverVariable r7 = r6.variable
            r7.definitionId = r5
            androidx.constraintlayout.core.Metrics r5 = androidx.constraintlayout.core.LinearSystem.sMetrics
            if (r5 == 0) goto La5
            long r9 = r5.pivots
            long r9 = r9 + r0
            r5.pivots = r9
        La5:
            r6.pivot(r4)
            androidx.constraintlayout.core.SolverVariable r4 = r6.variable
            r4.definitionId = r8
            androidx.constraintlayout.core.SolverVariable r4 = r6.variable
            r4.updateReferencesWithNewDefinition(r12, r6)
            goto L1a
        Lb3:
            r2 = r5
            goto L1a
        Lb6:
            return r3
    }

    private void releaseRows() {
            r4 = this;
            boolean r0 = androidx.constraintlayout.core.LinearSystem.OPTIMIZED_ENGINE
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L1e
        L6:
            int r0 = r4.mNumRows
            if (r2 >= r0) goto L36
            androidx.constraintlayout.core.ArrayRow[] r0 = r4.mRows
            r0 = r0[r2]
            if (r0 == 0) goto L17
            androidx.constraintlayout.core.Cache r3 = r4.mCache
            androidx.constraintlayout.core.Pools$Pool<androidx.constraintlayout.core.ArrayRow> r3 = r3.optimizedArrayRowPool
            r3.release(r0)
        L17:
            androidx.constraintlayout.core.ArrayRow[] r0 = r4.mRows
            r0[r2] = r1
            int r2 = r2 + 1
            goto L6
        L1e:
            int r0 = r4.mNumRows
            if (r2 >= r0) goto L36
            androidx.constraintlayout.core.ArrayRow[] r0 = r4.mRows
            r0 = r0[r2]
            if (r0 == 0) goto L2f
            androidx.constraintlayout.core.Cache r3 = r4.mCache
            androidx.constraintlayout.core.Pools$Pool<androidx.constraintlayout.core.ArrayRow> r3 = r3.arrayRowPool
            r3.release(r0)
        L2f:
            androidx.constraintlayout.core.ArrayRow[] r0 = r4.mRows
            r0[r2] = r1
            int r2 = r2 + 1
            goto L1e
        L36:
            return
    }

    public void addCenterPoint(androidx.constraintlayout.core.widgets.ConstraintWidget r19, androidx.constraintlayout.core.widgets.ConstraintWidget r20, float r21, int r22) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r1.getAnchor(r3)
            androidx.constraintlayout.core.SolverVariable r5 = r0.createObjectVariable(r3)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r1.getAnchor(r3)
            androidx.constraintlayout.core.SolverVariable r7 = r0.createObjectVariable(r3)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r1.getAnchor(r3)
            androidx.constraintlayout.core.SolverVariable r3 = r0.createObjectVariable(r3)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.getAnchor(r4)
            androidx.constraintlayout.core.SolverVariable r8 = r0.createObjectVariable(r1)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r2.getAnchor(r1)
            androidx.constraintlayout.core.SolverVariable r1 = r0.createObjectVariable(r1)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r2.getAnchor(r4)
            androidx.constraintlayout.core.SolverVariable r9 = r0.createObjectVariable(r4)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r2.getAnchor(r4)
            androidx.constraintlayout.core.SolverVariable r12 = r0.createObjectVariable(r4)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.getAnchor(r4)
            androidx.constraintlayout.core.SolverVariable r10 = r0.createObjectVariable(r2)
            androidx.constraintlayout.core.ArrayRow r2 = r18.createRow()
            r4 = r21
            double r13 = (double) r4
            double r15 = java.lang.Math.sin(r13)
            r4 = r22
            r17 = r3
            double r3 = (double) r4
            r19 = r12
            double r11 = r15 * r3
            float r11 = (float) r11
            r6 = r2
            r6.createRowWithAngle(r7, r8, r9, r10, r11)
            r0.addConstraint(r2)
            androidx.constraintlayout.core.ArrayRow r2 = r18.createRow()
            double r6 = java.lang.Math.cos(r13)
            double r6 = r6 * r3
            float r9 = (float) r6
            r4 = r2
            r6 = r17
            r7 = r1
            r8 = r19
            r4.createRowWithAngle(r5, r6, r7, r8, r9)
            r0.addConstraint(r2)
            return
    }

    public void addCentering(androidx.constraintlayout.core.SolverVariable r12, androidx.constraintlayout.core.SolverVariable r13, int r14, float r15, androidx.constraintlayout.core.SolverVariable r16, androidx.constraintlayout.core.SolverVariable r17, int r18, int r19) {
            r11 = this;
            r0 = r11
            r1 = r19
            androidx.constraintlayout.core.ArrayRow r10 = r11.createRow()
            r2 = r10
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            r2.createRowCentering(r3, r4, r5, r6, r7, r8, r9)
            r2 = 8
            if (r1 == r2) goto L1c
            r10.addError(r11, r1)
        L1c:
            r11.addConstraint(r10)
            return
    }

    public void addConstraint(androidx.constraintlayout.core.ArrayRow r8) {
            r7 = this;
            if (r8 != 0) goto L3
            return
        L3:
            androidx.constraintlayout.core.Metrics r0 = androidx.constraintlayout.core.LinearSystem.sMetrics
            r1 = 1
            if (r0 == 0) goto L19
            long r3 = r0.constraints
            long r3 = r3 + r1
            r0.constraints = r3
            boolean r0 = r8.isSimpleDefinition
            if (r0 == 0) goto L19
            androidx.constraintlayout.core.Metrics r0 = androidx.constraintlayout.core.LinearSystem.sMetrics
            long r3 = r0.simpleconstraints
            long r3 = r3 + r1
            r0.simpleconstraints = r3
        L19:
            int r0 = r7.mNumRows
            r3 = 1
            int r0 = r0 + r3
            int r4 = r7.mMaxRows
            if (r0 >= r4) goto L28
            int r0 = r7.mNumColumns
            int r0 = r0 + r3
            int r4 = r7.mMaxColumns
            if (r0 < r4) goto L2b
        L28:
            r7.increaseTableSize()
        L2b:
            boolean r0 = r8.isSimpleDefinition
            r4 = 0
            if (r0 != 0) goto La3
            r8.updateFromSystem(r7)
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L3a
            return
        L3a:
            r8.ensurePositiveConstant()
            boolean r0 = r8.chooseSubject(r7)
            if (r0 == 0) goto L9a
            androidx.constraintlayout.core.SolverVariable r0 = r7.createExtraVariable()
            r8.variable = r0
            int r5 = r7.mNumRows
            r7.addRow(r8)
            int r6 = r7.mNumRows
            int r5 = r5 + r3
            if (r6 != r5) goto L9a
            androidx.constraintlayout.core.LinearSystem$Row r4 = r7.mTempGoal
            r4.initFromRow(r8)
            androidx.constraintlayout.core.LinearSystem$Row r4 = r7.mTempGoal
            r7.optimize(r4, r3)
            int r4 = r0.definitionId
            r5 = -1
            if (r4 != r5) goto L9b
            androidx.constraintlayout.core.SolverVariable r4 = r8.variable
            if (r4 != r0) goto L78
            androidx.constraintlayout.core.SolverVariable r0 = r8.pickPivot(r0)
            if (r0 == 0) goto L78
            androidx.constraintlayout.core.Metrics r4 = androidx.constraintlayout.core.LinearSystem.sMetrics
            if (r4 == 0) goto L75
            long r5 = r4.pivots
            long r5 = r5 + r1
            r4.pivots = r5
        L75:
            r8.pivot(r0)
        L78:
            boolean r0 = r8.isSimpleDefinition
            if (r0 != 0) goto L81
            androidx.constraintlayout.core.SolverVariable r0 = r8.variable
            r0.updateReferencesWithNewDefinition(r7, r8)
        L81:
            boolean r0 = androidx.constraintlayout.core.LinearSystem.OPTIMIZED_ENGINE
            if (r0 == 0) goto L8d
            androidx.constraintlayout.core.Cache r0 = r7.mCache
            androidx.constraintlayout.core.Pools$Pool<androidx.constraintlayout.core.ArrayRow> r0 = r0.optimizedArrayRowPool
            r0.release(r8)
            goto L94
        L8d:
            androidx.constraintlayout.core.Cache r0 = r7.mCache
            androidx.constraintlayout.core.Pools$Pool<androidx.constraintlayout.core.ArrayRow> r0 = r0.arrayRowPool
            r0.release(r8)
        L94:
            int r0 = r7.mNumRows
            int r0 = r0 - r3
            r7.mNumRows = r0
            goto L9b
        L9a:
            r3 = r4
        L9b:
            boolean r0 = r8.hasKeyVariable()
            if (r0 != 0) goto La2
            return
        La2:
            r4 = r3
        La3:
            if (r4 != 0) goto La8
            r7.addRow(r8)
        La8:
            return
    }

    public androidx.constraintlayout.core.ArrayRow addEquality(androidx.constraintlayout.core.SolverVariable r4, androidx.constraintlayout.core.SolverVariable r5, int r6, int r7) {
            r3 = this;
            boolean r0 = androidx.constraintlayout.core.LinearSystem.USE_BASIC_SYNONYMS
            r1 = 8
            if (r0 == 0) goto L1a
            if (r7 != r1) goto L1a
            boolean r0 = r5.isFinalValue
            if (r0 == 0) goto L1a
            int r0 = r4.definitionId
            r2 = -1
            if (r0 != r2) goto L1a
            float r5 = r5.computedValue
            float r6 = (float) r6
            float r5 = r5 + r6
            r4.setFinalValue(r3, r5)
            r4 = 0
            return r4
        L1a:
            androidx.constraintlayout.core.ArrayRow r0 = r3.createRow()
            r0.createRowEquals(r4, r5, r6)
            if (r7 == r1) goto L26
            r0.addError(r3, r7)
        L26:
            r3.addConstraint(r0)
            return r0
    }

    public void addEquality(androidx.constraintlayout.core.SolverVariable r6, int r7) {
            r5 = this;
            boolean r0 = androidx.constraintlayout.core.LinearSystem.USE_BASIC_SYNONYMS
            r1 = -1
            r2 = 1
            if (r0 == 0) goto L30
            int r0 = r6.definitionId
            if (r0 != r1) goto L30
            float r7 = (float) r7
            r6.setFinalValue(r5, r7)
            r0 = 0
        Lf:
            int r1 = r5.mVariablesID
            int r1 = r1 + r2
            if (r0 >= r1) goto L2f
            androidx.constraintlayout.core.Cache r1 = r5.mCache
            androidx.constraintlayout.core.SolverVariable[] r1 = r1.mIndexedVariables
            r1 = r1[r0]
            if (r1 == 0) goto L2c
            boolean r3 = r1.isSynonym
            if (r3 == 0) goto L2c
            int r3 = r1.synonym
            int r4 = r6.f13id
            if (r3 != r4) goto L2c
            float r3 = r1.synonymDelta
            float r3 = r3 + r7
            r1.setFinalValue(r5, r3)
        L2c:
            int r0 = r0 + 1
            goto Lf
        L2f:
            return
        L30:
            int r0 = r6.definitionId
            int r3 = r6.definitionId
            if (r3 == r1) goto L5b
            androidx.constraintlayout.core.ArrayRow[] r1 = r5.mRows
            r0 = r1[r0]
            boolean r1 = r0.isSimpleDefinition
            if (r1 == 0) goto L42
            float r6 = (float) r7
            r0.constantValue = r6
            goto L65
        L42:
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r1 = r0.variables
            int r1 = r1.getCurrentSize()
            if (r1 != 0) goto L50
            r0.isSimpleDefinition = r2
            float r6 = (float) r7
            r0.constantValue = r6
            goto L65
        L50:
            androidx.constraintlayout.core.ArrayRow r0 = r5.createRow()
            r0.createRowEquals(r6, r7)
            r5.addConstraint(r0)
            goto L65
        L5b:
            androidx.constraintlayout.core.ArrayRow r0 = r5.createRow()
            r0.createRowDefinition(r6, r7)
            r5.addConstraint(r0)
        L65:
            return
    }

    public void addGreaterBarrier(androidx.constraintlayout.core.SolverVariable r3, androidx.constraintlayout.core.SolverVariable r4, int r5, boolean r6) {
            r2 = this;
            androidx.constraintlayout.core.ArrayRow r6 = r2.createRow()
            androidx.constraintlayout.core.SolverVariable r0 = r2.createSlackVariable()
            r1 = 0
            r0.strength = r1
            r6.createRowGreaterThan(r3, r4, r0, r5)
            r2.addConstraint(r6)
            return
    }

    public void addGreaterThan(androidx.constraintlayout.core.SolverVariable r4, androidx.constraintlayout.core.SolverVariable r5, int r6, int r7) {
            r3 = this;
            androidx.constraintlayout.core.ArrayRow r0 = r3.createRow()
            androidx.constraintlayout.core.SolverVariable r1 = r3.createSlackVariable()
            r2 = 0
            r1.strength = r2
            r0.createRowGreaterThan(r4, r5, r1, r6)
            r4 = 8
            if (r7 == r4) goto L1f
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r4 = r0.variables
            float r4 = r4.get(r1)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r4 = r4 * r5
            int r4 = (int) r4
            r3.addSingleError(r0, r4, r7)
        L1f:
            r3.addConstraint(r0)
            return
    }

    public void addLowerBarrier(androidx.constraintlayout.core.SolverVariable r3, androidx.constraintlayout.core.SolverVariable r4, int r5, boolean r6) {
            r2 = this;
            androidx.constraintlayout.core.ArrayRow r6 = r2.createRow()
            androidx.constraintlayout.core.SolverVariable r0 = r2.createSlackVariable()
            r1 = 0
            r0.strength = r1
            r6.createRowLowerThan(r3, r4, r0, r5)
            r2.addConstraint(r6)
            return
    }

    public void addLowerThan(androidx.constraintlayout.core.SolverVariable r4, androidx.constraintlayout.core.SolverVariable r5, int r6, int r7) {
            r3 = this;
            androidx.constraintlayout.core.ArrayRow r0 = r3.createRow()
            androidx.constraintlayout.core.SolverVariable r1 = r3.createSlackVariable()
            r2 = 0
            r1.strength = r2
            r0.createRowLowerThan(r4, r5, r1, r6)
            r4 = 8
            if (r7 == r4) goto L1f
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r4 = r0.variables
            float r4 = r4.get(r1)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r4 = r4 * r5
            int r4 = (int) r4
            r3.addSingleError(r0, r4, r7)
        L1f:
            r3.addConstraint(r0)
            return
    }

    public void addRatio(androidx.constraintlayout.core.SolverVariable r8, androidx.constraintlayout.core.SolverVariable r9, androidx.constraintlayout.core.SolverVariable r10, androidx.constraintlayout.core.SolverVariable r11, float r12, int r13) {
            r7 = this;
            androidx.constraintlayout.core.ArrayRow r6 = r7.createRow()
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.createRowDimensionRatio(r1, r2, r3, r4, r5)
            r8 = 8
            if (r13 == r8) goto L14
            r6.addError(r7, r13)
        L14:
            r7.addConstraint(r6)
            return
    }

    void addSingleError(androidx.constraintlayout.core.ArrayRow r2, int r3, int r4) {
            r1 = this;
            r0 = 0
            androidx.constraintlayout.core.SolverVariable r4 = r1.createErrorVariable(r4, r0)
            r2.addSingleError(r4, r3)
            return
    }

    public void addSynonym(androidx.constraintlayout.core.SolverVariable r3, androidx.constraintlayout.core.SolverVariable r4, int r5) {
            r2 = this;
            int r0 = r3.definitionId
            r1 = -1
            if (r0 != r1) goto L29
            if (r5 != 0) goto L29
            boolean r5 = r4.isSynonym
            if (r5 == 0) goto L15
            float r5 = r4.synonymDelta
            androidx.constraintlayout.core.Cache r5 = r2.mCache
            androidx.constraintlayout.core.SolverVariable[] r5 = r5.mIndexedVariables
            int r4 = r4.synonym
            r4 = r5[r4]
        L15:
            boolean r5 = r3.isSynonym
            if (r5 == 0) goto L24
            float r4 = r3.synonymDelta
            androidx.constraintlayout.core.Cache r4 = r2.mCache
            androidx.constraintlayout.core.SolverVariable[] r4 = r4.mIndexedVariables
            int r3 = r3.synonym
            r3 = r4[r3]
            goto L2e
        L24:
            r5 = 0
            r3.setSynonym(r2, r4, r5)
            goto L2e
        L29:
            r0 = 8
            r2.addEquality(r3, r4, r5, r0)
        L2e:
            return
    }

    final void cleanupRows() {
            r7 = this;
            r0 = 0
        L1:
            int r1 = r7.mNumRows
            if (r0 >= r1) goto L56
            androidx.constraintlayout.core.ArrayRow[] r1 = r7.mRows
            r1 = r1[r0]
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r2 = r1.variables
            int r2 = r2.getCurrentSize()
            r3 = 1
            if (r2 != 0) goto L14
            r1.isSimpleDefinition = r3
        L14:
            boolean r2 = r1.isSimpleDefinition
            if (r2 == 0) goto L54
            androidx.constraintlayout.core.SolverVariable r2 = r1.variable
            float r4 = r1.constantValue
            r2.computedValue = r4
            androidx.constraintlayout.core.SolverVariable r2 = r1.variable
            r2.removeFromRow(r1)
            r2 = r0
        L24:
            int r4 = r7.mNumRows
            int r5 = r4 + (-1)
            if (r2 >= r5) goto L34
            androidx.constraintlayout.core.ArrayRow[] r4 = r7.mRows
            int r5 = r2 + 1
            r6 = r4[r5]
            r4[r2] = r6
            r2 = r5
            goto L24
        L34:
            androidx.constraintlayout.core.ArrayRow[] r2 = r7.mRows
            int r5 = r4 + (-1)
            r6 = 0
            r2[r5] = r6
            int r4 = r4 + (-1)
            r7.mNumRows = r4
            int r0 = r0 + (-1)
            boolean r2 = androidx.constraintlayout.core.LinearSystem.OPTIMIZED_ENGINE
            if (r2 == 0) goto L4d
            androidx.constraintlayout.core.Cache r2 = r7.mCache
            androidx.constraintlayout.core.Pools$Pool<androidx.constraintlayout.core.ArrayRow> r2 = r2.optimizedArrayRowPool
            r2.release(r1)
            goto L54
        L4d:
            androidx.constraintlayout.core.Cache r2 = r7.mCache
            androidx.constraintlayout.core.Pools$Pool<androidx.constraintlayout.core.ArrayRow> r2 = r2.arrayRowPool
            r2.release(r1)
        L54:
            int r0 = r0 + r3
            goto L1
        L56:
            return
    }

    public androidx.constraintlayout.core.SolverVariable createErrorVariable(int r6, java.lang.String r7) {
            r5 = this;
            androidx.constraintlayout.core.Metrics r0 = androidx.constraintlayout.core.LinearSystem.sMetrics
            if (r0 == 0) goto Lb
            long r1 = r0.errors
            r3 = 1
            long r1 = r1 + r3
            r0.errors = r1
        Lb:
            int r0 = r5.mNumColumns
            int r0 = r0 + 1
            int r1 = r5.mMaxColumns
            if (r0 < r1) goto L16
            r5.increaseTableSize()
        L16:
            androidx.constraintlayout.core.SolverVariable$Type r0 = androidx.constraintlayout.core.SolverVariable.Type.ERROR
            androidx.constraintlayout.core.SolverVariable r7 = r5.acquireSolverVariable(r0, r7)
            int r0 = r5.mVariablesID
            int r0 = r0 + 1
            r5.mVariablesID = r0
            int r1 = r5.mNumColumns
            int r1 = r1 + 1
            r5.mNumColumns = r1
            r7.f13id = r0
            r7.strength = r6
            androidx.constraintlayout.core.Cache r6 = r5.mCache
            androidx.constraintlayout.core.SolverVariable[] r6 = r6.mIndexedVariables
            int r0 = r5.mVariablesID
            r6[r0] = r7
            androidx.constraintlayout.core.LinearSystem$Row r6 = r5.mGoal
            r6.addError(r7)
            return r7
    }

    public androidx.constraintlayout.core.SolverVariable createExtraVariable() {
            r5 = this;
            androidx.constraintlayout.core.Metrics r0 = androidx.constraintlayout.core.LinearSystem.sMetrics
            if (r0 == 0) goto Lb
            long r1 = r0.extravariables
            r3 = 1
            long r1 = r1 + r3
            r0.extravariables = r1
        Lb:
            int r0 = r5.mNumColumns
            int r0 = r0 + 1
            int r1 = r5.mMaxColumns
            if (r0 < r1) goto L16
            r5.increaseTableSize()
        L16:
            androidx.constraintlayout.core.SolverVariable$Type r0 = androidx.constraintlayout.core.SolverVariable.Type.SLACK
            r1 = 0
            androidx.constraintlayout.core.SolverVariable r0 = r5.acquireSolverVariable(r0, r1)
            int r1 = r5.mVariablesID
            int r1 = r1 + 1
            r5.mVariablesID = r1
            int r2 = r5.mNumColumns
            int r2 = r2 + 1
            r5.mNumColumns = r2
            r0.f13id = r1
            androidx.constraintlayout.core.Cache r1 = r5.mCache
            androidx.constraintlayout.core.SolverVariable[] r1 = r1.mIndexedVariables
            int r2 = r5.mVariablesID
            r1[r2] = r0
            return r0
    }

    public androidx.constraintlayout.core.SolverVariable createObjectVariable(java.lang.Object r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = r3.mNumColumns
            int r1 = r1 + 1
            int r2 = r3.mMaxColumns
            if (r1 < r2) goto Lf
            r3.increaseTableSize()
        Lf:
            boolean r1 = r4 instanceof androidx.constraintlayout.core.widgets.ConstraintAnchor
            if (r1 == 0) goto L5b
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r4
            androidx.constraintlayout.core.SolverVariable r0 = r4.getSolverVariable()
            if (r0 != 0) goto L25
            androidx.constraintlayout.core.Cache r0 = r3.mCache
            r4.resetSolverVariable(r0)
            androidx.constraintlayout.core.SolverVariable r4 = r4.getSolverVariable()
            r0 = r4
        L25:
            int r4 = r0.f13id
            r1 = -1
            if (r4 == r1) goto L3a
            int r4 = r0.f13id
            int r2 = r3.mVariablesID
            if (r4 > r2) goto L3a
            androidx.constraintlayout.core.Cache r4 = r3.mCache
            androidx.constraintlayout.core.SolverVariable[] r4 = r4.mIndexedVariables
            int r2 = r0.f13id
            r4 = r4[r2]
            if (r4 != 0) goto L5b
        L3a:
            int r4 = r0.f13id
            if (r4 == r1) goto L41
            r0.reset()
        L41:
            int r4 = r3.mVariablesID
            int r4 = r4 + 1
            r3.mVariablesID = r4
            int r1 = r3.mNumColumns
            int r1 = r1 + 1
            r3.mNumColumns = r1
            r0.f13id = r4
            androidx.constraintlayout.core.SolverVariable$Type r4 = androidx.constraintlayout.core.SolverVariable.Type.UNRESTRICTED
            r0.mType = r4
            androidx.constraintlayout.core.Cache r4 = r3.mCache
            androidx.constraintlayout.core.SolverVariable[] r4 = r4.mIndexedVariables
            int r1 = r3.mVariablesID
            r4[r1] = r0
        L5b:
            return r0
    }

    public androidx.constraintlayout.core.ArrayRow createRow() {
            r5 = this;
            boolean r0 = androidx.constraintlayout.core.LinearSystem.OPTIMIZED_ENGINE
            r1 = 1
            if (r0 == 0) goto L23
            androidx.constraintlayout.core.Cache r0 = r5.mCache
            androidx.constraintlayout.core.Pools$Pool<androidx.constraintlayout.core.ArrayRow> r0 = r0.optimizedArrayRowPool
            java.lang.Object r0 = r0.acquire()
            androidx.constraintlayout.core.ArrayRow r0 = (androidx.constraintlayout.core.ArrayRow) r0
            if (r0 != 0) goto L1f
            androidx.constraintlayout.core.LinearSystem$ValuesRow r0 = new androidx.constraintlayout.core.LinearSystem$ValuesRow
            androidx.constraintlayout.core.Cache r3 = r5.mCache
            r0.<init>(r5, r3)
            long r3 = androidx.constraintlayout.core.LinearSystem.OPTIMIZED_ARRAY_ROW_CREATION
            long r3 = r3 + r1
            androidx.constraintlayout.core.LinearSystem.OPTIMIZED_ARRAY_ROW_CREATION = r3
            goto L3f
        L1f:
            r0.reset()
            goto L3f
        L23:
            androidx.constraintlayout.core.Cache r0 = r5.mCache
            androidx.constraintlayout.core.Pools$Pool<androidx.constraintlayout.core.ArrayRow> r0 = r0.arrayRowPool
            java.lang.Object r0 = r0.acquire()
            androidx.constraintlayout.core.ArrayRow r0 = (androidx.constraintlayout.core.ArrayRow) r0
            if (r0 != 0) goto L3c
            androidx.constraintlayout.core.ArrayRow r0 = new androidx.constraintlayout.core.ArrayRow
            androidx.constraintlayout.core.Cache r3 = r5.mCache
            r0.<init>(r3)
            long r3 = androidx.constraintlayout.core.LinearSystem.ARRAY_ROW_CREATION
            long r3 = r3 + r1
            androidx.constraintlayout.core.LinearSystem.ARRAY_ROW_CREATION = r3
            goto L3f
        L3c:
            r0.reset()
        L3f:
            androidx.constraintlayout.core.SolverVariable.increaseErrorId()
            return r0
    }

    public androidx.constraintlayout.core.SolverVariable createSlackVariable() {
            r5 = this;
            androidx.constraintlayout.core.Metrics r0 = androidx.constraintlayout.core.LinearSystem.sMetrics
            if (r0 == 0) goto Lb
            long r1 = r0.slackvariables
            r3 = 1
            long r1 = r1 + r3
            r0.slackvariables = r1
        Lb:
            int r0 = r5.mNumColumns
            int r0 = r0 + 1
            int r1 = r5.mMaxColumns
            if (r0 < r1) goto L16
            r5.increaseTableSize()
        L16:
            androidx.constraintlayout.core.SolverVariable$Type r0 = androidx.constraintlayout.core.SolverVariable.Type.SLACK
            r1 = 0
            androidx.constraintlayout.core.SolverVariable r0 = r5.acquireSolverVariable(r0, r1)
            int r1 = r5.mVariablesID
            int r1 = r1 + 1
            r5.mVariablesID = r1
            int r2 = r5.mNumColumns
            int r2 = r2 + 1
            r5.mNumColumns = r2
            r0.f13id = r1
            androidx.constraintlayout.core.Cache r1 = r5.mCache
            androidx.constraintlayout.core.SolverVariable[] r1 = r1.mIndexedVariables
            int r2 = r5.mVariablesID
            r1[r2] = r0
            return r0
    }

    public void displayReadableRows() {
            r9 = this;
            r9.displaySolverVariables()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = " num vars "
            r0.<init>(r1)
            int r1 = r9.mVariablesID
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2 = 0
            r3 = r2
        L1c:
            int r4 = r9.mVariablesID
            int r4 = r4 + 1
            java.lang.String r5 = " = "
            java.lang.String r6 = "] => "
            if (r3 >= r4) goto L62
            androidx.constraintlayout.core.Cache r4 = r9.mCache
            androidx.constraintlayout.core.SolverVariable[] r4 = r4.mIndexedVariables
            r4 = r4[r3]
            if (r4 == 0) goto L5f
            boolean r7 = r4.isFinalValue
            if (r7 == 0) goto L5f
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.StringBuilder r0 = r7.append(r0)
            java.lang.String r7 = " $["
            java.lang.StringBuilder r0 = r0.append(r7)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r6)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.StringBuilder r0 = r0.append(r5)
            float r4 = r4.computedValue
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
        L5f:
            int r3 = r3 + 1
            goto L1c
        L62:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3 = r2
        L74:
            int r4 = r9.mVariablesID
            int r4 = r4 + 1
            if (r3 >= r4) goto Lc8
            androidx.constraintlayout.core.Cache r4 = r9.mCache
            androidx.constraintlayout.core.SolverVariable[] r4 = r4.mIndexedVariables
            r4 = r4[r3]
            if (r4 == 0) goto Lc5
            boolean r7 = r4.isSynonym
            if (r7 == 0) goto Lc5
            androidx.constraintlayout.core.Cache r7 = r9.mCache
            androidx.constraintlayout.core.SolverVariable[] r7 = r7.mIndexedVariables
            int r8 = r4.synonym
            r7 = r7[r8]
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.StringBuilder r0 = r8.append(r0)
            java.lang.String r8 = " ~["
            java.lang.StringBuilder r0 = r0.append(r8)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r6)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.StringBuilder r0 = r0.append(r7)
            java.lang.String r7 = " + "
            java.lang.StringBuilder r0 = r0.append(r7)
            float r4 = r4.synonymDelta
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
        Lc5:
            int r3 = r3 + 1
            goto L74
        Lc8:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = "\n\n #  "
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
        Ldb:
            int r3 = r9.mNumRows
            if (r2 >= r3) goto L10e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r0 = r3.append(r0)
            androidx.constraintlayout.core.ArrayRow[] r3 = r9.mRows
            r3 = r3[r2]
            java.lang.String r3 = r3.toReadableString()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = "\n #  "
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            int r2 = r2 + 1
            goto Ldb
        L10e:
            androidx.constraintlayout.core.LinearSystem$Row r2 = r9.mGoal
            if (r2 == 0) goto L12f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r2 = "Goal: "
            java.lang.StringBuilder r0 = r0.append(r2)
            androidx.constraintlayout.core.LinearSystem$Row r2 = r9.mGoal
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
        L12f:
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
            return
    }

    void displaySystemInformation() {
            r6 = this;
            r0 = 0
            r1 = r0
            r2 = r1
        L3:
            int r3 = r6.TABLE_SIZE
            if (r1 >= r3) goto L15
            androidx.constraintlayout.core.ArrayRow[] r3 = r6.mRows
            r3 = r3[r1]
            if (r3 == 0) goto L12
            int r3 = r3.sizeInBytes()
            int r2 = r2 + r3
        L12:
            int r1 = r1 + 1
            goto L3
        L15:
            r1 = r0
            r3 = r1
        L17:
            int r4 = r6.mNumRows
            if (r1 >= r4) goto L29
            androidx.constraintlayout.core.ArrayRow[] r4 = r6.mRows
            r4 = r4[r1]
            if (r4 == 0) goto L26
            int r4 = r4.sizeInBytes()
            int r3 = r3 + r4
        L26:
            int r1 = r1 + 1
            goto L17
        L29:
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Linear System -> Table size: "
            r4.<init>(r5)
            int r5 = r6.TABLE_SIZE
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = " ("
            java.lang.StringBuilder r4 = r4.append(r5)
            int r5 = r6.TABLE_SIZE
            int r5 = r5 * r5
            java.lang.String r5 = r6.getDisplaySize(r5)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = ") -- row sizes: "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r2 = r6.getDisplaySize(r2)
            java.lang.StringBuilder r2 = r4.append(r2)
            java.lang.String r4 = ", actual size: "
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r3 = r6.getDisplaySize(r3)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " rows: "
            java.lang.StringBuilder r2 = r2.append(r3)
            int r3 = r6.mNumRows
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "/"
            java.lang.StringBuilder r2 = r2.append(r3)
            int r4 = r6.mMaxRows
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r4 = " cols: "
            java.lang.StringBuilder r2 = r2.append(r4)
            int r4 = r6.mNumColumns
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.StringBuilder r2 = r2.append(r3)
            int r3 = r6.mMaxColumns
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " 0 occupied cells, "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r0 = r6.getDisplaySize(r0)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            r1.println(r0)
            return
    }

    public void displayVariablesReadableRows() {
            r5 = this;
            r5.displaySolverVariables()
            java.lang.String r0 = ""
            r1 = 0
        L6:
            int r2 = r5.mNumRows
            java.lang.String r3 = "\n"
            if (r1 >= r2) goto L45
            androidx.constraintlayout.core.ArrayRow[] r2 = r5.mRows
            r2 = r2[r1]
            androidx.constraintlayout.core.SolverVariable r2 = r2.variable
            androidx.constraintlayout.core.SolverVariable$Type r2 = r2.mType
            androidx.constraintlayout.core.SolverVariable$Type r4 = androidx.constraintlayout.core.SolverVariable.Type.UNRESTRICTED
            if (r2 != r4) goto L42
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r0 = r2.append(r0)
            androidx.constraintlayout.core.ArrayRow[] r2 = r5.mRows
            r2 = r2[r1]
            java.lang.String r2 = r2.toReadableString()
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
        L42:
            int r1 = r1 + 1
            goto L6
        L45:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            androidx.constraintlayout.core.LinearSystem$Row r1 = r5.mGoal
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
            return
    }

    public void fillMetrics(androidx.constraintlayout.core.Metrics r1) {
            r0 = this;
            androidx.constraintlayout.core.LinearSystem.sMetrics = r1
            return
    }

    public androidx.constraintlayout.core.Cache getCache() {
            r1 = this;
            androidx.constraintlayout.core.Cache r0 = r1.mCache
            return r0
    }

    androidx.constraintlayout.core.LinearSystem.Row getGoal() {
            r1 = this;
            androidx.constraintlayout.core.LinearSystem$Row r0 = r1.mGoal
            return r0
    }

    public int getMemoryUsed() {
            r3 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r3.mNumRows
            if (r0 >= r2) goto L14
            androidx.constraintlayout.core.ArrayRow[] r2 = r3.mRows
            r2 = r2[r0]
            if (r2 == 0) goto L11
            int r2 = r2.sizeInBytes()
            int r1 = r1 + r2
        L11:
            int r0 = r0 + 1
            goto L2
        L14:
            return r1
    }

    public int getNumEquations() {
            r1 = this;
            int r0 = r1.mNumRows
            return r0
    }

    public int getNumVariables() {
            r1 = this;
            int r0 = r1.mVariablesID
            return r0
    }

    public int getObjectVariableValue(java.lang.Object r2) {
            r1 = this;
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r2
            androidx.constraintlayout.core.SolverVariable r2 = r2.getSolverVariable()
            if (r2 == 0) goto Lf
            float r2 = r2.computedValue
            r0 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r0
            int r2 = (int) r2
            return r2
        Lf:
            r2 = 0
            return r2
    }

    androidx.constraintlayout.core.ArrayRow getRow(int r2) {
            r1 = this;
            androidx.constraintlayout.core.ArrayRow[] r0 = r1.mRows
            r2 = r0[r2]
            return r2
    }

    float getValueFor(java.lang.String r2) {
            r1 = this;
            androidx.constraintlayout.core.SolverVariable$Type r0 = androidx.constraintlayout.core.SolverVariable.Type.UNRESTRICTED
            androidx.constraintlayout.core.SolverVariable r2 = r1.getVariable(r2, r0)
            if (r2 != 0) goto La
            r2 = 0
            return r2
        La:
            float r2 = r2.computedValue
            return r2
    }

    androidx.constraintlayout.core.SolverVariable getVariable(java.lang.String r2, androidx.constraintlayout.core.SolverVariable.Type r3) {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.SolverVariable> r0 = r1.mVariables
            if (r0 != 0) goto Lb
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mVariables = r0
        Lb:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.SolverVariable> r0 = r1.mVariables
            java.lang.Object r0 = r0.get(r2)
            androidx.constraintlayout.core.SolverVariable r0 = (androidx.constraintlayout.core.SolverVariable) r0
            if (r0 != 0) goto L19
            androidx.constraintlayout.core.SolverVariable r0 = r1.createVariable(r2, r3)
        L19:
            return r0
    }

    public void minimize() throws java.lang.Exception {
            r5 = this;
            androidx.constraintlayout.core.Metrics r0 = androidx.constraintlayout.core.LinearSystem.sMetrics
            r1 = 1
            if (r0 == 0) goto Lb
            long r3 = r0.minimize
            long r3 = r3 + r1
            r0.minimize = r3
        Lb:
            androidx.constraintlayout.core.LinearSystem$Row r0 = r5.mGoal
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L17
            r5.computeValues()
            return
        L17:
            boolean r0 = r5.graphOptimizer
            if (r0 != 0) goto L26
            boolean r0 = r5.newgraphOptimizer
            if (r0 == 0) goto L20
            goto L26
        L20:
            androidx.constraintlayout.core.LinearSystem$Row r0 = r5.mGoal
            r5.minimizeGoal(r0)
            goto L56
        L26:
            androidx.constraintlayout.core.Metrics r0 = androidx.constraintlayout.core.LinearSystem.sMetrics
            if (r0 == 0) goto L2f
            long r3 = r0.graphOptimizer
            long r3 = r3 + r1
            r0.graphOptimizer = r3
        L2f:
            r0 = 0
            r3 = r0
        L31:
            int r4 = r5.mNumRows
            if (r3 >= r4) goto L41
            androidx.constraintlayout.core.ArrayRow[] r4 = r5.mRows
            r4 = r4[r3]
            boolean r4 = r4.isSimpleDefinition
            if (r4 != 0) goto L3e
            goto L42
        L3e:
            int r3 = r3 + 1
            goto L31
        L41:
            r0 = 1
        L42:
            if (r0 != 0) goto L4a
            androidx.constraintlayout.core.LinearSystem$Row r0 = r5.mGoal
            r5.minimizeGoal(r0)
            goto L56
        L4a:
            androidx.constraintlayout.core.Metrics r0 = androidx.constraintlayout.core.LinearSystem.sMetrics
            if (r0 == 0) goto L53
            long r3 = r0.fullySolved
            long r3 = r3 + r1
            r0.fullySolved = r3
        L53:
            r5.computeValues()
        L56:
            return
    }

    void minimizeGoal(androidx.constraintlayout.core.LinearSystem.Row r6) throws java.lang.Exception {
            r5 = this;
            androidx.constraintlayout.core.Metrics r0 = androidx.constraintlayout.core.LinearSystem.sMetrics
            if (r0 == 0) goto L25
            long r1 = r0.minimizeGoal
            r3 = 1
            long r1 = r1 + r3
            r0.minimizeGoal = r1
            androidx.constraintlayout.core.Metrics r0 = androidx.constraintlayout.core.LinearSystem.sMetrics
            long r1 = r0.maxVariables
            int r3 = r5.mNumColumns
            long r3 = (long) r3
            long r1 = java.lang.Math.max(r1, r3)
            r0.maxVariables = r1
            androidx.constraintlayout.core.Metrics r0 = androidx.constraintlayout.core.LinearSystem.sMetrics
            long r1 = r0.maxRows
            int r3 = r5.mNumRows
            long r3 = (long) r3
            long r1 = java.lang.Math.max(r1, r3)
            r0.maxRows = r1
        L25:
            r5.enforceBFS(r6)
            r0 = 0
            r5.optimize(r6, r0)
            r5.computeValues()
            return
    }

    public void removeRow(androidx.constraintlayout.core.ArrayRow r5) {
            r4 = this;
            boolean r0 = r5.isSimpleDefinition
            if (r0 == 0) goto L53
            androidx.constraintlayout.core.SolverVariable r0 = r5.variable
            if (r0 == 0) goto L53
            androidx.constraintlayout.core.SolverVariable r0 = r5.variable
            int r0 = r0.definitionId
            r1 = -1
            if (r0 == r1) goto L33
            androidx.constraintlayout.core.SolverVariable r0 = r5.variable
            int r0 = r0.definitionId
        L13:
            int r1 = r4.mNumRows
            int r2 = r1 + (-1)
            if (r0 >= r2) goto L2f
            androidx.constraintlayout.core.ArrayRow[] r1 = r4.mRows
            int r2 = r0 + 1
            r1 = r1[r2]
            androidx.constraintlayout.core.SolverVariable r1 = r1.variable
            int r3 = r1.definitionId
            if (r3 != r2) goto L27
            r1.definitionId = r0
        L27:
            androidx.constraintlayout.core.ArrayRow[] r1 = r4.mRows
            r3 = r1[r2]
            r1[r0] = r3
            r0 = r2
            goto L13
        L2f:
            int r1 = r1 + (-1)
            r4.mNumRows = r1
        L33:
            androidx.constraintlayout.core.SolverVariable r0 = r5.variable
            boolean r0 = r0.isFinalValue
            if (r0 != 0) goto L40
            androidx.constraintlayout.core.SolverVariable r0 = r5.variable
            float r1 = r5.constantValue
            r0.setFinalValue(r4, r1)
        L40:
            boolean r0 = androidx.constraintlayout.core.LinearSystem.OPTIMIZED_ENGINE
            if (r0 == 0) goto L4c
            androidx.constraintlayout.core.Cache r0 = r4.mCache
            androidx.constraintlayout.core.Pools$Pool<androidx.constraintlayout.core.ArrayRow> r0 = r0.optimizedArrayRowPool
            r0.release(r5)
            goto L53
        L4c:
            androidx.constraintlayout.core.Cache r0 = r4.mCache
            androidx.constraintlayout.core.Pools$Pool<androidx.constraintlayout.core.ArrayRow> r0 = r0.arrayRowPool
            r0.release(r5)
        L53:
            return
    }

    public void reset() {
            r4 = this;
            r0 = 0
            r1 = r0
        L2:
            androidx.constraintlayout.core.Cache r2 = r4.mCache
            androidx.constraintlayout.core.SolverVariable[] r2 = r2.mIndexedVariables
            int r2 = r2.length
            if (r1 >= r2) goto L17
            androidx.constraintlayout.core.Cache r2 = r4.mCache
            androidx.constraintlayout.core.SolverVariable[] r2 = r2.mIndexedVariables
            r2 = r2[r1]
            if (r2 == 0) goto L14
            r2.reset()
        L14:
            int r1 = r1 + 1
            goto L2
        L17:
            androidx.constraintlayout.core.Cache r1 = r4.mCache
            androidx.constraintlayout.core.Pools$Pool<androidx.constraintlayout.core.SolverVariable> r1 = r1.solverVariablePool
            androidx.constraintlayout.core.SolverVariable[] r2 = r4.mPoolVariables
            int r3 = r4.mPoolVariablesCount
            r1.releaseAll(r2, r3)
            r4.mPoolVariablesCount = r0
            androidx.constraintlayout.core.Cache r1 = r4.mCache
            androidx.constraintlayout.core.SolverVariable[] r1 = r1.mIndexedVariables
            r2 = 0
            java.util.Arrays.fill(r1, r2)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.SolverVariable> r1 = r4.mVariables
            if (r1 == 0) goto L33
            r1.clear()
        L33:
            r4.mVariablesID = r0
            androidx.constraintlayout.core.LinearSystem$Row r1 = r4.mGoal
            r1.clear()
            r1 = 1
            r4.mNumColumns = r1
            r1 = r0
        L3e:
            int r2 = r4.mNumRows
            if (r1 >= r2) goto L4d
            androidx.constraintlayout.core.ArrayRow[] r2 = r4.mRows
            r2 = r2[r1]
            if (r2 == 0) goto L4a
            r2.used = r0
        L4a:
            int r1 = r1 + 1
            goto L3e
        L4d:
            r4.releaseRows()
            r4.mNumRows = r0
            boolean r0 = androidx.constraintlayout.core.LinearSystem.OPTIMIZED_ENGINE
            if (r0 == 0) goto L60
            androidx.constraintlayout.core.LinearSystem$ValuesRow r0 = new androidx.constraintlayout.core.LinearSystem$ValuesRow
            androidx.constraintlayout.core.Cache r1 = r4.mCache
            r0.<init>(r4, r1)
            r4.mTempGoal = r0
            goto L69
        L60:
            androidx.constraintlayout.core.ArrayRow r0 = new androidx.constraintlayout.core.ArrayRow
            androidx.constraintlayout.core.Cache r1 = r4.mCache
            r0.<init>(r1)
            r4.mTempGoal = r0
        L69:
            return
    }
}
