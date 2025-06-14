package androidx.constraintlayout.core.motion;

/* loaded from: classes.dex */
public class Motion implements androidx.constraintlayout.core.motion.utils.TypedValues {
    static final int BOUNCE = 4;
    private static final boolean DEBUG = false;
    public static final int DRAW_PATH_AS_CONFIGURED = 4;
    public static final int DRAW_PATH_BASIC = 1;
    public static final int DRAW_PATH_CARTESIAN = 3;
    public static final int DRAW_PATH_NONE = 0;
    public static final int DRAW_PATH_RECTANGLE = 5;
    public static final int DRAW_PATH_RELATIVE = 2;
    public static final int DRAW_PATH_SCREEN = 6;
    static final int EASE_IN = 1;
    static final int EASE_IN_OUT = 0;
    static final int EASE_OUT = 2;
    private static final boolean FAVOR_FIXED_SIZE_VIEWS = false;
    public static final int HORIZONTAL_PATH_X = 2;
    public static final int HORIZONTAL_PATH_Y = 3;
    private static final int INTERPOLATOR_REFERENCE_ID = -2;
    private static final int INTERPOLATOR_UNDEFINED = -3;
    static final int LINEAR = 3;
    static final int OVERSHOOT = 5;
    public static final int PATH_PERCENT = 0;
    public static final int PATH_PERPENDICULAR = 1;
    public static final int ROTATION_LEFT = 2;
    public static final int ROTATION_RIGHT = 1;
    private static final int SPLINE_STRING = -1;
    private static final java.lang.String TAG = "MotionController";
    public static final int VERTICAL_PATH_X = 4;
    public static final int VERTICAL_PATH_Y = 5;
    private int MAX_DIMENSION;
    java.lang.String[] attributeTable;
    private androidx.constraintlayout.core.motion.utils.CurveFit mArcSpline;
    private int[] mAttributeInterpolatorCount;
    private java.lang.String[] mAttributeNames;
    private java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> mAttributesMap;
    java.lang.String mConstraintTag;
    float mCurrentCenterX;
    float mCurrentCenterY;
    private int mCurveFitType;
    private java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.KeyCycleOscillator> mCycleMap;
    private androidx.constraintlayout.core.motion.MotionPaths mEndMotionPath;
    private androidx.constraintlayout.core.motion.MotionConstrainedPoint mEndPoint;
    int mId;
    private double[] mInterpolateData;
    private int[] mInterpolateVariables;
    private double[] mInterpolateVelocity;
    private java.util.ArrayList<androidx.constraintlayout.core.motion.key.MotionKey> mKeyList;
    private androidx.constraintlayout.core.motion.key.MotionKeyTrigger[] mKeyTriggers;
    private java.util.ArrayList<androidx.constraintlayout.core.motion.MotionPaths> mMotionPaths;
    float mMotionStagger;
    private boolean mNoMovement;
    private int mPathMotionArc;
    private androidx.constraintlayout.core.motion.utils.DifferentialInterpolator mQuantizeMotionInterpolator;
    private float mQuantizeMotionPhase;
    private int mQuantizeMotionSteps;
    private androidx.constraintlayout.core.motion.utils.CurveFit[] mSpline;
    float mStaggerOffset;
    float mStaggerScale;
    private androidx.constraintlayout.core.motion.MotionPaths mStartMotionPath;
    private androidx.constraintlayout.core.motion.MotionConstrainedPoint mStartPoint;
    androidx.constraintlayout.core.motion.utils.Rect mTempRect;
    private java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet> mTimeCycleAttributesMap;
    private int mTransformPivotTarget;
    private androidx.constraintlayout.core.motion.MotionWidget mTransformPivotView;
    private float[] mValuesBuff;
    private float[] mVelocity;
    androidx.constraintlayout.core.motion.MotionWidget mView;


    public Motion(androidx.constraintlayout.core.motion.MotionWidget r4) {
            r3 = this;
            r3.<init>()
            androidx.constraintlayout.core.motion.utils.Rect r0 = new androidx.constraintlayout.core.motion.utils.Rect
            r0.<init>()
            r3.mTempRect = r0
            r0 = -1
            r3.mCurveFitType = r0
            androidx.constraintlayout.core.motion.MotionPaths r1 = new androidx.constraintlayout.core.motion.MotionPaths
            r1.<init>()
            r3.mStartMotionPath = r1
            androidx.constraintlayout.core.motion.MotionPaths r1 = new androidx.constraintlayout.core.motion.MotionPaths
            r1.<init>()
            r3.mEndMotionPath = r1
            androidx.constraintlayout.core.motion.MotionConstrainedPoint r1 = new androidx.constraintlayout.core.motion.MotionConstrainedPoint
            r1.<init>()
            r3.mStartPoint = r1
            androidx.constraintlayout.core.motion.MotionConstrainedPoint r1 = new androidx.constraintlayout.core.motion.MotionConstrainedPoint
            r1.<init>()
            r3.mEndPoint = r1
            r1 = 2143289344(0x7fc00000, float:NaN)
            r3.mMotionStagger = r1
            r2 = 0
            r3.mStaggerOffset = r2
            r2 = 1065353216(0x3f800000, float:1.0)
            r3.mStaggerScale = r2
            r2 = 4
            r3.MAX_DIMENSION = r2
            float[] r2 = new float[r2]
            r3.mValuesBuff = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3.mMotionPaths = r2
            r2 = 1
            float[] r2 = new float[r2]
            r3.mVelocity = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3.mKeyList = r2
            r3.mPathMotionArc = r0
            r3.mTransformPivotTarget = r0
            r2 = 0
            r3.mTransformPivotView = r2
            r3.mQuantizeMotionSteps = r0
            r3.mQuantizeMotionPhase = r1
            r3.mQuantizeMotionInterpolator = r2
            r0 = 0
            r3.mNoMovement = r0
            r3.setView(r4)
            return
    }

    private float getAdjustedPosition(float r12, float[] r13) {
            r11 = this;
            r0 = 0
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r13 == 0) goto L9
            r13[r1] = r2
            goto L28
        L9:
            float r3 = r11.mStaggerScale
            double r4 = (double) r3
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L28
            float r4 = r11.mStaggerOffset
            int r5 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r5 >= 0) goto L19
            r12 = r0
        L19:
            int r5 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r5 <= 0) goto L28
            double r8 = (double) r12
            int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r5 >= 0) goto L28
            float r12 = r12 - r4
            float r12 = r12 * r3
            float r12 = java.lang.Math.min(r12, r2)
        L28:
            androidx.constraintlayout.core.motion.MotionPaths r3 = r11.mStartMotionPath
            androidx.constraintlayout.core.motion.utils.Easing r3 = r3.mKeyFrameEasing
            java.util.ArrayList<androidx.constraintlayout.core.motion.MotionPaths> r4 = r11.mMotionPaths
            java.util.Iterator r4 = r4.iterator()
            r5 = 2143289344(0x7fc00000, float:NaN)
        L34:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L5b
            java.lang.Object r6 = r4.next()
            androidx.constraintlayout.core.motion.MotionPaths r6 = (androidx.constraintlayout.core.motion.MotionPaths) r6
            androidx.constraintlayout.core.motion.utils.Easing r7 = r6.mKeyFrameEasing
            if (r7 == 0) goto L34
            float r7 = r6.time
            int r7 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r7 >= 0) goto L52
            androidx.constraintlayout.core.motion.utils.Easing r0 = r6.mKeyFrameEasing
            float r3 = r6.time
            r10 = r3
            r3 = r0
            r0 = r10
            goto L34
        L52:
            boolean r7 = java.lang.Float.isNaN(r5)
            if (r7 == 0) goto L34
            float r5 = r6.time
            goto L34
        L5b:
            if (r3 == 0) goto L79
            boolean r4 = java.lang.Float.isNaN(r5)
            if (r4 == 0) goto L64
            goto L65
        L64:
            r2 = r5
        L65:
            float r12 = r12 - r0
            float r2 = r2 - r0
            float r12 = r12 / r2
            double r4 = (double) r12
            double r6 = r3.get(r4)
            float r12 = (float) r6
            float r12 = r12 * r2
            float r12 = r12 + r0
            if (r13 == 0) goto L79
            double r2 = r3.getDiff(r4)
            float r0 = (float) r2
            r13[r1] = r0
        L79:
            return r12
    }

    private static androidx.constraintlayout.core.motion.utils.DifferentialInterpolator getInterpolator(int r0, java.lang.String r1, int r2) {
            r2 = -1
            if (r0 == r2) goto L5
            r0 = 0
            return r0
        L5:
            androidx.constraintlayout.core.motion.utils.Easing r0 = androidx.constraintlayout.core.motion.utils.Easing.getInterpolator(r1)
            androidx.constraintlayout.core.motion.Motion$1 r1 = new androidx.constraintlayout.core.motion.Motion$1
            r1.<init>(r0)
            return r1
    }

    private float getPreCycleDistance() {
            r20 = this;
            r0 = r20
            r1 = 2
            float[] r1 = new float[r1]
            r2 = 99
            float r2 = (float) r2
            r9 = 1065353216(0x3f800000, float:1.0)
            float r10 = r9 / r2
            r2 = 0
            r12 = 0
            r13 = r2
            r15 = r13
            r8 = r12
            r7 = 0
        L13:
            r2 = 100
            if (r8 >= r2) goto Laa
            float r2 = (float) r8
            float r2 = r2 * r10
            double r3 = (double) r2
            androidx.constraintlayout.core.motion.MotionPaths r5 = r0.mStartMotionPath
            androidx.constraintlayout.core.motion.utils.Easing r5 = r5.mKeyFrameEasing
            java.util.ArrayList<androidx.constraintlayout.core.motion.MotionPaths> r6 = r0.mMotionPaths
            java.util.Iterator r6 = r6.iterator()
            r17 = 2143289344(0x7fc00000, float:NaN)
            r18 = 0
        L28:
            boolean r19 = r6.hasNext()
            if (r19 == 0) goto L54
            java.lang.Object r19 = r6.next()
            r9 = r19
            androidx.constraintlayout.core.motion.MotionPaths r9 = (androidx.constraintlayout.core.motion.MotionPaths) r9
            androidx.constraintlayout.core.motion.utils.Easing r11 = r9.mKeyFrameEasing
            if (r11 == 0) goto L51
            float r11 = r9.time
            int r11 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r11 >= 0) goto L47
            androidx.constraintlayout.core.motion.utils.Easing r5 = r9.mKeyFrameEasing
            float r9 = r9.time
            r18 = r9
            goto L51
        L47:
            boolean r11 = java.lang.Float.isNaN(r17)
            if (r11 == 0) goto L51
            float r9 = r9.time
            r17 = r9
        L51:
            r9 = 1065353216(0x3f800000, float:1.0)
            goto L28
        L54:
            if (r5 == 0) goto L70
            boolean r3 = java.lang.Float.isNaN(r17)
            if (r3 == 0) goto L5e
            r17 = 1065353216(0x3f800000, float:1.0)
        L5e:
            float r2 = r2 - r18
            float r17 = r17 - r18
            float r2 = r2 / r17
            double r2 = (double) r2
            double r2 = r5.get(r2)
            float r2 = (float) r2
            float r2 = r2 * r17
            float r2 = r2 + r18
            double r2 = (double) r2
            r3 = r2
        L70:
            androidx.constraintlayout.core.motion.utils.CurveFit[] r2 = r0.mSpline
            r2 = r2[r12]
            double[] r5 = r0.mInterpolateData
            r2.getPos(r3, r5)
            androidx.constraintlayout.core.motion.MotionPaths r2 = r0.mStartMotionPath
            int[] r5 = r0.mInterpolateVariables
            double[] r6 = r0.mInterpolateData
            r9 = 0
            r11 = r7
            r7 = r1
            r17 = r8
            r8 = r9
            r2.getCenter(r3, r5, r6, r7, r8)
            r2 = 1
            if (r17 <= 0) goto L9c
            double r3 = (double) r11
            r5 = r1[r2]
            double r5 = (double) r5
            double r5 = r15 - r5
            r7 = r1[r12]
            double r7 = (double) r7
            double r13 = r13 - r7
            double r5 = java.lang.Math.hypot(r5, r13)
            double r3 = r3 + r5
            float r7 = (float) r3
            goto L9d
        L9c:
            r7 = r11
        L9d:
            r3 = r1[r12]
            double r13 = (double) r3
            r2 = r1[r2]
            double r2 = (double) r2
            int r8 = r17 + 1
            r15 = r2
            r9 = 1065353216(0x3f800000, float:1.0)
            goto L13
        Laa:
            r11 = r7
            return r11
    }

    private void insertKey(androidx.constraintlayout.core.motion.MotionPaths r6) {
            r5 = this;
            java.util.ArrayList<androidx.constraintlayout.core.motion.MotionPaths> r0 = r5.mMotionPaths
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L7:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1d
            java.lang.Object r2 = r0.next()
            androidx.constraintlayout.core.motion.MotionPaths r2 = (androidx.constraintlayout.core.motion.MotionPaths) r2
            float r3 = r6.position
            float r4 = r2.position
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L7
            r1 = r2
            goto L7
        L1d:
            if (r1 == 0) goto L24
            java.util.ArrayList<androidx.constraintlayout.core.motion.MotionPaths> r0 = r5.mMotionPaths
            r0.remove(r1)
        L24:
            java.util.ArrayList<androidx.constraintlayout.core.motion.MotionPaths> r0 = r5.mMotionPaths
            int r0 = java.util.Collections.binarySearch(r0, r6)
            if (r0 != 0) goto L48
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = " KeyPath position \""
            r1.<init>(r2)
            float r2 = r6.position
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "\" outside of range"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MotionController"
            androidx.constraintlayout.core.motion.utils.Utils.loge(r2, r1)
        L48:
            java.util.ArrayList<androidx.constraintlayout.core.motion.MotionPaths> r1 = r5.mMotionPaths
            int r0 = -r0
            int r0 = r0 + (-1)
            r1.add(r0, r6)
            return
    }

    private void readView(androidx.constraintlayout.core.motion.MotionPaths r5) {
            r4 = this;
            androidx.constraintlayout.core.motion.MotionWidget r0 = r4.mView
            int r0 = r0.getX()
            float r0 = (float) r0
            androidx.constraintlayout.core.motion.MotionWidget r1 = r4.mView
            int r1 = r1.getY()
            float r1 = (float) r1
            androidx.constraintlayout.core.motion.MotionWidget r2 = r4.mView
            int r2 = r2.getWidth()
            float r2 = (float) r2
            androidx.constraintlayout.core.motion.MotionWidget r3 = r4.mView
            int r3 = r3.getHeight()
            float r3 = (float) r3
            r5.setBounds(r0, r1, r2, r3)
            return
    }

    public void addKey(androidx.constraintlayout.core.motion.key.MotionKey r2) {
            r1 = this;
            java.util.ArrayList<androidx.constraintlayout.core.motion.key.MotionKey> r0 = r1.mKeyList
            r0.add(r2)
            return
    }

    void addKeys(java.util.ArrayList<androidx.constraintlayout.core.motion.key.MotionKey> r2) {
            r1 = this;
            java.util.ArrayList<androidx.constraintlayout.core.motion.key.MotionKey> r0 = r1.mKeyList
            r0.addAll(r2)
            return
    }

    void buildBounds(float[] r17, int r18) {
            r16 = this;
            r0 = r16
            r1 = r18
            int r2 = r1 + (-1)
            float r2 = (float) r2
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = r3 / r2
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> r4 = r0.mAttributesMap
            java.lang.String r5 = "translationX"
            if (r4 != 0) goto L12
            goto L18
        L12:
            java.lang.Object r4 = r4.get(r5)
            androidx.constraintlayout.core.motion.utils.SplineSet r4 = (androidx.constraintlayout.core.motion.utils.SplineSet) r4
        L18:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> r4 = r0.mAttributesMap
            java.lang.String r6 = "translationY"
            if (r4 != 0) goto L1f
            goto L25
        L1f:
            java.lang.Object r4 = r4.get(r6)
            androidx.constraintlayout.core.motion.utils.SplineSet r4 = (androidx.constraintlayout.core.motion.utils.SplineSet) r4
        L25:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.KeyCycleOscillator> r4 = r0.mCycleMap
            if (r4 != 0) goto L2a
            goto L30
        L2a:
            java.lang.Object r4 = r4.get(r5)
            androidx.constraintlayout.core.motion.utils.KeyCycleOscillator r4 = (androidx.constraintlayout.core.motion.utils.KeyCycleOscillator) r4
        L30:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.KeyCycleOscillator> r4 = r0.mCycleMap
            if (r4 != 0) goto L35
            goto L3b
        L35:
            java.lang.Object r4 = r4.get(r6)
            androidx.constraintlayout.core.motion.utils.KeyCycleOscillator r4 = (androidx.constraintlayout.core.motion.utils.KeyCycleOscillator) r4
        L3b:
            r4 = 0
            r5 = r4
        L3d:
            if (r5 >= r1) goto Lcf
            float r6 = (float) r5
            float r6 = r6 * r2
            float r7 = r0.mStaggerScale
            int r8 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            r9 = 0
            if (r8 == 0) goto L60
            float r8 = r0.mStaggerOffset
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 >= 0) goto L4f
            r6 = r9
        L4f:
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 <= 0) goto L60
            double r10 = (double) r6
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L60
            float r6 = r6 - r8
            float r6 = r6 * r7
            float r6 = java.lang.Math.min(r6, r3)
        L60:
            double r7 = (double) r6
            androidx.constraintlayout.core.motion.MotionPaths r10 = r0.mStartMotionPath
            androidx.constraintlayout.core.motion.utils.Easing r10 = r10.mKeyFrameEasing
            java.util.ArrayList<androidx.constraintlayout.core.motion.MotionPaths> r11 = r0.mMotionPaths
            java.util.Iterator r11 = r11.iterator()
            r12 = 2143289344(0x7fc00000, float:NaN)
        L6d:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L94
            java.lang.Object r13 = r11.next()
            androidx.constraintlayout.core.motion.MotionPaths r13 = (androidx.constraintlayout.core.motion.MotionPaths) r13
            androidx.constraintlayout.core.motion.utils.Easing r14 = r13.mKeyFrameEasing
            if (r14 == 0) goto L6d
            float r14 = r13.time
            int r14 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r14 >= 0) goto L8b
            androidx.constraintlayout.core.motion.utils.Easing r9 = r13.mKeyFrameEasing
            float r10 = r13.time
            r15 = r10
            r10 = r9
            r9 = r15
            goto L6d
        L8b:
            boolean r14 = java.lang.Float.isNaN(r12)
            if (r14 == 0) goto L6d
            float r12 = r13.time
            goto L6d
        L94:
            if (r10 == 0) goto La9
            boolean r7 = java.lang.Float.isNaN(r12)
            if (r7 == 0) goto L9d
            r12 = r3
        L9d:
            float r6 = r6 - r9
            float r12 = r12 - r9
            float r6 = r6 / r12
            double r6 = (double) r6
            double r6 = r10.get(r6)
            float r6 = (float) r6
            float r6 = r6 * r12
            float r6 = r6 + r9
            double r7 = (double) r6
        La9:
            androidx.constraintlayout.core.motion.utils.CurveFit[] r6 = r0.mSpline
            r6 = r6[r4]
            double[] r9 = r0.mInterpolateData
            r6.getPos(r7, r9)
            androidx.constraintlayout.core.motion.utils.CurveFit r6 = r0.mArcSpline
            if (r6 == 0) goto Lbe
            double[] r9 = r0.mInterpolateData
            int r10 = r9.length
            if (r10 <= 0) goto Lbe
            r6.getPos(r7, r9)
        Lbe:
            androidx.constraintlayout.core.motion.MotionPaths r6 = r0.mStartMotionPath
            int[] r7 = r0.mInterpolateVariables
            double[] r8 = r0.mInterpolateData
            int r9 = r5 * 2
            r10 = r17
            r6.getBounds(r7, r8, r10, r9)
            int r5 = r5 + 1
            goto L3d
        Lcf:
            return
    }

    int buildKeyBounds(float[] r8, int[] r9) {
            r7 = this;
            r0 = 0
            if (r8 == 0) goto L49
            androidx.constraintlayout.core.motion.utils.CurveFit[] r1 = r7.mSpline
            r1 = r1[r0]
            double[] r1 = r1.getTimePoints()
            if (r9 == 0) goto L28
            java.util.ArrayList<androidx.constraintlayout.core.motion.MotionPaths> r2 = r7.mMotionPaths
            java.util.Iterator r2 = r2.iterator()
            r3 = r0
        L14:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L28
            java.lang.Object r4 = r2.next()
            androidx.constraintlayout.core.motion.MotionPaths r4 = (androidx.constraintlayout.core.motion.MotionPaths) r4
            int r5 = r3 + 1
            int r4 = r4.mMode
            r9[r3] = r4
            r3 = r5
            goto L14
        L28:
            r9 = r0
            r2 = r9
        L2a:
            int r3 = r1.length
            if (r9 >= r3) goto L46
            androidx.constraintlayout.core.motion.utils.CurveFit[] r3 = r7.mSpline
            r3 = r3[r0]
            r4 = r1[r9]
            double[] r6 = r7.mInterpolateData
            r3.getPos(r4, r6)
            androidx.constraintlayout.core.motion.MotionPaths r3 = r7.mStartMotionPath
            int[] r4 = r7.mInterpolateVariables
            double[] r5 = r7.mInterpolateData
            r3.getBounds(r4, r5, r8, r2)
            int r2 = r2 + 2
            int r9 = r9 + 1
            goto L2a
        L46:
            int r2 = r2 / 2
            return r2
        L49:
            return r0
    }

    public int buildKeyFrames(float[] r10, int[] r11, int[] r12) {
            r9 = this;
            r0 = 0
            if (r10 == 0) goto L6e
            androidx.constraintlayout.core.motion.utils.CurveFit[] r1 = r9.mSpline
            r1 = r1[r0]
            double[] r1 = r1.getTimePoints()
            if (r11 == 0) goto L28
            java.util.ArrayList<androidx.constraintlayout.core.motion.MotionPaths> r2 = r9.mMotionPaths
            java.util.Iterator r2 = r2.iterator()
            r3 = r0
        L14:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L28
            java.lang.Object r4 = r2.next()
            androidx.constraintlayout.core.motion.MotionPaths r4 = (androidx.constraintlayout.core.motion.MotionPaths) r4
            int r5 = r3 + 1
            int r4 = r4.mMode
            r11[r3] = r4
            r3 = r5
            goto L14
        L28:
            if (r12 == 0) goto L49
            java.util.ArrayList<androidx.constraintlayout.core.motion.MotionPaths> r11 = r9.mMotionPaths
            java.util.Iterator r11 = r11.iterator()
            r2 = r0
        L31:
            boolean r3 = r11.hasNext()
            if (r3 == 0) goto L49
            java.lang.Object r3 = r11.next()
            androidx.constraintlayout.core.motion.MotionPaths r3 = (androidx.constraintlayout.core.motion.MotionPaths) r3
            int r4 = r2 + 1
            r5 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3.position
            float r3 = r3 * r5
            int r3 = (int) r3
            r12[r2] = r3
            r2 = r4
            goto L31
        L49:
            r11 = r0
            r12 = r11
        L4b:
            int r2 = r1.length
            if (r11 >= r2) goto L6b
            androidx.constraintlayout.core.motion.utils.CurveFit[] r2 = r9.mSpline
            r2 = r2[r0]
            r3 = r1[r11]
            double[] r5 = r9.mInterpolateData
            r2.getPos(r3, r5)
            androidx.constraintlayout.core.motion.MotionPaths r2 = r9.mStartMotionPath
            r3 = r1[r11]
            int[] r5 = r9.mInterpolateVariables
            double[] r6 = r9.mInterpolateData
            r7 = r10
            r8 = r12
            r2.getCenter(r3, r5, r6, r7, r8)
            int r12 = r12 + 2
            int r11 = r11 + 1
            goto L4b
        L6b:
            int r12 = r12 / 2
            return r12
        L6e:
            return r0
    }

    public void buildPath(float[] r19, int r20) {
            r18 = this;
            r0 = r18
            r8 = r20
            int r1 = r8 + (-1)
            float r1 = (float) r1
            r9 = 1065353216(0x3f800000, float:1.0)
            float r10 = r9 / r1
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> r1 = r0.mAttributesMap
            java.lang.String r2 = "translationX"
            r3 = 0
            if (r1 != 0) goto L14
            r11 = r3
            goto L1b
        L14:
            java.lang.Object r1 = r1.get(r2)
            androidx.constraintlayout.core.motion.utils.SplineSet r1 = (androidx.constraintlayout.core.motion.utils.SplineSet) r1
            r11 = r1
        L1b:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> r1 = r0.mAttributesMap
            java.lang.String r4 = "translationY"
            if (r1 != 0) goto L23
            r12 = r3
            goto L2a
        L23:
            java.lang.Object r1 = r1.get(r4)
            androidx.constraintlayout.core.motion.utils.SplineSet r1 = (androidx.constraintlayout.core.motion.utils.SplineSet) r1
            r12 = r1
        L2a:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.KeyCycleOscillator> r1 = r0.mCycleMap
            if (r1 != 0) goto L30
            r13 = r3
            goto L37
        L30:
            java.lang.Object r1 = r1.get(r2)
            androidx.constraintlayout.core.motion.utils.KeyCycleOscillator r1 = (androidx.constraintlayout.core.motion.utils.KeyCycleOscillator) r1
            r13 = r1
        L37:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.KeyCycleOscillator> r1 = r0.mCycleMap
            if (r1 != 0) goto L3c
            goto L43
        L3c:
            java.lang.Object r1 = r1.get(r4)
            r3 = r1
            androidx.constraintlayout.core.motion.utils.KeyCycleOscillator r3 = (androidx.constraintlayout.core.motion.utils.KeyCycleOscillator) r3
        L43:
            r14 = r3
            r7 = 0
        L45:
            if (r7 >= r8) goto L11a
            float r1 = (float) r7
            float r1 = r1 * r10
            float r2 = r0.mStaggerScale
            int r3 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            r4 = 0
            if (r3 == 0) goto L68
            float r3 = r0.mStaggerOffset
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L57
            r1 = r4
        L57:
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L68
            double r5 = (double) r1
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r5 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r5 >= 0) goto L68
            float r1 = r1 - r3
            float r1 = r1 * r2
            float r1 = java.lang.Math.min(r1, r9)
        L68:
            r6 = r1
            double r1 = (double) r6
            androidx.constraintlayout.core.motion.MotionPaths r3 = r0.mStartMotionPath
            androidx.constraintlayout.core.motion.utils.Easing r3 = r3.mKeyFrameEasing
            java.util.ArrayList<androidx.constraintlayout.core.motion.MotionPaths> r5 = r0.mMotionPaths
            java.util.Iterator r5 = r5.iterator()
            r16 = 2143289344(0x7fc00000, float:NaN)
        L76:
            boolean r17 = r5.hasNext()
            if (r17 == 0) goto La0
            java.lang.Object r17 = r5.next()
            r9 = r17
            androidx.constraintlayout.core.motion.MotionPaths r9 = (androidx.constraintlayout.core.motion.MotionPaths) r9
            androidx.constraintlayout.core.motion.utils.Easing r15 = r9.mKeyFrameEasing
            if (r15 == 0) goto L9d
            float r15 = r9.time
            int r15 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r15 >= 0) goto L93
            androidx.constraintlayout.core.motion.utils.Easing r3 = r9.mKeyFrameEasing
            float r4 = r9.time
            goto L9d
        L93:
            boolean r15 = java.lang.Float.isNaN(r16)
            if (r15 == 0) goto L9d
            float r9 = r9.time
            r16 = r9
        L9d:
            r9 = 1065353216(0x3f800000, float:1.0)
            goto L76
        La0:
            if (r3 == 0) goto Lba
            boolean r1 = java.lang.Float.isNaN(r16)
            if (r1 == 0) goto Laa
            r16 = 1065353216(0x3f800000, float:1.0)
        Laa:
            float r1 = r6 - r4
            float r16 = r16 - r4
            float r1 = r1 / r16
            double r1 = (double) r1
            double r1 = r3.get(r1)
            float r1 = (float) r1
            float r1 = r1 * r16
            float r1 = r1 + r4
            double r1 = (double) r1
        Lba:
            r2 = r1
            androidx.constraintlayout.core.motion.utils.CurveFit[] r1 = r0.mSpline
            r9 = 0
            r1 = r1[r9]
            double[] r4 = r0.mInterpolateData
            r1.getPos(r2, r4)
            androidx.constraintlayout.core.motion.utils.CurveFit r1 = r0.mArcSpline
            if (r1 == 0) goto Ld1
            double[] r4 = r0.mInterpolateData
            int r5 = r4.length
            if (r5 <= 0) goto Ld1
            r1.getPos(r2, r4)
        Ld1:
            androidx.constraintlayout.core.motion.MotionPaths r1 = r0.mStartMotionPath
            int[] r4 = r0.mInterpolateVariables
            double[] r5 = r0.mInterpolateData
            int r15 = r7 * 2
            r9 = r6
            r6 = r19
            r16 = r7
            r7 = r15
            r1.getCenter(r2, r4, r5, r6, r7)
            if (r13 == 0) goto Lee
            r1 = r19[r15]
            float r2 = r13.get(r9)
            float r1 = r1 + r2
            r19[r15] = r1
            goto Lf9
        Lee:
            if (r11 == 0) goto Lf9
            r1 = r19[r15]
            float r2 = r11.get(r9)
            float r1 = r1 + r2
            r19[r15] = r1
        Lf9:
            if (r14 == 0) goto L107
            int r15 = r15 + 1
            r1 = r19[r15]
            float r2 = r14.get(r9)
            float r1 = r1 + r2
            r19[r15] = r1
            goto L114
        L107:
            if (r12 == 0) goto L114
            int r15 = r15 + 1
            r1 = r19[r15]
            float r2 = r12.get(r9)
            float r1 = r1 + r2
            r19[r15] = r1
        L114:
            int r7 = r16 + 1
            r9 = 1065353216(0x3f800000, float:1.0)
            goto L45
        L11a:
            return
    }

    public void buildRect(float r4, float[] r5, int r6) {
            r3 = this;
            r0 = 0
            float r4 = r3.getAdjustedPosition(r4, r0)
            androidx.constraintlayout.core.motion.utils.CurveFit[] r0 = r3.mSpline
            r1 = 0
            r0 = r0[r1]
            double r1 = (double) r4
            double[] r4 = r3.mInterpolateData
            r0.getPos(r1, r4)
            androidx.constraintlayout.core.motion.MotionPaths r4 = r3.mStartMotionPath
            int[] r0 = r3.mInterpolateVariables
            double[] r1 = r3.mInterpolateData
            r4.getRect(r0, r1, r5, r6)
            return
    }

    void buildRectangles(float[] r8, int r9) {
            r7 = this;
            int r0 = r9 + (-1)
            float r0 = (float) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 / r0
            r0 = 0
            r2 = r0
        L8:
            if (r2 >= r9) goto L29
            float r3 = (float) r2
            float r3 = r3 * r1
            r4 = 0
            float r3 = r7.getAdjustedPosition(r3, r4)
            androidx.constraintlayout.core.motion.utils.CurveFit[] r4 = r7.mSpline
            r4 = r4[r0]
            double r5 = (double) r3
            double[] r3 = r7.mInterpolateData
            r4.getPos(r5, r3)
            androidx.constraintlayout.core.motion.MotionPaths r3 = r7.mStartMotionPath
            int[] r4 = r7.mInterpolateVariables
            double[] r5 = r7.mInterpolateData
            int r6 = r2 * 8
            r3.getRect(r4, r5, r8, r6)
            int r2 = r2 + 1
            goto L8
        L29:
            return
    }

    void endTrigger(boolean r1) {
            r0 = this;
            return
    }

    public int getAnimateRelativeTo() {
            r1 = this;
            androidx.constraintlayout.core.motion.MotionPaths r0 = r1.mStartMotionPath
            int r0 = r0.mAnimateRelativeTo
            return r0
    }

    int getAttributeValues(java.lang.String r2, float[] r3, int r4) {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> r4 = r1.mAttributesMap
            java.lang.Object r2 = r4.get(r2)
            androidx.constraintlayout.core.motion.utils.SplineSet r2 = (androidx.constraintlayout.core.motion.utils.SplineSet) r2
            if (r2 != 0) goto Lc
            r2 = -1
            return r2
        Lc:
            r4 = 0
        Ld:
            int r0 = r3.length
            if (r4 >= r0) goto L1f
            int r0 = r3.length
            int r0 = r0 + (-1)
            int r0 = r4 / r0
            float r0 = (float) r0
            float r0 = r2.get(r0)
            r3[r4] = r0
            int r4 = r4 + 1
            goto Ld
        L1f:
            int r2 = r3.length
            return r2
    }

    public void getCenter(double r10, float[] r12, float[] r13) {
            r9 = this;
            r0 = 4
            double[] r5 = new double[r0]
            double[] r7 = new double[r0]
            androidx.constraintlayout.core.motion.utils.CurveFit[] r0 = r9.mSpline
            r1 = 0
            r0 = r0[r1]
            r0.getPos(r10, r5)
            androidx.constraintlayout.core.motion.utils.CurveFit[] r0 = r9.mSpline
            r0 = r0[r1]
            r0.getSlope(r10, r7)
            r0 = 0
            java.util.Arrays.fill(r13, r0)
            androidx.constraintlayout.core.motion.MotionPaths r1 = r9.mStartMotionPath
            int[] r4 = r9.mInterpolateVariables
            r2 = r10
            r6 = r12
            r8 = r13
            r1.getCenter(r2, r4, r5, r6, r7, r8)
            return
    }

    public float getCenterX() {
            r1 = this;
            float r0 = r1.mCurrentCenterX
            return r0
    }

    public float getCenterY() {
            r1 = this;
            float r0 = r1.mCurrentCenterY
            return r0
    }

    void getDpDt(float r12, float r13, float r14, float[] r15) {
            r11 = this;
            float[] r0 = r11.mVelocity
            float r12 = r11.getAdjustedPosition(r12, r0)
            androidx.constraintlayout.core.motion.utils.CurveFit[] r0 = r11.mSpline
            r1 = 0
            if (r0 == 0) goto L5d
            r0 = r0[r1]
            double r2 = (double) r12
            double[] r12 = r11.mInterpolateVelocity
            r0.getSlope(r2, r12)
            androidx.constraintlayout.core.motion.utils.CurveFit[] r12 = r11.mSpline
            r12 = r12[r1]
            double[] r0 = r11.mInterpolateData
            r12.getPos(r2, r0)
            float[] r12 = r11.mVelocity
            r12 = r12[r1]
        L20:
            double[] r9 = r11.mInterpolateVelocity
            int r0 = r9.length
            if (r1 >= r0) goto L2e
            r4 = r9[r1]
            double r6 = (double) r12
            double r4 = r4 * r6
            r9[r1] = r4
            int r1 = r1 + 1
            goto L20
        L2e:
            androidx.constraintlayout.core.motion.utils.CurveFit r12 = r11.mArcSpline
            if (r12 == 0) goto L50
            double[] r0 = r11.mInterpolateData
            int r1 = r0.length
            if (r1 <= 0) goto L4f
            r12.getPos(r2, r0)
            androidx.constraintlayout.core.motion.utils.CurveFit r12 = r11.mArcSpline
            double[] r0 = r11.mInterpolateVelocity
            r12.getSlope(r2, r0)
            androidx.constraintlayout.core.motion.MotionPaths r4 = r11.mStartMotionPath
            int[] r8 = r11.mInterpolateVariables
            double[] r9 = r11.mInterpolateVelocity
            double[] r10 = r11.mInterpolateData
            r5 = r13
            r6 = r14
            r7 = r15
            r4.setDpDt(r5, r6, r7, r8, r9, r10)
        L4f:
            return
        L50:
            androidx.constraintlayout.core.motion.MotionPaths r4 = r11.mStartMotionPath
            int[] r8 = r11.mInterpolateVariables
            double[] r10 = r11.mInterpolateData
            r5 = r13
            r6 = r14
            r7 = r15
            r4.setDpDt(r5, r6, r7, r8, r9, r10)
            return
        L5d:
            androidx.constraintlayout.core.motion.MotionPaths r12 = r11.mEndMotionPath
            float r12 = r12.f18x
            androidx.constraintlayout.core.motion.MotionPaths r0 = r11.mStartMotionPath
            float r0 = r0.f18x
            float r12 = r12 - r0
            androidx.constraintlayout.core.motion.MotionPaths r0 = r11.mEndMotionPath
            float r0 = r0.f19y
            androidx.constraintlayout.core.motion.MotionPaths r2 = r11.mStartMotionPath
            float r2 = r2.f19y
            float r0 = r0 - r2
            androidx.constraintlayout.core.motion.MotionPaths r2 = r11.mEndMotionPath
            float r2 = r2.width
            androidx.constraintlayout.core.motion.MotionPaths r3 = r11.mStartMotionPath
            float r3 = r3.width
            float r2 = r2 - r3
            androidx.constraintlayout.core.motion.MotionPaths r3 = r11.mEndMotionPath
            float r3 = r3.height
            androidx.constraintlayout.core.motion.MotionPaths r4 = r11.mStartMotionPath
            float r4 = r4.height
            float r3 = r3 - r4
            float r2 = r2 + r12
            float r3 = r3 + r0
            r4 = 1065353216(0x3f800000, float:1.0)
            float r5 = r4 - r13
            float r12 = r12 * r5
            float r2 = r2 * r13
            float r12 = r12 + r2
            r15[r1] = r12
            float r4 = r4 - r14
            float r0 = r0 * r4
            float r3 = r3 * r14
            float r0 = r0 + r3
            r12 = 1
            r15[r12] = r0
            return
    }

    public int getDrawPath() {
            r3 = this;
            androidx.constraintlayout.core.motion.MotionPaths r0 = r3.mStartMotionPath
            int r0 = r0.mDrawPath
            java.util.ArrayList<androidx.constraintlayout.core.motion.MotionPaths> r1 = r3.mMotionPaths
            java.util.Iterator r1 = r1.iterator()
        La:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1d
            java.lang.Object r2 = r1.next()
            androidx.constraintlayout.core.motion.MotionPaths r2 = (androidx.constraintlayout.core.motion.MotionPaths) r2
            int r2 = r2.mDrawPath
            int r0 = java.lang.Math.max(r0, r2)
            goto La
        L1d:
            androidx.constraintlayout.core.motion.MotionPaths r1 = r3.mEndMotionPath
            int r1 = r1.mDrawPath
            int r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    public float getFinalHeight() {
            r1 = this;
            androidx.constraintlayout.core.motion.MotionPaths r0 = r1.mEndMotionPath
            float r0 = r0.height
            return r0
    }

    public float getFinalWidth() {
            r1 = this;
            androidx.constraintlayout.core.motion.MotionPaths r0 = r1.mEndMotionPath
            float r0 = r0.width
            return r0
    }

    public float getFinalX() {
            r1 = this;
            androidx.constraintlayout.core.motion.MotionPaths r0 = r1.mEndMotionPath
            float r0 = r0.f18x
            return r0
    }

    public float getFinalY() {
            r1 = this;
            androidx.constraintlayout.core.motion.MotionPaths r0 = r1.mEndMotionPath
            float r0 = r0.f19y
            return r0
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(java.lang.String r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public androidx.constraintlayout.core.motion.MotionPaths getKeyFrame(int r2) {
            r1 = this;
            java.util.ArrayList<androidx.constraintlayout.core.motion.MotionPaths> r0 = r1.mMotionPaths
            java.lang.Object r2 = r0.get(r2)
            androidx.constraintlayout.core.motion.MotionPaths r2 = (androidx.constraintlayout.core.motion.MotionPaths) r2
            return r2
    }

    public int getKeyFrameInfo(int r18, int[] r19) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 2
            float[] r2 = new float[r2]
            java.util.ArrayList<androidx.constraintlayout.core.motion.key.MotionKey> r3 = r0.mKeyList
            java.util.Iterator r10 = r3.iterator()
            r11 = 0
            r12 = r11
            r13 = r12
        L10:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L92
            java.lang.Object r3 = r10.next()
            r14 = r3
            androidx.constraintlayout.core.motion.key.MotionKey r14 = (androidx.constraintlayout.core.motion.key.MotionKey) r14
            int r3 = r14.mType
            if (r3 == r1) goto L25
            r3 = -1
            if (r1 != r3) goto L25
            goto L10
        L25:
            r19[r13] = r11
            int r3 = r13 + 1
            int r4 = r14.mType
            r19[r3] = r4
            r15 = 1
            int r16 = r3 + 1
            int r3 = r14.mFramePosition
            r19[r16] = r3
            int r3 = r14.mFramePosition
            float r3 = (float) r3
            r4 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 / r4
            androidx.constraintlayout.core.motion.utils.CurveFit[] r4 = r0.mSpline
            r4 = r4[r11]
            double r5 = (double) r3
            double[] r3 = r0.mInterpolateData
            r4.getPos(r5, r3)
            androidx.constraintlayout.core.motion.MotionPaths r3 = r0.mStartMotionPath
            int[] r7 = r0.mInterpolateVariables
            double[] r8 = r0.mInterpolateData
            r9 = 0
            r4 = r5
            r6 = r7
            r7 = r8
            r8 = r2
            r3.getCenter(r4, r6, r7, r8, r9)
            int r16 = r16 + 1
            r3 = r2[r11]
            int r3 = java.lang.Float.floatToIntBits(r3)
            r19[r16] = r3
            int r16 = r16 + 1
            r3 = r2[r15]
            int r3 = java.lang.Float.floatToIntBits(r3)
            r19[r16] = r3
            boolean r3 = r14 instanceof androidx.constraintlayout.core.motion.key.MotionKeyPosition
            if (r3 == 0) goto L86
            androidx.constraintlayout.core.motion.key.MotionKeyPosition r14 = (androidx.constraintlayout.core.motion.key.MotionKeyPosition) r14
            int r16 = r16 + 1
            int r3 = r14.mPositionType
            r19[r16] = r3
            int r16 = r16 + 1
            float r3 = r14.mPercentX
            int r3 = java.lang.Float.floatToIntBits(r3)
            r19[r16] = r3
            int r16 = r16 + 1
            float r3 = r14.mPercentY
            int r3 = java.lang.Float.floatToIntBits(r3)
            r19[r16] = r3
        L86:
            int r16 = r16 + 1
            int r3 = r16 - r13
            r19[r13] = r3
            int r12 = r12 + 1
            r13 = r16
            goto L10
        L92:
            return r12
    }

    float getKeyFrameParameter(int r10, float r11, float r12) {
            r9 = this;
            androidx.constraintlayout.core.motion.MotionPaths r0 = r9.mEndMotionPath
            float r0 = r0.f18x
            androidx.constraintlayout.core.motion.MotionPaths r1 = r9.mStartMotionPath
            float r1 = r1.f18x
            float r0 = r0 - r1
            androidx.constraintlayout.core.motion.MotionPaths r1 = r9.mEndMotionPath
            float r1 = r1.f19y
            androidx.constraintlayout.core.motion.MotionPaths r2 = r9.mStartMotionPath
            float r2 = r2.f19y
            float r1 = r1 - r2
            androidx.constraintlayout.core.motion.MotionPaths r2 = r9.mStartMotionPath
            float r2 = r2.f18x
            androidx.constraintlayout.core.motion.MotionPaths r3 = r9.mStartMotionPath
            float r3 = r3.width
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            float r2 = r2 + r3
            androidx.constraintlayout.core.motion.MotionPaths r3 = r9.mStartMotionPath
            float r3 = r3.f19y
            androidx.constraintlayout.core.motion.MotionPaths r5 = r9.mStartMotionPath
            float r5 = r5.height
            float r5 = r5 / r4
            float r3 = r3 + r5
            double r4 = (double) r0
            double r6 = (double) r1
            double r4 = java.lang.Math.hypot(r4, r6)
            float r4 = (float) r4
            double r5 = (double) r4
            r7 = 4502148214488346440(0x3e7ad7f29abcaf48, double:1.0E-7)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 >= 0) goto L3c
            r10 = 2143289344(0x7fc00000, float:NaN)
            return r10
        L3c:
            float r11 = r11 - r2
            float r12 = r12 - r3
            double r2 = (double) r11
            double r5 = (double) r12
            double r2 = java.lang.Math.hypot(r2, r5)
            float r2 = (float) r2
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L4b
            return r3
        L4b:
            float r2 = r11 * r0
            float r5 = r12 * r1
            float r2 = r2 + r5
            if (r10 == 0) goto L74
            r5 = 1
            if (r10 == r5) goto L6a
            r2 = 2
            if (r10 == r2) goto L68
            r2 = 3
            if (r10 == r2) goto L66
            r0 = 4
            if (r10 == r0) goto L64
            r11 = 5
            if (r10 == r11) goto L62
            return r3
        L62:
            float r12 = r12 / r1
            return r12
        L64:
            float r11 = r11 / r1
            return r11
        L66:
            float r12 = r12 / r0
            return r12
        L68:
            float r11 = r11 / r0
            return r11
        L6a:
            float r4 = r4 * r4
            float r2 = r2 * r2
            float r4 = r4 - r2
            double r10 = (double) r4
            double r10 = java.lang.Math.sqrt(r10)
            float r10 = (float) r10
            return r10
        L74:
            float r2 = r2 / r4
            return r2
    }

    public int getKeyFramePositions(int[] r13, float[] r14) {
            r12 = this;
            java.util.ArrayList<androidx.constraintlayout.core.motion.key.MotionKey> r0 = r12.mKeyList
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
            r10 = r2
        L9:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L3f
            java.lang.Object r3 = r0.next()
            androidx.constraintlayout.core.motion.key.MotionKey r3 = (androidx.constraintlayout.core.motion.key.MotionKey) r3
            int r11 = r2 + 1
            int r4 = r3.mFramePosition
            int r5 = r3.mType
            int r5 = r5 * 1000
            int r4 = r4 + r5
            r13[r2] = r4
            int r2 = r3.mFramePosition
            float r2 = (float) r2
            r3 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 / r3
            androidx.constraintlayout.core.motion.utils.CurveFit[] r3 = r12.mSpline
            r3 = r3[r1]
            double r4 = (double) r2
            double[] r2 = r12.mInterpolateData
            r3.getPos(r4, r2)
            androidx.constraintlayout.core.motion.MotionPaths r3 = r12.mStartMotionPath
            int[] r6 = r12.mInterpolateVariables
            double[] r7 = r12.mInterpolateData
            r8 = r14
            r9 = r10
            r3.getCenter(r4, r6, r7, r8, r9)
            int r10 = r10 + 2
            r2 = r11
            goto L9
        L3f:
            return r2
    }

    double[] getPos(double r4) {
            r3 = this;
            androidx.constraintlayout.core.motion.utils.CurveFit[] r0 = r3.mSpline
            r1 = 0
            r0 = r0[r1]
            double[] r1 = r3.mInterpolateData
            r0.getPos(r4, r1)
            androidx.constraintlayout.core.motion.utils.CurveFit r0 = r3.mArcSpline
            if (r0 == 0) goto L16
            double[] r1 = r3.mInterpolateData
            int r2 = r1.length
            if (r2 <= 0) goto L16
            r0.getPos(r4, r1)
        L16:
            double[] r4 = r3.mInterpolateData
            return r4
    }

    androidx.constraintlayout.core.motion.key.MotionKeyPosition getPositionKeyframe(int r12, int r13, float r14, float r15) {
            r11 = this;
            androidx.constraintlayout.core.motion.utils.FloatRect r7 = new androidx.constraintlayout.core.motion.utils.FloatRect
            r7.<init>()
            androidx.constraintlayout.core.motion.MotionPaths r0 = r11.mStartMotionPath
            float r0 = r0.f18x
            r7.left = r0
            androidx.constraintlayout.core.motion.MotionPaths r0 = r11.mStartMotionPath
            float r0 = r0.f19y
            r7.top = r0
            float r0 = r7.left
            androidx.constraintlayout.core.motion.MotionPaths r1 = r11.mStartMotionPath
            float r1 = r1.width
            float r0 = r0 + r1
            r7.right = r0
            float r0 = r7.top
            androidx.constraintlayout.core.motion.MotionPaths r1 = r11.mStartMotionPath
            float r1 = r1.height
            float r0 = r0 + r1
            r7.bottom = r0
            androidx.constraintlayout.core.motion.utils.FloatRect r8 = new androidx.constraintlayout.core.motion.utils.FloatRect
            r8.<init>()
            androidx.constraintlayout.core.motion.MotionPaths r0 = r11.mEndMotionPath
            float r0 = r0.f18x
            r8.left = r0
            androidx.constraintlayout.core.motion.MotionPaths r0 = r11.mEndMotionPath
            float r0 = r0.f19y
            r8.top = r0
            float r0 = r8.left
            androidx.constraintlayout.core.motion.MotionPaths r1 = r11.mEndMotionPath
            float r1 = r1.width
            float r0 = r0 + r1
            r8.right = r0
            float r0 = r8.top
            androidx.constraintlayout.core.motion.MotionPaths r1 = r11.mEndMotionPath
            float r1 = r1.height
            float r0 = r0 + r1
            r8.bottom = r0
            java.util.ArrayList<androidx.constraintlayout.core.motion.key.MotionKey> r0 = r11.mKeyList
            java.util.Iterator r9 = r0.iterator()
        L4c:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L6d
            java.lang.Object r0 = r9.next()
            androidx.constraintlayout.core.motion.key.MotionKey r0 = (androidx.constraintlayout.core.motion.key.MotionKey) r0
            boolean r1 = r0 instanceof androidx.constraintlayout.core.motion.key.MotionKeyPosition
            if (r1 == 0) goto L4c
            r10 = r0
            androidx.constraintlayout.core.motion.key.MotionKeyPosition r10 = (androidx.constraintlayout.core.motion.key.MotionKeyPosition) r10
            r0 = r10
            r1 = r12
            r2 = r13
            r3 = r7
            r4 = r8
            r5 = r14
            r6 = r15
            boolean r0 = r0.intersects(r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L4c
            return r10
        L6d:
            r12 = 0
            return r12
    }

    void getPostLayoutDvDp(float r20, int r21, int r22, float r23, float r24, float[] r25) {
            r19 = this;
            r0 = r19
            float[] r1 = r0.mVelocity
            r2 = r20
            float r1 = r0.getAdjustedPosition(r2, r1)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> r2 = r0.mAttributesMap
            java.lang.String r3 = "translationX"
            r4 = 0
            if (r2 != 0) goto L13
            r2 = r4
            goto L19
        L13:
            java.lang.Object r2 = r2.get(r3)
            androidx.constraintlayout.core.motion.utils.SplineSet r2 = (androidx.constraintlayout.core.motion.utils.SplineSet) r2
        L19:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> r5 = r0.mAttributesMap
            java.lang.String r6 = "translationY"
            if (r5 != 0) goto L21
            r5 = r4
            goto L27
        L21:
            java.lang.Object r5 = r5.get(r6)
            androidx.constraintlayout.core.motion.utils.SplineSet r5 = (androidx.constraintlayout.core.motion.utils.SplineSet) r5
        L27:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> r7 = r0.mAttributesMap
            java.lang.String r8 = "rotationZ"
            if (r7 != 0) goto L2f
            r7 = r4
            goto L35
        L2f:
            java.lang.Object r7 = r7.get(r8)
            androidx.constraintlayout.core.motion.utils.SplineSet r7 = (androidx.constraintlayout.core.motion.utils.SplineSet) r7
        L35:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> r9 = r0.mAttributesMap
            java.lang.String r10 = "scaleX"
            if (r9 != 0) goto L3d
            r9 = r4
            goto L43
        L3d:
            java.lang.Object r9 = r9.get(r10)
            androidx.constraintlayout.core.motion.utils.SplineSet r9 = (androidx.constraintlayout.core.motion.utils.SplineSet) r9
        L43:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> r11 = r0.mAttributesMap
            java.lang.String r12 = "scaleY"
            if (r11 != 0) goto L4b
            r11 = r4
            goto L51
        L4b:
            java.lang.Object r11 = r11.get(r12)
            androidx.constraintlayout.core.motion.utils.SplineSet r11 = (androidx.constraintlayout.core.motion.utils.SplineSet) r11
        L51:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.KeyCycleOscillator> r13 = r0.mCycleMap
            if (r13 != 0) goto L57
            r3 = r4
            goto L5d
        L57:
            java.lang.Object r3 = r13.get(r3)
            androidx.constraintlayout.core.motion.utils.KeyCycleOscillator r3 = (androidx.constraintlayout.core.motion.utils.KeyCycleOscillator) r3
        L5d:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.KeyCycleOscillator> r13 = r0.mCycleMap
            if (r13 != 0) goto L63
            r6 = r4
            goto L69
        L63:
            java.lang.Object r6 = r13.get(r6)
            androidx.constraintlayout.core.motion.utils.KeyCycleOscillator r6 = (androidx.constraintlayout.core.motion.utils.KeyCycleOscillator) r6
        L69:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.KeyCycleOscillator> r13 = r0.mCycleMap
            if (r13 != 0) goto L6f
            r8 = r4
            goto L75
        L6f:
            java.lang.Object r8 = r13.get(r8)
            androidx.constraintlayout.core.motion.utils.KeyCycleOscillator r8 = (androidx.constraintlayout.core.motion.utils.KeyCycleOscillator) r8
        L75:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.KeyCycleOscillator> r13 = r0.mCycleMap
            if (r13 != 0) goto L7b
            r10 = r4
            goto L81
        L7b:
            java.lang.Object r10 = r13.get(r10)
            androidx.constraintlayout.core.motion.utils.KeyCycleOscillator r10 = (androidx.constraintlayout.core.motion.utils.KeyCycleOscillator) r10
        L81:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.KeyCycleOscillator> r13 = r0.mCycleMap
            if (r13 != 0) goto L86
            goto L8c
        L86:
            java.lang.Object r4 = r13.get(r12)
            androidx.constraintlayout.core.motion.utils.KeyCycleOscillator r4 = (androidx.constraintlayout.core.motion.utils.KeyCycleOscillator) r4
        L8c:
            androidx.constraintlayout.core.motion.utils.VelocityMatrix r12 = new androidx.constraintlayout.core.motion.utils.VelocityMatrix
            r12.<init>()
            r12.clear()
            r12.setRotationVelocity(r7, r1)
            r12.setTranslationVelocity(r2, r5, r1)
            r12.setScaleVelocity(r9, r11, r1)
            r12.setRotationVelocity(r8, r1)
            r12.setTranslationVelocity(r3, r6, r1)
            r12.setScaleVelocity(r10, r4, r1)
            androidx.constraintlayout.core.motion.utils.CurveFit r13 = r0.mArcSpline
            if (r13 == 0) goto Lda
            double[] r2 = r0.mInterpolateData
            int r3 = r2.length
            if (r3 <= 0) goto Lcb
            double r3 = (double) r1
            r13.getPos(r3, r2)
            androidx.constraintlayout.core.motion.utils.CurveFit r1 = r0.mArcSpline
            double[] r2 = r0.mInterpolateVelocity
            r1.getSlope(r3, r2)
            androidx.constraintlayout.core.motion.MotionPaths r1 = r0.mStartMotionPath
            int[] r5 = r0.mInterpolateVariables
            double[] r6 = r0.mInterpolateVelocity
            double[] r7 = r0.mInterpolateData
            r2 = r23
            r3 = r24
            r4 = r25
            r1.setDpDt(r2, r3, r4, r5, r6, r7)
        Lcb:
            r1 = r12
            r2 = r23
            r3 = r24
            r4 = r21
            r5 = r22
            r6 = r25
            r1.applyTransform(r2, r3, r4, r5, r6)
            return
        Lda:
            androidx.constraintlayout.core.motion.utils.CurveFit[] r13 = r0.mSpline
            r14 = 0
            if (r13 == 0) goto L124
            float[] r2 = r0.mVelocity
            float r1 = r0.getAdjustedPosition(r1, r2)
            androidx.constraintlayout.core.motion.utils.CurveFit[] r2 = r0.mSpline
            r2 = r2[r14]
            double r3 = (double) r1
            double[] r1 = r0.mInterpolateVelocity
            r2.getSlope(r3, r1)
            androidx.constraintlayout.core.motion.utils.CurveFit[] r1 = r0.mSpline
            r1 = r1[r14]
            double[] r2 = r0.mInterpolateData
            r1.getPos(r3, r2)
            float[] r1 = r0.mVelocity
            r1 = r1[r14]
        Lfc:
            double[] r6 = r0.mInterpolateVelocity
            int r2 = r6.length
            if (r14 >= r2) goto L10a
            r2 = r6[r14]
            double r4 = (double) r1
            double r2 = r2 * r4
            r6[r14] = r2
            int r14 = r14 + 1
            goto Lfc
        L10a:
            androidx.constraintlayout.core.motion.MotionPaths r1 = r0.mStartMotionPath
            int[] r5 = r0.mInterpolateVariables
            double[] r7 = r0.mInterpolateData
            r2 = r23
            r3 = r24
            r4 = r25
            r1.setDpDt(r2, r3, r4, r5, r6, r7)
            r1 = r12
            r4 = r21
            r5 = r22
            r6 = r25
            r1.applyTransform(r2, r3, r4, r5, r6)
            return
        L124:
            androidx.constraintlayout.core.motion.MotionPaths r13 = r0.mEndMotionPath
            float r13 = r13.f18x
            androidx.constraintlayout.core.motion.MotionPaths r15 = r0.mStartMotionPath
            float r15 = r15.f18x
            float r13 = r13 - r15
            androidx.constraintlayout.core.motion.MotionPaths r15 = r0.mEndMotionPath
            float r15 = r15.f19y
            androidx.constraintlayout.core.motion.MotionPaths r14 = r0.mStartMotionPath
            float r14 = r14.f19y
            float r15 = r15 - r14
            androidx.constraintlayout.core.motion.MotionPaths r14 = r0.mEndMotionPath
            float r14 = r14.width
            r16 = r4
            androidx.constraintlayout.core.motion.MotionPaths r4 = r0.mStartMotionPath
            float r4 = r4.width
            float r14 = r14 - r4
            androidx.constraintlayout.core.motion.MotionPaths r4 = r0.mEndMotionPath
            float r4 = r4.height
            r17 = r10
            androidx.constraintlayout.core.motion.MotionPaths r10 = r0.mStartMotionPath
            float r10 = r10.height
            float r4 = r4 - r10
            float r14 = r14 + r13
            float r4 = r4 + r15
            r10 = 1065353216(0x3f800000, float:1.0)
            float r18 = r10 - r23
            float r13 = r13 * r18
            float r14 = r14 * r23
            float r13 = r13 + r14
            r14 = 0
            r25[r14] = r13
            float r10 = r10 - r24
            float r15 = r15 * r10
            float r4 = r4 * r24
            float r15 = r15 + r4
            r4 = 1
            r25[r4] = r15
            r12.clear()
            r12.setRotationVelocity(r7, r1)
            r12.setTranslationVelocity(r2, r5, r1)
            r12.setScaleVelocity(r9, r11, r1)
            r12.setRotationVelocity(r8, r1)
            r12.setTranslationVelocity(r3, r6, r1)
            r4 = r16
            r10 = r17
            r12.setScaleVelocity(r10, r4, r1)
            r1 = r12
            r2 = r23
            r3 = r24
            r4 = r21
            r5 = r22
            r6 = r25
            r1.applyTransform(r2, r3, r4, r5, r6)
            return
    }

    public float getStartHeight() {
            r1 = this;
            androidx.constraintlayout.core.motion.MotionPaths r0 = r1.mStartMotionPath
            float r0 = r0.height
            return r0
    }

    public float getStartWidth() {
            r1 = this;
            androidx.constraintlayout.core.motion.MotionPaths r0 = r1.mStartMotionPath
            float r0 = r0.width
            return r0
    }

    public float getStartX() {
            r1 = this;
            androidx.constraintlayout.core.motion.MotionPaths r0 = r1.mStartMotionPath
            float r0 = r0.f18x
            return r0
    }

    public float getStartY() {
            r1 = this;
            androidx.constraintlayout.core.motion.MotionPaths r0 = r1.mStartMotionPath
            float r0 = r0.f19y
            return r0
    }

    public int getTransformPivotTarget() {
            r1 = this;
            int r0 = r1.mTransformPivotTarget
            return r0
    }

    public androidx.constraintlayout.core.motion.MotionWidget getView() {
            r1 = this;
            androidx.constraintlayout.core.motion.MotionWidget r0 = r1.mView
            return r0
    }

    public boolean interpolate(androidx.constraintlayout.core.motion.MotionWidget r18, float r19, long r20, androidx.constraintlayout.core.motion.utils.KeyCache r22) {
            r17 = this;
            r0 = r17
            r8 = r18
            r1 = 0
            r2 = r19
            float r1 = r0.getAdjustedPosition(r2, r1)
            int r2 = r0.mQuantizeMotionSteps
            r9 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            r11 = -1
            if (r2 == r11) goto L42
            float r2 = (float) r2
            float r2 = r10 / r2
            float r3 = r1 / r2
            double r3 = (double) r3
            double r3 = java.lang.Math.floor(r3)
            float r3 = (float) r3
            float r3 = r3 * r2
            float r1 = r1 % r2
            float r1 = r1 / r2
            float r4 = r0.mQuantizeMotionPhase
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L2d
            float r4 = r0.mQuantizeMotionPhase
            float r1 = r1 + r4
            float r1 = r1 % r10
        L2d:
            androidx.constraintlayout.core.motion.utils.DifferentialInterpolator r4 = r0.mQuantizeMotionInterpolator
            if (r4 == 0) goto L36
            float r1 = r4.getInterpolation(r1)
            goto L40
        L36:
            double r4 = (double) r1
            r6 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 <= 0) goto L3f
            r1 = r10
            goto L40
        L3f:
            r1 = r9
        L40:
            float r1 = r1 * r2
            float r1 = r1 + r3
        L42:
            r12 = r1
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> r1 = r0.mAttributesMap
            if (r1 == 0) goto L5f
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L4f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L5f
            java.lang.Object r2 = r1.next()
            androidx.constraintlayout.core.motion.utils.SplineSet r2 = (androidx.constraintlayout.core.motion.utils.SplineSet) r2
            r2.setProperty(r8, r12)
            goto L4f
        L5f:
            androidx.constraintlayout.core.motion.utils.CurveFit[] r1 = r0.mSpline
            r14 = 0
            if (r1 == 0) goto L163
            r1 = r1[r14]
            double r6 = (double) r12
            double[] r2 = r0.mInterpolateData
            r1.getPos(r6, r2)
            androidx.constraintlayout.core.motion.utils.CurveFit[] r1 = r0.mSpline
            r1 = r1[r14]
            double[] r2 = r0.mInterpolateVelocity
            r1.getSlope(r6, r2)
            androidx.constraintlayout.core.motion.utils.CurveFit r1 = r0.mArcSpline
            if (r1 == 0) goto L88
            double[] r2 = r0.mInterpolateData
            int r3 = r2.length
            if (r3 <= 0) goto L88
            r1.getPos(r6, r2)
            androidx.constraintlayout.core.motion.utils.CurveFit r1 = r0.mArcSpline
            double[] r2 = r0.mInterpolateVelocity
            r1.getSlope(r6, r2)
        L88:
            boolean r1 = r0.mNoMovement
            if (r1 != 0) goto La1
            androidx.constraintlayout.core.motion.MotionPaths r1 = r0.mStartMotionPath
            int[] r4 = r0.mInterpolateVariables
            double[] r5 = r0.mInterpolateData
            double[] r15 = r0.mInterpolateVelocity
            r16 = 0
            r2 = r12
            r3 = r18
            r13 = r6
            r6 = r15
            r7 = r16
            r1.setView(r2, r3, r4, r5, r6, r7)
            goto La2
        La1:
            r13 = r6
        La2:
            int r1 = r0.mTransformPivotTarget
            if (r1 == r11) goto L100
            androidx.constraintlayout.core.motion.MotionWidget r1 = r0.mTransformPivotView
            if (r1 != 0) goto Lb6
            androidx.constraintlayout.core.motion.MotionWidget r1 = r18.getParent()
            int r2 = r0.mTransformPivotTarget
            androidx.constraintlayout.core.motion.MotionWidget r1 = r1.findViewById(r2)
            r0.mTransformPivotView = r1
        Lb6:
            androidx.constraintlayout.core.motion.MotionWidget r1 = r0.mTransformPivotView
            if (r1 == 0) goto L100
            int r1 = r1.getTop()
            androidx.constraintlayout.core.motion.MotionWidget r2 = r0.mTransformPivotView
            int r2 = r2.getBottom()
            int r1 = r1 + r2
            float r1 = (float) r1
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            androidx.constraintlayout.core.motion.MotionWidget r3 = r0.mTransformPivotView
            int r3 = r3.getLeft()
            androidx.constraintlayout.core.motion.MotionWidget r4 = r0.mTransformPivotView
            int r4 = r4.getRight()
            int r3 = r3 + r4
            float r3 = (float) r3
            float r3 = r3 / r2
            int r2 = r18.getRight()
            int r4 = r18.getLeft()
            int r2 = r2 - r4
            if (r2 <= 0) goto L100
            int r2 = r18.getBottom()
            int r4 = r18.getTop()
            int r2 = r2 - r4
            if (r2 <= 0) goto L100
            int r2 = r18.getLeft()
            float r2 = (float) r2
            float r3 = r3 - r2
            int r2 = r18.getTop()
            float r2 = (float) r2
            float r1 = r1 - r2
            r8.setPivotX(r3)
            r8.setPivotY(r1)
        L100:
            r1 = 1
        L101:
            androidx.constraintlayout.core.motion.utils.CurveFit[] r2 = r0.mSpline
            int r3 = r2.length
            if (r1 >= r3) goto L125
            r2 = r2[r1]
            float[] r3 = r0.mValuesBuff
            r2.getPos(r13, r3)
            androidx.constraintlayout.core.motion.MotionPaths r2 = r0.mStartMotionPath
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r2 = r2.customAttributes
            java.lang.String[] r3 = r0.mAttributeNames
            int r4 = r1 + (-1)
            r3 = r3[r4]
            java.lang.Object r2 = r2.get(r3)
            androidx.constraintlayout.core.motion.CustomVariable r2 = (androidx.constraintlayout.core.motion.CustomVariable) r2
            float[] r3 = r0.mValuesBuff
            r2.setInterpolatedValue(r8, r3)
            int r1 = r1 + 1
            goto L101
        L125:
            androidx.constraintlayout.core.motion.MotionConstrainedPoint r1 = r0.mStartPoint
            int r1 = r1.mVisibilityMode
            if (r1 != 0) goto L151
            int r1 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r1 > 0) goto L137
            androidx.constraintlayout.core.motion.MotionConstrainedPoint r1 = r0.mStartPoint
            int r1 = r1.visibility
            r8.setVisibility(r1)
            goto L151
        L137:
            int r1 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r1 < 0) goto L143
            androidx.constraintlayout.core.motion.MotionConstrainedPoint r1 = r0.mEndPoint
            int r1 = r1.visibility
            r8.setVisibility(r1)
            goto L151
        L143:
            androidx.constraintlayout.core.motion.MotionConstrainedPoint r1 = r0.mEndPoint
            int r1 = r1.visibility
            androidx.constraintlayout.core.motion.MotionConstrainedPoint r2 = r0.mStartPoint
            int r2 = r2.visibility
            if (r1 == r2) goto L151
            r1 = 4
            r8.setVisibility(r1)
        L151:
            androidx.constraintlayout.core.motion.key.MotionKeyTrigger[] r1 = r0.mKeyTriggers
            if (r1 == 0) goto L1ac
            r1 = 0
        L156:
            androidx.constraintlayout.core.motion.key.MotionKeyTrigger[] r2 = r0.mKeyTriggers
            int r3 = r2.length
            if (r1 >= r3) goto L1ac
            r2 = r2[r1]
            r2.conditionallyFire(r12, r8)
            int r1 = r1 + 1
            goto L156
        L163:
            androidx.constraintlayout.core.motion.MotionPaths r1 = r0.mStartMotionPath
            float r1 = r1.f18x
            androidx.constraintlayout.core.motion.MotionPaths r2 = r0.mEndMotionPath
            float r2 = r2.f18x
            androidx.constraintlayout.core.motion.MotionPaths r3 = r0.mStartMotionPath
            float r3 = r3.f18x
            float r2 = r2 - r3
            float r2 = r2 * r12
            float r1 = r1 + r2
            androidx.constraintlayout.core.motion.MotionPaths r2 = r0.mStartMotionPath
            float r2 = r2.f19y
            androidx.constraintlayout.core.motion.MotionPaths r3 = r0.mEndMotionPath
            float r3 = r3.f19y
            androidx.constraintlayout.core.motion.MotionPaths r4 = r0.mStartMotionPath
            float r4 = r4.f19y
            float r3 = r3 - r4
            float r3 = r3 * r12
            float r2 = r2 + r3
            androidx.constraintlayout.core.motion.MotionPaths r3 = r0.mStartMotionPath
            float r3 = r3.width
            androidx.constraintlayout.core.motion.MotionPaths r4 = r0.mEndMotionPath
            float r4 = r4.width
            androidx.constraintlayout.core.motion.MotionPaths r5 = r0.mStartMotionPath
            float r5 = r5.width
            float r4 = r4 - r5
            float r4 = r4 * r12
            float r3 = r3 + r4
            androidx.constraintlayout.core.motion.MotionPaths r4 = r0.mStartMotionPath
            float r4 = r4.height
            androidx.constraintlayout.core.motion.MotionPaths r5 = r0.mEndMotionPath
            float r5 = r5.height
            androidx.constraintlayout.core.motion.MotionPaths r6 = r0.mStartMotionPath
            float r6 = r6.height
            float r5 = r5 - r6
            float r5 = r5 * r12
            float r4 = r4 + r5
            r5 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r5
            int r6 = (int) r1
            float r2 = r2 + r5
            int r5 = (int) r2
            float r1 = r1 + r3
            int r1 = (int) r1
            float r2 = r2 + r4
            int r2 = (int) r2
            r8.layout(r6, r5, r1, r2)
        L1ac:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.KeyCycleOscillator> r1 = r0.mCycleMap
            if (r1 == 0) goto L1de
            java.util.Collection r1 = r1.values()
            java.util.Iterator r9 = r1.iterator()
        L1b8:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L1de
            java.lang.Object r1 = r9.next()
            androidx.constraintlayout.core.motion.utils.KeyCycleOscillator r1 = (androidx.constraintlayout.core.motion.utils.KeyCycleOscillator) r1
            boolean r2 = r1 instanceof androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.PathRotateSet
            if (r2 == 0) goto L1d9
            androidx.constraintlayout.core.motion.utils.KeyCycleOscillator$PathRotateSet r1 = (androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.PathRotateSet) r1
            double[] r2 = r0.mInterpolateVelocity
            r3 = 0
            r4 = r2[r3]
            r10 = 1
            r6 = r2[r10]
            r2 = r18
            r3 = r12
            r1.setPathRotate(r2, r3, r4, r6)
            goto L1b8
        L1d9:
            r10 = 1
            r1.setProperty(r8, r12)
            goto L1b8
        L1de:
            r1 = 0
            return r1
    }

    java.lang.String name() {
            r1 = this;
            androidx.constraintlayout.core.motion.MotionWidget r0 = r1.mView
            java.lang.String r0 = r0.getName()
            return r0
    }

    void positionKeyframe(androidx.constraintlayout.core.motion.MotionWidget r9, androidx.constraintlayout.core.motion.key.MotionKeyPosition r10, float r11, float r12, java.lang.String[] r13, float[] r14) {
            r8 = this;
            androidx.constraintlayout.core.motion.utils.FloatRect r2 = new androidx.constraintlayout.core.motion.utils.FloatRect
            r2.<init>()
            androidx.constraintlayout.core.motion.MotionPaths r0 = r8.mStartMotionPath
            float r0 = r0.f18x
            r2.left = r0
            androidx.constraintlayout.core.motion.MotionPaths r0 = r8.mStartMotionPath
            float r0 = r0.f19y
            r2.top = r0
            float r0 = r2.left
            androidx.constraintlayout.core.motion.MotionPaths r1 = r8.mStartMotionPath
            float r1 = r1.width
            float r0 = r0 + r1
            r2.right = r0
            float r0 = r2.top
            androidx.constraintlayout.core.motion.MotionPaths r1 = r8.mStartMotionPath
            float r1 = r1.height
            float r0 = r0 + r1
            r2.bottom = r0
            androidx.constraintlayout.core.motion.utils.FloatRect r3 = new androidx.constraintlayout.core.motion.utils.FloatRect
            r3.<init>()
            androidx.constraintlayout.core.motion.MotionPaths r0 = r8.mEndMotionPath
            float r0 = r0.f18x
            r3.left = r0
            androidx.constraintlayout.core.motion.MotionPaths r0 = r8.mEndMotionPath
            float r0 = r0.f19y
            r3.top = r0
            float r0 = r3.left
            androidx.constraintlayout.core.motion.MotionPaths r1 = r8.mEndMotionPath
            float r1 = r1.width
            float r0 = r0 + r1
            r3.right = r0
            float r0 = r3.top
            androidx.constraintlayout.core.motion.MotionPaths r1 = r8.mEndMotionPath
            float r1 = r1.height
            float r0 = r0 + r1
            r3.bottom = r0
            r0 = r10
            r1 = r9
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r0.positionAttributes(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    void rotate(androidx.constraintlayout.core.motion.utils.Rect r3, androidx.constraintlayout.core.motion.utils.Rect r4, int r5, int r6, int r7) {
            r2 = this;
            r0 = 1
            r1 = 2
            if (r5 == r0) goto L9d
            if (r5 == r1) goto L6f
            r0 = 3
            if (r5 == r0) goto L3d
            r7 = 4
            if (r5 == r7) goto Le
            goto Lca
        Le:
            int r5 = r3.left
            int r7 = r3.right
            int r5 = r5 + r7
            int r7 = r3.bottom
            int r0 = r3.top
            int r7 = r7 + r0
            int r0 = r3.width()
            int r7 = r7 + r0
            int r7 = r7 / r1
            int r6 = r6 - r7
            r4.left = r6
            int r6 = r3.height()
            int r5 = r5 - r6
            int r5 = r5 / r1
            r4.top = r5
            int r5 = r4.left
            int r6 = r3.width()
            int r5 = r5 + r6
            r4.right = r5
            int r5 = r4.top
            int r3 = r3.height()
            int r5 = r5 + r3
            r4.bottom = r5
            goto Lca
        L3d:
            int r5 = r3.left
            int r6 = r3.right
            int r5 = r5 + r6
            int r6 = r3.top
            int r6 = r3.bottom
            int r6 = r3.height()
            int r6 = r6 / r1
            int r0 = r3.top
            int r6 = r6 + r0
            int r0 = r5 / 2
            int r6 = r6 - r0
            r4.left = r6
            int r6 = r3.height()
            int r5 = r5 + r6
            int r5 = r5 / r1
            int r7 = r7 - r5
            r4.top = r7
            int r5 = r4.left
            int r6 = r3.width()
            int r5 = r5 + r6
            r4.right = r5
            int r5 = r4.top
            int r3 = r3.height()
            int r5 = r5 + r3
            r4.bottom = r5
            goto Lca
        L6f:
            int r5 = r3.left
            int r7 = r3.right
            int r5 = r5 + r7
            int r7 = r3.top
            int r0 = r3.bottom
            int r7 = r7 + r0
            int r0 = r3.width()
            int r7 = r7 + r0
            int r7 = r7 / r1
            int r6 = r6 - r7
            r4.left = r6
            int r6 = r3.height()
            int r5 = r5 - r6
            int r5 = r5 / r1
            r4.top = r5
            int r5 = r4.left
            int r6 = r3.width()
            int r5 = r5 + r6
            r4.right = r5
            int r5 = r4.top
            int r3 = r3.height()
            int r5 = r5 + r3
            r4.bottom = r5
            goto Lca
        L9d:
            int r5 = r3.left
            int r6 = r3.right
            int r5 = r5 + r6
            int r6 = r3.top
            int r0 = r3.bottom
            int r6 = r6 + r0
            int r0 = r3.width()
            int r6 = r6 - r0
            int r6 = r6 / r1
            r4.left = r6
            int r6 = r3.height()
            int r5 = r5 + r6
            int r5 = r5 / r1
            int r7 = r7 - r5
            r4.top = r7
            int r5 = r4.left
            int r6 = r3.width()
            int r5 = r5 + r6
            r4.right = r5
            int r5 = r4.top
            int r3 = r3.height()
            int r5 = r5 + r3
            r4.bottom = r5
        Lca:
            return
    }

    void setBothStates(androidx.constraintlayout.core.motion.MotionWidget r6) {
            r5 = this;
            androidx.constraintlayout.core.motion.MotionPaths r0 = r5.mStartMotionPath
            r1 = 0
            r0.time = r1
            androidx.constraintlayout.core.motion.MotionPaths r0 = r5.mStartMotionPath
            r0.position = r1
            r0 = 1
            r5.mNoMovement = r0
            androidx.constraintlayout.core.motion.MotionPaths r0 = r5.mStartMotionPath
            int r1 = r6.getX()
            float r1 = (float) r1
            int r2 = r6.getY()
            float r2 = (float) r2
            int r3 = r6.getWidth()
            float r3 = (float) r3
            int r4 = r6.getHeight()
            float r4 = (float) r4
            r0.setBounds(r1, r2, r3, r4)
            androidx.constraintlayout.core.motion.MotionPaths r0 = r5.mEndMotionPath
            int r1 = r6.getX()
            float r1 = (float) r1
            int r2 = r6.getY()
            float r2 = (float) r2
            int r3 = r6.getWidth()
            float r3 = (float) r3
            int r4 = r6.getHeight()
            float r4 = (float) r4
            r0.setBounds(r1, r2, r3, r4)
            androidx.constraintlayout.core.motion.MotionConstrainedPoint r0 = r5.mStartPoint
            r0.setState(r6)
            androidx.constraintlayout.core.motion.MotionConstrainedPoint r0 = r5.mEndPoint
            r0.setState(r6)
            return
    }

    public void setDrawPath(int r2) {
            r1 = this;
            androidx.constraintlayout.core.motion.MotionPaths r0 = r1.mStartMotionPath
            r0.mDrawPath = r2
            return
    }

    public void setEnd(androidx.constraintlayout.core.motion.MotionWidget r6) {
            r5 = this;
            androidx.constraintlayout.core.motion.MotionPaths r0 = r5.mEndMotionPath
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.time = r1
            androidx.constraintlayout.core.motion.MotionPaths r0 = r5.mEndMotionPath
            r0.position = r1
            androidx.constraintlayout.core.motion.MotionPaths r0 = r5.mEndMotionPath
            r5.readView(r0)
            androidx.constraintlayout.core.motion.MotionPaths r0 = r5.mEndMotionPath
            int r1 = r6.getLeft()
            float r1 = (float) r1
            int r2 = r6.getTop()
            float r2 = (float) r2
            int r3 = r6.getWidth()
            float r3 = (float) r3
            int r4 = r6.getHeight()
            float r4 = (float) r4
            r0.setBounds(r1, r2, r3, r4)
            androidx.constraintlayout.core.motion.MotionPaths r0 = r5.mEndMotionPath
            r0.applyParameters(r6)
            androidx.constraintlayout.core.motion.MotionConstrainedPoint r0 = r5.mEndPoint
            r0.setState(r6)
            return
    }

    public void setPathMotionArc(int r1) {
            r0 = this;
            r0.mPathMotionArc = r1
            return
    }

    public void setStart(androidx.constraintlayout.core.motion.MotionWidget r6) {
            r5 = this;
            androidx.constraintlayout.core.motion.MotionPaths r0 = r5.mStartMotionPath
            r1 = 0
            r0.time = r1
            androidx.constraintlayout.core.motion.MotionPaths r0 = r5.mStartMotionPath
            r0.position = r1
            androidx.constraintlayout.core.motion.MotionPaths r0 = r5.mStartMotionPath
            int r1 = r6.getX()
            float r1 = (float) r1
            int r2 = r6.getY()
            float r2 = (float) r2
            int r3 = r6.getWidth()
            float r3 = (float) r3
            int r4 = r6.getHeight()
            float r4 = (float) r4
            r0.setBounds(r1, r2, r3, r4)
            androidx.constraintlayout.core.motion.MotionPaths r0 = r5.mStartMotionPath
            r0.applyParameters(r6)
            androidx.constraintlayout.core.motion.MotionConstrainedPoint r0 = r5.mStartPoint
            r0.setState(r6)
            return
    }

    public void setStartState(androidx.constraintlayout.core.motion.utils.ViewState r5, androidx.constraintlayout.core.motion.MotionWidget r6, int r7, int r8, int r9) {
            r4 = this;
            androidx.constraintlayout.core.motion.MotionPaths r0 = r4.mStartMotionPath
            r1 = 0
            r0.time = r1
            androidx.constraintlayout.core.motion.MotionPaths r0 = r4.mStartMotionPath
            r0.position = r1
            androidx.constraintlayout.core.motion.utils.Rect r0 = new androidx.constraintlayout.core.motion.utils.Rect
            r0.<init>()
            r1 = 1
            r2 = 2
            if (r7 == r1) goto L43
            if (r7 == r2) goto L15
            goto L70
        L15:
            int r8 = r5.left
            int r1 = r5.right
            int r8 = r8 + r1
            int r1 = r5.top
            int r3 = r5.bottom
            int r1 = r1 + r3
            int r3 = r5.width()
            int r1 = r1 + r3
            int r1 = r1 / r2
            int r9 = r9 - r1
            r0.left = r9
            int r9 = r5.height()
            int r8 = r8 - r9
            int r8 = r8 / r2
            r0.top = r8
            int r8 = r0.left
            int r9 = r5.width()
            int r8 = r8 + r9
            r0.right = r8
            int r8 = r0.top
            int r9 = r5.height()
            int r8 = r8 + r9
            r0.bottom = r8
            goto L70
        L43:
            int r9 = r5.left
            int r1 = r5.right
            int r9 = r9 + r1
            int r1 = r5.top
            int r3 = r5.bottom
            int r1 = r1 + r3
            int r3 = r5.width()
            int r1 = r1 - r3
            int r1 = r1 / r2
            r0.left = r1
            int r1 = r5.height()
            int r9 = r9 + r1
            int r9 = r9 / r2
            int r8 = r8 - r9
            r0.top = r8
            int r8 = r0.left
            int r9 = r5.width()
            int r8 = r8 + r9
            r0.right = r8
            int r8 = r0.top
            int r9 = r5.height()
            int r8 = r8 + r9
            r0.bottom = r8
        L70:
            androidx.constraintlayout.core.motion.MotionPaths r8 = r4.mStartMotionPath
            int r9 = r0.left
            float r9 = (float) r9
            int r1 = r0.top
            float r1 = (float) r1
            int r2 = r0.width()
            float r2 = (float) r2
            int r3 = r0.height()
            float r3 = (float) r3
            r8.setBounds(r9, r1, r2, r3)
            androidx.constraintlayout.core.motion.MotionConstrainedPoint r8 = r4.mStartPoint
            float r5 = r5.rotation
            r8.setState(r0, r6, r7, r5)
            return
    }

    public void setTransformPivotTarget(int r1) {
            r0 = this;
            r0.mTransformPivotTarget = r1
            r1 = 0
            r0.mTransformPivotView = r1
            return
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int r1, float r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int r3, int r4) {
            r2 = this;
            r0 = 509(0x1fd, float:7.13E-43)
            r1 = 1
            if (r3 == r0) goto Lc
            r4 = 704(0x2c0, float:9.87E-43)
            if (r3 == r4) goto Lb
            r3 = 0
            return r3
        Lb:
            return r1
        Lc:
            r2.setPathMotionArc(r4)
            return r1
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int r4, java.lang.String r5) {
            r3 = this;
            r0 = 705(0x2c1, float:9.88E-43)
            r1 = 0
            if (r0 != r4) goto L20
            java.io.PrintStream r4 = java.lang.System.out
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "TYPE_INTERPOLATOR  "
            r0.<init>(r2)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r0 = r0.toString()
            r4.println(r0)
            r4 = -1
            androidx.constraintlayout.core.motion.utils.DifferentialInterpolator r4 = getInterpolator(r4, r5, r1)
            r3.mQuantizeMotionInterpolator = r4
        L20:
            return r1
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int r1, boolean r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    public void setView(androidx.constraintlayout.core.motion.MotionWidget r1) {
            r0 = this;
            r0.mView = r1
            return
    }

    public void setup(int r20, int r21, float r22, long r23) {
            r19 = this;
            r0 = r19
            r1 = r23
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            int r7 = r0.mPathMotionArc
            r8 = -1
            if (r7 == r8) goto L26
            androidx.constraintlayout.core.motion.MotionPaths r9 = r0.mStartMotionPath
            r9.mPathMotionArc = r7
        L26:
            androidx.constraintlayout.core.motion.MotionConstrainedPoint r7 = r0.mStartPoint
            androidx.constraintlayout.core.motion.MotionConstrainedPoint r9 = r0.mEndPoint
            r7.different(r9, r4)
            java.util.ArrayList<androidx.constraintlayout.core.motion.key.MotionKey> r7 = r0.mKeyList
            if (r7 == 0) goto L90
            java.util.Iterator r7 = r7.iterator()
            r10 = 0
        L36:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto L91
            java.lang.Object r11 = r7.next()
            androidx.constraintlayout.core.motion.key.MotionKey r11 = (androidx.constraintlayout.core.motion.key.MotionKey) r11
            boolean r12 = r11 instanceof androidx.constraintlayout.core.motion.key.MotionKeyPosition
            if (r12 == 0) goto L68
            androidx.constraintlayout.core.motion.key.MotionKeyPosition r11 = (androidx.constraintlayout.core.motion.key.MotionKeyPosition) r11
            androidx.constraintlayout.core.motion.MotionPaths r12 = new androidx.constraintlayout.core.motion.MotionPaths
            androidx.constraintlayout.core.motion.MotionPaths r15 = r0.mStartMotionPath
            androidx.constraintlayout.core.motion.MotionPaths r14 = r0.mEndMotionPath
            r13 = r12
            r18 = r14
            r14 = r20
            r17 = r15
            r15 = r21
            r16 = r11
            r13.<init>(r14, r15, r16, r17, r18)
            r0.insertKey(r12)
            int r12 = r11.mCurveFit
            if (r12 == r8) goto L36
            int r11 = r11.mCurveFit
            r0.mCurveFitType = r11
            goto L36
        L68:
            boolean r12 = r11 instanceof androidx.constraintlayout.core.motion.key.MotionKeyCycle
            if (r12 == 0) goto L70
            r11.getAttributeNames(r5)
            goto L36
        L70:
            boolean r12 = r11 instanceof androidx.constraintlayout.core.motion.key.MotionKeyTimeCycle
            if (r12 == 0) goto L78
            r11.getAttributeNames(r3)
            goto L36
        L78:
            boolean r12 = r11 instanceof androidx.constraintlayout.core.motion.key.MotionKeyTrigger
            if (r12 == 0) goto L89
            if (r10 != 0) goto L83
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        L83:
            androidx.constraintlayout.core.motion.key.MotionKeyTrigger r11 = (androidx.constraintlayout.core.motion.key.MotionKeyTrigger) r11
            r10.add(r11)
            goto L36
        L89:
            r11.setInterpolation(r6)
            r11.getAttributeNames(r4)
            goto L36
        L90:
            r10 = 0
        L91:
            r7 = 0
            if (r10 == 0) goto L9e
            androidx.constraintlayout.core.motion.key.MotionKeyTrigger[] r11 = new androidx.constraintlayout.core.motion.key.MotionKeyTrigger[r7]
            java.lang.Object[] r10 = r10.toArray(r11)
            androidx.constraintlayout.core.motion.key.MotionKeyTrigger[] r10 = (androidx.constraintlayout.core.motion.key.MotionKeyTrigger[]) r10
            r0.mKeyTriggers = r10
        L9e:
            boolean r10 = r4.isEmpty()
            java.lang.String r11 = ","
            java.lang.String r12 = "CUSTOM,"
            r13 = 1
            if (r10 != 0) goto L17b
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            r0.mAttributesMap = r10
            java.util.Iterator r10 = r4.iterator()
        Lb4:
            boolean r14 = r10.hasNext()
            if (r14 == 0) goto L114
            java.lang.Object r14 = r10.next()
            java.lang.String r14 = (java.lang.String) r14
            boolean r15 = r14.startsWith(r12)
            if (r15 == 0) goto L101
            androidx.constraintlayout.core.motion.utils.KeyFrameArray$CustomVar r15 = new androidx.constraintlayout.core.motion.utils.KeyFrameArray$CustomVar
            r15.<init>()
            java.lang.String[] r16 = r14.split(r11)
            r9 = r16[r13]
            java.util.ArrayList<androidx.constraintlayout.core.motion.key.MotionKey> r8 = r0.mKeyList
            java.util.Iterator r8 = r8.iterator()
        Ld7:
            boolean r17 = r8.hasNext()
            if (r17 == 0) goto Lfc
            java.lang.Object r17 = r8.next()
            r13 = r17
            androidx.constraintlayout.core.motion.key.MotionKey r13 = (androidx.constraintlayout.core.motion.key.MotionKey) r13
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r7 = r13.mCustom
            if (r7 != 0) goto Lec
        Le9:
            r7 = 0
            r13 = 1
            goto Ld7
        Lec:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r7 = r13.mCustom
            java.lang.Object r7 = r7.get(r9)
            androidx.constraintlayout.core.motion.CustomVariable r7 = (androidx.constraintlayout.core.motion.CustomVariable) r7
            if (r7 == 0) goto Le9
            int r13 = r13.mFramePosition
            r15.append(r13, r7)
            goto Le9
        Lfc:
            androidx.constraintlayout.core.motion.utils.SplineSet r7 = androidx.constraintlayout.core.motion.utils.SplineSet.makeCustomSplineSet(r14, r15)
            goto L105
        L101:
            androidx.constraintlayout.core.motion.utils.SplineSet r7 = androidx.constraintlayout.core.motion.utils.SplineSet.makeSpline(r14, r1)
        L105:
            if (r7 != 0) goto L108
            goto L110
        L108:
            r7.setType(r14)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> r8 = r0.mAttributesMap
            r8.put(r14, r7)
        L110:
            r7 = 0
            r8 = -1
            r13 = 1
            goto Lb4
        L114:
            java.util.ArrayList<androidx.constraintlayout.core.motion.key.MotionKey> r7 = r0.mKeyList
            if (r7 == 0) goto L132
            java.util.Iterator r7 = r7.iterator()
        L11c:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L132
            java.lang.Object r8 = r7.next()
            androidx.constraintlayout.core.motion.key.MotionKey r8 = (androidx.constraintlayout.core.motion.key.MotionKey) r8
            boolean r9 = r8 instanceof androidx.constraintlayout.core.motion.key.MotionKeyAttributes
            if (r9 == 0) goto L11c
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> r9 = r0.mAttributesMap
            r8.addValues(r9)
            goto L11c
        L132:
            androidx.constraintlayout.core.motion.MotionConstrainedPoint r7 = r0.mStartPoint
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> r8 = r0.mAttributesMap
            r9 = 0
            r7.addValues(r8, r9)
            androidx.constraintlayout.core.motion.MotionConstrainedPoint r7 = r0.mEndPoint
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> r8 = r0.mAttributesMap
            r9 = 100
            r7.addValues(r8, r9)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> r7 = r0.mAttributesMap
            java.util.Set r7 = r7.keySet()
            java.util.Iterator r7 = r7.iterator()
        L14d:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L17b
            java.lang.Object r8 = r7.next()
            java.lang.String r8 = (java.lang.String) r8
            boolean r9 = r6.containsKey(r8)
            if (r9 == 0) goto L16c
            java.lang.Object r9 = r6.get(r8)
            java.lang.Integer r9 = (java.lang.Integer) r9
            if (r9 == 0) goto L16c
            int r9 = r9.intValue()
            goto L16d
        L16c:
            r9 = 0
        L16d:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> r10 = r0.mAttributesMap
            java.lang.Object r8 = r10.get(r8)
            androidx.constraintlayout.core.motion.utils.SplineSet r8 = (androidx.constraintlayout.core.motion.utils.SplineSet) r8
            if (r8 == 0) goto L14d
            r8.setup(r9)
            goto L14d
        L17b:
            boolean r7 = r3.isEmpty()
            if (r7 != 0) goto L242
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet> r7 = r0.mTimeCycleAttributesMap
            if (r7 != 0) goto L18c
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            r0.mTimeCycleAttributesMap = r7
        L18c:
            java.util.Iterator r3 = r3.iterator()
        L190:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L1ee
            java.lang.Object r7 = r3.next()
            java.lang.String r7 = (java.lang.String) r7
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet> r8 = r0.mTimeCycleAttributesMap
            boolean r8 = r8.containsKey(r7)
            if (r8 == 0) goto L1a5
            goto L190
        L1a5:
            boolean r8 = r7.startsWith(r12)
            if (r8 == 0) goto L1e3
            androidx.constraintlayout.core.motion.utils.KeyFrameArray$CustomVar r8 = new androidx.constraintlayout.core.motion.utils.KeyFrameArray$CustomVar
            r8.<init>()
            java.lang.String[] r9 = r7.split(r11)
            r10 = 1
            r9 = r9[r10]
            java.util.ArrayList<androidx.constraintlayout.core.motion.key.MotionKey> r10 = r0.mKeyList
            java.util.Iterator r10 = r10.iterator()
        L1bd:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto L1de
            java.lang.Object r13 = r10.next()
            androidx.constraintlayout.core.motion.key.MotionKey r13 = (androidx.constraintlayout.core.motion.key.MotionKey) r13
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r14 = r13.mCustom
            if (r14 != 0) goto L1ce
            goto L1bd
        L1ce:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r14 = r13.mCustom
            java.lang.Object r14 = r14.get(r9)
            androidx.constraintlayout.core.motion.CustomVariable r14 = (androidx.constraintlayout.core.motion.CustomVariable) r14
            if (r14 == 0) goto L1bd
            int r13 = r13.mFramePosition
            r8.append(r13, r14)
            goto L1bd
        L1de:
            androidx.constraintlayout.core.motion.utils.SplineSet r8 = androidx.constraintlayout.core.motion.utils.SplineSet.makeCustomSplineSet(r7, r8)
            goto L1e7
        L1e3:
            androidx.constraintlayout.core.motion.utils.SplineSet r8 = androidx.constraintlayout.core.motion.utils.SplineSet.makeSpline(r7, r1)
        L1e7:
            if (r8 != 0) goto L1ea
            goto L190
        L1ea:
            r8.setType(r7)
            goto L190
        L1ee:
            java.util.ArrayList<androidx.constraintlayout.core.motion.key.MotionKey> r1 = r0.mKeyList
            if (r1 == 0) goto L20e
            java.util.Iterator r1 = r1.iterator()
        L1f6:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L20e
            java.lang.Object r2 = r1.next()
            androidx.constraintlayout.core.motion.key.MotionKey r2 = (androidx.constraintlayout.core.motion.key.MotionKey) r2
            boolean r3 = r2 instanceof androidx.constraintlayout.core.motion.key.MotionKeyTimeCycle
            if (r3 == 0) goto L1f6
            androidx.constraintlayout.core.motion.key.MotionKeyTimeCycle r2 = (androidx.constraintlayout.core.motion.key.MotionKeyTimeCycle) r2
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet> r3 = r0.mTimeCycleAttributesMap
            r2.addTimeValues(r3)
            goto L1f6
        L20e:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet> r1 = r0.mTimeCycleAttributesMap
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L218:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L242
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = r6.containsKey(r2)
            if (r3 == 0) goto L235
            java.lang.Object r3 = r6.get(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L236
        L235:
            r3 = 0
        L236:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet> r7 = r0.mTimeCycleAttributesMap
            java.lang.Object r2 = r7.get(r2)
            androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet r2 = (androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet) r2
            r2.setup(r3)
            goto L218
        L242:
            java.util.ArrayList<androidx.constraintlayout.core.motion.MotionPaths> r1 = r0.mMotionPaths
            int r1 = r1.size()
            r2 = 2
            int r1 = r1 + r2
            androidx.constraintlayout.core.motion.MotionPaths[] r3 = new androidx.constraintlayout.core.motion.MotionPaths[r1]
            androidx.constraintlayout.core.motion.MotionPaths r6 = r0.mStartMotionPath
            r7 = 0
            r3[r7] = r6
            int r6 = r1 + (-1)
            androidx.constraintlayout.core.motion.MotionPaths r8 = r0.mEndMotionPath
            r3[r6] = r8
            java.util.ArrayList<androidx.constraintlayout.core.motion.MotionPaths> r6 = r0.mMotionPaths
            int r6 = r6.size()
            if (r6 <= 0) goto L267
            int r6 = r0.mCurveFitType
            int r8 = androidx.constraintlayout.core.motion.key.MotionKey.UNSET
            if (r6 != r8) goto L267
            r0.mCurveFitType = r7
        L267:
            java.util.ArrayList<androidx.constraintlayout.core.motion.MotionPaths> r6 = r0.mMotionPaths
            java.util.Iterator r6 = r6.iterator()
            r7 = 1
        L26e:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L280
            java.lang.Object r8 = r6.next()
            androidx.constraintlayout.core.motion.MotionPaths r8 = (androidx.constraintlayout.core.motion.MotionPaths) r8
            int r9 = r7 + 1
            r3[r7] = r8
            r7 = r9
            goto L26e
        L280:
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            androidx.constraintlayout.core.motion.MotionPaths r7 = r0.mEndMotionPath
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r7 = r7.customAttributes
            java.util.Set r7 = r7.keySet()
            java.util.Iterator r7 = r7.iterator()
        L291:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L2be
            java.lang.Object r8 = r7.next()
            java.lang.String r8 = (java.lang.String) r8
            androidx.constraintlayout.core.motion.MotionPaths r9 = r0.mStartMotionPath
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r9 = r9.customAttributes
            boolean r9 = r9.containsKey(r8)
            if (r9 == 0) goto L291
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r12)
            java.lang.StringBuilder r9 = r9.append(r8)
            java.lang.String r9 = r9.toString()
            boolean r9 = r4.contains(r9)
            if (r9 != 0) goto L291
            r6.add(r8)
            goto L291
        L2be:
            r8 = 0
            java.lang.String[] r4 = new java.lang.String[r8]
            java.lang.Object[] r4 = r6.toArray(r4)
            java.lang.String[] r4 = (java.lang.String[]) r4
            r0.mAttributeNames = r4
            int r4 = r4.length
            int[] r4 = new int[r4]
            r0.mAttributeInterpolatorCount = r4
            r4 = 0
        L2cf:
            java.lang.String[] r6 = r0.mAttributeNames
            int r7 = r6.length
            if (r4 >= r7) goto L306
            r6 = r6[r4]
            int[] r7 = r0.mAttributeInterpolatorCount
            r8 = 0
            r7[r4] = r8
            r7 = 0
        L2dc:
            if (r7 >= r1) goto L303
            r8 = r3[r7]
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r8 = r8.customAttributes
            boolean r8 = r8.containsKey(r6)
            if (r8 == 0) goto L300
            r8 = r3[r7]
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r8 = r8.customAttributes
            java.lang.Object r8 = r8.get(r6)
            androidx.constraintlayout.core.motion.CustomVariable r8 = (androidx.constraintlayout.core.motion.CustomVariable) r8
            if (r8 == 0) goto L300
            int[] r6 = r0.mAttributeInterpolatorCount
            r7 = r6[r4]
            int r8 = r8.numberOfInterpolatedValues()
            int r7 = r7 + r8
            r6[r4] = r7
            goto L303
        L300:
            int r7 = r7 + 1
            goto L2dc
        L303:
            int r4 = r4 + 1
            goto L2cf
        L306:
            r4 = 0
            r6 = r3[r4]
            int r4 = r6.mPathMotionArc
            r6 = -1
            if (r4 == r6) goto L310
            r4 = 1
            goto L311
        L310:
            r4 = 0
        L311:
            java.lang.String[] r6 = r0.mAttributeNames
            int r6 = r6.length
            r7 = 18
            int r7 = r7 + r6
            boolean[] r6 = new boolean[r7]
            r8 = 1
        L31a:
            if (r8 >= r1) goto L32a
            r9 = r3[r8]
            int r10 = r8 + (-1)
            r10 = r3[r10]
            java.lang.String[] r11 = r0.mAttributeNames
            r9.different(r10, r6, r11, r4)
            int r8 = r8 + 1
            goto L31a
        L32a:
            r4 = 1
            r8 = 0
        L32c:
            if (r4 >= r7) goto L337
            boolean r9 = r6[r4]
            if (r9 == 0) goto L334
            int r8 = r8 + 1
        L334:
            int r4 = r4 + 1
            goto L32c
        L337:
            int[] r4 = new int[r8]
            r0.mInterpolateVariables = r4
            int r4 = java.lang.Math.max(r2, r8)
            double[] r8 = new double[r4]
            r0.mInterpolateData = r8
            double[] r4 = new double[r4]
            r0.mInterpolateVelocity = r4
            r4 = 1
            r8 = 0
        L349:
            if (r4 >= r7) goto L359
            boolean r9 = r6[r4]
            if (r9 == 0) goto L356
            int[] r9 = r0.mInterpolateVariables
            int r10 = r8 + 1
            r9[r8] = r4
            r8 = r10
        L356:
            int r4 = r4 + 1
            goto L349
        L359:
            int[] r4 = r0.mInterpolateVariables
            int r4 = r4.length
            int[] r6 = new int[r2]
            r7 = 1
            r6[r7] = r4
            r4 = 0
            r6[r4] = r1
            java.lang.Class r4 = java.lang.Double.TYPE
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r6)
            double[][] r4 = (double[][]) r4
            double[] r6 = new double[r1]
            r7 = 0
        L36f:
            if (r7 >= r1) goto L384
            r8 = r3[r7]
            r9 = r4[r7]
            int[] r10 = r0.mInterpolateVariables
            r8.fillStandard(r9, r10)
            r8 = r3[r7]
            float r8 = r8.time
            double r8 = (double) r8
            r6[r7] = r8
            int r7 = r7 + 1
            goto L36f
        L384:
            r7 = 0
        L385:
            int[] r8 = r0.mInterpolateVariables
            int r9 = r8.length
            if (r7 >= r9) goto L3cb
            r8 = r8[r7]
            java.lang.String[] r9 = androidx.constraintlayout.core.motion.MotionPaths.names
            int r9 = r9.length
            if (r8 >= r9) goto L3c8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String[] r9 = androidx.constraintlayout.core.motion.MotionPaths.names
            int[] r10 = r0.mInterpolateVariables
            r10 = r10[r7]
            r9 = r9[r10]
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r9 = " ["
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            r9 = r8
            r8 = 0
        L3ae:
            if (r8 >= r1) goto L3c8
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.StringBuilder r9 = r10.append(r9)
            r10 = r4[r8]
            r11 = r10[r7]
            java.lang.StringBuilder r9 = r9.append(r11)
            java.lang.String r9 = r9.toString()
            int r8 = r8 + 1
            goto L3ae
        L3c8:
            int r7 = r7 + 1
            goto L385
        L3cb:
            java.lang.String[] r7 = r0.mAttributeNames
            int r7 = r7.length
            r8 = 1
            int r7 = r7 + r8
            androidx.constraintlayout.core.motion.utils.CurveFit[] r7 = new androidx.constraintlayout.core.motion.utils.CurveFit[r7]
            r0.mSpline = r7
            r7 = 0
        L3d5:
            java.lang.String[] r8 = r0.mAttributeNames
            int r9 = r8.length
            if (r7 >= r9) goto L434
            r9 = 0
            r10 = r9
            double[][] r10 = (double[][]) r10
            r8 = r8[r7]
            r12 = r9
            r13 = r12
            r10 = 0
            r11 = 0
        L3e4:
            if (r10 >= r1) goto L41d
            r14 = r3[r10]
            boolean r14 = r14.hasCustomData(r8)
            if (r14 == 0) goto L419
            if (r13 != 0) goto L408
            double[] r12 = new double[r1]
            r13 = r3[r10]
            int r13 = r13.getCustomDataCount(r8)
            int[] r14 = new int[r2]
            r15 = 1
            r14[r15] = r13
            r13 = 0
            r14[r13] = r1
            java.lang.Class r13 = java.lang.Double.TYPE
            java.lang.Object r13 = java.lang.reflect.Array.newInstance(r13, r14)
            double[][] r13 = (double[][]) r13
        L408:
            r14 = r3[r10]
            float r14 = r14.time
            double r14 = (double) r14
            r12[r11] = r14
            r14 = r3[r10]
            r15 = r13[r11]
            r9 = 0
            r14.getCustomData(r8, r15, r9)
            int r11 = r11 + 1
        L419:
            int r10 = r10 + 1
            r9 = 0
            goto L3e4
        L41d:
            double[] r8 = java.util.Arrays.copyOf(r12, r11)
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r13, r11)
            double[][] r9 = (double[][]) r9
            androidx.constraintlayout.core.motion.utils.CurveFit[] r10 = r0.mSpline
            int r7 = r7 + 1
            int r11 = r0.mCurveFitType
            androidx.constraintlayout.core.motion.utils.CurveFit r8 = androidx.constraintlayout.core.motion.utils.CurveFit.get(r11, r8, r9)
            r10[r7] = r8
            goto L3d5
        L434:
            androidx.constraintlayout.core.motion.utils.CurveFit[] r7 = r0.mSpline
            int r8 = r0.mCurveFitType
            androidx.constraintlayout.core.motion.utils.CurveFit r4 = androidx.constraintlayout.core.motion.utils.CurveFit.get(r8, r6, r4)
            r6 = 0
            r7[r6] = r4
            r4 = r3[r6]
            int r4 = r4.mPathMotionArc
            r7 = -1
            if (r4 == r7) goto L486
            int[] r4 = new int[r1]
            double[] r7 = new double[r1]
            int[] r8 = new int[r2]
            r9 = 1
            r8[r9] = r2
            r8[r6] = r1
            java.lang.Class r2 = java.lang.Double.TYPE
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r2, r8)
            double[][] r2 = (double[][]) r2
            r9 = 0
        L45a:
            if (r9 >= r1) goto L480
            r6 = r3[r9]
            int r6 = r6.mPathMotionArc
            r4[r9] = r6
            r6 = r3[r9]
            float r6 = r6.time
            double r10 = (double) r6
            r7[r9] = r10
            r6 = r2[r9]
            r8 = r3[r9]
            float r8 = r8.f18x
            double r10 = (double) r8
            r8 = 0
            r6[r8] = r10
            r6 = r2[r9]
            r10 = r3[r9]
            float r10 = r10.f19y
            double r10 = (double) r10
            r12 = 1
            r6[r12] = r10
            int r9 = r9 + 1
            goto L45a
        L480:
            androidx.constraintlayout.core.motion.utils.CurveFit r1 = androidx.constraintlayout.core.motion.utils.CurveFit.getArc(r4, r7, r2)
            r0.mArcSpline = r1
        L486:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.mCycleMap = r1
            java.util.ArrayList<androidx.constraintlayout.core.motion.key.MotionKey> r1 = r0.mKeyList
            if (r1 == 0) goto L4fb
            java.util.Iterator r1 = r5.iterator()
            r2 = 2143289344(0x7fc00000, float:NaN)
        L497:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L4c3
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            androidx.constraintlayout.core.motion.utils.KeyCycleOscillator r4 = androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.makeWidgetCycle(r3)
            if (r4 != 0) goto L4aa
            goto L497
        L4aa:
            boolean r5 = r4.variesByPath()
            if (r5 == 0) goto L4ba
            boolean r5 = java.lang.Float.isNaN(r2)
            if (r5 == 0) goto L4ba
            float r2 = r19.getPreCycleDistance()
        L4ba:
            r4.setType(r3)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.KeyCycleOscillator> r5 = r0.mCycleMap
            r5.put(r3, r4)
            goto L497
        L4c3:
            java.util.ArrayList<androidx.constraintlayout.core.motion.key.MotionKey> r1 = r0.mKeyList
            java.util.Iterator r1 = r1.iterator()
        L4c9:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L4e1
            java.lang.Object r3 = r1.next()
            androidx.constraintlayout.core.motion.key.MotionKey r3 = (androidx.constraintlayout.core.motion.key.MotionKey) r3
            boolean r4 = r3 instanceof androidx.constraintlayout.core.motion.key.MotionKeyCycle
            if (r4 == 0) goto L4c9
            androidx.constraintlayout.core.motion.key.MotionKeyCycle r3 = (androidx.constraintlayout.core.motion.key.MotionKeyCycle) r3
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.KeyCycleOscillator> r4 = r0.mCycleMap
            r3.addCycleValues(r4)
            goto L4c9
        L4e1:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.KeyCycleOscillator> r1 = r0.mCycleMap
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L4eb:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L4fb
            java.lang.Object r3 = r1.next()
            androidx.constraintlayout.core.motion.utils.KeyCycleOscillator r3 = (androidx.constraintlayout.core.motion.utils.KeyCycleOscillator) r3
            r3.setup(r2)
            goto L4eb
        L4fb:
            return
    }

    public void setupRelative(androidx.constraintlayout.core.motion.Motion r3) {
            r2 = this;
            androidx.constraintlayout.core.motion.MotionPaths r0 = r2.mStartMotionPath
            androidx.constraintlayout.core.motion.MotionPaths r1 = r3.mStartMotionPath
            r0.setupRelative(r3, r1)
            androidx.constraintlayout.core.motion.MotionPaths r0 = r2.mEndMotionPath
            androidx.constraintlayout.core.motion.MotionPaths r1 = r3.mEndMotionPath
            r0.setupRelative(r3, r1)
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = " start: x: "
            r0.<init>(r1)
            androidx.constraintlayout.core.motion.MotionPaths r1 = r3.mStartMotionPath
            float r1 = r1.f18x
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " y: "
            java.lang.StringBuilder r0 = r0.append(r1)
            androidx.constraintlayout.core.motion.MotionPaths r2 = r3.mStartMotionPath
            float r2 = r2.f19y
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r2 = " end: x: "
            java.lang.StringBuilder r0 = r0.append(r2)
            androidx.constraintlayout.core.motion.MotionPaths r2 = r3.mEndMotionPath
            float r2 = r2.f18x
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            androidx.constraintlayout.core.motion.MotionPaths r1 = r3.mEndMotionPath
            float r1 = r1.f19y
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
