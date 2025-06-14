package com.google.gson.internal.bind.util;

/* loaded from: classes.dex */
public class ISO8601Utils {
    private static final java.util.TimeZone TIMEZONE_UTC = null;
    private static final java.lang.String UTC_ID = "UTC";

    static {
            java.lang.String r0 = "UTC"
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)
            com.google.gson.internal.bind.util.ISO8601Utils.TIMEZONE_UTC = r0
            return
    }

    public ISO8601Utils() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean checkOffset(java.lang.String r1, int r2, char r3) {
            int r0 = r1.length()
            if (r2 >= r0) goto Le
            char r1 = r1.charAt(r2)
            if (r1 != r3) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    public static java.lang.String format(java.util.Date r2) {
            r0 = 0
            java.util.TimeZone r1 = com.google.gson.internal.bind.util.ISO8601Utils.TIMEZONE_UTC
            java.lang.String r2 = format(r2, r0, r1)
            return r2
    }

    public static java.lang.String format(java.util.Date r1, boolean r2) {
            java.util.TimeZone r0 = com.google.gson.internal.bind.util.ISO8601Utils.TIMEZONE_UTC
            java.lang.String r1 = format(r1, r2, r0)
            return r1
    }

    public static java.lang.String format(java.util.Date r6, boolean r7, java.util.TimeZone r8) {
            java.util.GregorianCalendar r0 = new java.util.GregorianCalendar
            java.util.Locale r1 = java.util.Locale.US
            r0.<init>(r8, r1)
            r0.setTime(r6)
            r6 = 4
            if (r7 == 0) goto Lf
            r1 = r6
            goto L10
        Lf:
            r1 = 0
        L10:
            r2 = 19
            int r2 = r2 + r1
            int r1 = r8.getRawOffset()
            r3 = 1
            if (r1 != 0) goto L1c
            r1 = r3
            goto L1d
        L1c:
            r1 = 6
        L1d:
            int r2 = r2 + r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            int r2 = r0.get(r3)
            padInt(r1, r2, r6)
            r6 = 45
            r1.append(r6)
            r2 = 2
            int r4 = r0.get(r2)
            int r4 = r4 + r3
            padInt(r1, r4, r2)
            r1.append(r6)
            r3 = 5
            int r3 = r0.get(r3)
            padInt(r1, r3, r2)
            r3 = 84
            r1.append(r3)
            r3 = 11
            int r3 = r0.get(r3)
            padInt(r1, r3, r2)
            r3 = 58
            r1.append(r3)
            r4 = 12
            int r4 = r0.get(r4)
            padInt(r1, r4, r2)
            r1.append(r3)
            r4 = 13
            int r4 = r0.get(r4)
            padInt(r1, r4, r2)
            if (r7 == 0) goto L7c
            r7 = 46
            r1.append(r7)
            r7 = 14
            int r7 = r0.get(r7)
            r4 = 3
            padInt(r1, r7, r4)
        L7c:
            long r4 = r0.getTimeInMillis()
            int r7 = r8.getOffset(r4)
            if (r7 == 0) goto La9
            r8 = 60000(0xea60, float:8.4078E-41)
            int r8 = r7 / r8
            int r0 = r8 / 60
            int r0 = java.lang.Math.abs(r0)
            int r8 = r8 % 60
            int r8 = java.lang.Math.abs(r8)
            if (r7 >= 0) goto L9a
            goto L9c
        L9a:
            r6 = 43
        L9c:
            r1.append(r6)
            padInt(r1, r0, r2)
            r1.append(r3)
            padInt(r1, r8, r2)
            goto Lae
        La9:
            r6 = 90
            r1.append(r6)
        Lae:
            java.lang.String r6 = r1.toString()
            return r6
    }

    private static int indexOfNonDigit(java.lang.String r2, int r3) {
        L0:
            int r0 = r2.length()
            if (r3 >= r0) goto L17
            char r0 = r2.charAt(r3)
            r1 = 48
            if (r0 < r1) goto L16
            r1 = 57
            if (r0 <= r1) goto L13
            goto L16
        L13:
            int r3 = r3 + 1
            goto L0
        L16:
            return r3
        L17:
            int r2 = r2.length()
            return r2
    }

    private static void padInt(java.lang.StringBuilder r1, int r2, int r3) {
            java.lang.String r2 = java.lang.Integer.toString(r2)
            int r0 = r2.length()
            int r3 = r3 - r0
        L9:
            if (r3 <= 0) goto L13
            r0 = 48
            r1.append(r0)
            int r3 = r3 + (-1)
            goto L9
        L13:
            r1.append(r2)
            return
    }

    public static java.util.Date parse(java.lang.String r19, java.text.ParsePosition r20) throws java.text.ParseException {
            r1 = r19
            r2 = r20
            java.lang.String r0 = "Mismatching time zone indicator: "
            java.lang.String r3 = "GMT"
            java.lang.String r4 = "Invalid time zone indicator '"
            int r5 = r20.getIndex()     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            int r6 = r5 + 4
            int r5 = parseInt(r1, r5, r6)     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            r7 = 45
            boolean r8 = checkOffset(r1, r6, r7)     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            if (r8 == 0) goto L1e
            int r6 = r6 + 1
        L1e:
            int r8 = r6 + 2
            int r6 = parseInt(r1, r6, r8)     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            boolean r9 = checkOffset(r1, r8, r7)     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            if (r9 == 0) goto L2c
            int r8 = r8 + 1
        L2c:
            int r9 = r8 + 2
            int r8 = parseInt(r1, r8, r9)     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            r10 = 84
            boolean r10 = checkOffset(r1, r9, r10)     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            r11 = 0
            r12 = 1
            if (r10 != 0) goto L53
            int r13 = r19.length()     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            if (r13 > r9) goto L53
            java.util.GregorianCalendar r0 = new java.util.GregorianCalendar     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            int r6 = r6 - r12
            r0.<init>(r5, r6, r8)     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            r0.setLenient(r11)     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            r2.setIndex(r9)     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            java.util.Date r0 = r0.getTime()     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            return r0
        L53:
            r13 = 43
            r14 = 90
            if (r10 == 0) goto Lce
            int r9 = r9 + 1
            int r10 = r9 + 2
            int r9 = parseInt(r1, r9, r10)     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            r11 = 58
            boolean r16 = checkOffset(r1, r10, r11)     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            if (r16 == 0) goto L6b
            int r10 = r10 + 1
        L6b:
            int r15 = r10 + 2
            int r10 = parseInt(r1, r10, r15)     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            boolean r11 = checkOffset(r1, r15, r11)     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            if (r11 == 0) goto L79
            int r15 = r15 + 1
        L79:
            int r11 = r19.length()     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            if (r11 <= r15) goto Lcb
            char r11 = r1.charAt(r15)     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            if (r11 == r14) goto Lcb
            if (r11 == r13) goto Lcb
            if (r11 == r7) goto Lcb
            int r11 = r15 + 2
            int r15 = parseInt(r1, r15, r11)     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            r7 = 59
            if (r15 <= r7) goto L99
            r7 = 63
            if (r15 >= r7) goto L99
            r15 = 59
        L99:
            r7 = 46
            boolean r7 = checkOffset(r1, r11, r7)     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            if (r7 == 0) goto Lc7
            int r11 = r11 + 1
            int r7 = r11 + 1
            int r7 = indexOfNonDigit(r1, r7)     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            int r13 = r11 + 3
            int r13 = java.lang.Math.min(r7, r13)     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            int r17 = parseInt(r1, r11, r13)     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            int r13 = r13 - r11
            if (r13 == r12) goto Lbd
            r11 = 2
            if (r13 == r11) goto Lba
            goto Lbf
        Lba:
            int r17 = r17 * 10
            goto Lbf
        Lbd:
            int r17 = r17 * 100
        Lbf:
            r11 = r17
            r18 = r9
            r9 = r7
            r7 = r18
            goto Ld2
        Lc7:
            r7 = r9
            r9 = r11
            r11 = 0
            goto Ld2
        Lcb:
            r7 = r9
            r9 = r15
            goto Ld0
        Lce:
            r7 = 0
            r10 = 0
        Ld0:
            r11 = 0
            r15 = 0
        Ld2:
            int r13 = r19.length()     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            if (r13 <= r9) goto L1bc
            char r13 = r1.charAt(r9)     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            r12 = 5
            if (r13 != r14) goto Le5
            java.util.TimeZone r0 = com.google.gson.internal.bind.util.ISO8601Utils.TIMEZONE_UTC     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            r3 = 1
            int r9 = r9 + r3
            goto L18a
        Le5:
            r14 = 43
            if (r13 == r14) goto L107
            r14 = 45
            if (r13 != r14) goto Lee
            goto L107
        Lee:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            r3.<init>(r4)     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            java.lang.StringBuilder r3 = r3.append(r13)     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            java.lang.String r4 = "'"
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            java.lang.String r3 = r3.toString()     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            r0.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            throw r0     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
        L107:
            java.lang.String r4 = r1.substring(r9)     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            int r13 = r4.length()     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            if (r13 < r12) goto L112
            goto L125
        L112:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            r13.<init>()     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            java.lang.StringBuilder r4 = r13.append(r4)     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            java.lang.String r13 = "00"
            java.lang.StringBuilder r4 = r4.append(r13)     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            java.lang.String r4 = r4.toString()     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
        L125:
            int r13 = r4.length()     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            int r9 = r9 + r13
            java.lang.String r13 = "+0000"
            boolean r13 = r13.equals(r4)     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            if (r13 != 0) goto L188
            java.lang.String r13 = "+00:00"
            boolean r13 = r13.equals(r4)     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            if (r13 == 0) goto L13b
            goto L188
        L13b:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            r13.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            java.lang.StringBuilder r3 = r13.append(r4)     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            java.lang.String r3 = r3.toString()     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            java.util.TimeZone r4 = java.util.TimeZone.getTimeZone(r3)     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            java.lang.String r13 = r4.getID()     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            boolean r14 = r13.equals(r3)     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            if (r14 != 0) goto L186
            java.lang.String r14 = ":"
            java.lang.String r12 = ""
            java.lang.String r12 = r13.replace(r14, r12)     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            boolean r12 = r12.equals(r3)     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            if (r12 == 0) goto L165
            goto L186
        L165:
            java.lang.IndexOutOfBoundsException r5 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            r6.<init>(r0)     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            java.lang.StringBuilder r0 = r6.append(r3)     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            java.lang.String r3 = " given, resolves to "
            java.lang.StringBuilder r0 = r0.append(r3)     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            java.lang.String r3 = r4.getID()     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            java.lang.StringBuilder r0 = r0.append(r3)     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            java.lang.String r0 = r0.toString()     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            r5.<init>(r0)     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            throw r5     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
        L186:
            r0 = r4
            goto L18a
        L188:
            java.util.TimeZone r0 = com.google.gson.internal.bind.util.ISO8601Utils.TIMEZONE_UTC     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
        L18a:
            java.util.GregorianCalendar r3 = new java.util.GregorianCalendar     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            r3.<init>(r0)     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            r0 = 0
            r3.setLenient(r0)     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            r0 = 1
            r3.set(r0, r5)     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            int r6 = r6 - r0
            r0 = 2
            r3.set(r0, r6)     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            r0 = 5
            r3.set(r0, r8)     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            r0 = 11
            r3.set(r0, r7)     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            r0 = 12
            r3.set(r0, r10)     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            r0 = 13
            r3.set(r0, r15)     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            r0 = 14
            r3.set(r0, r11)     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            r2.setIndex(r9)     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            java.util.Date r0 = r3.getTime()     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            return r0
        L1bc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            java.lang.String r3 = "No time zone indicator"
            r0.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
            throw r0     // Catch: java.lang.IllegalArgumentException -> L1c4 java.lang.NumberFormatException -> L1c6 java.lang.IndexOutOfBoundsException -> L1c8
        L1c4:
            r0 = move-exception
            goto L1c9
        L1c6:
            r0 = move-exception
            goto L1c9
        L1c8:
            r0 = move-exception
        L1c9:
            if (r1 != 0) goto L1cd
            r1 = 0
            goto L1e2
        L1cd:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "\""
            r3.<init>(r4)
            java.lang.StringBuilder r1 = r3.append(r1)
            r3 = 34
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
        L1e2:
            java.lang.String r3 = r0.getMessage()
            if (r3 == 0) goto L1ee
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L20b
        L1ee:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "("
            r3.<init>(r4)
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = ")"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
        L20b:
            java.text.ParseException r4 = new java.text.ParseException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Failed to parse date ["
            r5.<init>(r6)
            java.lang.StringBuilder r1 = r5.append(r1)
            java.lang.String r5 = "]: "
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            int r2 = r20.getIndex()
            r4.<init>(r1, r2)
            r4.initCause(r0)
            throw r4
    }

    private static int parseInt(java.lang.String r5, int r6, int r7) throws java.lang.NumberFormatException {
            if (r6 < 0) goto L63
            int r0 = r5.length()
            if (r7 > r0) goto L63
            if (r6 > r7) goto L63
            java.lang.String r0 = "Invalid number: "
            r1 = 10
            if (r6 >= r7) goto L35
            int r2 = r6 + 1
            char r3 = r5.charAt(r6)
            int r3 = java.lang.Character.digit(r3, r1)
            if (r3 < 0) goto L1e
            int r3 = -r3
            goto L37
        L1e:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            java.lang.String r5 = r5.substring(r6, r7)
            java.lang.StringBuilder r5 = r2.append(r5)
            java.lang.String r5 = r5.toString()
            r1.<init>(r5)
            throw r1
        L35:
            r3 = 0
            r2 = r6
        L37:
            if (r2 >= r7) goto L61
            int r4 = r2 + 1
            char r2 = r5.charAt(r2)
            int r2 = java.lang.Character.digit(r2, r1)
            if (r2 < 0) goto L4a
            int r3 = r3 * 10
            int r3 = r3 - r2
            r2 = r4
            goto L37
        L4a:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            java.lang.String r5 = r5.substring(r6, r7)
            java.lang.StringBuilder r5 = r2.append(r5)
            java.lang.String r5 = r5.toString()
            r1.<init>(r5)
            throw r1
        L61:
            int r5 = -r3
            return r5
        L63:
            java.lang.NumberFormatException r6 = new java.lang.NumberFormatException
            r6.<init>(r5)
            throw r6
    }
}
