package com.google.android.material.math;

/* loaded from: classes.dex */
public final class MathUtils {
    public static final float DEFAULT_EPSILON = 1.0E-4f;

    private MathUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static float dist(float r0, float r1, float r2, float r3) {
            float r2 = r2 - r0
            float r3 = r3 - r1
            double r0 = (double) r2
            double r2 = (double) r3
            double r0 = java.lang.Math.hypot(r0, r2)
            float r0 = (float) r0
            return r0
    }

    public static float distanceToFurthestCorner(float r1, float r2, float r3, float r4, float r5, float r6) {
            float r0 = dist(r1, r2, r3, r4)
            float r4 = dist(r1, r2, r5, r4)
            float r5 = dist(r1, r2, r5, r6)
            float r1 = dist(r1, r2, r3, r6)
            float r1 = max(r0, r4, r5, r1)
            return r1
    }

    public static float floorMod(float r3, int r4) {
            float r0 = (float) r4
            float r1 = r3 / r0
            int r1 = (int) r1
            float r2 = java.lang.Math.signum(r3)
            float r2 = r2 * r0
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L17
            int r0 = r1 * r4
            float r0 = (float) r0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L17
            int r1 = r1 + (-1)
        L17:
            int r1 = r1 * r4
            float r4 = (float) r1
            float r3 = r3 - r4
            return r3
    }

    public static int floorMod(int r2, int r3) {
            int r0 = r2 / r3
            r1 = r2 ^ r3
            if (r1 >= 0) goto Lc
            int r1 = r0 * r3
            if (r1 == r2) goto Lc
            int r0 = r0 + (-1)
        Lc:
            int r0 = r0 * r3
            int r2 = r2 - r0
            return r2
    }

    public static boolean geq(float r0, float r1, float r2) {
            float r0 = r0 + r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    public static float lerp(float r1, float r2, float r3) {
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r3
            float r0 = r0 * r1
            float r3 = r3 * r2
            float r0 = r0 + r3
            return r0
    }

    private static float max(float r1, float r2, float r3, float r4) {
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 <= 0) goto Ld
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto Ld
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto Ld
            goto L1e
        Ld:
            int r1 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r1 <= 0) goto L17
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 <= 0) goto L17
            r1 = r2
            goto L1e
        L17:
            int r1 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r1 <= 0) goto L1d
            r1 = r3
            goto L1e
        L1d:
            r1 = r4
        L1e:
            return r1
    }
}
