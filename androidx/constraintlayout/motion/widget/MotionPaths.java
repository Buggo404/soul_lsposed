package androidx.constraintlayout.motion.widget;

/* loaded from: classes.dex */
class MotionPaths implements java.lang.Comparable<androidx.constraintlayout.motion.widget.MotionPaths> {
    static final int CARTESIAN = 0;
    public static final boolean DEBUG = false;
    static final int OFF_HEIGHT = 4;
    static final int OFF_PATH_ROTATE = 5;
    static final int OFF_POSITION = 0;
    static final int OFF_WIDTH = 3;
    static final int OFF_X = 1;
    static final int OFF_Y = 2;
    public static final boolean OLD_WAY = false;
    static final int PERPENDICULAR = 1;
    static final int SCREEN = 2;
    public static final java.lang.String TAG = "MotionPaths";
    static java.lang.String[] names;
    java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> attributes;
    float height;
    int mAnimateCircleAngleTo;
    int mAnimateRelativeTo;
    int mDrawPath;
    androidx.constraintlayout.core.motion.utils.Easing mKeyFrameEasing;
    int mMode;
    int mPathMotionArc;
    float mPathRotate;
    float mProgress;
    float mRelativeAngle;
    androidx.constraintlayout.motion.widget.MotionController mRelativeToController;
    double[] mTempDelta;
    double[] mTempValue;
    float position;
    float time;
    float width;

    /* renamed from: x */
    float f54x;

    /* renamed from: y */
    float f55y;

    static {
            java.lang.String r0 = "position"
            java.lang.String r1 = "x"
            java.lang.String r2 = "y"
            java.lang.String r3 = "width"
            java.lang.String r4 = "height"
            java.lang.String r5 = "pathRotate"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5}
            androidx.constraintlayout.motion.widget.MotionPaths.names = r0
            return
    }

    public MotionPaths() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.mDrawPath = r0
            r1 = 2143289344(0x7fc00000, float:NaN)
            r3.mPathRotate = r1
            r3.mProgress = r1
            int r2 = androidx.constraintlayout.motion.widget.Key.UNSET
            r3.mPathMotionArc = r2
            int r2 = androidx.constraintlayout.motion.widget.Key.UNSET
            r3.mAnimateRelativeTo = r2
            r3.mRelativeAngle = r1
            r1 = 0
            r3.mRelativeToController = r1
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r3.attributes = r1
            r3.mMode = r0
            r0 = 18
            double[] r1 = new double[r0]
            r3.mTempValue = r1
            double[] r0 = new double[r0]
            r3.mTempDelta = r0
            return
    }

    public MotionPaths(int r4, int r5, androidx.constraintlayout.motion.widget.KeyPosition r6, androidx.constraintlayout.motion.widget.MotionPaths r7, androidx.constraintlayout.motion.widget.MotionPaths r8) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.mDrawPath = r0
            r1 = 2143289344(0x7fc00000, float:NaN)
            r3.mPathRotate = r1
            r3.mProgress = r1
            int r2 = androidx.constraintlayout.motion.widget.Key.UNSET
            r3.mPathMotionArc = r2
            int r2 = androidx.constraintlayout.motion.widget.Key.UNSET
            r3.mAnimateRelativeTo = r2
            r3.mRelativeAngle = r1
            r1 = 0
            r3.mRelativeToController = r1
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r3.attributes = r1
            r3.mMode = r0
            r0 = 18
            double[] r1 = new double[r0]
            r3.mTempValue = r1
            double[] r0 = new double[r0]
            r3.mTempDelta = r0
            int r0 = r7.mAnimateRelativeTo
            int r1 = androidx.constraintlayout.motion.widget.Key.UNSET
            if (r0 == r1) goto L36
            r3.initPolar(r4, r5, r6, r7, r8)
            return
        L36:
            int r0 = r6.mPositionType
            r1 = 1
            if (r0 == r1) goto L46
            r1 = 2
            if (r0 == r1) goto L42
            r3.initCartesian(r6, r7, r8)
            return
        L42:
            r3.initScreen(r4, r5, r6, r7, r8)
            return
        L46:
            r3.initPath(r6, r7, r8)
            return
    }

    private boolean diff(float r4, float r5) {
            r3 = this;
            boolean r0 = java.lang.Float.isNaN(r4)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L1e
            boolean r0 = java.lang.Float.isNaN(r5)
            if (r0 == 0) goto Lf
            goto L1e
        Lf:
            float r4 = r4 - r5
            float r4 = java.lang.Math.abs(r4)
            r5 = 897988541(0x358637bd, float:1.0E-6)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L1c
            goto L1d
        L1c:
            r1 = r2
        L1d:
            return r1
        L1e:
            boolean r4 = java.lang.Float.isNaN(r4)
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r4 == r5) goto L29
            goto L2a
        L29:
            r1 = r2
        L2a:
            return r1
    }

    private static final float xRotate(float r0, float r1, float r2, float r3, float r4, float r5) {
            float r4 = r4 - r2
            float r5 = r5 - r3
            float r4 = r4 * r1
            float r5 = r5 * r0
            float r4 = r4 - r5
            float r4 = r4 + r2
            return r4
    }

    private static final float yRotate(float r0, float r1, float r2, float r3, float r4, float r5) {
            float r4 = r4 - r2
            float r5 = r5 - r3
            float r4 = r4 * r0
            float r5 = r5 * r1
            float r4 = r4 + r5
            float r4 = r4 + r3
            return r4
    }

    public void applyParameters(androidx.constraintlayout.widget.ConstraintSet.Constraint r5) {
            r4 = this;
            androidx.constraintlayout.widget.ConstraintSet$Motion r0 = r5.motion
            java.lang.String r0 = r0.mTransitionEasing
            androidx.constraintlayout.core.motion.utils.Easing r0 = androidx.constraintlayout.core.motion.utils.Easing.getInterpolator(r0)
            r4.mKeyFrameEasing = r0
            androidx.constraintlayout.widget.ConstraintSet$Motion r0 = r5.motion
            int r0 = r0.mPathMotionArc
            r4.mPathMotionArc = r0
            androidx.constraintlayout.widget.ConstraintSet$Motion r0 = r5.motion
            int r0 = r0.mAnimateRelativeTo
            r4.mAnimateRelativeTo = r0
            androidx.constraintlayout.widget.ConstraintSet$Motion r0 = r5.motion
            float r0 = r0.mPathRotate
            r4.mPathRotate = r0
            androidx.constraintlayout.widget.ConstraintSet$Motion r0 = r5.motion
            int r0 = r0.mDrawPath
            r4.mDrawPath = r0
            androidx.constraintlayout.widget.ConstraintSet$Motion r0 = r5.motion
            int r0 = r0.mAnimateCircleAngleTo
            r4.mAnimateCircleAngleTo = r0
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r0 = r5.propertySet
            float r0 = r0.mProgress
            r4.mProgress = r0
            androidx.constraintlayout.widget.ConstraintSet$Layout r0 = r5.layout
            float r0 = r0.circleAngle
            r4.mRelativeAngle = r0
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r5.mCustomConstraints
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L3e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L60
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r2 = r5.mCustomConstraints
            java.lang.Object r2 = r2.get(r1)
            androidx.constraintlayout.widget.ConstraintAttribute r2 = (androidx.constraintlayout.widget.ConstraintAttribute) r2
            if (r2 == 0) goto L3e
            boolean r3 = r2.isContinuous()
            if (r3 == 0) goto L3e
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r3 = r4.attributes
            r3.put(r1, r2)
            goto L3e
        L60:
            return
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(androidx.constraintlayout.motion.widget.MotionPaths r2) {
            r1 = this;
            float r0 = r1.position
            float r2 = r2.position
            int r2 = java.lang.Float.compare(r0, r2)
            return r2
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(androidx.constraintlayout.motion.widget.MotionPaths r1) {
            r0 = this;
            androidx.constraintlayout.motion.widget.MotionPaths r1 = (androidx.constraintlayout.motion.widget.MotionPaths) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    public void configureRelativeTo(androidx.constraintlayout.motion.widget.MotionController r3) {
            r2 = this;
            float r0 = r2.mProgress
            double r0 = (double) r0
            r3.getPos(r0)
            return
    }

    void different(androidx.constraintlayout.motion.widget.MotionPaths r6, boolean[] r7, java.lang.String[] r8, boolean r9) {
            r5 = this;
            float r8 = r5.f54x
            float r0 = r6.f54x
            boolean r8 = r5.diff(r8, r0)
            float r0 = r5.f55y
            float r1 = r6.f55y
            boolean r0 = r5.diff(r0, r1)
            r1 = 0
            boolean r2 = r7[r1]
            float r3 = r5.position
            float r4 = r6.position
            boolean r3 = r5.diff(r3, r4)
            r2 = r2 | r3
            r7[r1] = r2
            r1 = 1
            boolean r2 = r7[r1]
            r8 = r8 | r0
            r8 = r8 | r9
            r9 = r2 | r8
            r7[r1] = r9
            r9 = 2
            boolean r0 = r7[r9]
            r8 = r8 | r0
            r7[r9] = r8
            r8 = 3
            boolean r9 = r7[r8]
            float r0 = r5.width
            float r1 = r6.width
            boolean r0 = r5.diff(r0, r1)
            r9 = r9 | r0
            r7[r8] = r9
            r8 = 4
            boolean r9 = r7[r8]
            float r0 = r5.height
            float r6 = r6.height
            boolean r6 = r5.diff(r0, r6)
            r6 = r6 | r9
            r7[r8] = r6
            return
    }

    void fillStandard(double[] r9, int[] r10) {
            r8 = this;
            r0 = 6
            float[] r1 = new float[r0]
            float r2 = r8.position
            r3 = 0
            r1[r3] = r2
            r2 = 1
            float r4 = r8.f54x
            r1[r2] = r4
            r2 = 2
            float r4 = r8.f55y
            r1[r2] = r4
            r2 = 3
            float r4 = r8.width
            r1[r2] = r4
            r2 = 4
            float r4 = r8.height
            r1[r2] = r4
            r2 = 5
            float r4 = r8.mPathRotate
            r1[r2] = r4
            r2 = r3
        L22:
            int r4 = r10.length
            if (r3 >= r4) goto L34
            r4 = r10[r3]
            if (r4 >= r0) goto L31
            int r5 = r2 + 1
            r4 = r1[r4]
            double r6 = (double) r4
            r9[r2] = r6
            r2 = r5
        L31:
            int r3 = r3 + 1
            goto L22
        L34:
            return
    }

    void getBounds(int[] r7, double[] r8, float[] r9, int r10) {
            r6 = this;
            float r0 = r6.width
            float r1 = r6.height
            r2 = 0
        L5:
            int r3 = r7.length
            if (r2 >= r3) goto L1a
            r3 = r8[r2]
            float r3 = (float) r3
            r4 = r7[r2]
            r5 = 3
            if (r4 == r5) goto L16
            r5 = 4
            if (r4 == r5) goto L14
            goto L17
        L14:
            r1 = r3
            goto L17
        L16:
            r0 = r3
        L17:
            int r2 = r2 + 1
            goto L5
        L1a:
            r9[r10] = r0
            int r10 = r10 + 1
            r9[r10] = r1
            return
    }

    void getCenter(double r16, int[] r18, double[] r19, float[] r20, int r21) {
            r15 = this;
            r0 = r15
            r1 = r18
            float r2 = r0.f54x
            float r3 = r0.f55y
            float r4 = r0.width
            float r5 = r0.height
            r6 = 0
            r7 = r6
        Ld:
            int r8 = r1.length
            r9 = 2
            r10 = 1
            if (r7 >= r8) goto L2c
            r11 = r19[r7]
            float r8 = (float) r11
            r11 = r1[r7]
            if (r11 == r10) goto L28
            if (r11 == r9) goto L26
            r9 = 3
            if (r11 == r9) goto L24
            r9 = 4
            if (r11 == r9) goto L22
            goto L29
        L22:
            r5 = r8
            goto L29
        L24:
            r4 = r8
            goto L29
        L26:
            r3 = r8
            goto L29
        L28:
            r2 = r8
        L29:
            int r7 = r7 + 1
            goto Ld
        L2c:
            androidx.constraintlayout.motion.widget.MotionController r1 = r0.mRelativeToController
            r7 = 1073741824(0x40000000, float:2.0)
            if (r1 == 0) goto L5b
            float[] r8 = new float[r9]
            float[] r9 = new float[r9]
            r11 = r16
            r1.getCenter(r11, r8, r9)
            r1 = r8[r6]
            r6 = r8[r10]
            double r8 = (double) r1
            double r1 = (double) r2
            double r11 = (double) r3
            double r13 = java.lang.Math.sin(r11)
            double r13 = r13 * r1
            double r8 = r8 + r13
            float r3 = r4 / r7
            double r13 = (double) r3
            double r8 = r8 - r13
            float r3 = (float) r8
            double r8 = (double) r6
            double r11 = java.lang.Math.cos(r11)
            double r1 = r1 * r11
            double r8 = r8 - r1
            float r1 = r5 / r7
            double r1 = (double) r1
            double r8 = r8 - r1
            float r1 = (float) r8
            r2 = r3
            r3 = r1
        L5b:
            float r4 = r4 / r7
            float r2 = r2 + r4
            r1 = 0
            float r2 = r2 + r1
            r20[r21] = r2
            int r2 = r21 + 1
            float r5 = r5 / r7
            float r3 = r3 + r5
            float r3 = r3 + r1
            r20[r2] = r3
            return
    }

    void getCenter(double r20, int[] r22, double[] r23, float[] r24, double[] r25, float[] r26) {
            r19 = this;
            r0 = r19
            r1 = r22
            float r2 = r0.f54x
            float r3 = r0.f55y
            float r4 = r0.width
            float r5 = r0.height
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
        L11:
            int r13 = r1.length
            r15 = 1
            if (r8 >= r13) goto L37
            r6 = r23[r8]
            float r6 = (float) r6
            r13 = r25[r8]
            float r13 = (float) r13
            r14 = r1[r8]
            if (r14 == r15) goto L32
            r7 = 2
            if (r14 == r7) goto L2f
            r7 = 3
            if (r14 == r7) goto L2c
            r7 = 4
            if (r14 == r7) goto L29
            goto L34
        L29:
            r5 = r6
            r12 = r13
            goto L34
        L2c:
            r4 = r6
            r10 = r13
            goto L34
        L2f:
            r3 = r6
            r11 = r13
            goto L34
        L32:
            r2 = r6
            r9 = r13
        L34:
            int r8 = r8 + 1
            goto L11
        L37:
            r1 = 1073741824(0x40000000, float:2.0)
            float r10 = r10 / r1
            float r10 = r10 + r9
            float r12 = r12 / r1
            float r12 = r12 + r11
            androidx.constraintlayout.motion.widget.MotionController r6 = r0.mRelativeToController
            if (r6 == 0) goto La4
            r7 = 2
            float[] r8 = new float[r7]
            float[] r7 = new float[r7]
            r12 = r20
            r6.getCenter(r12, r8, r7)
            r6 = 0
            r10 = r8[r6]
            r8 = r8[r15]
            r12 = r7[r6]
            r6 = r7[r15]
            double r13 = (double) r10
            double r1 = (double) r2
            r20 = r6
            double r6 = (double) r3
            double r16 = java.lang.Math.sin(r6)
            double r16 = r16 * r1
            double r13 = r13 + r16
            r3 = 1073741824(0x40000000, float:2.0)
            float r10 = r4 / r3
            r16 = r4
            double r3 = (double) r10
            double r13 = r13 - r3
            float r3 = (float) r13
            double r13 = (double) r8
            double r17 = java.lang.Math.cos(r6)
            double r1 = r1 * r17
            double r13 = r13 - r1
            r1 = 1073741824(0x40000000, float:2.0)
            float r2 = r5 / r1
            double r1 = (double) r2
            double r13 = r13 - r1
            float r1 = (float) r13
            double r12 = (double) r12
            double r8 = (double) r9
            double r17 = java.lang.Math.sin(r6)
            double r17 = r17 * r8
            double r12 = r12 + r17
            double r17 = java.lang.Math.cos(r6)
            double r10 = (double) r11
            double r17 = r17 * r10
            double r12 = r12 + r17
            float r2 = (float) r12
            r4 = r20
            double r12 = (double) r4
            double r17 = java.lang.Math.cos(r6)
            double r8 = r8 * r17
            double r12 = r12 - r8
            double r6 = java.lang.Math.sin(r6)
            double r6 = r6 * r10
            double r12 = r12 + r6
            float r12 = (float) r12
            r10 = r2
            r2 = r3
            r3 = r1
            r1 = 1073741824(0x40000000, float:2.0)
            goto La6
        La4:
            r16 = r4
        La6:
            float r4 = r16 / r1
            float r2 = r2 + r4
            r4 = 0
            float r2 = r2 + r4
            r6 = 0
            r24[r6] = r2
            float r5 = r5 / r1
            float r3 = r3 + r5
            float r3 = r3 + r4
            r24[r15] = r3
            r26[r6] = r10
            r26[r15] = r12
            return
    }

    void getCenterVelocity(double r16, int[] r18, double[] r19, float[] r20, int r21) {
            r15 = this;
            r0 = r15
            r1 = r18
            float r2 = r0.f54x
            float r3 = r0.f55y
            float r4 = r0.width
            float r5 = r0.height
            r6 = 0
            r7 = r6
        Ld:
            int r8 = r1.length
            r9 = 2
            r10 = 1
            if (r7 >= r8) goto L2c
            r11 = r19[r7]
            float r8 = (float) r11
            r11 = r1[r7]
            if (r11 == r10) goto L28
            if (r11 == r9) goto L26
            r9 = 3
            if (r11 == r9) goto L24
            r9 = 4
            if (r11 == r9) goto L22
            goto L29
        L22:
            r5 = r8
            goto L29
        L24:
            r4 = r8
            goto L29
        L26:
            r3 = r8
            goto L29
        L28:
            r2 = r8
        L29:
            int r7 = r7 + 1
            goto Ld
        L2c:
            androidx.constraintlayout.motion.widget.MotionController r1 = r0.mRelativeToController
            r7 = 1073741824(0x40000000, float:2.0)
            if (r1 == 0) goto L5b
            float[] r8 = new float[r9]
            float[] r9 = new float[r9]
            r11 = r16
            r1.getCenter(r11, r8, r9)
            r1 = r8[r6]
            r6 = r8[r10]
            double r8 = (double) r1
            double r1 = (double) r2
            double r11 = (double) r3
            double r13 = java.lang.Math.sin(r11)
            double r13 = r13 * r1
            double r8 = r8 + r13
            float r3 = r4 / r7
            double r13 = (double) r3
            double r8 = r8 - r13
            float r3 = (float) r8
            double r8 = (double) r6
            double r11 = java.lang.Math.cos(r11)
            double r1 = r1 * r11
            double r8 = r8 - r1
            float r1 = r5 / r7
            double r1 = (double) r1
            double r8 = r8 - r1
            float r1 = (float) r8
            r2 = r3
            r3 = r1
        L5b:
            float r4 = r4 / r7
            float r2 = r2 + r4
            r1 = 0
            float r2 = r2 + r1
            r20[r21] = r2
            int r2 = r21 + 1
            float r5 = r5 / r7
            float r3 = r3 + r5
            float r3 = r3 + r1
            r20[r2] = r3
            return
    }

    int getCustomData(java.lang.String r6, double[] r7, int r8) {
            r5 = this;
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r5.attributes
            java.lang.Object r6 = r0.get(r6)
            androidx.constraintlayout.widget.ConstraintAttribute r6 = (androidx.constraintlayout.widget.ConstraintAttribute) r6
            r0 = 0
            if (r6 != 0) goto Lc
            return r0
        Lc:
            int r1 = r6.numberOfInterpolatedValues()
            r2 = 1
            if (r1 != r2) goto L1b
            float r6 = r6.getValueToInterpolate()
            double r0 = (double) r6
            r7[r8] = r0
            return r2
        L1b:
            int r1 = r6.numberOfInterpolatedValues()
            float[] r2 = new float[r1]
            r6.getValuesToInterpolate(r2)
        L24:
            if (r0 >= r1) goto L31
            int r6 = r8 + 1
            r3 = r2[r0]
            double r3 = (double) r3
            r7[r8] = r3
            int r0 = r0 + 1
            r8 = r6
            goto L24
        L31:
            return r1
    }

    int getCustomDataCount(java.lang.String r2) {
            r1 = this;
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r1.attributes
            java.lang.Object r2 = r0.get(r2)
            androidx.constraintlayout.widget.ConstraintAttribute r2 = (androidx.constraintlayout.widget.ConstraintAttribute) r2
            if (r2 != 0) goto Lc
            r2 = 0
            return r2
        Lc:
            int r2 = r2.numberOfInterpolatedValues()
            return r2
    }

    void getRect(int[] r11, double[] r12, float[] r13, int r14) {
            r10 = this;
            float r0 = r10.f54x
            float r1 = r10.f55y
            float r2 = r10.width
            float r3 = r10.height
            r4 = 0
        L9:
            int r5 = r11.length
            if (r4 >= r5) goto L28
            r5 = r12[r4]
            float r5 = (float) r5
            r6 = r11[r4]
            r7 = 1
            if (r6 == r7) goto L24
            r7 = 2
            if (r6 == r7) goto L22
            r7 = 3
            if (r6 == r7) goto L20
            r7 = 4
            if (r6 == r7) goto L1e
            goto L25
        L1e:
            r3 = r5
            goto L25
        L20:
            r2 = r5
            goto L25
        L22:
            r1 = r5
            goto L25
        L24:
            r0 = r5
        L25:
            int r4 = r4 + 1
            goto L9
        L28:
            androidx.constraintlayout.motion.widget.MotionController r11 = r10.mRelativeToController
            if (r11 == 0) goto L53
            float r11 = r11.getCenterX()
            androidx.constraintlayout.motion.widget.MotionController r12 = r10.mRelativeToController
            float r12 = r12.getCenterY()
            double r4 = (double) r11
            double r6 = (double) r0
            double r0 = (double) r1
            double r8 = java.lang.Math.sin(r0)
            double r8 = r8 * r6
            double r4 = r4 + r8
            r11 = 1073741824(0x40000000, float:2.0)
            float r8 = r2 / r11
            double r8 = (double) r8
            double r4 = r4 - r8
            float r4 = (float) r4
            double r8 = (double) r12
            double r0 = java.lang.Math.cos(r0)
            double r6 = r6 * r0
            double r8 = r8 - r6
            float r11 = r3 / r11
            double r11 = (double) r11
            double r8 = r8 - r11
            float r1 = (float) r8
            r0 = r4
        L53:
            float r2 = r2 + r0
            float r3 = r3 + r1
            r11 = 2143289344(0x7fc00000, float:NaN)
            java.lang.Float.isNaN(r11)
            java.lang.Float.isNaN(r11)
            r11 = 0
            float r12 = r0 + r11
            float r4 = r1 + r11
            float r5 = r2 + r11
            float r1 = r1 + r11
            float r2 = r2 + r11
            float r6 = r3 + r11
            float r0 = r0 + r11
            float r3 = r3 + r11
            int r11 = r14 + 1
            r13[r14] = r12
            int r12 = r11 + 1
            r13[r11] = r4
            int r11 = r12 + 1
            r13[r12] = r5
            int r12 = r11 + 1
            r13[r11] = r1
            int r11 = r12 + 1
            r13[r12] = r2
            int r12 = r11 + 1
            r13[r11] = r6
            int r11 = r12 + 1
            r13[r12] = r0
            r13[r11] = r3
            return
    }

    boolean hasCustomData(java.lang.String r2) {
            r1 = this;
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r1.attributes
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    void initCartesian(androidx.constraintlayout.motion.widget.KeyPosition r18, androidx.constraintlayout.motion.widget.MotionPaths r19, androidx.constraintlayout.motion.widget.MotionPaths r20) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            int r4 = r1.mFramePosition
            float r4 = (float) r4
            r5 = 1120403456(0x42c80000, float:100.0)
            float r4 = r4 / r5
            r0.time = r4
            int r5 = r1.mDrawPath
            r0.mDrawPath = r5
            float r5 = r1.mPercentWidth
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 == 0) goto L1e
            r5 = r4
            goto L20
        L1e:
            float r5 = r1.mPercentWidth
        L20:
            float r6 = r1.mPercentHeight
            boolean r6 = java.lang.Float.isNaN(r6)
            if (r6 == 0) goto L2a
            r6 = r4
            goto L2c
        L2a:
            float r6 = r1.mPercentHeight
        L2c:
            float r7 = r3.width
            float r8 = r2.width
            float r9 = r7 - r8
            float r10 = r3.height
            float r11 = r2.height
            float r12 = r10 - r11
            float r13 = r0.time
            r0.position = r13
            float r13 = r2.f54x
            r14 = 1073741824(0x40000000, float:2.0)
            float r15 = r8 / r14
            float r15 = r15 + r13
            float r1 = r2.f55y
            float r16 = r11 / r14
            float r16 = r1 + r16
            float r2 = r3.f54x
            float r7 = r7 / r14
            float r2 = r2 + r7
            float r3 = r3.f55y
            float r10 = r10 / r14
            float r3 = r3 + r10
            float r2 = r2 - r15
            float r3 = r3 - r16
            float r7 = r2 * r4
            float r13 = r13 + r7
            float r9 = r9 * r5
            float r5 = r9 / r14
            float r13 = r13 - r5
            int r7 = (int) r13
            float r7 = (float) r7
            r0.f54x = r7
            float r7 = r3 * r4
            float r1 = r1 + r7
            float r12 = r12 * r6
            float r6 = r12 / r14
            float r1 = r1 - r6
            int r1 = (int) r1
            float r1 = (float) r1
            r0.f55y = r1
            float r8 = r8 + r9
            int r1 = (int) r8
            float r1 = (float) r1
            r0.width = r1
            float r11 = r11 + r12
            int r1 = (int) r11
            float r1 = (float) r1
            r0.height = r1
            r1 = r18
            float r7 = r1.mPercentX
            boolean r7 = java.lang.Float.isNaN(r7)
            if (r7 == 0) goto L80
            r7 = r4
            goto L82
        L80:
            float r7 = r1.mPercentX
        L82:
            float r8 = r1.mAltPercentY
            boolean r8 = java.lang.Float.isNaN(r8)
            r9 = 0
            if (r8 == 0) goto L8d
            r8 = r9
            goto L8f
        L8d:
            float r8 = r1.mAltPercentY
        L8f:
            float r10 = r1.mPercentY
            boolean r10 = java.lang.Float.isNaN(r10)
            if (r10 == 0) goto L98
            goto L9a
        L98:
            float r4 = r1.mPercentY
        L9a:
            float r10 = r1.mAltPercentX
            boolean r10 = java.lang.Float.isNaN(r10)
            if (r10 == 0) goto La3
            goto La5
        La3:
            float r9 = r1.mAltPercentX
        La5:
            r10 = 0
            r0.mMode = r10
            r10 = r19
            float r11 = r10.f54x
            float r7 = r7 * r2
            float r11 = r11 + r7
            float r9 = r9 * r3
            float r11 = r11 + r9
            float r11 = r11 - r5
            int r5 = (int) r11
            float r5 = (float) r5
            r0.f54x = r5
            float r5 = r10.f55y
            float r2 = r2 * r8
            float r5 = r5 + r2
            float r3 = r3 * r4
            float r5 = r5 + r3
            float r5 = r5 - r6
            int r2 = (int) r5
            float r2 = (float) r2
            r0.f55y = r2
            java.lang.String r2 = r1.mTransitionEasing
            androidx.constraintlayout.core.motion.utils.Easing r2 = androidx.constraintlayout.core.motion.utils.Easing.getInterpolator(r2)
            r0.mKeyFrameEasing = r2
            int r1 = r1.mPathMotionArc
            r0.mPathMotionArc = r1
            return
    }

    void initPath(androidx.constraintlayout.motion.widget.KeyPosition r17, androidx.constraintlayout.motion.widget.MotionPaths r18, androidx.constraintlayout.motion.widget.MotionPaths r19) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            int r4 = r1.mFramePosition
            float r4 = (float) r4
            r5 = 1120403456(0x42c80000, float:100.0)
            float r4 = r4 / r5
            r0.time = r4
            int r5 = r1.mDrawPath
            r0.mDrawPath = r5
            float r5 = r1.mPercentWidth
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 == 0) goto L1e
            r5 = r4
            goto L20
        L1e:
            float r5 = r1.mPercentWidth
        L20:
            float r6 = r1.mPercentHeight
            boolean r6 = java.lang.Float.isNaN(r6)
            if (r6 == 0) goto L2a
            r6 = r4
            goto L2c
        L2a:
            float r6 = r1.mPercentHeight
        L2c:
            float r7 = r3.width
            float r8 = r2.width
            float r7 = r7 - r8
            float r8 = r3.height
            float r9 = r2.height
            float r8 = r8 - r9
            float r9 = r0.time
            r0.position = r9
            float r9 = r1.mPercentX
            boolean r9 = java.lang.Float.isNaN(r9)
            if (r9 == 0) goto L43
            goto L45
        L43:
            float r4 = r1.mPercentX
        L45:
            float r9 = r2.f54x
            float r10 = r2.width
            r11 = 1073741824(0x40000000, float:2.0)
            float r12 = r10 / r11
            float r12 = r12 + r9
            float r13 = r2.f55y
            float r14 = r2.height
            float r15 = r14 / r11
            float r15 = r15 + r13
            float r2 = r3.f54x
            float r1 = r3.width
            float r1 = r1 / r11
            float r2 = r2 + r1
            float r1 = r3.f55y
            float r3 = r3.height
            float r3 = r3 / r11
            float r1 = r1 + r3
            float r2 = r2 - r12
            float r1 = r1 - r15
            float r3 = r2 * r4
            float r9 = r9 + r3
            float r7 = r7 * r5
            float r5 = r7 / r11
            float r9 = r9 - r5
            int r9 = (int) r9
            float r9 = (float) r9
            r0.f54x = r9
            float r4 = r4 * r1
            float r13 = r13 + r4
            float r8 = r8 * r6
            float r6 = r8 / r11
            float r13 = r13 - r6
            int r9 = (int) r13
            float r9 = (float) r9
            r0.f55y = r9
            float r10 = r10 + r7
            int r7 = (int) r10
            float r7 = (float) r7
            r0.width = r7
            float r14 = r14 + r8
            int r7 = (int) r14
            float r7 = (float) r7
            r0.height = r7
            r7 = r17
            float r8 = r7.mPercentY
            boolean r8 = java.lang.Float.isNaN(r8)
            if (r8 == 0) goto L8e
            r8 = 0
            goto L90
        L8e:
            float r8 = r7.mPercentY
        L90:
            float r1 = -r1
            float r1 = r1 * r8
            float r2 = r2 * r8
            r8 = 1
            r0.mMode = r8
            r8 = r18
            float r9 = r8.f54x
            float r9 = r9 + r3
            float r9 = r9 - r5
            int r3 = (int) r9
            float r3 = (float) r3
            r0.f54x = r3
            float r5 = r8.f55y
            float r5 = r5 + r4
            float r5 = r5 - r6
            int r4 = (int) r5
            float r4 = (float) r4
            float r3 = r3 + r1
            r0.f54x = r3
            float r4 = r4 + r2
            r0.f55y = r4
            int r1 = r0.mAnimateRelativeTo
            r0.mAnimateRelativeTo = r1
            java.lang.String r1 = r7.mTransitionEasing
            androidx.constraintlayout.core.motion.utils.Easing r1 = androidx.constraintlayout.core.motion.utils.Easing.getInterpolator(r1)
            r0.mKeyFrameEasing = r1
            int r1 = r7.mPathMotionArc
            r0.mPathMotionArc = r1
            return
    }

    void initPolar(int r7, int r8, androidx.constraintlayout.motion.widget.KeyPosition r9, androidx.constraintlayout.motion.widget.MotionPaths r10, androidx.constraintlayout.motion.widget.MotionPaths r11) {
            r6 = this;
            int r7 = r9.mFramePosition
            float r7 = (float) r7
            r8 = 1120403456(0x42c80000, float:100.0)
            float r7 = r7 / r8
            r6.time = r7
            int r8 = r9.mDrawPath
            r6.mDrawPath = r8
            int r8 = r9.mPositionType
            r6.mMode = r8
            float r8 = r9.mPercentWidth
            boolean r8 = java.lang.Float.isNaN(r8)
            if (r8 == 0) goto L1a
            r8 = r7
            goto L1c
        L1a:
            float r8 = r9.mPercentWidth
        L1c:
            float r0 = r9.mPercentHeight
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L26
            r0 = r7
            goto L28
        L26:
            float r0 = r9.mPercentHeight
        L28:
            float r1 = r11.width
            float r2 = r10.width
            float r1 = r1 - r2
            float r3 = r11.height
            float r4 = r10.height
            float r3 = r3 - r4
            float r5 = r6.time
            r6.position = r5
            float r1 = r1 * r8
            float r2 = r2 + r1
            int r1 = (int) r2
            float r1 = (float) r1
            r6.width = r1
            float r3 = r3 * r0
            float r4 = r4 + r3
            int r1 = (int) r4
            float r1 = (float) r1
            r6.height = r1
            int r1 = r9.mPositionType
            r2 = 1
            if (r1 == r2) goto La2
            r2 = 2
            if (r1 == r2) goto L74
            float r8 = r9.mPercentX
            boolean r8 = java.lang.Float.isNaN(r8)
            if (r8 == 0) goto L54
            r8 = r7
            goto L56
        L54:
            float r8 = r9.mPercentX
        L56:
            float r0 = r11.f54x
            float r1 = r10.f54x
            float r0 = r0 - r1
            float r8 = r8 * r0
            float r8 = r8 + r1
            r6.f54x = r8
            float r8 = r9.mPercentY
            boolean r8 = java.lang.Float.isNaN(r8)
            if (r8 == 0) goto L68
            goto L6a
        L68:
            float r7 = r9.mPercentY
        L6a:
            float r8 = r11.f55y
            float r11 = r10.f55y
            float r8 = r8 - r11
            float r7 = r7 * r8
            float r7 = r7 + r11
            r6.f55y = r7
            goto Lcb
        L74:
            float r1 = r9.mPercentX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L84
            float r8 = r11.f54x
            float r0 = r10.f54x
            float r8 = r8 - r0
            float r8 = r8 * r7
            float r8 = r8 + r0
            goto L8b
        L84:
            float r1 = r9.mPercentX
            float r8 = java.lang.Math.min(r0, r8)
            float r8 = r8 * r1
        L8b:
            r6.f54x = r8
            float r8 = r9.mPercentY
            boolean r8 = java.lang.Float.isNaN(r8)
            if (r8 == 0) goto L9d
            float r8 = r11.f55y
            float r11 = r10.f55y
            float r8 = r8 - r11
            float r7 = r7 * r8
            float r7 = r7 + r11
            goto L9f
        L9d:
            float r7 = r9.mPercentY
        L9f:
            r6.f55y = r7
            goto Lcb
        La2:
            float r8 = r9.mPercentX
            boolean r8 = java.lang.Float.isNaN(r8)
            if (r8 == 0) goto Lac
            r8 = r7
            goto Lae
        Lac:
            float r8 = r9.mPercentX
        Lae:
            float r0 = r11.f54x
            float r1 = r10.f54x
            float r0 = r0 - r1
            float r8 = r8 * r0
            float r8 = r8 + r1
            r6.f54x = r8
            float r8 = r9.mPercentY
            boolean r8 = java.lang.Float.isNaN(r8)
            if (r8 == 0) goto Lc0
            goto Lc2
        Lc0:
            float r7 = r9.mPercentY
        Lc2:
            float r8 = r11.f55y
            float r11 = r10.f55y
            float r8 = r8 - r11
            float r7 = r7 * r8
            float r7 = r7 + r11
            r6.f55y = r7
        Lcb:
            int r7 = r10.mAnimateRelativeTo
            r6.mAnimateRelativeTo = r7
            java.lang.String r7 = r9.mTransitionEasing
            androidx.constraintlayout.core.motion.utils.Easing r7 = androidx.constraintlayout.core.motion.utils.Easing.getInterpolator(r7)
            r6.mKeyFrameEasing = r7
            int r7 = r9.mPathMotionArc
            r6.mPathMotionArc = r7
            return
    }

    void initScreen(int r18, int r19, androidx.constraintlayout.motion.widget.KeyPosition r20, androidx.constraintlayout.motion.widget.MotionPaths r21, androidx.constraintlayout.motion.widget.MotionPaths r22) {
            r17 = this;
            r0 = r17
            r1 = r20
            r2 = r21
            r3 = r22
            int r4 = r1.mFramePosition
            float r4 = (float) r4
            r5 = 1120403456(0x42c80000, float:100.0)
            float r4 = r4 / r5
            r0.time = r4
            int r5 = r1.mDrawPath
            r0.mDrawPath = r5
            float r5 = r1.mPercentWidth
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 == 0) goto L1e
            r5 = r4
            goto L20
        L1e:
            float r5 = r1.mPercentWidth
        L20:
            float r6 = r1.mPercentHeight
            boolean r6 = java.lang.Float.isNaN(r6)
            if (r6 == 0) goto L2a
            r6 = r4
            goto L2c
        L2a:
            float r6 = r1.mPercentHeight
        L2c:
            float r7 = r3.width
            float r8 = r2.width
            float r9 = r7 - r8
            float r10 = r3.height
            float r11 = r2.height
            float r12 = r10 - r11
            float r13 = r0.time
            r0.position = r13
            float r13 = r2.f54x
            r14 = 1073741824(0x40000000, float:2.0)
            float r15 = r8 / r14
            float r15 = r15 + r13
            float r2 = r2.f55y
            float r16 = r11 / r14
            float r16 = r2 + r16
            float r1 = r3.f54x
            float r7 = r7 / r14
            float r1 = r1 + r7
            float r3 = r3.f55y
            float r10 = r10 / r14
            float r3 = r3 + r10
            float r1 = r1 - r15
            float r3 = r3 - r16
            float r1 = r1 * r4
            float r13 = r13 + r1
            float r9 = r9 * r5
            float r1 = r9 / r14
            float r13 = r13 - r1
            int r1 = (int) r13
            float r1 = (float) r1
            r0.f54x = r1
            float r3 = r3 * r4
            float r2 = r2 + r3
            float r12 = r12 * r6
            float r1 = r12 / r14
            float r2 = r2 - r1
            int r1 = (int) r2
            float r1 = (float) r1
            r0.f55y = r1
            float r8 = r8 + r9
            int r1 = (int) r8
            float r1 = (float) r1
            r0.width = r1
            float r11 = r11 + r12
            int r1 = (int) r11
            float r1 = (float) r1
            r0.height = r1
            r1 = 2
            r0.mMode = r1
            r1 = r20
            float r2 = r1.mPercentX
            boolean r2 = java.lang.Float.isNaN(r2)
            if (r2 != 0) goto L8e
            r2 = r18
            float r2 = (float) r2
            float r3 = r0.width
            float r2 = r2 - r3
            int r2 = (int) r2
            float r3 = r1.mPercentX
            float r2 = (float) r2
            float r3 = r3 * r2
            int r2 = (int) r3
            float r2 = (float) r2
            r0.f54x = r2
        L8e:
            float r2 = r1.mPercentY
            boolean r2 = java.lang.Float.isNaN(r2)
            if (r2 != 0) goto La5
            r2 = r19
            float r2 = (float) r2
            float r3 = r0.height
            float r2 = r2 - r3
            int r2 = (int) r2
            float r3 = r1.mPercentY
            float r2 = (float) r2
            float r3 = r3 * r2
            int r2 = (int) r3
            float r2 = (float) r2
            r0.f55y = r2
        La5:
            int r2 = r0.mAnimateRelativeTo
            r0.mAnimateRelativeTo = r2
            java.lang.String r2 = r1.mTransitionEasing
            androidx.constraintlayout.core.motion.utils.Easing r2 = androidx.constraintlayout.core.motion.utils.Easing.getInterpolator(r2)
            r0.mKeyFrameEasing = r2
            int r1 = r1.mPathMotionArc
            r0.mPathMotionArc = r1
            return
    }

    void setBounds(float r1, float r2, float r3, float r4) {
            r0 = this;
            r0.f54x = r1
            r0.f55y = r2
            r0.width = r3
            r0.height = r4
            return
    }

    void setDpDt(float r13, float r14, float[] r15, int[] r16, double[] r17, double[] r18) {
            r12 = this;
            r0 = r16
            r1 = 0
            r2 = 0
            r4 = r1
            r5 = r4
            r6 = r5
            r7 = r6
            r3 = r2
        L9:
            int r8 = r0.length
            r9 = 1
            if (r3 >= r8) goto L2a
            r10 = r17[r3]
            float r8 = (float) r10
            r10 = r18[r3]
            r10 = r0[r3]
            if (r10 == r9) goto L26
            r9 = 2
            if (r10 == r9) goto L24
            r9 = 3
            if (r10 == r9) goto L22
            r9 = 4
            if (r10 == r9) goto L20
            goto L27
        L20:
            r7 = r8
            goto L27
        L22:
            r5 = r8
            goto L27
        L24:
            r6 = r8
            goto L27
        L26:
            r4 = r8
        L27:
            int r3 = r3 + 1
            goto L9
        L2a:
            float r0 = r1 * r5
            r3 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r3
            float r4 = r4 - r0
            float r0 = r1 * r7
            float r0 = r0 / r3
            float r6 = r6 - r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 * r0
            float r7 = r7 * r0
            float r5 = r5 + r4
            float r7 = r7 + r6
            float r3 = r0 - r13
            float r4 = r4 * r3
            float r5 = r5 * r13
            float r4 = r4 + r5
            float r4 = r4 + r1
            r15[r2] = r4
            float r0 = r0 - r14
            float r6 = r6 * r0
            float r7 = r7 * r14
            float r6 = r6 + r7
            float r6 = r6 + r1
            r15[r9] = r6
            return
    }

    void setView(float r21, android.view.View r22, int[] r23, double[] r24, double[] r25, double[] r26, boolean r27) {
            r20 = this;
            r0 = r20
            r1 = r22
            r2 = r23
            r3 = r25
            float r4 = r0.f54x
            float r5 = r0.f55y
            float r6 = r0.width
            float r7 = r0.height
            int r8 = r2.length
            r9 = 1
            if (r8 == 0) goto L2a
            double[] r8 = r0.mTempValue
            int r8 = r8.length
            int r10 = r2.length
            int r10 = r10 - r9
            r10 = r2[r10]
            if (r8 > r10) goto L2a
            int r8 = r2.length
            int r8 = r8 - r9
            r8 = r2[r8]
            int r8 = r8 + r9
            double[] r10 = new double[r8]
            r0.mTempValue = r10
            double[] r8 = new double[r8]
            r0.mTempDelta = r8
        L2a:
            double[] r8 = r0.mTempValue
            r10 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            java.util.Arrays.fill(r8, r10)
            r10 = 0
        L32:
            int r11 = r2.length
            if (r10 >= r11) goto L46
            double[] r11 = r0.mTempValue
            r12 = r2[r10]
            r13 = r24[r10]
            r11[r12] = r13
            double[] r11 = r0.mTempDelta
            r13 = r3[r10]
            r11[r12] = r13
            int r10 = r10 + 1
            goto L32
        L46:
            r10 = 2143289344(0x7fc00000, float:NaN)
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L4d:
            double[] r2 = r0.mTempValue
            int r8 = r2.length
            if (r11 >= r8) goto Lb3
            r16 = r2[r11]
            boolean r2 = java.lang.Double.isNaN(r16)
            r16 = 0
            if (r2 == 0) goto L67
            if (r26 == 0) goto L64
            r18 = r26[r11]
            int r2 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r2 != 0) goto L67
        L64:
            r24 = r10
            goto L95
        L67:
            if (r26 == 0) goto L6b
            r16 = r26[r11]
        L6b:
            double[] r2 = r0.mTempValue
            r18 = r2[r11]
            boolean r2 = java.lang.Double.isNaN(r18)
            if (r2 == 0) goto L76
            goto L7c
        L76:
            double[] r2 = r0.mTempValue
            r18 = r2[r11]
            double r16 = r18 + r16
        L7c:
            r24 = r10
            r9 = r16
            float r8 = (float) r9
            double[] r9 = r0.mTempDelta
            r2 = r9[r11]
            float r2 = (float) r2
            r3 = 1
            if (r11 == r3) goto La9
            r3 = 2
            if (r11 == r3) goto La4
            r3 = 3
            if (r11 == r3) goto L9f
            r3 = 4
            if (r11 == r3) goto L9a
            r2 = 5
            if (r11 == r2) goto L98
        L95:
            r10 = r24
            goto Lad
        L98:
            r10 = r8
            goto Lad
        L9a:
            r10 = r24
            r15 = r2
            r7 = r8
            goto Lad
        L9f:
            r10 = r24
            r14 = r2
            r6 = r8
            goto Lad
        La4:
            r10 = r24
            r13 = r2
            r5 = r8
            goto Lad
        La9:
            r10 = r24
            r12 = r2
            r4 = r8
        Lad:
            int r11 = r11 + 1
            r3 = r25
            r9 = 1
            goto L4d
        Lb3:
            r24 = r10
            androidx.constraintlayout.motion.widget.MotionController r3 = r0.mRelativeToController
            r8 = 1073741824(0x40000000, float:2.0)
            if (r3 == 0) goto L150
            r2 = 2
            float[] r9 = new float[r2]
            float[] r10 = new float[r2]
            r11 = r21
            double r14 = (double) r11
            r3.getCenter(r14, r9, r10)
            r3 = 0
            r11 = r9[r3]
            r14 = 1
            r9 = r9[r14]
            r15 = r10[r3]
            r3 = r10[r14]
            double r10 = (double) r11
            r21 = r3
            double r2 = (double) r4
            double r4 = (double) r5
            double r16 = java.lang.Math.sin(r4)
            double r16 = r16 * r2
            double r10 = r10 + r16
            float r14 = r6 / r8
            r16 = r9
            double r8 = (double) r14
            double r10 = r10 - r8
            float r8 = (float) r10
            r9 = r16
            double r9 = (double) r9
            double r16 = java.lang.Math.cos(r4)
            double r16 = r16 * r2
            double r9 = r9 - r16
            r11 = 1073741824(0x40000000, float:2.0)
            float r11 = r7 / r11
            r16 = r7
            r14 = r8
            double r7 = (double) r11
            double r9 = r9 - r7
            float r7 = (float) r9
            double r8 = (double) r15
            double r10 = (double) r12
            double r17 = java.lang.Math.sin(r4)
            double r17 = r17 * r10
            double r8 = r8 + r17
            double r17 = java.lang.Math.cos(r4)
            double r17 = r17 * r2
            double r12 = (double) r13
            double r17 = r17 * r12
            double r8 = r8 + r17
            float r8 = (float) r8
            r9 = r21
            r21 = r14
            double r14 = (double) r9
            double r17 = java.lang.Math.cos(r4)
            double r10 = r10 * r17
            double r14 = r14 - r10
            double r4 = java.lang.Math.sin(r4)
            double r2 = r2 * r4
            double r2 = r2 * r12
            double r14 = r14 + r2
            float r2 = (float) r14
            r3 = r25
            int r4 = r3.length
            r5 = 2
            if (r4 < r5) goto L132
            double r4 = (double) r8
            r9 = 0
            r3[r9] = r4
            double r4 = (double) r2
            r10 = 1
            r3[r10] = r4
            goto L134
        L132:
            r9 = 0
            r10 = 1
        L134:
            boolean r3 = java.lang.Float.isNaN(r24)
            if (r3 != 0) goto L14c
            r3 = r24
            double r3 = (double) r3
            double r11 = (double) r2
            double r13 = (double) r8
            double r11 = java.lang.Math.atan2(r11, r13)
            double r11 = java.lang.Math.toDegrees(r11)
            double r3 = r3 + r11
            float r2 = (float) r3
            r1.setRotation(r2)
        L14c:
            r4 = r21
            r5 = r7
            goto L175
        L150:
            r3 = r24
            r16 = r7
            r9 = 0
            r10 = 1
            boolean r2 = java.lang.Float.isNaN(r3)
            if (r2 != 0) goto L175
            r2 = 1073741824(0x40000000, float:2.0)
            float r14 = r14 / r2
            float r12 = r12 + r14
            float r15 = r15 / r2
            float r13 = r13 + r15
            r2 = 0
            double r7 = (double) r2
            double r2 = (double) r3
            double r13 = (double) r13
            double r11 = (double) r12
            double r11 = java.lang.Math.atan2(r13, r11)
            double r11 = java.lang.Math.toDegrees(r11)
            double r2 = r2 + r11
            double r7 = r7 + r2
            float r2 = (float) r7
            r1.setRotation(r2)
        L175:
            boolean r2 = r1 instanceof androidx.constraintlayout.motion.widget.FloatLayout
            if (r2 == 0) goto L182
            float r6 = r6 + r4
            float r7 = r5 + r16
            androidx.constraintlayout.motion.widget.FloatLayout r1 = (androidx.constraintlayout.motion.widget.FloatLayout) r1
            r1.layout(r4, r5, r6, r7)
            return
        L182:
            r2 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 + r2
            int r3 = (int) r4
            float r5 = r5 + r2
            int r2 = (int) r5
            float r4 = r4 + r6
            int r4 = (int) r4
            float r5 = r5 + r16
            int r5 = (int) r5
            int r6 = r4 - r3
            int r7 = r5 - r2
            int r8 = r22.getMeasuredWidth()
            if (r6 != r8) goto L19d
            int r8 = r22.getMeasuredHeight()
            if (r7 == r8) goto L19e
        L19d:
            r9 = r10
        L19e:
            if (r9 != 0) goto L1a2
            if (r27 == 0) goto L1af
        L1a2:
            r8 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r8)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r8)
            r1.measure(r6, r7)
        L1af:
            r1.layout(r3, r2, r4, r5)
            return
    }

    public void setupRelative(androidx.constraintlayout.motion.widget.MotionController r6, androidx.constraintlayout.motion.widget.MotionPaths r7) {
            r5 = this;
            float r0 = r5.f54x
            float r1 = r5.width
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            float r0 = r0 + r1
            float r1 = r7.f54x
            float r0 = r0 - r1
            float r1 = r7.width
            float r1 = r1 / r2
            float r0 = r0 - r1
            double r0 = (double) r0
            float r3 = r5.f55y
            float r4 = r5.height
            float r4 = r4 / r2
            float r3 = r3 + r4
            float r4 = r7.f55y
            float r3 = r3 - r4
            float r7 = r7.height
            float r7 = r7 / r2
            float r3 = r3 - r7
            double r2 = (double) r3
            r5.mRelativeToController = r6
            double r6 = java.lang.Math.hypot(r2, r0)
            float r6 = (float) r6
            r5.f54x = r6
            float r6 = r5.mRelativeAngle
            boolean r6 = java.lang.Float.isNaN(r6)
            if (r6 == 0) goto L3d
            double r6 = java.lang.Math.atan2(r2, r0)
            r0 = 4609753056924675352(0x3ff921fb54442d18, double:1.5707963267948966)
            double r6 = r6 + r0
            float r6 = (float) r6
            r5.f55y = r6
            goto L47
        L3d:
            float r6 = r5.mRelativeAngle
            double r6 = (double) r6
            double r6 = java.lang.Math.toRadians(r6)
            float r6 = (float) r6
            r5.f55y = r6
        L47:
            return
    }
}
