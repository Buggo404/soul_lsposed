package androidx.constraintlayout.motion.widget;

/* loaded from: classes.dex */
public class MotionLayout extends androidx.constraintlayout.widget.ConstraintLayout implements androidx.core.view.NestedScrollingParent3 {
    private static final boolean DEBUG = false;
    public static final int DEBUG_SHOW_NONE = 0;
    public static final int DEBUG_SHOW_PATH = 2;
    public static final int DEBUG_SHOW_PROGRESS = 1;
    private static final float EPSILON = 1.0E-5f;
    public static boolean IS_IN_EDIT_MODE = false;
    static final int MAX_KEY_FRAMES = 50;
    static final java.lang.String TAG = "MotionLayout";
    public static final int TOUCH_UP_COMPLETE = 0;
    public static final int TOUCH_UP_COMPLETE_TO_END = 2;
    public static final int TOUCH_UP_COMPLETE_TO_START = 1;
    public static final int TOUCH_UP_DECELERATE = 4;
    public static final int TOUCH_UP_DECELERATE_AND_COMPLETE = 5;
    public static final int TOUCH_UP_NEVER_TO_END = 7;
    public static final int TOUCH_UP_NEVER_TO_START = 6;
    public static final int TOUCH_UP_STOP = 3;
    public static final int VELOCITY_LAYOUT = 1;
    public static final int VELOCITY_POST_LAYOUT = 0;
    public static final int VELOCITY_STATIC_LAYOUT = 3;
    public static final int VELOCITY_STATIC_POST_LAYOUT = 2;
    boolean firstDown;
    private float lastPos;
    private float lastY;
    private long mAnimationStartTime;
    private int mBeginState;
    private android.graphics.RectF mBoundsCheck;
    int mCurrentState;
    int mDebugPath;
    private androidx.constraintlayout.motion.widget.MotionLayout.DecelerateInterpolator mDecelerateLogic;
    private java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> mDecoratorsHelpers;
    private boolean mDelayedApply;
    private androidx.constraintlayout.motion.widget.DesignTool mDesignTool;
    androidx.constraintlayout.motion.widget.MotionLayout.DevModeDraw mDevModeDraw;
    private int mEndState;
    int mEndWrapHeight;
    int mEndWrapWidth;
    java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> mFrameArrayList;
    private int mFrames;
    int mHeightMeasureMode;
    private boolean mInLayout;
    private boolean mInRotation;
    boolean mInTransition;
    boolean mIndirectTransition;
    private boolean mInteractionEnabled;
    android.view.animation.Interpolator mInterpolator;
    private android.graphics.Matrix mInverseMatrix;
    boolean mIsAnimating;
    private boolean mKeepAnimating;
    private androidx.constraintlayout.core.motion.utils.KeyCache mKeyCache;
    private long mLastDrawTime;
    private float mLastFps;
    private int mLastHeightMeasureSpec;
    int mLastLayoutHeight;
    int mLastLayoutWidth;
    float mLastVelocity;
    private int mLastWidthMeasureSpec;
    private float mListenerPosition;
    private int mListenerState;
    protected boolean mMeasureDuringTransition;
    androidx.constraintlayout.motion.widget.MotionLayout.Model mModel;
    private boolean mNeedsFireTransitionCompleted;
    int mOldHeight;
    int mOldWidth;
    private java.lang.Runnable mOnComplete;
    private java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> mOnHideHelpers;
    private java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> mOnShowHelpers;
    float mPostInterpolationPosition;
    java.util.HashMap<android.view.View, androidx.constraintlayout.motion.utils.ViewState> mPreRotate;
    private int mPreRotateHeight;
    private int mPreRotateWidth;
    private int mPreviouseRotation;
    android.view.animation.Interpolator mProgressInterpolator;
    private android.view.View mRegionView;
    int mRotatMode;
    androidx.constraintlayout.motion.widget.MotionScene mScene;
    private int[] mScheduledTransitionTo;
    int mScheduledTransitions;
    float mScrollTargetDT;
    float mScrollTargetDX;
    float mScrollTargetDY;
    long mScrollTargetTime;
    int mStartWrapHeight;
    int mStartWrapWidth;
    private androidx.constraintlayout.motion.widget.MotionLayout.StateCache mStateCache;
    private androidx.constraintlayout.motion.utils.StopLogic mStopLogic;
    android.graphics.Rect mTempRect;
    private boolean mTemporalInterpolator;
    java.util.ArrayList<java.lang.Integer> mTransitionCompleted;
    private float mTransitionDuration;
    float mTransitionGoalPosition;
    private boolean mTransitionInstantly;
    float mTransitionLastPosition;
    private long mTransitionLastTime;
    private androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener mTransitionListener;
    private java.util.concurrent.CopyOnWriteArrayList<androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener> mTransitionListeners;
    float mTransitionPosition;
    androidx.constraintlayout.motion.widget.MotionLayout.TransitionState mTransitionState;
    boolean mUndergoingMotion;
    int mWidthMeasureMode;





    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$5 */
    static /* synthetic */ class C01405 {

        /* renamed from: $SwitchMap$androidx$constraintlayout$motion$widget$MotionLayout$TransitionState */
        static final /* synthetic */ int[] f52xabc7e4ac = null;

        static {
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState[] r0 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.constraintlayout.motion.widget.MotionLayout.C01405.f52xabc7e4ac = r0
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r1 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.UNDEFINED     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.constraintlayout.motion.widget.MotionLayout.C01405.f52xabc7e4ac     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r1 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.SETUP     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.constraintlayout.motion.widget.MotionLayout.C01405.f52xabc7e4ac     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r1 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = androidx.constraintlayout.motion.widget.MotionLayout.C01405.f52xabc7e4ac     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r1 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }

    class DecelerateInterpolator extends androidx.constraintlayout.motion.widget.MotionInterpolator {
        float currentP;
        float initalV;
        float maxA;
        final /* synthetic */ androidx.constraintlayout.motion.widget.MotionLayout this$0;

        DecelerateInterpolator(androidx.constraintlayout.motion.widget.MotionLayout r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r1 = 0
                r0.initalV = r1
                r0.currentP = r1
                return
        }

        public void config(float r1, float r2, float r3) {
                r0 = this;
                r0.initalV = r1
                r0.currentP = r2
                r0.maxA = r3
                return
        }

        @Override // androidx.constraintlayout.motion.widget.MotionInterpolator, android.animation.TimeInterpolator
        public float getInterpolation(float r5) {
                r4 = this;
                float r0 = r4.initalV
                r1 = 0
                int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                r2 = 1073741824(0x40000000, float:2.0)
                if (r1 <= 0) goto L26
                float r1 = r4.maxA
                float r3 = r0 / r1
                int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r3 >= 0) goto L13
                float r5 = r0 / r1
            L13:
                androidx.constraintlayout.motion.widget.MotionLayout r3 = r4.this$0
                float r1 = r1 * r5
                float r0 = r0 - r1
                r3.mLastVelocity = r0
                float r0 = r4.initalV
                float r0 = r0 * r5
                float r1 = r4.maxA
                float r1 = r1 * r5
                float r1 = r1 * r5
                float r1 = r1 / r2
                float r0 = r0 - r1
                float r5 = r4.currentP
            L24:
                float r0 = r0 + r5
                return r0
            L26:
                float r1 = -r0
                float r3 = r4.maxA
                float r1 = r1 / r3
                int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r1 >= 0) goto L30
                float r5 = -r0
                float r5 = r5 / r3
            L30:
                androidx.constraintlayout.motion.widget.MotionLayout r1 = r4.this$0
                float r3 = r3 * r5
                float r0 = r0 + r3
                r1.mLastVelocity = r0
                float r0 = r4.initalV
                float r0 = r0 * r5
                float r1 = r4.maxA
                float r1 = r1 * r5
                float r1 = r1 * r5
                float r1 = r1 / r2
                float r0 = r0 + r1
                float r5 = r4.currentP
                goto L24
        }

        @Override // androidx.constraintlayout.motion.widget.MotionInterpolator
        public float getVelocity() {
                r1 = this;
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r1.this$0
                float r0 = r0.mLastVelocity
                return r0
        }
    }

    private class DevModeDraw {
        private static final int DEBUG_PATH_TICKS_PER_MS = 16;
        final int DIAMOND_SIZE;
        final int GRAPH_COLOR;
        final int KEYFRAME_COLOR;
        final int RED_COLOR;
        final int SHADOW_COLOR;
        android.graphics.Rect mBounds;
        android.graphics.DashPathEffect mDashPathEffect;
        android.graphics.Paint mFillPaint;
        int mKeyFrameCount;
        float[] mKeyFramePoints;
        android.graphics.Paint mPaint;
        android.graphics.Paint mPaintGraph;
        android.graphics.Paint mPaintKeyframes;
        android.graphics.Path mPath;
        int[] mPathMode;
        float[] mPoints;
        boolean mPresentationMode;
        private float[] mRectangle;
        int mShadowTranslate;
        android.graphics.Paint mTextPaint;
        final /* synthetic */ androidx.constraintlayout.motion.widget.MotionLayout this$0;

        public DevModeDraw(androidx.constraintlayout.motion.widget.MotionLayout r7) {
                r6 = this;
                r6.this$0 = r7
                r6.<init>()
                r0 = -21965(0xffffffffffffaa33, float:NaN)
                r6.RED_COLOR = r0
                r1 = -2067046(0xffffffffffe0759a, float:NaN)
                r6.KEYFRAME_COLOR = r1
                r2 = -13391360(0xffffffffff33aa00, float:-2.388145E38)
                r6.GRAPH_COLOR = r2
                r3 = 1996488704(0x77000000, float:2.5961484E33)
                r6.SHADOW_COLOR = r3
                r3 = 10
                r6.DIAMOND_SIZE = r3
                android.graphics.Rect r3 = new android.graphics.Rect
                r3.<init>()
                r6.mBounds = r3
                r3 = 0
                r6.mPresentationMode = r3
                r3 = 1
                r6.mShadowTranslate = r3
                android.graphics.Paint r4 = new android.graphics.Paint
                r4.<init>()
                r6.mPaint = r4
                r4.setAntiAlias(r3)
                android.graphics.Paint r4 = r6.mPaint
                r4.setColor(r0)
                android.graphics.Paint r0 = r6.mPaint
                r4 = 1073741824(0x40000000, float:2.0)
                r0.setStrokeWidth(r4)
                android.graphics.Paint r0 = r6.mPaint
                android.graphics.Paint$Style r5 = android.graphics.Paint.Style.STROKE
                r0.setStyle(r5)
                android.graphics.Paint r0 = new android.graphics.Paint
                r0.<init>()
                r6.mPaintKeyframes = r0
                r0.setAntiAlias(r3)
                android.graphics.Paint r0 = r6.mPaintKeyframes
                r0.setColor(r1)
                android.graphics.Paint r0 = r6.mPaintKeyframes
                r0.setStrokeWidth(r4)
                android.graphics.Paint r0 = r6.mPaintKeyframes
                android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
                r0.setStyle(r1)
                android.graphics.Paint r0 = new android.graphics.Paint
                r0.<init>()
                r6.mPaintGraph = r0
                r0.setAntiAlias(r3)
                android.graphics.Paint r0 = r6.mPaintGraph
                r0.setColor(r2)
                android.graphics.Paint r0 = r6.mPaintGraph
                r0.setStrokeWidth(r4)
                android.graphics.Paint r0 = r6.mPaintGraph
                android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
                r0.setStyle(r1)
                android.graphics.Paint r0 = new android.graphics.Paint
                r0.<init>()
                r6.mTextPaint = r0
                r0.setAntiAlias(r3)
                android.graphics.Paint r0 = r6.mTextPaint
                r0.setColor(r2)
                android.graphics.Paint r0 = r6.mTextPaint
                android.content.Context r7 = r7.getContext()
                android.content.res.Resources r7 = r7.getResources()
                android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
                float r7 = r7.density
                r1 = 1094713344(0x41400000, float:12.0)
                float r7 = r7 * r1
                r0.setTextSize(r7)
                r7 = 8
                float[] r7 = new float[r7]
                r6.mRectangle = r7
                android.graphics.Paint r7 = new android.graphics.Paint
                r7.<init>()
                r6.mFillPaint = r7
                r7.setAntiAlias(r3)
                android.graphics.DashPathEffect r7 = new android.graphics.DashPathEffect
                r0 = 2
                float[] r0 = new float[r0]
                r0 = {x00e8: FILL_ARRAY_DATA , data: [1082130432, 1090519040} // fill-array
                r1 = 0
                r7.<init>(r0, r1)
                r6.mDashPathEffect = r7
                android.graphics.Paint r0 = r6.mPaintGraph
                r0.setPathEffect(r7)
                r7 = 100
                float[] r7 = new float[r7]
                r6.mKeyFramePoints = r7
                r7 = 50
                int[] r7 = new int[r7]
                r6.mPathMode = r7
                boolean r7 = r6.mPresentationMode
                if (r7 == 0) goto Le7
                android.graphics.Paint r7 = r6.mPaint
                r0 = 1090519040(0x41000000, float:8.0)
                r7.setStrokeWidth(r0)
                android.graphics.Paint r7 = r6.mFillPaint
                r7.setStrokeWidth(r0)
                android.graphics.Paint r7 = r6.mPaintKeyframes
                r7.setStrokeWidth(r0)
                r7 = 4
                r6.mShadowTranslate = r7
            Le7:
                return
        }

        private void drawBasicPath(android.graphics.Canvas r3) {
                r2 = this;
                float[] r0 = r2.mPoints
                android.graphics.Paint r1 = r2.mPaint
                r3.drawLines(r0, r1)
                return
        }

        private void drawPathAsConfigured(android.graphics.Canvas r6) {
                r5 = this;
                r0 = 0
                r1 = r0
                r2 = r1
            L3:
                int r3 = r5.mKeyFrameCount
                if (r0 >= r3) goto L15
                int[] r3 = r5.mPathMode
                r3 = r3[r0]
                r4 = 1
                if (r3 != r4) goto Lf
                r1 = r4
            Lf:
                if (r3 != 0) goto L12
                r2 = r4
            L12:
                int r0 = r0 + 1
                goto L3
            L15:
                if (r1 == 0) goto L1a
                r5.drawPathRelative(r6)
            L1a:
                if (r2 == 0) goto L1f
                r5.drawPathCartesian(r6)
            L1f:
                return
        }

        private void drawPathCartesian(android.graphics.Canvas r19) {
                r18 = this;
                r0 = r18
                float[] r1 = r0.mPoints
                r2 = 0
                r2 = r1[r2]
                r3 = 1
                r4 = r1[r3]
                int r5 = r1.length
                int r5 = r5 + (-2)
                r5 = r1[r5]
                int r6 = r1.length
                int r6 = r6 - r3
                r1 = r1[r6]
                float r7 = java.lang.Math.min(r2, r5)
                float r8 = java.lang.Math.max(r4, r1)
                float r9 = java.lang.Math.max(r2, r5)
                float r10 = java.lang.Math.max(r4, r1)
                android.graphics.Paint r11 = r0.mPaintGraph
                r6 = r19
                r6.drawLine(r7, r8, r9, r10, r11)
                float r13 = java.lang.Math.min(r2, r5)
                float r14 = java.lang.Math.min(r4, r1)
                float r15 = java.lang.Math.min(r2, r5)
                float r16 = java.lang.Math.max(r4, r1)
                android.graphics.Paint r1 = r0.mPaintGraph
                r12 = r19
                r17 = r1
                r12.drawLine(r13, r14, r15, r16, r17)
                return
        }

        private void drawPathCartesianTicks(android.graphics.Canvas r19, float r20, float r21) {
                r18 = this;
                r0 = r18
                r7 = r19
                float[] r1 = r0.mPoints
                r2 = 0
                r2 = r1[r2]
                r3 = 1
                r8 = r1[r3]
                int r4 = r1.length
                int r4 = r4 + (-2)
                r4 = r1[r4]
                int r5 = r1.length
                int r5 = r5 - r3
                r9 = r1[r5]
                float r1 = java.lang.Math.min(r2, r4)
                float r10 = java.lang.Math.max(r8, r9)
                float r3 = java.lang.Math.min(r2, r4)
                float r3 = r20 - r3
                float r5 = java.lang.Math.max(r8, r9)
                float r11 = r5 - r21
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                java.lang.String r12 = ""
                r5.<init>(r12)
                r13 = 1120403456(0x42c80000, float:100.0)
                float r6 = r3 * r13
                float r14 = r4 - r2
                float r14 = java.lang.Math.abs(r14)
                float r6 = r6 / r14
                double r14 = (double) r6
                r16 = 4602678819172646912(0x3fe0000000000000, double:0.5)
                double r14 = r14 + r16
                int r6 = (int) r14
                float r6 = (float) r6
                float r6 = r6 / r13
                java.lang.StringBuilder r5 = r5.append(r6)
                java.lang.String r5 = r5.toString()
                android.graphics.Paint r6 = r0.mTextPaint
                r0.getTextBounds(r5, r6)
                r14 = 1073741824(0x40000000, float:2.0)
                float r3 = r3 / r14
                android.graphics.Rect r6 = r0.mBounds
                int r6 = r6.width()
                int r6 = r6 / 2
                float r6 = (float) r6
                float r3 = r3 - r6
                float r3 = r3 + r1
                r1 = 1101004800(0x41a00000, float:20.0)
                float r1 = r21 - r1
                android.graphics.Paint r6 = r0.mTextPaint
                r7.drawText(r5, r3, r1, r6)
                float r4 = java.lang.Math.min(r2, r4)
                android.graphics.Paint r6 = r0.mPaintGraph
                r1 = r19
                r2 = r20
                r3 = r21
                r5 = r21
                r1.drawLine(r2, r3, r4, r5, r6)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r12)
                float r2 = r11 * r13
                float r3 = r9 - r8
                float r3 = java.lang.Math.abs(r3)
                float r2 = r2 / r3
                double r2 = (double) r2
                double r2 = r2 + r16
                int r2 = (int) r2
                float r2 = (float) r2
                float r2 = r2 / r13
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                android.graphics.Paint r2 = r0.mTextPaint
                r0.getTextBounds(r1, r2)
                float r11 = r11 / r14
                android.graphics.Rect r2 = r0.mBounds
                int r2 = r2.height()
                int r2 = r2 / 2
                float r2 = (float) r2
                float r11 = r11 - r2
                r2 = 1084227584(0x40a00000, float:5.0)
                float r2 = r20 + r2
                float r10 = r10 - r11
                android.graphics.Paint r3 = r0.mTextPaint
                r7.drawText(r1, r2, r10, r3)
                float r5 = java.lang.Math.max(r8, r9)
                android.graphics.Paint r6 = r0.mPaintGraph
                r1 = r19
                r2 = r20
                r3 = r21
                r4 = r20
                r1.drawLine(r2, r3, r4, r5, r6)
                return
        }

        private void drawPathRelative(android.graphics.Canvas r9) {
                r8 = this;
                float[] r0 = r8.mPoints
                r1 = 0
                r3 = r0[r1]
                r1 = 1
                r4 = r0[r1]
                int r2 = r0.length
                int r2 = r2 + (-2)
                r5 = r0[r2]
                int r2 = r0.length
                int r2 = r2 - r1
                r6 = r0[r2]
                android.graphics.Paint r7 = r8.mPaintGraph
                r2 = r9
                r2.drawLine(r3, r4, r5, r6, r7)
                return
        }

        private void drawPathRelativeTicks(android.graphics.Canvas r13, float r14, float r15) {
                r12 = this;
                float[] r0 = r12.mPoints
                r1 = 0
                r1 = r0[r1]
                r2 = 1
                r3 = r0[r2]
                int r4 = r0.length
                int r4 = r4 + (-2)
                r4 = r0[r4]
                int r5 = r0.length
                int r5 = r5 - r2
                r0 = r0[r5]
                float r2 = r1 - r4
                double r5 = (double) r2
                float r2 = r3 - r0
                double r7 = (double) r2
                double r5 = java.lang.Math.hypot(r5, r7)
                float r2 = (float) r5
                float r5 = r14 - r1
                float r4 = r4 - r1
                float r5 = r5 * r4
                float r6 = r15 - r3
                float r0 = r0 - r3
                float r6 = r6 * r0
                float r5 = r5 + r6
                float r6 = r2 * r2
                float r5 = r5 / r6
                float r4 = r4 * r5
                float r9 = r1 + r4
                float r5 = r5 * r0
                float r10 = r3 + r5
                android.graphics.Path r5 = new android.graphics.Path
                r5.<init>()
                r5.moveTo(r14, r15)
                r5.lineTo(r9, r10)
                float r0 = r9 - r14
                double r0 = (double) r0
                float r3 = r10 - r15
                double r3 = (double) r3
                double r0 = java.lang.Math.hypot(r0, r3)
                float r0 = (float) r0
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r3 = ""
                r1.<init>(r3)
                r3 = 1120403456(0x42c80000, float:100.0)
                float r4 = r0 * r3
                float r4 = r4 / r2
                int r2 = (int) r4
                float r2 = (float) r2
                float r2 = r2 / r3
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r4 = r1.toString()
                android.graphics.Paint r1 = r12.mTextPaint
                r12.getTextBounds(r4, r1)
                r1 = 1073741824(0x40000000, float:2.0)
                float r0 = r0 / r1
                android.graphics.Rect r1 = r12.mBounds
                int r1 = r1.width()
                int r1 = r1 / 2
                float r1 = (float) r1
                float r6 = r0 - r1
                r7 = -1046478848(0xffffffffc1a00000, float:-20.0)
                android.graphics.Paint r8 = r12.mTextPaint
                r3 = r13
                r3.drawTextOnPath(r4, r5, r6, r7, r8)
                android.graphics.Paint r11 = r12.mPaintGraph
                r6 = r13
                r7 = r14
                r8 = r15
                r6.drawLine(r7, r8, r9, r10, r11)
                return
        }

        private void drawPathScreenTicks(android.graphics.Canvas r16, float r17, float r18, int r19, int r20) {
                r15 = this;
                r0 = r15
                r7 = r16
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r8 = ""
                r1.<init>(r8)
                int r2 = r19 / 2
                float r2 = (float) r2
                float r2 = r17 - r2
                r9 = 1120403456(0x42c80000, float:100.0)
                float r2 = r2 * r9
                androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.this$0
                int r3 = r3.getWidth()
                int r3 = r3 - r19
                float r3 = (float) r3
                float r2 = r2 / r3
                double r2 = (double) r2
                r10 = 4602678819172646912(0x3fe0000000000000, double:0.5)
                double r2 = r2 + r10
                int r2 = (int) r2
                float r2 = (float) r2
                float r2 = r2 / r9
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                android.graphics.Paint r2 = r0.mTextPaint
                r15.getTextBounds(r1, r2)
                r12 = 1073741824(0x40000000, float:2.0)
                float r2 = r17 / r12
                android.graphics.Rect r3 = r0.mBounds
                int r3 = r3.width()
                int r3 = r3 / 2
                float r3 = (float) r3
                float r2 = r2 - r3
                r13 = 0
                float r2 = r2 + r13
                r3 = 1101004800(0x41a00000, float:20.0)
                float r3 = r18 - r3
                android.graphics.Paint r4 = r0.mTextPaint
                r7.drawText(r1, r2, r3, r4)
                r14 = 1065353216(0x3f800000, float:1.0)
                float r4 = java.lang.Math.min(r13, r14)
                android.graphics.Paint r6 = r0.mPaintGraph
                r1 = r16
                r2 = r17
                r3 = r18
                r5 = r18
                r1.drawLine(r2, r3, r4, r5, r6)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r8)
                int r2 = r20 / 2
                float r2 = (float) r2
                float r2 = r18 - r2
                float r2 = r2 * r9
                androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.this$0
                int r3 = r3.getHeight()
                int r3 = r3 - r20
                float r3 = (float) r3
                float r2 = r2 / r3
                double r2 = (double) r2
                double r2 = r2 + r10
                int r2 = (int) r2
                float r2 = (float) r2
                float r2 = r2 / r9
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                android.graphics.Paint r2 = r0.mTextPaint
                r15.getTextBounds(r1, r2)
                float r2 = r18 / r12
                android.graphics.Rect r3 = r0.mBounds
                int r3 = r3.height()
                int r3 = r3 / 2
                float r3 = (float) r3
                float r2 = r2 - r3
                r3 = 1084227584(0x40a00000, float:5.0)
                float r3 = r17 + r3
                float r2 = r13 - r2
                android.graphics.Paint r4 = r0.mTextPaint
                r7.drawText(r1, r3, r2, r4)
                float r5 = java.lang.Math.max(r13, r14)
                android.graphics.Paint r6 = r0.mPaintGraph
                r1 = r16
                r2 = r17
                r3 = r18
                r4 = r17
                r1.drawLine(r2, r3, r4, r5, r6)
                return
        }

        private void drawRectangle(android.graphics.Canvas r7, androidx.constraintlayout.motion.widget.MotionController r8) {
                r6 = this;
                android.graphics.Path r0 = r6.mPath
                r0.reset()
                r0 = 0
                r1 = r0
            L7:
                r2 = 50
                if (r1 > r2) goto L4e
                float r3 = (float) r1
                float r2 = (float) r2
                float r3 = r3 / r2
                float[] r2 = r6.mRectangle
                r8.buildRect(r3, r2, r0)
                android.graphics.Path r2 = r6.mPath
                float[] r3 = r6.mRectangle
                r4 = r3[r0]
                r5 = 1
                r3 = r3[r5]
                r2.moveTo(r4, r3)
                android.graphics.Path r2 = r6.mPath
                float[] r3 = r6.mRectangle
                r4 = 2
                r4 = r3[r4]
                r5 = 3
                r3 = r3[r5]
                r2.lineTo(r4, r3)
                android.graphics.Path r2 = r6.mPath
                float[] r3 = r6.mRectangle
                r4 = 4
                r4 = r3[r4]
                r5 = 5
                r3 = r3[r5]
                r2.lineTo(r4, r3)
                android.graphics.Path r2 = r6.mPath
                float[] r3 = r6.mRectangle
                r4 = 6
                r4 = r3[r4]
                r5 = 7
                r3 = r3[r5]
                r2.lineTo(r4, r3)
                android.graphics.Path r2 = r6.mPath
                r2.close()
                int r1 = r1 + 1
                goto L7
            L4e:
                android.graphics.Paint r8 = r6.mPaint
                r0 = 1140850688(0x44000000, float:512.0)
                r8.setColor(r0)
                r8 = 1073741824(0x40000000, float:2.0)
                r7.translate(r8, r8)
                android.graphics.Path r8 = r6.mPath
                android.graphics.Paint r0 = r6.mPaint
                r7.drawPath(r8, r0)
                r8 = -1073741824(0xffffffffc0000000, float:-2.0)
                r7.translate(r8, r8)
                android.graphics.Paint r8 = r6.mPaint
                r0 = -65536(0xffffffffffff0000, float:NaN)
                r8.setColor(r0)
                android.graphics.Path r8 = r6.mPath
                android.graphics.Paint r0 = r6.mPaint
                r7.drawPath(r8, r0)
                return
        }

        private void drawTicks(android.graphics.Canvas r20, int r21, int r22, androidx.constraintlayout.motion.widget.MotionController r23) {
                r19 = this;
                r6 = r19
                r7 = r20
                r8 = r21
                r9 = r23
                android.view.View r0 = r9.mView
                r10 = 0
                if (r0 == 0) goto L1c
                android.view.View r0 = r9.mView
                int r0 = r0.getWidth()
                android.view.View r1 = r9.mView
                int r1 = r1.getHeight()
                r11 = r0
                r12 = r1
                goto L1e
            L1c:
                r11 = r10
                r12 = r11
            L1e:
                r13 = 1
                r14 = r13
            L20:
                int r0 = r22 + (-1)
                r15 = 2
                if (r14 >= r0) goto Ld5
                r0 = 4
                if (r8 != r0) goto L32
                int[] r1 = r6.mPathMode
                int r2 = r14 + (-1)
                r1 = r1[r2]
                if (r1 != 0) goto L32
                goto Ld1
            L32:
                float[] r1 = r6.mKeyFramePoints
                int r2 = r14 * 2
                r5 = r1[r2]
                int r2 = r2 + r13
                r4 = r1[r2]
                android.graphics.Path r1 = r6.mPath
                r1.reset()
                android.graphics.Path r1 = r6.mPath
                r2 = 1092616192(0x41200000, float:10.0)
                float r3 = r4 + r2
                r1.moveTo(r5, r3)
                android.graphics.Path r1 = r6.mPath
                float r3 = r5 + r2
                r1.lineTo(r3, r4)
                android.graphics.Path r1 = r6.mPath
                float r3 = r4 - r2
                r1.lineTo(r5, r3)
                android.graphics.Path r1 = r6.mPath
                float r2 = r5 - r2
                r1.lineTo(r2, r4)
                android.graphics.Path r1 = r6.mPath
                r1.close()
                int r1 = r14 + (-1)
                r9.getKeyFrame(r1)
                r16 = 0
                if (r8 != r0) goto La3
                int[] r0 = r6.mPathMode
                r0 = r0[r1]
                if (r0 != r13) goto L7e
                float r0 = r5 - r16
                float r1 = r4 - r16
                r6.drawPathRelativeTicks(r7, r0, r1)
            L79:
                r17 = r4
                r18 = r5
                goto L9b
            L7e:
                if (r0 != 0) goto L88
                float r0 = r5 - r16
                float r1 = r4 - r16
                r6.drawPathCartesianTicks(r7, r0, r1)
                goto L79
            L88:
                if (r0 != r15) goto L79
                float r2 = r5 - r16
                float r3 = r4 - r16
                r0 = r19
                r1 = r20
                r17 = r4
                r4 = r11
                r18 = r5
                r5 = r12
                r0.drawPathScreenTicks(r1, r2, r3, r4, r5)
            L9b:
                android.graphics.Path r0 = r6.mPath
                android.graphics.Paint r1 = r6.mFillPaint
                r7.drawPath(r0, r1)
                goto La7
            La3:
                r17 = r4
                r18 = r5
            La7:
                if (r8 != r15) goto Lb0
                float r5 = r18 - r16
                float r4 = r17 - r16
                r6.drawPathRelativeTicks(r7, r5, r4)
            Lb0:
                r0 = 3
                if (r8 != r0) goto Lba
                float r5 = r18 - r16
                float r4 = r17 - r16
                r6.drawPathCartesianTicks(r7, r5, r4)
            Lba:
                r0 = 6
                if (r8 != r0) goto Lca
                float r2 = r18 - r16
                float r3 = r17 - r16
                r0 = r19
                r1 = r20
                r4 = r11
                r5 = r12
                r0.drawPathScreenTicks(r1, r2, r3, r4, r5)
            Lca:
                android.graphics.Path r0 = r6.mPath
                android.graphics.Paint r1 = r6.mFillPaint
                r7.drawPath(r0, r1)
            Ld1:
                int r14 = r14 + 1
                goto L20
            Ld5:
                float[] r0 = r6.mPoints
                int r1 = r0.length
                if (r1 <= r13) goto Lf4
                r1 = r0[r10]
                r0 = r0[r13]
                android.graphics.Paint r2 = r6.mPaintKeyframes
                r3 = 1090519040(0x41000000, float:8.0)
                r7.drawCircle(r1, r0, r3, r2)
                float[] r0 = r6.mPoints
                int r1 = r0.length
                int r1 = r1 - r15
                r1 = r0[r1]
                int r2 = r0.length
                int r2 = r2 - r13
                r0 = r0[r2]
                android.graphics.Paint r2 = r6.mPaintKeyframes
                r7.drawCircle(r1, r0, r3, r2)
            Lf4:
                return
        }

        private void drawTranslation(android.graphics.Canvas r14, float r15, float r16, float r17, float r18) {
                r13 = this;
                r0 = r13
                android.graphics.Paint r6 = r0.mPaintGraph
                r1 = r14
                r2 = r15
                r3 = r16
                r4 = r17
                r5 = r18
                r1.drawRect(r2, r3, r4, r5, r6)
                android.graphics.Paint r12 = r0.mPaintGraph
                r7 = r14
                r8 = r15
                r9 = r16
                r10 = r17
                r11 = r18
                r7.drawLine(r8, r9, r10, r11, r12)
                return
        }

        public void draw(android.graphics.Canvas r6, java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r7, int r8, int r9) {
                r5 = this;
                if (r7 == 0) goto L10c
                int r0 = r7.size()
                if (r0 != 0) goto La
                goto L10c
            La:
                r6.save()
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r5.this$0
                boolean r0 = r0.isInEditMode()
                if (r0 != 0) goto L6b
                r0 = r9 & 1
                r1 = 2
                if (r0 != r1) goto L6b
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                androidx.constraintlayout.motion.widget.MotionLayout r1 = r5.this$0
                android.content.Context r1 = r1.getContext()
                android.content.res.Resources r1 = r1.getResources()
                androidx.constraintlayout.motion.widget.MotionLayout r2 = r5.this$0
                int r2 = androidx.constraintlayout.motion.widget.MotionLayout.access$100(r2)
                java.lang.String r1 = r1.getResourceName(r2)
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ":"
                java.lang.StringBuilder r0 = r0.append(r1)
                androidx.constraintlayout.motion.widget.MotionLayout r1 = r5.this$0
                float r1 = r1.getProgress()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                androidx.constraintlayout.motion.widget.MotionLayout r1 = r5.this$0
                int r1 = r1.getHeight()
                int r1 = r1 + (-30)
                float r1 = (float) r1
                android.graphics.Paint r2 = r5.mTextPaint
                r3 = 1092616192(0x41200000, float:10.0)
                r6.drawText(r0, r3, r1, r2)
                androidx.constraintlayout.motion.widget.MotionLayout r1 = r5.this$0
                int r1 = r1.getHeight()
                int r1 = r1 + (-29)
                float r1 = (float) r1
                android.graphics.Paint r2 = r5.mPaint
                r3 = 1093664768(0x41300000, float:11.0)
                r6.drawText(r0, r3, r1, r2)
            L6b:
                java.util.Collection r7 = r7.values()
                java.util.Iterator r7 = r7.iterator()
            L73:
                boolean r0 = r7.hasNext()
                if (r0 == 0) goto L109
                java.lang.Object r0 = r7.next()
                androidx.constraintlayout.motion.widget.MotionController r0 = (androidx.constraintlayout.motion.widget.MotionController) r0
                int r1 = r0.getDrawPath()
                r2 = 1
                if (r9 <= 0) goto L89
                if (r1 != 0) goto L89
                r1 = r2
            L89:
                if (r1 != 0) goto L8c
                goto L73
            L8c:
                float[] r3 = r5.mKeyFramePoints
                int[] r4 = r5.mPathMode
                int r3 = r0.buildKeyFrames(r3, r4)
                r5.mKeyFrameCount = r3
                if (r1 < r2) goto L73
                int r2 = r8 / 16
                float[] r3 = r5.mPoints
                if (r3 == 0) goto La3
                int r3 = r3.length
                int r4 = r2 * 2
                if (r3 == r4) goto Lb0
            La3:
                int r3 = r2 * 2
                float[] r3 = new float[r3]
                r5.mPoints = r3
                android.graphics.Path r3 = new android.graphics.Path
                r3.<init>()
                r5.mPath = r3
            Lb0:
                int r3 = r5.mShadowTranslate
                float r4 = (float) r3
                float r3 = (float) r3
                r6.translate(r4, r3)
                android.graphics.Paint r3 = r5.mPaint
                r4 = 1996488704(0x77000000, float:2.5961484E33)
                r3.setColor(r4)
                android.graphics.Paint r3 = r5.mFillPaint
                r3.setColor(r4)
                android.graphics.Paint r3 = r5.mPaintKeyframes
                r3.setColor(r4)
                android.graphics.Paint r3 = r5.mPaintGraph
                r3.setColor(r4)
                float[] r3 = r5.mPoints
                r0.buildPath(r3, r2)
                int r2 = r5.mKeyFrameCount
                r5.drawAll(r6, r1, r2, r0)
                android.graphics.Paint r2 = r5.mPaint
                r3 = -21965(0xffffffffffffaa33, float:NaN)
                r2.setColor(r3)
                android.graphics.Paint r2 = r5.mPaintKeyframes
                r3 = -2067046(0xffffffffffe0759a, float:NaN)
                r2.setColor(r3)
                android.graphics.Paint r2 = r5.mFillPaint
                r2.setColor(r3)
                android.graphics.Paint r2 = r5.mPaintGraph
                r3 = -13391360(0xffffffffff33aa00, float:-2.388145E38)
                r2.setColor(r3)
                int r2 = r5.mShadowTranslate
                int r3 = -r2
                float r3 = (float) r3
                int r2 = -r2
                float r2 = (float) r2
                r6.translate(r3, r2)
                int r2 = r5.mKeyFrameCount
                r5.drawAll(r6, r1, r2, r0)
                r2 = 5
                if (r1 != r2) goto L73
                r5.drawRectangle(r6, r0)
                goto L73
            L109:
                r6.restore()
            L10c:
                return
        }

        public void drawAll(android.graphics.Canvas r2, int r3, int r4, androidx.constraintlayout.motion.widget.MotionController r5) {
                r1 = this;
                r0 = 4
                if (r3 != r0) goto L6
                r1.drawPathAsConfigured(r2)
            L6:
                r0 = 2
                if (r3 != r0) goto Lc
                r1.drawPathRelative(r2)
            Lc:
                r0 = 3
                if (r3 != r0) goto L12
                r1.drawPathCartesian(r2)
            L12:
                r1.drawBasicPath(r2)
                r1.drawTicks(r2, r3, r4, r5)
                return
        }

        void getTextBounds(java.lang.String r4, android.graphics.Paint r5) {
                r3 = this;
                int r0 = r4.length()
                android.graphics.Rect r1 = r3.mBounds
                r2 = 0
                r5.getTextBounds(r4, r2, r0, r1)
                return
        }
    }

    class Model {
        androidx.constraintlayout.widget.ConstraintSet mEnd;
        int mEndId;
        androidx.constraintlayout.core.widgets.ConstraintWidgetContainer mLayoutEnd;
        androidx.constraintlayout.core.widgets.ConstraintWidgetContainer mLayoutStart;
        androidx.constraintlayout.widget.ConstraintSet mStart;
        int mStartId;
        final /* synthetic */ androidx.constraintlayout.motion.widget.MotionLayout this$0;

        Model(androidx.constraintlayout.motion.widget.MotionLayout r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1 = new androidx.constraintlayout.core.widgets.ConstraintWidgetContainer
                r1.<init>()
                r0.mLayoutStart = r1
                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1 = new androidx.constraintlayout.core.widgets.ConstraintWidgetContainer
                r1.<init>()
                r0.mLayoutEnd = r1
                r1 = 0
                r0.mStart = r1
                r0.mEnd = r1
                return
        }

        private void computeStartEndSize(int r6, int r7) {
                r5 = this;
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r5.this$0
                int r0 = r0.getOptimizationLevel()
                androidx.constraintlayout.motion.widget.MotionLayout r1 = r5.this$0
                int r1 = r1.mCurrentState
                androidx.constraintlayout.motion.widget.MotionLayout r2 = r5.this$0
                int r2 = r2.getStartState()
                if (r1 != r2) goto L4b
                androidx.constraintlayout.motion.widget.MotionLayout r1 = r5.this$0
                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r2 = r5.mLayoutEnd
                androidx.constraintlayout.widget.ConstraintSet r3 = r5.mEnd
                if (r3 == 0) goto L21
                int r3 = r3.mRotate
                if (r3 != 0) goto L1f
                goto L21
            L1f:
                r3 = r7
                goto L22
            L21:
                r3 = r6
            L22:
                androidx.constraintlayout.widget.ConstraintSet r4 = r5.mEnd
                if (r4 == 0) goto L2d
                int r4 = r4.mRotate
                if (r4 != 0) goto L2b
                goto L2d
            L2b:
                r4 = r6
                goto L2e
            L2d:
                r4 = r7
            L2e:
                androidx.constraintlayout.motion.widget.MotionLayout.access$1600(r1, r2, r0, r3, r4)
                androidx.constraintlayout.widget.ConstraintSet r1 = r5.mStart
                if (r1 == 0) goto L82
                androidx.constraintlayout.motion.widget.MotionLayout r2 = r5.this$0
                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r3 = r5.mLayoutStart
                int r1 = r1.mRotate
                if (r1 != 0) goto L3f
                r1 = r6
                goto L40
            L3f:
                r1 = r7
            L40:
                androidx.constraintlayout.widget.ConstraintSet r4 = r5.mStart
                int r4 = r4.mRotate
                if (r4 != 0) goto L47
                r6 = r7
            L47:
                androidx.constraintlayout.motion.widget.MotionLayout.access$1700(r2, r3, r0, r1, r6)
                goto L82
            L4b:
                androidx.constraintlayout.widget.ConstraintSet r1 = r5.mStart
                if (r1 == 0) goto L66
                androidx.constraintlayout.motion.widget.MotionLayout r2 = r5.this$0
                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r3 = r5.mLayoutStart
                int r1 = r1.mRotate
                if (r1 != 0) goto L59
                r1 = r6
                goto L5a
            L59:
                r1 = r7
            L5a:
                androidx.constraintlayout.widget.ConstraintSet r4 = r5.mStart
                int r4 = r4.mRotate
                if (r4 != 0) goto L62
                r4 = r7
                goto L63
            L62:
                r4 = r6
            L63:
                androidx.constraintlayout.motion.widget.MotionLayout.access$1800(r2, r3, r0, r1, r4)
            L66:
                androidx.constraintlayout.motion.widget.MotionLayout r1 = r5.this$0
                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r2 = r5.mLayoutEnd
                androidx.constraintlayout.widget.ConstraintSet r3 = r5.mEnd
                if (r3 == 0) goto L75
                int r3 = r3.mRotate
                if (r3 != 0) goto L73
                goto L75
            L73:
                r3 = r7
                goto L76
            L75:
                r3 = r6
            L76:
                androidx.constraintlayout.widget.ConstraintSet r4 = r5.mEnd
                if (r4 == 0) goto L7e
                int r4 = r4.mRotate
                if (r4 != 0) goto L7f
            L7e:
                r6 = r7
            L7f:
                androidx.constraintlayout.motion.widget.MotionLayout.access$1900(r1, r2, r0, r3, r6)
            L82:
                return
        }

        private void debugLayout(java.lang.String r11, androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r12) {
                r10 = this;
                java.lang.Object r0 = r12.getCompanionWidget()
                android.view.View r0 = (android.view.View) r0
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.StringBuilder r11 = r1.append(r11)
                java.lang.String r1 = " "
                java.lang.StringBuilder r11 = r11.append(r1)
                java.lang.String r0 = androidx.constraintlayout.motion.widget.Debug.getName(r0)
                java.lang.StringBuilder r11 = r11.append(r0)
                java.lang.String r11 = r11.toString()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.StringBuilder r0 = r0.append(r11)
                java.lang.String r2 = "  ========= "
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.StringBuilder r0 = r0.append(r12)
                java.lang.String r0 = r0.toString()
                java.lang.String r2 = "MotionLayout"
                android.util.Log.v(r2, r0)
                java.util.ArrayList r0 = r12.getChildren()
                int r0 = r0.size()
                r3 = 0
            L46:
                if (r3 >= r0) goto L129
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.StringBuilder r4 = r4.append(r11)
                java.lang.String r5 = "["
                java.lang.StringBuilder r4 = r4.append(r5)
                java.lang.StringBuilder r4 = r4.append(r3)
                java.lang.String r5 = "] "
                java.lang.StringBuilder r4 = r4.append(r5)
                java.lang.String r4 = r4.toString()
                java.util.ArrayList r5 = r12.getChildren()
                java.lang.Object r5 = r5.get(r3)
                androidx.constraintlayout.core.widgets.ConstraintWidget r5 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r5
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r5.mTop
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r6.mTarget
                java.lang.String r7 = "_"
                if (r6 == 0) goto L7a
                java.lang.String r6 = "T"
                goto L7b
            L7a:
                r6 = r7
            L7b:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.StringBuilder r6 = r8.append(r6)
                androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r5.mBottom
                androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r8.mTarget
                if (r8 == 0) goto L8d
                java.lang.String r8 = "B"
                goto L8e
            L8d:
                r8 = r7
            L8e:
                java.lang.StringBuilder r6 = r6.append(r8)
                java.lang.String r6 = r6.toString()
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.StringBuilder r6 = r8.append(r6)
                androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r5.mLeft
                androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r8.mTarget
                if (r8 == 0) goto La8
                java.lang.String r8 = "L"
                goto La9
            La8:
                r8 = r7
            La9:
                java.lang.StringBuilder r6 = r6.append(r8)
                java.lang.String r6 = r6.toString()
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.StringBuilder r6 = r8.append(r6)
                androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r5.mRight
                androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r8.mTarget
                if (r8 == 0) goto Lc2
                java.lang.String r7 = "R"
            Lc2:
                java.lang.StringBuilder r6 = r6.append(r7)
                java.lang.String r6 = r6.toString()
                java.lang.Object r7 = r5.getCompanionWidget()
                android.view.View r7 = (android.view.View) r7
                java.lang.String r8 = androidx.constraintlayout.motion.widget.Debug.getName(r7)
                boolean r9 = r7 instanceof android.widget.TextView
                if (r9 == 0) goto Lfb
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.StringBuilder r8 = r9.append(r8)
                java.lang.String r9 = "("
                java.lang.StringBuilder r8 = r8.append(r9)
                android.widget.TextView r7 = (android.widget.TextView) r7
                java.lang.CharSequence r7 = r7.getText()
                java.lang.StringBuilder r7 = r8.append(r7)
                java.lang.String r8 = ")"
                java.lang.StringBuilder r7 = r7.append(r8)
                java.lang.String r8 = r7.toString()
            Lfb:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.StringBuilder r4 = r7.append(r4)
                java.lang.String r7 = "  "
                java.lang.StringBuilder r4 = r4.append(r7)
                java.lang.StringBuilder r4 = r4.append(r8)
                java.lang.StringBuilder r4 = r4.append(r1)
                java.lang.StringBuilder r4 = r4.append(r5)
                java.lang.StringBuilder r4 = r4.append(r1)
                java.lang.StringBuilder r4 = r4.append(r6)
                java.lang.String r4 = r4.toString()
                android.util.Log.v(r2, r4)
                int r3 = r3 + 1
                goto L46
            L129:
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.StringBuilder r11 = r12.append(r11)
                java.lang.String r12 = " done. "
                java.lang.StringBuilder r11 = r11.append(r12)
                java.lang.String r11 = r11.toString()
                android.util.Log.v(r2, r11)
                return
        }

        private void debugLayoutParam(java.lang.String r5, androidx.constraintlayout.widget.ConstraintLayout.LayoutParams r6) {
                r4 = this;
                int r0 = r6.startToStart
                r1 = -1
                if (r0 == r1) goto L8
                java.lang.String r0 = "SS"
                goto La
            L8:
                java.lang.String r0 = "__"
            La:
                java.lang.String r2 = " "
                java.lang.String r0 = r2.concat(r0)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.StringBuilder r0 = r2.append(r0)
                int r2 = r6.startToEnd
                java.lang.String r3 = "|__"
                if (r2 == r1) goto L22
                java.lang.String r2 = "|SE"
                goto L23
            L22:
                r2 = r3
            L23:
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.String r0 = r0.toString()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.StringBuilder r0 = r2.append(r0)
                int r2 = r6.endToStart
                if (r2 == r1) goto L3b
                java.lang.String r2 = "|ES"
                goto L3c
            L3b:
                r2 = r3
            L3c:
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.String r0 = r0.toString()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.StringBuilder r0 = r2.append(r0)
                int r2 = r6.endToEnd
                if (r2 == r1) goto L54
                java.lang.String r2 = "|EE"
                goto L55
            L54:
                r2 = r3
            L55:
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.String r0 = r0.toString()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.StringBuilder r0 = r2.append(r0)
                int r2 = r6.leftToLeft
                if (r2 == r1) goto L6d
                java.lang.String r2 = "|LL"
                goto L6e
            L6d:
                r2 = r3
            L6e:
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.String r0 = r0.toString()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.StringBuilder r0 = r2.append(r0)
                int r2 = r6.leftToRight
                if (r2 == r1) goto L86
                java.lang.String r2 = "|LR"
                goto L87
            L86:
                r2 = r3
            L87:
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.String r0 = r0.toString()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.StringBuilder r0 = r2.append(r0)
                int r2 = r6.rightToLeft
                if (r2 == r1) goto L9f
                java.lang.String r2 = "|RL"
                goto La0
            L9f:
                r2 = r3
            La0:
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.String r0 = r0.toString()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.StringBuilder r0 = r2.append(r0)
                int r2 = r6.rightToRight
                if (r2 == r1) goto Lb8
                java.lang.String r2 = "|RR"
                goto Lb9
            Lb8:
                r2 = r3
            Lb9:
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.String r0 = r0.toString()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.StringBuilder r0 = r2.append(r0)
                int r2 = r6.topToTop
                if (r2 == r1) goto Ld1
                java.lang.String r2 = "|TT"
                goto Ld2
            Ld1:
                r2 = r3
            Ld2:
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.String r0 = r0.toString()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.StringBuilder r0 = r2.append(r0)
                int r2 = r6.topToBottom
                if (r2 == r1) goto Lea
                java.lang.String r2 = "|TB"
                goto Leb
            Lea:
                r2 = r3
            Leb:
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.String r0 = r0.toString()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.StringBuilder r0 = r2.append(r0)
                int r2 = r6.bottomToTop
                if (r2 == r1) goto L103
                java.lang.String r2 = "|BT"
                goto L104
            L103:
                r2 = r3
            L104:
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.String r0 = r0.toString()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.StringBuilder r0 = r2.append(r0)
                int r6 = r6.bottomToBottom
                if (r6 == r1) goto L11b
                java.lang.String r3 = "|BB"
            L11b:
                java.lang.StringBuilder r6 = r0.append(r3)
                java.lang.String r6 = r6.toString()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.StringBuilder r5 = r0.append(r5)
                java.lang.StringBuilder r5 = r5.append(r6)
                java.lang.String r5 = r5.toString()
                java.lang.String r6 = "MotionLayout"
                android.util.Log.v(r6, r5)
                return
        }

        private void debugWidget(java.lang.String r7, androidx.constraintlayout.core.widgets.ConstraintWidget r8) {
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = " "
                r0.<init>(r1)
                androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r8.mTop
                androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.mTarget
                java.lang.String r2 = "T"
                java.lang.String r3 = "B"
                java.lang.String r4 = "__"
                if (r1 == 0) goto L25
                androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r8.mTop
                androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.mTarget
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = r1.mType
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
                if (r1 != r5) goto L1f
                r1 = r2
                goto L20
            L1f:
                r1 = r3
            L20:
                java.lang.String r1 = r2.concat(r1)
                goto L26
            L25:
                r1 = r4
            L26:
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.StringBuilder r0 = r1.append(r0)
                androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r8.mBottom
                androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.mTarget
                if (r1 == 0) goto L4e
                androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r8.mBottom
                androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.mTarget
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = r1.mType
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
                if (r1 != r5) goto L48
                goto L49
            L48:
                r2 = r3
            L49:
                java.lang.String r1 = r3.concat(r2)
                goto L4f
            L4e:
                r1 = r4
            L4f:
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.StringBuilder r0 = r1.append(r0)
                androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r8.mLeft
                androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.mTarget
                java.lang.String r2 = "L"
                java.lang.String r3 = "R"
                if (r1 == 0) goto L7c
                androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r8.mLeft
                androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.mTarget
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = r1.mType
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
                if (r1 != r5) goto L76
                r1 = r2
                goto L77
            L76:
                r1 = r3
            L77:
                java.lang.String r1 = r2.concat(r1)
                goto L7d
            L7c:
                r1 = r4
            L7d:
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.StringBuilder r0 = r1.append(r0)
                androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r8.mRight
                androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.mTarget
                if (r1 == 0) goto La4
                androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r8.mRight
                androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.mTarget
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = r1.mType
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
                if (r1 != r4) goto L9f
                goto La0
            L9f:
                r2 = r3
            La0:
                java.lang.String r4 = r3.concat(r2)
            La4:
                java.lang.StringBuilder r0 = r0.append(r4)
                java.lang.String r0 = r0.toString()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.StringBuilder r7 = r1.append(r7)
                java.lang.StringBuilder r7 = r7.append(r0)
                java.lang.String r0 = " ---  "
                java.lang.StringBuilder r7 = r7.append(r0)
                java.lang.StringBuilder r7 = r7.append(r8)
                java.lang.String r7 = r7.toString()
                java.lang.String r8 = "MotionLayout"
                android.util.Log.v(r8, r7)
                return
        }

        private void setupConstraintWidget(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r13, androidx.constraintlayout.widget.ConstraintSet r14) {
                r12 = this;
                android.util.SparseArray r6 = new android.util.SparseArray
                r6.<init>()
                androidx.constraintlayout.widget.Constraints$LayoutParams r7 = new androidx.constraintlayout.widget.Constraints$LayoutParams
                r0 = -2
                r7.<init>(r0, r0)
                r6.clear()
                r0 = 0
                r6.put(r0, r13)
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r12.this$0
                int r0 = r0.getId()
                r6.put(r0, r13)
                if (r14 == 0) goto L42
                int r0 = r14.mRotate
                if (r0 == 0) goto L42
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r12.this$0
                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1 = r12.mLayoutEnd
                int r2 = r0.getOptimizationLevel()
                androidx.constraintlayout.motion.widget.MotionLayout r3 = r12.this$0
                int r3 = r3.getHeight()
                r4 = 1073741824(0x40000000, float:2.0)
                int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r4)
                androidx.constraintlayout.motion.widget.MotionLayout r5 = r12.this$0
                int r5 = r5.getWidth()
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r4)
                androidx.constraintlayout.motion.widget.MotionLayout.access$1000(r0, r1, r2, r3, r4)
            L42:
                java.util.ArrayList r0 = r13.getChildren()
                java.util.Iterator r0 = r0.iterator()
            L4a:
                boolean r1 = r0.hasNext()
                r8 = 1
                if (r1 == 0) goto L68
                java.lang.Object r1 = r0.next()
                androidx.constraintlayout.core.widgets.ConstraintWidget r1 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r1
                r1.setAnimated(r8)
                java.lang.Object r2 = r1.getCompanionWidget()
                android.view.View r2 = (android.view.View) r2
                int r2 = r2.getId()
                r6.put(r2, r1)
                goto L4a
            L68:
                java.util.ArrayList r0 = r13.getChildren()
                java.util.Iterator r9 = r0.iterator()
            L70:
                boolean r0 = r9.hasNext()
                if (r0 == 0) goto Le6
                java.lang.Object r0 = r9.next()
                r10 = r0
                androidx.constraintlayout.core.widgets.ConstraintWidget r10 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r10
                java.lang.Object r0 = r10.getCompanionWidget()
                r11 = r0
                android.view.View r11 = (android.view.View) r11
                int r0 = r11.getId()
                r14.applyToLayoutParams(r0, r7)
                int r0 = r11.getId()
                int r0 = r14.getWidth(r0)
                r10.setWidth(r0)
                int r0 = r11.getId()
                int r0 = r14.getHeight(r0)
                r10.setHeight(r0)
                boolean r0 = r11 instanceof androidx.constraintlayout.widget.ConstraintHelper
                if (r0 == 0) goto Lb5
                r0 = r11
                androidx.constraintlayout.widget.ConstraintHelper r0 = (androidx.constraintlayout.widget.ConstraintHelper) r0
                r14.applyToHelper(r0, r10, r7, r6)
                boolean r0 = r11 instanceof androidx.constraintlayout.widget.Barrier
                if (r0 == 0) goto Lb5
                r0 = r11
                androidx.constraintlayout.widget.Barrier r0 = (androidx.constraintlayout.widget.Barrier) r0
                r0.validateParams()
            Lb5:
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r12.this$0
                int r0 = r0.getLayoutDirection()
                r7.resolveLayoutDirection(r0)
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r12.this$0
                r1 = 0
                r2 = r11
                r3 = r10
                r4 = r7
                r5 = r6
                androidx.constraintlayout.motion.widget.MotionLayout.access$1100(r0, r1, r2, r3, r4, r5)
                int r0 = r11.getId()
                int r0 = r14.getVisibilityMode(r0)
                if (r0 != r8) goto Lda
                int r0 = r11.getVisibility()
                r10.setVisibility(r0)
                goto L70
            Lda:
                int r0 = r11.getId()
                int r0 = r14.getVisibility(r0)
                r10.setVisibility(r0)
                goto L70
            Le6:
                java.util.ArrayList r14 = r13.getChildren()
                java.util.Iterator r14 = r14.iterator()
            Lee:
                boolean r0 = r14.hasNext()
                if (r0 == 0) goto L10f
                java.lang.Object r0 = r14.next()
                androidx.constraintlayout.core.widgets.ConstraintWidget r0 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r0
                boolean r1 = r0 instanceof androidx.constraintlayout.core.widgets.VirtualLayout
                if (r1 == 0) goto Lee
                java.lang.Object r1 = r0.getCompanionWidget()
                androidx.constraintlayout.widget.ConstraintHelper r1 = (androidx.constraintlayout.widget.ConstraintHelper) r1
                androidx.constraintlayout.core.widgets.Helper r0 = (androidx.constraintlayout.core.widgets.Helper) r0
                r1.updatePreLayout(r13, r0, r6)
                androidx.constraintlayout.core.widgets.VirtualLayout r0 = (androidx.constraintlayout.core.widgets.VirtualLayout) r0
                r0.captureWidgets()
                goto Lee
            L10f:
                return
        }

        public void build() {
                r18 = this;
                r0 = r18
                androidx.constraintlayout.motion.widget.MotionLayout r1 = r0.this$0
                int r1 = r1.getChildCount()
                androidx.constraintlayout.motion.widget.MotionLayout r2 = r0.this$0
                java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r2 = r2.mFrameArrayList
                r2.clear()
                android.util.SparseArray r2 = new android.util.SparseArray
                r2.<init>()
                int[] r3 = new int[r1]
                r5 = 0
            L17:
                if (r5 >= r1) goto L37
                androidx.constraintlayout.motion.widget.MotionLayout r6 = r0.this$0
                android.view.View r6 = r6.getChildAt(r5)
                androidx.constraintlayout.motion.widget.MotionController r7 = new androidx.constraintlayout.motion.widget.MotionController
                r7.<init>(r6)
                int r8 = r6.getId()
                r3[r5] = r8
                r2.put(r8, r7)
                androidx.constraintlayout.motion.widget.MotionLayout r8 = r0.this$0
                java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r8 = r8.mFrameArrayList
                r8.put(r6, r7)
                int r5 = r5 + 1
                goto L17
            L37:
                r5 = 0
            L38:
                if (r5 >= r1) goto L152
                androidx.constraintlayout.motion.widget.MotionLayout r6 = r0.this$0
                android.view.View r6 = r6.getChildAt(r5)
                androidx.constraintlayout.motion.widget.MotionLayout r7 = r0.this$0
                java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r7 = r7.mFrameArrayList
                java.lang.Object r7 = r7.get(r6)
                r13 = r7
                androidx.constraintlayout.motion.widget.MotionController r13 = (androidx.constraintlayout.motion.widget.MotionController) r13
                if (r13 != 0) goto L51
                r16 = r2
                goto L14c
            L51:
                androidx.constraintlayout.widget.ConstraintSet r7 = r0.mStart
                java.lang.String r14 = ")"
                java.lang.String r15 = " ("
                java.lang.String r12 = "no widget for  "
                java.lang.String r11 = "MotionLayout"
                if (r7 == 0) goto Lb9
                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r7 = r0.mLayoutStart
                androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r0.getWidget(r7, r6)
                if (r7 == 0) goto L7e
                androidx.constraintlayout.motion.widget.MotionLayout r8 = r0.this$0
                android.graphics.Rect r7 = androidx.constraintlayout.motion.widget.MotionLayout.access$2000(r8, r7)
                androidx.constraintlayout.widget.ConstraintSet r8 = r0.mStart
                androidx.constraintlayout.motion.widget.MotionLayout r9 = r0.this$0
                int r9 = r9.getWidth()
                androidx.constraintlayout.motion.widget.MotionLayout r10 = r0.this$0
                int r10 = r10.getHeight()
                r13.setStartState(r7, r8, r9, r10)
                goto Lea
            L7e:
                androidx.constraintlayout.motion.widget.MotionLayout r7 = r0.this$0
                int r7 = r7.mDebugPath
                if (r7 == 0) goto Lea
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = androidx.constraintlayout.motion.widget.Debug.getLocation()
                java.lang.StringBuilder r7 = r7.append(r8)
                java.lang.StringBuilder r7 = r7.append(r12)
                java.lang.String r8 = androidx.constraintlayout.motion.widget.Debug.getName(r6)
                java.lang.StringBuilder r7 = r7.append(r8)
                java.lang.StringBuilder r7 = r7.append(r15)
                java.lang.Class r8 = r6.getClass()
                java.lang.String r8 = r8.getName()
                java.lang.StringBuilder r7 = r7.append(r8)
                java.lang.StringBuilder r7 = r7.append(r14)
                java.lang.String r7 = r7.toString()
                android.util.Log.e(r11, r7)
                goto Lea
            Lb9:
                androidx.constraintlayout.motion.widget.MotionLayout r7 = r0.this$0
                boolean r7 = androidx.constraintlayout.motion.widget.MotionLayout.access$300(r7)
                if (r7 == 0) goto Lea
                androidx.constraintlayout.motion.widget.MotionLayout r7 = r0.this$0
                java.util.HashMap<android.view.View, androidx.constraintlayout.motion.utils.ViewState> r7 = r7.mPreRotate
                java.lang.Object r7 = r7.get(r6)
                r8 = r7
                androidx.constraintlayout.motion.utils.ViewState r8 = (androidx.constraintlayout.motion.utils.ViewState) r8
                androidx.constraintlayout.motion.widget.MotionLayout r7 = r0.this$0
                int r10 = r7.mRotatMode
                androidx.constraintlayout.motion.widget.MotionLayout r7 = r0.this$0
                int r16 = androidx.constraintlayout.motion.widget.MotionLayout.access$2100(r7)
                androidx.constraintlayout.motion.widget.MotionLayout r7 = r0.this$0
                int r17 = androidx.constraintlayout.motion.widget.MotionLayout.access$2200(r7)
                r7 = r13
                r9 = r6
                r4 = r11
                r11 = r16
                r16 = r2
                r2 = r12
                r12 = r17
                r7.setStartState(r8, r9, r10, r11, r12)
                goto Lee
            Lea:
                r16 = r2
                r4 = r11
                r2 = r12
            Lee:
                androidx.constraintlayout.widget.ConstraintSet r7 = r0.mEnd
                if (r7 == 0) goto L14c
                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r7 = r0.mLayoutEnd
                androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r0.getWidget(r7, r6)
                if (r7 == 0) goto L112
                androidx.constraintlayout.motion.widget.MotionLayout r2 = r0.this$0
                android.graphics.Rect r2 = androidx.constraintlayout.motion.widget.MotionLayout.access$2000(r2, r7)
                androidx.constraintlayout.widget.ConstraintSet r4 = r0.mEnd
                androidx.constraintlayout.motion.widget.MotionLayout r6 = r0.this$0
                int r6 = r6.getWidth()
                androidx.constraintlayout.motion.widget.MotionLayout r7 = r0.this$0
                int r7 = r7.getHeight()
                r13.setEndState(r2, r4, r6, r7)
                goto L14c
            L112:
                androidx.constraintlayout.motion.widget.MotionLayout r7 = r0.this$0
                int r7 = r7.mDebugPath
                if (r7 == 0) goto L14c
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = androidx.constraintlayout.motion.widget.Debug.getLocation()
                java.lang.StringBuilder r7 = r7.append(r8)
                java.lang.StringBuilder r2 = r7.append(r2)
                java.lang.String r7 = androidx.constraintlayout.motion.widget.Debug.getName(r6)
                java.lang.StringBuilder r2 = r2.append(r7)
                java.lang.StringBuilder r2 = r2.append(r15)
                java.lang.Class r6 = r6.getClass()
                java.lang.String r6 = r6.getName()
                java.lang.StringBuilder r2 = r2.append(r6)
                java.lang.StringBuilder r2 = r2.append(r14)
                java.lang.String r2 = r2.toString()
                android.util.Log.e(r4, r2)
            L14c:
                int r5 = r5 + 1
                r2 = r16
                goto L38
            L152:
                r16 = r2
                r4 = 0
            L155:
                if (r4 >= r1) goto L176
                r2 = r3[r4]
                r5 = r16
                java.lang.Object r2 = r5.get(r2)
                androidx.constraintlayout.motion.widget.MotionController r2 = (androidx.constraintlayout.motion.widget.MotionController) r2
                int r6 = r2.getAnimateRelativeTo()
                r7 = -1
                if (r6 == r7) goto L171
                java.lang.Object r6 = r5.get(r6)
                androidx.constraintlayout.motion.widget.MotionController r6 = (androidx.constraintlayout.motion.widget.MotionController) r6
                r2.setupRelative(r6)
            L171:
                int r4 = r4 + 1
                r16 = r5
                goto L155
            L176:
                return
        }

        void copy(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r5, androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r6) {
                r4 = this;
                java.util.ArrayList r0 = r5.getChildren()
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>()
                r1.put(r5, r6)
                java.util.ArrayList r2 = r6.getChildren()
                r2.clear()
                r6.copy(r5, r1)
                java.util.Iterator r5 = r0.iterator()
            L1a:
                boolean r2 = r5.hasNext()
                if (r2 == 0) goto L64
                java.lang.Object r2 = r5.next()
                androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
                boolean r3 = r2 instanceof androidx.constraintlayout.core.widgets.Barrier
                if (r3 == 0) goto L30
                androidx.constraintlayout.core.widgets.Barrier r3 = new androidx.constraintlayout.core.widgets.Barrier
                r3.<init>()
                goto L5d
            L30:
                boolean r3 = r2 instanceof androidx.constraintlayout.core.widgets.Guideline
                if (r3 == 0) goto L3a
                androidx.constraintlayout.core.widgets.Guideline r3 = new androidx.constraintlayout.core.widgets.Guideline
                r3.<init>()
                goto L5d
            L3a:
                boolean r3 = r2 instanceof androidx.constraintlayout.core.widgets.Flow
                if (r3 == 0) goto L44
                androidx.constraintlayout.core.widgets.Flow r3 = new androidx.constraintlayout.core.widgets.Flow
                r3.<init>()
                goto L5d
            L44:
                boolean r3 = r2 instanceof androidx.constraintlayout.core.widgets.Placeholder
                if (r3 == 0) goto L4e
                androidx.constraintlayout.core.widgets.Placeholder r3 = new androidx.constraintlayout.core.widgets.Placeholder
                r3.<init>()
                goto L5d
            L4e:
                boolean r3 = r2 instanceof androidx.constraintlayout.core.widgets.Helper
                if (r3 == 0) goto L58
                androidx.constraintlayout.core.widgets.HelperWidget r3 = new androidx.constraintlayout.core.widgets.HelperWidget
                r3.<init>()
                goto L5d
            L58:
                androidx.constraintlayout.core.widgets.ConstraintWidget r3 = new androidx.constraintlayout.core.widgets.ConstraintWidget
                r3.<init>()
            L5d:
                r6.add(r3)
                r1.put(r2, r3)
                goto L1a
            L64:
                java.util.Iterator r5 = r0.iterator()
            L68:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto L7e
                java.lang.Object r6 = r5.next()
                androidx.constraintlayout.core.widgets.ConstraintWidget r6 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r6
                java.lang.Object r0 = r1.get(r6)
                androidx.constraintlayout.core.widgets.ConstraintWidget r0 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r0
                r0.copy(r6, r1)
                goto L68
            L7e:
                return
        }

        androidx.constraintlayout.core.widgets.ConstraintWidget getWidget(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r5, android.view.View r6) {
                r4 = this;
                java.lang.Object r0 = r5.getCompanionWidget()
                if (r0 != r6) goto L7
                return r5
            L7:
                java.util.ArrayList r5 = r5.getChildren()
                int r0 = r5.size()
                r1 = 0
            L10:
                if (r1 >= r0) goto L22
                java.lang.Object r2 = r5.get(r1)
                androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
                java.lang.Object r3 = r2.getCompanionWidget()
                if (r3 != r6) goto L1f
                return r2
            L1f:
                int r1 = r1 + 1
                goto L10
            L22:
                r5 = 0
                return r5
        }

        void initFrom(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r5, androidx.constraintlayout.widget.ConstraintSet r6, androidx.constraintlayout.widget.ConstraintSet r7) {
                r4 = this;
                r4.mStart = r6
                r4.mEnd = r7
                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r5 = new androidx.constraintlayout.core.widgets.ConstraintWidgetContainer
                r5.<init>()
                r4.mLayoutStart = r5
                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r5 = new androidx.constraintlayout.core.widgets.ConstraintWidgetContainer
                r5.<init>()
                r4.mLayoutEnd = r5
                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r5 = r4.mLayoutStart
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r4.this$0
                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = androidx.constraintlayout.motion.widget.MotionLayout.access$400(r0)
                androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer r0 = r0.getMeasurer()
                r5.setMeasurer(r0)
                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r5 = r4.mLayoutEnd
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r4.this$0
                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = androidx.constraintlayout.motion.widget.MotionLayout.access$500(r0)
                androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer r0 = r0.getMeasurer()
                r5.setMeasurer(r0)
                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r5 = r4.mLayoutStart
                r5.removeAllChildren()
                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r5 = r4.mLayoutEnd
                r5.removeAllChildren()
                androidx.constraintlayout.motion.widget.MotionLayout r5 = r4.this$0
                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r5 = androidx.constraintlayout.motion.widget.MotionLayout.access$600(r5)
                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = r4.mLayoutStart
                r4.copy(r5, r0)
                androidx.constraintlayout.motion.widget.MotionLayout r5 = r4.this$0
                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r5 = androidx.constraintlayout.motion.widget.MotionLayout.access$700(r5)
                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = r4.mLayoutEnd
                r4.copy(r5, r0)
                androidx.constraintlayout.motion.widget.MotionLayout r5 = r4.this$0
                float r5 = r5.mTransitionLastPosition
                double r0 = (double) r5
                r2 = 4602678819172646912(0x3fe0000000000000, double:0.5)
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 <= 0) goto L68
                if (r6 == 0) goto L62
                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r5 = r4.mLayoutStart
                r4.setupConstraintWidget(r5, r6)
            L62:
                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r5 = r4.mLayoutEnd
                r4.setupConstraintWidget(r5, r7)
                goto L74
            L68:
                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r5 = r4.mLayoutEnd
                r4.setupConstraintWidget(r5, r7)
                if (r6 == 0) goto L74
                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r5 = r4.mLayoutStart
                r4.setupConstraintWidget(r5, r6)
            L74:
                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r5 = r4.mLayoutStart
                androidx.constraintlayout.motion.widget.MotionLayout r6 = r4.this$0
                boolean r6 = androidx.constraintlayout.motion.widget.MotionLayout.access$800(r6)
                r5.setRtl(r6)
                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r5 = r4.mLayoutStart
                r5.updateHierarchy()
                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r5 = r4.mLayoutEnd
                androidx.constraintlayout.motion.widget.MotionLayout r6 = r4.this$0
                boolean r6 = androidx.constraintlayout.motion.widget.MotionLayout.access$900(r6)
                r5.setRtl(r6)
                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r5 = r4.mLayoutEnd
                r5.updateHierarchy()
                androidx.constraintlayout.motion.widget.MotionLayout r5 = r4.this$0
                android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
                if (r5 == 0) goto Lc1
                int r6 = r5.width
                r7 = -2
                if (r6 != r7) goto Laf
                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r6 = r4.mLayoutStart
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
                r6.setHorizontalDimensionBehaviour(r0)
                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r6 = r4.mLayoutEnd
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
                r6.setHorizontalDimensionBehaviour(r0)
            Laf:
                int r5 = r5.height
                if (r5 != r7) goto Lc1
                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r5 = r4.mLayoutStart
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
                r5.setVerticalDimensionBehaviour(r6)
                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r5 = r4.mLayoutEnd
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
                r5.setVerticalDimensionBehaviour(r6)
            Lc1:
                return
        }

        public boolean isNotConfiguredWith(int r2, int r3) {
                r1 = this;
                int r0 = r1.mStartId
                if (r2 != r0) goto Lb
                int r2 = r1.mEndId
                if (r3 == r2) goto L9
                goto Lb
            L9:
                r2 = 0
                goto Lc
            Lb:
                r2 = 1
            Lc:
                return r2
        }

        public void measure(int r14, int r15) {
                r13 = this;
                int r0 = android.view.View.MeasureSpec.getMode(r14)
                int r1 = android.view.View.MeasureSpec.getMode(r15)
                androidx.constraintlayout.motion.widget.MotionLayout r2 = r13.this$0
                r2.mWidthMeasureMode = r0
                androidx.constraintlayout.motion.widget.MotionLayout r2 = r13.this$0
                r2.mHeightMeasureMode = r1
                androidx.constraintlayout.motion.widget.MotionLayout r2 = r13.this$0
                r2.getOptimizationLevel()
                r13.computeStartEndSize(r14, r15)
                androidx.constraintlayout.motion.widget.MotionLayout r2 = r13.this$0
                android.view.ViewParent r2 = r2.getParent()
                boolean r2 = r2 instanceof androidx.constraintlayout.motion.widget.MotionLayout
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L2c
                r2 = 1073741824(0x40000000, float:2.0)
                if (r0 != r2) goto L2c
                if (r1 != r2) goto L2c
                r0 = r3
                goto L2d
            L2c:
                r0 = r4
            L2d:
                if (r0 == 0) goto L74
                r13.computeStartEndSize(r14, r15)
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r13.this$0
                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1 = r13.mLayoutStart
                int r1 = r1.getWidth()
                r0.mStartWrapWidth = r1
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r13.this$0
                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1 = r13.mLayoutStart
                int r1 = r1.getHeight()
                r0.mStartWrapHeight = r1
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r13.this$0
                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1 = r13.mLayoutEnd
                int r1 = r1.getWidth()
                r0.mEndWrapWidth = r1
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r13.this$0
                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1 = r13.mLayoutEnd
                int r1 = r1.getHeight()
                r0.mEndWrapHeight = r1
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r13.this$0
                int r1 = r0.mStartWrapWidth
                androidx.constraintlayout.motion.widget.MotionLayout r2 = r13.this$0
                int r2 = r2.mEndWrapWidth
                if (r1 != r2) goto L71
                androidx.constraintlayout.motion.widget.MotionLayout r1 = r13.this$0
                int r1 = r1.mStartWrapHeight
                androidx.constraintlayout.motion.widget.MotionLayout r2 = r13.this$0
                int r2 = r2.mEndWrapHeight
                if (r1 == r2) goto L6f
                goto L71
            L6f:
                r1 = r3
                goto L72
            L71:
                r1 = r4
            L72:
                r0.mMeasureDuringTransition = r1
            L74:
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r13.this$0
                int r0 = r0.mStartWrapWidth
                androidx.constraintlayout.motion.widget.MotionLayout r1 = r13.this$0
                int r1 = r1.mStartWrapHeight
                androidx.constraintlayout.motion.widget.MotionLayout r2 = r13.this$0
                int r2 = r2.mWidthMeasureMode
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r2 == r5) goto L8a
                androidx.constraintlayout.motion.widget.MotionLayout r2 = r13.this$0
                int r2 = r2.mWidthMeasureMode
                if (r2 != 0) goto La0
            L8a:
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r13.this$0
                int r0 = r0.mStartWrapWidth
                float r0 = (float) r0
                androidx.constraintlayout.motion.widget.MotionLayout r2 = r13.this$0
                float r2 = r2.mPostInterpolationPosition
                androidx.constraintlayout.motion.widget.MotionLayout r6 = r13.this$0
                int r6 = r6.mEndWrapWidth
                androidx.constraintlayout.motion.widget.MotionLayout r7 = r13.this$0
                int r7 = r7.mStartWrapWidth
                int r6 = r6 - r7
                float r6 = (float) r6
                float r2 = r2 * r6
                float r0 = r0 + r2
                int r0 = (int) r0
            La0:
                r9 = r0
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r13.this$0
                int r0 = r0.mHeightMeasureMode
                if (r0 == r5) goto Lad
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r13.this$0
                int r0 = r0.mHeightMeasureMode
                if (r0 != 0) goto Lc3
            Lad:
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r13.this$0
                int r0 = r0.mStartWrapHeight
                float r0 = (float) r0
                androidx.constraintlayout.motion.widget.MotionLayout r1 = r13.this$0
                float r1 = r1.mPostInterpolationPosition
                androidx.constraintlayout.motion.widget.MotionLayout r2 = r13.this$0
                int r2 = r2.mEndWrapHeight
                androidx.constraintlayout.motion.widget.MotionLayout r5 = r13.this$0
                int r5 = r5.mStartWrapHeight
                int r2 = r2 - r5
                float r2 = (float) r2
                float r1 = r1 * r2
                float r0 = r0 + r1
                int r1 = (int) r0
            Lc3:
                r10 = r1
                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = r13.mLayoutStart
                boolean r0 = r0.isWidthMeasuredTooSmall()
                if (r0 != 0) goto Ld7
                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = r13.mLayoutEnd
                boolean r0 = r0.isWidthMeasuredTooSmall()
                if (r0 == 0) goto Ld5
                goto Ld7
            Ld5:
                r11 = r3
                goto Ld8
            Ld7:
                r11 = r4
            Ld8:
                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = r13.mLayoutStart
                boolean r0 = r0.isHeightMeasuredTooSmall()
                if (r0 != 0) goto Leb
                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = r13.mLayoutEnd
                boolean r0 = r0.isHeightMeasuredTooSmall()
                if (r0 == 0) goto Le9
                goto Leb
            Le9:
                r12 = r3
                goto Lec
            Leb:
                r12 = r4
            Lec:
                androidx.constraintlayout.motion.widget.MotionLayout r6 = r13.this$0
                r7 = r14
                r8 = r15
                androidx.constraintlayout.motion.widget.MotionLayout.access$1500(r6, r7, r8, r9, r10, r11, r12)
                return
        }

        public void reEvaluateState() {
                r2 = this;
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r2.this$0
                int r0 = androidx.constraintlayout.motion.widget.MotionLayout.access$1200(r0)
                androidx.constraintlayout.motion.widget.MotionLayout r1 = r2.this$0
                int r1 = androidx.constraintlayout.motion.widget.MotionLayout.access$1300(r1)
                r2.measure(r0, r1)
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r2.this$0
                androidx.constraintlayout.motion.widget.MotionLayout.access$1400(r0)
                return
        }

        public void setMeasuredId(int r1, int r2) {
                r0 = this;
                r0.mStartId = r1
                r0.mEndId = r2
                return
        }
    }

    protected interface MotionTracker {
        void addMovement(android.view.MotionEvent r1);

        void clear();

        void computeCurrentVelocity(int r1);

        void computeCurrentVelocity(int r1, float r2);

        float getXVelocity();

        float getXVelocity(int r1);

        float getYVelocity();

        float getYVelocity(int r1);

        void recycle();
    }

    private static class MyTracker implements androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker {

        /* renamed from: me */
        private static androidx.constraintlayout.motion.widget.MotionLayout.MyTracker f53me;
        android.view.VelocityTracker tracker;

        static {
                androidx.constraintlayout.motion.widget.MotionLayout$MyTracker r0 = new androidx.constraintlayout.motion.widget.MotionLayout$MyTracker
                r0.<init>()
                androidx.constraintlayout.motion.widget.MotionLayout.MyTracker.f53me = r0
                return
        }

        private MyTracker() {
                r0 = this;
                r0.<init>()
                return
        }

        public static androidx.constraintlayout.motion.widget.MotionLayout.MyTracker obtain() {
                androidx.constraintlayout.motion.widget.MotionLayout$MyTracker r0 = androidx.constraintlayout.motion.widget.MotionLayout.MyTracker.f53me
                android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
                r0.tracker = r1
                androidx.constraintlayout.motion.widget.MotionLayout$MyTracker r0 = androidx.constraintlayout.motion.widget.MotionLayout.MyTracker.f53me
                return r0
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public void addMovement(android.view.MotionEvent r2) {
                r1 = this;
                android.view.VelocityTracker r0 = r1.tracker
                if (r0 == 0) goto L7
                r0.addMovement(r2)
            L7:
                return
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public void clear() {
                r1 = this;
                android.view.VelocityTracker r0 = r1.tracker
                if (r0 == 0) goto L7
                r0.clear()
            L7:
                return
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public void computeCurrentVelocity(int r2) {
                r1 = this;
                android.view.VelocityTracker r0 = r1.tracker
                if (r0 == 0) goto L7
                r0.computeCurrentVelocity(r2)
            L7:
                return
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public void computeCurrentVelocity(int r2, float r3) {
                r1 = this;
                android.view.VelocityTracker r0 = r1.tracker
                if (r0 == 0) goto L7
                r0.computeCurrentVelocity(r2, r3)
            L7:
                return
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public float getXVelocity() {
                r1 = this;
                android.view.VelocityTracker r0 = r1.tracker
                if (r0 == 0) goto L9
                float r0 = r0.getXVelocity()
                return r0
            L9:
                r0 = 0
                return r0
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public float getXVelocity(int r2) {
                r1 = this;
                android.view.VelocityTracker r0 = r1.tracker
                if (r0 == 0) goto L9
                float r2 = r0.getXVelocity(r2)
                return r2
            L9:
                r2 = 0
                return r2
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public float getYVelocity() {
                r1 = this;
                android.view.VelocityTracker r0 = r1.tracker
                if (r0 == 0) goto L9
                float r0 = r0.getYVelocity()
                return r0
            L9:
                r0 = 0
                return r0
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public float getYVelocity(int r2) {
                r1 = this;
                android.view.VelocityTracker r0 = r1.tracker
                if (r0 == 0) goto L9
                float r2 = r1.getYVelocity(r2)
                return r2
            L9:
                r2 = 0
                return r2
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public void recycle() {
                r1 = this;
                android.view.VelocityTracker r0 = r1.tracker
                if (r0 == 0) goto La
                r0.recycle()
                r0 = 0
                r1.tracker = r0
            La:
                return
        }
    }

    class StateCache {
        final java.lang.String KeyEndState;
        final java.lang.String KeyProgress;
        final java.lang.String KeyStartState;
        final java.lang.String KeyVelocity;
        int endState;
        float mProgress;
        float mVelocity;
        int startState;
        final /* synthetic */ androidx.constraintlayout.motion.widget.MotionLayout this$0;

        StateCache(androidx.constraintlayout.motion.widget.MotionLayout r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r1 = 2143289344(0x7fc00000, float:NaN)
                r0.mProgress = r1
                r0.mVelocity = r1
                r1 = -1
                r0.startState = r1
                r0.endState = r1
                java.lang.String r1 = "motion.progress"
                r0.KeyProgress = r1
                java.lang.String r1 = "motion.velocity"
                r0.KeyVelocity = r1
                java.lang.String r1 = "motion.StartState"
                r0.KeyStartState = r1
                java.lang.String r1 = "motion.EndState"
                r0.KeyEndState = r1
                return
        }

        void apply() {
                r4 = this;
                int r0 = r4.startState
                r1 = -1
                if (r0 != r1) goto L9
                int r2 = r4.endState
                if (r2 == r1) goto L29
            L9:
                if (r0 != r1) goto L13
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r4.this$0
                int r2 = r4.endState
                r0.transitionToState(r2)
                goto L22
            L13:
                int r2 = r4.endState
                if (r2 != r1) goto L1d
                androidx.constraintlayout.motion.widget.MotionLayout r2 = r4.this$0
                r2.setState(r0, r1, r1)
                goto L22
            L1d:
                androidx.constraintlayout.motion.widget.MotionLayout r3 = r4.this$0
                r3.setTransition(r0, r2)
            L22:
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r4.this$0
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r2 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.SETUP
                r0.setState(r2)
            L29:
                float r0 = r4.mVelocity
                boolean r0 = java.lang.Float.isNaN(r0)
                if (r0 == 0) goto L42
                float r0 = r4.mProgress
                boolean r0 = java.lang.Float.isNaN(r0)
                if (r0 == 0) goto L3a
                return
            L3a:
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r4.this$0
                float r1 = r4.mProgress
                r0.setProgress(r1)
                return
            L42:
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r4.this$0
                float r2 = r4.mProgress
                float r3 = r4.mVelocity
                r0.setProgress(r2, r3)
                r0 = 2143289344(0x7fc00000, float:NaN)
                r4.mProgress = r0
                r4.mVelocity = r0
                r4.startState = r1
                r4.endState = r1
                return
        }

        public android.os.Bundle getTransitionState() {
                r3 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = "motion.progress"
                float r2 = r3.mProgress
                r0.putFloat(r1, r2)
                java.lang.String r1 = "motion.velocity"
                float r2 = r3.mVelocity
                r0.putFloat(r1, r2)
                java.lang.String r1 = "motion.StartState"
                int r2 = r3.startState
                r0.putInt(r1, r2)
                java.lang.String r1 = "motion.EndState"
                int r2 = r3.endState
                r0.putInt(r1, r2)
                return r0
        }

        public void recordState() {
                r1 = this;
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r1.this$0
                int r0 = androidx.constraintlayout.motion.widget.MotionLayout.access$100(r0)
                r1.endState = r0
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r1.this$0
                int r0 = androidx.constraintlayout.motion.widget.MotionLayout.access$200(r0)
                r1.startState = r0
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r1.this$0
                float r0 = r0.getVelocity()
                r1.mVelocity = r0
                androidx.constraintlayout.motion.widget.MotionLayout r0 = r1.this$0
                float r0 = r0.getProgress()
                r1.mProgress = r0
                return
        }

        public void setEndState(int r1) {
                r0 = this;
                r0.endState = r1
                return
        }

        public void setProgress(float r1) {
                r0 = this;
                r0.mProgress = r1
                return
        }

        public void setStartState(int r1) {
                r0 = this;
                r0.startState = r1
                return
        }

        public void setTransitionState(android.os.Bundle r2) {
                r1 = this;
                java.lang.String r0 = "motion.progress"
                float r0 = r2.getFloat(r0)
                r1.mProgress = r0
                java.lang.String r0 = "motion.velocity"
                float r0 = r2.getFloat(r0)
                r1.mVelocity = r0
                java.lang.String r0 = "motion.StartState"
                int r0 = r2.getInt(r0)
                r1.startState = r0
                java.lang.String r0 = "motion.EndState"
                int r2 = r2.getInt(r0)
                r1.endState = r2
                return
        }

        public void setVelocity(float r1) {
                r0 = this;
                r0.mVelocity = r1
                return
        }
    }

    public interface TransitionListener {
        void onTransitionChange(androidx.constraintlayout.motion.widget.MotionLayout r1, int r2, int r3, float r4);

        void onTransitionCompleted(androidx.constraintlayout.motion.widget.MotionLayout r1, int r2);

        void onTransitionStarted(androidx.constraintlayout.motion.widget.MotionLayout r1, int r2, int r3);

        void onTransitionTrigger(androidx.constraintlayout.motion.widget.MotionLayout r1, int r2, boolean r3, float r4);
    }

    enum TransitionState extends java.lang.Enum<androidx.constraintlayout.motion.widget.MotionLayout.TransitionState> {
        private static final /* synthetic */ androidx.constraintlayout.motion.widget.MotionLayout.TransitionState[] $VALUES = null;
        public static final androidx.constraintlayout.motion.widget.MotionLayout.TransitionState FINISHED = null;
        public static final androidx.constraintlayout.motion.widget.MotionLayout.TransitionState MOVING = null;
        public static final androidx.constraintlayout.motion.widget.MotionLayout.TransitionState SETUP = null;
        public static final androidx.constraintlayout.motion.widget.MotionLayout.TransitionState UNDEFINED = null;

        private static /* synthetic */ androidx.constraintlayout.motion.widget.MotionLayout.TransitionState[] $values() {
                r0 = 4
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState[] r0 = new androidx.constraintlayout.motion.widget.MotionLayout.TransitionState[r0]
                r1 = 0
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r2 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.UNDEFINED
                r0[r1] = r2
                r1 = 1
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r2 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.SETUP
                r0[r1] = r2
                r1 = 2
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r2 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING
                r0[r1] = r2
                r1 = 3
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r2 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
                r0[r1] = r2
                return r0
        }

        static {
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r0 = new androidx.constraintlayout.motion.widget.MotionLayout$TransitionState
                java.lang.String r1 = "UNDEFINED"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.UNDEFINED = r0
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r0 = new androidx.constraintlayout.motion.widget.MotionLayout$TransitionState
                java.lang.String r1 = "SETUP"
                r2 = 1
                r0.<init>(r1, r2)
                androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.SETUP = r0
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r0 = new androidx.constraintlayout.motion.widget.MotionLayout$TransitionState
                java.lang.String r1 = "MOVING"
                r2 = 2
                r0.<init>(r1, r2)
                androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING = r0
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r0 = new androidx.constraintlayout.motion.widget.MotionLayout$TransitionState
                java.lang.String r1 = "FINISHED"
                r2 = 3
                r0.<init>(r1, r2)
                androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED = r0
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState[] r0 = $values()
                androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.$VALUES = r0
                return
        }

        TransitionState(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.constraintlayout.motion.widget.MotionLayout.TransitionState valueOf(java.lang.String r1) {
                java.lang.Class<androidx.constraintlayout.motion.widget.MotionLayout$TransitionState> r0 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r1 = (androidx.constraintlayout.motion.widget.MotionLayout.TransitionState) r1
                return r1
        }

        public static androidx.constraintlayout.motion.widget.MotionLayout.TransitionState[] values() {
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState[] r0 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState[] r0 = (androidx.constraintlayout.motion.widget.MotionLayout.TransitionState[]) r0
                return r0
        }
    }

    public MotionLayout(android.content.Context r6) {
            r5 = this;
            r5.<init>(r6)
            r6 = 0
            r5.mProgressInterpolator = r6
            r0 = 0
            r5.mLastVelocity = r0
            r1 = -1
            r5.mBeginState = r1
            r5.mCurrentState = r1
            r5.mEndState = r1
            r1 = 0
            r5.mLastWidthMeasureSpec = r1
            r5.mLastHeightMeasureSpec = r1
            r2 = 1
            r5.mInteractionEnabled = r2
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r5.mFrameArrayList = r3
            r3 = 0
            r5.mAnimationStartTime = r3
            r3 = 1065353216(0x3f800000, float:1.0)
            r5.mTransitionDuration = r3
            r5.mTransitionPosition = r0
            r5.mTransitionLastPosition = r0
            r5.mTransitionGoalPosition = r0
            r5.mInTransition = r1
            r5.mIndirectTransition = r1
            r5.mDebugPath = r1
            r5.mTemporalInterpolator = r1
            androidx.constraintlayout.motion.utils.StopLogic r3 = new androidx.constraintlayout.motion.utils.StopLogic
            r3.<init>()
            r5.mStopLogic = r3
            androidx.constraintlayout.motion.widget.MotionLayout$DecelerateInterpolator r3 = new androidx.constraintlayout.motion.widget.MotionLayout$DecelerateInterpolator
            r3.<init>(r5)
            r5.mDecelerateLogic = r3
            r5.firstDown = r2
            r5.mUndergoingMotion = r1
            r5.mKeepAnimating = r1
            r5.mOnShowHelpers = r6
            r5.mOnHideHelpers = r6
            r5.mDecoratorsHelpers = r6
            r5.mTransitionListeners = r6
            r5.mFrames = r1
            r2 = -1
            r5.mLastDrawTime = r2
            r5.mLastFps = r0
            r5.mListenerState = r1
            r5.mListenerPosition = r0
            r5.mIsAnimating = r1
            r5.mMeasureDuringTransition = r1
            androidx.constraintlayout.core.motion.utils.KeyCache r0 = new androidx.constraintlayout.core.motion.utils.KeyCache
            r0.<init>()
            r5.mKeyCache = r0
            r5.mInLayout = r1
            r5.mOnComplete = r6
            r5.mScheduledTransitionTo = r6
            r5.mScheduledTransitions = r1
            r5.mInRotation = r1
            r5.mRotatMode = r1
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r5.mPreRotate = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r5.mTempRect = r0
            r5.mDelayedApply = r1
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r0 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.UNDEFINED
            r5.mTransitionState = r0
            androidx.constraintlayout.motion.widget.MotionLayout$Model r0 = new androidx.constraintlayout.motion.widget.MotionLayout$Model
            r0.<init>(r5)
            r5.mModel = r0
            r5.mNeedsFireTransitionCompleted = r1
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r5.mBoundsCheck = r0
            r5.mRegionView = r6
            r5.mInverseMatrix = r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.mTransitionCompleted = r0
            r5.init(r6)
            return
    }

    public MotionLayout(android.content.Context r6, android.util.AttributeSet r7) {
            r5 = this;
            r5.<init>(r6, r7)
            r6 = 0
            r5.mProgressInterpolator = r6
            r0 = 0
            r5.mLastVelocity = r0
            r1 = -1
            r5.mBeginState = r1
            r5.mCurrentState = r1
            r5.mEndState = r1
            r1 = 0
            r5.mLastWidthMeasureSpec = r1
            r5.mLastHeightMeasureSpec = r1
            r2 = 1
            r5.mInteractionEnabled = r2
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r5.mFrameArrayList = r3
            r3 = 0
            r5.mAnimationStartTime = r3
            r3 = 1065353216(0x3f800000, float:1.0)
            r5.mTransitionDuration = r3
            r5.mTransitionPosition = r0
            r5.mTransitionLastPosition = r0
            r5.mTransitionGoalPosition = r0
            r5.mInTransition = r1
            r5.mIndirectTransition = r1
            r5.mDebugPath = r1
            r5.mTemporalInterpolator = r1
            androidx.constraintlayout.motion.utils.StopLogic r3 = new androidx.constraintlayout.motion.utils.StopLogic
            r3.<init>()
            r5.mStopLogic = r3
            androidx.constraintlayout.motion.widget.MotionLayout$DecelerateInterpolator r3 = new androidx.constraintlayout.motion.widget.MotionLayout$DecelerateInterpolator
            r3.<init>(r5)
            r5.mDecelerateLogic = r3
            r5.firstDown = r2
            r5.mUndergoingMotion = r1
            r5.mKeepAnimating = r1
            r5.mOnShowHelpers = r6
            r5.mOnHideHelpers = r6
            r5.mDecoratorsHelpers = r6
            r5.mTransitionListeners = r6
            r5.mFrames = r1
            r2 = -1
            r5.mLastDrawTime = r2
            r5.mLastFps = r0
            r5.mListenerState = r1
            r5.mListenerPosition = r0
            r5.mIsAnimating = r1
            r5.mMeasureDuringTransition = r1
            androidx.constraintlayout.core.motion.utils.KeyCache r0 = new androidx.constraintlayout.core.motion.utils.KeyCache
            r0.<init>()
            r5.mKeyCache = r0
            r5.mInLayout = r1
            r5.mOnComplete = r6
            r5.mScheduledTransitionTo = r6
            r5.mScheduledTransitions = r1
            r5.mInRotation = r1
            r5.mRotatMode = r1
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r5.mPreRotate = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r5.mTempRect = r0
            r5.mDelayedApply = r1
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r0 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.UNDEFINED
            r5.mTransitionState = r0
            androidx.constraintlayout.motion.widget.MotionLayout$Model r0 = new androidx.constraintlayout.motion.widget.MotionLayout$Model
            r0.<init>(r5)
            r5.mModel = r0
            r5.mNeedsFireTransitionCompleted = r1
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r5.mBoundsCheck = r0
            r5.mRegionView = r6
            r5.mInverseMatrix = r6
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r5.mTransitionCompleted = r6
            r5.init(r7)
            return
    }

    public MotionLayout(android.content.Context r5, android.util.AttributeSet r6, int r7) {
            r4 = this;
            r4.<init>(r5, r6, r7)
            r5 = 0
            r4.mProgressInterpolator = r5
            r7 = 0
            r4.mLastVelocity = r7
            r0 = -1
            r4.mBeginState = r0
            r4.mCurrentState = r0
            r4.mEndState = r0
            r0 = 0
            r4.mLastWidthMeasureSpec = r0
            r4.mLastHeightMeasureSpec = r0
            r1 = 1
            r4.mInteractionEnabled = r1
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r4.mFrameArrayList = r2
            r2 = 0
            r4.mAnimationStartTime = r2
            r2 = 1065353216(0x3f800000, float:1.0)
            r4.mTransitionDuration = r2
            r4.mTransitionPosition = r7
            r4.mTransitionLastPosition = r7
            r4.mTransitionGoalPosition = r7
            r4.mInTransition = r0
            r4.mIndirectTransition = r0
            r4.mDebugPath = r0
            r4.mTemporalInterpolator = r0
            androidx.constraintlayout.motion.utils.StopLogic r2 = new androidx.constraintlayout.motion.utils.StopLogic
            r2.<init>()
            r4.mStopLogic = r2
            androidx.constraintlayout.motion.widget.MotionLayout$DecelerateInterpolator r2 = new androidx.constraintlayout.motion.widget.MotionLayout$DecelerateInterpolator
            r2.<init>(r4)
            r4.mDecelerateLogic = r2
            r4.firstDown = r1
            r4.mUndergoingMotion = r0
            r4.mKeepAnimating = r0
            r4.mOnShowHelpers = r5
            r4.mOnHideHelpers = r5
            r4.mDecoratorsHelpers = r5
            r4.mTransitionListeners = r5
            r4.mFrames = r0
            r1 = -1
            r4.mLastDrawTime = r1
            r4.mLastFps = r7
            r4.mListenerState = r0
            r4.mListenerPosition = r7
            r4.mIsAnimating = r0
            r4.mMeasureDuringTransition = r0
            androidx.constraintlayout.core.motion.utils.KeyCache r7 = new androidx.constraintlayout.core.motion.utils.KeyCache
            r7.<init>()
            r4.mKeyCache = r7
            r4.mInLayout = r0
            r4.mOnComplete = r5
            r4.mScheduledTransitionTo = r5
            r4.mScheduledTransitions = r0
            r4.mInRotation = r0
            r4.mRotatMode = r0
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            r4.mPreRotate = r7
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            r4.mTempRect = r7
            r4.mDelayedApply = r0
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r7 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.UNDEFINED
            r4.mTransitionState = r7
            androidx.constraintlayout.motion.widget.MotionLayout$Model r7 = new androidx.constraintlayout.motion.widget.MotionLayout$Model
            r7.<init>(r4)
            r4.mModel = r7
            r4.mNeedsFireTransitionCompleted = r0
            android.graphics.RectF r7 = new android.graphics.RectF
            r7.<init>()
            r4.mBoundsCheck = r7
            r4.mRegionView = r5
            r4.mInverseMatrix = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4.mTransitionCompleted = r5
            r4.init(r6)
            return
    }

    static /* synthetic */ androidx.constraintlayout.motion.widget.MotionLayout.StateCache access$000(androidx.constraintlayout.motion.widget.MotionLayout r0) {
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r0 = r0.mStateCache
            return r0
    }

    static /* synthetic */ int access$100(androidx.constraintlayout.motion.widget.MotionLayout r0) {
            int r0 = r0.mEndState
            return r0
    }

    static /* synthetic */ void access$1000(androidx.constraintlayout.motion.widget.MotionLayout r0, androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1, int r2, int r3, int r4) {
            r0.resolveSystem(r1, r2, r3, r4)
            return
    }

    static /* synthetic */ void access$1100(androidx.constraintlayout.motion.widget.MotionLayout r0, boolean r1, android.view.View r2, androidx.constraintlayout.core.widgets.ConstraintWidget r3, androidx.constraintlayout.widget.ConstraintLayout.LayoutParams r4, android.util.SparseArray r5) {
            r0.applyConstraintsFromLayoutParams(r1, r2, r3, r4, r5)
            return
    }

    static /* synthetic */ int access$1200(androidx.constraintlayout.motion.widget.MotionLayout r0) {
            int r0 = r0.mLastWidthMeasureSpec
            return r0
    }

    static /* synthetic */ int access$1300(androidx.constraintlayout.motion.widget.MotionLayout r0) {
            int r0 = r0.mLastHeightMeasureSpec
            return r0
    }

    static /* synthetic */ void access$1400(androidx.constraintlayout.motion.widget.MotionLayout r0) {
            r0.setupMotionViews()
            return
    }

    static /* synthetic */ void access$1500(androidx.constraintlayout.motion.widget.MotionLayout r0, int r1, int r2, int r3, int r4, boolean r5, boolean r6) {
            r0.resolveMeasuredDimension(r1, r2, r3, r4, r5, r6)
            return
    }

    static /* synthetic */ void access$1600(androidx.constraintlayout.motion.widget.MotionLayout r0, androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1, int r2, int r3, int r4) {
            r0.resolveSystem(r1, r2, r3, r4)
            return
    }

    static /* synthetic */ void access$1700(androidx.constraintlayout.motion.widget.MotionLayout r0, androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1, int r2, int r3, int r4) {
            r0.resolveSystem(r1, r2, r3, r4)
            return
    }

    static /* synthetic */ void access$1800(androidx.constraintlayout.motion.widget.MotionLayout r0, androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1, int r2, int r3, int r4) {
            r0.resolveSystem(r1, r2, r3, r4)
            return
    }

    static /* synthetic */ void access$1900(androidx.constraintlayout.motion.widget.MotionLayout r0, androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1, int r2, int r3, int r4) {
            r0.resolveSystem(r1, r2, r3, r4)
            return
    }

    static /* synthetic */ int access$200(androidx.constraintlayout.motion.widget.MotionLayout r0) {
            int r0 = r0.mBeginState
            return r0
    }

    static /* synthetic */ android.graphics.Rect access$2000(androidx.constraintlayout.motion.widget.MotionLayout r0, androidx.constraintlayout.core.widgets.ConstraintWidget r1) {
            android.graphics.Rect r0 = r0.toRect(r1)
            return r0
    }

    static /* synthetic */ int access$2100(androidx.constraintlayout.motion.widget.MotionLayout r0) {
            int r0 = r0.mPreRotateWidth
            return r0
    }

    static /* synthetic */ int access$2200(androidx.constraintlayout.motion.widget.MotionLayout r0) {
            int r0 = r0.mPreRotateHeight
            return r0
    }

    static /* synthetic */ boolean access$300(androidx.constraintlayout.motion.widget.MotionLayout r0) {
            boolean r0 = r0.mInRotation
            return r0
    }

    static /* synthetic */ boolean access$302(androidx.constraintlayout.motion.widget.MotionLayout r0, boolean r1) {
            r0.mInRotation = r1
            return r1
    }

    static /* synthetic */ androidx.constraintlayout.core.widgets.ConstraintWidgetContainer access$400(androidx.constraintlayout.motion.widget.MotionLayout r0) {
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = r0.mLayoutWidget
            return r0
    }

    static /* synthetic */ androidx.constraintlayout.core.widgets.ConstraintWidgetContainer access$500(androidx.constraintlayout.motion.widget.MotionLayout r0) {
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = r0.mLayoutWidget
            return r0
    }

    static /* synthetic */ androidx.constraintlayout.core.widgets.ConstraintWidgetContainer access$600(androidx.constraintlayout.motion.widget.MotionLayout r0) {
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = r0.mLayoutWidget
            return r0
    }

    static /* synthetic */ androidx.constraintlayout.core.widgets.ConstraintWidgetContainer access$700(androidx.constraintlayout.motion.widget.MotionLayout r0) {
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = r0.mLayoutWidget
            return r0
    }

    static /* synthetic */ boolean access$800(androidx.constraintlayout.motion.widget.MotionLayout r0) {
            boolean r0 = r0.isRtl()
            return r0
    }

    static /* synthetic */ boolean access$900(androidx.constraintlayout.motion.widget.MotionLayout r0) {
            boolean r0 = r0.isRtl()
            return r0
    }

    private boolean callTransformedTouchEvent(android.view.View r3, android.view.MotionEvent r4, float r5, float r6) {
            r2 = this;
            android.graphics.Matrix r0 = r3.getMatrix()
            boolean r1 = r0.isIdentity()
            if (r1 == 0) goto L17
            r4.offsetLocation(r5, r6)
            boolean r3 = r3.onTouchEvent(r4)
            float r5 = -r5
            float r6 = -r6
            r4.offsetLocation(r5, r6)
            return r3
        L17:
            android.view.MotionEvent r4 = android.view.MotionEvent.obtain(r4)
            r4.offsetLocation(r5, r6)
            android.graphics.Matrix r5 = r2.mInverseMatrix
            if (r5 != 0) goto L29
            android.graphics.Matrix r5 = new android.graphics.Matrix
            r5.<init>()
            r2.mInverseMatrix = r5
        L29:
            android.graphics.Matrix r5 = r2.mInverseMatrix
            r0.invert(r5)
            android.graphics.Matrix r5 = r2.mInverseMatrix
            r4.transform(r5)
            boolean r3 = r3.onTouchEvent(r4)
            r4.recycle()
            return r3
    }

    private void checkStructure() {
            r11 = this;
            androidx.constraintlayout.motion.widget.MotionScene r0 = r11.mScene
            java.lang.String r1 = "MotionLayout"
            if (r0 != 0) goto Lc
            java.lang.String r0 = "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\""
            android.util.Log.e(r1, r0)
            return
        Lc:
            int r0 = r0.getStartId()
            androidx.constraintlayout.motion.widget.MotionScene r2 = r11.mScene
            int r3 = r2.getStartId()
            androidx.constraintlayout.widget.ConstraintSet r2 = r2.getConstraintSet(r3)
            r11.checkStructure(r0, r2)
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            android.util.SparseIntArray r2 = new android.util.SparseIntArray
            r2.<init>()
            androidx.constraintlayout.motion.widget.MotionScene r3 = r11.mScene
            java.util.ArrayList r3 = r3.getDefinedTransitions()
            java.util.Iterator r3 = r3.iterator()
        L31:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Le1
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.MotionScene$Transition r4 = (androidx.constraintlayout.motion.widget.MotionScene.Transition) r4
            androidx.constraintlayout.motion.widget.MotionScene r5 = r11.mScene
            androidx.constraintlayout.motion.widget.MotionScene$Transition r5 = r5.mCurrentTransition
            if (r4 != r5) goto L48
            java.lang.String r5 = "CHECK: CURRENT"
            android.util.Log.v(r1, r5)
        L48:
            r11.checkStructure(r4)
            int r5 = r4.getStartConstraintSetId()
            int r4 = r4.getEndConstraintSetId()
            android.content.Context r6 = r11.getContext()
            java.lang.String r6 = androidx.constraintlayout.motion.widget.Debug.getName(r6, r5)
            android.content.Context r7 = r11.getContext()
            java.lang.String r7 = androidx.constraintlayout.motion.widget.Debug.getName(r7, r4)
            int r8 = r0.get(r5)
            java.lang.String r9 = "->"
            if (r8 != r4) goto L85
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r10 = "CHECK: two transitions with the same start and end "
            r8.<init>(r10)
            java.lang.StringBuilder r8 = r8.append(r6)
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.StringBuilder r8 = r8.append(r7)
            java.lang.String r8 = r8.toString()
            android.util.Log.e(r1, r8)
        L85:
            int r8 = r2.get(r4)
            if (r8 != r5) goto La5
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r10 = "CHECK: you can't have reverse transitions"
            r8.<init>(r10)
            java.lang.StringBuilder r8 = r8.append(r6)
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.StringBuilder r7 = r8.append(r7)
            java.lang.String r7 = r7.toString()
            android.util.Log.e(r1, r7)
        La5:
            r0.put(r5, r4)
            r2.put(r4, r5)
            androidx.constraintlayout.motion.widget.MotionScene r7 = r11.mScene
            androidx.constraintlayout.widget.ConstraintSet r5 = r7.getConstraintSet(r5)
            if (r5 != 0) goto Lc5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = " no such constraintSetStart "
            r5.<init>(r7)
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.util.Log.e(r1, r5)
        Lc5:
            androidx.constraintlayout.motion.widget.MotionScene r5 = r11.mScene
            androidx.constraintlayout.widget.ConstraintSet r4 = r5.getConstraintSet(r4)
            if (r4 != 0) goto L31
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = " no such constraintSetEnd "
            r4.<init>(r5)
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r4 = r4.toString()
            android.util.Log.e(r1, r4)
            goto L31
        Le1:
            return
    }

    private void checkStructure(int r11, androidx.constraintlayout.widget.ConstraintSet r12) {
            r10 = this;
            android.content.Context r0 = r10.getContext()
            java.lang.String r11 = androidx.constraintlayout.motion.widget.Debug.getName(r0, r11)
            int r0 = r10.getChildCount()
            r1 = 0
            r2 = r1
        Le:
            r3 = -1
            java.lang.String r4 = "CHECK: "
            java.lang.String r5 = "MotionLayout"
            if (r2 >= r0) goto L6e
            android.view.View r6 = r10.getChildAt(r2)
            int r7 = r6.getId()
            if (r7 != r3) goto L47
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r4)
            java.lang.StringBuilder r3 = r3.append(r11)
            java.lang.String r8 = " ALL VIEWS SHOULD HAVE ID's "
            java.lang.StringBuilder r3 = r3.append(r8)
            java.lang.Class r8 = r6.getClass()
            java.lang.String r8 = r8.getName()
            java.lang.StringBuilder r3 = r3.append(r8)
            java.lang.String r8 = " does not!"
            java.lang.StringBuilder r3 = r3.append(r8)
            java.lang.String r3 = r3.toString()
            android.util.Log.w(r5, r3)
        L47:
            androidx.constraintlayout.widget.ConstraintSet$Constraint r3 = r12.getConstraint(r7)
            if (r3 != 0) goto L6b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r4)
            java.lang.StringBuilder r3 = r3.append(r11)
            java.lang.String r4 = " NO CONSTRAINTS for "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = androidx.constraintlayout.motion.widget.Debug.getName(r6)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.util.Log.w(r5, r3)
        L6b:
            int r2 = r2 + 1
            goto Le
        L6e:
            int[] r0 = r12.getKnownIds()
        L72:
            int r2 = r0.length
            if (r1 >= r2) goto Lec
            r2 = r0[r1]
            android.content.Context r6 = r10.getContext()
            java.lang.String r6 = androidx.constraintlayout.motion.widget.Debug.getName(r6, r2)
            r7 = r0[r1]
            android.view.View r7 = r10.findViewById(r7)
            if (r7 != 0) goto La1
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r4)
            java.lang.StringBuilder r7 = r7.append(r11)
            java.lang.String r8 = " NO View matches id "
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.StringBuilder r7 = r7.append(r6)
            java.lang.String r7 = r7.toString()
            android.util.Log.w(r5, r7)
        La1:
            int r7 = r12.getHeight(r2)
            java.lang.String r8 = ") no LAYOUT_HEIGHT"
            java.lang.String r9 = "("
            if (r7 != r3) goto Lc7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r4)
            java.lang.StringBuilder r7 = r7.append(r11)
            java.lang.StringBuilder r7 = r7.append(r9)
            java.lang.StringBuilder r7 = r7.append(r6)
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            android.util.Log.w(r5, r7)
        Lc7:
            int r2 = r12.getWidth(r2)
            if (r2 != r3) goto Le9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r4)
            java.lang.StringBuilder r2 = r2.append(r11)
            java.lang.StringBuilder r2 = r2.append(r9)
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.StringBuilder r2 = r2.append(r8)
            java.lang.String r2 = r2.toString()
            android.util.Log.w(r5, r2)
        Le9:
            int r1 = r1 + 1
            goto L72
        Lec:
            return
    }

    private void checkStructure(androidx.constraintlayout.motion.widget.MotionScene.Transition r2) {
            r1 = this;
            int r0 = r2.getStartConstraintSetId()
            int r2 = r2.getEndConstraintSetId()
            if (r0 != r2) goto L11
            java.lang.String r2 = "MotionLayout"
            java.lang.String r0 = "CHECK: start and end constraint set should not be the same!"
            android.util.Log.e(r2, r0)
        L11:
            return
    }

    private void computeCurrentPositions() {
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L1c
            android.view.View r2 = r4.getChildAt(r1)
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r3 = r4.mFrameArrayList
            java.lang.Object r3 = r3.get(r2)
            androidx.constraintlayout.motion.widget.MotionController r3 = (androidx.constraintlayout.motion.widget.MotionController) r3
            if (r3 != 0) goto L16
            goto L19
        L16:
            r3.setStartCurrentState(r2)
        L19:
            int r1 = r1 + 1
            goto L5
        L1c:
            return
    }

    private void debugPos() {
            r6 = this;
            r0 = 0
        L1:
            int r1 = r6.getChildCount()
            if (r0 >= r1) goto L64
            android.view.View r1 = r6.getChildAt(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = " "
            r2.<init>(r3)
            java.lang.String r4 = androidx.constraintlayout.motion.widget.Debug.getLocation()
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r4 = androidx.constraintlayout.motion.widget.Debug.getName(r6)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.StringBuilder r2 = r2.append(r3)
            android.content.Context r4 = r6.getContext()
            int r5 = r6.mCurrentState
            java.lang.String r4 = androidx.constraintlayout.motion.widget.Debug.getName(r4, r5)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r4 = androidx.constraintlayout.motion.widget.Debug.getName(r1)
            java.lang.StringBuilder r2 = r2.append(r4)
            int r4 = r1.getLeft()
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.StringBuilder r2 = r2.append(r3)
            int r1 = r1.getTop()
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MotionLayout"
            android.util.Log.v(r2, r1)
            int r0 = r0 + 1
            goto L1
        L64:
            return
    }

    private void evaluateLayout() {
            r11 = this;
            float r0 = r11.mTransitionGoalPosition
            float r1 = r11.mTransitionLastPosition
            float r0 = r0 - r1
            float r0 = java.lang.Math.signum(r0)
            long r1 = r11.getNanoTime()
            android.view.animation.Interpolator r3 = r11.mInterpolator
            boolean r4 = r3 instanceof androidx.constraintlayout.motion.utils.StopLogic
            r5 = 814313567(0x3089705f, float:1.0E-9)
            r6 = 0
            if (r4 != 0) goto L22
            long r7 = r11.mTransitionLastTime
            long r7 = r1 - r7
            float r4 = (float) r7
            float r4 = r4 * r0
            float r4 = r4 * r5
            float r7 = r11.mTransitionDuration
            float r4 = r4 / r7
            goto L23
        L22:
            r4 = r6
        L23:
            float r7 = r11.mTransitionLastPosition
            float r7 = r7 + r4
            boolean r4 = r11.mTransitionInstantly
            if (r4 == 0) goto L2c
            float r7 = r11.mTransitionGoalPosition
        L2c:
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            r8 = 0
            if (r4 <= 0) goto L37
            float r9 = r11.mTransitionGoalPosition
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 >= 0) goto L41
        L37:
            int r9 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r9 > 0) goto L45
            float r9 = r11.mTransitionGoalPosition
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 > 0) goto L45
        L41:
            float r7 = r11.mTransitionGoalPosition
            r9 = 1
            goto L46
        L45:
            r9 = r8
        L46:
            if (r3 == 0) goto L5c
            if (r9 != 0) goto L5c
            boolean r9 = r11.mTemporalInterpolator
            if (r9 == 0) goto L58
            long r9 = r11.mAnimationStartTime
            long r1 = r1 - r9
            float r1 = (float) r1
            float r1 = r1 * r5
            float r7 = r3.getInterpolation(r1)
            goto L5c
        L58:
            float r7 = r3.getInterpolation(r7)
        L5c:
            if (r4 <= 0) goto L64
            float r1 = r11.mTransitionGoalPosition
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 >= 0) goto L6e
        L64:
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 > 0) goto L70
            float r0 = r11.mTransitionGoalPosition
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 > 0) goto L70
        L6e:
            float r7 = r11.mTransitionGoalPosition
        L70:
            r11.mPostInterpolationPosition = r7
            int r0 = r11.getChildCount()
            long r9 = r11.getNanoTime()
            android.view.animation.Interpolator r1 = r11.mProgressInterpolator
            if (r1 != 0) goto L7f
            goto L83
        L7f:
            float r7 = r1.getInterpolation(r7)
        L83:
            if (r8 >= r0) goto L9d
            android.view.View r2 = r11.getChildAt(r8)
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r1 = r11.mFrameArrayList
            java.lang.Object r1 = r1.get(r2)
            androidx.constraintlayout.motion.widget.MotionController r1 = (androidx.constraintlayout.motion.widget.MotionController) r1
            if (r1 == 0) goto L9a
            androidx.constraintlayout.core.motion.utils.KeyCache r6 = r11.mKeyCache
            r3 = r7
            r4 = r9
            r1.interpolate(r2, r3, r4, r6)
        L9a:
            int r8 = r8 + 1
            goto L83
        L9d:
            boolean r0 = r11.mMeasureDuringTransition
            if (r0 == 0) goto La4
            r11.requestLayout()
        La4:
            return
    }

    private void fireTransitionChange() {
            r6 = this;
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionListener r0 = r6.mTransitionListener
            if (r0 != 0) goto Le
            java.util.concurrent.CopyOnWriteArrayList<androidx.constraintlayout.motion.widget.MotionLayout$TransitionListener> r0 = r6.mTransitionListeners
            if (r0 == 0) goto L76
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L76
        Le:
            float r0 = r6.mListenerPosition
            float r1 = r6.mTransitionPosition
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L76
            int r0 = r6.mListenerState
            r1 = 1
            r2 = -1
            if (r0 == r2) goto L45
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionListener r0 = r6.mTransitionListener
            if (r0 == 0) goto L27
            int r3 = r6.mBeginState
            int r4 = r6.mEndState
            r0.onTransitionStarted(r6, r3, r4)
        L27:
            java.util.concurrent.CopyOnWriteArrayList<androidx.constraintlayout.motion.widget.MotionLayout$TransitionListener> r0 = r6.mTransitionListeners
            if (r0 == 0) goto L43
            java.util.Iterator r0 = r0.iterator()
        L2f:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L43
            java.lang.Object r3 = r0.next()
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionListener r3 = (androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener) r3
            int r4 = r6.mBeginState
            int r5 = r6.mEndState
            r3.onTransitionStarted(r6, r4, r5)
            goto L2f
        L43:
            r6.mIsAnimating = r1
        L45:
            r6.mListenerState = r2
            float r0 = r6.mTransitionPosition
            r6.mListenerPosition = r0
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionListener r2 = r6.mTransitionListener
            if (r2 == 0) goto L56
            int r3 = r6.mBeginState
            int r4 = r6.mEndState
            r2.onTransitionChange(r6, r3, r4, r0)
        L56:
            java.util.concurrent.CopyOnWriteArrayList<androidx.constraintlayout.motion.widget.MotionLayout$TransitionListener> r0 = r6.mTransitionListeners
            if (r0 == 0) goto L74
            java.util.Iterator r0 = r0.iterator()
        L5e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L74
            java.lang.Object r2 = r0.next()
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionListener r2 = (androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener) r2
            int r3 = r6.mBeginState
            int r4 = r6.mEndState
            float r5 = r6.mTransitionPosition
            r2.onTransitionChange(r6, r3, r4, r5)
            goto L5e
        L74:
            r6.mIsAnimating = r1
        L76:
            return
    }

    private void fireTransitionStarted(androidx.constraintlayout.motion.widget.MotionLayout r3, int r4, int r5) {
            r2 = this;
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionListener r0 = r2.mTransitionListener
            if (r0 == 0) goto L7
            r0.onTransitionStarted(r2, r4, r5)
        L7:
            java.util.concurrent.CopyOnWriteArrayList<androidx.constraintlayout.motion.widget.MotionLayout$TransitionListener> r0 = r2.mTransitionListeners
            if (r0 == 0) goto L1f
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionListener r1 = (androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener) r1
            r1.onTransitionStarted(r3, r4, r5)
            goto Lf
        L1f:
            return
    }

    private boolean handlesTouchEvent(float r8, float r9, android.view.View r10, android.view.MotionEvent r11) {
            r7 = this;
            boolean r0 = r10 instanceof android.view.ViewGroup
            r1 = 1
            if (r0 == 0) goto L36
            r0 = r10
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r2 = r0.getChildCount()
            int r2 = r2 - r1
        Ld:
            if (r2 < 0) goto L36
            android.view.View r3 = r0.getChildAt(r2)
            int r4 = r3.getLeft()
            float r4 = (float) r4
            float r4 = r4 + r8
            int r5 = r10.getScrollX()
            float r5 = (float) r5
            float r4 = r4 - r5
            int r5 = r3.getTop()
            float r5 = (float) r5
            float r5 = r5 + r9
            int r6 = r10.getScrollY()
            float r6 = (float) r6
            float r5 = r5 - r6
            boolean r3 = r7.handlesTouchEvent(r4, r5, r3, r11)
            if (r3 == 0) goto L33
            r0 = r1
            goto L37
        L33:
            int r2 = r2 + (-1)
            goto Ld
        L36:
            r0 = 0
        L37:
            if (r0 != 0) goto L75
            android.graphics.RectF r2 = r7.mBoundsCheck
            int r3 = r10.getRight()
            float r3 = (float) r3
            float r3 = r3 + r8
            int r4 = r10.getLeft()
            float r4 = (float) r4
            float r3 = r3 - r4
            int r4 = r10.getBottom()
            float r4 = (float) r4
            float r4 = r4 + r9
            int r5 = r10.getTop()
            float r5 = (float) r5
            float r4 = r4 - r5
            r2.set(r8, r9, r3, r4)
            int r2 = r11.getAction()
            if (r2 != 0) goto L6c
            android.graphics.RectF r2 = r7.mBoundsCheck
            float r3 = r11.getX()
            float r4 = r11.getY()
            boolean r2 = r2.contains(r3, r4)
            if (r2 == 0) goto L75
        L6c:
            float r8 = -r8
            float r9 = -r9
            boolean r8 = r7.callTransformedTouchEvent(r10, r11, r8, r9)
            if (r8 == 0) goto L75
            goto L76
        L75:
            r1 = r0
        L76:
            return r1
    }

    private void init(android.util.AttributeSet r10) {
            r9 = this;
            boolean r0 = r9.isInEditMode()
            androidx.constraintlayout.motion.widget.MotionLayout.IS_IN_EDIT_MODE = r0
            r0 = -1
            if (r10 == 0) goto L8b
            android.content.Context r1 = r9.getContext()
            int[] r2 = androidx.constraintlayout.widget.C0156R.styleable.MotionLayout
            android.content.res.TypedArray r10 = r1.obtainStyledAttributes(r10, r2)
            int r1 = r10.getIndexCount()
            r2 = 1
            r3 = 0
            r5 = r2
            r4 = r3
        L1b:
            if (r4 >= r1) goto L78
            int r6 = r10.getIndex(r4)
            int r7 = androidx.constraintlayout.widget.C0156R.styleable.MotionLayout_layoutDescription
            if (r6 != r7) goto L35
            int r6 = r10.getResourceId(r6, r0)
            androidx.constraintlayout.motion.widget.MotionScene r7 = new androidx.constraintlayout.motion.widget.MotionScene
            android.content.Context r8 = r9.getContext()
            r7.<init>(r8, r9, r6)
            r9.mScene = r7
            goto L75
        L35:
            int r7 = androidx.constraintlayout.widget.C0156R.styleable.MotionLayout_currentState
            if (r6 != r7) goto L40
            int r6 = r10.getResourceId(r6, r0)
            r9.mCurrentState = r6
            goto L75
        L40:
            int r7 = androidx.constraintlayout.widget.C0156R.styleable.MotionLayout_motionProgress
            if (r6 != r7) goto L4e
            r7 = 0
            float r6 = r10.getFloat(r6, r7)
            r9.mTransitionGoalPosition = r6
            r9.mInTransition = r2
            goto L75
        L4e:
            int r7 = androidx.constraintlayout.widget.C0156R.styleable.MotionLayout_applyMotionScene
            if (r6 != r7) goto L57
            boolean r5 = r10.getBoolean(r6, r5)
            goto L75
        L57:
            int r7 = androidx.constraintlayout.widget.C0156R.styleable.MotionLayout_showPaths
            if (r6 != r7) goto L6b
            int r7 = r9.mDebugPath
            if (r7 != 0) goto L75
            boolean r6 = r10.getBoolean(r6, r3)
            if (r6 == 0) goto L67
            r6 = 2
            goto L68
        L67:
            r6 = r3
        L68:
            r9.mDebugPath = r6
            goto L75
        L6b:
            int r7 = androidx.constraintlayout.widget.C0156R.styleable.MotionLayout_motionDebug
            if (r6 != r7) goto L75
            int r6 = r10.getInt(r6, r3)
            r9.mDebugPath = r6
        L75:
            int r4 = r4 + 1
            goto L1b
        L78:
            r10.recycle()
            androidx.constraintlayout.motion.widget.MotionScene r10 = r9.mScene
            if (r10 != 0) goto L86
            java.lang.String r10 = "MotionLayout"
            java.lang.String r1 = "WARNING NO app:layoutDescription tag"
            android.util.Log.e(r10, r1)
        L86:
            if (r5 != 0) goto L8b
            r10 = 0
            r9.mScene = r10
        L8b:
            int r10 = r9.mDebugPath
            if (r10 == 0) goto L92
            r9.checkStructure()
        L92:
            int r10 = r9.mCurrentState
            if (r10 != r0) goto Lb0
            androidx.constraintlayout.motion.widget.MotionScene r10 = r9.mScene
            if (r10 == 0) goto Lb0
            int r10 = r10.getStartId()
            r9.mCurrentState = r10
            androidx.constraintlayout.motion.widget.MotionScene r10 = r9.mScene
            int r10 = r10.getStartId()
            r9.mBeginState = r10
            androidx.constraintlayout.motion.widget.MotionScene r10 = r9.mScene
            int r10 = r10.getEndId()
            r9.mEndState = r10
        Lb0:
            return
    }

    private void processTransitionCompleted() {
            r5 = this;
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionListener r0 = r5.mTransitionListener
            if (r0 != 0) goto Lf
            java.util.concurrent.CopyOnWriteArrayList<androidx.constraintlayout.motion.widget.MotionLayout$TransitionListener> r0 = r5.mTransitionListeners
            if (r0 == 0) goto Le
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lf
        Le:
            return
        Lf:
            r0 = 0
            r5.mIsAnimating = r0
            java.util.ArrayList<java.lang.Integer> r0 = r5.mTransitionCompleted
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4b
            java.lang.Object r1 = r0.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionListener r2 = r5.mTransitionListener
            if (r2 == 0) goto L2f
            int r3 = r1.intValue()
            r2.onTransitionCompleted(r5, r3)
        L2f:
            java.util.concurrent.CopyOnWriteArrayList<androidx.constraintlayout.motion.widget.MotionLayout$TransitionListener> r2 = r5.mTransitionListeners
            if (r2 == 0) goto L18
            java.util.Iterator r2 = r2.iterator()
        L37:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L18
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionListener r3 = (androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener) r3
            int r4 = r1.intValue()
            r3.onTransitionCompleted(r5, r4)
            goto L37
        L4b:
            java.util.ArrayList<java.lang.Integer> r0 = r5.mTransitionCompleted
            r0.clear()
            return
    }

    private void setupMotionViews() {
            r15 = this;
            int r0 = r15.getChildCount()
            androidx.constraintlayout.motion.widget.MotionLayout$Model r1 = r15.mModel
            r1.build()
            r1 = 1
            r15.mInTransition = r1
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r3 = 0
            r4 = r3
        L13:
            if (r4 >= r0) goto L2b
            android.view.View r5 = r15.getChildAt(r4)
            int r6 = r5.getId()
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r7 = r15.mFrameArrayList
            java.lang.Object r5 = r7.get(r5)
            androidx.constraintlayout.motion.widget.MotionController r5 = (androidx.constraintlayout.motion.widget.MotionController) r5
            r2.put(r6, r5)
            int r4 = r4 + 1
            goto L13
        L2b:
            int r2 = r15.getWidth()
            int r4 = r15.getHeight()
            androidx.constraintlayout.motion.widget.MotionScene r5 = r15.mScene
            int r5 = r5.gatPathMotionArc()
            r6 = -1
            if (r5 == r6) goto L53
            r7 = r3
        L3d:
            if (r7 >= r0) goto L53
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r8 = r15.mFrameArrayList
            android.view.View r9 = r15.getChildAt(r7)
            java.lang.Object r8 = r8.get(r9)
            androidx.constraintlayout.motion.widget.MotionController r8 = (androidx.constraintlayout.motion.widget.MotionController) r8
            if (r8 == 0) goto L50
            r8.setPathMotionArc(r5)
        L50:
            int r7 = r7 + 1
            goto L3d
        L53:
            android.util.SparseBooleanArray r11 = new android.util.SparseBooleanArray
            r11.<init>()
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r5 = r15.mFrameArrayList
            int r5 = r5.size()
            int[] r12 = new int[r5]
            r5 = r3
            r13 = r5
        L62:
            if (r5 >= r0) goto L89
            android.view.View r7 = r15.getChildAt(r5)
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r8 = r15.mFrameArrayList
            java.lang.Object r7 = r8.get(r7)
            androidx.constraintlayout.motion.widget.MotionController r7 = (androidx.constraintlayout.motion.widget.MotionController) r7
            int r8 = r7.getAnimateRelativeTo()
            if (r8 == r6) goto L86
            int r8 = r7.getAnimateRelativeTo()
            r11.put(r8, r1)
            int r8 = r13 + 1
            int r7 = r7.getAnimateRelativeTo()
            r12[r13] = r7
            r13 = r8
        L86:
            int r5 = r5 + 1
            goto L62
        L89:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> r5 = r15.mDecoratorsHelpers
            if (r5 == 0) goto Le3
            r5 = r3
        L8e:
            if (r5 >= r13) goto La9
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r6 = r15.mFrameArrayList
            r7 = r12[r5]
            android.view.View r7 = r15.findViewById(r7)
            java.lang.Object r6 = r6.get(r7)
            androidx.constraintlayout.motion.widget.MotionController r6 = (androidx.constraintlayout.motion.widget.MotionController) r6
            if (r6 != 0) goto La1
            goto La6
        La1:
            androidx.constraintlayout.motion.widget.MotionScene r7 = r15.mScene
            r7.getKeyFrames(r6)
        La6:
            int r5 = r5 + 1
            goto L8e
        La9:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> r5 = r15.mDecoratorsHelpers
            java.util.Iterator r5 = r5.iterator()
        Laf:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto Lc1
            java.lang.Object r6 = r5.next()
            androidx.constraintlayout.motion.widget.MotionHelper r6 = (androidx.constraintlayout.motion.widget.MotionHelper) r6
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r7 = r15.mFrameArrayList
            r6.onPreSetup(r15, r7)
            goto Laf
        Lc1:
            r14 = r3
        Lc2:
            if (r14 >= r13) goto L10a
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r5 = r15.mFrameArrayList
            r6 = r12[r14]
            android.view.View r6 = r15.findViewById(r6)
            java.lang.Object r5 = r5.get(r6)
            androidx.constraintlayout.motion.widget.MotionController r5 = (androidx.constraintlayout.motion.widget.MotionController) r5
            if (r5 != 0) goto Ld5
            goto Le0
        Ld5:
            float r8 = r15.mTransitionDuration
            long r9 = r15.getNanoTime()
            r6 = r2
            r7 = r4
            r5.setup(r6, r7, r8, r9)
        Le0:
            int r14 = r14 + 1
            goto Lc2
        Le3:
            r14 = r3
        Le4:
            if (r14 >= r13) goto L10a
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r5 = r15.mFrameArrayList
            r6 = r12[r14]
            android.view.View r6 = r15.findViewById(r6)
            java.lang.Object r5 = r5.get(r6)
            androidx.constraintlayout.motion.widget.MotionController r5 = (androidx.constraintlayout.motion.widget.MotionController) r5
            if (r5 != 0) goto Lf7
            goto L107
        Lf7:
            androidx.constraintlayout.motion.widget.MotionScene r6 = r15.mScene
            r6.getKeyFrames(r5)
            float r8 = r15.mTransitionDuration
            long r9 = r15.getNanoTime()
            r6 = r2
            r7 = r4
            r5.setup(r6, r7, r8, r9)
        L107:
            int r14 = r14 + 1
            goto Le4
        L10a:
            r12 = r3
        L10b:
            if (r12 >= r0) goto L13a
            android.view.View r5 = r15.getChildAt(r12)
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r6 = r15.mFrameArrayList
            java.lang.Object r6 = r6.get(r5)
            androidx.constraintlayout.motion.widget.MotionController r6 = (androidx.constraintlayout.motion.widget.MotionController) r6
            int r5 = r5.getId()
            boolean r5 = r11.get(r5)
            if (r5 == 0) goto L124
            goto L137
        L124:
            if (r6 == 0) goto L137
            androidx.constraintlayout.motion.widget.MotionScene r5 = r15.mScene
            r5.getKeyFrames(r6)
            float r8 = r15.mTransitionDuration
            long r9 = r15.getNanoTime()
            r5 = r6
            r6 = r2
            r7 = r4
            r5.setup(r6, r7, r8, r9)
        L137:
            int r12 = r12 + 1
            goto L10b
        L13a:
            androidx.constraintlayout.motion.widget.MotionScene r2 = r15.mScene
            float r2 = r2.getStaggered()
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L21c
            double r4 = (double) r2
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L14e
            r4 = r1
            goto L14f
        L14e:
            r4 = r3
        L14f:
            float r2 = java.lang.Math.abs(r2)
            r5 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r6 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r7 = r3
            r9 = r5
            r8 = r6
        L15c:
            if (r7 >= r0) goto L18b
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r10 = r15.mFrameArrayList
            android.view.View r11 = r15.getChildAt(r7)
            java.lang.Object r10 = r10.get(r11)
            androidx.constraintlayout.motion.widget.MotionController r10 = (androidx.constraintlayout.motion.widget.MotionController) r10
            float r11 = r10.mMotionStagger
            boolean r11 = java.lang.Float.isNaN(r11)
            if (r11 != 0) goto L173
            goto L18c
        L173:
            float r11 = r10.getFinalX()
            float r10 = r10.getFinalY()
            if (r4 == 0) goto L17f
            float r10 = r10 - r11
            goto L180
        L17f:
            float r10 = r10 + r11
        L180:
            float r8 = java.lang.Math.min(r8, r10)
            float r9 = java.lang.Math.max(r9, r10)
            int r7 = r7 + 1
            goto L15c
        L18b:
            r1 = r3
        L18c:
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L1ef
            r1 = r3
        L191:
            if (r1 >= r0) goto L1b6
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r8 = r15.mFrameArrayList
            android.view.View r9 = r15.getChildAt(r1)
            java.lang.Object r8 = r8.get(r9)
            androidx.constraintlayout.motion.widget.MotionController r8 = (androidx.constraintlayout.motion.widget.MotionController) r8
            float r9 = r8.mMotionStagger
            boolean r9 = java.lang.Float.isNaN(r9)
            if (r9 != 0) goto L1b3
            float r9 = r8.mMotionStagger
            float r6 = java.lang.Math.min(r6, r9)
            float r8 = r8.mMotionStagger
            float r5 = java.lang.Math.max(r5, r8)
        L1b3:
            int r1 = r1 + 1
            goto L191
        L1b6:
            if (r3 >= r0) goto L21c
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r1 = r15.mFrameArrayList
            android.view.View r8 = r15.getChildAt(r3)
            java.lang.Object r1 = r1.get(r8)
            androidx.constraintlayout.motion.widget.MotionController r1 = (androidx.constraintlayout.motion.widget.MotionController) r1
            float r8 = r1.mMotionStagger
            boolean r8 = java.lang.Float.isNaN(r8)
            if (r8 != 0) goto L1ec
            float r8 = r7 - r2
            float r8 = r7 / r8
            r1.mStaggerScale = r8
            if (r4 == 0) goto L1e1
            float r8 = r1.mMotionStagger
            float r8 = r5 - r8
            float r9 = r5 - r6
            float r8 = r8 / r9
            float r8 = r8 * r2
            float r8 = r2 - r8
            r1.mStaggerOffset = r8
            goto L1ec
        L1e1:
            float r8 = r1.mMotionStagger
            float r8 = r8 - r6
            float r8 = r8 * r2
            float r9 = r5 - r6
            float r8 = r8 / r9
            float r8 = r2 - r8
            r1.mStaggerOffset = r8
        L1ec:
            int r3 = r3 + 1
            goto L1b6
        L1ef:
            if (r3 >= r0) goto L21c
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r1 = r15.mFrameArrayList
            android.view.View r5 = r15.getChildAt(r3)
            java.lang.Object r1 = r1.get(r5)
            androidx.constraintlayout.motion.widget.MotionController r1 = (androidx.constraintlayout.motion.widget.MotionController) r1
            float r5 = r1.getFinalX()
            float r6 = r1.getFinalY()
            if (r4 == 0) goto L209
            float r6 = r6 - r5
            goto L20a
        L209:
            float r6 = r6 + r5
        L20a:
            float r5 = r7 - r2
            float r5 = r7 / r5
            r1.mStaggerScale = r5
            float r6 = r6 - r8
            float r6 = r6 * r2
            float r5 = r9 - r8
            float r6 = r6 / r5
            float r5 = r2 - r6
            r1.mStaggerOffset = r5
            int r3 = r3 + 1
            goto L1ef
        L21c:
            return
    }

    private android.graphics.Rect toRect(androidx.constraintlayout.core.widgets.ConstraintWidget r4) {
            r3 = this;
            android.graphics.Rect r0 = r3.mTempRect
            int r1 = r4.getY()
            r0.top = r1
            android.graphics.Rect r0 = r3.mTempRect
            int r1 = r4.getX()
            r0.left = r1
            android.graphics.Rect r0 = r3.mTempRect
            int r1 = r4.getWidth()
            android.graphics.Rect r2 = r3.mTempRect
            int r2 = r2.left
            int r1 = r1 + r2
            r0.right = r1
            android.graphics.Rect r0 = r3.mTempRect
            int r4 = r4.getHeight()
            android.graphics.Rect r1 = r3.mTempRect
            int r1 = r1.top
            int r4 = r4 + r1
            r0.bottom = r4
            android.graphics.Rect r4 = r3.mTempRect
            return r4
    }

    private static boolean willJump(float r5, float r6, float r7) {
            r0 = 0
            int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r2 = 1
            r3 = 0
            r4 = 1073741824(0x40000000, float:2.0)
            if (r1 <= 0) goto L1a
            float r0 = r5 / r7
            float r5 = r5 * r0
            float r7 = r7 * r0
            float r7 = r7 * r0
            float r7 = r7 / r4
            float r5 = r5 - r7
            float r6 = r6 + r5
            r5 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 <= 0) goto L18
            goto L19
        L18:
            r2 = r3
        L19:
            return r2
        L1a:
            float r1 = -r5
            float r1 = r1 / r7
            float r5 = r5 * r1
            float r7 = r7 * r1
            float r7 = r7 * r1
            float r7 = r7 / r4
            float r5 = r5 + r7
            float r6 = r6 + r5
            int r5 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r5 >= 0) goto L27
            goto L28
        L27:
            r2 = r3
        L28:
            return r2
    }

    public void addTransitionListener(androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.constraintlayout.motion.widget.MotionLayout$TransitionListener> r0 = r1.mTransitionListeners
            if (r0 != 0) goto Lb
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.mTransitionListeners = r0
        Lb:
            java.util.concurrent.CopyOnWriteArrayList<androidx.constraintlayout.motion.widget.MotionLayout$TransitionListener> r0 = r1.mTransitionListeners
            r0.add(r2)
            return
    }

    void animateTo(float r5) {
            r4 = this;
            androidx.constraintlayout.motion.widget.MotionScene r0 = r4.mScene
            if (r0 != 0) goto L5
            return
        L5:
            float r1 = r4.mTransitionLastPosition
            float r2 = r4.mTransitionPosition
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L13
            boolean r1 = r4.mTransitionInstantly
            if (r1 == 0) goto L13
            r4.mTransitionLastPosition = r2
        L13:
            float r1 = r4.mTransitionLastPosition
            int r2 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r2 != 0) goto L1a
            return
        L1a:
            r2 = 0
            r4.mTemporalInterpolator = r2
            r4.mTransitionGoalPosition = r5
            int r5 = r0.getDuration()
            float r5 = (float) r5
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r5 = r5 / r0
            r4.mTransitionDuration = r5
            float r5 = r4.mTransitionGoalPosition
            r4.setProgress(r5)
            r5 = 0
            r4.mInterpolator = r5
            androidx.constraintlayout.motion.widget.MotionScene r5 = r4.mScene
            android.view.animation.Interpolator r5 = r5.getInterpolator()
            r4.mProgressInterpolator = r5
            r4.mTransitionInstantly = r2
            long r2 = r4.getNanoTime()
            r4.mAnimationStartTime = r2
            r5 = 1
            r4.mInTransition = r5
            r4.mTransitionPosition = r1
            r4.mTransitionLastPosition = r1
            r4.invalidate()
            return
    }

    public boolean applyViewTransition(int r2, androidx.constraintlayout.motion.widget.MotionController r3) {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionScene r0 = r1.mScene
            if (r0 == 0) goto L9
            boolean r2 = r0.applyViewTransition(r2, r3)
            return r2
        L9:
            r2 = 0
            return r2
    }

    public androidx.constraintlayout.widget.ConstraintSet cloneConstraintSet(int r2) {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionScene r0 = r1.mScene
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            androidx.constraintlayout.widget.ConstraintSet r2 = r0.getConstraintSet(r2)
            androidx.constraintlayout.widget.ConstraintSet r0 = new androidx.constraintlayout.widget.ConstraintSet
            r0.<init>()
            r0.clone(r2)
            return r0
    }

    void disableAutoTransition(boolean r2) {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionScene r0 = r1.mScene
            if (r0 != 0) goto L5
            return
        L5:
            r0.disableAutoTransition(r2)
            return
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(android.graphics.Canvas r10) {
            r9 = this;
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> r0 = r9.mDecoratorsHelpers
            if (r0 == 0) goto L18
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.motion.widget.MotionHelper r1 = (androidx.constraintlayout.motion.widget.MotionHelper) r1
            r1.onPreDraw(r10)
            goto L8
        L18:
            r0 = 0
            r9.evaluate(r0)
            androidx.constraintlayout.motion.widget.MotionScene r1 = r9.mScene
            if (r1 == 0) goto L2b
            androidx.constraintlayout.motion.widget.ViewTransitionController r1 = r1.mViewTransitionController
            if (r1 == 0) goto L2b
            androidx.constraintlayout.motion.widget.MotionScene r1 = r9.mScene
            androidx.constraintlayout.motion.widget.ViewTransitionController r1 = r1.mViewTransitionController
            r1.animate()
        L2b:
            super.dispatchDraw(r10)
            androidx.constraintlayout.motion.widget.MotionScene r1 = r9.mScene
            if (r1 != 0) goto L33
            return
        L33:
            int r1 = r9.mDebugPath
            r2 = 1
            r1 = r1 & r2
            if (r1 != r2) goto L104
            boolean r1 = r9.isInEditMode()
            if (r1 != 0) goto L104
            int r1 = r9.mFrames
            int r1 = r1 + r2
            r9.mFrames = r1
            long r3 = r9.getNanoTime()
            long r5 = r9.mLastDrawTime
            r7 = -1
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 == 0) goto L6f
            long r5 = r3 - r5
            r7 = 200000000(0xbebc200, double:9.8813129E-316)
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 <= 0) goto L71
            int r1 = r9.mFrames
            float r1 = (float) r1
            float r5 = (float) r5
            r6 = 814313567(0x3089705f, float:1.0E-9)
            float r5 = r5 * r6
            float r1 = r1 / r5
            r5 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r5
            int r1 = (int) r1
            float r1 = (float) r1
            float r1 = r1 / r5
            r9.mLastFps = r1
            r9.mFrames = r0
            r9.mLastDrawTime = r3
            goto L71
        L6f:
            r9.mLastDrawTime = r3
        L71:
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r1 = 1109917696(0x42280000, float:42.0)
            r0.setTextSize(r1)
            float r1 = r9.getProgress()
            r3 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 * r3
            int r1 = (int) r1
            float r1 = (float) r1
            r3 = 1092616192(0x41200000, float:10.0)
            float r1 = r1 / r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            float r5 = r9.mLastFps
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = " fps "
            java.lang.StringBuilder r4 = r4.append(r5)
            int r5 = r9.mBeginState
            java.lang.String r5 = androidx.constraintlayout.motion.widget.Debug.getState(r9, r5)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = " -> "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r4 = r5.append(r4)
            int r5 = r9.mEndState
            java.lang.String r5 = androidx.constraintlayout.motion.widget.Debug.getState(r9, r5)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = " (progress: "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r1 = r4.append(r1)
            java.lang.String r4 = " ) state="
            java.lang.StringBuilder r1 = r1.append(r4)
            int r4 = r9.mCurrentState
            r5 = -1
            if (r4 != r5) goto Ld7
            java.lang.String r4 = "undefined"
            goto Ldb
        Ld7:
            java.lang.String r4 = androidx.constraintlayout.motion.widget.Debug.getState(r9, r4)
        Ldb:
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0.setColor(r4)
            int r4 = r9.getHeight()
            int r4 = r4 + (-29)
            float r4 = (float) r4
            r5 = 1093664768(0x41300000, float:11.0)
            r10.drawText(r1, r5, r4, r0)
            r4 = -7864184(0xffffffffff880088, float:NaN)
            r0.setColor(r4)
            int r4 = r9.getHeight()
            int r4 = r4 + (-30)
            float r4 = (float) r4
            r10.drawText(r1, r3, r4, r0)
        L104:
            int r0 = r9.mDebugPath
            if (r0 <= r2) goto L122
            androidx.constraintlayout.motion.widget.MotionLayout$DevModeDraw r0 = r9.mDevModeDraw
            if (r0 != 0) goto L113
            androidx.constraintlayout.motion.widget.MotionLayout$DevModeDraw r0 = new androidx.constraintlayout.motion.widget.MotionLayout$DevModeDraw
            r0.<init>(r9)
            r9.mDevModeDraw = r0
        L113:
            androidx.constraintlayout.motion.widget.MotionLayout$DevModeDraw r0 = r9.mDevModeDraw
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r1 = r9.mFrameArrayList
            androidx.constraintlayout.motion.widget.MotionScene r2 = r9.mScene
            int r2 = r2.getDuration()
            int r3 = r9.mDebugPath
            r0.draw(r10, r1, r2, r3)
        L122:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> r0 = r9.mDecoratorsHelpers
            if (r0 == 0) goto L13a
            java.util.Iterator r0 = r0.iterator()
        L12a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L13a
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.motion.widget.MotionHelper r1 = (androidx.constraintlayout.motion.widget.MotionHelper) r1
            r1.onPostDraw(r10)
            goto L12a
        L13a:
            return
    }

    public void enableTransition(int r3, boolean r4) {
            r2 = this;
            androidx.constraintlayout.motion.widget.MotionScene$Transition r3 = r2.getTransition(r3)
            if (r4 == 0) goto Lb
            r4 = 1
            r3.setEnabled(r4)
            return
        Lb:
            androidx.constraintlayout.motion.widget.MotionScene r4 = r2.mScene
            androidx.constraintlayout.motion.widget.MotionScene$Transition r4 = r4.mCurrentTransition
            if (r3 != r4) goto L33
            androidx.constraintlayout.motion.widget.MotionScene r4 = r2.mScene
            int r0 = r2.mCurrentState
            java.util.List r4 = r4.getTransitionsWithState(r0)
            java.util.Iterator r4 = r4.iterator()
        L1d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L33
            java.lang.Object r0 = r4.next()
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = (androidx.constraintlayout.motion.widget.MotionScene.Transition) r0
            boolean r1 = r0.isEnabled()
            if (r1 == 0) goto L1d
            androidx.constraintlayout.motion.widget.MotionScene r4 = r2.mScene
            r4.mCurrentTransition = r0
        L33:
            r4 = 0
            r3.setEnabled(r4)
            return
    }

    public void enableViewTransition(int r2, boolean r3) {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionScene r0 = r1.mScene
            if (r0 == 0) goto L7
            r0.enableViewTransition(r2, r3)
        L7:
            return
    }

    void endTrigger(boolean r5) {
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L1b
            android.view.View r2 = r4.getChildAt(r1)
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r3 = r4.mFrameArrayList
            java.lang.Object r2 = r3.get(r2)
            androidx.constraintlayout.motion.widget.MotionController r2 = (androidx.constraintlayout.motion.widget.MotionController) r2
            if (r2 == 0) goto L18
            r2.endTrigger(r5)
        L18:
            int r1 = r1 + 1
            goto L5
        L1b:
            return
    }

    void evaluate(boolean r23) {
            r22 = this;
            r0 = r22
            long r1 = r0.mTransitionLastTime
            r3 = -1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L10
            long r1 = r22.getNanoTime()
            r0.mTransitionLastTime = r1
        L10:
            float r1 = r0.mTransitionLastPosition
            r2 = 0
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r4 = -1
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r3 <= 0) goto L20
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 >= 0) goto L20
            r0.mCurrentState = r4
        L20:
            boolean r3 = r0.mKeepAnimating
            r6 = 1
            r7 = 0
            if (r3 != 0) goto L32
            boolean r3 = r0.mInTransition
            if (r3 == 0) goto L23f
            if (r23 != 0) goto L32
            float r3 = r0.mTransitionGoalPosition
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 == 0) goto L23f
        L32:
            float r3 = r0.mTransitionGoalPosition
            float r3 = r3 - r1
            float r1 = java.lang.Math.signum(r3)
            long r8 = r22.getNanoTime()
            android.view.animation.Interpolator r3 = r0.mInterpolator
            boolean r10 = r3 instanceof androidx.constraintlayout.motion.widget.MotionInterpolator
            r11 = 814313567(0x3089705f, float:1.0E-9)
            if (r10 != 0) goto L51
            long r12 = r0.mTransitionLastTime
            long r12 = r8 - r12
            float r10 = (float) r12
            float r10 = r10 * r1
            float r10 = r10 * r11
            float r12 = r0.mTransitionDuration
            float r10 = r10 / r12
            goto L52
        L51:
            r10 = r2
        L52:
            float r12 = r0.mTransitionLastPosition
            float r12 = r12 + r10
            boolean r13 = r0.mTransitionInstantly
            if (r13 == 0) goto L5b
            float r12 = r0.mTransitionGoalPosition
        L5b:
            int r13 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r13 <= 0) goto L65
            float r14 = r0.mTransitionGoalPosition
            int r14 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r14 >= 0) goto L6f
        L65:
            int r14 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r14 > 0) goto L75
            float r14 = r0.mTransitionGoalPosition
            int r14 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r14 > 0) goto L75
        L6f:
            float r12 = r0.mTransitionGoalPosition
            r0.mInTransition = r7
            r14 = r6
            goto L76
        L75:
            r14 = r7
        L76:
            r0.mTransitionLastPosition = r12
            r0.mTransitionPosition = r12
            r0.mTransitionLastTime = r8
            r15 = 925353388(0x3727c5ac, float:1.0E-5)
            if (r3 == 0) goto L103
            if (r14 != 0) goto L103
            boolean r14 = r0.mTemporalInterpolator
            if (r14 == 0) goto Le4
            long r4 = r0.mAnimationStartTime
            long r4 = r8 - r4
            float r4 = (float) r4
            float r4 = r4 * r11
            float r3 = r3.getInterpolation(r4)
            android.view.animation.Interpolator r4 = r0.mInterpolator
            androidx.constraintlayout.motion.utils.StopLogic r5 = r0.mStopLogic
            r10 = 2
            if (r4 != r5) goto La2
            boolean r4 = r5.isStopped()
            if (r4 == 0) goto La0
            r4 = r10
            goto La3
        La0:
            r4 = r6
            goto La3
        La2:
            r4 = r7
        La3:
            r0.mTransitionLastPosition = r3
            r0.mTransitionLastTime = r8
            android.view.animation.Interpolator r5 = r0.mInterpolator
            boolean r8 = r5 instanceof androidx.constraintlayout.motion.widget.MotionInterpolator
            if (r8 == 0) goto Le2
            androidx.constraintlayout.motion.widget.MotionInterpolator r5 = (androidx.constraintlayout.motion.widget.MotionInterpolator) r5
            float r5 = r5.getVelocity()
            r0.mLastVelocity = r5
            float r8 = java.lang.Math.abs(r5)
            float r9 = r0.mTransitionDuration
            float r8 = r8 * r9
            int r8 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r8 > 0) goto Lc4
            if (r4 != r10) goto Lc4
            r0.mInTransition = r7
        Lc4:
            int r8 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r8 <= 0) goto Ld4
            r8 = 1065353216(0x3f800000, float:1.0)
            int r9 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r9 < 0) goto Ld4
            r0.mTransitionLastPosition = r8
            r0.mInTransition = r7
            r3 = 1065353216(0x3f800000, float:1.0)
        Ld4:
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 >= 0) goto Le2
            int r5 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r5 > 0) goto Le2
            r0.mTransitionLastPosition = r2
            r0.mInTransition = r7
            r12 = r2
            goto L106
        Le2:
            r12 = r3
            goto L106
        Le4:
            float r3 = r3.getInterpolation(r12)
            android.view.animation.Interpolator r4 = r0.mInterpolator
            boolean r5 = r4 instanceof androidx.constraintlayout.motion.widget.MotionInterpolator
            if (r5 == 0) goto Lf7
            androidx.constraintlayout.motion.widget.MotionInterpolator r4 = (androidx.constraintlayout.motion.widget.MotionInterpolator) r4
            float r4 = r4.getVelocity()
            r0.mLastVelocity = r4
            goto L101
        Lf7:
            float r12 = r12 + r10
            float r4 = r4.getInterpolation(r12)
            float r4 = r4 - r3
            float r4 = r4 * r1
            float r4 = r4 / r10
            r0.mLastVelocity = r4
        L101:
            r12 = r3
            goto L105
        L103:
            r0.mLastVelocity = r10
        L105:
            r4 = r7
        L106:
            float r3 = r0.mLastVelocity
            float r3 = java.lang.Math.abs(r3)
            int r3 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r3 <= 0) goto L115
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r3 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING
            r0.setState(r3)
        L115:
            if (r4 == r6) goto L13e
            if (r13 <= 0) goto L11f
            float r3 = r0.mTransitionGoalPosition
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 >= 0) goto L129
        L11f:
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 > 0) goto L12d
            float r3 = r0.mTransitionGoalPosition
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 > 0) goto L12d
        L129:
            float r12 = r0.mTransitionGoalPosition
            r0.mInTransition = r7
        L12d:
            r3 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r4 >= 0) goto L137
            int r3 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r3 > 0) goto L13e
        L137:
            r0.mInTransition = r7
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r3 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r0.setState(r3)
        L13e:
            int r3 = r22.getChildCount()
            r0.mKeepAnimating = r7
            long r4 = r22.getNanoTime()
            r0.mPostInterpolationPosition = r12
            android.view.animation.Interpolator r8 = r0.mProgressInterpolator
            if (r8 != 0) goto L150
            r8 = r12
            goto L154
        L150:
            float r8 = r8.getInterpolation(r12)
        L154:
            android.view.animation.Interpolator r9 = r0.mProgressInterpolator
            if (r9 == 0) goto L16c
            float r10 = r0.mTransitionDuration
            float r10 = r1 / r10
            float r10 = r10 + r12
            float r9 = r9.getInterpolation(r10)
            r0.mLastVelocity = r9
            android.view.animation.Interpolator r10 = r0.mProgressInterpolator
            float r10 = r10.getInterpolation(r12)
            float r9 = r9 - r10
            r0.mLastVelocity = r9
        L16c:
            r9 = r7
        L16d:
            if (r9 >= r3) goto L195
            android.view.View r10 = r0.getChildAt(r9)
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r11 = r0.mFrameArrayList
            java.lang.Object r11 = r11.get(r10)
            r16 = r11
            androidx.constraintlayout.motion.widget.MotionController r16 = (androidx.constraintlayout.motion.widget.MotionController) r16
            if (r16 == 0) goto L192
            boolean r11 = r0.mKeepAnimating
            androidx.constraintlayout.core.motion.utils.KeyCache r15 = r0.mKeyCache
            r17 = r10
            r18 = r8
            r19 = r4
            r21 = r15
            boolean r10 = r16.interpolate(r17, r18, r19, r21)
            r10 = r10 | r11
            r0.mKeepAnimating = r10
        L192:
            int r9 = r9 + 1
            goto L16d
        L195:
            if (r13 <= 0) goto L19d
            float r3 = r0.mTransitionGoalPosition
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 >= 0) goto L1a7
        L19d:
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 > 0) goto L1a9
            float r3 = r0.mTransitionGoalPosition
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 > 0) goto L1a9
        L1a7:
            r3 = r6
            goto L1aa
        L1a9:
            r3 = r7
        L1aa:
            boolean r4 = r0.mKeepAnimating
            if (r4 != 0) goto L1b9
            boolean r4 = r0.mInTransition
            if (r4 != 0) goto L1b9
            if (r3 == 0) goto L1b9
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r4 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r0.setState(r4)
        L1b9:
            boolean r4 = r0.mMeasureDuringTransition
            if (r4 == 0) goto L1c0
            r22.requestLayout()
        L1c0:
            boolean r4 = r0.mKeepAnimating
            r3 = r3 ^ r6
            r3 = r3 | r4
            r0.mKeepAnimating = r3
            int r3 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r3 > 0) goto L1e4
            int r3 = r0.mBeginState
            r4 = -1
            if (r3 == r4) goto L1e4
            int r4 = r0.mCurrentState
            if (r4 == r3) goto L1e4
            r0.mCurrentState = r3
            androidx.constraintlayout.motion.widget.MotionScene r4 = r0.mScene
            androidx.constraintlayout.widget.ConstraintSet r3 = r4.getConstraintSet(r3)
            r3.applyCustomAttributes(r0)
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r3 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r0.setState(r3)
            r7 = r6
        L1e4:
            double r3 = (double) r12
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 < 0) goto L202
            int r3 = r0.mCurrentState
            int r4 = r0.mEndState
            if (r3 == r4) goto L202
            r0.mCurrentState = r4
            androidx.constraintlayout.motion.widget.MotionScene r3 = r0.mScene
            androidx.constraintlayout.widget.ConstraintSet r3 = r3.getConstraintSet(r4)
            r3.applyCustomAttributes(r0)
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r3 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r0.setState(r3)
            r7 = r6
        L202:
            boolean r3 = r0.mKeepAnimating
            if (r3 != 0) goto L221
            boolean r3 = r0.mInTransition
            if (r3 == 0) goto L20b
            goto L221
        L20b:
            if (r13 <= 0) goto L213
            r3 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r4 == 0) goto L21b
        L213:
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 >= 0) goto L224
            int r3 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r3 != 0) goto L224
        L21b:
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r3 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r0.setState(r3)
            goto L224
        L221:
            r22.invalidate()
        L224:
            boolean r3 = r0.mKeepAnimating
            if (r3 != 0) goto L23f
            boolean r3 = r0.mInTransition
            if (r3 != 0) goto L23f
            if (r13 <= 0) goto L234
            r3 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r4 == 0) goto L23c
        L234:
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L23f
            int r1 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r1 != 0) goto L23f
        L23c:
            r22.onNewStateAttachHandlers()
        L23f:
            float r1 = r0.mTransitionLastPosition
            r3 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 < 0) goto L253
            int r1 = r0.mCurrentState
            int r2 = r0.mEndState
            if (r1 == r2) goto L24e
            goto L24f
        L24e:
            r6 = r7
        L24f:
            r0.mCurrentState = r2
        L251:
            r7 = r6
            goto L262
        L253:
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L262
            int r1 = r0.mCurrentState
            int r2 = r0.mBeginState
            if (r1 == r2) goto L25e
            goto L25f
        L25e:
            r6 = r7
        L25f:
            r0.mCurrentState = r2
            goto L251
        L262:
            boolean r1 = r0.mNeedsFireTransitionCompleted
            r1 = r1 | r7
            r0.mNeedsFireTransitionCompleted = r1
            if (r7 == 0) goto L270
            boolean r1 = r0.mInLayout
            if (r1 != 0) goto L270
            r22.requestLayout()
        L270:
            float r1 = r0.mTransitionLastPosition
            r0.mTransitionPosition = r1
            return
    }

    protected void fireTransitionCompleted() {
            r4 = this;
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionListener r0 = r4.mTransitionListener
            r1 = 1
            if (r0 != 0) goto Lf
            java.util.concurrent.CopyOnWriteArrayList<androidx.constraintlayout.motion.widget.MotionLayout$TransitionListener> r0 = r4.mTransitionListeners
            if (r0 == 0) goto L42
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L42
        Lf:
            int r0 = r4.mListenerState
            r2 = -1
            if (r0 != r2) goto L42
            int r0 = r4.mCurrentState
            r4.mListenerState = r0
            java.util.ArrayList<java.lang.Integer> r0 = r4.mTransitionCompleted
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L32
            java.util.ArrayList<java.lang.Integer> r0 = r4.mTransitionCompleted
            int r3 = r0.size()
            int r3 = r3 - r1
            java.lang.Object r0 = r0.get(r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            goto L33
        L32:
            r0 = r2
        L33:
            int r3 = r4.mCurrentState
            if (r0 == r3) goto L42
            if (r3 == r2) goto L42
            java.util.ArrayList<java.lang.Integer> r0 = r4.mTransitionCompleted
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r0.add(r2)
        L42:
            r4.processTransitionCompleted()
            java.lang.Runnable r0 = r4.mOnComplete
            if (r0 == 0) goto L4c
            r0.run()
        L4c:
            int[] r0 = r4.mScheduledTransitionTo
            if (r0 == 0) goto L66
            int r2 = r4.mScheduledTransitions
            if (r2 <= 0) goto L66
            r2 = 0
            r0 = r0[r2]
            r4.transitionToState(r0)
            int[] r0 = r4.mScheduledTransitionTo
            int r3 = r0.length
            int r3 = r3 - r1
            java.lang.System.arraycopy(r0, r1, r0, r2, r3)
            int r0 = r4.mScheduledTransitions
            int r0 = r0 - r1
            r4.mScheduledTransitions = r0
        L66:
            return
    }

    public void fireTrigger(int r3, boolean r4, float r5) {
            r2 = this;
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionListener r0 = r2.mTransitionListener
            if (r0 == 0) goto L7
            r0.onTransitionTrigger(r2, r3, r4, r5)
        L7:
            java.util.concurrent.CopyOnWriteArrayList<androidx.constraintlayout.motion.widget.MotionLayout$TransitionListener> r0 = r2.mTransitionListeners
            if (r0 == 0) goto L1f
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionListener r1 = (androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener) r1
            r1.onTransitionTrigger(r2, r3, r4, r5)
            goto Lf
        L1f:
            return
    }

    void getAnchorDpDt(int r3, float r4, float r5, float r6, float[] r7) {
            r2 = this;
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r0 = r2.mFrameArrayList
            android.view.View r1 = r2.getViewById(r3)
            java.lang.Object r0 = r0.get(r1)
            androidx.constraintlayout.motion.widget.MotionController r0 = (androidx.constraintlayout.motion.widget.MotionController) r0
            if (r0 == 0) goto L1a
            r0.getDpDt(r4, r5, r6, r7)
            float r3 = r1.getY()
            r2.lastPos = r4
            r2.lastY = r3
            goto L4c
        L1a:
            if (r1 != 0) goto L2c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = ""
            r4.<init>(r5)
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r3 = r3.toString()
            goto L38
        L2c:
            android.content.Context r4 = r1.getContext()
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r3 = r4.getResourceName(r3)
        L38:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "WARNING could not find view id "
            r4.<init>(r5)
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "MotionLayout"
            android.util.Log.w(r4, r3)
        L4c:
            return
    }

    public androidx.constraintlayout.widget.ConstraintSet getConstraintSet(int r2) {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionScene r0 = r1.mScene
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            androidx.constraintlayout.widget.ConstraintSet r2 = r0.getConstraintSet(r2)
            return r2
    }

    public int[] getConstraintSetIds() {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionScene r0 = r1.mScene
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int[] r0 = r0.getConstraintSetIds()
            return r0
    }

    java.lang.String getConstraintSetNames(int r2) {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionScene r0 = r1.mScene
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            java.lang.String r2 = r0.lookUpConstraintName(r2)
            return r2
    }

    public int getCurrentState() {
            r1 = this;
            int r0 = r1.mCurrentState
            return r0
    }

    public void getDebugMode(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L4
            r1 = 2
            goto L5
        L4:
            r1 = 1
        L5:
            r0.mDebugPath = r1
            r0.invalidate()
            return
    }

    public java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene.Transition> getDefinedTransitions() {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionScene r0 = r1.mScene
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.util.ArrayList r0 = r0.getDefinedTransitions()
            return r0
    }

    public androidx.constraintlayout.motion.widget.DesignTool getDesignTool() {
            r1 = this;
            androidx.constraintlayout.motion.widget.DesignTool r0 = r1.mDesignTool
            if (r0 != 0) goto Lb
            androidx.constraintlayout.motion.widget.DesignTool r0 = new androidx.constraintlayout.motion.widget.DesignTool
            r0.<init>(r1)
            r1.mDesignTool = r0
        Lb:
            androidx.constraintlayout.motion.widget.DesignTool r0 = r1.mDesignTool
            return r0
    }

    public int getEndState() {
            r1 = this;
            int r0 = r1.mEndState
            return r0
    }

    androidx.constraintlayout.motion.widget.MotionController getMotionController(int r2) {
            r1 = this;
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r0 = r1.mFrameArrayList
            android.view.View r2 = r1.findViewById(r2)
            java.lang.Object r2 = r0.get(r2)
            androidx.constraintlayout.motion.widget.MotionController r2 = (androidx.constraintlayout.motion.widget.MotionController) r2
            return r2
    }

    protected long getNanoTime() {
            r2 = this;
            long r0 = java.lang.System.nanoTime()
            return r0
    }

    public float getProgress() {
            r1 = this;
            float r0 = r1.mTransitionLastPosition
            return r0
    }

    public androidx.constraintlayout.motion.widget.MotionScene getScene() {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionScene r0 = r1.mScene
            return r0
    }

    public int getStartState() {
            r1 = this;
            int r0 = r1.mBeginState
            return r0
    }

    public float getTargetPosition() {
            r1 = this;
            float r0 = r1.mTransitionGoalPosition
            return r0
    }

    public androidx.constraintlayout.motion.widget.MotionScene.Transition getTransition(int r2) {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionScene r0 = r1.mScene
            androidx.constraintlayout.motion.widget.MotionScene$Transition r2 = r0.getTransitionById(r2)
            return r2
    }

    public android.os.Bundle getTransitionState() {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r0 = r1.mStateCache
            if (r0 != 0) goto Lb
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r0 = new androidx.constraintlayout.motion.widget.MotionLayout$StateCache
            r0.<init>(r1)
            r1.mStateCache = r0
        Lb:
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r0 = r1.mStateCache
            r0.recordState()
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r0 = r1.mStateCache
            android.os.Bundle r0 = r0.getTransitionState()
            return r0
    }

    public long getTransitionTimeMs() {
            r2 = this;
            androidx.constraintlayout.motion.widget.MotionScene r0 = r2.mScene
            r1 = 1148846080(0x447a0000, float:1000.0)
            if (r0 == 0) goto Le
            int r0 = r0.getDuration()
            float r0 = (float) r0
            float r0 = r0 / r1
            r2.mTransitionDuration = r0
        Le:
            float r0 = r2.mTransitionDuration
            float r0 = r0 * r1
            long r0 = (long) r0
            return r0
    }

    public float getVelocity() {
            r1 = this;
            float r0 = r1.mLastVelocity
            return r0
    }

    public void getViewVelocity(android.view.View r9, float r10, float r11, float[] r12, int r13) {
            r8 = this;
            float r0 = r8.mLastVelocity
            float r1 = r8.mTransitionLastPosition
            android.view.animation.Interpolator r2 = r8.mInterpolator
            if (r2 == 0) goto L2a
            float r0 = r8.mTransitionGoalPosition
            float r0 = r0 - r1
            float r0 = java.lang.Math.signum(r0)
            android.view.animation.Interpolator r1 = r8.mInterpolator
            float r2 = r8.mTransitionLastPosition
            r3 = 925353388(0x3727c5ac, float:1.0E-5)
            float r2 = r2 + r3
            float r1 = r1.getInterpolation(r2)
            android.view.animation.Interpolator r2 = r8.mInterpolator
            float r4 = r8.mTransitionLastPosition
            float r2 = r2.getInterpolation(r4)
            float r1 = r1 - r2
            float r1 = r1 / r3
            float r0 = r0 * r1
            float r1 = r8.mTransitionDuration
            float r0 = r0 / r1
            goto L2b
        L2a:
            r2 = r1
        L2b:
            android.view.animation.Interpolator r1 = r8.mInterpolator
            boolean r3 = r1 instanceof androidx.constraintlayout.motion.widget.MotionInterpolator
            if (r3 == 0) goto L37
            androidx.constraintlayout.motion.widget.MotionInterpolator r1 = (androidx.constraintlayout.motion.widget.MotionInterpolator) r1
            float r0 = r1.getVelocity()
        L37:
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r1 = r8.mFrameArrayList
            java.lang.Object r1 = r1.get(r9)
            androidx.constraintlayout.motion.widget.MotionController r1 = (androidx.constraintlayout.motion.widget.MotionController) r1
            r3 = r13 & 1
            if (r3 != 0) goto L52
            int r3 = r9.getWidth()
            int r4 = r9.getHeight()
            r5 = r10
            r6 = r11
            r7 = r12
            r1.getPostLayoutDvDp(r2, r3, r4, r5, r6, r7)
            goto L55
        L52:
            r1.getDpDt(r2, r10, r11, r12)
        L55:
            r9 = 2
            if (r13 >= r9) goto L64
            r9 = 0
            r10 = r12[r9]
            float r10 = r10 * r0
            r12[r9] = r10
            r9 = 1
            r10 = r12[r9]
            float r10 = r10 * r0
            r12[r9] = r10
        L64:
            return
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
            r1 = this;
            boolean r0 = super.isAttachedToWindow()
            return r0
    }

    public boolean isDelayedApplicationOfInitialState() {
            r1 = this;
            boolean r0 = r1.mDelayedApply
            return r0
    }

    public boolean isInRotation() {
            r1 = this;
            boolean r0 = r1.mInRotation
            return r0
    }

    public boolean isInteractionEnabled() {
            r1 = this;
            boolean r0 = r1.mInteractionEnabled
            return r0
    }

    public boolean isViewTransitionEnabled(int r2) {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionScene r0 = r1.mScene
            if (r0 == 0) goto L9
            boolean r2 = r0.isViewTransitionEnabled(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    public void jumpToState(int r2) {
            r1 = this;
            boolean r0 = r1.isAttachedToWindow()
            if (r0 != 0) goto L8
            r1.mCurrentState = r2
        L8:
            int r0 = r1.mBeginState
            if (r0 != r2) goto L11
            r2 = 0
            r1.setProgress(r2)
            goto L1e
        L11:
            int r0 = r1.mEndState
            if (r0 != r2) goto L1b
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.setProgress(r2)
            goto L1e
        L1b:
            r1.setTransition(r2, r2)
        L1e:
            return
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void loadLayoutDescription(int r5) {
            r4 = this;
            java.lang.String r0 = "unable to parse MotionScene file"
            r1 = 0
            if (r5 == 0) goto Lb9
            androidx.constraintlayout.motion.widget.MotionScene r2 = new androidx.constraintlayout.motion.widget.MotionScene     // Catch: java.lang.Exception -> Lb2
            android.content.Context r3 = r4.getContext()     // Catch: java.lang.Exception -> Lb2
            r2.<init>(r3, r4, r5)     // Catch: java.lang.Exception -> Lb2
            r4.mScene = r2     // Catch: java.lang.Exception -> Lb2
            int r5 = r4.mCurrentState     // Catch: java.lang.Exception -> Lb2
            r3 = -1
            if (r5 != r3) goto L2b
            int r5 = r2.getStartId()     // Catch: java.lang.Exception -> Lb2
            r4.mCurrentState = r5     // Catch: java.lang.Exception -> Lb2
            androidx.constraintlayout.motion.widget.MotionScene r5 = r4.mScene     // Catch: java.lang.Exception -> Lb2
            int r5 = r5.getStartId()     // Catch: java.lang.Exception -> Lb2
            r4.mBeginState = r5     // Catch: java.lang.Exception -> Lb2
            androidx.constraintlayout.motion.widget.MotionScene r5 = r4.mScene     // Catch: java.lang.Exception -> Lb2
            int r5 = r5.getEndId()     // Catch: java.lang.Exception -> Lb2
            r4.mEndState = r5     // Catch: java.lang.Exception -> Lb2
        L2b:
            boolean r5 = r4.isAttachedToWindow()     // Catch: java.lang.Exception -> Lb2
            if (r5 == 0) goto Laf
            android.view.Display r5 = r4.getDisplay()     // Catch: java.lang.Exception -> La8
            if (r5 != 0) goto L39
            r5 = 0
            goto L3d
        L39:
            int r5 = r5.getRotation()     // Catch: java.lang.Exception -> La8
        L3d:
            r4.mPreviouseRotation = r5     // Catch: java.lang.Exception -> La8
            androidx.constraintlayout.motion.widget.MotionScene r5 = r4.mScene     // Catch: java.lang.Exception -> La8
            if (r5 == 0) goto L6f
            int r1 = r4.mCurrentState     // Catch: java.lang.Exception -> La8
            androidx.constraintlayout.widget.ConstraintSet r5 = r5.getConstraintSet(r1)     // Catch: java.lang.Exception -> La8
            androidx.constraintlayout.motion.widget.MotionScene r1 = r4.mScene     // Catch: java.lang.Exception -> La8
            r1.readFallback(r4)     // Catch: java.lang.Exception -> La8
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> r1 = r4.mDecoratorsHelpers     // Catch: java.lang.Exception -> La8
            if (r1 == 0) goto L66
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> La8
        L56:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Exception -> La8
            if (r2 == 0) goto L66
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Exception -> La8
            androidx.constraintlayout.motion.widget.MotionHelper r2 = (androidx.constraintlayout.motion.widget.MotionHelper) r2     // Catch: java.lang.Exception -> La8
            r2.onFinishedMotionScene(r4)     // Catch: java.lang.Exception -> La8
            goto L56
        L66:
            if (r5 == 0) goto L6b
            r5.applyTo(r4)     // Catch: java.lang.Exception -> La8
        L6b:
            int r5 = r4.mCurrentState     // Catch: java.lang.Exception -> La8
            r4.mBeginState = r5     // Catch: java.lang.Exception -> La8
        L6f:
            r4.onNewStateAttachHandlers()     // Catch: java.lang.Exception -> La8
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r5 = r4.mStateCache     // Catch: java.lang.Exception -> La8
            if (r5 == 0) goto L87
            boolean r1 = r4.mDelayedApply     // Catch: java.lang.Exception -> La8
            if (r1 == 0) goto L83
            androidx.constraintlayout.motion.widget.MotionLayout$1 r5 = new androidx.constraintlayout.motion.widget.MotionLayout$1     // Catch: java.lang.Exception -> La8
            r5.<init>(r4)     // Catch: java.lang.Exception -> La8
            r4.post(r5)     // Catch: java.lang.Exception -> La8
            goto Lbb
        L83:
            r5.apply()     // Catch: java.lang.Exception -> La8
            goto Lbb
        L87:
            androidx.constraintlayout.motion.widget.MotionScene r5 = r4.mScene     // Catch: java.lang.Exception -> La8
            if (r5 == 0) goto Lbb
            androidx.constraintlayout.motion.widget.MotionScene$Transition r5 = r5.mCurrentTransition     // Catch: java.lang.Exception -> La8
            if (r5 == 0) goto Lbb
            androidx.constraintlayout.motion.widget.MotionScene r5 = r4.mScene     // Catch: java.lang.Exception -> La8
            androidx.constraintlayout.motion.widget.MotionScene$Transition r5 = r5.mCurrentTransition     // Catch: java.lang.Exception -> La8
            int r5 = r5.getAutoTransition()     // Catch: java.lang.Exception -> La8
            r1 = 4
            if (r5 != r1) goto Lbb
            r4.transitionToEnd()     // Catch: java.lang.Exception -> La8
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r5 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.SETUP     // Catch: java.lang.Exception -> La8
            r4.setState(r5)     // Catch: java.lang.Exception -> La8
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r5 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING     // Catch: java.lang.Exception -> La8
            r4.setState(r5)     // Catch: java.lang.Exception -> La8
            goto Lbb
        La8:
            r5 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Exception -> Lb2
            r1.<init>(r0, r5)     // Catch: java.lang.Exception -> Lb2
            throw r1     // Catch: java.lang.Exception -> Lb2
        Laf:
            r4.mScene = r1     // Catch: java.lang.Exception -> Lb2
            goto Lbb
        Lb2:
            r5 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0, r5)
            throw r1
        Lb9:
            r4.mScene = r1
        Lbb:
            return
    }

    int lookUpConstraintId(java.lang.String r2) {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionScene r0 = r1.mScene
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            int r2 = r0.lookUpConstraintId(r2)
            return r2
    }

    protected androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker obtainVelocityTracker() {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionLayout$MyTracker r0 = androidx.constraintlayout.motion.widget.MotionLayout.MyTracker.obtain()
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r3 = this;
            super.onAttachedToWindow()
            android.view.Display r0 = r3.getDisplay()
            if (r0 == 0) goto Lf
            int r0 = r0.getRotation()
            r3.mPreviouseRotation = r0
        Lf:
            androidx.constraintlayout.motion.widget.MotionScene r0 = r3.mScene
            if (r0 == 0) goto L42
            int r1 = r3.mCurrentState
            r2 = -1
            if (r1 == r2) goto L42
            androidx.constraintlayout.widget.ConstraintSet r0 = r0.getConstraintSet(r1)
            androidx.constraintlayout.motion.widget.MotionScene r1 = r3.mScene
            r1.readFallback(r3)
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> r1 = r3.mDecoratorsHelpers
            if (r1 == 0) goto L39
            java.util.Iterator r1 = r1.iterator()
        L29:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L39
            java.lang.Object r2 = r1.next()
            androidx.constraintlayout.motion.widget.MotionHelper r2 = (androidx.constraintlayout.motion.widget.MotionHelper) r2
            r2.onFinishedMotionScene(r3)
            goto L29
        L39:
            if (r0 == 0) goto L3e
            r0.applyTo(r3)
        L3e:
            int r0 = r3.mCurrentState
            r3.mBeginState = r0
        L42:
            r3.onNewStateAttachHandlers()
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r0 = r3.mStateCache
            if (r0 == 0) goto L5a
            boolean r1 = r3.mDelayedApply
            if (r1 == 0) goto L56
            androidx.constraintlayout.motion.widget.MotionLayout$4 r0 = new androidx.constraintlayout.motion.widget.MotionLayout$4
            r0.<init>(r3)
            r3.post(r0)
            goto L7a
        L56:
            r0.apply()
            goto L7a
        L5a:
            androidx.constraintlayout.motion.widget.MotionScene r0 = r3.mScene
            if (r0 == 0) goto L7a
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r0.mCurrentTransition
            if (r0 == 0) goto L7a
            androidx.constraintlayout.motion.widget.MotionScene r0 = r3.mScene
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r0.mCurrentTransition
            int r0 = r0.getAutoTransition()
            r1 = 4
            if (r0 != r1) goto L7a
            r3.transitionToEnd()
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r0 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.SETUP
            r3.setState(r0)
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r0 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING
            r3.setState(r0)
        L7a:
            return
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
            r6 = this;
            androidx.constraintlayout.motion.widget.MotionScene r0 = r6.mScene
            r1 = 0
            if (r0 == 0) goto Lad
            boolean r2 = r6.mInteractionEnabled
            if (r2 != 0) goto Lb
            goto Lad
        Lb:
            androidx.constraintlayout.motion.widget.ViewTransitionController r0 = r0.mViewTransitionController
            if (r0 == 0) goto L16
            androidx.constraintlayout.motion.widget.MotionScene r0 = r6.mScene
            androidx.constraintlayout.motion.widget.ViewTransitionController r0 = r0.mViewTransitionController
            r0.touchEvent(r7)
        L16:
            androidx.constraintlayout.motion.widget.MotionScene r0 = r6.mScene
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r0.mCurrentTransition
            if (r0 == 0) goto Lad
            boolean r2 = r0.isEnabled()
            if (r2 == 0) goto Lad
            androidx.constraintlayout.motion.widget.TouchResponse r0 = r0.getTouchResponse()
            if (r0 == 0) goto Lad
            int r2 = r7.getAction()
            if (r2 != 0) goto L48
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            android.graphics.RectF r2 = r0.getTouchRegion(r6, r2)
            if (r2 == 0) goto L48
            float r3 = r7.getX()
            float r4 = r7.getY()
            boolean r2 = r2.contains(r3, r4)
            if (r2 != 0) goto L48
            return r1
        L48:
            int r0 = r0.getTouchRegionId()
            r2 = -1
            if (r0 == r2) goto Lad
            android.view.View r2 = r6.mRegionView
            if (r2 == 0) goto L59
            int r2 = r2.getId()
            if (r2 == r0) goto L5f
        L59:
            android.view.View r0 = r6.findViewById(r0)
            r6.mRegionView = r0
        L5f:
            android.view.View r0 = r6.mRegionView
            if (r0 == 0) goto Lad
            android.graphics.RectF r2 = r6.mBoundsCheck
            int r0 = r0.getLeft()
            float r0 = (float) r0
            android.view.View r3 = r6.mRegionView
            int r3 = r3.getTop()
            float r3 = (float) r3
            android.view.View r4 = r6.mRegionView
            int r4 = r4.getRight()
            float r4 = (float) r4
            android.view.View r5 = r6.mRegionView
            int r5 = r5.getBottom()
            float r5 = (float) r5
            r2.set(r0, r3, r4, r5)
            android.graphics.RectF r0 = r6.mBoundsCheck
            float r2 = r7.getX()
            float r3 = r7.getY()
            boolean r0 = r0.contains(r2, r3)
            if (r0 == 0) goto Lad
            android.view.View r0 = r6.mRegionView
            int r0 = r0.getLeft()
            float r0 = (float) r0
            android.view.View r2 = r6.mRegionView
            int r2 = r2.getTop()
            float r2 = (float) r2
            android.view.View r3 = r6.mRegionView
            boolean r0 = r6.handlesTouchEvent(r0, r2, r3, r7)
            if (r0 != 0) goto Lad
            boolean r7 = r6.onTouchEvent(r7)
            return r7
        Lad:
            return r1
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r4, int r5, int r6, int r7, int r8) {
            r3 = this;
            r0 = 1
            r3.mInLayout = r0
            r1 = 0
            androidx.constraintlayout.motion.widget.MotionScene r2 = r3.mScene     // Catch: java.lang.Throwable -> L29
            if (r2 != 0) goto Le
            super.onLayout(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L29
            r3.mInLayout = r1
            return
        Le:
            int r7 = r7 - r5
            int r8 = r8 - r6
            int r4 = r3.mLastLayoutWidth     // Catch: java.lang.Throwable -> L29
            if (r4 != r7) goto L18
            int r4 = r3.mLastLayoutHeight     // Catch: java.lang.Throwable -> L29
            if (r4 == r8) goto L1e
        L18:
            r3.rebuildScene()     // Catch: java.lang.Throwable -> L29
            r3.evaluate(r0)     // Catch: java.lang.Throwable -> L29
        L1e:
            r3.mLastLayoutWidth = r7     // Catch: java.lang.Throwable -> L29
            r3.mLastLayoutHeight = r8     // Catch: java.lang.Throwable -> L29
            r3.mOldWidth = r7     // Catch: java.lang.Throwable -> L29
            r3.mOldHeight = r8     // Catch: java.lang.Throwable -> L29
            r3.mInLayout = r1
            return
        L29:
            r4 = move-exception
            r3.mInLayout = r1
            throw r4
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int r8, int r9) {
            r7 = this;
            androidx.constraintlayout.motion.widget.MotionScene r0 = r7.mScene
            if (r0 != 0) goto L8
            super.onMeasure(r8, r9)
            return
        L8:
            int r0 = r7.mLastWidthMeasureSpec
            r1 = 0
            r2 = 1
            if (r0 != r8) goto L15
            int r0 = r7.mLastHeightMeasureSpec
            if (r0 == r9) goto L13
            goto L15
        L13:
            r0 = r1
            goto L16
        L15:
            r0 = r2
        L16:
            boolean r3 = r7.mNeedsFireTransitionCompleted
            if (r3 == 0) goto L23
            r7.mNeedsFireTransitionCompleted = r1
            r7.onNewStateAttachHandlers()
            r7.processTransitionCompleted()
            r0 = r2
        L23:
            boolean r3 = r7.mDirtyHierarchy
            if (r3 == 0) goto L28
            r0 = r2
        L28:
            r7.mLastWidthMeasureSpec = r8
            r7.mLastHeightMeasureSpec = r9
            androidx.constraintlayout.motion.widget.MotionScene r3 = r7.mScene
            int r3 = r3.getStartId()
            androidx.constraintlayout.motion.widget.MotionScene r4 = r7.mScene
            int r4 = r4.getEndId()
            if (r0 != 0) goto L42
            androidx.constraintlayout.motion.widget.MotionLayout$Model r5 = r7.mModel
            boolean r5 = r5.isNotConfiguredWith(r3, r4)
            if (r5 == 0) goto L68
        L42:
            int r5 = r7.mBeginState
            r6 = -1
            if (r5 == r6) goto L68
            super.onMeasure(r8, r9)
            androidx.constraintlayout.motion.widget.MotionLayout$Model r8 = r7.mModel
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r9 = r7.mLayoutWidget
            androidx.constraintlayout.motion.widget.MotionScene r0 = r7.mScene
            androidx.constraintlayout.widget.ConstraintSet r0 = r0.getConstraintSet(r3)
            androidx.constraintlayout.motion.widget.MotionScene r2 = r7.mScene
            androidx.constraintlayout.widget.ConstraintSet r2 = r2.getConstraintSet(r4)
            r8.initFrom(r9, r0, r2)
            androidx.constraintlayout.motion.widget.MotionLayout$Model r8 = r7.mModel
            r8.reEvaluateState()
            androidx.constraintlayout.motion.widget.MotionLayout$Model r8 = r7.mModel
            r8.setMeasuredId(r3, r4)
            goto L6e
        L68:
            if (r0 == 0) goto L6d
            super.onMeasure(r8, r9)
        L6d:
            r1 = r2
        L6e:
            boolean r8 = r7.mMeasureDuringTransition
            if (r8 != 0) goto L74
            if (r1 == 0) goto Lc3
        L74:
            int r8 = r7.getPaddingTop()
            int r9 = r7.getPaddingBottom()
            int r8 = r8 + r9
            int r9 = r7.getPaddingLeft()
            int r0 = r7.getPaddingRight()
            int r9 = r9 + r0
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = r7.mLayoutWidget
            int r0 = r0.getWidth()
            int r0 = r0 + r9
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r9 = r7.mLayoutWidget
            int r9 = r9.getHeight()
            int r9 = r9 + r8
            int r8 = r7.mWidthMeasureMode
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r8 == r1) goto L9c
            if (r8 != 0) goto Lab
        L9c:
            int r8 = r7.mStartWrapWidth
            float r0 = (float) r8
            float r2 = r7.mPostInterpolationPosition
            int r3 = r7.mEndWrapWidth
            int r3 = r3 - r8
            float r8 = (float) r3
            float r2 = r2 * r8
            float r0 = r0 + r2
            int r0 = (int) r0
            r7.requestLayout()
        Lab:
            int r8 = r7.mHeightMeasureMode
            if (r8 == r1) goto Lb1
            if (r8 != 0) goto Lc0
        Lb1:
            int r8 = r7.mStartWrapHeight
            float r9 = (float) r8
            float r1 = r7.mPostInterpolationPosition
            int r2 = r7.mEndWrapHeight
            int r2 = r2 - r8
            float r8 = (float) r2
            float r1 = r1 * r8
            float r9 = r9 + r1
            int r9 = (int) r9
            r7.requestLayout()
        Lc0:
            r7.setMeasuredDimension(r0, r9)
        Lc3:
            r7.evaluateLayout()
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(android.view.View r1, float r2, float r3, boolean r4) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(android.view.View r1, float r2, float r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(android.view.View r11, int r12, int r13, int[] r14, int r15) {
            r10 = this;
            androidx.constraintlayout.motion.widget.MotionScene r15 = r10.mScene
            if (r15 != 0) goto L5
            return
        L5:
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r15.mCurrentTransition
            if (r0 == 0) goto Lc1
            boolean r1 = r0.isEnabled()
            if (r1 != 0) goto L11
            goto Lc1
        L11:
            boolean r1 = r0.isEnabled()
            r2 = -1
            if (r1 == 0) goto L2b
            androidx.constraintlayout.motion.widget.TouchResponse r1 = r0.getTouchResponse()
            if (r1 == 0) goto L2b
            int r1 = r1.getTouchRegionId()
            if (r1 == r2) goto L2b
            int r3 = r11.getId()
            if (r3 == r1) goto L2b
            return
        L2b:
            boolean r1 = r15.getMoveWhenScrollAtTop()
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r1 == 0) goto L54
            androidx.constraintlayout.motion.widget.TouchResponse r1 = r0.getTouchResponse()
            if (r1 == 0) goto L43
            int r1 = r1.getFlags()
            r1 = r1 & 4
            if (r1 == 0) goto L43
            r2 = r13
        L43:
            float r1 = r10.mTransitionPosition
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L4d
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L54
        L4d:
            boolean r1 = r11.canScrollVertically(r2)
            if (r1 == 0) goto L54
            return
        L54:
            androidx.constraintlayout.motion.widget.TouchResponse r1 = r0.getTouchResponse()
            r2 = 0
            r5 = 1
            if (r1 == 0) goto L8b
            androidx.constraintlayout.motion.widget.TouchResponse r0 = r0.getTouchResponse()
            int r0 = r0.getFlags()
            r0 = r0 & r5
            if (r0 == 0) goto L8b
            float r0 = (float) r12
            float r1 = (float) r13
            float r0 = r15.getProgressDirection(r0, r1)
            float r1 = r10.mTransitionLastPosition
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 > 0) goto L77
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 < 0) goto L7f
        L77:
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L8b
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L8b
        L7f:
            r11.setNestedScrollingEnabled(r2)
            androidx.constraintlayout.motion.widget.MotionLayout$3 r12 = new androidx.constraintlayout.motion.widget.MotionLayout$3
            r12.<init>(r10, r11)
            r11.post(r12)
            return
        L8b:
            float r11 = r10.mTransitionPosition
            long r0 = r10.getNanoTime()
            float r3 = (float) r12
            r10.mScrollTargetDX = r3
            float r4 = (float) r13
            r10.mScrollTargetDY = r4
            long r6 = r10.mScrollTargetTime
            long r6 = r0 - r6
            double r6 = (double) r6
            r8 = 4472406533629990549(0x3e112e0be826d695, double:1.0E-9)
            double r6 = r6 * r8
            float r6 = (float) r6
            r10.mScrollTargetDT = r6
            r10.mScrollTargetTime = r0
            r15.processScrollMove(r3, r4)
            float r15 = r10.mTransitionPosition
            int r11 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r11 == 0) goto Lb4
            r14[r2] = r12
            r14[r5] = r13
        Lb4:
            r10.evaluate(r2)
            r11 = r14[r2]
            if (r11 != 0) goto Lbf
            r11 = r14[r5]
            if (r11 == 0) goto Lc1
        Lbf:
            r10.mUndergoingMotion = r5
        Lc1:
            return
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(android.view.View r1, int r2, int r3, int r4, int r5, int r6) {
            r0 = this;
            return
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(android.view.View r1, int r2, int r3, int r4, int r5, int r6, int[] r7) {
            r0 = this;
            boolean r1 = r0.mUndergoingMotion
            r6 = 0
            if (r1 != 0) goto L9
            if (r2 != 0) goto L9
            if (r3 == 0) goto L14
        L9:
            r1 = r7[r6]
            int r1 = r1 + r4
            r7[r6] = r1
            r1 = 1
            r2 = r7[r1]
            int r2 = r2 + r5
            r7[r1] = r2
        L14:
            r0.mUndergoingMotion = r6
            return
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(android.view.View r1, android.view.View r2, int r3, int r4) {
            r0 = this;
            long r1 = r0.getNanoTime()
            r0.mScrollTargetTime = r1
            r1 = 0
            r0.mScrollTargetDT = r1
            r0.mScrollTargetDX = r1
            r0.mScrollTargetDY = r1
            return
    }

    void onNewStateAttachHandlers() {
            r2 = this;
            androidx.constraintlayout.motion.widget.MotionScene r0 = r2.mScene
            if (r0 != 0) goto L5
            return
        L5:
            int r1 = r2.mCurrentState
            boolean r0 = r0.autoTransition(r2, r1)
            if (r0 == 0) goto L11
            r2.requestLayout()
            return
        L11:
            int r0 = r2.mCurrentState
            r1 = -1
            if (r0 == r1) goto L1b
            androidx.constraintlayout.motion.widget.MotionScene r1 = r2.mScene
            r1.addOnClickListeners(r2, r0)
        L1b:
            androidx.constraintlayout.motion.widget.MotionScene r0 = r2.mScene
            boolean r0 = r0.supportTouch()
            if (r0 == 0) goto L28
            androidx.constraintlayout.motion.widget.MotionScene r0 = r2.mScene
            r0.setupTouch()
        L28:
            return
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int r2) {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionScene r2 = r1.mScene
            if (r2 == 0) goto Lb
            boolean r0 = r1.isRtl()
            r2.setRtl(r0)
        Lb:
            return
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(android.view.View r1, android.view.View r2, int r3, int r4) {
            r0 = this;
            androidx.constraintlayout.motion.widget.MotionScene r1 = r0.mScene
            if (r1 == 0) goto L25
            androidx.constraintlayout.motion.widget.MotionScene$Transition r1 = r1.mCurrentTransition
            if (r1 == 0) goto L25
            androidx.constraintlayout.motion.widget.MotionScene r1 = r0.mScene
            androidx.constraintlayout.motion.widget.MotionScene$Transition r1 = r1.mCurrentTransition
            androidx.constraintlayout.motion.widget.TouchResponse r1 = r1.getTouchResponse()
            if (r1 == 0) goto L25
            androidx.constraintlayout.motion.widget.MotionScene r1 = r0.mScene
            androidx.constraintlayout.motion.widget.MotionScene$Transition r1 = r1.mCurrentTransition
            androidx.constraintlayout.motion.widget.TouchResponse r1 = r1.getTouchResponse()
            int r1 = r1.getFlags()
            r1 = r1 & 2
            if (r1 == 0) goto L23
            goto L25
        L23:
            r1 = 1
            return r1
        L25:
            r1 = 0
            return r1
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(android.view.View r3, int r4) {
            r2 = this;
            androidx.constraintlayout.motion.widget.MotionScene r3 = r2.mScene
            if (r3 == 0) goto L15
            float r4 = r2.mScrollTargetDT
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto Lc
            goto L15
        Lc:
            float r0 = r2.mScrollTargetDX
            float r0 = r0 / r4
            float r1 = r2.mScrollTargetDY
            float r1 = r1 / r4
            r3.processScrollUp(r0, r1)
        L15:
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r3) {
            r2 = this;
            androidx.constraintlayout.motion.widget.MotionScene r0 = r2.mScene
            if (r0 == 0) goto L42
            boolean r1 = r2.mInteractionEnabled
            if (r1 == 0) goto L42
            boolean r0 = r0.supportTouch()
            if (r0 == 0) goto L42
            androidx.constraintlayout.motion.widget.MotionScene r0 = r2.mScene
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r0.mCurrentTransition
            if (r0 == 0) goto L1f
            boolean r0 = r0.isEnabled()
            if (r0 != 0) goto L1f
            boolean r3 = super.onTouchEvent(r3)
            return r3
        L1f:
            androidx.constraintlayout.motion.widget.MotionScene r0 = r2.mScene
            int r1 = r2.getCurrentState()
            r0.processTouchEvent(r3, r1, r2)
            androidx.constraintlayout.motion.widget.MotionScene r3 = r2.mScene
            androidx.constraintlayout.motion.widget.MotionScene$Transition r3 = r3.mCurrentTransition
            r0 = 4
            boolean r3 = r3.isTransitionFlag(r0)
            if (r3 == 0) goto L40
            androidx.constraintlayout.motion.widget.MotionScene r3 = r2.mScene
            androidx.constraintlayout.motion.widget.MotionScene$Transition r3 = r3.mCurrentTransition
            androidx.constraintlayout.motion.widget.TouchResponse r3 = r3.getTouchResponse()
            boolean r3 = r3.isDragStarted()
            return r3
        L40:
            r3 = 1
            return r3
        L42:
            boolean r3 = super.onTouchEvent(r3)
            return r3
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(android.view.View r2) {
            r1 = this;
            super.onViewAdded(r2)
            boolean r0 = r2 instanceof androidx.constraintlayout.motion.widget.MotionHelper
            if (r0 == 0) goto L5b
            androidx.constraintlayout.motion.widget.MotionHelper r2 = (androidx.constraintlayout.motion.widget.MotionHelper) r2
            java.util.concurrent.CopyOnWriteArrayList<androidx.constraintlayout.motion.widget.MotionLayout$TransitionListener> r0 = r1.mTransitionListeners
            if (r0 != 0) goto L14
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.mTransitionListeners = r0
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.constraintlayout.motion.widget.MotionLayout$TransitionListener> r0 = r1.mTransitionListeners
            r0.add(r2)
            boolean r0 = r2.isUsedOnShow()
            if (r0 == 0) goto L2f
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> r0 = r1.mOnShowHelpers
            if (r0 != 0) goto L2a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mOnShowHelpers = r0
        L2a:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> r0 = r1.mOnShowHelpers
            r0.add(r2)
        L2f:
            boolean r0 = r2.isUseOnHide()
            if (r0 == 0) goto L45
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> r0 = r1.mOnHideHelpers
            if (r0 != 0) goto L40
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mOnHideHelpers = r0
        L40:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> r0 = r1.mOnHideHelpers
            r0.add(r2)
        L45:
            boolean r0 = r2.isDecorator()
            if (r0 == 0) goto L5b
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> r0 = r1.mDecoratorsHelpers
            if (r0 != 0) goto L56
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mDecoratorsHelpers = r0
        L56:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> r0 = r1.mDecoratorsHelpers
            r0.add(r2)
        L5b:
            return
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(android.view.View r2) {
            r1 = this;
            super.onViewRemoved(r2)
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> r0 = r1.mOnShowHelpers
            if (r0 == 0) goto La
            r0.remove(r2)
        La:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> r0 = r1.mOnHideHelpers
            if (r0 == 0) goto L11
            r0.remove(r2)
        L11:
            return
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    protected void parseLayoutDescription(int r1) {
            r0 = this;
            r1 = 0
            r0.mConstraintLayoutSpec = r1
            return
    }

    @java.lang.Deprecated
    public void rebuildMotion() {
            r2 = this;
            java.lang.String r0 = "MotionLayout"
            java.lang.String r1 = "This method is deprecated. Please call rebuildScene() instead."
            android.util.Log.e(r0, r1)
            r2.rebuildScene()
            return
    }

    public void rebuildScene() {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionLayout$Model r0 = r1.mModel
            r0.reEvaluateState()
            r1.invalidate()
            return
    }

    public boolean removeTransitionListener(androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.constraintlayout.motion.widget.MotionLayout$TransitionListener> r0 = r1.mTransitionListeners
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            boolean r2 = r0.remove(r2)
            return r2
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
            r4 = this;
            boolean r0 = r4.mMeasureDuringTransition
            if (r0 != 0) goto L39
            int r0 = r4.mCurrentState
            r1 = -1
            if (r0 != r1) goto L39
            androidx.constraintlayout.motion.widget.MotionScene r0 = r4.mScene
            if (r0 == 0) goto L39
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r0.mCurrentTransition
            if (r0 == 0) goto L39
            androidx.constraintlayout.motion.widget.MotionScene r0 = r4.mScene
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r0.mCurrentTransition
            int r0 = r0.getLayoutDuringTransition()
            if (r0 != 0) goto L1c
            return
        L1c:
            r1 = 2
            if (r0 != r1) goto L39
            int r0 = r4.getChildCount()
            r1 = 0
        L24:
            if (r1 >= r0) goto L38
            android.view.View r2 = r4.getChildAt(r1)
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r3 = r4.mFrameArrayList
            java.lang.Object r2 = r3.get(r2)
            androidx.constraintlayout.motion.widget.MotionController r2 = (androidx.constraintlayout.motion.widget.MotionController) r2
            r2.remeasure()
            int r1 = r1 + 1
            goto L24
        L38:
            return
        L39:
            super.requestLayout()
            return
    }

    public void rotateTo(int r6, int r7) {
            r5 = this;
            r0 = 1
            r5.mInRotation = r0
            int r1 = r5.getWidth()
            r5.mPreRotateWidth = r1
            int r1 = r5.getHeight()
            r5.mPreRotateHeight = r1
            android.view.Display r1 = r5.getDisplay()
            int r1 = r1.getRotation()
            int r2 = r1 + 1
            int r2 = r2 % 4
            int r3 = r5.mPreviouseRotation
            int r3 = r3 + r0
            int r3 = r3 % 4
            if (r2 <= r3) goto L23
            goto L24
        L23:
            r0 = 2
        L24:
            r5.mRotatMode = r0
            r5.mPreviouseRotation = r1
            int r0 = r5.getChildCount()
            r1 = 0
        L2d:
            if (r1 >= r0) goto L4d
            android.view.View r2 = r5.getChildAt(r1)
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.utils.ViewState> r3 = r5.mPreRotate
            java.lang.Object r3 = r3.get(r2)
            androidx.constraintlayout.motion.utils.ViewState r3 = (androidx.constraintlayout.motion.utils.ViewState) r3
            if (r3 != 0) goto L47
            androidx.constraintlayout.motion.utils.ViewState r3 = new androidx.constraintlayout.motion.utils.ViewState
            r3.<init>()
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.utils.ViewState> r4 = r5.mPreRotate
            r4.put(r2, r3)
        L47:
            r3.getState(r2)
            int r1 = r1 + 1
            goto L2d
        L4d:
            r0 = -1
            r5.mBeginState = r0
            r5.mEndState = r6
            androidx.constraintlayout.motion.widget.MotionScene r1 = r5.mScene
            r1.setTransition(r0, r6)
            androidx.constraintlayout.motion.widget.MotionLayout$Model r6 = r5.mModel
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = r5.mLayoutWidget
            androidx.constraintlayout.motion.widget.MotionScene r1 = r5.mScene
            int r2 = r5.mEndState
            androidx.constraintlayout.widget.ConstraintSet r1 = r1.getConstraintSet(r2)
            r2 = 0
            r6.initFrom(r0, r2, r1)
            r6 = 0
            r5.mTransitionPosition = r6
            r5.mTransitionLastPosition = r6
            r5.invalidate()
            androidx.constraintlayout.motion.widget.MotionLayout$2 r6 = new androidx.constraintlayout.motion.widget.MotionLayout$2
            r6.<init>(r5)
            r5.transitionToEnd(r6)
            if (r7 <= 0) goto L7f
            float r6 = (float) r7
            r7 = 1148846080(0x447a0000, float:1000.0)
            float r6 = r6 / r7
            r5.mTransitionDuration = r6
        L7f:
            return
    }

    public void scheduleTransitionTo(int r4) {
            r3 = this;
            int r0 = r3.getCurrentState()
            r1 = -1
            if (r0 != r1) goto Lb
            r3.transitionToState(r4)
            goto L2d
        Lb:
            int[] r0 = r3.mScheduledTransitionTo
            if (r0 != 0) goto L15
            r0 = 4
            int[] r0 = new int[r0]
            r3.mScheduledTransitionTo = r0
            goto L23
        L15:
            int r1 = r0.length
            int r2 = r3.mScheduledTransitions
            if (r1 > r2) goto L23
            int r1 = r0.length
            int r1 = r1 * 2
            int[] r0 = java.util.Arrays.copyOf(r0, r1)
            r3.mScheduledTransitionTo = r0
        L23:
            int[] r0 = r3.mScheduledTransitionTo
            int r1 = r3.mScheduledTransitions
            int r2 = r1 + 1
            r3.mScheduledTransitions = r2
            r0[r1] = r4
        L2d:
            return
    }

    public void setDebugMode(int r1) {
            r0 = this;
            r0.mDebugPath = r1
            r0.invalidate()
            return
    }

    public void setDelayedApplicationOfInitialState(boolean r1) {
            r0 = this;
            r0.mDelayedApply = r1
            return
    }

    public void setInteractionEnabled(boolean r1) {
            r0 = this;
            r0.mInteractionEnabled = r1
            return
    }

    public void setInterpolatedProgress(float r2) {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionScene r0 = r1.mScene
            if (r0 == 0) goto L19
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r0 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING
            r1.setState(r0)
            androidx.constraintlayout.motion.widget.MotionScene r0 = r1.mScene
            android.view.animation.Interpolator r0 = r0.getInterpolator()
            if (r0 == 0) goto L19
            float r2 = r0.getInterpolation(r2)
            r1.setProgress(r2)
            return
        L19:
            r1.setProgress(r2)
            return
    }

    public void setOnHide(float r4) {
            r3 = this;
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> r0 = r3.mOnHideHelpers
            if (r0 == 0) goto L19
            int r0 = r0.size()
            r1 = 0
        L9:
            if (r1 >= r0) goto L19
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> r2 = r3.mOnHideHelpers
            java.lang.Object r2 = r2.get(r1)
            androidx.constraintlayout.motion.widget.MotionHelper r2 = (androidx.constraintlayout.motion.widget.MotionHelper) r2
            r2.setProgress(r4)
            int r1 = r1 + 1
            goto L9
        L19:
            return
    }

    public void setOnShow(float r4) {
            r3 = this;
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> r0 = r3.mOnShowHelpers
            if (r0 == 0) goto L19
            int r0 = r0.size()
            r1 = 0
        L9:
            if (r1 >= r0) goto L19
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> r2 = r3.mOnShowHelpers
            java.lang.Object r2 = r2.get(r1)
            androidx.constraintlayout.motion.widget.MotionHelper r2 = (androidx.constraintlayout.motion.widget.MotionHelper) r2
            r2.setProgress(r4)
            int r1 = r1 + 1
            goto L9
        L19:
            return
    }

    public void setProgress(float r6) {
            r5 = this;
            r0 = 0
            int r1 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 < 0) goto Lb
            int r3 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r3 <= 0) goto L12
        Lb:
            java.lang.String r3 = "MotionLayout"
            java.lang.String r4 = "Warning! Progress is defined for values between 0.0 and 1.0 inclusive"
            android.util.Log.w(r3, r4)
        L12:
            boolean r3 = r5.isAttachedToWindow()
            if (r3 != 0) goto L29
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r0 = r5.mStateCache
            if (r0 != 0) goto L23
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r0 = new androidx.constraintlayout.motion.widget.MotionLayout$StateCache
            r0.<init>(r5)
            r5.mStateCache = r0
        L23:
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r0 = r5.mStateCache
            r0.setProgress(r6)
            return
        L29:
            if (r1 > 0) goto L4c
            float r1 = r5.mTransitionLastPosition
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L3c
            int r1 = r5.mCurrentState
            int r2 = r5.mEndState
            if (r1 != r2) goto L3c
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r1 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING
            r5.setState(r1)
        L3c:
            int r1 = r5.mBeginState
            r5.mCurrentState = r1
            float r1 = r5.mTransitionLastPosition
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L79
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r0 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r5.setState(r0)
            goto L79
        L4c:
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 < 0) goto L71
            float r1 = r5.mTransitionLastPosition
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L61
            int r0 = r5.mCurrentState
            int r1 = r5.mBeginState
            if (r0 != r1) goto L61
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r0 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING
            r5.setState(r0)
        L61:
            int r0 = r5.mEndState
            r5.mCurrentState = r0
            float r0 = r5.mTransitionLastPosition
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L79
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r0 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r5.setState(r0)
            goto L79
        L71:
            r0 = -1
            r5.mCurrentState = r0
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r0 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING
            r5.setState(r0)
        L79:
            androidx.constraintlayout.motion.widget.MotionScene r0 = r5.mScene
            if (r0 != 0) goto L7e
            return
        L7e:
            r0 = 1
            r5.mTransitionInstantly = r0
            r5.mTransitionGoalPosition = r6
            r5.mTransitionPosition = r6
            r1 = -1
            r5.mTransitionLastTime = r1
            r5.mAnimationStartTime = r1
            r6 = 0
            r5.mInterpolator = r6
            r5.mInTransition = r0
            r5.invalidate()
            return
    }

    public void setProgress(float r3, float r4) {
            r2 = this;
            boolean r0 = r2.isAttachedToWindow()
            if (r0 != 0) goto L1c
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r0 = r2.mStateCache
            if (r0 != 0) goto L11
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r0 = new androidx.constraintlayout.motion.widget.MotionLayout$StateCache
            r0.<init>(r2)
            r2.mStateCache = r0
        L11:
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r0 = r2.mStateCache
            r0.setProgress(r3)
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r3 = r2.mStateCache
            r3.setVelocity(r4)
            return
        L1c:
            r2.setProgress(r3)
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r0 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING
            r2.setState(r0)
            r2.mLastVelocity = r4
            r0 = 0
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r4 == 0) goto L34
            if (r4 <= 0) goto L30
            r0 = r1
        L30:
            r2.animateTo(r0)
            goto L46
        L34:
            int r4 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r4 == 0) goto L46
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 == 0) goto L46
            r4 = 1056964608(0x3f000000, float:0.5)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L43
            r0 = r1
        L43:
            r2.animateTo(r0)
        L46:
            return
    }

    public void setScene(androidx.constraintlayout.motion.widget.MotionScene r2) {
            r1 = this;
            r1.mScene = r2
            boolean r0 = r1.isRtl()
            r2.setRtl(r0)
            r1.rebuildScene()
            return
    }

    void setStartState(int r2) {
            r1 = this;
            boolean r0 = r1.isAttachedToWindow()
            if (r0 != 0) goto L1c
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r0 = r1.mStateCache
            if (r0 != 0) goto L11
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r0 = new androidx.constraintlayout.motion.widget.MotionLayout$StateCache
            r0.<init>(r1)
            r1.mStateCache = r0
        L11:
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r0 = r1.mStateCache
            r0.setStartState(r2)
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r0 = r1.mStateCache
            r0.setEndState(r2)
            return
        L1c:
            r1.mCurrentState = r2
            return
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void setState(int r2, int r3, int r4) {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r0 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.SETUP
            r1.setState(r0)
            r1.mCurrentState = r2
            r0 = -1
            r1.mBeginState = r0
            r1.mEndState = r0
            androidx.constraintlayout.widget.ConstraintLayoutStates r0 = r1.mConstraintLayoutSpec
            if (r0 == 0) goto L18
            androidx.constraintlayout.widget.ConstraintLayoutStates r0 = r1.mConstraintLayoutSpec
            float r3 = (float) r3
            float r4 = (float) r4
            r0.updateConstraints(r2, r3, r4)
            goto L23
        L18:
            androidx.constraintlayout.motion.widget.MotionScene r3 = r1.mScene
            if (r3 == 0) goto L23
            androidx.constraintlayout.widget.ConstraintSet r2 = r3.getConstraintSet(r2)
            r2.applyTo(r1)
        L23:
            return
    }

    void setState(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState r3) {
            r2 = this;
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r0 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            if (r3 != r0) goto La
            int r0 = r2.mCurrentState
            r1 = -1
            if (r0 != r1) goto La
            return
        La:
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r0 = r2.mTransitionState
            r2.mTransitionState = r3
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r1 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING
            if (r0 != r1) goto L19
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r1 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING
            if (r3 != r1) goto L19
            r2.fireTransitionChange()
        L19:
            int[] r1 = androidx.constraintlayout.motion.widget.MotionLayout.C01405.f52xabc7e4ac
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L33
            r1 = 2
            if (r0 == r1) goto L33
            r1 = 3
            if (r0 == r1) goto L2b
            goto L41
        L2b:
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r0 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            if (r3 != r0) goto L41
            r2.fireTransitionCompleted()
            goto L41
        L33:
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r0 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING
            if (r3 != r0) goto L3a
            r2.fireTransitionChange()
        L3a:
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r0 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            if (r3 != r0) goto L41
            r2.fireTransitionCompleted()
        L41:
            return
    }

    public void setTransition(int r8) {
            r7 = this;
            androidx.constraintlayout.motion.widget.MotionScene r0 = r7.mScene
            if (r0 == 0) goto Lc6
            androidx.constraintlayout.motion.widget.MotionScene$Transition r8 = r7.getTransition(r8)
            int r0 = r8.getStartConstraintSetId()
            r7.mBeginState = r0
            int r0 = r8.getEndConstraintSetId()
            r7.mEndState = r0
            boolean r0 = r7.isAttachedToWindow()
            if (r0 != 0) goto L34
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r8 = r7.mStateCache
            if (r8 != 0) goto L25
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r8 = new androidx.constraintlayout.motion.widget.MotionLayout$StateCache
            r8.<init>(r7)
            r7.mStateCache = r8
        L25:
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r8 = r7.mStateCache
            int r0 = r7.mBeginState
            r8.setStartState(r0)
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r8 = r7.mStateCache
            int r0 = r7.mEndState
            r8.setEndState(r0)
            return
        L34:
            int r0 = r7.mCurrentState
            int r1 = r7.mBeginState
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            if (r0 != r1) goto L3f
            r0 = r3
            goto L47
        L3f:
            int r1 = r7.mEndState
            if (r0 != r1) goto L45
            r0 = r2
            goto L47
        L45:
            r0 = 2143289344(0x7fc00000, float:NaN)
        L47:
            androidx.constraintlayout.motion.widget.MotionScene r1 = r7.mScene
            r1.setTransition(r8)
            androidx.constraintlayout.motion.widget.MotionLayout$Model r8 = r7.mModel
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1 = r7.mLayoutWidget
            androidx.constraintlayout.motion.widget.MotionScene r4 = r7.mScene
            int r5 = r7.mBeginState
            androidx.constraintlayout.widget.ConstraintSet r4 = r4.getConstraintSet(r5)
            androidx.constraintlayout.motion.widget.MotionScene r5 = r7.mScene
            int r6 = r7.mEndState
            androidx.constraintlayout.widget.ConstraintSet r5 = r5.getConstraintSet(r6)
            r8.initFrom(r1, r4, r5)
            r7.rebuildScene()
            float r8 = r7.mTransitionLastPosition
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 == 0) goto L93
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 != 0) goto L80
            r8 = 1
            r7.endTrigger(r8)
            androidx.constraintlayout.motion.widget.MotionScene r8 = r7.mScene
            int r1 = r7.mBeginState
            androidx.constraintlayout.widget.ConstraintSet r8 = r8.getConstraintSet(r1)
            r8.applyTo(r7)
            goto L93
        L80:
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 != 0) goto L93
            r8 = 0
            r7.endTrigger(r8)
            androidx.constraintlayout.motion.widget.MotionScene r8 = r7.mScene
            int r1 = r7.mEndState
            androidx.constraintlayout.widget.ConstraintSet r8 = r8.getConstraintSet(r1)
            r8.applyTo(r7)
        L93:
            boolean r8 = java.lang.Float.isNaN(r0)
            if (r8 == 0) goto L9a
            goto L9b
        L9a:
            r3 = r0
        L9b:
            r7.mTransitionLastPosition = r3
            boolean r8 = java.lang.Float.isNaN(r0)
            if (r8 == 0) goto Lc3
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = androidx.constraintlayout.motion.widget.Debug.getLocation()
            java.lang.StringBuilder r8 = r8.append(r0)
            java.lang.String r0 = " transitionToStart "
            java.lang.StringBuilder r8 = r8.append(r0)
            java.lang.String r8 = r8.toString()
            java.lang.String r0 = "MotionLayout"
            android.util.Log.v(r0, r8)
            r7.transitionToStart()
            goto Lc6
        Lc3:
            r7.setProgress(r0)
        Lc6:
            return
    }

    public void setTransition(int r4, int r5) {
            r3 = this;
            boolean r0 = r3.isAttachedToWindow()
            if (r0 != 0) goto L1c
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r0 = r3.mStateCache
            if (r0 != 0) goto L11
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r0 = new androidx.constraintlayout.motion.widget.MotionLayout$StateCache
            r0.<init>(r3)
            r3.mStateCache = r0
        L11:
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r0 = r3.mStateCache
            r0.setStartState(r4)
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r4 = r3.mStateCache
            r4.setEndState(r5)
            return
        L1c:
            androidx.constraintlayout.motion.widget.MotionScene r0 = r3.mScene
            if (r0 == 0) goto L43
            r3.mBeginState = r4
            r3.mEndState = r5
            r0.setTransition(r4, r5)
            androidx.constraintlayout.motion.widget.MotionLayout$Model r0 = r3.mModel
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1 = r3.mLayoutWidget
            androidx.constraintlayout.motion.widget.MotionScene r2 = r3.mScene
            androidx.constraintlayout.widget.ConstraintSet r4 = r2.getConstraintSet(r4)
            androidx.constraintlayout.motion.widget.MotionScene r2 = r3.mScene
            androidx.constraintlayout.widget.ConstraintSet r5 = r2.getConstraintSet(r5)
            r0.initFrom(r1, r4, r5)
            r3.rebuildScene()
            r4 = 0
            r3.mTransitionLastPosition = r4
            r3.transitionToStart()
        L43:
            return
    }

    protected void setTransition(androidx.constraintlayout.motion.widget.MotionScene.Transition r5) {
            r4 = this;
            androidx.constraintlayout.motion.widget.MotionScene r0 = r4.mScene
            r0.setTransition(r5)
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r0 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.SETUP
            r4.setState(r0)
            int r0 = r4.mCurrentState
            androidx.constraintlayout.motion.widget.MotionScene r1 = r4.mScene
            int r1 = r1.getEndId()
            if (r0 != r1) goto L1d
            r0 = 1065353216(0x3f800000, float:1.0)
            r4.mTransitionLastPosition = r0
            r4.mTransitionPosition = r0
            r4.mTransitionGoalPosition = r0
            goto L24
        L1d:
            r0 = 0
            r4.mTransitionLastPosition = r0
            r4.mTransitionPosition = r0
            r4.mTransitionGoalPosition = r0
        L24:
            r0 = 1
            boolean r5 = r5.isTransitionFlag(r0)
            if (r5 == 0) goto L2e
            r0 = -1
            goto L32
        L2e:
            long r0 = r4.getNanoTime()
        L32:
            r4.mTransitionLastTime = r0
            androidx.constraintlayout.motion.widget.MotionScene r5 = r4.mScene
            int r5 = r5.getStartId()
            androidx.constraintlayout.motion.widget.MotionScene r0 = r4.mScene
            int r0 = r0.getEndId()
            int r1 = r4.mBeginState
            if (r5 != r1) goto L49
            int r1 = r4.mEndState
            if (r0 != r1) goto L49
            return
        L49:
            r4.mBeginState = r5
            r4.mEndState = r0
            androidx.constraintlayout.motion.widget.MotionScene r1 = r4.mScene
            r1.setTransition(r5, r0)
            androidx.constraintlayout.motion.widget.MotionLayout$Model r5 = r4.mModel
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = r4.mLayoutWidget
            androidx.constraintlayout.motion.widget.MotionScene r1 = r4.mScene
            int r2 = r4.mBeginState
            androidx.constraintlayout.widget.ConstraintSet r1 = r1.getConstraintSet(r2)
            androidx.constraintlayout.motion.widget.MotionScene r2 = r4.mScene
            int r3 = r4.mEndState
            androidx.constraintlayout.widget.ConstraintSet r2 = r2.getConstraintSet(r3)
            r5.initFrom(r0, r1, r2)
            androidx.constraintlayout.motion.widget.MotionLayout$Model r5 = r4.mModel
            int r0 = r4.mBeginState
            int r1 = r4.mEndState
            r5.setMeasuredId(r0, r1)
            androidx.constraintlayout.motion.widget.MotionLayout$Model r5 = r4.mModel
            r5.reEvaluateState()
            r4.rebuildScene()
            return
    }

    public void setTransitionDuration(int r2) {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionScene r0 = r1.mScene
            if (r0 != 0) goto Lc
            java.lang.String r2 = "MotionLayout"
            java.lang.String r0 = "MotionScene not defined"
            android.util.Log.e(r2, r0)
            return
        Lc:
            r0.setDuration(r2)
            return
    }

    public void setTransitionListener(androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener r1) {
            r0 = this;
            r0.mTransitionListener = r1
            return
    }

    public void setTransitionState(android.os.Bundle r2) {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r0 = r1.mStateCache
            if (r0 != 0) goto Lb
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r0 = new androidx.constraintlayout.motion.widget.MotionLayout$StateCache
            r0.<init>(r1)
            r1.mStateCache = r0
        Lb:
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r0 = r1.mStateCache
            r0.setTransitionState(r2)
            boolean r2 = r1.isAttachedToWindow()
            if (r2 == 0) goto L1b
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r2 = r1.mStateCache
            r2.apply()
        L1b:
            return
    }

    @Override // android.view.View
    public java.lang.String toString() {
            r3 = this;
            android.content.Context r0 = r3.getContext()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r3.mBeginState
            java.lang.String r2 = androidx.constraintlayout.motion.widget.Debug.getName(r0, r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "->"
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r3.mEndState
            java.lang.String r0 = androidx.constraintlayout.motion.widget.Debug.getName(r0, r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = " (pos:"
            java.lang.StringBuilder r0 = r0.append(r1)
            float r1 = r3.mTransitionLastPosition
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " Dpos/Dt:"
            java.lang.StringBuilder r0 = r0.append(r1)
            float r1 = r3.mLastVelocity
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void touchAnimateTo(int r10, float r11, float r12) {
            r9 = this;
            androidx.constraintlayout.motion.widget.MotionScene r0 = r9.mScene
            if (r0 != 0) goto L5
            return
        L5:
            float r0 = r9.mTransitionLastPosition
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 != 0) goto Lc
            return
        Lc:
            r0 = 1
            r9.mTemporalInterpolator = r0
            long r1 = r9.getNanoTime()
            r9.mAnimationStartTime = r1
            androidx.constraintlayout.motion.widget.MotionScene r1 = r9.mScene
            int r1 = r1.getDuration()
            float r1 = (float) r1
            r2 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 / r2
            r9.mTransitionDuration = r1
            r9.mTransitionGoalPosition = r11
            r9.mInTransition = r0
            r1 = 0
            r2 = 7
            r3 = 6
            r4 = 2
            if (r10 == 0) goto L93
            if (r10 == r0) goto L93
            if (r10 == r4) goto L93
            r5 = 4
            if (r10 == r5) goto L81
            r5 = 5
            if (r10 == r5) goto L3b
            if (r10 == r3) goto L93
            if (r10 == r2) goto L93
            goto Lf1
        L3b:
            float r10 = r9.mTransitionLastPosition
            androidx.constraintlayout.motion.widget.MotionScene r0 = r9.mScene
            float r0 = r0.getMaxAcceleration()
            boolean r10 = willJump(r12, r10, r0)
            if (r10 == 0) goto L5c
            androidx.constraintlayout.motion.widget.MotionLayout$DecelerateInterpolator r10 = r9.mDecelerateLogic
            float r11 = r9.mTransitionLastPosition
            androidx.constraintlayout.motion.widget.MotionScene r0 = r9.mScene
            float r0 = r0.getMaxAcceleration()
            r10.config(r12, r11, r0)
            androidx.constraintlayout.motion.widget.MotionLayout$DecelerateInterpolator r10 = r9.mDecelerateLogic
            r9.mInterpolator = r10
            goto Lf1
        L5c:
            androidx.constraintlayout.motion.utils.StopLogic r2 = r9.mStopLogic
            float r3 = r9.mTransitionLastPosition
            float r6 = r9.mTransitionDuration
            androidx.constraintlayout.motion.widget.MotionScene r10 = r9.mScene
            float r7 = r10.getMaxAcceleration()
            androidx.constraintlayout.motion.widget.MotionScene r10 = r9.mScene
            float r8 = r10.getMaxVelocity()
            r4 = r11
            r5 = r12
            r2.config(r3, r4, r5, r6, r7, r8)
            r9.mLastVelocity = r1
            int r10 = r9.mCurrentState
            r9.mTransitionGoalPosition = r11
            r9.mCurrentState = r10
            androidx.constraintlayout.motion.utils.StopLogic r10 = r9.mStopLogic
            r9.mInterpolator = r10
            goto Lf1
        L81:
            androidx.constraintlayout.motion.widget.MotionLayout$DecelerateInterpolator r10 = r9.mDecelerateLogic
            float r11 = r9.mTransitionLastPosition
            androidx.constraintlayout.motion.widget.MotionScene r0 = r9.mScene
            float r0 = r0.getMaxAcceleration()
            r10.config(r12, r11, r0)
            androidx.constraintlayout.motion.widget.MotionLayout$DecelerateInterpolator r10 = r9.mDecelerateLogic
            r9.mInterpolator = r10
            goto Lf1
        L93:
            if (r10 == r0) goto L9f
            if (r10 != r2) goto L98
            goto L9f
        L98:
            if (r10 == r4) goto L9c
            if (r10 != r3) goto La0
        L9c:
            r11 = 1065353216(0x3f800000, float:1.0)
            goto La0
        L9f:
            r11 = r1
        La0:
            androidx.constraintlayout.motion.widget.MotionScene r10 = r9.mScene
            int r10 = r10.getAutoCompleteMode()
            if (r10 != 0) goto Lc0
            androidx.constraintlayout.motion.utils.StopLogic r0 = r9.mStopLogic
            float r1 = r9.mTransitionLastPosition
            float r4 = r9.mTransitionDuration
            androidx.constraintlayout.motion.widget.MotionScene r10 = r9.mScene
            float r5 = r10.getMaxAcceleration()
            androidx.constraintlayout.motion.widget.MotionScene r10 = r9.mScene
            float r6 = r10.getMaxVelocity()
            r2 = r11
            r3 = r12
            r0.config(r1, r2, r3, r4, r5, r6)
            goto Le7
        Lc0:
            androidx.constraintlayout.motion.utils.StopLogic r0 = r9.mStopLogic
            float r1 = r9.mTransitionLastPosition
            androidx.constraintlayout.motion.widget.MotionScene r10 = r9.mScene
            float r4 = r10.getSpringMass()
            androidx.constraintlayout.motion.widget.MotionScene r10 = r9.mScene
            float r5 = r10.getSpringStiffiness()
            androidx.constraintlayout.motion.widget.MotionScene r10 = r9.mScene
            float r6 = r10.getSpringDamping()
            androidx.constraintlayout.motion.widget.MotionScene r10 = r9.mScene
            float r7 = r10.getSpringStopThreshold()
            androidx.constraintlayout.motion.widget.MotionScene r10 = r9.mScene
            int r8 = r10.getSpringBoundary()
            r2 = r11
            r3 = r12
            r0.springConfig(r1, r2, r3, r4, r5, r6, r7, r8)
        Le7:
            int r10 = r9.mCurrentState
            r9.mTransitionGoalPosition = r11
            r9.mCurrentState = r10
            androidx.constraintlayout.motion.utils.StopLogic r10 = r9.mStopLogic
            r9.mInterpolator = r10
        Lf1:
            r10 = 0
            r9.mTransitionInstantly = r10
            long r10 = r9.getNanoTime()
            r9.mAnimationStartTime = r10
            r9.invalidate()
            return
    }

    public void touchSpringTo(float r12, float r13) {
            r11 = this;
            androidx.constraintlayout.motion.widget.MotionScene r0 = r11.mScene
            if (r0 != 0) goto L5
            return
        L5:
            float r0 = r11.mTransitionLastPosition
            int r0 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r0 != 0) goto Lc
            return
        Lc:
            r0 = 1
            r11.mTemporalInterpolator = r0
            long r1 = r11.getNanoTime()
            r11.mAnimationStartTime = r1
            androidx.constraintlayout.motion.widget.MotionScene r1 = r11.mScene
            int r1 = r1.getDuration()
            float r1 = (float) r1
            r2 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 / r2
            r11.mTransitionDuration = r1
            r11.mTransitionGoalPosition = r12
            r11.mInTransition = r0
            androidx.constraintlayout.motion.utils.StopLogic r2 = r11.mStopLogic
            float r3 = r11.mTransitionLastPosition
            androidx.constraintlayout.motion.widget.MotionScene r0 = r11.mScene
            float r6 = r0.getSpringMass()
            androidx.constraintlayout.motion.widget.MotionScene r0 = r11.mScene
            float r7 = r0.getSpringStiffiness()
            androidx.constraintlayout.motion.widget.MotionScene r0 = r11.mScene
            float r8 = r0.getSpringDamping()
            androidx.constraintlayout.motion.widget.MotionScene r0 = r11.mScene
            float r9 = r0.getSpringStopThreshold()
            androidx.constraintlayout.motion.widget.MotionScene r0 = r11.mScene
            int r10 = r0.getSpringBoundary()
            r4 = r12
            r5 = r13
            r2.springConfig(r3, r4, r5, r6, r7, r8, r9, r10)
            int r13 = r11.mCurrentState
            r11.mTransitionGoalPosition = r12
            r11.mCurrentState = r13
            androidx.constraintlayout.motion.utils.StopLogic r12 = r11.mStopLogic
            r11.mInterpolator = r12
            r12 = 0
            r11.mTransitionInstantly = r12
            long r12 = r11.getNanoTime()
            r11.mAnimationStartTime = r12
            r11.invalidate()
            return
    }

    public void transitionToEnd() {
            r1 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.animateTo(r0)
            r0 = 0
            r1.mOnComplete = r0
            return
    }

    public void transitionToEnd(java.lang.Runnable r2) {
            r1 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.animateTo(r0)
            r1.mOnComplete = r2
            return
    }

    public void transitionToStart() {
            r1 = this;
            r0 = 0
            r1.animateTo(r0)
            return
    }

    public void transitionToState(int r2) {
            r1 = this;
            boolean r0 = r1.isAttachedToWindow()
            if (r0 != 0) goto L17
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r0 = r1.mStateCache
            if (r0 != 0) goto L11
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r0 = new androidx.constraintlayout.motion.widget.MotionLayout$StateCache
            r0.<init>(r1)
            r1.mStateCache = r0
        L11:
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r0 = r1.mStateCache
            r0.setEndState(r2)
            return
        L17:
            r0 = -1
            r1.transitionToState(r2, r0, r0)
            return
    }

    public void transitionToState(int r2, int r3) {
            r1 = this;
            boolean r0 = r1.isAttachedToWindow()
            if (r0 != 0) goto L17
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r3 = r1.mStateCache
            if (r3 != 0) goto L11
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r3 = new androidx.constraintlayout.motion.widget.MotionLayout$StateCache
            r3.<init>(r1)
            r1.mStateCache = r3
        L11:
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r3 = r1.mStateCache
            r3.setEndState(r2)
            return
        L17:
            r0 = -1
            r1.transitionToState(r2, r0, r0, r3)
            return
    }

    public void transitionToState(int r2, int r3, int r4) {
            r1 = this;
            r0 = -1
            r1.transitionToState(r2, r3, r4, r0)
            return
    }

    public void transitionToState(int r11, int r12, int r13, int r14) {
            r10 = this;
            androidx.constraintlayout.motion.widget.MotionScene r0 = r10.mScene
            r1 = -1
            if (r0 == 0) goto L18
            androidx.constraintlayout.widget.StateSet r0 = r0.mStateSet
            if (r0 == 0) goto L18
            androidx.constraintlayout.motion.widget.MotionScene r0 = r10.mScene
            androidx.constraintlayout.widget.StateSet r0 = r0.mStateSet
            int r2 = r10.mCurrentState
            float r12 = (float) r12
            float r13 = (float) r13
            int r12 = r0.convertToConstraintSet(r2, r11, r12, r13)
            if (r12 == r1) goto L18
            r11 = r12
        L18:
            int r12 = r10.mCurrentState
            if (r12 != r11) goto L1d
            return
        L1d:
            int r13 = r10.mBeginState
            r0 = 1148846080(0x447a0000, float:1000.0)
            r2 = 0
            if (r13 != r11) goto L2e
            r10.animateTo(r2)
            if (r14 <= 0) goto L2d
            float r11 = (float) r14
            float r11 = r11 / r0
            r10.mTransitionDuration = r11
        L2d:
            return
        L2e:
            int r13 = r10.mEndState
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r13 != r11) goto L3e
            r10.animateTo(r3)
            if (r14 <= 0) goto L3d
            float r11 = (float) r14
            float r11 = r11 / r0
            r10.mTransitionDuration = r11
        L3d:
            return
        L3e:
            r10.mEndState = r11
            if (r12 == r1) goto L54
            r10.setTransition(r12, r11)
            r10.animateTo(r3)
            r10.mTransitionLastPosition = r2
            r10.transitionToEnd()
            if (r14 <= 0) goto L53
            float r11 = (float) r14
            float r11 = r11 / r0
            r10.mTransitionDuration = r11
        L53:
            return
        L54:
            r12 = 0
            r10.mTemporalInterpolator = r12
            r10.mTransitionGoalPosition = r3
            r10.mTransitionPosition = r2
            r10.mTransitionLastPosition = r2
            long r4 = r10.getNanoTime()
            r10.mTransitionLastTime = r4
            long r4 = r10.getNanoTime()
            r10.mAnimationStartTime = r4
            r10.mTransitionInstantly = r12
            r13 = 0
            r10.mInterpolator = r13
            if (r14 != r1) goto L7a
            androidx.constraintlayout.motion.widget.MotionScene r4 = r10.mScene
            int r4 = r4.getDuration()
            float r4 = (float) r4
            float r4 = r4 / r0
            r10.mTransitionDuration = r4
        L7a:
            r10.mBeginState = r1
            androidx.constraintlayout.motion.widget.MotionScene r4 = r10.mScene
            int r5 = r10.mEndState
            r4.setTransition(r1, r5)
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            if (r14 != 0) goto L95
            androidx.constraintlayout.motion.widget.MotionScene r14 = r10.mScene
            int r14 = r14.getDuration()
            float r14 = (float) r14
            float r14 = r14 / r0
            r10.mTransitionDuration = r14
            goto L9b
        L95:
            if (r14 <= 0) goto L9b
            float r14 = (float) r14
            float r14 = r14 / r0
            r10.mTransitionDuration = r14
        L9b:
            int r14 = r10.getChildCount()
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r0 = r10.mFrameArrayList
            r0.clear()
            r0 = r12
        La5:
            if (r0 >= r14) goto Lc7
            android.view.View r4 = r10.getChildAt(r0)
            androidx.constraintlayout.motion.widget.MotionController r5 = new androidx.constraintlayout.motion.widget.MotionController
            r5.<init>(r4)
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r6 = r10.mFrameArrayList
            r6.put(r4, r5)
            int r5 = r4.getId()
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r6 = r10.mFrameArrayList
            java.lang.Object r4 = r6.get(r4)
            androidx.constraintlayout.motion.widget.MotionController r4 = (androidx.constraintlayout.motion.widget.MotionController) r4
            r1.put(r5, r4)
            int r0 = r0 + 1
            goto La5
        Lc7:
            r0 = 1
            r10.mInTransition = r0
            androidx.constraintlayout.motion.widget.MotionLayout$Model r1 = r10.mModel
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r4 = r10.mLayoutWidget
            androidx.constraintlayout.motion.widget.MotionScene r5 = r10.mScene
            androidx.constraintlayout.widget.ConstraintSet r11 = r5.getConstraintSet(r11)
            r1.initFrom(r4, r13, r11)
            r10.rebuildScene()
            androidx.constraintlayout.motion.widget.MotionLayout$Model r11 = r10.mModel
            r11.build()
            r10.computeCurrentPositions()
            int r11 = r10.getWidth()
            int r13 = r10.getHeight()
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> r1 = r10.mDecoratorsHelpers
            if (r1 == 0) goto L140
            r1 = r12
        Lef:
            if (r1 >= r14) goto L108
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r4 = r10.mFrameArrayList
            android.view.View r5 = r10.getChildAt(r1)
            java.lang.Object r4 = r4.get(r5)
            androidx.constraintlayout.motion.widget.MotionController r4 = (androidx.constraintlayout.motion.widget.MotionController) r4
            if (r4 != 0) goto L100
            goto L105
        L100:
            androidx.constraintlayout.motion.widget.MotionScene r5 = r10.mScene
            r5.getKeyFrames(r4)
        L105:
            int r1 = r1 + 1
            goto Lef
        L108:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> r1 = r10.mDecoratorsHelpers
            java.util.Iterator r1 = r1.iterator()
        L10e:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L120
            java.lang.Object r4 = r1.next()
            androidx.constraintlayout.motion.widget.MotionHelper r4 = (androidx.constraintlayout.motion.widget.MotionHelper) r4
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r5 = r10.mFrameArrayList
            r4.onPreSetup(r10, r5)
            goto L10e
        L120:
            r1 = r12
        L121:
            if (r1 >= r14) goto L165
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r4 = r10.mFrameArrayList
            android.view.View r5 = r10.getChildAt(r1)
            java.lang.Object r4 = r4.get(r5)
            androidx.constraintlayout.motion.widget.MotionController r4 = (androidx.constraintlayout.motion.widget.MotionController) r4
            if (r4 != 0) goto L132
            goto L13d
        L132:
            float r7 = r10.mTransitionDuration
            long r8 = r10.getNanoTime()
            r5 = r11
            r6 = r13
            r4.setup(r5, r6, r7, r8)
        L13d:
            int r1 = r1 + 1
            goto L121
        L140:
            r1 = r12
        L141:
            if (r1 >= r14) goto L165
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r4 = r10.mFrameArrayList
            android.view.View r5 = r10.getChildAt(r1)
            java.lang.Object r4 = r4.get(r5)
            androidx.constraintlayout.motion.widget.MotionController r4 = (androidx.constraintlayout.motion.widget.MotionController) r4
            if (r4 != 0) goto L152
            goto L162
        L152:
            androidx.constraintlayout.motion.widget.MotionScene r5 = r10.mScene
            r5.getKeyFrames(r4)
            float r7 = r10.mTransitionDuration
            long r8 = r10.getNanoTime()
            r5 = r11
            r6 = r13
            r4.setup(r5, r6, r7, r8)
        L162:
            int r1 = r1 + 1
            goto L141
        L165:
            androidx.constraintlayout.motion.widget.MotionScene r11 = r10.mScene
            float r11 = r11.getStaggered()
            int r13 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r13 == 0) goto L1c1
            r13 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r1 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r4 = r12
        L176:
            if (r4 >= r14) goto L198
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r5 = r10.mFrameArrayList
            android.view.View r6 = r10.getChildAt(r4)
            java.lang.Object r5 = r5.get(r6)
            androidx.constraintlayout.motion.widget.MotionController r5 = (androidx.constraintlayout.motion.widget.MotionController) r5
            float r6 = r5.getFinalX()
            float r5 = r5.getFinalY()
            float r5 = r5 + r6
            float r13 = java.lang.Math.min(r13, r5)
            float r1 = java.lang.Math.max(r1, r5)
            int r4 = r4 + 1
            goto L176
        L198:
            if (r12 >= r14) goto L1c1
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r4 = r10.mFrameArrayList
            android.view.View r5 = r10.getChildAt(r12)
            java.lang.Object r4 = r4.get(r5)
            androidx.constraintlayout.motion.widget.MotionController r4 = (androidx.constraintlayout.motion.widget.MotionController) r4
            float r5 = r4.getFinalX()
            float r6 = r4.getFinalY()
            float r7 = r3 - r11
            float r7 = r3 / r7
            r4.mStaggerScale = r7
            float r5 = r5 + r6
            float r5 = r5 - r13
            float r5 = r5 * r11
            float r6 = r1 - r13
            float r5 = r5 / r6
            float r5 = r11 - r5
            r4.mStaggerOffset = r5
            int r12 = r12 + 1
            goto L198
        L1c1:
            r10.mTransitionPosition = r2
            r10.mTransitionLastPosition = r2
            r10.mInTransition = r0
            r10.invalidate()
            return
    }

    public void updateState() {
            r5 = this;
            androidx.constraintlayout.motion.widget.MotionLayout$Model r0 = r5.mModel
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1 = r5.mLayoutWidget
            androidx.constraintlayout.motion.widget.MotionScene r2 = r5.mScene
            int r3 = r5.mBeginState
            androidx.constraintlayout.widget.ConstraintSet r2 = r2.getConstraintSet(r3)
            androidx.constraintlayout.motion.widget.MotionScene r3 = r5.mScene
            int r4 = r5.mEndState
            androidx.constraintlayout.widget.ConstraintSet r3 = r3.getConstraintSet(r4)
            r0.initFrom(r1, r2, r3)
            r5.rebuildScene()
            return
    }

    public void updateState(int r2, androidx.constraintlayout.widget.ConstraintSet r3) {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionScene r0 = r1.mScene
            if (r0 == 0) goto L7
            r0.setConstraintSet(r2, r3)
        L7:
            r1.updateState()
            int r0 = r1.mCurrentState
            if (r0 != r2) goto L11
            r3.applyTo(r1)
        L11:
            return
    }

    public void updateStateAnimate(int r4, androidx.constraintlayout.widget.ConstraintSet r5, int r6) {
            r3 = this;
            androidx.constraintlayout.motion.widget.MotionScene r0 = r3.mScene
            if (r0 != 0) goto L5
            return
        L5:
            int r0 = r3.mCurrentState
            if (r0 != r4) goto L2d
            int r0 = androidx.constraintlayout.widget.C0156R.id.view_transition
            androidx.constraintlayout.widget.ConstraintSet r1 = r3.getConstraintSet(r4)
            r3.updateState(r0, r1)
            int r0 = androidx.constraintlayout.widget.C0156R.id.view_transition
            r1 = -1
            r3.setState(r0, r1, r1)
            r3.updateState(r4, r5)
            androidx.constraintlayout.motion.widget.MotionScene$Transition r5 = new androidx.constraintlayout.motion.widget.MotionScene$Transition
            androidx.constraintlayout.motion.widget.MotionScene r0 = r3.mScene
            int r2 = androidx.constraintlayout.widget.C0156R.id.view_transition
            r5.<init>(r1, r0, r2, r4)
            r5.setDuration(r6)
            r3.setTransition(r5)
            r3.transitionToEnd()
        L2d:
            return
    }

    public void viewTransition(int r2, android.view.View... r3) {
            r1 = this;
            androidx.constraintlayout.motion.widget.MotionScene r0 = r1.mScene
            if (r0 == 0) goto L8
            r0.viewTransition(r2, r3)
            goto Lf
        L8:
            java.lang.String r2 = "MotionLayout"
            java.lang.String r3 = " no motionScene"
            android.util.Log.e(r2, r3)
        Lf:
            return
    }
}
