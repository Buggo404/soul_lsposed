package androidx.constraintlayout.motion.widget;

/* loaded from: classes.dex */
public class ViewTransition {
    static final int ANTICIPATE = 6;
    static final int BOUNCE = 4;
    public static final java.lang.String CONSTRAINT_OVERRIDE = "ConstraintOverride";
    public static final java.lang.String CUSTOM_ATTRIBUTE = "CustomAttribute";
    public static final java.lang.String CUSTOM_METHOD = "CustomMethod";
    static final int EASE_IN = 1;
    static final int EASE_IN_OUT = 0;
    static final int EASE_OUT = 2;
    private static final int INTERPOLATOR_REFERENCE_ID = -2;
    public static final java.lang.String KEY_FRAME_SET_TAG = "KeyFrameSet";
    static final int LINEAR = 3;
    public static final int ONSTATE_ACTION_DOWN = 1;
    public static final int ONSTATE_ACTION_DOWN_UP = 3;
    public static final int ONSTATE_ACTION_UP = 2;
    public static final int ONSTATE_SHARED_VALUE_SET = 4;
    public static final int ONSTATE_SHARED_VALUE_UNSET = 5;
    static final int OVERSHOOT = 5;
    private static final int SPLINE_STRING = -1;
    private static java.lang.String TAG = "ViewTransition";
    private static final int UNSET = -1;
    static final int VIEWTRANSITIONMODE_ALLSTATES = 1;
    static final int VIEWTRANSITIONMODE_CURRENTSTATE = 0;
    static final int VIEWTRANSITIONMODE_NOSTATE = 2;
    public static final java.lang.String VIEW_TRANSITION_TAG = "ViewTransition";
    private int mClearsTag;
    androidx.constraintlayout.widget.ConstraintSet.Constraint mConstraintDelta;
    android.content.Context mContext;
    private int mDefaultInterpolator;
    private int mDefaultInterpolatorID;
    private java.lang.String mDefaultInterpolatorString;
    private boolean mDisabled;
    private int mDuration;
    private int mId;
    private int mIfTagNotSet;
    private int mIfTagSet;
    androidx.constraintlayout.motion.widget.KeyFrames mKeyFrames;
    private int mOnStateTransition;
    private int mPathMotionArc;
    private int mSetsTag;
    private int mSharedValueCurrent;
    private int mSharedValueID;
    private int mSharedValueTarget;
    private int mTargetId;
    private java.lang.String mTargetString;
    private int mUpDuration;
    int mViewTransitionMode;
    androidx.constraintlayout.widget.ConstraintSet set;


    static class Animate {
        boolean hold_at_100;
        androidx.constraintlayout.core.motion.utils.KeyCache mCache;
        private final int mClearsTag;
        float mDpositionDt;
        int mDuration;
        android.view.animation.Interpolator mInterpolator;
        long mLastRender;
        androidx.constraintlayout.motion.widget.MotionController mMC;
        float mPosition;
        private final int mSetsTag;
        long mStart;
        android.graphics.Rect mTempRec;
        int mUpDuration;
        androidx.constraintlayout.motion.widget.ViewTransitionController mVtController;
        boolean reverse;

        Animate(androidx.constraintlayout.motion.widget.ViewTransitionController r3, androidx.constraintlayout.motion.widget.MotionController r4, int r5, int r6, int r7, android.view.animation.Interpolator r8, int r9, int r10) {
                r2 = this;
                r2.<init>()
                androidx.constraintlayout.core.motion.utils.KeyCache r0 = new androidx.constraintlayout.core.motion.utils.KeyCache
                r0.<init>()
                r2.mCache = r0
                r0 = 0
                r2.reverse = r0
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>()
                r2.mTempRec = r1
                r2.hold_at_100 = r0
                r2.mVtController = r3
                r2.mMC = r4
                r2.mDuration = r5
                r2.mUpDuration = r6
                long r3 = java.lang.System.nanoTime()
                r2.mStart = r3
                r2.mLastRender = r3
                androidx.constraintlayout.motion.widget.ViewTransitionController r3 = r2.mVtController
                r3.addAnimation(r2)
                r2.mInterpolator = r8
                r2.mSetsTag = r9
                r2.mClearsTag = r10
                r3 = 3
                if (r7 != r3) goto L37
                r3 = 1
                r2.hold_at_100 = r3
            L37:
                if (r5 != 0) goto L3d
                r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
                goto L41
            L3d:
                r3 = 1065353216(0x3f800000, float:1.0)
                float r4 = (float) r5
                float r3 = r3 / r4
            L41:
                r2.mDpositionDt = r3
                r2.mutate()
                return
        }

        void mutate() {
                r1 = this;
                boolean r0 = r1.reverse
                if (r0 == 0) goto L8
                r1.mutateReverse()
                goto Lb
            L8:
                r1.mutateForward()
            Lb:
                return
        }

        void mutateForward() {
                r7 = this;
                long r3 = java.lang.System.nanoTime()
                long r0 = r7.mLastRender
                long r0 = r3 - r0
                r7.mLastRender = r3
                float r2 = r7.mPosition
                double r0 = (double) r0
                r5 = 4517329193108106637(0x3eb0c6f7a0b5ed8d, double:1.0E-6)
                double r0 = r0 * r5
                float r0 = (float) r0
                float r1 = r7.mDpositionDt
                float r0 = r0 * r1
                float r2 = r2 + r0
                r7.mPosition = r2
                r6 = 1065353216(0x3f800000, float:1.0)
                int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                if (r0 < 0) goto L22
                r7.mPosition = r6
            L22:
                android.view.animation.Interpolator r0 = r7.mInterpolator
                if (r0 != 0) goto L29
                float r0 = r7.mPosition
                goto L2f
            L29:
                float r1 = r7.mPosition
                float r0 = r0.getInterpolation(r1)
            L2f:
                r2 = r0
                androidx.constraintlayout.motion.widget.MotionController r0 = r7.mMC
                android.view.View r1 = r0.mView
                androidx.constraintlayout.core.motion.utils.KeyCache r5 = r7.mCache
                boolean r0 = r0.interpolate(r1, r2, r3, r5)
                float r1 = r7.mPosition
                int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
                if (r1 < 0) goto L71
                int r1 = r7.mSetsTag
                r2 = -1
                if (r1 == r2) goto L58
                androidx.constraintlayout.motion.widget.MotionController r1 = r7.mMC
                android.view.View r1 = r1.getView()
                int r3 = r7.mSetsTag
                long r4 = java.lang.System.nanoTime()
                java.lang.Long r4 = java.lang.Long.valueOf(r4)
                r1.setTag(r3, r4)
            L58:
                int r1 = r7.mClearsTag
                if (r1 == r2) goto L68
                androidx.constraintlayout.motion.widget.MotionController r1 = r7.mMC
                android.view.View r1 = r1.getView()
                int r2 = r7.mClearsTag
                r3 = 0
                r1.setTag(r2, r3)
            L68:
                boolean r1 = r7.hold_at_100
                if (r1 != 0) goto L71
                androidx.constraintlayout.motion.widget.ViewTransitionController r1 = r7.mVtController
                r1.removeAnimation(r7)
            L71:
                float r1 = r7.mPosition
                int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
                if (r1 < 0) goto L79
                if (r0 == 0) goto L7e
            L79:
                androidx.constraintlayout.motion.widget.ViewTransitionController r0 = r7.mVtController
                r0.invalidate()
            L7e:
                return
        }

        void mutateReverse() {
                r7 = this;
                long r3 = java.lang.System.nanoTime()
                long r0 = r7.mLastRender
                long r0 = r3 - r0
                r7.mLastRender = r3
                float r2 = r7.mPosition
                double r0 = (double) r0
                r5 = 4517329193108106637(0x3eb0c6f7a0b5ed8d, double:1.0E-6)
                double r0 = r0 * r5
                float r0 = (float) r0
                float r1 = r7.mDpositionDt
                float r0 = r0 * r1
                float r2 = r2 - r0
                r7.mPosition = r2
                r6 = 0
                int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                if (r0 >= 0) goto L21
                r7.mPosition = r6
            L21:
                android.view.animation.Interpolator r0 = r7.mInterpolator
                if (r0 != 0) goto L28
                float r0 = r7.mPosition
                goto L2e
            L28:
                float r1 = r7.mPosition
                float r0 = r0.getInterpolation(r1)
            L2e:
                r2 = r0
                androidx.constraintlayout.motion.widget.MotionController r0 = r7.mMC
                android.view.View r1 = r0.mView
                androidx.constraintlayout.core.motion.utils.KeyCache r5 = r7.mCache
                boolean r0 = r0.interpolate(r1, r2, r3, r5)
                float r1 = r7.mPosition
                int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
                if (r1 > 0) goto L6c
                int r1 = r7.mSetsTag
                r2 = -1
                if (r1 == r2) goto L57
                androidx.constraintlayout.motion.widget.MotionController r1 = r7.mMC
                android.view.View r1 = r1.getView()
                int r3 = r7.mSetsTag
                long r4 = java.lang.System.nanoTime()
                java.lang.Long r4 = java.lang.Long.valueOf(r4)
                r1.setTag(r3, r4)
            L57:
                int r1 = r7.mClearsTag
                if (r1 == r2) goto L67
                androidx.constraintlayout.motion.widget.MotionController r1 = r7.mMC
                android.view.View r1 = r1.getView()
                int r2 = r7.mClearsTag
                r3 = 0
                r1.setTag(r2, r3)
            L67:
                androidx.constraintlayout.motion.widget.ViewTransitionController r1 = r7.mVtController
                r1.removeAnimation(r7)
            L6c:
                float r1 = r7.mPosition
                int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
                if (r1 > 0) goto L74
                if (r0 == 0) goto L79
            L74:
                androidx.constraintlayout.motion.widget.ViewTransitionController r0 = r7.mVtController
                r0.invalidate()
            L79:
                return
        }

        public void reactTo(int r3, float r4, float r5) {
                r2 = this;
                r0 = 1
                if (r3 == r0) goto L24
                r1 = 2
                if (r3 == r1) goto L7
                goto L23
            L7:
                androidx.constraintlayout.motion.widget.MotionController r3 = r2.mMC
                android.view.View r3 = r3.getView()
                android.graphics.Rect r1 = r2.mTempRec
                r3.getHitRect(r1)
                android.graphics.Rect r3 = r2.mTempRec
                int r4 = (int) r4
                int r5 = (int) r5
                boolean r3 = r3.contains(r4, r5)
                if (r3 != 0) goto L23
                boolean r3 = r2.reverse
                if (r3 != 0) goto L23
                r2.reverse(r0)
            L23:
                return
            L24:
                boolean r3 = r2.reverse
                if (r3 != 0) goto L2b
                r2.reverse(r0)
            L2b:
                return
        }

        void reverse(boolean r3) {
                r2 = this;
                r2.reverse = r3
                if (r3 == 0) goto L16
                int r3 = r2.mUpDuration
                r0 = -1
                if (r3 == r0) goto L16
                if (r3 != 0) goto Lf
                r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
                goto L14
            Lf:
                r0 = 1065353216(0x3f800000, float:1.0)
                float r3 = (float) r3
                float r3 = r0 / r3
            L14:
                r2.mDpositionDt = r3
            L16:
                androidx.constraintlayout.motion.widget.ViewTransitionController r3 = r2.mVtController
                r3.invalidate()
                long r0 = java.lang.System.nanoTime()
                r2.mLastRender = r0
                return
        }
    }

    static {
            return
    }

    ViewTransition(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
            r9 = this;
            r9.<init>()
            r0 = -1
            r9.mOnStateTransition = r0
            r1 = 0
            r9.mDisabled = r1
            r9.mPathMotionArc = r1
            r9.mDuration = r0
            r9.mUpDuration = r0
            r9.mDefaultInterpolator = r1
            r2 = 0
            r9.mDefaultInterpolatorString = r2
            r9.mDefaultInterpolatorID = r0
            r9.mSetsTag = r0
            r9.mClearsTag = r0
            r9.mIfTagSet = r0
            r9.mIfTagNotSet = r0
            r9.mSharedValueTarget = r0
            r9.mSharedValueID = r0
            r9.mSharedValueCurrent = r0
            r9.mContext = r10
            int r2 = r11.getEventType()     // Catch: java.io.IOException -> Le7 org.xmlpull.v1.XmlPullParserException -> Lec
        L2a:
            r3 = 1
            if (r2 == r3) goto Lf0
            java.lang.String r4 = "ViewTransition"
            r5 = 3
            r6 = 2
            if (r2 == r6) goto L42
            if (r2 == r5) goto L37
            goto Le1
        L37:
            java.lang.String r2 = r11.getName()     // Catch: java.io.IOException -> Le7 org.xmlpull.v1.XmlPullParserException -> Lec
            boolean r2 = r4.equals(r2)     // Catch: java.io.IOException -> Le7 org.xmlpull.v1.XmlPullParserException -> Lec
            if (r2 == 0) goto Le1
            return
        L42:
            java.lang.String r2 = r11.getName()     // Catch: java.io.IOException -> Le7 org.xmlpull.v1.XmlPullParserException -> Lec
            int r7 = r2.hashCode()     // Catch: java.io.IOException -> Le7 org.xmlpull.v1.XmlPullParserException -> Lec
            r8 = 4
            switch(r7) {
                case -1962203927: goto L75;
                case -1239391468: goto L6b;
                case 61998586: goto L63;
                case 366511058: goto L59;
                case 1791837707: goto L4f;
                default: goto L4e;
            }     // Catch: java.io.IOException -> Le7 org.xmlpull.v1.XmlPullParserException -> Lec
        L4e:
            goto L7f
        L4f:
            java.lang.String r4 = "CustomAttribute"
            boolean r4 = r2.equals(r4)     // Catch: java.io.IOException -> Le7 org.xmlpull.v1.XmlPullParserException -> Lec
            if (r4 == 0) goto L7f
            r4 = r5
            goto L80
        L59:
            java.lang.String r4 = "CustomMethod"
            boolean r4 = r2.equals(r4)     // Catch: java.io.IOException -> Le7 org.xmlpull.v1.XmlPullParserException -> Lec
            if (r4 == 0) goto L7f
            r4 = r8
            goto L80
        L63:
            boolean r4 = r2.equals(r4)     // Catch: java.io.IOException -> Le7 org.xmlpull.v1.XmlPullParserException -> Lec
            if (r4 == 0) goto L7f
            r4 = r1
            goto L80
        L6b:
            java.lang.String r4 = "KeyFrameSet"
            boolean r4 = r2.equals(r4)     // Catch: java.io.IOException -> Le7 org.xmlpull.v1.XmlPullParserException -> Lec
            if (r4 == 0) goto L7f
            r4 = r3
            goto L80
        L75:
            java.lang.String r4 = "ConstraintOverride"
            boolean r4 = r2.equals(r4)     // Catch: java.io.IOException -> Le7 org.xmlpull.v1.XmlPullParserException -> Lec
            if (r4 == 0) goto L7f
            r4 = r6
            goto L80
        L7f:
            r4 = r0
        L80:
            if (r4 == 0) goto Lde
            if (r4 == r3) goto Ld6
            if (r4 == r6) goto Lcf
            if (r4 == r5) goto Lc7
            if (r4 == r8) goto Lc7
            java.lang.String r3 = androidx.constraintlayout.motion.widget.ViewTransition.TAG     // Catch: java.io.IOException -> Le7 org.xmlpull.v1.XmlPullParserException -> Lec
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Le7 org.xmlpull.v1.XmlPullParserException -> Lec
            r4.<init>()     // Catch: java.io.IOException -> Le7 org.xmlpull.v1.XmlPullParserException -> Lec
            java.lang.String r5 = androidx.constraintlayout.motion.widget.Debug.getLoc()     // Catch: java.io.IOException -> Le7 org.xmlpull.v1.XmlPullParserException -> Lec
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.io.IOException -> Le7 org.xmlpull.v1.XmlPullParserException -> Lec
            java.lang.String r5 = " unknown tag "
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.io.IOException -> Le7 org.xmlpull.v1.XmlPullParserException -> Lec
            java.lang.StringBuilder r2 = r4.append(r2)     // Catch: java.io.IOException -> Le7 org.xmlpull.v1.XmlPullParserException -> Lec
            java.lang.String r2 = r2.toString()     // Catch: java.io.IOException -> Le7 org.xmlpull.v1.XmlPullParserException -> Lec
            android.util.Log.e(r3, r2)     // Catch: java.io.IOException -> Le7 org.xmlpull.v1.XmlPullParserException -> Lec
            java.lang.String r2 = androidx.constraintlayout.motion.widget.ViewTransition.TAG     // Catch: java.io.IOException -> Le7 org.xmlpull.v1.XmlPullParserException -> Lec
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Le7 org.xmlpull.v1.XmlPullParserException -> Lec
            r3.<init>()     // Catch: java.io.IOException -> Le7 org.xmlpull.v1.XmlPullParserException -> Lec
            java.lang.String r4 = ".xml:"
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.io.IOException -> Le7 org.xmlpull.v1.XmlPullParserException -> Lec
            int r4 = r11.getLineNumber()     // Catch: java.io.IOException -> Le7 org.xmlpull.v1.XmlPullParserException -> Lec
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.io.IOException -> Le7 org.xmlpull.v1.XmlPullParserException -> Lec
            java.lang.String r3 = r3.toString()     // Catch: java.io.IOException -> Le7 org.xmlpull.v1.XmlPullParserException -> Lec
            android.util.Log.e(r2, r3)     // Catch: java.io.IOException -> Le7 org.xmlpull.v1.XmlPullParserException -> Lec
            goto Le1
        Lc7:
            androidx.constraintlayout.widget.ConstraintSet$Constraint r2 = r9.mConstraintDelta     // Catch: java.io.IOException -> Le7 org.xmlpull.v1.XmlPullParserException -> Lec
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r2 = r2.mCustomConstraints     // Catch: java.io.IOException -> Le7 org.xmlpull.v1.XmlPullParserException -> Lec
            androidx.constraintlayout.widget.ConstraintAttribute.parse(r10, r11, r2)     // Catch: java.io.IOException -> Le7 org.xmlpull.v1.XmlPullParserException -> Lec
            goto Le1
        Lcf:
            androidx.constraintlayout.widget.ConstraintSet$Constraint r2 = androidx.constraintlayout.widget.ConstraintSet.buildDelta(r10, r11)     // Catch: java.io.IOException -> Le7 org.xmlpull.v1.XmlPullParserException -> Lec
            r9.mConstraintDelta = r2     // Catch: java.io.IOException -> Le7 org.xmlpull.v1.XmlPullParserException -> Lec
            goto Le1
        Ld6:
            androidx.constraintlayout.motion.widget.KeyFrames r2 = new androidx.constraintlayout.motion.widget.KeyFrames     // Catch: java.io.IOException -> Le7 org.xmlpull.v1.XmlPullParserException -> Lec
            r2.<init>(r10, r11)     // Catch: java.io.IOException -> Le7 org.xmlpull.v1.XmlPullParserException -> Lec
            r9.mKeyFrames = r2     // Catch: java.io.IOException -> Le7 org.xmlpull.v1.XmlPullParserException -> Lec
            goto Le1
        Lde:
            r9.parseViewTransitionTags(r10, r11)     // Catch: java.io.IOException -> Le7 org.xmlpull.v1.XmlPullParserException -> Lec
        Le1:
            int r2 = r11.next()     // Catch: java.io.IOException -> Le7 org.xmlpull.v1.XmlPullParserException -> Lec
            goto L2a
        Le7:
            r10 = move-exception
            r10.printStackTrace()
            goto Lf0
        Lec:
            r10 = move-exception
            r10.printStackTrace()
        Lf0:
            return
    }

    private void parseViewTransitionTags(android.content.Context r9, org.xmlpull.v1.XmlPullParser r10) {
            r8 = this;
            android.util.AttributeSet r10 = android.util.Xml.asAttributeSet(r10)
            int[] r0 = androidx.constraintlayout.widget.C0156R.styleable.ViewTransition
            android.content.res.TypedArray r9 = r9.obtainStyledAttributes(r10, r0)
            int r10 = r9.getIndexCount()
            r0 = 0
        Lf:
            if (r0 >= r10) goto L141
            int r1 = r9.getIndex(r0)
            int r2 = androidx.constraintlayout.widget.C0156R.styleable.ViewTransition_android_id
            if (r1 != r2) goto L23
            int r2 = r8.mId
            int r1 = r9.getResourceId(r1, r2)
            r8.mId = r1
            goto L13d
        L23:
            int r2 = androidx.constraintlayout.widget.C0156R.styleable.ViewTransition_motionTarget
            r3 = 3
            r4 = -1
            if (r1 != r2) goto L59
            boolean r2 = androidx.constraintlayout.motion.widget.MotionLayout.IS_IN_EDIT_MODE
            if (r2 == 0) goto L3f
            int r2 = r8.mTargetId
            int r2 = r9.getResourceId(r1, r2)
            r8.mTargetId = r2
            if (r2 != r4) goto L13d
            java.lang.String r1 = r9.getString(r1)
            r8.mTargetString = r1
            goto L13d
        L3f:
            android.util.TypedValue r2 = r9.peekValue(r1)
            int r2 = r2.type
            if (r2 != r3) goto L4f
            java.lang.String r1 = r9.getString(r1)
            r8.mTargetString = r1
            goto L13d
        L4f:
            int r2 = r8.mTargetId
            int r1 = r9.getResourceId(r1, r2)
            r8.mTargetId = r1
            goto L13d
        L59:
            int r2 = androidx.constraintlayout.widget.C0156R.styleable.ViewTransition_onStateTransition
            if (r1 != r2) goto L67
            int r2 = r8.mOnStateTransition
            int r1 = r9.getInt(r1, r2)
            r8.mOnStateTransition = r1
            goto L13d
        L67:
            int r2 = androidx.constraintlayout.widget.C0156R.styleable.ViewTransition_transitionDisable
            if (r1 != r2) goto L75
            boolean r2 = r8.mDisabled
            boolean r1 = r9.getBoolean(r1, r2)
            r8.mDisabled = r1
            goto L13d
        L75:
            int r2 = androidx.constraintlayout.widget.C0156R.styleable.ViewTransition_pathMotionArc
            if (r1 != r2) goto L83
            int r2 = r8.mPathMotionArc
            int r1 = r9.getInt(r1, r2)
            r8.mPathMotionArc = r1
            goto L13d
        L83:
            int r2 = androidx.constraintlayout.widget.C0156R.styleable.ViewTransition_duration
            if (r1 != r2) goto L91
            int r2 = r8.mDuration
            int r1 = r9.getInt(r1, r2)
            r8.mDuration = r1
            goto L13d
        L91:
            int r2 = androidx.constraintlayout.widget.C0156R.styleable.ViewTransition_upDuration
            if (r1 != r2) goto L9f
            int r2 = r8.mUpDuration
            int r1 = r9.getInt(r1, r2)
            r8.mUpDuration = r1
            goto L13d
        L9f:
            int r2 = androidx.constraintlayout.widget.C0156R.styleable.ViewTransition_viewTransitionMode
            if (r1 != r2) goto Lad
            int r2 = r8.mViewTransitionMode
            int r1 = r9.getInt(r1, r2)
            r8.mViewTransitionMode = r1
            goto L13d
        Lad:
            int r2 = androidx.constraintlayout.widget.C0156R.styleable.ViewTransition_motionInterpolator
            if (r1 != r2) goto Lf0
            android.util.TypedValue r2 = r9.peekValue(r1)
            int r5 = r2.type
            r6 = -2
            r7 = 1
            if (r5 != r7) goto Lc7
            int r1 = r9.getResourceId(r1, r4)
            r8.mDefaultInterpolatorID = r1
            if (r1 == r4) goto L13d
            r8.mDefaultInterpolator = r6
            goto L13d
        Lc7:
            int r2 = r2.type
            if (r2 != r3) goto Le7
            java.lang.String r2 = r9.getString(r1)
            r8.mDefaultInterpolatorString = r2
            if (r2 == 0) goto Le4
            java.lang.String r3 = "/"
            int r2 = r2.indexOf(r3)
            if (r2 <= 0) goto Le4
            int r1 = r9.getResourceId(r1, r4)
            r8.mDefaultInterpolatorID = r1
            r8.mDefaultInterpolator = r6
            goto L13d
        Le4:
            r8.mDefaultInterpolator = r4
            goto L13d
        Le7:
            int r2 = r8.mDefaultInterpolator
            int r1 = r9.getInteger(r1, r2)
            r8.mDefaultInterpolator = r1
            goto L13d
        Lf0:
            int r2 = androidx.constraintlayout.widget.C0156R.styleable.ViewTransition_setsTag
            if (r1 != r2) goto Lfd
            int r2 = r8.mSetsTag
            int r1 = r9.getResourceId(r1, r2)
            r8.mSetsTag = r1
            goto L13d
        Lfd:
            int r2 = androidx.constraintlayout.widget.C0156R.styleable.ViewTransition_clearsTag
            if (r1 != r2) goto L10a
            int r2 = r8.mClearsTag
            int r1 = r9.getResourceId(r1, r2)
            r8.mClearsTag = r1
            goto L13d
        L10a:
            int r2 = androidx.constraintlayout.widget.C0156R.styleable.ViewTransition_ifTagSet
            if (r1 != r2) goto L117
            int r2 = r8.mIfTagSet
            int r1 = r9.getResourceId(r1, r2)
            r8.mIfTagSet = r1
            goto L13d
        L117:
            int r2 = androidx.constraintlayout.widget.C0156R.styleable.ViewTransition_ifTagNotSet
            if (r1 != r2) goto L124
            int r2 = r8.mIfTagNotSet
            int r1 = r9.getResourceId(r1, r2)
            r8.mIfTagNotSet = r1
            goto L13d
        L124:
            int r2 = androidx.constraintlayout.widget.C0156R.styleable.ViewTransition_SharedValueId
            if (r1 != r2) goto L131
            int r2 = r8.mSharedValueID
            int r1 = r9.getResourceId(r1, r2)
            r8.mSharedValueID = r1
            goto L13d
        L131:
            int r2 = androidx.constraintlayout.widget.C0156R.styleable.ViewTransition_SharedValue
            if (r1 != r2) goto L13d
            int r2 = r8.mSharedValueTarget
            int r1 = r9.getInteger(r1, r2)
            r8.mSharedValueTarget = r1
        L13d:
            int r0 = r0 + 1
            goto Lf
        L141:
            r9.recycle()
            return
    }

    private void updateTransition(androidx.constraintlayout.motion.widget.MotionScene.Transition r5, android.view.View r6) {
            r4 = this;
            int r0 = r4.mDuration
            r1 = -1
            if (r0 == r1) goto L8
            r5.setDuration(r0)
        L8:
            int r0 = r4.mPathMotionArc
            r5.setPathMotionArc(r0)
            int r0 = r4.mDefaultInterpolator
            java.lang.String r2 = r4.mDefaultInterpolatorString
            int r3 = r4.mDefaultInterpolatorID
            r5.setInterpolatorInfo(r0, r2, r3)
            int r6 = r6.getId()
            androidx.constraintlayout.motion.widget.KeyFrames r0 = r4.mKeyFrames
            if (r0 == 0) goto L46
            java.util.ArrayList r0 = r0.getKeyFramesForView(r1)
            androidx.constraintlayout.motion.widget.KeyFrames r1 = new androidx.constraintlayout.motion.widget.KeyFrames
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L2b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L43
            java.lang.Object r2 = r0.next()
            androidx.constraintlayout.motion.widget.Key r2 = (androidx.constraintlayout.motion.widget.Key) r2
            androidx.constraintlayout.motion.widget.Key r2 = r2.clone()
            androidx.constraintlayout.motion.widget.Key r2 = r2.setViewId(r6)
            r1.addKey(r2)
            goto L2b
        L43:
            r5.addKeyFrame(r1)
        L46:
            return
    }

    void applyIndependentTransition(androidx.constraintlayout.motion.widget.ViewTransitionController r10, androidx.constraintlayout.motion.widget.MotionLayout r11, android.view.View r12) {
            r9 = this;
            androidx.constraintlayout.motion.widget.MotionController r6 = new androidx.constraintlayout.motion.widget.MotionController
            r6.<init>(r12)
            r6.setBothStates(r12)
            androidx.constraintlayout.motion.widget.KeyFrames r12 = r9.mKeyFrames
            r12.addAllFrames(r6)
            int r1 = r11.getWidth()
            int r2 = r11.getHeight()
            int r12 = r9.mDuration
            float r3 = (float) r12
            long r4 = java.lang.System.nanoTime()
            r0 = r6
            r0.setup(r1, r2, r3, r4)
            androidx.constraintlayout.motion.widget.ViewTransition$Animate r0 = new androidx.constraintlayout.motion.widget.ViewTransition$Animate
            int r3 = r9.mDuration
            int r4 = r9.mUpDuration
            int r5 = r9.mOnStateTransition
            android.content.Context r11 = r11.getContext()
            android.view.animation.Interpolator r11 = r9.getInterpolator(r11)
            int r7 = r9.mSetsTag
            int r8 = r9.mClearsTag
            r1 = r10
            r2 = r6
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    void applyTransition(androidx.constraintlayout.motion.widget.ViewTransitionController r8, androidx.constraintlayout.motion.widget.MotionLayout r9, int r10, androidx.constraintlayout.widget.ConstraintSet r11, android.view.View... r12) {
            r7 = this;
            boolean r0 = r7.mDisabled
            if (r0 == 0) goto L5
            return
        L5:
            int r0 = r7.mViewTransitionMode
            r1 = 2
            r2 = 0
            if (r0 != r1) goto L11
            r10 = r12[r2]
            r7.applyIndependentTransition(r8, r9, r10)
            return
        L11:
            r8 = 1
            if (r0 != r8) goto L49
            int[] r8 = r9.getConstraintSetIds()
            r0 = r2
        L19:
            int r1 = r8.length
            if (r0 >= r1) goto L49
            r1 = r8[r0]
            if (r1 != r10) goto L21
            goto L46
        L21:
            androidx.constraintlayout.widget.ConstraintSet r1 = r9.getConstraintSet(r1)
            int r3 = r12.length
            r4 = r2
        L27:
            if (r4 >= r3) goto L46
            r5 = r12[r4]
            int r5 = r5.getId()
            androidx.constraintlayout.widget.ConstraintSet$Constraint r5 = r1.getConstraint(r5)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r6 = r7.mConstraintDelta
            if (r6 == 0) goto L43
            r6.applyDelta(r5)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r5 = r5.mCustomConstraints
            androidx.constraintlayout.widget.ConstraintSet$Constraint r6 = r7.mConstraintDelta
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r6 = r6.mCustomConstraints
            r5.putAll(r6)
        L43:
            int r4 = r4 + 1
            goto L27
        L46:
            int r0 = r0 + 1
            goto L19
        L49:
            androidx.constraintlayout.widget.ConstraintSet r8 = new androidx.constraintlayout.widget.ConstraintSet
            r8.<init>()
            r8.clone(r11)
            int r0 = r12.length
            r1 = r2
        L53:
            if (r1 >= r0) goto L72
            r3 = r12[r1]
            int r3 = r3.getId()
            androidx.constraintlayout.widget.ConstraintSet$Constraint r3 = r8.getConstraint(r3)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r4 = r7.mConstraintDelta
            if (r4 == 0) goto L6f
            r4.applyDelta(r3)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r3 = r3.mCustomConstraints
            androidx.constraintlayout.widget.ConstraintSet$Constraint r4 = r7.mConstraintDelta
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r4 = r4.mCustomConstraints
            r3.putAll(r4)
        L6f:
            int r1 = r1 + 1
            goto L53
        L72:
            r9.updateState(r10, r8)
            int r8 = androidx.constraintlayout.widget.C0156R.id.view_transition
            r9.updateState(r8, r11)
            int r8 = androidx.constraintlayout.widget.C0156R.id.view_transition
            r11 = -1
            r9.setState(r8, r11, r11)
            androidx.constraintlayout.motion.widget.MotionScene$Transition r8 = new androidx.constraintlayout.motion.widget.MotionScene$Transition
            androidx.constraintlayout.motion.widget.MotionScene r0 = r9.mScene
            int r1 = androidx.constraintlayout.widget.C0156R.id.view_transition
            r8.<init>(r11, r0, r1, r10)
            int r10 = r12.length
        L8a:
            if (r2 >= r10) goto L94
            r11 = r12[r2]
            r7.updateTransition(r8, r11)
            int r2 = r2 + 1
            goto L8a
        L94:
            r9.setTransition(r8)
            androidx.constraintlayout.motion.widget.ViewTransition$$ExternalSyntheticLambda0 r8 = new androidx.constraintlayout.motion.widget.ViewTransition$$ExternalSyntheticLambda0
            r8.<init>(r7, r12)
            r9.transitionToEnd(r8)
            return
    }

    boolean checkTags(android.view.View r6) {
            r5 = this;
            int r0 = r5.mIfTagSet
            r1 = 0
            r2 = 1
            r3 = -1
            if (r0 != r3) goto L9
        L7:
            r0 = r2
            goto L11
        L9:
            java.lang.Object r0 = r6.getTag(r0)
            if (r0 == 0) goto L10
            goto L7
        L10:
            r0 = r1
        L11:
            int r4 = r5.mIfTagNotSet
            if (r4 != r3) goto L17
        L15:
            r6 = r2
            goto L1f
        L17:
            java.lang.Object r6 = r6.getTag(r4)
            if (r6 != 0) goto L1e
            goto L15
        L1e:
            r6 = r1
        L1f:
            if (r0 == 0) goto L24
            if (r6 == 0) goto L24
            r1 = r2
        L24:
            return r1
    }

    int getId() {
            r1 = this;
            int r0 = r1.mId
            return r0
    }

    android.view.animation.Interpolator getInterpolator(android.content.Context r3) {
            r2 = this;
            int r0 = r2.mDefaultInterpolator
            r1 = -2
            if (r0 == r1) goto L4b
            r3 = -1
            if (r0 == r3) goto L3f
            if (r0 == 0) goto L39
            r3 = 1
            if (r0 == r3) goto L33
            r3 = 2
            if (r0 == r3) goto L2d
            r3 = 4
            if (r0 == r3) goto L27
            r3 = 5
            if (r0 == r3) goto L21
            r3 = 6
            if (r0 == r3) goto L1b
            r3 = 0
            return r3
        L1b:
            android.view.animation.AnticipateInterpolator r3 = new android.view.animation.AnticipateInterpolator
            r3.<init>()
            return r3
        L21:
            android.view.animation.OvershootInterpolator r3 = new android.view.animation.OvershootInterpolator
            r3.<init>()
            return r3
        L27:
            android.view.animation.BounceInterpolator r3 = new android.view.animation.BounceInterpolator
            r3.<init>()
            return r3
        L2d:
            android.view.animation.DecelerateInterpolator r3 = new android.view.animation.DecelerateInterpolator
            r3.<init>()
            return r3
        L33:
            android.view.animation.AccelerateInterpolator r3 = new android.view.animation.AccelerateInterpolator
            r3.<init>()
            return r3
        L39:
            android.view.animation.AccelerateDecelerateInterpolator r3 = new android.view.animation.AccelerateDecelerateInterpolator
            r3.<init>()
            return r3
        L3f:
            java.lang.String r3 = r2.mDefaultInterpolatorString
            androidx.constraintlayout.core.motion.utils.Easing r3 = androidx.constraintlayout.core.motion.utils.Easing.getInterpolator(r3)
            androidx.constraintlayout.motion.widget.ViewTransition$1 r0 = new androidx.constraintlayout.motion.widget.ViewTransition$1
            r0.<init>(r2, r3)
            return r0
        L4b:
            int r0 = r2.mDefaultInterpolatorID
            android.view.animation.Interpolator r3 = android.view.animation.AnimationUtils.loadInterpolator(r3, r0)
            return r3
    }

    public int getSharedValue() {
            r1 = this;
            int r0 = r1.mSharedValueTarget
            return r0
    }

    public int getSharedValueCurrent() {
            r1 = this;
            int r0 = r1.mSharedValueCurrent
            return r0
    }

    public int getSharedValueID() {
            r1 = this;
            int r0 = r1.mSharedValueID
            return r0
    }

    public int getStateTransition() {
            r1 = this;
            int r0 = r1.mOnStateTransition
            return r0
    }

    boolean isEnabled() {
            r1 = this;
            boolean r0 = r1.mDisabled
            r0 = r0 ^ 1
            return r0
    }

    /* renamed from: lambda$applyTransition$0$androidx-constraintlayout-motion-widget-ViewTransition */
    /* synthetic */ void m6x14d7500(android.view.View[] r9) {
            r8 = this;
            int r0 = r8.mSetsTag
            r1 = 0
            r2 = -1
            if (r0 == r2) goto L1c
            int r0 = r9.length
            r3 = r1
        L8:
            if (r3 >= r0) goto L1c
            r4 = r9[r3]
            int r5 = r8.mSetsTag
            long r6 = java.lang.System.nanoTime()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r4.setTag(r5, r6)
            int r3 = r3 + 1
            goto L8
        L1c:
            int r0 = r8.mClearsTag
            if (r0 == r2) goto L2e
            int r0 = r9.length
        L21:
            if (r1 >= r0) goto L2e
            r2 = r9[r1]
            int r3 = r8.mClearsTag
            r4 = 0
            r2.setTag(r3, r4)
            int r1 = r1 + 1
            goto L21
        L2e:
            return
    }

    boolean matchesView(android.view.View r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            int r1 = r4.mTargetId
            r2 = -1
            if (r1 != r2) goto Le
            java.lang.String r1 = r4.mTargetString
            if (r1 != 0) goto Le
            return r0
        Le:
            boolean r1 = r4.checkTags(r5)
            if (r1 != 0) goto L15
            return r0
        L15:
            int r1 = r5.getId()
            int r2 = r4.mTargetId
            r3 = 1
            if (r1 != r2) goto L1f
            return r3
        L1f:
            java.lang.String r1 = r4.mTargetString
            if (r1 != 0) goto L24
            return r0
        L24:
            android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams
            if (r1 == 0) goto L3f
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r5 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r5
            java.lang.String r5 = r5.constraintTag
            if (r5 == 0) goto L3f
            java.lang.String r1 = r4.mTargetString
            boolean r5 = r5.matches(r1)
            if (r5 == 0) goto L3f
            return r3
        L3f:
            return r0
    }

    void setEnabled(boolean r1) {
            r0 = this;
            r1 = r1 ^ 1
            r0.mDisabled = r1
            return
    }

    void setId(int r1) {
            r0 = this;
            r0.mId = r1
            return
    }

    public void setSharedValue(int r1) {
            r0 = this;
            r0.mSharedValueTarget = r1
            return
    }

    public void setSharedValueCurrent(int r1) {
            r0 = this;
            r0.mSharedValueCurrent = r1
            return
    }

    public void setSharedValueID(int r1) {
            r0 = this;
            r0.mSharedValueID = r1
            return
    }

    public void setStateTransition(int r1) {
            r0 = this;
            r0.mOnStateTransition = r1
            return
    }

    boolean supports(int r5) {
            r4 = this;
            int r0 = r4.mOnStateTransition
            r1 = 0
            r2 = 1
            if (r0 != r2) goto La
            if (r5 != 0) goto L9
            r1 = r2
        L9:
            return r1
        La:
            r3 = 2
            if (r0 != r3) goto L11
            if (r5 != r2) goto L10
            r1 = r2
        L10:
            return r1
        L11:
            r3 = 3
            if (r0 != r3) goto L17
            if (r5 != 0) goto L17
            r1 = r2
        L17:
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ViewTransition("
            r0.<init>(r1)
            android.content.Context r1 = r3.mContext
            int r2 = r3.mId
            java.lang.String r1 = androidx.constraintlayout.motion.widget.Debug.getName(r1, r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
