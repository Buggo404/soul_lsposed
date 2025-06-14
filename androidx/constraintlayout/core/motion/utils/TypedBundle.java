package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes.dex */
public class TypedBundle {
    private static final int INITIAL_BOOLEAN = 4;
    private static final int INITIAL_FLOAT = 10;
    private static final int INITIAL_INT = 10;
    private static final int INITIAL_STRING = 5;
    int mCountBoolean;
    int mCountFloat;
    int mCountInt;
    int mCountString;
    int[] mTypeBoolean;
    int[] mTypeFloat;
    int[] mTypeInt;
    int[] mTypeString;
    boolean[] mValueBoolean;
    float[] mValueFloat;
    int[] mValueInt;
    java.lang.String[] mValueString;

    public TypedBundle() {
            r3 = this;
            r3.<init>()
            r0 = 10
            int[] r1 = new int[r0]
            r3.mTypeInt = r1
            int[] r1 = new int[r0]
            r3.mValueInt = r1
            r1 = 0
            r3.mCountInt = r1
            int[] r2 = new int[r0]
            r3.mTypeFloat = r2
            float[] r0 = new float[r0]
            r3.mValueFloat = r0
            r3.mCountFloat = r1
            r0 = 5
            int[] r2 = new int[r0]
            r3.mTypeString = r2
            java.lang.String[] r0 = new java.lang.String[r0]
            r3.mValueString = r0
            r3.mCountString = r1
            r0 = 4
            int[] r2 = new int[r0]
            r3.mTypeBoolean = r2
            boolean[] r0 = new boolean[r0]
            r3.mValueBoolean = r0
            r3.mCountBoolean = r1
            return
    }

    public void add(int r4, float r5) {
            r3 = this;
            int r0 = r3.mCountFloat
            int[] r1 = r3.mTypeFloat
            int r2 = r1.length
            if (r0 < r2) goto L1b
            int r0 = r1.length
            int r0 = r0 * 2
            int[] r0 = java.util.Arrays.copyOf(r1, r0)
            r3.mTypeFloat = r0
            float[] r0 = r3.mValueFloat
            int r1 = r0.length
            int r1 = r1 * 2
            float[] r0 = java.util.Arrays.copyOf(r0, r1)
            r3.mValueFloat = r0
        L1b:
            int[] r0 = r3.mTypeFloat
            int r1 = r3.mCountFloat
            r0[r1] = r4
            float[] r4 = r3.mValueFloat
            int r0 = r1 + 1
            r3.mCountFloat = r0
            r4[r1] = r5
            return
    }

    public void add(int r4, int r5) {
            r3 = this;
            int r0 = r3.mCountInt
            int[] r1 = r3.mTypeInt
            int r2 = r1.length
            if (r0 < r2) goto L1b
            int r0 = r1.length
            int r0 = r0 * 2
            int[] r0 = java.util.Arrays.copyOf(r1, r0)
            r3.mTypeInt = r0
            int[] r0 = r3.mValueInt
            int r1 = r0.length
            int r1 = r1 * 2
            int[] r0 = java.util.Arrays.copyOf(r0, r1)
            r3.mValueInt = r0
        L1b:
            int[] r0 = r3.mTypeInt
            int r1 = r3.mCountInt
            r0[r1] = r4
            int[] r4 = r3.mValueInt
            int r0 = r1 + 1
            r3.mCountInt = r0
            r4[r1] = r5
            return
    }

    public void add(int r4, java.lang.String r5) {
            r3 = this;
            int r0 = r3.mCountString
            int[] r1 = r3.mTypeString
            int r2 = r1.length
            if (r0 < r2) goto L1d
            int r0 = r1.length
            int r0 = r0 * 2
            int[] r0 = java.util.Arrays.copyOf(r1, r0)
            r3.mTypeString = r0
            java.lang.String[] r0 = r3.mValueString
            int r1 = r0.length
            int r1 = r1 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r3.mValueString = r0
        L1d:
            int[] r0 = r3.mTypeString
            int r1 = r3.mCountString
            r0[r1] = r4
            java.lang.String[] r4 = r3.mValueString
            int r0 = r1 + 1
            r3.mCountString = r0
            r4[r1] = r5
            return
    }

    public void add(int r4, boolean r5) {
            r3 = this;
            int r0 = r3.mCountBoolean
            int[] r1 = r3.mTypeBoolean
            int r2 = r1.length
            if (r0 < r2) goto L1b
            int r0 = r1.length
            int r0 = r0 * 2
            int[] r0 = java.util.Arrays.copyOf(r1, r0)
            r3.mTypeBoolean = r0
            boolean[] r0 = r3.mValueBoolean
            int r1 = r0.length
            int r1 = r1 * 2
            boolean[] r0 = java.util.Arrays.copyOf(r0, r1)
            r3.mValueBoolean = r0
        L1b:
            int[] r0 = r3.mTypeBoolean
            int r1 = r3.mCountBoolean
            r0[r1] = r4
            boolean[] r4 = r3.mValueBoolean
            int r0 = r1 + 1
            r3.mCountBoolean = r0
            r4[r1] = r5
            return
    }

    public void addIfNotNull(int r1, java.lang.String r2) {
            r0 = this;
            if (r2 == 0) goto L5
            r0.add(r1, r2)
        L5:
            return
    }

    public void applyDelta(androidx.constraintlayout.core.motion.utils.TypedBundle r5) {
            r4 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r4.mCountInt
            if (r1 >= r2) goto L14
            int[] r2 = r4.mTypeInt
            r2 = r2[r1]
            int[] r3 = r4.mValueInt
            r3 = r3[r1]
            r5.add(r2, r3)
            int r1 = r1 + 1
            goto L2
        L14:
            r1 = r0
        L15:
            int r2 = r4.mCountFloat
            if (r1 >= r2) goto L27
            int[] r2 = r4.mTypeFloat
            r2 = r2[r1]
            float[] r3 = r4.mValueFloat
            r3 = r3[r1]
            r5.add(r2, r3)
            int r1 = r1 + 1
            goto L15
        L27:
            r1 = r0
        L28:
            int r2 = r4.mCountString
            if (r1 >= r2) goto L3a
            int[] r2 = r4.mTypeString
            r2 = r2[r1]
            java.lang.String[] r3 = r4.mValueString
            r3 = r3[r1]
            r5.add(r2, r3)
            int r1 = r1 + 1
            goto L28
        L3a:
            int r1 = r4.mCountBoolean
            if (r0 >= r1) goto L4c
            int[] r1 = r4.mTypeBoolean
            r1 = r1[r0]
            boolean[] r2 = r4.mValueBoolean
            boolean r2 = r2[r0]
            r5.add(r1, r2)
            int r0 = r0 + 1
            goto L3a
        L4c:
            return
    }

    public void applyDelta(androidx.constraintlayout.core.motion.utils.TypedValues r5) {
            r4 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r4.mCountInt
            if (r1 >= r2) goto L14
            int[] r2 = r4.mTypeInt
            r2 = r2[r1]
            int[] r3 = r4.mValueInt
            r3 = r3[r1]
            r5.setValue(r2, r3)
            int r1 = r1 + 1
            goto L2
        L14:
            r1 = r0
        L15:
            int r2 = r4.mCountFloat
            if (r1 >= r2) goto L27
            int[] r2 = r4.mTypeFloat
            r2 = r2[r1]
            float[] r3 = r4.mValueFloat
            r3 = r3[r1]
            r5.setValue(r2, r3)
            int r1 = r1 + 1
            goto L15
        L27:
            r1 = r0
        L28:
            int r2 = r4.mCountString
            if (r1 >= r2) goto L3a
            int[] r2 = r4.mTypeString
            r2 = r2[r1]
            java.lang.String[] r3 = r4.mValueString
            r3 = r3[r1]
            r5.setValue(r2, r3)
            int r1 = r1 + 1
            goto L28
        L3a:
            int r1 = r4.mCountBoolean
            if (r0 >= r1) goto L4c
            int[] r1 = r4.mTypeBoolean
            r1 = r1[r0]
            boolean[] r2 = r4.mValueBoolean
            boolean r2 = r2[r0]
            r5.setValue(r1, r2)
            int r0 = r0 + 1
            goto L3a
        L4c:
            return
    }

    public void clear() {
            r1 = this;
            r0 = 0
            r1.mCountBoolean = r0
            r1.mCountString = r0
            r1.mCountFloat = r0
            r1.mCountInt = r0
            return
    }

    public int getInteger(int r3) {
            r2 = this;
            r0 = 0
        L1:
            int r1 = r2.mCountInt
            if (r0 >= r1) goto L13
            int[] r1 = r2.mTypeInt
            r1 = r1[r0]
            if (r1 != r3) goto L10
            int[] r3 = r2.mValueInt
            r3 = r3[r0]
            return r3
        L10:
            int r0 = r0 + 1
            goto L1
        L13:
            r3 = -1
            return r3
    }
}
