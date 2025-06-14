package androidx.constraintlayout.motion.widget;

/* loaded from: classes.dex */
public class KeyPosition extends androidx.constraintlayout.motion.widget.KeyPositionBase {
    public static final java.lang.String DRAWPATH = "drawPath";
    static final int KEY_TYPE = 2;
    static final java.lang.String NAME = "KeyPosition";
    public static final java.lang.String PERCENT_HEIGHT = "percentHeight";
    public static final java.lang.String PERCENT_WIDTH = "percentWidth";
    public static final java.lang.String PERCENT_X = "percentX";
    public static final java.lang.String PERCENT_Y = "percentY";
    public static final java.lang.String SIZE_PERCENT = "sizePercent";
    private static final java.lang.String TAG = "KeyPosition";
    public static final java.lang.String TRANSITION_EASING = "transitionEasing";
    public static final int TYPE_CARTESIAN = 0;
    public static final int TYPE_PATH = 1;
    public static final int TYPE_SCREEN = 2;
    float mAltPercentX;
    float mAltPercentY;
    private float mCalculatedPositionX;
    private float mCalculatedPositionY;
    int mDrawPath;
    int mPathMotionArc;
    float mPercentHeight;
    float mPercentWidth;
    float mPercentX;
    float mPercentY;
    int mPositionType;
    java.lang.String mTransitionEasing;

    private static class Loader {
        private static final int CURVE_FIT = 4;
        private static final int DRAW_PATH = 5;
        private static final int FRAME_POSITION = 2;
        private static final int PATH_MOTION_ARC = 10;
        private static final int PERCENT_HEIGHT = 12;
        private static final int PERCENT_WIDTH = 11;
        private static final int PERCENT_X = 6;
        private static final int PERCENT_Y = 7;
        private static final int SIZE_PERCENT = 8;
        private static final int TARGET_ID = 1;
        private static final int TRANSITION_EASING = 3;
        private static final int TYPE = 9;
        private static android.util.SparseIntArray mAttrMap;

        static {
                android.util.SparseIntArray r0 = new android.util.SparseIntArray
                r0.<init>()
                androidx.constraintlayout.motion.widget.KeyPosition.Loader.mAttrMap = r0
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyPosition_motionTarget
                r2 = 1
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyPosition.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyPosition_framePosition
                r2 = 2
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyPosition.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyPosition_transitionEasing
                r2 = 3
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyPosition.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyPosition_curveFit
                r2 = 4
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyPosition.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyPosition_drawPath
                r2 = 5
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyPosition.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyPosition_percentX
                r2 = 6
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyPosition.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyPosition_percentY
                r2 = 7
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyPosition.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyPosition_keyPositionType
                r2 = 9
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyPosition.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyPosition_sizePercent
                r2 = 8
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyPosition.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyPosition_percentWidth
                r2 = 11
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyPosition.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyPosition_percentHeight
                r2 = 12
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.motion.widget.KeyPosition.Loader.mAttrMap
                int r1 = androidx.constraintlayout.widget.C0156R.styleable.KeyPosition_pathMotionArc
                r2 = 10
                r0.append(r1, r2)
                return
        }

        private Loader() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ void access$000(androidx.constraintlayout.motion.widget.KeyPosition r0, android.content.res.TypedArray r1) {
                read(r0, r1)
                return
        }

        private static void read(androidx.constraintlayout.motion.widget.KeyPosition r8, android.content.res.TypedArray r9) {
                int r0 = r9.getIndexCount()
                r1 = 0
                r2 = r1
            L6:
                java.lang.String r3 = "KeyPosition"
                r4 = -1
                if (r2 >= r0) goto Lef
                int r5 = r9.getIndex(r2)
                android.util.SparseIntArray r6 = androidx.constraintlayout.motion.widget.KeyPosition.Loader.mAttrMap
                int r6 = r6.get(r5)
                r7 = 3
                switch(r6) {
                    case 1: goto Lbd;
                    case 2: goto Lb4;
                    case 3: goto L9a;
                    case 4: goto L91;
                    case 5: goto L88;
                    case 6: goto L7f;
                    case 7: goto L75;
                    case 8: goto L69;
                    case 9: goto L5f;
                    case 10: goto L55;
                    case 11: goto L4b;
                    case 12: goto L41;
                    default: goto L19;
                }
            L19:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r6 = "unused attribute 0x"
                r4.<init>(r6)
                java.lang.String r6 = java.lang.Integer.toHexString(r5)
                java.lang.StringBuilder r4 = r4.append(r6)
                java.lang.String r6 = "   "
                java.lang.StringBuilder r4 = r4.append(r6)
                android.util.SparseIntArray r6 = androidx.constraintlayout.motion.widget.KeyPosition.Loader.mAttrMap
                int r5 = r6.get(r5)
                java.lang.StringBuilder r4 = r4.append(r5)
                java.lang.String r4 = r4.toString()
                android.util.Log.e(r3, r4)
                goto Leb
            L41:
                float r3 = r8.mPercentHeight
                float r3 = r9.getFloat(r5, r3)
                r8.mPercentHeight = r3
                goto Leb
            L4b:
                float r3 = r8.mPercentWidth
                float r3 = r9.getFloat(r5, r3)
                r8.mPercentWidth = r3
                goto Leb
            L55:
                int r3 = r8.mPathMotionArc
                int r3 = r9.getInt(r5, r3)
                r8.mPathMotionArc = r3
                goto Leb
            L5f:
                int r3 = r8.mPositionType
                int r3 = r9.getInt(r5, r3)
                r8.mPositionType = r3
                goto Leb
            L69:
                float r3 = r8.mPercentHeight
                float r3 = r9.getFloat(r5, r3)
                r8.mPercentWidth = r3
                r8.mPercentHeight = r3
                goto Leb
            L75:
                float r3 = r8.mPercentY
                float r3 = r9.getFloat(r5, r3)
                r8.mPercentY = r3
                goto Leb
            L7f:
                float r3 = r8.mPercentX
                float r3 = r9.getFloat(r5, r3)
                r8.mPercentX = r3
                goto Leb
            L88:
                int r3 = r8.mDrawPath
                int r3 = r9.getInt(r5, r3)
                r8.mDrawPath = r3
                goto Leb
            L91:
                int r3 = r8.mCurveFit
                int r3 = r9.getInteger(r5, r3)
                r8.mCurveFit = r3
                goto Leb
            L9a:
                android.util.TypedValue r3 = r9.peekValue(r5)
                int r3 = r3.type
                if (r3 != r7) goto La9
                java.lang.String r3 = r9.getString(r5)
                r8.mTransitionEasing = r3
                goto Leb
            La9:
                java.lang.String[] r3 = androidx.constraintlayout.core.motion.utils.Easing.NAMED_EASING
                int r4 = r9.getInteger(r5, r1)
                r3 = r3[r4]
                r8.mTransitionEasing = r3
                goto Leb
            Lb4:
                int r3 = r8.mFramePosition
                int r3 = r9.getInt(r5, r3)
                r8.mFramePosition = r3
                goto Leb
            Lbd:
                boolean r3 = androidx.constraintlayout.motion.widget.MotionLayout.IS_IN_EDIT_MODE
                if (r3 == 0) goto Ld4
                int r3 = r8.mTargetId
                int r3 = r9.getResourceId(r5, r3)
                r8.mTargetId = r3
                int r3 = r8.mTargetId
                if (r3 != r4) goto Leb
                java.lang.String r3 = r9.getString(r5)
                r8.mTargetString = r3
                goto Leb
            Ld4:
                android.util.TypedValue r3 = r9.peekValue(r5)
                int r3 = r3.type
                if (r3 != r7) goto Le3
                java.lang.String r3 = r9.getString(r5)
                r8.mTargetString = r3
                goto Leb
            Le3:
                int r3 = r8.mTargetId
                int r3 = r9.getResourceId(r5, r3)
                r8.mTargetId = r3
            Leb:
                int r2 = r2 + 1
                goto L6
            Lef:
                int r8 = r8.mFramePosition
                if (r8 != r4) goto Lf8
                java.lang.String r8 = "no frame position"
                android.util.Log.e(r3, r8)
            Lf8:
                return
        }
    }

    public KeyPosition() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mTransitionEasing = r0
            int r0 = androidx.constraintlayout.motion.widget.KeyPosition.UNSET
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

    @Override // androidx.constraintlayout.motion.widget.Key
    public void addValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> r1) {
            r0 = this;
            return
    }

    @Override // androidx.constraintlayout.motion.widget.KeyPositionBase
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

    @Override // androidx.constraintlayout.motion.widget.Key
    public androidx.constraintlayout.motion.widget.Key clone() {
            r1 = this;
            androidx.constraintlayout.motion.widget.KeyPosition r0 = new androidx.constraintlayout.motion.widget.KeyPosition
            r0.<init>()
            androidx.constraintlayout.motion.widget.Key r0 = r0.copy(r1)
            return r0
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    /* renamed from: clone */
    public /* bridge */ /* synthetic */ java.lang.Object mo129clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            androidx.constraintlayout.motion.widget.Key r0 = r1.clone()
            return r0
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public androidx.constraintlayout.motion.widget.Key copy(androidx.constraintlayout.motion.widget.Key r2) {
            r1 = this;
            super.copy(r2)
            androidx.constraintlayout.motion.widget.KeyPosition r2 = (androidx.constraintlayout.motion.widget.KeyPosition) r2
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

    @Override // androidx.constraintlayout.motion.widget.KeyPositionBase
    float getPositionX() {
            r1 = this;
            float r0 = r1.mCalculatedPositionX
            return r0
    }

    @Override // androidx.constraintlayout.motion.widget.KeyPositionBase
    float getPositionY() {
            r1 = this;
            float r0 = r1.mCalculatedPositionY
            return r0
    }

    @Override // androidx.constraintlayout.motion.widget.KeyPositionBase
    public boolean intersects(int r8, int r9, android.graphics.RectF r10, android.graphics.RectF r11, float r12, float r13) {
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

    @Override // androidx.constraintlayout.motion.widget.Key
    public void load(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int[] r0 = androidx.constraintlayout.widget.C0156R.styleable.KeyPosition
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
            androidx.constraintlayout.motion.widget.KeyPosition.Loader.access$000(r1, r2)
            return
    }

    @Override // androidx.constraintlayout.motion.widget.KeyPositionBase
    public void positionAttributes(android.view.View r8, android.graphics.RectF r9, android.graphics.RectF r10, float r11, float r12, java.lang.String[] r13, float[] r14) {
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

    void positionCartAttributes(android.graphics.RectF r7, android.graphics.RectF r8, float r9, float r10, java.lang.String[] r11, float[] r12) {
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

    void positionPathAttributes(android.graphics.RectF r8, android.graphics.RectF r9, float r10, float r11, java.lang.String[] r12, float[] r13) {
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

    void positionScreenAttributes(android.view.View r4, android.graphics.RectF r5, android.graphics.RectF r6, float r7, float r8, java.lang.String[] r9, float[] r10) {
            r3 = this;
            r5.centerX()
            r5.centerY()
            r6.centerX()
            r6.centerY()
            android.view.ViewParent r4 = r4.getParent()
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r5 = r4.getWidth()
            int r4 = r4.getHeight()
            r6 = 0
            r0 = r9[r6]
            java.lang.String r1 = "percentX"
            r2 = 1
            if (r0 == 0) goto L3a
            boolean r9 = r1.equals(r0)
            if (r9 == 0) goto L31
            float r5 = (float) r5
            float r7 = r7 / r5
            r10[r6] = r7
            float r4 = (float) r4
            float r8 = r8 / r4
            r10[r2] = r8
            goto L48
        L31:
            float r5 = (float) r5
            float r7 = r7 / r5
            r10[r2] = r7
            float r4 = (float) r4
            float r8 = r8 / r4
            r10[r6] = r8
            goto L48
        L3a:
            r9[r6] = r1
            float r5 = (float) r5
            float r7 = r7 / r5
            r10[r6] = r7
            java.lang.String r5 = "percentY"
            r9[r2] = r5
            float r4 = (float) r4
            float r8 = r8 / r4
            r10[r2] = r8
        L48:
            return
    }

    public void setType(int r1) {
            r0 = this;
            r0.mPositionType = r1
            return
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void setValue(java.lang.String r3, java.lang.Object r4) {
            r2 = this;
            r3.hashCode()
            int r0 = r3.hashCode()
            r1 = -1
            switch(r0) {
                case -1812823328: goto L4e;
                case -1127236479: goto L43;
                case -1017587252: goto L38;
                case -827014263: goto L2d;
                case -200259324: goto L22;
                case 428090547: goto L17;
                case 428090548: goto Lc;
                default: goto Lb;
            }
        Lb:
            goto L58
        Lc:
            java.lang.String r0 = "percentY"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L15
            goto L58
        L15:
            r1 = 6
            goto L58
        L17:
            java.lang.String r0 = "percentX"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L20
            goto L58
        L20:
            r1 = 5
            goto L58
        L22:
            java.lang.String r0 = "sizePercent"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L2b
            goto L58
        L2b:
            r1 = 4
            goto L58
        L2d:
            java.lang.String r0 = "drawPath"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L36
            goto L58
        L36:
            r1 = 3
            goto L58
        L38:
            java.lang.String r0 = "percentHeight"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L41
            goto L58
        L41:
            r1 = 2
            goto L58
        L43:
            java.lang.String r0 = "percentWidth"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L4c
            goto L58
        L4c:
            r1 = 1
            goto L58
        L4e:
            java.lang.String r0 = "transitionEasing"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L57
            goto L58
        L57:
            r1 = 0
        L58:
            switch(r1) {
                case 0: goto L88;
                case 1: goto L81;
                case 2: goto L7a;
                case 3: goto L73;
                case 4: goto L6a;
                case 5: goto L63;
                case 6: goto L5c;
                default: goto L5b;
            }
        L5b:
            goto L8e
        L5c:
            float r3 = r2.toFloat(r4)
            r2.mPercentY = r3
            goto L8e
        L63:
            float r3 = r2.toFloat(r4)
            r2.mPercentX = r3
            goto L8e
        L6a:
            float r3 = r2.toFloat(r4)
            r2.mPercentWidth = r3
            r2.mPercentHeight = r3
            goto L8e
        L73:
            int r3 = r2.toInt(r4)
            r2.mDrawPath = r3
            goto L8e
        L7a:
            float r3 = r2.toFloat(r4)
            r2.mPercentHeight = r3
            goto L8e
        L81:
            float r3 = r2.toFloat(r4)
            r2.mPercentWidth = r3
            goto L8e
        L88:
            java.lang.String r3 = r4.toString()
            r2.mTransitionEasing = r3
        L8e:
            return
    }
}
