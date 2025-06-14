package androidx.core.graphics;

/* loaded from: classes.dex */
public final class ColorUtils {
    private static final int MIN_ALPHA_SEARCH_MAX_ITERATIONS = 10;
    private static final int MIN_ALPHA_SEARCH_PRECISION = 1;
    private static final java.lang.ThreadLocal<double[]> TEMP_ARRAY = null;
    private static final double XYZ_EPSILON = 0.008856d;
    private static final double XYZ_KAPPA = 903.3d;
    private static final double XYZ_WHITE_REFERENCE_X = 95.047d;
    private static final double XYZ_WHITE_REFERENCE_Y = 100.0d;
    private static final double XYZ_WHITE_REFERENCE_Z = 108.883d;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            androidx.core.graphics.ColorUtils.TEMP_ARRAY = r0
            return
    }

    private ColorUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int HSLToColor(float[] r6) {
            r0 = 0
            r1 = r6[r0]
            r2 = 1
            r2 = r6[r2]
            r3 = 2
            r6 = r6[r3]
            r3 = 1073741824(0x40000000, float:2.0)
            float r4 = r6 * r3
            r5 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 - r5
            float r4 = java.lang.Math.abs(r4)
            float r4 = r5 - r4
            float r4 = r4 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 * r4
            float r6 = r6 - r2
            r2 = 1114636288(0x42700000, float:60.0)
            float r2 = r1 / r2
            float r2 = r2 % r3
            float r2 = r2 - r5
            float r2 = java.lang.Math.abs(r2)
            float r5 = r5 - r2
            float r5 = r5 * r4
            int r1 = (int) r1
            int r1 = r1 / 60
            r2 = 1132396544(0x437f0000, float:255.0)
            switch(r1) {
                case 0: goto L91;
                case 1: goto L7f;
                case 2: goto L6c;
                case 3: goto L59;
                case 4: goto L46;
                case 5: goto L33;
                case 6: goto L33;
                default: goto L2f;
            }
        L2f:
            r6 = r0
            r1 = r6
            r3 = r1
            goto La2
        L33:
            float r4 = r4 + r6
            float r4 = r4 * r2
            int r1 = java.lang.Math.round(r4)
            float r3 = r6 * r2
            int r3 = java.lang.Math.round(r3)
            float r5 = r5 + r6
            float r5 = r5 * r2
            int r6 = java.lang.Math.round(r5)
            goto La2
        L46:
            float r5 = r5 + r6
            float r5 = r5 * r2
            int r1 = java.lang.Math.round(r5)
            float r3 = r6 * r2
            int r3 = java.lang.Math.round(r3)
            float r4 = r4 + r6
            float r4 = r4 * r2
            int r6 = java.lang.Math.round(r4)
            goto La2
        L59:
            float r1 = r6 * r2
            int r1 = java.lang.Math.round(r1)
            float r5 = r5 + r6
            float r5 = r5 * r2
            int r3 = java.lang.Math.round(r5)
            float r4 = r4 + r6
            float r4 = r4 * r2
            int r6 = java.lang.Math.round(r4)
            goto La2
        L6c:
            float r1 = r6 * r2
            int r1 = java.lang.Math.round(r1)
            float r4 = r4 + r6
            float r4 = r4 * r2
            int r3 = java.lang.Math.round(r4)
            float r5 = r5 + r6
            float r5 = r5 * r2
            int r6 = java.lang.Math.round(r5)
            goto La2
        L7f:
            float r5 = r5 + r6
            float r5 = r5 * r2
            int r1 = java.lang.Math.round(r5)
            float r4 = r4 + r6
            float r4 = r4 * r2
            int r3 = java.lang.Math.round(r4)
            float r6 = r6 * r2
            int r6 = java.lang.Math.round(r6)
            goto La2
        L91:
            float r4 = r4 + r6
            float r4 = r4 * r2
            int r1 = java.lang.Math.round(r4)
            float r5 = r5 + r6
            float r5 = r5 * r2
            int r3 = java.lang.Math.round(r5)
            float r6 = r6 * r2
            int r6 = java.lang.Math.round(r6)
        La2:
            r2 = 255(0xff, float:3.57E-43)
            int r1 = constrain(r1, r0, r2)
            int r3 = constrain(r3, r0, r2)
            int r6 = constrain(r6, r0, r2)
            int r6 = android.graphics.Color.rgb(r1, r3, r6)
            return r6
    }

    public static int LABToColor(double r8, double r10, double r12) {
            double[] r7 = getTempDouble3Array()
            r0 = r8
            r2 = r10
            r4 = r12
            r6 = r7
            LABToXYZ(r0, r2, r4, r6)
            r8 = 0
            r0 = r7[r8]
            r8 = 1
            r2 = r7[r8]
            r8 = 2
            r4 = r7[r8]
            int r8 = XYZToColor(r0, r2, r4)
            return r8
    }

    public static void LABToXYZ(double r19, double r21, double r23, double[] r25) {
            r0 = 4625196817309499392(0x4030000000000000, double:16.0)
            double r2 = r19 + r0
            r4 = 4637863191261478912(0x405d000000000000, double:116.0)
            double r2 = r2 / r4
            r6 = 4647503709213818880(0x407f400000000000, double:500.0)
            double r6 = r21 / r6
            double r6 = r6 + r2
            r8 = 4641240890982006784(0x4069000000000000, double:200.0)
            double r8 = r23 / r8
            double r8 = r2 - r8
            r10 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r12 = java.lang.Math.pow(r6, r10)
            r14 = 4576258758203452558(0x3f82231832fcac8e, double:0.008856)
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            r17 = 4651156726645941862(0x408c3a6666666666, double:903.3)
            if (r16 <= 0) goto L2a
            goto L2e
        L2a:
            double r6 = r6 * r4
            double r6 = r6 - r0
            double r12 = r6 / r17
        L2e:
            r6 = 4620692795244483847(0x401fff9da4c11507, double:7.9996247999999985)
            int r6 = (r19 > r6 ? 1 : (r19 == r6 ? 0 : -1))
            if (r6 <= 0) goto L3c
            double r2 = java.lang.Math.pow(r2, r10)
            goto L3e
        L3c:
            double r2 = r19 / r17
        L3e:
            double r6 = java.lang.Math.pow(r8, r10)
            int r10 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r10 <= 0) goto L47
            goto L4b
        L47:
            double r8 = r8 * r4
            double r8 = r8 - r0
            double r6 = r8 / r17
        L4b:
            r0 = 4636388754964724318(0x4057c3020c49ba5e, double:95.047)
            double r12 = r12 * r0
            r0 = 0
            r25[r0] = r12
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r2 = r2 * r0
            r0 = 1
            r25[r0] = r2
            r0 = 4637362376909166477(0x405b3883126e978d, double:108.883)
            double r6 = r6 * r0
            r0 = 2
            r25[r0] = r6
            return
    }

    public static void RGBToHSL(int r7, int r8, int r9, float[] r10) {
            float r7 = (float) r7
            r0 = 1132396544(0x437f0000, float:255.0)
            float r7 = r7 / r0
            float r8 = (float) r8
            float r8 = r8 / r0
            float r9 = (float) r9
            float r9 = r9 / r0
            float r0 = java.lang.Math.max(r8, r9)
            float r0 = java.lang.Math.max(r7, r0)
            float r1 = java.lang.Math.min(r8, r9)
            float r1 = java.lang.Math.min(r7, r1)
            float r2 = r0 - r1
            float r3 = r0 + r1
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            if (r1 != 0) goto L29
            r8 = r6
            r2 = r8
            goto L4a
        L29:
            int r1 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r1 != 0) goto L33
            float r8 = r8 - r9
            float r8 = r8 / r2
            r7 = 1086324736(0x40c00000, float:6.0)
            float r8 = r8 % r7
            goto L41
        L33:
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 != 0) goto L3c
            float r9 = r9 - r7
            float r9 = r9 / r2
            float r8 = r9 + r4
            goto L41
        L3c:
            float r7 = r7 - r8
            float r7 = r7 / r2
            r8 = 1082130432(0x40800000, float:4.0)
            float r8 = r8 + r7
        L41:
            float r4 = r4 * r3
            float r4 = r4 - r5
            float r7 = java.lang.Math.abs(r4)
            float r7 = r5 - r7
            float r2 = r2 / r7
        L4a:
            r7 = 1114636288(0x42700000, float:60.0)
            float r8 = r8 * r7
            r7 = 1135869952(0x43b40000, float:360.0)
            float r8 = r8 % r7
            int r9 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r9 >= 0) goto L55
            float r8 = r8 + r7
        L55:
            r9 = 0
            float r7 = constrain(r8, r6, r7)
            r10[r9] = r7
            r7 = 1
            float r8 = constrain(r2, r6, r5)
            r10[r7] = r8
            r7 = 2
            float r8 = constrain(r3, r6, r5)
            r10[r7] = r8
            return
    }

    public static void RGBToLAB(int r7, int r8, int r9, double[] r10) {
            RGBToXYZ(r7, r8, r9, r10)
            r7 = 0
            r0 = r10[r7]
            r7 = 1
            r2 = r10[r7]
            r7 = 2
            r4 = r10[r7]
            r6 = r10
            XYZToLAB(r0, r2, r4, r6)
            return
    }

    public static void RGBToXYZ(int r16, int r17, int r18, double[] r19) {
            r0 = r19
            int r1 = r0.length
            r2 = 3
            if (r1 != r2) goto Lae
            r1 = r16
            double r1 = (double) r1
            r3 = 4643176031446892544(0x406fe00000000000, double:255.0)
            double r1 = r1 / r3
            r5 = 4585990280393462802(0x3fa4b5dcc63f1412, double:0.04045)
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            r8 = 4623462931452961751(0x4029d70a3d70a3d7, double:12.92)
            r10 = 4612586738352862003(0x4003333333333333, double:2.4)
            r12 = 4607430116779522785(0x3ff0e147ae147ae1, double:1.055)
            r14 = 4588087156379966505(0x3fac28f5c28f5c29, double:0.055)
            if (r7 >= 0) goto L2e
            double r1 = r1 / r8
            goto L34
        L2e:
            double r1 = r1 + r14
            double r1 = r1 / r12
            double r1 = java.lang.Math.pow(r1, r10)
        L34:
            r7 = r17
            double r10 = (double) r7
            double r10 = r10 / r3
            int r7 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r7 >= 0) goto L3e
            double r10 = r10 / r8
            goto L49
        L3e:
            double r10 = r10 + r14
            double r10 = r10 / r12
            r12 = 4612586738352862003(0x4003333333333333, double:2.4)
            double r10 = java.lang.Math.pow(r10, r12)
        L49:
            r7 = r18
            double r12 = (double) r7
            double r12 = r12 / r3
            int r3 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r3 >= 0) goto L53
            double r12 = r12 / r8
            goto L63
        L53:
            double r12 = r12 + r14
            r3 = 4607430116779522785(0x3ff0e147ae147ae1, double:1.055)
            double r12 = r12 / r3
            r3 = 4612586738352862003(0x4003333333333333, double:2.4)
            double r12 = java.lang.Math.pow(r12, r3)
        L63:
            r3 = 4601100757863216290(0x3fda64c2f837b4a2, double:0.4124)
            double r3 = r3 * r1
            r5 = 4600113568824896677(0x3fd6e2eb1c432ca5, double:0.3576)
            double r5 = r5 * r10
            double r3 = r3 + r5
            r5 = 4595671218152458420(0x3fc71a9fbe76c8b4, double:0.1805)
            double r5 = r5 * r12
            double r3 = r3 + r5
            r5 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r3 = r3 * r5
            r7 = 0
            r0[r7] = r3
            r3 = 4596827742536767164(0x3fcb367a0f9096bc, double:0.2126)
            double r3 = r3 * r1
            r7 = 4604617168452267173(0x3fe6e2eb1c432ca5, double:0.7152)
            double r7 = r7 * r10
            double r3 = r3 + r7
            r7 = 4589866978952703325(0x3fb27bb2fec56d5d, double:0.0722)
            double r7 = r7 * r12
            double r3 = r3 + r7
            double r3 = r3 * r5
            r7 = 1
            r0[r7] = r3
            r3 = 4581220067668151973(0x3f93c36113404ea5, double:0.0193)
            double r1 = r1 * r3
            r3 = 4593253685872485938(0x3fbe83e425aee632, double:0.1192)
            double r10 = r10 * r3
            double r1 = r1 + r10
            r3 = 4606736562436907729(0x3fee6a7ef9db22d1, double:0.9505)
            double r12 = r12 * r3
            double r1 = r1 + r12
            double r1 = r1 * r5
            r3 = 2
            r0[r3] = r1
            return
        Lae:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "outXyz must have a length of 3."
            r0.<init>(r1)
            throw r0
    }

    public static int XYZToColor(double r17, double r19, double r21) {
            r0 = 4614479601276245823(0x4009ecbfb15b573f, double:3.2406)
            double r0 = r0 * r17
            r2 = -4613770284334934970(0xbff8985f06f69446, double:-1.5372)
            double r2 = r2 * r19
            double r0 = r0 + r2
            r2 = -4620718437840042171(0xbfdfe90ff9724745, double:-0.4986)
            double r2 = r2 * r21
            double r0 = r0 + r2
            r2 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r0 = r0 / r2
            r4 = -4616469741951580845(0xbfef013a92a30553, double:-0.9689)
            double r4 = r4 * r17
            r6 = 4611126671353668488(0x3ffe0346dc5d6388, double:1.8758)
            double r6 = r6 * r19
            double r4 = r4 + r6
            r6 = 4586141601340942451(0x3fa53f7ced916873, double:0.0415)
            double r6 = r6 * r21
            double r4 = r4 + r6
            double r4 = r4 / r2
            r6 = 4588188037011619604(0x3fac84b5dcc63f14, double:0.0557)
            double r6 = r6 * r17
            r8 = -4626854141972371735(0xbfca1cac083126e9, double:-0.204)
            double r8 = r8 * r19
            double r6 = r6 + r8
            r8 = 4607439123978777526(0x3ff0e978d4fdf3b6, double:1.057)
            double r8 = r8 * r21
            double r6 = r6 + r8
            double r6 = r6 / r2
            r2 = 4569365555819558681(0x3f69a5c37387b719, double:0.0031308)
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r9 = 4588087156379966505(0x3fac28f5c28f5c29, double:0.055)
            r11 = 4601177619296856747(0x3fdaaaaaaaaaaaab, double:0.4166666666666667)
            r13 = 4607430116779522785(0x3ff0e147ae147ae1, double:1.055)
            r15 = 4623462931452961751(0x4029d70a3d70a3d7, double:12.92)
            if (r8 <= 0) goto L6e
            double r0 = java.lang.Math.pow(r0, r11)
            double r0 = r0 * r13
            double r0 = r0 - r9
            goto L6f
        L6e:
            double r0 = r0 * r15
        L6f:
            int r8 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r8 <= 0) goto L7a
            double r4 = java.lang.Math.pow(r4, r11)
            double r4 = r4 * r13
            double r4 = r4 - r9
            goto L7b
        L7a:
            double r4 = r4 * r15
        L7b:
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 <= 0) goto L86
            double r2 = java.lang.Math.pow(r6, r11)
            double r2 = r2 * r13
            double r2 = r2 - r9
            goto L88
        L86:
            double r2 = r6 * r15
        L88:
            r6 = 4643176031446892544(0x406fe00000000000, double:255.0)
            double r0 = r0 * r6
            long r0 = java.lang.Math.round(r0)
            int r0 = (int) r0
            r1 = 0
            r8 = 255(0xff, float:3.57E-43)
            int r0 = constrain(r0, r1, r8)
            double r4 = r4 * r6
            long r4 = java.lang.Math.round(r4)
            int r4 = (int) r4
            int r4 = constrain(r4, r1, r8)
            double r2 = r2 * r6
            long r2 = java.lang.Math.round(r2)
            int r2 = (int) r2
            int r1 = constrain(r2, r1, r8)
            int r0 = android.graphics.Color.rgb(r0, r4, r1)
            return r0
    }

    public static void XYZToLAB(double r4, double r6, double r8, double[] r10) {
            int r0 = r10.length
            r1 = 3
            if (r0 != r1) goto L40
            r0 = 4636388754964724318(0x4057c3020c49ba5e, double:95.047)
            double r4 = r4 / r0
            double r4 = pivotXyzComponent(r4)
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r6 = r6 / r0
            double r6 = pivotXyzComponent(r6)
            r0 = 4637362376909166477(0x405b3883126e978d, double:108.883)
            double r8 = r8 / r0
            double r8 = pivotXyzComponent(r8)
            r0 = 4637863191261478912(0x405d000000000000, double:116.0)
            double r0 = r0 * r6
            r2 = 4625196817309499392(0x4030000000000000, double:16.0)
            double r0 = r0 - r2
            r2 = 0
            double r0 = java.lang.Math.max(r2, r0)
            r2 = 0
            r10[r2] = r0
            r0 = 4647503709213818880(0x407f400000000000, double:500.0)
            double r4 = r4 - r6
            double r4 = r4 * r0
            r0 = 1
            r10[r0] = r4
            r4 = 4641240890982006784(0x4069000000000000, double:200.0)
            double r6 = r6 - r8
            double r6 = r6 * r4
            r4 = 2
            r10[r4] = r6
            return
        L40:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "outLab must have a length of 3."
            r4.<init>(r5)
            throw r4
    }

    public static int blendARGB(int r5, int r6, float r7) {
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r7
            int r1 = android.graphics.Color.alpha(r5)
            float r1 = (float) r1
            float r1 = r1 * r0
            int r2 = android.graphics.Color.alpha(r6)
            float r2 = (float) r2
            float r2 = r2 * r7
            float r1 = r1 + r2
            int r2 = android.graphics.Color.red(r5)
            float r2 = (float) r2
            float r2 = r2 * r0
            int r3 = android.graphics.Color.red(r6)
            float r3 = (float) r3
            float r3 = r3 * r7
            float r2 = r2 + r3
            int r3 = android.graphics.Color.green(r5)
            float r3 = (float) r3
            float r3 = r3 * r0
            int r4 = android.graphics.Color.green(r6)
            float r4 = (float) r4
            float r4 = r4 * r7
            float r3 = r3 + r4
            int r5 = android.graphics.Color.blue(r5)
            float r5 = (float) r5
            float r5 = r5 * r0
            int r6 = android.graphics.Color.blue(r6)
            float r6 = (float) r6
            float r6 = r6 * r7
            float r5 = r5 + r6
            int r6 = (int) r1
            int r7 = (int) r2
            int r0 = (int) r3
            int r5 = (int) r5
            int r5 = android.graphics.Color.argb(r6, r7, r0, r5)
            return r5
    }

    public static void blendHSL(float[] r4, float[] r5, float r6, float[] r7) {
            int r0 = r7.length
            r1 = 3
            if (r0 != r1) goto L27
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r6
            r1 = 0
            r2 = r4[r1]
            r3 = r5[r1]
            float r2 = circularInterpolate(r2, r3, r6)
            r7[r1] = r2
            r1 = 1
            r2 = r4[r1]
            float r2 = r2 * r0
            r3 = r5[r1]
            float r3 = r3 * r6
            float r2 = r2 + r3
            r7[r1] = r2
            r1 = 2
            r4 = r4[r1]
            float r4 = r4 * r0
            r5 = r5[r1]
            float r5 = r5 * r6
            float r4 = r4 + r5
            r7[r1] = r4
            return
        L27:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "result must have a length of 3."
            r4.<init>(r5)
            throw r4
    }

    public static void blendLAB(double[] r7, double[] r8, double r9, double[] r11) {
            int r0 = r11.length
            r1 = 3
            if (r0 != r1) goto L26
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 - r9
            r2 = 0
            r3 = r7[r2]
            double r3 = r3 * r0
            r5 = r8[r2]
            double r5 = r5 * r9
            double r3 = r3 + r5
            r11[r2] = r3
            r2 = 1
            r3 = r7[r2]
            double r3 = r3 * r0
            r5 = r8[r2]
            double r5 = r5 * r9
            double r3 = r3 + r5
            r11[r2] = r3
            r2 = 2
            r3 = r7[r2]
            double r3 = r3 * r0
            r7 = r8[r2]
            double r7 = r7 * r9
            double r3 = r3 + r7
            r11[r2] = r3
            return
        L26:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "outResult must have a length of 3."
            r7.<init>(r8)
            throw r7
    }

    public static double calculateContrast(int r4, int r5) {
            int r0 = android.graphics.Color.alpha(r5)
            r1 = 255(0xff, float:3.57E-43)
            if (r0 != r1) goto L2b
            int r0 = android.graphics.Color.alpha(r4)
            if (r0 >= r1) goto L12
            int r4 = compositeColors(r4, r5)
        L12:
            double r0 = calculateLuminance(r4)
            r2 = 4587366580439587226(0x3fa999999999999a, double:0.05)
            double r0 = r0 + r2
            double r4 = calculateLuminance(r5)
            double r4 = r4 + r2
            double r2 = java.lang.Math.max(r0, r4)
            double r4 = java.lang.Math.min(r0, r4)
            double r2 = r2 / r4
            return r2
        L2b:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "background can not be translucent: #"
            r0.<init>(r1)
            java.lang.String r5 = java.lang.Integer.toHexString(r5)
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    public static double calculateLuminance(int r5) {
            double[] r0 = getTempDouble3Array()
            colorToXYZ(r5, r0)
            r5 = 1
            r1 = r0[r5]
            r3 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r1 = r1 / r3
            return r1
    }

    public static int calculateMinimumAlpha(int r8, int r9, float r10) {
            int r0 = android.graphics.Color.alpha(r9)
            r1 = 255(0xff, float:3.57E-43)
            if (r0 != r1) goto L39
            int r0 = setAlphaComponent(r8, r1)
            double r2 = calculateContrast(r0, r9)
            double r4 = (double) r10
            int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r10 >= 0) goto L17
            r8 = -1
            return r8
        L17:
            r10 = 0
            r0 = r10
        L19:
            r2 = 10
            if (r10 > r2) goto L38
            int r2 = r1 - r0
            r3 = 1
            if (r2 <= r3) goto L38
            int r2 = r0 + r1
            int r2 = r2 / 2
            int r3 = setAlphaComponent(r8, r2)
            double r6 = calculateContrast(r3, r9)
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 >= 0) goto L34
            r0 = r2
            goto L35
        L34:
            r1 = r2
        L35:
            int r10 = r10 + 1
            goto L19
        L38:
            return r1
        L39:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "background can not be translucent: #"
            r10.<init>(r0)
            java.lang.String r9 = java.lang.Integer.toHexString(r9)
            java.lang.StringBuilder r9 = r10.append(r9)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
    }

    static float circularInterpolate(float r2, float r3, float r4) {
            float r0 = r3 - r2
            float r0 = java.lang.Math.abs(r0)
            r1 = 1127481344(0x43340000, float:180.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r1 = 1135869952(0x43b40000, float:360.0)
            if (r0 <= 0) goto L15
            int r0 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r0 <= 0) goto L14
            float r2 = r2 + r1
            goto L15
        L14:
            float r3 = r3 + r1
        L15:
            float r3 = r3 - r2
            float r3 = r3 * r4
            float r2 = r2 + r3
            float r2 = r2 % r1
            return r2
    }

    public static void colorToHSL(int r2, float[] r3) {
            int r0 = android.graphics.Color.red(r2)
            int r1 = android.graphics.Color.green(r2)
            int r2 = android.graphics.Color.blue(r2)
            RGBToHSL(r0, r1, r2, r3)
            return
    }

    public static void colorToLAB(int r2, double[] r3) {
            int r0 = android.graphics.Color.red(r2)
            int r1 = android.graphics.Color.green(r2)
            int r2 = android.graphics.Color.blue(r2)
            RGBToLAB(r0, r1, r2, r3)
            return
    }

    public static void colorToXYZ(int r2, double[] r3) {
            int r0 = android.graphics.Color.red(r2)
            int r1 = android.graphics.Color.green(r2)
            int r2 = android.graphics.Color.blue(r2)
            RGBToXYZ(r0, r1, r2, r3)
            return
    }

    private static int compositeAlpha(int r0, int r1) {
            int r1 = 255 - r1
            int r0 = 255 - r0
            int r1 = r1 * r0
            int r1 = r1 / 255
            int r0 = 255 - r1
            return r0
    }

    public static int compositeColors(int r6, int r7) {
            int r0 = android.graphics.Color.alpha(r7)
            int r1 = android.graphics.Color.alpha(r6)
            int r2 = compositeAlpha(r1, r0)
            int r3 = android.graphics.Color.red(r6)
            int r4 = android.graphics.Color.red(r7)
            int r3 = compositeComponent(r3, r1, r4, r0, r2)
            int r4 = android.graphics.Color.green(r6)
            int r5 = android.graphics.Color.green(r7)
            int r4 = compositeComponent(r4, r1, r5, r0, r2)
            int r6 = android.graphics.Color.blue(r6)
            int r7 = android.graphics.Color.blue(r7)
            int r6 = compositeComponent(r6, r1, r7, r0, r2)
            int r6 = android.graphics.Color.argb(r2, r3, r4, r6)
            return r6
    }

    public static android.graphics.Color compositeColors(android.graphics.Color r7, android.graphics.Color r8) {
            android.graphics.ColorSpace$Model r0 = r7.getModel()
            android.graphics.ColorSpace$Model r1 = r8.getModel()
            boolean r0 = java.util.Objects.equals(r0, r1)
            if (r0 == 0) goto L62
            android.graphics.ColorSpace r0 = r8.getColorSpace()
            android.graphics.ColorSpace r1 = r7.getColorSpace()
            boolean r0 = java.util.Objects.equals(r0, r1)
            if (r0 == 0) goto L1d
            goto L25
        L1d:
            android.graphics.ColorSpace r0 = r8.getColorSpace()
            android.graphics.Color r7 = r7.convert(r0)
        L25:
            float[] r0 = r7.getComponents()
            float[] r1 = r8.getComponents()
            float r7 = r7.alpha()
            float r2 = r8.alpha()
            r3 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 - r7
            float r2 = r2 * r3
            int r3 = r8.getComponentCount()
            int r3 = r3 + (-1)
            float r4 = r7 + r2
            r1[r3] = r4
            r5 = 0
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 <= 0) goto L4a
            float r7 = r7 / r4
            float r2 = r2 / r4
        L4a:
            r4 = 0
        L4b:
            if (r4 >= r3) goto L59
            r5 = r0[r4]
            float r5 = r5 * r7
            r6 = r1[r4]
            float r6 = r6 * r2
            float r5 = r5 + r6
            r1[r4] = r5
            int r4 = r4 + 1
            goto L4b
        L59:
            android.graphics.ColorSpace r7 = r8.getColorSpace()
            android.graphics.Color r7 = android.graphics.Color.valueOf(r1, r7)
            return r7
        L62:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Color models must match ("
            r1.<init>(r2)
            android.graphics.ColorSpace$Model r7 = r7.getModel()
            java.lang.StringBuilder r7 = r1.append(r7)
            java.lang.String r1 = " vs. "
            java.lang.StringBuilder r7 = r7.append(r1)
            android.graphics.ColorSpace$Model r8 = r8.getModel()
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r8 = ")"
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            r0.<init>(r7)
            throw r0
    }

    private static int compositeComponent(int r0, int r1, int r2, int r3, int r4) {
            if (r4 != 0) goto L4
            r0 = 0
            return r0
        L4:
            int r0 = r0 * 255
            int r0 = r0 * r1
            int r2 = r2 * r3
            int r1 = 255 - r1
            int r2 = r2 * r1
            int r0 = r0 + r2
            int r4 = r4 * 255
            int r0 = r0 / r4
            return r0
    }

    private static float constrain(float r1, float r2, float r3) {
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 >= 0) goto L6
            r1 = r2
            goto Lb
        L6:
            int r2 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r2 <= 0) goto Lb
            r1 = r3
        Lb:
            return r1
    }

    private static int constrain(int r0, int r1, int r2) {
            if (r0 >= r1) goto L4
            r0 = r1
            goto L7
        L4:
            if (r0 <= r2) goto L7
            r0 = r2
        L7:
            return r0
    }

    public static double distanceEuclidean(double[] r9, double[] r10) {
            r0 = 0
            r1 = r9[r0]
            r3 = r10[r0]
            double r1 = r1 - r3
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = java.lang.Math.pow(r1, r3)
            r2 = 1
            r5 = r9[r2]
            r7 = r10[r2]
            double r5 = r5 - r7
            double r5 = java.lang.Math.pow(r5, r3)
            double r0 = r0 + r5
            r2 = 2
            r5 = r9[r2]
            r9 = r10[r2]
            double r5 = r5 - r9
            double r9 = java.lang.Math.pow(r5, r3)
            double r0 = r0 + r9
            double r9 = java.lang.Math.sqrt(r0)
            return r9
    }

    private static double[] getTempDouble3Array() {
            java.lang.ThreadLocal<double[]> r0 = androidx.core.graphics.ColorUtils.TEMP_ARRAY
            java.lang.Object r1 = r0.get()
            double[] r1 = (double[]) r1
            if (r1 != 0) goto L10
            r1 = 3
            double[] r1 = new double[r1]
            r0.set(r1)
        L10:
            return r1
    }

    private static double pivotXyzComponent(double r2) {
            r0 = 4576258758203452558(0x3f82231832fcac8e, double:0.008856)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L13
            r0 = 4599676419421066581(0x3fd5555555555555, double:0.3333333333333333)
            double r2 = java.lang.Math.pow(r2, r0)
            goto L1f
        L13:
            r0 = 4651156726645941862(0x408c3a6666666666, double:903.3)
            double r2 = r2 * r0
            r0 = 4625196817309499392(0x4030000000000000, double:16.0)
            double r2 = r2 + r0
            r0 = 4637863191261478912(0x405d000000000000, double:116.0)
            double r2 = r2 / r0
        L1f:
            return r2
    }

    public static int setAlphaComponent(int r1, int r2) {
            if (r2 < 0) goto Le
            r0 = 255(0xff, float:3.57E-43)
            if (r2 > r0) goto Le
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r0
            int r2 = r2 << 24
            r1 = r1 | r2
            return r1
        Le:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "alpha must be between 0 and 255."
            r1.<init>(r2)
            throw r1
    }
}
