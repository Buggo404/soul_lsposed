package androidx.core.util;

/* loaded from: classes.dex */
public final class TimeUtils {
    public static final int HUNDRED_DAY_FIELD_LEN = 19;
    private static final int SECONDS_PER_DAY = 86400;
    private static final int SECONDS_PER_HOUR = 3600;
    private static final int SECONDS_PER_MINUTE = 60;
    private static char[] sFormatStr;
    private static final java.lang.Object sFormatSync = null;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.core.util.TimeUtils.sFormatSync = r0
            r0 = 24
            char[] r0 = new char[r0]
            androidx.core.util.TimeUtils.sFormatStr = r0
            return
    }

    private TimeUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int accumField(int r2, int r3, boolean r4, int r5) {
            r0 = 99
            r1 = 3
            if (r2 > r0) goto L20
            if (r4 == 0) goto La
            if (r5 < r1) goto La
            goto L20
        La:
            r0 = 9
            r1 = 2
            if (r2 > r0) goto L1e
            if (r4 == 0) goto L14
            if (r5 < r1) goto L14
            goto L1e
        L14:
            if (r4 != 0) goto L1b
            if (r2 <= 0) goto L19
            goto L1b
        L19:
            r2 = 0
            return r2
        L1b:
            int r3 = r3 + 1
            return r3
        L1e:
            int r3 = r3 + r1
            return r3
        L20:
            int r3 = r3 + r1
            return r3
    }

    public static void formatDuration(long r2, long r4, java.io.PrintWriter r6) {
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto Lc
            java.lang.String r2 = "--"
            r6.print(r2)
            return
        Lc:
            long r2 = r2 - r4
            r4 = 0
            formatDuration(r2, r6, r4)
            return
    }

    public static void formatDuration(long r1, java.io.PrintWriter r3) {
            r0 = 0
            formatDuration(r1, r3, r0)
            return
    }

    public static void formatDuration(long r2, java.io.PrintWriter r4, int r5) {
            java.lang.Object r0 = androidx.core.util.TimeUtils.sFormatSync
            monitor-enter(r0)
            int r2 = formatDurationLocked(r2, r5)     // Catch: java.lang.Throwable -> L14
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> L14
            char[] r5 = androidx.core.util.TimeUtils.sFormatStr     // Catch: java.lang.Throwable -> L14
            r1 = 0
            r3.<init>(r5, r1, r2)     // Catch: java.lang.Throwable -> L14
            r4.print(r3)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L14:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r2
    }

    public static void formatDuration(long r2, java.lang.StringBuilder r4) {
            java.lang.Object r0 = androidx.core.util.TimeUtils.sFormatSync
            monitor-enter(r0)
            r1 = 0
            int r2 = formatDurationLocked(r2, r1)     // Catch: java.lang.Throwable -> Lf
            char[] r3 = androidx.core.util.TimeUtils.sFormatStr     // Catch: java.lang.Throwable -> Lf
            r4.append(r3, r1, r2)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r2
    }

    private static int formatDurationLocked(long r17, int r19) {
            r0 = r17
            r2 = r19
            char[] r3 = androidx.core.util.TimeUtils.sFormatStr
            int r3 = r3.length
            if (r3 >= r2) goto Ld
            char[] r3 = new char[r2]
            androidx.core.util.TimeUtils.sFormatStr = r3
        Ld:
            char[] r3 = androidx.core.util.TimeUtils.sFormatStr
            r4 = 0
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            r5 = 32
            r10 = 1
            r11 = 0
            if (r4 != 0) goto L25
            int r0 = r2 + (-1)
        L1b:
            if (r0 <= 0) goto L20
            r3[r11] = r5
            goto L1b
        L20:
            r0 = 48
            r3[r11] = r0
            return r10
        L25:
            if (r4 <= 0) goto L2a
            r4 = 43
            goto L2d
        L2a:
            long r0 = -r0
            r4 = 45
        L2d:
            r6 = 1000(0x3e8, double:4.94E-321)
            long r8 = r0 % r6
            int r12 = (int) r8
            long r0 = r0 / r6
            double r0 = (double) r0
            double r0 = java.lang.Math.floor(r0)
            int r0 = (int) r0
            r1 = 86400(0x15180, float:1.21072E-40)
            if (r0 <= r1) goto L43
            int r6 = r0 / r1
            int r1 = r1 * r6
            int r0 = r0 - r1
            goto L44
        L43:
            r6 = r11
        L44:
            r1 = 3600(0xe10, float:5.045E-42)
            if (r0 <= r1) goto L4e
            int r1 = r0 / 3600
            int r7 = r1 * 3600
            int r0 = r0 - r7
            goto L4f
        L4e:
            r1 = r11
        L4f:
            r7 = 60
            if (r0 <= r7) goto L5b
            int r7 = r0 / 60
            int r8 = r7 * 60
            int r0 = r0 - r8
            r13 = r0
            r0 = r7
            goto L5d
        L5b:
            r13 = r0
            r0 = r11
        L5d:
            r14 = 3
            r15 = 2
            if (r2 == 0) goto L98
            int r7 = accumField(r6, r10, r11, r11)
            if (r7 <= 0) goto L69
            r8 = r10
            goto L6a
        L69:
            r8 = r11
        L6a:
            int r8 = accumField(r1, r10, r8, r15)
            int r7 = r7 + r8
            if (r7 <= 0) goto L73
            r8 = r10
            goto L74
        L73:
            r8 = r11
        L74:
            int r8 = accumField(r0, r10, r8, r15)
            int r7 = r7 + r8
            if (r7 <= 0) goto L7d
            r8 = r10
            goto L7e
        L7d:
            r8 = r11
        L7e:
            int r8 = accumField(r13, r10, r8, r15)
            int r7 = r7 + r8
            if (r7 <= 0) goto L87
            r8 = r14
            goto L88
        L87:
            r8 = r11
        L88:
            int r8 = accumField(r12, r15, r10, r8)
            int r8 = r8 + r10
            int r7 = r7 + r8
            r8 = r11
        L8f:
            if (r7 >= r2) goto L99
            r3[r8] = r5
            int r8 = r8 + 1
            int r7 = r7 + 1
            goto L8f
        L98:
            r8 = r11
        L99:
            r3[r8] = r4
            int r9 = r8 + 1
            if (r2 == 0) goto La1
            r2 = r10
            goto La2
        La1:
            r2 = r11
        La2:
            r7 = 100
            r8 = 0
            r16 = 0
            r4 = r3
            r5 = r6
            r6 = r7
            r7 = r9
            r11 = r9
            r9 = r16
            int r7 = printField(r4, r5, r6, r7, r8, r9)
            r6 = 104(0x68, float:1.46E-43)
            if (r7 == r11) goto Lb8
            r8 = r10
            goto Lb9
        Lb8:
            r8 = 0
        Lb9:
            if (r2 == 0) goto Lbd
            r9 = r15
            goto Lbe
        Lbd:
            r9 = 0
        Lbe:
            r4 = r3
            r5 = r1
            int r7 = printField(r4, r5, r6, r7, r8, r9)
            r6 = 109(0x6d, float:1.53E-43)
            if (r7 == r11) goto Lca
            r8 = r10
            goto Lcb
        Lca:
            r8 = 0
        Lcb:
            if (r2 == 0) goto Lcf
            r9 = r15
            goto Ld0
        Lcf:
            r9 = 0
        Ld0:
            r4 = r3
            r5 = r0
            int r7 = printField(r4, r5, r6, r7, r8, r9)
            r6 = 115(0x73, float:1.61E-43)
            if (r7 == r11) goto Ldc
            r8 = r10
            goto Ldd
        Ldc:
            r8 = 0
        Ldd:
            if (r2 == 0) goto Le1
            r9 = r15
            goto Le2
        Le1:
            r9 = 0
        Le2:
            r4 = r3
            r5 = r13
            int r7 = printField(r4, r5, r6, r7, r8, r9)
            r6 = 109(0x6d, float:1.53E-43)
            r8 = 1
            if (r2 == 0) goto Lf1
            if (r7 == r11) goto Lf1
            r9 = r14
            goto Lf2
        Lf1:
            r9 = 0
        Lf2:
            r4 = r3
            r5 = r12
            int r0 = printField(r4, r5, r6, r7, r8, r9)
            r1 = 115(0x73, float:1.61E-43)
            r3[r0] = r1
            int r0 = r0 + r10
            return r0
    }

    private static int printField(char[] r2, int r3, char r4, int r5, boolean r6, int r7) {
            if (r6 != 0) goto L4
            if (r3 <= 0) goto L3d
        L4:
            if (r6 == 0) goto L9
            r0 = 3
            if (r7 >= r0) goto Ld
        L9:
            r0 = 99
            if (r3 <= r0) goto L1a
        Ld:
            int r0 = r3 / 100
            int r1 = r0 + 48
            char r1 = (char) r1
            r2[r5] = r1
            int r1 = r5 + 1
            int r0 = r0 * 100
            int r3 = r3 - r0
            goto L1b
        L1a:
            r1 = r5
        L1b:
            if (r6 == 0) goto L20
            r6 = 2
            if (r7 >= r6) goto L26
        L20:
            r6 = 9
            if (r3 > r6) goto L26
            if (r5 == r1) goto L32
        L26:
            int r5 = r3 / 10
            int r6 = r5 + 48
            char r6 = (char) r6
            r2[r1] = r6
            int r1 = r1 + 1
            int r5 = r5 * 10
            int r3 = r3 - r5
        L32:
            int r3 = r3 + 48
            char r3 = (char) r3
            r2[r1] = r3
            int r1 = r1 + 1
            r2[r1] = r4
            int r5 = r1 + 1
        L3d:
            return r5
    }
}
