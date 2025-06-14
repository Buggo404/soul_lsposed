package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes.dex */
public class Schlick extends androidx.constraintlayout.core.motion.utils.Easing {
    private static final boolean DEBUG = false;
    double eps;

    /* renamed from: mS */
    double f32mS;

    /* renamed from: mT */
    double f33mT;

    Schlick(java.lang.String r6) {
            r5 = this;
            r5.<init>()
            r5.str = r6
            r0 = 40
            int r0 = r6.indexOf(r0)
            r1 = 44
            int r2 = r6.indexOf(r1, r0)
            int r0 = r0 + 1
            java.lang.String r0 = r6.substring(r0, r2)
            java.lang.String r0 = r0.trim()
            double r3 = java.lang.Double.parseDouble(r0)
            r5.f32mS = r3
            int r2 = r2 + 1
            int r0 = r6.indexOf(r1, r2)
            java.lang.String r6 = r6.substring(r2, r0)
            java.lang.String r6 = r6.trim()
            double r0 = java.lang.Double.parseDouble(r6)
            r5.f33mT = r0
            return
    }

    private double dfunc(double r13) {
            r12 = this;
            double r0 = r12.f33mT
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 >= 0) goto L15
            double r2 = r12.f32mS
            double r4 = r2 * r0
            double r4 = r4 * r0
            double r6 = r0 - r13
            double r6 = r6 * r2
            double r6 = r6 + r13
            double r0 = r0 - r13
            double r2 = r2 * r0
            double r2 = r2 + r13
            double r6 = r6 * r2
            double r4 = r4 / r6
            return r4
        L15:
            double r2 = r12.f32mS
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r6 = r0 - r4
            double r6 = r6 * r2
            double r8 = r0 - r4
            double r6 = r6 * r8
            double r8 = -r2
            double r10 = r0 - r13
            double r8 = r8 * r10
            double r8 = r8 - r13
            double r8 = r8 + r4
            double r2 = -r2
            double r0 = r0 - r13
            double r2 = r2 * r0
            double r2 = r2 - r13
            double r2 = r2 + r4
            double r8 = r8 * r2
            double r6 = r6 / r8
            return r6
    }

    private double func(double r9) {
            r8 = this;
            double r0 = r8.f33mT
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 >= 0) goto Lf
            double r2 = r0 * r9
            double r4 = r8.f32mS
            double r0 = r0 - r9
            double r4 = r4 * r0
            double r9 = r9 + r4
            double r2 = r2 / r9
            return r2
        Lf:
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = r2 - r0
            double r6 = r9 - r2
            double r4 = r4 * r6
            double r2 = r2 - r9
            double r6 = r8.f32mS
            double r0 = r0 - r9
            double r6 = r6 * r0
            double r2 = r2 - r6
            double r4 = r4 / r2
            return r4
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public double get(double r1) {
            r0 = this;
            double r1 = r0.func(r1)
            return r1
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public double getDiff(double r1) {
            r0 = this;
            double r1 = r0.dfunc(r1)
            return r1
    }
}
