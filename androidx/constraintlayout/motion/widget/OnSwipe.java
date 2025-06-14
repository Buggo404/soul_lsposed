package androidx.constraintlayout.motion.widget;

/* loaded from: classes.dex */
public class OnSwipe {
    public static final int COMPLETE_MODE_CONTINUOUS_VELOCITY = 0;
    public static final int COMPLETE_MODE_SPRING = 1;
    public static final int DRAG_ANTICLOCKWISE = 7;
    public static final int DRAG_CLOCKWISE = 6;
    public static final int DRAG_DOWN = 1;
    public static final int DRAG_END = 5;
    public static final int DRAG_LEFT = 2;
    public static final int DRAG_RIGHT = 3;
    public static final int DRAG_START = 4;
    public static final int DRAG_UP = 0;
    public static final int FLAG_DISABLE_POST_SCROLL = 1;
    public static final int FLAG_DISABLE_SCROLL = 2;
    public static final int ON_UP_AUTOCOMPLETE = 0;
    public static final int ON_UP_AUTOCOMPLETE_TO_END = 2;
    public static final int ON_UP_AUTOCOMPLETE_TO_START = 1;
    public static final int ON_UP_DECELERATE = 4;
    public static final int ON_UP_DECELERATE_AND_COMPLETE = 5;
    public static final int ON_UP_NEVER_TO_END = 7;
    public static final int ON_UP_NEVER_TO_START = 6;
    public static final int ON_UP_STOP = 3;
    public static final int SIDE_BOTTOM = 3;
    public static final int SIDE_END = 6;
    public static final int SIDE_LEFT = 1;
    public static final int SIDE_MIDDLE = 4;
    public static final int SIDE_RIGHT = 2;
    public static final int SIDE_START = 5;
    public static final int SIDE_TOP = 0;
    public static final int SPRING_BOUNDARY_BOUNCEBOTH = 3;
    public static final int SPRING_BOUNDARY_BOUNCEEND = 2;
    public static final int SPRING_BOUNDARY_BOUNCESTART = 1;
    public static final int SPRING_BOUNDARY_OVERSHOOT = 0;
    private int mAutoCompleteMode;
    private int mDragDirection;
    private float mDragScale;
    private float mDragThreshold;
    private int mFlags;
    private int mLimitBoundsTo;
    private float mMaxAcceleration;
    private float mMaxVelocity;
    private boolean mMoveWhenScrollAtTop;
    private int mOnTouchUp;
    private int mRotationCenterId;
    private int mSpringBoundary;
    private float mSpringDamping;
    private float mSpringMass;
    private float mSpringStiffness;
    private float mSpringStopThreshold;
    private int mTouchAnchorId;
    private int mTouchAnchorSide;
    private int mTouchRegionId;

    public OnSwipe() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.mDragDirection = r0
            r3.mTouchAnchorSide = r0
            r1 = -1
            r3.mTouchAnchorId = r1
            r3.mTouchRegionId = r1
            r3.mLimitBoundsTo = r1
            r3.mOnTouchUp = r0
            r3.mRotationCenterId = r1
            r1 = 1082130432(0x40800000, float:4.0)
            r3.mMaxVelocity = r1
            r1 = 1067030938(0x3f99999a, float:1.2)
            r3.mMaxAcceleration = r1
            r1 = 1
            r3.mMoveWhenScrollAtTop = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r3.mDragScale = r1
            r3.mFlags = r0
            r2 = 1092616192(0x41200000, float:10.0)
            r3.mDragThreshold = r2
            r2 = 2143289344(0x7fc00000, float:NaN)
            r3.mSpringDamping = r2
            r3.mSpringMass = r1
            r3.mSpringStiffness = r2
            r3.mSpringStopThreshold = r2
            r3.mSpringBoundary = r0
            r3.mAutoCompleteMode = r0
            return
    }

    public int getAutoCompleteMode() {
            r1 = this;
            int r0 = r1.mAutoCompleteMode
            return r0
    }

    public int getDragDirection() {
            r1 = this;
            int r0 = r1.mDragDirection
            return r0
    }

    public float getDragScale() {
            r1 = this;
            float r0 = r1.mDragScale
            return r0
    }

    public float getDragThreshold() {
            r1 = this;
            float r0 = r1.mDragThreshold
            return r0
    }

    public int getLimitBoundsTo() {
            r1 = this;
            int r0 = r1.mLimitBoundsTo
            return r0
    }

    public float getMaxAcceleration() {
            r1 = this;
            float r0 = r1.mMaxAcceleration
            return r0
    }

    public float getMaxVelocity() {
            r1 = this;
            float r0 = r1.mMaxVelocity
            return r0
    }

    public boolean getMoveWhenScrollAtTop() {
            r1 = this;
            boolean r0 = r1.mMoveWhenScrollAtTop
            return r0
    }

    public int getNestedScrollFlags() {
            r1 = this;
            int r0 = r1.mFlags
            return r0
    }

    public int getOnTouchUp() {
            r1 = this;
            int r0 = r1.mOnTouchUp
            return r0
    }

    public int getRotationCenterId() {
            r1 = this;
            int r0 = r1.mRotationCenterId
            return r0
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

    public int getTouchAnchorId() {
            r1 = this;
            int r0 = r1.mTouchAnchorId
            return r0
    }

    public int getTouchAnchorSide() {
            r1 = this;
            int r0 = r1.mTouchAnchorSide
            return r0
    }

    public int getTouchRegionId() {
            r1 = this;
            int r0 = r1.mTouchRegionId
            return r0
    }

    public void setAutoCompleteMode(int r1) {
            r0 = this;
            r0.mAutoCompleteMode = r1
            return
    }

    public androidx.constraintlayout.motion.widget.OnSwipe setDragDirection(int r1) {
            r0 = this;
            r0.mDragDirection = r1
            return r0
    }

    public androidx.constraintlayout.motion.widget.OnSwipe setDragScale(int r1) {
            r0 = this;
            float r1 = (float) r1
            r0.mDragScale = r1
            return r0
    }

    public androidx.constraintlayout.motion.widget.OnSwipe setDragThreshold(int r1) {
            r0 = this;
            float r1 = (float) r1
            r0.mDragThreshold = r1
            return r0
    }

    public androidx.constraintlayout.motion.widget.OnSwipe setLimitBoundsTo(int r1) {
            r0 = this;
            r0.mLimitBoundsTo = r1
            return r0
    }

    public androidx.constraintlayout.motion.widget.OnSwipe setMaxAcceleration(int r1) {
            r0 = this;
            float r1 = (float) r1
            r0.mMaxAcceleration = r1
            return r0
    }

    public androidx.constraintlayout.motion.widget.OnSwipe setMaxVelocity(int r1) {
            r0 = this;
            float r1 = (float) r1
            r0.mMaxVelocity = r1
            return r0
    }

    public androidx.constraintlayout.motion.widget.OnSwipe setMoveWhenScrollAtTop(boolean r1) {
            r0 = this;
            r0.mMoveWhenScrollAtTop = r1
            return r0
    }

    public androidx.constraintlayout.motion.widget.OnSwipe setNestedScrollFlags(int r1) {
            r0 = this;
            r0.mFlags = r1
            return r0
    }

    public androidx.constraintlayout.motion.widget.OnSwipe setOnTouchUp(int r1) {
            r0 = this;
            r0.mOnTouchUp = r1
            return r0
    }

    public androidx.constraintlayout.motion.widget.OnSwipe setRotateCenter(int r1) {
            r0 = this;
            r0.mRotationCenterId = r1
            return r0
    }

    public androidx.constraintlayout.motion.widget.OnSwipe setSpringBoundary(int r1) {
            r0 = this;
            r0.mSpringBoundary = r1
            return r0
    }

    public androidx.constraintlayout.motion.widget.OnSwipe setSpringDamping(float r1) {
            r0 = this;
            r0.mSpringDamping = r1
            return r0
    }

    public androidx.constraintlayout.motion.widget.OnSwipe setSpringMass(float r1) {
            r0 = this;
            r0.mSpringMass = r1
            return r0
    }

    public androidx.constraintlayout.motion.widget.OnSwipe setSpringStiffness(float r1) {
            r0 = this;
            r0.mSpringStiffness = r1
            return r0
    }

    public androidx.constraintlayout.motion.widget.OnSwipe setSpringStopThreshold(float r1) {
            r0 = this;
            r0.mSpringStopThreshold = r1
            return r0
    }

    public androidx.constraintlayout.motion.widget.OnSwipe setTouchAnchorId(int r1) {
            r0 = this;
            r0.mTouchAnchorId = r1
            return r0
    }

    public androidx.constraintlayout.motion.widget.OnSwipe setTouchAnchorSide(int r1) {
            r0 = this;
            r0.mTouchAnchorSide = r1
            return r0
    }

    public androidx.constraintlayout.motion.widget.OnSwipe setTouchRegionId(int r1) {
            r0 = this;
            r0.mTouchRegionId = r1
            return r0
    }
}
