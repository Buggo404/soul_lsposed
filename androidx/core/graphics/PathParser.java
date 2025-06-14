package androidx.core.graphics;

/* loaded from: classes.dex */
public class PathParser {
    private static final java.lang.String LOGTAG = "PathParser";

    private static class ExtractFloatResult {
        int mEndPosition;
        boolean mEndWithNegOrDot;

        ExtractFloatResult() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public static class PathDataNode {
        public float[] mParams;
        public char mType;

        PathDataNode(char r1, float[] r2) {
                r0 = this;
                r0.<init>()
                r0.mType = r1
                r0.mParams = r2
                return
        }

        PathDataNode(androidx.core.graphics.PathParser.PathDataNode r3) {
                r2 = this;
                r2.<init>()
                char r0 = r3.mType
                r2.mType = r0
                float[] r3 = r3.mParams
                r0 = 0
                int r1 = r3.length
                float[] r3 = androidx.core.graphics.PathParser.copyOfRange(r3, r0, r1)
                r2.mParams = r3
                return
        }

        private static void addCommand(android.graphics.Path r25, float[] r26, char r27, char r28, float[] r29) {
                r10 = r25
                r11 = r28
                r12 = r29
                r13 = 0
                r0 = r26[r13]
                r14 = 1
                r1 = r26[r14]
                r15 = 2
                r2 = r26[r15]
                r16 = 3
                r3 = r26[r16]
                r17 = 4
                r4 = r26[r17]
                r18 = 5
                r5 = r26[r18]
                switch(r11) {
                    case 65: goto L34;
                    case 67: goto L32;
                    case 72: goto L2f;
                    case 76: goto L1e;
                    case 77: goto L1e;
                    case 81: goto L2c;
                    case 83: goto L2c;
                    case 84: goto L1e;
                    case 86: goto L2f;
                    case 90: goto L21;
                    case 97: goto L34;
                    case 99: goto L32;
                    case 104: goto L2f;
                    case 108: goto L1e;
                    case 109: goto L1e;
                    case 113: goto L2c;
                    case 115: goto L2c;
                    case 116: goto L1e;
                    case 118: goto L2f;
                    case 122: goto L21;
                    default: goto L1e;
                }
            L1e:
                r19 = r15
                goto L37
            L21:
                r25.close()
                r10.moveTo(r4, r5)
                r0 = r4
                r2 = r0
                r1 = r5
                r3 = r1
                goto L1e
            L2c:
                r19 = r17
                goto L37
            L2f:
                r19 = r14
                goto L37
            L32:
                r6 = 6
                goto L35
            L34:
                r6 = 7
            L35:
                r19 = r6
            L37:
                r9 = r0
                r8 = r1
                r20 = r4
                r21 = r5
                r7 = r13
                r0 = r27
            L40:
                int r1 = r12.length
                if (r7 >= r1) goto L2fa
                r1 = 65
                if (r11 == r1) goto L2b4
                r1 = 67
                if (r11 == r1) goto L289
                r5 = 72
                if (r11 == r5) goto L27b
                r5 = 81
                if (r11 == r5) goto L25a
                r6 = 86
                if (r11 == r6) goto L24c
                r6 = 97
                if (r11 == r6) goto L1ff
                r6 = 99
                if (r11 == r6) goto L1d2
                r15 = 104(0x68, float:1.46E-43)
                if (r11 == r15) goto L1c5
                r15 = 113(0x71, float:1.58E-43)
                if (r11 == r15) goto L1a6
                r14 = 118(0x76, float:1.65E-43)
                if (r11 == r14) goto L19a
                r14 = 76
                if (r11 == r14) goto L189
                r14 = 77
                if (r11 == r14) goto L16f
                r14 = 115(0x73, float:1.61E-43)
                r13 = 83
                r22 = 1073741824(0x40000000, float:2.0)
                if (r11 == r13) goto L13c
                r4 = 116(0x74, float:1.63E-43)
                r13 = 84
                if (r11 == r13) goto L117
                r1 = 108(0x6c, float:1.51E-43)
                if (r11 == r1) goto L104
                r1 = 109(0x6d, float:1.53E-43)
                if (r11 == r1) goto Lef
                if (r11 == r14) goto Lb7
                if (r11 == r4) goto L91
            L8d:
                r24 = r7
                goto L2f0
            L91:
                if (r0 == r15) goto L9d
                if (r0 == r4) goto L9d
                if (r0 == r5) goto L9d
                if (r0 != r13) goto L9a
                goto L9d
            L9a:
                r0 = 0
                r4 = 0
                goto La1
            L9d:
                float r4 = r9 - r2
                float r0 = r8 - r3
            La1:
                int r1 = r7 + 0
                r2 = r12[r1]
                int r3 = r7 + 1
                r5 = r12[r3]
                r10.rQuadTo(r4, r0, r2, r5)
                float r4 = r4 + r9
                float r0 = r0 + r8
                r1 = r12[r1]
                float r9 = r9 + r1
                r1 = r12[r3]
                float r8 = r8 + r1
                r3 = r0
                r2 = r4
                goto L8d
            Lb7:
                if (r0 == r6) goto Lc7
                if (r0 == r14) goto Lc7
                r1 = 67
                if (r0 == r1) goto Lc7
                r1 = 83
                if (r0 != r1) goto Lc4
                goto Lc7
            Lc4:
                r1 = 0
                r2 = 0
                goto Lcd
            Lc7:
                float r0 = r9 - r2
                float r1 = r8 - r3
                r2 = r1
                r1 = r0
            Lcd:
                int r13 = r7 + 0
                r3 = r12[r13]
                int r14 = r7 + 1
                r4 = r12[r14]
                int r15 = r7 + 2
                r5 = r12[r15]
                int r22 = r7 + 3
                r6 = r12[r22]
                r0 = r25
                r0.rCubicTo(r1, r2, r3, r4, r5, r6)
                r0 = r12[r13]
                float r0 = r0 + r9
                r1 = r12[r14]
                float r1 = r1 + r8
                r2 = r12[r15]
                float r9 = r9 + r2
                r2 = r12[r22]
                goto L1fa
            Lef:
                int r0 = r7 + 0
                r0 = r12[r0]
                float r9 = r9 + r0
                int r1 = r7 + 1
                r1 = r12[r1]
                float r8 = r8 + r1
                if (r7 <= 0) goto Lff
                r10.rLineTo(r0, r1)
                goto L8d
            Lff:
                r10.rMoveTo(r0, r1)
                goto L181
            L104:
                int r0 = r7 + 0
                r1 = r12[r0]
                int r4 = r7 + 1
                r5 = r12[r4]
                r10.rLineTo(r1, r5)
                r0 = r12[r0]
                float r9 = r9 + r0
                r0 = r12[r4]
            L114:
                float r8 = r8 + r0
                goto L8d
            L117:
                if (r0 == r15) goto L11f
                if (r0 == r4) goto L11f
                if (r0 == r5) goto L11f
                if (r0 != r13) goto L125
            L11f:
                float r9 = r9 * r22
                float r9 = r9 - r2
                float r8 = r8 * r22
                float r8 = r8 - r3
            L125:
                int r0 = r7 + 0
                r1 = r12[r0]
                int r2 = r7 + 1
                r3 = r12[r2]
                r10.quadTo(r9, r8, r1, r3)
                r0 = r12[r0]
                r1 = r12[r2]
                r24 = r7
                r3 = r8
                r2 = r9
                r9 = r0
                r8 = r1
                goto L2f0
            L13c:
                if (r0 == r6) goto L148
                if (r0 == r14) goto L148
                r1 = 67
                if (r0 == r1) goto L148
                r1 = 83
                if (r0 != r1) goto L14e
            L148:
                float r9 = r9 * r22
                float r9 = r9 - r2
                float r8 = r8 * r22
                float r8 = r8 - r3
            L14e:
                r2 = r8
                r1 = r9
                int r8 = r7 + 0
                r3 = r12[r8]
                int r9 = r7 + 1
                r4 = r12[r9]
                int r13 = r7 + 2
                r5 = r12[r13]
                int r14 = r7 + 3
                r6 = r12[r14]
                r0 = r25
                r0.cubicTo(r1, r2, r3, r4, r5, r6)
                r0 = r12[r8]
                r1 = r12[r9]
                r9 = r12[r13]
                r8 = r12[r14]
                goto L1fb
            L16f:
                int r0 = r7 + 0
                r9 = r12[r0]
                int r0 = r7 + 1
                r8 = r12[r0]
                if (r7 <= 0) goto L17e
                r10.lineTo(r9, r8)
                goto L8d
            L17e:
                r10.moveTo(r9, r8)
            L181:
                r24 = r7
                r21 = r8
                r20 = r9
                goto L2f0
            L189:
                int r0 = r7 + 0
                r1 = r12[r0]
                int r4 = r7 + 1
                r5 = r12[r4]
                r10.lineTo(r1, r5)
                r9 = r12[r0]
                r8 = r12[r4]
                goto L8d
            L19a:
                int r0 = r7 + 0
                r1 = r12[r0]
                r4 = 0
                r10.rLineTo(r4, r1)
                r0 = r12[r0]
                goto L114
            L1a6:
                int r0 = r7 + 0
                r1 = r12[r0]
                int r2 = r7 + 1
                r3 = r12[r2]
                int r4 = r7 + 2
                r5 = r12[r4]
                int r6 = r7 + 3
                r13 = r12[r6]
                r10.rQuadTo(r1, r3, r5, r13)
                r0 = r12[r0]
                float r0 = r0 + r9
                r1 = r12[r2]
                float r1 = r1 + r8
                r2 = r12[r4]
                float r9 = r9 + r2
                r2 = r12[r6]
                goto L1fa
            L1c5:
                int r0 = r7 + 0
                r1 = r12[r0]
                r4 = 0
                r10.rLineTo(r1, r4)
                r0 = r12[r0]
                float r9 = r9 + r0
                goto L8d
            L1d2:
                int r0 = r7 + 0
                r1 = r12[r0]
                int r0 = r7 + 1
                r2 = r12[r0]
                int r13 = r7 + 2
                r3 = r12[r13]
                int r14 = r7 + 3
                r4 = r12[r14]
                int r15 = r7 + 4
                r5 = r12[r15]
                int r22 = r7 + 5
                r6 = r12[r22]
                r0 = r25
                r0.rCubicTo(r1, r2, r3, r4, r5, r6)
                r0 = r12[r13]
                float r0 = r0 + r9
                r1 = r12[r14]
                float r1 = r1 + r8
                r2 = r12[r15]
                float r9 = r9 + r2
                r2 = r12[r22]
            L1fa:
                float r8 = r8 + r2
            L1fb:
                r2 = r0
                r3 = r1
                goto L8d
            L1ff:
                int r13 = r7 + 5
                r0 = r12[r13]
                float r3 = r0 + r9
                int r14 = r7 + 6
                r0 = r12[r14]
                float r4 = r0 + r8
                int r0 = r7 + 0
                r5 = r12[r0]
                int r0 = r7 + 1
                r6 = r12[r0]
                int r0 = r7 + 2
                r15 = r12[r0]
                int r0 = r7 + 3
                r0 = r12[r0]
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 == 0) goto L223
                r22 = 1
                goto L225
            L223:
                r22 = 0
            L225:
                int r0 = r7 + 4
                r0 = r12[r0]
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 == 0) goto L230
                r23 = 1
                goto L232
            L230:
                r23 = 0
            L232:
                r0 = r25
                r1 = r9
                r2 = r8
                r24 = r7
                r7 = r15
                r15 = r8
                r8 = r22
                r11 = r9
                r9 = r23
                drawArc(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                r0 = r12[r13]
                float r9 = r11 + r0
                r0 = r12[r14]
                float r8 = r15 + r0
                goto L2ee
            L24c:
                r24 = r7
                r11 = r9
                int r7 = r24 + 0
                r0 = r12[r7]
                r10.lineTo(r11, r0)
                r8 = r12[r7]
                goto L2f0
            L25a:
                r24 = r7
                int r7 = r24 + 0
                r0 = r12[r7]
                int r1 = r24 + 1
                r2 = r12[r1]
                int r3 = r24 + 2
                r4 = r12[r3]
                int r5 = r24 + 3
                r6 = r12[r5]
                r10.quadTo(r0, r2, r4, r6)
                r0 = r12[r7]
                r1 = r12[r1]
                r9 = r12[r3]
                r8 = r12[r5]
                r2 = r0
                r3 = r1
                goto L2f0
            L27b:
                r24 = r7
                r15 = r8
                int r7 = r24 + 0
                r0 = r12[r7]
                r10.lineTo(r0, r15)
                r9 = r12[r7]
                goto L2f0
            L289:
                r24 = r7
                int r7 = r24 + 0
                r1 = r12[r7]
                int r7 = r24 + 1
                r2 = r12[r7]
                int r7 = r24 + 2
                r3 = r12[r7]
                int r8 = r24 + 3
                r4 = r12[r8]
                int r9 = r24 + 4
                r5 = r12[r9]
                int r11 = r24 + 5
                r6 = r12[r11]
                r0 = r25
                r0.cubicTo(r1, r2, r3, r4, r5, r6)
                r9 = r12[r9]
                r0 = r12[r11]
                r1 = r12[r7]
                r2 = r12[r8]
                r8 = r0
                r3 = r2
                r2 = r1
                goto L2f0
            L2b4:
                r24 = r7
                r15 = r8
                r11 = r9
                int r13 = r24 + 5
                r3 = r12[r13]
                int r14 = r24 + 6
                r4 = r12[r14]
                int r7 = r24 + 0
                r5 = r12[r7]
                int r7 = r24 + 1
                r6 = r12[r7]
                int r7 = r24 + 2
                r7 = r12[r7]
                int r0 = r24 + 3
                r0 = r12[r0]
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 == 0) goto L2d7
                r8 = 1
                goto L2d8
            L2d7:
                r8 = 0
            L2d8:
                int r0 = r24 + 4
                r0 = r12[r0]
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 == 0) goto L2e2
                r9 = 1
                goto L2e3
            L2e2:
                r9 = 0
            L2e3:
                r0 = r25
                r1 = r11
                r2 = r15
                drawArc(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                r9 = r12[r13]
                r8 = r12[r14]
            L2ee:
                r3 = r8
                r2 = r9
            L2f0:
                int r7 = r24 + r19
                r0 = r28
                r11 = r0
                r13 = 0
                r14 = 1
                r15 = 2
                goto L40
            L2fa:
                r15 = r8
                r11 = r9
                r0 = r13
                r26[r0] = r11
                r0 = 1
                r26[r0] = r15
                r0 = 2
                r26[r0] = r2
                r26[r16] = r3
                r26[r17] = r20
                r26[r18] = r21
                return
        }

        private static void arcToBezier(android.graphics.Path r49, double r50, double r52, double r54, double r56, double r58, double r60, double r62, double r64, double r66) {
                r0 = r54
                r2 = 4616189618054758400(0x4010000000000000, double:4.0)
                double r4 = r66 * r2
                r6 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
                double r4 = r4 / r6
                double r4 = java.lang.Math.abs(r4)
                double r4 = java.lang.Math.ceil(r4)
                int r4 = (int) r4
                double r5 = java.lang.Math.cos(r62)
                double r7 = java.lang.Math.sin(r62)
                double r9 = java.lang.Math.cos(r64)
                double r11 = java.lang.Math.sin(r64)
                double r13 = -r0
                double r15 = r13 * r5
                double r17 = r15 * r11
                double r19 = r56 * r7
                double r21 = r19 * r9
                double r17 = r17 - r21
                double r13 = r13 * r7
                double r11 = r11 * r13
                double r21 = r56 * r5
                double r9 = r9 * r21
                double r11 = r11 + r9
                double r9 = (double) r4
                double r9 = r66 / r9
                r23 = 0
                r25 = r11
                r27 = r17
                r2 = r23
                r11 = r58
                r17 = r60
                r23 = r64
            L48:
                if (r2 >= r4) goto Le8
                double r31 = r23 + r9
                double r33 = java.lang.Math.sin(r31)
                double r35 = java.lang.Math.cos(r31)
                double r37 = r0 * r5
                double r37 = r37 * r35
                double r37 = r50 + r37
                double r39 = r19 * r33
                r41 = r4
                double r3 = r37 - r39
                double r37 = r0 * r7
                double r37 = r37 * r35
                double r37 = r52 + r37
                double r39 = r21 * r33
                double r0 = r37 + r39
                double r37 = r15 * r33
                double r39 = r19 * r35
                double r37 = r37 - r39
                double r33 = r33 * r13
                double r35 = r35 * r21
                double r33 = r33 + r35
                double r23 = r31 - r23
                r35 = 4611686018427387904(0x4000000000000000, double:2.0)
                double r35 = r23 / r35
                double r35 = java.lang.Math.tan(r35)
                double r23 = java.lang.Math.sin(r23)
                r39 = 4613937818241073152(0x4008000000000000, double:3.0)
                double r42 = r35 * r39
                double r42 = r42 * r35
                r29 = 4616189618054758400(0x4010000000000000, double:4.0)
                double r42 = r42 + r29
                double r35 = java.lang.Math.sqrt(r42)
                r42 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                double r35 = r35 - r42
                double r23 = r23 * r35
                double r23 = r23 / r39
                double r27 = r27 * r23
                double r11 = r11 + r27
                double r25 = r25 * r23
                r27 = r5
                double r5 = r17 + r25
                double r17 = r23 * r37
                r62 = r7
                double r7 = r3 - r17
                double r23 = r23 * r33
                r56 = r9
                double r9 = r0 - r23
                r17 = r13
                r13 = 0
                r14 = r49
                r14.rLineTo(r13, r13)
                float r11 = (float) r11
                float r5 = (float) r5
                float r6 = (float) r7
                float r7 = (float) r9
                float r8 = (float) r3
                float r9 = (float) r0
                r42 = r49
                r43 = r11
                r44 = r5
                r45 = r6
                r46 = r7
                r47 = r8
                r48 = r9
                r42.cubicTo(r43, r44, r45, r46, r47, r48)
                int r2 = r2 + 1
                r9 = r56
                r7 = r62
                r11 = r3
                r13 = r17
                r5 = r27
                r23 = r31
                r25 = r33
                r27 = r37
                r4 = r41
                r17 = r0
                r0 = r54
                goto L48
            Le8:
                return
        }

        private static void drawArc(android.graphics.Path r41, float r42, float r43, float r44, float r45, float r46, float r47, float r48, boolean r49, boolean r50) {
                r1 = r42
                r3 = r44
                r0 = r46
                r2 = r47
                r7 = r48
                r9 = r50
                double r4 = (double) r7
                double r19 = java.lang.Math.toRadians(r4)
                double r4 = java.lang.Math.cos(r19)
                double r10 = java.lang.Math.sin(r19)
                double r13 = (double) r1
                double r15 = r13 * r4
                r6 = r43
                r17 = r13
                double r13 = (double) r6
                double r21 = r13 * r10
                double r15 = r15 + r21
                double r6 = (double) r0
                double r15 = r15 / r6
                float r8 = -r1
                double r8 = (double) r8
                double r8 = r8 * r10
                double r21 = r13 * r4
                double r8 = r8 + r21
                r21 = r13
                double r13 = (double) r2
                double r8 = r8 / r13
                double r1 = (double) r3
                double r1 = r1 * r4
                r12 = r45
                r23 = r8
                double r8 = (double) r12
                double r25 = r8 * r10
                double r1 = r1 + r25
                double r1 = r1 / r6
                float r12 = -r3
                r25 = r6
                double r6 = (double) r12
                double r6 = r6 * r10
                double r8 = r8 * r4
                double r6 = r6 + r8
                double r6 = r6 / r13
                double r8 = r15 - r1
                double r27 = r23 - r6
                double r29 = r15 + r1
                r31 = 4611686018427387904(0x4000000000000000, double:2.0)
                double r29 = r29 / r31
                double r33 = r23 + r6
                double r33 = r33 / r31
                double r31 = r8 * r8
                double r35 = r27 * r27
                r37 = r10
                double r10 = r31 + r35
                r31 = 0
                int r12 = (r10 > r31 ? 1 : (r10 == r31 ? 0 : -1))
                java.lang.String r3 = "PathParser"
                if (r12 != 0) goto L6a
                java.lang.String r0 = " Points are coincident"
                android.util.Log.w(r3, r0)
                return
            L6a:
                r35 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                double r35 = r35 / r10
                r39 = 4598175219545276416(0x3fd0000000000000, double:0.25)
                double r35 = r35 - r39
                int r12 = (r35 > r31 ? 1 : (r35 == r31 ? 0 : -1))
                if (r12 >= 0) goto Lab
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Points are too far apart "
                r1.<init>(r2)
                java.lang.StringBuilder r1 = r1.append(r10)
                java.lang.String r1 = r1.toString()
                android.util.Log.w(r3, r1)
                double r1 = java.lang.Math.sqrt(r10)
                r3 = 4611685973391391630(0x3ffffff583a53b8e, double:1.99999)
                double r1 = r1 / r3
                float r1 = (float) r1
                float r5 = r0 * r1
                float r6 = r47 * r1
                r0 = r41
                r1 = r42
                r2 = r43
                r3 = r44
                r4 = r45
                r7 = r48
                r8 = r49
                r9 = r50
                drawArc(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return
            Lab:
                double r10 = java.lang.Math.sqrt(r35)
                double r8 = r8 * r10
                double r10 = r10 * r27
                r0 = r49
                r3 = r50
                if (r0 != r3) goto Lbd
                double r29 = r29 - r10
                double r33 = r33 + r8
                goto Lc1
            Lbd:
                double r29 = r29 + r10
                double r33 = r33 - r8
            Lc1:
                double r8 = r23 - r33
                double r10 = r15 - r29
                double r23 = java.lang.Math.atan2(r8, r10)
                double r6 = r6 - r33
                double r1 = r1 - r29
                double r0 = java.lang.Math.atan2(r6, r1)
                double r0 = r0 - r23
                int r2 = (r0 > r31 ? 1 : (r0 == r31 ? 0 : -1))
                if (r2 < 0) goto Ld9
                r6 = 1
                goto Lda
            Ld9:
                r6 = 0
            Lda:
                if (r3 == r6) goto Le6
                r6 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
                if (r2 <= 0) goto Le5
                double r0 = r0 - r6
                goto Le6
            Le5:
                double r0 = r0 + r6
            Le6:
                double r29 = r29 * r25
                double r33 = r33 * r13
                double r2 = r29 * r4
                double r10 = r33 * r37
                double r7 = r2 - r10
                r2 = r25
                double r29 = r29 * r37
                double r33 = r33 * r4
                double r9 = r29 + r33
                r6 = r41
                r11 = r2
                r2 = r17
                r4 = r21
                r15 = r2
                r17 = r4
                r21 = r23
                r23 = r0
                arcToBezier(r6, r7, r9, r11, r13, r15, r17, r19, r21, r23)
                return
        }

        public static void nodesToPath(androidx.core.graphics.PathParser.PathDataNode[] r5, android.graphics.Path r6) {
                r0 = 6
                float[] r0 = new float[r0]
                r1 = 109(0x6d, float:1.53E-43)
                r2 = 0
            L6:
                int r3 = r5.length
                if (r2 >= r3) goto L19
                r3 = r5[r2]
                char r4 = r3.mType
                float[] r3 = r3.mParams
                addCommand(r6, r0, r1, r4, r3)
                r1 = r5[r2]
                char r1 = r1.mType
                int r2 = r2 + 1
                goto L6
            L19:
                return
        }

        public void interpolatePathDataNode(androidx.core.graphics.PathParser.PathDataNode r5, androidx.core.graphics.PathParser.PathDataNode r6, float r7) {
                r4 = this;
                char r0 = r5.mType
                r4.mType = r0
                r0 = 0
            L5:
                float[] r1 = r5.mParams
                int r2 = r1.length
                if (r0 >= r2) goto L1d
                float[] r2 = r4.mParams
                r1 = r1[r0]
                r3 = 1065353216(0x3f800000, float:1.0)
                float r3 = r3 - r7
                float r1 = r1 * r3
                float[] r3 = r6.mParams
                r3 = r3[r0]
                float r3 = r3 * r7
                float r1 = r1 + r3
                r2[r0] = r1
                int r0 = r0 + 1
                goto L5
            L1d:
                return
        }
    }

    private PathParser() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void addNode(java.util.ArrayList<androidx.core.graphics.PathParser.PathDataNode> r1, char r2, float[] r3) {
            androidx.core.graphics.PathParser$PathDataNode r0 = new androidx.core.graphics.PathParser$PathDataNode
            r0.<init>(r2, r3)
            r1.add(r0)
            return
    }

    public static boolean canMorph(androidx.core.graphics.PathParser.PathDataNode[] r4, androidx.core.graphics.PathParser.PathDataNode[] r5) {
            r0 = 0
            if (r4 == 0) goto L2c
            if (r5 != 0) goto L6
            goto L2c
        L6:
            int r1 = r4.length
            int r2 = r5.length
            if (r1 == r2) goto Lb
            return r0
        Lb:
            r1 = r0
        Lc:
            int r2 = r4.length
            if (r1 >= r2) goto L2a
            r2 = r4[r1]
            char r2 = r2.mType
            r3 = r5[r1]
            char r3 = r3.mType
            if (r2 != r3) goto L29
            r2 = r4[r1]
            float[] r2 = r2.mParams
            int r2 = r2.length
            r3 = r5[r1]
            float[] r3 = r3.mParams
            int r3 = r3.length
            if (r2 == r3) goto L26
            goto L29
        L26:
            int r1 = r1 + 1
            goto Lc
        L29:
            return r0
        L2a:
            r4 = 1
            return r4
        L2c:
            return r0
    }

    static float[] copyOfRange(float[] r2, int r3, int r4) {
            if (r3 > r4) goto L1a
            int r0 = r2.length
            if (r3 < 0) goto L14
            if (r3 > r0) goto L14
            int r4 = r4 - r3
            int r0 = r0 - r3
            int r0 = java.lang.Math.min(r4, r0)
            float[] r4 = new float[r4]
            r1 = 0
            java.lang.System.arraycopy(r2, r3, r4, r1, r0)
            return r4
        L14:
            java.lang.ArrayIndexOutOfBoundsException r2 = new java.lang.ArrayIndexOutOfBoundsException
            r2.<init>()
            throw r2
        L1a:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
    }

    public static androidx.core.graphics.PathParser.PathDataNode[] createNodesFromPathData(java.lang.String r7) {
            if (r7 != 0) goto L4
            r7 = 0
            return r7
        L4:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 1
            r2 = 0
            r3 = r1
            r4 = r2
        Ld:
            int r5 = r7.length()
            if (r3 >= r5) goto L36
            int r3 = nextStart(r7, r3)
            java.lang.String r4 = r7.substring(r4, r3)
            java.lang.String r4 = r4.trim()
            int r5 = r4.length()
            if (r5 <= 0) goto L30
            float[] r5 = getFloats(r4)
            char r4 = r4.charAt(r2)
            addNode(r0, r4, r5)
        L30:
            int r4 = r3 + 1
            r6 = r4
            r4 = r3
            r3 = r6
            goto Ld
        L36:
            int r3 = r3 - r4
            if (r3 != r1) goto L48
            int r1 = r7.length()
            if (r4 >= r1) goto L48
            char r7 = r7.charAt(r4)
            float[] r1 = new float[r2]
            addNode(r0, r7, r1)
        L48:
            int r7 = r0.size()
            androidx.core.graphics.PathParser$PathDataNode[] r7 = new androidx.core.graphics.PathParser.PathDataNode[r7]
            java.lang.Object[] r7 = r0.toArray(r7)
            androidx.core.graphics.PathParser$PathDataNode[] r7 = (androidx.core.graphics.PathParser.PathDataNode[]) r7
            return r7
    }

    public static android.graphics.Path createPathFromPathData(java.lang.String r4) {
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            androidx.core.graphics.PathParser$PathDataNode[] r1 = createNodesFromPathData(r4)
            if (r1 == 0) goto L25
            androidx.core.graphics.PathParser.PathDataNode.nodesToPath(r1, r0)     // Catch: java.lang.RuntimeException -> Lf
            return r0
        Lf:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Error in parsing "
            r2.<init>(r3)
            java.lang.StringBuilder r4 = r2.append(r4)
            java.lang.String r4 = r4.toString()
            r1.<init>(r4, r0)
            throw r1
        L25:
            r4 = 0
            return r4
    }

    public static androidx.core.graphics.PathParser.PathDataNode[] deepCopyNodes(androidx.core.graphics.PathParser.PathDataNode[] r4) {
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            int r0 = r4.length
            androidx.core.graphics.PathParser$PathDataNode[] r0 = new androidx.core.graphics.PathParser.PathDataNode[r0]
            r1 = 0
        L8:
            int r2 = r4.length
            if (r1 >= r2) goto L17
            androidx.core.graphics.PathParser$PathDataNode r2 = new androidx.core.graphics.PathParser$PathDataNode
            r3 = r4[r1]
            r2.<init>(r3)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L8
        L17:
            return r0
    }

    private static void extract(java.lang.String r8, int r9, androidx.core.graphics.PathParser.ExtractFloatResult r10) {
            r0 = 0
            r10.mEndWithNegOrDot = r0
            r1 = r9
            r2 = r0
            r3 = r2
            r4 = r3
        L7:
            int r5 = r8.length()
            if (r1 >= r5) goto L3d
            char r5 = r8.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 == r6) goto L35
            r6 = 69
            if (r5 == r6) goto L33
            r6 = 101(0x65, float:1.42E-43)
            if (r5 == r6) goto L33
            switch(r5) {
                case 44: goto L35;
                case 45: goto L2a;
                case 46: goto L22;
                default: goto L21;
            }
        L21:
            goto L31
        L22:
            if (r3 != 0) goto L27
            r2 = r0
            r3 = r7
            goto L37
        L27:
            r10.mEndWithNegOrDot = r7
            goto L35
        L2a:
            if (r1 == r9) goto L31
            if (r2 != 0) goto L31
            r10.mEndWithNegOrDot = r7
            goto L35
        L31:
            r2 = r0
            goto L37
        L33:
            r2 = r7
            goto L37
        L35:
            r2 = r0
            r4 = r7
        L37:
            if (r4 == 0) goto L3a
            goto L3d
        L3a:
            int r1 = r1 + 1
            goto L7
        L3d:
            r10.mEndPosition = r1
            return
    }

    private static float[] getFloats(java.lang.String r8) {
            r0 = 0
            char r1 = r8.charAt(r0)
            r2 = 122(0x7a, float:1.71E-43)
            if (r1 == r2) goto L63
            char r1 = r8.charAt(r0)
            r2 = 90
            if (r1 != r2) goto L12
            goto L63
        L12:
            int r1 = r8.length()     // Catch: java.lang.NumberFormatException -> L47
            float[] r1 = new float[r1]     // Catch: java.lang.NumberFormatException -> L47
            androidx.core.graphics.PathParser$ExtractFloatResult r2 = new androidx.core.graphics.PathParser$ExtractFloatResult     // Catch: java.lang.NumberFormatException -> L47
            r2.<init>()     // Catch: java.lang.NumberFormatException -> L47
            int r3 = r8.length()     // Catch: java.lang.NumberFormatException -> L47
            r4 = 1
            r5 = r0
        L23:
            if (r4 >= r3) goto L42
            extract(r8, r4, r2)     // Catch: java.lang.NumberFormatException -> L47
            int r6 = r2.mEndPosition     // Catch: java.lang.NumberFormatException -> L47
            if (r4 >= r6) goto L39
            int r7 = r5 + 1
            java.lang.String r4 = r8.substring(r4, r6)     // Catch: java.lang.NumberFormatException -> L47
            float r4 = java.lang.Float.parseFloat(r4)     // Catch: java.lang.NumberFormatException -> L47
            r1[r5] = r4     // Catch: java.lang.NumberFormatException -> L47
            r5 = r7
        L39:
            boolean r4 = r2.mEndWithNegOrDot     // Catch: java.lang.NumberFormatException -> L47
            if (r4 == 0) goto L3f
            r4 = r6
            goto L23
        L3f:
            int r4 = r6 + 1
            goto L23
        L42:
            float[] r8 = copyOfRange(r1, r0, r5)     // Catch: java.lang.NumberFormatException -> L47
            return r8
        L47:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "error in parsing \""
            r2.<init>(r3)
            java.lang.StringBuilder r8 = r2.append(r8)
            java.lang.String r2 = "\""
            java.lang.StringBuilder r8 = r8.append(r2)
            java.lang.String r8 = r8.toString()
            r1.<init>(r8, r0)
            throw r1
        L63:
            float[] r8 = new float[r0]
            return r8
    }

    public static boolean interpolatePathDataNodes(androidx.core.graphics.PathParser.PathDataNode[] r4, androidx.core.graphics.PathParser.PathDataNode[] r5, androidx.core.graphics.PathParser.PathDataNode[] r6, float r7) {
            if (r4 == 0) goto L2f
            if (r5 == 0) goto L2f
            if (r6 == 0) goto L2f
            int r0 = r4.length
            int r1 = r5.length
            if (r0 != r1) goto L27
            int r0 = r5.length
            int r1 = r6.length
            if (r0 != r1) goto L27
            boolean r0 = canMorph(r5, r6)
            r1 = 0
            if (r0 != 0) goto L16
            return r1
        L16:
            int r0 = r4.length
            if (r1 >= r0) goto L25
            r0 = r4[r1]
            r2 = r5[r1]
            r3 = r6[r1]
            r0.interpolatePathDataNode(r2, r3, r7)
            int r1 = r1 + 1
            goto L16
        L25:
            r4 = 1
            return r4
        L27:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "The nodes to be interpolated and resulting nodes must have the same length"
            r4.<init>(r5)
            throw r4
        L2f:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "The nodes to be interpolated and resulting nodes cannot be null"
            r4.<init>(r5)
            throw r4
    }

    private static int nextStart(java.lang.String r3, int r4) {
        L0:
            int r0 = r3.length()
            if (r4 >= r0) goto L24
            char r0 = r3.charAt(r4)
            int r1 = r0 + (-65)
            int r2 = r0 + (-90)
            int r1 = r1 * r2
            if (r1 <= 0) goto L18
            int r1 = r0 + (-97)
            int r2 = r0 + (-122)
            int r1 = r1 * r2
            if (r1 > 0) goto L21
        L18:
            r1 = 101(0x65, float:1.42E-43)
            if (r0 == r1) goto L21
            r1 = 69
            if (r0 == r1) goto L21
            return r4
        L21:
            int r4 = r4 + 1
            goto L0
        L24:
            return r4
    }

    public static void updateNodes(androidx.core.graphics.PathParser.PathDataNode[] r5, androidx.core.graphics.PathParser.PathDataNode[] r6) {
            r0 = 0
            r1 = r0
        L2:
            int r2 = r6.length
            if (r1 >= r2) goto L27
            r2 = r5[r1]
            r3 = r6[r1]
            char r3 = r3.mType
            r2.mType = r3
            r2 = r0
        Le:
            r3 = r6[r1]
            float[] r3 = r3.mParams
            int r3 = r3.length
            if (r2 >= r3) goto L24
            r3 = r5[r1]
            float[] r3 = r3.mParams
            r4 = r6[r1]
            float[] r4 = r4.mParams
            r4 = r4[r2]
            r3[r2] = r4
            int r2 = r2 + 1
            goto Le
        L24:
            int r1 = r1 + 1
            goto L2
        L27:
            return
    }
}
