package androidx.constraintlayout.core;

/* loaded from: classes.dex */
public class SolverVariableValues implements androidx.constraintlayout.core.ArrayRow.ArrayRowVariables {
    private static final boolean DEBUG = false;
    private static final boolean HASH = true;
    private static float epsilon = 0.001f;
    private int HASH_SIZE;
    private final int NONE;
    private int SIZE;
    int head;
    int[] keys;
    protected final androidx.constraintlayout.core.Cache mCache;
    int mCount;
    private final androidx.constraintlayout.core.ArrayRow mRow;
    int[] next;
    int[] nextKeys;
    int[] previous;
    float[] values;
    int[] variables;

    static {
            return
    }

    SolverVariableValues(androidx.constraintlayout.core.ArrayRow r4, androidx.constraintlayout.core.Cache r5) {
            r3 = this;
            r3.<init>()
            r0 = -1
            r3.NONE = r0
            r1 = 16
            r3.SIZE = r1
            r3.HASH_SIZE = r1
            int[] r2 = new int[r1]
            r3.keys = r2
            int[] r2 = new int[r1]
            r3.nextKeys = r2
            int[] r2 = new int[r1]
            r3.variables = r2
            float[] r2 = new float[r1]
            r3.values = r2
            int[] r2 = new int[r1]
            r3.previous = r2
            int[] r1 = new int[r1]
            r3.next = r1
            r1 = 0
            r3.mCount = r1
            r3.head = r0
            r3.mRow = r4
            r3.mCache = r5
            r3.clear()
            return
    }

    private void addToHashMap(androidx.constraintlayout.core.SolverVariable r4, int r5) {
            r3 = this;
            int r4 = r4.f13id
            int r0 = r3.HASH_SIZE
            int r4 = r4 % r0
            int[] r0 = r3.keys
            r1 = r0[r4]
            r2 = -1
            if (r1 != r2) goto Lf
            r0[r4] = r5
            goto L19
        Lf:
            int[] r4 = r3.nextKeys
            r0 = r4[r1]
            if (r0 == r2) goto L17
            r1 = r0
            goto Lf
        L17:
            r4[r1] = r5
        L19:
            int[] r4 = r3.nextKeys
            r4[r5] = r2
            return
    }

    private void addVariable(int r3, androidx.constraintlayout.core.SolverVariable r4, float r5) {
            r2 = this;
            int[] r0 = r2.variables
            int r1 = r4.f13id
            r0[r3] = r1
            float[] r0 = r2.values
            r0[r3] = r5
            int[] r5 = r2.previous
            r0 = -1
            r5[r3] = r0
            int[] r5 = r2.next
            r5[r3] = r0
            androidx.constraintlayout.core.ArrayRow r3 = r2.mRow
            r4.addToRow(r3)
            int r3 = r4.usageInRowCount
            int r3 = r3 + 1
            r4.usageInRowCount = r3
            int r3 = r2.mCount
            int r3 = r3 + 1
            r2.mCount = r3
            return
    }

    private void displayHash() {
            r7 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r7.HASH_SIZE
            if (r1 >= r2) goto L62
            int[] r2 = r7.keys
            r2 = r2[r1]
            r3 = -1
            if (r2 == r3) goto L5f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r4 = r7.hashCode()
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r4 = " hash ["
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.StringBuilder r2 = r2.append(r1)
            java.lang.String r4 = "] => "
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            int[] r4 = r7.keys
            r4 = r4[r1]
            r5 = r0
        L33:
            if (r5 != 0) goto L5a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.StringBuilder r2 = r6.append(r2)
            java.lang.String r6 = " "
            java.lang.StringBuilder r2 = r2.append(r6)
            int[] r6 = r7.variables
            r6 = r6[r4]
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.String r2 = r2.toString()
            int[] r6 = r7.nextKeys
            r6 = r6[r4]
            if (r6 == r3) goto L58
            r4 = r6
            goto L33
        L58:
            r5 = 1
            goto L33
        L5a:
            java.io.PrintStream r3 = java.lang.System.out
            r3.println(r2)
        L5f:
            int r1 = r1 + 1
            goto L2
        L62:
            return
    }

    private int findEmptySlot() {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r3.SIZE
            r2 = -1
            if (r0 >= r1) goto L10
            int[] r1 = r3.variables
            r1 = r1[r0]
            if (r1 != r2) goto Ld
            return r0
        Ld:
            int r0 = r0 + 1
            goto L1
        L10:
            return r2
    }

    private void increaseSize() {
            r4 = this;
            int r0 = r4.SIZE
            int r0 = r0 * 2
            int[] r1 = r4.variables
            int[] r1 = java.util.Arrays.copyOf(r1, r0)
            r4.variables = r1
            float[] r1 = r4.values
            float[] r1 = java.util.Arrays.copyOf(r1, r0)
            r4.values = r1
            int[] r1 = r4.previous
            int[] r1 = java.util.Arrays.copyOf(r1, r0)
            r4.previous = r1
            int[] r1 = r4.next
            int[] r1 = java.util.Arrays.copyOf(r1, r0)
            r4.next = r1
            int[] r1 = r4.nextKeys
            int[] r1 = java.util.Arrays.copyOf(r1, r0)
            r4.nextKeys = r1
            int r1 = r4.SIZE
        L2e:
            if (r1 >= r0) goto L3c
            int[] r2 = r4.variables
            r3 = -1
            r2[r1] = r3
            int[] r2 = r4.nextKeys
            r2[r1] = r3
            int r1 = r1 + 1
            goto L2e
        L3c:
            r4.SIZE = r0
            return
    }

    private void insertVariable(int r4, androidx.constraintlayout.core.SolverVariable r5, float r6) {
            r3 = this;
            int r0 = r3.findEmptySlot()
            r3.addVariable(r0, r5, r6)
            r6 = -1
            if (r4 == r6) goto L17
            int[] r1 = r3.previous
            r1[r0] = r4
            int[] r1 = r3.next
            r2 = r1[r4]
            r1[r0] = r2
            r1[r4] = r0
            goto L2c
        L17:
            int[] r4 = r3.previous
            r4[r0] = r6
            int r4 = r3.mCount
            if (r4 <= 0) goto L28
            int[] r4 = r3.next
            int r1 = r3.head
            r4[r0] = r1
            r3.head = r0
            goto L2c
        L28:
            int[] r4 = r3.next
            r4[r0] = r6
        L2c:
            int[] r4 = r3.next
            r4 = r4[r0]
            if (r4 == r6) goto L36
            int[] r6 = r3.previous
            r6[r4] = r0
        L36:
            r3.addToHashMap(r5, r0)
            return
    }

    private void removeFromHashMap(androidx.constraintlayout.core.SolverVariable r6) {
            r5 = this;
            int r0 = r6.f13id
            int r1 = r5.HASH_SIZE
            int r0 = r0 % r1
            int[] r1 = r5.keys
            r1 = r1[r0]
            r2 = -1
            if (r1 != r2) goto Ld
            return
        Ld:
            int r6 = r6.f13id
            int[] r3 = r5.variables
            r3 = r3[r1]
            if (r3 != r6) goto L20
            int[] r6 = r5.keys
            int[] r3 = r5.nextKeys
            r4 = r3[r1]
            r6[r0] = r4
            r3[r1] = r2
            goto L3c
        L20:
            int[] r0 = r5.nextKeys
            r3 = r0[r1]
            if (r3 == r2) goto L2e
            int[] r4 = r5.variables
            r4 = r4[r3]
            if (r4 == r6) goto L2e
            r1 = r3
            goto L20
        L2e:
            if (r3 == r2) goto L3c
            int[] r4 = r5.variables
            r4 = r4[r3]
            if (r4 != r6) goto L3c
            r6 = r0[r3]
            r0[r1] = r6
            r0[r3] = r2
        L3c:
            return
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void add(androidx.constraintlayout.core.SolverVariable r5, float r6, boolean r7) {
            r4 = this;
            float r0 = androidx.constraintlayout.core.SolverVariableValues.epsilon
            float r1 = -r0
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 <= 0) goto Lc
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 >= 0) goto Lc
            return
        Lc:
            int r0 = r4.indexOf(r5)
            r1 = -1
            if (r0 != r1) goto L17
            r4.put(r5, r6)
            goto L2f
        L17:
            float[] r1 = r4.values
            r2 = r1[r0]
            float r2 = r2 + r6
            r1[r0] = r2
            float r6 = androidx.constraintlayout.core.SolverVariableValues.epsilon
            float r3 = -r6
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2f
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 >= 0) goto L2f
            r6 = 0
            r1[r0] = r6
            r4.remove(r5, r7)
        L2f:
            return
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void clear() {
            r5 = this;
            int r0 = r5.mCount
            r1 = 0
            r2 = r1
        L4:
            if (r2 >= r0) goto L14
            androidx.constraintlayout.core.SolverVariable r3 = r5.getVariable(r2)
            if (r3 == 0) goto L11
            androidx.constraintlayout.core.ArrayRow r4 = r5.mRow
            r3.removeFromRow(r4)
        L11:
            int r2 = r2 + 1
            goto L4
        L14:
            r0 = r1
        L15:
            int r2 = r5.SIZE
            r3 = -1
            if (r0 >= r2) goto L25
            int[] r2 = r5.variables
            r2[r0] = r3
            int[] r2 = r5.nextKeys
            r2[r0] = r3
            int r0 = r0 + 1
            goto L15
        L25:
            r0 = r1
        L26:
            int r2 = r5.HASH_SIZE
            if (r0 >= r2) goto L31
            int[] r2 = r5.keys
            r2[r0] = r3
            int r0 = r0 + 1
            goto L26
        L31:
            r5.mCount = r1
            r5.head = r3
            return
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public boolean contains(androidx.constraintlayout.core.SolverVariable r2) {
            r1 = this;
            int r2 = r1.indexOf(r2)
            r0 = -1
            if (r2 == r0) goto L9
            r2 = 1
            goto La
        L9:
            r2 = 0
        La:
            return r2
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void display() {
            r5 = this;
            int r0 = r5.mCount
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.String r2 = "{ "
            r1.print(r2)
            r1 = 0
        La:
            if (r1 >= r0) goto L3c
            androidx.constraintlayout.core.SolverVariable r2 = r5.getVariable(r1)
            if (r2 != 0) goto L13
            goto L39
        L13:
            java.io.PrintStream r3 = java.lang.System.out
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r2 = r4.append(r2)
            java.lang.String r4 = " = "
            java.lang.StringBuilder r2 = r2.append(r4)
            float r4 = r5.getVariableValue(r1)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r4 = " "
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            r3.print(r2)
        L39:
            int r1 = r1 + 1
            goto La
        L3c:
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = " }"
            r0.println(r1)
            return
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void divideByAmount(float r6) {
            r5 = this;
            int r0 = r5.mCount
            int r1 = r5.head
            r2 = 0
        L5:
            if (r2 >= r0) goto L19
            float[] r3 = r5.values
            r4 = r3[r1]
            float r4 = r4 / r6
            r3[r1] = r4
            int[] r3 = r5.next
            r1 = r3[r1]
            r3 = -1
            if (r1 != r3) goto L16
            goto L19
        L16:
            int r2 = r2 + 1
            goto L5
        L19:
            return
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float get(androidx.constraintlayout.core.SolverVariable r2) {
            r1 = this;
            int r2 = r1.indexOf(r2)
            r0 = -1
            if (r2 == r0) goto Lc
            float[] r0 = r1.values
            r2 = r0[r2]
            return r2
        Lc:
            r2 = 0
            return r2
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int getCurrentSize() {
            r1 = this;
            int r0 = r1.mCount
            return r0
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public androidx.constraintlayout.core.SolverVariable getVariable(int r7) {
            r6 = this;
            int r0 = r6.mCount
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r2 = r6.head
            r3 = 0
        L9:
            if (r3 >= r0) goto L25
            r4 = -1
            if (r3 != r7) goto L1b
            if (r2 == r4) goto L1b
            androidx.constraintlayout.core.Cache r7 = r6.mCache
            androidx.constraintlayout.core.SolverVariable[] r7 = r7.mIndexedVariables
            int[] r0 = r6.variables
            r0 = r0[r2]
            r7 = r7[r0]
            return r7
        L1b:
            int[] r5 = r6.next
            r2 = r5[r2]
            if (r2 != r4) goto L22
            goto L25
        L22:
            int r3 = r3 + 1
            goto L9
        L25:
            return r1
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float getVariableValue(int r5) {
            r4 = this;
            int r0 = r4.mCount
            int r1 = r4.head
            r2 = 0
        L5:
            if (r2 >= r0) goto L19
            if (r2 != r5) goto Le
            float[] r5 = r4.values
            r5 = r5[r1]
            return r5
        Le:
            int[] r3 = r4.next
            r1 = r3[r1]
            r3 = -1
            if (r1 != r3) goto L16
            goto L19
        L16:
            int r2 = r2 + 1
            goto L5
        L19:
            r5 = 0
            return r5
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int indexOf(androidx.constraintlayout.core.SolverVariable r4) {
            r3 = this;
            int r0 = r3.mCount
            r1 = -1
            if (r0 == 0) goto L33
            if (r4 != 0) goto L8
            goto L33
        L8:
            int r4 = r4.f13id
            int r0 = r3.HASH_SIZE
            int r0 = r4 % r0
            int[] r2 = r3.keys
            r0 = r2[r0]
            if (r0 != r1) goto L15
            return r1
        L15:
            int[] r2 = r3.variables
            r2 = r2[r0]
            if (r2 != r4) goto L1c
            return r0
        L1c:
            int[] r2 = r3.nextKeys
            r0 = r2[r0]
            if (r0 == r1) goto L29
            int[] r2 = r3.variables
            r2 = r2[r0]
            if (r2 == r4) goto L29
            goto L1c
        L29:
            if (r0 != r1) goto L2c
            return r1
        L2c:
            int[] r2 = r3.variables
            r2 = r2[r0]
            if (r2 != r4) goto L33
            return r0
        L33:
            return r1
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void invert() {
            r6 = this;
            int r0 = r6.mCount
            int r1 = r6.head
            r2 = 0
        L5:
            if (r2 >= r0) goto L1b
            float[] r3 = r6.values
            r4 = r3[r1]
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r4 = r4 * r5
            r3[r1] = r4
            int[] r3 = r6.next
            r1 = r3[r1]
            r3 = -1
            if (r1 != r3) goto L18
            goto L1b
        L18:
            int r2 = r2 + 1
            goto L5
        L1b:
            return
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void put(androidx.constraintlayout.core.SolverVariable r8, float r9) {
            r7 = this;
            float r0 = androidx.constraintlayout.core.SolverVariableValues.epsilon
            float r1 = -r0
            int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            r2 = 1
            if (r1 <= 0) goto L10
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 >= 0) goto L10
            r7.remove(r8, r2)
            return
        L10:
            int r0 = r7.mCount
            r1 = 0
            if (r0 != 0) goto L1e
            r7.addVariable(r1, r8, r9)
            r7.addToHashMap(r8, r1)
            r7.head = r1
            goto L5e
        L1e:
            int r0 = r7.indexOf(r8)
            r3 = -1
            if (r0 == r3) goto L2a
            float[] r8 = r7.values
            r8[r0] = r9
            goto L5e
        L2a:
            int r0 = r7.mCount
            int r0 = r0 + r2
            int r2 = r7.SIZE
            if (r0 < r2) goto L34
            r7.increaseSize()
        L34:
            int r0 = r7.mCount
            int r2 = r7.head
            r4 = r3
        L39:
            if (r1 >= r0) goto L5b
            int[] r5 = r7.variables
            r5 = r5[r2]
            int r6 = r8.f13id
            if (r5 != r6) goto L48
            float[] r8 = r7.values
            r8[r2] = r9
            return
        L48:
            int[] r5 = r7.variables
            r5 = r5[r2]
            int r6 = r8.f13id
            if (r5 >= r6) goto L51
            r4 = r2
        L51:
            int[] r5 = r7.next
            r2 = r5[r2]
            if (r2 != r3) goto L58
            goto L5b
        L58:
            int r1 = r1 + 1
            goto L39
        L5b:
            r7.insertVariable(r4, r8, r9)
        L5e:
            return
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float remove(androidx.constraintlayout.core.SolverVariable r8, boolean r9) {
            r7 = this;
            int r0 = r7.indexOf(r8)
            r1 = -1
            if (r0 != r1) goto L9
            r8 = 0
            return r8
        L9:
            r7.removeFromHashMap(r8)
            float[] r2 = r7.values
            r2 = r2[r0]
            int r3 = r7.head
            if (r3 != r0) goto L1a
            int[] r3 = r7.next
            r3 = r3[r0]
            r7.head = r3
        L1a:
            int[] r3 = r7.variables
            r3[r0] = r1
            int[] r3 = r7.previous
            r4 = r3[r0]
            if (r4 == r1) goto L2a
            int[] r5 = r7.next
            r6 = r5[r0]
            r5[r4] = r6
        L2a:
            int[] r4 = r7.next
            r4 = r4[r0]
            if (r4 == r1) goto L34
            r0 = r3[r0]
            r3[r4] = r0
        L34:
            int r0 = r7.mCount
            int r0 = r0 + (-1)
            r7.mCount = r0
            int r0 = r8.usageInRowCount
            int r0 = r0 + (-1)
            r8.usageInRowCount = r0
            if (r9 == 0) goto L47
            androidx.constraintlayout.core.ArrayRow r9 = r7.mRow
            r8.removeFromRow(r9)
        L47:
            return r2
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int sizeInBytes() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.String toString() {
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r9.hashCode()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " { "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            int r1 = r9.mCount
            r2 = 0
        L1a:
            if (r2 >= r1) goto Lfb
            androidx.constraintlayout.core.SolverVariable r3 = r9.getVariable(r2)
            if (r3 != 0) goto L24
            goto Lf7
        L24:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r0 = r4.append(r0)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r4 = " = "
            java.lang.StringBuilder r0 = r0.append(r4)
            float r4 = r9.getVariableValue(r2)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r4 = " "
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
            int r3 = r9.indexOf(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r0 = r4.append(r0)
            java.lang.String r4 = "[p: "
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
            int[] r4 = r9.previous
            r4 = r4[r3]
            java.lang.String r5 = "none"
            r6 = -1
            if (r4 == r6) goto L89
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r0 = r4.append(r0)
            androidx.constraintlayout.core.Cache r4 = r9.mCache
            androidx.constraintlayout.core.SolverVariable[] r4 = r4.mIndexedVariables
            int[] r7 = r9.variables
            int[] r8 = r9.previous
            r8 = r8[r3]
            r7 = r7[r8]
            r4 = r4[r7]
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
            goto L9a
        L89:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r0 = r4.append(r0)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r0 = r0.toString()
        L9a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r0 = r4.append(r0)
            java.lang.String r4 = ", n: "
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
            int[] r4 = r9.next
            r4 = r4[r3]
            if (r4 == r6) goto Ld3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r0 = r4.append(r0)
            androidx.constraintlayout.core.Cache r4 = r9.mCache
            androidx.constraintlayout.core.SolverVariable[] r4 = r4.mIndexedVariables
            int[] r5 = r9.variables
            int[] r6 = r9.next
            r3 = r6[r3]
            r3 = r5[r3]
            r3 = r4[r3]
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            goto Le4
        Ld3:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r0 = r0.toString()
        Le4:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = "]"
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
        Lf7:
            int r2 = r2 + 1
            goto L1a
        Lfb:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = " }"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float use(androidx.constraintlayout.core.ArrayRow r8, boolean r9) {
            r7 = this;
            androidx.constraintlayout.core.SolverVariable r0 = r8.variable
            float r0 = r7.get(r0)
            androidx.constraintlayout.core.SolverVariable r1 = r8.variable
            r7.remove(r1, r9)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r8 = r8.variables
            androidx.constraintlayout.core.SolverVariableValues r8 = (androidx.constraintlayout.core.SolverVariableValues) r8
            int r1 = r8.getCurrentSize()
            int r2 = r8.head
            r2 = 0
            r3 = r2
        L17:
            if (r2 >= r1) goto L37
            int[] r4 = r8.variables
            r4 = r4[r3]
            r5 = -1
            if (r4 == r5) goto L34
            float[] r4 = r8.values
            r4 = r4[r3]
            androidx.constraintlayout.core.Cache r5 = r7.mCache
            androidx.constraintlayout.core.SolverVariable[] r5 = r5.mIndexedVariables
            int[] r6 = r8.variables
            r6 = r6[r3]
            r5 = r5[r6]
            float r4 = r4 * r0
            r7.add(r5, r4, r9)
            int r2 = r2 + 1
        L34:
            int r3 = r3 + 1
            goto L17
        L37:
            return r0
    }
}
