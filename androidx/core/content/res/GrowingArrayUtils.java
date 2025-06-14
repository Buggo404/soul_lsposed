package androidx.core.content.res;

/* loaded from: classes.dex */
final class GrowingArrayUtils {
    private GrowingArrayUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int[] append(int[] r2, int r3, int r4) {
            int r0 = r3 + 1
            int r1 = r2.length
            if (r0 <= r1) goto L10
            int r0 = growSize(r3)
            int[] r0 = new int[r0]
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r0, r1, r3)
            r2 = r0
        L10:
            r2[r3] = r4
            return r2
    }

    public static long[] append(long[] r2, int r3, long r4) {
            int r0 = r3 + 1
            int r1 = r2.length
            if (r0 <= r1) goto L10
            int r0 = growSize(r3)
            long[] r0 = new long[r0]
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r0, r1, r3)
            r2 = r0
        L10:
            r2[r3] = r4
            return r2
    }

    public static <T> T[] append(T[] r2, int r3, T r4) {
            int r0 = r3 + 1
            int r1 = r2.length
            if (r0 <= r1) goto L1c
            java.lang.Class r0 = r2.getClass()
            java.lang.Class r0 = r0.getComponentType()
            int r1 = growSize(r3)
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r0, r1, r3)
            r2 = r0
        L1c:
            r2[r3] = r4
            return r2
    }

    public static boolean[] append(boolean[] r2, int r3, boolean r4) {
            int r0 = r3 + 1
            int r1 = r2.length
            if (r0 <= r1) goto L10
            int r0 = growSize(r3)
            boolean[] r0 = new boolean[r0]
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r0, r1, r3)
            r2 = r0
        L10:
            r2[r3] = r4
            return r2
    }

    public static int growSize(int r1) {
            r0 = 4
            if (r1 > r0) goto L6
            r1 = 8
            goto L8
        L6:
            int r1 = r1 * 2
        L8:
            return r1
    }

    public static int[] insert(int[] r2, int r3, int r4, int r5) {
            int r0 = r3 + 1
            int r1 = r2.length
            if (r0 > r1) goto Le
            int r0 = r4 + 1
            int r3 = r3 - r4
            java.lang.System.arraycopy(r2, r4, r2, r0, r3)
            r2[r4] = r5
            return r2
        Le:
            int r3 = growSize(r3)
            int[] r3 = new int[r3]
            r0 = 0
            java.lang.System.arraycopy(r2, r0, r3, r0, r4)
            r3[r4] = r5
            int r5 = r4 + 1
            int r0 = r2.length
            int r0 = r0 - r4
            java.lang.System.arraycopy(r2, r4, r3, r5, r0)
            return r3
    }

    public static long[] insert(long[] r2, int r3, int r4, long r5) {
            int r0 = r3 + 1
            int r1 = r2.length
            if (r0 > r1) goto Le
            int r0 = r4 + 1
            int r3 = r3 - r4
            java.lang.System.arraycopy(r2, r4, r2, r0, r3)
            r2[r4] = r5
            return r2
        Le:
            int r3 = growSize(r3)
            long[] r3 = new long[r3]
            r0 = 0
            java.lang.System.arraycopy(r2, r0, r3, r0, r4)
            r3[r4] = r5
            int r5 = r4 + 1
            int r6 = r2.length
            int r6 = r6 - r4
            java.lang.System.arraycopy(r2, r4, r3, r5, r6)
            return r3
    }

    public static <T> T[] insert(T[] r2, int r3, int r4, T r5) {
            int r0 = r3 + 1
            int r1 = r2.length
            if (r0 > r1) goto Le
            int r0 = r4 + 1
            int r3 = r3 - r4
            java.lang.System.arraycopy(r2, r4, r2, r0, r3)
            r2[r4] = r5
            return r2
        Le:
            java.lang.Class r0 = r2.getClass()
            java.lang.Class r0 = r0.getComponentType()
            int r3 = growSize(r3)
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r0, r3)
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r0 = 0
            java.lang.System.arraycopy(r2, r0, r3, r0, r4)
            r3[r4] = r5
            int r5 = r4 + 1
            int r0 = r2.length
            int r0 = r0 - r4
            java.lang.System.arraycopy(r2, r4, r3, r5, r0)
            return r3
    }

    public static boolean[] insert(boolean[] r2, int r3, int r4, boolean r5) {
            int r0 = r3 + 1
            int r1 = r2.length
            if (r0 > r1) goto Le
            int r0 = r4 + 1
            int r3 = r3 - r4
            java.lang.System.arraycopy(r2, r4, r2, r0, r3)
            r2[r4] = r5
            return r2
        Le:
            int r3 = growSize(r3)
            boolean[] r3 = new boolean[r3]
            r0 = 0
            java.lang.System.arraycopy(r2, r0, r3, r0, r4)
            r3[r4] = r5
            int r5 = r4 + 1
            int r0 = r2.length
            int r0 = r0 - r4
            java.lang.System.arraycopy(r2, r4, r3, r5, r0)
            return r3
    }
}
