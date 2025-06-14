package androidx.constraintlayout.core.motion.key;

/* loaded from: classes.dex */
public class MotionKeyPosition extends androidx.constraintlayout.core.motion.key.MotionKey {
    static final int KEY_TYPE = 2;
    static final java.lang.String NAME = "KeyPosition";
    protected static final float SELECTION_SLOPE = 20.0f;
    public static final int TYPE_CARTESIAN = 0;
    public static final int TYPE_PATH = 1;
    public static final int TYPE_SCREEN = 2;
    public float mAltPercentX;
    public float mAltPercentY;
    private float mCalculatedPositionX;
    private float mCalculatedPositionY;
    public int mCurveFit;
    public int mDrawPath;
    public int mPathMotionArc;
    public float mPercentHeight;
    public float mPercentWidth;
    public float mPercentX;
    public float mPercentY;
    public int mPositionType;
    public java.lang.String mTransitionEasing;

    public MotionKeyPosition() {
            r2 = this;
            r2.<init>()
            int r0 = androidx.constraintlayout.core.motion.key.MotionKeyPosition.UNSET
            r2.mCurveFit = r0
            r0 = 0
            r2.mTransitionEasing = r0
            int r0 = androidx.constraintlayout.core.motion.key.MotionKeyPosition.UNSET
            r2.mPathMotionArc = r0
            r0 = 0
            r2.mDrawPath = r0
            r1 = 2143289344(0x7fc00000, float:NaN)
            r2.mPercentWidth = r1
            r2.mPercentHeight = r1
            r2.mPercentX = r1
            r2.mPercentY = r1
            r2.mAltPercentX = r1
            r2.mAltPercentY = r1
            r2.mPositionType = r0
            r2.mCalculatedPositionX = r1
            r2.mCalculatedPositionY = r1
            r0 = 2
            r2.mType = r0
            return
    }

    private void calcCartesianPosition(float r6, float r7, float r8, float r9) {
            r5 = this;
            float r8 = r8 - r6
            float r9 = r9 - r7
            float r0 = r5.mPercentX
            boolean r0 = java.lang.Float.isNaN(r0)
            r1 = 0
            if (r0 == 0) goto Ld
            r0 = r1
            goto Lf
        Ld:
            float r0 = r5.mPercentX
        Lf:
            float r2 = r5.mAltPercentY
            boolean r2 = java.lang.Float.isNaN(r2)
            if (r2 == 0) goto L19
            r2 = r1
            goto L1b
        L19:
            float r2 = r5.mAltPercentY
        L1b:
            float r3 = r5.mPercentY
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 == 0) goto L25
            r3 = r1
            goto L27
        L25:
            float r3 = r5.mPercentY
        L27:
            float r4 = r5.mAltPercentX
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 == 0) goto L30
            goto L32
        L30:
            float r1 = r5.mAltPercentX
        L32:
            float r0 = r0 * r8
            float r6 = r6 + r0
            float r1 = r1 * r9
            float r6 = r6 + r1
            int r6 = (int) r6
            float r6 = (float) r6
            r5.mCalculatedPositionX = r6
            float r8 = r8 * r2
            float r7 = r7 + r8
            float r9 = r9 * r3
            float r7 = r7 + r9
            int r6 = (int) r7
            float r6 = (float) r6
            r5.mCalculatedPositionY = r6
            return
    }

    private void calcPathPosition(float r4, float r5, float r6, float r7) {
            r3 = this;
            float r6 = r6 - r4
            float r7 = r7 - r5
            float r0 = -r7
            float r1 = r3.mPercentX
            float r2 = r6 * r1
            float r4 = r4 + r2
            float r2 = r3.mPercentY
            float r0 = r0 * r2
            float r4 = r4 + r0
            r3.mCalculatedPositionX = r4
            float r7 = r7 * r1
            float r5 = r5 + r7
            float r6 = r6 * r2
            float r5 = r5 + r6
            r3.mCalculatedPositionY = r5
            return
    }

    private void calcScreenPosition(int r4, int r5) {
            r3 = this;
            r0 = 0
            int r4 = r4 - r0
            float r4 = (float) r4
            float r1 = r3.mPercentX
            float r4 = r4 * r1
            float r2 = (float) r0
            float r4 = r4 + r2
            r3.mCalculatedPositionX = r4
            int r5 = r5 - r0
            float r4 = (float) r5
            float r4 = r4 * r1
            float r4 = r4 + r2
            r3.mCalculatedPositionY = r4
            return
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void addValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> r1) {
            r0 = this;
            return
    }

    void calcPosition(int r3, int r4, float r5, float r6, float r7, float r8) {
            r2 = this;
            int r0 = r2.mPositionType
            r1 = 1
            if (r0 == r1) goto L10
            r1 = 2
            if (r0 == r1) goto Lc
            r2.calcCartesianPosition(r5, r6, r7, r8)
            return
        Lc:
            r2.calcScreenPosition(r3, r4)
            return
        L10:
            r2.calcPathPosition(r5, r6, r7, r8)
            return
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public androidx.constraintlayout.core.motion.key.MotionKey clone() {
            r1 = this;
            androidx.constraintlayout.core.motion.key.MotionKeyPosition r0 = new androidx.constraintlayout.core.motion.key.MotionKeyPosition
            r0.<init>()
            androidx.constraintlayout.core.motion.key.MotionKey r0 = r0.copy(r1)
            return r0
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* renamed from: clone */
    public /* bridge */ /* synthetic */ java.lang.Object mo128clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            androidx.constraintlayout.core.motion.key.MotionKey r0 = r1.clone()
            return r0
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public androidx.constraintlayout.core.motion.key.MotionKey copy(androidx.constraintlayout.core.motion.key.MotionKey r2) {
            r1 = this;
            super.copy(r2)
            androidx.constraintlayout.core.motion.key.MotionKeyPosition r2 = (androidx.constraintlayout.core.motion.key.MotionKeyPosition) r2
            java.lang.String r0 = r2.mTransitionEasing
            r1.mTransitionEasing = r0
            int r0 = r2.mPathMotionArc
            r1.mPathMotionArc = r0
            int r0 = r2.mDrawPath
            r1.mDrawPath = r0
            float r0 = r2.mPercentWidth
            r1.mPercentWidth = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            r1.mPercentHeight = r0
            float r0 = r2.mPercentX
            r1.mPercentX = r0
            float r0 = r2.mPercentY
            r1.mPercentY = r0
            float r0 = r2.mAltPercentX
            r1.mAltPercentX = r0
            float r0 = r2.mAltPercentY
            r1.mAltPercentY = r0
            float r0 = r2.mCalculatedPositionX
            r1.mCalculatedPositionX = r0
            float r2 = r2.mCalculatedPositionY
            r1.mCalculatedPositionY = r2
            return r1
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void getAttributeNames(java.util.HashSet<java.lang.String> r1) {
            r0 = this;
            return
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(java.lang.String r1) {
            r0 = this;
            int r1 = androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.getId(r1)
            return r1
    }

    float getPositionX() {
            r1 = this;
            float r0 = r1.mCalculatedPositionX
            return r0
    }

    float getPositionY() {
            r1 = this;
            float r0 = r1.mCalculatedPositionY
            return r0
    }

    public boolean intersects(int r8, int r9, androidx.constraintlayout.core.motion.utils.FloatRect r10, androidx.constraintlayout.core.motion.utils.FloatRect r11, float r12, float r13) {
            r7 = this;
            float r3 = r10.centerX()
            float r4 = r10.centerY()
            float r5 = r11.centerX()
            float r6 = r11.centerY()
            r0 = r7
            r1 = r8
            r2 = r9
            r0.calcPosition(r1, r2, r3, r4, r5, r6)
            float r8 = r7.mCalculatedPositionX
            float r12 = r12 - r8
            float r8 = java.lang.Math.abs(r12)
            r9 = 1101004800(0x41a00000, float:20.0)
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 >= 0) goto L30
            float r8 = r7.mCalculatedPositionY
            float r13 = r13 - r8
            float r8 = java.lang.Math.abs(r13)
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 >= 0) goto L30
            r8 = 1
            return r8
        L30:
            r8 = 0
            return r8
    }

    public void positionAttributes(androidx.constraintlayout.core.motion.MotionWidget r8, androidx.constraintlayout.core.motion.utils.FloatRect r9, androidx.constraintlayout.core.motion.utils.FloatRect r10, float r11, float r12, java.lang.String[] r13, float[] r14) {
            r7 = this;
            int r0 = r7.mPositionType
            r1 = 1
            if (r0 == r1) goto L17
            r1 = 2
            if (r0 == r1) goto L13
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r0.positionCartAttributes(r1, r2, r3, r4, r5, r6)
            return
        L13:
            r7.positionScreenAttributes(r8, r9, r10, r11, r12, r13, r14)
            return
        L17:
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r0.positionPathAttributes(r1, r2, r3, r4, r5, r6)
            return
    }

    void positionCartAttributes(androidx.constraintlayout.core.motion.utils.FloatRect r7, androidx.constraintlayout.core.motion.utils.FloatRect r8, float r9, float r10, java.lang.String[] r11, float[] r12) {
            r6 = this;
            float r0 = r7.centerX()
            float r7 = r7.centerY()
            float r1 = r8.centerX()
            float r8 = r8.centerY()
            float r1 = r1 - r0
            float r8 = r8 - r7
            r2 = 0
            r3 = r11[r2]
            java.lang.String r4 = "percentX"
            r5 = 1
            if (r3 == 0) goto L32
            boolean r11 = r4.equals(r3)
            if (r11 == 0) goto L29
            float r9 = r9 - r0
            float r9 = r9 / r1
            r12[r2] = r9
            float r10 = r10 - r7
            float r10 = r10 / r8
            r12[r5] = r10
            goto L40
        L29:
            float r9 = r9 - r0
            float r9 = r9 / r1
            r12[r5] = r9
            float r10 = r10 - r7
            float r10 = r10 / r8
            r12[r2] = r10
            goto L40
        L32:
            r11[r2] = r4
            float r9 = r9 - r0
            float r9 = r9 / r1
            r12[r2] = r9
            java.lang.String r9 = "percentY"
            r11[r5] = r9
            float r10 = r10 - r7
            float r10 = r10 / r8
            r12[r5] = r10
        L40:
            return
    }

    void positionPathAttributes(androidx.constraintlayout.core.motion.utils.FloatRect r8, androidx.constraintlayout.core.motion.utils.FloatRect r9, float r10, float r11, java.lang.String[] r12, float[] r13) {
            r7 = this;
            float r0 = r8.centerX()
            float r8 = r8.centerY()
            float r1 = r9.centerX()
            float r9 = r9.centerY()
            float r1 = r1 - r0
            float r9 = r9 - r8
            double r2 = (double) r1
            double r4 = (double) r9
            double r2 = java.lang.Math.hypot(r2, r4)
            float r2 = (float) r2
            double r3 = (double) r2
            r5 = 4547007122018943789(0x3f1a36e2eb1c432d, double:1.0E-4)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r4 = 1
            r5 = 0
            if (r3 >= 0) goto L32
            java.io.PrintStream r8 = java.lang.System.out
            java.lang.String r9 = "distance ~ 0"
            r8.println(r9)
            r8 = 0
            r13[r5] = r8
            r13[r4] = r8
            return
        L32:
            float r1 = r1 / r2
            float r9 = r9 / r2
            float r11 = r11 - r8
            float r8 = r1 * r11
            float r10 = r10 - r0
            float r0 = r10 * r9
            float r8 = r8 - r0
            float r8 = r8 / r2
            float r1 = r1 * r10
            float r9 = r9 * r11
            float r1 = r1 + r9
            float r1 = r1 / r2
            r9 = r12[r5]
            java.lang.String r10 = "percentX"
            if (r9 == 0) goto L51
            boolean r9 = r10.equals(r9)
            if (r9 == 0) goto L5b
            r13[r5] = r1
            r13[r4] = r8
            goto L5b
        L51:
            r12[r5] = r10
            java.lang.String r9 = "percentY"
            r12[r4] = r9
            r13[r5] = r1
            r13[r4] = r8
        L5b:
            return
    }

    void positionScreenAttributes(androidx.constraintlayout.core.motion.MotionWidget r4, androidx.constraintlayout.core.motion.utils.FloatRect r5, androidx.constraintlayout.core.motion.utils.FloatRect r6, float r7, float r8, java.lang.String[] r9, float[] r10) {
            r3 = this;
            r5.centerX()
            r5.centerY()
            r6.centerX()
            r6.centerY()
            androidx.constraintlayout.core.motion.MotionWidget r4 = r4.getParent()
            int r5 = r4.getWidth()
            int r4 = r4.getHeight()
            r6 = 0
            r0 = r9[r6]
            java.lang.String r1 = "percentX"
            r2 = 1
            if (r0 == 0) goto L38
            boolean r9 = r1.equals(r0)
            if (r9 == 0) goto L2f
            float r5 = (float) r5
            float r7 = r7 / r5
            r10[r6] = r7
            float r4 = (float) r4
            float r8 = r8 / r4
            r10[r2] = r8
            goto L46
        L2f:
            float r5 = (float) r5
            float r7 = r7 / r5
            r10[r2] = r7
            float r4 = (float) r4
            float r8 = r8 / r4
            r10[r6] = r8
            goto L46
        L38:
            r9[r6] = r1
            float r5 = (float) r5
            float r7 = r7 / r5
            r10[r6] = r7
            java.lang.String r5 = "percentY"
            r9[r2] = r5
            float r4 = (float) r4
            float r8 = r8 / r4
            r10[r2] = r8
        L46:
            return
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int r1, float r2) {
            r0 = this;
            switch(r1) {
                case 503: goto L16;
                case 504: goto L13;
                case 505: goto Le;
                case 506: goto Lb;
                case 507: goto L8;
                default: goto L3;
            }
        L3:
            boolean r1 = super.setValue(r1, r2)
            return r1
        L8:
            r0.mPercentY = r2
            goto L18
        Lb:
            r0.mPercentX = r2
            goto L18
        Le:
            r0.mPercentWidth = r2
            r0.mPercentHeight = r2
            goto L18
        L13:
            r0.mPercentHeight = r2
            goto L18
        L16:
            r0.mPercentWidth = r2
        L18:
            r1 = 1
            return r1
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int r2, int r3) {
            r1 = this;
            r0 = 100
            if (r2 == r0) goto L17
            r0 = 508(0x1fc, float:7.12E-43)
            if (r2 == r0) goto L14
            r0 = 510(0x1fe, float:7.15E-43)
            if (r2 == r0) goto L11
            boolean r2 = super.setValue(r2, r3)
            return r2
        L11:
            r1.mPositionType = r3
            goto L19
        L14:
            r1.mCurveFit = r3
            goto L19
        L17:
            r1.mFramePosition = r3
        L19:
            r2 = 1
            return r2
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int r2, java.lang.String r3) {
            r1 = this;
            r0 = 501(0x1f5, float:7.02E-43)
            if (r2 == r0) goto L9
            boolean r2 = super.setValue(r2, r3)
            return r2
        L9:
            java.lang.String r2 = r3.toString()
            r1.mTransitionEasing = r2
            r2 = 1
            return r2
    }
}
