package io.reactivex.internal.util;

/* loaded from: classes.dex */
public final class Pow2 {
    private Pow2() {
            r2 = this;
            r2.<init>()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No instances!"
            r0.<init>(r1)
            throw r0
    }

    public static boolean isPowerOfTwo(int r1) {
            int r0 = r1 + (-1)
            r1 = r1 & r0
            if (r1 != 0) goto L7
            r1 = 1
            goto L8
        L7:
            r1 = 0
        L8:
            return r1
    }

    public static int roundToPowerOfTwo(int r1) {
            r0 = 1
            int r1 = r1 - r0
            int r1 = java.lang.Integer.numberOfLeadingZeros(r1)
            int r1 = 32 - r1
            int r1 = r0 << r1
            return r1
    }
}
