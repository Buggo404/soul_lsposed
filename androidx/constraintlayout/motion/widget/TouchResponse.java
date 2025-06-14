package androidx.constraintlayout.motion.widget;

/* loaded from: classes.dex */
class TouchResponse {
    public static final int COMPLETE_MODE_CONTINUOUS_VELOCITY = 0;
    public static final int COMPLETE_MODE_SPRING = 1;
    private static final boolean DEBUG = false;
    private static final float EPSILON = 1.0E-7f;
    static final int FLAG_DISABLE_POST_SCROLL = 1;
    static final int FLAG_DISABLE_SCROLL = 2;
    static final int FLAG_SUPPORT_SCROLL_UP = 4;
    private static final int SEC_TO_MILLISECONDS = 1000;
    private static final int SIDE_BOTTOM = 3;
    private static final int SIDE_END = 6;
    private static final int SIDE_LEFT = 1;
    private static final int SIDE_MIDDLE = 4;
    private static final int SIDE_RIGHT = 2;
    private static final int SIDE_START = 5;
    private static final int SIDE_TOP = 0;
    private static final java.lang.String TAG = "TouchResponse";
    private static final float[][] TOUCH_DIRECTION = null;
    private static final int TOUCH_DOWN = 1;
    private static final int TOUCH_END = 5;
    private static final int TOUCH_LEFT = 2;
    private static final int TOUCH_RIGHT = 3;
    private static final float[][] TOUCH_SIDES = null;
    private static final int TOUCH_START = 4;
    private static final int TOUCH_UP = 0;
    private float[] mAnchorDpDt;
    private int mAutoCompleteMode;
    private float mDragScale;
    private boolean mDragStarted;
    private float mDragThreshold;
    private int mFlags;
    boolean mIsRotateMode;
    private float mLastTouchX;
    private float mLastTouchY;
    private int mLimitBoundsTo;
    private float mMaxAcceleration;
    private float mMaxVelocity;
    private final androidx.constraintlayout.motion.widget.MotionLayout mMotionLayout;
    private boolean mMoveWhenScrollAtTop;
    private int mOnTouchUp;
    float mRotateCenterX;
    float mRotateCenterY;
    private int mRotationCenterId;
    private int mSpringBoundary;
    private float mSpringDamping;
    private float mSpringMass;
    private float mSpringStiffness;
    private float mSpringStopThreshold;
    private int[] mTempLoc;
    private int mTouchAnchorId;
    private int mTouchAnchorSide;
    private float mTouchAnchorX;
    private float mTouchAnchorY;
    private float mTouchDirectionX;
    private float mTouchDirectionY;
    private int mTouchRegionId;
    private int mTouchSide;



    static {
            r0 = 7
            float[][] r0 = new float[r0][]
            r1 = 2
            float[] r2 = new float[r1]
            r2 = {x006c: FILL_ARRAY_DATA , data: [1056964608, 0} // fill-array
            r3 = 0
            r0[r3] = r2
            float[] r2 = new float[r1]
            r2 = {x0074: FILL_ARRAY_DATA , data: [0, 1056964608} // fill-array
            r4 = 1
            r0[r4] = r2
            float[] r2 = new float[r1]
            r2 = {x007c: FILL_ARRAY_DATA , data: [1065353216, 1056964608} // fill-array
            r0[r1] = r2
            float[] r2 = new float[r1]
            r2 = {x0084: FILL_ARRAY_DATA , data: [1056964608, 1065353216} // fill-array
            r5 = 3
            r0[r5] = r2
            float[] r2 = new float[r1]
            r2 = {x008c: FILL_ARRAY_DATA , data: [1056964608, 1056964608} // fill-array
            r6 = 4
            r0[r6] = r2
            float[] r2 = new float[r1]
            r2 = {x0094: FILL_ARRAY_DATA , data: [0, 1056964608} // fill-array
            r7 = 5
            r0[r7] = r2
            float[] r2 = new float[r1]
            r2 = {x009c: FILL_ARRAY_DATA , data: [1065353216, 1056964608} // fill-array
            r8 = 6
            r0[r8] = r2
            androidx.constraintlayout.motion.widget.TouchResponse.TOUCH_SIDES = r0
            float[][] r0 = new float[r8][]
            float[] r2 = new float[r1]
            r2 = {x00a4: FILL_ARRAY_DATA , data: [0, -1082130432} // fill-array
            r0[r3] = r2
            float[] r2 = new float[r1]
            r2 = {x00ac: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            r0[r4] = r2
            float[] r2 = new float[r1]
            r2 = {x00b4: FILL_ARRAY_DATA , data: [-1082130432, 0} // fill-array
            r0[r1] = r2
            float[] r2 = new float[r1]
            r2 = {x00bc: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            r0[r5] = r2
            float[] r2 = new float[r1]
            r2 = {x00c4: FILL_ARRAY_DATA , data: [-1082130432, 0} // fill-array
            r0[r6] = r2
            float[] r1 = new float[r1]
            r1 = {x00cc: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            r0[r7] = r1
            androidx.constraintlayout.motion.widget.TouchResponse.TOUCH_DIRECTION = r0
            return
    }

    TouchResponse(android.content.Context r5, androidx.constraintlayout.motion.widget.MotionLayout r6, org.xmlpull.v1.XmlPullParser r7) {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.mTouchAnchorSide = r0
            r4.mTouchSide = r0
            r4.mOnTouchUp = r0
            r1 = -1
            r4.mTouchAnchorId = r1
            r4.mTouchRegionId = r1
            r4.mLimitBoundsTo = r1
            r2 = 1056964608(0x3f000000, float:0.5)
            r4.mTouchAnchorY = r2
            r4.mTouchAnchorX = r2
            r4.mRotateCenterX = r2
            r4.mRotateCenterY = r2
            r4.mRotationCenterId = r1
            r4.mIsRotateMode = r0
            r1 = 0
            r4.mTouchDirectionX = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r4.mTouchDirectionY = r1
            r4.mDragStarted = r0
            r2 = 2
            float[] r3 = new float[r2]
            r4.mAnchorDpDt = r3
            int[] r2 = new int[r2]
            r4.mTempLoc = r2
            r2 = 1082130432(0x40800000, float:4.0)
            r4.mMaxVelocity = r2
            r2 = 1067030938(0x3f99999a, float:1.2)
            r4.mMaxAcceleration = r2
            r2 = 1
            r4.mMoveWhenScrollAtTop = r2
            r4.mDragScale = r1
            r4.mFlags = r0
            r2 = 1092616192(0x41200000, float:10.0)
            r4.mDragThreshold = r2
            r4.mSpringDamping = r2
            r4.mSpringMass = r1
            r1 = 2143289344(0x7fc00000, float:NaN)
            r4.mSpringStiffness = r1
            r4.mSpringStopThreshold = r1
            r4.mSpringBoundary = r0
            r4.mAutoCompleteMode = r0
            r4.mMotionLayout = r6
            android.util.AttributeSet r6 = android.util.Xml.asAttributeSet(r7)
            r4.fillFromAttributeList(r5, r6)
            return
    }

    public TouchResponse(androidx.constraintlayout.motion.widget.MotionLayout r6, androidx.constraintlayout.motion.widget.OnSwipe r7) {
            r5 = this;
            r5.<init>()
            r0 = 0
            r5.mTouchAnchorSide = r0
            r5.mTouchSide = r0
            r5.mOnTouchUp = r0
            r1 = -1
            r5.mTouchAnchorId = r1
            r5.mTouchRegionId = r1
            r5.mLimitBoundsTo = r1
            r2 = 1056964608(0x3f000000, float:0.5)
            r5.mTouchAnchorY = r2
            r5.mTouchAnchorX = r2
            r5.mRotateCenterX = r2
            r5.mRotateCenterY = r2
            r5.mRotationCenterId = r1
            r5.mIsRotateMode = r0
            r2 = 0
            r5.mTouchDirectionX = r2
            r2 = 1065353216(0x3f800000, float:1.0)
            r5.mTouchDirectionY = r2
            r5.mDragStarted = r0
            r3 = 2
            float[] r4 = new float[r3]
            r5.mAnchorDpDt = r4
            int[] r3 = new int[r3]
            r5.mTempLoc = r3
            r3 = 1082130432(0x40800000, float:4.0)
            r5.mMaxVelocity = r3
            r3 = 1067030938(0x3f99999a, float:1.2)
            r5.mMaxAcceleration = r3
            r3 = 1
            r5.mMoveWhenScrollAtTop = r3
            r5.mDragScale = r2
            r5.mFlags = r0
            r4 = 1092616192(0x41200000, float:10.0)
            r5.mDragThreshold = r4
            r5.mSpringDamping = r4
            r5.mSpringMass = r2
            r2 = 2143289344(0x7fc00000, float:NaN)
            r5.mSpringStiffness = r2
            r5.mSpringStopThreshold = r2
            r5.mSpringBoundary = r0
            r5.mAutoCompleteMode = r0
            r5.mMotionLayout = r6
            int r6 = r7.getTouchAnchorId()
            r5.mTouchAnchorId = r6
            int r6 = r7.getTouchAnchorSide()
            r5.mTouchAnchorSide = r6
            if (r6 == r1) goto L6f
            float[][] r1 = androidx.constraintlayout.motion.widget.TouchResponse.TOUCH_SIDES
            r6 = r1[r6]
            r1 = r6[r0]
            r5.mTouchAnchorX = r1
            r6 = r6[r3]
            r5.mTouchAnchorY = r6
        L6f:
            int r6 = r7.getDragDirection()
            r5.mTouchSide = r6
            float[][] r1 = androidx.constraintlayout.motion.widget.TouchResponse.TOUCH_DIRECTION
            int r4 = r1.length
            if (r6 >= r4) goto L85
            r6 = r1[r6]
            r0 = r6[r0]
            r5.mTouchDirectionX = r0
            r6 = r6[r3]
            r5.mTouchDirectionY = r6
            goto L8b
        L85:
            r5.mTouchDirectionY = r2
            r5.mTouchDirectionX = r2
            r5.mIsRotateMode = r3
        L8b:
            float r6 = r7.getMaxVelocity()
            r5.mMaxVelocity = r6
            float r6 = r7.getMaxAcceleration()
            r5.mMaxAcceleration = r6
            boolean r6 = r7.getMoveWhenScrollAtTop()
            r5.mMoveWhenScrollAtTop = r6
            float r6 = r7.getDragScale()
            r5.mDragScale = r6
            float r6 = r7.getDragThreshold()
            r5.mDragThreshold = r6
            int r6 = r7.getTouchRegionId()
            r5.mTouchRegionId = r6
            int r6 = r7.getOnTouchUp()
            r5.mOnTouchUp = r6
            int r6 = r7.getNestedScrollFlags()
            r5.mFlags = r6
            int r6 = r7.getLimitBoundsTo()
            r5.mLimitBoundsTo = r6
            int r6 = r7.getRotationCenterId()
            r5.mRotationCenterId = r6
            int r6 = r7.getSpringBoundary()
            r5.mSpringBoundary = r6
            float r6 = r7.getSpringDamping()
            r5.mSpringDamping = r6
            float r6 = r7.getSpringMass()
            r5.mSpringMass = r6
            float r6 = r7.getSpringStiffness()
            r5.mSpringStiffness = r6
            float r6 = r7.getSpringStopThreshold()
            r5.mSpringStopThreshold = r6
            int r6 = r7.getAutoCompleteMode()
            r5.mAutoCompleteMode = r6
            return
    }

    private void fill(android.content.res.TypedArray r8) {
            r7 = this;
            int r0 = r8.getIndexCount()
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r0) goto L132
            int r3 = r8.getIndex(r2)
            int r4 = androidx.constraintlayout.widget.C0156R.styleable.OnSwipe_touchAnchorId
            if (r3 != r4) goto L1a
            int r4 = r7.mTouchAnchorId
            int r3 = r8.getResourceId(r3, r4)
            r7.mTouchAnchorId = r3
            goto L12e
        L1a:
            int r4 = androidx.constraintlayout.widget.C0156R.styleable.OnSwipe_touchAnchorSide
            r5 = 1
            if (r3 != r4) goto L35
            int r4 = r7.mTouchAnchorSide
            int r3 = r8.getInt(r3, r4)
            r7.mTouchAnchorSide = r3
            float[][] r4 = androidx.constraintlayout.motion.widget.TouchResponse.TOUCH_SIDES
            r3 = r4[r3]
            r4 = r3[r1]
            r7.mTouchAnchorX = r4
            r3 = r3[r5]
            r7.mTouchAnchorY = r3
            goto L12e
        L35:
            int r4 = androidx.constraintlayout.widget.C0156R.styleable.OnSwipe_dragDirection
            if (r3 != r4) goto L5c
            int r4 = r7.mTouchSide
            int r3 = r8.getInt(r3, r4)
            r7.mTouchSide = r3
            float[][] r4 = androidx.constraintlayout.motion.widget.TouchResponse.TOUCH_DIRECTION
            int r6 = r4.length
            if (r3 >= r6) goto L52
            r3 = r4[r3]
            r4 = r3[r1]
            r7.mTouchDirectionX = r4
            r3 = r3[r5]
            r7.mTouchDirectionY = r3
            goto L12e
        L52:
            r3 = 2143289344(0x7fc00000, float:NaN)
            r7.mTouchDirectionY = r3
            r7.mTouchDirectionX = r3
            r7.mIsRotateMode = r5
            goto L12e
        L5c:
            int r4 = androidx.constraintlayout.widget.C0156R.styleable.OnSwipe_maxVelocity
            if (r3 != r4) goto L6a
            float r4 = r7.mMaxVelocity
            float r3 = r8.getFloat(r3, r4)
            r7.mMaxVelocity = r3
            goto L12e
        L6a:
            int r4 = androidx.constraintlayout.widget.C0156R.styleable.OnSwipe_maxAcceleration
            if (r3 != r4) goto L78
            float r4 = r7.mMaxAcceleration
            float r3 = r8.getFloat(r3, r4)
            r7.mMaxAcceleration = r3
            goto L12e
        L78:
            int r4 = androidx.constraintlayout.widget.C0156R.styleable.OnSwipe_moveWhenScrollAtTop
            if (r3 != r4) goto L86
            boolean r4 = r7.mMoveWhenScrollAtTop
            boolean r3 = r8.getBoolean(r3, r4)
            r7.mMoveWhenScrollAtTop = r3
            goto L12e
        L86:
            int r4 = androidx.constraintlayout.widget.C0156R.styleable.OnSwipe_dragScale
            if (r3 != r4) goto L94
            float r4 = r7.mDragScale
            float r3 = r8.getFloat(r3, r4)
            r7.mDragScale = r3
            goto L12e
        L94:
            int r4 = androidx.constraintlayout.widget.C0156R.styleable.OnSwipe_dragThreshold
            if (r3 != r4) goto La2
            float r4 = r7.mDragThreshold
            float r3 = r8.getFloat(r3, r4)
            r7.mDragThreshold = r3
            goto L12e
        La2:
            int r4 = androidx.constraintlayout.widget.C0156R.styleable.OnSwipe_touchRegionId
            if (r3 != r4) goto Lb0
            int r4 = r7.mTouchRegionId
            int r3 = r8.getResourceId(r3, r4)
            r7.mTouchRegionId = r3
            goto L12e
        Lb0:
            int r4 = androidx.constraintlayout.widget.C0156R.styleable.OnSwipe_onTouchUp
            if (r3 != r4) goto Lbe
            int r4 = r7.mOnTouchUp
            int r3 = r8.getInt(r3, r4)
            r7.mOnTouchUp = r3
            goto L12e
        Lbe:
            int r4 = androidx.constraintlayout.widget.C0156R.styleable.OnSwipe_nestedScrollFlags
            if (r3 != r4) goto Lc9
            int r3 = r8.getInteger(r3, r1)
            r7.mFlags = r3
            goto L12e
        Lc9:
            int r4 = androidx.constraintlayout.widget.C0156R.styleable.OnSwipe_limitBoundsTo
            if (r3 != r4) goto Ld4
            int r3 = r8.getResourceId(r3, r1)
            r7.mLimitBoundsTo = r3
            goto L12e
        Ld4:
            int r4 = androidx.constraintlayout.widget.C0156R.styleable.OnSwipe_rotationCenterId
            if (r3 != r4) goto Le1
            int r4 = r7.mRotationCenterId
            int r3 = r8.getResourceId(r3, r4)
            r7.mRotationCenterId = r3
            goto L12e
        Le1:
            int r4 = androidx.constraintlayout.widget.C0156R.styleable.OnSwipe_springDamping
            if (r3 != r4) goto Lee
            float r4 = r7.mSpringDamping
            float r3 = r8.getFloat(r3, r4)
            r7.mSpringDamping = r3
            goto L12e
        Lee:
            int r4 = androidx.constraintlayout.widget.C0156R.styleable.OnSwipe_springMass
            if (r3 != r4) goto Lfb
            float r4 = r7.mSpringMass
            float r3 = r8.getFloat(r3, r4)
            r7.mSpringMass = r3
            goto L12e
        Lfb:
            int r4 = androidx.constraintlayout.widget.C0156R.styleable.OnSwipe_springStiffness
            if (r3 != r4) goto L108
            float r4 = r7.mSpringStiffness
            float r3 = r8.getFloat(r3, r4)
            r7.mSpringStiffness = r3
            goto L12e
        L108:
            int r4 = androidx.constraintlayout.widget.C0156R.styleable.OnSwipe_springStopThreshold
            if (r3 != r4) goto L115
            float r4 = r7.mSpringStopThreshold
            float r3 = r8.getFloat(r3, r4)
            r7.mSpringStopThreshold = r3
            goto L12e
        L115:
            int r4 = androidx.constraintlayout.widget.C0156R.styleable.OnSwipe_springBoundary
            if (r3 != r4) goto L122
            int r4 = r7.mSpringBoundary
            int r3 = r8.getInt(r3, r4)
            r7.mSpringBoundary = r3
            goto L12e
        L122:
            int r4 = androidx.constraintlayout.widget.C0156R.styleable.OnSwipe_autoCompleteMode
            if (r3 != r4) goto L12e
            int r4 = r7.mAutoCompleteMode
            int r3 = r8.getInt(r3, r4)
            r7.mAutoCompleteMode = r3
        L12e:
            int r2 = r2 + 1
            goto L6
        L132:
            return
    }

    private void fillFromAttributeList(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int[] r0 = androidx.constraintlayout.widget.C0156R.styleable.OnSwipe
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
            r1.fill(r2)
            r2.recycle()
            return
    }

    float dot(float r2, float r3) {
            r1 = this;
            float r0 = r1.mTouchDirectionX
            float r2 = r2 * r0
            float r0 = r1.mTouchDirectionY
            float r3 = r3 * r0
            float r2 = r2 + r3
            return r2
    }

    public int getAnchorId() {
            r1 = this;
            int r0 = r1.mTouchAnchorId
            return r0
    }

    public int getAutoCompleteMode() {
            r1 = this;
            int r0 = r1.mAutoCompleteMode
            return r0
    }

    public int getFlags() {
            r1 = this;
            int r0 = r1.mFlags
            return r0
    }

    android.graphics.RectF getLimitBoundsTo(android.view.ViewGroup r4, android.graphics.RectF r5) {
            r3 = this;
            int r0 = r3.mLimitBoundsTo
            r1 = -1
            r2 = 0
            if (r0 != r1) goto L7
            return r2
        L7:
            android.view.View r4 = r4.findViewById(r0)
            if (r4 != 0) goto Le
            return r2
        Le:
            int r0 = r4.getLeft()
            float r0 = (float) r0
            int r1 = r4.getTop()
            float r1 = (float) r1
            int r2 = r4.getRight()
            float r2 = (float) r2
            int r4 = r4.getBottom()
            float r4 = (float) r4
            r5.set(r0, r1, r2, r4)
            return r5
    }

    int getLimitBoundsToId() {
            r1 = this;
            int r0 = r1.mLimitBoundsTo
            return r0
    }

    float getMaxAcceleration() {
            r1 = this;
            float r0 = r1.mMaxAcceleration
            return r0
    }

    public float getMaxVelocity() {
            r1 = this;
            float r0 = r1.mMaxVelocity
            return r0
    }

    boolean getMoveWhenScrollAtTop() {
            r1 = this;
            boolean r0 = r1.mMoveWhenScrollAtTop
            return r0
    }

    float getProgressDirection(float r8, float r9) {
            r7 = this;
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r7.mMotionLayout
            float r3 = r0.getProgress()
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r7.mMotionLayout
            int r2 = r7.mTouchAnchorId
            float r4 = r7.mTouchAnchorX
            float r5 = r7.mTouchAnchorY
            float[] r6 = r7.mAnchorDpDt
            r1.getAnchorDpDt(r2, r3, r4, r5, r6)
            float r0 = r7.mTouchDirectionX
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r3 = 869711765(0x33d6bf95, float:1.0E-7)
            if (r2 == 0) goto L2d
            float[] r9 = r7.mAnchorDpDt
            r2 = 0
            r4 = r9[r2]
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 != 0) goto L28
            r9[r2] = r3
        L28:
            float r8 = r8 * r0
            r9 = r9[r2]
            float r8 = r8 / r9
            goto L3f
        L2d:
            float[] r8 = r7.mAnchorDpDt
            r0 = 1
            r2 = r8[r0]
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 != 0) goto L38
            r8[r0] = r3
        L38:
            float r1 = r7.mTouchDirectionY
            float r9 = r9 * r1
            r8 = r8[r0]
            float r8 = r9 / r8
        L3f:
            return r8
    }

    public int getSpringBoundary() {
            r1 = this;
            int r0 = r1.mSpringBoundary
            return r0
    }

    public float getSpringDamping() {
            r1 = this;
            float r0 = r1.mSpringDamping
            return r0
    }

    public float getSpringMass() {
            r1 = this;
            float r0 = r1.mSpringMass
            return r0
    }

    public float getSpringStiffness() {
            r1 = this;
            float r0 = r1.mSpringStiffness
            return r0
    }

    public float getSpringStopThreshold() {
            r1 = this;
            float r0 = r1.mSpringStopThreshold
            return r0
    }

    android.graphics.RectF getTouchRegion(android.view.ViewGroup r4, android.graphics.RectF r5) {
            r3 = this;
            int r0 = r3.mTouchRegionId
            r1 = -1
            r2 = 0
            if (r0 != r1) goto L7
            return r2
        L7:
            android.view.View r4 = r4.findViewById(r0)
            if (r4 != 0) goto Le
            return r2
        Le:
            int r0 = r4.getLeft()
            float r0 = (float) r0
            int r1 = r4.getTop()
            float r1 = (float) r1
            int r2 = r4.getRight()
            float r2 = (float) r2
            int r4 = r4.getBottom()
            float r4 = (float) r4
            r5.set(r0, r1, r2, r4)
            return r5
    }

    int getTouchRegionId() {
            r1 = this;
            int r0 = r1.mTouchRegionId
            return r0
    }

    boolean isDragStarted() {
            r1 = this;
            boolean r0 = r1.mDragStarted
            return r0
    }

    void processTouchEvent(android.view.MotionEvent r21, androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker r22, int r23, androidx.constraintlayout.motion.widget.MotionScene r24) {
            r20 = this;
            r0 = r20
            r1 = r22
            boolean r2 = r0.mIsRotateMode
            if (r2 == 0) goto Lc
            r20.processTouchRotateEvent(r21, r22, r23, r24)
            return
        Lc:
            r2 = r21
            r1.addMovement(r2)
            int r3 = r21.getAction()
            r4 = 0
            if (r3 == 0) goto L1fd
            r6 = 6
            r7 = -1
            r9 = 1065353216(0x3f800000, float:1.0)
            r10 = 1
            r11 = 0
            if (r3 == r10) goto L13b
            r12 = 2
            if (r3 == r12) goto L25
            goto L20b
        L25:
            float r3 = r21.getRawY()
            float r12 = r0.mLastTouchY
            float r3 = r3 - r12
            float r12 = r21.getRawX()
            float r13 = r0.mLastTouchX
            float r12 = r12 - r13
            float r13 = r0.mTouchDirectionX
            float r13 = r13 * r12
            float r14 = r0.mTouchDirectionY
            float r14 = r14 * r3
            float r13 = r13 + r14
            float r13 = java.lang.Math.abs(r13)
            float r14 = r0.mDragThreshold
            int r13 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r13 > 0) goto L48
            boolean r13 = r0.mDragStarted
            if (r13 == 0) goto L20b
        L48:
            androidx.constraintlayout.motion.widget.MotionLayout r13 = r0.mMotionLayout
            float r13 = r13.getProgress()
            boolean r14 = r0.mDragStarted
            if (r14 != 0) goto L59
            r0.mDragStarted = r10
            androidx.constraintlayout.motion.widget.MotionLayout r14 = r0.mMotionLayout
            r14.setProgress(r13)
        L59:
            int r15 = r0.mTouchAnchorId
            if (r15 == r7) goto L71
            androidx.constraintlayout.motion.widget.MotionLayout r14 = r0.mMotionLayout
            float r7 = r0.mTouchAnchorX
            float r8 = r0.mTouchAnchorY
            float[] r5 = r0.mAnchorDpDt
            r16 = r13
            r17 = r7
            r18 = r8
            r19 = r5
            r14.getAnchorDpDt(r15, r16, r17, r18, r19)
            goto L8e
        L71:
            androidx.constraintlayout.motion.widget.MotionLayout r5 = r0.mMotionLayout
            int r5 = r5.getWidth()
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r0.mMotionLayout
            int r7 = r7.getHeight()
            int r5 = java.lang.Math.min(r5, r7)
            float r5 = (float) r5
            float[] r7 = r0.mAnchorDpDt
            float r8 = r0.mTouchDirectionY
            float r8 = r8 * r5
            r7[r10] = r8
            float r8 = r0.mTouchDirectionX
            float r5 = r5 * r8
            r7[r4] = r5
        L8e:
            float r5 = r0.mTouchDirectionX
            float[] r7 = r0.mAnchorDpDt
            r8 = r7[r4]
            float r5 = r5 * r8
            float r8 = r0.mTouchDirectionY
            r7 = r7[r10]
            float r8 = r8 * r7
            float r5 = r5 + r8
            float r7 = r0.mDragScale
            float r5 = r5 * r7
            float r5 = java.lang.Math.abs(r5)
            double r7 = (double) r5
            r14 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r5 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            r7 = 1008981770(0x3c23d70a, float:0.01)
            if (r5 >= 0) goto Lb5
            float[] r5 = r0.mAnchorDpDt
            r5[r4] = r7
            r5[r10] = r7
        Lb5:
            float r5 = r0.mTouchDirectionX
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 == 0) goto Lc1
            float[] r3 = r0.mAnchorDpDt
            r3 = r3[r4]
            float r12 = r12 / r3
            goto Lc7
        Lc1:
            float[] r5 = r0.mAnchorDpDt
            r5 = r5[r10]
            float r12 = r3 / r5
        Lc7:
            float r13 = r13 + r12
            float r3 = java.lang.Math.min(r13, r9)
            float r3 = java.lang.Math.max(r3, r11)
            int r5 = r0.mOnTouchUp
            if (r5 != r6) goto Ld8
            float r3 = java.lang.Math.max(r3, r7)
        Ld8:
            int r5 = r0.mOnTouchUp
            r6 = 7
            if (r5 != r6) goto Le4
            r5 = 1065185444(0x3f7d70a4, float:0.99)
            float r3 = java.lang.Math.min(r3, r5)
        Le4:
            androidx.constraintlayout.motion.widget.MotionLayout r5 = r0.mMotionLayout
            float r5 = r5.getProgress()
            int r6 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r6 == 0) goto L129
            int r6 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r6 == 0) goto Lf6
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 != 0) goto L100
        Lf6:
            androidx.constraintlayout.motion.widget.MotionLayout r5 = r0.mMotionLayout
            if (r6 != 0) goto Lfc
            r6 = r10
            goto Lfd
        Lfc:
            r6 = r4
        Lfd:
            r5.endTrigger(r6)
        L100:
            androidx.constraintlayout.motion.widget.MotionLayout r5 = r0.mMotionLayout
            r5.setProgress(r3)
            r3 = 1000(0x3e8, float:1.401E-42)
            r1.computeCurrentVelocity(r3)
            float r3 = r22.getXVelocity()
            float r1 = r22.getYVelocity()
            float r5 = r0.mTouchDirectionX
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 == 0) goto L11e
            float[] r1 = r0.mAnchorDpDt
            r1 = r1[r4]
            float r3 = r3 / r1
            goto L124
        L11e:
            float[] r3 = r0.mAnchorDpDt
            r3 = r3[r10]
            float r3 = r1 / r3
        L124:
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r0.mMotionLayout
            r1.mLastVelocity = r3
            goto L12d
        L129:
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r0.mMotionLayout
            r1.mLastVelocity = r11
        L12d:
            float r1 = r21.getRawX()
            r0.mLastTouchX = r1
            float r1 = r21.getRawY()
            r0.mLastTouchY = r1
            goto L20b
        L13b:
            r0.mDragStarted = r4
            r2 = 1000(0x3e8, float:1.401E-42)
            r1.computeCurrentVelocity(r2)
            float r2 = r22.getXVelocity()
            float r1 = r22.getYVelocity()
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.mMotionLayout
            float r3 = r3.getProgress()
            int r13 = r0.mTouchAnchorId
            if (r13 == r7) goto L165
            androidx.constraintlayout.motion.widget.MotionLayout r12 = r0.mMotionLayout
            float r15 = r0.mTouchAnchorX
            float r5 = r0.mTouchAnchorY
            float[] r7 = r0.mAnchorDpDt
            r14 = r3
            r16 = r5
            r17 = r7
            r12.getAnchorDpDt(r13, r14, r15, r16, r17)
            goto L182
        L165:
            androidx.constraintlayout.motion.widget.MotionLayout r5 = r0.mMotionLayout
            int r5 = r5.getWidth()
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r0.mMotionLayout
            int r7 = r7.getHeight()
            int r5 = java.lang.Math.min(r5, r7)
            float r5 = (float) r5
            float[] r7 = r0.mAnchorDpDt
            float r8 = r0.mTouchDirectionY
            float r8 = r8 * r5
            r7[r10] = r8
            float r8 = r0.mTouchDirectionX
            float r5 = r5 * r8
            r7[r4] = r5
        L182:
            float r5 = r0.mTouchDirectionX
            float[] r7 = r0.mAnchorDpDt
            r4 = r7[r4]
            r7 = r7[r10]
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 == 0) goto L190
            float r2 = r2 / r4
            goto L192
        L190:
            float r2 = r1 / r7
        L192:
            boolean r1 = java.lang.Float.isNaN(r2)
            if (r1 != 0) goto L19e
            r1 = 1077936128(0x40400000, float:3.0)
            float r1 = r2 / r1
            float r1 = r1 + r3
            goto L19f
        L19e:
            r1 = r3
        L19f:
            int r4 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r4 == 0) goto L1ed
            int r4 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r4 == 0) goto L1ed
            int r4 = r0.mOnTouchUp
            r5 = 3
            if (r4 == r5) goto L1ed
            double r7 = (double) r1
            r12 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r1 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r1 >= 0) goto L1b5
            r1 = r11
            goto L1b6
        L1b5:
            r1 = r9
        L1b6:
            if (r4 != r6) goto L1c4
            float r1 = r3 + r2
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 >= 0) goto L1c3
            float r1 = java.lang.Math.abs(r2)
            r2 = r1
        L1c3:
            r1 = r9
        L1c4:
            int r4 = r0.mOnTouchUp
            r5 = 7
            if (r4 != r5) goto L1d6
            float r1 = r3 + r2
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 <= 0) goto L1d5
            float r1 = java.lang.Math.abs(r2)
            float r1 = -r1
            r2 = r1
        L1d5:
            r1 = r11
        L1d6:
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r0.mMotionLayout
            int r5 = r0.mOnTouchUp
            r4.touchAnimateTo(r5, r1, r2)
            int r1 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r1 >= 0) goto L1e5
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 > 0) goto L20b
        L1e5:
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r0.mMotionLayout
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r2 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r1.setState(r2)
            goto L20b
        L1ed:
            int r2 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r2 >= 0) goto L1f5
            int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r1 > 0) goto L20b
        L1f5:
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r0.mMotionLayout
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r2 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r1.setState(r2)
            goto L20b
        L1fd:
            float r1 = r21.getRawX()
            r0.mLastTouchX = r1
            float r1 = r21.getRawY()
            r0.mLastTouchY = r1
            r0.mDragStarted = r4
        L20b:
            return
    }

    void processTouchRotateEvent(android.view.MotionEvent r24, androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker r25, int r26, androidx.constraintlayout.motion.widget.MotionScene r27) {
            r23 = this;
            r0 = r23
            r1 = r25
            r2 = r24
            r1.addMovement(r2)
            int r3 = r24.getAction()
            r4 = 0
            if (r3 == 0) goto L332
            r5 = 1135869952(0x43b40000, float:360.0)
            r6 = -1
            r9 = 1073741824(0x40000000, float:2.0)
            r10 = 1
            if (r3 == r10) goto L1c1
            r11 = 2
            if (r3 == r11) goto L1d
            goto L340
        L1d:
            r24.getRawY()
            r24.getRawX()
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.mMotionLayout
            int r3 = r3.getWidth()
            float r3 = (float) r3
            float r3 = r3 / r9
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.mMotionLayout
            int r11 = r11.getHeight()
            float r11 = (float) r11
            float r11 = r11 / r9
            int r12 = r0.mRotationCenterId
            if (r12 == r6) goto L6c
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.mMotionLayout
            android.view.View r3 = r3.findViewById(r12)
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.mMotionLayout
            int[] r12 = r0.mTempLoc
            r11.getLocationOnScreen(r12)
            int[] r11 = r0.mTempLoc
            r11 = r11[r4]
            float r11 = (float) r11
            int r12 = r3.getLeft()
            int r13 = r3.getRight()
            int r12 = r12 + r13
            float r12 = (float) r12
            float r12 = r12 / r9
            float r11 = r11 + r12
            int[] r12 = r0.mTempLoc
            r12 = r12[r10]
            float r12 = (float) r12
            int r13 = r3.getTop()
            int r3 = r3.getBottom()
            int r13 = r13 + r3
            float r3 = (float) r13
            float r3 = r3 / r9
            float r3 = r3 + r12
            r22 = r11
            r11 = r3
            r3 = r22
            goto Lb3
        L6c:
            int r12 = r0.mTouchAnchorId
            if (r12 == r6) goto Lb3
            androidx.constraintlayout.motion.widget.MotionLayout r13 = r0.mMotionLayout
            androidx.constraintlayout.motion.widget.MotionController r12 = r13.getMotionController(r12)
            androidx.constraintlayout.motion.widget.MotionLayout r13 = r0.mMotionLayout
            int r12 = r12.getAnimateRelativeTo()
            android.view.View r12 = r13.findViewById(r12)
            if (r12 != 0) goto L8a
            java.lang.String r9 = "TouchResponse"
            java.lang.String r12 = "could not find view to animate to"
            android.util.Log.e(r9, r12)
            goto Lb3
        L8a:
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.mMotionLayout
            int[] r11 = r0.mTempLoc
            r3.getLocationOnScreen(r11)
            int[] r3 = r0.mTempLoc
            r3 = r3[r4]
            float r3 = (float) r3
            int r11 = r12.getLeft()
            int r13 = r12.getRight()
            int r11 = r11 + r13
            float r11 = (float) r11
            float r11 = r11 / r9
            float r3 = r3 + r11
            int[] r11 = r0.mTempLoc
            r11 = r11[r10]
            float r11 = (float) r11
            int r13 = r12.getTop()
            int r12 = r12.getBottom()
            int r13 = r13 + r12
            float r12 = (float) r13
            float r12 = r12 / r9
            float r11 = r11 + r12
        Lb3:
            float r9 = r24.getRawX()
            float r9 = r9 - r3
            float r12 = r24.getRawY()
            float r12 = r12 - r11
            float r13 = r24.getRawY()
            float r13 = r13 - r11
            double r13 = (double) r13
            float r15 = r24.getRawX()
            float r15 = r15 - r3
            r27 = r9
            double r8 = (double) r15
            double r8 = java.lang.Math.atan2(r13, r8)
            float r13 = r0.mLastTouchY
            float r13 = r13 - r11
            double r13 = (double) r13
            float r11 = r0.mLastTouchX
            float r11 = r11 - r3
            double r6 = (double) r11
            double r6 = java.lang.Math.atan2(r13, r6)
            double r6 = r8 - r6
            r13 = 4640537203540230144(0x4066800000000000, double:180.0)
            double r6 = r6 * r13
            r13 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r6 = r6 / r13
            float r6 = (float) r6
            r7 = 1134886912(0x43a50000, float:330.0)
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 <= 0) goto Lf2
            float r6 = r6 - r5
            goto Lf9
        Lf2:
            r7 = -1012596736(0xffffffffc3a50000, float:-330.0)
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 >= 0) goto Lf9
            float r6 = r6 + r5
        Lf9:
            float r7 = java.lang.Math.abs(r6)
            double r13 = (double) r7
            r16 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r7 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r7 > 0) goto L10b
            boolean r7 = r0.mDragStarted
            if (r7 == 0) goto L340
        L10b:
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r0.mMotionLayout
            float r7 = r7.getProgress()
            boolean r11 = r0.mDragStarted
            if (r11 != 0) goto L11c
            r0.mDragStarted = r10
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.mMotionLayout
            r11.setProgress(r7)
        L11c:
            int r11 = r0.mTouchAnchorId
            r3 = -1
            if (r11 == r3) goto L145
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.mMotionLayout
            float r5 = r0.mTouchAnchorX
            float r13 = r0.mTouchAnchorY
            float[] r14 = r0.mAnchorDpDt
            r16 = r3
            r17 = r11
            r18 = r7
            r19 = r5
            r20 = r13
            r21 = r14
            r16.getAnchorDpDt(r17, r18, r19, r20, r21)
            float[] r3 = r0.mAnchorDpDt
            r5 = r3[r10]
            double r13 = (double) r5
            double r13 = java.lang.Math.toDegrees(r13)
            float r5 = (float) r13
            r3[r10] = r5
            goto L149
        L145:
            float[] r3 = r0.mAnchorDpDt
            r3[r10] = r5
        L149:
            float r3 = r0.mDragScale
            float r6 = r6 * r3
            float[] r3 = r0.mAnchorDpDt
            r3 = r3[r10]
            float r6 = r6 / r3
            float r7 = r7 + r6
            r3 = 1065353216(0x3f800000, float:1.0)
            float r5 = java.lang.Math.min(r7, r3)
            r6 = 0
            float r5 = java.lang.Math.max(r5, r6)
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r0.mMotionLayout
            float r7 = r7.getProgress()
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 == 0) goto L1ae
            int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r6 == 0) goto L16f
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 != 0) goto L177
        L16f:
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.mMotionLayout
            if (r6 != 0) goto L174
            r4 = r10
        L174:
            r3.endTrigger(r4)
        L177:
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.mMotionLayout
            r3.setProgress(r5)
            r3 = 1000(0x3e8, float:1.401E-42)
            r1.computeCurrentVelocity(r3)
            float r3 = r25.getXVelocity()
            float r1 = r25.getYVelocity()
            double r4 = (double) r1
            double r6 = (double) r3
            double r10 = java.lang.Math.hypot(r4, r6)
            double r3 = java.lang.Math.atan2(r4, r6)
            double r3 = r3 - r8
            double r3 = java.lang.Math.sin(r3)
            double r10 = r10 * r3
            r9 = r27
            double r3 = (double) r9
            double r5 = (double) r12
            double r3 = java.lang.Math.hypot(r3, r5)
            double r10 = r10 / r3
            float r1 = (float) r10
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.mMotionLayout
            double r4 = (double) r1
            double r4 = java.lang.Math.toDegrees(r4)
            float r1 = (float) r4
            r3.mLastVelocity = r1
            goto L1b3
        L1ae:
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r0.mMotionLayout
            r3 = 0
            r1.mLastVelocity = r3
        L1b3:
            float r1 = r24.getRawX()
            r0.mLastTouchX = r1
            float r1 = r24.getRawY()
            r0.mLastTouchY = r1
            goto L340
        L1c1:
            r0.mDragStarted = r4
            r6 = 16
            r1.computeCurrentVelocity(r6)
            float r6 = r25.getXVelocity()
            float r1 = r25.getYVelocity()
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r0.mMotionLayout
            float r7 = r7.getProgress()
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r0.mMotionLayout
            int r8 = r8.getWidth()
            float r8 = (float) r8
            float r8 = r8 / r9
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.mMotionLayout
            int r11 = r11.getHeight()
            float r11 = (float) r11
            float r11 = r11 / r9
            int r12 = r0.mRotationCenterId
            r3 = -1
            if (r12 == r3) goto L21c
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r0.mMotionLayout
            android.view.View r8 = r8.findViewById(r12)
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.mMotionLayout
            int[] r12 = r0.mTempLoc
            r11.getLocationOnScreen(r12)
            int[] r11 = r0.mTempLoc
            r4 = r11[r4]
            float r4 = (float) r4
            int r11 = r8.getLeft()
            int r12 = r8.getRight()
            int r11 = r11 + r12
            float r11 = (float) r11
            float r11 = r11 / r9
            float r4 = r4 + r11
            int[] r11 = r0.mTempLoc
            r11 = r11[r10]
            float r11 = (float) r11
            int r12 = r8.getTop()
            int r8 = r8.getBottom()
        L216:
            int r12 = r12 + r8
            float r8 = (float) r12
            float r8 = r8 / r9
            float r11 = r11 + r8
            r8 = r4
            goto L257
        L21c:
            int r12 = r0.mTouchAnchorId
            r3 = -1
            if (r12 == r3) goto L257
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r0.mMotionLayout
            androidx.constraintlayout.motion.widget.MotionController r8 = r8.getMotionController(r12)
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.mMotionLayout
            int r8 = r8.getAnimateRelativeTo()
            android.view.View r8 = r11.findViewById(r8)
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.mMotionLayout
            int[] r12 = r0.mTempLoc
            r11.getLocationOnScreen(r12)
            int[] r11 = r0.mTempLoc
            r4 = r11[r4]
            float r4 = (float) r4
            int r11 = r8.getLeft()
            int r12 = r8.getRight()
            int r11 = r11 + r12
            float r11 = (float) r11
            float r11 = r11 / r9
            float r4 = r4 + r11
            int[] r11 = r0.mTempLoc
            r11 = r11[r10]
            float r11 = (float) r11
            int r12 = r8.getTop()
            int r8 = r8.getBottom()
            goto L216
        L257:
            float r4 = r24.getRawX()
            float r4 = r4 - r8
            float r2 = r24.getRawY()
            float r2 = r2 - r11
            double r8 = (double) r2
            double r11 = (double) r4
            double r8 = java.lang.Math.atan2(r8, r11)
            double r8 = java.lang.Math.toDegrees(r8)
            int r11 = r0.mTouchAnchorId
            r3 = -1
            if (r11 == r3) goto L294
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.mMotionLayout
            float r5 = r0.mTouchAnchorX
            float r12 = r0.mTouchAnchorY
            float[] r13 = r0.mAnchorDpDt
            r16 = r3
            r17 = r11
            r18 = r7
            r19 = r5
            r20 = r12
            r21 = r13
            r16.getAnchorDpDt(r17, r18, r19, r20, r21)
            float[] r3 = r0.mAnchorDpDt
            r5 = r3[r10]
            double r11 = (double) r5
            double r11 = java.lang.Math.toDegrees(r11)
            float r5 = (float) r11
            r3[r10] = r5
            goto L298
        L294:
            float[] r3 = r0.mAnchorDpDt
            r3[r10] = r5
        L298:
            float r1 = r1 + r2
            double r1 = (double) r1
            float r6 = r6 + r4
            double r3 = (double) r6
            double r1 = java.lang.Math.atan2(r1, r3)
            double r1 = java.lang.Math.toDegrees(r1)
            double r1 = r1 - r8
            float r1 = (float) r1
            r2 = 1115291648(0x427a0000, float:62.5)
            float r1 = r1 * r2
            boolean r2 = java.lang.Float.isNaN(r1)
            r3 = 1077936128(0x40400000, float:3.0)
            if (r2 != 0) goto L2bd
            float r2 = r1 * r3
            float r4 = r0.mDragScale
            float r2 = r2 * r4
            float[] r4 = r0.mAnchorDpDt
            r4 = r4[r10]
            float r2 = r2 / r4
            float r2 = r2 + r7
            goto L2be
        L2bd:
            r2 = r7
        L2be:
            r4 = 0
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 == 0) goto L31f
            r4 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 == 0) goto L31f
            int r4 = r0.mOnTouchUp
            r5 = 3
            if (r4 == r5) goto L31f
            float r5 = r0.mDragScale
            float r1 = r1 * r5
            float[] r5 = r0.mAnchorDpDt
            r5 = r5[r10]
            float r1 = r1 / r5
            double r5 = (double) r2
            r8 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r2 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r2 >= 0) goto L2df
            r2 = 0
            goto L2e1
        L2df:
            r2 = 1065353216(0x3f800000, float:1.0)
        L2e1:
            r5 = 6
            if (r4 != r5) goto L2f1
            float r2 = r7 + r1
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L2ef
            float r1 = java.lang.Math.abs(r1)
        L2ef:
            r2 = 1065353216(0x3f800000, float:1.0)
        L2f1:
            int r4 = r0.mOnTouchUp
            r5 = 7
            if (r4 != r5) goto L304
            float r2 = r7 + r1
            r4 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L303
            float r1 = java.lang.Math.abs(r1)
            float r1 = -r1
        L303:
            r2 = 0
        L304:
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r0.mMotionLayout
            int r5 = r0.mOnTouchUp
            float r1 = r1 * r3
            r4.touchAnimateTo(r5, r2, r1)
            r1 = 0
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 >= 0) goto L317
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 > 0) goto L340
        L317:
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r0.mMotionLayout
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r2 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r1.setState(r2)
            goto L340
        L31f:
            r1 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L32a
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L340
        L32a:
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r0.mMotionLayout
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r2 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r1.setState(r2)
            goto L340
        L332:
            float r1 = r24.getRawX()
            r0.mLastTouchX = r1
            float r1 = r24.getRawY()
            r0.mLastTouchY = r1
            r0.mDragStarted = r4
        L340:
            return
    }

    void scrollMove(float r9, float r10) {
            r8 = this;
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r8.mMotionLayout
            float r0 = r0.getProgress()
            boolean r1 = r8.mDragStarted
            r7 = 1
            if (r1 != 0) goto L12
            r8.mDragStarted = r7
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r8.mMotionLayout
            r1.setProgress(r0)
        L12:
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r8.mMotionLayout
            int r2 = r8.mTouchAnchorId
            float r4 = r8.mTouchAnchorX
            float r5 = r8.mTouchAnchorY
            float[] r6 = r8.mAnchorDpDt
            r3 = r0
            r1.getAnchorDpDt(r2, r3, r4, r5, r6)
            float r1 = r8.mTouchDirectionX
            float[] r2 = r8.mAnchorDpDt
            r3 = 0
            r4 = r2[r3]
            float r1 = r1 * r4
            float r4 = r8.mTouchDirectionY
            r2 = r2[r7]
            float r4 = r4 * r2
            float r1 = r1 + r4
            float r1 = java.lang.Math.abs(r1)
            double r1 = (double) r1
            r4 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 >= 0) goto L45
            float[] r1 = r8.mAnchorDpDt
            r2 = 1008981770(0x3c23d70a, float:0.01)
            r1[r3] = r2
            r1[r7] = r2
        L45:
            float r1 = r8.mTouchDirectionX
            r2 = 0
            int r4 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r4 == 0) goto L53
            float r9 = r9 * r1
            float[] r10 = r8.mAnchorDpDt
            r10 = r10[r3]
            float r9 = r9 / r10
            goto L5c
        L53:
            float r9 = r8.mTouchDirectionY
            float r10 = r10 * r9
            float[] r9 = r8.mAnchorDpDt
            r9 = r9[r7]
            float r9 = r10 / r9
        L5c:
            float r0 = r0 + r9
            r9 = 1065353216(0x3f800000, float:1.0)
            float r9 = java.lang.Math.min(r0, r9)
            float r9 = java.lang.Math.max(r9, r2)
            androidx.constraintlayout.motion.widget.MotionLayout r10 = r8.mMotionLayout
            float r10 = r10.getProgress()
            int r10 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r10 == 0) goto L76
            androidx.constraintlayout.motion.widget.MotionLayout r10 = r8.mMotionLayout
            r10.setProgress(r9)
        L76:
            return
    }

    void scrollUp(float r10, float r11) {
            r9 = this;
            r0 = 0
            r9.mDragStarted = r0
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r9.mMotionLayout
            float r1 = r1.getProgress()
            androidx.constraintlayout.motion.widget.MotionLayout r2 = r9.mMotionLayout
            int r3 = r9.mTouchAnchorId
            float r5 = r9.mTouchAnchorX
            float r6 = r9.mTouchAnchorY
            float[] r7 = r9.mAnchorDpDt
            r4 = r1
            r2.getAnchorDpDt(r3, r4, r5, r6, r7)
            float r2 = r9.mTouchDirectionX
            float[] r3 = r9.mAnchorDpDt
            r4 = r3[r0]
            float r5 = r9.mTouchDirectionY
            r6 = 1
            r3 = r3[r6]
            r7 = 0
            int r8 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r8 == 0) goto L2a
            float r10 = r10 * r2
            float r10 = r10 / r4
            goto L2d
        L2a:
            float r11 = r11 * r5
            float r10 = r11 / r3
        L2d:
            boolean r11 = java.lang.Float.isNaN(r10)
            if (r11 != 0) goto L38
            r11 = 1077936128(0x40400000, float:3.0)
            float r11 = r10 / r11
            float r1 = r1 + r11
        L38:
            int r11 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r11 == 0) goto L5c
            r11 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r2 == 0) goto L44
            r2 = r6
            goto L45
        L44:
            r2 = r0
        L45:
            int r3 = r9.mOnTouchUp
            r4 = 3
            if (r3 == r4) goto L4b
            r0 = r6
        L4b:
            r0 = r0 & r2
            if (r0 == 0) goto L5c
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r9.mMotionLayout
            double r1 = (double) r1
            r4 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 >= 0) goto L58
            goto L59
        L58:
            r7 = r11
        L59:
            r0.touchAnimateTo(r3, r7, r10)
        L5c:
            return
    }

    public void setAnchorId(int r1) {
            r0 = this;
            r0.mTouchAnchorId = r1
            return
    }

    void setAutoCompleteMode(int r1) {
            r0 = this;
            r0.mAutoCompleteMode = r1
            return
    }

    void setDown(float r1, float r2) {
            r0 = this;
            r0.mLastTouchX = r1
            r0.mLastTouchY = r2
            return
    }

    public void setMaxAcceleration(float r1) {
            r0 = this;
            r0.mMaxAcceleration = r1
            return
    }

    public void setMaxVelocity(float r1) {
            r0 = this;
            r0.mMaxVelocity = r1
            return
    }

    public void setRTL(boolean r8) {
            r7 = this;
            r0 = 6
            r1 = 3
            r2 = 4
            r3 = 1
            r4 = 5
            r5 = 2
            if (r8 == 0) goto L1d
            float[][] r8 = androidx.constraintlayout.motion.widget.TouchResponse.TOUCH_DIRECTION
            r1 = r8[r1]
            r8[r2] = r1
            r1 = r8[r5]
            r8[r4] = r1
            float[][] r8 = androidx.constraintlayout.motion.widget.TouchResponse.TOUCH_SIDES
            r1 = r8[r5]
            r8[r4] = r1
            r1 = r8[r3]
            r8[r0] = r1
            goto L31
        L1d:
            float[][] r8 = androidx.constraintlayout.motion.widget.TouchResponse.TOUCH_DIRECTION
            r6 = r8[r5]
            r8[r2] = r6
            r1 = r8[r1]
            r8[r4] = r1
            float[][] r8 = androidx.constraintlayout.motion.widget.TouchResponse.TOUCH_SIDES
            r1 = r8[r3]
            r8[r4] = r1
            r1 = r8[r5]
            r8[r0] = r1
        L31:
            float[][] r8 = androidx.constraintlayout.motion.widget.TouchResponse.TOUCH_SIDES
            int r0 = r7.mTouchAnchorSide
            r8 = r8[r0]
            r0 = 0
            r1 = r8[r0]
            r7.mTouchAnchorX = r1
            r8 = r8[r3]
            r7.mTouchAnchorY = r8
            int r8 = r7.mTouchSide
            float[][] r1 = androidx.constraintlayout.motion.widget.TouchResponse.TOUCH_DIRECTION
            int r2 = r1.length
            if (r8 < r2) goto L48
            return
        L48:
            r8 = r1[r8]
            r0 = r8[r0]
            r7.mTouchDirectionX = r0
            r8 = r8[r3]
            r7.mTouchDirectionY = r8
            return
    }

    public void setTouchAnchorLocation(float r1, float r2) {
            r0 = this;
            r0.mTouchAnchorX = r1
            r0.mTouchAnchorY = r2
            return
    }

    public void setTouchUpMode(int r1) {
            r0 = this;
            r0.mOnTouchUp = r1
            return
    }

    void setUpTouchEvent(float r1, float r2) {
            r0 = this;
            r0.mLastTouchX = r1
            r0.mLastTouchY = r2
            r1 = 0
            r0.mDragStarted = r1
            return
    }

    void setupTouch() {
            r4 = this;
            int r0 = r4.mTouchAnchorId
            r1 = -1
            if (r0 == r1) goto L2e
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r4.mMotionLayout
            android.view.View r0 = r1.findViewById(r0)
            if (r0 != 0) goto L2f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "cannot find TouchAnchorId @id/"
            r1.<init>(r2)
            androidx.constraintlayout.motion.widget.MotionLayout r2 = r4.mMotionLayout
            android.content.Context r2 = r2.getContext()
            int r3 = r4.mTouchAnchorId
            java.lang.String r2 = androidx.constraintlayout.motion.widget.Debug.getName(r2, r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "TouchResponse"
            android.util.Log.e(r2, r1)
            goto L2f
        L2e:
            r0 = 0
        L2f:
            boolean r1 = r0 instanceof androidx.core.widget.NestedScrollView
            if (r1 == 0) goto L45
            androidx.core.widget.NestedScrollView r0 = (androidx.core.widget.NestedScrollView) r0
            androidx.constraintlayout.motion.widget.TouchResponse$1 r1 = new androidx.constraintlayout.motion.widget.TouchResponse$1
            r1.<init>(r4)
            r0.setOnTouchListener(r1)
            androidx.constraintlayout.motion.widget.TouchResponse$2 r1 = new androidx.constraintlayout.motion.widget.TouchResponse$2
            r1.<init>(r4)
            r0.setOnScrollChangeListener(r1)
        L45:
            return
    }

    public java.lang.String toString() {
            r2 = this;
            float r0 = r2.mTouchDirectionX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto Lb
            java.lang.String r0 = "rotation"
            goto L26
        Lb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            float r1 = r2.mTouchDirectionX
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " , "
            java.lang.StringBuilder r0 = r0.append(r1)
            float r1 = r2.mTouchDirectionY
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
        L26:
            return r0
    }
}
