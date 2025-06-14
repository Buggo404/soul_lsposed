package androidx.constraintlayout.motion.widget;

/* loaded from: classes.dex */
public class MotionController {
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
    private java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> mAttributesMap;
    java.lang.String mConstraintTag;
    float mCurrentCenterX;
    float mCurrentCenterY;
    private int mCurveFitType;
    private java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewOscillator> mCycleMap;
    private androidx.constraintlayout.motion.widget.MotionPaths mEndMotionPath;
    private androidx.constraintlayout.motion.widget.MotionConstrainedPoint mEndPoint;
    boolean mForceMeasure;
    int mId;
    private double[] mInterpolateData;
    private int[] mInterpolateVariables;
    private double[] mInterpolateVelocity;
    private java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> mKeyList;
    private androidx.constraintlayout.motion.widget.KeyTrigger[] mKeyTriggers;
    private java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionPaths> mMotionPaths;
    float mMotionStagger;
    private boolean mNoMovement;
    private int mPathMotionArc;
    private android.view.animation.Interpolator mQuantizeMotionInterpolator;
    private float mQuantizeMotionPhase;
    private int mQuantizeMotionSteps;
    private androidx.constraintlayout.core.motion.utils.CurveFit[] mSpline;
    float mStaggerOffset;
    float mStaggerScale;
    private androidx.constraintlayout.motion.widget.MotionPaths mStartMotionPath;
    private androidx.constraintlayout.motion.widget.MotionConstrainedPoint mStartPoint;
    android.graphics.Rect mTempRect;
    private java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewTimeCycle> mTimeCycleAttributesMap;
    private int mTransformPivotTarget;
    private android.view.View mTransformPivotView;
    private float[] mValuesBuff;
    private float[] mVelocity;
    android.view.View mView;


    MotionController(android.view.View r5) {
            r4 = this;
            r4.<init>()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r4.mTempRect = r0
            r0 = 0
            r4.mForceMeasure = r0
            r1 = -1
            r4.mCurveFitType = r1
            androidx.constraintlayout.motion.widget.MotionPaths r1 = new androidx.constraintlayout.motion.widget.MotionPaths
            r1.<init>()
            r4.mStartMotionPath = r1
            androidx.constraintlayout.motion.widget.MotionPaths r1 = new androidx.constraintlayout.motion.widget.MotionPaths
            r1.<init>()
            r4.mEndMotionPath = r1
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r1 = new androidx.constraintlayout.motion.widget.MotionConstrainedPoint
            r1.<init>()
            r4.mStartPoint = r1
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r1 = new androidx.constraintlayout.motion.widget.MotionConstrainedPoint
            r1.<init>()
            r4.mEndPoint = r1
            r1 = 2143289344(0x7fc00000, float:NaN)
            r4.mMotionStagger = r1
            r2 = 0
            r4.mStaggerOffset = r2
            r2 = 1065353216(0x3f800000, float:1.0)
            r4.mStaggerScale = r2
            r2 = 4
            r4.MAX_DIMENSION = r2
            float[] r2 = new float[r2]
            r4.mValuesBuff = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r4.mMotionPaths = r2
            r2 = 1
            float[] r2 = new float[r2]
            r4.mVelocity = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r4.mKeyList = r2
            int r2 = androidx.constraintlayout.motion.widget.Key.UNSET
            r4.mPathMotionArc = r2
            int r2 = androidx.constraintlayout.motion.widget.Key.UNSET
            r4.mTransformPivotTarget = r2
            r2 = 0
            r4.mTransformPivotView = r2
            int r3 = androidx.constraintlayout.motion.widget.Key.UNSET
            r4.mQuantizeMotionSteps = r3
            r4.mQuantizeMotionPhase = r1
            r4.mQuantizeMotionInterpolator = r2
            r4.mNoMovement = r0
            r4.setView(r5)
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
            androidx.constraintlayout.motion.widget.MotionPaths r3 = r11.mStartMotionPath
            androidx.constraintlayout.core.motion.utils.Easing r3 = r3.mKeyFrameEasing
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionPaths> r4 = r11.mMotionPaths
            java.util.Iterator r4 = r4.iterator()
            r5 = 2143289344(0x7fc00000, float:NaN)
        L34:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L5b
            java.lang.Object r6 = r4.next()
            androidx.constraintlayout.motion.widget.MotionPaths r6 = (androidx.constraintlayout.motion.widget.MotionPaths) r6
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

    private static android.view.animation.Interpolator getInterpolator(android.content.Context r1, int r2, java.lang.String r3, int r4) {
            r0 = -2
            if (r2 == r0) goto L3e
            r1 = -1
            if (r2 == r1) goto L34
            if (r2 == 0) goto L2e
            r1 = 1
            if (r2 == r1) goto L28
            r1 = 2
            if (r2 == r1) goto L22
            r1 = 4
            if (r2 == r1) goto L1c
            r1 = 5
            if (r2 == r1) goto L16
            r1 = 0
            return r1
        L16:
            android.view.animation.OvershootInterpolator r1 = new android.view.animation.OvershootInterpolator
            r1.<init>()
            return r1
        L1c:
            android.view.animation.BounceInterpolator r1 = new android.view.animation.BounceInterpolator
            r1.<init>()
            return r1
        L22:
            android.view.animation.DecelerateInterpolator r1 = new android.view.animation.DecelerateInterpolator
            r1.<init>()
            return r1
        L28:
            android.view.animation.AccelerateInterpolator r1 = new android.view.animation.AccelerateInterpolator
            r1.<init>()
            return r1
        L2e:
            android.view.animation.AccelerateDecelerateInterpolator r1 = new android.view.animation.AccelerateDecelerateInterpolator
            r1.<init>()
            return r1
        L34:
            androidx.constraintlayout.core.motion.utils.Easing r1 = androidx.constraintlayout.core.motion.utils.Easing.getInterpolator(r3)
            androidx.constraintlayout.motion.widget.MotionController$1 r2 = new androidx.constraintlayout.motion.widget.MotionController$1
            r2.<init>(r1)
            return r2
        L3e:
            android.view.animation.Interpolator r1 = android.view.animation.AnimationUtils.loadInterpolator(r1, r4)
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
            androidx.constraintlayout.motion.widget.MotionPaths r5 = r0.mStartMotionPath
            androidx.constraintlayout.core.motion.utils.Easing r5 = r5.mKeyFrameEasing
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionPaths> r6 = r0.mMotionPaths
            java.util.Iterator r6 = r6.iterator()
            r17 = 2143289344(0x7fc00000, float:NaN)
            r18 = 0
        L28:
            boolean r19 = r6.hasNext()
            if (r19 == 0) goto L54
            java.lang.Object r19 = r6.next()
            r9 = r19
            androidx.constraintlayout.motion.widget.MotionPaths r9 = (androidx.constraintlayout.motion.widget.MotionPaths) r9
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
            androidx.constraintlayout.motion.widget.MotionPaths r2 = r0.mStartMotionPath
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

    private void insertKey(androidx.constraintlayout.motion.widget.MotionPaths r4) {
            r3 = this;
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionPaths> r0 = r3.mMotionPaths
            int r0 = java.util.Collections.binarySearch(r0, r4)
            if (r0 != 0) goto L24
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = " KeyPath position \""
            r1.<init>(r2)
            float r2 = r4.position
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "\" outside of range"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MotionController"
            android.util.Log.e(r2, r1)
        L24:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionPaths> r1 = r3.mMotionPaths
            int r0 = -r0
            int r0 = r0 + (-1)
            r1.add(r0, r4)
            return
    }

    private void readView(androidx.constraintlayout.motion.widget.MotionPaths r5) {
            r4 = this;
            android.view.View r0 = r4.mView
            float r0 = r0.getX()
            int r0 = (int) r0
            float r0 = (float) r0
            android.view.View r1 = r4.mView
            float r1 = r1.getY()
            int r1 = (int) r1
            float r1 = (float) r1
            android.view.View r2 = r4.mView
            int r2 = r2.getWidth()
            float r2 = (float) r2
            android.view.View r3 = r4.mView
            int r3 = r3.getHeight()
            float r3 = (float) r3
            r5.setBounds(r0, r1, r2, r3)
            return
    }

    public void addKey(androidx.constraintlayout.motion.widget.Key r2) {
            r1 = this;
            java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> r0 = r1.mKeyList
            r0.add(r2)
            return
    }

    void addKeys(java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> r2) {
            r1 = this;
            java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> r0 = r1.mKeyList
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
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> r4 = r0.mAttributesMap
            java.lang.String r5 = "translationX"
            if (r4 != 0) goto L12
            goto L18
        L12:
            java.lang.Object r4 = r4.get(r5)
            androidx.constraintlayout.core.motion.utils.SplineSet r4 = (androidx.constraintlayout.core.motion.utils.SplineSet) r4
        L18:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> r4 = r0.mAttributesMap
            java.lang.String r6 = "translationY"
            if (r4 != 0) goto L1f
            goto L25
        L1f:
            java.lang.Object r4 = r4.get(r6)
            androidx.constraintlayout.core.motion.utils.SplineSet r4 = (androidx.constraintlayout.core.motion.utils.SplineSet) r4
        L25:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewOscillator> r4 = r0.mCycleMap
            if (r4 != 0) goto L2a
            goto L30
        L2a:
            java.lang.Object r4 = r4.get(r5)
            androidx.constraintlayout.motion.utils.ViewOscillator r4 = (androidx.constraintlayout.motion.utils.ViewOscillator) r4
        L30:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewOscillator> r4 = r0.mCycleMap
            if (r4 != 0) goto L35
            goto L3b
        L35:
            java.lang.Object r4 = r4.get(r6)
            androidx.constraintlayout.motion.utils.ViewOscillator r4 = (androidx.constraintlayout.motion.utils.ViewOscillator) r4
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
            androidx.constraintlayout.motion.widget.MotionPaths r10 = r0.mStartMotionPath
            androidx.constraintlayout.core.motion.utils.Easing r10 = r10.mKeyFrameEasing
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionPaths> r11 = r0.mMotionPaths
            java.util.Iterator r11 = r11.iterator()
            r12 = 2143289344(0x7fc00000, float:NaN)
        L6d:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L94
            java.lang.Object r13 = r11.next()
            androidx.constraintlayout.motion.widget.MotionPaths r13 = (androidx.constraintlayout.motion.widget.MotionPaths) r13
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
            androidx.constraintlayout.motion.widget.MotionPaths r6 = r0.mStartMotionPath
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
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionPaths> r2 = r7.mMotionPaths
            java.util.Iterator r2 = r2.iterator()
            r3 = r0
        L14:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L28
            java.lang.Object r4 = r2.next()
            androidx.constraintlayout.motion.widget.MotionPaths r4 = (androidx.constraintlayout.motion.widget.MotionPaths) r4
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
            androidx.constraintlayout.motion.widget.MotionPaths r3 = r7.mStartMotionPath
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

    int buildKeyFrames(float[] r11, int[] r12) {
            r10 = this;
            r0 = 0
            if (r11 == 0) goto L4d
            androidx.constraintlayout.core.motion.utils.CurveFit[] r1 = r10.mSpline
            r1 = r1[r0]
            double[] r1 = r1.getTimePoints()
            if (r12 == 0) goto L28
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionPaths> r2 = r10.mMotionPaths
            java.util.Iterator r2 = r2.iterator()
            r3 = r0
        L14:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L28
            java.lang.Object r4 = r2.next()
            androidx.constraintlayout.motion.widget.MotionPaths r4 = (androidx.constraintlayout.motion.widget.MotionPaths) r4
            int r5 = r3 + 1
            int r4 = r4.mMode
            r12[r3] = r4
            r3 = r5
            goto L14
        L28:
            r12 = r0
            r9 = r12
        L2a:
            int r2 = r1.length
            if (r12 >= r2) goto L4a
            androidx.constraintlayout.core.motion.utils.CurveFit[] r2 = r10.mSpline
            r2 = r2[r0]
            r3 = r1[r12]
            double[] r5 = r10.mInterpolateData
            r2.getPos(r3, r5)
            androidx.constraintlayout.motion.widget.MotionPaths r2 = r10.mStartMotionPath
            r3 = r1[r12]
            int[] r5 = r10.mInterpolateVariables
            double[] r6 = r10.mInterpolateData
            r7 = r11
            r8 = r9
            r2.getCenter(r3, r5, r6, r7, r8)
            int r9 = r9 + 2
            int r12 = r12 + 1
            goto L2a
        L4a:
            int r9 = r9 / 2
            return r9
        L4d:
            return r0
    }

    void buildPath(float[] r19, int r20) {
            r18 = this;
            r0 = r18
            r8 = r20
            int r1 = r8 + (-1)
            float r1 = (float) r1
            r9 = 1065353216(0x3f800000, float:1.0)
            float r10 = r9 / r1
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> r1 = r0.mAttributesMap
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
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> r1 = r0.mAttributesMap
            java.lang.String r4 = "translationY"
            if (r1 != 0) goto L23
            r12 = r3
            goto L2a
        L23:
            java.lang.Object r1 = r1.get(r4)
            androidx.constraintlayout.core.motion.utils.SplineSet r1 = (androidx.constraintlayout.core.motion.utils.SplineSet) r1
            r12 = r1
        L2a:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewOscillator> r1 = r0.mCycleMap
            if (r1 != 0) goto L30
            r13 = r3
            goto L37
        L30:
            java.lang.Object r1 = r1.get(r2)
            androidx.constraintlayout.motion.utils.ViewOscillator r1 = (androidx.constraintlayout.motion.utils.ViewOscillator) r1
            r13 = r1
        L37:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewOscillator> r1 = r0.mCycleMap
            if (r1 != 0) goto L3c
            goto L43
        L3c:
            java.lang.Object r1 = r1.get(r4)
            r3 = r1
            androidx.constraintlayout.motion.utils.ViewOscillator r3 = (androidx.constraintlayout.motion.utils.ViewOscillator) r3
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
            androidx.constraintlayout.motion.widget.MotionPaths r3 = r0.mStartMotionPath
            androidx.constraintlayout.core.motion.utils.Easing r3 = r3.mKeyFrameEasing
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionPaths> r5 = r0.mMotionPaths
            java.util.Iterator r5 = r5.iterator()
            r16 = 2143289344(0x7fc00000, float:NaN)
        L76:
            boolean r17 = r5.hasNext()
            if (r17 == 0) goto La0
            java.lang.Object r17 = r5.next()
            r9 = r17
            androidx.constraintlayout.motion.widget.MotionPaths r9 = (androidx.constraintlayout.motion.widget.MotionPaths) r9
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
            androidx.constraintlayout.motion.widget.MotionPaths r1 = r0.mStartMotionPath
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

    void buildRect(float r4, float[] r5, int r6) {
            r3 = this;
            r0 = 0
            float r4 = r3.getAdjustedPosition(r4, r0)
            androidx.constraintlayout.core.motion.utils.CurveFit[] r0 = r3.mSpline
            r1 = 0
            r0 = r0[r1]
            double r1 = (double) r4
            double[] r4 = r3.mInterpolateData
            r0.getPos(r1, r4)
            androidx.constraintlayout.motion.widget.MotionPaths r4 = r3.mStartMotionPath
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
            androidx.constraintlayout.motion.widget.MotionPaths r3 = r7.mStartMotionPath
            int[] r4 = r7.mInterpolateVariables
            double[] r5 = r7.mInterpolateData
            int r6 = r2 * 8
            r3.getRect(r4, r5, r8, r6)
            int r2 = r2 + 1
            goto L8
        L29:
            return
    }

    void endTrigger(boolean r5) {
            r4 = this;
            android.view.View r0 = r4.mView
            java.lang.String r0 = androidx.constraintlayout.motion.widget.Debug.getName(r0)
            java.lang.String r1 = "button"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L29
            androidx.constraintlayout.motion.widget.KeyTrigger[] r0 = r4.mKeyTriggers
            if (r0 == 0) goto L29
            r0 = 0
        L13:
            androidx.constraintlayout.motion.widget.KeyTrigger[] r1 = r4.mKeyTriggers
            int r2 = r1.length
            if (r0 >= r2) goto L29
            r1 = r1[r0]
            if (r5 == 0) goto L1f
            r2 = -1027080192(0xffffffffc2c80000, float:-100.0)
            goto L21
        L1f:
            r2 = 1120403456(0x42c80000, float:100.0)
        L21:
            android.view.View r3 = r4.mView
            r1.conditionallyFire(r2, r3)
            int r0 = r0 + 1
            goto L13
        L29:
            return
    }

    public int getAnimateRelativeTo() {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r1.mStartMotionPath
            int r0 = r0.mAnimateRelativeTo
            return r0
    }

    int getAttributeValues(java.lang.String r2, float[] r3, int r4) {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> r4 = r1.mAttributesMap
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
            androidx.constraintlayout.motion.widget.MotionPaths r1 = r9.mStartMotionPath
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
            androidx.constraintlayout.motion.widget.MotionPaths r4 = r11.mStartMotionPath
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
            androidx.constraintlayout.motion.widget.MotionPaths r4 = r11.mStartMotionPath
            int[] r8 = r11.mInterpolateVariables
            double[] r10 = r11.mInterpolateData
            r5 = r13
            r6 = r14
            r7 = r15
            r4.setDpDt(r5, r6, r7, r8, r9, r10)
            return
        L5d:
            androidx.constraintlayout.motion.widget.MotionPaths r12 = r11.mEndMotionPath
            float r12 = r12.f54x
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r11.mStartMotionPath
            float r0 = r0.f54x
            float r12 = r12 - r0
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r11.mEndMotionPath
            float r0 = r0.f55y
            androidx.constraintlayout.motion.widget.MotionPaths r2 = r11.mStartMotionPath
            float r2 = r2.f55y
            float r0 = r0 - r2
            androidx.constraintlayout.motion.widget.MotionPaths r2 = r11.mEndMotionPath
            float r2 = r2.width
            androidx.constraintlayout.motion.widget.MotionPaths r3 = r11.mStartMotionPath
            float r3 = r3.width
            float r2 = r2 - r3
            androidx.constraintlayout.motion.widget.MotionPaths r3 = r11.mEndMotionPath
            float r3 = r3.height
            androidx.constraintlayout.motion.widget.MotionPaths r4 = r11.mStartMotionPath
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
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r3.mStartMotionPath
            int r0 = r0.mDrawPath
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionPaths> r1 = r3.mMotionPaths
            java.util.Iterator r1 = r1.iterator()
        La:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1d
            java.lang.Object r2 = r1.next()
            androidx.constraintlayout.motion.widget.MotionPaths r2 = (androidx.constraintlayout.motion.widget.MotionPaths) r2
            int r2 = r2.mDrawPath
            int r0 = java.lang.Math.max(r0, r2)
            goto La
        L1d:
            androidx.constraintlayout.motion.widget.MotionPaths r1 = r3.mEndMotionPath
            int r1 = r1.mDrawPath
            int r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    public float getFinalHeight() {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r1.mEndMotionPath
            float r0 = r0.height
            return r0
    }

    public float getFinalWidth() {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r1.mEndMotionPath
            float r0 = r0.width
            return r0
    }

    public float getFinalX() {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r1.mEndMotionPath
            float r0 = r0.f54x
            return r0
    }

    public float getFinalY() {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r1.mEndMotionPath
            float r0 = r0.f55y
            return r0
    }

    androidx.constraintlayout.motion.widget.MotionPaths getKeyFrame(int r2) {
            r1 = this;
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionPaths> r0 = r1.mMotionPaths
            java.lang.Object r2 = r0.get(r2)
            androidx.constraintlayout.motion.widget.MotionPaths r2 = (androidx.constraintlayout.motion.widget.MotionPaths) r2
            return r2
    }

    public int getKeyFrameInfo(int r18, int[] r19) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 2
            float[] r2 = new float[r2]
            java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> r3 = r0.mKeyList
            java.util.Iterator r10 = r3.iterator()
            r11 = 0
            r12 = r11
            r13 = r12
        L10:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L92
            java.lang.Object r3 = r10.next()
            r14 = r3
            androidx.constraintlayout.motion.widget.Key r14 = (androidx.constraintlayout.motion.widget.Key) r14
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
            androidx.constraintlayout.motion.widget.MotionPaths r3 = r0.mStartMotionPath
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
            boolean r3 = r14 instanceof androidx.constraintlayout.motion.widget.KeyPosition
            if (r3 == 0) goto L86
            androidx.constraintlayout.motion.widget.KeyPosition r14 = (androidx.constraintlayout.motion.widget.KeyPosition) r14
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
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r9.mEndMotionPath
            float r0 = r0.f54x
            androidx.constraintlayout.motion.widget.MotionPaths r1 = r9.mStartMotionPath
            float r1 = r1.f54x
            float r0 = r0 - r1
            androidx.constraintlayout.motion.widget.MotionPaths r1 = r9.mEndMotionPath
            float r1 = r1.f55y
            androidx.constraintlayout.motion.widget.MotionPaths r2 = r9.mStartMotionPath
            float r2 = r2.f55y
            float r1 = r1 - r2
            androidx.constraintlayout.motion.widget.MotionPaths r2 = r9.mStartMotionPath
            float r2 = r2.f54x
            androidx.constraintlayout.motion.widget.MotionPaths r3 = r9.mStartMotionPath
            float r3 = r3.width
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            float r2 = r2 + r3
            androidx.constraintlayout.motion.widget.MotionPaths r3 = r9.mStartMotionPath
            float r3 = r3.f55y
            androidx.constraintlayout.motion.widget.MotionPaths r5 = r9.mStartMotionPath
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
            java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> r0 = r12.mKeyList
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
            r10 = r2
        L9:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L3f
            java.lang.Object r3 = r0.next()
            androidx.constraintlayout.motion.widget.Key r3 = (androidx.constraintlayout.motion.widget.Key) r3
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
            androidx.constraintlayout.motion.widget.MotionPaths r3 = r12.mStartMotionPath
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

    androidx.constraintlayout.motion.widget.KeyPositionBase getPositionKeyframe(int r12, int r13, float r14, float r15) {
            r11 = this;
            android.graphics.RectF r7 = new android.graphics.RectF
            r7.<init>()
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r11.mStartMotionPath
            float r0 = r0.f54x
            r7.left = r0
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r11.mStartMotionPath
            float r0 = r0.f55y
            r7.top = r0
            float r0 = r7.left
            androidx.constraintlayout.motion.widget.MotionPaths r1 = r11.mStartMotionPath
            float r1 = r1.width
            float r0 = r0 + r1
            r7.right = r0
            float r0 = r7.top
            androidx.constraintlayout.motion.widget.MotionPaths r1 = r11.mStartMotionPath
            float r1 = r1.height
            float r0 = r0 + r1
            r7.bottom = r0
            android.graphics.RectF r8 = new android.graphics.RectF
            r8.<init>()
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r11.mEndMotionPath
            float r0 = r0.f54x
            r8.left = r0
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r11.mEndMotionPath
            float r0 = r0.f55y
            r8.top = r0
            float r0 = r8.left
            androidx.constraintlayout.motion.widget.MotionPaths r1 = r11.mEndMotionPath
            float r1 = r1.width
            float r0 = r0 + r1
            r8.right = r0
            float r0 = r8.top
            androidx.constraintlayout.motion.widget.MotionPaths r1 = r11.mEndMotionPath
            float r1 = r1.height
            float r0 = r0 + r1
            r8.bottom = r0
            java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> r0 = r11.mKeyList
            java.util.Iterator r9 = r0.iterator()
        L4c:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L6d
            java.lang.Object r0 = r9.next()
            androidx.constraintlayout.motion.widget.Key r0 = (androidx.constraintlayout.motion.widget.Key) r0
            boolean r1 = r0 instanceof androidx.constraintlayout.motion.widget.KeyPositionBase
            if (r1 == 0) goto L4c
            r10 = r0
            androidx.constraintlayout.motion.widget.KeyPositionBase r10 = (androidx.constraintlayout.motion.widget.KeyPositionBase) r10
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
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> r2 = r0.mAttributesMap
            java.lang.String r3 = "translationX"
            r4 = 0
            if (r2 != 0) goto L13
            r2 = r4
            goto L19
        L13:
            java.lang.Object r2 = r2.get(r3)
            androidx.constraintlayout.core.motion.utils.SplineSet r2 = (androidx.constraintlayout.core.motion.utils.SplineSet) r2
        L19:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> r5 = r0.mAttributesMap
            java.lang.String r6 = "translationY"
            if (r5 != 0) goto L21
            r5 = r4
            goto L27
        L21:
            java.lang.Object r5 = r5.get(r6)
            androidx.constraintlayout.core.motion.utils.SplineSet r5 = (androidx.constraintlayout.core.motion.utils.SplineSet) r5
        L27:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> r7 = r0.mAttributesMap
            java.lang.String r8 = "rotation"
            if (r7 != 0) goto L2f
            r7 = r4
            goto L35
        L2f:
            java.lang.Object r7 = r7.get(r8)
            androidx.constraintlayout.core.motion.utils.SplineSet r7 = (androidx.constraintlayout.core.motion.utils.SplineSet) r7
        L35:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> r9 = r0.mAttributesMap
            java.lang.String r10 = "scaleX"
            if (r9 != 0) goto L3d
            r9 = r4
            goto L43
        L3d:
            java.lang.Object r9 = r9.get(r10)
            androidx.constraintlayout.core.motion.utils.SplineSet r9 = (androidx.constraintlayout.core.motion.utils.SplineSet) r9
        L43:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> r11 = r0.mAttributesMap
            java.lang.String r12 = "scaleY"
            if (r11 != 0) goto L4b
            r11 = r4
            goto L51
        L4b:
            java.lang.Object r11 = r11.get(r12)
            androidx.constraintlayout.core.motion.utils.SplineSet r11 = (androidx.constraintlayout.core.motion.utils.SplineSet) r11
        L51:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewOscillator> r13 = r0.mCycleMap
            if (r13 != 0) goto L57
            r3 = r4
            goto L5d
        L57:
            java.lang.Object r3 = r13.get(r3)
            androidx.constraintlayout.motion.utils.ViewOscillator r3 = (androidx.constraintlayout.motion.utils.ViewOscillator) r3
        L5d:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewOscillator> r13 = r0.mCycleMap
            if (r13 != 0) goto L63
            r6 = r4
            goto L69
        L63:
            java.lang.Object r6 = r13.get(r6)
            androidx.constraintlayout.motion.utils.ViewOscillator r6 = (androidx.constraintlayout.motion.utils.ViewOscillator) r6
        L69:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewOscillator> r13 = r0.mCycleMap
            if (r13 != 0) goto L6f
            r8 = r4
            goto L75
        L6f:
            java.lang.Object r8 = r13.get(r8)
            androidx.constraintlayout.motion.utils.ViewOscillator r8 = (androidx.constraintlayout.motion.utils.ViewOscillator) r8
        L75:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewOscillator> r13 = r0.mCycleMap
            if (r13 != 0) goto L7b
            r10 = r4
            goto L81
        L7b:
            java.lang.Object r10 = r13.get(r10)
            androidx.constraintlayout.motion.utils.ViewOscillator r10 = (androidx.constraintlayout.motion.utils.ViewOscillator) r10
        L81:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewOscillator> r13 = r0.mCycleMap
            if (r13 != 0) goto L86
            goto L8c
        L86:
            java.lang.Object r4 = r13.get(r12)
            androidx.constraintlayout.motion.utils.ViewOscillator r4 = (androidx.constraintlayout.motion.utils.ViewOscillator) r4
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
            androidx.constraintlayout.motion.widget.MotionPaths r1 = r0.mStartMotionPath
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
            androidx.constraintlayout.motion.widget.MotionPaths r1 = r0.mStartMotionPath
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
            androidx.constraintlayout.motion.widget.MotionPaths r13 = r0.mEndMotionPath
            float r13 = r13.f54x
            androidx.constraintlayout.motion.widget.MotionPaths r15 = r0.mStartMotionPath
            float r15 = r15.f54x
            float r13 = r13 - r15
            androidx.constraintlayout.motion.widget.MotionPaths r15 = r0.mEndMotionPath
            float r15 = r15.f55y
            androidx.constraintlayout.motion.widget.MotionPaths r14 = r0.mStartMotionPath
            float r14 = r14.f55y
            float r15 = r15 - r14
            androidx.constraintlayout.motion.widget.MotionPaths r14 = r0.mEndMotionPath
            float r14 = r14.width
            r16 = r4
            androidx.constraintlayout.motion.widget.MotionPaths r4 = r0.mStartMotionPath
            float r4 = r4.width
            float r14 = r14 - r4
            androidx.constraintlayout.motion.widget.MotionPaths r4 = r0.mEndMotionPath
            float r4 = r4.height
            r17 = r10
            androidx.constraintlayout.motion.widget.MotionPaths r10 = r0.mStartMotionPath
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
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r1.mStartMotionPath
            float r0 = r0.height
            return r0
    }

    public float getStartWidth() {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r1.mStartMotionPath
            float r0 = r0.width
            return r0
    }

    public float getStartX() {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r1.mStartMotionPath
            float r0 = r0.f54x
            return r0
    }

    public float getStartY() {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r1.mStartMotionPath
            float r0 = r0.f55y
            return r0
    }

    public int getTransformPivotTarget() {
            r1 = this;
            int r0 = r1.mTransformPivotTarget
            return r0
    }

    public android.view.View getView() {
            r1 = this;
            android.view.View r0 = r1.mView
            return r0
    }

    boolean interpolate(android.view.View r21, float r22, long r23, androidx.constraintlayout.core.motion.utils.KeyCache r25) {
            r20 = this;
            r0 = r20
            r11 = r21
            r1 = 0
            r2 = r22
            float r2 = r0.getAdjustedPosition(r2, r1)
            int r3 = r0.mQuantizeMotionSteps
            int r4 = androidx.constraintlayout.motion.widget.Key.UNSET
            r13 = 1065353216(0x3f800000, float:1.0)
            if (r3 == r4) goto L44
            int r3 = r0.mQuantizeMotionSteps
            float r3 = (float) r3
            float r3 = r13 / r3
            float r4 = r2 / r3
            double r4 = (double) r4
            double r4 = java.lang.Math.floor(r4)
            float r4 = (float) r4
            float r4 = r4 * r3
            float r2 = r2 % r3
            float r2 = r2 / r3
            float r5 = r0.mQuantizeMotionPhase
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L2f
            float r5 = r0.mQuantizeMotionPhase
            float r2 = r2 + r5
            float r2 = r2 % r13
        L2f:
            android.view.animation.Interpolator r5 = r0.mQuantizeMotionInterpolator
            if (r5 == 0) goto L38
            float r2 = r5.getInterpolation(r2)
            goto L42
        L38:
            double r5 = (double) r2
            r7 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 <= 0) goto L41
            r2 = r13
            goto L42
        L41:
            r2 = 0
        L42:
            float r2 = r2 * r3
            float r2 = r2 + r4
        L44:
            r14 = r2
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> r2 = r0.mAttributesMap
            if (r2 == 0) goto L61
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L51:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L61
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.motion.utils.ViewSpline r3 = (androidx.constraintlayout.motion.utils.ViewSpline) r3
            r3.setProperty(r11, r14)
            goto L51
        L61:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewTimeCycle> r2 = r0.mTimeCycleAttributesMap
            r15 = 0
            if (r2 == 0) goto L95
            java.util.Collection r2 = r2.values()
            java.util.Iterator r7 = r2.iterator()
            r8 = r1
            r9 = r15
        L70:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L91
            java.lang.Object r1 = r7.next()
            androidx.constraintlayout.motion.utils.ViewTimeCycle r1 = (androidx.constraintlayout.motion.utils.ViewTimeCycle) r1
            boolean r2 = r1 instanceof androidx.constraintlayout.motion.utils.ViewTimeCycle.PathRotate
            if (r2 == 0) goto L84
            r8 = r1
            androidx.constraintlayout.motion.utils.ViewTimeCycle$PathRotate r8 = (androidx.constraintlayout.motion.utils.ViewTimeCycle.PathRotate) r8
            goto L70
        L84:
            r2 = r21
            r3 = r14
            r4 = r23
            r6 = r25
            boolean r1 = r1.setProperty(r2, r3, r4, r6)
            r9 = r9 | r1
            goto L70
        L91:
            r16 = r9
            r9 = r8
            goto L98
        L95:
            r9 = r1
            r16 = r15
        L98:
            androidx.constraintlayout.core.motion.utils.CurveFit[] r1 = r0.mSpline
            r10 = 1
            if (r1 == 0) goto L1f7
            r1 = r1[r15]
            double r7 = (double) r14
            double[] r2 = r0.mInterpolateData
            r1.getPos(r7, r2)
            androidx.constraintlayout.core.motion.utils.CurveFit[] r1 = r0.mSpline
            r1 = r1[r15]
            double[] r2 = r0.mInterpolateVelocity
            r1.getSlope(r7, r2)
            androidx.constraintlayout.core.motion.utils.CurveFit r1 = r0.mArcSpline
            if (r1 == 0) goto Lc1
            double[] r2 = r0.mInterpolateData
            int r3 = r2.length
            if (r3 <= 0) goto Lc1
            r1.getPos(r7, r2)
            androidx.constraintlayout.core.motion.utils.CurveFit r1 = r0.mArcSpline
            double[] r2 = r0.mInterpolateVelocity
            r1.getSlope(r7, r2)
        Lc1:
            boolean r1 = r0.mNoMovement
            if (r1 != 0) goto Le1
            androidx.constraintlayout.motion.widget.MotionPaths r1 = r0.mStartMotionPath
            int[] r4 = r0.mInterpolateVariables
            double[] r5 = r0.mInterpolateData
            double[] r6 = r0.mInterpolateVelocity
            r17 = 0
            boolean r3 = r0.mForceMeasure
            r2 = r14
            r18 = r3
            r3 = r21
            r12 = r7
            r7 = r17
            r8 = r18
            r1.setView(r2, r3, r4, r5, r6, r7, r8)
            r0.mForceMeasure = r15
            goto Le2
        Le1:
            r12 = r7
        Le2:
            int r1 = r0.mTransformPivotTarget
            int r2 = androidx.constraintlayout.motion.widget.Key.UNSET
            if (r1 == r2) goto L144
            android.view.View r1 = r0.mTransformPivotView
            if (r1 != 0) goto Lfa
            android.view.ViewParent r1 = r21.getParent()
            android.view.View r1 = (android.view.View) r1
            int r2 = r0.mTransformPivotTarget
            android.view.View r1 = r1.findViewById(r2)
            r0.mTransformPivotView = r1
        Lfa:
            android.view.View r1 = r0.mTransformPivotView
            if (r1 == 0) goto L144
            int r1 = r1.getTop()
            android.view.View r2 = r0.mTransformPivotView
            int r2 = r2.getBottom()
            int r1 = r1 + r2
            float r1 = (float) r1
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            android.view.View r3 = r0.mTransformPivotView
            int r3 = r3.getLeft()
            android.view.View r4 = r0.mTransformPivotView
            int r4 = r4.getRight()
            int r3 = r3 + r4
            float r3 = (float) r3
            float r3 = r3 / r2
            int r2 = r21.getRight()
            int r4 = r21.getLeft()
            int r2 = r2 - r4
            if (r2 <= 0) goto L144
            int r2 = r21.getBottom()
            int r4 = r21.getTop()
            int r2 = r2 - r4
            if (r2 <= 0) goto L144
            int r2 = r21.getLeft()
            float r2 = (float) r2
            float r3 = r3 - r2
            int r2 = r21.getTop()
            float r2 = (float) r2
            float r1 = r1 - r2
            r11.setPivotX(r3)
            r11.setPivotY(r1)
        L144:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> r1 = r0.mAttributesMap
            if (r1 == 0) goto L172
            java.util.Collection r1 = r1.values()
            java.util.Iterator r8 = r1.iterator()
        L150:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L172
            java.lang.Object r1 = r8.next()
            androidx.constraintlayout.core.motion.utils.SplineSet r1 = (androidx.constraintlayout.core.motion.utils.SplineSet) r1
            boolean r2 = r1 instanceof androidx.constraintlayout.motion.utils.ViewSpline.PathRotate
            if (r2 == 0) goto L150
            double[] r2 = r0.mInterpolateVelocity
            int r3 = r2.length
            if (r3 <= r10) goto L150
            androidx.constraintlayout.motion.utils.ViewSpline$PathRotate r1 = (androidx.constraintlayout.motion.utils.ViewSpline.PathRotate) r1
            r4 = r2[r15]
            r6 = r2[r10]
            r2 = r21
            r3 = r14
            r1.setPathRotate(r2, r3, r4, r6)
            goto L150
        L172:
            if (r9 == 0) goto L18f
            double[] r1 = r0.mInterpolateVelocity
            r7 = r1[r15]
            r17 = r1[r10]
            r1 = r9
            r2 = r21
            r3 = r25
            r4 = r14
            r5 = r23
            r19 = r10
            r9 = r17
            boolean r1 = r1.setPathRotate(r2, r3, r4, r5, r7, r9)
            r1 = r16 | r1
            r16 = r1
            goto L191
        L18f:
            r19 = r10
        L191:
            r10 = r19
        L193:
            androidx.constraintlayout.core.motion.utils.CurveFit[] r1 = r0.mSpline
            int r2 = r1.length
            if (r10 >= r2) goto L1b7
            r1 = r1[r10]
            float[] r2 = r0.mValuesBuff
            r1.getPos(r12, r2)
            androidx.constraintlayout.motion.widget.MotionPaths r1 = r0.mStartMotionPath
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r1 = r1.attributes
            java.lang.String[] r2 = r0.mAttributeNames
            int r3 = r10 + (-1)
            r2 = r2[r3]
            java.lang.Object r1 = r1.get(r2)
            androidx.constraintlayout.widget.ConstraintAttribute r1 = (androidx.constraintlayout.widget.ConstraintAttribute) r1
            float[] r2 = r0.mValuesBuff
            androidx.constraintlayout.motion.utils.CustomSupport.setInterpolatedValue(r1, r11, r2)
            int r10 = r10 + 1
            goto L193
        L1b7:
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r1 = r0.mStartPoint
            int r1 = r1.mVisibilityMode
            if (r1 != 0) goto L1e5
            r1 = 0
            int r1 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r1 > 0) goto L1ca
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r1 = r0.mStartPoint
            int r1 = r1.visibility
            r11.setVisibility(r1)
            goto L1e5
        L1ca:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r1 < 0) goto L1d8
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r1 = r0.mEndPoint
            int r1 = r1.visibility
            r11.setVisibility(r1)
            goto L1e5
        L1d8:
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r1 = r0.mEndPoint
            int r1 = r1.visibility
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r2 = r0.mStartPoint
            int r2 = r2.visibility
            if (r1 == r2) goto L1e5
            r11.setVisibility(r15)
        L1e5:
            androidx.constraintlayout.motion.widget.KeyTrigger[] r1 = r0.mKeyTriggers
            if (r1 == 0) goto L271
            r1 = r15
        L1ea:
            androidx.constraintlayout.motion.widget.KeyTrigger[] r2 = r0.mKeyTriggers
            int r3 = r2.length
            if (r1 >= r3) goto L271
            r2 = r2[r1]
            r2.conditionallyFire(r14, r11)
            int r1 = r1 + 1
            goto L1ea
        L1f7:
            r19 = r10
            androidx.constraintlayout.motion.widget.MotionPaths r1 = r0.mStartMotionPath
            float r1 = r1.f54x
            androidx.constraintlayout.motion.widget.MotionPaths r2 = r0.mEndMotionPath
            float r2 = r2.f54x
            androidx.constraintlayout.motion.widget.MotionPaths r3 = r0.mStartMotionPath
            float r3 = r3.f54x
            float r2 = r2 - r3
            float r2 = r2 * r14
            float r1 = r1 + r2
            androidx.constraintlayout.motion.widget.MotionPaths r2 = r0.mStartMotionPath
            float r2 = r2.f55y
            androidx.constraintlayout.motion.widget.MotionPaths r3 = r0.mEndMotionPath
            float r3 = r3.f55y
            androidx.constraintlayout.motion.widget.MotionPaths r4 = r0.mStartMotionPath
            float r4 = r4.f55y
            float r3 = r3 - r4
            float r3 = r3 * r14
            float r2 = r2 + r3
            androidx.constraintlayout.motion.widget.MotionPaths r3 = r0.mStartMotionPath
            float r3 = r3.width
            androidx.constraintlayout.motion.widget.MotionPaths r4 = r0.mEndMotionPath
            float r4 = r4.width
            androidx.constraintlayout.motion.widget.MotionPaths r5 = r0.mStartMotionPath
            float r5 = r5.width
            float r4 = r4 - r5
            float r4 = r4 * r14
            float r3 = r3 + r4
            androidx.constraintlayout.motion.widget.MotionPaths r4 = r0.mStartMotionPath
            float r4 = r4.height
            androidx.constraintlayout.motion.widget.MotionPaths r5 = r0.mEndMotionPath
            float r5 = r5.height
            androidx.constraintlayout.motion.widget.MotionPaths r6 = r0.mStartMotionPath
            float r6 = r6.height
            float r5 = r5 - r6
            float r5 = r5 * r14
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
            int r3 = r1 - r6
            int r4 = r2 - r5
            androidx.constraintlayout.motion.widget.MotionPaths r7 = r0.mEndMotionPath
            float r7 = r7.width
            androidx.constraintlayout.motion.widget.MotionPaths r8 = r0.mStartMotionPath
            float r8 = r8.width
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 != 0) goto L25f
            androidx.constraintlayout.motion.widget.MotionPaths r7 = r0.mEndMotionPath
            float r7 = r7.height
            androidx.constraintlayout.motion.widget.MotionPaths r8 = r0.mStartMotionPath
            float r8 = r8.height
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 != 0) goto L25f
            boolean r7 = r0.mForceMeasure
            if (r7 == 0) goto L26e
        L25f:
            r7 = 1073741824(0x40000000, float:2.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r7)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r7)
            r11.measure(r3, r4)
            r0.mForceMeasure = r15
        L26e:
            r11.layout(r6, r5, r1, r2)
        L271:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewOscillator> r1 = r0.mCycleMap
            if (r1 == 0) goto L2a0
            java.util.Collection r1 = r1.values()
            java.util.Iterator r8 = r1.iterator()
        L27d:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L2a0
            java.lang.Object r1 = r8.next()
            androidx.constraintlayout.motion.utils.ViewOscillator r1 = (androidx.constraintlayout.motion.utils.ViewOscillator) r1
            boolean r2 = r1 instanceof androidx.constraintlayout.motion.utils.ViewOscillator.PathRotateSet
            if (r2 == 0) goto L29c
            androidx.constraintlayout.motion.utils.ViewOscillator$PathRotateSet r1 = (androidx.constraintlayout.motion.utils.ViewOscillator.PathRotateSet) r1
            double[] r2 = r0.mInterpolateVelocity
            r4 = r2[r15]
            r6 = r2[r19]
            r2 = r21
            r3 = r14
            r1.setPathRotate(r2, r3, r4, r6)
            goto L27d
        L29c:
            r1.setProperty(r11, r14)
            goto L27d
        L2a0:
            return r16
    }

    java.lang.String name() {
            r2 = this;
            android.view.View r0 = r2.mView
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.view.View r1 = r2.mView
            int r1 = r1.getId()
            java.lang.String r0 = r0.getResourceEntryName(r1)
            return r0
    }

    void positionKeyframe(android.view.View r9, androidx.constraintlayout.motion.widget.KeyPositionBase r10, float r11, float r12, java.lang.String[] r13, float[] r14) {
            r8 = this;
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r8.mStartMotionPath
            float r0 = r0.f54x
            r2.left = r0
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r8.mStartMotionPath
            float r0 = r0.f55y
            r2.top = r0
            float r0 = r2.left
            androidx.constraintlayout.motion.widget.MotionPaths r1 = r8.mStartMotionPath
            float r1 = r1.width
            float r0 = r0 + r1
            r2.right = r0
            float r0 = r2.top
            androidx.constraintlayout.motion.widget.MotionPaths r1 = r8.mStartMotionPath
            float r1 = r1.height
            float r0 = r0 + r1
            r2.bottom = r0
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>()
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r8.mEndMotionPath
            float r0 = r0.f54x
            r3.left = r0
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r8.mEndMotionPath
            float r0 = r0.f55y
            r3.top = r0
            float r0 = r3.left
            androidx.constraintlayout.motion.widget.MotionPaths r1 = r8.mEndMotionPath
            float r1 = r1.width
            float r0 = r0 + r1
            r3.right = r0
            float r0 = r3.top
            androidx.constraintlayout.motion.widget.MotionPaths r1 = r8.mEndMotionPath
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

    public void remeasure() {
            r1 = this;
            r0 = 1
            r1.mForceMeasure = r0
            return
    }

    void rotate(android.graphics.Rect r3, android.graphics.Rect r4, int r5, int r6, int r7) {
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

    void setBothStates(android.view.View r6) {
            r5 = this;
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r5.mStartMotionPath
            r1 = 0
            r0.time = r1
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r5.mStartMotionPath
            r0.position = r1
            r0 = 1
            r5.mNoMovement = r0
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r5.mStartMotionPath
            float r1 = r6.getX()
            float r2 = r6.getY()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            int r4 = r6.getHeight()
            float r4 = (float) r4
            r0.setBounds(r1, r2, r3, r4)
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r5.mEndMotionPath
            float r1 = r6.getX()
            float r2 = r6.getY()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            int r4 = r6.getHeight()
            float r4 = (float) r4
            r0.setBounds(r1, r2, r3, r4)
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r0 = r5.mStartPoint
            r0.setState(r6)
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r0 = r5.mEndPoint
            r0.setState(r6)
            return
    }

    public void setDrawPath(int r2) {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r1.mStartMotionPath
            r0.mDrawPath = r2
            return
    }

    void setEndState(android.graphics.Rect r8, androidx.constraintlayout.widget.ConstraintSet r9, int r10, int r11) {
            r7 = this;
            int r6 = r9.mRotate
            if (r6 == 0) goto L10
            android.graphics.Rect r2 = r7.mTempRect
            r0 = r7
            r1 = r8
            r3 = r6
            r4 = r10
            r5 = r11
            r0.rotate(r1, r2, r3, r4, r5)
            android.graphics.Rect r8 = r7.mTempRect
        L10:
            androidx.constraintlayout.motion.widget.MotionPaths r10 = r7.mEndMotionPath
            r11 = 1065353216(0x3f800000, float:1.0)
            r10.time = r11
            androidx.constraintlayout.motion.widget.MotionPaths r10 = r7.mEndMotionPath
            r10.position = r11
            androidx.constraintlayout.motion.widget.MotionPaths r10 = r7.mEndMotionPath
            r7.readView(r10)
            androidx.constraintlayout.motion.widget.MotionPaths r10 = r7.mEndMotionPath
            int r11 = r8.left
            float r11 = (float) r11
            int r0 = r8.top
            float r0 = (float) r0
            int r1 = r8.width()
            float r1 = (float) r1
            int r2 = r8.height()
            float r2 = (float) r2
            r10.setBounds(r11, r0, r1, r2)
            androidx.constraintlayout.motion.widget.MotionPaths r10 = r7.mEndMotionPath
            int r11 = r7.mId
            androidx.constraintlayout.widget.ConstraintSet$Constraint r11 = r9.getParameters(r11)
            r10.applyParameters(r11)
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r10 = r7.mEndPoint
            int r11 = r7.mId
            r10.setState(r8, r9, r6, r11)
            return
    }

    public void setPathMotionArc(int r1) {
            r0 = this;
            r0.mPathMotionArc = r1
            return
    }

    void setStartCurrentState(android.view.View r6) {
            r5 = this;
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r5.mStartMotionPath
            r1 = 0
            r0.time = r1
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r5.mStartMotionPath
            r0.position = r1
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r5.mStartMotionPath
            float r1 = r6.getX()
            float r2 = r6.getY()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            int r4 = r6.getHeight()
            float r4 = (float) r4
            r0.setBounds(r1, r2, r3, r4)
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r0 = r5.mStartPoint
            r0.setState(r6)
            return
    }

    void setStartState(android.graphics.Rect r8, androidx.constraintlayout.widget.ConstraintSet r9, int r10, int r11) {
            r7 = this;
            int r6 = r9.mRotate
            if (r6 == 0) goto Le
            android.graphics.Rect r2 = r7.mTempRect
            r0 = r7
            r1 = r8
            r3 = r6
            r4 = r10
            r5 = r11
            r0.rotate(r1, r2, r3, r4, r5)
        Le:
            androidx.constraintlayout.motion.widget.MotionPaths r10 = r7.mStartMotionPath
            r11 = 0
            r10.time = r11
            androidx.constraintlayout.motion.widget.MotionPaths r10 = r7.mStartMotionPath
            r10.position = r11
            androidx.constraintlayout.motion.widget.MotionPaths r10 = r7.mStartMotionPath
            r7.readView(r10)
            androidx.constraintlayout.motion.widget.MotionPaths r10 = r7.mStartMotionPath
            int r11 = r8.left
            float r11 = (float) r11
            int r0 = r8.top
            float r0 = (float) r0
            int r1 = r8.width()
            float r1 = (float) r1
            int r2 = r8.height()
            float r2 = (float) r2
            r10.setBounds(r11, r0, r1, r2)
            int r10 = r7.mId
            androidx.constraintlayout.widget.ConstraintSet$Constraint r10 = r9.getParameters(r10)
            androidx.constraintlayout.motion.widget.MotionPaths r11 = r7.mStartMotionPath
            r11.applyParameters(r10)
            androidx.constraintlayout.widget.ConstraintSet$Motion r11 = r10.motion
            float r11 = r11.mMotionStagger
            r7.mMotionStagger = r11
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r11 = r7.mStartPoint
            int r0 = r7.mId
            r11.setState(r8, r9, r6, r0)
            androidx.constraintlayout.widget.ConstraintSet$Transform r8 = r10.transform
            int r8 = r8.transformPivotTarget
            r7.mTransformPivotTarget = r8
            androidx.constraintlayout.widget.ConstraintSet$Motion r8 = r10.motion
            int r8 = r8.mQuantizeMotionSteps
            r7.mQuantizeMotionSteps = r8
            androidx.constraintlayout.widget.ConstraintSet$Motion r8 = r10.motion
            float r8 = r8.mQuantizeMotionPhase
            r7.mQuantizeMotionPhase = r8
            android.view.View r8 = r7.mView
            android.content.Context r8 = r8.getContext()
            androidx.constraintlayout.widget.ConstraintSet$Motion r9 = r10.motion
            int r9 = r9.mQuantizeInterpolatorType
            androidx.constraintlayout.widget.ConstraintSet$Motion r11 = r10.motion
            java.lang.String r11 = r11.mQuantizeInterpolatorString
            androidx.constraintlayout.widget.ConstraintSet$Motion r10 = r10.motion
            int r10 = r10.mQuantizeInterpolatorID
            android.view.animation.Interpolator r8 = getInterpolator(r8, r9, r11, r10)
            r7.mQuantizeMotionInterpolator = r8
            return
    }

    public void setStartState(androidx.constraintlayout.motion.utils.ViewState r5, android.view.View r6, int r7, int r8, int r9) {
            r4 = this;
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r4.mStartMotionPath
            r1 = 0
            r0.time = r1
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r4.mStartMotionPath
            r0.position = r1
            android.graphics.Rect r0 = new android.graphics.Rect
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
            androidx.constraintlayout.motion.widget.MotionPaths r8 = r4.mStartMotionPath
            int r9 = r0.left
            float r9 = (float) r9
            int r1 = r0.top
            float r1 = (float) r1
            int r2 = r0.width()
            float r2 = (float) r2
            int r3 = r0.height()
            float r3 = (float) r3
            r8.setBounds(r9, r1, r2, r3)
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r8 = r4.mStartPoint
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

    public void setView(android.view.View r2) {
            r1 = this;
            r1.mView = r2
            int r0 = r2.getId()
            r1.mId = r0
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            boolean r0 = r2 instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams
            if (r0 == 0) goto L18
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r2 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r2
            java.lang.String r2 = r2.getConstraintTag()
            r1.mConstraintTag = r2
        L18:
            return
    }

    public void setup(int r17, int r18, float r19, long r20) {
            r16 = this;
            r0 = r16
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            int r5 = r0.mPathMotionArc
            int r6 = androidx.constraintlayout.motion.widget.Key.UNSET
            if (r5 == r6) goto L27
            androidx.constraintlayout.motion.widget.MotionPaths r5 = r0.mStartMotionPath
            int r6 = r0.mPathMotionArc
            r5.mPathMotionArc = r6
        L27:
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r5 = r0.mStartPoint
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r6 = r0.mEndPoint
            r5.different(r6, r2)
            java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> r5 = r0.mKeyList
            if (r5 == 0) goto L8e
            java.util.Iterator r5 = r5.iterator()
            r7 = 0
        L37:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L8f
            java.lang.Object r8 = r5.next()
            androidx.constraintlayout.motion.widget.Key r8 = (androidx.constraintlayout.motion.widget.Key) r8
            boolean r9 = r8 instanceof androidx.constraintlayout.motion.widget.KeyPosition
            if (r9 == 0) goto L66
            androidx.constraintlayout.motion.widget.KeyPosition r8 = (androidx.constraintlayout.motion.widget.KeyPosition) r8
            androidx.constraintlayout.motion.widget.MotionPaths r9 = new androidx.constraintlayout.motion.widget.MotionPaths
            androidx.constraintlayout.motion.widget.MotionPaths r14 = r0.mStartMotionPath
            androidx.constraintlayout.motion.widget.MotionPaths r15 = r0.mEndMotionPath
            r10 = r9
            r11 = r17
            r12 = r18
            r13 = r8
            r10.<init>(r11, r12, r13, r14, r15)
            r0.insertKey(r9)
            int r9 = r8.mCurveFit
            int r10 = androidx.constraintlayout.motion.widget.Key.UNSET
            if (r9 == r10) goto L37
            int r8 = r8.mCurveFit
            r0.mCurveFitType = r8
            goto L37
        L66:
            boolean r9 = r8 instanceof androidx.constraintlayout.motion.widget.KeyCycle
            if (r9 == 0) goto L6e
            r8.getAttributeNames(r3)
            goto L37
        L6e:
            boolean r9 = r8 instanceof androidx.constraintlayout.motion.widget.KeyTimeCycle
            if (r9 == 0) goto L76
            r8.getAttributeNames(r1)
            goto L37
        L76:
            boolean r9 = r8 instanceof androidx.constraintlayout.motion.widget.KeyTrigger
            if (r9 == 0) goto L87
            if (r7 != 0) goto L81
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L81:
            androidx.constraintlayout.motion.widget.KeyTrigger r8 = (androidx.constraintlayout.motion.widget.KeyTrigger) r8
            r7.add(r8)
            goto L37
        L87:
            r8.setInterpolation(r4)
            r8.getAttributeNames(r2)
            goto L37
        L8e:
            r7 = 0
        L8f:
            r5 = 0
            if (r7 == 0) goto L9c
            androidx.constraintlayout.motion.widget.KeyTrigger[] r8 = new androidx.constraintlayout.motion.widget.KeyTrigger[r5]
            java.lang.Object[] r7 = r7.toArray(r8)
            androidx.constraintlayout.motion.widget.KeyTrigger[] r7 = (androidx.constraintlayout.motion.widget.KeyTrigger[]) r7
            r0.mKeyTriggers = r7
        L9c:
            boolean r7 = r2.isEmpty()
            java.lang.String r8 = ","
            java.lang.String r9 = "CUSTOM,"
            r10 = 1
            if (r7 != 0) goto L171
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            r0.mAttributesMap = r7
            java.util.Iterator r7 = r2.iterator()
        Lb2:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto L10b
            java.lang.Object r11 = r7.next()
            java.lang.String r11 = (java.lang.String) r11
            boolean r12 = r11.startsWith(r9)
            if (r12 == 0) goto Lfb
            android.util.SparseArray r12 = new android.util.SparseArray
            r12.<init>()
            java.lang.String[] r13 = r11.split(r8)
            r13 = r13[r10]
            java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> r14 = r0.mKeyList
            java.util.Iterator r14 = r14.iterator()
        Ld5:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto Lf6
            java.lang.Object r15 = r14.next()
            androidx.constraintlayout.motion.widget.Key r15 = (androidx.constraintlayout.motion.widget.Key) r15
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r6 = r15.mCustomConstraints
            if (r6 != 0) goto Le6
            goto Ld5
        Le6:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r6 = r15.mCustomConstraints
            java.lang.Object r6 = r6.get(r13)
            androidx.constraintlayout.widget.ConstraintAttribute r6 = (androidx.constraintlayout.widget.ConstraintAttribute) r6
            if (r6 == 0) goto Ld5
            int r15 = r15.mFramePosition
            r12.append(r15, r6)
            goto Ld5
        Lf6:
            androidx.constraintlayout.motion.utils.ViewSpline r6 = androidx.constraintlayout.motion.utils.ViewSpline.makeCustomSpline(r11, r12)
            goto Lff
        Lfb:
            androidx.constraintlayout.motion.utils.ViewSpline r6 = androidx.constraintlayout.motion.utils.ViewSpline.makeSpline(r11)
        Lff:
            if (r6 != 0) goto L102
            goto Lb2
        L102:
            r6.setType(r11)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> r12 = r0.mAttributesMap
            r12.put(r11, r6)
            goto Lb2
        L10b:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> r6 = r0.mKeyList
            if (r6 == 0) goto L129
            java.util.Iterator r6 = r6.iterator()
        L113:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L129
            java.lang.Object r7 = r6.next()
            androidx.constraintlayout.motion.widget.Key r7 = (androidx.constraintlayout.motion.widget.Key) r7
            boolean r11 = r7 instanceof androidx.constraintlayout.motion.widget.KeyAttributes
            if (r11 == 0) goto L113
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> r11 = r0.mAttributesMap
            r7.addValues(r11)
            goto L113
        L129:
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r6 = r0.mStartPoint
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> r7 = r0.mAttributesMap
            r6.addValues(r7, r5)
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r6 = r0.mEndPoint
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> r7 = r0.mAttributesMap
            r11 = 100
            r6.addValues(r7, r11)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> r6 = r0.mAttributesMap
            java.util.Set r6 = r6.keySet()
            java.util.Iterator r6 = r6.iterator()
        L143:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L171
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            boolean r11 = r4.containsKey(r7)
            if (r11 == 0) goto L162
            java.lang.Object r11 = r4.get(r7)
            java.lang.Integer r11 = (java.lang.Integer) r11
            if (r11 == 0) goto L162
            int r11 = r11.intValue()
            goto L163
        L162:
            r11 = r5
        L163:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> r12 = r0.mAttributesMap
            java.lang.Object r7 = r12.get(r7)
            androidx.constraintlayout.core.motion.utils.SplineSet r7 = (androidx.constraintlayout.core.motion.utils.SplineSet) r7
            if (r7 == 0) goto L143
            r7.setup(r11)
            goto L143
        L171:
            boolean r6 = r1.isEmpty()
            if (r6 != 0) goto L240
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewTimeCycle> r6 = r0.mTimeCycleAttributesMap
            if (r6 != 0) goto L182
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            r0.mTimeCycleAttributesMap = r6
        L182:
            java.util.Iterator r1 = r1.iterator()
        L186:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L1ec
            java.lang.Object r6 = r1.next()
            java.lang.String r6 = (java.lang.String) r6
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewTimeCycle> r7 = r0.mTimeCycleAttributesMap
            boolean r7 = r7.containsKey(r6)
            if (r7 == 0) goto L19b
            goto L186
        L19b:
            boolean r7 = r6.startsWith(r9)
            if (r7 == 0) goto L1da
            android.util.SparseArray r7 = new android.util.SparseArray
            r7.<init>()
            java.lang.String[] r11 = r6.split(r8)
            r11 = r11[r10]
            java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> r12 = r0.mKeyList
            java.util.Iterator r12 = r12.iterator()
        L1b2:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L1d3
            java.lang.Object r13 = r12.next()
            androidx.constraintlayout.motion.widget.Key r13 = (androidx.constraintlayout.motion.widget.Key) r13
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r14 = r13.mCustomConstraints
            if (r14 != 0) goto L1c3
            goto L1b2
        L1c3:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r14 = r13.mCustomConstraints
            java.lang.Object r14 = r14.get(r11)
            androidx.constraintlayout.widget.ConstraintAttribute r14 = (androidx.constraintlayout.widget.ConstraintAttribute) r14
            if (r14 == 0) goto L1b2
            int r13 = r13.mFramePosition
            r7.append(r13, r14)
            goto L1b2
        L1d3:
            androidx.constraintlayout.motion.utils.ViewTimeCycle r7 = androidx.constraintlayout.motion.utils.ViewTimeCycle.makeCustomSpline(r6, r7)
            r11 = r20
            goto L1e0
        L1da:
            r11 = r20
            androidx.constraintlayout.motion.utils.ViewTimeCycle r7 = androidx.constraintlayout.motion.utils.ViewTimeCycle.makeSpline(r6, r11)
        L1e0:
            if (r7 != 0) goto L1e3
            goto L186
        L1e3:
            r7.setType(r6)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewTimeCycle> r13 = r0.mTimeCycleAttributesMap
            r13.put(r6, r7)
            goto L186
        L1ec:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> r1 = r0.mKeyList
            if (r1 == 0) goto L20c
            java.util.Iterator r1 = r1.iterator()
        L1f4:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L20c
            java.lang.Object r6 = r1.next()
            androidx.constraintlayout.motion.widget.Key r6 = (androidx.constraintlayout.motion.widget.Key) r6
            boolean r7 = r6 instanceof androidx.constraintlayout.motion.widget.KeyTimeCycle
            if (r7 == 0) goto L1f4
            androidx.constraintlayout.motion.widget.KeyTimeCycle r6 = (androidx.constraintlayout.motion.widget.KeyTimeCycle) r6
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewTimeCycle> r7 = r0.mTimeCycleAttributesMap
            r6.addTimeValues(r7)
            goto L1f4
        L20c:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewTimeCycle> r1 = r0.mTimeCycleAttributesMap
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L216:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L240
            java.lang.Object r6 = r1.next()
            java.lang.String r6 = (java.lang.String) r6
            boolean r7 = r4.containsKey(r6)
            if (r7 == 0) goto L233
            java.lang.Object r7 = r4.get(r6)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            goto L234
        L233:
            r7 = r5
        L234:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewTimeCycle> r8 = r0.mTimeCycleAttributesMap
            java.lang.Object r6 = r8.get(r6)
            androidx.constraintlayout.motion.utils.ViewTimeCycle r6 = (androidx.constraintlayout.motion.utils.ViewTimeCycle) r6
            r6.setup(r7)
            goto L216
        L240:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionPaths> r1 = r0.mMotionPaths
            int r1 = r1.size()
            r4 = 2
            int r1 = r1 + r4
            androidx.constraintlayout.motion.widget.MotionPaths[] r6 = new androidx.constraintlayout.motion.widget.MotionPaths[r1]
            androidx.constraintlayout.motion.widget.MotionPaths r7 = r0.mStartMotionPath
            r6[r5] = r7
            int r7 = r1 + (-1)
            androidx.constraintlayout.motion.widget.MotionPaths r8 = r0.mEndMotionPath
            r6[r7] = r8
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionPaths> r7 = r0.mMotionPaths
            int r7 = r7.size()
            if (r7 <= 0) goto L263
            int r7 = r0.mCurveFitType
            r8 = -1
            if (r7 != r8) goto L263
            r0.mCurveFitType = r5
        L263:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionPaths> r7 = r0.mMotionPaths
            java.util.Iterator r7 = r7.iterator()
            r8 = r10
        L26a:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto L27c
            java.lang.Object r11 = r7.next()
            androidx.constraintlayout.motion.widget.MotionPaths r11 = (androidx.constraintlayout.motion.widget.MotionPaths) r11
            int r12 = r8 + 1
            r6[r8] = r11
            r8 = r12
            goto L26a
        L27c:
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            androidx.constraintlayout.motion.widget.MotionPaths r8 = r0.mEndMotionPath
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r8 = r8.attributes
            java.util.Set r8 = r8.keySet()
            java.util.Iterator r8 = r8.iterator()
        L28d:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L2ba
            java.lang.Object r11 = r8.next()
            java.lang.String r11 = (java.lang.String) r11
            androidx.constraintlayout.motion.widget.MotionPaths r12 = r0.mStartMotionPath
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r12 = r12.attributes
            boolean r12 = r12.containsKey(r11)
            if (r12 == 0) goto L28d
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r9)
            java.lang.StringBuilder r12 = r12.append(r11)
            java.lang.String r12 = r12.toString()
            boolean r12 = r2.contains(r12)
            if (r12 != 0) goto L28d
            r7.add(r11)
            goto L28d
        L2ba:
            java.lang.String[] r2 = new java.lang.String[r5]
            java.lang.Object[] r2 = r7.toArray(r2)
            java.lang.String[] r2 = (java.lang.String[]) r2
            r0.mAttributeNames = r2
            int r2 = r2.length
            int[] r2 = new int[r2]
            r0.mAttributeInterpolatorCount = r2
            r2 = r5
        L2ca:
            java.lang.String[] r7 = r0.mAttributeNames
            int r8 = r7.length
            if (r2 >= r8) goto L300
            r7 = r7[r2]
            int[] r8 = r0.mAttributeInterpolatorCount
            r8[r2] = r5
            r8 = r5
        L2d6:
            if (r8 >= r1) goto L2fd
            r9 = r6[r8]
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r9 = r9.attributes
            boolean r9 = r9.containsKey(r7)
            if (r9 == 0) goto L2fa
            r9 = r6[r8]
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r9 = r9.attributes
            java.lang.Object r9 = r9.get(r7)
            androidx.constraintlayout.widget.ConstraintAttribute r9 = (androidx.constraintlayout.widget.ConstraintAttribute) r9
            if (r9 == 0) goto L2fa
            int[] r7 = r0.mAttributeInterpolatorCount
            r8 = r7[r2]
            int r9 = r9.numberOfInterpolatedValues()
            int r8 = r8 + r9
            r7[r2] = r8
            goto L2fd
        L2fa:
            int r8 = r8 + 1
            goto L2d6
        L2fd:
            int r2 = r2 + 1
            goto L2ca
        L300:
            r2 = r6[r5]
            int r2 = r2.mPathMotionArc
            int r7 = androidx.constraintlayout.motion.widget.Key.UNSET
            if (r2 == r7) goto L30a
            r2 = r10
            goto L30b
        L30a:
            r2 = r5
        L30b:
            java.lang.String[] r7 = r0.mAttributeNames
            int r7 = r7.length
            r8 = 18
            int r8 = r8 + r7
            boolean[] r7 = new boolean[r8]
            r9 = r10
        L314:
            if (r9 >= r1) goto L324
            r11 = r6[r9]
            int r12 = r9 + (-1)
            r12 = r6[r12]
            java.lang.String[] r13 = r0.mAttributeNames
            r11.different(r12, r7, r13, r2)
            int r9 = r9 + 1
            goto L314
        L324:
            r9 = r5
            r2 = r10
        L326:
            if (r2 >= r8) goto L331
            boolean r11 = r7[r2]
            if (r11 == 0) goto L32e
            int r9 = r9 + 1
        L32e:
            int r2 = r2 + 1
            goto L326
        L331:
            int[] r2 = new int[r9]
            r0.mInterpolateVariables = r2
            int r2 = java.lang.Math.max(r4, r9)
            double[] r9 = new double[r2]
            r0.mInterpolateData = r9
            double[] r2 = new double[r2]
            r0.mInterpolateVelocity = r2
            r9 = r5
            r2 = r10
        L343:
            if (r2 >= r8) goto L353
            boolean r11 = r7[r2]
            if (r11 == 0) goto L350
            int[] r11 = r0.mInterpolateVariables
            int r12 = r9 + 1
            r11[r9] = r2
            r9 = r12
        L350:
            int r2 = r2 + 1
            goto L343
        L353:
            int[] r2 = r0.mInterpolateVariables
            int r2 = r2.length
            int[] r7 = new int[r4]
            r7[r10] = r2
            r7[r5] = r1
            java.lang.Class r2 = java.lang.Double.TYPE
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r2, r7)
            double[][] r2 = (double[][]) r2
            double[] r7 = new double[r1]
            r8 = r5
        L367:
            if (r8 >= r1) goto L37c
            r9 = r6[r8]
            r11 = r2[r8]
            int[] r12 = r0.mInterpolateVariables
            r9.fillStandard(r11, r12)
            r9 = r6[r8]
            float r9 = r9.time
            double r11 = (double) r9
            r7[r8] = r11
            int r8 = r8 + 1
            goto L367
        L37c:
            r8 = r5
        L37d:
            int[] r9 = r0.mInterpolateVariables
            int r11 = r9.length
            if (r8 >= r11) goto L3c2
            r9 = r9[r8]
            java.lang.String[] r11 = androidx.constraintlayout.motion.widget.MotionPaths.names
            int r11 = r11.length
            if (r9 >= r11) goto L3bf
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String[] r11 = androidx.constraintlayout.motion.widget.MotionPaths.names
            int[] r12 = r0.mInterpolateVariables
            r12 = r12[r8]
            r11 = r11[r12]
            java.lang.StringBuilder r9 = r9.append(r11)
            java.lang.String r11 = " ["
            java.lang.StringBuilder r9 = r9.append(r11)
            java.lang.String r9 = r9.toString()
            r11 = r5
        L3a5:
            if (r11 >= r1) goto L3bf
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.StringBuilder r9 = r12.append(r9)
            r12 = r2[r11]
            r13 = r12[r8]
            java.lang.StringBuilder r9 = r9.append(r13)
            java.lang.String r9 = r9.toString()
            int r11 = r11 + 1
            goto L3a5
        L3bf:
            int r8 = r8 + 1
            goto L37d
        L3c2:
            java.lang.String[] r8 = r0.mAttributeNames
            int r8 = r8.length
            int r8 = r8 + r10
            androidx.constraintlayout.core.motion.utils.CurveFit[] r8 = new androidx.constraintlayout.core.motion.utils.CurveFit[r8]
            r0.mSpline = r8
            r8 = r5
        L3cb:
            java.lang.String[] r9 = r0.mAttributeNames
            int r11 = r9.length
            if (r8 >= r11) goto L427
            r9 = r9[r8]
            r11 = r5
            r13 = r11
            r12 = 0
            r14 = 0
        L3d6:
            if (r11 >= r1) goto L40e
            r15 = r6[r11]
            boolean r15 = r15.hasCustomData(r9)
            if (r15 == 0) goto L409
            if (r14 != 0) goto L3f8
            double[] r12 = new double[r1]
            r14 = r6[r11]
            int r14 = r14.getCustomDataCount(r9)
            int[] r15 = new int[r4]
            r15[r10] = r14
            r15[r5] = r1
            java.lang.Class r14 = java.lang.Double.TYPE
            java.lang.Object r14 = java.lang.reflect.Array.newInstance(r14, r15)
            double[][] r14 = (double[][]) r14
        L3f8:
            r15 = r6[r11]
            float r15 = r15.time
            double r4 = (double) r15
            r12[r13] = r4
            r4 = r6[r11]
            r5 = r14[r13]
            r15 = 0
            r4.getCustomData(r9, r5, r15)
            int r13 = r13 + 1
        L409:
            int r11 = r11 + 1
            r4 = 2
            r5 = 0
            goto L3d6
        L40e:
            double[] r4 = java.util.Arrays.copyOf(r12, r13)
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r14, r13)
            double[][] r5 = (double[][]) r5
            androidx.constraintlayout.core.motion.utils.CurveFit[] r9 = r0.mSpline
            int r8 = r8 + 1
            int r11 = r0.mCurveFitType
            androidx.constraintlayout.core.motion.utils.CurveFit r4 = androidx.constraintlayout.core.motion.utils.CurveFit.get(r11, r4, r5)
            r9[r8] = r4
            r4 = 2
            r5 = 0
            goto L3cb
        L427:
            androidx.constraintlayout.core.motion.utils.CurveFit[] r4 = r0.mSpline
            int r5 = r0.mCurveFitType
            androidx.constraintlayout.core.motion.utils.CurveFit r2 = androidx.constraintlayout.core.motion.utils.CurveFit.get(r5, r7, r2)
            r5 = 0
            r4[r5] = r2
            r2 = r6[r5]
            int r2 = r2.mPathMotionArc
            int r4 = androidx.constraintlayout.motion.widget.Key.UNSET
            if (r2 == r4) goto L479
            int[] r2 = new int[r1]
            double[] r4 = new double[r1]
            r7 = 2
            int[] r8 = new int[r7]
            r8[r10] = r7
            r8[r5] = r1
            java.lang.Class r5 = java.lang.Double.TYPE
            java.lang.Object r5 = java.lang.reflect.Array.newInstance(r5, r8)
            double[][] r5 = (double[][]) r5
            r15 = 0
        L44e:
            if (r15 >= r1) goto L473
            r7 = r6[r15]
            int r7 = r7.mPathMotionArc
            r2[r15] = r7
            r7 = r6[r15]
            float r7 = r7.time
            double r7 = (double) r7
            r4[r15] = r7
            r7 = r5[r15]
            r8 = r6[r15]
            float r8 = r8.f54x
            double r8 = (double) r8
            r11 = 0
            r7[r11] = r8
            r7 = r5[r15]
            r8 = r6[r15]
            float r8 = r8.f55y
            double r8 = (double) r8
            r7[r10] = r8
            int r15 = r15 + 1
            goto L44e
        L473:
            androidx.constraintlayout.core.motion.utils.CurveFit r1 = androidx.constraintlayout.core.motion.utils.CurveFit.getArc(r2, r4, r5)
            r0.mArcSpline = r1
        L479:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.mCycleMap = r1
            java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> r1 = r0.mKeyList
            if (r1 == 0) goto L4ee
            java.util.Iterator r1 = r3.iterator()
            r2 = 2143289344(0x7fc00000, float:NaN)
        L48a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L4b6
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            androidx.constraintlayout.motion.utils.ViewOscillator r4 = androidx.constraintlayout.motion.utils.ViewOscillator.makeSpline(r3)
            if (r4 != 0) goto L49d
            goto L48a
        L49d:
            boolean r5 = r4.variesByPath()
            if (r5 == 0) goto L4ad
            boolean r5 = java.lang.Float.isNaN(r2)
            if (r5 == 0) goto L4ad
            float r2 = r16.getPreCycleDistance()
        L4ad:
            r4.setType(r3)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewOscillator> r5 = r0.mCycleMap
            r5.put(r3, r4)
            goto L48a
        L4b6:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> r1 = r0.mKeyList
            java.util.Iterator r1 = r1.iterator()
        L4bc:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L4d4
            java.lang.Object r3 = r1.next()
            androidx.constraintlayout.motion.widget.Key r3 = (androidx.constraintlayout.motion.widget.Key) r3
            boolean r4 = r3 instanceof androidx.constraintlayout.motion.widget.KeyCycle
            if (r4 == 0) goto L4bc
            androidx.constraintlayout.motion.widget.KeyCycle r3 = (androidx.constraintlayout.motion.widget.KeyCycle) r3
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewOscillator> r4 = r0.mCycleMap
            r3.addCycleValues(r4)
            goto L4bc
        L4d4:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewOscillator> r1 = r0.mCycleMap
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L4de:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L4ee
            java.lang.Object r3 = r1.next()
            androidx.constraintlayout.motion.utils.ViewOscillator r3 = (androidx.constraintlayout.motion.utils.ViewOscillator) r3
            r3.setup(r2)
            goto L4de
        L4ee:
            return
    }

    public void setupRelative(androidx.constraintlayout.motion.widget.MotionController r3) {
            r2 = this;
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r2.mStartMotionPath
            androidx.constraintlayout.motion.widget.MotionPaths r1 = r3.mStartMotionPath
            r0.setupRelative(r3, r1)
            androidx.constraintlayout.motion.widget.MotionPaths r0 = r2.mEndMotionPath
            androidx.constraintlayout.motion.widget.MotionPaths r1 = r3.mEndMotionPath
            r0.setupRelative(r3, r1)
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = " start: x: "
            r0.<init>(r1)
            androidx.constraintlayout.motion.widget.MotionPaths r1 = r3.mStartMotionPath
            float r1 = r1.f54x
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " y: "
            java.lang.StringBuilder r0 = r0.append(r1)
            androidx.constraintlayout.motion.widget.MotionPaths r2 = r3.mStartMotionPath
            float r2 = r2.f55y
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r2 = " end: x: "
            java.lang.StringBuilder r0 = r0.append(r2)
            androidx.constraintlayout.motion.widget.MotionPaths r2 = r3.mEndMotionPath
            float r2 = r2.f54x
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            androidx.constraintlayout.motion.widget.MotionPaths r1 = r3.mEndMotionPath
            float r1 = r1.f55y
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
