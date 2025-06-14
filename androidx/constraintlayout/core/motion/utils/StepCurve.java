package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes.dex */
public class StepCurve extends androidx.constraintlayout.core.motion.utils.Easing {
    private static final boolean DEBUG = false;
    androidx.constraintlayout.core.motion.utils.MonotonicCurveFit mCurveFit;

    StepCurve(java.lang.String r9) {
            r8 = this;
            r8.<init>()
            r8.str = r9
            java.lang.String r0 = r8.str
            int r0 = r0.length()
            int r0 = r0 / 2
            double[] r0 = new double[r0]
            r1 = 40
            int r1 = r9.indexOf(r1)
            int r1 = r1 + 1
            r2 = 44
            int r3 = r9.indexOf(r2, r1)
            r4 = 0
        L1e:
            r5 = -1
            if (r3 == r5) goto L39
            java.lang.String r1 = r9.substring(r1, r3)
            java.lang.String r1 = r1.trim()
            int r5 = r4 + 1
            double r6 = java.lang.Double.parseDouble(r1)
            r0[r4] = r6
            int r1 = r3 + 1
            int r3 = r9.indexOf(r2, r1)
            r4 = r5
            goto L1e
        L39:
            r2 = 41
            int r2 = r9.indexOf(r2, r1)
            java.lang.String r9 = r9.substring(r1, r2)
            java.lang.String r9 = r9.trim()
            int r1 = r4 + 1
            double r2 = java.lang.Double.parseDouble(r9)
            r0[r4] = r2
            double[] r9 = java.util.Arrays.copyOf(r0, r1)
            androidx.constraintlayout.core.motion.utils.MonotonicCurveFit r9 = genSpline(r9)
            r8.mCurveFit = r9
            return
    }

    private static androidx.constraintlayout.core.motion.utils.MonotonicCurveFit genSpline(java.lang.String r5) {
            java.lang.String r0 = "\\s+"
            java.lang.String[] r5 = r5.split(r0)
            int r0 = r5.length
            double[] r1 = new double[r0]
            r2 = 0
        La:
            if (r2 >= r0) goto L17
            r3 = r5[r2]
            double r3 = java.lang.Double.parseDouble(r3)
            r1[r2] = r3
            int r2 = r2 + 1
            goto La
        L17:
            androidx.constraintlayout.core.motion.utils.MonotonicCurveFit r5 = genSpline(r1)
            return r5
    }

    private static androidx.constraintlayout.core.motion.utils.MonotonicCurveFit genSpline(double[] r18) {
            r0 = r18
            int r1 = r0.length
            int r1 = r1 * 3
            r2 = 2
            int r1 = r1 - r2
            int r3 = r0.length
            r4 = 1
            int r3 = r3 - r4
            double r5 = (double) r3
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r5 = r7 / r5
            int[] r2 = new int[r2]
            r2[r4] = r4
            r4 = 0
            r2[r4] = r1
            java.lang.Class r9 = java.lang.Double.TYPE
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r9, r2)
            double[][] r2 = (double[][]) r2
            double[] r1 = new double[r1]
            r9 = r4
        L21:
            int r10 = r0.length
            if (r9 >= r10) goto L50
            r10 = r0[r9]
            int r12 = r9 + r3
            r13 = r2[r12]
            r13[r4] = r10
            double r13 = (double) r9
            double r13 = r13 * r5
            r1[r12] = r13
            if (r9 <= 0) goto L4d
            int r12 = r3 * 2
            int r12 = r12 + r9
            r15 = r2[r12]
            double r16 = r10 + r7
            r15[r4] = r16
            double r15 = r13 + r7
            r1[r12] = r15
            int r12 = r9 + (-1)
            r15 = r2[r12]
            double r10 = r10 - r7
            double r10 = r10 - r5
            r15[r4] = r10
            r10 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            double r13 = r13 + r10
            double r13 = r13 - r5
            r1[r12] = r13
        L4d:
            int r9 = r9 + 1
            goto L21
        L50:
            androidx.constraintlayout.core.motion.utils.MonotonicCurveFit r0 = new androidx.constraintlayout.core.motion.utils.MonotonicCurveFit
            r0.<init>(r1, r2)
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = " 0 "
            r2.<init>(r3)
            r5 = 0
            double r5 = r0.getPos(r5, r4)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.println(r2)
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = " 1 "
            r2.<init>(r3)
            double r3 = r0.getPos(r7, r4)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.println(r2)
            return r0
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public double get(double r3) {
            r2 = this;
            androidx.constraintlayout.core.motion.utils.MonotonicCurveFit r0 = r2.mCurveFit
            r1 = 0
            double r3 = r0.getPos(r3, r1)
            return r3
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public double getDiff(double r3) {
            r2 = this;
            androidx.constraintlayout.core.motion.utils.MonotonicCurveFit r0 = r2.mCurveFit
            r1 = 0
            double r3 = r0.getSlope(r3, r1)
            return r3
    }
}
