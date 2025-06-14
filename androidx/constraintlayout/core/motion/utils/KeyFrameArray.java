package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes.dex */
public class KeyFrameArray {

    public static class CustomArray {
        private static final int EMPTY = 999;
        int count;
        int[] keys;
        androidx.constraintlayout.core.motion.CustomAttribute[] values;

        public CustomArray() {
                r2 = this;
                r2.<init>()
                r0 = 101(0x65, float:1.42E-43)
                int[] r1 = new int[r0]
                r2.keys = r1
                androidx.constraintlayout.core.motion.CustomAttribute[] r0 = new androidx.constraintlayout.core.motion.CustomAttribute[r0]
                r2.values = r0
                r2.clear()
                return
        }

        public void append(int r3, androidx.constraintlayout.core.motion.CustomAttribute r4) {
                r2 = this;
                androidx.constraintlayout.core.motion.CustomAttribute[] r0 = r2.values
                r0 = r0[r3]
                if (r0 == 0) goto L9
                r2.remove(r3)
            L9:
                androidx.constraintlayout.core.motion.CustomAttribute[] r0 = r2.values
                r0[r3] = r4
                int[] r4 = r2.keys
                int r0 = r2.count
                int r1 = r0 + 1
                r2.count = r1
                r4[r0] = r3
                java.util.Arrays.sort(r4)
                return
        }

        public void clear() {
                r2 = this;
                int[] r0 = r2.keys
                r1 = 999(0x3e7, float:1.4E-42)
                java.util.Arrays.fill(r0, r1)
                androidx.constraintlayout.core.motion.CustomAttribute[] r0 = r2.values
                r1 = 0
                java.util.Arrays.fill(r0, r1)
                r0 = 0
                r2.count = r0
                return
        }

        public void dump() {
                r4 = this;
                java.io.PrintStream r0 = java.lang.System.out
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "V: "
                r1.<init>(r2)
                int[] r2 = r4.keys
                int r3 = r4.count
                int[] r2 = java.util.Arrays.copyOf(r2, r3)
                java.lang.String r2 = java.util.Arrays.toString(r2)
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.println(r1)
                java.io.PrintStream r0 = java.lang.System.out
                java.lang.String r1 = "K: ["
                r0.print(r1)
                r0 = 0
            L28:
                int r1 = r4.count
                if (r0 >= r1) goto L50
                java.io.PrintStream r1 = java.lang.System.out
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                if (r0 != 0) goto L38
                java.lang.String r3 = ""
                goto L3a
            L38:
                java.lang.String r3 = ", "
            L3a:
                java.lang.StringBuilder r2 = r2.append(r3)
                androidx.constraintlayout.core.motion.CustomAttribute r3 = r4.valueAt(r0)
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.print(r2)
                int r0 = r0 + 1
                goto L28
            L50:
                java.io.PrintStream r0 = java.lang.System.out
                java.lang.String r1 = "]"
                r0.println(r1)
                return
        }

        public int keyAt(int r2) {
                r1 = this;
                int[] r0 = r1.keys
                r2 = r0[r2]
                return r2
        }

        public void remove(int r5) {
                r4 = this;
                androidx.constraintlayout.core.motion.CustomAttribute[] r0 = r4.values
                r1 = 0
                r0[r5] = r1
                r0 = 0
                r1 = r0
            L7:
                int r2 = r4.count
                if (r0 >= r2) goto L22
                int[] r2 = r4.keys
                r3 = r2[r0]
                if (r5 != r3) goto L17
                r3 = 999(0x3e7, float:1.4E-42)
                r2[r0] = r3
                int r1 = r1 + 1
            L17:
                if (r0 == r1) goto L1d
                r3 = r2[r1]
                r2[r0] = r3
            L1d:
                int r1 = r1 + 1
                int r0 = r0 + 1
                goto L7
            L22:
                int r2 = r2 + (-1)
                r4.count = r2
                return
        }

        public int size() {
                r1 = this;
                int r0 = r1.count
                return r0
        }

        public androidx.constraintlayout.core.motion.CustomAttribute valueAt(int r3) {
                r2 = this;
                androidx.constraintlayout.core.motion.CustomAttribute[] r0 = r2.values
                int[] r1 = r2.keys
                r3 = r1[r3]
                r3 = r0[r3]
                return r3
        }
    }

    public static class CustomVar {
        private static final int EMPTY = 999;
        int count;
        int[] keys;
        androidx.constraintlayout.core.motion.CustomVariable[] values;

        public CustomVar() {
                r2 = this;
                r2.<init>()
                r0 = 101(0x65, float:1.42E-43)
                int[] r1 = new int[r0]
                r2.keys = r1
                androidx.constraintlayout.core.motion.CustomVariable[] r0 = new androidx.constraintlayout.core.motion.CustomVariable[r0]
                r2.values = r0
                r2.clear()
                return
        }

        public void append(int r3, androidx.constraintlayout.core.motion.CustomVariable r4) {
                r2 = this;
                androidx.constraintlayout.core.motion.CustomVariable[] r0 = r2.values
                r0 = r0[r3]
                if (r0 == 0) goto L9
                r2.remove(r3)
            L9:
                androidx.constraintlayout.core.motion.CustomVariable[] r0 = r2.values
                r0[r3] = r4
                int[] r4 = r2.keys
                int r0 = r2.count
                int r1 = r0 + 1
                r2.count = r1
                r4[r0] = r3
                java.util.Arrays.sort(r4)
                return
        }

        public void clear() {
                r2 = this;
                int[] r0 = r2.keys
                r1 = 999(0x3e7, float:1.4E-42)
                java.util.Arrays.fill(r0, r1)
                androidx.constraintlayout.core.motion.CustomVariable[] r0 = r2.values
                r1 = 0
                java.util.Arrays.fill(r0, r1)
                r0 = 0
                r2.count = r0
                return
        }

        public void dump() {
                r4 = this;
                java.io.PrintStream r0 = java.lang.System.out
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "V: "
                r1.<init>(r2)
                int[] r2 = r4.keys
                int r3 = r4.count
                int[] r2 = java.util.Arrays.copyOf(r2, r3)
                java.lang.String r2 = java.util.Arrays.toString(r2)
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.println(r1)
                java.io.PrintStream r0 = java.lang.System.out
                java.lang.String r1 = "K: ["
                r0.print(r1)
                r0 = 0
            L28:
                int r1 = r4.count
                if (r0 >= r1) goto L50
                java.io.PrintStream r1 = java.lang.System.out
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                if (r0 != 0) goto L38
                java.lang.String r3 = ""
                goto L3a
            L38:
                java.lang.String r3 = ", "
            L3a:
                java.lang.StringBuilder r2 = r2.append(r3)
                androidx.constraintlayout.core.motion.CustomVariable r3 = r4.valueAt(r0)
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.print(r2)
                int r0 = r0 + 1
                goto L28
            L50:
                java.io.PrintStream r0 = java.lang.System.out
                java.lang.String r1 = "]"
                r0.println(r1)
                return
        }

        public int keyAt(int r2) {
                r1 = this;
                int[] r0 = r1.keys
                r2 = r0[r2]
                return r2
        }

        public void remove(int r5) {
                r4 = this;
                androidx.constraintlayout.core.motion.CustomVariable[] r0 = r4.values
                r1 = 0
                r0[r5] = r1
                r0 = 0
                r1 = r0
            L7:
                int r2 = r4.count
                if (r0 >= r2) goto L22
                int[] r2 = r4.keys
                r3 = r2[r0]
                if (r5 != r3) goto L17
                r3 = 999(0x3e7, float:1.4E-42)
                r2[r0] = r3
                int r1 = r1 + 1
            L17:
                if (r0 == r1) goto L1d
                r3 = r2[r1]
                r2[r0] = r3
            L1d:
                int r1 = r1 + 1
                int r0 = r0 + 1
                goto L7
            L22:
                int r2 = r2 + (-1)
                r4.count = r2
                return
        }

        public int size() {
                r1 = this;
                int r0 = r1.count
                return r0
        }

        public androidx.constraintlayout.core.motion.CustomVariable valueAt(int r3) {
                r2 = this;
                androidx.constraintlayout.core.motion.CustomVariable[] r0 = r2.values
                int[] r1 = r2.keys
                r3 = r1[r3]
                r3 = r0[r3]
                return r3
        }
    }

    static class FloatArray {
        private static final int EMPTY = 999;
        int count;
        int[] keys;
        float[][] values;

        public FloatArray() {
                r2 = this;
                r2.<init>()
                r0 = 101(0x65, float:1.42E-43)
                int[] r1 = new int[r0]
                r2.keys = r1
                float[][] r0 = new float[r0][]
                r2.values = r0
                r2.clear()
                return
        }

        public void append(int r3, float[] r4) {
                r2 = this;
                float[][] r0 = r2.values
                r0 = r0[r3]
                if (r0 == 0) goto L9
                r2.remove(r3)
            L9:
                float[][] r0 = r2.values
                r0[r3] = r4
                int[] r4 = r2.keys
                int r0 = r2.count
                int r1 = r0 + 1
                r2.count = r1
                r4[r0] = r3
                java.util.Arrays.sort(r4)
                return
        }

        public void clear() {
                r2 = this;
                int[] r0 = r2.keys
                r1 = 999(0x3e7, float:1.4E-42)
                java.util.Arrays.fill(r0, r1)
                float[][] r0 = r2.values
                r1 = 0
                java.util.Arrays.fill(r0, r1)
                r0 = 0
                r2.count = r0
                return
        }

        public void dump() {
                r4 = this;
                java.io.PrintStream r0 = java.lang.System.out
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "V: "
                r1.<init>(r2)
                int[] r2 = r4.keys
                int r3 = r4.count
                int[] r2 = java.util.Arrays.copyOf(r2, r3)
                java.lang.String r2 = java.util.Arrays.toString(r2)
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.println(r1)
                java.io.PrintStream r0 = java.lang.System.out
                java.lang.String r1 = "K: ["
                r0.print(r1)
                r0 = 0
            L28:
                int r1 = r4.count
                if (r0 >= r1) goto L54
                java.io.PrintStream r1 = java.lang.System.out
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                if (r0 != 0) goto L38
                java.lang.String r3 = ""
                goto L3a
            L38:
                java.lang.String r3 = ", "
            L3a:
                java.lang.StringBuilder r2 = r2.append(r3)
                float[] r3 = r4.valueAt(r0)
                java.lang.String r3 = java.util.Arrays.toString(r3)
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.print(r2)
                int r0 = r0 + 1
                goto L28
            L54:
                java.io.PrintStream r0 = java.lang.System.out
                java.lang.String r1 = "]"
                r0.println(r1)
                return
        }

        public int keyAt(int r2) {
                r1 = this;
                int[] r0 = r1.keys
                r2 = r0[r2]
                return r2
        }

        public void remove(int r5) {
                r4 = this;
                float[][] r0 = r4.values
                r1 = 0
                r0[r5] = r1
                r0 = 0
                r1 = r0
            L7:
                int r2 = r4.count
                if (r0 >= r2) goto L22
                int[] r2 = r4.keys
                r3 = r2[r0]
                if (r5 != r3) goto L17
                r3 = 999(0x3e7, float:1.4E-42)
                r2[r0] = r3
                int r1 = r1 + 1
            L17:
                if (r0 == r1) goto L1d
                r3 = r2[r1]
                r2[r0] = r3
            L1d:
                int r1 = r1 + 1
                int r0 = r0 + 1
                goto L7
            L22:
                int r2 = r2 + (-1)
                r4.count = r2
                return
        }

        public int size() {
                r1 = this;
                int r0 = r1.count
                return r0
        }

        public float[] valueAt(int r3) {
                r2 = this;
                float[][] r0 = r2.values
                int[] r1 = r2.keys
                r3 = r1[r3]
                r3 = r0[r3]
                return r3
        }
    }

    public KeyFrameArray() {
            r0 = this;
            r0.<init>()
            return
    }
}
