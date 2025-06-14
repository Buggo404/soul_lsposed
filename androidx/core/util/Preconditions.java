package androidx.core.util;

/* loaded from: classes.dex */
public final class Preconditions {
    private Preconditions() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void checkArgument(boolean r0) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
    }

    public static void checkArgument(boolean r0, java.lang.Object r1) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            throw r0
    }

    public static int checkArgumentInRange(int r5, int r6, int r7, java.lang.String r8) {
            r0 = 2
            r1 = 1
            r2 = 0
            r3 = 3
            if (r5 < r6) goto L27
            if (r5 > r7) goto L9
            return r5
        L9:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.util.Locale r4 = java.util.Locale.US
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r8
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r3[r1] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            r3[r0] = r6
            java.lang.String r6 = "%s is out of range of [%d, %d] (too high)"
            java.lang.String r6 = java.lang.String.format(r4, r6, r3)
            r5.<init>(r6)
            throw r5
        L27:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.util.Locale r4 = java.util.Locale.US
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r8
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r3[r1] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            r3[r0] = r6
            java.lang.String r6 = "%s is out of range of [%d, %d] (too low)"
            java.lang.String r6 = java.lang.String.format(r4, r6, r3)
            r5.<init>(r6)
            throw r5
    }

    public static int checkArgumentNonnegative(int r0) {
            if (r0 < 0) goto L3
            return r0
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
    }

    public static int checkArgumentNonnegative(int r0, java.lang.String r1) {
            if (r0 < 0) goto L3
            return r0
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
    }

    public static int checkFlagsArgument(int r3, int r4) {
            r0 = r3 & r4
            if (r0 != r3) goto L5
            return r3
        L5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Requested flags 0x"
            r1.<init>(r2)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r1 = ", but only 0x"
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " are allowed"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    public static <T> T checkNotNull(T r0) {
            r0.getClass()
            return r0
    }

    public static <T> T checkNotNull(T r0, java.lang.Object r1) {
            if (r0 == 0) goto L3
            return r0
        L3:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            throw r0
    }

    public static void checkState(boolean r1) {
            r0 = 0
            checkState(r1, r0)
            return
    }

    public static void checkState(boolean r0, java.lang.String r1) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
    }

    public static <T extends java.lang.CharSequence> T checkStringNotEmpty(T r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L7
            return r1
        L7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
    }

    public static <T extends java.lang.CharSequence> T checkStringNotEmpty(T r1, java.lang.Object r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L7
            return r1
        L7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.<init>(r2)
            throw r1
    }

    public static <T extends java.lang.CharSequence> T checkStringNotEmpty(T r1, java.lang.String r2, java.lang.Object... r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L7
            return r1
        L7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r1.<init>(r2)
            throw r1
    }
}
