package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes.dex */
public abstract class CurveFit {
    public static final int CONSTANT = 2;
    public static final int LINEAR = 1;
    public static final int SPLINE = 0;

    static class Constant extends androidx.constraintlayout.core.motion.utils.CurveFit {
        double mTime;
        double[] mValue;

        Constant(double r1, double[] r3) {
                r0 = this;
                r0.<init>()
                r0.mTime = r1
                r0.mValue = r3
                return
        }

        @Override // androidx.constraintlayout.core.motion.utils.CurveFit
        public double getPos(double r1, int r3) {
                r0 = this;
                double[] r1 = r0.mValue
                r2 = r1[r3]
                return r2
        }

        @Override // androidx.constraintlayout.core.motion.utils.CurveFit
        public void getPos(double r2, double[] r4) {
                r1 = this;
                double[] r2 = r1.mValue
                r3 = 0
                int r0 = r2.length
                java.lang.System.arraycopy(r2, r3, r4, r3, r0)
                return
        }

        @Override // androidx.constraintlayout.core.motion.utils.CurveFit
        public void getPos(double r3, float[] r5) {
                r2 = this;
                r3 = 0
            L1:
                double[] r4 = r2.mValue
                int r0 = r4.length
                if (r3 >= r0) goto Le
                r0 = r4[r3]
                float r4 = (float) r0
                r5[r3] = r4
                int r3 = r3 + 1
                goto L1
            Le:
                return
        }

        @Override // androidx.constraintlayout.core.motion.utils.CurveFit
        public double getSlope(double r1, int r3) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // androidx.constraintlayout.core.motion.utils.CurveFit
        public void getSlope(double r3, double[] r5) {
                r2 = this;
                r3 = 0
            L1:
                double[] r4 = r2.mValue
                int r4 = r4.length
                if (r3 >= r4) goto Ld
                r0 = 0
                r5[r3] = r0
                int r3 = r3 + 1
                goto L1
            Ld:
                return
        }

        @Override // androidx.constraintlayout.core.motion.utils.CurveFit
        public double[] getTimePoints() {
                r4 = this;
                r0 = 1
                double[] r0 = new double[r0]
                r1 = 0
                double r2 = r4.mTime
                r0[r1] = r2
                return r0
        }
    }

    public CurveFit() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.constraintlayout.core.motion.utils.CurveFit get(int r3, double[] r4, double[][] r5) {
            int r0 = r4.length
            r1 = 1
            r2 = 2
            if (r0 != r1) goto L6
            r3 = r2
        L6:
            if (r3 == 0) goto L1b
            if (r3 == r2) goto L10
            androidx.constraintlayout.core.motion.utils.LinearCurveFit r3 = new androidx.constraintlayout.core.motion.utils.LinearCurveFit
            r3.<init>(r4, r5)
            return r3
        L10:
            androidx.constraintlayout.core.motion.utils.CurveFit$Constant r3 = new androidx.constraintlayout.core.motion.utils.CurveFit$Constant
            r0 = 0
            r1 = r4[r0]
            r4 = r5[r0]
            r3.<init>(r1, r4)
            return r3
        L1b:
            androidx.constraintlayout.core.motion.utils.MonotonicCurveFit r3 = new androidx.constraintlayout.core.motion.utils.MonotonicCurveFit
            r3.<init>(r4, r5)
            return r3
    }

    public static androidx.constraintlayout.core.motion.utils.CurveFit getArc(int[] r1, double[] r2, double[][] r3) {
            androidx.constraintlayout.core.motion.utils.ArcCurveFit r0 = new androidx.constraintlayout.core.motion.utils.ArcCurveFit
            r0.<init>(r1, r2, r3)
            return r0
    }

    public abstract double getPos(double r1, int r3);

    public abstract void getPos(double r1, double[] r3);

    public abstract void getPos(double r1, float[] r3);

    public abstract double getSlope(double r1, int r3);

    public abstract void getSlope(double r1, double[] r3);

    public abstract double[] getTimePoints();
}
